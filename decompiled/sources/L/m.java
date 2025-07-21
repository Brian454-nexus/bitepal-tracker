package L;

import android.os.Handler;
import android.os.Looper;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static volatile Handler f3081a;

    public static Handler a() {
        if (f3081a != null) {
            return f3081a;
        }
        synchronized (m.class) {
            try {
                if (f3081a == null) {
                    f3081a = v0.i.a(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3081a;
    }
}
