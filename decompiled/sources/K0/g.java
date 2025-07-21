package K0;

import Ea.r;
import I0.B;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g extends b implements B {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f2955j;

        /* renamed from: k, reason: collision with root package name */
        public Object f2956k;

        /* renamed from: l, reason: collision with root package name */
        public Object f2957l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f2958m;

        /* renamed from: o, reason: collision with root package name */
        public int f2960o;

        public a(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f2958m = obj;
            this.f2960o |= IntCompanionObject.MIN_VALUE;
            return g.this.a(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Ea.h fileSystem, r path, c serializer) {
        super(fileSystem, path, serializer);
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:42|43))(6:44|45|46|47|48|(1:50)(1:51))|13|(2:29|30)|15|(3:17|(2:24|25)|(2:20|21)(1:23))(1:28)))|66|6|7|(0)(0)|13|(0)|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0090, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0091, code lost:
    
        r10 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097 A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:17:0x0097, B:28:0x00a4, B:41:0x008c, B:38:0x0087), top: B:7:0x0022, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4 A[Catch: all -> 0x0090, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:17:0x0097, B:28:0x00a4, B:41:0x008c, B:38:0x0087), top: B:7:0x0022, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // I0.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof K0.g.a
            if (r0 == 0) goto L13
            r0 = r10
            K0.g$a r0 = (K0.g.a) r0
            int r1 = r0.f2960o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2960o = r1
            goto L18
        L13:
            K0.g$a r0 = new K0.g$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f2958m
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2960o
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r9 = r0.f2957l
            java.io.Closeable r9 = (java.io.Closeable) r9
            java.lang.Object r1 = r0.f2956k
            Ea.f r1 = (Ea.f) r1
            java.lang.Object r0 = r0.f2955j
            java.io.Closeable r0 = (java.io.Closeable) r0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L36
            goto L72
        L36:
            r10 = move-exception
            goto L85
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L40:
            kotlin.ResultKt.throwOnFailure(r10)
            r8.f()
            Ea.h r10 = r8.g()
            Ea.r r2 = r8.h()
            Ea.f r10 = r10.j(r2)
            r5 = 0
            Ea.x r2 = Ea.f.q0(r10, r5, r3, r4)     // Catch: java.lang.Throwable -> La5
            Ea.c r2 = Ea.o.a(r2)     // Catch: java.lang.Throwable -> La5
            K0.c r5 = r8.i()     // Catch: java.lang.Throwable -> L81
            r0.f2955j = r10     // Catch: java.lang.Throwable -> L81
            r0.f2956k = r10     // Catch: java.lang.Throwable -> L81
            r0.f2957l = r2     // Catch: java.lang.Throwable -> L81
            r0.f2960o = r3     // Catch: java.lang.Throwable -> L81
            java.lang.Object r9 = r5.b(r9, r2, r0)     // Catch: java.lang.Throwable -> L81
            if (r9 != r1) goto L6f
            return r1
        L6f:
            r0 = r10
            r1 = r0
            r9 = r2
        L72:
            r1.flush()     // Catch: java.lang.Throwable -> L36
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L36
            if (r9 == 0) goto L7f
            r9.close()     // Catch: java.lang.Throwable -> L7d
            goto L7f
        L7d:
            r9 = move-exception
            goto L95
        L7f:
            r9 = r4
            goto L95
        L81:
            r9 = move-exception
            r0 = r10
            r10 = r9
            r9 = r2
        L85:
            if (r9 == 0) goto L93
            r9.close()     // Catch: java.lang.Throwable -> L8b
            goto L93
        L8b:
            r9 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r10, r9)     // Catch: java.lang.Throwable -> L90
            goto L93
        L90:
            r9 = move-exception
            r10 = r0
            goto La6
        L93:
            r9 = r10
            r10 = r4
        L95:
            if (r9 != 0) goto La4
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)     // Catch: java.lang.Throwable -> L90
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto Lb3
            r0.close()     // Catch: java.lang.Throwable -> La2
            goto Lb3
        La2:
            r4 = move-exception
            goto Lb3
        La4:
            throw r9     // Catch: java.lang.Throwable -> L90
        La5:
            r9 = move-exception
        La6:
            if (r10 == 0) goto Lb0
            r10.close()     // Catch: java.lang.Throwable -> Lac
            goto Lb0
        Lac:
            r10 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r9, r10)
        Lb0:
            r7 = r4
            r4 = r9
            r9 = r7
        Lb3:
            if (r4 != 0) goto Lbb
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        Lbb:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.g.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
