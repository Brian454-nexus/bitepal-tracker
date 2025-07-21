package com.amazon.a.a.n.a.a;

import android.os.DeadObjectException;
import android.os.RemoteException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d extends com.amazon.a.a.d.b {

    /* renamed from: a, reason: collision with root package name */
    private static final long f11045a = 1;

    public d(RemoteException remoteException) {
        super(a(remoteException));
    }

    private static String a(RemoteException remoteException) {
        return remoteException instanceof DeadObjectException ? "COMMAND_SERVICE_DEAD_OBJECT_EXCEPTION" : "COMMAND_SERVICE_REMOTE_EXCEPTION";
    }
}
