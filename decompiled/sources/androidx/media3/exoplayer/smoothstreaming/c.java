package androidx.media3.exoplayer.smoothstreaming;

import A1.e;
import A1.k;
import A1.m;
import Z0.H;
import Z0.q;
import androidx.media3.exoplayer.smoothstreaming.b;
import c1.AbstractC1119a;
import e1.InterfaceC1266x;
import g1.C1343l0;
import g1.N0;
import java.util.ArrayList;
import java.util.List;
import l1.t;
import l1.u;
import v1.C2161a;
import w1.InterfaceC2211C;
import w1.InterfaceC2225j;
import w1.K;
import w1.b0;
import w1.c0;
import w1.l0;
import x1.C2264h;
import y6.g;
import z1.x;
import z6.G;
import z6.w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c implements InterfaceC2211C, c0.a {

    /* renamed from: a, reason: collision with root package name */
    public final b.a f9468a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1266x f9469b;

    /* renamed from: c, reason: collision with root package name */
    public final m f9470c;

    /* renamed from: d, reason: collision with root package name */
    public final u f9471d;

    /* renamed from: e, reason: collision with root package name */
    public final t.a f9472e;

    /* renamed from: f, reason: collision with root package name */
    public final k f9473f;

    /* renamed from: g, reason: collision with root package name */
    public final K.a f9474g;

    /* renamed from: h, reason: collision with root package name */
    public final A1.b f9475h;

    /* renamed from: i, reason: collision with root package name */
    public final l0 f9476i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC2225j f9477j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC2211C.a f9478k;

    /* renamed from: l, reason: collision with root package name */
    public C2161a f9479l;

    /* renamed from: m, reason: collision with root package name */
    public C2264h[] f9480m = u(0);

    /* renamed from: n, reason: collision with root package name */
    public c0 f9481n;

    public c(C2161a c2161a, b.a aVar, InterfaceC1266x interfaceC1266x, InterfaceC2225j interfaceC2225j, e eVar, u uVar, t.a aVar2, k kVar, K.a aVar3, m mVar, A1.b bVar) {
        this.f9479l = c2161a;
        this.f9468a = aVar;
        this.f9469b = interfaceC1266x;
        this.f9470c = mVar;
        this.f9471d = uVar;
        this.f9472e = aVar2;
        this.f9473f = kVar;
        this.f9474g = aVar3;
        this.f9475h = bVar;
        this.f9477j = interfaceC2225j;
        this.f9476i = q(c2161a, uVar, aVar);
        this.f9481n = interfaceC2225j.empty();
    }

    public static l0 q(C2161a c2161a, u uVar, b.a aVar) {
        H[] hArr = new H[c2161a.f19301f.length];
        int i6 = 0;
        while (true) {
            C2161a.b[] bVarArr = c2161a.f19301f;
            if (i6 >= bVarArr.length) {
                return new l0(hArr);
            }
            q[] qVarArr = bVarArr[i6].f19316j;
            q[] qVarArr2 = new q[qVarArr.length];
            for (int i7 = 0; i7 < qVarArr.length; i7++) {
                q qVar = qVarArr[i7];
                qVarArr2[i7] = aVar.c(qVar.a().R(uVar.c(qVar)).K());
            }
            hArr[i6] = new H(Integer.toString(i6), qVarArr2);
            i6++;
        }
    }

    private static C2264h[] u(int i6) {
        return new C2264h[i6];
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public boolean b(C1343l0 c1343l0) {
        return this.f9481n.b(c1343l0);
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public long d() {
        return this.f9481n.d();
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public boolean e() {
        return this.f9481n.e();
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public long f() {
        return this.f9481n.f();
    }

    @Override // w1.InterfaceC2211C
    public long g(long j6, N0 n02) {
        for (C2264h c2264h : this.f9480m) {
            if (c2264h.f20441a == 2) {
                return c2264h.g(j6, n02);
            }
        }
        return j6;
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public void h(long j6) {
        this.f9481n.h(j6);
    }

    @Override // w1.InterfaceC2211C
    public void l() {
        this.f9470c.a();
    }

    @Override // w1.InterfaceC2211C
    public long m(long j6) {
        for (C2264h c2264h : this.f9480m) {
            c2264h.S(j6);
        }
        return j6;
    }

    public final C2264h n(x xVar, long j6) {
        int d6 = this.f9476i.d(xVar.e());
        return new C2264h(this.f9479l.f19301f[d6].f19307a, null, null, this.f9468a.d(this.f9470c, this.f9479l, d6, xVar, this.f9469b, null), this, this.f9475h, j6, this.f9471d, this.f9472e, this.f9473f, this.f9474g);
    }

    @Override // w1.InterfaceC2211C
    public long o(x[] xVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j6) {
        x xVar;
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < xVarArr.length; i6++) {
            b0 b0Var = b0VarArr[i6];
            if (b0Var != null) {
                C2264h c2264h = (C2264h) b0Var;
                if (xVarArr[i6] == null || !zArr[i6]) {
                    c2264h.P();
                    b0VarArr[i6] = null;
                } else {
                    ((b) c2264h.E()).b((x) AbstractC1119a.e(xVarArr[i6]));
                    arrayList.add(c2264h);
                }
            }
            if (b0VarArr[i6] == null && (xVar = xVarArr[i6]) != null) {
                C2264h n6 = n(xVar, j6);
                arrayList.add(n6);
                b0VarArr[i6] = n6;
                zArr2[i6] = true;
            }
        }
        C2264h[] u6 = u(arrayList.size());
        this.f9480m = u6;
        arrayList.toArray(u6);
        this.f9481n = this.f9477j.a(arrayList, G.k(arrayList, new g() { // from class: u1.a
            public final Object apply(Object obj) {
                List y6;
                y6 = w.y(Integer.valueOf(((C2264h) obj).f20441a));
                return y6;
            }
        }));
        return j6;
    }

    @Override // w1.InterfaceC2211C
    public long p() {
        return -9223372036854775807L;
    }

    @Override // w1.InterfaceC2211C
    public l0 r() {
        return this.f9476i;
    }

    @Override // w1.InterfaceC2211C
    public void s(InterfaceC2211C.a aVar, long j6) {
        this.f9478k = aVar;
        aVar.i(this);
    }

    @Override // w1.InterfaceC2211C
    public void t(long j6, boolean z6) {
        for (C2264h c2264h : this.f9480m) {
            c2264h.t(j6, z6);
        }
    }

    @Override // w1.c0.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void j(C2264h c2264h) {
        ((InterfaceC2211C.a) AbstractC1119a.e(this.f9478k)).j(this);
    }

    public void w() {
        for (C2264h c2264h : this.f9480m) {
            c2264h.P();
        }
        this.f9478k = null;
    }

    public void x(C2161a c2161a) {
        this.f9479l = c2161a;
        for (C2264h c2264h : this.f9480m) {
            ((b) c2264h.E()).c(c2161a);
        }
        ((InterfaceC2211C.a) AbstractC1119a.e(this.f9478k)).j(this);
    }
}
