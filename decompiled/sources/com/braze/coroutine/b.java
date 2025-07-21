package com.braze.coroutine;

import ga.J;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12126a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Number f12128c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f12129d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Number number, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f12128c = number;
        this.f12129d = function1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        b bVar = new b(this.f12128c, this.f12129d, continuation);
        bVar.f12127b = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return create((J) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r7.invoke(r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
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
            int r1 = r6.f12126a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4f
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.f12127b
            ga.J r1 = (ga.J) r1
            kotlin.ResultKt.throwOnFailure(r7)
            goto L3b
        L22:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.f12127b
            r1 = r7
            ga.J r1 = (ga.J) r1
            java.lang.Number r7 = r6.f12128c
            long r4 = r7.longValue()
            r6.f12127b = r1
            r6.f12126a = r3
            java.lang.Object r7 = ga.U.a(r4, r6)
            if (r7 != r0) goto L3b
            goto L4e
        L3b:
            boolean r7 = ga.K.e(r1)
            if (r7 == 0) goto L4f
            kotlin.jvm.functions.Function1 r7 = r6.f12129d
            r1 = 0
            r6.f12127b = r1
            r6.f12126a = r2
            java.lang.Object r7 = r7.invoke(r6)
            if (r7 != r0) goto L4f
        L4e:
            return r0
        L4f:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.coroutine.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
