package androidx.work;

import L.g;
import Q4.e;
import W2.j;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.c;
import ga.G;
import ga.J;
import ga.K;
import ga.L;
import ga.Y;
import ga.i;
import ga.u0;
import ga.y0;
import ga.z;
import h3.C1461c;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010&\u001a\u00020 8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010\u0013\u001a\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/c;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "LD6/g;", "Landroidx/work/c$a;", "n", "()LD6/g;", "r", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LW2/f;", "t", "d", "", "l", "()V", "Lga/z;", e.f4542u, "Lga/z;", "getJob$work_runtime_ktx_release", "()Lga/z;", "job", "Lh3/c;", "f", "Lh3/c;", "v", "()Lh3/c;", "future", "Lga/G;", g.f3025c, "Lga/G;", "s", "()Lga/G;", "getCoroutineContext$annotations", "coroutineContext", "work-runtime-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class CoroutineWorker extends c {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final z job;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final C1461c future;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final G coroutineContext;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public Object f10205j;

        /* renamed from: k, reason: collision with root package name */
        public int f10206k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f10207l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ CoroutineWorker f10208m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, CoroutineWorker coroutineWorker, Continuation continuation) {
            super(2, continuation);
            this.f10207l = jVar;
            this.f10208m = coroutineWorker;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f10207l, this.f10208m, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            j jVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f10206k;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                j jVar2 = this.f10207l;
                CoroutineWorker coroutineWorker = this.f10208m;
                this.f10205j = jVar2;
                this.f10206k = 1;
                Object t6 = coroutineWorker.t(this);
                if (t6 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                jVar = jVar2;
                obj = t6;
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar = (j) this.f10205j;
                ResultKt.throwOnFailure(obj);
            }
            jVar.b(obj);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f10209j;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f10209j;
            try {
                if (i6 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.f10209j = 1;
                    obj = coroutineWorker.r(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CoroutineWorker.this.getFuture().p((c.a) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.getFuture().q(th);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.job = y0.b((u0) null, 1, (Object) null);
        C1461c t6 = C1461c.t();
        Intrinsics.checkNotNullExpressionValue(t6, "create()");
        this.future = t6;
        t6.c(new Runnable() { // from class: W2.c
            @Override // java.lang.Runnable
            public final void run() {
                CoroutineWorker.q(CoroutineWorker.this);
            }
        }, h().b());
        this.coroutineContext = Y.a();
    }

    public static final void q(CoroutineWorker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.future.isCancelled()) {
            u0.a.b(this$0.job, (CancellationException) null, 1, (Object) null);
        }
    }

    public static /* synthetic */ Object u(CoroutineWorker coroutineWorker, Continuation continuation) {
        throw new IllegalStateException("Not implemented");
    }

    @Override // androidx.work.c
    public final D6.g d() {
        z b6 = y0.b((u0) null, 1, (Object) null);
        J a6 = K.a(getCoroutineContext().plus(b6));
        j jVar = new j(b6, null, 2, null);
        i.d(a6, (CoroutineContext) null, (L) null, new a(jVar, this, null), 3, (Object) null);
        return jVar;
    }

    @Override // androidx.work.c
    public final void l() {
        super.l();
        this.future.cancel(false);
    }

    @Override // androidx.work.c
    public final D6.g n() {
        i.d(K.a(getCoroutineContext().plus(this.job)), (CoroutineContext) null, (L) null, new b(null), 3, (Object) null);
        return this.future;
    }

    public abstract Object r(Continuation continuation);

    /* renamed from: s, reason: from getter */
    public G getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object t(Continuation continuation) {
        return u(this, continuation);
    }

    /* renamed from: v, reason: from getter */
    public final C1461c getFuture() {
        return this.future;
    }
}
