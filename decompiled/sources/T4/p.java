package T4;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class p implements v {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5091a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5092b;

    /* renamed from: c, reason: collision with root package name */
    public final v f5093c;

    /* renamed from: d, reason: collision with root package name */
    public final a f5094d;

    /* renamed from: e, reason: collision with root package name */
    public final R4.f f5095e;

    /* renamed from: f, reason: collision with root package name */
    public int f5096f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5097g;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void d(R4.f fVar, p pVar);
    }

    public p(v vVar, boolean z6, boolean z7, R4.f fVar, a aVar) {
        this.f5093c = (v) n5.k.d(vVar);
        this.f5091a = z6;
        this.f5092b = z7;
        this.f5095e = fVar;
        this.f5094d = (a) n5.k.d(aVar);
    }

    @Override // T4.v
    public synchronized void a() {
        if (this.f5096f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f5097g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f5097g = true;
        if (this.f5092b) {
            this.f5093c.a();
        }
    }

    @Override // T4.v
    public Class b() {
        return this.f5093c.b();
    }

    public synchronized void c() {
        if (this.f5097g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f5096f++;
    }

    public v d() {
        return this.f5093c;
    }

    public boolean e() {
        return this.f5091a;
    }

    @Override // T4.v
    public int f() {
        return this.f5093c.f();
    }

    public void g() {
        boolean z6;
        synchronized (this) {
            int i6 = this.f5096f;
            if (i6 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z6 = true;
            int i7 = i6 - 1;
            this.f5096f = i7;
            if (i7 != 0) {
                z6 = false;
            }
        }
        if (z6) {
            this.f5094d.d(this.f5095e, this);
        }
    }

    @Override // T4.v
    public Object get() {
        return this.f5093c.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f5091a + ", listener=" + this.f5094d + ", key=" + this.f5095e + ", acquired=" + this.f5096f + ", isRecycled=" + this.f5097g + ", resource=" + this.f5093c + '}';
    }
}
