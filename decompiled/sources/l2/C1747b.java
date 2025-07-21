package l2;

import E1.I;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.O;
import E1.T;
import E1.r;
import E1.u;
import Z0.q;
import Z0.z;
import android.util.Pair;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1144z;

/* renamed from: l2.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1747b implements InterfaceC0314p {

    /* renamed from: h, reason: collision with root package name */
    public static final u f17033h = new u() { // from class: l2.a
        @Override // E1.u
        public final InterfaceC0314p[] c() {
            return C1747b.b();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public r f17034a;

    /* renamed from: b, reason: collision with root package name */
    public O f17035b;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0217b f17038e;

    /* renamed from: c, reason: collision with root package name */
    public int f17036c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f17037d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f17039f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f17040g = -1;

    /* renamed from: l2.b$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements InterfaceC0217b {

        /* renamed from: m, reason: collision with root package name */
        public static final int[] f17041m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n, reason: collision with root package name */
        public static final int[] f17042n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a, reason: collision with root package name */
        public final r f17043a;

        /* renamed from: b, reason: collision with root package name */
        public final O f17044b;

        /* renamed from: c, reason: collision with root package name */
        public final C1748c f17045c;

        /* renamed from: d, reason: collision with root package name */
        public final int f17046d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f17047e;

        /* renamed from: f, reason: collision with root package name */
        public final C1144z f17048f;

        /* renamed from: g, reason: collision with root package name */
        public final int f17049g;

        /* renamed from: h, reason: collision with root package name */
        public final q f17050h;

        /* renamed from: i, reason: collision with root package name */
        public int f17051i;

        /* renamed from: j, reason: collision with root package name */
        public long f17052j;

        /* renamed from: k, reason: collision with root package name */
        public int f17053k;

        /* renamed from: l, reason: collision with root package name */
        public long f17054l;

        public a(r rVar, O o6, C1748c c1748c) {
            this.f17043a = rVar;
            this.f17044b = o6;
            this.f17045c = c1748c;
            int max = Math.max(1, c1748c.f17065c / 10);
            this.f17049g = max;
            C1144z c1144z = new C1144z(c1748c.f17069g);
            c1144z.y();
            int y6 = c1144z.y();
            this.f17046d = y6;
            int i6 = c1748c.f17064b;
            int i7 = (((c1748c.f17067e - (i6 * 4)) * 8) / (c1748c.f17068f * i6)) + 1;
            if (y6 == i7) {
                int k6 = AbstractC1117K.k(max, y6);
                this.f17047e = new byte[c1748c.f17067e * k6];
                this.f17048f = new C1144z(k6 * h(y6, i6));
                int i8 = ((c1748c.f17065c * c1748c.f17067e) * 8) / y6;
                this.f17050h = new q.b().o0("audio/raw").M(i8).j0(i8).f0(h(max, i6)).N(c1748c.f17064b).p0(c1748c.f17065c).i0(2).K();
                return;
            }
            throw z.a("Expected frames per block: " + i7 + "; got: " + y6, null);
        }

        public static int h(int i6, int i7) {
            return i6 * 2 * i7;
        }

        @Override // l2.C1747b.InterfaceC0217b
        public void a(long j6) {
            this.f17051i = 0;
            this.f17052j = j6;
            this.f17053k = 0;
            this.f17054l = 0L;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0035 -> B:3:0x001b). Please report as a decompilation issue!!! */
        @Override // l2.C1747b.InterfaceC0217b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean b(E1.InterfaceC0315q r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f17049g
                int r1 = r6.f17053k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f17046d
                int r0 = c1.AbstractC1117K.k(r0, r1)
                l2.c r1 = r6.f17045c
                int r1 = r1.f17067e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f17051i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f17047e
                int r5 = r6.f17051i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f17051i
                int r4 = r4 + r3
                r6.f17051i = r4
                goto L1e
            L3e:
                int r7 = r6.f17051i
                l2.c r8 = r6.f17045c
                int r8 = r8.f17067e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f17047e
                c1.z r9 = r6.f17048f
                r6.d(r8, r7, r9)
                int r8 = r6.f17051i
                l2.c r9 = r6.f17045c
                int r9 = r9.f17067e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f17051i = r8
                c1.z r7 = r6.f17048f
                int r7 = r7.g()
                E1.O r8 = r6.f17044b
                c1.z r9 = r6.f17048f
                r8.a(r9, r7)
                int r8 = r6.f17053k
                int r8 = r8 + r7
                r6.f17053k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f17049g
                if (r7 < r8) goto L75
                r6.i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f17053k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L82
                r6.i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.C1747b.a.b(E1.q, long):boolean");
        }

        @Override // l2.C1747b.InterfaceC0217b
        public void c(int i6, long j6) {
            this.f17043a.n(new C1750e(this.f17045c, this.f17046d, i6, j6));
            this.f17044b.e(this.f17050h);
        }

        public final void d(byte[] bArr, int i6, C1144z c1144z) {
            for (int i7 = 0; i7 < i6; i7++) {
                for (int i8 = 0; i8 < this.f17045c.f17064b; i8++) {
                    e(bArr, i7, i8, c1144z.e());
                }
            }
            int g6 = g(this.f17046d * i6);
            c1144z.T(0);
            c1144z.S(g6);
        }

        public final void e(byte[] bArr, int i6, int i7, byte[] bArr2) {
            C1748c c1748c = this.f17045c;
            int i8 = c1748c.f17067e;
            int i9 = c1748c.f17064b;
            int i10 = (i6 * i8) + (i7 * 4);
            int i11 = (i9 * 4) + i10;
            int i12 = (i8 / i9) - 4;
            int i13 = (short) (((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255));
            int min = Math.min(bArr[i10 + 2] & 255, 88);
            int i14 = f17042n[min];
            int i15 = ((i6 * this.f17046d * i9) + i7) * 2;
            bArr2[i15] = (byte) (i13 & 255);
            bArr2[i15 + 1] = (byte) (i13 >> 8);
            for (int i16 = 0; i16 < i12 * 2; i16++) {
                byte b6 = bArr[((i16 / 8) * i9 * 4) + i11 + ((i16 / 2) % 4)];
                int i17 = i16 % 2 == 0 ? b6 & 15 : (b6 & 255) >> 4;
                int i18 = ((((i17 & 7) * 2) + 1) * i14) >> 3;
                if ((i17 & 8) != 0) {
                    i18 = -i18;
                }
                i13 = AbstractC1117K.p(i13 + i18, -32768, 32767);
                i15 += i9 * 2;
                bArr2[i15] = (byte) (i13 & 255);
                bArr2[i15 + 1] = (byte) (i13 >> 8);
                int i19 = min + f17041m[i17];
                int[] iArr = f17042n;
                min = AbstractC1117K.p(i19, 0, iArr.length - 1);
                i14 = iArr[min];
            }
        }

        public final int f(int i6) {
            return i6 / (this.f17045c.f17064b * 2);
        }

        public final int g(int i6) {
            return h(i6, this.f17045c.f17064b);
        }

        public final void i(int i6) {
            long W02 = this.f17052j + AbstractC1117K.W0(this.f17054l, 1000000L, this.f17045c.f17065c);
            int g6 = g(i6);
            this.f17044b.f(W02, 1, g6, this.f17053k - g6, null);
            this.f17054l += i6;
            this.f17053k -= g6;
        }
    }

    /* renamed from: l2.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface InterfaceC0217b {
        void a(long j6);

        boolean b(InterfaceC0315q interfaceC0315q, long j6);

        void c(int i6, long j6);
    }

    /* renamed from: l2.b$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements InterfaceC0217b {

        /* renamed from: a, reason: collision with root package name */
        public final r f17055a;

        /* renamed from: b, reason: collision with root package name */
        public final O f17056b;

        /* renamed from: c, reason: collision with root package name */
        public final C1748c f17057c;

        /* renamed from: d, reason: collision with root package name */
        public final q f17058d;

        /* renamed from: e, reason: collision with root package name */
        public final int f17059e;

        /* renamed from: f, reason: collision with root package name */
        public long f17060f;

        /* renamed from: g, reason: collision with root package name */
        public int f17061g;

        /* renamed from: h, reason: collision with root package name */
        public long f17062h;

        public c(r rVar, O o6, C1748c c1748c, String str, int i6) {
            this.f17055a = rVar;
            this.f17056b = o6;
            this.f17057c = c1748c;
            int i7 = (c1748c.f17064b * c1748c.f17068f) / 8;
            if (c1748c.f17067e == i7) {
                int i8 = c1748c.f17065c;
                int i9 = i8 * i7 * 8;
                int max = Math.max(i7, (i8 * i7) / 10);
                this.f17059e = max;
                this.f17058d = new q.b().o0(str).M(i9).j0(i9).f0(max).N(c1748c.f17064b).p0(c1748c.f17065c).i0(i6).K();
                return;
            }
            throw z.a("Expected block size: " + i7 + "; got: " + c1748c.f17067e, null);
        }

        @Override // l2.C1747b.InterfaceC0217b
        public void a(long j6) {
            this.f17060f = j6;
            this.f17061g = 0;
            this.f17062h = 0L;
        }

        @Override // l2.C1747b.InterfaceC0217b
        public boolean b(InterfaceC0315q interfaceC0315q, long j6) {
            int i6;
            int i7;
            long j7 = j6;
            while (j7 > 0 && (i6 = this.f17061g) < (i7 = this.f17059e)) {
                int c6 = this.f17056b.c(interfaceC0315q, (int) Math.min(i7 - i6, j7), true);
                if (c6 == -1) {
                    j7 = 0;
                } else {
                    this.f17061g += c6;
                    j7 -= c6;
                }
            }
            int i8 = this.f17057c.f17067e;
            int i9 = this.f17061g / i8;
            if (i9 > 0) {
                long W02 = this.f17060f + AbstractC1117K.W0(this.f17062h, 1000000L, r1.f17065c);
                int i10 = i9 * i8;
                int i11 = this.f17061g - i10;
                this.f17056b.f(W02, 1, i10, i11, null);
                this.f17062h += i9;
                this.f17061g = i11;
            }
            return j7 <= 0;
        }

        @Override // l2.C1747b.InterfaceC0217b
        public void c(int i6, long j6) {
            this.f17055a.n(new C1750e(this.f17057c, 1, i6, j6));
            this.f17056b.e(this.f17058d);
        }
    }

    public static /* synthetic */ InterfaceC0314p[] b() {
        return new InterfaceC0314p[]{new C1747b()};
    }

    private void e() {
        AbstractC1119a.i(this.f17035b);
        AbstractC1117K.i(this.f17034a);
    }

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        this.f17036c = j6 == 0 ? 0 : 4;
        InterfaceC0217b interfaceC0217b = this.f17038e;
        if (interfaceC0217b != null) {
            interfaceC0217b.a(j7);
        }
    }

    @Override // E1.InterfaceC0314p
    public void c(r rVar) {
        this.f17034a = rVar;
        this.f17035b = rVar.a(0, 1);
        rVar.k();
    }

    public final void f(InterfaceC0315q interfaceC0315q) {
        AbstractC1119a.g(interfaceC0315q.getPosition() == 0);
        int i6 = this.f17039f;
        if (i6 != -1) {
            interfaceC0315q.p(i6);
            this.f17036c = 4;
        } else {
            if (!AbstractC1749d.a(interfaceC0315q)) {
                throw z.a("Unsupported or unrecognized wav file type.", null);
            }
            interfaceC0315q.p((int) (interfaceC0315q.h() - interfaceC0315q.getPosition()));
            this.f17036c = 1;
        }
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, I i6) {
        e();
        int i7 = this.f17036c;
        if (i7 == 0) {
            f(interfaceC0315q);
            return 0;
        }
        if (i7 == 1) {
            k(interfaceC0315q);
            return 0;
        }
        if (i7 == 2) {
            j(interfaceC0315q);
            return 0;
        }
        if (i7 == 3) {
            m(interfaceC0315q);
            return 0;
        }
        if (i7 == 4) {
            return l(interfaceC0315q);
        }
        throw new IllegalStateException();
    }

    @Override // E1.InterfaceC0314p
    public boolean i(InterfaceC0315q interfaceC0315q) {
        return AbstractC1749d.a(interfaceC0315q);
    }

    public final void j(InterfaceC0315q interfaceC0315q) {
        C1748c b6 = AbstractC1749d.b(interfaceC0315q);
        int i6 = b6.f17063a;
        if (i6 == 17) {
            this.f17038e = new a(this.f17034a, this.f17035b, b6);
        } else if (i6 == 6) {
            this.f17038e = new c(this.f17034a, this.f17035b, b6, "audio/g711-alaw", -1);
        } else if (i6 == 7) {
            this.f17038e = new c(this.f17034a, this.f17035b, b6, "audio/g711-mlaw", -1);
        } else {
            int a6 = T.a(i6, b6.f17068f);
            if (a6 == 0) {
                throw z.e("Unsupported WAV format type: " + b6.f17063a);
            }
            this.f17038e = new c(this.f17034a, this.f17035b, b6, "audio/raw", a6);
        }
        this.f17036c = 3;
    }

    public final void k(InterfaceC0315q interfaceC0315q) {
        this.f17037d = AbstractC1749d.c(interfaceC0315q);
        this.f17036c = 2;
    }

    public final int l(InterfaceC0315q interfaceC0315q) {
        AbstractC1119a.g(this.f17040g != -1);
        return ((InterfaceC0217b) AbstractC1119a.e(this.f17038e)).b(interfaceC0315q, this.f17040g - interfaceC0315q.getPosition()) ? -1 : 0;
    }

    public final void m(InterfaceC0315q interfaceC0315q) {
        Pair e6 = AbstractC1749d.e(interfaceC0315q);
        this.f17039f = ((Long) e6.first).intValue();
        long longValue = ((Long) e6.second).longValue();
        long j6 = this.f17037d;
        if (j6 != -1 && longValue == 4294967295L) {
            longValue = j6;
        }
        this.f17040g = this.f17039f + longValue;
        long a6 = interfaceC0315q.a();
        if (a6 != -1 && this.f17040g > a6) {
            AbstractC1133o.h("WavExtractor", "Data exceeds input length: " + this.f17040g + ", " + a6);
            this.f17040g = a6;
        }
        ((InterfaceC0217b) AbstractC1119a.e(this.f17038e)).c(this.f17039f, this.f17040g);
        this.f17036c = 4;
    }

    @Override // E1.InterfaceC0314p
    public void release() {
    }
}
