package v2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f19361a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f19362b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f19363c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19364d;

    public C(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f19361a = executor;
        this.f19362b = new ArrayDeque();
        this.f19364d = new Object();
    }

    public static final void d(Runnable command, C this$0) {
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            command.run();
        } finally {
            this$0.e();
        }
    }

    public final void e() {
        synchronized (this.f19364d) {
            try {
                Object poll = this.f19362b.poll();
                Runnable runnable = (Runnable) poll;
                this.f19363c = runnable;
                if (poll != null) {
                    this.f19361a.execute(runnable);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        synchronized (this.f19364d) {
            try {
                this.f19362b.offer(new Runnable() { // from class: v2.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        C.d(command, this);
                    }
                });
                if (this.f19363c == null) {
                    e();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
