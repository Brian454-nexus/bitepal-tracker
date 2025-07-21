package W2;

import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5569a = k.i("InputMerger");

    public static h a(String str) {
        try {
            return (h) Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e6) {
            k.e().d(f5569a, "Trouble instantiating + " + str, e6);
            return null;
        }
    }

    public abstract androidx.work.b b(List list);
}
