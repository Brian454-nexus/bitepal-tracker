package i3;

import java.util.concurrent.Executor;

/* renamed from: i3.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC1511b {
    Executor a();

    InterfaceExecutorC1510a b();

    default void c(Runnable runnable) {
        b().execute(runnable);
    }
}
