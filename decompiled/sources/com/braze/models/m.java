package com.braze.models;

import com.braze.support.DateTimeUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class m implements IPutIntoJson {

    /* renamed from: a, reason: collision with root package name */
    public final String f12596a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12597b;

    public m(String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        Intrinsics.checkNotNullParameter(log, "log");
        this.f12596a = log;
        this.f12597b = nowInMilliseconds;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getJsonKey() {
        return new JSONObject().put("log", this.f12596a).put(com.amazon.a.a.h.a.f10907b, this.f12597b);
    }
}
