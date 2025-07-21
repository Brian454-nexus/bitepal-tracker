package A5;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f232c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final long f233a;

    /* renamed from: b, reason: collision with root package name */
    public final long f234b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f235a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f236b = 0;

        public e a() {
            return new e(this.f235a, this.f236b);
        }

        public a b(long j6) {
            this.f235a = j6;
            return this;
        }

        public a c(long j6) {
            this.f236b = j6;
            return this;
        }
    }

    public e(long j6, long j7) {
        this.f233a = j6;
        this.f234b = j7;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f233a;
    }

    public long b() {
        return this.f234b;
    }
}
