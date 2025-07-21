package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1027d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f8718a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f8719b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f8720c;

    static {
        f8720c = (f8718a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class b() {
        return f8719b;
    }

    public static boolean c() {
        if (f8718a) {
            return true;
        }
        return (f8719b == null || f8720c) ? false : true;
    }
}
