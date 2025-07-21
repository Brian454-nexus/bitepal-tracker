package g1;

import c1.AbstractC1119a;
import c1.AbstractC1133o;
import g1.C1343l0;
import java.io.IOException;
import w1.C2220e;
import w1.C2233s;
import w1.InterfaceC2211C;
import w1.InterfaceC2212D;
import z1.AbstractC2443C;
import z1.C2444D;

/* renamed from: g1.n0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1347n0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2211C f14765a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14766b;

    /* renamed from: c, reason: collision with root package name */
    public final w1.b0[] f14767c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14768d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14769e;

    /* renamed from: f, reason: collision with root package name */
    public C1349o0 f14770f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14771g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f14772h;

    /* renamed from: i, reason: collision with root package name */
    public final K0[] f14773i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC2443C f14774j;

    /* renamed from: k, reason: collision with root package name */
    public final F0 f14775k;

    /* renamed from: l, reason: collision with root package name */
    public C1347n0 f14776l;

    /* renamed from: m, reason: collision with root package name */
    public w1.l0 f14777m;

    /* renamed from: n, reason: collision with root package name */
    public C2444D f14778n;

    /* renamed from: o, reason: collision with root package name */
    public long f14779o;

    /* renamed from: g1.n0$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        C1347n0 a(C1349o0 c1349o0, long j6);
    }

    public C1347n0(K0[] k0Arr, long j6, AbstractC2443C abstractC2443C, A1.b bVar, F0 f02, C1349o0 c1349o0, C2444D c2444d) {
        this.f14773i = k0Arr;
        this.f14779o = j6;
        this.f14774j = abstractC2443C;
        this.f14775k = f02;
        InterfaceC2212D.b bVar2 = c1349o0.f14781a;
        this.f14766b = bVar2.f19753a;
        this.f14770f = c1349o0;
        this.f14777m = w1.l0.f20068d;
        this.f14778n = c2444d;
        this.f14767c = new w1.b0[k0Arr.length];
        this.f14772h = new boolean[k0Arr.length];
        this.f14765a = f(bVar2, f02, bVar, c1349o0.f14782b, c1349o0.f14784d);
    }

    public static InterfaceC2211C f(InterfaceC2212D.b bVar, F0 f02, A1.b bVar2, long j6, long j7) {
        InterfaceC2211C h6 = f02.h(bVar, bVar2, j6);
        return j7 != -9223372036854775807L ? new C2220e(h6, true, 0L, j7) : h6;
    }

    public static void w(F0 f02, InterfaceC2211C interfaceC2211C) {
        try {
            if (interfaceC2211C instanceof C2220e) {
                f02.y(((C2220e) interfaceC2211C).f19965a);
            } else {
                f02.y(interfaceC2211C);
            }
        } catch (RuntimeException e6) {
            AbstractC1133o.d("MediaPeriodHolder", "Period release failed.", e6);
        }
    }

    public long A(long j6) {
        return j6 - m();
    }

    public long B(long j6) {
        return j6 + m();
    }

    public void C() {
        InterfaceC2211C interfaceC2211C = this.f14765a;
        if (interfaceC2211C instanceof C2220e) {
            long j6 = this.f14770f.f14784d;
            if (j6 == -9223372036854775807L) {
                j6 = Long.MIN_VALUE;
            }
            ((C2220e) interfaceC2211C).w(0L, j6);
        }
    }

    public long a(C2444D c2444d, long j6, boolean z6) {
        return b(c2444d, j6, z6, new boolean[this.f14773i.length]);
    }

    public long b(C2444D c2444d, long j6, boolean z6, boolean[] zArr) {
        int i6 = 0;
        while (true) {
            boolean z7 = true;
            if (i6 >= c2444d.f21479a) {
                break;
            }
            boolean[] zArr2 = this.f14772h;
            if (z6 || !c2444d.b(this.f14778n, i6)) {
                z7 = false;
            }
            zArr2[i6] = z7;
            i6++;
        }
        h(this.f14767c);
        g();
        this.f14778n = c2444d;
        i();
        long o6 = this.f14765a.o(c2444d.f21481c, this.f14772h, this.f14767c, zArr, j6);
        c(this.f14767c);
        this.f14769e = false;
        int i7 = 0;
        while (true) {
            w1.b0[] b0VarArr = this.f14767c;
            if (i7 >= b0VarArr.length) {
                return o6;
            }
            if (b0VarArr[i7] != null) {
                AbstractC1119a.g(c2444d.c(i7));
                if (this.f14773i[i7].l() != -2) {
                    this.f14769e = true;
                }
            } else {
                AbstractC1119a.g(c2444d.f21481c[i7] == null);
            }
            i7++;
        }
    }

    public final void c(w1.b0[] b0VarArr) {
        int i6 = 0;
        while (true) {
            K0[] k0Arr = this.f14773i;
            if (i6 >= k0Arr.length) {
                return;
            }
            if (k0Arr[i6].l() == -2 && this.f14778n.c(i6)) {
                b0VarArr[i6] = new C2233s();
            }
            i6++;
        }
    }

    public boolean d(C1349o0 c1349o0) {
        if (!C1353q0.d(this.f14770f.f14785e, c1349o0.f14785e)) {
            return false;
        }
        C1349o0 c1349o02 = this.f14770f;
        return c1349o02.f14782b == c1349o0.f14782b && c1349o02.f14781a.equals(c1349o0.f14781a);
    }

    public void e(long j6, float f6, long j7) {
        AbstractC1119a.g(t());
        this.f14765a.b(new C1343l0.b().f(A(j6)).g(f6).e(j7).d());
    }

    public final void g() {
        if (!t()) {
            return;
        }
        int i6 = 0;
        while (true) {
            C2444D c2444d = this.f14778n;
            if (i6 >= c2444d.f21479a) {
                return;
            }
            boolean c6 = c2444d.c(i6);
            z1.x xVar = this.f14778n.f21481c[i6];
            if (c6 && xVar != null) {
                xVar.j();
            }
            i6++;
        }
    }

    public final void h(w1.b0[] b0VarArr) {
        int i6 = 0;
        while (true) {
            K0[] k0Arr = this.f14773i;
            if (i6 >= k0Arr.length) {
                return;
            }
            if (k0Arr[i6].l() == -2) {
                b0VarArr[i6] = null;
            }
            i6++;
        }
    }

    public final void i() {
        if (!t()) {
            return;
        }
        int i6 = 0;
        while (true) {
            C2444D c2444d = this.f14778n;
            if (i6 >= c2444d.f21479a) {
                return;
            }
            boolean c6 = c2444d.c(i6);
            z1.x xVar = this.f14778n.f21481c[i6];
            if (c6 && xVar != null) {
                xVar.i();
            }
            i6++;
        }
    }

    public long j() {
        if (!this.f14768d) {
            return this.f14770f.f14782b;
        }
        long f6 = this.f14769e ? this.f14765a.f() : Long.MIN_VALUE;
        return f6 == Long.MIN_VALUE ? this.f14770f.f14785e : f6;
    }

    public C1347n0 k() {
        return this.f14776l;
    }

    public long l() {
        if (this.f14768d) {
            return this.f14765a.d();
        }
        return 0L;
    }

    public long m() {
        return this.f14779o;
    }

    public long n() {
        return this.f14770f.f14782b + this.f14779o;
    }

    public w1.l0 o() {
        return this.f14777m;
    }

    public C2444D p() {
        return this.f14778n;
    }

    public void q(float f6, Z0.G g6) {
        this.f14768d = true;
        this.f14777m = this.f14765a.r();
        C2444D x6 = x(f6, g6);
        C1349o0 c1349o0 = this.f14770f;
        long j6 = c1349o0.f14782b;
        long j7 = c1349o0.f14785e;
        if (j7 != -9223372036854775807L && j6 >= j7) {
            j6 = Math.max(0L, j7 - 1);
        }
        long a6 = a(x6, j6, false);
        long j8 = this.f14779o;
        C1349o0 c1349o02 = this.f14770f;
        this.f14779o = j8 + (c1349o02.f14782b - a6);
        this.f14770f = c1349o02.b(a6);
    }

    public boolean r() {
        try {
            if (this.f14768d) {
                for (w1.b0 b0Var : this.f14767c) {
                    if (b0Var != null) {
                        b0Var.a();
                    }
                }
            } else {
                this.f14765a.l();
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public boolean s() {
        if (this.f14768d) {
            return !this.f14769e || this.f14765a.f() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean t() {
        return this.f14776l == null;
    }

    public void u(long j6) {
        AbstractC1119a.g(t());
        if (this.f14768d) {
            this.f14765a.h(A(j6));
        }
    }

    public void v() {
        g();
        w(this.f14775k, this.f14765a);
    }

    public C2444D x(float f6, Z0.G g6) {
        C2444D j6 = this.f14774j.j(this.f14773i, o(), this.f14770f.f14781a, g6);
        for (int i6 = 0; i6 < j6.f21479a; i6++) {
            if (j6.c(i6)) {
                if (j6.f21481c[i6] == null && this.f14773i[i6].l() != -2) {
                    r3 = false;
                }
                AbstractC1119a.g(r3);
            } else {
                AbstractC1119a.g(j6.f21481c[i6] == null);
            }
        }
        for (z1.x xVar : j6.f21481c) {
            if (xVar != null) {
                xVar.q(f6);
            }
        }
        return j6;
    }

    public void y(C1347n0 c1347n0) {
        if (c1347n0 == this.f14776l) {
            return;
        }
        g();
        this.f14776l = c1347n0;
        i();
    }

    public void z(long j6) {
        this.f14779o = j6;
    }
}
