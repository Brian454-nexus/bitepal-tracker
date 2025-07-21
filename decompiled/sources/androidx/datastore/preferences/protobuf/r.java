package androidx.datastore.preferences.protobuf;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1039p f8841a = new C1040q();

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1039p f8842b = c();

    public static AbstractC1039p a() {
        AbstractC1039p abstractC1039p = f8842b;
        if (abstractC1039p != null) {
            return abstractC1039p;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static AbstractC1039p b() {
        return f8841a;
    }

    public static AbstractC1039p c() {
        try {
            return (AbstractC1039p) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
