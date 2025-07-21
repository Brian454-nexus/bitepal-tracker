package w1;

import E1.O;
import Z0.C0841m;
import Z0.InterfaceC0837i;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1144z;
import c1.InterfaceC1125g;
import g1.C1337i0;
import kotlin.jvm.internal.LongCompanionObject;
import l1.InterfaceC1743m;
import l1.t;
import l1.u;
import w1.a0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a0 implements E1.O {

    /* renamed from: A, reason: collision with root package name */
    public Z0.q f19921A;

    /* renamed from: B, reason: collision with root package name */
    public Z0.q f19922B;

    /* renamed from: C, reason: collision with root package name */
    public long f19923C;

    /* renamed from: E, reason: collision with root package name */
    public boolean f19925E;

    /* renamed from: F, reason: collision with root package name */
    public long f19926F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f19927G;

    /* renamed from: a, reason: collision with root package name */
    public final Y f19928a;

    /* renamed from: d, reason: collision with root package name */
    public final l1.u f19931d;

    /* renamed from: e, reason: collision with root package name */
    public final t.a f19932e;

    /* renamed from: f, reason: collision with root package name */
    public d f19933f;

    /* renamed from: g, reason: collision with root package name */
    public Z0.q f19934g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1743m f19935h;

    /* renamed from: p, reason: collision with root package name */
    public int f19943p;

    /* renamed from: q, reason: collision with root package name */
    public int f19944q;

    /* renamed from: r, reason: collision with root package name */
    public int f19945r;

    /* renamed from: s, reason: collision with root package name */
    public int f19946s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f19950w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f19953z;

    /* renamed from: b, reason: collision with root package name */
    public final b f19929b = new b();

    /* renamed from: i, reason: collision with root package name */
    public int f19936i = 1000;

    /* renamed from: j, reason: collision with root package name */
    public long[] f19937j = new long[1000];

    /* renamed from: k, reason: collision with root package name */
    public long[] f19938k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    public long[] f19941n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    public int[] f19940m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    public int[] f19939l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    public O.a[] f19942o = new O.a[1000];

    /* renamed from: c, reason: collision with root package name */
    public final h0 f19930c = new h0(new InterfaceC1125g() { // from class: w1.Z
        @Override // c1.InterfaceC1125g
        public final void accept(Object obj) {
            ((a0.c) obj).f19958b.release();
        }
    });

    /* renamed from: t, reason: collision with root package name */
    public long f19947t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f19948u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f19949v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public boolean f19952y = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f19951x = true;

    /* renamed from: D, reason: collision with root package name */
    public boolean f19924D = true;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f19954a;

        /* renamed from: b, reason: collision with root package name */
        public long f19955b;

        /* renamed from: c, reason: collision with root package name */
        public O.a f19956c;
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Z0.q f19957a;

        /* renamed from: b, reason: collision with root package name */
        public final u.b f19958b;

        public c(Z0.q qVar, u.b bVar) {
            this.f19957a = qVar;
            this.f19958b = bVar;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface d {
        void c(Z0.q qVar);
    }

    public a0(A1.b bVar, l1.u uVar, t.a aVar) {
        this.f19931d = uVar;
        this.f19932e = aVar;
        this.f19928a = new Y(bVar);
    }

    public static a0 k(A1.b bVar, l1.u uVar, t.a aVar) {
        return new a0(bVar, (l1.u) AbstractC1119a.e(uVar), (t.a) AbstractC1119a.e(aVar));
    }

    public static a0 l(A1.b bVar) {
        return new a0(bVar, null, null);
    }

    public final synchronized long A() {
        return this.f19949v;
    }

    public final synchronized long B() {
        return Math.max(this.f19948u, C(this.f19946s));
    }

    public final long C(int i6) {
        long j6 = Long.MIN_VALUE;
        if (i6 == 0) {
            return Long.MIN_VALUE;
        }
        int E6 = E(i6 - 1);
        for (int i7 = 0; i7 < i6; i7++) {
            j6 = Math.max(j6, this.f19941n[E6]);
            if ((this.f19940m[E6] & 1) != 0) {
                return j6;
            }
            E6--;
            if (E6 == -1) {
                E6 = this.f19936i - 1;
            }
        }
        return j6;
    }

    public final int D() {
        return this.f19944q + this.f19946s;
    }

    public final int E(int i6) {
        int i7 = this.f19945r + i6;
        int i8 = this.f19936i;
        return i7 < i8 ? i7 : i7 - i8;
    }

    public final synchronized int F(long j6, boolean z6) {
        Throwable th;
        try {
            try {
                int E6 = E(this.f19946s);
                if (!I() || j6 < this.f19941n[E6]) {
                    return 0;
                }
                if (j6 <= this.f19949v || !z6) {
                    int w6 = w(E6, this.f19943p - this.f19946s, j6, true);
                    if (w6 == -1) {
                        return 0;
                    }
                    return w6;
                }
                try {
                    return this.f19943p - this.f19946s;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized Z0.q G() {
        return this.f19952y ? null : this.f19922B;
    }

    public final int H() {
        return this.f19944q + this.f19943p;
    }

    public final boolean I() {
        return this.f19946s != this.f19943p;
    }

    public final void J() {
        this.f19953z = true;
    }

    public final synchronized boolean K() {
        return this.f19950w;
    }

    public synchronized boolean L(boolean z6) {
        Z0.q qVar;
        boolean z7 = true;
        if (I()) {
            if (((c) this.f19930c.e(D())).f19957a != this.f19934g) {
                return true;
            }
            return M(E(this.f19946s));
        }
        if (!z6 && !this.f19950w && ((qVar = this.f19922B) == null || qVar == this.f19934g)) {
            z7 = false;
        }
        return z7;
    }

    public final boolean M(int i6) {
        InterfaceC1743m interfaceC1743m = this.f19935h;
        if (interfaceC1743m == null || interfaceC1743m.f() == 4) {
            return true;
        }
        return (this.f19940m[i6] & 1073741824) == 0 && this.f19935h.d();
    }

    public void N() {
        InterfaceC1743m interfaceC1743m = this.f19935h;
        if (interfaceC1743m != null && interfaceC1743m.f() == 1) {
            throw ((InterfaceC1743m.a) AbstractC1119a.e(this.f19935h.i()));
        }
    }

    public final void O(Z0.q qVar, C1337i0 c1337i0) {
        Z0.q qVar2 = this.f19934g;
        boolean z6 = qVar2 == null;
        C0841m c0841m = qVar2 == null ? null : qVar2.f6994r;
        this.f19934g = qVar;
        C0841m c0841m2 = qVar.f6994r;
        l1.u uVar = this.f19931d;
        c1337i0.f14685b = uVar != null ? qVar.b(uVar.c(qVar)) : qVar;
        c1337i0.f14684a = this.f19935h;
        if (this.f19931d == null) {
            return;
        }
        if (z6 || !AbstractC1117K.c(c0841m, c0841m2)) {
            InterfaceC1743m interfaceC1743m = this.f19935h;
            InterfaceC1743m b6 = this.f19931d.b(this.f19932e, qVar);
            this.f19935h = b6;
            c1337i0.f14684a = b6;
            if (interfaceC1743m != null) {
                interfaceC1743m.g(this.f19932e);
            }
        }
    }

    public final synchronized int P(C1337i0 c1337i0, f1.f fVar, boolean z6, boolean z7, b bVar) {
        try {
            fVar.f14006e = false;
            if (!I()) {
                if (!z7 && !this.f19950w) {
                    Z0.q qVar = this.f19922B;
                    if (qVar == null || (!z6 && qVar == this.f19934g)) {
                        return -3;
                    }
                    O((Z0.q) AbstractC1119a.e(qVar), c1337i0);
                    return -5;
                }
                fVar.m(4);
                fVar.f14007f = Long.MIN_VALUE;
                return -4;
            }
            Z0.q qVar2 = ((c) this.f19930c.e(D())).f19957a;
            if (!z6 && qVar2 == this.f19934g) {
                int E6 = E(this.f19946s);
                if (!M(E6)) {
                    fVar.f14006e = true;
                    return -3;
                }
                fVar.m(this.f19940m[E6]);
                if (this.f19946s == this.f19943p - 1 && (z7 || this.f19950w)) {
                    fVar.e(536870912);
                }
                fVar.f14007f = this.f19941n[E6];
                bVar.f19954a = this.f19939l[E6];
                bVar.f19955b = this.f19938k[E6];
                bVar.f19956c = this.f19942o[E6];
                return -4;
            }
            O(qVar2, c1337i0);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long Q() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return I() ? this.f19937j[E(this.f19946s)] : this.f19923C;
    }

    public void R() {
        r();
        U();
    }

    public int S(C1337i0 c1337i0, f1.f fVar, int i6, boolean z6) {
        int P5 = P(c1337i0, fVar, (i6 & 2) != 0, z6, this.f19929b);
        if (P5 == -4 && !fVar.i()) {
            boolean z7 = (i6 & 1) != 0;
            if ((i6 & 4) == 0) {
                if (z7) {
                    this.f19928a.f(fVar, this.f19929b);
                } else {
                    this.f19928a.m(fVar, this.f19929b);
                }
            }
            if (!z7) {
                this.f19946s++;
            }
        }
        return P5;
    }

    public void T() {
        W(true);
        U();
    }

    public final void U() {
        InterfaceC1743m interfaceC1743m = this.f19935h;
        if (interfaceC1743m != null) {
            interfaceC1743m.g(this.f19932e);
            this.f19935h = null;
            this.f19934g = null;
        }
    }

    public final void V() {
        W(false);
    }

    public void W(boolean z6) {
        this.f19928a.n();
        this.f19943p = 0;
        this.f19944q = 0;
        this.f19945r = 0;
        this.f19946s = 0;
        this.f19951x = true;
        this.f19947t = Long.MIN_VALUE;
        this.f19948u = Long.MIN_VALUE;
        this.f19949v = Long.MIN_VALUE;
        this.f19950w = false;
        this.f19930c.b();
        if (z6) {
            this.f19921A = null;
            this.f19922B = null;
            this.f19952y = true;
            this.f19924D = true;
        }
    }

    public final synchronized void X() {
        this.f19946s = 0;
        this.f19928a.o();
    }

    public final synchronized boolean Y(int i6) {
        X();
        int i7 = this.f19944q;
        if (i6 >= i7 && i6 <= this.f19943p + i7) {
            this.f19947t = Long.MIN_VALUE;
            this.f19946s = i6 - i7;
            return true;
        }
        return false;
    }

    public final synchronized boolean Z(long j6, boolean z6) {
        a0 a0Var;
        long j7;
        int w6;
        try {
            try {
                X();
                int E6 = E(this.f19946s);
                if (!I() || j6 < this.f19941n[E6] || (j6 > this.f19949v && !z6)) {
                    return false;
                }
                if (this.f19924D) {
                    a0Var = this;
                    j7 = j6;
                    w6 = a0Var.v(E6, this.f19943p - this.f19946s, j7, z6);
                } else {
                    a0Var = this;
                    j7 = j6;
                    w6 = a0Var.w(E6, a0Var.f19943p - a0Var.f19946s, j7, true);
                }
                if (w6 == -1) {
                    return false;
                }
                a0Var.f19947t = j7;
                a0Var.f19946s += w6;
                return true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void a0(long j6) {
        if (this.f19926F != j6) {
            this.f19926F = j6;
            J();
        }
    }

    @Override // E1.O
    public final void b(C1144z c1144z, int i6, int i7) {
        this.f19928a.q(c1144z, i6);
    }

    public final void b0(long j6) {
        this.f19947t = j6;
    }

    public final synchronized boolean c0(Z0.q qVar) {
        try {
            this.f19952y = false;
            if (AbstractC1117K.c(qVar, this.f19922B)) {
                return false;
            }
            if (this.f19930c.g() || !((c) this.f19930c.f()).f19957a.equals(qVar)) {
                this.f19922B = qVar;
            } else {
                this.f19922B = ((c) this.f19930c.f()).f19957a;
            }
            boolean z6 = this.f19924D;
            Z0.q qVar2 = this.f19922B;
            this.f19924D = z6 & Z0.y.a(qVar2.f6990n, qVar2.f6986j);
            this.f19925E = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // E1.O
    public final int d(InterfaceC0837i interfaceC0837i, int i6, boolean z6, int i7) {
        return this.f19928a.p(interfaceC0837i, i6, z6);
    }

    public final void d0(d dVar) {
        this.f19933f = dVar;
    }

    @Override // E1.O
    public final void e(Z0.q qVar) {
        Z0.q x6 = x(qVar);
        this.f19953z = false;
        this.f19921A = qVar;
        boolean c02 = c0(x6);
        d dVar = this.f19933f;
        if (dVar == null || !c02) {
            return;
        }
        dVar.c(x6);
    }

    public final synchronized void e0(int i6) {
        boolean z6;
        if (i6 >= 0) {
            try {
                if (this.f19946s + i6 <= this.f19943p) {
                    z6 = true;
                    AbstractC1119a.a(z6);
                    this.f19946s += i6;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z6 = false;
        AbstractC1119a.a(z6);
        this.f19946s += i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    @Override // E1.O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(long r12, int r14, int r15, int r16, E1.O.a r17) {
        /*
            r11 = this;
            boolean r1 = r11.f19953z
            if (r1 == 0) goto Lf
            Z0.q r1 = r11.f19921A
            java.lang.Object r1 = c1.AbstractC1119a.i(r1)
            Z0.q r1 = (Z0.q) r1
            r11.e(r1)
        Lf:
            r1 = r14 & 1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L17
            r4 = r3
            goto L18
        L17:
            r4 = r2
        L18:
            boolean r5 = r11.f19951x
            if (r5 == 0) goto L21
            if (r4 != 0) goto L1f
            goto L64
        L1f:
            r11.f19951x = r2
        L21:
            long r5 = r11.f19926F
            long r5 = r5 + r12
            boolean r7 = r11.f19924D
            if (r7 == 0) goto L53
            long r7 = r11.f19947t
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 >= 0) goto L2f
            goto L64
        L2f:
            if (r1 != 0) goto L53
            boolean r1 = r11.f19925E
            if (r1 != 0) goto L4f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "Overriding unexpected non-sync sample for format: "
            r1.append(r7)
            Z0.q r7 = r11.f19922B
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r7 = "SampleQueue"
            c1.AbstractC1133o.h(r7, r1)
            r11.f19925E = r3
        L4f:
            r1 = r14 | 1
            r3 = r1
            goto L54
        L53:
            r3 = r14
        L54:
            boolean r1 = r11.f19927G
            if (r1 == 0) goto L65
            if (r4 == 0) goto L64
            boolean r1 = r11.h(r5)
            if (r1 != 0) goto L61
            goto L64
        L61:
            r11.f19927G = r2
            goto L65
        L64:
            return
        L65:
            w1.Y r1 = r11.f19928a
            long r1 = r1.e()
            long r7 = (long) r15
            long r1 = r1 - r7
            r7 = r16
            long r7 = (long) r7
            long r1 = r1 - r7
            r9 = r5
            r4 = r1
            r1 = r9
            r0 = r11
            r6 = r15
            r7 = r17
            r0.i(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.a0.f(long, int, int, int, E1.O$a):void");
    }

    public final void f0(long j6) {
        this.f19923C = j6;
    }

    public final void g0() {
        this.f19927G = true;
    }

    public final synchronized boolean h(long j6) {
        if (this.f19943p == 0) {
            return j6 > this.f19948u;
        }
        if (B() >= j6) {
            return false;
        }
        t(this.f19944q + j(j6));
        return true;
    }

    public final synchronized void i(long j6, int i6, long j7, int i7, O.a aVar) {
        try {
            int i8 = this.f19943p;
            if (i8 > 0) {
                int E6 = E(i8 - 1);
                AbstractC1119a.a(this.f19938k[E6] + ((long) this.f19939l[E6]) <= j7);
            }
            this.f19950w = (536870912 & i6) != 0;
            this.f19949v = Math.max(this.f19949v, j6);
            int E7 = E(this.f19943p);
            this.f19941n[E7] = j6;
            this.f19938k[E7] = j7;
            this.f19939l[E7] = i7;
            this.f19940m[E7] = i6;
            this.f19942o[E7] = aVar;
            this.f19937j[E7] = this.f19923C;
            if (this.f19930c.g() || !((c) this.f19930c.f()).f19957a.equals(this.f19922B)) {
                Z0.q qVar = (Z0.q) AbstractC1119a.e(this.f19922B);
                l1.u uVar = this.f19931d;
                this.f19930c.a(H(), new c(qVar, uVar != null ? uVar.d(this.f19932e, qVar) : u.b.f17031a));
            }
            int i9 = this.f19943p + 1;
            this.f19943p = i9;
            int i10 = this.f19936i;
            if (i9 == i10) {
                int i11 = i10 + 1000;
                long[] jArr = new long[i11];
                long[] jArr2 = new long[i11];
                long[] jArr3 = new long[i11];
                int[] iArr = new int[i11];
                int[] iArr2 = new int[i11];
                O.a[] aVarArr = new O.a[i11];
                int i12 = this.f19945r;
                int i13 = i10 - i12;
                System.arraycopy(this.f19938k, i12, jArr2, 0, i13);
                System.arraycopy(this.f19941n, this.f19945r, jArr3, 0, i13);
                System.arraycopy(this.f19940m, this.f19945r, iArr, 0, i13);
                System.arraycopy(this.f19939l, this.f19945r, iArr2, 0, i13);
                System.arraycopy(this.f19942o, this.f19945r, aVarArr, 0, i13);
                System.arraycopy(this.f19937j, this.f19945r, jArr, 0, i13);
                int i14 = this.f19945r;
                System.arraycopy(this.f19938k, 0, jArr2, i13, i14);
                System.arraycopy(this.f19941n, 0, jArr3, i13, i14);
                System.arraycopy(this.f19940m, 0, iArr, i13, i14);
                System.arraycopy(this.f19939l, 0, iArr2, i13, i14);
                System.arraycopy(this.f19942o, 0, aVarArr, i13, i14);
                System.arraycopy(this.f19937j, 0, jArr, i13, i14);
                this.f19938k = jArr2;
                this.f19941n = jArr3;
                this.f19940m = iArr;
                this.f19939l = iArr2;
                this.f19942o = aVarArr;
                this.f19937j = jArr;
                this.f19945r = 0;
                this.f19936i = i11;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int j(long j6) {
        int i6 = this.f19943p;
        int E6 = E(i6 - 1);
        while (i6 > this.f19946s && this.f19941n[E6] >= j6) {
            i6--;
            E6--;
            if (E6 == -1) {
                E6 = this.f19936i - 1;
            }
        }
        return i6;
    }

    public final synchronized long m(long j6, boolean z6, boolean z7) {
        Throwable th;
        try {
            try {
                int i6 = this.f19943p;
                if (i6 != 0) {
                    long[] jArr = this.f19941n;
                    int i7 = this.f19945r;
                    if (j6 >= jArr[i7]) {
                        if (z7) {
                            try {
                                int i8 = this.f19946s;
                                if (i8 != i6) {
                                    i6 = i8 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int w6 = w(i7, i6, j6, z6);
                        if (w6 == -1) {
                            return -1L;
                        }
                        return p(w6);
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized long n() {
        int i6 = this.f19943p;
        if (i6 == 0) {
            return -1L;
        }
        return p(i6);
    }

    public synchronized long o() {
        int i6 = this.f19946s;
        if (i6 == 0) {
            return -1L;
        }
        return p(i6);
    }

    public final long p(int i6) {
        this.f19948u = Math.max(this.f19948u, C(i6));
        this.f19943p -= i6;
        int i7 = this.f19944q + i6;
        this.f19944q = i7;
        int i8 = this.f19945r + i6;
        this.f19945r = i8;
        int i9 = this.f19936i;
        if (i8 >= i9) {
            this.f19945r = i8 - i9;
        }
        int i10 = this.f19946s - i6;
        this.f19946s = i10;
        if (i10 < 0) {
            this.f19946s = 0;
        }
        this.f19930c.d(i7);
        if (this.f19943p != 0) {
            return this.f19938k[this.f19945r];
        }
        int i11 = this.f19945r;
        if (i11 == 0) {
            i11 = this.f19936i;
        }
        return this.f19938k[i11 - 1] + this.f19939l[r6];
    }

    public final void q(long j6, boolean z6, boolean z7) {
        this.f19928a.b(m(j6, z6, z7));
    }

    public final void r() {
        this.f19928a.b(n());
    }

    public final void s() {
        this.f19928a.b(o());
    }

    public final long t(int i6) {
        int H6 = H() - i6;
        boolean z6 = false;
        AbstractC1119a.a(H6 >= 0 && H6 <= this.f19943p - this.f19946s);
        int i7 = this.f19943p - H6;
        this.f19943p = i7;
        this.f19949v = Math.max(this.f19948u, C(i7));
        if (H6 == 0 && this.f19950w) {
            z6 = true;
        }
        this.f19950w = z6;
        this.f19930c.c(i6);
        int i8 = this.f19943p;
        if (i8 == 0) {
            return 0L;
        }
        return this.f19938k[E(i8 - 1)] + this.f19939l[r9];
    }

    public final void u(int i6) {
        this.f19928a.c(t(i6));
    }

    public final int v(int i6, int i7, long j6, boolean z6) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f19941n[i6] >= j6) {
                return i8;
            }
            i6++;
            if (i6 == this.f19936i) {
                i6 = 0;
            }
        }
        if (z6) {
            return i7;
        }
        return -1;
    }

    public final int w(int i6, int i7, long j6, boolean z6) {
        int i8 = -1;
        for (int i9 = 0; i9 < i7; i9++) {
            long j7 = this.f19941n[i6];
            if (j7 > j6) {
                break;
            }
            if (!z6 || (this.f19940m[i6] & 1) != 0) {
                if (j7 == j6) {
                    return i9;
                }
                i8 = i9;
            }
            i6++;
            if (i6 == this.f19936i) {
                i6 = 0;
            }
        }
        return i8;
    }

    public Z0.q x(Z0.q qVar) {
        return (this.f19926F == 0 || qVar.f6995s == LongCompanionObject.MAX_VALUE) ? qVar : qVar.a().s0(qVar.f6995s + this.f19926F).K();
    }

    public final int y() {
        return this.f19944q;
    }

    public final synchronized long z() {
        return this.f19943p == 0 ? Long.MIN_VALUE : this.f19941n[this.f19945r];
    }
}
