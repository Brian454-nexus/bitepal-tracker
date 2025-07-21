package com.braze.models.inappmessage;

import com.braze.managers.c0;
import com.braze.managers.m;
import com.braze.support.BrazeLogger;
import ga.J;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12588c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f12589d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2, c0 c0Var, Continuation continuation) {
        super(2, continuation);
        this.f12587b = str;
        this.f12588c = str2;
        this.f12589d = c0Var;
    }

    public static final String a(String str) {
        return com.braze.j.a("Logging click on in-app message with button id: ", str);
    }

    public final Continuation create(Object obj, Continuation continuation) {
        b bVar = new b(this.f12587b, this.f12588c, this.f12589d, continuation);
        bVar.f12586a = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return create((J) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        J j6 = (J) this.f12586a;
        String str = this.f12587b;
        if (str == null || StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j6, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: d4.B
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.models.inappmessage.b.a();
                }
            }, 6, (Object) null);
            com.braze.models.i o6 = com.braze.models.outgoing.event.b.f12605g.o(this.f12588c);
            if (o6 != null) {
                ((m) this.f12589d).a(o6);
            }
        } else {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f12983V;
            final String str2 = this.f12587b;
            BrazeLogger.brazelog$default(brazeLogger, (Object) j6, priority, (Throwable) null, false, new Function0() { // from class: d4.A
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.models.inappmessage.b.a(str2);
                }
            }, 6, (Object) null);
            com.braze.models.i i6 = com.braze.models.outgoing.event.b.f12605g.i(this.f12588c, this.f12587b);
            if (i6 != null) {
                ((m) this.f12589d).a(i6);
            }
        }
        return Unit.INSTANCE;
    }

    public static final String a() {
        return "Logging click on in-app message";
    }
}
