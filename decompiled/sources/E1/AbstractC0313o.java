package E1;

import Z0.C0841m;
import Z0.q;
import c1.AbstractC1117K;
import c1.C1143y;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.io.ConstantsKt;

/* renamed from: E1.o, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0313o {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1064a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1065b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f1066c = {64, 112, 128, 192, 224, 256, 384, 448, ConstantsKt.MINIMUM_BLOCK_SIZE, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, ConstantsKt.DEFAULT_BLOCK_SIZE, 6144, 7680};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1067d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f1068e = {5, 8, 10, 12};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f1069f = {6, 9, 12, 15};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f1070g = {2, 4, 6, 8};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f1071h = {9, 11, 13, 16};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f1072i = {5, 8, 10, 12};

    /* renamed from: E1.o$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f1073a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1074b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1075c;

        /* renamed from: d, reason: collision with root package name */
        public final int f1076d;

        /* renamed from: e, reason: collision with root package name */
        public final long f1077e;

        /* renamed from: f, reason: collision with root package name */
        public final int f1078f;

        public b(String str, int i6, int i7, int i8, long j6, int i9) {
            this.f1073a = str;
            this.f1075c = i6;
            this.f1074b = i7;
            this.f1076d = i8;
            this.f1077e = j6;
            this.f1078f = i9;
        }
    }

    public static void a(byte[] bArr, int i6) {
        int i7 = i6 - 2;
        if (((bArr[i6 - 1] & 255) | ((bArr[i7] << 8) & 65535)) != AbstractC1117K.v(bArr, 0, i7, 65535)) {
            throw Z0.z.a("CRC check failed", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: E1.AbstractC0313o.b(byte[]):int");
    }

    public static int c(int i6) {
        if (i6 == 2147385345 || i6 == -25230976 || i6 == 536864768 || i6 == -14745368) {
            return 1;
        }
        if (i6 == 1683496997 || i6 == 622876772) {
            return 2;
        }
        if (i6 == 1078008818 || i6 == -233094848) {
            return 3;
        }
        return (i6 == 1908687592 || i6 == -398277519) ? 4 : 0;
    }

    public static C1143y d(byte[] bArr) {
        byte b6 = bArr[0];
        if (b6 == Byte.MAX_VALUE || b6 == 100 || b6 == 64 || b6 == 113) {
            return new C1143y(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (e(copyOf)) {
            for (int i6 = 0; i6 < copyOf.length - 1; i6 += 2) {
                byte b7 = copyOf[i6];
                int i7 = i6 + 1;
                copyOf[i6] = copyOf[i7];
                copyOf[i7] = b7;
            }
        }
        C1143y c1143y = new C1143y(copyOf);
        if (copyOf[0] == 31) {
            C1143y c1143y2 = new C1143y(copyOf);
            while (c1143y2.b() >= 16) {
                c1143y2.r(2);
                c1143y.f(c1143y2.h(14), 14);
            }
        }
        c1143y.n(copyOf);
        return c1143y;
    }

    public static boolean e(byte[] bArr) {
        byte b6 = bArr[0];
        return b6 == -2 || b6 == -1 || b6 == 37 || b6 == -14 || b6 == -24;
    }

    public static int f(ByteBuffer byteBuffer) {
        int i6;
        byte b6;
        int i7;
        byte b7;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return ConstantsKt.DEFAULT_BLOCK_SIZE;
        }
        int position = byteBuffer.position();
        byte b8 = byteBuffer.get(position);
        if (b8 != -2) {
            if (b8 == -1) {
                i6 = (byteBuffer.get(position + 4) & 7) << 4;
                b7 = byteBuffer.get(position + 7);
            } else if (b8 != 31) {
                i6 = (byteBuffer.get(position + 4) & 1) << 6;
                b6 = byteBuffer.get(position + 5);
            } else {
                i6 = (byteBuffer.get(position + 5) & 7) << 4;
                b7 = byteBuffer.get(position + 6);
            }
            i7 = b7 & 60;
            return (((i7 >> 2) | i6) + 1) * 32;
        }
        i6 = (byteBuffer.get(position + 5) & 1) << 6;
        b6 = byteBuffer.get(position + 4);
        i7 = b6 & 252;
        return (((i7 >> 2) | i6) + 1) * 32;
    }

    public static int g(byte[] bArr) {
        int i6;
        byte b6;
        int i7;
        byte b7;
        byte b8 = bArr[0];
        if (b8 != -2) {
            if (b8 == -1) {
                i6 = (bArr[4] & 7) << 4;
                b7 = bArr[7];
            } else if (b8 != 31) {
                i6 = (bArr[4] & 1) << 6;
                b6 = bArr[5];
            } else {
                i6 = (bArr[5] & 7) << 4;
                b7 = bArr[6];
            }
            i7 = b7 & 60;
            return (((i7 >> 2) | i6) + 1) * 32;
        }
        i6 = (bArr[5] & 1) << 6;
        b6 = bArr[4];
        i7 = b6 & 252;
        return (((i7 >> 2) | i6) + 1) * 32;
    }

    public static Z0.q h(byte[] bArr, String str, String str2, int i6, C0841m c0841m) {
        C1143y d6 = d(bArr);
        d6.r(60);
        int i7 = f1064a[d6.h(6)];
        int i8 = f1065b[d6.h(4)];
        int h6 = d6.h(5);
        int[] iArr = f1066c;
        int i9 = h6 >= iArr.length ? -1 : (iArr[h6] * 1000) / 2;
        d6.r(10);
        return new q.b().a0(str).o0("audio/vnd.dts").M(i9).N(i7 + (d6.h(2) > 0 ? 1 : 0)).p0(i8).U(c0841m).e0(str2).m0(i6).K();
    }

    public static b i(byte[] bArr) {
        int i6;
        int i7;
        int i8;
        int i9;
        long j6;
        int i10;
        C1143y d6 = d(bArr);
        d6.r(40);
        int h6 = d6.h(2);
        if (d6.g()) {
            i6 = 20;
            i7 = 12;
        } else {
            i6 = 16;
            i7 = 8;
        }
        d6.r(i7);
        int h7 = d6.h(i6) + 1;
        boolean g6 = d6.g();
        int i11 = -1;
        int i12 = 0;
        if (g6) {
            i8 = d6.h(2);
            int h8 = (d6.h(3) + 1) * ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (d6.g()) {
                d6.r(36);
            }
            int h9 = d6.h(3) + 1;
            int h10 = d6.h(3) + 1;
            if (h9 != 1 || h10 != 1) {
                throw Z0.z.e("Multiple audio presentations or assets not supported");
            }
            int i13 = h6 + 1;
            int h11 = d6.h(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                if (((h11 >> i14) & 1) == 1) {
                    d6.r(8);
                }
            }
            if (d6.g()) {
                d6.r(2);
                int h12 = (d6.h(2) + 1) << 2;
                int h13 = d6.h(2) + 1;
                while (i12 < h13) {
                    d6.r(h12);
                    i12++;
                }
            }
            i12 = h8;
        } else {
            i8 = -1;
        }
        d6.r(i6);
        d6.r(12);
        if (g6) {
            if (d6.g()) {
                d6.r(4);
            }
            if (d6.g()) {
                d6.r(24);
            }
            if (d6.g()) {
                d6.s(d6.h(10) + 1);
            }
            d6.r(5);
            i9 = f1067d[d6.h(4)];
            i11 = d6.h(8) + 1;
        } else {
            i9 = -2147483647;
        }
        int i15 = i9;
        if (g6) {
            if (i8 == 0) {
                i10 = 32000;
            } else if (i8 == 1) {
                i10 = 44100;
            } else {
                if (i8 != 2) {
                    throw Z0.z.a("Unsupported reference clock code in DTS HD header: " + i8, null);
                }
                i10 = 48000;
            }
            j6 = AbstractC1117K.W0(i12, 1000000L, i10);
        } else {
            j6 = -9223372036854775807L;
        }
        return new b("audio/vnd.dts.hd;profile=lbr", i11, i15, h7, j6, 0);
    }

    public static int j(byte[] bArr) {
        C1143y d6 = d(bArr);
        d6.r(42);
        return d6.h(d6.g() ? 12 : 8) + 1;
    }

    public static b k(byte[] bArr, AtomicInteger atomicInteger) {
        int i6;
        long j6;
        AtomicInteger atomicInteger2;
        int i7;
        int i8;
        C1143y d6 = d(bArr);
        int i9 = d6.h(32) == 1078008818 ? 1 : 0;
        int m6 = m(d6, f1068e, true) + 1;
        if (i9 == 0) {
            i6 = -2147483647;
            j6 = -9223372036854775807L;
        } else {
            if (!d6.g()) {
                throw Z0.z.e("Only supports full channel mask-based audio presentation");
            }
            a(bArr, m6);
            int h6 = d6.h(2);
            if (h6 == 0) {
                i7 = ConstantsKt.MINIMUM_BLOCK_SIZE;
            } else if (h6 == 1) {
                i7 = 480;
            } else {
                if (h6 != 2) {
                    throw Z0.z.a("Unsupported base duration index in DTS UHD header: " + h6, null);
                }
                i7 = 384;
            }
            int h7 = i7 * (d6.h(3) + 1);
            int h8 = d6.h(2);
            if (h8 == 0) {
                i8 = 32000;
            } else if (h8 == 1) {
                i8 = 44100;
            } else {
                if (h8 != 2) {
                    throw Z0.z.a("Unsupported clock rate index in DTS UHD header: " + h8, null);
                }
                i8 = 48000;
            }
            if (d6.g()) {
                d6.r(36);
            }
            i6 = (1 << d6.h(2)) * i8;
            j6 = AbstractC1117K.W0(h7, 1000000L, i8);
        }
        int i10 = i6;
        long j7 = j6;
        int i11 = 0;
        for (int i12 = 0; i12 < i9; i12++) {
            i11 += m(d6, f1069f, true);
        }
        if (i9 != 0) {
            atomicInteger2 = atomicInteger;
            atomicInteger2.set(m(d6, f1070g, true));
        } else {
            atomicInteger2 = atomicInteger;
        }
        return new b("audio/vnd.dts.uhd;profile=p2", 2, i10, m6 + i11 + (atomicInteger2.get() != 0 ? m(d6, f1071h, true) : 0), j7, 0);
    }

    public static int l(byte[] bArr) {
        C1143y d6 = d(bArr);
        d6.r(32);
        return m(d6, f1072i, true) + 1;
    }

    public static int m(C1143y c1143y, int[] iArr, boolean z6) {
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < 3 && c1143y.g(); i8++) {
            i7++;
        }
        if (z6) {
            int i9 = 0;
            while (i6 < i7) {
                i9 += 1 << iArr[i6];
                i6++;
            }
            i6 = i9;
        }
        return i6 + c1143y.h(iArr[i7]);
    }
}
