package com.braze.models.cards;

import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f12574a;

    public b(JSONArray jSONArray) {
        this.f12574a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.f12574a.opt(((Number) obj).intValue()) instanceof String);
    }
}
