package M;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static volatile ScheduledExecutorService f3348a;

    public static ScheduledExecutorService a() {
        if (f3348a != null) {
            return f3348a;
        }
        synchronized (h.class) {
            try {
                if (f3348a == null) {
                    f3348a = new e(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3348a;
    }
}
