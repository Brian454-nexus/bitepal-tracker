package com.braze.models.outgoing.event;

import com.braze.enums.d;
import com.braze.enums.e;
import com.braze.enums.h;
import com.braze.models.FeatureFlag;
import com.braze.models.IBrazeLocation;
import com.braze.models.i;
import com.braze.models.o;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {
    public static final i b(String str, BrazeProperties brazeProperties) {
        JSONObject put = new JSONObject().put("n", str);
        if (brazeProperties != null && brazeProperties.getSize() > 0) {
            put.put("p", brazeProperties.getKey());
        }
        e eVar = e.f12184e;
        Intrinsics.checkNotNull(put);
        return new b(eVar, put, 0.0d, 12);
    }

    public static final i d(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new b(e.f12194o, jSONObject, 0.0d, 12);
    }

    public static final i f(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new b(e.f12196q, jSONObject, 0.0d, 12);
    }

    public static final i h(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new b(e.f12197r, jSONObject, 0.0d, 12);
    }

    public static final i j(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new b(e.f12195p, jSONObject, 0.0d, 12);
    }

    public static final i l(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new b(e.f12192m, jSONObject, 0.0d, 12);
    }

    public static final i n(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new b(e.f12191l, jSONObject, 0.0d, 12);
    }

    public static final i p(String str) {
        return new b(e.f12204y, b.f12605g.a(str, (String) null, (String) null), 0.0d, 12);
    }

    public static final i q(String str) {
        JSONObject put = new JSONObject().put("n", str);
        e eVar = e.f12189j;
        Intrinsics.checkNotNull(put);
        return new b(eVar, put, 0.0d, 12);
    }

    public static final i r(String str, String str2) {
        JSONObject put = new JSONObject().put("key", str).put(com.amazon.a.a.o.b.f11195Y, str2);
        e eVar = e.f12200u;
        Intrinsics.checkNotNull(put);
        return new b(eVar, put, 0.0d, 12);
    }

    public static final i t(String str, String str2) {
        JSONObject put = new JSONObject().put("a", str).put("l", str2);
        e eVar = e.f12168A;
        Intrinsics.checkNotNull(put);
        return new b(eVar, put, 0.0d, 12);
    }

    public final i a(final String eventName, final BrazeProperties brazeProperties) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return a(new Function0() { // from class: f4.A
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(eventName, brazeProperties);
            }
        });
    }

    public final i c(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return a(new Function0() { // from class: f4.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.d(cardId);
            }
        });
    }

    public final i e(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return a(new Function0() { // from class: f4.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.f(cardId);
            }
        });
    }

    public final i g(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return a(new Function0() { // from class: f4.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.h(cardId);
            }
        });
    }

    public final i i(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return a(new Function0() { // from class: f4.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.j(cardId);
            }
        });
    }

    public final i k(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return a(new Function0() { // from class: f4.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.l(cardId);
            }
        });
    }

    public final i m(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return a(new Function0() { // from class: f4.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.n(cardId);
            }
        });
    }

    public final i o(final String triggerId) {
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        return a(new Function0() { // from class: f4.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.p(triggerId);
            }
        });
    }

    public final i s(final String alias, final String label) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(label, "label");
        return a(new Function0() { // from class: f4.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.t(alias, label);
            }
        });
    }

    public final i a(final String productId, final String currencyCode, final BigDecimal price, final int i6, final BrazeProperties brazeProperties) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(price, "price");
        return a(new Function0() { // from class: f4.B
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.a(BrazeProperties.this, productId, currencyCode, price, i6);
            }
        });
    }

    public final i c(final String trackingId, final String str) {
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        return a(new Function0() { // from class: f4.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.d(trackingId, str);
            }
        });
    }

    public final i e(final String serializedEvent, final String uniqueIdentifier) {
        Intrinsics.checkNotNullParameter(serializedEvent, "serializedEvent");
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        return a(new Function0() { // from class: f4.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.f(serializedEvent, uniqueIdentifier);
            }
        });
    }

    public final i i(final String triggerId, final String buttonId) {
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        Intrinsics.checkNotNullParameter(buttonId, "buttonId");
        return a(new Function0() { // from class: f4.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.j(triggerId, buttonId);
            }
        });
    }

    public final i k(final String triggerId, final String str) {
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        return a(new Function0() { // from class: f4.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.l(triggerId, str);
            }
        });
    }

    public final i m(final String triggerId, final String str) {
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        return a(new Function0() { // from class: f4.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.n(triggerId, str);
            }
        });
    }

    public final i o(final String campaignId, final String pageId) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        return a(new Function0() { // from class: f4.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.p(campaignId, pageId);
            }
        });
    }

    public static final i a(BrazeProperties brazeProperties, String str, String str2, BigDecimal bigDecimal, int i6) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pid", str);
        jSONObject.put("c", str2);
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal scale = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        jSONObject.put("p", scale.doubleValue());
        jSONObject.put("q", i6);
        if (brazeProperties != null && brazeProperties.getSize() > 0) {
            jSONObject.put("pr", brazeProperties.getKey());
        }
        return new b(e.f12185f, jSONObject, 0.0d, 12);
    }

    public static final String c() {
        return "Failed to create event";
    }

    public static final i p(String str, String str2) {
        JSONObject put = new JSONObject().put("cid", str).put("a", str2);
        e eVar = e.f12186g;
        Intrinsics.checkNotNull(put);
        return new b(eVar, put, 0.0d, 12);
    }

    public final i q(final String key, final String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return a(new Function0() { // from class: f4.E
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.r(key, value);
            }
        });
    }

    public static final i b(IBrazeLocation iBrazeLocation) {
        return new b(e.f12183d, iBrazeLocation.getKey(), 0.0d, 12);
    }

    public static final i d(String str, String str2) {
        JSONObject put = new JSONObject().put("id", str);
        if (str2 != null && str2.length() > 0) {
            put.put("bid", str2);
        }
        e eVar = e.f12177J;
        Intrinsics.checkNotNull(put);
        return new b(eVar, put, 0.0d, 12);
    }

    public static final i f(String str, String uniqueIdentifier) {
        o oVar;
        JSONObject jSONObject = new JSONObject(str);
        String value = jSONObject.getString(com.amazon.a.a.h.a.f10906a);
        d dVar = e.f12181b;
        Intrinsics.checkNotNull(value);
        dVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        Object obj = e.f12182c.get(value);
        if (obj == null) {
            obj = e.f12179L;
        }
        e eventType = (e) obj;
        JSONObject eventData = jSONObject.getJSONObject("data");
        double d6 = jSONObject.getDouble(com.amazon.a.a.h.a.f10907b);
        String optionalString = JsonUtils.getOptionalString(jSONObject, "user_id");
        String sessionId = JsonUtils.getOptionalString(jSONObject, "session_id");
        Intrinsics.checkNotNull(eventData);
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        b bVar = new b(eventType, eventData, d6, uniqueIdentifier);
        bVar.f12611e.setValue(bVar, b.f12606h[0], optionalString);
        if (sessionId != null) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            UUID fromString = UUID.fromString(sessionId);
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
            oVar = new o(fromString);
        } else {
            oVar = null;
        }
        bVar.a(oVar);
        return bVar;
    }

    public static final i j(String str, String str2) {
        return new b(e.f12205z, b.f12605g.a(str, str2, (String) null), 0.0d, 12);
    }

    public static final i l(String str, String str2) {
        return new b(e.f12203x, b.f12605g.a(str, (String) null, str2), 0.0d, 12);
    }

    public static final i n(String str, String str2) {
        return new b(e.f12202w, b.f12605g.a(str, (String) null, str2), 0.0d, 12);
    }

    public static final i b(Throwable throwable, o oVar, boolean z6) {
        String str;
        StringBuilder sb = new StringBuilder("\n                original_sdk_version: 36.0.0\n                exception_class: ");
        sb.append(throwable.getClass().getName());
        sb.append("\n                available_cpus: ");
        sb.append(Runtime.getRuntime().availableProcessors());
        sb.append("\n                ");
        if (oVar != null) {
            str = "session_id: " + oVar;
        } else {
            str = null;
        }
        sb.append(str);
        sb.append("\n                ");
        b.f12605g.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "toString(...)");
        sb.append(StringsKt.take(stringWriter2, 5000));
        sb.append("\n            ");
        JSONObject put = new JSONObject().put(Q4.e.f4542u, StringsKt.trimIndent(sb.toString()));
        if (!z6) {
            put.put("nop", true);
        }
        e eVar = e.f12190k;
        Intrinsics.checkNotNull(put);
        return new b(eVar, put, 0.0d, 12);
    }

    public final i a(final IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return a(new Function0() { // from class: f4.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(IBrazeLocation.this);
            }
        });
    }

    public final i a(final Throwable throwable, final o oVar, final boolean z6) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return a(new Function0() { // from class: f4.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(throwable, oVar, z6);
            }
        });
    }

    public final i a(final FeatureFlag ff) {
        Intrinsics.checkNotNullParameter(ff, "ff");
        return a(new Function0() { // from class: f4.F
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(FeatureFlag.this);
            }
        });
    }

    public final i a(final String trackingId) {
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        return a(new Function0() { // from class: f4.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(trackingId);
            }
        });
    }

    public final i a() {
        final String str = "feed_displayed";
        Intrinsics.checkNotNullParameter("feed_displayed", com.amazon.a.a.h.a.f10906a);
        return a(new Function0() { // from class: f4.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.q(str);
            }
        });
    }

    public final i a(final String customUserAttributeKey, final int i6) {
        Intrinsics.checkNotNullParameter(customUserAttributeKey, "customUserAttributeKey");
        return a(new Function0() { // from class: f4.C
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(customUserAttributeKey, i6);
            }
        });
    }

    public final i a(final String key, final String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return a(new Function0() { // from class: f4.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(key, value);
            }
        });
    }

    public final i a(final String key, final String[] strArr) {
        Intrinsics.checkNotNullParameter(key, "key");
        return a(new Function0() { // from class: f4.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(key, strArr);
            }
        });
    }

    public final i a(final o sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return a(new Function0() { // from class: f4.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(com.braze.models.o.this);
            }
        });
    }

    public final i a(final long j6) {
        return a(new Function0() { // from class: f4.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(j6);
            }
        });
    }

    public final i a(final String key, final double d6, final double d7) {
        Intrinsics.checkNotNullParameter(key, "key");
        return a(new Function0() { // from class: f4.D
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(key, d6, d7);
            }
        });
    }

    public final i a(final String key, final JSONObject json) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(json, "json");
        return a(new Function0() { // from class: f4.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(key, json);
            }
        });
    }

    public final i a(final String subscriptionGroupId, final h subscriptionGroupStatus) {
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        Intrinsics.checkNotNullParameter(subscriptionGroupStatus, "subscriptionGroupStatus");
        return a(new Function0() { // from class: f4.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(subscriptionGroupId, subscriptionGroupStatus);
            }
        });
    }

    public final JSONObject a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        if (str != null && str.length() != 0) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            jSONObject.put("trigger_ids", jSONArray);
        }
        if (str2 != null && str2.length() != 0) {
            jSONObject.put("bid", str2);
        }
        if (str3 != null) {
            jSONObject.put("message_extras", str3);
            return jSONObject;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: f4.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b();
            }
        }, 6, (Object) null);
        return jSONObject;
    }

    public static final i b(FeatureFlag featureFlag) {
        JSONObject put = new JSONObject().put("fid", featureFlag.getId()).put("fts", featureFlag.getTrackingString());
        e eVar = e.f12175H;
        Intrinsics.checkNotNull(put);
        return new b(eVar, put, 0.0d, 12);
    }

    public static final i b(String str) {
        JSONObject put = new JSONObject().put("ids", JsonUtils.constructJsonArray(new String[]{str}));
        e eVar = e.f12176I;
        Intrinsics.checkNotNull(put);
        return new b(eVar, put, 0.0d, 12);
    }

    public final i a(Function0 function0) {
        try {
            return (i) function0.invoke();
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: f4.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.models.outgoing.event.a.c();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public static final i b(String str, int i6) {
        JSONObject put = new JSONObject().put("key", str).put(com.amazon.a.a.o.b.f11195Y, i6);
        e eVar = e.f12198s;
        Intrinsics.checkNotNull(put);
        return new b(eVar, put, 0.0d, 12);
    }

    public static final i b(String str, String str2) {
        JSONObject put = new JSONObject().put("key", str).put(com.amazon.a.a.o.b.f11195Y, str2);
        e eVar = e.f12199t;
        Intrinsics.checkNotNull(put);
        return new b(eVar, put, 0.0d, 12);
    }

    public static final i b(String str, String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", str);
        if (strArr == null) {
            jSONObject.put(com.amazon.a.a.o.b.f11195Y, JSONObject.NULL);
        } else {
            jSONObject.put(com.amazon.a.a.o.b.f11195Y, JsonUtils.constructJsonArray(strArr));
        }
        return new b(e.f12201v, jSONObject, 0.0d, 12);
    }

    public static final i b(o oVar) {
        b bVar = new b(e.f12169B, (JSONObject) null, 0.0d, 14);
        bVar.a(oVar);
        return bVar;
    }

    public static final i b(long j6) {
        JSONObject put = new JSONObject().put("d", j6);
        e eVar = e.f12170C;
        Intrinsics.checkNotNull(put);
        return new b(eVar, put, 0.0d, 12);
    }

    public static final i b(String str, double d6, double d7) {
        JSONObject put = new JSONObject().put("key", str).put("latitude", d6).put("longitude", d7);
        e eVar = e.f12171D;
        Intrinsics.checkNotNull(put);
        return new b(eVar, put, 0.0d, 12);
    }

    public static final i b(String str, JSONObject jSONObject) {
        JSONObject put = new JSONObject().put("key", str).put(com.amazon.a.a.o.b.f11195Y, jSONObject);
        e eVar = e.f12173F;
        Intrinsics.checkNotNull(put);
        return new b(eVar, put, 0.0d, 12);
    }

    public static final i b(String str, h hVar) {
        String str2;
        JSONObject put = new JSONObject().put("group_id", str);
        int ordinal = hVar.ordinal();
        if (ordinal == 0) {
            str2 = "subscribed";
        } else if (ordinal == 1) {
            str2 = "unsubscribed";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        JSONObject put2 = put.put("status", str2);
        e eVar = e.f12174G;
        Intrinsics.checkNotNull(put2);
        return new b(eVar, put2, 0.0d, 12);
    }

    public static final String b() {
        return "Message extras are null, not adding to event";
    }
}
