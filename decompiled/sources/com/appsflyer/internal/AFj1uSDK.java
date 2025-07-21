package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFj1sSDK;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFj1uSDK {
    public final AFd1kSDK AFAdRevenueData;
    public final List<AFj1sSDK> getMonetizationNetwork = new ArrayList();

    public AFj1uSDK(AFd1kSDK aFd1kSDK) {
        this.AFAdRevenueData = aFd1kSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component4(final Runnable runnable) {
        AFj1vSDK aFj1vSDK = new AFj1vSDK(this.AFAdRevenueData.getMediationNetwork(), this.AFAdRevenueData.getMonetizationNetwork(), AFj1xSDK.INSTAGRAM, runnable, new Runnable() { // from class: com.appsflyer.internal.I
            @Override // java.lang.Runnable
            public final void run() {
                AFj1uSDK.this.getMediationNetwork(runnable);
            }
        });
        getMonetizationNetwork(aFj1vSDK);
        aFj1vSDK.getMediationNetwork(this.AFAdRevenueData.values().AFAdRevenueData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getRevenue() {
    }

    public final AFi1eSDK AFAdRevenueData(final Runnable runnable) {
        return new AFi1eSDK(new Runnable() { // from class: com.appsflyer.internal.K
            @Override // java.lang.Runnable
            public final void run() {
                AFj1uSDK.this.getMonetizationNetwork(runnable);
            }
        }, this.AFAdRevenueData.getMonetizationNetwork(), this.AFAdRevenueData.getMediationNetwork());
    }

    @NonNull
    public final synchronized AFj1sSDK[] getCurrencyIso4217Code() {
        return (AFj1sSDK[]) this.getMonetizationNetwork.toArray(new AFj1sSDK[0]);
    }

    public final boolean getMediationNetwork(AFa1oSDK aFa1oSDK) {
        int mediationNetwork = this.AFAdRevenueData.getMediationNetwork().getRevenue.getMediationNetwork("appsFlyerCount", 0);
        return (!this.AFAdRevenueData.getRevenue().getMediationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT) && mediationNetwork == 1) || (mediationNetwork == 1 && !(aFa1oSDK instanceof AFh1lSDK));
    }

    public final synchronized void getMonetizationNetwork(AFj1sSDK aFj1sSDK) {
        this.getMonetizationNetwork.add(aFj1sSDK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getRevenue(Runnable runnable) {
        try {
            if (getMediationNetwork(new AFh1lSDK())) {
                runnable.run();
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    public final void getCurrencyIso4217Code(final Runnable runnable) {
        getMonetizationNetwork(new AFj1vSDK(this.AFAdRevenueData.getMediationNetwork(), this.AFAdRevenueData.getMonetizationNetwork(), AFj1xSDK.FACEBOOK, runnable, new Runnable() { // from class: com.appsflyer.internal.F
            @Override // java.lang.Runnable
            public final void run() {
                AFj1uSDK.this.component4(runnable);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMonetizationNetwork(final Runnable runnable) {
        AFj1cSDK.getMonetizationNetwork(this.AFAdRevenueData.AFAdRevenueData(), new Runnable() { // from class: com.appsflyer.internal.H
            @Override // java.lang.Runnable
            public final void run() {
                AFj1uSDK.this.getRevenue(runnable);
            }
        }, 0L, TimeUnit.MILLISECONDS);
    }

    public final boolean AFAdRevenueData() {
        return this.AFAdRevenueData.getMediationNetwork().AFAdRevenueData("AF_PREINSTALL_DISABLED", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(AFi1eSDK aFi1eSDK, Runnable runnable) {
        AFd1rSDK revenue = this.AFAdRevenueData.getRevenue();
        int mediationNetwork = this.AFAdRevenueData.getMediationNetwork().getRevenue.getMediationNetwork("appsFlyerCount", 0);
        boolean mediationNetwork2 = revenue.getMediationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT);
        boolean z6 = aFi1eSDK.component2 == AFj1sSDK.AFa1zSDK.NOT_STARTED;
        if (mediationNetwork == 1) {
            if (z6 || mediationNetwork2) {
                runnable.run();
            }
        }
    }

    public final Runnable getRevenue(final AFi1eSDK aFi1eSDK, final Runnable runnable) {
        return new Runnable() { // from class: com.appsflyer.internal.J
            @Override // java.lang.Runnable
            public final void run() {
                AFj1uSDK.this.getMediationNetwork(aFi1eSDK, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(Runnable runnable) {
        AFj1vSDK aFj1vSDK = new AFj1vSDK(this.AFAdRevenueData.getMediationNetwork(), this.AFAdRevenueData.getMonetizationNetwork(), AFj1xSDK.FACEBOOK_LITE, runnable, new Runnable() { // from class: com.appsflyer.internal.G
            @Override // java.lang.Runnable
            public final void run() {
                AFj1uSDK.getRevenue();
            }
        });
        getMonetizationNetwork(aFj1vSDK);
        aFj1vSDK.getMediationNetwork(this.AFAdRevenueData.values().AFAdRevenueData);
    }
}
