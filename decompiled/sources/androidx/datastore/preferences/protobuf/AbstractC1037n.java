package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1037n {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f8803a = c();

    public static C1038o a() {
        C1038o b6 = b("getEmptyRegistry");
        return b6 != null ? b6 : C1038o.f8806d;
    }

    public static final C1038o b(String str) {
        Class cls = f8803a;
        if (cls == null) {
            return null;
        }
        try {
            return (C1038o) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
