package androidx.datastore.preferences.protobuf;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final J f8675a = c();

    /* renamed from: b, reason: collision with root package name */
    public static final J f8676b = new K();

    public static J a() {
        return f8675a;
    }

    public static J b() {
        return f8676b;
    }

    public static J c() {
        try {
            return (J) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
