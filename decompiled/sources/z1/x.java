package z1;

import Z0.G;
import Z0.H;
import c1.AbstractC1133o;
import java.util.List;
import w1.InterfaceC2212D;
import x1.AbstractC2261e;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface x extends InterfaceC2441A {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final H f21647a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f21648b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21649c;

        public a(H h6, int... iArr) {
            this(h6, iArr, 0);
        }

        public a(H h6, int[] iArr, int i6) {
            if (iArr.length == 0) {
                AbstractC1133o.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f21647a = h6;
            this.f21648b = iArr;
            this.f21649c = i6;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        x[] a(a[] aVarArr, A1.d dVar, InterfaceC2212D.b bVar, G g6);
    }

    void a(long j6, long j7, long j8, List list, x1.n[] nVarArr);

    boolean b(int i6, long j6);

    default boolean d(long j6, AbstractC2261e abstractC2261e, List list) {
        return false;
    }

    int f();

    default void g(boolean z6) {
    }

    void i();

    void j();

    int l(long j6, List list);

    int m();

    Z0.q n();

    int o();

    boolean p(int i6, long j6);

    void q(float f6);

    Object r();

    default void s() {
    }

    default void t() {
    }
}
