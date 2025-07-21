package m1;

import A1.f;
import E1.C0307i;
import E1.InterfaceC0315q;
import Z0.C0841m;
import Z0.x;
import android.net.Uri;
import c1.AbstractC1113G;
import c1.AbstractC1119a;
import c1.C1111E;
import c1.C1144z;
import e1.AbstractC1251i;
import e1.C1252j;
import e1.InterfaceC1248f;
import h1.v1;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import m1.C1799f;
import n1.f;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j extends x1.m {

    /* renamed from: N, reason: collision with root package name */
    public static final AtomicInteger f17283N = new AtomicInteger();

    /* renamed from: A, reason: collision with root package name */
    public final boolean f17284A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f17285B;

    /* renamed from: C, reason: collision with root package name */
    public final v1 f17286C;

    /* renamed from: D, reason: collision with root package name */
    public final long f17287D;

    /* renamed from: E, reason: collision with root package name */
    public k f17288E;

    /* renamed from: F, reason: collision with root package name */
    public s f17289F;

    /* renamed from: G, reason: collision with root package name */
    public int f17290G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f17291H;

    /* renamed from: I, reason: collision with root package name */
    public volatile boolean f17292I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f17293J;

    /* renamed from: K, reason: collision with root package name */
    public z6.w f17294K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f17295L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f17296M;

    /* renamed from: k, reason: collision with root package name */
    public final int f17297k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17298l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f17299m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f17300n;

    /* renamed from: o, reason: collision with root package name */
    public final int f17301o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC1248f f17302p;

    /* renamed from: q, reason: collision with root package name */
    public final C1252j f17303q;

    /* renamed from: r, reason: collision with root package name */
    public final k f17304r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f17305s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f17306t;

    /* renamed from: u, reason: collision with root package name */
    public final C1111E f17307u;

    /* renamed from: v, reason: collision with root package name */
    public final h f17308v;

    /* renamed from: w, reason: collision with root package name */
    public final List f17309w;

    /* renamed from: x, reason: collision with root package name */
    public final C0841m f17310x;

    /* renamed from: y, reason: collision with root package name */
    public final S1.h f17311y;

    /* renamed from: z, reason: collision with root package name */
    public final C1144z f17312z;

    public j(h hVar, InterfaceC1248f interfaceC1248f, C1252j c1252j, Z0.q qVar, boolean z6, InterfaceC1248f interfaceC1248f2, C1252j c1252j2, boolean z7, Uri uri, List list, int i6, Object obj, long j6, long j7, long j8, int i7, boolean z8, int i8, boolean z9, boolean z10, C1111E c1111e, long j9, C0841m c0841m, k kVar, S1.h hVar2, C1144z c1144z, boolean z11, v1 v1Var) {
        super(interfaceC1248f, c1252j, qVar, i6, obj, j6, j7, j8);
        this.f17284A = z6;
        this.f17301o = i7;
        this.f17296M = z8;
        this.f17298l = i8;
        this.f17303q = c1252j2;
        this.f17302p = interfaceC1248f2;
        this.f17291H = c1252j2 != null;
        this.f17285B = z7;
        this.f17299m = uri;
        this.f17305s = z10;
        this.f17307u = c1111e;
        this.f17287D = j9;
        this.f17306t = z9;
        this.f17308v = hVar;
        this.f17309w = list;
        this.f17310x = c0841m;
        this.f17304r = kVar;
        this.f17311y = hVar2;
        this.f17312z = c1144z;
        this.f17300n = z11;
        this.f17286C = v1Var;
        this.f17294K = z6.w.w();
        this.f17297k = f17283N.getAndIncrement();
    }

    public static InterfaceC1248f i(InterfaceC1248f interfaceC1248f, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return interfaceC1248f;
        }
        AbstractC1119a.e(bArr2);
        return new C1794a(interfaceC1248f, bArr, bArr2);
    }

    public static j j(h hVar, InterfaceC1248f interfaceC1248f, Z0.q qVar, long j6, n1.f fVar, C1799f.e eVar, Uri uri, List list, int i6, Object obj, boolean z6, v vVar, long j7, j jVar, byte[] bArr, byte[] bArr2, boolean z7, v1 v1Var, f.a aVar) {
        boolean z8;
        InterfaceC1248f interfaceC1248f2;
        C1252j c1252j;
        boolean z9;
        Uri uri2;
        S1.h hVar2;
        C1144z c1144z;
        k kVar;
        f.e eVar2 = eVar.f17276a;
        C1252j a6 = new C1252j.b().i(AbstractC1113G.f(fVar.f17558a, eVar2.f17521a)).h(eVar2.f17529i).g(eVar2.f17530j).b(eVar.f17279d ? 8 : 0).a();
        boolean z10 = bArr != null;
        InterfaceC1248f i7 = i(interfaceC1248f, bArr, z10 ? l((String) AbstractC1119a.e(eVar2.f17528h)) : null);
        f.d dVar = eVar2.f17522b;
        if (dVar != null) {
            boolean z11 = bArr2 != null;
            byte[] l6 = z11 ? l((String) AbstractC1119a.e(dVar.f17528h)) : null;
            z8 = true;
            c1252j = new C1252j.b().i(AbstractC1113G.f(fVar.f17558a, dVar.f17521a)).h(dVar.f17529i).g(dVar.f17530j).a();
            interfaceC1248f2 = i(interfaceC1248f, bArr2, l6);
            z9 = z11;
        } else {
            z8 = true;
            interfaceC1248f2 = null;
            c1252j = null;
            z9 = false;
        }
        long j8 = j6 + eVar2.f17525e;
        long j9 = j8 + eVar2.f17523c;
        int i8 = fVar.f17501j + eVar2.f17524d;
        if (jVar != null) {
            C1252j c1252j2 = jVar.f17303q;
            boolean z12 = (c1252j == c1252j2 || (c1252j != null && c1252j2 != null && c1252j.f13820a.equals(c1252j2.f13820a) && c1252j.f13826g == jVar.f17303q.f13826g)) ? z8 : false;
            uri2 = uri;
            boolean z13 = (uri2.equals(jVar.f17299m) && jVar.f17293J) ? z8 : false;
            hVar2 = jVar.f17311y;
            c1144z = jVar.f17312z;
            kVar = (z12 && z13 && !jVar.f17295L && jVar.f17298l == i8) ? jVar.f17288E : null;
        } else {
            uri2 = uri;
            hVar2 = new S1.h();
            c1144z = new C1144z(10);
            kVar = null;
        }
        return new j(hVar, i7, a6, qVar, z10, interfaceC1248f2, c1252j, z9, uri2, list, i6, obj, j8, j9, eVar.f17277b, eVar.f17278c, !eVar.f17279d, i8, eVar2.f17531k, z6, vVar.a(i8), j7, eVar2.f17526f, kVar, hVar2, c1144z, z7, v1Var);
    }

    public static byte[] l(String str) {
        if (y6.c.e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    public static boolean p(C1799f.e eVar, n1.f fVar) {
        f.e eVar2 = eVar.f17276a;
        if (!(eVar2 instanceof f.b)) {
            return fVar.f17560c;
        }
        if (((f.b) eVar2).f17514l) {
            return true;
        }
        return eVar.f17278c == 0 && fVar.f17560c;
    }

    public static boolean w(j jVar, Uri uri, n1.f fVar, C1799f.e eVar, long j6) {
        if (jVar == null) {
            return false;
        }
        if (uri.equals(jVar.f17299m) && jVar.f17293J) {
            return false;
        }
        return !p(eVar, fVar) || j6 + eVar.f17276a.f17525e < jVar.f20437h;
    }

    @Override // A1.l.e
    public void a() {
        k kVar;
        AbstractC1119a.e(this.f17289F);
        if (this.f17288E == null && (kVar = this.f17304r) != null && kVar.e()) {
            this.f17288E = this.f17304r;
            this.f17291H = false;
        }
        s();
        if (this.f17292I) {
            return;
        }
        if (!this.f17306t) {
            r();
        }
        this.f17293J = !this.f17292I;
    }

    @Override // A1.l.e
    public void c() {
        this.f17292I = true;
    }

    @Override // x1.m
    public boolean h() {
        return this.f17293J;
    }

    public final void k(InterfaceC1248f interfaceC1248f, C1252j c1252j, boolean z6, boolean z7) {
        C1252j e6;
        long position;
        long j6;
        if (z6) {
            r0 = this.f17290G != 0;
            e6 = c1252j;
        } else {
            e6 = c1252j.e(this.f17290G);
        }
        try {
            C0307i u6 = u(interfaceC1248f, e6, z7);
            if (r0) {
                u6.p(this.f17290G);
            }
            while (!this.f17292I && this.f17288E.b(u6)) {
                try {
                    try {
                    } catch (EOFException e7) {
                        if ((this.f20433d.f6982f & 16384) == 0) {
                            throw e7;
                        }
                        this.f17288E.a();
                        position = u6.getPosition();
                        j6 = c1252j.f13826g;
                    }
                } catch (Throwable th) {
                    this.f17290G = (int) (u6.getPosition() - c1252j.f13826g);
                    throw th;
                }
            }
            position = u6.getPosition();
            j6 = c1252j.f13826g;
            this.f17290G = (int) (position - j6);
        } finally {
            AbstractC1251i.a(interfaceC1248f);
        }
    }

    public int m(int i6) {
        AbstractC1119a.g(!this.f17300n);
        if (i6 >= this.f17294K.size()) {
            return 0;
        }
        return ((Integer) this.f17294K.get(i6)).intValue();
    }

    public void n(s sVar, z6.w wVar) {
        this.f17289F = sVar;
        this.f17294K = wVar;
    }

    public void o() {
        this.f17295L = true;
    }

    public boolean q() {
        return this.f17296M;
    }

    public final void r() {
        k(this.f20438i, this.f20431b, this.f17284A, true);
    }

    public final void s() {
        if (this.f17291H) {
            AbstractC1119a.e(this.f17302p);
            AbstractC1119a.e(this.f17303q);
            k(this.f17302p, this.f17303q, this.f17285B, false);
            this.f17290G = 0;
            this.f17291H = false;
        }
    }

    public final long t(InterfaceC0315q interfaceC0315q) {
        interfaceC0315q.o();
        try {
            this.f17312z.P(10);
            interfaceC0315q.s(this.f17312z.e(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.f17312z.J() != 4801587) {
            return -9223372036854775807L;
        }
        this.f17312z.U(3);
        int F6 = this.f17312z.F();
        int i6 = F6 + 10;
        if (i6 > this.f17312z.b()) {
            byte[] e6 = this.f17312z.e();
            this.f17312z.P(i6);
            System.arraycopy(e6, 0, this.f17312z.e(), 0, 10);
        }
        interfaceC0315q.s(this.f17312z.e(), 10, F6);
        x e7 = this.f17311y.e(this.f17312z.e(), F6);
        if (e7 == null) {
            return -9223372036854775807L;
        }
        int f6 = e7.f();
        for (int i7 = 0; i7 < f6; i7++) {
            x.b e8 = e7.e(i7);
            if (e8 instanceof S1.m) {
                S1.m mVar = (S1.m) e8;
                if ("com.apple.streaming.transportStreamTimestamp".equals(mVar.f4684b)) {
                    System.arraycopy(mVar.f4685c, 0, this.f17312z.e(), 0, 8);
                    this.f17312z.T(0);
                    this.f17312z.S(8);
                    return this.f17312z.z() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final C0307i u(InterfaceC1248f interfaceC1248f, C1252j c1252j, boolean z6) {
        k d6;
        long r6 = interfaceC1248f.r(c1252j);
        if (z6) {
            try {
                this.f17307u.j(this.f17305s, this.f20436g, this.f17287D);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e6) {
                throw new IOException(e6);
            }
        }
        C0307i c0307i = new C0307i(interfaceC1248f, c1252j.f13826g, r6);
        if (this.f17288E == null) {
            long t6 = t(c0307i);
            c0307i.o();
            k kVar = this.f17304r;
            if (kVar != null) {
                d6 = kVar.f();
            } else {
                d6 = this.f17308v.d(c1252j.f13820a, this.f20433d, this.f17309w, this.f17307u, interfaceC1248f.n(), c0307i, this.f17286C);
                c0307i = c0307i;
            }
            this.f17288E = d6;
            if (d6.d()) {
                this.f17289F.o0(t6 != -9223372036854775807L ? this.f17307u.b(t6) : this.f20436g);
            } else {
                this.f17289F.o0(0L);
            }
            this.f17289F.a0();
            this.f17288E.c(this.f17289F);
        }
        this.f17289F.l0(this.f17310x);
        return c0307i;
    }

    public void v() {
        this.f17296M = true;
    }
}
