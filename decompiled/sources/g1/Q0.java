package g1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14400a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f14401b;

    /* renamed from: c, reason: collision with root package name */
    public final b f14402c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioManager f14403d;

    /* renamed from: e, reason: collision with root package name */
    public c f14404e;

    /* renamed from: f, reason: collision with root package name */
    public int f14405f;

    /* renamed from: g, reason: collision with root package name */
    public int f14406g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14407h;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void E(int i6, boolean z6);

        void m(int i6);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = Q0.this.f14401b;
            final Q0 q02 = Q0.this;
            handler.post(new Runnable() { // from class: g1.R0
                @Override // java.lang.Runnable
                public final void run() {
                    Q0.this.i();
                }
            });
        }
    }

    public Q0(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f14400a = applicationContext;
        this.f14401b = handler;
        this.f14402c = bVar;
        AudioManager audioManager = (AudioManager) AbstractC1119a.i((AudioManager) applicationContext.getSystemService("audio"));
        this.f14403d = audioManager;
        this.f14405f = 3;
        this.f14406g = f(audioManager, 3);
        this.f14407h = e(audioManager, this.f14405f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f14404e = cVar;
        } catch (RuntimeException e6) {
            AbstractC1133o.i("StreamVolumeManager", "Error registering stream volume receiver", e6);
        }
    }

    public static boolean e(AudioManager audioManager, int i6) {
        return AbstractC1117K.f10560a >= 23 ? audioManager.isStreamMute(i6) : f(audioManager, i6) == 0;
    }

    public static int f(AudioManager audioManager, int i6) {
        try {
            return audioManager.getStreamVolume(i6);
        } catch (RuntimeException e6) {
            AbstractC1133o.i("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i6, e6);
            return audioManager.getStreamMaxVolume(i6);
        }
    }

    public int c() {
        return this.f14403d.getStreamMaxVolume(this.f14405f);
    }

    public int d() {
        int streamMinVolume;
        if (AbstractC1117K.f10560a < 28) {
            return 0;
        }
        streamMinVolume = this.f14403d.getStreamMinVolume(this.f14405f);
        return streamMinVolume;
    }

    public void g() {
        c cVar = this.f14404e;
        if (cVar != null) {
            try {
                this.f14400a.unregisterReceiver(cVar);
            } catch (RuntimeException e6) {
                AbstractC1133o.i("StreamVolumeManager", "Error unregistering stream volume receiver", e6);
            }
            this.f14404e = null;
        }
    }

    public void h(int i6) {
        if (this.f14405f == i6) {
            return;
        }
        this.f14405f = i6;
        i();
        this.f14402c.m(i6);
    }

    public final void i() {
        int f6 = f(this.f14403d, this.f14405f);
        boolean e6 = e(this.f14403d, this.f14405f);
        if (this.f14406g == f6 && this.f14407h == e6) {
            return;
        }
        this.f14406g = f6;
        this.f14407h = e6;
        this.f14402c.E(f6, e6);
    }
}
