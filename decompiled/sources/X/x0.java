package X;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final r f6017a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f6018b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends x0 {

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC0809s f6019c;

        /* renamed from: d, reason: collision with root package name */
        public final int f6020d;

        /* renamed from: e, reason: collision with root package name */
        public final Throwable f6021e;

        public a(r rVar, a0 a0Var, AbstractC0809s abstractC0809s, int i6, Throwable th) {
            super(rVar, a0Var);
            this.f6019c = abstractC0809s;
            this.f6020d = i6;
            this.f6021e = th;
        }

        public static String h(int i6) {
            switch (i6) {
                case 0:
                    return "ERROR_NONE";
                case 1:
                    return "ERROR_UNKNOWN";
                case 2:
                    return "ERROR_FILE_SIZE_LIMIT_REACHED";
                case 3:
                    return "ERROR_INSUFFICIENT_STORAGE";
                case 4:
                    return "ERROR_SOURCE_INACTIVE";
                case 5:
                    return "ERROR_INVALID_OUTPUT_OPTIONS";
                case 6:
                    return "ERROR_ENCODING_FAILED";
                case 7:
                    return "ERROR_RECORDER_ERROR";
                case 8:
                    return "ERROR_NO_VALID_DATA";
                case 9:
                    return "ERROR_DURATION_LIMIT_REACHED";
                case 10:
                    return "ERROR_RECORDING_GARBAGE_COLLECTED";
                default:
                    return "Unknown(" + i6 + ")";
            }
        }

        public Throwable i() {
            return this.f6021e;
        }

        public int j() {
            return this.f6020d;
        }

        public boolean k() {
            return this.f6020d != 0;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends x0 {
        public b(r rVar, a0 a0Var) {
            super(rVar, a0Var);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends x0 {
        public c(r rVar, a0 a0Var) {
            super(rVar, a0Var);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends x0 {
        public d(r rVar, a0 a0Var) {
            super(rVar, a0Var);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e extends x0 {
        public e(r rVar, a0 a0Var) {
            super(rVar, a0Var);
        }
    }

    public x0(r rVar, a0 a0Var) {
        this.f6017a = (r) y0.g.f(rVar);
        this.f6018b = (a0) y0.g.f(a0Var);
    }

    public static a a(r rVar, a0 a0Var, AbstractC0809s abstractC0809s) {
        return new a(rVar, a0Var, abstractC0809s, 0, null);
    }

    public static a b(r rVar, a0 a0Var, AbstractC0809s abstractC0809s, int i6, Throwable th) {
        y0.g.b(i6 != 0, "An error type is required.");
        return new a(rVar, a0Var, abstractC0809s, i6, th);
    }

    public static b d(r rVar, a0 a0Var) {
        return new b(rVar, a0Var);
    }

    public static c e(r rVar, a0 a0Var) {
        return new c(rVar, a0Var);
    }

    public static d f(r rVar, a0 a0Var) {
        return new d(rVar, a0Var);
    }

    public static e g(r rVar, a0 a0Var) {
        return new e(rVar, a0Var);
    }

    public r c() {
        return this.f6017a;
    }
}
