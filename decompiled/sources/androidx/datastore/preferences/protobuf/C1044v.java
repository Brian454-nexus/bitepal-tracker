package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1044v implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final C1044v f8955a = new C1044v();

    public static C1044v c() {
        return f8955a;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public M a(Class cls) {
        if (!AbstractC1045w.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (M) AbstractC1045w.r(cls.asSubclass(AbstractC1045w.class)).g();
        } catch (Exception e6) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e6);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public boolean b(Class cls) {
        return AbstractC1045w.class.isAssignableFrom(cls);
    }
}
