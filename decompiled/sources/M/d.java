package M;

import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static volatile d f3328a;

    public static Executor b() {
        if (f3328a != null) {
            return f3328a;
        }
        synchronized (d.class) {
            try {
                if (f3328a == null) {
                    f3328a = new d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3328a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
