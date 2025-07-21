package z5;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements fa.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f21727c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile fa.a f21728a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f21729b = f21727c;

    public a(fa.a aVar) {
        this.f21728a = aVar;
    }

    public static fa.a a(fa.a aVar) {
        d.b(aVar);
        return aVar instanceof a ? aVar : new a(aVar);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f21727c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public Object get() {
        Object obj;
        Object obj2 = this.f21729b;
        Object obj3 = f21727c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f21729b;
                if (obj == obj3) {
                    obj = this.f21728a.get();
                    this.f21729b = b(this.f21729b, obj);
                    this.f21728a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
