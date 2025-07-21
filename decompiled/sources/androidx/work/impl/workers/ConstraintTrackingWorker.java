package androidx.work.impl.workers;

import L.g;
import Q4.e;
import W2.k;
import X2.E;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import b3.C1089e;
import b3.InterfaceC1087c;
import d3.n;
import f3.u;
import f3.v;
import h3.C1461c;
import j3.AbstractC1649c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR8\u0010$\u001a&\u0012\f\u0012\n !*\u0004\u0018\u00010\n0\n !*\u0012\u0012\f\u0012\n !*\u0004\u0018\u00010\n0\n\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R(\u0010*\u001a\u0004\u0018\u00010\u00012\b\u0010%\u001a\u0004\u0018\u00010\u00018G@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/c;", "Lb3/c;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "LD6/g;", "Landroidx/work/c$a;", "n", "()LD6/g;", "", "l", "()V", "", "Lf3/u;", "workSpecs", "f", "(Ljava/util/List;)V", "c", "r", e.f4542u, "Landroidx/work/WorkerParameters;", "", "Ljava/lang/Object;", "lock", "", g.f3025c, "Z", "areConstraintsUnmet", "Lh3/c;", "kotlin.jvm.PlatformType", "h", "Lh3/c;", "future", "<set-?>", "i", "Landroidx/work/c;", "getDelegate", "()Landroidx/work/c;", "delegate", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class ConstraintTrackingWorker extends c implements InterfaceC1087c {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final WorkerParameters workerParameters;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final Object lock;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public volatile boolean areConstraintsUnmet;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final C1461c future;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public c delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.workerParameters = workerParameters;
        this.lock = new Object();
        this.future = C1461c.t();
    }

    public static final void s(ConstraintTrackingWorker this$0, D6.g innerFuture) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(innerFuture, "$innerFuture");
        synchronized (this$0.lock) {
            try {
                if (this$0.areConstraintsUnmet) {
                    C1461c future = this$0.future;
                    Intrinsics.checkNotNullExpressionValue(future, "future");
                    AbstractC1649c.e(future);
                } else {
                    this$0.future.r(innerFuture);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void t(ConstraintTrackingWorker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r();
    }

    @Override // b3.InterfaceC1087c
    public void c(List workSpecs) {
        String str;
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        k e6 = k.e();
        str = AbstractC1649c.f16202a;
        e6.a(str, "Constraints changed for " + workSpecs);
        synchronized (this.lock) {
            this.areConstraintsUnmet = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // b3.InterfaceC1087c
    public void f(List workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
    }

    @Override // androidx.work.c
    public void l() {
        super.l();
        c cVar = this.delegate;
        if (cVar == null || cVar.j()) {
            return;
        }
        cVar.o();
    }

    @Override // androidx.work.c
    public D6.g n() {
        b().execute(new Runnable() { // from class: j3.a
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.t(ConstraintTrackingWorker.this);
            }
        });
        C1461c future = this.future;
        Intrinsics.checkNotNullExpressionValue(future, "future");
        return future;
    }

    public final void r() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (this.future.isCancelled()) {
            return;
        }
        String i6 = g().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        k e6 = k.e();
        Intrinsics.checkNotNullExpressionValue(e6, "get()");
        if (i6 == null || i6.length() == 0) {
            str = AbstractC1649c.f16202a;
            e6.c(str, "No worker to delegate to.");
            C1461c future = this.future;
            Intrinsics.checkNotNullExpressionValue(future, "future");
            AbstractC1649c.d(future);
            return;
        }
        c b6 = i().b(a(), i6, this.workerParameters);
        this.delegate = b6;
        if (b6 == null) {
            str6 = AbstractC1649c.f16202a;
            e6.a(str6, "No worker to delegate to.");
            C1461c future2 = this.future;
            Intrinsics.checkNotNullExpressionValue(future2, "future");
            AbstractC1649c.d(future2);
            return;
        }
        E m6 = E.m(a());
        Intrinsics.checkNotNullExpressionValue(m6, "getInstance(applicationContext)");
        v J6 = m6.r().J();
        String uuid = e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
        u n6 = J6.n(uuid);
        if (n6 == null) {
            C1461c future3 = this.future;
            Intrinsics.checkNotNullExpressionValue(future3, "future");
            AbstractC1649c.d(future3);
            return;
        }
        n q6 = m6.q();
        Intrinsics.checkNotNullExpressionValue(q6, "workManagerImpl.trackers");
        C1089e c1089e = new C1089e(q6, this);
        c1089e.b(CollectionsKt.listOf(n6));
        String uuid2 = e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid2, "id.toString()");
        if (!c1089e.e(uuid2)) {
            str2 = AbstractC1649c.f16202a;
            e6.a(str2, "Constraints not met for delegate " + i6 + ". Requesting retry.");
            C1461c future4 = this.future;
            Intrinsics.checkNotNullExpressionValue(future4, "future");
            AbstractC1649c.e(future4);
            return;
        }
        str3 = AbstractC1649c.f16202a;
        e6.a(str3, "Constraints met for delegate " + i6);
        try {
            c cVar = this.delegate;
            Intrinsics.checkNotNull(cVar);
            final D6.g n7 = cVar.n();
            Intrinsics.checkNotNullExpressionValue(n7, "delegate!!.startWork()");
            n7.c(new Runnable() { // from class: j3.b
                @Override // java.lang.Runnable
                public final void run() {
                    ConstraintTrackingWorker.s(ConstraintTrackingWorker.this, n7);
                }
            }, b());
        } catch (Throwable th) {
            str4 = AbstractC1649c.f16202a;
            e6.b(str4, "Delegated worker " + i6 + " threw exception in startWork.", th);
            synchronized (this.lock) {
                try {
                    if (!this.areConstraintsUnmet) {
                        C1461c future5 = this.future;
                        Intrinsics.checkNotNullExpressionValue(future5, "future");
                        AbstractC1649c.d(future5);
                    } else {
                        str5 = AbstractC1649c.f16202a;
                        e6.a(str5, "Constraints were unmet, Retrying.");
                        C1461c future6 = this.future;
                        Intrinsics.checkNotNullExpressionValue(future6, "future");
                        AbstractC1649c.e(future6);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
