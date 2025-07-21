package O2;

import ga.J;
import ga.K;
import ga.L;
import ga.i;
import ga.m0;
import ga.u0;
import ja.e;
import ja.f;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f3893a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final Map f3894b = new LinkedHashMap();

    /* renamed from: O2.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0064a extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f3895j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ e f3896k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2343a f3897l;

        /* renamed from: O2.a$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0065a implements f {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2343a f3898a;

            public C0065a(InterfaceC2343a interfaceC2343a) {
                this.f3898a = interfaceC2343a;
            }

            public final Object b(Object obj, Continuation continuation) {
                this.f3898a.accept(obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0064a(e eVar, InterfaceC2343a interfaceC2343a, Continuation continuation) {
            super(2, continuation);
            this.f3896k = eVar;
            this.f3897l = interfaceC2343a;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new C0064a(this.f3896k, this.f3897l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f3895j;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                e eVar = this.f3896k;
                C0065a c0065a = new C0065a(this.f3897l);
                this.f3895j = 1;
                if (eVar.a(c0065a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void a(Executor executor, InterfaceC2343a consumer, e flow) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(flow, "flow");
        ReentrantLock reentrantLock = this.f3893a;
        reentrantLock.lock();
        try {
            if (this.f3894b.get(consumer) == null) {
                this.f3894b.put(consumer, i.d(K.a(m0.a(executor)), (CoroutineContext) null, (L) null, new C0064a(flow, consumer, null), 3, (Object) null));
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(InterfaceC2343a consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        ReentrantLock reentrantLock = this.f3893a;
        reentrantLock.lock();
        try {
            u0 u0Var = (u0) this.f3894b.get(consumer);
            if (u0Var != null) {
                u0.a.b(u0Var, (CancellationException) null, 1, (Object) null);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
