package X2;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X2.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0820d implements W2.s {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f6165a = v0.i.a(Looper.getMainLooper());

    @Override // W2.s
    public void a(long j6, Runnable runnable) {
        this.f6165a.postDelayed(runnable, j6);
    }

    @Override // W2.s
    public void b(Runnable runnable) {
        this.f6165a.removeCallbacks(runnable);
    }
}
