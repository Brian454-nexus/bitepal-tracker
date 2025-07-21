package I0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class u implements n {

    /* renamed from: a, reason: collision with root package name */
    public final String f2772a;

    /* renamed from: b, reason: collision with root package name */
    public final pa.a f2773b;

    /* renamed from: c, reason: collision with root package name */
    public final C0467a f2774c;

    /* renamed from: d, reason: collision with root package name */
    public final ja.e f2775d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f2776j;

        /* renamed from: k, reason: collision with root package name */
        public Object f2777k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f2778l;

        /* renamed from: n, reason: collision with root package name */
        public int f2780n;

        public a(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f2778l = obj;
            this.f2780n |= IntCompanionObject.MIN_VALUE;
            return u.this.c(null, this);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f2781j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f2782k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f2783l;

        /* renamed from: n, reason: collision with root package name */
        public int f2785n;

        public b(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f2783l = obj;
            this.f2785n |= IntCompanionObject.MIN_VALUE;
            return u.this.b(null, this);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f2786j;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ja.f fVar, Continuation continuation) {
            return create(fVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new c(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f2786j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    public u(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f2772a = filePath;
        this.f2773b = pa.c.b(false, 1, (Object) null);
        this.f2774c = new C0467a(0);
        this.f2775d = ja.g.s(new c(null));
    }

    @Override // I0.n
    public Object a(Continuation continuation) {
        return Boxing.boxInt(this.f2774c.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // I0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(kotlin.jvm.functions.Function2 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof I0.u.b
            if (r0 == 0) goto L13
            r0 = r8
            I0.u$b r0 = (I0.u.b) r0
            int r1 = r0.f2785n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2785n = r1
            goto L18
        L13:
            I0.u$b r0 = new I0.u$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f2783l
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2785n
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            boolean r7 = r0.f2782k
            java.lang.Object r0 = r0.f2781j
            pa.a r0 = (pa.a) r0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L30
            goto L57
        L30:
            r8 = move-exception
            goto L61
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            kotlin.ResultKt.throwOnFailure(r8)
            pa.a r8 = r6.f2773b
            boolean r2 = r8.b(r4)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)     // Catch: java.lang.Throwable -> L5d
            r0.f2781j = r8     // Catch: java.lang.Throwable -> L5d
            r0.f2782k = r2     // Catch: java.lang.Throwable -> L5d
            r0.f2785n = r3     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L5d
            if (r7 != r1) goto L54
            return r1
        L54:
            r0 = r8
            r8 = r7
            r7 = r2
        L57:
            if (r7 == 0) goto L5c
            r0.f(r4)
        L5c:
            return r8
        L5d:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L61:
            if (r7 == 0) goto L66
            r0.f(r4)
        L66:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.u.b(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        if (r9.e((java.lang.Object) null, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // I0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(kotlin.jvm.functions.Function1 r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof I0.u.a
            if (r0 == 0) goto L13
            r0 = r9
            I0.u$a r0 = (I0.u.a) r0
            int r1 = r0.f2780n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2780n = r1
            goto L18
        L13:
            I0.u$a r0 = new I0.u$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f2778l
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2780n
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.f2776j
            pa.a r8 = (pa.a) r8
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L31
            goto L6b
        L31:
            r9 = move-exception
            goto L73
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f2777k
            pa.a r8 = (pa.a) r8
            java.lang.Object r2 = r0.f2776j
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r8
            r8 = r2
            goto L5b
        L49:
            kotlin.ResultKt.throwOnFailure(r9)
            pa.a r9 = r7.f2773b
            r0.f2776j = r8
            r0.f2777k = r9
            r0.f2780n = r4
            java.lang.Object r2 = r9.e(r5, r0)
            if (r2 != r1) goto L5b
            goto L67
        L5b:
            r0.f2776j = r9     // Catch: java.lang.Throwable -> L6f
            r0.f2777k = r5     // Catch: java.lang.Throwable -> L6f
            r0.f2780n = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L6f
            if (r8 != r1) goto L68
        L67:
            return r1
        L68:
            r6 = r9
            r9 = r8
            r8 = r6
        L6b:
            r8.f(r5)
            return r9
        L6f:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L73:
            r8.f(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.u.c(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // I0.n
    public ja.e d() {
        return this.f2775d;
    }

    @Override // I0.n
    public Object e(Continuation continuation) {
        return Boxing.boxInt(this.f2774c.d());
    }
}
