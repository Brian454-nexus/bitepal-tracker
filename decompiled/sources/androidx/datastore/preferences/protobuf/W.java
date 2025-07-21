package androidx.datastore.preferences.protobuf;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    public static final U f8701a = c();

    /* renamed from: b, reason: collision with root package name */
    public static final U f8702b = new V();

    public static U a() {
        return f8701a;
    }

    public static U b() {
        return f8702b;
    }

    public static U c() {
        try {
            return (U) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
