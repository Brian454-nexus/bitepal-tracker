package g1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: g1.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1322b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14513a;

    /* renamed from: b, reason: collision with root package name */
    public final a f14514b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14515c;

    /* renamed from: g1.b$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC0198b f14516a;

        /* renamed from: b, reason: collision with root package name */
        public final Handler f14517b;

        public a(Handler handler, InterfaceC0198b interfaceC0198b) {
            this.f14517b = handler;
            this.f14516a = interfaceC0198b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f14517b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1322b.this.f14515c) {
                this.f14516a.A();
            }
        }
    }

    /* renamed from: g1.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface InterfaceC0198b {
        void A();
    }

    public C1322b(Context context, Handler handler, InterfaceC0198b interfaceC0198b) {
        this.f14513a = context.getApplicationContext();
        this.f14514b = new a(handler, interfaceC0198b);
    }

    public void b(boolean z6) {
        if (z6 && !this.f14515c) {
            this.f14513a.registerReceiver(this.f14514b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f14515c = true;
        } else {
            if (z6 || !this.f14515c) {
                return;
            }
            this.f14513a.unregisterReceiver(this.f14514b);
            this.f14515c = false;
        }
    }
}
