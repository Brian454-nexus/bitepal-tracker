package com.braze.communication;

import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final b f12108a;

    public e(b httpConnector) {
        Intrinsics.checkNotNullParameter(httpConnector, "httpConnector");
        this.f12108a = httpConnector;
    }

    public static final String b() {
        return "Exception while logging result: ";
    }

    public final d a(final com.braze.requests.util.c requestTarget, final HashMap requestHeaders, final JSONObject payload) {
        Intrinsics.checkNotNullParameter(requestTarget, "requestTarget");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Lazy lazy = LazyKt.lazy(new Function0() { // from class: Q3.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.communication.e.a(com.braze.requests.util.c.this, requestHeaders, payload);
            }
        });
        a(requestTarget, requestHeaders, lazy, payload);
        long currentTimeMillis = System.currentTimeMillis();
        d a6 = this.f12108a.a(requestTarget, requestHeaders, payload);
        a(lazy, requestTarget, a6.f12074b, a6.f12075c, System.currentTimeMillis() - currentTimeMillis);
        return a6;
    }

    public static final String a(com.braze.requests.util.c cVar, Map map, JSONObject jSONObject) {
        Object[] requestArgs = {cVar, map, jSONObject};
        String str = l.f12999a;
        Intrinsics.checkNotNullParameter(requestArgs, "requestArgs");
        long j6 = 1;
        for (int i6 = 0; i6 < 3; i6++) {
            j6 *= requestArgs[i6].hashCode();
        }
        String hexString = Long.toHexString(j6);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
        return hexString;
    }

    public final void a(final com.braze.requests.util.c cVar, final HashMap hashMap, final Lazy lazy, final JSONObject jSONObject) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, cVar.f12875d, new Function0() { // from class: Q3.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.communication.e.a(lazy, cVar, this, hashMap, jSONObject);
                }
            }, 3, (Object) null);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Q3.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.communication.e.a();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a(Lazy lazy, com.braze.requests.util.c cVar, e eVar, Map map, JSONObject jSONObject) {
        String str;
        StringBuilder sb = new StringBuilder("\n                |Making request with id => \"");
        sb.append((String) lazy.getValue());
        sb.append("\"\n                |to url: ");
        sb.append(cVar);
        sb.append("\n                \n                |with headers:\n                ");
        eVar.getClass();
        sb.append(a(map));
        sb.append("\n                |\n                |");
        if (jSONObject == null) {
            str = "";
        } else {
            str = "and JSON :\n" + JsonUtils.getPrettyPrintedString(jSONObject);
        }
        return StringsKt.trimMargin$default(com.braze.c.a(sb, str, "\n                "), (String) null, 1, (Object) null);
    }

    public static final String a() {
        return "Exception while logging request: ";
    }

    public final void a(final Lazy lazy, final com.braze.requests.util.c cVar, final Map map, final JSONObject jSONObject, final long j6) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Q3.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.communication.e.a(lazy, cVar, j6, this, map, jSONObject);
                }
            }, 7, (Object) null);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Q3.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.communication.e.b();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a(Lazy lazy, com.braze.requests.util.c cVar, long j6, e eVar, Map map, JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder("\n                |Made request with id => \"");
        sb.append((String) lazy.getValue());
        sb.append("\"\n                |to url: ");
        sb.append(cVar);
        sb.append("\n                |took: ");
        sb.append(j6);
        sb.append("ms\n                \n                |with response headers:\n                ");
        eVar.getClass();
        sb.append(a(map));
        sb.append("\n                |\n                |and response JSON:\n                |");
        sb.append(JsonUtils.getPrettyPrintedString(jSONObject));
        sb.append("\n                ");
        return StringsKt.trimMargin$default(sb.toString(), (String) null, 1, (Object) null);
    }

    public static String a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add("|\"" + ((String) entry.getKey()) + "\" => \"" + ((String) entry.getValue()) + '\"');
        }
        return CollectionsKt.joinToString$default(arrayList, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }
}
