package Y1;

import E1.AbstractC0301c;
import E1.B;
import E1.I;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.J;
import E1.N;
import E1.O;
import E1.P;
import Y1.a;
import Z0.q;
import Z0.x;
import Z0.z;
import b2.s;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1144z;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class m implements InterfaceC0314p, J {

    /* renamed from: B, reason: collision with root package name */
    public static final E1.u f6432B = new E1.u() { // from class: Y1.l
        @Override // E1.u
        public final InterfaceC0314p[] c() {
            return m.n();
        }
    };

    /* renamed from: A, reason: collision with root package name */
    public T1.a f6433A;

    /* renamed from: a, reason: collision with root package name */
    public final s.a f6434a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6435b;

    /* renamed from: c, reason: collision with root package name */
    public final C1144z f6436c;

    /* renamed from: d, reason: collision with root package name */
    public final C1144z f6437d;

    /* renamed from: e, reason: collision with root package name */
    public final C1144z f6438e;

    /* renamed from: f, reason: collision with root package name */
    public final C1144z f6439f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f6440g;

    /* renamed from: h, reason: collision with root package name */
    public final p f6441h;

    /* renamed from: i, reason: collision with root package name */
    public final List f6442i;

    /* renamed from: j, reason: collision with root package name */
    public z6.w f6443j = z6.w.w();

    /* renamed from: k, reason: collision with root package name */
    public int f6444k;

    /* renamed from: l, reason: collision with root package name */
    public int f6445l;

    /* renamed from: m, reason: collision with root package name */
    public long f6446m;

    /* renamed from: n, reason: collision with root package name */
    public int f6447n;

    /* renamed from: o, reason: collision with root package name */
    public C1144z f6448o;

    /* renamed from: p, reason: collision with root package name */
    public int f6449p;

    /* renamed from: q, reason: collision with root package name */
    public int f6450q;

    /* renamed from: r, reason: collision with root package name */
    public int f6451r;

    /* renamed from: s, reason: collision with root package name */
    public int f6452s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6453t;

    /* renamed from: u, reason: collision with root package name */
    public E1.r f6454u;

    /* renamed from: v, reason: collision with root package name */
    public a[] f6455v;

    /* renamed from: w, reason: collision with root package name */
    public long[][] f6456w;

    /* renamed from: x, reason: collision with root package name */
    public int f6457x;

    /* renamed from: y, reason: collision with root package name */
    public long f6458y;

    /* renamed from: z, reason: collision with root package name */
    public int f6459z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final s f6460a;

        /* renamed from: b, reason: collision with root package name */
        public final v f6461b;

        /* renamed from: c, reason: collision with root package name */
        public final O f6462c;

        /* renamed from: d, reason: collision with root package name */
        public final P f6463d;

        /* renamed from: e, reason: collision with root package name */
        public int f6464e;

        public a(s sVar, v vVar, O o6) {
            this.f6460a = sVar;
            this.f6461b = vVar;
            this.f6462c = o6;
            this.f6463d = "audio/true-hd".equals(sVar.f6484f.f6990n) ? new P() : null;
        }
    }

    public m(s.a aVar, int i6) {
        this.f6434a = aVar;
        this.f6435b = i6;
        this.f6444k = (i6 & 4) != 0 ? 3 : 0;
        this.f6441h = new p();
        this.f6442i = new ArrayList();
        this.f6439f = new C1144z(16);
        this.f6440g = new ArrayDeque();
        this.f6436c = new C1144z(d1.d.f13379a);
        this.f6437d = new C1144z(4);
        this.f6438e = new C1144z();
        this.f6449p = -1;
        this.f6454u = E1.r.f1079O;
        this.f6455v = new a[0];
    }

    public static boolean G(int i6) {
        return i6 == 1836019574 || i6 == 1953653099 || i6 == 1835297121 || i6 == 1835626086 || i6 == 1937007212 || i6 == 1701082227 || i6 == 1835365473;
    }

    public static boolean H(int i6) {
        return i6 == 1835296868 || i6 == 1836476516 || i6 == 1751411826 || i6 == 1937011556 || i6 == 1937011827 || i6 == 1937011571 || i6 == 1668576371 || i6 == 1701606260 || i6 == 1937011555 || i6 == 1937011578 || i6 == 1937013298 || i6 == 1937007471 || i6 == 1668232756 || i6 == 1953196132 || i6 == 1718909296 || i6 == 1969517665 || i6 == 1801812339 || i6 == 1768715124;
    }

    public static /* synthetic */ s m(s sVar) {
        return sVar;
    }

    public static /* synthetic */ InterfaceC0314p[] n() {
        return new InterfaceC0314p[]{new m(s.a.f10491a, 16)};
    }

    public static int o(int i6) {
        if (i6 != 1751476579) {
            return i6 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    public static long[][] p(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i6 = 0; i6 < aVarArr.length; i6++) {
            jArr[i6] = new long[aVarArr[i6].f6461b.f6514b];
            jArr2[i6] = aVarArr[i6].f6461b.f6518f[0];
        }
        long j6 = 0;
        int i7 = 0;
        while (i7 < aVarArr.length) {
            long j7 = LongCompanionObject.MAX_VALUE;
            int i8 = -1;
            for (int i9 = 0; i9 < aVarArr.length; i9++) {
                if (!zArr[i9]) {
                    long j8 = jArr2[i9];
                    if (j8 <= j7) {
                        i8 = i9;
                        j7 = j8;
                    }
                }
            }
            int i10 = iArr[i8];
            long[] jArr3 = jArr[i8];
            jArr3[i10] = j6;
            v vVar = aVarArr[i8].f6461b;
            j6 += vVar.f6516d[i10];
            int i11 = i10 + 1;
            iArr[i8] = i11;
            if (i11 < jArr3.length) {
                jArr2[i8] = vVar.f6518f[i11];
            } else {
                zArr[i8] = true;
                i7++;
            }
        }
        return jArr;
    }

    public static int t(v vVar, long j6) {
        int a6 = vVar.a(j6);
        return a6 == -1 ? vVar.b(j6) : a6;
    }

    public static long v(v vVar, long j6, long j7) {
        int t6 = t(vVar, j6);
        return t6 == -1 ? j7 : Math.min(vVar.f6515c[t6], j7);
    }

    public static int z(C1144z c1144z) {
        c1144z.T(8);
        int o6 = o(c1144z.p());
        if (o6 != 0) {
            return o6;
        }
        c1144z.U(4);
        while (c1144z.a() > 0) {
            int o7 = o(c1144z.p());
            if (o7 != 0) {
                return o7;
            }
        }
        return 0;
    }

    public final void A(a.C0109a c0109a) {
        x xVar;
        List list;
        int i6;
        int i7;
        ArrayList arrayList = new ArrayList();
        boolean z6 = this.f6459z == 1;
        B b6 = new B();
        a.b g6 = c0109a.g(1969517665);
        if (g6 != null) {
            x C6 = b.C(g6);
            b6.c(C6);
            xVar = C6;
        } else {
            xVar = null;
        }
        a.C0109a f6 = c0109a.f(1835365473);
        x p6 = f6 != null ? b.p(f6) : null;
        x xVar2 = new x(b.r(((a.b) AbstractC1119a.e(c0109a.g(1836476516))).f6331b));
        List B6 = b.B(c0109a, b6, -9223372036854775807L, null, (this.f6435b & 1) != 0, z6, new y6.g() { // from class: Y1.k
            public final Object apply(Object obj) {
                return m.m((s) obj);
            }
        });
        int i8 = 0;
        int i9 = 0;
        long j6 = -9223372036854775807L;
        int i10 = -1;
        while (i8 < B6.size()) {
            v vVar = (v) B6.get(i8);
            if (vVar.f6514b == 0) {
                list = B6;
                i6 = i8;
            } else {
                s sVar = vVar.f6513a;
                long j7 = j6;
                long j8 = sVar.f6483e;
                if (j8 == -9223372036854775807L) {
                    j8 = vVar.f6520h;
                }
                long max = Math.max(j7, j8);
                list = B6;
                int i11 = i9 + 1;
                i6 = i8;
                a aVar = new a(sVar, vVar, this.f6454u.a(i9, sVar.f6480b));
                int i12 = "audio/true-hd".equals(sVar.f6484f.f6990n) ? vVar.f6517e * 16 : vVar.f6517e + 30;
                q.b a6 = sVar.f6484f.a();
                a6.f0(i12);
                if (sVar.f6480b == 2) {
                    if ((this.f6435b & 8) != 0) {
                        a6.m0(sVar.f6484f.f6982f | (i10 == -1 ? 1 : 2));
                    }
                    if (j8 > 0 && (i7 = vVar.f6514b) > 0) {
                        a6.X(i7 / (((float) j8) / 1000000.0f));
                    }
                }
                j.k(sVar.f6480b, b6, a6);
                j.l(sVar.f6480b, p6, a6, this.f6442i.isEmpty() ? null : new x(this.f6442i), xVar, xVar2);
                aVar.f6462c.e(a6.K());
                if (sVar.f6480b == 2 && i10 == -1) {
                    i10 = arrayList.size();
                }
                arrayList.add(aVar);
                i9 = i11;
                j6 = max;
            }
            i8 = i6 + 1;
            B6 = list;
        }
        this.f6457x = i10;
        this.f6458y = j6;
        a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
        this.f6455v = aVarArr;
        this.f6456w = p(aVarArr);
        this.f6454u.k();
        this.f6454u.n(this);
    }

    public final void B(long j6) {
        if (this.f6445l == 1836086884) {
            int i6 = this.f6447n;
            this.f6433A = new T1.a(0L, j6, -9223372036854775807L, j6 + i6, this.f6446m - i6);
        }
    }

    public final boolean C(InterfaceC0315q interfaceC0315q) {
        a.C0109a c0109a;
        if (this.f6447n == 0) {
            if (!interfaceC0315q.c(this.f6439f.e(), 0, 8, true)) {
                y();
                return false;
            }
            this.f6447n = 8;
            this.f6439f.T(0);
            this.f6446m = this.f6439f.I();
            this.f6445l = this.f6439f.p();
        }
        long j6 = this.f6446m;
        if (j6 == 1) {
            interfaceC0315q.readFully(this.f6439f.e(), 8, 8);
            this.f6447n += 8;
            this.f6446m = this.f6439f.L();
        } else if (j6 == 0) {
            long a6 = interfaceC0315q.a();
            if (a6 == -1 && (c0109a = (a.C0109a) this.f6440g.peek()) != null) {
                a6 = c0109a.f6328b;
            }
            if (a6 != -1) {
                this.f6446m = (a6 - interfaceC0315q.getPosition()) + this.f6447n;
            }
        }
        if (this.f6446m < this.f6447n) {
            throw z.e("Atom size less than header length (unsupported).");
        }
        if (G(this.f6445l)) {
            long position = interfaceC0315q.getPosition();
            long j7 = this.f6446m;
            int i6 = this.f6447n;
            long j8 = (position + j7) - i6;
            if (j7 != i6 && this.f6445l == 1835365473) {
                w(interfaceC0315q);
            }
            this.f6440g.push(new a.C0109a(this.f6445l, j8));
            if (this.f6446m == this.f6447n) {
                x(j8);
            } else {
                q();
            }
        } else if (H(this.f6445l)) {
            AbstractC1119a.g(this.f6447n == 8);
            AbstractC1119a.g(this.f6446m <= 2147483647L);
            C1144z c1144z = new C1144z((int) this.f6446m);
            System.arraycopy(this.f6439f.e(), 0, c1144z.e(), 0, 8);
            this.f6448o = c1144z;
            this.f6444k = 1;
        } else {
            B(interfaceC0315q.getPosition() - this.f6447n);
            this.f6448o = null;
            this.f6444k = 1;
        }
        return true;
    }

    public final boolean D(InterfaceC0315q interfaceC0315q, I i6) {
        boolean z6;
        long j6 = this.f6446m - this.f6447n;
        long position = interfaceC0315q.getPosition() + j6;
        C1144z c1144z = this.f6448o;
        if (c1144z != null) {
            interfaceC0315q.readFully(c1144z.e(), this.f6447n, (int) j6);
            if (this.f6445l == 1718909296) {
                this.f6453t = true;
                this.f6459z = z(c1144z);
            } else if (!this.f6440g.isEmpty()) {
                ((a.C0109a) this.f6440g.peek()).e(new a.b(this.f6445l, c1144z));
            }
        } else {
            if (!this.f6453t && this.f6445l == 1835295092) {
                this.f6459z = 1;
            }
            if (j6 >= 262144) {
                i6.f910a = interfaceC0315q.getPosition() + j6;
                z6 = true;
                x(position);
                return (z6 || this.f6444k == 2) ? false : true;
            }
            interfaceC0315q.p((int) j6);
        }
        z6 = false;
        x(position);
        if (z6) {
        }
    }

    public final int E(InterfaceC0315q interfaceC0315q, I i6) {
        int i7;
        long position = interfaceC0315q.getPosition();
        if (this.f6449p == -1) {
            int u6 = u(position);
            this.f6449p = u6;
            if (u6 == -1) {
                return -1;
            }
        }
        a aVar = this.f6455v[this.f6449p];
        O o6 = aVar.f6462c;
        int i8 = aVar.f6464e;
        v vVar = aVar.f6461b;
        long j6 = vVar.f6515c[i8];
        int i9 = vVar.f6516d[i8];
        P p6 = aVar.f6463d;
        long j7 = (j6 - position) + this.f6450q;
        if (j7 < 0 || j7 >= 262144) {
            i6.f910a = j6;
            return 1;
        }
        if (aVar.f6460a.f6485g == 1) {
            j7 += 8;
            i9 -= 8;
        }
        interfaceC0315q.p((int) j7);
        s sVar = aVar.f6460a;
        if (sVar.f6488j == 0) {
            if ("audio/ac4".equals(sVar.f6484f.f6990n)) {
                if (this.f6451r == 0) {
                    AbstractC0301c.a(i9, this.f6438e);
                    o6.a(this.f6438e, 7);
                    this.f6451r += 7;
                }
                i9 += 7;
            } else if (p6 != null) {
                p6.d(interfaceC0315q);
            }
            while (true) {
                int i10 = this.f6451r;
                if (i10 >= i9) {
                    break;
                }
                int c6 = o6.c(interfaceC0315q, i9 - i10, false);
                this.f6450q += c6;
                this.f6451r += c6;
                this.f6452s -= c6;
            }
        } else {
            byte[] e6 = this.f6437d.e();
            e6[0] = 0;
            e6[1] = 0;
            e6[2] = 0;
            int i11 = aVar.f6460a.f6488j;
            int i12 = 4 - i11;
            while (this.f6451r < i9) {
                int i13 = this.f6452s;
                if (i13 == 0) {
                    interfaceC0315q.readFully(e6, i12, i11);
                    this.f6450q += i11;
                    this.f6437d.T(0);
                    int p7 = this.f6437d.p();
                    if (p7 < 0) {
                        throw z.a("Invalid NAL length", null);
                    }
                    this.f6452s = p7;
                    this.f6436c.T(0);
                    o6.a(this.f6436c, 4);
                    this.f6451r += 4;
                    i9 += i12;
                } else {
                    int c7 = o6.c(interfaceC0315q, i13, false);
                    this.f6450q += c7;
                    this.f6451r += c7;
                    this.f6452s -= c7;
                }
            }
        }
        int i14 = i9;
        v vVar2 = aVar.f6461b;
        long j8 = vVar2.f6518f[i8];
        int i15 = vVar2.f6519g[i8];
        if (p6 != null) {
            i7 = 0;
            p6.c(o6, j8, i15, i14, 0, null);
            if (i8 + 1 == aVar.f6461b.f6514b) {
                p6.a(o6, null);
            }
        } else {
            i7 = 0;
            o6.f(j8, i15, i14, 0, null);
        }
        aVar.f6464e++;
        this.f6449p = -1;
        this.f6450q = i7;
        this.f6451r = i7;
        this.f6452s = i7;
        return i7;
    }

    public final int F(InterfaceC0315q interfaceC0315q, I i6) {
        int c6 = this.f6441h.c(interfaceC0315q, i6, this.f6442i);
        if (c6 == 1 && i6.f910a == 0) {
            q();
        }
        return c6;
    }

    public final void I(a aVar, long j6) {
        v vVar = aVar.f6461b;
        int a6 = vVar.a(j6);
        if (a6 == -1) {
            a6 = vVar.b(j6);
        }
        aVar.f6464e = a6;
    }

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        this.f6440g.clear();
        this.f6447n = 0;
        this.f6449p = -1;
        this.f6450q = 0;
        this.f6451r = 0;
        this.f6452s = 0;
        if (j6 == 0) {
            if (this.f6444k != 3) {
                q();
                return;
            } else {
                this.f6441h.g();
                this.f6442i.clear();
                return;
            }
        }
        for (a aVar : this.f6455v) {
            I(aVar, j7);
            P p6 = aVar.f6463d;
            if (p6 != null) {
                p6.b();
            }
        }
    }

    @Override // E1.InterfaceC0314p
    public void c(E1.r rVar) {
        if ((this.f6435b & 16) == 0) {
            rVar = new b2.u(rVar, this.f6434a);
        }
        this.f6454u = rVar;
    }

    @Override // E1.J
    public boolean f() {
        return true;
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, I i6) {
        while (true) {
            int i7 = this.f6444k;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        return E(interfaceC0315q, i6);
                    }
                    if (i7 == 3) {
                        return F(interfaceC0315q, i6);
                    }
                    throw new IllegalStateException();
                }
                if (D(interfaceC0315q, i6)) {
                    return 1;
                }
            } else if (!C(interfaceC0315q)) {
                return -1;
            }
        }
    }

    @Override // E1.InterfaceC0314p
    public boolean i(InterfaceC0315q interfaceC0315q) {
        N d6 = r.d(interfaceC0315q, (this.f6435b & 2) != 0);
        this.f6443j = d6 != null ? z6.w.y(d6) : z6.w.w();
        return d6 == null;
    }

    @Override // E1.J
    public J.a j(long j6) {
        return r(j6, -1);
    }

    @Override // E1.J
    public long l() {
        return this.f6458y;
    }

    public final void q() {
        this.f6444k = 0;
        this.f6447n = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public E1.J.a r(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            Y1.m$a[] r4 = r0.f6455v
            int r5 = r4.length
            if (r5 != 0) goto L13
            E1.J$a r1 = new E1.J$a
            E1.K r2 = E1.K.f915c
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            if (r3 == r5) goto L18
            r6 = r3
            goto L1a
        L18:
            int r6 = r0.f6457x
        L1a:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            if (r6 == r5) goto L58
            r4 = r4[r6]
            Y1.v r4 = r4.f6461b
            int r6 = t(r4, r1)
            if (r6 != r5) goto L35
            E1.J$a r1 = new E1.J$a
            E1.K r2 = E1.K.f915c
            r1.<init>(r2)
            return r1
        L35:
            long[] r11 = r4.f6518f
            r12 = r11[r6]
            long[] r11 = r4.f6515c
            r14 = r11[r6]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r4.f6514b
            int r11 = r11 + (-1)
            if (r6 >= r11) goto L5e
            int r1 = r4.b(r1)
            if (r1 == r5) goto L5e
            if (r1 == r6) goto L5e
            long[] r2 = r4.f6518f
            r9 = r2[r1]
            long[] r2 = r4.f6515c
            r1 = r2[r1]
            goto L60
        L58:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L5e:
            r1 = r9
            r9 = r7
        L60:
            if (r3 != r5) goto L80
            r3 = 0
        L63:
            Y1.m$a[] r4 = r0.f6455v
            int r5 = r4.length
            if (r3 >= r5) goto L80
            int r5 = r0.f6457x
            if (r3 == r5) goto L7d
            r4 = r4[r3]
            Y1.v r4 = r4.f6461b
            long r5 = v(r4, r12, r14)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L7c
            long r1 = v(r4, r9, r1)
        L7c:
            r14 = r5
        L7d:
            int r3 = r3 + 1
            goto L63
        L80:
            E1.K r3 = new E1.K
            r3.<init>(r12, r14)
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto L8f
            E1.J$a r1 = new E1.J$a
            r1.<init>(r3)
            return r1
        L8f:
            E1.K r4 = new E1.K
            r4.<init>(r9, r1)
            E1.J$a r1 = new E1.J$a
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.m.r(long, int):E1.J$a");
    }

    @Override // E1.InterfaceC0314p
    public void release() {
    }

    @Override // E1.InterfaceC0314p
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public z6.w h() {
        return this.f6443j;
    }

    public final int u(long j6) {
        int i6 = -1;
        int i7 = -1;
        int i8 = 0;
        long j7 = LongCompanionObject.MAX_VALUE;
        boolean z6 = true;
        long j8 = LongCompanionObject.MAX_VALUE;
        boolean z7 = true;
        long j9 = LongCompanionObject.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f6455v;
            if (i8 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i8];
            int i9 = aVar.f6464e;
            v vVar = aVar.f6461b;
            if (i9 != vVar.f6514b) {
                long j10 = vVar.f6515c[i9];
                long j11 = ((long[][]) AbstractC1117K.i(this.f6456w))[i8][i9];
                long j12 = j10 - j6;
                boolean z8 = j12 < 0 || j12 >= 262144;
                if ((!z8 && z7) || (z8 == z7 && j12 < j9)) {
                    z7 = z8;
                    j8 = j11;
                    i7 = i8;
                    j9 = j12;
                }
                if (j11 < j7) {
                    z6 = z8;
                    j7 = j11;
                    i6 = i8;
                }
            }
            i8++;
        }
        return (j7 == LongCompanionObject.MAX_VALUE || !z6 || j8 < j7 + 10485760) ? i7 : i6;
    }

    public final void w(InterfaceC0315q interfaceC0315q) {
        this.f6438e.P(8);
        interfaceC0315q.s(this.f6438e.e(), 0, 8);
        b.f(this.f6438e);
        interfaceC0315q.p(this.f6438e.f());
        interfaceC0315q.o();
    }

    public final void x(long j6) {
        while (!this.f6440g.isEmpty() && ((a.C0109a) this.f6440g.peek()).f6328b == j6) {
            a.C0109a c0109a = (a.C0109a) this.f6440g.pop();
            if (c0109a.f6327a == 1836019574) {
                A(c0109a);
                this.f6440g.clear();
                this.f6444k = 2;
            } else if (!this.f6440g.isEmpty()) {
                ((a.C0109a) this.f6440g.peek()).d(c0109a);
            }
        }
        if (this.f6444k != 2) {
            q();
        }
    }

    public final void y() {
        if (this.f6459z != 2 || (this.f6435b & 2) == 0) {
            return;
        }
        this.f6454u.a(0, 4).e(new q.b().h0(this.f6433A == null ? null : new x(this.f6433A)).K());
        this.f6454u.k();
        this.f6454u.n(new J.b(-9223372036854775807L));
    }
}
