package n5;

import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f17780a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Executor f17781b = new b();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            l.v(runnable);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f17781b;
    }

    public static Executor b() {
        return f17780a;
    }
}
