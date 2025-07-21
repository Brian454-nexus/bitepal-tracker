package I;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class K {
    public static K a(Executor executor, Handler handler) {
        return new C0420c(executor, handler);
    }

    public abstract Executor b();

    public abstract Handler c();
}
