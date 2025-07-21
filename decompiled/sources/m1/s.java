package m1;

import A1.k;
import A1.l;
import E1.C0311m;
import E1.J;
import E1.O;
import Z0.C0841m;
import Z0.H;
import Z0.InterfaceC0837i;
import Z0.q;
import Z0.x;
import Z0.y;
import Z0.z;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1144z;
import e1.C1261s;
import g1.C1337i0;
import g1.C1343l0;
import g1.N0;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import l1.t;
import m1.C1799f;
import m1.s;
import w1.C2210B;
import w1.C2239y;
import w1.K;
import w1.a0;
import w1.b0;
import w1.c0;
import w1.l0;
import x1.AbstractC2261e;
import z1.AbstractC2442B;
import z6.D;
import z6.w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class s implements l.b, l.f, c0, E1.r, a0.d {

    /* renamed from: g0, reason: collision with root package name */
    public static final Set f17348g0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: A, reason: collision with root package name */
    public int f17349A;

    /* renamed from: B, reason: collision with root package name */
    public int f17350B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f17351C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f17352D;

    /* renamed from: E, reason: collision with root package name */
    public int f17353E;

    /* renamed from: F, reason: collision with root package name */
    public Z0.q f17354F;

    /* renamed from: G, reason: collision with root package name */
    public Z0.q f17355G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f17356H;

    /* renamed from: I, reason: collision with root package name */
    public l0 f17357I;

    /* renamed from: J, reason: collision with root package name */
    public Set f17358J;

    /* renamed from: K, reason: collision with root package name */
    public int[] f17359K;

    /* renamed from: L, reason: collision with root package name */
    public int f17360L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f17361M;

    /* renamed from: V, reason: collision with root package name */
    public boolean[] f17362V;

    /* renamed from: W, reason: collision with root package name */
    public boolean[] f17363W;

    /* renamed from: X, reason: collision with root package name */
    public long f17364X;

    /* renamed from: Y, reason: collision with root package name */
    public long f17365Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f17366Z;

    /* renamed from: a, reason: collision with root package name */
    public final String f17367a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f17368a0;

    /* renamed from: b, reason: collision with root package name */
    public final int f17369b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f17370b0;

    /* renamed from: c, reason: collision with root package name */
    public final b f17371c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f17372c0;

    /* renamed from: d, reason: collision with root package name */
    public final C1799f f17373d;

    /* renamed from: d0, reason: collision with root package name */
    public long f17374d0;

    /* renamed from: e, reason: collision with root package name */
    public final A1.b f17375e;

    /* renamed from: e0, reason: collision with root package name */
    public C0841m f17376e0;

    /* renamed from: f, reason: collision with root package name */
    public final Z0.q f17377f;

    /* renamed from: f0, reason: collision with root package name */
    public j f17378f0;

    /* renamed from: g, reason: collision with root package name */
    public final l1.u f17379g;

    /* renamed from: h, reason: collision with root package name */
    public final t.a f17380h;

    /* renamed from: i, reason: collision with root package name */
    public final A1.k f17381i;

    /* renamed from: k, reason: collision with root package name */
    public final K.a f17383k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17384l;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f17386n;

    /* renamed from: o, reason: collision with root package name */
    public final List f17387o;

    /* renamed from: p, reason: collision with root package name */
    public final Runnable f17388p;

    /* renamed from: q, reason: collision with root package name */
    public final Runnable f17389q;

    /* renamed from: r, reason: collision with root package name */
    public final Handler f17390r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f17391s;

    /* renamed from: t, reason: collision with root package name */
    public final Map f17392t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC2261e f17393u;

    /* renamed from: v, reason: collision with root package name */
    public d[] f17394v;

    /* renamed from: x, reason: collision with root package name */
    public Set f17396x;

    /* renamed from: y, reason: collision with root package name */
    public SparseIntArray f17397y;

    /* renamed from: z, reason: collision with root package name */
    public O f17398z;

    /* renamed from: j, reason: collision with root package name */
    public final A1.l f17382j = new A1.l("Loader:HlsSampleStreamWrapper");

    /* renamed from: m, reason: collision with root package name */
    public final C1799f.b f17385m = new C1799f.b();

    /* renamed from: w, reason: collision with root package name */
    public int[] f17395w = new int[0];

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b extends c0.a {
        void c();

        void k(Uri uri);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c implements O {

        /* renamed from: g, reason: collision with root package name */
        public static final Z0.q f17399g = new q.b().o0("application/id3").K();

        /* renamed from: h, reason: collision with root package name */
        public static final Z0.q f17400h = new q.b().o0("application/x-emsg").K();

        /* renamed from: a, reason: collision with root package name */
        public final P1.b f17401a = new P1.b();

        /* renamed from: b, reason: collision with root package name */
        public final O f17402b;

        /* renamed from: c, reason: collision with root package name */
        public final Z0.q f17403c;

        /* renamed from: d, reason: collision with root package name */
        public Z0.q f17404d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f17405e;

        /* renamed from: f, reason: collision with root package name */
        public int f17406f;

        public c(O o6, int i6) {
            this.f17402b = o6;
            if (i6 == 1) {
                this.f17403c = f17399g;
            } else {
                if (i6 != 3) {
                    throw new IllegalArgumentException("Unknown metadataType: " + i6);
                }
                this.f17403c = f17400h;
            }
            this.f17405e = new byte[0];
            this.f17406f = 0;
        }

        @Override // E1.O
        public void b(C1144z c1144z, int i6, int i7) {
            h(this.f17406f + i6);
            c1144z.l(this.f17405e, this.f17406f, i6);
            this.f17406f += i6;
        }

        @Override // E1.O
        public int d(InterfaceC0837i interfaceC0837i, int i6, boolean z6, int i7) {
            h(this.f17406f + i6);
            int read = interfaceC0837i.read(this.f17405e, this.f17406f, i6);
            if (read != -1) {
                this.f17406f += read;
                return read;
            }
            if (z6) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // E1.O
        public void e(Z0.q qVar) {
            this.f17404d = qVar;
            this.f17402b.e(this.f17403c);
        }

        @Override // E1.O
        public void f(long j6, int i6, int i7, int i8, O.a aVar) {
            AbstractC1119a.e(this.f17404d);
            C1144z i9 = i(i7, i8);
            if (!AbstractC1117K.c(this.f17404d.f6990n, this.f17403c.f6990n)) {
                if (!"application/x-emsg".equals(this.f17404d.f6990n)) {
                    AbstractC1133o.h("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f17404d.f6990n);
                    return;
                }
                P1.a c6 = this.f17401a.c(i9);
                if (!g(c6)) {
                    AbstractC1133o.h("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f17403c.f6990n, c6.n()));
                    return;
                }
                i9 = new C1144z((byte[]) AbstractC1119a.e(c6.B()));
            }
            int a6 = i9.a();
            this.f17402b.a(i9, a6);
            this.f17402b.f(j6, i6, a6, 0, aVar);
        }

        public final boolean g(P1.a aVar) {
            Z0.q n6 = aVar.n();
            return n6 != null && AbstractC1117K.c(this.f17403c.f6990n, n6.f6990n);
        }

        public final void h(int i6) {
            byte[] bArr = this.f17405e;
            if (bArr.length < i6) {
                this.f17405e = Arrays.copyOf(bArr, i6 + (i6 / 2));
            }
        }

        public final C1144z i(int i6, int i7) {
            int i8 = this.f17406f - i7;
            C1144z c1144z = new C1144z(Arrays.copyOfRange(this.f17405e, i8 - i6, i8));
            byte[] bArr = this.f17405e;
            System.arraycopy(bArr, i8, bArr, 0, i7);
            this.f17406f = i7;
            return c1144z;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends a0 {

        /* renamed from: H, reason: collision with root package name */
        public final Map f17407H;

        /* renamed from: I, reason: collision with root package name */
        public C0841m f17408I;

        @Override // w1.a0, E1.O
        public void f(long j6, int i6, int i7, int i8, O.a aVar) {
            super.f(j6, i6, i7, i8, aVar);
        }

        public final x h0(x xVar) {
            if (xVar == null) {
                return null;
            }
            int f6 = xVar.f();
            int i6 = 0;
            int i7 = 0;
            while (true) {
                if (i7 >= f6) {
                    i7 = -1;
                    break;
                }
                x.b e6 = xVar.e(i7);
                if ((e6 instanceof S1.m) && "com.apple.streaming.transportStreamTimestamp".equals(((S1.m) e6).f4684b)) {
                    break;
                }
                i7++;
            }
            if (i7 == -1) {
                return xVar;
            }
            if (f6 == 1) {
                return null;
            }
            x.b[] bVarArr = new x.b[f6 - 1];
            while (i6 < f6) {
                if (i6 != i7) {
                    bVarArr[i6 < i7 ? i6 : i6 - 1] = xVar.e(i6);
                }
                i6++;
            }
            return new x(bVarArr);
        }

        public void i0(C0841m c0841m) {
            this.f17408I = c0841m;
            J();
        }

        public void j0(j jVar) {
            f0(jVar.f17297k);
        }

        @Override // w1.a0
        public Z0.q x(Z0.q qVar) {
            C0841m c0841m;
            C0841m c0841m2 = this.f17408I;
            if (c0841m2 == null) {
                c0841m2 = qVar.f6994r;
            }
            if (c0841m2 != null && (c0841m = (C0841m) this.f17407H.get(c0841m2.f6921c)) != null) {
                c0841m2 = c0841m;
            }
            x h02 = h0(qVar.f6987k);
            if (c0841m2 != qVar.f6994r || h02 != qVar.f6987k) {
                qVar = qVar.a().U(c0841m2).h0(h02).K();
            }
            return super.x(qVar);
        }

        public d(A1.b bVar, l1.u uVar, t.a aVar, Map map) {
            super(bVar, uVar, aVar);
            this.f17407H = map;
        }
    }

    public s(String str, int i6, b bVar, C1799f c1799f, Map map, A1.b bVar2, long j6, Z0.q qVar, l1.u uVar, t.a aVar, A1.k kVar, K.a aVar2, int i7) {
        this.f17367a = str;
        this.f17369b = i6;
        this.f17371c = bVar;
        this.f17373d = c1799f;
        this.f17392t = map;
        this.f17375e = bVar2;
        this.f17377f = qVar;
        this.f17379g = uVar;
        this.f17380h = aVar;
        this.f17381i = kVar;
        this.f17383k = aVar2;
        this.f17384l = i7;
        Set set = f17348g0;
        this.f17396x = new HashSet(set.size());
        this.f17397y = new SparseIntArray(set.size());
        this.f17394v = new d[0];
        this.f17363W = new boolean[0];
        this.f17362V = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f17386n = arrayList;
        this.f17387o = Collections.unmodifiableList(arrayList);
        this.f17391s = new ArrayList();
        this.f17388p = new Runnable() { // from class: m1.p
            @Override // java.lang.Runnable
            public final void run() {
                s.this.U();
            }
        };
        this.f17389q = new Runnable() { // from class: m1.q
            @Override // java.lang.Runnable
            public final void run() {
                s.this.d0();
            }
        };
        this.f17390r = AbstractC1117K.A();
        this.f17364X = j6;
        this.f17365Y = j6;
    }

    public static C0311m D(int i6, int i7) {
        AbstractC1133o.h("HlsSampleStreamWrapper", "Unmapped track with id " + i6 + " of type " + i7);
        return new C0311m();
    }

    public static Z0.q G(Z0.q qVar, Z0.q qVar2, boolean z6) {
        String d6;
        String str;
        if (qVar == null) {
            return qVar2;
        }
        int k6 = y.k(qVar2.f6990n);
        if (AbstractC1117K.R(qVar.f6986j, k6) == 1) {
            d6 = AbstractC1117K.S(qVar.f6986j, k6);
            str = y.g(d6);
        } else {
            d6 = y.d(qVar.f6986j, qVar2.f6990n);
            str = qVar2.f6990n;
        }
        q.b O5 = qVar2.a().a0(qVar.f6977a).c0(qVar.f6978b).d0(qVar.f6979c).e0(qVar.f6980d).q0(qVar.f6981e).m0(qVar.f6982f).M(z6 ? qVar.f6983g : -1).j0(z6 ? qVar.f6984h : -1).O(d6);
        if (k6 == 2) {
            O5.v0(qVar.f6996t).Y(qVar.f6997u).X(qVar.f6998v);
        }
        if (str != null) {
            O5.o0(str);
        }
        int i6 = qVar.f6966B;
        if (i6 != -1 && k6 == 1) {
            O5.N(i6);
        }
        x xVar = qVar.f6987k;
        if (xVar != null) {
            x xVar2 = qVar2.f6987k;
            if (xVar2 != null) {
                xVar = xVar2.c(xVar);
            }
            O5.h0(xVar);
        }
        return O5.K();
    }

    public static boolean K(Z0.q qVar, Z0.q qVar2) {
        String str = qVar.f6990n;
        String str2 = qVar2.f6990n;
        int k6 = y.k(str);
        if (k6 != 3) {
            return k6 == y.k(str2);
        }
        if (AbstractC1117K.c(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || qVar.f6971G == qVar2.f6971G;
        }
        return false;
    }

    public static int N(int i6) {
        if (i6 == 1) {
            return 2;
        }
        if (i6 != 2) {
            return i6 != 3 ? 0 : 1;
        }
        return 3;
    }

    public static boolean P(AbstractC2261e abstractC2261e) {
        return abstractC2261e instanceof j;
    }

    private boolean Q() {
        return this.f17365Y != -9223372036854775807L;
    }

    public final void A() {
        Z0.q qVar;
        int length = this.f17394v.length;
        int i6 = -2;
        int i7 = -1;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                break;
            }
            String str = ((Z0.q) AbstractC1119a.i(this.f17394v[i8].G())).f6990n;
            int i9 = y.s(str) ? 2 : y.o(str) ? 1 : y.r(str) ? 3 : -2;
            if (N(i9) > N(i6)) {
                i7 = i8;
                i6 = i9;
            } else if (i9 == i6 && i7 != -1) {
                i7 = -1;
            }
            i8++;
        }
        H k6 = this.f17373d.k();
        int i10 = k6.f6702a;
        this.f17360L = -1;
        this.f17359K = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            this.f17359K[i11] = i11;
        }
        H[] hArr = new H[length];
        int i12 = 0;
        while (i12 < length) {
            Z0.q qVar2 = (Z0.q) AbstractC1119a.i(this.f17394v[i12].G());
            if (i12 == i7) {
                Z0.q[] qVarArr = new Z0.q[i10];
                for (int i13 = 0; i13 < i10; i13++) {
                    Z0.q a6 = k6.a(i13);
                    if (i6 == 1 && (qVar = this.f17377f) != null) {
                        a6 = a6.h(qVar);
                    }
                    qVarArr[i13] = i10 == 1 ? qVar2.h(a6) : G(a6, qVar2, true);
                }
                hArr[i12] = new H(this.f17367a, qVarArr);
                this.f17360L = i12;
            } else {
                Z0.q qVar3 = (i6 == 2 && y.o(qVar2.f6990n)) ? this.f17377f : null;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f17367a);
                sb.append(":muxed:");
                sb.append(i12 < i7 ? i12 : i12 - 1);
                hArr[i12] = new H(sb.toString(), G(qVar3, qVar2, false));
            }
            i12++;
        }
        this.f17357I = F(hArr);
        AbstractC1119a.g(this.f17358J == null);
        this.f17358J = Collections.EMPTY_SET;
    }

    public final boolean B(int i6) {
        for (int i7 = i6; i7 < this.f17386n.size(); i7++) {
            if (((j) this.f17386n.get(i7)).f17300n) {
                return false;
            }
        }
        j jVar = (j) this.f17386n.get(i6);
        for (int i8 = 0; i8 < this.f17394v.length; i8++) {
            if (this.f17394v[i8].D() > jVar.m(i8)) {
                return false;
            }
        }
        return true;
    }

    public void C() {
        if (this.f17352D) {
            return;
        }
        b(new C1343l0.b().f(this.f17364X).d());
    }

    public final a0 E(int i6, int i7) {
        int length = this.f17394v.length;
        boolean z6 = true;
        if (i7 != 1 && i7 != 2) {
            z6 = false;
        }
        d dVar = new d(this.f17375e, this.f17379g, this.f17380h, this.f17392t);
        dVar.b0(this.f17364X);
        if (z6) {
            dVar.i0(this.f17376e0);
        }
        dVar.a0(this.f17374d0);
        j jVar = this.f17378f0;
        if (jVar != null) {
            dVar.j0(jVar);
        }
        dVar.d0(this);
        int i8 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f17395w, i8);
        this.f17395w = copyOf;
        copyOf[length] = i6;
        this.f17394v = (d[]) AbstractC1117K.M0(this.f17394v, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.f17363W, i8);
        this.f17363W = copyOf2;
        copyOf2[length] = z6;
        this.f17361M |= z6;
        this.f17396x.add(Integer.valueOf(i7));
        this.f17397y.append(i7, length);
        if (N(i7) > N(this.f17349A)) {
            this.f17350B = length;
            this.f17349A = i7;
        }
        this.f17362V = Arrays.copyOf(this.f17362V, i8);
        return dVar;
    }

    public final l0 F(H[] hArr) {
        for (int i6 = 0; i6 < hArr.length; i6++) {
            H h6 = hArr[i6];
            Z0.q[] qVarArr = new Z0.q[h6.f6702a];
            for (int i7 = 0; i7 < h6.f6702a; i7++) {
                Z0.q a6 = h6.a(i7);
                qVarArr[i7] = a6.b(this.f17379g.c(a6));
            }
            hArr[i6] = new H(h6.f6703b, qVarArr);
        }
        return new l0(hArr);
    }

    public final void H(int i6) {
        AbstractC1119a.g(!this.f17382j.j());
        while (true) {
            if (i6 >= this.f17386n.size()) {
                i6 = -1;
                break;
            } else if (B(i6)) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 == -1) {
            return;
        }
        long j6 = L().f20437h;
        j I6 = I(i6);
        if (this.f17386n.isEmpty()) {
            this.f17365Y = this.f17364X;
        } else {
            ((j) D.d(this.f17386n)).o();
        }
        this.f17370b0 = false;
        this.f17383k.w(this.f17349A, I6.f20436g, j6);
    }

    public final j I(int i6) {
        j jVar = (j) this.f17386n.get(i6);
        ArrayList arrayList = this.f17386n;
        AbstractC1117K.U0(arrayList, i6, arrayList.size());
        for (int i7 = 0; i7 < this.f17394v.length; i7++) {
            this.f17394v[i7].u(jVar.m(i7));
        }
        return jVar;
    }

    public final boolean J(j jVar) {
        int i6 = jVar.f17297k;
        int length = this.f17394v.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (this.f17362V[i7] && this.f17394v[i7].Q() == i6) {
                return false;
            }
        }
        return true;
    }

    public final j L() {
        return (j) this.f17386n.get(r0.size() - 1);
    }

    public final O M(int i6, int i7) {
        AbstractC1119a.a(f17348g0.contains(Integer.valueOf(i7)));
        int i8 = this.f17397y.get(i7, -1);
        if (i8 == -1) {
            return null;
        }
        if (this.f17396x.add(Integer.valueOf(i7))) {
            this.f17395w[i8] = i6;
        }
        return this.f17395w[i8] == i6 ? this.f17394v[i8] : D(i6, i7);
    }

    public final void O(j jVar) {
        this.f17378f0 = jVar;
        this.f17354F = jVar.f20433d;
        this.f17365Y = -9223372036854775807L;
        this.f17386n.add(jVar);
        w.a o6 = z6.w.o();
        for (d dVar : this.f17394v) {
            o6.h(Integer.valueOf(dVar.H()));
        }
        jVar.n(this, o6.k());
        for (d dVar2 : this.f17394v) {
            dVar2.j0(jVar);
            if (jVar.f17300n) {
                dVar2.g0();
            }
        }
    }

    public boolean R(int i6) {
        return !Q() && this.f17394v[i6].L(this.f17370b0);
    }

    public boolean S() {
        return this.f17349A == 2;
    }

    public final void T() {
        int i6 = this.f17357I.f20070a;
        int[] iArr = new int[i6];
        this.f17359K = iArr;
        Arrays.fill(iArr, -1);
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = 0;
            while (true) {
                d[] dVarArr = this.f17394v;
                if (i8 >= dVarArr.length) {
                    break;
                }
                if (K((Z0.q) AbstractC1119a.i(dVarArr[i8].G()), this.f17357I.b(i7).a(0))) {
                    this.f17359K[i7] = i8;
                    break;
                }
                i8++;
            }
        }
        Iterator it = this.f17391s.iterator();
        while (it.hasNext()) {
            ((n) it.next()).b();
        }
    }

    public final void U() {
        if (!this.f17356H && this.f17359K == null && this.f17351C) {
            for (d dVar : this.f17394v) {
                if (dVar.G() == null) {
                    return;
                }
            }
            if (this.f17357I != null) {
                T();
                return;
            }
            A();
            m0();
            this.f17371c.c();
        }
    }

    public void V() {
        this.f17382j.a();
        this.f17373d.p();
    }

    public void W(int i6) {
        V();
        this.f17394v[i6].N();
    }

    @Override // A1.l.b
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public void u(AbstractC2261e abstractC2261e, long j6, long j7, boolean z6) {
        this.f17393u = null;
        C2239y c2239y = new C2239y(abstractC2261e.f20430a, abstractC2261e.f20431b, abstractC2261e.f(), abstractC2261e.e(), j6, j7, abstractC2261e.b());
        this.f17381i.b(abstractC2261e.f20430a);
        this.f17383k.k(c2239y, abstractC2261e.f20432c, this.f17369b, abstractC2261e.f20433d, abstractC2261e.f20434e, abstractC2261e.f20435f, abstractC2261e.f20436g, abstractC2261e.f20437h);
        if (z6) {
            return;
        }
        if (Q() || this.f17353E == 0) {
            h0();
        }
        if (this.f17353E > 0) {
            this.f17371c.j(this);
        }
    }

    @Override // A1.l.b
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void j(AbstractC2261e abstractC2261e, long j6, long j7) {
        this.f17393u = null;
        this.f17373d.r(abstractC2261e);
        C2239y c2239y = new C2239y(abstractC2261e.f20430a, abstractC2261e.f20431b, abstractC2261e.f(), abstractC2261e.e(), j6, j7, abstractC2261e.b());
        this.f17381i.b(abstractC2261e.f20430a);
        this.f17383k.n(c2239y, abstractC2261e.f20432c, this.f17369b, abstractC2261e.f20433d, abstractC2261e.f20434e, abstractC2261e.f20435f, abstractC2261e.f20436g, abstractC2261e.f20437h);
        if (this.f17352D) {
            this.f17371c.j(this);
        } else {
            b(new C1343l0.b().f(this.f17364X).d());
        }
    }

    @Override // A1.l.b
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public l.c q(AbstractC2261e abstractC2261e, long j6, long j7, IOException iOException, int i6) {
        l.c h6;
        int i7;
        boolean P5 = P(abstractC2261e);
        if (P5 && !((j) abstractC2261e).q() && (iOException instanceof C1261s) && ((i7 = ((C1261s) iOException).f13888d) == 410 || i7 == 404)) {
            return A1.l.f137d;
        }
        long b6 = abstractC2261e.b();
        C2239y c2239y = new C2239y(abstractC2261e.f20430a, abstractC2261e.f20431b, abstractC2261e.f(), abstractC2261e.e(), j6, j7, b6);
        k.c cVar = new k.c(c2239y, new C2210B(abstractC2261e.f20432c, this.f17369b, abstractC2261e.f20433d, abstractC2261e.f20434e, abstractC2261e.f20435f, AbstractC1117K.k1(abstractC2261e.f20436g), AbstractC1117K.k1(abstractC2261e.f20437h)), iOException, i6);
        k.b c6 = this.f17381i.c(AbstractC2442B.c(this.f17373d.l()), cVar);
        boolean o6 = (c6 == null || c6.f131a != 2) ? false : this.f17373d.o(abstractC2261e, c6.f132b);
        if (o6) {
            if (P5 && b6 == 0) {
                ArrayList arrayList = this.f17386n;
                AbstractC1119a.g(((j) arrayList.remove(arrayList.size() - 1)) == abstractC2261e);
                if (this.f17386n.isEmpty()) {
                    this.f17365Y = this.f17364X;
                } else {
                    ((j) D.d(this.f17386n)).o();
                }
            }
            h6 = A1.l.f139f;
        } else {
            long a6 = this.f17381i.a(cVar);
            h6 = a6 != -9223372036854775807L ? A1.l.h(false, a6) : A1.l.f140g;
        }
        l.c cVar2 = h6;
        boolean c7 = cVar2.c();
        this.f17383k.p(c2239y, abstractC2261e.f20432c, this.f17369b, abstractC2261e.f20433d, abstractC2261e.f20434e, abstractC2261e.f20435f, abstractC2261e.f20436g, abstractC2261e.f20437h, iOException, !c7);
        if (!c7) {
            this.f17393u = null;
            this.f17381i.b(abstractC2261e.f20430a);
        }
        if (o6) {
            if (!this.f17352D) {
                b(new C1343l0.b().f(this.f17364X).d());
                return cVar2;
            }
            this.f17371c.j(this);
        }
        return cVar2;
    }

    @Override // E1.r
    public O a(int i6, int i7) {
        O o6;
        if (!f17348g0.contains(Integer.valueOf(i7))) {
            int i8 = 0;
            while (true) {
                O[] oArr = this.f17394v;
                if (i8 >= oArr.length) {
                    o6 = null;
                    break;
                }
                if (this.f17395w[i8] == i6) {
                    o6 = oArr[i8];
                    break;
                }
                i8++;
            }
        } else {
            o6 = M(i6, i7);
        }
        if (o6 == null) {
            if (this.f17372c0) {
                return D(i6, i7);
            }
            o6 = E(i6, i7);
        }
        if (i7 != 5) {
            return o6;
        }
        if (this.f17398z == null) {
            this.f17398z = new c(o6, this.f17384l);
        }
        return this.f17398z;
    }

    public void a0() {
        this.f17396x.clear();
    }

    @Override // w1.c0
    public boolean b(C1343l0 c1343l0) {
        List list;
        long max;
        if (this.f17370b0 || this.f17382j.j() || this.f17382j.i()) {
            return false;
        }
        if (Q()) {
            list = Collections.EMPTY_LIST;
            max = this.f17365Y;
            for (d dVar : this.f17394v) {
                dVar.b0(this.f17365Y);
            }
        } else {
            list = this.f17387o;
            j L5 = L();
            max = L5.h() ? L5.f20437h : Math.max(this.f17364X, L5.f20436g);
        }
        List list2 = list;
        long j6 = max;
        this.f17385m.a();
        this.f17373d.f(c1343l0, j6, list2, this.f17352D || !list2.isEmpty(), this.f17385m);
        C1799f.b bVar = this.f17385m;
        boolean z6 = bVar.f17270b;
        AbstractC2261e abstractC2261e = bVar.f17269a;
        Uri uri = bVar.f17271c;
        if (z6) {
            this.f17365Y = -9223372036854775807L;
            this.f17370b0 = true;
            return true;
        }
        if (abstractC2261e == null) {
            if (uri != null) {
                this.f17371c.k(uri);
            }
            return false;
        }
        if (P(abstractC2261e)) {
            O((j) abstractC2261e);
        }
        this.f17393u = abstractC2261e;
        this.f17383k.t(new C2239y(abstractC2261e.f20430a, abstractC2261e.f20431b, this.f17382j.n(abstractC2261e, this, this.f17381i.d(abstractC2261e.f20432c))), abstractC2261e.f20432c, this.f17369b, abstractC2261e.f20433d, abstractC2261e.f20434e, abstractC2261e.f20435f, abstractC2261e.f20436g, abstractC2261e.f20437h);
        return true;
    }

    public boolean b0(Uri uri, k.c cVar, boolean z6) {
        k.b c6;
        if (!this.f17373d.q(uri)) {
            return true;
        }
        long j6 = (z6 || (c6 = this.f17381i.c(AbstractC2442B.c(this.f17373d.l()), cVar)) == null || c6.f131a != 2) ? -9223372036854775807L : c6.f132b;
        return this.f17373d.s(uri, j6) && j6 != -9223372036854775807L;
    }

    @Override // w1.a0.d
    public void c(Z0.q qVar) {
        this.f17390r.post(this.f17388p);
    }

    public void c0() {
        if (this.f17386n.isEmpty()) {
            return;
        }
        final j jVar = (j) D.d(this.f17386n);
        int d6 = this.f17373d.d(jVar);
        if (d6 == 1) {
            jVar.v();
            return;
        }
        if (d6 == 0) {
            this.f17390r.post(new Runnable() { // from class: m1.o
                @Override // java.lang.Runnable
                public final void run() {
                    s.this.f17371c.k(jVar.f17299m);
                }
            });
        } else if (d6 == 2 && !this.f17370b0 && this.f17382j.j()) {
            this.f17382j.f();
        }
    }

    @Override // w1.c0
    public long d() {
        if (Q()) {
            return this.f17365Y;
        }
        if (this.f17370b0) {
            return Long.MIN_VALUE;
        }
        return L().f20437h;
    }

    public final void d0() {
        this.f17351C = true;
        U();
    }

    @Override // w1.c0
    public boolean e() {
        return this.f17382j.j();
    }

    public void e0(H[] hArr, int i6, int... iArr) {
        this.f17357I = F(hArr);
        this.f17358J = new HashSet();
        for (int i7 : iArr) {
            this.f17358J.add(this.f17357I.b(i7));
        }
        this.f17360L = i6;
        Handler handler = this.f17390r;
        final b bVar = this.f17371c;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: m1.r
            @Override // java.lang.Runnable
            public final void run() {
                s.b.this.c();
            }
        });
        m0();
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:489)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:492)
        */
    @Override // w1.c0
    public long f() {
        /*
            r7 = this;
            boolean r0 = r7.f17370b0
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.Q()
            if (r0 == 0) goto L10
            long r0 = r7.f17365Y
            return r0
        L10:
            long r0 = r7.f17364X
            m1.j r2 = r7.L()
            boolean r3 = r2.h()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.ArrayList r2 = r7.f17386n
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L35
            java.util.ArrayList r2 = r7.f17386n
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            m1.j r2 = (m1.j) r2
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 == 0) goto L3e
            long r2 = r2.f20437h
            long r0 = java.lang.Math.max(r0, r2)
        L3e:
            boolean r2 = r7.f17351C
            if (r2 == 0) goto L55
            m1.s$d[] r2 = r7.f17394v
            int r3 = r2.length
            r4 = 0
        L46:
            if (r4 >= r3) goto L55
            r5 = r2[r4]
            long r5 = r5.A()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L46
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.s.f():long");
    }

    public int f0(int i6, C1337i0 c1337i0, f1.f fVar, int i7) {
        if (Q()) {
            return -3;
        }
        int i8 = 0;
        if (!this.f17386n.isEmpty()) {
            int i9 = 0;
            while (i9 < this.f17386n.size() - 1 && J((j) this.f17386n.get(i9))) {
                i9++;
            }
            AbstractC1117K.U0(this.f17386n, 0, i9);
            j jVar = (j) this.f17386n.get(0);
            Z0.q qVar = jVar.f20433d;
            if (!qVar.equals(this.f17355G)) {
                this.f17383k.h(this.f17369b, qVar, jVar.f20434e, jVar.f20435f, jVar.f20436g);
            }
            this.f17355G = qVar;
        }
        if (!this.f17386n.isEmpty() && !((j) this.f17386n.get(0)).q()) {
            return -3;
        }
        int S5 = this.f17394v[i6].S(c1337i0, fVar, i7, this.f17370b0);
        if (S5 == -5) {
            Z0.q qVar2 = (Z0.q) AbstractC1119a.e(c1337i0.f14685b);
            if (i6 == this.f17350B) {
                int d6 = C6.g.d(this.f17394v[i6].Q());
                while (i8 < this.f17386n.size() && ((j) this.f17386n.get(i8)).f17297k != d6) {
                    i8++;
                }
                qVar2 = qVar2.h(i8 < this.f17386n.size() ? ((j) this.f17386n.get(i8)).f20433d : (Z0.q) AbstractC1119a.e(this.f17354F));
            }
            c1337i0.f14685b = qVar2;
        }
        return S5;
    }

    public long g(long j6, N0 n02) {
        return this.f17373d.c(j6, n02);
    }

    public void g0() {
        if (this.f17352D) {
            for (d dVar : this.f17394v) {
                dVar.R();
            }
        }
        this.f17373d.t();
        this.f17382j.m(this);
        this.f17390r.removeCallbacksAndMessages(null);
        this.f17356H = true;
        this.f17391s.clear();
    }

    @Override // w1.c0
    public void h(long j6) {
        if (this.f17382j.i() || Q()) {
            return;
        }
        if (this.f17382j.j()) {
            AbstractC1119a.e(this.f17393u);
            if (this.f17373d.x(j6, this.f17393u, this.f17387o)) {
                this.f17382j.f();
                return;
            }
            return;
        }
        int size = this.f17387o.size();
        while (size > 0 && this.f17373d.d((j) this.f17387o.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f17387o.size()) {
            H(size);
        }
        int i6 = this.f17373d.i(j6, this.f17387o);
        if (i6 < this.f17386n.size()) {
            H(i6);
        }
    }

    public final void h0() {
        for (d dVar : this.f17394v) {
            dVar.W(this.f17366Z);
        }
        this.f17366Z = false;
    }

    @Override // A1.l.f
    public void i() {
        for (d dVar : this.f17394v) {
            dVar.T();
        }
    }

    public final boolean i0(long j6, j jVar) {
        int length = this.f17394v.length;
        for (int i6 = 0; i6 < length; i6++) {
            d dVar = this.f17394v[i6];
            if (!(jVar != null ? dVar.Y(jVar.m(i6)) : dVar.Z(j6, false)) && (this.f17363W[i6] || !this.f17361M)) {
                return false;
            }
        }
        return true;
    }

    public boolean j0(long j6, boolean z6) {
        j jVar;
        this.f17364X = j6;
        if (Q()) {
            this.f17365Y = j6;
            return true;
        }
        if (this.f17373d.m()) {
            for (int i6 = 0; i6 < this.f17386n.size(); i6++) {
                jVar = (j) this.f17386n.get(i6);
                if (jVar.f20436g == j6) {
                    break;
                }
            }
        }
        jVar = null;
        if (this.f17351C && !z6 && i0(j6, jVar)) {
            return false;
        }
        this.f17365Y = j6;
        this.f17370b0 = false;
        this.f17386n.clear();
        if (this.f17382j.j()) {
            if (this.f17351C) {
                for (d dVar : this.f17394v) {
                    dVar.r();
                }
            }
            this.f17382j.f();
        } else {
            this.f17382j.g();
            h0();
        }
        return true;
    }

    @Override // E1.r
    public void k() {
        this.f17372c0 = true;
        this.f17390r.post(this.f17389q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x010d, code lost:
    
        if (r1.m() != r13.f17373d.k().b(r14.f20433d)) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k0(z1.x[] r14, boolean[] r15, w1.b0[] r16, boolean[] r17, long r18, boolean r20) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.s.k0(z1.x[], boolean[], w1.b0[], boolean[], long, boolean):boolean");
    }

    public void l() {
        V();
        if (this.f17370b0 && !this.f17352D) {
            throw z.a("Loading finished before preparation is complete.", null);
        }
    }

    public void l0(C0841m c0841m) {
        if (AbstractC1117K.c(this.f17376e0, c0841m)) {
            return;
        }
        this.f17376e0 = c0841m;
        int i6 = 0;
        while (true) {
            d[] dVarArr = this.f17394v;
            if (i6 >= dVarArr.length) {
                return;
            }
            if (this.f17363W[i6]) {
                dVarArr[i6].i0(c0841m);
            }
            i6++;
        }
    }

    public final void m0() {
        this.f17352D = true;
    }

    @Override // E1.r
    public void n(J j6) {
    }

    public void n0(boolean z6) {
        this.f17373d.v(z6);
    }

    public void o0(long j6) {
        if (this.f17374d0 != j6) {
            this.f17374d0 = j6;
            for (d dVar : this.f17394v) {
                dVar.a0(j6);
            }
        }
    }

    public int p0(int i6, long j6) {
        if (Q()) {
            return 0;
        }
        d dVar = this.f17394v[i6];
        int F6 = dVar.F(j6, this.f17370b0);
        j jVar = (j) D.e(this.f17386n, (Object) null);
        if (jVar != null && !jVar.q()) {
            F6 = Math.min(F6, jVar.m(i6) - dVar.D());
        }
        dVar.e0(F6);
        return F6;
    }

    public void q0(int i6) {
        y();
        AbstractC1119a.e(this.f17359K);
        int i7 = this.f17359K[i6];
        AbstractC1119a.g(this.f17362V[i7]);
        this.f17362V[i7] = false;
    }

    public l0 r() {
        y();
        return this.f17357I;
    }

    public final void r0(b0[] b0VarArr) {
        this.f17391s.clear();
        for (b0 b0Var : b0VarArr) {
            if (b0Var != null) {
                this.f17391s.add((n) b0Var);
            }
        }
    }

    public void t(long j6, boolean z6) {
        if (!this.f17351C || Q()) {
            return;
        }
        int length = this.f17394v.length;
        for (int i6 = 0; i6 < length; i6++) {
            this.f17394v[i6].q(j6, z6, this.f17362V[i6]);
        }
    }

    public final void y() {
        AbstractC1119a.g(this.f17352D);
        AbstractC1119a.e(this.f17357I);
        AbstractC1119a.e(this.f17358J);
    }

    public int z(int i6) {
        y();
        AbstractC1119a.e(this.f17359K);
        int i7 = this.f17359K[i6];
        if (i7 == -1) {
            return this.f17358J.contains(this.f17357I.b(i6)) ? -3 : -2;
        }
        boolean[] zArr = this.f17362V;
        if (zArr[i7]) {
            return -2;
        }
        zArr[i7] = true;
        return i7;
    }
}
