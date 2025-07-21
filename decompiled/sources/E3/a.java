package E3;

import G3.h;
import ga.J;
import ga.L;
import ga.i;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import y3.InterfaceC2355a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements E3.c {

    /* renamed from: b, reason: collision with root package name */
    public final h f1107b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2355a f1108c;

    /* renamed from: d, reason: collision with root package name */
    public final B3.a f1109d;

    /* renamed from: E3.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0025a extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f1110j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f1111k;

        /* renamed from: m, reason: collision with root package name */
        public int f1113m;

        public C0025a(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f1111k = obj;
            this.f1113m |= IntCompanionObject.MIN_VALUE;
            return a.this.b(this);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f1114j;

        /* renamed from: k, reason: collision with root package name */
        public Object f1115k;

        /* renamed from: l, reason: collision with root package name */
        public Object f1116l;

        /* renamed from: m, reason: collision with root package name */
        public Object f1117m;

        /* renamed from: n, reason: collision with root package name */
        public Object f1118n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f1119o;

        /* renamed from: q, reason: collision with root package name */
        public int f1121q;

        public b(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f1119o = obj;
            this.f1121q |= IntCompanionObject.MIN_VALUE;
            return a.this.a(this);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f1122j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f1124l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation continuation) {
            super(2, continuation);
            this.f1124l = str;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f1124l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1122j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            a.this.f1107b.i(this.f1124l);
            return Unit.INSTANCE;
        }
    }

    public a(h storage, InterfaceC2355a logger, B3.a amplitude) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        this.f1107b = storage;
        this.f1108c = logger;
        this.f1109d = amplitude;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        if (r15 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0099 -> B:13:0x009c). Please report as a decompilation issue!!! */
    @Override // E3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.a.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // E3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof E3.a.C0025a
            if (r0 == 0) goto L13
            r0 = r5
            E3.a$a r0 = (E3.a.C0025a) r0
            int r1 = r0.f1113m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1113m = r1
            goto L18
        L13:
            E3.a$a r0 = new E3.a$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f1111k
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1113m
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f1110j
            E3.a r0 = (E3.a) r0
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.io.FileNotFoundException -> L2d
            goto L48
        L2d:
            r5 = move-exception
            goto L75
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r5)
            G3.h r5 = r4.f1107b     // Catch: java.io.FileNotFoundException -> L73
            r0.f1110j = r4     // Catch: java.io.FileNotFoundException -> L73
            r0.f1113m = r3     // Catch: java.io.FileNotFoundException -> L73
            java.lang.Object r5 = r5.c(r0)     // Catch: java.io.FileNotFoundException -> L73
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            G3.h r5 = r0.f1107b
            java.util.List r5 = r5.a()
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L57
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L57:
            java.util.Iterator r5 = r5.iterator()
        L5b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L70
            java.lang.Object r1 = r5.next()
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.d(r1)
            goto L5b
        L70:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L73:
            r5 = move-exception
            r0 = r4
        L75:
            java.lang.String r5 = r5.getMessage()
            if (r5 == 0) goto L91
            y3.a r0 = r0.f1108c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Event storage file not found: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.e(r5)
        L91:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.a.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(String str) {
        i.d(this.f1109d.l(), this.f1109d.v(), (L) null, new c(str, null), 2, (Object) null);
    }
}
