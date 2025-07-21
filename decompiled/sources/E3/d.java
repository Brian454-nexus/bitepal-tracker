package E3;

import B3.f;
import ga.J;
import ga.L;
import ga.i;
import ga.u0;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
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
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final f f1128a;

    /* renamed from: b, reason: collision with root package name */
    public final B3.a f1129b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2355a f1130c;

    /* renamed from: d, reason: collision with root package name */
    public final B3.b f1131d;

    /* renamed from: e, reason: collision with root package name */
    public final F3.a f1132e;

    /* renamed from: f, reason: collision with root package name */
    public AtomicBoolean f1133f;

    /* renamed from: g, reason: collision with root package name */
    public String f1134g;

    /* renamed from: h, reason: collision with root package name */
    public String f1135h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f1136i;

    /* renamed from: j, reason: collision with root package name */
    public final E3.c f1137j;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f1138j;

        /* renamed from: k, reason: collision with root package name */
        public Object f1139k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f1140l;

        /* renamed from: n, reason: collision with root package name */
        public int f1142n;

        public a(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f1140l = obj;
            this.f1142n |= IntCompanionObject.MIN_VALUE;
            return d.this.f(null, this);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f1143j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f1144k;

        /* renamed from: m, reason: collision with root package name */
        public int f1146m;

        public b(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f1144k = obj;
            this.f1146m |= IntCompanionObject.MIN_VALUE;
            return d.this.m(null, this);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f1147j;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            if (r7.o(r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
        
            if (ga.U.a(r4, r6) == r0) goto L17;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f1147j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r7)
                goto L54
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L49
            L1e:
                kotlin.ResultKt.throwOnFailure(r7)
                E3.d r7 = E3.d.this
                java.util.concurrent.atomic.AtomicBoolean r7 = E3.d.b(r7)
                boolean r7 = r7.get()
                if (r7 != 0) goto L5e
                E3.d r7 = E3.d.this
                java.util.concurrent.atomic.AtomicBoolean r7 = E3.d.b(r7)
                r7.getAndSet(r3)
                E3.d r7 = E3.d.this
                B3.b r7 = E3.d.a(r7)
                long r4 = r7.h()
                r6.f1147j = r3
                java.lang.Object r7 = ga.U.a(r4, r6)
                if (r7 != r0) goto L49
                goto L53
            L49:
                E3.d r7 = E3.d.this
                r6.f1147j = r2
                java.lang.Object r7 = r7.o(r6)
                if (r7 != r0) goto L54
            L53:
                return r0
            L54:
                E3.d r7 = E3.d.this
                java.util.concurrent.atomic.AtomicBoolean r7 = E3.d.b(r7)
                r0 = 0
                r7.getAndSet(r0)
            L5e:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: E3.d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: E3.d$d, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0026d extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f1149j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f1150k;

        /* renamed from: m, reason: collision with root package name */
        public int f1152m;

        public C0026d(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f1150k = obj;
            this.f1152m |= IntCompanionObject.MIN_VALUE;
            return d.this.o(this);
        }
    }

    public d(f storage, B3.a amplitude, InterfaceC2355a logger, B3.b configuration, F3.a plugin) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        this.f1128a = storage;
        this.f1129b = amplitude;
        this.f1130c = logger;
        this.f1131d = configuration;
        this.f1132e = plugin;
        this.f1133f = new AtomicBoolean(false);
        this.f1136i = new AtomicBoolean(false);
        this.f1137j = E3.c.f1126a.a(storage, logger, amplitude);
    }

    public final Object d(Continuation continuation) {
        E3.c cVar = this.f1137j;
        Intrinsics.checkNotNull(cVar);
        Object b6 = cVar.b(continuation);
        return b6 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b6 : Unit.INSTANCE;
    }

    public final Object e(Continuation continuation) {
        E3.c cVar = this.f1137j;
        Intrinsics.checkNotNull(cVar);
        return cVar.a(continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x006e, code lost:
    
        if (o(r0) == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(C3.a r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.d.f(C3.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean g(C3.a aVar, C3.c cVar) {
        Map I02 = aVar.I0();
        return I02 != null && I02.size() == 1 && I02.containsKey(cVar.b());
    }

    public final boolean h(C3.a aVar) {
        return g(aVar, C3.c.f713f);
    }

    public final boolean i(String str, String str2) {
        if (str == null && str2 == null) {
            return false;
        }
        return str == null || str2 == null || !Intrinsics.areEqual(str, str2);
    }

    public final boolean j(C3.a aVar) {
        boolean z6;
        if (!this.f1136i.getAndSet(true)) {
            this.f1134g = aVar.N();
            this.f1135h = aVar.l();
            return true;
        }
        if (i(this.f1134g, aVar.N())) {
            this.f1134g = aVar.N();
            z6 = true;
        } else {
            z6 = false;
        }
        if (!i(this.f1135h, aVar.l())) {
            return z6;
        }
        this.f1135h = aVar.l();
        return true;
    }

    public final boolean k(C3.a aVar) {
        if (aVar.H0() == null) {
            return false;
        }
        Map H02 = aVar.H0();
        Intrinsics.checkNotNull(H02);
        return !H02.isEmpty();
    }

    public final boolean l(C3.a aVar) {
        return g(aVar, C3.c.f709b);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(C3.a r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof E3.d.b
            if (r0 == 0) goto L13
            r0 = r6
            E3.d$b r0 = (E3.d.b) r0
            int r1 = r0.f1146m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1146m = r1
            goto L18
        L13:
            E3.d$b r0 = new E3.d$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1144k
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1146m
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f1143j
            E3.d r5 = (E3.d) r5
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Exception -> L2d
            goto L50
        L2d:
            r6 = move-exception
            goto L49
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            B3.f r6 = r4.f1128a     // Catch: java.lang.Exception -> L47
            r0.f1143j = r4     // Catch: java.lang.Exception -> L47
            r0.f1146m = r3     // Catch: java.lang.Exception -> L47
            java.lang.Object r5 = r6.d(r5, r0)     // Catch: java.lang.Exception -> L47
            if (r5 != r1) goto L50
            return r1
        L47:
            r6 = move-exception
            r5 = r4
        L49:
            y3.a r5 = r5.f1130c
            java.lang.String r0 = "Error when intercepting identifies"
            G3.q.a(r6, r5, r0)
        L50:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.d.m(C3.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final u0 n() {
        return i.d(this.f1129b.l(), this.f1129b.v(), (L) null, new c(null), 2, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof E3.d.C0026d
            if (r0 == 0) goto L13
            r0 = r5
            E3.d$d r0 = (E3.d.C0026d) r0
            int r1 = r0.f1152m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1152m = r1
            goto L18
        L13:
            E3.d$d r0 = new E3.d$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f1150k
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1152m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f1149j
            E3.d r0 = (E3.d) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.f1149j = r4
            r0.f1152m = r3
            java.lang.Object r5 = r4.e(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            C3.a r5 = (C3.a) r5
            if (r5 == 0) goto L4d
            F3.a r0 = r0.f1132e
            r0.k(r5)
        L4d:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.d.o(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
