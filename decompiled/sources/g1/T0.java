package g1;

import android.content.Context;
import android.net.wifi.WifiManager;
import c1.AbstractC1133o;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class T0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14498a;

    /* renamed from: b, reason: collision with root package name */
    public WifiManager.WifiLock f14499b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14500c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14501d;

    public T0(Context context) {
        this.f14498a = context.getApplicationContext();
    }

    public void a(boolean z6) {
        if (z6 && this.f14499b == null) {
            WifiManager wifiManager = (WifiManager) this.f14498a.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                AbstractC1133o.h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f14499b = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        this.f14500c = z6;
        c();
    }

    public void b(boolean z6) {
        this.f14501d = z6;
        c();
    }

    public final void c() {
        WifiManager.WifiLock wifiLock = this.f14499b;
        if (wifiLock == null) {
            return;
        }
        if (this.f14500c && this.f14501d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
