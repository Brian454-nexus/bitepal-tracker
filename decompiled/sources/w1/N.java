package w1;

import Z0.q;
import c1.AbstractC1119a;
import g1.C1343l0;
import g1.N0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import w1.InterfaceC2211C;
import x1.AbstractC2261e;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class N implements InterfaceC2211C, InterfaceC2211C.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2211C[] f19789a;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2225j f19791c;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2211C.a f19794f;

    /* renamed from: g, reason: collision with root package name */
    public l0 f19795g;

    /* renamed from: i, reason: collision with root package name */
    public c0 f19797i;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f19792d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f19793e = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final IdentityHashMap f19790b = new IdentityHashMap();

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC2211C[] f19796h = new InterfaceC2211C[0];

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements z1.x {

        /* renamed from: a, reason: collision with root package name */
        public final z1.x f19798a;

        /* renamed from: b, reason: collision with root package name */
        public final Z0.H f19799b;

        public a(z1.x xVar, Z0.H h6) {
            this.f19798a = xVar;
            this.f19799b = h6;
        }

        @Override // z1.x
        public void a(long j6, long j7, long j8, List list, x1.n[] nVarArr) {
            this.f19798a.a(j6, j7, j8, list, nVarArr);
        }

        @Override // z1.x
        public boolean b(int i6, long j6) {
            return this.f19798a.b(i6, j6);
        }

        @Override // z1.InterfaceC2441A
        public int c(Z0.q qVar) {
            return this.f19798a.u(this.f19799b.b(qVar));
        }

        @Override // z1.x
        public boolean d(long j6, AbstractC2261e abstractC2261e, List list) {
            return this.f19798a.d(j6, abstractC2261e, list);
        }

        @Override // z1.InterfaceC2441A
        public Z0.H e() {
            return this.f19799b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f19798a.equals(aVar.f19798a) && this.f19799b.equals(aVar.f19799b);
        }

        @Override // z1.x
        public int f() {
            return this.f19798a.f();
        }

        @Override // z1.x
        public void g(boolean z6) {
            this.f19798a.g(z6);
        }

        @Override // z1.InterfaceC2441A
        public Z0.q h(int i6) {
            return this.f19799b.a(this.f19798a.k(i6));
        }

        public int hashCode() {
            return ((527 + this.f19799b.hashCode()) * 31) + this.f19798a.hashCode();
        }

        @Override // z1.x
        public void i() {
            this.f19798a.i();
        }

        @Override // z1.x
        public void j() {
            this.f19798a.j();
        }

        @Override // z1.InterfaceC2441A
        public int k(int i6) {
            return this.f19798a.k(i6);
        }

        @Override // z1.x
        public int l(long j6, List list) {
            return this.f19798a.l(j6, list);
        }

        @Override // z1.InterfaceC2441A
        public int length() {
            return this.f19798a.length();
        }

        @Override // z1.x
        public int m() {
            return this.f19798a.m();
        }

        @Override // z1.x
        public Z0.q n() {
            return this.f19799b.a(this.f19798a.m());
        }

        @Override // z1.x
        public int o() {
            return this.f19798a.o();
        }

        @Override // z1.x
        public boolean p(int i6, long j6) {
            return this.f19798a.p(i6, j6);
        }

        @Override // z1.x
        public void q(float f6) {
            this.f19798a.q(f6);
        }

        @Override // z1.x
        public Object r() {
            return this.f19798a.r();
        }

        @Override // z1.x
        public void s() {
            this.f19798a.s();
        }

        @Override // z1.x
        public void t() {
            this.f19798a.t();
        }

        @Override // z1.InterfaceC2441A
        public int u(int i6) {
            return this.f19798a.u(i6);
        }
    }

    public N(InterfaceC2225j interfaceC2225j, long[] jArr, InterfaceC2211C... interfaceC2211CArr) {
        this.f19791c = interfaceC2225j;
        this.f19789a = interfaceC2211CArr;
        this.f19797i = interfaceC2225j.empty();
        for (int i6 = 0; i6 < interfaceC2211CArr.length; i6++) {
            long j6 = jArr[i6];
            if (j6 != 0) {
                this.f19789a[i6] = new i0(interfaceC2211CArr[i6], j6);
            }
        }
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public boolean b(C1343l0 c1343l0) {
        if (this.f19792d.isEmpty()) {
            return this.f19797i.b(c1343l0);
        }
        int size = this.f19792d.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((InterfaceC2211C) this.f19792d.get(i6)).b(c1343l0);
        }
        return false;
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public long d() {
        return this.f19797i.d();
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public boolean e() {
        return this.f19797i.e();
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public long f() {
        return this.f19797i.f();
    }

    @Override // w1.InterfaceC2211C
    public long g(long j6, N0 n02) {
        InterfaceC2211C[] interfaceC2211CArr = this.f19796h;
        return (interfaceC2211CArr.length > 0 ? interfaceC2211CArr[0] : this.f19789a[0]).g(j6, n02);
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public void h(long j6) {
        this.f19797i.h(j6);
    }

    @Override // w1.InterfaceC2211C.a
    public void i(InterfaceC2211C interfaceC2211C) {
        this.f19792d.remove(interfaceC2211C);
        if (!this.f19792d.isEmpty()) {
            return;
        }
        int i6 = 0;
        for (InterfaceC2211C interfaceC2211C2 : this.f19789a) {
            i6 += interfaceC2211C2.r().f20070a;
        }
        Z0.H[] hArr = new Z0.H[i6];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            InterfaceC2211C[] interfaceC2211CArr = this.f19789a;
            if (i7 >= interfaceC2211CArr.length) {
                this.f19795g = new l0(hArr);
                ((InterfaceC2211C.a) AbstractC1119a.e(this.f19794f)).i(this);
                return;
            }
            l0 r6 = interfaceC2211CArr[i7].r();
            int i9 = r6.f20070a;
            int i10 = 0;
            while (i10 < i9) {
                Z0.H b6 = r6.b(i10);
                Z0.q[] qVarArr = new Z0.q[b6.f6702a];
                for (int i11 = 0; i11 < b6.f6702a; i11++) {
                    Z0.q a6 = b6.a(i11);
                    q.b a7 = a6.a();
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append(":");
                    String str = a6.f6977a;
                    if (str == null) {
                        str = "";
                    }
                    sb.append(str);
                    qVarArr[i11] = a7.a0(sb.toString()).K();
                }
                Z0.H h6 = new Z0.H(i7 + ":" + b6.f6703b, qVarArr);
                this.f19793e.put(h6, b6);
                hArr[i8] = h6;
                i10++;
                i8++;
            }
            i7++;
        }
    }

    @Override // w1.InterfaceC2211C
    public void l() {
        for (InterfaceC2211C interfaceC2211C : this.f19789a) {
            interfaceC2211C.l();
        }
    }

    @Override // w1.InterfaceC2211C
    public long m(long j6) {
        long m6 = this.f19796h[0].m(j6);
        int i6 = 1;
        while (true) {
            InterfaceC2211C[] interfaceC2211CArr = this.f19796h;
            if (i6 >= interfaceC2211CArr.length) {
                return m6;
            }
            if (interfaceC2211CArr[i6].m(m6) != m6) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i6++;
        }
    }

    public InterfaceC2211C n(int i6) {
        InterfaceC2211C interfaceC2211C = this.f19789a[i6];
        return interfaceC2211C instanceof i0 ? ((i0) interfaceC2211C).a() : interfaceC2211C;
    }

    @Override // w1.InterfaceC2211C
    public long o(z1.x[] xVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j6) {
        int[] iArr = new int[xVarArr.length];
        int[] iArr2 = new int[xVarArr.length];
        int i6 = 0;
        for (int i7 = 0; i7 < xVarArr.length; i7++) {
            b0 b0Var = b0VarArr[i7];
            Integer num = b0Var == null ? null : (Integer) this.f19790b.get(b0Var);
            iArr[i7] = num == null ? -1 : num.intValue();
            z1.x xVar = xVarArr[i7];
            if (xVar != null) {
                String str = xVar.e().f6703b;
                iArr2[i7] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i7] = -1;
            }
        }
        this.f19790b.clear();
        int length = xVarArr.length;
        b0[] b0VarArr2 = new b0[length];
        b0[] b0VarArr3 = new b0[xVarArr.length];
        z1.x[] xVarArr2 = new z1.x[xVarArr.length];
        ArrayList arrayList = new ArrayList(this.f19789a.length);
        long j7 = j6;
        int i8 = 0;
        while (i8 < this.f19789a.length) {
            for (int i9 = i6; i9 < xVarArr.length; i9++) {
                b0VarArr3[i9] = iArr[i9] == i8 ? b0VarArr[i9] : null;
                if (iArr2[i9] == i8) {
                    z1.x xVar2 = (z1.x) AbstractC1119a.e(xVarArr[i9]);
                    xVarArr2[i9] = new a(xVar2, (Z0.H) AbstractC1119a.e((Z0.H) this.f19793e.get(xVar2.e())));
                } else {
                    xVarArr2[i9] = null;
                }
            }
            int i10 = i8;
            long o6 = this.f19789a[i8].o(xVarArr2, zArr, b0VarArr3, zArr2, j7);
            if (i10 == 0) {
                j7 = o6;
            } else if (o6 != j7) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z6 = false;
            for (int i11 = 0; i11 < xVarArr.length; i11++) {
                if (iArr2[i11] == i10) {
                    b0 b0Var2 = (b0) AbstractC1119a.e(b0VarArr3[i11]);
                    b0VarArr2[i11] = b0VarArr3[i11];
                    this.f19790b.put(b0Var2, Integer.valueOf(i10));
                    z6 = true;
                } else if (iArr[i11] == i10) {
                    AbstractC1119a.g(b0VarArr3[i11] == null);
                }
            }
            if (z6) {
                arrayList.add(this.f19789a[i10]);
            }
            i8 = i10 + 1;
            i6 = 0;
        }
        int i12 = i6;
        System.arraycopy(b0VarArr2, i12, b0VarArr, i12, length);
        this.f19796h = (InterfaceC2211C[]) arrayList.toArray(new InterfaceC2211C[i12]);
        this.f19797i = this.f19791c.a(arrayList, z6.G.k(arrayList, new y6.g() { // from class: w1.M
            public final Object apply(Object obj) {
                List c6;
                c6 = ((InterfaceC2211C) obj).r().c();
                return c6;
            }
        }));
        return j7;
    }

    @Override // w1.InterfaceC2211C
    public long p() {
        long j6 = -9223372036854775807L;
        for (InterfaceC2211C interfaceC2211C : this.f19796h) {
            long p6 = interfaceC2211C.p();
            if (p6 != -9223372036854775807L) {
                if (j6 == -9223372036854775807L) {
                    for (InterfaceC2211C interfaceC2211C2 : this.f19796h) {
                        if (interfaceC2211C2 == interfaceC2211C) {
                            break;
                        }
                        if (interfaceC2211C2.m(p6) != p6) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j6 = p6;
                } else if (p6 != j6) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j6 != -9223372036854775807L && interfaceC2211C.m(j6) != j6) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j6;
    }

    @Override // w1.c0.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(InterfaceC2211C interfaceC2211C) {
        ((InterfaceC2211C.a) AbstractC1119a.e(this.f19794f)).j(this);
    }

    @Override // w1.InterfaceC2211C
    public l0 r() {
        return (l0) AbstractC1119a.e(this.f19795g);
    }

    @Override // w1.InterfaceC2211C
    public void s(InterfaceC2211C.a aVar, long j6) {
        this.f19794f = aVar;
        Collections.addAll(this.f19792d, this.f19789a);
        for (InterfaceC2211C interfaceC2211C : this.f19789a) {
            interfaceC2211C.s(this, j6);
        }
    }

    @Override // w1.InterfaceC2211C
    public void t(long j6, boolean z6) {
        for (InterfaceC2211C interfaceC2211C : this.f19796h) {
            interfaceC2211C.t(j6, z6);
        }
    }
}
