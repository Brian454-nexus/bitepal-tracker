package F;

import I.C0464y0;
import I.InterfaceC0441m0;
import I.L0;
import I.O0;
import I.P;
import I.Y0;
import I.Z0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class I0 {

    /* renamed from: d, reason: collision with root package name */
    public Y0 f1296d;

    /* renamed from: e, reason: collision with root package name */
    public Y0 f1297e;

    /* renamed from: f, reason: collision with root package name */
    public Y0 f1298f;

    /* renamed from: g, reason: collision with root package name */
    public O0 f1299g;

    /* renamed from: h, reason: collision with root package name */
    public Y0 f1300h;

    /* renamed from: i, reason: collision with root package name */
    public Rect f1301i;

    /* renamed from: k, reason: collision with root package name */
    public I.E f1303k;

    /* renamed from: a, reason: collision with root package name */
    public final Set f1293a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Object f1294b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public c f1295c = c.INACTIVE;

    /* renamed from: j, reason: collision with root package name */
    public Matrix f1302j = new Matrix();

    /* renamed from: l, reason: collision with root package name */
    public L0 f1304l = L0.a();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1305a;

        static {
            int[] iArr = new int[c.values().length];
            f1305a = iArr;
            try {
                iArr[c.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1305a[c.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum c {
        ACTIVE,
        INACTIVE
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface d {
        void c(I0 i02);

        void f(I0 i02);

        void i(I0 i02);

        void l(I0 i02);
    }

    public I0(Y0 y02) {
        this.f1297e = y02;
        this.f1298f = y02;
    }

    public boolean A(I.E e6) {
        int n6 = n();
        if (n6 == 0) {
            return false;
        }
        if (n6 == 1) {
            return true;
        }
        if (n6 == 2) {
            return e6.d();
        }
        throw new AssertionError("Unknown mirrorMode: " + n6);
    }

    public Y0 B(I.D d6, Y0 y02, Y0 y03) {
        C0464y0 a02;
        if (y03 != null) {
            a02 = C0464y0.b0(y03);
            a02.c0(O.j.f3871C);
        } else {
            a02 = C0464y0.a0();
        }
        if (this.f1297e.h(InterfaceC0441m0.f2503h) || this.f1297e.h(InterfaceC0441m0.f2507l)) {
            P.a aVar = InterfaceC0441m0.f2511p;
            if (a02.h(aVar)) {
                a02.c0(aVar);
            }
        }
        Y0 y04 = this.f1297e;
        P.a aVar2 = InterfaceC0441m0.f2511p;
        if (y04.h(aVar2)) {
            P.a aVar3 = InterfaceC0441m0.f2509n;
            if (a02.h(aVar3) && ((U.c) this.f1297e.b(aVar2)).d() != null) {
                a02.c0(aVar3);
            }
        }
        Iterator it = this.f1297e.c().iterator();
        while (it.hasNext()) {
            I.P.r(a02, a02, this.f1297e, (P.a) it.next());
        }
        if (y02 != null) {
            for (P.a aVar4 : y02.c()) {
                if (!aVar4.c().equals(O.j.f3871C.c())) {
                    I.P.r(a02, a02, y02, aVar4);
                }
            }
        }
        if (a02.h(InterfaceC0441m0.f2507l)) {
            P.a aVar5 = InterfaceC0441m0.f2503h;
            if (a02.h(aVar5)) {
                a02.c0(aVar5);
            }
        }
        P.a aVar6 = InterfaceC0441m0.f2511p;
        if (a02.h(aVar6) && ((U.c) a02.b(aVar6)).a() != 0) {
            a02.H(Y0.f2399y, Boolean.TRUE);
        }
        return J(d6, w(a02));
    }

    public final void C() {
        this.f1295c = c.ACTIVE;
        F();
    }

    public final void D() {
        this.f1295c = c.INACTIVE;
        F();
    }

    public final void E() {
        Iterator it = this.f1293a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).f(this);
        }
    }

    public final void F() {
        int i6 = a.f1305a[this.f1295c.ordinal()];
        if (i6 == 1) {
            Iterator it = this.f1293a.iterator();
            while (it.hasNext()) {
                ((d) it.next()).l(this);
            }
        } else {
            if (i6 != 2) {
                return;
            }
            Iterator it2 = this.f1293a.iterator();
            while (it2.hasNext()) {
                ((d) it2.next()).c(this);
            }
        }
    }

    public final void G() {
        Iterator it = this.f1293a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).i(this);
        }
    }

    public void H() {
    }

    public void I() {
    }

    public abstract Y0 J(I.D d6, Y0.a aVar);

    public void K() {
    }

    public void L() {
    }

    public abstract O0 M(I.P p6);

    public abstract O0 N(O0 o02);

    public void O() {
    }

    public final void P(d dVar) {
        this.f1293a.remove(dVar);
    }

    public void Q(AbstractC0342n abstractC0342n) {
        y0.g.a(true);
    }

    public void R(Matrix matrix) {
        this.f1302j = new Matrix(matrix);
    }

    public boolean S(int i6) {
        int V5 = ((InterfaceC0441m0) j()).V(-1);
        if (V5 != -1 && V5 == i6) {
            return false;
        }
        Y0.a w6 = w(this.f1297e);
        S.e.a(w6, i6);
        this.f1297e = w6.c();
        I.E g6 = g();
        if (g6 == null) {
            this.f1298f = this.f1297e;
            return true;
        }
        this.f1298f = B(g6.n(), this.f1296d, this.f1300h);
        return true;
    }

    public void T(Rect rect) {
        this.f1301i = rect;
    }

    public final void U(I.E e6) {
        O();
        this.f1298f.D(null);
        synchronized (this.f1294b) {
            y0.g.a(e6 == this.f1303k);
            P(this.f1303k);
            this.f1303k = null;
        }
        this.f1299g = null;
        this.f1301i = null;
        this.f1298f = this.f1297e;
        this.f1296d = null;
        this.f1300h = null;
    }

    public void V(L0 l02) {
        this.f1304l = l02;
        for (I.W w6 : l02.k()) {
            if (w6.g() == null) {
                w6.p(getClass());
            }
        }
    }

    public void W(O0 o02) {
        this.f1299g = N(o02);
    }

    public void X(I.P p6) {
        this.f1299g = M(p6);
    }

    public final void a(d dVar) {
        this.f1293a.add(dVar);
    }

    public final void b(I.E e6, Y0 y02, Y0 y03) {
        synchronized (this.f1294b) {
            this.f1303k = e6;
            a(e6);
        }
        this.f1296d = y02;
        this.f1300h = y03;
        Y0 B6 = B(e6.n(), this.f1296d, this.f1300h);
        this.f1298f = B6;
        B6.D(null);
        H();
    }

    public Y0 c() {
        return this.f1297e;
    }

    public int d() {
        return ((InterfaceC0441m0) this.f1298f).B(-1);
    }

    public O0 e() {
        return this.f1299g;
    }

    public Size f() {
        O0 o02 = this.f1299g;
        if (o02 != null) {
            return o02.e();
        }
        return null;
    }

    public I.E g() {
        I.E e6;
        synchronized (this.f1294b) {
            e6 = this.f1303k;
        }
        return e6;
    }

    public I.A h() {
        synchronized (this.f1294b) {
            try {
                I.E e6 = this.f1303k;
                if (e6 == null) {
                    return I.A.f2232a;
                }
                return e6.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String i() {
        return ((I.E) y0.g.g(g(), "No camera attached to use case: " + this)).n().d();
    }

    public Y0 j() {
        return this.f1298f;
    }

    public abstract Y0 k(boolean z6, Z0 z02);

    public AbstractC0342n l() {
        return null;
    }

    public int m() {
        return this.f1298f.q();
    }

    public int n() {
        return ((InterfaceC0441m0) this.f1298f).W(0);
    }

    public String o() {
        String C6 = this.f1298f.C("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(C6);
        return C6;
    }

    public int p(I.E e6) {
        return q(e6, false);
    }

    public int q(I.E e6, boolean z6) {
        int j6 = e6.n().j(v());
        return (e6.m() || !z6) ? j6 : L.q.r(-j6);
    }

    public r0 r() {
        I.E g6 = g();
        Size f6 = f();
        if (g6 == null || f6 == null) {
            return null;
        }
        Rect x6 = x();
        if (x6 == null) {
            x6 = new Rect(0, 0, f6.getWidth(), f6.getHeight());
        }
        return new r0(f6, x6, p(g6));
    }

    public Matrix s() {
        return this.f1302j;
    }

    public L0 t() {
        return this.f1304l;
    }

    public Set u() {
        return Collections.EMPTY_SET;
    }

    public int v() {
        return ((InterfaceC0441m0) this.f1298f).V(0);
    }

    public abstract Y0.a w(I.P p6);

    public Rect x() {
        return this.f1301i;
    }

    public boolean y(String str) {
        if (g() == null) {
            return false;
        }
        return Objects.equals(str, i());
    }

    public boolean z(int i6) {
        Iterator it = u().iterator();
        while (it.hasNext()) {
            if (T.V.a(i6, ((Integer) it.next()).intValue())) {
                return true;
            }
        }
        return false;
    }
}
