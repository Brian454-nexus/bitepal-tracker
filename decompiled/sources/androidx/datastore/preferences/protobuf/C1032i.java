package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1032i implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1031h f8779a;

    /* renamed from: b, reason: collision with root package name */
    public int f8780b;

    /* renamed from: c, reason: collision with root package name */
    public int f8781c;

    /* renamed from: d, reason: collision with root package name */
    public int f8782d = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.i$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8783a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f8783a = iArr;
            try {
                iArr[r0.b.f8854j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8783a[r0.b.f8858n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8783a[r0.b.f8847c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8783a[r0.b.f8860p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8783a[r0.b.f8853i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8783a[r0.b.f8852h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8783a[r0.b.f8848d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8783a[r0.b.f8851g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8783a[r0.b.f8849e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8783a[r0.b.f8857m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8783a[r0.b.f8861q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8783a[r0.b.f8862r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f8783a[r0.b.f8863s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f8783a[r0.b.f8864t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f8783a[r0.b.f8855k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f8783a[r0.b.f8859o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f8783a[r0.b.f8850f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C1032i(AbstractC1031h abstractC1031h) {
        AbstractC1031h abstractC1031h2 = (AbstractC1031h) AbstractC1047y.b(abstractC1031h, "input");
        this.f8779a = abstractC1031h2;
        abstractC1031h2.f8739d = this;
    }

    public static C1032i O(AbstractC1031h abstractC1031h) {
        C1032i c1032i = abstractC1031h.f8739d;
        return c1032i != null ? c1032i : new C1032i(abstractC1031h);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void A(List list) {
        int B6;
        if (list instanceof AbstractC1043u) {
            android.support.v4.media.session.b.a(list);
            int b6 = r0.b(this.f8780b);
            if (b6 != 2) {
                if (b6 != 5) {
                    throw C1048z.e();
                }
                this.f8779a.s();
                throw null;
            }
            Y(this.f8779a.C());
            this.f8779a.d();
            this.f8779a.s();
            throw null;
        }
        int b7 = r0.b(this.f8780b);
        if (b7 == 2) {
            int C6 = this.f8779a.C();
            Y(C6);
            int d6 = this.f8779a.d() + C6;
            do {
                list.add(Float.valueOf(this.f8779a.s()));
            } while (this.f8779a.d() < d6);
            return;
        }
        if (b7 != 5) {
            throw C1048z.e();
        }
        do {
            list.add(Float.valueOf(this.f8779a.s()));
            if (this.f8779a.e()) {
                return;
            } else {
                B6 = this.f8779a.B();
            }
        } while (B6 == this.f8780b);
        this.f8782d = B6;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int B() {
        X(0);
        return this.f8779a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public boolean C() {
        int i6;
        if (this.f8779a.e() || (i6 = this.f8780b) == this.f8781c) {
            return false;
        }
        return this.f8779a.E(i6);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int D() {
        X(5);
        return this.f8779a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void E(List list) {
        int B6;
        if (r0.b(this.f8780b) != 2) {
            throw C1048z.e();
        }
        do {
            list.add(z());
            if (this.f8779a.e()) {
                return;
            } else {
                B6 = this.f8779a.B();
            }
        } while (B6 == this.f8780b);
        this.f8782d = B6;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void F(List list) {
        int B6;
        if (list instanceof AbstractC1035l) {
            android.support.v4.media.session.b.a(list);
            int b6 = r0.b(this.f8780b);
            if (b6 == 1) {
                this.f8779a.o();
                throw null;
            }
            if (b6 != 2) {
                throw C1048z.e();
            }
            Z(this.f8779a.C());
            this.f8779a.d();
            this.f8779a.o();
            throw null;
        }
        int b7 = r0.b(this.f8780b);
        if (b7 != 1) {
            if (b7 != 2) {
                throw C1048z.e();
            }
            int C6 = this.f8779a.C();
            Z(C6);
            int d6 = this.f8779a.d() + C6;
            do {
                list.add(Double.valueOf(this.f8779a.o()));
            } while (this.f8779a.d() < d6);
            return;
        }
        do {
            list.add(Double.valueOf(this.f8779a.o()));
            if (this.f8779a.e()) {
                return;
            } else {
                B6 = this.f8779a.B();
            }
        } while (B6 == this.f8780b);
        this.f8782d = B6;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long G() {
        X(0);
        return this.f8779a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public String H() {
        X(2);
        return this.f8779a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void I(List list) {
        int B6;
        if (list instanceof F) {
            android.support.v4.media.session.b.a(list);
            int b6 = r0.b(this.f8780b);
            if (b6 == 1) {
                this.f8779a.r();
                throw null;
            }
            if (b6 != 2) {
                throw C1048z.e();
            }
            Z(this.f8779a.C());
            this.f8779a.d();
            this.f8779a.r();
            throw null;
        }
        int b7 = r0.b(this.f8780b);
        if (b7 != 1) {
            if (b7 != 2) {
                throw C1048z.e();
            }
            int C6 = this.f8779a.C();
            Z(C6);
            int d6 = this.f8779a.d() + C6;
            do {
                list.add(Long.valueOf(this.f8779a.r()));
            } while (this.f8779a.d() < d6);
            return;
        }
        do {
            list.add(Long.valueOf(this.f8779a.r()));
            if (this.f8779a.e()) {
                return;
            } else {
                B6 = this.f8779a.B();
            }
        } while (B6 == this.f8780b);
        this.f8782d = B6;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void J(Object obj, e0 e0Var, C1038o c1038o) {
        X(2);
        Q(obj, e0Var, c1038o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        r7.f8779a.k(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K(java.util.Map r8, androidx.datastore.preferences.protobuf.H.a r9, androidx.datastore.preferences.protobuf.C1038o r10) {
        /*
            r7 = this;
            r0 = 2
            r7.X(r0)
            androidx.datastore.preferences.protobuf.h r1 = r7.f8779a
            int r1 = r1.C()
            androidx.datastore.preferences.protobuf.h r2 = r7.f8779a
            int r1 = r2.l(r1)
            java.lang.Object r2 = r9.f8670b
            java.lang.Object r3 = r9.f8672d
        L14:
            int r4 = r7.w()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            androidx.datastore.preferences.protobuf.h r5 = r7.f8779a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.C()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1048z.a -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.z r4 = new androidx.datastore.preferences.protobuf.z     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1048z.a -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1048z.a -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1048z.a -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            androidx.datastore.preferences.protobuf.r0$b r4 = r9.f8671c     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1048z.a -> L51
            java.lang.Object r5 = r9.f8672d     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1048z.a -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1048z.a -> L51
            java.lang.Object r3 = r7.R(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1048z.a -> L51
            goto L14
        L49:
            androidx.datastore.preferences.protobuf.r0$b r4 = r9.f8669a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1048z.a -> L51
            r5 = 0
            java.lang.Object r2 = r7.R(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1048z.a -> L51
            goto L14
        L51:
            boolean r4 = r7.C()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            androidx.datastore.preferences.protobuf.z r8 = new androidx.datastore.preferences.protobuf.z     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            androidx.datastore.preferences.protobuf.h r8 = r7.f8779a
            r8.k(r1)
            return
        L67:
            androidx.datastore.preferences.protobuf.h r9 = r7.f8779a
            r9.k(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1032i.K(java.util.Map, androidx.datastore.preferences.protobuf.H$a, androidx.datastore.preferences.protobuf.o):void");
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void L(Object obj, e0 e0Var, C1038o c1038o) {
        X(3);
        P(obj, e0Var, c1038o);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void M(List list, e0 e0Var, C1038o c1038o) {
        int B6;
        if (r0.b(this.f8780b) != 3) {
            throw C1048z.e();
        }
        int i6 = this.f8780b;
        do {
            list.add(S(e0Var, c1038o));
            if (this.f8779a.e() || this.f8782d != 0) {
                return;
            } else {
                B6 = this.f8779a.B();
            }
        } while (B6 == i6);
        this.f8782d = B6;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void N(List list, e0 e0Var, C1038o c1038o) {
        int B6;
        if (r0.b(this.f8780b) != 2) {
            throw C1048z.e();
        }
        int i6 = this.f8780b;
        do {
            list.add(T(e0Var, c1038o));
            if (this.f8779a.e() || this.f8782d != 0) {
                return;
            } else {
                B6 = this.f8779a.B();
            }
        } while (B6 == i6);
        this.f8782d = B6;
    }

    public final void P(Object obj, e0 e0Var, C1038o c1038o) {
        int i6 = this.f8781c;
        this.f8781c = r0.c(r0.a(this.f8780b), 4);
        try {
            e0Var.h(obj, this, c1038o);
            if (this.f8780b == this.f8781c) {
            } else {
                throw C1048z.h();
            }
        } finally {
            this.f8781c = i6;
        }
    }

    public final void Q(Object obj, e0 e0Var, C1038o c1038o) {
        int C6 = this.f8779a.C();
        AbstractC1031h abstractC1031h = this.f8779a;
        if (abstractC1031h.f8736a >= abstractC1031h.f8737b) {
            throw C1048z.i();
        }
        int l6 = abstractC1031h.l(C6);
        this.f8779a.f8736a++;
        e0Var.h(obj, this, c1038o);
        this.f8779a.a(0);
        r5.f8736a--;
        this.f8779a.k(l6);
    }

    public final Object R(r0.b bVar, Class cls, C1038o c1038o) {
        switch (a.f8783a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(i());
            case 2:
                return z();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(q());
            case 5:
                return Integer.valueOf(h());
            case 6:
                return Long.valueOf(d());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(B());
            case 9:
                return Long.valueOf(G());
            case 10:
                return U(cls, c1038o);
            case 11:
                return Integer.valueOf(D());
            case 12:
                return Long.valueOf(j());
            case 13:
                return Integer.valueOf(s());
            case 14:
                return Long.valueOf(t());
            case 15:
                return H();
            case 16:
                return Integer.valueOf(l());
            case 17:
                return Long.valueOf(c());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final Object S(e0 e0Var, C1038o c1038o) {
        Object f6 = e0Var.f();
        P(f6, e0Var, c1038o);
        e0Var.b(f6);
        return f6;
    }

    public final Object T(e0 e0Var, C1038o c1038o) {
        Object f6 = e0Var.f();
        Q(f6, e0Var, c1038o);
        e0Var.b(f6);
        return f6;
    }

    public Object U(Class cls, C1038o c1038o) {
        X(2);
        return T(a0.a().c(cls), c1038o);
    }

    public void V(List list, boolean z6) {
        int B6;
        int B7;
        if (r0.b(this.f8780b) != 2) {
            throw C1048z.e();
        }
        if (!(list instanceof D) || z6) {
            do {
                list.add(z6 ? H() : v());
                if (this.f8779a.e()) {
                    return;
                } else {
                    B6 = this.f8779a.B();
                }
            } while (B6 == this.f8780b);
            this.f8782d = B6;
            return;
        }
        D d6 = (D) list;
        do {
            d6.q(z());
            if (this.f8779a.e()) {
                return;
            } else {
                B7 = this.f8779a.B();
            }
        } while (B7 == this.f8780b);
        this.f8782d = B7;
    }

    public final void W(int i6) {
        if (this.f8779a.d() != i6) {
            throw C1048z.m();
        }
    }

    public final void X(int i6) {
        if (r0.b(this.f8780b) != i6) {
            throw C1048z.e();
        }
    }

    public final void Y(int i6) {
        if ((i6 & 3) != 0) {
            throw C1048z.h();
        }
    }

    public final void Z(int i6) {
        if ((i6 & 7) != 0) {
            throw C1048z.h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int a() {
        return this.f8780b;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void b(List list) {
        int B6;
        if (list instanceof AbstractC1046x) {
            android.support.v4.media.session.b.a(list);
            int b6 = r0.b(this.f8780b);
            if (b6 == 0) {
                this.f8779a.x();
                throw null;
            }
            if (b6 != 2) {
                throw C1048z.e();
            }
            this.f8779a.C();
            this.f8779a.d();
            this.f8779a.x();
            throw null;
        }
        int b7 = r0.b(this.f8780b);
        if (b7 != 0) {
            if (b7 != 2) {
                throw C1048z.e();
            }
            int d6 = this.f8779a.d() + this.f8779a.C();
            do {
                list.add(Integer.valueOf(this.f8779a.x()));
            } while (this.f8779a.d() < d6);
            W(d6);
            return;
        }
        do {
            list.add(Integer.valueOf(this.f8779a.x()));
            if (this.f8779a.e()) {
                return;
            } else {
                B6 = this.f8779a.B();
            }
        } while (B6 == this.f8780b);
        this.f8782d = B6;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long c() {
        X(0);
        return this.f8779a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long d() {
        X(1);
        return this.f8779a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void e(List list) {
        int B6;
        if (list instanceof AbstractC1046x) {
            android.support.v4.media.session.b.a(list);
            int b6 = r0.b(this.f8780b);
            if (b6 != 2) {
                if (b6 != 5) {
                    throw C1048z.e();
                }
                this.f8779a.v();
                throw null;
            }
            Y(this.f8779a.C());
            this.f8779a.d();
            this.f8779a.v();
            throw null;
        }
        int b7 = r0.b(this.f8780b);
        if (b7 == 2) {
            int C6 = this.f8779a.C();
            Y(C6);
            int d6 = this.f8779a.d() + C6;
            do {
                list.add(Integer.valueOf(this.f8779a.v()));
            } while (this.f8779a.d() < d6);
            return;
        }
        if (b7 != 5) {
            throw C1048z.e();
        }
        do {
            list.add(Integer.valueOf(this.f8779a.v()));
            if (this.f8779a.e()) {
                return;
            } else {
                B6 = this.f8779a.B();
            }
        } while (B6 == this.f8780b);
        this.f8782d = B6;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void f(List list) {
        int B6;
        if (list instanceof F) {
            android.support.v4.media.session.b.a(list);
            int b6 = r0.b(this.f8780b);
            if (b6 == 0) {
                this.f8779a.y();
                throw null;
            }
            if (b6 != 2) {
                throw C1048z.e();
            }
            this.f8779a.C();
            this.f8779a.d();
            this.f8779a.y();
            throw null;
        }
        int b7 = r0.b(this.f8780b);
        if (b7 != 0) {
            if (b7 != 2) {
                throw C1048z.e();
            }
            int d6 = this.f8779a.d() + this.f8779a.C();
            do {
                list.add(Long.valueOf(this.f8779a.y()));
            } while (this.f8779a.d() < d6);
            W(d6);
            return;
        }
        do {
            list.add(Long.valueOf(this.f8779a.y()));
            if (this.f8779a.e()) {
                return;
            } else {
                B6 = this.f8779a.B();
            }
        } while (B6 == this.f8780b);
        this.f8782d = B6;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void g(List list) {
        int B6;
        if (list instanceof AbstractC1046x) {
            android.support.v4.media.session.b.a(list);
            int b6 = r0.b(this.f8780b);
            if (b6 == 0) {
                this.f8779a.C();
                throw null;
            }
            if (b6 != 2) {
                throw C1048z.e();
            }
            this.f8779a.C();
            this.f8779a.d();
            this.f8779a.C();
            throw null;
        }
        int b7 = r0.b(this.f8780b);
        if (b7 != 0) {
            if (b7 != 2) {
                throw C1048z.e();
            }
            int d6 = this.f8779a.d() + this.f8779a.C();
            do {
                list.add(Integer.valueOf(this.f8779a.C()));
            } while (this.f8779a.d() < d6);
            W(d6);
            return;
        }
        do {
            list.add(Integer.valueOf(this.f8779a.C()));
            if (this.f8779a.e()) {
                return;
            } else {
                B6 = this.f8779a.B();
            }
        } while (B6 == this.f8780b);
        this.f8782d = B6;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int h() {
        X(5);
        return this.f8779a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public boolean i() {
        X(0);
        return this.f8779a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long j() {
        X(1);
        return this.f8779a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void k(List list) {
        int B6;
        if (list instanceof F) {
            android.support.v4.media.session.b.a(list);
            int b6 = r0.b(this.f8780b);
            if (b6 == 0) {
                this.f8779a.D();
                throw null;
            }
            if (b6 != 2) {
                throw C1048z.e();
            }
            this.f8779a.C();
            this.f8779a.d();
            this.f8779a.D();
            throw null;
        }
        int b7 = r0.b(this.f8780b);
        if (b7 != 0) {
            if (b7 != 2) {
                throw C1048z.e();
            }
            int d6 = this.f8779a.d() + this.f8779a.C();
            do {
                list.add(Long.valueOf(this.f8779a.D()));
            } while (this.f8779a.d() < d6);
            W(d6);
            return;
        }
        do {
            list.add(Long.valueOf(this.f8779a.D()));
            if (this.f8779a.e()) {
                return;
            } else {
                B6 = this.f8779a.B();
            }
        } while (B6 == this.f8780b);
        this.f8782d = B6;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int l() {
        X(0);
        return this.f8779a.C();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void m(List list) {
        int B6;
        if (list instanceof F) {
            android.support.v4.media.session.b.a(list);
            int b6 = r0.b(this.f8780b);
            if (b6 == 0) {
                this.f8779a.u();
                throw null;
            }
            if (b6 != 2) {
                throw C1048z.e();
            }
            this.f8779a.C();
            this.f8779a.d();
            this.f8779a.u();
            throw null;
        }
        int b7 = r0.b(this.f8780b);
        if (b7 != 0) {
            if (b7 != 2) {
                throw C1048z.e();
            }
            int d6 = this.f8779a.d() + this.f8779a.C();
            do {
                list.add(Long.valueOf(this.f8779a.u()));
            } while (this.f8779a.d() < d6);
            W(d6);
            return;
        }
        do {
            list.add(Long.valueOf(this.f8779a.u()));
            if (this.f8779a.e()) {
                return;
            } else {
                B6 = this.f8779a.B();
            }
        } while (B6 == this.f8780b);
        this.f8782d = B6;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void n(List list) {
        int B6;
        if (list instanceof F) {
            android.support.v4.media.session.b.a(list);
            int b6 = r0.b(this.f8780b);
            if (b6 == 1) {
                this.f8779a.w();
                throw null;
            }
            if (b6 != 2) {
                throw C1048z.e();
            }
            Z(this.f8779a.C());
            this.f8779a.d();
            this.f8779a.w();
            throw null;
        }
        int b7 = r0.b(this.f8780b);
        if (b7 != 1) {
            if (b7 != 2) {
                throw C1048z.e();
            }
            int C6 = this.f8779a.C();
            Z(C6);
            int d6 = this.f8779a.d() + C6;
            do {
                list.add(Long.valueOf(this.f8779a.w()));
            } while (this.f8779a.d() < d6);
            return;
        }
        do {
            list.add(Long.valueOf(this.f8779a.w()));
            if (this.f8779a.e()) {
                return;
            } else {
                B6 = this.f8779a.B();
            }
        } while (B6 == this.f8780b);
        this.f8782d = B6;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void o(List list) {
        int B6;
        if (list instanceof AbstractC1046x) {
            android.support.v4.media.session.b.a(list);
            int b6 = r0.b(this.f8780b);
            if (b6 == 0) {
                this.f8779a.t();
                throw null;
            }
            if (b6 != 2) {
                throw C1048z.e();
            }
            this.f8779a.C();
            this.f8779a.d();
            this.f8779a.t();
            throw null;
        }
        int b7 = r0.b(this.f8780b);
        if (b7 != 0) {
            if (b7 != 2) {
                throw C1048z.e();
            }
            int d6 = this.f8779a.d() + this.f8779a.C();
            do {
                list.add(Integer.valueOf(this.f8779a.t()));
            } while (this.f8779a.d() < d6);
            W(d6);
            return;
        }
        do {
            list.add(Integer.valueOf(this.f8779a.t()));
            if (this.f8779a.e()) {
                return;
            } else {
                B6 = this.f8779a.B();
            }
        } while (B6 == this.f8780b);
        this.f8782d = B6;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void p(List list) {
        int B6;
        if (list instanceof AbstractC1046x) {
            android.support.v4.media.session.b.a(list);
            int b6 = r0.b(this.f8780b);
            if (b6 == 0) {
                this.f8779a.p();
                throw null;
            }
            if (b6 != 2) {
                throw C1048z.e();
            }
            this.f8779a.C();
            this.f8779a.d();
            this.f8779a.p();
            throw null;
        }
        int b7 = r0.b(this.f8780b);
        if (b7 != 0) {
            if (b7 != 2) {
                throw C1048z.e();
            }
            int d6 = this.f8779a.d() + this.f8779a.C();
            do {
                list.add(Integer.valueOf(this.f8779a.p()));
            } while (this.f8779a.d() < d6);
            W(d6);
            return;
        }
        do {
            list.add(Integer.valueOf(this.f8779a.p()));
            if (this.f8779a.e()) {
                return;
            } else {
                B6 = this.f8779a.B();
            }
        } while (B6 == this.f8780b);
        this.f8782d = B6;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int q() {
        X(0);
        return this.f8779a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void r(List list) {
        int B6;
        if (list instanceof AbstractC1046x) {
            android.support.v4.media.session.b.a(list);
            int b6 = r0.b(this.f8780b);
            if (b6 != 2) {
                if (b6 != 5) {
                    throw C1048z.e();
                }
                this.f8779a.q();
                throw null;
            }
            Y(this.f8779a.C());
            this.f8779a.d();
            this.f8779a.q();
            throw null;
        }
        int b7 = r0.b(this.f8780b);
        if (b7 == 2) {
            int C6 = this.f8779a.C();
            Y(C6);
            int d6 = this.f8779a.d() + C6;
            do {
                list.add(Integer.valueOf(this.f8779a.q()));
            } while (this.f8779a.d() < d6);
            return;
        }
        if (b7 != 5) {
            throw C1048z.e();
        }
        do {
            list.add(Integer.valueOf(this.f8779a.q()));
            if (this.f8779a.e()) {
                return;
            } else {
                B6 = this.f8779a.B();
            }
        } while (B6 == this.f8780b);
        this.f8782d = B6;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public double readDouble() {
        X(1);
        return this.f8779a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public float readFloat() {
        X(5);
        return this.f8779a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int s() {
        X(0);
        return this.f8779a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long t() {
        X(0);
        return this.f8779a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void u(List list) {
        int B6;
        if (list instanceof AbstractC1028e) {
            android.support.v4.media.session.b.a(list);
            int b6 = r0.b(this.f8780b);
            if (b6 == 0) {
                this.f8779a.m();
                throw null;
            }
            if (b6 != 2) {
                throw C1048z.e();
            }
            this.f8779a.C();
            this.f8779a.d();
            this.f8779a.m();
            throw null;
        }
        int b7 = r0.b(this.f8780b);
        if (b7 != 0) {
            if (b7 != 2) {
                throw C1048z.e();
            }
            int d6 = this.f8779a.d() + this.f8779a.C();
            do {
                list.add(Boolean.valueOf(this.f8779a.m()));
            } while (this.f8779a.d() < d6);
            W(d6);
            return;
        }
        do {
            list.add(Boolean.valueOf(this.f8779a.m()));
            if (this.f8779a.e()) {
                return;
            } else {
                B6 = this.f8779a.B();
            }
        } while (B6 == this.f8780b);
        this.f8782d = B6;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public String v() {
        X(2);
        return this.f8779a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int w() {
        int i6 = this.f8782d;
        if (i6 != 0) {
            this.f8780b = i6;
            this.f8782d = 0;
        } else {
            this.f8780b = this.f8779a.B();
        }
        int i7 = this.f8780b;
        return (i7 == 0 || i7 == this.f8781c) ? IntCompanionObject.MAX_VALUE : r0.a(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void x(List list) {
        V(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void y(List list) {
        V(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public AbstractC1030g z() {
        X(2);
        return this.f8779a.n();
    }
}
