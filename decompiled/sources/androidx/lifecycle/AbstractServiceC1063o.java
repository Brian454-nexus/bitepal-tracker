package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractServiceC1063o extends Service implements InterfaceC1061m {

    /* renamed from: a, reason: collision with root package name */
    public final K f9064a = new K(this);

    @Override // androidx.lifecycle.InterfaceC1061m
    public AbstractC1057i getLifecycle() {
        return this.f9064a.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f9064a.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f9064a.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f9064a.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i6) {
        this.f9064a.e();
        super.onStart(intent, i6);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i6, int i7) {
        return super.onStartCommand(intent, i6, i7);
    }
}
