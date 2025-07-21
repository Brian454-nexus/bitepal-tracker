package W2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface n {

    /* renamed from: a, reason: collision with root package name */
    public static final b.c f5585a;

    /* renamed from: b, reason: collision with root package name */
    public static final b.C0098b f5586b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class b {

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f5587a;

            public a(Throwable th) {
                this.f5587a = th;
            }

            public Throwable a() {
                return this.f5587a;
            }

            public String toString() {
                return "FAILURE (" + this.f5587a.getMessage() + ")";
            }
        }

        /* renamed from: W2.n$b$b, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0098b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            public C0098b() {
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            public c() {
            }
        }
    }

    static {
        f5585a = new b.c();
        f5586b = new b.C0098b();
    }
}
