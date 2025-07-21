package com.amazon.a.a.n.a;

import android.os.Binder;
import android.os.RemoteException;
import com.amazon.d.a.j;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private String f11058a;

    /* renamed from: b, reason: collision with root package name */
    private RemoteException f11059b;

    /* renamed from: c, reason: collision with root package name */
    private j f11060c;

    /* renamed from: d, reason: collision with root package name */
    private com.amazon.d.a.h f11061d;

    /* renamed from: e, reason: collision with root package name */
    private com.amazon.d.a.f f11062e;

    /* renamed from: f, reason: collision with root package name */
    private com.amazon.d.a.g f11063f;

    /* renamed from: g, reason: collision with root package name */
    private int f11064g = Binder.getCallingUid();

    public c(j jVar) {
        this.f11060c = jVar;
        try {
            this.f11058a = jVar.a();
        } catch (RemoteException e6) {
            this.f11059b = e6;
        }
    }

    public String a() {
        RemoteException remoteException = this.f11059b;
        if (remoteException == null) {
            return this.f11058a;
        }
        throw remoteException;
    }

    public j b() {
        return this.f11060c;
    }

    public com.amazon.d.a.h c() {
        return this.f11061d;
    }

    public com.amazon.d.a.f d() {
        return this.f11062e;
    }

    public com.amazon.d.a.g e() {
        return this.f11063f;
    }

    public int f() {
        return this.f11064g;
    }

    public String toString() {
        return "CommandResult: [CallingUid: " + this.f11064g + ", SuccessResult: " + this.f11060c + ", FailureResult: " + this.f11061d + ", DecisionResult: " + this.f11062e + ", ExceptionResult: " + this.f11063f + "]";
    }

    public c(com.amazon.d.a.h hVar) {
        this.f11061d = hVar;
        try {
            this.f11058a = hVar.a();
        } catch (RemoteException e6) {
            this.f11059b = e6;
        }
    }

    public c(com.amazon.d.a.f fVar) {
        this.f11062e = fVar;
        try {
            this.f11058a = fVar.a();
        } catch (RemoteException e6) {
            this.f11059b = e6;
        }
    }

    public c(com.amazon.d.a.g gVar) {
        this.f11063f = gVar;
    }
}
