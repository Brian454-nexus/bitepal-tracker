package K0;

import Ea.r;
import I0.n;
import I0.x;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements x {

    /* renamed from: a, reason: collision with root package name */
    public final Ea.h f2935a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2936b;

    /* renamed from: c, reason: collision with root package name */
    public final c f2937c;

    /* renamed from: d, reason: collision with root package name */
    public final n f2938d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f2939e;

    /* renamed from: f, reason: collision with root package name */
    public final K0.a f2940f;

    /* renamed from: g, reason: collision with root package name */
    public final pa.a f2941g;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f2942j;

        /* renamed from: k, reason: collision with root package name */
        public Object f2943k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f2944l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f2945m;

        /* renamed from: o, reason: collision with root package name */
        public int f2947o;

        public a(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f2945m = obj;
            this.f2947o |= IntCompanionObject.MIN_VALUE;
            return e.this.e(null, this);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f2948j;

        /* renamed from: k, reason: collision with root package name */
        public Object f2949k;

        /* renamed from: l, reason: collision with root package name */
        public Object f2950l;

        /* renamed from: m, reason: collision with root package name */
        public Object f2951m;

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f2952n;

        /* renamed from: p, reason: collision with root package name */
        public int f2954p;

        public b(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f2952n = obj;
            this.f2954p |= IntCompanionObject.MIN_VALUE;
            return e.this.b(null, this);
        }
    }

    public e(Ea.h fileSystem, r path, c serializer, n coordinator, Function0 onClose) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.f2935a = fileSystem;
        this.f2936b = path;
        this.f2937c = serializer;
        this.f2938d = coordinator;
        this.f2939e = onClose;
        this.f2940f = new K0.a(false);
        this.f2941g = pa.c.b(false, 1, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cf A[Catch: all -> 0x00df, IOException -> 0x00e2, TRY_ENTER, TryCatch #2 {IOException -> 0x00e2, blocks: (B:19:0x00cf, B:21:0x00d7, B:26:0x00ef, B:36:0x00fb, B:33:0x00fe), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef A[Catch: all -> 0x00df, IOException -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x00e2, blocks: (B:19:0x00cf, B:21:0x00d7, B:26:0x00ef, B:36:0x00fb, B:33:0x00fe), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.coroutines.Continuation, java.lang.Object, K0.e$b] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [Ea.r] */
    /* JADX WARN: Type inference failed for: r2v5, types: [Ea.r, java.lang.Object] */
    @Override // I0.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(kotlin.jvm.functions.Function2 r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.e.b(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // I0.x
    public n c() {
        return this.f2938d;
    }

    @Override // I0.InterfaceC0468b
    public void close() {
        this.f2940f.b(true);
        this.f2939e.invoke();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(6:34|35|36|37|38|(1:40)(1:41))|13|14|15|(2:(1:18)|19)(1:21)))|7|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[Catch: all -> 0x007e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007e, blocks: (B:21:0x007d, B:31:0x008b, B:28:0x008e, B:27:0x0086), top: B:7:0x0022, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14, types: [K0.e] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, K0.e$a] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [K0.e] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // I0.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(kotlin.jvm.functions.Function3 r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof K0.e.a
            if (r0 == 0) goto L13
            r0 = r10
            K0.e$a r0 = (K0.e.a) r0
            int r1 = r0.f2947o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2947o = r1
            goto L18
        L13:
            K0.e$a r0 = new K0.e$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f2945m
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2947o
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r9 = r0.f2944l
            java.lang.Object r1 = r0.f2943k
            I0.b r1 = (I0.InterfaceC0468b) r1
            java.lang.Object r0 = r0.f2942j
            K0.e r0 = (K0.e) r0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L34
            goto L6d
        L34:
            r10 = move-exception
            goto L86
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            kotlin.ResultKt.throwOnFailure(r10)
            r8.f()
            pa.a r10 = r8.f2941g
            boolean r10 = pa.a.a.a(r10, r4, r3, r4)
            K0.b r2 = new K0.b     // Catch: java.lang.Throwable -> L8f
            Ea.h r5 = r8.f2935a     // Catch: java.lang.Throwable -> L8f
            Ea.r r6 = r8.f2936b     // Catch: java.lang.Throwable -> L8f
            K0.c r7 = r8.f2937c     // Catch: java.lang.Throwable -> L8f
            r2.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L8f
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r10)     // Catch: java.lang.Throwable -> L80
            r0.f2942j = r8     // Catch: java.lang.Throwable -> L80
            r0.f2943k = r2     // Catch: java.lang.Throwable -> L80
            r0.f2944l = r10     // Catch: java.lang.Throwable -> L80
            r0.f2947o = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r9 = r9.invoke(r2, r5, r0)     // Catch: java.lang.Throwable -> L80
            if (r9 != r1) goto L68
            return r1
        L68:
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r8
            r1 = r2
        L6d:
            r1.close()     // Catch: java.lang.Throwable -> L72
            r1 = r4
            goto L73
        L72:
            r1 = move-exception
        L73:
            if (r1 != 0) goto L7d
            if (r9 == 0) goto L7c
            pa.a r9 = r0.f2941g
            pa.a.a.b(r9, r4, r3, r4)
        L7c:
            return r10
        L7d:
            throw r1     // Catch: java.lang.Throwable -> L7e
        L7e:
            r10 = move-exception
            goto L94
        L80:
            r9 = move-exception
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r8
            r1 = r2
        L86:
            r1.close()     // Catch: java.lang.Throwable -> L8a
            goto L8e
        L8a:
            r1 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r10, r1)     // Catch: java.lang.Throwable -> L7e
        L8e:
            throw r10     // Catch: java.lang.Throwable -> L7e
        L8f:
            r9 = move-exception
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r8
        L94:
            if (r9 == 0) goto L9b
            pa.a r9 = r0.f2941g
            pa.a.a.b(r9, r4, r3, r4)
        L9b:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.e.e(kotlin.jvm.functions.Function3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void f() {
        if (this.f2940f.a()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }
}
