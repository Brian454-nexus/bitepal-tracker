package w1;

import android.os.Handler;
import b2.s;
import e1.InterfaceC1266x;
import h1.v1;

/* renamed from: w1.D, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC2212D {

    /* renamed from: w1.D$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f19752a = L.f19788b;

        default a a(s.a aVar) {
            return this;
        }

        default a b(boolean z6) {
            return this;
        }

        a c(A1.k kVar);

        InterfaceC2212D d(Z0.u uVar);

        a e(l1.w wVar);
    }

    /* renamed from: w1.D$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Object f19753a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19754b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19755c;

        /* renamed from: d, reason: collision with root package name */
        public final long f19756d;

        /* renamed from: e, reason: collision with root package name */
        public final int f19757e;

        public b(Object obj) {
            this(obj, -1L);
        }

        public b a(Object obj) {
            return this.f19753a.equals(obj) ? this : new b(obj, this.f19754b, this.f19755c, this.f19756d, this.f19757e);
        }

        public boolean b() {
            return this.f19754b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f19753a.equals(bVar.f19753a) && this.f19754b == bVar.f19754b && this.f19755c == bVar.f19755c && this.f19756d == bVar.f19756d && this.f19757e == bVar.f19757e;
        }

        public int hashCode() {
            return ((((((((527 + this.f19753a.hashCode()) * 31) + this.f19754b) * 31) + this.f19755c) * 31) + ((int) this.f19756d)) * 31) + this.f19757e;
        }

        public b(Object obj, long j6) {
            this(obj, -1, -1, j6, -1);
        }

        public b(Object obj, long j6, int i6) {
            this(obj, -1, -1, j6, i6);
        }

        public b(Object obj, int i6, int i7, long j6) {
            this(obj, i6, i7, j6, -1);
        }

        public b(Object obj, int i6, int i7, long j6, int i8) {
            this.f19753a = obj;
            this.f19754b = i6;
            this.f19755c = i7;
            this.f19756d = j6;
            this.f19757e = i8;
        }
    }

    /* renamed from: w1.D$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        void a(InterfaceC2212D interfaceC2212D, Z0.G g6);
    }

    void a(c cVar, InterfaceC1266x interfaceC1266x, v1 v1Var);

    void b(c cVar);

    void c(Handler handler, K k6);

    InterfaceC2211C d(b bVar, A1.b bVar2, long j6);

    void f(K k6);

    Z0.u g();

    void h(c cVar);

    void i(c cVar);

    void l();

    default boolean m() {
        return true;
    }

    void n(l1.t tVar);

    default Z0.G o() {
        return null;
    }

    void p(Handler handler, l1.t tVar);

    void r(InterfaceC2211C interfaceC2211C);

    default void s(Z0.u uVar) {
    }
}
