package L3;

/* renamed from: L3.x, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0554x {

    /* renamed from: a, reason: collision with root package name */
    public final String f3306a;

    /* renamed from: L3.x$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f3307a;

        public /* synthetic */ a(K0 k02) {
        }

        public C0554x a() {
            if (this.f3307a != null) {
                return new C0554x(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.f3307a = str;
            return this;
        }
    }

    public /* synthetic */ C0554x(a aVar, K0 k02) {
        this.f3306a = aVar.f3307a;
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.f3306a;
    }
}
