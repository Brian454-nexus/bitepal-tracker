package i1;

/* renamed from: i1.k, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1494k {

    /* renamed from: d, reason: collision with root package name */
    public static final C1494k f15940d = new b().d();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15941a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15942b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15943c;

    /* renamed from: i1.k$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f15944a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f15945b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f15946c;

        public C1494k d() {
            if (this.f15944a || !(this.f15945b || this.f15946c)) {
                return new C1494k(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        public b e(boolean z6) {
            this.f15944a = z6;
            return this;
        }

        public b f(boolean z6) {
            this.f15945b = z6;
            return this;
        }

        public b g(boolean z6) {
            this.f15946c = z6;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1494k.class == obj.getClass()) {
            C1494k c1494k = (C1494k) obj;
            if (this.f15941a == c1494k.f15941a && this.f15942b == c1494k.f15942b && this.f15943c == c1494k.f15943c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f15941a ? 1 : 0) << 2) + ((this.f15942b ? 1 : 0) << 1) + (this.f15943c ? 1 : 0);
    }

    public C1494k(b bVar) {
        this.f15941a = bVar.f15944a;
        this.f15942b = bVar.f15945b;
        this.f15943c = bVar.f15946c;
    }
}
