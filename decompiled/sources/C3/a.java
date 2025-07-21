package C3;

import java.util.Map;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a extends b {

    /* renamed from: P, reason: collision with root package name */
    public String f663P;

    /* renamed from: Q, reason: collision with root package name */
    public Map f664Q;

    /* renamed from: R, reason: collision with root package name */
    public Map f665R;

    /* renamed from: S, reason: collision with root package name */
    public Map f666S;

    /* renamed from: T, reason: collision with root package name */
    public Map f667T;

    public final Map E0() {
        return this.f664Q;
    }

    public String F0() {
        String str = this.f663P;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventType");
        return null;
    }

    public final Map G0() {
        return this.f667T;
    }

    public final Map H0() {
        return this.f666S;
    }

    public final Map I0() {
        return this.f665R;
    }

    public boolean J0() {
        return (N() == null && l() == null) ? false : true;
    }

    public final void K0(b options) {
        Intrinsics.checkNotNullParameter(options, "options");
        String N5 = options.N();
        if (N5 != null) {
            C0(N5);
        }
        String l6 = options.l();
        if (l6 != null) {
            a0(l6);
        }
        Long M5 = options.M();
        if (M5 != null) {
            B0(Long.valueOf(M5.longValue()));
        }
        Long p6 = options.p();
        if (p6 != null) {
            e0(Long.valueOf(p6.longValue()));
        }
        String u6 = options.u();
        if (u6 != null) {
            j0(u6);
        }
        Double y6 = options.y();
        if (y6 != null) {
            n0(Double.valueOf(y6.doubleValue()));
        }
        Double z6 = options.z();
        if (z6 != null) {
            o0(Double.valueOf(z6.doubleValue()));
        }
        String d6 = options.d();
        if (d6 != null) {
            S(d6);
        }
        String O5 = options.O();
        if (O5 != null) {
            D0(O5);
        }
        String E6 = options.E();
        if (E6 != null) {
            t0(E6);
        }
        String A6 = options.A();
        if (A6 != null) {
            p0(A6);
        }
        String B6 = options.B();
        if (B6 != null) {
            q0(B6);
        }
        String k6 = options.k();
        if (k6 != null) {
            Z(k6);
        }
        String m6 = options.m();
        if (m6 != null) {
            b0(m6);
        }
        String n6 = options.n();
        if (n6 != null) {
            c0(n6);
        }
        String g6 = options.g();
        if (g6 != null) {
            V(g6);
        }
        String i6 = options.i();
        if (i6 != null) {
            X(i6);
        }
        String I6 = options.I();
        if (I6 != null) {
            x0(I6);
        }
        String h6 = options.h();
        if (h6 != null) {
            W(h6);
        }
        String o6 = options.o();
        if (o6 != null) {
            d0(o6);
        }
        String r6 = options.r();
        if (r6 != null) {
            g0(r6);
        }
        String s6 = options.s();
        if (s6 != null) {
            h0(s6);
        }
        String a6 = options.a();
        if (a6 != null) {
            P(a6);
        }
        String c6 = options.c();
        if (c6 != null) {
            R(c6);
        }
        String b6 = options.b();
        if (b6 != null) {
            Q(b6);
        }
        String w6 = options.w();
        if (w6 != null) {
            l0(w6);
        }
        String x6 = options.x();
        if (x6 != null) {
            m0(x6);
        }
        String v6 = options.v();
        if (v6 != null) {
            k0(v6);
        }
        e D6 = options.D();
        if (D6 != null) {
            s0(D6);
        }
        d t6 = options.t();
        if (t6 != null) {
            i0(t6);
        }
        Double J6 = options.J();
        if (J6 != null) {
            y0(Double.valueOf(J6.doubleValue()));
        }
        Double F6 = options.F();
        if (F6 != null) {
            u0(Double.valueOf(F6.doubleValue()));
        }
        Integer H6 = options.H();
        if (H6 != null) {
            w0(Integer.valueOf(H6.intValue()));
        }
        String G6 = options.G();
        if (G6 != null) {
            v0(G6);
        }
        String K5 = options.K();
        if (K5 != null) {
            z0(K5);
        }
        String j6 = options.j();
        if (j6 != null) {
            Y(j6);
        }
        Map q6 = options.q();
        if (q6 != null) {
            f0(q6);
        }
        Function3 f6 = options.f();
        if (f6 != null) {
            U(f6);
        }
        String C6 = options.C();
        if (C6 != null) {
            r0(C6);
        }
        Long L5 = options.L();
        if (L5 != null) {
            A0(Long.valueOf(L5.longValue()));
        }
    }

    public final void L0(Map map) {
        this.f664Q = map;
    }

    public void M0(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f663P = str;
    }

    public final void N0(Map map) {
        this.f667T = map;
    }

    public final void O0(Map map) {
        this.f666S = map;
    }

    public final void P0(Map map) {
        this.f665R = map;
    }
}
