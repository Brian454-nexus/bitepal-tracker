package m1;

import A1.k;
import Z0.C0841m;
import Z0.H;
import Z0.q;
import Z0.x;
import Z0.y;
import android.net.Uri;
import android.text.TextUtils;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import e1.InterfaceC1266x;
import g1.C1343l0;
import g1.N0;
import h1.v1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import l1.t;
import m1.s;
import n1.g;
import n1.k;
import w1.InterfaceC2211C;
import w1.InterfaceC2225j;
import w1.K;
import w1.b0;
import w1.c0;
import w1.l0;
import z6.G;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class m implements InterfaceC2211C, k.b {

    /* renamed from: a, reason: collision with root package name */
    public final h f17313a;

    /* renamed from: b, reason: collision with root package name */
    public final n1.k f17314b;

    /* renamed from: c, reason: collision with root package name */
    public final g f17315c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1266x f17316d;

    /* renamed from: e, reason: collision with root package name */
    public final l1.u f17317e;

    /* renamed from: f, reason: collision with root package name */
    public final t.a f17318f;

    /* renamed from: g, reason: collision with root package name */
    public final A1.k f17319g;

    /* renamed from: h, reason: collision with root package name */
    public final K.a f17320h;

    /* renamed from: i, reason: collision with root package name */
    public final A1.b f17321i;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC2225j f17324l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f17325m;

    /* renamed from: n, reason: collision with root package name */
    public final int f17326n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f17327o;

    /* renamed from: p, reason: collision with root package name */
    public final v1 f17328p;

    /* renamed from: r, reason: collision with root package name */
    public final long f17330r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC2211C.a f17331s;

    /* renamed from: t, reason: collision with root package name */
    public int f17332t;

    /* renamed from: u, reason: collision with root package name */
    public l0 f17333u;

    /* renamed from: y, reason: collision with root package name */
    public int f17337y;

    /* renamed from: z, reason: collision with root package name */
    public c0 f17338z;

    /* renamed from: q, reason: collision with root package name */
    public final s.b f17329q = new b();

    /* renamed from: j, reason: collision with root package name */
    public final IdentityHashMap f17322j = new IdentityHashMap();

    /* renamed from: k, reason: collision with root package name */
    public final v f17323k = new v();

    /* renamed from: v, reason: collision with root package name */
    public s[] f17334v = new s[0];

    /* renamed from: w, reason: collision with root package name */
    public s[] f17335w = new s[0];

    /* renamed from: x, reason: collision with root package name */
    public int[][] f17336x = new int[0];

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements s.b {
        public b() {
        }

        @Override // w1.c0.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void j(s sVar) {
            m.this.f17331s.j(m.this);
        }

        @Override // m1.s.b
        public void c() {
            if (m.j(m.this) > 0) {
                return;
            }
            int i6 = 0;
            for (s sVar : m.this.f17334v) {
                i6 += sVar.r().f20070a;
            }
            H[] hArr = new H[i6];
            int i7 = 0;
            for (s sVar2 : m.this.f17334v) {
                int i8 = sVar2.r().f20070a;
                int i9 = 0;
                while (i9 < i8) {
                    hArr[i7] = sVar2.r().b(i9);
                    i9++;
                    i7++;
                }
            }
            m.this.f17333u = new l0(hArr);
            m.this.f17331s.i(m.this);
        }

        @Override // m1.s.b
        public void k(Uri uri) {
            m.this.f17314b.m(uri);
        }
    }

    public m(h hVar, n1.k kVar, g gVar, InterfaceC1266x interfaceC1266x, A1.e eVar, l1.u uVar, t.a aVar, A1.k kVar2, K.a aVar2, A1.b bVar, InterfaceC2225j interfaceC2225j, boolean z6, int i6, boolean z7, v1 v1Var, long j6) {
        this.f17313a = hVar;
        this.f17314b = kVar;
        this.f17315c = gVar;
        this.f17316d = interfaceC1266x;
        this.f17317e = uVar;
        this.f17318f = aVar;
        this.f17319g = kVar2;
        this.f17320h = aVar2;
        this.f17321i = bVar;
        this.f17324l = interfaceC2225j;
        this.f17325m = z6;
        this.f17326n = i6;
        this.f17327o = z7;
        this.f17328p = v1Var;
        this.f17330r = j6;
        this.f17338z = interfaceC2225j.empty();
    }

    public static Map A(List list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i6 = 0;
        while (i6 < arrayList.size()) {
            C0841m c0841m = (C0841m) list.get(i6);
            String str = c0841m.f6921c;
            i6++;
            int i7 = i6;
            while (i7 < arrayList.size()) {
                C0841m c0841m2 = (C0841m) arrayList.get(i7);
                if (TextUtils.equals(c0841m2.f6921c, str)) {
                    c0841m = c0841m.g(c0841m2);
                    arrayList.remove(i7);
                } else {
                    i7++;
                }
            }
            hashMap.put(str, c0841m);
        }
        return hashMap;
    }

    public static Z0.q B(Z0.q qVar) {
        String S5 = AbstractC1117K.S(qVar.f6986j, 2);
        return new q.b().a0(qVar.f6977a).c0(qVar.f6978b).d0(qVar.f6979c).Q(qVar.f6989m).o0(y.g(S5)).O(S5).h0(qVar.f6987k).M(qVar.f6983g).j0(qVar.f6984h).v0(qVar.f6996t).Y(qVar.f6997u).X(qVar.f6998v).q0(qVar.f6981e).m0(qVar.f6982f).K();
    }

    public static /* synthetic */ int j(m mVar) {
        int i6 = mVar.f17332t - 1;
        mVar.f17332t = i6;
        return i6;
    }

    public static Z0.q z(Z0.q qVar, Z0.q qVar2, boolean z6) {
        x xVar;
        int i6;
        String str;
        String str2;
        List list;
        int i7;
        int i8;
        String str3;
        List w6 = z6.w.w();
        if (qVar2 != null) {
            str2 = qVar2.f6986j;
            xVar = qVar2.f6987k;
            i7 = qVar2.f6966B;
            i6 = qVar2.f6981e;
            i8 = qVar2.f6982f;
            str = qVar2.f6980d;
            str3 = qVar2.f6978b;
            list = qVar2.f6979c;
        } else {
            String S5 = AbstractC1117K.S(qVar.f6986j, 1);
            xVar = qVar.f6987k;
            if (z6) {
                i7 = qVar.f6966B;
                i6 = qVar.f6981e;
                i8 = qVar.f6982f;
                str = qVar.f6980d;
                str3 = qVar.f6978b;
                str2 = S5;
                list = qVar.f6979c;
            } else {
                i6 = 0;
                str = null;
                str2 = S5;
                list = w6;
                i7 = -1;
                i8 = 0;
                str3 = null;
            }
        }
        return new q.b().a0(qVar.f6977a).c0(str3).d0(list).Q(qVar.f6989m).o0(y.g(str2)).O(str2).h0(xVar).M(z6 ? qVar.f6983g : -1).j0(z6 ? qVar.f6984h : -1).N(i7).q0(i6).m0(i8).e0(str).K();
    }

    public void C() {
        this.f17314b.b(this);
        for (s sVar : this.f17334v) {
            sVar.g0();
        }
        this.f17331s = null;
    }

    @Override // n1.k.b
    public void a() {
        for (s sVar : this.f17334v) {
            sVar.c0();
        }
        this.f17331s.j(this);
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public boolean b(C1343l0 c1343l0) {
        if (this.f17333u != null) {
            return this.f17338z.b(c1343l0);
        }
        for (s sVar : this.f17334v) {
            sVar.C();
        }
        return false;
    }

    @Override // n1.k.b
    public boolean c(Uri uri, k.c cVar, boolean z6) {
        boolean z7 = true;
        for (s sVar : this.f17334v) {
            z7 &= sVar.b0(uri, cVar, z6);
        }
        this.f17331s.j(this);
        return z7;
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public long d() {
        return this.f17338z.d();
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public boolean e() {
        return this.f17338z.e();
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public long f() {
        return this.f17338z.f();
    }

    @Override // w1.InterfaceC2211C
    public long g(long j6, N0 n02) {
        for (s sVar : this.f17335w) {
            if (sVar.S()) {
                return sVar.g(j6, n02);
            }
        }
        return j6;
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public void h(long j6) {
        this.f17338z.h(j6);
    }

    @Override // w1.InterfaceC2211C
    public void l() {
        for (s sVar : this.f17334v) {
            sVar.l();
        }
    }

    @Override // w1.InterfaceC2211C
    public long m(long j6) {
        s[] sVarArr = this.f17335w;
        if (sVarArr.length > 0) {
            boolean j02 = sVarArr[0].j0(j6, false);
            int i6 = 1;
            while (true) {
                s[] sVarArr2 = this.f17335w;
                if (i6 >= sVarArr2.length) {
                    break;
                }
                sVarArr2[i6].j0(j6, j02);
                i6++;
            }
            if (j02) {
                this.f17323k.b();
            }
        }
        return j6;
    }

    @Override // w1.InterfaceC2211C
    public long o(z1.x[] xVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j6) {
        int[] iArr = new int[xVarArr.length];
        int[] iArr2 = new int[xVarArr.length];
        for (int i6 = 0; i6 < xVarArr.length; i6++) {
            b0 b0Var = b0VarArr[i6];
            iArr[i6] = b0Var == null ? -1 : ((Integer) this.f17322j.get(b0Var)).intValue();
            iArr2[i6] = -1;
            z1.x xVar = xVarArr[i6];
            if (xVar != null) {
                H e6 = xVar.e();
                int i7 = 0;
                while (true) {
                    s[] sVarArr = this.f17334v;
                    if (i7 >= sVarArr.length) {
                        break;
                    }
                    if (sVarArr[i7].r().d(e6) != -1) {
                        iArr2[i6] = i7;
                        break;
                    }
                    i7++;
                }
            }
        }
        this.f17322j.clear();
        int length = xVarArr.length;
        b0[] b0VarArr2 = new b0[length];
        b0[] b0VarArr3 = new b0[xVarArr.length];
        z1.x[] xVarArr2 = new z1.x[xVarArr.length];
        s[] sVarArr2 = new s[this.f17334v.length];
        int i8 = 0;
        int i9 = 0;
        boolean z6 = false;
        while (i8 < this.f17334v.length) {
            for (int i10 = 0; i10 < xVarArr.length; i10++) {
                z1.x xVar2 = null;
                b0VarArr3[i10] = iArr[i10] == i8 ? b0VarArr[i10] : null;
                if (iArr2[i10] == i8) {
                    xVar2 = xVarArr[i10];
                }
                xVarArr2[i10] = xVar2;
            }
            s sVar = this.f17334v[i8];
            int[] iArr3 = iArr;
            int i11 = i8;
            int i12 = i9;
            boolean k02 = sVar.k0(xVarArr2, zArr, b0VarArr3, zArr2, j6, z6);
            boolean z7 = false;
            for (int i13 = 0; i13 < xVarArr.length; i13++) {
                b0 b0Var2 = b0VarArr3[i13];
                if (iArr2[i13] == i11) {
                    AbstractC1119a.e(b0Var2);
                    b0VarArr2[i13] = b0Var2;
                    this.f17322j.put(b0Var2, Integer.valueOf(i11));
                    z7 = true;
                } else if (iArr3[i13] == i11) {
                    AbstractC1119a.g(b0Var2 == null);
                }
            }
            if (z7) {
                sVarArr2[i12] = sVar;
                i9 = i12 + 1;
                if (i12 == 0) {
                    sVar.n0(true);
                    if (!k02) {
                        s[] sVarArr3 = this.f17335w;
                        if (sVarArr3.length != 0 && sVar == sVarArr3[0]) {
                        }
                    }
                    this.f17323k.b();
                    z6 = true;
                } else {
                    sVar.n0(i11 < this.f17337y);
                }
            } else {
                i9 = i12;
            }
            i8 = i11 + 1;
            iArr = iArr3;
        }
        System.arraycopy(b0VarArr2, 0, b0VarArr, 0, length);
        s[] sVarArr4 = (s[]) AbstractC1117K.O0(sVarArr2, i9);
        this.f17335w = sVarArr4;
        List t6 = z6.w.t(sVarArr4);
        this.f17338z = this.f17324l.a(t6, G.k(t6, new y6.g() { // from class: m1.l
            public final Object apply(Object obj) {
                List c6;
                c6 = ((s) obj).r().c();
                return c6;
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
        return (l0) AbstractC1119a.e(this.f17333u);
    }

    @Override // w1.InterfaceC2211C
    public void s(InterfaceC2211C.a aVar, long j6) {
        this.f17331s = aVar;
        this.f17314b.k(this);
        x(j6);
    }

    @Override // w1.InterfaceC2211C
    public void t(long j6, boolean z6) {
        for (s sVar : this.f17335w) {
            sVar.t(j6, z6);
        }
    }

    public final void v(long j6, List list, List list2, List list3, Map map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i6 = 0; i6 < list.size(); i6++) {
            String str = ((g.a) list.get(i6)).f17551d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z6 = true;
                for (int i7 = 0; i7 < list.size(); i7++) {
                    if (AbstractC1117K.c(str, ((g.a) list.get(i7)).f17551d)) {
                        g.a aVar = (g.a) list.get(i7);
                        arrayList3.add(Integer.valueOf(i7));
                        arrayList.add(aVar.f17548a);
                        arrayList2.add(aVar.f17549b);
                        z6 &= AbstractC1117K.R(aVar.f17549b.f6986j, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                s y6 = y(str2, 1, (Uri[]) arrayList.toArray((Uri[]) AbstractC1117K.j(new Uri[0])), (Z0.q[]) arrayList2.toArray(new Z0.q[0]), null, Collections.EMPTY_LIST, map, j6);
                list3.add(C6.g.m(arrayList3));
                list2.add(y6);
                if (this.f17325m && z6) {
                    y6.e0(new H[]{new H(str2, (Z0.q[]) arrayList2.toArray(new Z0.q[0]))}, 0, new int[0]);
                }
            }
        }
    }

    public final void w(n1.g gVar, long j6, List list, List list2, Map map) {
        int i6;
        boolean z6;
        boolean z7;
        int size = gVar.f17539e.size();
        int[] iArr = new int[size];
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < gVar.f17539e.size(); i9++) {
            Z0.q qVar = ((g.b) gVar.f17539e.get(i9)).f17553b;
            if (qVar.f6997u > 0 || AbstractC1117K.S(qVar.f6986j, 2) != null) {
                iArr[i9] = 2;
                i7++;
            } else if (AbstractC1117K.S(qVar.f6986j, 1) != null) {
                iArr[i9] = 1;
                i8++;
            } else {
                iArr[i9] = -1;
            }
        }
        if (i7 > 0) {
            i6 = i7;
            z7 = false;
            z6 = true;
        } else if (i8 < size) {
            i6 = size - i8;
            z6 = false;
            z7 = true;
        } else {
            i6 = size;
            z6 = false;
            z7 = false;
        }
        Uri[] uriArr = new Uri[i6];
        Z0.q[] qVarArr = new Z0.q[i6];
        int[] iArr2 = new int[i6];
        int i10 = 0;
        for (int i11 = 0; i11 < gVar.f17539e.size(); i11++) {
            if ((!z6 || iArr[i11] == 2) && (!z7 || iArr[i11] != 1)) {
                g.b bVar = (g.b) gVar.f17539e.get(i11);
                uriArr[i10] = bVar.f17552a;
                qVarArr[i10] = bVar.f17553b;
                iArr2[i10] = i11;
                i10++;
            }
        }
        String str = qVarArr[0].f6986j;
        int R5 = AbstractC1117K.R(str, 2);
        int R6 = AbstractC1117K.R(str, 1);
        boolean z8 = (R6 == 1 || (R6 == 0 && gVar.f17541g.isEmpty())) && R5 <= 1 && R6 + R5 > 0;
        s y6 = y("main", (z6 || R6 <= 0) ? 0 : 1, uriArr, qVarArr, gVar.f17544j, gVar.f17545k, map, j6);
        list.add(y6);
        list2.add(iArr2);
        if (this.f17325m && z8) {
            ArrayList arrayList = new ArrayList();
            if (R5 > 0) {
                Z0.q[] qVarArr2 = new Z0.q[i6];
                for (int i12 = 0; i12 < i6; i12++) {
                    qVarArr2[i12] = B(qVarArr[i12]);
                }
                arrayList.add(new H("main", qVarArr2));
                if (R6 > 0 && (gVar.f17544j != null || gVar.f17541g.isEmpty())) {
                    arrayList.add(new H("main:audio", z(qVarArr[0], gVar.f17544j, false)));
                }
                List list3 = gVar.f17545k;
                if (list3 != null) {
                    for (int i13 = 0; i13 < list3.size(); i13++) {
                        arrayList.add(new H("main:cc:" + i13, this.f17313a.c((Z0.q) list3.get(i13))));
                    }
                }
            } else {
                Z0.q[] qVarArr3 = new Z0.q[i6];
                for (int i14 = 0; i14 < i6; i14++) {
                    qVarArr3[i14] = z(qVarArr[i14], gVar.f17544j, true);
                }
                arrayList.add(new H("main", qVarArr3));
            }
            H h6 = new H("main:id3", new q.b().a0("ID3").o0("application/id3").K());
            arrayList.add(h6);
            y6.e0((H[]) arrayList.toArray(new H[0]), 0, arrayList.indexOf(h6));
        }
    }

    public final void x(long j6) {
        n1.g gVar = (n1.g) AbstractC1119a.e(this.f17314b.h());
        Map A6 = this.f17327o ? A(gVar.f17547m) : Collections.EMPTY_MAP;
        boolean isEmpty = gVar.f17539e.isEmpty();
        List list = gVar.f17541g;
        List list2 = gVar.f17542h;
        this.f17332t = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!isEmpty) {
            w(gVar, j6, arrayList, arrayList2, A6);
        }
        v(j6, list, arrayList, arrayList2, A6);
        this.f17337y = arrayList.size();
        for (int i6 = 0; i6 < list2.size(); i6++) {
            g.a aVar = (g.a) list2.get(i6);
            String str = "subtitle:" + i6 + ":" + aVar.f17551d;
            Z0.q qVar = aVar.f17549b;
            Map map = A6;
            s y6 = y(str, 3, new Uri[]{aVar.f17548a}, new Z0.q[]{qVar}, null, Collections.EMPTY_LIST, map, j6);
            A6 = map;
            arrayList2.add(new int[]{i6});
            arrayList.add(y6);
            y6.e0(new H[]{new H(str, this.f17313a.c(qVar))}, 0, new int[0]);
        }
        this.f17334v = (s[]) arrayList.toArray(new s[0]);
        this.f17336x = (int[][]) arrayList2.toArray(new int[0]);
        this.f17332t = this.f17334v.length;
        for (int i7 = 0; i7 < this.f17337y; i7++) {
            this.f17334v[i7].n0(true);
        }
        for (s sVar : this.f17334v) {
            sVar.C();
        }
        this.f17335w = this.f17334v;
    }

    public final s y(String str, int i6, Uri[] uriArr, Z0.q[] qVarArr, Z0.q qVar, List list, Map map, long j6) {
        return new s(str, i6, this.f17329q, new C1799f(this.f17313a, this.f17314b, uriArr, qVarArr, this.f17315c, this.f17316d, this.f17323k, this.f17330r, list, this.f17328p, null), map, this.f17321i, j6, qVar, this.f17317e, this.f17318f, this.f17319g, this.f17320h, this.f17326n);
    }
}
