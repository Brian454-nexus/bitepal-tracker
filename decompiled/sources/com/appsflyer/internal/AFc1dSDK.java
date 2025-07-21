package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AFc1dSDK<T> {
    public final String AFAdRevenueData;
    public final Executor getCurrencyIso4217Code;
    public final FutureTask<T> getMediationNetwork = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.AFc1dSDK.5
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (AFc1dSDK.this.getCurrencyIso4217Code()) {
                return (T) AFc1dSDK.this.getMonetizationNetwork();
            }
            return null;
        }
    });
    private final String[] getMonetizationNetwork;
    public final Context getRevenue;

    public AFc1dSDK(Context context, Executor executor, String str, String... strArr) {
        this.getRevenue = context;
        this.AFAdRevenueData = str;
        this.getMonetizationNetwork = strArr;
        this.getCurrencyIso4217Code = executor;
    }

    public T AFAdRevenueData() {
        try {
            return this.getMediationNetwork.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e6) {
            e = e6;
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (ExecutionException e7) {
            e = e7;
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (TimeoutException e8) {
            AFLogger.afErrorLog(e8.getMessage(), e8, false, false);
            return null;
        }
    }

    public final boolean getCurrencyIso4217Code() {
        try {
            ProviderInfo resolveContentProvider = this.getRevenue.getPackageManager().resolveContentProvider(this.AFAdRevenueData, 128);
            if (resolveContentProvider != null) {
                if (Arrays.asList(this.getMonetizationNetwork).contains(AFb1qSDK.e_(this.getRevenue.getPackageManager(), ((PackageItemInfo) resolveContentProvider).packageName))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e6) {
            AFLogger.afErrorLog(e6.getMessage(), e6, false, true);
            return false;
        }
    }

    public abstract T getMonetizationNetwork();
}
