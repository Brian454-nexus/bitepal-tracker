package androidx.datastore.preferences.protobuf;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class G implements f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final N f8663b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final N f8664a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements N {
        @Override // androidx.datastore.preferences.protobuf.N
        public M a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public boolean b(Class cls) {
            return false;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements N {

        /* renamed from: a, reason: collision with root package name */
        public N[] f8665a;

        public b(N... nArr) {
            this.f8665a = nArr;
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public M a(Class cls) {
            for (N n6 : this.f8665a) {
                if (n6.b(cls)) {
                    return n6.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public boolean b(Class cls) {
            for (N n6 : this.f8665a) {
                if (n6.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public G() {
        this(b());
    }

    public static N b() {
        return new b(C1044v.c(), c());
    }

    public static N c() {
        try {
            return (N) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f8663b;
        }
    }

    public static boolean d(M m6) {
        return m6.c() == Z.PROTO2;
    }

    public static e0 e(Class cls, M m6) {
        return AbstractC1045w.class.isAssignableFrom(cls) ? d(m6) ? S.Q(cls, m6, W.b(), E.b(), g0.L(), r.b(), L.b()) : S.Q(cls, m6, W.b(), E.b(), g0.L(), null, L.b()) : d(m6) ? S.Q(cls, m6, W.a(), E.a(), g0.G(), r.a(), L.a()) : S.Q(cls, m6, W.a(), E.a(), g0.H(), null, L.a());
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public e0 a(Class cls) {
        g0.I(cls);
        M a6 = this.f8664a.a(cls);
        return a6.a() ? AbstractC1045w.class.isAssignableFrom(cls) ? T.l(g0.L(), r.b(), a6.b()) : T.l(g0.G(), r.a(), a6.b()) : e(cls, a6);
    }

    public G(N n6) {
        this.f8664a = (N) AbstractC1047y.b(n6, "messageInfoFactory");
    }
}
