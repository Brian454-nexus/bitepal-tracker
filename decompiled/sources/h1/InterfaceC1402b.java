package h1;

import Z0.C;
import Z0.C0830b;
import Z0.C0840l;
import android.util.SparseArray;
import c1.AbstractC1119a;
import g1.C1330f;
import g1.C1332g;
import i1.InterfaceC1507y;
import java.io.IOException;
import java.util.List;
import w1.C2210B;
import w1.C2239y;
import w1.InterfaceC2212D;

/* renamed from: h1.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC1402b {

    /* renamed from: h1.b$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f15059a;

        /* renamed from: b, reason: collision with root package name */
        public final Z0.G f15060b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15061c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC2212D.b f15062d;

        /* renamed from: e, reason: collision with root package name */
        public final long f15063e;

        /* renamed from: f, reason: collision with root package name */
        public final Z0.G f15064f;

        /* renamed from: g, reason: collision with root package name */
        public final int f15065g;

        /* renamed from: h, reason: collision with root package name */
        public final InterfaceC2212D.b f15066h;

        /* renamed from: i, reason: collision with root package name */
        public final long f15067i;

        /* renamed from: j, reason: collision with root package name */
        public final long f15068j;

        public a(long j6, Z0.G g6, int i6, InterfaceC2212D.b bVar, long j7, Z0.G g7, int i7, InterfaceC2212D.b bVar2, long j8, long j9) {
            this.f15059a = j6;
            this.f15060b = g6;
            this.f15061c = i6;
            this.f15062d = bVar;
            this.f15063e = j7;
            this.f15064f = g7;
            this.f15065g = i7;
            this.f15066h = bVar2;
            this.f15067i = j8;
            this.f15068j = j9;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f15059a == aVar.f15059a && this.f15061c == aVar.f15061c && this.f15063e == aVar.f15063e && this.f15065g == aVar.f15065g && this.f15067i == aVar.f15067i && this.f15068j == aVar.f15068j && y6.k.a(this.f15060b, aVar.f15060b) && y6.k.a(this.f15062d, aVar.f15062d) && y6.k.a(this.f15064f, aVar.f15064f) && y6.k.a(this.f15066h, aVar.f15066h)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return y6.k.b(new Object[]{Long.valueOf(this.f15059a), this.f15060b, Integer.valueOf(this.f15061c), this.f15062d, Long.valueOf(this.f15063e), this.f15064f, Integer.valueOf(this.f15065g), this.f15066h, Long.valueOf(this.f15067i), Long.valueOf(this.f15068j)});
        }
    }

    /* renamed from: h1.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0203b {

        /* renamed from: a, reason: collision with root package name */
        public final Z0.p f15069a;

        /* renamed from: b, reason: collision with root package name */
        public final SparseArray f15070b;

        public C0203b(Z0.p pVar, SparseArray sparseArray) {
            this.f15069a = pVar;
            SparseArray sparseArray2 = new SparseArray(pVar.c());
            for (int i6 = 0; i6 < pVar.c(); i6++) {
                int b6 = pVar.b(i6);
                sparseArray2.append(b6, (a) AbstractC1119a.e((a) sparseArray.get(b6)));
            }
            this.f15070b = sparseArray2;
        }

        public boolean a(int i6) {
            return this.f15069a.a(i6);
        }

        public int b(int i6) {
            return this.f15069a.b(i6);
        }

        public a c(int i6) {
            return (a) AbstractC1119a.e((a) this.f15070b.get(i6));
        }

        public int d() {
            return this.f15069a.c();
        }
    }

    void A(a aVar, C1330f c1330f);

    default void B(a aVar) {
    }

    default void C(a aVar, C2239y c2239y, C2210B c2210b) {
    }

    void D(Z0.C c6, C0203b c0203b);

    default void E(a aVar) {
    }

    default void F(a aVar, Exception exc) {
    }

    default void G(a aVar, int i6) {
    }

    default void H(a aVar, Z0.w wVar) {
    }

    void J(a aVar, Z0.A a6);

    default void K(a aVar, Exception exc) {
    }

    void M(a aVar, Z0.N n6);

    default void N(a aVar, Z0.q qVar, C1332g c1332g) {
    }

    default void O(a aVar, Z0.A a6) {
    }

    default void P(a aVar, int i6) {
    }

    default void Q(a aVar, C0830b c0830b) {
    }

    default void R(a aVar, boolean z6) {
    }

    default void S(a aVar, Z0.J j6) {
    }

    default void T(a aVar, List list) {
    }

    default void U(a aVar, C1330f c1330f) {
    }

    default void V(a aVar, InterfaceC1507y.a aVar2) {
    }

    default void W(a aVar, Z0.x xVar) {
    }

    default void X(a aVar, Exception exc) {
    }

    default void Y(a aVar, long j6, int i6) {
    }

    default void Z(a aVar, int i6) {
    }

    default void a(a aVar) {
    }

    default void a0(a aVar, int i6, int i7, int i8, float f6) {
    }

    default void b(a aVar, int i6, int i7) {
    }

    default void b0(a aVar, C2210B c2210b) {
    }

    default void c(a aVar, String str, long j6, long j7) {
    }

    default void c0(a aVar, C2239y c2239y, C2210B c2210b) {
    }

    default void d(a aVar) {
    }

    default void d0(a aVar, int i6, boolean z6) {
    }

    default void e(a aVar) {
    }

    void e0(a aVar, C.e eVar, C.e eVar2, int i6);

    default void f(a aVar, boolean z6, int i6) {
    }

    default void f0(a aVar, String str) {
    }

    default void g(a aVar, b1.b bVar) {
    }

    default void g0(a aVar, boolean z6, int i6) {
    }

    default void h(a aVar, C0840l c0840l) {
    }

    default void h0(a aVar, Z0.B b6) {
    }

    default void i(a aVar, int i6, long j6) {
    }

    default void i0(a aVar, String str, long j6, long j7) {
    }

    default void j(a aVar, Z0.u uVar, int i6) {
    }

    default void j0(a aVar, String str, long j6) {
    }

    default void k(a aVar, float f6) {
    }

    default void k0(a aVar, InterfaceC1507y.a aVar2) {
    }

    void l0(a aVar, C2239y c2239y, C2210B c2210b, IOException iOException, boolean z6);

    default void m(a aVar, Exception exc) {
    }

    default void m0(a aVar, C1330f c1330f) {
    }

    default void n(a aVar, int i6, long j6, long j7) {
    }

    default void n0(a aVar, C.b bVar) {
    }

    default void o0(a aVar, boolean z6) {
    }

    default void p(a aVar, int i6) {
    }

    default void p0(a aVar, boolean z6) {
    }

    default void q(a aVar, String str) {
    }

    default void q0(a aVar) {
    }

    default void r(a aVar, C2239y c2239y, C2210B c2210b) {
    }

    default void r0(a aVar, String str, long j6) {
    }

    default void s(a aVar, int i6) {
    }

    default void s0(a aVar, boolean z6) {
    }

    default void t(a aVar) {
    }

    default void t0(a aVar, int i6) {
    }

    default void u(a aVar, Z0.q qVar, C1332g c1332g) {
    }

    void v(a aVar, int i6, long j6, long j7);

    void w(a aVar, C2210B c2210b);

    default void x(a aVar, Object obj, long j6) {
    }

    default void y(a aVar, C1330f c1330f) {
    }

    default void z(a aVar, long j6) {
    }
}
