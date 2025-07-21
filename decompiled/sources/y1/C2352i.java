package y1;

import Z0.y;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b2.C1078b;
import b2.C1081e;
import b2.l;
import b2.m;
import b2.p;
import b2.q;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import g1.AbstractC1328e;
import g1.C1337i0;
import g1.K0;
import java.nio.ByteBuffer;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;
import w1.InterfaceC2212D;
import z6.w;

/* renamed from: y1.i, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2352i extends AbstractC1328e implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    public q f21185A;

    /* renamed from: B, reason: collision with root package name */
    public int f21186B;

    /* renamed from: C, reason: collision with root package name */
    public final Handler f21187C;

    /* renamed from: D, reason: collision with root package name */
    public final InterfaceC2351h f21188D;

    /* renamed from: E, reason: collision with root package name */
    public final C1337i0 f21189E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f21190F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f21191G;

    /* renamed from: H, reason: collision with root package name */
    public Z0.q f21192H;

    /* renamed from: I, reason: collision with root package name */
    public long f21193I;

    /* renamed from: J, reason: collision with root package name */
    public long f21194J;

    /* renamed from: K, reason: collision with root package name */
    public long f21195K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f21196L;

    /* renamed from: r, reason: collision with root package name */
    public final C1078b f21197r;

    /* renamed from: s, reason: collision with root package name */
    public final f1.f f21198s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC2344a f21199t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC2350g f21200u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f21201v;

    /* renamed from: w, reason: collision with root package name */
    public int f21202w;

    /* renamed from: x, reason: collision with root package name */
    public l f21203x;

    /* renamed from: y, reason: collision with root package name */
    public p f21204y;

    /* renamed from: z, reason: collision with root package name */
    public q f21205z;

    public C2352i(InterfaceC2351h interfaceC2351h, Looper looper) {
        this(interfaceC2351h, looper, InterfaceC2350g.f21183a);
    }

    public static boolean A0(Z0.q qVar) {
        return Objects.equals(qVar.f6990n, "application/x-media3-cues");
    }

    private long w0(long j6) {
        AbstractC1119a.g(j6 != -9223372036854775807L);
        AbstractC1119a.g(this.f21193I != -9223372036854775807L);
        return j6 - this.f21193I;
    }

    public final boolean B0(long j6) {
        if (this.f21190F || p0(this.f21189E, this.f21198s, 0) != -4) {
            return false;
        }
        if (this.f21198s.i()) {
            this.f21190F = true;
            return false;
        }
        this.f21198s.p();
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC1119a.e(this.f21198s.f14005d);
        C1081e a6 = this.f21197r.a(this.f21198s.f14007f, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.f21198s.f();
        return this.f21199t.a(a6, j6);
    }

    public final void C0() {
        this.f21204y = null;
        this.f21186B = -1;
        q qVar = this.f21205z;
        if (qVar != null) {
            qVar.n();
            this.f21205z = null;
        }
        q qVar2 = this.f21185A;
        if (qVar2 != null) {
            qVar2.n();
            this.f21185A = null;
        }
    }

    public final void D0() {
        C0();
        ((l) AbstractC1119a.e(this.f21203x)).release();
        this.f21203x = null;
        this.f21202w = 0;
    }

    public final void E0(long j6) {
        boolean B02 = B0(j6);
        long b6 = this.f21199t.b(this.f21194J);
        if (b6 == Long.MIN_VALUE && this.f21190F && !B02) {
            this.f21191G = true;
        }
        if (b6 != Long.MIN_VALUE && b6 <= j6) {
            B02 = true;
        }
        if (B02) {
            w c6 = this.f21199t.c(j6);
            long d6 = this.f21199t.d(j6);
            I0(new b1.b(c6, w0(d6)));
            this.f21199t.e(d6);
        }
        this.f21194J = j6;
    }

    public final void F0(long j6) {
        boolean z6;
        this.f21194J = j6;
        if (this.f21185A == null) {
            ((l) AbstractC1119a.e(this.f21203x)).c(j6);
            try {
                this.f21185A = (q) ((l) AbstractC1119a.e(this.f21203x)).a();
            } catch (m e6) {
                x0(e6);
                return;
            }
        }
        if (f() != 2) {
            return;
        }
        if (this.f21205z != null) {
            long v02 = v0();
            z6 = false;
            while (v02 <= j6) {
                this.f21186B++;
                v02 = v0();
                z6 = true;
            }
        } else {
            z6 = false;
        }
        q qVar = this.f21185A;
        if (qVar != null) {
            if (qVar.i()) {
                if (!z6 && v0() == LongCompanionObject.MAX_VALUE) {
                    if (this.f21202w == 2) {
                        G0();
                    } else {
                        C0();
                        this.f21191G = true;
                    }
                }
            } else if (qVar.f14013b <= j6) {
                q qVar2 = this.f21205z;
                if (qVar2 != null) {
                    qVar2.n();
                }
                this.f21186B = qVar.a(j6);
                this.f21205z = qVar;
                this.f21185A = null;
                z6 = true;
            }
        }
        if (z6) {
            AbstractC1119a.e(this.f21205z);
            I0(new b1.b(this.f21205z.c(j6), w0(u0(j6))));
        }
        if (this.f21202w == 2) {
            return;
        }
        while (!this.f21190F) {
            try {
                p pVar = this.f21204y;
                if (pVar == null) {
                    pVar = (p) ((l) AbstractC1119a.e(this.f21203x)).d();
                    if (pVar == null) {
                        return;
                    } else {
                        this.f21204y = pVar;
                    }
                }
                if (this.f21202w == 1) {
                    pVar.m(4);
                    ((l) AbstractC1119a.e(this.f21203x)).f(pVar);
                    this.f21204y = null;
                    this.f21202w = 2;
                    return;
                }
                int p02 = p0(this.f21189E, pVar, 0);
                if (p02 == -4) {
                    if (pVar.i()) {
                        this.f21190F = true;
                        this.f21201v = false;
                    } else {
                        Z0.q qVar3 = this.f21189E.f14685b;
                        if (qVar3 == null) {
                            return;
                        }
                        pVar.f10487j = qVar3.f6995s;
                        pVar.p();
                        this.f21201v &= !pVar.k();
                    }
                    if (!this.f21201v) {
                        ((l) AbstractC1119a.e(this.f21203x)).f(pVar);
                        this.f21204y = null;
                    }
                } else if (p02 == -3) {
                    return;
                }
            } catch (m e7) {
                x0(e7);
                return;
            }
        }
    }

    public final void G0() {
        D0();
        y0();
    }

    public void H0(long j6) {
        AbstractC1119a.g(P());
        this.f21195K = j6;
    }

    public final void I0(b1.b bVar) {
        Handler handler = this.f21187C;
        if (handler != null) {
            handler.obtainMessage(1, bVar).sendToTarget();
        } else {
            z0(bVar);
        }
    }

    @Override // g1.K0
    public int b(Z0.q qVar) {
        if (A0(qVar) || this.f21200u.b(qVar)) {
            return K0.E(qVar.f6975K == 0 ? 4 : 2);
        }
        return y.r(qVar.f6990n) ? K0.E(1) : K0.E(0);
    }

    @Override // g1.J0
    public boolean c() {
        return true;
    }

    @Override // g1.J0
    public boolean d() {
        return this.f21191G;
    }

    @Override // g1.AbstractC1328e
    public void e0() {
        this.f21192H = null;
        this.f21195K = -9223372036854775807L;
        t0();
        this.f21193I = -9223372036854775807L;
        this.f21194J = -9223372036854775807L;
        if (this.f21203x != null) {
            D0();
        }
    }

    @Override // g1.J0, g1.K0
    public String getName() {
        return "TextRenderer";
    }

    @Override // g1.AbstractC1328e
    public void h0(long j6, boolean z6) {
        this.f21194J = j6;
        InterfaceC2344a interfaceC2344a = this.f21199t;
        if (interfaceC2344a != null) {
            interfaceC2344a.clear();
        }
        t0();
        this.f21190F = false;
        this.f21191G = false;
        this.f21195K = -9223372036854775807L;
        Z0.q qVar = this.f21192H;
        if (qVar == null || A0(qVar)) {
            return;
        }
        if (this.f21202w != 0) {
            G0();
            return;
        }
        C0();
        l lVar = (l) AbstractC1119a.e(this.f21203x);
        lVar.flush();
        lVar.b(a0());
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        z0((b1.b) message.obj);
        return true;
    }

    @Override // g1.J0
    public void i(long j6, long j7) {
        if (P()) {
            long j8 = this.f21195K;
            if (j8 != -9223372036854775807L && j6 >= j8) {
                C0();
                this.f21191G = true;
            }
        }
        if (this.f21191G) {
            return;
        }
        if (A0((Z0.q) AbstractC1119a.e(this.f21192H))) {
            AbstractC1119a.e(this.f21199t);
            E0(j6);
        } else {
            s0();
            F0(j6);
        }
    }

    @Override // g1.AbstractC1328e
    public void n0(Z0.q[] qVarArr, long j6, long j7, InterfaceC2212D.b bVar) {
        this.f21193I = j7;
        Z0.q qVar = qVarArr[0];
        this.f21192H = qVar;
        if (A0(qVar)) {
            this.f21199t = this.f21192H.f6972H == 1 ? new C2348e() : new C2349f();
            return;
        }
        s0();
        if (this.f21203x != null) {
            this.f21202w = 1;
        } else {
            y0();
        }
    }

    public final void s0() {
        AbstractC1119a.h(this.f21196L || Objects.equals(this.f21192H.f6990n, "application/cea-608") || Objects.equals(this.f21192H.f6990n, "application/x-mp4-cea-608") || Objects.equals(this.f21192H.f6990n, "application/cea-708"), "Legacy decoding is disabled, can't handle " + this.f21192H.f6990n + " samples (expected application/x-media3-cues).");
    }

    public final void t0() {
        I0(new b1.b(w.w(), w0(this.f21194J)));
    }

    public final long u0(long j6) {
        int a6 = this.f21205z.a(j6);
        if (a6 == 0 || this.f21205z.d() == 0) {
            return this.f21205z.f14013b;
        }
        if (a6 != -1) {
            return this.f21205z.b(a6 - 1);
        }
        return this.f21205z.b(r2.d() - 1);
    }

    public final long v0() {
        if (this.f21186B == -1) {
            return LongCompanionObject.MAX_VALUE;
        }
        AbstractC1119a.e(this.f21205z);
        return this.f21186B >= this.f21205z.d() ? LongCompanionObject.MAX_VALUE : this.f21205z.b(this.f21186B);
    }

    public final void x0(m mVar) {
        AbstractC1133o.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f21192H, mVar);
        t0();
        G0();
    }

    public final void y0() {
        this.f21201v = true;
        l a6 = this.f21200u.a((Z0.q) AbstractC1119a.e(this.f21192H));
        this.f21203x = a6;
        a6.b(a0());
    }

    public final void z0(b1.b bVar) {
        this.f21188D.q(bVar.f10447a);
        this.f21188D.i(bVar);
    }

    public C2352i(InterfaceC2351h interfaceC2351h, Looper looper, InterfaceC2350g interfaceC2350g) {
        super(3);
        this.f21188D = (InterfaceC2351h) AbstractC1119a.e(interfaceC2351h);
        this.f21187C = looper == null ? null : AbstractC1117K.z(looper, this);
        this.f21200u = interfaceC2350g;
        this.f21197r = new C1078b();
        this.f21198s = new f1.f(1);
        this.f21189E = new C1337i0();
        this.f21195K = -9223372036854775807L;
        this.f21193I = -9223372036854775807L;
        this.f21194J = -9223372036854775807L;
        this.f21196L = false;
    }
}
