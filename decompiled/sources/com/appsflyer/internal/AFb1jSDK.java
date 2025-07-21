package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFb1jSDK {
    private static String AFAdRevenueData(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b6 : bArr) {
            sb.append(Integer.toString((b6 & 255) + 256, 16).substring(1));
        }
        return sb.toString();
    }

    private static byte[] getMediationNetwork(@NonNull String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return messageDigest.digest();
        } catch (Exception e6) {
            AFLogger.afErrorLog("Error turning string to SHA-256 byte array", e6);
            return null;
        }
    }

    public static String getMonetizationNetwork(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return AFAdRevenueData(messageDigest.digest());
        } catch (Exception e6) {
            AFLogger.afErrorLog("Error turning data to SHA-256 string", e6);
            return null;
        }
    }

    public static long getRevenue(@NonNull String str) {
        byte[] mediationNetwork = getMediationNetwork(str);
        if (mediationNetwork == null || mediationNetwork.length <= 0) {
            return -1L;
        }
        if (mediationNetwork.length > 8) {
            mediationNetwork = Arrays.copyOfRange(mediationNetwork, 0, 8);
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.put(mediationNetwork);
        allocate.flip();
        return allocate.getLong();
    }

    public static boolean getMediationNetwork(Map<String, Object> map, String[] strArr, AFd1qSDK aFd1qSDK) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (!map.containsKey(str)) {
                return false;
            }
        }
        String str2 = (String) map.remove("sig");
        if (str2 == null) {
            return false;
        }
        String areAllFieldsValid = AFd1qSDK.areAllFieldsValid();
        StringBuilder sb = new StringBuilder();
        sb.append(new JSONObject(map));
        sb.append(areAllFieldsValid);
        return getMonetizationNetwork(sb.toString(), AFb1iSDK.getCurrencyIso4217Code(aFd1qSDK.getMonetizationNetwork, aFd1qSDK.getRevenue)).equals(str2);
    }

    public static String getMonetizationNetwork(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(Charset.defaultCharset()), "HmacSHA256"));
            return AFAdRevenueData(mac.doFinal(str.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
        } catch (InvalidKeyException | NoSuchAlgorithmException e6) {
            AFLogger.afErrorLog(e6.getMessage(), e6, true);
            return e6.getMessage();
        }
    }
}
