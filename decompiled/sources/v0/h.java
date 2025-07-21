package v0;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class h {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f19286a;

        public a(Handler handler) {
            this.f19286a = (Handler) y0.g.f(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f19286a.post((Runnable) y0.g.f(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f19286a + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
