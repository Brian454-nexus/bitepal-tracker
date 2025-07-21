package com.braze;

import com.braze.enums.CardKey;
import com.braze.managers.u0;
import com.braze.support.BrazeLogger;
import ga.J;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f12304b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONObject f12305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Braze braze, JSONObject jSONObject, Continuation continuation) {
        super(2, continuation);
        this.f12304b = braze;
        this.f12305c = jSONObject;
    }

    public static final String a() {
        return "Content Cards are disabled. Not deserializing json. Returning null.";
    }

    public static final String b() {
        return "Cannot deserialize null content card json. Returning null.";
    }

    public final Continuation create(Object obj, Continuation continuation) {
        f fVar = new f(this.f12304b, this.f12305c, continuation);
        fVar.f12303a = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return create((J) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        J j6 = (J) this.f12303a;
        if (!((u0) this.f12304b.getUdm$android_sdk_base_release()).f12548m.D()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j6, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.i4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.f.a();
                }
            }, 6, (Object) null);
            return null;
        }
        if (this.f12305c == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j6, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.j4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.f.b();
                }
            }, 6, (Object) null);
            return null;
        }
        com.braze.storage.p pVar = ((u0) this.f12304b.getUdm$android_sdk_base_release()).f12532C;
        JSONObject cardJson = this.f12305c;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(cardJson, "cardJson");
        return com.braze.models.g.a(cardJson, CardKey.Provider.CONTENT_CARDS, pVar.f12938b, pVar, pVar.f12947k);
    }
}
