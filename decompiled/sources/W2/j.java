package W2;

import ga.u0;
import h3.C1461c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j implements D6.g {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f5570a;

    /* renamed from: b, reason: collision with root package name */
    public final C1461c f5571b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(Throwable th) {
            if (th == null) {
                if (!j.this.f5571b.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                if (th instanceof CancellationException) {
                    j.this.f5571b.cancel(true);
                    return;
                }
                C1461c c1461c = j.this.f5571b;
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                c1461c.q(th);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    public j(u0 job, C1461c underlying) {
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        this.f5570a = job;
        this.f5571b = underlying;
        job.invokeOnCompletion(new a());
    }

    public final void b(Object obj) {
        this.f5571b.p(obj);
    }

    public void c(Runnable runnable, Executor executor) {
        this.f5571b.c(runnable, executor);
    }

    public boolean cancel(boolean z6) {
        return this.f5571b.cancel(z6);
    }

    public Object get() {
        return this.f5571b.get();
    }

    public boolean isCancelled() {
        return this.f5571b.isCancelled();
    }

    public boolean isDone() {
        return this.f5571b.isDone();
    }

    public Object get(long j6, TimeUnit timeUnit) {
        return this.f5571b.get(j6, timeUnit);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ j(ga.u0 r1, h3.C1461c r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            h3.c r2 = h3.C1461c.t()
            java.lang.String r3 = "create()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
        Ld:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.j.<init>(ga.u0, h3.c, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
