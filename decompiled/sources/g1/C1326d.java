package g1;

import Z0.C0830b;
import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;

/* renamed from: g1.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1326d {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f14522a;

    /* renamed from: b, reason: collision with root package name */
    public final a f14523b;

    /* renamed from: c, reason: collision with root package name */
    public b f14524c;

    /* renamed from: d, reason: collision with root package name */
    public C0830b f14525d;

    /* renamed from: f, reason: collision with root package name */
    public int f14527f;

    /* renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f14529h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14530i;

    /* renamed from: g, reason: collision with root package name */
    public float f14528g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int f14526e = 0;

    /* renamed from: g1.d$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f14531a;

        public a(Handler handler) {
            this.f14531a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i6) {
            this.f14531a.post(new Runnable() { // from class: g1.c
                @Override // java.lang.Runnable
                public final void run() {
                    C1326d.this.h(i6);
                }
            });
        }
    }

    /* renamed from: g1.d$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void B(float f6);

        void C(int i6);
    }

    public C1326d(Context context, Handler handler, b bVar) {
        this.f14522a = (AudioManager) AbstractC1119a.e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f14524c = bVar;
        this.f14523b = new a(handler);
    }

    public static int e(C0830b c0830b) {
        if (c0830b == null) {
            return 0;
        }
        switch (c0830b.f6866c) {
            case 0:
                AbstractC1133o.h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (c0830b.f6864a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                AbstractC1133o.h("AudioFocusManager", "Unidentified audio usage: " + c0830b.f6866c);
                return 0;
            case 16:
                return 4;
        }
    }

    public final void a() {
        this.f14522a.abandonAudioFocus(this.f14523b);
    }

    public final void b() {
        int i6 = this.f14526e;
        if (i6 == 1 || i6 == 0) {
            return;
        }
        if (AbstractC1117K.f10560a >= 26) {
            c();
        } else {
            a();
        }
    }

    public final void c() {
        AudioFocusRequest audioFocusRequest = this.f14529h;
        if (audioFocusRequest != null) {
            this.f14522a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    public final void f(int i6) {
        b bVar = this.f14524c;
        if (bVar != null) {
            bVar.C(i6);
        }
    }

    public float g() {
        return this.f14528g;
    }

    public final void h(int i6) {
        if (i6 == -3 || i6 == -2) {
            if (i6 != -2 && !q()) {
                n(4);
                return;
            } else {
                f(0);
                n(3);
                return;
            }
        }
        if (i6 == -1) {
            f(-1);
            b();
            n(1);
        } else if (i6 == 1) {
            n(2);
            f(1);
        } else {
            AbstractC1133o.h("AudioFocusManager", "Unknown focus change type: " + i6);
        }
    }

    public void i() {
        this.f14524c = null;
        b();
        n(0);
    }

    public final int j() {
        if (this.f14526e == 2) {
            return 1;
        }
        if ((AbstractC1117K.f10560a >= 26 ? l() : k()) == 1) {
            n(2);
            return 1;
        }
        n(1);
        return -1;
    }

    public final int k() {
        return this.f14522a.requestAudioFocus(this.f14523b, AbstractC1117K.m0(((C0830b) AbstractC1119a.e(this.f14525d)).f6866c), this.f14527f);
    }

    public final int l() {
        AudioFocusRequest audioFocusRequest = this.f14529h;
        if (audioFocusRequest == null || this.f14530i) {
            this.f14529h = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f14527f) : new AudioFocusRequest.Builder(this.f14529h)).setAudioAttributes(((C0830b) AbstractC1119a.e(this.f14525d)).a().f6870a).setWillPauseWhenDucked(q()).setOnAudioFocusChangeListener(this.f14523b).build();
            this.f14530i = false;
        }
        return this.f14522a.requestAudioFocus(this.f14529h);
    }

    public void m(C0830b c0830b) {
        if (AbstractC1117K.c(this.f14525d, c0830b)) {
            return;
        }
        this.f14525d = c0830b;
        int e6 = e(c0830b);
        this.f14527f = e6;
        boolean z6 = true;
        if (e6 != 1 && e6 != 0) {
            z6 = false;
        }
        AbstractC1119a.b(z6, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public final void n(int i6) {
        if (this.f14526e == i6) {
            return;
        }
        this.f14526e = i6;
        float f6 = i6 == 4 ? 0.2f : 1.0f;
        if (this.f14528g == f6) {
            return;
        }
        this.f14528g = f6;
        b bVar = this.f14524c;
        if (bVar != null) {
            bVar.B(f6);
        }
    }

    public final boolean o(int i6) {
        return i6 != 1 && this.f14527f == 1;
    }

    public int p(boolean z6, int i6) {
        if (!o(i6)) {
            b();
            n(0);
            return 1;
        }
        if (z6) {
            return j();
        }
        int i7 = this.f14526e;
        if (i7 != 1) {
            return i7 != 3 ? 1 : 0;
        }
        return -1;
    }

    public final boolean q() {
        C0830b c0830b = this.f14525d;
        return c0830b != null && c0830b.f6864a == 1;
    }
}
