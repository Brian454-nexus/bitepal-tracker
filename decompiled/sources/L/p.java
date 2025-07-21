package L;

import android.os.Handler;
import android.os.Looper;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class p {
    public static void a() {
        y0.g.i(c(), "Not in application's main thread");
    }

    public static Handler b() {
        return new Handler(Looper.getMainLooper());
    }

    public static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void d(Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            y0.g.i(b().post(runnable), "Unable to post to main thread");
        }
    }
}
