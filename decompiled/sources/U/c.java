package U;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final U.a f5152a;

    /* renamed from: b, reason: collision with root package name */
    public final d f5153b;

    /* renamed from: c, reason: collision with root package name */
    public final b f5154c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5155d;

    public c(U.a aVar, d dVar, b bVar, int i6) {
        this.f5152a = aVar;
        this.f5153b = dVar;
        this.f5154c = bVar;
        this.f5155d = i6;
    }

    public int a() {
        return this.f5155d;
    }

    public U.a b() {
        return this.f5152a;
    }

    public b c() {
        return this.f5154c;
    }

    public d d() {
        return this.f5153b;
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public U.a f5156a;

        /* renamed from: b, reason: collision with root package name */
        public d f5157b;

        /* renamed from: c, reason: collision with root package name */
        public b f5158c;

        /* renamed from: d, reason: collision with root package name */
        public int f5159d;

        public a() {
            this.f5156a = U.a.f5148c;
            this.f5157b = null;
            this.f5158c = null;
            this.f5159d = 0;
        }

        public static a b(c cVar) {
            return new a(cVar);
        }

        public c a() {
            return new c(this.f5156a, this.f5157b, this.f5158c, this.f5159d);
        }

        public a c(int i6) {
            this.f5159d = i6;
            return this;
        }

        public a d(U.a aVar) {
            this.f5156a = aVar;
            return this;
        }

        public a e(b bVar) {
            this.f5158c = bVar;
            return this;
        }

        public a f(d dVar) {
            this.f5157b = dVar;
            return this;
        }

        public a(c cVar) {
            this.f5156a = U.a.f5148c;
            this.f5157b = null;
            this.f5158c = null;
            this.f5159d = 0;
            this.f5156a = cVar.b();
            this.f5157b = cVar.d();
            this.f5158c = cVar.c();
            this.f5159d = cVar.a();
        }
    }
}
