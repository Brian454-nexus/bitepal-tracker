package E1;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f896a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f897b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f898c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f899d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f900e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f901f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f902g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f903a;

        /* renamed from: b, reason: collision with root package name */
        public String f904b;

        /* renamed from: c, reason: collision with root package name */
        public int f905c;

        /* renamed from: d, reason: collision with root package name */
        public int f906d;

        /* renamed from: e, reason: collision with root package name */
        public int f907e;

        /* renamed from: f, reason: collision with root package name */
        public int f908f;

        /* renamed from: g, reason: collision with root package name */
        public int f909g;

        public a() {
        }

        public boolean a(int i6) {
            int i7;
            int i8;
            int i9;
            int i10;
            if (!F.l(i6) || (i7 = (i6 >>> 19) & 3) == 1 || (i8 = (i6 >>> 17) & 3) == 0 || (i9 = (i6 >>> 12) & 15) == 0 || i9 == 15 || (i10 = (i6 >>> 10) & 3) == 3) {
                return false;
            }
            this.f903a = i7;
            this.f904b = F.f896a[3 - i8];
            int i11 = F.f897b[i10];
            this.f906d = i11;
            if (i7 == 2) {
                this.f906d = i11 / 2;
            } else if (i7 == 0) {
                this.f906d = i11 / 4;
            }
            int i12 = (i6 >>> 9) & 1;
            this.f909g = F.k(i7, i8);
            if (i8 == 3) {
                int i13 = i7 == 3 ? F.f898c[i9 - 1] : F.f899d[i9 - 1];
                this.f908f = i13;
                this.f905c = (((i13 * 12) / this.f906d) + i12) * 4;
            } else {
                if (i7 == 3) {
                    int i14 = i8 == 2 ? F.f900e[i9 - 1] : F.f901f[i9 - 1];
                    this.f908f = i14;
                    this.f905c = ((i14 * 144) / this.f906d) + i12;
                } else {
                    int i15 = F.f902g[i9 - 1];
                    this.f908f = i15;
                    this.f905c = (((i8 == 1 ? 72 : 144) * i15) / this.f906d) + i12;
                }
            }
            this.f907e = ((i6 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }

        public a(a aVar) {
            this.f903a = aVar.f903a;
            this.f904b = aVar.f904b;
            this.f905c = aVar.f905c;
            this.f906d = aVar.f906d;
            this.f907e = aVar.f907e;
            this.f908f = aVar.f908f;
            this.f909g = aVar.f909g;
        }
    }

    public static int j(int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        if (!l(i6) || (i7 = (i6 >>> 19) & 3) == 1 || (i8 = (i6 >>> 17) & 3) == 0 || (i9 = (i6 >>> 12) & 15) == 0 || i9 == 15 || (i10 = (i6 >>> 10) & 3) == 3) {
            return -1;
        }
        int i11 = f897b[i10];
        if (i7 == 2) {
            i11 /= 2;
        } else if (i7 == 0) {
            i11 /= 4;
        }
        int i12 = (i6 >>> 9) & 1;
        if (i8 == 3) {
            return ((((i7 == 3 ? f898c[i9 - 1] : f899d[i9 - 1]) * 12) / i11) + i12) * 4;
        }
        int i13 = i7 == 3 ? i8 == 2 ? f900e[i9 - 1] : f901f[i9 - 1] : f902g[i9 - 1];
        if (i7 == 3) {
            return ((i13 * 144) / i11) + i12;
        }
        return (((i8 == 1 ? 72 : 144) * i13) / i11) + i12;
    }

    public static int k(int i6, int i7) {
        if (i7 == 1) {
            return i6 == 3 ? 1152 : 576;
        }
        if (i7 == 2) {
            return 1152;
        }
        if (i7 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static boolean l(int i6) {
        return (i6 & (-2097152)) == -2097152;
    }

    public static int m(int i6) {
        int i7;
        int i8;
        if (!l(i6) || (i7 = (i6 >>> 19) & 3) == 1 || (i8 = (i6 >>> 17) & 3) == 0) {
            return -1;
        }
        int i9 = (i6 >>> 12) & 15;
        int i10 = (i6 >>> 10) & 3;
        if (i9 == 0 || i9 == 15 || i10 == 3) {
            return -1;
        }
        return k(i7, i8);
    }
}
