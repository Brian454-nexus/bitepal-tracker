package A5;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f213c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final long f214a;

    /* renamed from: b, reason: collision with root package name */
    public final b f215b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f216a = 0;

        /* renamed from: b, reason: collision with root package name */
        public b f217b = b.REASON_UNKNOWN;

        public c a() {
            return new c(this.f216a, this.f217b);
        }

        public a b(long j6) {
            this.f216a = j6;
            return this;
        }

        public a c(b bVar) {
            this.f217b = bVar;
            return this;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum b implements z7.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: a, reason: collision with root package name */
        public final int f226a;

        b(int i6) {
            this.f226a = i6;
        }

        public int getNumber() {
            return this.f226a;
        }
    }

    public c(long j6, b bVar) {
        this.f214a = j6;
        this.f215b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f214a;
    }

    public b b() {
        return this.f215b;
    }
}
