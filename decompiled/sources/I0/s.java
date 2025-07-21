package I0;

import ga.u0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public final pa.a f2755a = pa.c.b(false, 1, (Object) null);

    /* renamed from: b, reason: collision with root package name */
    public final ga.w f2756b = ga.y.b((u0) null, 1, (Object) null);

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: j, reason: collision with root package name */
        public Object f2757j;

        /* renamed from: k, reason: collision with root package name */
        public Object f2758k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f2759l;

        /* renamed from: n, reason: collision with root package name */
        public int f2761n;

        public a(Continuation continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f2759l = obj;
            this.f2761n |= IntCompanionObject.MIN_VALUE;
            return s.this.c(this);
        }
    }

    public final Object a(Continuation continuation) {
        Object await = this.f2756b.await(continuation);
        return await == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? await : Unit.INSTANCE;
    }

    public abstract Object b(Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:25:0x006a, B:27:0x0072, B:30:0x007c), top: B:24:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:25:0x006a, B:27:0x0072, B:30:0x007c), top: B:24:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof I0.s.a
            if (r0 == 0) goto L13
            r0 = r7
            I0.s$a r0 = (I0.s.a) r0
            int r1 = r0.f2761n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2761n = r1
            goto L18
        L13:
            I0.s$a r0 = new I0.s$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f2759l
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2761n
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f2758k
            pa.a r1 = (pa.a) r1
            java.lang.Object r0 = r0.f2757j
            I0.s r0 = (I0.s) r0
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L35
            goto L8b
        L35:
            r7 = move-exception
            goto L96
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3f:
            java.lang.Object r2 = r0.f2758k
            pa.a r2 = (pa.a) r2
            java.lang.Object r4 = r0.f2757j
            I0.s r4 = (I0.s) r4
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r2
            goto L6a
        L4c:
            kotlin.ResultKt.throwOnFailure(r7)
            ga.w r7 = r6.f2756b
            boolean r7 = r7.isCompleted()
            if (r7 == 0) goto L5a
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L5a:
            pa.a r7 = r6.f2755a
            r0.f2757j = r6
            r0.f2758k = r7
            r0.f2761n = r4
            java.lang.Object r2 = r7.e(r5, r0)
            if (r2 != r1) goto L69
            goto L88
        L69:
            r4 = r6
        L6a:
            ga.w r2 = r4.f2756b     // Catch: java.lang.Throwable -> L78
            boolean r2 = r2.isCompleted()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L7c
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L78
            r7.f(r5)
            return r0
        L78:
            r0 = move-exception
            r1 = r7
            r7 = r0
            goto L96
        L7c:
            r0.f2757j = r4     // Catch: java.lang.Throwable -> L78
            r0.f2758k = r7     // Catch: java.lang.Throwable -> L78
            r0.f2761n = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r4.b(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 != r1) goto L89
        L88:
            return r1
        L89:
            r1 = r7
            r0 = r4
        L8b:
            ga.w r7 = r0.f2756b     // Catch: java.lang.Throwable -> L35
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L35
            r7.T(r0)     // Catch: java.lang.Throwable -> L35
            r1.f(r5)
            return r0
        L96:
            r1.f(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.s.c(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
