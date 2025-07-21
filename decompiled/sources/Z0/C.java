package Z0;

import Z0.p;
import android.view.Surface;
import c1.AbstractC1117K;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface C {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f6623b = new a().e();

        /* renamed from: c, reason: collision with root package name */
        public static final String f6624c = AbstractC1117K.x0(0);

        /* renamed from: a, reason: collision with root package name */
        public final p f6625a;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public static final int[] f6626b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

            /* renamed from: a, reason: collision with root package name */
            public final p.b f6627a = new p.b();

            public a a(int i6) {
                this.f6627a.a(i6);
                return this;
            }

            public a b(b bVar) {
                this.f6627a.b(bVar.f6625a);
                return this;
            }

            public a c(int... iArr) {
                this.f6627a.c(iArr);
                return this;
            }

            public a d(int i6, boolean z6) {
                this.f6627a.d(i6, z6);
                return this;
            }

            public b e() {
                return new b(this.f6627a.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f6625a.equals(((b) obj).f6625a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6625a.hashCode();
        }

        public b(p pVar) {
            this.f6625a = pVar;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final p f6628a;

        public c(p pVar) {
            this.f6628a = pVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f6628a.equals(((c) obj).f6628a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6628a.hashCode();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface d {
        default void A(int i6) {
        }

        default void B(boolean z6) {
        }

        default void C(int i6) {
        }

        default void D(e eVar, e eVar2, int i6) {
        }

        default void E(C0830b c0830b) {
        }

        default void G(boolean z6) {
        }

        void I(A a6);

        default void J(float f6) {
        }

        void K(int i6);

        default void L(u uVar, int i6) {
        }

        default void Q(C0840l c0840l) {
        }

        default void S(int i6, boolean z6) {
        }

        default void T(boolean z6, int i6) {
        }

        default void Y(int i6) {
        }

        default void a(N n6) {
        }

        default void a0(C c6, c cVar) {
        }

        default void b0() {
        }

        default void c(boolean z6) {
        }

        default void f0(J j6) {
        }

        default void h0(G g6, int i6) {
        }

        default void i(b1.b bVar) {
        }

        default void i0(b bVar) {
        }

        default void j0(boolean z6, int i6) {
        }

        default void k0(w wVar) {
        }

        default void m(B b6) {
        }

        default void m0(int i6, int i7) {
        }

        default void n0(A a6) {
        }

        void p0(boolean z6);

        default void q(List list) {
        }

        default void x(x xVar) {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e {

        /* renamed from: k, reason: collision with root package name */
        public static final String f6629k = AbstractC1117K.x0(0);

        /* renamed from: l, reason: collision with root package name */
        public static final String f6630l = AbstractC1117K.x0(1);

        /* renamed from: m, reason: collision with root package name */
        public static final String f6631m = AbstractC1117K.x0(2);

        /* renamed from: n, reason: collision with root package name */
        public static final String f6632n = AbstractC1117K.x0(3);

        /* renamed from: o, reason: collision with root package name */
        public static final String f6633o = AbstractC1117K.x0(4);

        /* renamed from: p, reason: collision with root package name */
        public static final String f6634p = AbstractC1117K.x0(5);

        /* renamed from: q, reason: collision with root package name */
        public static final String f6635q = AbstractC1117K.x0(6);

        /* renamed from: a, reason: collision with root package name */
        public final Object f6636a;

        /* renamed from: b, reason: collision with root package name */
        public final int f6637b;

        /* renamed from: c, reason: collision with root package name */
        public final int f6638c;

        /* renamed from: d, reason: collision with root package name */
        public final u f6639d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f6640e;

        /* renamed from: f, reason: collision with root package name */
        public final int f6641f;

        /* renamed from: g, reason: collision with root package name */
        public final long f6642g;

        /* renamed from: h, reason: collision with root package name */
        public final long f6643h;

        /* renamed from: i, reason: collision with root package name */
        public final int f6644i;

        /* renamed from: j, reason: collision with root package name */
        public final int f6645j;

        public e(Object obj, int i6, u uVar, Object obj2, int i7, long j6, long j7, int i8, int i9) {
            this.f6636a = obj;
            this.f6637b = i6;
            this.f6638c = i6;
            this.f6639d = uVar;
            this.f6640e = obj2;
            this.f6641f = i7;
            this.f6642g = j6;
            this.f6643h = j7;
            this.f6644i = i8;
            this.f6645j = i9;
        }

        public boolean a(e eVar) {
            return this.f6638c == eVar.f6638c && this.f6641f == eVar.f6641f && this.f6642g == eVar.f6642g && this.f6643h == eVar.f6643h && this.f6644i == eVar.f6644i && this.f6645j == eVar.f6645j && y6.k.a(this.f6639d, eVar.f6639d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (a(eVar) && y6.k.a(this.f6636a, eVar.f6636a) && y6.k.a(this.f6640e, eVar.f6640e)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return y6.k.b(new Object[]{this.f6636a, Integer.valueOf(this.f6638c), this.f6639d, this.f6640e, Integer.valueOf(this.f6641f), Long.valueOf(this.f6642g), Long.valueOf(this.f6643h), Integer.valueOf(this.f6644i), Integer.valueOf(this.f6645j)});
        }
    }

    long A();

    long B();

    boolean C();

    int D();

    J E();

    boolean F();

    int G();

    int H();

    void I(int i6);

    boolean J();

    int K();

    int L();

    long M();

    G N();

    boolean O();

    long P();

    void Q(u uVar);

    boolean R();

    void c();

    void e(B b6);

    B g();

    void h();

    void i(float f6);

    void j();

    void k(Surface surface);

    boolean l();

    long m();

    boolean n();

    void o(C0830b c0830b, boolean z6);

    int p();

    N q();

    void r(d dVar);

    float s();

    void t();

    void u(List list, boolean z6);

    boolean v();

    int w();

    void x(long j6);

    A y();

    void z(boolean z6);
}
