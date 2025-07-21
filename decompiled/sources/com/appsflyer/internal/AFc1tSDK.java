package com.appsflyer.internal;

import com.appsflyer.internal.AFe1aSDK;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFc1tSDK implements Runnable {

    @NotNull
    private final AFd1kSDK getCurrencyIso4217Code;

    @NotNull
    private final AFa1oSDK getMonetizationNetwork;

    @Nullable
    private final Map<String, Object> getRevenue;

    public AFc1tSDK(@NotNull AFd1kSDK aFd1kSDK, @NotNull AFa1oSDK aFa1oSDK, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        this.getCurrencyIso4217Code = aFd1kSDK;
        this.getMonetizationNetwork = aFa1oSDK;
        this.getRevenue = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFf1eSDK aFf1eSDK;
        if (this.getMonetizationNetwork.getRevenue()) {
            AFf1fSDK aFf1fSDK = new AFf1fSDK(this.getMonetizationNetwork, this.getCurrencyIso4217Code);
            aFf1fSDK.copydefault = this.getRevenue;
            aFf1eSDK = aFf1fSDK;
        } else {
            aFf1eSDK = this.getMonetizationNetwork instanceof AFh1nSDK ? new AFf1gSDK((AFh1nSDK) this.getMonetizationNetwork, this.getCurrencyIso4217Code) : new AFf1eSDK(this.getMonetizationNetwork, this.getCurrencyIso4217Code);
        }
        AFe1aSDK copy = this.getCurrencyIso4217Code.copy();
        copy.AFAdRevenueData.execute(new AFe1aSDK.AnonymousClass2(aFf1eSDK));
        if (aFf1eSDK.getMonetizationNetwork == AFf1zSDK.CONVERSION) {
            this.getCurrencyIso4217Code.AFInAppEventType();
            if (AFe1iSDK.getCurrencyIso4217Code() && AFb1qSDK.AFAdRevenueData(this.getCurrencyIso4217Code.values().AFAdRevenueData)) {
                AFe1aSDK copy2 = this.getCurrencyIso4217Code.copy();
                copy2.AFAdRevenueData.execute(new AFe1aSDK.AnonymousClass2(new AFf1hSDK(this.getCurrencyIso4217Code, "install")));
            }
        }
    }
}
