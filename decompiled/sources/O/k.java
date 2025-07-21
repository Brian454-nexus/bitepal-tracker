package O;

import I.H0;
import I.P;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface k extends H0 {

    /* renamed from: E, reason: collision with root package name */
    public static final P.a f3873E = P.a.a("camerax.core.thread.backgroundExecutor", Executor.class);

    default Executor U(Executor executor) {
        return (Executor) e(f3873E, executor);
    }
}
