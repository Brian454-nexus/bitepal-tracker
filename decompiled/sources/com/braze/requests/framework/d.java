package com.braze.requests.framework;

import ga.J;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12783a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12784b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f12785c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, Continuation continuation) {
        super(2, continuation);
        this.f12785c = gVar;
    }

    public static final String a() {
        return "A maximum of 5 invalid api key errors reached. Device data will remain unaffected, but future requests will not be made.";
    }

    public static final String b() {
        return "Caught exception during request sweep";
    }

    public static final String c() {
        return "Request sweeper job has finished.";
    }

    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(this.f12785c, continuation);
        dVar.f12784b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        d dVar = new d(this.f12785c, (Continuation) obj2);
        dVar.f12784b = (J) obj;
        return dVar.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b4, code lost:
    
        if (ga.U.a(50, r13) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        if (ga.U.a(r4, r13) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b4 -> B:7:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r13.f12783a
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 == r3) goto L1f
            if (r0 != r2) goto L17
            java.lang.Object r0 = r13.f12784b
            ga.J r0 = (ga.J) r0
            kotlin.ResultKt.throwOnFailure(r14)
        L15:
            r14 = r0
            goto L31
        L17:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1f:
            java.lang.Object r0 = r13.f12784b
            ga.J r0 = (ga.J) r0
            kotlin.ResultKt.throwOnFailure(r14)
            r14 = r0
            goto L7d
        L28:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Object r14 = r13.f12784b
            r0 = r14
            ga.J r0 = (ga.J) r0
            goto L15
        L31:
            boolean r0 = ga.K.e(r14)
            if (r0 == 0) goto Lb7
            com.braze.requests.framework.g r0 = r13.f12785c
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f12802k
            int r0 = r0.get()
            r4 = 5
            if (r0 < r4) goto L56
            com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.INSTANCE
            java.lang.String r6 = com.braze.requests.framework.g.f12789n
            com.braze.support.BrazeLogger$Priority r7 = com.braze.support.BrazeLogger.Priority.f12982I
            l4.j r10 = new l4.j
            r10.<init>()
            r11 = 12
            r12 = 0
            r8 = 0
            r9 = 0
            com.braze.support.BrazeLogger.brazelog$default(r5, r6, r7, r8, r9, r10, r11, r12)
            goto Lb7
        L56:
            com.braze.requests.framework.g r0 = r13.f12785c     // Catch: java.lang.Exception -> L5c
            com.braze.requests.framework.g.a(r0)     // Catch: java.lang.Exception -> L5c
            goto L7d
        L5c:
            r0 = move-exception
            r7 = r0
            com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.INSTANCE
            java.lang.String r5 = com.braze.requests.framework.g.f12789n
            com.braze.support.BrazeLogger$Priority r6 = com.braze.support.BrazeLogger.Priority.f12981E
            l4.k r9 = new l4.k
            r9.<init>()
            r10 = 8
            r11 = 0
            r8 = 0
            com.braze.support.BrazeLogger.brazelog$default(r4, r5, r6, r7, r8, r9, r10, r11)
            long r4 = com.braze.requests.framework.g.f12791p
            r13.f12784b = r14
            r13.f12783a = r3
            java.lang.Object r0 = ga.U.a(r4, r13)
            if (r0 != r1) goto L7d
            goto Lb6
        L7d:
            com.braze.requests.framework.g r0 = r13.f12785c
            java.util.LinkedHashMap r0 = r0.f12796e
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L88
            goto Lb7
        L88:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L90:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lb7
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            com.braze.requests.framework.b r4 = (com.braze.requests.framework.b) r4
            java.util.ArrayList r4 = r4.f12778e
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L90
            r13.f12784b = r14
            r13.f12783a = r2
            r4 = 50
            java.lang.Object r0 = ga.U.a(r4, r13)
            if (r0 != r1) goto L31
        Lb6:
            return r1
        Lb7:
            com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.INSTANCE
            java.lang.String r5 = com.braze.requests.framework.g.f12789n
            com.braze.support.BrazeLogger$Priority r6 = com.braze.support.BrazeLogger.Priority.f12983V
            l4.l r9 = new l4.l
            r9.<init>()
            r10 = 12
            r11 = 0
            r7 = 0
            r8 = 0
            com.braze.support.BrazeLogger.brazelog$default(r4, r5, r6, r7, r8, r9, r10, r11)
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.requests.framework.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
