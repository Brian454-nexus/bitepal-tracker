package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f8840a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static void h(byte b6, byte b7, byte b8, byte b9, char[] cArr, int i6) {
            if (m(b7) || (((b6 << 28) + (b7 + 112)) >> 30) != 0 || m(b8) || m(b9)) {
                throw C1048z.d();
            }
            int r6 = ((b6 & 7) << 18) | (r(b7) << 12) | (r(b8) << 6) | r(b9);
            cArr[i6] = l(r6);
            cArr[i6 + 1] = q(r6);
        }

        public static void i(byte b6, char[] cArr, int i6) {
            cArr[i6] = (char) b6;
        }

        public static void j(byte b6, byte b7, byte b8, char[] cArr, int i6) {
            if (m(b7) || ((b6 == -32 && b7 < -96) || ((b6 == -19 && b7 >= -96) || m(b8)))) {
                throw C1048z.d();
            }
            cArr[i6] = (char) (((b6 & 15) << 12) | (r(b7) << 6) | r(b8));
        }

        public static void k(byte b6, byte b7, char[] cArr, int i6) {
            if (b6 < -62 || m(b7)) {
                throw C1048z.d();
            }
            cArr[i6] = (char) (((b6 & 31) << 6) | r(b7));
        }

        public static char l(int i6) {
            return (char) ((i6 >>> 10) + 55232);
        }

        public static boolean m(byte b6) {
            return b6 > -65;
        }

        public static boolean n(byte b6) {
            return b6 >= 0;
        }

        public static boolean o(byte b6) {
            return b6 < -16;
        }

        public static boolean p(byte b6) {
            return b6 < -32;
        }

        public static char q(int i6) {
            return (char) ((i6 & 1023) + 56320);
        }

        public static int r(byte b6) {
            return b6 & 63;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class b {
        public abstract String a(byte[] bArr, int i6, int i7);

        public abstract int b(CharSequence charSequence, byte[] bArr, int i6, int i7);

        public final boolean c(byte[] bArr, int i6, int i7) {
            return d(0, bArr, i6, i7) == 0;
        }

        public abstract int d(int i6, byte[] bArr, int i7, int i8);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends b {
        public static int e(byte[] bArr, int i6, int i7) {
            while (i6 < i7 && bArr[i6] >= 0) {
                i6++;
            }
            if (i6 >= i7) {
                return 0;
            }
            return f(bArr, i6, i7);
        }

        public static int f(byte[] bArr, int i6, int i7) {
            while (i6 < i7) {
                int i8 = i6 + 1;
                byte b6 = bArr[i6];
                if (b6 < 0) {
                    if (b6 < -32) {
                        if (i8 >= i7) {
                            return b6;
                        }
                        if (b6 >= -62) {
                            i6 += 2;
                            if (bArr[i8] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b6 >= -16) {
                        if (i8 >= i7 - 2) {
                            return q0.l(bArr, i8, i7);
                        }
                        int i9 = i6 + 2;
                        byte b7 = bArr[i8];
                        if (b7 <= -65 && (((b6 << 28) + (b7 + 112)) >> 30) == 0) {
                            int i10 = i6 + 3;
                            if (bArr[i9] <= -65) {
                                i6 += 4;
                                if (bArr[i10] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i8 >= i7 - 1) {
                        return q0.l(bArr, i8, i7);
                    }
                    int i11 = i6 + 2;
                    byte b8 = bArr[i8];
                    if (b8 <= -65 && ((b6 != -32 || b8 >= -96) && (b6 != -19 || b8 < -96))) {
                        i6 += 3;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return -1;
                }
                i6 = i8;
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.q0.b
        public String a(byte[] bArr, int i6, int i7) {
            if ((i6 | i7 | ((bArr.length - i6) - i7)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i6), Integer.valueOf(i7)));
            }
            int i8 = i6 + i7;
            char[] cArr = new char[i7];
            int i9 = 0;
            while (i6 < i8) {
                byte b6 = bArr[i6];
                if (!a.n(b6)) {
                    break;
                }
                i6++;
                a.i(b6, cArr, i9);
                i9++;
            }
            int i10 = i9;
            while (i6 < i8) {
                int i11 = i6 + 1;
                byte b7 = bArr[i6];
                if (a.n(b7)) {
                    int i12 = i10 + 1;
                    a.i(b7, cArr, i10);
                    int i13 = i11;
                    while (i13 < i8) {
                        byte b8 = bArr[i13];
                        if (!a.n(b8)) {
                            break;
                        }
                        i13++;
                        a.i(b8, cArr, i12);
                        i12++;
                    }
                    i10 = i12;
                    i6 = i13;
                } else if (a.p(b7)) {
                    if (i11 >= i8) {
                        throw C1048z.d();
                    }
                    i6 += 2;
                    a.k(b7, bArr[i11], cArr, i10);
                    i10++;
                } else if (a.o(b7)) {
                    if (i11 >= i8 - 1) {
                        throw C1048z.d();
                    }
                    int i14 = i6 + 2;
                    i6 += 3;
                    a.j(b7, bArr[i11], bArr[i14], cArr, i10);
                    i10++;
                } else {
                    if (i11 >= i8 - 2) {
                        throw C1048z.d();
                    }
                    byte b9 = bArr[i11];
                    int i15 = i6 + 3;
                    byte b10 = bArr[i6 + 2];
                    i6 += 4;
                    a.h(b7, b9, b10, bArr[i15], cArr, i10);
                    i10 += 2;
                }
            }
            return new String(cArr, 0, i10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // androidx.datastore.preferences.protobuf.q0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int b(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q0.c.b(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // androidx.datastore.preferences.protobuf.q0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int d(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = androidx.datastore.preferences.protobuf.q0.a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = androidx.datastore.preferences.protobuf.q0.a(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = androidx.datastore.preferences.protobuf.q0.b(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = e(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q0.c.d(int, byte[], int, int):int");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d extends IllegalArgumentException {
        public d(int i6, int i7) {
            super("Unpaired surrogate at index " + i6 + " of " + i7);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e extends b {
        public static boolean e() {
            return p0.E() && p0.F();
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0039, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int f(byte[] r10, long r11, int r13) {
            /*
                int r0 = g(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = androidx.datastore.preferences.protobuf.p0.u(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r11
                byte r11 = androidx.datastore.preferences.protobuf.p0.u(r10, r11)
                if (r11 <= r6) goto L37
                goto L39
            L37:
                r11 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = h(r10, r1, r11, r0)
                return r10
            L48:
                int r13 = r13 + (-3)
                long r2 = r2 + r11
                byte r0 = androidx.datastore.preferences.protobuf.p0.u(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r11 = r11 + r8
                byte r0 = androidx.datastore.preferences.protobuf.p0.u(r10, r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = h(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                long r2 = r2 + r11
                byte r0 = androidx.datastore.preferences.protobuf.p0.u(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = androidx.datastore.preferences.protobuf.p0.u(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = androidx.datastore.preferences.protobuf.p0.u(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q0.e.f(byte[], long, int):int");
        }

        public static int g(byte[] bArr, long j6, int i6) {
            int i7 = 0;
            if (i6 < 16) {
                return 0;
            }
            int i8 = 8 - (((int) j6) & 7);
            while (i7 < i8) {
                long j7 = 1 + j6;
                if (p0.u(bArr, j6) < 0) {
                    return i7;
                }
                i7++;
                j6 = j7;
            }
            while (true) {
                int i9 = i7 + 8;
                if (i9 > i6 || (p0.A(bArr, p0.f8823h + j6) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j6 += 8;
                i7 = i9;
            }
            while (i7 < i6) {
                long j8 = j6 + 1;
                if (p0.u(bArr, j6) < 0) {
                    return i7;
                }
                i7++;
                j6 = j8;
            }
            return i6;
        }

        public static int h(byte[] bArr, int i6, long j6, int i7) {
            if (i7 == 0) {
                return q0.i(i6);
            }
            if (i7 == 1) {
                return q0.j(i6, p0.u(bArr, j6));
            }
            if (i7 == 2) {
                return q0.k(i6, p0.u(bArr, j6), p0.u(bArr, j6 + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.q0.b
        public String a(byte[] bArr, int i6, int i7) {
            Charset charset = AbstractC1047y.f8968b;
            String str = new String(bArr, i6, i7, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i6, i7 + i6))) {
                throw C1048z.d();
            }
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.q0.b
        public int b(CharSequence charSequence, byte[] bArr, int i6, int i7) {
            long j6;
            long j7;
            long j8;
            int i8;
            char charAt;
            long j9 = i6;
            long j10 = i7 + j9;
            int length = charSequence.length();
            if (length > i7 || bArr.length - i7 < i6) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i6 + i7));
            }
            int i9 = 0;
            while (true) {
                j6 = 1;
                if (i9 >= length || (charAt = charSequence.charAt(i9)) >= 128) {
                    break;
                }
                p0.K(bArr, j9, (byte) charAt);
                i9++;
                j9 = 1 + j9;
            }
            if (i9 == length) {
                return (int) j9;
            }
            while (i9 < length) {
                char charAt2 = charSequence.charAt(i9);
                if (charAt2 < 128 && j9 < j10) {
                    p0.K(bArr, j9, (byte) charAt2);
                    j8 = j10;
                    j7 = j6;
                    j9 += j6;
                } else if (charAt2 >= 2048 || j9 > j10 - 2) {
                    j7 = j6;
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || j9 > j10 - 3) {
                        j8 = j10;
                        if (j9 > j8 - 4) {
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i8 = i9 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i8)))) {
                                throw new d(i9, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j9);
                        }
                        int i10 = i9 + 1;
                        if (i10 != length) {
                            char charAt3 = charSequence.charAt(i10);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                p0.K(bArr, j9, (byte) ((codePoint >>> 18) | 240));
                                p0.K(bArr, j9 + j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j11 = j9 + 3;
                                p0.K(bArr, j9 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j9 += 4;
                                p0.K(bArr, j11, (byte) ((codePoint & 63) | 128));
                                i9 = i10;
                            } else {
                                i9 = i10;
                            }
                        }
                        throw new d(i9 - 1, length);
                    }
                    p0.K(bArr, j9, (byte) ((charAt2 >>> '\f') | 480));
                    long j12 = j9 + 2;
                    j8 = j10;
                    p0.K(bArr, j9 + j7, (byte) (((charAt2 >>> 6) & 63) | 128));
                    j9 += 3;
                    p0.K(bArr, j12, (byte) ((charAt2 & '?') | 128));
                } else {
                    j7 = j6;
                    long j13 = j9 + j7;
                    p0.K(bArr, j9, (byte) ((charAt2 >>> 6) | 960));
                    j9 += 2;
                    p0.K(bArr, j13, (byte) ((charAt2 & '?') | 128));
                    j8 = j10;
                }
                i9++;
                j6 = j7;
                j10 = j8;
            }
            return (int) j9;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
        
            if (androidx.datastore.preferences.protobuf.p0.u(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
        
            if (androidx.datastore.preferences.protobuf.p0.u(r12, r0) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.q0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int d(int r11, byte[] r12, int r13, int r14) {
            /*
                Method dump skipped, instructions count: 197
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q0.e.d(int, byte[], int, int):int");
        }
    }

    static {
        f8840a = (!e.e() || AbstractC1027d.c()) ? new c() : new e();
    }

    public static String e(byte[] bArr, int i6, int i7) {
        return f8840a.a(bArr, i6, i7);
    }

    public static int f(CharSequence charSequence, byte[] bArr, int i6, int i7) {
        return f8840a.b(charSequence, bArr, i6, i7);
    }

    public static int g(CharSequence charSequence) {
        int length = charSequence.length();
        int i6 = 0;
        while (i6 < length && charSequence.charAt(i6) < 128) {
            i6++;
        }
        int i7 = length;
        while (true) {
            if (i6 < length) {
                char charAt = charSequence.charAt(i6);
                if (charAt >= 2048) {
                    i7 += h(charSequence, i6);
                    break;
                }
                i7 += (127 - charAt) >>> 31;
                i6++;
            } else {
                break;
            }
        }
        if (i7 >= length) {
            return i7;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i7 + 4294967296L));
    }

    public static int h(CharSequence charSequence, int i6) {
        int length = charSequence.length();
        int i7 = 0;
        while (i6 < length) {
            char charAt = charSequence.charAt(i6);
            if (charAt < 2048) {
                i7 += (127 - charAt) >>> 31;
            } else {
                i7 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i6) < 65536) {
                        throw new d(i6, length);
                    }
                    i6++;
                }
            }
            i6++;
        }
        return i7;
    }

    public static int i(int i6) {
        if (i6 > -12) {
            return -1;
        }
        return i6;
    }

    public static int j(int i6, int i7) {
        if (i6 > -12 || i7 > -65) {
            return -1;
        }
        return i6 ^ (i7 << 8);
    }

    public static int k(int i6, int i7, int i8) {
        if (i6 > -12 || i7 > -65 || i8 > -65) {
            return -1;
        }
        return (i6 ^ (i7 << 8)) ^ (i8 << 16);
    }

    public static int l(byte[] bArr, int i6, int i7) {
        byte b6 = bArr[i6 - 1];
        int i8 = i7 - i6;
        if (i8 == 0) {
            return i(b6);
        }
        if (i8 == 1) {
            return j(b6, bArr[i6]);
        }
        if (i8 == 2) {
            return k(b6, bArr[i6], bArr[i6 + 1]);
        }
        throw new AssertionError();
    }

    public static boolean m(byte[] bArr) {
        return f8840a.c(bArr, 0, bArr.length);
    }

    public static boolean n(byte[] bArr, int i6, int i7) {
        return f8840a.c(bArr, i6, i7);
    }
}
