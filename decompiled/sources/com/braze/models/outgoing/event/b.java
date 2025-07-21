package com.braze.models.outgoing.event;

import com.braze.enums.e;
import com.braze.models.i;
import com.braze.models.o;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final e f12607a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f12608b;

    /* renamed from: c, reason: collision with root package name */
    public final double f12609c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12610d;

    /* renamed from: e, reason: collision with root package name */
    public final com.braze.support.delegates.a f12611e;

    /* renamed from: f, reason: collision with root package name */
    public final com.braze.support.delegates.a f12612f;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f12606h = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(b.class, "userId", "getUserId()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(b.class, "sessionId", "getSessionId()Lcom/braze/models/SessionId;", 0))};

    /* renamed from: g, reason: collision with root package name */
    public static final a f12605g = new a();

    public b(e type, JSONObject data, double d6, String uniqueIdentifier) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        this.f12607a = type;
        this.f12608b = data;
        this.f12609c = d6;
        this.f12610d = uniqueIdentifier;
        this.f12611e = new com.braze.support.delegates.a();
        this.f12612f = new com.braze.support.delegates.a();
        if (type == e.f12179L) {
            throw new IllegalArgumentException("Event type cannot be unknown.");
        }
    }

    public static final String b() {
        return "Caught exception creating Braze event json";
    }

    public final void a(o oVar) {
        this.f12612f.setValue(this, f12606h[1], oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(getClass(), obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.f12610d, ((b) obj).f12610d);
    }

    public final int hashCode() {
        return this.f12610d.hashCode();
    }

    public final String toString() {
        String jSONObject = getPropertiesJSONObject().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getPropertiesJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(com.amazon.a.a.h.a.f10906a, this.f12607a.f12206a);
            jSONObject.put("data", this.f12608b);
            jSONObject.put(com.amazon.a.a.h.a.f10907b, this.f12609c);
            com.braze.support.delegates.a aVar = this.f12611e;
            KProperty[] kPropertyArr = f12606h;
            KProperty property = kPropertyArr[0];
            aVar.getClass();
            Intrinsics.checkNotNullParameter(this, "thisRef");
            Intrinsics.checkNotNullParameter(property, "property");
            String str = (String) aVar.f12991a;
            if (str != null && str.length() != 0) {
                com.braze.support.delegates.a aVar2 = this.f12611e;
                KProperty property2 = kPropertyArr[0];
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(this, "thisRef");
                Intrinsics.checkNotNullParameter(property2, "property");
                jSONObject.put("user_id", (String) aVar2.f12991a);
            }
            com.braze.support.delegates.a aVar3 = this.f12612f;
            KProperty property3 = kPropertyArr[1];
            aVar3.getClass();
            Intrinsics.checkNotNullParameter(this, "thisRef");
            Intrinsics.checkNotNullParameter(property3, "property");
            o oVar = (o) aVar3.f12991a;
            if (oVar != null) {
                jSONObject.put("session_id", oVar.f12603b);
                return jSONObject;
            }
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: f4.G
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.models.outgoing.event.b.b();
                }
            }, 4, (Object) null);
        }
        return jSONObject;
    }

    public /* synthetic */ b(e eVar, JSONObject jSONObject, double d6, int i6) {
        this(eVar, (i6 & 2) != 0 ? new JSONObject() : jSONObject, (i6 & 4) != 0 ? DateTimeUtils.nowInSecondsPrecise() : d6, UUID.randomUUID().toString());
    }
}
