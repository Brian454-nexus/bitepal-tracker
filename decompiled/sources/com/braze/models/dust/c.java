package com.braze.models.dust;

import com.braze.models.dust.c;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c f12579a = new c();

    public static final String b(JSONObject jSONObject) {
        return "Failed to parse json. Returning unknown.\n" + jSONObject;
    }

    public final e a(final JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String string = json.getString("type");
        d dVar = d.f12580a;
        if (Intrinsics.areEqual(string, "ccr")) {
            return new a();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c4.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.b(json);
            }
        }, 7, (Object) null);
        return new b();
    }
}
