package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFf1rSDK extends AFf1tSDK {
    public AFf1rSDK(@NonNull Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.ARS_VALIDATE, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, map, purchaseValidationCallback);
        this.getCurrencyIso4217Code.add(AFf1zSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1vSDK
    public final AFe1tSDK<String> AFAdRevenueData(@NonNull Map<String, Object> map, @NonNull String str, String str2) {
        return ((AFf1oSDK) this).component2.getRevenue(map, str, str2);
    }

    @Override // com.appsflyer.internal.AFf1tSDK, com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        ResponseNetwork responseNetwork = ((AFf1oSDK) this).component4;
        if (responseNetwork == null || responseNetwork.getStatusCode() != 424) {
            return super.getMediationNetwork();
        }
        return true;
    }
}
