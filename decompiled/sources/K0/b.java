package K0;

import I0.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b implements r {

    /* renamed from: a, reason: collision with root package name */
    public final Ea.h f2915a;

    /* renamed from: b, reason: collision with root package name */
    public final Ea.r f2916b;

    /* renamed from: c, reason: collision with root package name */
    public final c f2917c;

    /* renamed from: d, reason: collision with root package name */
    public final K0.a f2918d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f2919j;

        /* renamed from: k, reason: collision with root package name */
        public Object f2920k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f2921l;

        /* renamed from: n, reason: collision with root package name */
        public int f2923n;

        public a(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f2921l = obj;
            this.f2923n |= IntCompanionObject.MIN_VALUE;
            return b.j(b.this, this);
        }
    }

    public b(Ea.h fileSystem, Ea.r path, c serializer) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f2915a = fileSystem;
        this.f2916b = path;
        this.f2917c = serializer;
        this.f2918d = new K0.a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[Catch: FileNotFoundException -> 0x0086, TRY_ENTER, TryCatch #4 {FileNotFoundException -> 0x0086, blocks: (B:15:0x0082, B:18:0x008a, B:44:0x0042), top: B:43:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a A[Catch: FileNotFoundException -> 0x0086, TRY_LEAVE, TryCatch #4 {FileNotFoundException -> 0x0086, blocks: (B:15:0x0082, B:18:0x008a, B:44:0x0042), top: B:43:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object j(K0.b r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof K0.b.a
            if (r0 == 0) goto L13
            r0 = r7
            K0.b$a r0 = (K0.b.a) r0
            int r1 = r0.f2923n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2923n = r1
            goto L18
        L13:
            K0.b$a r0 = new K0.b$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f2921l
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2923n
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f2920k
            java.io.Closeable r6 = (java.io.Closeable) r6
            java.lang.Object r0 = r0.f2919j
            K0.b r0 = (K0.b) r0
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L32
            goto L61
        L32:
            r7 = move-exception
            goto L6f
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            kotlin.ResultKt.throwOnFailure(r7)
            r6.f()
            Ea.h r7 = r6.f2915a     // Catch: java.io.FileNotFoundException -> L86
            Ea.r r2 = r6.f2916b     // Catch: java.io.FileNotFoundException -> L86
            Ea.y r7 = r7.l(r2)     // Catch: java.io.FileNotFoundException -> L86
            Ea.d r7 = Ea.o.b(r7)     // Catch: java.io.FileNotFoundException -> L86
            K0.c r2 = r6.f2917c     // Catch: java.lang.Throwable -> L6a
            r0.f2919j = r6     // Catch: java.lang.Throwable -> L6a
            r0.f2920k = r7     // Catch: java.lang.Throwable -> L6a
            r0.f2923n = r3     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = r2.c(r7, r0)     // Catch: java.lang.Throwable -> L6a
            if (r0 != r1) goto L5d
            return r1
        L5d:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L61:
            if (r6 == 0) goto L68
            r6.close()     // Catch: java.lang.Throwable -> L67
            goto L68
        L67:
            r4 = move-exception
        L68:
            r6 = r0
            goto L80
        L6a:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L6f:
            if (r6 == 0) goto L7c
            r6.close()     // Catch: java.lang.Throwable -> L75
            goto L7c
        L75:
            r6 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r7, r6)     // Catch: java.io.FileNotFoundException -> L7a
            goto L7c
        L7a:
            r6 = move-exception
            goto L8b
        L7c:
            r6 = r4
            r4 = r7
            r7 = r6
            goto L68
        L80:
            if (r4 != 0) goto L8a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)     // Catch: java.io.FileNotFoundException -> L86
            goto L9b
        L86:
            r7 = move-exception
            r0 = r6
            r6 = r7
            goto L8b
        L8a:
            throw r4     // Catch: java.io.FileNotFoundException -> L86
        L8b:
            Ea.h r7 = r0.f2915a
            Ea.r r1 = r0.f2916b
            boolean r7 = r7.g(r1)
            if (r7 != 0) goto L9c
            K0.c r6 = r0.f2917c
            java.lang.Object r7 = r6.a()
        L9b:
            return r7
        L9c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.b.j(K0.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // I0.InterfaceC0468b
    public void close() {
        this.f2918d.b(true);
    }

    @Override // I0.r
    public Object d(Continuation continuation) {
        return j(this, continuation);
    }

    public final void f() {
        if (this.f2918d.a()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    public final Ea.h g() {
        return this.f2915a;
    }

    public final Ea.r h() {
        return this.f2916b;
    }

    public final c i() {
        return this.f2917c;
    }
}
