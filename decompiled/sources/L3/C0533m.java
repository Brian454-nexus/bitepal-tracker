package L3;

/* renamed from: L3.m, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0533m {

    /* renamed from: a, reason: collision with root package name */
    public String f3293a;

    /* renamed from: L3.m$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f3294a;

        public /* synthetic */ a(AbstractC0549u0 abstractC0549u0) {
        }

        public C0533m a() {
            String str = this.f3294a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C0533m c0533m = new C0533m(null);
            c0533m.f3293a = str;
            return c0533m;
        }

        public a b(String str) {
            this.f3294a = str;
            return this;
        }
    }

    public /* synthetic */ C0533m(AbstractC0549u0 abstractC0549u0) {
    }

    public static a b() {
        return new a(null);
    }

    public String a() {
        return this.f3293a;
    }
}
