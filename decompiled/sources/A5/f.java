package A5;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f237c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final long f238a;

    /* renamed from: b, reason: collision with root package name */
    public final long f239b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f240a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f241b = 0;

        public f a() {
            return new f(this.f240a, this.f241b);
        }

        public a b(long j6) {
            this.f241b = j6;
            return this;
        }

        public a c(long j6) {
            this.f240a = j6;
            return this;
        }
    }

    public f(long j6, long j7) {
        this.f238a = j6;
        this.f239b = j7;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f239b;
    }

    public long b() {
        return this.f238a;
    }
}
