package com.braze.storage;

import android.content.SharedPreferences;
import ga.J;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class o extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f12933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f12934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12935c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, JSONObject jSONObject, String str, Continuation continuation) {
        super(2, continuation);
        this.f12933a = pVar;
        this.f12934b = jSONObject;
        this.f12935c = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new o(this.f12933a, this.f12934b, this.f12935c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return create((J) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SharedPreferences.Editor edit = this.f12933a.f12945i.edit();
        JSONObject jSONObject = this.f12934b;
        if (jSONObject != null) {
            edit.putString(this.f12935c, jSONObject.toString());
        } else {
            edit.remove(this.f12935c);
        }
        edit.apply();
        return Unit.INSTANCE;
    }
}
