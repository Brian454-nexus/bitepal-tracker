package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AFa1oSDK {
    public String AFAdRevenueData;
    public String areAllFieldsValid;
    public int component1;
    public String component2;
    public String component3;
    public String component4;
    private byte[] copydefault;
    public Map<String, Object> getCurrencyIso4217Code;
    public AppsFlyerRequestListener getMediationNetwork;
    public String getMonetizationNetwork;
    protected final Map<String, Object> getRevenue;
    private final boolean hashCode;

    public AFa1oSDK() {
        this(null, null, null);
    }

    public final AFa1oSDK AFAdRevenueData(byte[] bArr) {
        this.copydefault = bArr;
        return this;
    }

    public boolean areAllFieldsValid() {
        return true;
    }

    public boolean component1() {
        return true;
    }

    public boolean component2() {
        return true;
    }

    public boolean component3() {
        return false;
    }

    public final AFa1oSDK getCurrencyIso4217Code(String str, Object obj) {
        synchronized (this.getRevenue) {
            this.getRevenue.put(str, obj);
        }
        return this;
    }

    public abstract AFf1zSDK getCurrencyIso4217Code();

    public final AFa1oSDK getMediationNetwork(int i6) {
        this.component1 = i6;
        synchronized (this.getRevenue) {
            try {
                if (this.getRevenue.containsKey("counter")) {
                    this.getRevenue.put("counter", Integer.toString(i6));
                }
                if (this.getRevenue.containsKey("launch_counter")) {
                    this.getRevenue.put("launch_counter", Integer.toString(i6));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public final Map<String, Object> getMonetizationNetwork() {
        return this.getRevenue;
    }

    public AFa1oSDK getRevenue(String str) {
        this.component4 = str;
        return this;
    }

    public AFa1oSDK(String str, String str2, Boolean bool) {
        this.getRevenue = new HashMap();
        this.areAllFieldsValid = str;
        this.component4 = str2;
        this.hashCode = bool != null ? bool.booleanValue() : true;
    }

    public final boolean AFAdRevenueData() {
        return this.hashCode;
    }

    public final boolean getRevenue() {
        return this.areAllFieldsValid == null && this.getMonetizationNetwork == null;
    }

    @NonNull
    public static String AFAdRevenueData(String str) {
        String component4 = AFb1rSDK.getRevenue().getMonetizationNetwork().getMediationNetwork().component4();
        return component4 != null ? Uri.parse(str).buildUpon().appendQueryParameter(AppsFlyerProperties.CHANNEL, component4).build().toString() : str;
    }

    public final AFa1oSDK getRevenue(Map<String, ?> map) {
        synchronized (map) {
            this.getRevenue.putAll(map);
        }
        return this;
    }

    public static boolean getRevenue(double d6) {
        if (d6 < 0.0d || d6 >= 1.0d) {
            return false;
        }
        if (d6 == 0.0d) {
            return true;
        }
        int i6 = (int) (1.0d / d6);
        if (i6 + 1 > 0) {
            return ((int) ((Math.random() * ((double) i6)) + 1.0d)) != i6;
        }
        throw new IllegalArgumentException("Unsupported max value");
    }

    public final byte[] getMediationNetwork() {
        return this.copydefault;
    }
}
