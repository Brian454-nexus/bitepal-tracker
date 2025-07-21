package i1;

import Z0.C0830b;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import c1.AbstractC1117K;
import c1.AbstractC1119a;

/* renamed from: i1.i, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1492i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15924a;

    /* renamed from: b, reason: collision with root package name */
    public final f f15925b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f15926c;

    /* renamed from: d, reason: collision with root package name */
    public final c f15927d;

    /* renamed from: e, reason: collision with root package name */
    public final BroadcastReceiver f15928e;

    /* renamed from: f, reason: collision with root package name */
    public final d f15929f;

    /* renamed from: g, reason: collision with root package name */
    public C1488e f15930g;

    /* renamed from: h, reason: collision with root package name */
    public C1493j f15931h;

    /* renamed from: i, reason: collision with root package name */
    public C0830b f15932i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f15933j;

    /* renamed from: i1.i$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ((AudioManager) AbstractC1119a.e((AudioManager) context.getSystemService("audio"))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager) AbstractC1119a.e((AudioManager) context.getSystemService("audio"))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* renamed from: i1.i$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class c extends AudioDeviceCallback {
        public c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            C1492i c1492i = C1492i.this;
            c1492i.f(C1488e.f(c1492i.f15924a, C1492i.this.f15932i, C1492i.this.f15931h));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (AbstractC1117K.s(audioDeviceInfoArr, C1492i.this.f15931h)) {
                C1492i.this.f15931h = null;
            }
            C1492i c1492i = C1492i.this;
            c1492i.f(C1488e.f(c1492i.f15924a, C1492i.this.f15932i, C1492i.this.f15931h));
        }
    }

    /* renamed from: i1.i$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class d extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f15935a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f15936b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f15935a = contentResolver;
            this.f15936b = uri;
        }

        public void a() {
            this.f15935a.registerContentObserver(this.f15936b, false, this);
        }

        public void b() {
            this.f15935a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z6) {
            C1492i c1492i = C1492i.this;
            c1492i.f(C1488e.f(c1492i.f15924a, C1492i.this.f15932i, C1492i.this.f15931h));
        }
    }

    /* renamed from: i1.i$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class e extends BroadcastReceiver {
        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            C1492i c1492i = C1492i.this;
            c1492i.f(C1488e.g(context, intent, c1492i.f15932i, C1492i.this.f15931h));
        }
    }

    /* renamed from: i1.i$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface f {
        void a(C1488e c1488e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1492i(Context context, f fVar, C0830b c0830b, C1493j c1493j) {
        Context applicationContext = context.getApplicationContext();
        this.f15924a = applicationContext;
        this.f15925b = (f) AbstractC1119a.e(fVar);
        this.f15932i = c0830b;
        this.f15931h = c1493j;
        Handler C6 = AbstractC1117K.C();
        this.f15926c = C6;
        int i6 = AbstractC1117K.f10560a;
        Object[] objArr = 0;
        this.f15927d = i6 >= 23 ? new c() : null;
        this.f15928e = i6 >= 21 ? new e() : null;
        Uri j6 = C1488e.j();
        this.f15929f = j6 != null ? new d(C6, applicationContext.getContentResolver(), j6) : null;
    }

    public final void f(C1488e c1488e) {
        if (!this.f15933j || c1488e.equals(this.f15930g)) {
            return;
        }
        this.f15930g = c1488e;
        this.f15925b.a(c1488e);
    }

    public C1488e g() {
        c cVar;
        if (this.f15933j) {
            return (C1488e) AbstractC1119a.e(this.f15930g);
        }
        this.f15933j = true;
        d dVar = this.f15929f;
        if (dVar != null) {
            dVar.a();
        }
        if (AbstractC1117K.f10560a >= 23 && (cVar = this.f15927d) != null) {
            b.a(this.f15924a, cVar, this.f15926c);
        }
        C1488e g6 = C1488e.g(this.f15924a, this.f15928e != null ? this.f15924a.registerReceiver(this.f15928e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f15926c) : null, this.f15932i, this.f15931h);
        this.f15930g = g6;
        return g6;
    }

    public void h(C0830b c0830b) {
        this.f15932i = c0830b;
        f(C1488e.f(this.f15924a, c0830b, this.f15931h));
    }

    public void i(AudioDeviceInfo audioDeviceInfo) {
        C1493j c1493j = this.f15931h;
        if (AbstractC1117K.c(audioDeviceInfo, c1493j == null ? null : c1493j.f15939a)) {
            return;
        }
        C1493j c1493j2 = audioDeviceInfo != null ? new C1493j(audioDeviceInfo) : null;
        this.f15931h = c1493j2;
        f(C1488e.f(this.f15924a, this.f15932i, c1493j2));
    }

    public void j() {
        c cVar;
        if (this.f15933j) {
            this.f15930g = null;
            if (AbstractC1117K.f10560a >= 23 && (cVar = this.f15927d) != null) {
                b.b(this.f15924a, cVar);
            }
            BroadcastReceiver broadcastReceiver = this.f15928e;
            if (broadcastReceiver != null) {
                this.f15924a.unregisterReceiver(broadcastReceiver);
            }
            d dVar = this.f15929f;
            if (dVar != null) {
                dVar.b();
            }
            this.f15933j = false;
        }
    }
}
