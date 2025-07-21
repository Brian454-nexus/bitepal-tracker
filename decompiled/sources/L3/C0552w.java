package L3;

/* renamed from: L3.w, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0552w {

    /* renamed from: a, reason: collision with root package name */
    public final String f3304a;

    /* renamed from: L3.w$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f3305a;

        public /* synthetic */ a(J0 j02) {
        }

        public C0552w a() {
            if (this.f3305a != null) {
                return new C0552w(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.f3305a = str;
            return this;
        }
    }

    public /* synthetic */ C0552w(a aVar, J0 j02) {
        this.f3304a = aVar.f3305a;
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.f3304a;
    }
}
