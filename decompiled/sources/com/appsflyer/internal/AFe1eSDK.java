package com.appsflyer.internal;

import android.net.TrafficStats;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AFe1eSDK<Result> implements Comparable<AFe1eSDK<?>>, Callable<AFe1cSDK> {
    private static final AtomicInteger component1 = new AtomicInteger();
    public volatile int AFAdRevenueData;
    private final int areAllFieldsValid;
    private final String component2;
    private Throwable component3;
    private long component4;

    @NonNull
    public final Set<AFf1zSDK> getCurrencyIso4217Code;
    public AFe1cSDK getMediationNetwork;

    @NonNull
    public final AFf1zSDK getMonetizationNetwork;

    @NonNull
    public final Set<AFf1zSDK> getRevenue;
    private boolean toString;

    public AFe1eSDK(@NonNull AFf1zSDK aFf1zSDK, @NonNull AFf1zSDK[] aFf1zSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.getRevenue = hashSet;
        this.getCurrencyIso4217Code = new HashSet();
        int incrementAndGet = component1.incrementAndGet();
        this.areAllFieldsValid = incrementAndGet;
        this.toString = false;
        this.AFAdRevenueData = 0;
        this.getMonetizationNetwork = aFf1zSDK;
        Collections.addAll(hashSet, aFf1zSDKArr);
        if (str != null) {
            this.component2 = str;
        } else {
            this.component2 = String.valueOf(incrementAndGet);
        }
    }

    @NonNull
    public abstract AFe1cSDK AFAdRevenueData();

    public final Throwable component1() {
        return this.component3;
    }

    public final boolean component2() {
        return this.toString;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: component3, reason: merged with bridge method [inline-methods] */
    public final AFe1cSDK call() {
        TrafficStats.setThreadStatsTag(82339054);
        this.getMediationNetwork = null;
        this.component3 = null;
        long currentTimeMillis = System.currentTimeMillis();
        this.AFAdRevenueData++;
        try {
            AFe1cSDK AFAdRevenueData = AFAdRevenueData();
            this.getMediationNetwork = AFAdRevenueData;
            return AFAdRevenueData;
        } finally {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1eSDK aFe1eSDK = (AFe1eSDK) obj;
        if (this.getMonetizationNetwork != aFe1eSDK.getMonetizationNetwork) {
            return false;
        }
        return this.component2.equals(aFe1eSDK.component2);
    }

    public void getCurrencyIso4217Code(Throwable th) {
    }

    public abstract boolean getMediationNetwork();

    public abstract long getMonetizationNetwork();

    public void getRevenue() {
    }

    public final int hashCode() {
        return (this.getMonetizationNetwork.hashCode() * 31) + this.component2.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getMonetizationNetwork);
        sb.append("-");
        sb.append(this.component2);
        String obj = sb.toString();
        if (String.valueOf(this.areAllFieldsValid).equals(this.component2)) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("-");
        sb2.append(this.areAllFieldsValid);
        return sb2.toString();
    }

    public void getCurrencyIso4217Code() {
        this.toString = true;
    }

    @Override // java.lang.Comparable
    /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFe1eSDK<?> aFe1eSDK) {
        int i6 = this.getMonetizationNetwork.AFLogger - aFe1eSDK.getMonetizationNetwork.AFLogger;
        if (i6 != 0) {
            return i6;
        }
        if (this.component2.equals(aFe1eSDK.component2)) {
            return 0;
        }
        return this.areAllFieldsValid - aFe1eSDK.areAllFieldsValid;
    }
}
