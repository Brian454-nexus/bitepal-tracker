package c1;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: c1.B, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1108B implements InterfaceC1121c {
    @Override // c1.InterfaceC1121c
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // c1.InterfaceC1121c
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // c1.InterfaceC1121c
    public long c() {
        return System.nanoTime();
    }

    @Override // c1.InterfaceC1121c
    public long d() {
        return SystemClock.uptimeMillis();
    }

    @Override // c1.InterfaceC1121c
    public InterfaceC1129k e(Looper looper, Handler.Callback callback) {
        return new C1109C(new Handler(looper, callback));
    }

    @Override // c1.InterfaceC1121c
    public void f() {
    }
}
