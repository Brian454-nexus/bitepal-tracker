package x5;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class j {
    public static Executor a() {
        return new n(Executors.newSingleThreadExecutor());
    }
}
