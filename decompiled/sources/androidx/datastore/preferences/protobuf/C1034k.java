package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1034k implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1033j f8794a;

    /* renamed from: androidx.datastore.preferences.protobuf.k$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8795a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f8795a = iArr;
            try {
                iArr[r0.b.f8854j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8795a[r0.b.f8853i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8795a[r0.b.f8851g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8795a[r0.b.f8861q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8795a[r0.b.f8863s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8795a[r0.b.f8859o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8795a[r0.b.f8852h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8795a[r0.b.f8849e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8795a[r0.b.f8862r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8795a[r0.b.f8864t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8795a[r0.b.f8850f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8795a[r0.b.f8855k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C1034k(AbstractC1033j abstractC1033j) {
        AbstractC1033j abstractC1033j2 = (AbstractC1033j) AbstractC1047y.b(abstractC1033j, "output");
        this.f8794a = abstractC1033j2;
        abstractC1033j2.f8786a = this;
    }

    public static C1034k P(AbstractC1033j abstractC1033j) {
        C1034k c1034k = abstractC1033j.f8786a;
        return c1034k != null ? c1034k : new C1034k(abstractC1033j);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void A(int i6, float f6) {
        this.f8794a.o0(i6, f6);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void B(int i6) {
        this.f8794a.M0(i6, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void C(int i6, List list, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < list.size()) {
                this.f8794a.G0(i6, ((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        this.f8794a.M0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += AbstractC1033j.J(((Integer) list.get(i9)).intValue());
        }
        this.f8794a.O0(i8);
        while (i7 < list.size()) {
            this.f8794a.H0(((Integer) list.get(i7)).intValue());
            i7++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void D(int i6, int i7) {
        this.f8794a.i0(i6, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void E(int i6, List list, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < list.size()) {
                this.f8794a.w0(i6, ((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        this.f8794a.M0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += AbstractC1033j.x(((Long) list.get(i9)).longValue());
        }
        this.f8794a.O0(i8);
        while (i7 < list.size()) {
            this.f8794a.x0(((Long) list.get(i7)).longValue());
            i7++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void F(int i6, List list, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < list.size()) {
                this.f8794a.i0(i6, ((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        this.f8794a.M0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += AbstractC1033j.k(((Integer) list.get(i9)).intValue());
        }
        this.f8794a.O0(i8);
        while (i7 < list.size()) {
            this.f8794a.j0(((Integer) list.get(i7)).intValue());
            i7++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void G(int i6, List list, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < list.size()) {
                this.f8794a.g0(i6, ((Double) list.get(i7)).doubleValue());
                i7++;
            }
            return;
        }
        this.f8794a.M0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += AbstractC1033j.i(((Double) list.get(i9)).doubleValue());
        }
        this.f8794a.O0(i8);
        while (i7 < list.size()) {
            this.f8794a.h0(((Double) list.get(i7)).doubleValue());
            i7++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void H(int i6, int i7) {
        this.f8794a.G0(i6, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void I(int i6, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            this.f8794a.e0(i6, (AbstractC1030g) list.get(i7));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void J(int i6, List list, e0 e0Var) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            M(i6, list.get(i7), e0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void K(int i6, List list, e0 e0Var) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            O(i6, list.get(i7), e0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void L(int i6, AbstractC1030g abstractC1030g) {
        this.f8794a.e0(i6, abstractC1030g);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void M(int i6, Object obj, e0 e0Var) {
        this.f8794a.y0(i6, (O) obj, e0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void N(int i6, H.a aVar, Map map) {
        if (this.f8794a.X()) {
            T(i6, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f8794a.M0(i6, 2);
            this.f8794a.O0(H.b(aVar, entry.getKey(), entry.getValue()));
            H.e(this.f8794a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void O(int i6, Object obj, e0 e0Var) {
        this.f8794a.r0(i6, (O) obj, e0Var);
    }

    public final void Q(int i6, boolean z6, Object obj, H.a aVar) {
        this.f8794a.M0(i6, 2);
        this.f8794a.O0(H.b(aVar, Boolean.valueOf(z6), obj));
        H.e(this.f8794a, aVar, Boolean.valueOf(z6), obj);
    }

    public final void R(int i6, H.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            iArr[i7] = ((Integer) it.next()).intValue();
            i7++;
        }
        Arrays.sort(iArr);
        for (int i8 = 0; i8 < size; i8++) {
            int i9 = iArr[i8];
            Object obj = map.get(Integer.valueOf(i9));
            this.f8794a.M0(i6, 2);
            this.f8794a.O0(H.b(aVar, Integer.valueOf(i9), obj));
            H.e(this.f8794a, aVar, Integer.valueOf(i9), obj);
        }
    }

    public final void S(int i6, H.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            jArr[i7] = ((Long) it.next()).longValue();
            i7++;
        }
        Arrays.sort(jArr);
        for (int i8 = 0; i8 < size; i8++) {
            long j6 = jArr[i8];
            Object obj = map.get(Long.valueOf(j6));
            this.f8794a.M0(i6, 2);
            this.f8794a.O0(H.b(aVar, Long.valueOf(j6), obj));
            H.e(this.f8794a, aVar, Long.valueOf(j6), obj);
        }
    }

    public final void T(int i6, H.a aVar, Map map) {
        switch (a.f8795a[aVar.f8669a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    Q(i6, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    Q(i6, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i6, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i6, aVar, map);
                return;
            case 12:
                U(i6, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f8669a);
        }
    }

    public final void U(int i6, H.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            strArr[i7] = (String) it.next();
            i7++;
        }
        Arrays.sort(strArr);
        for (int i8 = 0; i8 < size; i8++) {
            String str = strArr[i8];
            Object obj = map.get(str);
            this.f8794a.M0(i6, 2);
            this.f8794a.O0(H.b(aVar, str, obj));
            H.e(this.f8794a, aVar, str, obj);
        }
    }

    public final void V(int i6, Object obj) {
        if (obj instanceof String) {
            this.f8794a.K0(i6, (String) obj);
        } else {
            this.f8794a.e0(i6, (AbstractC1030g) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void a(int i6, List list, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < list.size()) {
                this.f8794a.o0(i6, ((Float) list.get(i7)).floatValue());
                i7++;
            }
            return;
        }
        this.f8794a.M0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += AbstractC1033j.q(((Float) list.get(i9)).floatValue());
        }
        this.f8794a.O0(i8);
        while (i7 < list.size()) {
            this.f8794a.p0(((Float) list.get(i7)).floatValue());
            i7++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void b(int i6, int i7) {
        this.f8794a.N0(i6, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final void c(int i6, Object obj) {
        if (obj instanceof AbstractC1030g) {
            this.f8794a.B0(i6, (AbstractC1030g) obj);
        } else {
            this.f8794a.A0(i6, (O) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void d(int i6, int i7) {
        this.f8794a.k0(i6, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void e(int i6, double d6) {
        this.f8794a.g0(i6, d6);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void f(int i6, List list, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < list.size()) {
                this.f8794a.E0(i6, ((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        this.f8794a.M0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += AbstractC1033j.H(((Long) list.get(i9)).longValue());
        }
        this.f8794a.O0(i8);
        while (i7 < list.size()) {
            this.f8794a.F0(((Long) list.get(i7)).longValue());
            i7++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void g(int i6, List list, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < list.size()) {
                this.f8794a.P0(i6, ((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        this.f8794a.M0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += AbstractC1033j.S(((Long) list.get(i9)).longValue());
        }
        this.f8794a.O0(i8);
        while (i7 < list.size()) {
            this.f8794a.Q0(((Long) list.get(i7)).longValue());
            i7++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void h(int i6, long j6) {
        this.f8794a.m0(i6, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public s0.a i() {
        return s0.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void j(int i6, List list) {
        int i7 = 0;
        if (!(list instanceof D)) {
            while (i7 < list.size()) {
                this.f8794a.K0(i6, (String) list.get(i7));
                i7++;
            }
        } else {
            D d6 = (D) list;
            while (i7 < list.size()) {
                V(i6, d6.f(i7));
                i7++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void k(int i6, String str) {
        this.f8794a.K0(i6, str);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void l(int i6, long j6) {
        this.f8794a.P0(i6, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void m(int i6, List list, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < list.size()) {
                this.f8794a.u0(i6, ((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        this.f8794a.M0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += AbstractC1033j.v(((Integer) list.get(i9)).intValue());
        }
        this.f8794a.O0(i8);
        while (i7 < list.size()) {
            this.f8794a.v0(((Integer) list.get(i7)).intValue());
            i7++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void n(int i6, long j6) {
        this.f8794a.w0(i6, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void o(int i6, boolean z6) {
        this.f8794a.a0(i6, z6);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void p(int i6, int i7) {
        this.f8794a.C0(i6, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void q(int i6) {
        this.f8794a.M0(i6, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void r(int i6, int i7) {
        this.f8794a.u0(i6, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void s(int i6, List list, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < list.size()) {
                this.f8794a.m0(i6, ((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        this.f8794a.M0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += AbstractC1033j.o(((Long) list.get(i9)).longValue());
        }
        this.f8794a.O0(i8);
        while (i7 < list.size()) {
            this.f8794a.n0(((Long) list.get(i7)).longValue());
            i7++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void t(int i6, List list, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < list.size()) {
                this.f8794a.C0(i6, ((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        this.f8794a.M0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += AbstractC1033j.F(((Integer) list.get(i9)).intValue());
        }
        this.f8794a.O0(i8);
        while (i7 < list.size()) {
            this.f8794a.D0(((Integer) list.get(i7)).intValue());
            i7++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void u(int i6, long j6) {
        this.f8794a.E0(i6, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void v(int i6, List list, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < list.size()) {
                this.f8794a.k0(i6, ((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        this.f8794a.M0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += AbstractC1033j.m(((Integer) list.get(i9)).intValue());
        }
        this.f8794a.O0(i8);
        while (i7 < list.size()) {
            this.f8794a.l0(((Integer) list.get(i7)).intValue());
            i7++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void w(int i6, List list, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < list.size()) {
                this.f8794a.a0(i6, ((Boolean) list.get(i7)).booleanValue());
                i7++;
            }
            return;
        }
        this.f8794a.M0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += AbstractC1033j.d(((Boolean) list.get(i9)).booleanValue());
        }
        this.f8794a.O0(i8);
        while (i7 < list.size()) {
            this.f8794a.b0(((Boolean) list.get(i7)).booleanValue());
            i7++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void x(int i6, List list, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < list.size()) {
                this.f8794a.N0(i6, ((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        this.f8794a.M0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += AbstractC1033j.Q(((Integer) list.get(i9)).intValue());
        }
        this.f8794a.O0(i8);
        while (i7 < list.size()) {
            this.f8794a.O0(((Integer) list.get(i7)).intValue());
            i7++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void y(int i6, List list, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < list.size()) {
                this.f8794a.I0(i6, ((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        this.f8794a.M0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += AbstractC1033j.L(((Long) list.get(i9)).longValue());
        }
        this.f8794a.O0(i8);
        while (i7 < list.size()) {
            this.f8794a.J0(((Long) list.get(i7)).longValue());
            i7++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void z(int i6, long j6) {
        this.f8794a.I0(i6, j6);
    }
}
