package w1;

import Z0.G;
import Z0.u;
import c1.AbstractC1119a;
import e1.InterfaceC1266x;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import w1.InterfaceC2212D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class O extends AbstractC2223h {

    /* renamed from: v, reason: collision with root package name */
    public static final Z0.u f19800v = new u.c().c("MergingMediaSource").a();

    /* renamed from: k, reason: collision with root package name */
    public final boolean f19801k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f19802l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC2212D[] f19803m;

    /* renamed from: n, reason: collision with root package name */
    public final Z0.G[] f19804n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f19805o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC2225j f19806p;

    /* renamed from: q, reason: collision with root package name */
    public final Map f19807q;

    /* renamed from: r, reason: collision with root package name */
    public final z6.J f19808r;

    /* renamed from: s, reason: collision with root package name */
    public int f19809s;

    /* renamed from: t, reason: collision with root package name */
    public long[][] f19810t;

    /* renamed from: u, reason: collision with root package name */
    public b f19811u;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends AbstractC2237w {

        /* renamed from: f, reason: collision with root package name */
        public final long[] f19812f;

        /* renamed from: g, reason: collision with root package name */
        public final long[] f19813g;

        public a(Z0.G g6, Map map) {
            super(g6);
            int p6 = g6.p();
            this.f19813g = new long[g6.p()];
            G.c cVar = new G.c();
            for (int i6 = 0; i6 < p6; i6++) {
                this.f19813g[i6] = g6.n(i6, cVar).f6696m;
            }
            int i7 = g6.i();
            this.f19812f = new long[i7];
            G.b bVar = new G.b();
            for (int i8 = 0; i8 < i7; i8++) {
                g6.g(i8, bVar, true);
                long longValue = ((Long) AbstractC1119a.e((Long) map.get(bVar.f6662b))).longValue();
                long[] jArr = this.f19812f;
                longValue = longValue == Long.MIN_VALUE ? bVar.f6664d : longValue;
                jArr[i8] = longValue;
                long j6 = bVar.f6664d;
                if (j6 != -9223372036854775807L) {
                    long[] jArr2 = this.f19813g;
                    int i9 = bVar.f6663c;
                    jArr2[i9] = jArr2[i9] - (j6 - longValue);
                }
            }
        }

        @Override // w1.AbstractC2237w, Z0.G
        public G.b g(int i6, G.b bVar, boolean z6) {
            super.g(i6, bVar, z6);
            bVar.f6664d = this.f19812f[i6];
            return bVar;
        }

        @Override // w1.AbstractC2237w, Z0.G
        public G.c o(int i6, G.c cVar, long j6) {
            long j7;
            super.o(i6, cVar, j6);
            long j8 = this.f19813g[i6];
            cVar.f6696m = j8;
            if (j8 != -9223372036854775807L) {
                long j9 = cVar.f6695l;
                if (j9 != -9223372036854775807L) {
                    j7 = Math.min(j9, j8);
                    cVar.f6695l = j7;
                    return cVar;
                }
            }
            j7 = cVar.f6695l;
            cVar.f6695l = j7;
            return cVar;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f19814a;

        public b(int i6) {
            this.f19814a = i6;
        }
    }

    public O(InterfaceC2212D... interfaceC2212DArr) {
        this(false, interfaceC2212DArr);
    }

    @Override // w1.AbstractC2223h, w1.AbstractC2216a
    public void C(InterfaceC1266x interfaceC1266x) {
        super.C(interfaceC1266x);
        for (int i6 = 0; i6 < this.f19803m.length; i6++) {
            K(Integer.valueOf(i6), this.f19803m[i6]);
        }
    }

    @Override // w1.AbstractC2223h, w1.AbstractC2216a
    public void E() {
        super.E();
        Arrays.fill(this.f19804n, (Object) null);
        this.f19809s = -1;
        this.f19811u = null;
        this.f19805o.clear();
        Collections.addAll(this.f19805o, this.f19803m);
    }

    public final void L() {
        G.b bVar = new G.b();
        for (int i6 = 0; i6 < this.f19809s; i6++) {
            long j6 = -this.f19804n[0].f(i6, bVar).n();
            int i7 = 1;
            while (true) {
                Z0.G[] gArr = this.f19804n;
                if (i7 < gArr.length) {
                    this.f19810t[i6][i7] = j6 - (-gArr[i7].f(i6, bVar).n());
                    i7++;
                }
            }
        }
    }

    @Override // w1.AbstractC2223h
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public InterfaceC2212D.b G(Integer num, InterfaceC2212D.b bVar) {
        if (num.intValue() == 0) {
            return bVar;
        }
        return null;
    }

    @Override // w1.AbstractC2223h
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void J(Integer num, InterfaceC2212D interfaceC2212D, Z0.G g6) {
        if (this.f19811u != null) {
            return;
        }
        if (this.f19809s == -1) {
            this.f19809s = g6.i();
        } else if (g6.i() != this.f19809s) {
            this.f19811u = new b(0);
            return;
        }
        if (this.f19810t.length == 0) {
            this.f19810t = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f19809s, this.f19804n.length);
        }
        this.f19805o.remove(interfaceC2212D);
        this.f19804n[num.intValue()] = g6;
        if (this.f19805o.isEmpty()) {
            if (this.f19801k) {
                L();
            }
            Z0.G g7 = this.f19804n[0];
            if (this.f19802l) {
                O();
                g7 = new a(g7, this.f19807q);
            }
            D(g7);
        }
    }

    public final void O() {
        Z0.G[] gArr;
        G.b bVar = new G.b();
        for (int i6 = 0; i6 < this.f19809s; i6++) {
            int i7 = 0;
            long j6 = Long.MIN_VALUE;
            while (true) {
                gArr = this.f19804n;
                if (i7 >= gArr.length) {
                    break;
                }
                long j7 = gArr[i7].f(i6, bVar).j();
                if (j7 != -9223372036854775807L) {
                    long j8 = j7 + this.f19810t[i6][i7];
                    if (j6 == Long.MIN_VALUE || j8 < j6) {
                        j6 = j8;
                    }
                }
                i7++;
            }
            Object m6 = gArr[0].m(i6);
            this.f19807q.put(m6, Long.valueOf(j6));
            Iterator it = this.f19808r.get(m6).iterator();
            while (it.hasNext()) {
                ((C2220e) it.next()).w(0L, j6);
            }
        }
    }

    @Override // w1.InterfaceC2212D
    public InterfaceC2211C d(InterfaceC2212D.b bVar, A1.b bVar2, long j6) {
        int length = this.f19803m.length;
        InterfaceC2211C[] interfaceC2211CArr = new InterfaceC2211C[length];
        int b6 = this.f19804n[0].b(bVar.f19753a);
        for (int i6 = 0; i6 < length; i6++) {
            interfaceC2211CArr[i6] = this.f19803m[i6].d(bVar.a(this.f19804n[i6].m(b6)), bVar2, j6 - this.f19810t[b6][i6]);
        }
        N n6 = new N(this.f19806p, this.f19810t[b6], interfaceC2211CArr);
        if (!this.f19802l) {
            return n6;
        }
        C2220e c2220e = new C2220e(n6, true, 0L, ((Long) AbstractC1119a.e((Long) this.f19807q.get(bVar.f19753a))).longValue());
        this.f19808r.put(bVar.f19753a, c2220e);
        return c2220e;
    }

    @Override // w1.InterfaceC2212D
    public Z0.u g() {
        InterfaceC2212D[] interfaceC2212DArr = this.f19803m;
        return interfaceC2212DArr.length > 0 ? interfaceC2212DArr[0].g() : f19800v;
    }

    @Override // w1.AbstractC2223h, w1.InterfaceC2212D
    public void l() {
        b bVar = this.f19811u;
        if (bVar != null) {
            throw bVar;
        }
        super.l();
    }

    @Override // w1.InterfaceC2212D
    public void r(InterfaceC2211C interfaceC2211C) {
        if (this.f19802l) {
            C2220e c2220e = (C2220e) interfaceC2211C;
            Iterator it = this.f19808r.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((C2220e) entry.getValue()).equals(c2220e)) {
                    this.f19808r.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            interfaceC2211C = c2220e.f19965a;
        }
        N n6 = (N) interfaceC2211C;
        int i6 = 0;
        while (true) {
            InterfaceC2212D[] interfaceC2212DArr = this.f19803m;
            if (i6 >= interfaceC2212DArr.length) {
                return;
            }
            interfaceC2212DArr[i6].r(n6.n(i6));
            i6++;
        }
    }

    @Override // w1.InterfaceC2212D
    public void s(Z0.u uVar) {
        this.f19803m[0].s(uVar);
    }

    public O(boolean z6, InterfaceC2212D... interfaceC2212DArr) {
        this(z6, false, interfaceC2212DArr);
    }

    public O(boolean z6, boolean z7, InterfaceC2212D... interfaceC2212DArr) {
        this(z6, z7, new C2226k(), interfaceC2212DArr);
    }

    public O(boolean z6, boolean z7, InterfaceC2225j interfaceC2225j, InterfaceC2212D... interfaceC2212DArr) {
        this.f19801k = z6;
        this.f19802l = z7;
        this.f19803m = interfaceC2212DArr;
        this.f19806p = interfaceC2225j;
        this.f19805o = new ArrayList(Arrays.asList(interfaceC2212DArr));
        this.f19809s = -1;
        this.f19804n = new Z0.G[interfaceC2212DArr.length];
        this.f19810t = new long[0];
        this.f19807q = new HashMap();
        this.f19808r = z6.K.a().a().e();
    }
}
