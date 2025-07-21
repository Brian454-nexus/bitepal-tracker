package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFb1kSDK {
    public String AFAdRevenueData;
    public AFf1zSDK getCurrencyIso4217Code;
    private byte[] getMediationNetwork;
    String getMonetizationNetwork;
    public String getRevenue;

    public AFb1kSDK(String str, byte[] bArr, String str2, AFf1zSDK aFf1zSDK) {
        this.AFAdRevenueData = str;
        this.getMediationNetwork = bArr;
        this.getMonetizationNetwork = str2;
        this.getCurrencyIso4217Code = aFf1zSDK;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFb1kSDK.class == obj.getClass()) {
            AFb1kSDK aFb1kSDK = (AFb1kSDK) obj;
            String str = this.getMonetizationNetwork;
            if (str == null ? aFb1kSDK.getMonetizationNetwork != null : !str.equals(aFb1kSDK.getMonetizationNetwork)) {
                return false;
            }
            if (!Arrays.equals(this.getMediationNetwork, aFb1kSDK.getMediationNetwork)) {
                return false;
            }
            String str2 = this.AFAdRevenueData;
            if (str2 == null ? aFb1kSDK.AFAdRevenueData != null : !str2.equals(aFb1kSDK.AFAdRevenueData)) {
                return false;
            }
            String str3 = this.getRevenue;
            if (str3 == null ? aFb1kSDK.getRevenue != null : !str3.equals(aFb1kSDK.getRevenue)) {
                return false;
            }
            if (this.getCurrencyIso4217Code == aFb1kSDK.getCurrencyIso4217Code) {
                return true;
            }
        }
        return false;
    }

    public final byte[] getMonetizationNetwork() {
        return this.getMediationNetwork;
    }

    public final int hashCode() {
        String str = this.getMonetizationNetwork;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Arrays.hashCode(this.getMediationNetwork)) * 31;
        String str2 = this.AFAdRevenueData;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.getRevenue;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFf1zSDK aFf1zSDK = this.getCurrencyIso4217Code;
        return hashCode3 + (aFf1zSDK != null ? aFf1zSDK.hashCode() : 0);
    }

    public AFb1kSDK(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i6 = 0;
        int i7 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.AFAdRevenueData = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.getMonetizationNetwork = nextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.getMonetizationNetwork);
                if (matcher.matches()) {
                    i6 = Integer.parseInt(matcher.group(1));
                    i7 = Integer.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith("data=")) {
                String trim = nextLine.substring(5).trim();
                this.getMediationNetwork = (i6 > 4 || i7 >= 11) ? Base64.decode(trim, 2) : trim.getBytes(Charset.defaultCharset());
            } else if (nextLine.startsWith("type=")) {
                String trim2 = nextLine.substring(5).trim();
                try {
                    this.getCurrencyIso4217Code = AFf1zSDK.valueOf(trim2);
                } catch (Exception e6) {
                    AFLogger.afErrorLog("CACHE: Unknown task type: ".concat(String.valueOf(trim2)), e6);
                }
            }
        }
        scanner.close();
    }
}
