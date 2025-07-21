package com.braze.models;

import com.braze.models.n;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class n implements IPutIntoJson {

    /* renamed from: a, reason: collision with root package name */
    public final o f12598a;

    /* renamed from: b, reason: collision with root package name */
    public final double f12599b;

    /* renamed from: c, reason: collision with root package name */
    public Double f12600c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12601d;

    public n(o sessionId, double d6, Double d7, boolean z6) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f12598a = sessionId;
        this.f12599b = d6;
        ((l) this).f12600c = d7;
        this.f12601d = z6;
    }

    public static final String a(double d6, n nVar) {
        return "End time '" + d6 + "' for session is less than the start time '" + nVar.f12599b + "' for this session.";
    }

    public static final String b() {
        return "Caught exception creating Session Json.";
    }

    public final long c() {
        Double d6 = d();
        if (d6 == null) {
            return -1L;
        }
        final double doubleValue = d6.doubleValue();
        long j6 = (long) (doubleValue - this.f12599b);
        if (j6 < 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: a4.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.a(doubleValue, this);
                }
            }, 6, (Object) null);
        }
        return j6;
    }

    public Double d() {
        return this.f12600c;
    }

    public String toString() {
        return "\nSession(sessionId=" + this.f12598a + ", startTime=" + this.f12599b + ", endTime=" + d() + ", isSealed=" + this.f12601d + ", duration=" + c() + ')';
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getJsonKey() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("session_id", this.f12598a);
            jSONObject.put("start_time", this.f12599b);
            jSONObject.put("is_sealed", this.f12601d);
            if (d() != null) {
                jSONObject.put("end_time", d());
                return jSONObject;
            }
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: a4.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.b();
                }
            }, 4, (Object) null);
        }
        return jSONObject;
    }

    public n(JSONObject sessionData) {
        Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        String sessionId = sessionData.getString("session_id");
        Intrinsics.checkNotNullExpressionValue(sessionId, "getString(...)");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        UUID fromString = UUID.fromString(sessionId);
        Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
        this.f12598a = new o(fromString);
        this.f12599b = sessionData.getDouble("start_time");
        this.f12601d = sessionData.getBoolean("is_sealed");
        this.f12600c = JsonUtils.getDoubleOrNull(sessionData, "end_time");
    }
}
