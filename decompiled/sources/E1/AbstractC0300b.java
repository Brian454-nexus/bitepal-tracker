package E1;

import Z0.C0841m;
import Z0.q;
import c1.AbstractC1117K;
import c1.C1143y;
import c1.C1144z;
import java.nio.ByteBuffer;
import kotlin.io.ConstantsKt;

/* renamed from: E1.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0300b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f964a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f965b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f966c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f967d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f968e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, ConstantsKt.MINIMUM_BLOCK_SIZE, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f969f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: E1.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0022b {

        /* renamed from: a, reason: collision with root package name */
        public final String f970a;

        /* renamed from: b, reason: collision with root package name */
        public final int f971b;

        /* renamed from: c, reason: collision with root package name */
        public final int f972c;

        /* renamed from: d, reason: collision with root package name */
        public final int f973d;

        /* renamed from: e, reason: collision with root package name */
        public final int f974e;

        /* renamed from: f, reason: collision with root package name */
        public final int f975f;

        /* renamed from: g, reason: collision with root package name */
        public final int f976g;

        public C0022b(String str, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f970a = str;
            this.f971b = i6;
            this.f973d = i7;
            this.f972c = i8;
            this.f974e = i9;
            this.f975f = i10;
            this.f976g = i11;
        }
    }

    public static int a(int i6, int i7, int i8) {
        return (i6 * i7) / (i8 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i6 = position; i6 <= limit; i6++) {
            if ((AbstractC1117K.P(byteBuffer, i6 + 4) & (-2)) == -126718022) {
                return i6 - position;
            }
        }
        return -1;
    }

    public static int c(int i6, int i7) {
        int i8 = i7 / 2;
        if (i6 < 0) {
            return -1;
        }
        int[] iArr = f965b;
        if (i6 >= iArr.length || i7 < 0) {
            return -1;
        }
        int[] iArr2 = f969f;
        if (i8 >= iArr2.length) {
            return -1;
        }
        int i9 = iArr[i6];
        if (i9 == 44100) {
            return (iArr2[i8] + (i7 % 2)) * 2;
        }
        int i10 = f968e[i8];
        return i9 == 32000 ? i10 * 6 : i10 * 4;
    }

    public static Z0.q d(C1144z c1144z, String str, String str2, C0841m c0841m) {
        C1143y c1143y = new C1143y();
        c1143y.m(c1144z);
        int i6 = f965b[c1143y.h(2)];
        c1143y.r(8);
        int i7 = f967d[c1143y.h(3)];
        if (c1143y.h(1) != 0) {
            i7++;
        }
        int i8 = f968e[c1143y.h(5)] * 1000;
        c1143y.c();
        c1144z.T(c1143y.d());
        return new q.b().a0(str).o0("audio/ac3").N(i7).p0(i6).U(c0841m).e0(str2).M(i8).j0(i8).K();
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f964a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static C0022b f(C1143y c1143y) {
        int c6;
        int i6;
        int i7;
        int i8;
        String str;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int e6 = c1143y.e();
        c1143y.r(40);
        boolean z6 = c1143y.h(5) > 10;
        c1143y.p(e6);
        int i15 = -1;
        if (z6) {
            c1143y.r(16);
            int h6 = c1143y.h(2);
            if (h6 == 0) {
                i15 = 0;
            } else if (h6 == 1) {
                i15 = 1;
            } else if (h6 == 2) {
                i15 = 2;
            }
            c1143y.r(3);
            c6 = (c1143y.h(11) + 1) * 2;
            int h7 = c1143y.h(2);
            if (h7 == 3) {
                i6 = f966c[c1143y.h(2)];
                i10 = 3;
                i11 = 6;
            } else {
                int h8 = c1143y.h(2);
                int i16 = f964a[h8];
                i10 = h8;
                i6 = f965b[h7];
                i11 = i16;
            }
            i8 = i11 * 256;
            int a6 = a(c6, i6, i11);
            int h9 = c1143y.h(3);
            boolean g6 = c1143y.g();
            i7 = f967d[h9] + (g6 ? 1 : 0);
            c1143y.r(10);
            if (c1143y.g()) {
                c1143y.r(8);
            }
            if (h9 == 0) {
                c1143y.r(5);
                if (c1143y.g()) {
                    c1143y.r(8);
                }
            }
            if (i15 == 1 && c1143y.g()) {
                c1143y.r(16);
            }
            if (c1143y.g()) {
                if (h9 > 2) {
                    c1143y.r(2);
                }
                if ((h9 & 1) == 0 || h9 <= 2) {
                    i13 = 6;
                } else {
                    i13 = 6;
                    c1143y.r(6);
                }
                if ((h9 & 4) != 0) {
                    c1143y.r(i13);
                }
                if (g6 && c1143y.g()) {
                    c1143y.r(5);
                }
                if (i15 == 0) {
                    if (c1143y.g()) {
                        i14 = 6;
                        c1143y.r(6);
                    } else {
                        i14 = 6;
                    }
                    if (h9 == 0 && c1143y.g()) {
                        c1143y.r(i14);
                    }
                    if (c1143y.g()) {
                        c1143y.r(i14);
                    }
                    int h10 = c1143y.h(2);
                    if (h10 == 1) {
                        c1143y.r(5);
                    } else if (h10 == 2) {
                        c1143y.r(12);
                    } else if (h10 == 3) {
                        int h11 = c1143y.h(5);
                        if (c1143y.g()) {
                            c1143y.r(5);
                            if (c1143y.g()) {
                                c1143y.r(4);
                            }
                            if (c1143y.g()) {
                                c1143y.r(4);
                            }
                            if (c1143y.g()) {
                                c1143y.r(4);
                            }
                            if (c1143y.g()) {
                                c1143y.r(4);
                            }
                            if (c1143y.g()) {
                                c1143y.r(4);
                            }
                            if (c1143y.g()) {
                                c1143y.r(4);
                            }
                            if (c1143y.g()) {
                                c1143y.r(4);
                            }
                            if (c1143y.g()) {
                                if (c1143y.g()) {
                                    c1143y.r(4);
                                }
                                if (c1143y.g()) {
                                    c1143y.r(4);
                                }
                            }
                        }
                        if (c1143y.g()) {
                            c1143y.r(5);
                            if (c1143y.g()) {
                                c1143y.r(7);
                                if (c1143y.g()) {
                                    c1143y.r(8);
                                }
                            }
                        }
                        c1143y.r((h11 + 2) * 8);
                        c1143y.c();
                    }
                    if (h9 < 2) {
                        if (c1143y.g()) {
                            c1143y.r(14);
                        }
                        if (h9 == 0 && c1143y.g()) {
                            c1143y.r(14);
                        }
                    }
                    if (c1143y.g()) {
                        if (i10 == 0) {
                            c1143y.r(5);
                        } else {
                            for (int i17 = 0; i17 < i11; i17++) {
                                if (c1143y.g()) {
                                    c1143y.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c1143y.g()) {
                c1143y.r(5);
                if (h9 == 2) {
                    c1143y.r(4);
                }
                if (h9 >= 6) {
                    c1143y.r(2);
                }
                if (c1143y.g()) {
                    c1143y.r(8);
                }
                if (h9 == 0 && c1143y.g()) {
                    c1143y.r(8);
                }
                if (h7 < 3) {
                    c1143y.q();
                }
            }
            if (i15 == 0 && i10 != 3) {
                c1143y.q();
            }
            if (i15 == 2 && (i10 == 3 || c1143y.g())) {
                i12 = 6;
                c1143y.r(6);
            } else {
                i12 = 6;
            }
            str = (c1143y.g() && c1143y.h(i12) == 1 && c1143y.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i9 = a6;
        } else {
            c1143y.r(32);
            int h12 = c1143y.h(2);
            String str2 = h12 == 3 ? null : "audio/ac3";
            int h13 = c1143y.h(6);
            int i18 = f968e[h13 / 2] * 1000;
            c6 = c(h12, h13);
            c1143y.r(8);
            int h14 = c1143y.h(3);
            if ((h14 & 1) != 0 && h14 != 1) {
                c1143y.r(2);
            }
            if ((h14 & 4) != 0) {
                c1143y.r(2);
            }
            if (h14 == 2) {
                c1143y.r(2);
            }
            int[] iArr = f965b;
            i6 = h12 < iArr.length ? iArr[h12] : -1;
            i7 = f967d[h14] + (c1143y.g() ? 1 : 0);
            i8 = 1536;
            str = str2;
            i9 = i18;
        }
        return new C0022b(str, i15, i7, i6, c6, i8, i9);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b6 = bArr[4];
        return c((b6 & 192) >> 6, b6 & 63);
    }

    public static Z0.q h(C1144z c1144z, String str, String str2, C0841m c0841m) {
        String str3;
        C1143y c1143y = new C1143y();
        c1143y.m(c1144z);
        int h6 = c1143y.h(13) * 1000;
        c1143y.r(3);
        int i6 = f965b[c1143y.h(2)];
        c1143y.r(10);
        int i7 = f967d[c1143y.h(3)];
        if (c1143y.h(1) != 0) {
            i7++;
        }
        c1143y.r(3);
        int h7 = c1143y.h(4);
        c1143y.r(1);
        if (h7 > 0) {
            c1143y.r(6);
            if (c1143y.h(1) != 0) {
                i7 += 2;
            }
            c1143y.r(1);
        }
        if (c1143y.b() > 7) {
            c1143y.r(7);
            if (c1143y.h(1) != 0) {
                str3 = "audio/eac3-joc";
                c1143y.c();
                c1144z.T(c1143y.d());
                return new q.b().a0(str).o0(str3).N(i7).p0(i6).U(c0841m).e0(str2).j0(h6).K();
            }
        }
        str3 = "audio/eac3";
        c1143y.c();
        c1144z.T(c1143y.d());
        return new q.b().a0(str).o0(str3).N(i7).p0(i6).U(c0841m).e0(str2).j0(h6).K();
    }

    public static int i(ByteBuffer byteBuffer, int i6) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i6) + ((byteBuffer.get((byteBuffer.position() + i6) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b6 = bArr[7];
            if ((b6 & 254) == 186) {
                return 40 << ((bArr[(b6 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
