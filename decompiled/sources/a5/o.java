package a5;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f7754a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final o f7755b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final o f7756c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final o f7757d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final o f7758e;

    /* renamed from: f, reason: collision with root package name */
    public static final o f7759f;

    /* renamed from: g, reason: collision with root package name */
    public static final o f7760g;

    /* renamed from: h, reason: collision with root package name */
    public static final R4.g f7761h;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f7762i;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends o {
        @Override // a5.o
        public g a(int i6, int i7, int i8, int i9) {
            return g.QUALITY;
        }

        @Override // a5.o
        public float b(int i6, int i7, int i8, int i9) {
            if (Math.min(i7 / i9, i6 / i8) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b extends o {
        @Override // a5.o
        public g a(int i6, int i7, int i8, int i9) {
            return g.MEMORY;
        }

        @Override // a5.o
        public float b(int i6, int i7, int i8, int i9) {
            int ceil = (int) Math.ceil(Math.max(i7 / i9, i6 / i8));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(ceil)) >= ceil ? 0 : 1));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c extends o {
        @Override // a5.o
        public g a(int i6, int i7, int i8, int i9) {
            return b(i6, i7, i8, i9) == 1.0f ? g.QUALITY : o.f7756c.a(i6, i7, i8, i9);
        }

        @Override // a5.o
        public float b(int i6, int i7, int i8, int i9) {
            return Math.min(1.0f, o.f7756c.b(i6, i7, i8, i9));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d extends o {
        @Override // a5.o
        public g a(int i6, int i7, int i8, int i9) {
            return g.QUALITY;
        }

        @Override // a5.o
        public float b(int i6, int i7, int i8, int i9) {
            return Math.max(i8 / i6, i9 / i7);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class e extends o {
        @Override // a5.o
        public g a(int i6, int i7, int i8, int i9) {
            return o.f7762i ? g.QUALITY : g.MEMORY;
        }

        @Override // a5.o
        public float b(int i6, int i7, int i8, int i9) {
            if (o.f7762i) {
                return Math.min(i8 / i6, i9 / i7);
            }
            if (Math.max(i7 / i9, i6 / i8) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class f extends o {
        @Override // a5.o
        public g a(int i6, int i7, int i8, int i9) {
            return g.QUALITY;
        }

        @Override // a5.o
        public float b(int i6, int i7, int i8, int i9) {
            return 1.0f;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f7758e = dVar;
        f7759f = new f();
        f7760g = dVar;
        f7761h = R4.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f7762i = true;
    }

    public abstract g a(int i6, int i7, int i8, int i9);

    public abstract float b(int i6, int i7, int i8, int i9);
}
