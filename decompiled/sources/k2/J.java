package k2;

import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.J;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import b2.s;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1111E;
import c1.C1143y;
import c1.C1144z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k2.K;
import kotlin.io.ConstantsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class J implements InterfaceC0314p {

    /* renamed from: v, reason: collision with root package name */
    public static final E1.u f16456v = new E1.u() { // from class: k2.I
        @Override // E1.u
        public final InterfaceC0314p[] c() {
            return J.b();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f16457a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16458b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16459c;

    /* renamed from: d, reason: collision with root package name */
    public final List f16460d;

    /* renamed from: e, reason: collision with root package name */
    public final C1144z f16461e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseIntArray f16462f;

    /* renamed from: g, reason: collision with root package name */
    public final K.c f16463g;

    /* renamed from: h, reason: collision with root package name */
    public final s.a f16464h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseArray f16465i;

    /* renamed from: j, reason: collision with root package name */
    public final SparseBooleanArray f16466j;

    /* renamed from: k, reason: collision with root package name */
    public final SparseBooleanArray f16467k;

    /* renamed from: l, reason: collision with root package name */
    public final H f16468l;

    /* renamed from: m, reason: collision with root package name */
    public G f16469m;

    /* renamed from: n, reason: collision with root package name */
    public E1.r f16470n;

    /* renamed from: o, reason: collision with root package name */
    public int f16471o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16472p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16473q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16474r;

    /* renamed from: s, reason: collision with root package name */
    public K f16475s;

    /* renamed from: t, reason: collision with root package name */
    public int f16476t;

    /* renamed from: u, reason: collision with root package name */
    public int f16477u;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements InterfaceC1666D {

        /* renamed from: a, reason: collision with root package name */
        public final C1143y f16478a = new C1143y(new byte[4]);

        public a() {
        }

        @Override // k2.InterfaceC1666D
        public void a(C1144z c1144z) {
            if (c1144z.G() == 0 && (c1144z.G() & 128) != 0) {
                c1144z.U(6);
                int a6 = c1144z.a() / 4;
                for (int i6 = 0; i6 < a6; i6++) {
                    c1144z.k(this.f16478a, 4);
                    int h6 = this.f16478a.h(16);
                    this.f16478a.r(3);
                    if (h6 == 0) {
                        this.f16478a.r(13);
                    } else {
                        int h7 = this.f16478a.h(13);
                        if (J.this.f16465i.get(h7) == null) {
                            J.this.f16465i.put(h7, new E(new b(h7)));
                            J.m(J.this);
                        }
                    }
                }
                if (J.this.f16457a != 2) {
                    J.this.f16465i.remove(0);
                }
            }
        }

        @Override // k2.InterfaceC1666D
        public void c(C1111E c1111e, E1.r rVar, K.d dVar) {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements InterfaceC1666D {

        /* renamed from: a, reason: collision with root package name */
        public final C1143y f16480a = new C1143y(new byte[5]);

        /* renamed from: b, reason: collision with root package name */
        public final SparseArray f16481b = new SparseArray();

        /* renamed from: c, reason: collision with root package name */
        public final SparseIntArray f16482c = new SparseIntArray();

        /* renamed from: d, reason: collision with root package name */
        public final int f16483d;

        public b(int i6) {
            this.f16483d = i6;
        }

        @Override // k2.InterfaceC1666D
        public void a(C1144z c1144z) {
            C1111E c1111e;
            if (c1144z.G() != 2) {
                return;
            }
            if (J.this.f16457a == 1 || J.this.f16457a == 2 || J.this.f16471o == 1) {
                c1111e = (C1111E) J.this.f16460d.get(0);
            } else {
                c1111e = new C1111E(((C1111E) J.this.f16460d.get(0)).d());
                J.this.f16460d.add(c1111e);
            }
            if ((c1144z.G() & 128) == 0) {
                return;
            }
            c1144z.U(1);
            int M5 = c1144z.M();
            int i6 = 3;
            c1144z.U(3);
            c1144z.k(this.f16480a, 2);
            this.f16480a.r(3);
            int i7 = 13;
            J.this.f16477u = this.f16480a.h(13);
            c1144z.k(this.f16480a, 2);
            int i8 = 4;
            this.f16480a.r(4);
            c1144z.U(this.f16480a.h(12));
            if (J.this.f16457a == 2 && J.this.f16475s == null) {
                K.b bVar = new K.b(21, null, 0, null, AbstractC1117K.f10565f);
                J j6 = J.this;
                j6.f16475s = j6.f16463g.b(21, bVar);
                if (J.this.f16475s != null) {
                    J.this.f16475s.c(c1111e, J.this.f16470n, new K.d(M5, 21, ConstantsKt.DEFAULT_BUFFER_SIZE));
                }
            }
            this.f16481b.clear();
            this.f16482c.clear();
            int a6 = c1144z.a();
            while (a6 > 0) {
                c1144z.k(this.f16480a, 5);
                int h6 = this.f16480a.h(8);
                this.f16480a.r(i6);
                int h7 = this.f16480a.h(i7);
                this.f16480a.r(i8);
                int h8 = this.f16480a.h(12);
                K.b b6 = b(c1144z, h8);
                if (h6 == 6 || h6 == 5) {
                    h6 = b6.f16488a;
                }
                a6 -= h8 + 5;
                int i9 = J.this.f16457a == 2 ? h6 : h7;
                if (!J.this.f16466j.get(i9)) {
                    K b7 = (J.this.f16457a == 2 && h6 == 21) ? J.this.f16475s : J.this.f16463g.b(h6, b6);
                    if (J.this.f16457a != 2 || h7 < this.f16482c.get(i9, ConstantsKt.DEFAULT_BUFFER_SIZE)) {
                        this.f16482c.put(i9, h7);
                        this.f16481b.put(i9, b7);
                    }
                }
                i6 = 3;
                i8 = 4;
                i7 = 13;
            }
            int size = this.f16482c.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f16482c.keyAt(i10);
                int valueAt = this.f16482c.valueAt(i10);
                J.this.f16466j.put(keyAt, true);
                J.this.f16467k.put(valueAt, true);
                K k6 = (K) this.f16481b.valueAt(i10);
                if (k6 != null) {
                    if (k6 != J.this.f16475s) {
                        k6.c(c1111e, J.this.f16470n, new K.d(M5, keyAt, ConstantsKt.DEFAULT_BUFFER_SIZE));
                    }
                    J.this.f16465i.put(valueAt, k6);
                }
            }
            if (J.this.f16457a == 2) {
                if (J.this.f16472p) {
                    return;
                }
                J.this.f16470n.k();
                J.this.f16471o = 0;
                J.this.f16472p = true;
                return;
            }
            J.this.f16465i.remove(this.f16483d);
            J j7 = J.this;
            j7.f16471o = j7.f16457a == 1 ? 0 : J.this.f16471o - 1;
            if (J.this.f16471o == 0) {
                J.this.f16470n.k();
                J.this.f16472p = true;
            }
        }

        public final K.b b(C1144z c1144z, int i6) {
            int i7;
            int f6 = c1144z.f();
            int i8 = f6 + i6;
            int i9 = -1;
            String str = null;
            ArrayList arrayList = null;
            int i10 = 0;
            while (c1144z.f() < i8) {
                int G6 = c1144z.G();
                int f7 = c1144z.f() + c1144z.G();
                if (f7 > i8) {
                    break;
                }
                if (G6 == 5) {
                    long I6 = c1144z.I();
                    if (I6 != 1094921523) {
                        if (I6 != 1161904947) {
                            if (I6 != 1094921524) {
                                if (I6 == 1212503619) {
                                    i9 = 36;
                                }
                            }
                            i9 = 172;
                        }
                        i9 = 135;
                    }
                    i9 = 129;
                } else {
                    if (G6 != 106) {
                        if (G6 != 122) {
                            if (G6 == 127) {
                                int G7 = c1144z.G();
                                if (G7 != 21) {
                                    if (G7 == 14) {
                                        i9 = 136;
                                    } else if (G7 == 33) {
                                        i9 = 139;
                                    }
                                }
                                i9 = 172;
                            } else {
                                if (G6 == 123) {
                                    i7 = 138;
                                } else if (G6 == 10) {
                                    String trim = c1144z.D(3).trim();
                                    i10 = c1144z.G();
                                    str = trim;
                                } else if (G6 == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (c1144z.f() < f7) {
                                        String trim2 = c1144z.D(3).trim();
                                        int G8 = c1144z.G();
                                        byte[] bArr = new byte[4];
                                        c1144z.l(bArr, 0, 4);
                                        arrayList2.add(new K.a(trim2, G8, bArr));
                                    }
                                    arrayList = arrayList2;
                                    i9 = 89;
                                } else if (G6 == 111) {
                                    i7 = 257;
                                }
                                i9 = i7;
                            }
                        }
                        i9 = 135;
                    }
                    i9 = 129;
                }
                c1144z.U(f7 - c1144z.f());
            }
            c1144z.T(i8);
            return new K.b(i9, str, i10, arrayList, Arrays.copyOfRange(c1144z.e(), f6, i8));
        }

        @Override // k2.InterfaceC1666D
        public void c(C1111E c1111e, E1.r rVar, K.d dVar) {
        }
    }

    public J(int i6, s.a aVar) {
        this(1, i6, aVar, new C1111E(0L), new C1676j(0), 112800);
    }

    public static /* synthetic */ InterfaceC0314p[] b() {
        return new InterfaceC0314p[]{new J(1, s.a.f10491a)};
    }

    public static /* synthetic */ int m(J j6) {
        int i6 = j6.f16471o;
        j6.f16471o = i6 + 1;
        return i6;
    }

    private void y(long j6) {
        if (this.f16473q) {
            return;
        }
        this.f16473q = true;
        if (this.f16468l.b() == -9223372036854775807L) {
            this.f16470n.n(new J.b(this.f16468l.b()));
            return;
        }
        G g6 = new G(this.f16468l.c(), this.f16468l.b(), j6, this.f16477u, this.f16459c);
        this.f16469m = g6;
        this.f16470n.n(g6.b());
    }

    public final boolean A(int i6) {
        return this.f16457a == 2 || this.f16472p || !this.f16467k.get(i6, false);
    }

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        G g6;
        AbstractC1119a.g(this.f16457a != 2);
        int size = this.f16460d.size();
        for (int i6 = 0; i6 < size; i6++) {
            C1111E c1111e = (C1111E) this.f16460d.get(i6);
            boolean z6 = c1111e.f() == -9223372036854775807L;
            if (!z6) {
                long d6 = c1111e.d();
                z6 = (d6 == -9223372036854775807L || d6 == 0 || d6 == j7) ? false : true;
            }
            if (z6) {
                c1111e.i(j7);
            }
        }
        if (j7 != 0 && (g6 = this.f16469m) != null) {
            g6.h(j7);
        }
        this.f16461e.P(0);
        this.f16462f.clear();
        for (int i7 = 0; i7 < this.f16465i.size(); i7++) {
            ((K) this.f16465i.valueAt(i7)).b();
        }
        this.f16476t = 0;
    }

    @Override // E1.InterfaceC0314p
    public void c(E1.r rVar) {
        if ((this.f16458b & 1) == 0) {
            rVar = new b2.u(rVar, this.f16464h);
        }
        this.f16470n = rVar;
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, E1.I i6) {
        int i7;
        long a6 = interfaceC0315q.a();
        boolean z6 = this.f16457a == 2;
        if (this.f16472p) {
            if (a6 != -1 && !z6 && !this.f16468l.d()) {
                return this.f16468l.e(interfaceC0315q, i6, this.f16477u);
            }
            y(a6);
            if (this.f16474r) {
                this.f16474r = false;
                a(0L, 0L);
                if (interfaceC0315q.getPosition() != 0) {
                    i6.f910a = 0L;
                    return 1;
                }
            }
            G g6 = this.f16469m;
            if (g6 != null && g6.d()) {
                return this.f16469m.c(interfaceC0315q, i6);
            }
        }
        if (!w(interfaceC0315q)) {
            for (int i8 = 0; i8 < this.f16465i.size(); i8++) {
                K k6 = (K) this.f16465i.valueAt(i8);
                if (k6 instanceof y) {
                    y yVar = (y) k6;
                    if (yVar.d(z6)) {
                        yVar.a(new C1144z(), 1);
                    }
                }
            }
            return -1;
        }
        int x6 = x();
        int g7 = this.f16461e.g();
        if (x6 > g7) {
            return 0;
        }
        int p6 = this.f16461e.p();
        if ((8388608 & p6) != 0) {
            this.f16461e.T(x6);
            return 0;
        }
        int i9 = (4194304 & p6) != 0 ? 1 : 0;
        int i10 = (2096896 & p6) >> 8;
        boolean z7 = (p6 & 32) != 0;
        K k7 = (p6 & 16) != 0 ? (K) this.f16465i.get(i10) : null;
        if (k7 == null) {
            this.f16461e.T(x6);
            return 0;
        }
        if (this.f16457a != 2) {
            int i11 = p6 & 15;
            i7 = 0;
            int i12 = this.f16462f.get(i10, i11 - 1);
            this.f16462f.put(i10, i11);
            if (i12 == i11) {
                this.f16461e.T(x6);
                return 0;
            }
            if (i11 != ((i12 + 1) & 15)) {
                k7.b();
            }
        } else {
            i7 = 0;
        }
        if (z7) {
            int G6 = this.f16461e.G();
            i9 |= (this.f16461e.G() & 64) != 0 ? 2 : i7;
            this.f16461e.U(G6 - 1);
        }
        boolean z8 = this.f16472p;
        if (A(i10)) {
            this.f16461e.S(x6);
            k7.a(this.f16461e, i9);
            this.f16461e.S(g7);
        }
        if (this.f16457a != 2 && !z8 && this.f16472p && a6 != -1) {
            this.f16474r = true;
        }
        this.f16461e.T(x6);
        return i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // E1.InterfaceC0314p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i(E1.InterfaceC0315q r7) {
        /*
            r6 = this;
            c1.z r0 = r6.f16461e
            byte[] r0 = r0.e()
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.s(r0, r2, r1)
            r1 = r2
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = r2
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.p(r1)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.J.i(E1.q):boolean");
    }

    @Override // E1.InterfaceC0314p
    public void release() {
    }

    public final boolean w(InterfaceC0315q interfaceC0315q) {
        byte[] e6 = this.f16461e.e();
        if (9400 - this.f16461e.f() < 188) {
            int a6 = this.f16461e.a();
            if (a6 > 0) {
                System.arraycopy(e6, this.f16461e.f(), e6, 0, a6);
            }
            this.f16461e.R(e6, a6);
        }
        while (this.f16461e.a() < 188) {
            int g6 = this.f16461e.g();
            int read = interfaceC0315q.read(e6, g6, 9400 - g6);
            if (read == -1) {
                return false;
            }
            this.f16461e.S(g6 + read);
        }
        return true;
    }

    public final int x() {
        int f6 = this.f16461e.f();
        int g6 = this.f16461e.g();
        int a6 = L.a(this.f16461e.e(), f6, g6);
        this.f16461e.T(a6);
        int i6 = a6 + 188;
        if (i6 <= g6) {
            this.f16476t = 0;
            return i6;
        }
        int i7 = this.f16476t + (a6 - f6);
        this.f16476t = i7;
        if (this.f16457a != 2 || i7 <= 376) {
            return i6;
        }
        throw Z0.z.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    public final void z() {
        this.f16466j.clear();
        this.f16465i.clear();
        SparseArray a6 = this.f16463g.a();
        int size = a6.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f16465i.put(a6.keyAt(i6), (K) a6.valueAt(i6));
        }
        this.f16465i.put(0, new E(new a()));
        this.f16475s = null;
    }

    public J(int i6, int i7, s.a aVar, C1111E c1111e, K.c cVar, int i8) {
        this.f16463g = (K.c) AbstractC1119a.e(cVar);
        this.f16459c = i8;
        this.f16457a = i6;
        this.f16458b = i7;
        this.f16464h = aVar;
        if (i6 != 1 && i6 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f16460d = arrayList;
            arrayList.add(c1111e);
        } else {
            this.f16460d = Collections.singletonList(c1111e);
        }
        this.f16461e = new C1144z(new byte[9400], 0);
        this.f16466j = new SparseBooleanArray();
        this.f16467k = new SparseBooleanArray();
        this.f16465i = new SparseArray();
        this.f16462f = new SparseIntArray();
        this.f16468l = new H(i8);
        this.f16470n = E1.r.f1079O;
        this.f16477u = -1;
        z();
    }
}
