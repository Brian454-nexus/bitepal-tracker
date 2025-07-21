package Z0;

import java.util.HashSet;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f7182a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f7183b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (v.class) {
            if (f7182a.add(str)) {
                f7183b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (v.class) {
            str = f7183b;
        }
        return str;
    }
}
