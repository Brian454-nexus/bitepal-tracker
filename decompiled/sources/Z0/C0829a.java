package Z0;

import Z0.u;
import android.net.Uri;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.util.Arrays;

/* renamed from: Z0.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0829a {

    /* renamed from: g, reason: collision with root package name */
    public static final C0829a f6828g = new C0829a(null, new C0114a[0], 0, -9223372036854775807L, 0);

    /* renamed from: h, reason: collision with root package name */
    public static final C0114a f6829h = new C0114a(0).i(0);

    /* renamed from: i, reason: collision with root package name */
    public static final String f6830i = AbstractC1117K.x0(1);

    /* renamed from: j, reason: collision with root package name */
    public static final String f6831j = AbstractC1117K.x0(2);

    /* renamed from: k, reason: collision with root package name */
    public static final String f6832k = AbstractC1117K.x0(3);

    /* renamed from: l, reason: collision with root package name */
    public static final String f6833l = AbstractC1117K.x0(4);

    /* renamed from: a, reason: collision with root package name */
    public final Object f6834a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6835b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6836c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6837d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6838e;

    /* renamed from: f, reason: collision with root package name */
    public final C0114a[] f6839f;

    /* renamed from: Z0.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0114a {

        /* renamed from: j, reason: collision with root package name */
        public static final String f6840j = AbstractC1117K.x0(0);

        /* renamed from: k, reason: collision with root package name */
        public static final String f6841k = AbstractC1117K.x0(1);

        /* renamed from: l, reason: collision with root package name */
        public static final String f6842l = AbstractC1117K.x0(2);

        /* renamed from: m, reason: collision with root package name */
        public static final String f6843m = AbstractC1117K.x0(3);

        /* renamed from: n, reason: collision with root package name */
        public static final String f6844n = AbstractC1117K.x0(4);

        /* renamed from: o, reason: collision with root package name */
        public static final String f6845o = AbstractC1117K.x0(5);

        /* renamed from: p, reason: collision with root package name */
        public static final String f6846p = AbstractC1117K.x0(6);

        /* renamed from: q, reason: collision with root package name */
        public static final String f6847q = AbstractC1117K.x0(7);

        /* renamed from: r, reason: collision with root package name */
        public static final String f6848r = AbstractC1117K.x0(8);

        /* renamed from: a, reason: collision with root package name */
        public final long f6849a;

        /* renamed from: b, reason: collision with root package name */
        public final int f6850b;

        /* renamed from: c, reason: collision with root package name */
        public final int f6851c;

        /* renamed from: d, reason: collision with root package name */
        public final Uri[] f6852d;

        /* renamed from: e, reason: collision with root package name */
        public final u[] f6853e;

        /* renamed from: f, reason: collision with root package name */
        public final int[] f6854f;

        /* renamed from: g, reason: collision with root package name */
        public final long[] f6855g;

        /* renamed from: h, reason: collision with root package name */
        public final long f6856h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f6857i;

        public C0114a(long j6) {
            this(j6, -1, -1, new int[0], new u[0], new long[0], 0L, false);
        }

        public static long[] b(long[] jArr, int i6) {
            int length = jArr.length;
            int max = Math.max(i6, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        public static int[] c(int[] iArr, int i6) {
            int length = iArr.length;
            int max = Math.max(i6, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        public int d() {
            return e(-1);
        }

        public int e(int i6) {
            int i7;
            int i8 = i6 + 1;
            while (true) {
                int[] iArr = this.f6854f;
                if (i8 >= iArr.length || this.f6857i || (i7 = iArr[i8]) == 0 || i7 == 1) {
                    break;
                }
                i8++;
            }
            return i8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C0114a.class == obj.getClass()) {
                C0114a c0114a = (C0114a) obj;
                if (this.f6849a == c0114a.f6849a && this.f6850b == c0114a.f6850b && this.f6851c == c0114a.f6851c && Arrays.equals(this.f6853e, c0114a.f6853e) && Arrays.equals(this.f6854f, c0114a.f6854f) && Arrays.equals(this.f6855g, c0114a.f6855g) && this.f6856h == c0114a.f6856h && this.f6857i == c0114a.f6857i) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            if (this.f6850b == -1) {
                return true;
            }
            for (int i6 = 0; i6 < this.f6850b; i6++) {
                int i7 = this.f6854f[i6];
                if (i7 == 0 || i7 == 1) {
                    return true;
                }
            }
            return false;
        }

        public final boolean g() {
            return this.f6857i && this.f6849a == Long.MIN_VALUE && this.f6850b == -1;
        }

        public boolean h() {
            return this.f6850b == -1 || d() < this.f6850b;
        }

        public int hashCode() {
            int i6 = ((this.f6850b * 31) + this.f6851c) * 31;
            long j6 = this.f6849a;
            int hashCode = (((((((i6 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + Arrays.hashCode(this.f6853e)) * 31) + Arrays.hashCode(this.f6854f)) * 31) + Arrays.hashCode(this.f6855g)) * 31;
            long j7 = this.f6856h;
            return ((hashCode + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f6857i ? 1 : 0);
        }

        public C0114a i(int i6) {
            int[] c6 = c(this.f6854f, i6);
            long[] b6 = b(this.f6855g, i6);
            return new C0114a(this.f6849a, i6, this.f6851c, c6, (u[]) Arrays.copyOf(this.f6853e, i6), b6, this.f6856h, this.f6857i);
        }

        public C0114a(long j6, int i6, int i7, int[] iArr, u[] uVarArr, long[] jArr, long j7, boolean z6) {
            int i8 = 0;
            AbstractC1119a.a(iArr.length == uVarArr.length);
            this.f6849a = j6;
            this.f6850b = i6;
            this.f6851c = i7;
            this.f6854f = iArr;
            this.f6853e = uVarArr;
            this.f6855g = jArr;
            this.f6856h = j7;
            this.f6857i = z6;
            this.f6852d = new Uri[uVarArr.length];
            while (true) {
                Uri[] uriArr = this.f6852d;
                if (i8 >= uriArr.length) {
                    return;
                }
                u uVar = uVarArr[i8];
                uriArr[i8] = uVar == null ? null : ((u.h) AbstractC1119a.e(uVar.f7064b)).f7156a;
                i8++;
            }
        }
    }

    public C0829a(Object obj, C0114a[] c0114aArr, long j6, long j7, int i6) {
        this.f6834a = obj;
        this.f6836c = j6;
        this.f6837d = j7;
        this.f6835b = c0114aArr.length + i6;
        this.f6839f = c0114aArr;
        this.f6838e = i6;
    }

    public C0114a a(int i6) {
        int i7 = this.f6838e;
        return i6 < i7 ? f6829h : this.f6839f[i6 - i7];
    }

    public int b(long j6, long j7) {
        if (j6 != Long.MIN_VALUE && (j7 == -9223372036854775807L || j6 < j7)) {
            int i6 = this.f6838e;
            while (i6 < this.f6835b && ((a(i6).f6849a != Long.MIN_VALUE && a(i6).f6849a <= j6) || !a(i6).h())) {
                i6++;
            }
            if (i6 < this.f6835b) {
                return i6;
            }
        }
        return -1;
    }

    public int c(long j6, long j7) {
        int i6 = this.f6835b - 1;
        int i7 = i6 - (d(i6) ? 1 : 0);
        while (i7 >= 0) {
            long j8 = j6;
            long j9 = j7;
            if (!e(j8, j9, i7)) {
                break;
            }
            i7--;
            j6 = j8;
            j7 = j9;
        }
        if (i7 < 0 || !a(i7).f()) {
            return -1;
        }
        return i7;
    }

    public boolean d(int i6) {
        return i6 == this.f6835b - 1 && a(i6).g();
    }

    public final boolean e(long j6, long j7, int i6) {
        if (j6 == Long.MIN_VALUE) {
            return false;
        }
        C0114a a6 = a(i6);
        long j8 = a6.f6849a;
        return j8 == Long.MIN_VALUE ? j7 == -9223372036854775807L || (a6.f6857i && a6.f6850b == -1) || j6 < j7 : j6 < j8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0829a.class == obj.getClass()) {
            C0829a c0829a = (C0829a) obj;
            if (AbstractC1117K.c(this.f6834a, c0829a.f6834a) && this.f6835b == c0829a.f6835b && this.f6836c == c0829a.f6836c && this.f6837d == c0829a.f6837d && this.f6838e == c0829a.f6838e && Arrays.equals(this.f6839f, c0829a.f6839f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i6 = this.f6835b * 31;
        Object obj = this.f6834a;
        return ((((((((i6 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f6836c)) * 31) + ((int) this.f6837d)) * 31) + this.f6838e) * 31) + Arrays.hashCode(this.f6839f);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.f6834a);
        sb.append(", adResumePositionUs=");
        sb.append(this.f6836c);
        sb.append(", adGroups=[");
        for (int i6 = 0; i6 < this.f6839f.length; i6++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f6839f[i6].f6849a);
            sb.append(", ads=[");
            for (int i7 = 0; i7 < this.f6839f[i6].f6854f.length; i7++) {
                sb.append("ad(state=");
                int i8 = this.f6839f[i6].f6854f[i7];
                if (i8 == 0) {
                    sb.append('_');
                } else if (i8 == 1) {
                    sb.append('R');
                } else if (i8 == 2) {
                    sb.append('S');
                } else if (i8 == 3) {
                    sb.append('P');
                } else if (i8 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.f6839f[i6].f6855g[i7]);
                sb.append(')');
                if (i7 < this.f6839f[i6].f6854f.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i6 < this.f6839f.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
}
