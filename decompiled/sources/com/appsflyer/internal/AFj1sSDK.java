package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AFj1sSDK extends Observable {
    final Runnable AFAdRevenueData;
    long component1;
    public final String component3;
    public final String getMonetizationNetwork;
    public final Map<String, Object> getMediationNetwork = new HashMap();
    public AFa1zSDK component2 = AFa1zSDK.NOT_STARTED;

    /* renamed from: com.appsflyer.internal.AFj1sSDK$1, reason: invalid class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class AnonymousClass1 implements Observer {
        public AnonymousClass1() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFj1sSDK.this.AFAdRevenueData.run();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum AFa1zSDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public AFj1sSDK(String str, String str2, Runnable runnable) {
        this.AFAdRevenueData = runnable;
        this.getMonetizationNetwork = str2;
        this.component3 = str;
    }

    public abstract void getMediationNetwork(Context context);

    public final void getRevenue() {
        this.getMediationNetwork.put("source", this.getMonetizationNetwork);
        this.getMediationNetwork.put("type", this.component3);
        this.getMediationNetwork.put("latency", Long.valueOf(System.currentTimeMillis() - this.component1));
        this.component2 = AFa1zSDK.FINISHED;
        setChanged();
        notifyObservers();
    }
}
