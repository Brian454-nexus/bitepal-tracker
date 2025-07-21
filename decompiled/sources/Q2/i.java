package Q2;

import Q2.i;
import android.app.Activity;
import ga.Y;
import ia.p;
import ia.r;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i implements f {

    /* renamed from: b, reason: collision with root package name */
    public final l f4480b;

    /* renamed from: c, reason: collision with root package name */
    public final R2.a f4481c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f4482j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f4483k;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Activity f4485m;

        /* renamed from: Q2.i$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0075a extends Lambda implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f4486a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2343a f4487b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0075a(i iVar, InterfaceC2343a interfaceC2343a) {
                super(0);
                this.f4486a = iVar;
                this.f4487b = interfaceC2343a;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m4invoke() {
                this.f4486a.f4481c.b(this.f4487b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, Continuation continuation) {
            super(2, continuation);
            this.f4485m = activity;
        }

        public static final void n(r rVar, j jVar) {
            rVar.h(jVar);
        }

        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f4485m, continuation);
            aVar.f4483k = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f4482j;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                final r rVar = (r) this.f4483k;
                InterfaceC2343a interfaceC2343a = new InterfaceC2343a() { // from class: Q2.h
                    @Override // y0.InterfaceC2343a
                    public final void accept(Object obj2) {
                        i.a.n(rVar, (j) obj2);
                    }
                };
                i.this.f4481c.a(this.f4485m, new r2.m(), interfaceC2343a);
                C0075a c0075a = new C0075a(i.this, interfaceC2343a);
                this.f4482j = 1;
                if (p.a(rVar, c0075a, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public final Object invoke(r rVar, Continuation continuation) {
            return create(rVar, continuation).invokeSuspend(Unit.INSTANCE);
        }
    }

    public i(l windowMetricsCalculator, R2.a windowBackend) {
        Intrinsics.checkNotNullParameter(windowMetricsCalculator, "windowMetricsCalculator");
        Intrinsics.checkNotNullParameter(windowBackend, "windowBackend");
        this.f4480b = windowMetricsCalculator;
        this.f4481c = windowBackend;
    }

    @Override // Q2.f
    public ja.e a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return ja.g.u(ja.g.c(new a(activity, null)), Y.c());
    }
}
