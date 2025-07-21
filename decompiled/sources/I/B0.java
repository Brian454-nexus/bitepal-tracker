package I;

import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface B0 {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(Object obj);

        void onError(Throwable th);
    }

    void b(Executor executor, a aVar);

    D6.g d();

    void e(a aVar);
}
