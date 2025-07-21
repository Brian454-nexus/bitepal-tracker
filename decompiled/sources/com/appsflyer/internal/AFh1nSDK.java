package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFAdRevenueData;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFh1nSDK extends AFa1oSDK {
    public final Map<String, Object> copy;

    @NonNull
    public final AFAdRevenueData toString;

    public AFh1nSDK(@NonNull AFAdRevenueData aFAdRevenueData, Map<String, Object> map) {
        super("adrevenue_generic", null, Boolean.TRUE);
        this.toString = aFAdRevenueData;
        this.copy = map;
    }

    @Override // com.appsflyer.internal.AFa1oSDK
    public final AFf1zSDK getCurrencyIso4217Code() {
        return AFf1zSDK.ADREVENUE;
    }
}
