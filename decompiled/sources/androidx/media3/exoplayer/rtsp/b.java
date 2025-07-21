package androidx.media3.exoplayer.rtsp;

import A1.l;
import E1.C0307i;
import E1.I;
import E1.InterfaceC0315q;
import E1.r;
import Z0.InterfaceC0837i;
import android.os.Handler;
import androidx.media3.exoplayer.rtsp.a;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import e1.AbstractC1251i;
import s1.C2043c;
import s1.C2054n;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements l.e {

    /* renamed from: a, reason: collision with root package name */
    public final int f9300a;

    /* renamed from: b, reason: collision with root package name */
    public final C2054n f9301b;

    /* renamed from: c, reason: collision with root package name */
    public final a f9302c;

    /* renamed from: d, reason: collision with root package name */
    public final r f9303d;

    /* renamed from: f, reason: collision with root package name */
    public final a.InterfaceC0138a f9305f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.media3.exoplayer.rtsp.a f9306g;

    /* renamed from: h, reason: collision with root package name */
    public C2043c f9307h;

    /* renamed from: i, reason: collision with root package name */
    public C0307i f9308i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f9309j;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f9311l;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f9304e = AbstractC1117K.A();

    /* renamed from: k, reason: collision with root package name */
    public volatile long f9310k = -9223372036854775807L;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(String str, androidx.media3.exoplayer.rtsp.a aVar);
    }

    public b(int i6, C2054n c2054n, a aVar, r rVar, a.InterfaceC0138a interfaceC0138a) {
        this.f9300a = i6;
        this.f9301b = c2054n;
        this.f9302c = aVar;
        this.f9303d = rVar;
        this.f9305f = interfaceC0138a;
    }

    @Override // A1.l.e
    public void a() {
        if (this.f9309j) {
            this.f9309j = false;
        }
        try {
            if (this.f9306g == null) {
                androidx.media3.exoplayer.rtsp.a a6 = this.f9305f.a(this.f9300a);
                this.f9306g = a6;
                final String b6 = a6.b();
                final androidx.media3.exoplayer.rtsp.a aVar = this.f9306g;
                this.f9304e.post(new Runnable() { // from class: s1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.rtsp.b.this.f9302c.a(b6, aVar);
                    }
                });
                this.f9308i = new C0307i((InterfaceC0837i) AbstractC1119a.e(this.f9306g), 0L, -1L);
                C2043c c2043c = new C2043c(this.f9301b.f18818a, this.f9300a);
                this.f9307h = c2043c;
                c2043c.c(this.f9303d);
            }
            while (!this.f9309j) {
                if (this.f9310k != -9223372036854775807L) {
                    ((C2043c) AbstractC1119a.e(this.f9307h)).a(this.f9311l, this.f9310k);
                    this.f9310k = -9223372036854775807L;
                }
                if (((C2043c) AbstractC1119a.e(this.f9307h)).g((InterfaceC0315q) AbstractC1119a.e(this.f9308i), new I()) == -1) {
                    break;
                }
            }
            this.f9309j = false;
            if (((androidx.media3.exoplayer.rtsp.a) AbstractC1119a.e(this.f9306g)).e()) {
                AbstractC1251i.a(this.f9306g);
                this.f9306g = null;
            }
        } catch (Throwable th) {
            if (((androidx.media3.exoplayer.rtsp.a) AbstractC1119a.e(this.f9306g)).e()) {
                AbstractC1251i.a(this.f9306g);
                this.f9306g = null;
            }
            throw th;
        }
    }

    @Override // A1.l.e
    public void c() {
        this.f9309j = true;
    }

    public void d() {
        ((C2043c) AbstractC1119a.e(this.f9307h)).f();
    }

    public void e(long j6, long j7) {
        this.f9310k = j6;
        this.f9311l = j7;
    }

    public void f(int i6) {
        if (((C2043c) AbstractC1119a.e(this.f9307h)).e()) {
            return;
        }
        this.f9307h.j(i6);
    }

    public void g(long j6) {
        if (j6 == -9223372036854775807L || ((C2043c) AbstractC1119a.e(this.f9307h)).e()) {
            return;
        }
        this.f9307h.k(j6);
    }
}
