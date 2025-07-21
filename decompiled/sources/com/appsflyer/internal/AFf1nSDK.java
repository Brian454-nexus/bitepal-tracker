package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFf1nSDK extends AFf1tSDK {
    public AFf1nSDK(@NonNull Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.PURCHASE_VALIDATE, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, map, purchaseValidationCallback);
        this.getCurrencyIso4217Code.add(AFf1zSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1vSDK
    public final AFe1tSDK<String> AFAdRevenueData(@NonNull Map<String, Object> map, @NonNull String str, String str2) {
        return ((AFf1oSDK) this).component2.getMediationNetwork(map, str, str2);
    }
}
