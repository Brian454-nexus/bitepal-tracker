package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFc1iSDK implements AFc1hSDK {

    @NotNull
    private final AFd1rSDK getCurrencyIso4217Code;

    public AFc1iSDK(@NotNull AFd1rSDK aFd1rSDK) {
        Intrinsics.checkNotNullParameter(aFd1rSDK, "");
        this.getCurrencyIso4217Code = aFd1rSDK;
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    public final void AFAdRevenueData(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.getCurrencyIso4217Code.AFAdRevenueData("deeplink_data", new JSONObject(map).toString());
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    public final void getCurrencyIso4217Code() {
        this.getCurrencyIso4217Code.AFAdRevenueData("deeplink_data");
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    @NotNull
    public final Map<String, Object> getMonetizationNetwork() {
        if (this.getCurrencyIso4217Code.getMonetizationNetwork("deeplink_data")) {
            try {
                String monetizationNetwork = this.getCurrencyIso4217Code.getMonetizationNetwork("deeplink_data", (String) null);
                return monetizationNetwork == null ? MapsKt.emptyMap() : AFj1dSDK.AFAdRevenueData(new JSONObject(monetizationNetwork));
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th, true, false);
            }
        }
        return MapsKt.emptyMap();
    }
}
