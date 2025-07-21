package k2;

import E1.O;
import c1.AbstractC1119a;
import c1.C1144z;
import java.util.Arrays;
import k2.K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class n implements InterfaceC1679m {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f16595q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f16596a;

    /* renamed from: b, reason: collision with root package name */
    public O f16597b;

    /* renamed from: c, reason: collision with root package name */
    public final M f16598c;

    /* renamed from: d, reason: collision with root package name */
    public final C1144z f16599d;

    /* renamed from: e, reason: collision with root package name */
    public final w f16600e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f16601f;

    /* renamed from: g, reason: collision with root package name */
    public final a f16602g;

    /* renamed from: h, reason: collision with root package name */
    public long f16603h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16604i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16605j;

    /* renamed from: k, reason: collision with root package name */
    public long f16606k;

    /* renamed from: l, reason: collision with root package name */
    public long f16607l;

    /* renamed from: m, reason: collision with root package name */
    public long f16608m;

    /* renamed from: n, reason: collision with root package name */
    public long f16609n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16610o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16611p;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final byte[] f16612e = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public boolean f16613a;

        /* renamed from: b, reason: collision with root package name */
        public int f16614b;

        /* renamed from: c, reason: collision with root package name */
        public int f16615c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f16616d;

        public a(int i6) {
            this.f16616d = new byte[i6];
        }

        public void a(byte[] bArr, int i6, int i7) {
            if (this.f16613a) {
                int i8 = i7 - i6;
                byte[] bArr2 = this.f16616d;
                int length = bArr2.length;
                int i9 = this.f16614b;
                if (length < i9 + i8) {
                    this.f16616d = Arrays.copyOf(bArr2, (i9 + i8) * 2);
                }
                System.arraycopy(bArr, i6, this.f16616d, this.f16614b, i8);
                this.f16614b += i8;
            }
        }

        public boolean b(int i6, int i7) {
            if (this.f16613a) {
                int i8 = this.f16614b - i7;
                this.f16614b = i8;
                if (this.f16615c != 0 || i6 != 181) {
                    this.f16613a = false;
                    return true;
                }
                this.f16615c = i8;
            } else if (i6 == 179) {
                this.f16613a = true;
            }
            byte[] bArr = f16612e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f16613a = false;
            this.f16614b = 0;
            this.f16615c = 0;
        }
    }

    public n() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair f(k2.n.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f16616d
            int r1 = r8.f16614b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r5 = r5 >> r1
            r2 = r2 | r5
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r6
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3e
            r7 = 3
            if (r6 == r7) goto L38
            if (r6 == r1) goto L30
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L30:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
        L35:
            float r6 = (float) r6
            float r1 = r1 / r6
            goto L44
        L38:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L35
        L3e:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
            goto L35
        L44:
            Z0.q$b r6 = new Z0.q$b
            r6.<init>()
            Z0.q$b r9 = r6.a0(r9)
            java.lang.String r6 = "video/mpeg2"
            Z0.q$b r9 = r9.o0(r6)
            Z0.q$b r9 = r9.v0(r2)
            Z0.q$b r9 = r9.Y(r4)
            Z0.q$b r9 = r9.k0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            Z0.q$b r9 = r9.b0(r1)
            Z0.q r9 = r9.K()
            r1 = r0[r5]
            r1 = r1 & 15
            int r1 = r1 + (-1)
            if (r1 < 0) goto L98
            double[] r2 = k2.n.f16595q
            int r4 = r2.length
            if (r1 >= r4) goto L98
            r1 = r2[r1]
            int r8 = r8.f16615c
            int r8 = r8 + 9
            r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L90
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L90:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r0 = (long) r3
            goto L9a
        L98:
            r0 = 0
        L9a:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.n.f(k2.n$a, java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012c  */
    @Override // k2.InterfaceC1679m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(c1.C1144z r20) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.n.a(c1.z):void");
    }

    @Override // k2.InterfaceC1679m
    public void b() {
        d1.d.a(this.f16601f);
        this.f16602g.c();
        w wVar = this.f16600e;
        if (wVar != null) {
            wVar.d();
        }
        this.f16603h = 0L;
        this.f16604i = false;
        this.f16607l = -9223372036854775807L;
        this.f16609n = -9223372036854775807L;
    }

    @Override // k2.InterfaceC1679m
    public void c(boolean z6) {
        AbstractC1119a.i(this.f16597b);
        if (z6) {
            boolean z7 = this.f16610o;
            this.f16597b.f(this.f16609n, z7 ? 1 : 0, (int) (this.f16603h - this.f16608m), 0, null);
        }
    }

    @Override // k2.InterfaceC1679m
    public void d(long j6, int i6) {
        this.f16607l = j6;
    }

    @Override // k2.InterfaceC1679m
    public void e(E1.r rVar, K.d dVar) {
        dVar.a();
        this.f16596a = dVar.b();
        this.f16597b = rVar.a(dVar.c(), 2);
        M m6 = this.f16598c;
        if (m6 != null) {
            m6.b(rVar, dVar);
        }
    }

    public n(M m6) {
        this.f16598c = m6;
        this.f16601f = new boolean[4];
        this.f16602g = new a(128);
        if (m6 != null) {
            this.f16600e = new w(178, 128);
            this.f16599d = new C1144z();
        } else {
            this.f16600e = null;
            this.f16599d = null;
        }
        this.f16607l = -9223372036854775807L;
        this.f16609n = -9223372036854775807L;
    }
}
