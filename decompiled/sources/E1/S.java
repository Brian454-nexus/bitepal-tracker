package E1;

import android.util.Base64;
import c1.AbstractC1117K;
import c1.AbstractC1133o;
import c1.C1144z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class S {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f942a;

        /* renamed from: b, reason: collision with root package name */
        public final String[] f943b;

        /* renamed from: c, reason: collision with root package name */
        public final int f944c;

        public a(String str, String[] strArr, int i6) {
            this.f942a = str;
            this.f943b = strArr;
            this.f944c = i6;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f945a;

        /* renamed from: b, reason: collision with root package name */
        public final int f946b;

        /* renamed from: c, reason: collision with root package name */
        public final int f947c;

        /* renamed from: d, reason: collision with root package name */
        public final int f948d;

        public b(boolean z6, int i6, int i7, int i8) {
            this.f945a = z6;
            this.f946b = i6;
            this.f947c = i7;
            this.f948d = i8;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f949a;

        /* renamed from: b, reason: collision with root package name */
        public final int f950b;

        /* renamed from: c, reason: collision with root package name */
        public final int f951c;

        /* renamed from: d, reason: collision with root package name */
        public final int f952d;

        /* renamed from: e, reason: collision with root package name */
        public final int f953e;

        /* renamed from: f, reason: collision with root package name */
        public final int f954f;

        /* renamed from: g, reason: collision with root package name */
        public final int f955g;

        /* renamed from: h, reason: collision with root package name */
        public final int f956h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f957i;

        /* renamed from: j, reason: collision with root package name */
        public final byte[] f958j;

        public c(int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, boolean z6, byte[] bArr) {
            this.f949a = i6;
            this.f950b = i7;
            this.f951c = i8;
            this.f952d = i9;
            this.f953e = i10;
            this.f954f = i11;
            this.f955g = i12;
            this.f956h = i13;
            this.f957i = z6;
            this.f958j = bArr;
        }
    }

    public static int[] a(int i6) {
        if (i6 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i6 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i6 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i6 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i6 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int b(int i6) {
        int i7 = 0;
        while (i6 > 0) {
            i7++;
            i6 >>>= 1;
        }
        return i7;
    }

    public static long c(long j6, long j7) {
        return (long) Math.floor(Math.pow(j6, 1.0d / j7));
    }

    public static Z0.x d(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < list.size(); i6++) {
            String str = (String) list.get(i6);
            String[] e12 = AbstractC1117K.e1(str, com.amazon.a.a.o.b.f.f11249b);
            if (e12.length != 2) {
                AbstractC1133o.h("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (e12[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(Q1.a.a(new C1144z(Base64.decode(e12[1], 0))));
                } catch (RuntimeException e6) {
                    AbstractC1133o.i("VorbisUtil", "Failed to parse vorbis picture", e6);
                }
            } else {
                arrayList.add(new V1.a(e12[0], e12[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Z0.x(arrayList);
    }

    public static z6.w e(byte[] bArr) {
        C1144z c1144z = new C1144z(bArr);
        c1144z.U(1);
        int i6 = 0;
        while (c1144z.a() > 0 && c1144z.j() == 255) {
            i6 += 255;
            c1144z.U(1);
        }
        int G6 = i6 + c1144z.G();
        int i7 = 0;
        while (c1144z.a() > 0 && c1144z.j() == 255) {
            i7 += 255;
            c1144z.U(1);
        }
        int G7 = i7 + c1144z.G();
        byte[] bArr2 = new byte[G6];
        int f6 = c1144z.f();
        System.arraycopy(bArr, f6, bArr2, 0, G6);
        int i8 = f6 + G6 + G7;
        int length = bArr.length - i8;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i8, bArr3, 0, length);
        return z6.w.z(bArr2, bArr3);
    }

    public static void f(Q q6) {
        int d6 = q6.d(6) + 1;
        for (int i6 = 0; i6 < d6; i6++) {
            int d7 = q6.d(16);
            if (d7 == 0) {
                q6.e(8);
                q6.e(16);
                q6.e(16);
                q6.e(6);
                q6.e(8);
                int d8 = q6.d(4) + 1;
                for (int i7 = 0; i7 < d8; i7++) {
                    q6.e(8);
                }
            } else {
                if (d7 != 1) {
                    throw Z0.z.a("floor type greater than 1 not decodable: " + d7, null);
                }
                int d9 = q6.d(5);
                int[] iArr = new int[d9];
                int i8 = -1;
                for (int i9 = 0; i9 < d9; i9++) {
                    int d10 = q6.d(4);
                    iArr[i9] = d10;
                    if (d10 > i8) {
                        i8 = d10;
                    }
                }
                int i10 = i8 + 1;
                int[] iArr2 = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr2[i11] = q6.d(3) + 1;
                    int d11 = q6.d(2);
                    if (d11 > 0) {
                        q6.e(8);
                    }
                    for (int i12 = 0; i12 < (1 << d11); i12++) {
                        q6.e(8);
                    }
                }
                q6.e(2);
                int d12 = q6.d(4);
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < d9; i15++) {
                    i13 += iArr2[iArr[i15]];
                    while (i14 < i13) {
                        q6.e(d12);
                        i14++;
                    }
                }
            }
        }
    }

    public static void g(int i6, Q q6) {
        int d6 = q6.d(6) + 1;
        for (int i7 = 0; i7 < d6; i7++) {
            int d7 = q6.d(16);
            if (d7 != 0) {
                AbstractC1133o.c("VorbisUtil", "mapping type other than 0 not supported: " + d7);
            } else {
                int d8 = q6.c() ? q6.d(4) + 1 : 1;
                if (q6.c()) {
                    int d9 = q6.d(8) + 1;
                    for (int i8 = 0; i8 < d9; i8++) {
                        int i9 = i6 - 1;
                        q6.e(b(i9));
                        q6.e(b(i9));
                    }
                }
                if (q6.d(2) != 0) {
                    throw Z0.z.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (d8 > 1) {
                    for (int i10 = 0; i10 < i6; i10++) {
                        q6.e(4);
                    }
                }
                for (int i11 = 0; i11 < d8; i11++) {
                    q6.e(8);
                    q6.e(8);
                    q6.e(8);
                }
            }
        }
    }

    public static b[] h(Q q6) {
        int d6 = q6.d(6) + 1;
        b[] bVarArr = new b[d6];
        for (int i6 = 0; i6 < d6; i6++) {
            bVarArr[i6] = new b(q6.c(), q6.d(16), q6.d(16), q6.d(8));
        }
        return bVarArr;
    }

    public static void i(Q q6) {
        int d6 = q6.d(6) + 1;
        for (int i6 = 0; i6 < d6; i6++) {
            if (q6.d(16) > 2) {
                throw Z0.z.a("residueType greater than 2 is not decodable", null);
            }
            q6.e(24);
            q6.e(24);
            q6.e(24);
            int d7 = q6.d(6) + 1;
            q6.e(8);
            int[] iArr = new int[d7];
            for (int i7 = 0; i7 < d7; i7++) {
                iArr[i7] = ((q6.c() ? q6.d(5) : 0) * 8) + q6.d(3);
            }
            for (int i8 = 0; i8 < d7; i8++) {
                for (int i9 = 0; i9 < 8; i9++) {
                    if ((iArr[i8] & (1 << i9)) != 0) {
                        q6.e(8);
                    }
                }
            }
        }
    }

    public static a j(C1144z c1144z) {
        return k(c1144z, true, true);
    }

    public static a k(C1144z c1144z, boolean z6, boolean z7) {
        if (z6) {
            o(3, c1144z, false);
        }
        String D6 = c1144z.D((int) c1144z.w());
        int length = D6.length();
        long w6 = c1144z.w();
        String[] strArr = new String[(int) w6];
        int i6 = length + 15;
        for (int i7 = 0; i7 < w6; i7++) {
            String D7 = c1144z.D((int) c1144z.w());
            strArr[i7] = D7;
            i6 = i6 + 4 + D7.length();
        }
        if (z7 && (c1144z.G() & 1) == 0) {
            throw Z0.z.a("framing bit expected to be set", null);
        }
        return new a(D6, strArr, i6 + 1);
    }

    public static c l(C1144z c1144z) {
        o(1, c1144z, false);
        int x6 = c1144z.x();
        int G6 = c1144z.G();
        int x7 = c1144z.x();
        int t6 = c1144z.t();
        if (t6 <= 0) {
            t6 = -1;
        }
        int t7 = c1144z.t();
        if (t7 <= 0) {
            t7 = -1;
        }
        int t8 = c1144z.t();
        if (t8 <= 0) {
            t8 = -1;
        }
        int G7 = c1144z.G();
        return new c(x6, G6, x7, t6, t7, t8, (int) Math.pow(2.0d, G7 & 15), (int) Math.pow(2.0d, (G7 & 240) >> 4), (c1144z.G() & 1) > 0, Arrays.copyOf(c1144z.e(), c1144z.g()));
    }

    public static b[] m(C1144z c1144z, int i6) {
        o(5, c1144z, false);
        int G6 = c1144z.G() + 1;
        Q q6 = new Q(c1144z.e());
        q6.e(c1144z.f() * 8);
        for (int i7 = 0; i7 < G6; i7++) {
            n(q6);
        }
        int d6 = q6.d(6) + 1;
        for (int i8 = 0; i8 < d6; i8++) {
            if (q6.d(16) != 0) {
                throw Z0.z.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        f(q6);
        i(q6);
        g(i6, q6);
        b[] h6 = h(q6);
        if (q6.c()) {
            return h6;
        }
        throw Z0.z.a("framing bit after modes not set as expected", null);
    }

    public static void n(Q q6) {
        if (q6.d(24) != 5653314) {
            throw Z0.z.a("expected code book to start with [0x56, 0x43, 0x42] at " + q6.b(), null);
        }
        int d6 = q6.d(16);
        int d7 = q6.d(24);
        int i6 = 0;
        if (q6.c()) {
            q6.e(5);
            while (i6 < d7) {
                i6 += q6.d(b(d7 - i6));
            }
        } else {
            boolean c6 = q6.c();
            while (i6 < d7) {
                if (!c6) {
                    q6.e(5);
                } else if (q6.c()) {
                    q6.e(5);
                }
                i6++;
            }
        }
        int d8 = q6.d(4);
        if (d8 > 2) {
            throw Z0.z.a("lookup type greater than 2 not decodable: " + d8, null);
        }
        if (d8 == 1 || d8 == 2) {
            q6.e(32);
            q6.e(32);
            int d9 = q6.d(4) + 1;
            q6.e(1);
            q6.e((int) ((d8 == 1 ? d6 != 0 ? c(d7, d6) : 0L : d6 * d7) * d9));
        }
    }

    public static boolean o(int i6, C1144z c1144z, boolean z6) {
        if (c1144z.a() < 7) {
            if (z6) {
                return false;
            }
            throw Z0.z.a("too short header: " + c1144z.a(), null);
        }
        if (c1144z.G() != i6) {
            if (z6) {
                return false;
            }
            throw Z0.z.a("expected header type " + Integer.toHexString(i6), null);
        }
        if (c1144z.G() == 118 && c1144z.G() == 111 && c1144z.G() == 114 && c1144z.G() == 98 && c1144z.G() == 105 && c1144z.G() == 115) {
            return true;
        }
        if (z6) {
            return false;
        }
        throw Z0.z.a("expected characters 'vorbis'", null);
    }
}
