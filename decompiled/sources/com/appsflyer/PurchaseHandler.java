package com.appsflyer;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFb1jSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class PurchaseHandler {

    @NonNull
    private final AFd1qSDK AFAdRevenueData;

    @NonNull
    public final AFe1aSDK getMediationNetwork;

    @NonNull
    public final AFd1kSDK getRevenue;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface PurchaseValidationCallback {
        void onFailure(@NonNull Throwable th);

        void onResponse(@NonNull ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(@NonNull AFd1kSDK aFd1kSDK) {
        this.getRevenue = aFd1kSDK;
        this.AFAdRevenueData = aFd1kSDK.getMediationNetwork();
        this.getMediationNetwork = aFd1kSDK.copy();
    }

    public final boolean getCurrencyIso4217Code(Map<String, Object> map, PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean mediationNetwork = AFb1jSDK.getMediationNetwork(map, strArr, this.AFAdRevenueData);
        if (!mediationNetwork && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return mediationNetwork;
    }
}
