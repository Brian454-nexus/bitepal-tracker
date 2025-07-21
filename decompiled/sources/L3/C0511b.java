package L3;

/* renamed from: L3.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0511b {

    /* renamed from: a, reason: collision with root package name */
    public String f3263a;

    /* renamed from: L3.b$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f3264a;

        public /* synthetic */ a(A a6) {
        }

        public C0511b a() {
            String str = this.f3264a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C0511b c0511b = new C0511b(null);
            c0511b.f3263a = str;
            return c0511b;
        }

        public a b(String str) {
            this.f3264a = str;
            return this;
        }
    }

    public /* synthetic */ C0511b(A a6) {
    }

    public static a b() {
        return new a(null);
    }

    public String a() {
        return this.f3263a;
    }
}
