package S1;

import Z0.x;
import Z0.y;
import c1.AbstractC1117K;
import c1.AbstractC1133o;
import c1.C1143y;
import c1.C1144z;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import z6.w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h extends N1.c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f4669b = new a() { // from class: S1.g
        @Override // S1.h.a
        public final boolean a(int i6, int i7, int i8, int i9, int i10) {
            return h.c(i6, i7, i8, i9, i10);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final a f4670a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        boolean a(int i6, int i7, int i8, int i9, int i10);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f4671a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f4672b;

        /* renamed from: c, reason: collision with root package name */
        public final int f4673c;

        public b(int i6, boolean z6, int i7) {
            this.f4671a = i6;
            this.f4672b = z6;
            this.f4673c = i7;
        }
    }

    public h() {
        this(null);
    }

    public static int A(C1144z c1144z, int i6) {
        byte[] e6 = c1144z.e();
        int f6 = c1144z.f();
        int i7 = f6;
        while (true) {
            int i8 = i7 + 1;
            if (i8 >= f6 + i6) {
                return i6;
            }
            if ((e6[i7] & 255) == 255 && e6[i8] == 0) {
                System.arraycopy(e6, i7 + 2, e6, i8, (i6 - (i7 - f6)) - 2);
                i6--;
            }
            i7 = i8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0089, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean B(c1.C1144z r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f()
        L8:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r1.p()     // Catch: java.lang.Throwable -> L22
            long r8 = r1.I()     // Catch: java.lang.Throwable -> L22
            int r10 = r1.M()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lb2
        L25:
            int r7 = r1.J()     // Catch: java.lang.Throwable -> L22
            int r8 = r1.J()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8
            r10 = r6
        L2f:
            r11 = 0
            if (r7 != 0) goto L3d
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3d
            if (r10 != 0) goto L3d
            r1.T(r2)
            return r4
        L3d:
            r7 = 4
            if (r0 != r7) goto L6e
            if (r21 != 0) goto L6e
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4e
            r1.T(r2)
            return r6
        L4e:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6e:
            if (r0 != r7) goto L7e
            r3 = r10 & 64
            if (r3 == 0) goto L76
            r3 = r4
            goto L77
        L76:
            r3 = r6
        L77:
            r7 = r10 & 1
            if (r7 == 0) goto L7c
            goto L8e
        L7c:
            r4 = r6
            goto L8e
        L7e:
            if (r0 != r3) goto L8c
            r3 = r10 & 32
            if (r3 == 0) goto L86
            r3 = r4
            goto L87
        L86:
            r3 = r6
        L87:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L7c
            goto L8e
        L8c:
            r3 = r6
            r4 = r3
        L8e:
            if (r4 == 0) goto L92
            int r3 = r3 + 4
        L92:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9b
            r1.T(r2)
            return r6
        L9b:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La8
            r1.T(r2)
            return r6
        La8:
            int r3 = (int) r8
            r1.U(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        Lae:
            r1.T(r2)
            return r4
        Lb2:
            r1.T(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.h.B(c1.z, int, int, boolean):boolean");
    }

    public static /* synthetic */ boolean c(int i6, int i7, int i8, int i9, int i10) {
        return false;
    }

    public static byte[] d(byte[] bArr, int i6, int i7) {
        return i7 <= i6 ? AbstractC1117K.f10565f : Arrays.copyOfRange(bArr, i6, i7);
    }

    public static S1.a f(C1144z c1144z, int i6, int i7) {
        int z6;
        String str;
        int G6 = c1144z.G();
        Charset w6 = w(G6);
        int i8 = i6 - 1;
        byte[] bArr = new byte[i8];
        c1144z.l(bArr, 0, i8);
        if (i7 == 2) {
            str = "image/" + y6.c.e(new String(bArr, 0, 3, y6.e.b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            z6 = 2;
        } else {
            z6 = z(bArr, 0);
            String e6 = y6.c.e(new String(bArr, 0, z6, y6.e.b));
            if (e6.indexOf(47) == -1) {
                str = "image/" + e6;
            } else {
                str = e6;
            }
        }
        int i9 = bArr[z6 + 1] & 255;
        int i10 = z6 + 2;
        int y6 = y(bArr, i10, G6);
        return new S1.a(str, new String(bArr, i10, y6 - i10, w6), i9, d(bArr, y6 + v(G6), i8));
    }

    public static S1.b g(C1144z c1144z, int i6, String str) {
        byte[] bArr = new byte[i6];
        c1144z.l(bArr, 0, i6);
        return new S1.b(str, bArr);
    }

    public static c h(C1144z c1144z, int i6, int i7, boolean z6, int i8, a aVar) {
        int f6 = c1144z.f();
        int z7 = z(c1144z.e(), f6);
        String str = new String(c1144z.e(), f6, z7 - f6, y6.e.b);
        c1144z.T(z7 + 1);
        int p6 = c1144z.p();
        int p7 = c1144z.p();
        long I6 = c1144z.I();
        if (I6 == 4294967295L) {
            I6 = -1;
        }
        long I7 = c1144z.I();
        long j6 = I7 == 4294967295L ? -1L : I7;
        ArrayList arrayList = new ArrayList();
        int i9 = f6 + i6;
        while (c1144z.f() < i9) {
            i k6 = k(i7, c1144z, z6, i8, aVar);
            if (k6 != null) {
                arrayList.add(k6);
            }
        }
        return new c(str, p6, p7, I6, j6, (i[]) arrayList.toArray(new i[0]));
    }

    public static d i(C1144z c1144z, int i6, int i7, boolean z6, int i8, a aVar) {
        int f6 = c1144z.f();
        int z7 = z(c1144z.e(), f6);
        String str = new String(c1144z.e(), f6, z7 - f6, y6.e.b);
        c1144z.T(z7 + 1);
        int G6 = c1144z.G();
        boolean z8 = (G6 & 2) != 0;
        boolean z9 = (G6 & 1) != 0;
        int G7 = c1144z.G();
        String[] strArr = new String[G7];
        for (int i9 = 0; i9 < G7; i9++) {
            int f7 = c1144z.f();
            int z10 = z(c1144z.e(), f7);
            strArr[i9] = new String(c1144z.e(), f7, z10 - f7, y6.e.b);
            c1144z.T(z10 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i10 = f6 + i6;
        while (c1144z.f() < i10) {
            i k6 = k(i7, c1144z, z6, i8, aVar);
            if (k6 != null) {
                arrayList.add(k6);
            }
        }
        return new d(str, z8, z9, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e j(C1144z c1144z, int i6) {
        if (i6 < 4) {
            return null;
        }
        int G6 = c1144z.G();
        Charset w6 = w(G6);
        byte[] bArr = new byte[3];
        c1144z.l(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i7 = i6 - 4;
        byte[] bArr2 = new byte[i7];
        c1144z.l(bArr2, 0, i7);
        int y6 = y(bArr2, 0, G6);
        String str2 = new String(bArr2, 0, y6, w6);
        int v6 = y6 + v(G6);
        return new e(str, str2, p(bArr2, v6, y(bArr2, v6, G6), w6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0240  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [S1.i] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [c1.z] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static S1.i k(int r19, c1.C1144z r20, boolean r21, int r22, S1.h.a r23) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.h.k(int, c1.z, boolean, int, S1.h$a):S1.i");
    }

    public static f l(C1144z c1144z, int i6) {
        int G6 = c1144z.G();
        Charset w6 = w(G6);
        int i7 = i6 - 1;
        byte[] bArr = new byte[i7];
        c1144z.l(bArr, 0, i7);
        int z6 = z(bArr, 0);
        String t6 = y.t(new String(bArr, 0, z6, y6.e.b));
        int i8 = z6 + 1;
        int y6 = y(bArr, i8, G6);
        String p6 = p(bArr, i8, y6, w6);
        int v6 = y6 + v(G6);
        int y7 = y(bArr, v6, G6);
        return new f(t6, p6, p(bArr, v6, y7, w6), d(bArr, y7 + v(G6), i7));
    }

    public static b m(C1144z c1144z) {
        if (c1144z.a() < 10) {
            AbstractC1133o.h("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int J6 = c1144z.J();
        if (J6 != 4801587) {
            AbstractC1133o.h("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(J6)));
            return null;
        }
        int G6 = c1144z.G();
        c1144z.U(1);
        int G7 = c1144z.G();
        int F6 = c1144z.F();
        if (G6 == 2) {
            if ((G7 & 64) != 0) {
                AbstractC1133o.h("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (G6 == 3) {
            if ((G7 & 64) != 0) {
                int p6 = c1144z.p();
                c1144z.U(p6);
                F6 -= p6 + 4;
            }
        } else {
            if (G6 != 4) {
                AbstractC1133o.h("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + G6);
                return null;
            }
            if ((G7 & 64) != 0) {
                int F7 = c1144z.F();
                c1144z.U(F7 - 4);
                F6 -= F7;
            }
            if ((G7 & 16) != 0) {
                F6 -= 10;
            }
        }
        return new b(G6, G6 < 4 && (G7 & 128) != 0, F6);
    }

    public static l n(C1144z c1144z, int i6) {
        int M5 = c1144z.M();
        int J6 = c1144z.J();
        int J7 = c1144z.J();
        int G6 = c1144z.G();
        int G7 = c1144z.G();
        C1143y c1143y = new C1143y();
        c1143y.m(c1144z);
        int i7 = ((i6 - 10) * 8) / (G6 + G7);
        int[] iArr = new int[i7];
        int[] iArr2 = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            int h6 = c1143y.h(G6);
            int h7 = c1143y.h(G7);
            iArr[i8] = h6;
            iArr2[i8] = h7;
        }
        return new l(M5, J6, J7, iArr, iArr2);
    }

    public static m o(C1144z c1144z, int i6) {
        byte[] bArr = new byte[i6];
        c1144z.l(bArr, 0, i6);
        int z6 = z(bArr, 0);
        return new m(new String(bArr, 0, z6, y6.e.b), d(bArr, z6 + 1, i6));
    }

    public static String p(byte[] bArr, int i6, int i7, Charset charset) {
        return (i7 <= i6 || i7 > bArr.length) ? "" : new String(bArr, i6, i7 - i6, charset);
    }

    public static n q(C1144z c1144z, int i6, String str) {
        if (i6 < 1) {
            return null;
        }
        int G6 = c1144z.G();
        int i7 = i6 - 1;
        byte[] bArr = new byte[i7];
        c1144z.l(bArr, 0, i7);
        return new n(str, null, r(bArr, G6, 0));
    }

    public static w r(byte[] bArr, int i6, int i7) {
        if (i7 >= bArr.length) {
            return w.y("");
        }
        w.a o6 = w.o();
        int y6 = y(bArr, i7, i6);
        while (i7 < y6) {
            o6.h(new String(bArr, i7, y6 - i7, w(i6)));
            i7 = v(i6) + y6;
            y6 = y(bArr, i7, i6);
        }
        w k6 = o6.k();
        return k6.isEmpty() ? w.y("") : k6;
    }

    public static n s(C1144z c1144z, int i6) {
        if (i6 < 1) {
            return null;
        }
        int G6 = c1144z.G();
        int i7 = i6 - 1;
        byte[] bArr = new byte[i7];
        c1144z.l(bArr, 0, i7);
        int y6 = y(bArr, 0, G6);
        return new n("TXXX", new String(bArr, 0, y6, w(G6)), r(bArr, G6, y6 + v(G6)));
    }

    public static o t(C1144z c1144z, int i6, String str) {
        byte[] bArr = new byte[i6];
        c1144z.l(bArr, 0, i6);
        return new o(str, null, new String(bArr, 0, z(bArr, 0), y6.e.b));
    }

    public static o u(C1144z c1144z, int i6) {
        if (i6 < 1) {
            return null;
        }
        int G6 = c1144z.G();
        int i7 = i6 - 1;
        byte[] bArr = new byte[i7];
        c1144z.l(bArr, 0, i7);
        int y6 = y(bArr, 0, G6);
        String str = new String(bArr, 0, y6, w(G6));
        int v6 = y6 + v(G6);
        return new o("WXXX", str, p(bArr, v6, z(bArr, v6), y6.e.b));
    }

    public static int v(int i6) {
        return (i6 == 0 || i6 == 3) ? 1 : 2;
    }

    public static Charset w(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? y6.e.b : y6.e.c : y6.e.d : y6.e.f;
    }

    public static String x(int i6, int i7, int i8, int i9, int i10) {
        return i6 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10));
    }

    public static int y(byte[] bArr, int i6, int i7) {
        int z6 = z(bArr, i6);
        if (i7 == 0 || i7 == 3) {
            return z6;
        }
        while (z6 < bArr.length - 1) {
            if ((z6 - i6) % 2 == 0 && bArr[z6 + 1] == 0) {
                return z6;
            }
            z6 = z(bArr, z6 + 1);
        }
        return bArr.length;
    }

    public static int z(byte[] bArr, int i6) {
        while (i6 < bArr.length) {
            if (bArr[i6] == 0) {
                return i6;
            }
            i6++;
        }
        return bArr.length;
    }

    @Override // N1.c
    public x b(N1.b bVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public x e(byte[] bArr, int i6) {
        ArrayList arrayList = new ArrayList();
        C1144z c1144z = new C1144z(bArr, i6);
        b m6 = m(c1144z);
        if (m6 == null) {
            return null;
        }
        int f6 = c1144z.f();
        int i7 = m6.f4671a == 2 ? 6 : 10;
        int i8 = m6.f4673c;
        if (m6.f4672b) {
            i8 = A(c1144z, m6.f4673c);
        }
        c1144z.S(f6 + i8);
        boolean z6 = false;
        if (!B(c1144z, m6.f4671a, i7, false)) {
            if (m6.f4671a != 4 || !B(c1144z, 4, i7, true)) {
                AbstractC1133o.h("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m6.f4671a);
                return null;
            }
            z6 = true;
        }
        while (c1144z.a() >= i7) {
            i k6 = k(m6.f4671a, c1144z, z6, i7, this.f4670a);
            if (k6 != null) {
                arrayList.add(k6);
            }
        }
        return new x(arrayList);
    }

    public h(a aVar) {
        this.f4670a = aVar;
    }
}
