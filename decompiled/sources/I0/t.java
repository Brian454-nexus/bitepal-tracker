package I0;

import ga.J;
import ga.L;
import ga.u0;
import ia.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final J f2762a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f2763b;

    /* renamed from: c, reason: collision with root package name */
    public final ia.d f2764c;

    /* renamed from: d, reason: collision with root package name */
    public final C0467a f2765d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f2766a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f2767b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function2 f2768c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, t tVar, Function2 function2) {
            super(1);
            this.f2766a = function1;
            this.f2767b = tVar;
            this.f2768c = function2;
        }

        public final void a(Throwable th) {
            Unit unit;
            this.f2766a.invoke(th);
            this.f2767b.f2764c.d(th);
            do {
                Object d6 = ia.h.d(this.f2767b.f2764c.a());
                if (d6 != null) {
                    this.f2768c.invoke(d6, th);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            } while (unit != null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public Object f2769j;

        /* renamed from: k, reason: collision with root package name */
        public int f2770k;

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

        /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
        
            if (r1.invoke(r6, r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
        
            if (r6 != r0) goto L15;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005a -> B:6:0x005d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f2770k
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r6)
                goto L5d
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f2769j
                kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
                kotlin.ResultKt.throwOnFailure(r6)
                goto L51
            L22:
                kotlin.ResultKt.throwOnFailure(r6)
                I0.t r6 = I0.t.this
                I0.a r6 = I0.t.c(r6)
                int r6 = r6.b()
                if (r6 <= 0) goto L6c
            L31:
                I0.t r6 = I0.t.this
                ga.J r6 = I0.t.d(r6)
                ga.K.d(r6)
                I0.t r6 = I0.t.this
                kotlin.jvm.functions.Function2 r1 = I0.t.a(r6)
                I0.t r6 = I0.t.this
                ia.d r6 = I0.t.b(r6)
                r5.f2769j = r1
                r5.f2770k = r3
                java.lang.Object r6 = r6.b(r5)
                if (r6 != r0) goto L51
                goto L5c
            L51:
                r4 = 0
                r5.f2769j = r4
                r5.f2770k = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L5d
            L5c:
                return r0
            L5d:
                I0.t r6 = I0.t.this
                I0.a r6 = I0.t.c(r6)
                int r6 = r6.a()
                if (r6 != 0) goto L31
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L6c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: I0.t.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public t(J scope, Function1 onComplete, Function2 onUndeliveredElement, Function2 consumeMessage) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.f2762a = scope;
        this.f2763b = consumeMessage;
        this.f2764c = ia.g.b(IntCompanionObject.MAX_VALUE, (ia.a) null, (Function1) null, 6, (Object) null);
        this.f2765d = new C0467a(0);
        u0 u0Var = scope.getCoroutineContext().get(u0.T);
        if (u0Var != null) {
            u0Var.invokeOnCompletion(new a(onComplete, this, onUndeliveredElement));
        }
    }

    public final void e(Object obj) {
        Object h6 = this.f2764c.h(obj);
        if (h6 instanceof h.a) {
            Throwable c6 = ia.h.c(h6);
            if (c6 != null) {
                throw c6;
            }
            throw new ia.n("Channel was closed normally");
        }
        if (!ia.h.f(h6)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f2765d.c() == 0) {
            ga.i.d(this.f2762a, (CoroutineContext) null, (L) null, new b(null), 3, (Object) null);
        }
    }
}
