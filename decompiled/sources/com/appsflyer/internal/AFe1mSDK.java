package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class AFe1mSDK {
    public boolean AFAdRevenueData;
    private final boolean areAllFieldsValid;
    private final byte[] component1;
    private final boolean component2;
    public int component3;
    private boolean component4;

    @NonNull
    final String getCurrencyIso4217Code;

    @NonNull
    public final String getMediationNetwork;
    public boolean getMonetizationNetwork;

    @NonNull
    final Map<String, String> getRevenue;

    public AFe1mSDK(@NonNull String str, byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z6) {
        this(str, bArr, str2, map, z6, (byte) 0);
    }

    public final boolean AFAdRevenueData() {
        return this.areAllFieldsValid;
    }

    public final boolean component3() {
        return this.AFAdRevenueData;
    }

    public final byte[] getCurrencyIso4217Code() {
        return this.component1;
    }

    public final boolean getMediationNetwork() {
        return this.component4;
    }

    public final boolean getMonetizationNetwork() {
        return this.getMonetizationNetwork;
    }

    public final boolean getRevenue() {
        return this.component2;
    }

    private AFe1mSDK(@NonNull String str, byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z6, byte b6) {
        this.component4 = true;
        this.getMonetizationNetwork = false;
        this.AFAdRevenueData = true;
        this.component3 = -1;
        this.getMediationNetwork = str;
        this.component1 = bArr;
        this.getCurrencyIso4217Code = str2;
        this.getRevenue = map;
        this.areAllFieldsValid = z6;
        this.component2 = true;
    }

    public AFe1mSDK(@NonNull String str, @NonNull String str2) {
        this(str, null, str2, new HashMap(), false);
    }
}
