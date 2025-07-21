package s1;

import E1.I;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.J;
import android.os.SystemClock;
import c1.AbstractC1119a;
import c1.C1144z;
import t1.C2071a;

/* renamed from: s1.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2043c implements InterfaceC0314p {

    /* renamed from: a, reason: collision with root package name */
    public final t1.k f18766a;

    /* renamed from: d, reason: collision with root package name */
    public final int f18769d;

    /* renamed from: g, reason: collision with root package name */
    public E1.r f18772g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18773h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18776k;

    /* renamed from: b, reason: collision with root package name */
    public final C1144z f18767b = new C1144z(65507);

    /* renamed from: c, reason: collision with root package name */
    public final C1144z f18768c = new C1144z();

    /* renamed from: e, reason: collision with root package name */
    public final Object f18770e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final C2046f f18771f = new C2046f();

    /* renamed from: i, reason: collision with root package name */
    public volatile long f18774i = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public volatile int f18775j = -1;

    /* renamed from: l, reason: collision with root package name */
    public long f18777l = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public long f18778m = -9223372036854775807L;

    public C2043c(C2047g c2047g, int i6) {
        this.f18769d = i6;
        this.f18766a = (t1.k) AbstractC1119a.e(new C2071a().a(c2047g));
    }

    public static long b(long j6) {
        return j6 - 30;
    }

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        synchronized (this.f18770e) {
            try {
                if (!this.f18776k) {
                    this.f18776k = true;
                }
                this.f18777l = j6;
                this.f18778m = j7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // E1.InterfaceC0314p
    public void c(E1.r rVar) {
        this.f18766a.d(rVar, this.f18769d);
        rVar.k();
        rVar.n(new J.b(-9223372036854775807L));
        this.f18772g = rVar;
    }

    public boolean e() {
        return this.f18773h;
    }

    public void f() {
        synchronized (this.f18770e) {
            this.f18776k = true;
        }
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, I i6) {
        AbstractC1119a.e(this.f18772g);
        int read = interfaceC0315q.read(this.f18767b.e(), 0, 65507);
        if (read == -1) {
            return -1;
        }
        if (read == 0) {
            return 0;
        }
        this.f18767b.T(0);
        this.f18767b.S(read);
        C2044d d6 = C2044d.d(this.f18767b);
        if (d6 == null) {
            return 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long b6 = b(elapsedRealtime);
        this.f18771f.d(d6, elapsedRealtime);
        C2044d e6 = this.f18771f.e(b6);
        if (e6 == null) {
            return 0;
        }
        if (!this.f18773h) {
            if (this.f18774i == -9223372036854775807L) {
                this.f18774i = e6.f18787h;
            }
            if (this.f18775j == -1) {
                this.f18775j = e6.f18786g;
            }
            this.f18766a.b(this.f18774i, this.f18775j);
            this.f18773h = true;
        }
        synchronized (this.f18770e) {
            try {
                if (this.f18776k) {
                    if (this.f18777l != -9223372036854775807L && this.f18778m != -9223372036854775807L) {
                        this.f18771f.f();
                        this.f18766a.a(this.f18777l, this.f18778m);
                        this.f18776k = false;
                        this.f18777l = -9223372036854775807L;
                        this.f18778m = -9223372036854775807L;
                    }
                }
                do {
                    this.f18768c.Q(e6.f18790k);
                    this.f18766a.c(this.f18768c, e6.f18787h, e6.f18786g, e6.f18784e);
                    e6 = this.f18771f.e(b6);
                } while (e6 != null);
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    @Override // E1.InterfaceC0314p
    public boolean i(InterfaceC0315q interfaceC0315q) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    public void j(int i6) {
        this.f18775j = i6;
    }

    public void k(long j6) {
        this.f18774i = j6;
    }

    @Override // E1.InterfaceC0314p
    public void release() {
    }
}
