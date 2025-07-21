package androidx.media3.exoplayer.dash;

import A1.e;
import A1.k;
import A1.m;
import Z0.H;
import Z0.q;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.d;
import c1.AbstractC1117K;
import com.amazon.a.a.o.b.f;
import e1.InterfaceC1266x;
import g1.C1343l0;
import g1.N0;
import h1.v1;
import j1.C1641b;
import j1.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k1.C1657a;
import k1.C1659c;
import k1.C1661e;
import k1.C1662f;
import k1.g;
import l1.t;
import l1.u;
import w1.C2233s;
import w1.InterfaceC2211C;
import w1.InterfaceC2225j;
import w1.K;
import w1.b0;
import w1.c0;
import w1.l0;
import x1.C2264h;
import z1.x;
import z6.G;
import z6.I;
import z6.w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements InterfaceC2211C, c0.a, C2264h.b {

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f9178y = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f9179z = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: a, reason: collision with root package name */
    public final int f9180a;

    /* renamed from: b, reason: collision with root package name */
    public final a.InterfaceC0136a f9181b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1266x f9182c;

    /* renamed from: d, reason: collision with root package name */
    public final u f9183d;

    /* renamed from: e, reason: collision with root package name */
    public final k f9184e;

    /* renamed from: f, reason: collision with root package name */
    public final C1641b f9185f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9186g;

    /* renamed from: h, reason: collision with root package name */
    public final m f9187h;

    /* renamed from: i, reason: collision with root package name */
    public final A1.b f9188i;

    /* renamed from: j, reason: collision with root package name */
    public final l0 f9189j;

    /* renamed from: k, reason: collision with root package name */
    public final a[] f9190k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC2225j f9191l;

    /* renamed from: m, reason: collision with root package name */
    public final d f9192m;

    /* renamed from: o, reason: collision with root package name */
    public final K.a f9194o;

    /* renamed from: p, reason: collision with root package name */
    public final t.a f9195p;

    /* renamed from: q, reason: collision with root package name */
    public final v1 f9196q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC2211C.a f9197r;

    /* renamed from: u, reason: collision with root package name */
    public c0 f9200u;

    /* renamed from: v, reason: collision with root package name */
    public C1659c f9201v;

    /* renamed from: w, reason: collision with root package name */
    public int f9202w;

    /* renamed from: x, reason: collision with root package name */
    public List f9203x;

    /* renamed from: s, reason: collision with root package name */
    public C2264h[] f9198s = H(0);

    /* renamed from: t, reason: collision with root package name */
    public j[] f9199t = new j[0];

    /* renamed from: n, reason: collision with root package name */
    public final IdentityHashMap f9193n = new IdentityHashMap();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f9204a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9205b;

        /* renamed from: c, reason: collision with root package name */
        public final int f9206c;

        /* renamed from: d, reason: collision with root package name */
        public final int f9207d;

        /* renamed from: e, reason: collision with root package name */
        public final int f9208e;

        /* renamed from: f, reason: collision with root package name */
        public final int f9209f;

        /* renamed from: g, reason: collision with root package name */
        public final int f9210g;

        /* renamed from: h, reason: collision with root package name */
        public final w f9211h;

        public a(int i6, int i7, int[] iArr, int i8, int i9, int i10, int i11, w wVar) {
            this.f9205b = i6;
            this.f9204a = iArr;
            this.f9206c = i7;
            this.f9208e = i8;
            this.f9209f = i9;
            this.f9210g = i10;
            this.f9207d = i11;
            this.f9211h = wVar;
        }

        public static a a(int[] iArr, int i6, w wVar) {
            return new a(3, 1, iArr, i6, -1, -1, -1, wVar);
        }

        public static a b(int[] iArr, int i6) {
            return new a(5, 1, iArr, i6, -1, -1, -1, w.w());
        }

        public static a c(int i6) {
            return new a(5, 2, new int[0], -1, -1, -1, i6, w.w());
        }

        public static a d(int i6, int[] iArr, int i7, int i8, int i9) {
            return new a(i6, 0, iArr, i7, i8, i9, -1, w.w());
        }
    }

    public b(int i6, C1659c c1659c, C1641b c1641b, int i7, a.InterfaceC0136a interfaceC0136a, InterfaceC1266x interfaceC1266x, e eVar, u uVar, t.a aVar, k kVar, K.a aVar2, long j6, m mVar, A1.b bVar, InterfaceC2225j interfaceC2225j, d.b bVar2, v1 v1Var) {
        this.f9180a = i6;
        this.f9201v = c1659c;
        this.f9185f = c1641b;
        this.f9202w = i7;
        this.f9181b = interfaceC0136a;
        this.f9182c = interfaceC1266x;
        this.f9183d = uVar;
        this.f9195p = aVar;
        this.f9184e = kVar;
        this.f9194o = aVar2;
        this.f9186g = j6;
        this.f9187h = mVar;
        this.f9188i = bVar;
        this.f9191l = interfaceC2225j;
        this.f9196q = v1Var;
        this.f9192m = new d(c1659c, bVar2, bVar);
        this.f9200u = interfaceC2225j.empty();
        g d6 = c1659c.d(i7);
        List list = d6.f16354d;
        this.f9203x = list;
        Pair w6 = w(uVar, interfaceC0136a, d6.f16353c, list);
        this.f9189j = (l0) w6.first;
        this.f9190k = (a[]) w6.second;
    }

    public static q[] A(List list, int[] iArr) {
        for (int i6 : iArr) {
            C1657a c1657a = (C1657a) list.get(i6);
            List list2 = ((C1657a) list.get(i6)).f16309d;
            for (int i7 = 0; i7 < list2.size(); i7++) {
                C1661e c1661e = (C1661e) list2.get(i7);
                if ("urn:scte:dash:cc:cea-608:2015".equals(c1661e.f16343a)) {
                    return J(c1661e, f9178y, new q.b().o0("application/cea-608").a0(c1657a.f16306a + ":cea608").K());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(c1661e.f16343a)) {
                    return J(c1661e, f9179z, new q.b().o0("application/cea-708").a0(c1657a.f16306a + ":cea708").K());
                }
            }
        }
        return new q[0];
    }

    public static int[][] B(List list) {
        C1661e x6;
        Integer num;
        int size = list.size();
        HashMap f6 = I.f(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i6 = 0; i6 < size; i6++) {
            f6.put(Long.valueOf(((C1657a) list.get(i6)).f16306a), Integer.valueOf(i6));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i6));
            arrayList.add(arrayList2);
            sparseArray.put(i6, arrayList2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            C1657a c1657a = (C1657a) list.get(i7);
            C1661e z6 = z(c1657a.f16310e);
            if (z6 == null) {
                z6 = z(c1657a.f16311f);
            }
            int intValue = (z6 == null || (num = (Integer) f6.get(Long.valueOf(Long.parseLong(z6.f16344b)))) == null) ? i7 : num.intValue();
            if (intValue == i7 && (x6 = x(c1657a.f16311f)) != null) {
                for (String str : AbstractC1117K.d1(x6.f16344b, f.f11248a)) {
                    Integer num2 = (Integer) f6.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i7) {
                List list2 = (List) sparseArray.get(i7);
                List list3 = (List) sparseArray.get(intValue);
                list3.addAll(list2);
                sparseArray.put(i7, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2];
        for (int i8 = 0; i8 < size2; i8++) {
            int[] m6 = C6.g.m((Collection) arrayList.get(i8));
            iArr[i8] = m6;
            Arrays.sort(m6);
        }
        return iArr;
    }

    public static boolean E(List list, int[] iArr) {
        for (int i6 : iArr) {
            List list2 = ((C1657a) list.get(i6)).f16308c;
            for (int i7 = 0; i7 < list2.size(); i7++) {
                if (!((k1.j) list2.get(i7)).f16369e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int F(int i6, List list, int[][] iArr, boolean[] zArr, q[][] qVarArr) {
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            if (E(list, iArr[i8])) {
                zArr[i8] = true;
                i7++;
            }
            q[] A6 = A(list, iArr[i8]);
            qVarArr[i8] = A6;
            if (A6.length != 0) {
                i7++;
            }
        }
        return i7;
    }

    public static void G(a.InterfaceC0136a interfaceC0136a, q[] qVarArr) {
        for (int i6 = 0; i6 < qVarArr.length; i6++) {
            qVarArr[i6] = interfaceC0136a.c(qVarArr[i6]);
        }
    }

    public static C2264h[] H(int i6) {
        return new C2264h[i6];
    }

    public static q[] J(C1661e c1661e, Pattern pattern, q qVar) {
        String str = c1661e.f16344b;
        if (str == null) {
            return new q[]{qVar};
        }
        String[] d12 = AbstractC1117K.d1(str, ";");
        q[] qVarArr = new q[d12.length];
        for (int i6 = 0; i6 < d12.length; i6++) {
            Matcher matcher = pattern.matcher(d12[i6]);
            if (!matcher.matches()) {
                return new q[]{qVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            qVarArr[i6] = qVar.a().a0(qVar.f6977a + ":" + parseInt).L(parseInt).e0(matcher.group(2)).K();
        }
        return qVarArr;
    }

    public static void q(List list, H[] hArr, a[] aVarArr, int i6) {
        int i7 = 0;
        while (i7 < list.size()) {
            C1662f c1662f = (C1662f) list.get(i7);
            hArr[i6] = new H(c1662f.a() + ":" + i7, new q.b().a0(c1662f.a()).o0("application/x-emsg").K());
            aVarArr[i6] = a.c(i7);
            i7++;
            i6++;
        }
    }

    public static int u(u uVar, a.InterfaceC0136a interfaceC0136a, List list, int[][] iArr, int i6, boolean[] zArr, q[][] qVarArr, H[] hArr, a[] aVarArr) {
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i6) {
            int[] iArr2 = iArr[i9];
            ArrayList arrayList = new ArrayList();
            for (int i11 : iArr2) {
                arrayList.addAll(((C1657a) list.get(i11)).f16308c);
            }
            int size = arrayList.size();
            q[] qVarArr2 = new q[size];
            for (int i12 = 0; i12 < size; i12++) {
                q qVar = ((k1.j) arrayList.get(i12)).f16366b;
                qVarArr2[i12] = qVar.a().R(uVar.c(qVar)).K();
            }
            C1657a c1657a = (C1657a) list.get(iArr2[0]);
            long j6 = c1657a.f16306a;
            String l6 = j6 != -1 ? Long.toString(j6) : "unset:" + i9;
            int i13 = i10 + 1;
            if (zArr[i9]) {
                i7 = i10 + 2;
            } else {
                i7 = i13;
                i13 = -1;
            }
            if (qVarArr[i9].length != 0) {
                i8 = i7 + 1;
            } else {
                i8 = i7;
                i7 = -1;
            }
            G(interfaceC0136a, qVarArr2);
            hArr[i10] = new H(l6, qVarArr2);
            aVarArr[i10] = a.d(c1657a.f16307b, iArr2, i10, i13, i7);
            if (i13 != -1) {
                String str = l6 + ":emsg";
                hArr[i13] = new H(str, new q.b().a0(str).o0("application/x-emsg").K());
                aVarArr[i13] = a.b(iArr2, i10);
            }
            if (i7 != -1) {
                aVarArr[i7] = a.a(iArr2, i10, w.t(qVarArr[i9]));
                G(interfaceC0136a, qVarArr[i9]);
                hArr[i7] = new H(l6 + ":cc", qVarArr[i9]);
            }
            i9++;
            i10 = i8;
        }
        return i10;
    }

    public static Pair w(u uVar, a.InterfaceC0136a interfaceC0136a, List list, List list2) {
        int[][] B6 = B(list);
        int length = B6.length;
        boolean[] zArr = new boolean[length];
        q[][] qVarArr = new q[length];
        int F6 = F(length, list, B6, zArr, qVarArr) + length + list2.size();
        H[] hArr = new H[F6];
        a[] aVarArr = new a[F6];
        q(list2, hArr, aVarArr, u(uVar, interfaceC0136a, list, B6, length, zArr, qVarArr, hArr, aVarArr));
        return Pair.create(new l0(hArr), aVarArr);
    }

    public static C1661e x(List list) {
        return y(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    public static C1661e y(List list, String str) {
        for (int i6 = 0; i6 < list.size(); i6++) {
            C1661e c1661e = (C1661e) list.get(i6);
            if (str.equals(c1661e.f16343a)) {
                return c1661e;
            }
        }
        return null;
    }

    public static C1661e z(List list) {
        return y(list, "http://dashif.org/guidelines/trickmode");
    }

    public final int C(int i6, int[] iArr) {
        int i7 = iArr[i6];
        if (i7 == -1) {
            return -1;
        }
        int i8 = this.f9190k[i7].f9208e;
        for (int i9 = 0; i9 < iArr.length; i9++) {
            int i10 = iArr[i9];
            if (i10 == i8 && this.f9190k[i10].f9206c == 0) {
                return i9;
            }
        }
        return -1;
    }

    public final int[] D(x[] xVarArr) {
        int[] iArr = new int[xVarArr.length];
        for (int i6 = 0; i6 < xVarArr.length; i6++) {
            x xVar = xVarArr[i6];
            if (xVar != null) {
                iArr[i6] = this.f9189j.d(xVar.e());
            } else {
                iArr[i6] = -1;
            }
        }
        return iArr;
    }

    @Override // w1.c0.a
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void j(C2264h c2264h) {
        this.f9197r.j(this);
    }

    public void K() {
        this.f9192m.o();
        for (C2264h c2264h : this.f9198s) {
            c2264h.Q(this);
        }
        this.f9197r = null;
    }

    public final void L(x[] xVarArr, boolean[] zArr, b0[] b0VarArr) {
        for (int i6 = 0; i6 < xVarArr.length; i6++) {
            if (xVarArr[i6] == null || !zArr[i6]) {
                b0 b0Var = b0VarArr[i6];
                if (b0Var instanceof C2264h) {
                    ((C2264h) b0Var).Q(this);
                } else if (b0Var instanceof C2264h.a) {
                    ((C2264h.a) b0Var).d();
                }
                b0VarArr[i6] = null;
            }
        }
    }

    public final void M(x[] xVarArr, b0[] b0VarArr, int[] iArr) {
        boolean z6;
        for (int i6 = 0; i6 < xVarArr.length; i6++) {
            b0 b0Var = b0VarArr[i6];
            if ((b0Var instanceof C2233s) || (b0Var instanceof C2264h.a)) {
                int C6 = C(i6, iArr);
                if (C6 == -1) {
                    z6 = b0VarArr[i6] instanceof C2233s;
                } else {
                    b0 b0Var2 = b0VarArr[i6];
                    z6 = (b0Var2 instanceof C2264h.a) && ((C2264h.a) b0Var2).f20464a == b0VarArr[C6];
                }
                if (!z6) {
                    b0 b0Var3 = b0VarArr[i6];
                    if (b0Var3 instanceof C2264h.a) {
                        ((C2264h.a) b0Var3).d();
                    }
                    b0VarArr[i6] = null;
                }
            }
        }
    }

    public final void N(x[] xVarArr, b0[] b0VarArr, boolean[] zArr, long j6, int[] iArr) {
        for (int i6 = 0; i6 < xVarArr.length; i6++) {
            x xVar = xVarArr[i6];
            if (xVar != null) {
                b0 b0Var = b0VarArr[i6];
                if (b0Var == null) {
                    zArr[i6] = true;
                    a aVar = this.f9190k[iArr[i6]];
                    int i7 = aVar.f9206c;
                    if (i7 == 0) {
                        b0VarArr[i6] = v(aVar, xVar, j6);
                    } else if (i7 == 2) {
                        b0VarArr[i6] = new j((C1662f) this.f9203x.get(aVar.f9207d), xVar.e().a(0), this.f9201v.f16319d);
                    }
                } else if (b0Var instanceof C2264h) {
                    ((androidx.media3.exoplayer.dash.a) ((C2264h) b0Var).E()).b(xVar);
                }
            }
        }
        for (int i8 = 0; i8 < xVarArr.length; i8++) {
            if (b0VarArr[i8] == null && xVarArr[i8] != null) {
                a aVar2 = this.f9190k[iArr[i8]];
                if (aVar2.f9206c == 1) {
                    int C6 = C(i8, iArr);
                    if (C6 == -1) {
                        b0VarArr[i8] = new C2233s();
                    } else {
                        b0VarArr[i8] = ((C2264h) b0VarArr[C6]).T(j6, aVar2.f9205b);
                    }
                }
            }
        }
    }

    public void O(C1659c c1659c, int i6) {
        this.f9201v = c1659c;
        this.f9202w = i6;
        this.f9192m.q(c1659c);
        C2264h[] c2264hArr = this.f9198s;
        if (c2264hArr != null) {
            for (C2264h c2264h : c2264hArr) {
                ((androidx.media3.exoplayer.dash.a) c2264h.E()).j(c1659c, i6);
            }
            this.f9197r.j(this);
        }
        this.f9203x = c1659c.d(i6).f16354d;
        for (j jVar : this.f9199t) {
            Iterator it = this.f9203x.iterator();
            while (true) {
                if (it.hasNext()) {
                    C1662f c1662f = (C1662f) it.next();
                    if (c1662f.a().equals(jVar.b())) {
                        jVar.e(c1662f, c1659c.f16319d && i6 == c1659c.e() - 1);
                    }
                }
            }
        }
    }

    @Override // x1.C2264h.b
    public synchronized void a(C2264h c2264h) {
        d.c cVar = (d.c) this.f9193n.remove(c2264h);
        if (cVar != null) {
            cVar.n();
        }
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public boolean b(C1343l0 c1343l0) {
        return this.f9200u.b(c1343l0);
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public long d() {
        return this.f9200u.d();
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public boolean e() {
        return this.f9200u.e();
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public long f() {
        return this.f9200u.f();
    }

    @Override // w1.InterfaceC2211C
    public long g(long j6, N0 n02) {
        for (C2264h c2264h : this.f9198s) {
            if (c2264h.f20441a == 2) {
                return c2264h.g(j6, n02);
            }
        }
        return j6;
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public void h(long j6) {
        this.f9200u.h(j6);
    }

    @Override // w1.InterfaceC2211C
    public void l() {
        this.f9187h.a();
    }

    @Override // w1.InterfaceC2211C
    public long m(long j6) {
        for (C2264h c2264h : this.f9198s) {
            c2264h.S(j6);
        }
        for (j jVar : this.f9199t) {
            jVar.d(j6);
        }
        return j6;
    }

    @Override // w1.InterfaceC2211C
    public long o(x[] xVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j6) {
        int[] D6 = D(xVarArr);
        L(xVarArr, zArr, b0VarArr);
        M(xVarArr, b0VarArr, D6);
        N(xVarArr, b0VarArr, zArr2, j6, D6);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (b0 b0Var : b0VarArr) {
            if (b0Var instanceof C2264h) {
                arrayList.add((C2264h) b0Var);
            } else if (b0Var instanceof j) {
                arrayList2.add((j) b0Var);
            }
        }
        C2264h[] H6 = H(arrayList.size());
        this.f9198s = H6;
        arrayList.toArray(H6);
        j[] jVarArr = new j[arrayList2.size()];
        this.f9199t = jVarArr;
        arrayList2.toArray(jVarArr);
        this.f9200u = this.f9191l.a(arrayList, G.k(arrayList, new y6.g() { // from class: j1.d
            public final Object apply(Object obj) {
                List y6;
                y6 = w.y(Integer.valueOf(((C2264h) obj).f20441a));
                return y6;
            }
        }));
        return j6;
    }

    @Override // w1.InterfaceC2211C
    public long p() {
        return -9223372036854775807L;
    }

    @Override // w1.InterfaceC2211C
    public l0 r() {
        return this.f9189j;
    }

    @Override // w1.InterfaceC2211C
    public void s(InterfaceC2211C.a aVar, long j6) {
        this.f9197r = aVar;
        aVar.i(this);
    }

    @Override // w1.InterfaceC2211C
    public void t(long j6, boolean z6) {
        for (C2264h c2264h : this.f9198s) {
            c2264h.t(j6, z6);
        }
    }

    public final C2264h v(a aVar, x xVar, long j6) {
        int i6;
        H h6;
        int i7;
        int i8 = aVar.f9209f;
        boolean z6 = i8 != -1;
        d.c cVar = null;
        if (z6) {
            h6 = this.f9189j.b(i8);
            i6 = 1;
        } else {
            i6 = 0;
            h6 = null;
        }
        int i9 = aVar.f9210g;
        w w6 = i9 != -1 ? this.f9190k[i9].f9211h : w.w();
        int size = i6 + w6.size();
        q[] qVarArr = new q[size];
        int[] iArr = new int[size];
        if (z6) {
            qVarArr[0] = h6.a(0);
            iArr[0] = 5;
            i7 = 1;
        } else {
            i7 = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < w6.size(); i10++) {
            q qVar = (q) w6.get(i10);
            qVarArr[i7] = qVar;
            iArr[i7] = 3;
            arrayList.add(qVar);
            i7++;
        }
        if (this.f9201v.f16319d && z6) {
            cVar = this.f9192m.k();
        }
        d.c cVar2 = cVar;
        C2264h c2264h = new C2264h(aVar.f9205b, iArr, qVarArr, this.f9181b.d(this.f9187h, this.f9201v, this.f9185f, this.f9202w, aVar.f9204a, xVar, aVar.f9205b, this.f9186g, z6, arrayList, cVar2, this.f9182c, this.f9196q, null), this, this.f9188i, j6, this.f9183d, this.f9195p, this.f9184e, this.f9194o);
        synchronized (this) {
            this.f9193n.put(c2264h, cVar2);
        }
        return c2264h;
    }
}
