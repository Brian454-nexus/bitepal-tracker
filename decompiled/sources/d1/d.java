package d1;

import Z0.C0836h;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f13379a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f13380b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f13381c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static int[] f13382d = new int[10];

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f13383a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13384b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13385c;

        /* renamed from: d, reason: collision with root package name */
        public final int f13386d;

        /* renamed from: e, reason: collision with root package name */
        public final int f13387e;

        /* renamed from: f, reason: collision with root package name */
        public final int f13388f;

        /* renamed from: g, reason: collision with root package name */
        public final int f13389g;

        /* renamed from: h, reason: collision with root package name */
        public final int[] f13390h;

        /* renamed from: i, reason: collision with root package name */
        public final int f13391i;

        /* renamed from: j, reason: collision with root package name */
        public final int f13392j;

        /* renamed from: k, reason: collision with root package name */
        public final int f13393k;

        /* renamed from: l, reason: collision with root package name */
        public final int f13394l;

        /* renamed from: m, reason: collision with root package name */
        public final float f13395m;

        /* renamed from: n, reason: collision with root package name */
        public final int f13396n;

        /* renamed from: o, reason: collision with root package name */
        public final int f13397o;

        /* renamed from: p, reason: collision with root package name */
        public final int f13398p;

        /* renamed from: q, reason: collision with root package name */
        public final int f13399q;

        public a(int i6, boolean z6, int i7, int i8, int i9, int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15, float f6, int i16, int i17, int i18, int i19) {
            this.f13383a = i6;
            this.f13384b = z6;
            this.f13385c = i7;
            this.f13386d = i8;
            this.f13387e = i9;
            this.f13388f = i10;
            this.f13389g = i11;
            this.f13390h = iArr;
            this.f13391i = i12;
            this.f13392j = i13;
            this.f13393k = i14;
            this.f13394l = i15;
            this.f13395m = f6;
            this.f13396n = i16;
            this.f13397o = i17;
            this.f13398p = i18;
            this.f13399q = i19;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f13400a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13401b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f13402c;

        public b(int i6, int i7, boolean z6) {
            this.f13400a = i6;
            this.f13401b = i7;
            this.f13402c = z6;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f13403a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13404b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13405c;

        /* renamed from: d, reason: collision with root package name */
        public final int f13406d;

        /* renamed from: e, reason: collision with root package name */
        public final int f13407e;

        /* renamed from: f, reason: collision with root package name */
        public final int f13408f;

        /* renamed from: g, reason: collision with root package name */
        public final int f13409g;

        /* renamed from: h, reason: collision with root package name */
        public final float f13410h;

        /* renamed from: i, reason: collision with root package name */
        public final int f13411i;

        /* renamed from: j, reason: collision with root package name */
        public final int f13412j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f13413k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f13414l;

        /* renamed from: m, reason: collision with root package name */
        public final int f13415m;

        /* renamed from: n, reason: collision with root package name */
        public final int f13416n;

        /* renamed from: o, reason: collision with root package name */
        public final int f13417o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f13418p;

        /* renamed from: q, reason: collision with root package name */
        public final int f13419q;

        /* renamed from: r, reason: collision with root package name */
        public final int f13420r;

        /* renamed from: s, reason: collision with root package name */
        public final int f13421s;

        /* renamed from: t, reason: collision with root package name */
        public final int f13422t;

        public c(int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f6, int i13, int i14, boolean z6, boolean z7, int i15, int i16, int i17, boolean z8, int i18, int i19, int i20, int i21) {
            this.f13403a = i6;
            this.f13404b = i7;
            this.f13405c = i8;
            this.f13406d = i9;
            this.f13407e = i10;
            this.f13408f = i11;
            this.f13409g = i12;
            this.f13410h = f6;
            this.f13411i = i13;
            this.f13412j = i14;
            this.f13413k = z6;
            this.f13414l = z7;
            this.f13415m = i15;
            this.f13416n = i16;
            this.f13417o = i17;
            this.f13418p = z8;
            this.f13419q = i18;
            this.f13420r = i19;
            this.f13421s = i20;
            this.f13422t = i21;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = i6 + 1;
            if (i8 >= position) {
                byteBuffer.clear();
                return;
            }
            int i9 = byteBuffer.get(i6) & 255;
            if (i7 == 3) {
                if (i9 == 1 && (byteBuffer.get(i8) & 31) == 7) {
                    ByteBuffer duplicate = byteBuffer.duplicate();
                    duplicate.position(i6 - 3);
                    duplicate.limit(position);
                    byteBuffer.position(0);
                    byteBuffer.put(duplicate);
                    return;
                }
            } else if (i9 == 0) {
                i7++;
            }
            if (i9 != 0) {
                i7 = 0;
            }
            i6 = i8;
        }
    }

    public static int c(byte[] bArr, int i6, int i7, boolean[] zArr) {
        int i8 = i7 - i6;
        AbstractC1119a.g(i8 >= 0);
        if (i8 == 0) {
            return i7;
        }
        if (zArr[0]) {
            a(zArr);
            return i6 - 3;
        }
        if (i8 > 1 && zArr[1] && bArr[i6] == 1) {
            a(zArr);
            return i6 - 2;
        }
        if (i8 > 2 && zArr[2] && bArr[i6] == 0 && bArr[i6 + 1] == 1) {
            a(zArr);
            return i6 - 1;
        }
        int i9 = i7 - 1;
        int i10 = i6 + 2;
        while (i10 < i9) {
            byte b6 = bArr[i10];
            if ((b6 & 254) == 0) {
                int i11 = i10 - 2;
                if (bArr[i11] == 0 && bArr[i10 - 1] == 0 && b6 == 1) {
                    a(zArr);
                    return i11;
                }
                i10 -= 2;
            }
            i10 += 3;
        }
        zArr[0] = i8 <= 2 ? !(i8 != 2 ? !(zArr[1] && bArr[i9] == 1) : !(zArr[2] && bArr[i7 + (-2)] == 0 && bArr[i9] == 1)) : bArr[i7 + (-3)] == 0 && bArr[i7 + (-2)] == 0 && bArr[i9] == 1;
        zArr[1] = i8 <= 1 ? zArr[2] && bArr[i9] == 0 : bArr[i7 + (-2)] == 0 && bArr[i9] == 0;
        zArr[2] = bArr[i9] == 0;
        return i7;
    }

    public static int d(byte[] bArr, int i6, int i7) {
        while (i6 < i7 - 2) {
            if (bArr[i6] == 0 && bArr[i6 + 1] == 0 && bArr[i6 + 2] == 3) {
                return i6;
            }
            i6++;
        }
        return i7;
    }

    public static int e(byte[] bArr, int i6) {
        return (bArr[i6 + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i6) {
        return bArr[i6 + 3] & 31;
    }

    public static boolean g(String str, byte b6) {
        return ("video/avc".equals(str) && (b6 & 31) == 6) || ("video/hevc".equals(str) && ((b6 & 126) >> 1) == 39);
    }

    public static a h(byte[] bArr, int i6, int i7) {
        return i(bArr, i6 + 2, i7);
    }

    public static a i(byte[] bArr, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        e eVar = new e(bArr, i6, i7);
        eVar.l(4);
        int e6 = eVar.e(3);
        eVar.k();
        int e7 = eVar.e(2);
        boolean d6 = eVar.d();
        int e8 = eVar.e(5);
        int i16 = 0;
        for (int i17 = 0; i17 < 32; i17++) {
            if (eVar.d()) {
                i16 |= 1 << i17;
            }
        }
        int[] iArr = new int[6];
        for (int i18 = 0; i18 < 6; i18++) {
            iArr[i18] = eVar.e(8);
        }
        int e9 = eVar.e(8);
        int i19 = 0;
        for (int i20 = 0; i20 < e6; i20++) {
            if (eVar.d()) {
                i19 += 89;
            }
            if (eVar.d()) {
                i19 += 8;
            }
        }
        eVar.l(i19);
        if (e6 > 0) {
            eVar.l((8 - e6) * 2);
        }
        int h6 = eVar.h();
        int h7 = eVar.h();
        if (h7 == 3) {
            eVar.k();
        }
        int h8 = eVar.h();
        int h9 = eVar.h();
        if (eVar.d()) {
            int h10 = eVar.h();
            int h11 = eVar.h();
            int h12 = eVar.h();
            int h13 = eVar.h();
            h8 -= ((h7 == 1 || h7 == 2) ? 2 : 1) * (h10 + h11);
            h9 -= (h7 == 1 ? 2 : 1) * (h12 + h13);
        }
        int h14 = eVar.h();
        int h15 = eVar.h();
        int h16 = eVar.h();
        int i21 = -1;
        int i22 = -1;
        for (int i23 = eVar.d() ? 0 : e6; i23 <= e6; i23++) {
            eVar.h();
            i22 = Math.max(eVar.h(), i22);
            eVar.h();
        }
        eVar.h();
        eVar.h();
        eVar.h();
        eVar.h();
        eVar.h();
        eVar.h();
        if (eVar.d() && eVar.d()) {
            n(eVar);
        }
        eVar.l(2);
        if (eVar.d()) {
            eVar.l(8);
            eVar.h();
            eVar.h();
            eVar.k();
        }
        q(eVar);
        if (eVar.d()) {
            int h17 = eVar.h();
            for (int i24 = 0; i24 < h17; i24++) {
                eVar.l(h16 + 5);
            }
        }
        eVar.l(2);
        float f6 = 1.0f;
        if (eVar.d()) {
            if (eVar.d()) {
                int e10 = eVar.e(8);
                if (e10 == 255) {
                    int e11 = eVar.e(16);
                    int e12 = eVar.e(16);
                    if (e11 != 0 && e12 != 0) {
                        f6 = e11 / e12;
                    }
                } else {
                    float[] fArr = f13380b;
                    if (e10 < fArr.length) {
                        f6 = fArr[e10];
                    } else {
                        AbstractC1133o.h("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + e10);
                    }
                }
            }
            if (eVar.d()) {
                eVar.k();
            }
            if (eVar.d()) {
                eVar.l(3);
                i15 = eVar.d() ? 1 : 2;
                if (eVar.d()) {
                    int e13 = eVar.e(8);
                    int e14 = eVar.e(8);
                    eVar.l(8);
                    i21 = C0836h.j(e13);
                    i14 = C0836h.k(e14);
                } else {
                    i14 = -1;
                }
            } else {
                i14 = -1;
                i15 = -1;
            }
            if (eVar.d()) {
                eVar.h();
                eVar.h();
            }
            eVar.k();
            if (eVar.d()) {
                h9 *= 2;
            }
            i13 = i14;
            i12 = i15;
            i8 = h6;
            i9 = h8;
            i10 = h9;
            i11 = i21;
        } else {
            i8 = h6;
            i9 = h8;
            i10 = h9;
            i11 = -1;
            i12 = -1;
            i13 = -1;
        }
        return new a(e7, d6, e8, i16, h7, h14, h15, iArr, e9, i8, i9, i10, f6, i22, i11, i12, i13);
    }

    public static b j(byte[] bArr, int i6, int i7) {
        return k(bArr, i6 + 1, i7);
    }

    public static b k(byte[] bArr, int i6, int i7) {
        e eVar = new e(bArr, i6, i7);
        int h6 = eVar.h();
        int h7 = eVar.h();
        eVar.k();
        return new b(h6, h7, eVar.d());
    }

    public static c l(byte[] bArr, int i6, int i7) {
        return m(bArr, i6 + 1, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static d1.d.c m(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.d.m(byte[], int, int):d1.d$c");
    }

    public static void n(e eVar) {
        for (int i6 = 0; i6 < 4; i6++) {
            int i7 = 0;
            while (i7 < 6) {
                int i8 = 1;
                if (eVar.d()) {
                    int min = Math.min(64, 1 << ((i6 << 1) + 4));
                    if (i6 > 1) {
                        eVar.g();
                    }
                    for (int i9 = 0; i9 < min; i9++) {
                        eVar.g();
                    }
                } else {
                    eVar.h();
                }
                if (i6 == 3) {
                    i8 = 3;
                }
                i7 += i8;
            }
        }
    }

    public static void o(e eVar) {
        int h6 = eVar.h() + 1;
        eVar.l(8);
        for (int i6 = 0; i6 < h6; i6++) {
            eVar.h();
            eVar.h();
            eVar.k();
        }
        eVar.l(20);
    }

    public static void p(e eVar, int i6) {
        int i7 = 8;
        int i8 = 8;
        for (int i9 = 0; i9 < i6; i9++) {
            if (i7 != 0) {
                i7 = ((eVar.g() + i8) + 256) % 256;
            }
            if (i7 != 0) {
                i8 = i7;
            }
        }
    }

    public static void q(e eVar) {
        int h6 = eVar.h();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i6 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < h6; i8++) {
            if (i8 == 0 || !eVar.d()) {
                int h7 = eVar.h();
                int h8 = eVar.h();
                int[] iArr3 = new int[h7];
                int i9 = 0;
                while (i9 < h7) {
                    iArr3[i9] = (i9 > 0 ? iArr3[i9 - 1] : 0) - (eVar.h() + 1);
                    eVar.k();
                    i9++;
                }
                int[] iArr4 = new int[h8];
                int i10 = 0;
                while (i10 < h8) {
                    iArr4[i10] = (i10 > 0 ? iArr4[i10 - 1] : 0) + eVar.h() + 1;
                    eVar.k();
                    i10++;
                }
                i6 = h7;
                iArr = iArr3;
                i7 = h8;
                iArr2 = iArr4;
            } else {
                int i11 = i6 + i7;
                int h9 = (1 - ((eVar.d() ? 1 : 0) * 2)) * (eVar.h() + 1);
                int i12 = i11 + 1;
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 <= i11; i13++) {
                    if (eVar.d()) {
                        zArr[i13] = true;
                    } else {
                        zArr[i13] = eVar.d();
                    }
                }
                int[] iArr5 = new int[i12];
                int[] iArr6 = new int[i12];
                int i14 = 0;
                for (int i15 = i7 - 1; i15 >= 0; i15--) {
                    int i16 = iArr2[i15] + h9;
                    if (i16 < 0 && zArr[i6 + i15]) {
                        iArr5[i14] = i16;
                        i14++;
                    }
                }
                if (h9 < 0 && zArr[i11]) {
                    iArr5[i14] = h9;
                    i14++;
                }
                for (int i17 = 0; i17 < i6; i17++) {
                    int i18 = iArr[i17] + h9;
                    if (i18 < 0 && zArr[i17]) {
                        iArr5[i14] = i18;
                        i14++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr5, i14);
                int i19 = 0;
                for (int i20 = i6 - 1; i20 >= 0; i20--) {
                    int i21 = iArr[i20] + h9;
                    if (i21 > 0 && zArr[i20]) {
                        iArr6[i19] = i21;
                        i19++;
                    }
                }
                if (h9 > 0 && zArr[i11]) {
                    iArr6[i19] = h9;
                    i19++;
                }
                for (int i22 = 0; i22 < i7; i22++) {
                    int i23 = iArr2[i22] + h9;
                    if (i23 > 0 && zArr[i6 + i22]) {
                        iArr6[i19] = i23;
                        i19++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr6, i19);
                iArr = copyOf;
                i6 = i14;
                i7 = i19;
            }
        }
    }

    public static int r(byte[] bArr, int i6) {
        int i7;
        synchronized (f13381c) {
            int i8 = 0;
            int i9 = 0;
            while (i8 < i6) {
                try {
                    i8 = d(bArr, i8, i6);
                    if (i8 < i6) {
                        int[] iArr = f13382d;
                        if (iArr.length <= i9) {
                            f13382d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f13382d[i9] = i8;
                        i8 += 3;
                        i9++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i7 = i6 - i9;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < i9; i12++) {
                int i13 = f13382d[i12] - i11;
                System.arraycopy(bArr, i11, bArr, i10, i13);
                int i14 = i10 + i13;
                int i15 = i14 + 1;
                bArr[i14] = 0;
                i10 = i14 + 2;
                bArr[i15] = 0;
                i11 += i13 + 3;
            }
            System.arraycopy(bArr, i11, bArr, i10, i7 - i10);
        }
        return i7;
    }
}
