package g1;

import android.content.Context;
import android.os.PowerManager;
import c1.AbstractC1133o;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14494a;

    /* renamed from: b, reason: collision with root package name */
    public PowerManager.WakeLock f14495b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14496c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14497d;

    public S0(Context context) {
        this.f14494a = context.getApplicationContext();
    }

    public void a(boolean z6) {
        if (z6 && this.f14495b == null) {
            PowerManager powerManager = (PowerManager) this.f14494a.getSystemService("power");
            if (powerManager == null) {
                AbstractC1133o.h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f14495b = newWakeLock;
                newWakeLock.setReferenceCounted(false);
            }
        }
        this.f14496c = z6;
        c();
    }

    public void b(boolean z6) {
        this.f14497d = z6;
        c();
    }

    public final void c() {
        PowerManager.WakeLock wakeLock = this.f14495b;
        if (wakeLock == null) {
            return;
        }
        if (this.f14496c && this.f14497d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
