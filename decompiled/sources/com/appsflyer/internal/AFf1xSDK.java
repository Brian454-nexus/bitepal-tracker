package com.appsflyer.internal;

import java.util.TimerTask;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFf1xSDK extends TimerTask {
    private final Thread getMediationNetwork;

    public AFf1xSDK(Thread thread) {
        this.getMediationNetwork = thread;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.getMediationNetwork.interrupt();
    }
}
