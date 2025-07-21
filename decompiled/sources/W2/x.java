package W2;

import android.content.Context;
import androidx.work.WorkerParameters;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5613a = k.i("WorkerFactory");

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends x {
        @Override // W2.x
        public androidx.work.c a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static x c() {
        return new a();
    }

    public abstract androidx.work.c a(Context context, String str, WorkerParameters workerParameters);

    public final androidx.work.c b(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        androidx.work.c a6 = a(context, str, workerParameters);
        if (a6 == null) {
            try {
                cls = Class.forName(str).asSubclass(androidx.work.c.class);
            } catch (Throwable th) {
                k.e().d(f5613a, "Invalid class: " + str, th);
                cls = null;
            }
            if (cls != null) {
                try {
                    a6 = (androidx.work.c) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    k.e().d(f5613a, "Could not instantiate " + str, th2);
                }
            }
        }
        if (a6 == null || !a6.k()) {
            return a6;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
