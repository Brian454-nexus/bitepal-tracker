package I0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e extends v {

    /* renamed from: b, reason: collision with root package name */
    public final Object f2582b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2583c;

    public e(Object obj, int i6, int i7) {
        super(i7, null);
        this.f2582b = obj;
        this.f2583c = i6;
    }

    public final void b() {
        Object obj = this.f2582b;
        if ((obj != null ? obj.hashCode() : 0) != this.f2583c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object c() {
        return this.f2582b;
    }
}
