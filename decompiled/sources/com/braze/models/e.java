package com.braze.models;

import java.util.Objects;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f12583a;

    public e(JSONArray jSONArray) {
        this.f12583a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(Objects.nonNull(this.f12583a.opt(((Number) obj).intValue())));
    }
}
