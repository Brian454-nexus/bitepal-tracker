package com.braze.models.response;

import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f12679a;

    public l(JSONArray jSONArray) {
        this.f12679a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.f12679a.get(((Number) obj).intValue());
        if (obj2 != null) {
            return (String) obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
}
