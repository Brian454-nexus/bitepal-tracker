package D3;

import ga.J;
import ga.K;
import ga.L;
import ga.U;
import ga.u0;
import ia.s;
import java.io.FileNotFoundException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b {

    /* renamed from: m, reason: collision with root package name */
    public static final a f762m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final B3.a f763a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f764b;

    /* renamed from: c, reason: collision with root package name */
    public final H3.f f765c;

    /* renamed from: d, reason: collision with root package name */
    public final G3.i f766d;

    /* renamed from: e, reason: collision with root package name */
    public final B3.f f767e;

    /* renamed from: f, reason: collision with root package name */
    public final J f768f;

    /* renamed from: g, reason: collision with root package name */
    public final ia.d f769g;

    /* renamed from: h, reason: collision with root package name */
    public ia.d f770h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f771i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f772j;

    /* renamed from: k, reason: collision with root package name */
    public AtomicInteger f773k;

    /* renamed from: l, reason: collision with root package name */
    public final Lazy f774l;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: D3.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0018b extends Thread {
        public C0018b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            b.this.w();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ H3.i f776a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f777b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(H3.i iVar, b bVar) {
            super(0);
            this.f776a = iVar;
            this.f777b = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H3.i invoke() {
            H3.i iVar = this.f776a;
            if (iVar != null) {
                return iVar;
            }
            B3.f fVar = this.f777b.f767e;
            b bVar = this.f777b;
            return fVar.k(bVar, bVar.f763a.m(), this.f777b.f768f, this.f777b.f763a.v());
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f778j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f779k;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(continuation);
            dVar.f779k = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f778j;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                if (K.e((J) this.f779k) && b.this.f771i && !b.this.f772j) {
                    b.this.f772j = true;
                    long d6 = b.this.f763a.m().d();
                    this.f778j = 1;
                    if (U.a(d6, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            b.this.o();
            b.this.f772j = false;
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public Object f781j;

        /* renamed from: k, reason: collision with root package name */
        public Object f782k;

        /* renamed from: l, reason: collision with root package name */
        public Object f783l;

        /* renamed from: m, reason: collision with root package name */
        public Object f784m;

        /* renamed from: n, reason: collision with root package name */
        public Object f785n;

        /* renamed from: o, reason: collision with root package name */
        public int f786o;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: j, reason: collision with root package name */
            public int f788j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ b f789k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Continuation continuation) {
                super(2, continuation);
                this.f789k = bVar;
            }

            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f789k, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(J j6, Continuation continuation) {
                return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.f788j;
                try {
                    if (i6 == 0) {
                        ResultKt.throwOnFailure(obj);
                        B3.f fVar = this.f789k.f767e;
                        this.f788j = 1;
                        if (fVar.c(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i6 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                } catch (FileNotFoundException e6) {
                    String message = e6.getMessage();
                    if (message == null) {
                        return null;
                    }
                    this.f789k.f763a.s().e("Event storage file not found: " + message);
                    return Unit.INSTANCE;
                }
            }
        }

        /* renamed from: D3.b$e$b, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0019b extends Lambda implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f790a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0019b(b bVar) {
                super(1);
                this.f790a = bVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z6) {
                this.f790a.f770h.h(z6 ? "#!upload" : "#!maxRetryAttemptReached");
            }
        }

        public e(Continuation continuation) {
            super(2, continuation);
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x01cf, code lost:
        
            if (r0.a(r13, r17) == r2) goto L64;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00c9 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:10:0x002e, B:12:0x00ad, B:17:0x00c1, B:19:0x00c9, B:23:0x00f4, B:25:0x00fc, B:29:0x0141, B:30:0x0157, B:31:0x0166, B:33:0x016c, B:34:0x0170, B:37:0x0187, B:40:0x0190, B:42:0x01b6, B:44:0x01d6, B:72:0x01de, B:74:0x01ed, B:76:0x01f3, B:52:0x0057, B:55:0x006b, B:57:0x0081, B:59:0x0093, B:62:0x00a4), top: B:2:0x000e, inners: #2, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00fc A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:10:0x002e, B:12:0x00ad, B:17:0x00c1, B:19:0x00c9, B:23:0x00f4, B:25:0x00fc, B:29:0x0141, B:30:0x0157, B:31:0x0166, B:33:0x016c, B:34:0x0170, B:37:0x0187, B:40:0x0190, B:42:0x01b6, B:44:0x01d6, B:72:0x01de, B:74:0x01ed, B:76:0x01f3, B:52:0x0057, B:55:0x006b, B:57:0x0081, B:59:0x0093, B:62:0x00a4), top: B:2:0x000e, inners: #2, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x016c A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:10:0x002e, B:12:0x00ad, B:17:0x00c1, B:19:0x00c9, B:23:0x00f4, B:25:0x00fc, B:29:0x0141, B:30:0x0157, B:31:0x0166, B:33:0x016c, B:34:0x0170, B:37:0x0187, B:40:0x0190, B:42:0x01b6, B:44:0x01d6, B:72:0x01de, B:74:0x01ed, B:76:0x01f3, B:52:0x0057, B:55:0x006b, B:57:0x0081, B:59:0x0093, B:62:0x00a4), top: B:2:0x000e, inners: #2, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x018f  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0190 A[Catch: all -> 0x0033, Exception -> 0x0037, FileNotFoundException -> 0x003a, TryCatch #2 {Exception -> 0x0037, blocks: (B:10:0x002e, B:34:0x0170, B:37:0x0187, B:40:0x0190, B:42:0x01b6, B:44:0x01d6, B:52:0x0057), top: B:2:0x000e, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0211  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x016a -> B:11:0x01d2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x018f -> B:31:0x0166). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x01cf -> B:11:0x01d2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x01d6 -> B:31:0x0166). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01de -> B:31:0x0166). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01f1 -> B:31:0x0166). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01f3 -> B:31:0x0166). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 541
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: D3.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public Object f791j;

        /* renamed from: k, reason: collision with root package name */
        public int f792k;

        /* renamed from: l, reason: collision with root package name */
        public int f793l;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
        
            if (r6.d(r9, r8) == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
        
            if (0 == 0) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0067 -> B:8:0x0080). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x007d -> B:8:0x0080). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0082 -> B:8:0x0080). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f793l
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L25
                if (r1 != r3) goto L1d
                int r1 = r8.f792k
                java.lang.Object r5 = r8.f791j
                ia.f r5 = (ia.f) r5
                kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> L1a
                goto L80
            L1a:
                r9 = move-exception
                goto L82
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                java.lang.Object r1 = r8.f791j
                ia.f r1 = (ia.f) r1
                kotlin.ResultKt.throwOnFailure(r9)
                r5 = r1
                goto L48
            L2e:
                kotlin.ResultKt.throwOnFailure(r9)
                D3.b r9 = D3.b.this
                ia.d r9 = D3.b.l(r9)
                ia.f r9 = r9.iterator()
            L3b:
                r8.f791j = r9
                r8.f793l = r4
                java.lang.Object r1 = r9.a(r8)
                if (r1 != r0) goto L46
                goto L7f
            L46:
                r5 = r9
                r9 = r1
            L48:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto Ldd
                java.lang.Object r9 = r5.next()
                D3.h r9 = (D3.h) r9
                D3.i r1 = r9.b()
                D3.i r6 = D3.i.f809b
                if (r1 != r6) goto L60
                r1 = r4
                goto L61
            L60:
                r1 = r2
            L61:
                if (r1 != 0) goto L80
                C3.a r6 = r9.a()
                if (r6 == 0) goto L80
                D3.b r6 = D3.b.this     // Catch: java.lang.Exception -> L1a
                B3.f r6 = D3.b.j(r6)     // Catch: java.lang.Exception -> L1a
                C3.a r9 = r9.a()     // Catch: java.lang.Exception -> L1a
                r8.f791j = r5     // Catch: java.lang.Exception -> L1a
                r8.f792k = r1     // Catch: java.lang.Exception -> L1a
                r8.f793l = r3     // Catch: java.lang.Exception -> L1a
                java.lang.Object r9 = r6.d(r9, r8)     // Catch: java.lang.Exception -> L1a
                if (r9 != r0) goto L80
            L7f:
                return r0
            L80:
                r9 = r5
                goto L92
            L82:
                D3.b r6 = D3.b.this
                B3.a r6 = D3.b.a(r6)
                y3.a r6 = r6.s()
                java.lang.String r7 = "Error when writing event to pipeline"
                G3.q.a(r9, r6, r7)
                goto L80
            L92:
                D3.b r5 = D3.b.this
                B3.a r5 = D3.b.a(r5)
                B3.b r5 = r5.m()
                java.lang.Boolean r5 = r5.o()
                java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
                if (r5 == 0) goto Lab
                goto L3b
            Lab:
                D3.b r5 = D3.b.this
                java.util.concurrent.atomic.AtomicInteger r5 = D3.b.b(r5)
                int r5 = r5.incrementAndGet()
                D3.b r6 = D3.b.this
                int r6 = D3.b.c(r6)
                if (r5 >= r6) goto Lc7
                if (r1 == 0) goto Lc0
                goto Lc7
            Lc0:
                D3.b r1 = D3.b.this
                D3.b.m(r1)
                goto L3b
            Lc7:
                D3.b r1 = D3.b.this
                java.util.concurrent.atomic.AtomicInteger r1 = D3.b.b(r1)
                r1.set(r2)
                D3.b r1 = D3.b.this
                ia.d r1 = D3.b.k(r1)
                java.lang.String r5 = "#!upload"
                r1.h(r5)
                goto L3b
            Ldd:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: D3.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(B3.a amplitude, AtomicInteger eventCount, H3.f httpClient, G3.i retryUploadHandler, B3.f storage, J scope, ia.d writeChannel, ia.d uploadChannel, H3.i iVar) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        Intrinsics.checkNotNullParameter(eventCount, "eventCount");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(retryUploadHandler, "retryUploadHandler");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(writeChannel, "writeChannel");
        Intrinsics.checkNotNullParameter(uploadChannel, "uploadChannel");
        this.f763a = amplitude;
        this.f764b = eventCount;
        this.f765c = httpClient;
        this.f766d = retryUploadHandler;
        this.f767e = storage;
        this.f768f = scope;
        this.f769g = writeChannel;
        this.f770h = uploadChannel;
        this.f773k = new AtomicInteger(1);
        this.f774l = LazyKt.lazy(new c(iVar, this));
        this.f771i = false;
        this.f772j = false;
        t();
    }

    public final void o() {
        this.f769g.h(new h(i.f809b, null));
    }

    public final int p() {
        Integer valueOf = Integer.valueOf(this.f763a.m().f() / this.f773k.get());
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 1;
    }

    public final AtomicInteger q() {
        return this.f773k;
    }

    public final H3.i r() {
        return (H3.i) this.f774l.getValue();
    }

    public final void s(C3.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        event.T(event.e() + 1);
        this.f769g.h(new h(i.f808a, event));
    }

    public final void t() {
        try {
            Runtime.getRuntime().addShutdownHook(new C0018b());
        } catch (IllegalStateException unused) {
        }
    }

    public final u0 u() {
        return ga.i.d(this.f768f, this.f763a.v(), (L) null, new d(null), 2, (Object) null);
    }

    public final void v() {
        this.f771i = true;
        y();
        x();
    }

    public final void w() {
        s.a.a(this.f770h, (CancellationException) null, 1, (Object) null);
        s.a.a(this.f769g, (CancellationException) null, 1, (Object) null);
        this.f771i = false;
    }

    public final u0 x() {
        return ga.i.d(this.f768f, this.f763a.t(), (L) null, new e(null), 2, (Object) null);
    }

    public final u0 y() {
        return ga.i.d(this.f768f, this.f763a.v(), (L) null, new f(null), 2, (Object) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ b(B3.a r12, java.util.concurrent.atomic.AtomicInteger r13, H3.f r14, G3.i r15, B3.f r16, ga.J r17, ia.d r18, ia.d r19, H3.i r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r11 = this;
            r0 = r21
            r1 = r0 & 2
            if (r1 == 0) goto Ld
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r2 = 0
            r1.<init>(r2)
            goto Le
        Ld:
            r1 = r13
        Le:
            r2 = r0 & 4
            if (r2 == 0) goto L26
            B3.b r2 = r12.m()
            H3.f r2 = r2.g()
            if (r2 != 0) goto L27
            H3.e r2 = new H3.e
            B3.b r3 = r12.m()
            r2.<init>(r3)
            goto L27
        L26:
            r2 = r14
        L27:
            r3 = r0 & 8
            if (r3 == 0) goto L3e
            G3.i r4 = new G3.i
            B3.b r3 = r12.m()
            int r5 = r3.e()
            r9 = 6
            r10 = 0
            r6 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r9, r10)
            goto L3f
        L3e:
            r4 = r15
        L3f:
            r3 = r0 & 16
            if (r3 == 0) goto L48
            B3.f r3 = r12.u()
            goto L4a
        L48:
            r3 = r16
        L4a:
            r5 = r0 & 32
            if (r5 == 0) goto L53
            ga.J r5 = r12.l()
            goto L55
        L53:
            r5 = r17
        L55:
            r6 = r0 & 64
            r7 = 6
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 0
            if (r6 == 0) goto L63
            ia.d r6 = ia.g.b(r8, r9, r9, r7, r9)
            goto L65
        L63:
            r6 = r18
        L65:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L6e
            ia.d r7 = ia.g.b(r8, r9, r9, r7, r9)
            goto L70
        L6e:
            r7 = r19
        L70:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L86
            r22 = r9
        L76:
            r13 = r11
            r14 = r12
            r15 = r1
            r16 = r2
            r18 = r3
            r17 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            goto L89
        L86:
            r22 = r20
            goto L76
        L89:
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.b.<init>(B3.a, java.util.concurrent.atomic.AtomicInteger, H3.f, G3.i, B3.f, ga.J, ia.d, ia.d, H3.i, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
