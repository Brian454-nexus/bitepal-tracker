package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000bj\u0002\b\fj\u0002\b\u0010"}, d2 = {"Lcom/appsflyer/internal/AFg1hSDK;", "", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "AFAdRevenueData", "Z", "()Z", "getMediationNetwork", "getRevenue", "Ljava/lang/String;", "getMonetizationNetwork", "getCurrencyIso4217Code"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public enum AFg1hSDK {
    IS_SAMSUNG_PRELOAD_REFERRER_COLLECTION_ENABLED("isSamsungPreloadReferrerEnabled", false),
    IS_PLAY_INTEGRITY_DATA_COLLECTION_ENABLED("isPlayIntegrityDataCollectionEnabled", true);


    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    private final boolean getMediationNetwork;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    private final boolean getRevenue = false;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    private final String getMonetizationNetwork;

    AFg1hSDK(String str, boolean z6) {
        this.getMonetizationNetwork = str;
        this.getMediationNetwork = z6;
    }

    @JvmName(name = "AFAdRevenueData")
    /* renamed from: AFAdRevenueData, reason: from getter */
    public final boolean getGetMediationNetwork() {
        return this.getMediationNetwork;
    }

    @JvmName(name = "getRevenue")
    /* renamed from: getRevenue, reason: from getter */
    public final boolean getGetRevenue() {
        return this.getRevenue;
    }
}
