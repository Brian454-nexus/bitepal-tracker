package com.braze.communication;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f12073a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f12074b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f12075c;

    public d(int i6, Map responseHeaders, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        this.f12073a = i6;
        this.f12074b = responseHeaders;
        this.f12075c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f12073a == dVar.f12073a && Intrinsics.areEqual(this.f12074b, dVar.f12074b) && Intrinsics.areEqual(this.f12075c, dVar.f12075c);
    }

    public final int hashCode() {
        int hashCode = (this.f12074b.hashCode() + (Integer.hashCode(this.f12073a) * 31)) * 31;
        JSONObject jSONObject = this.f12075c;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public final String toString() {
        return "HttpConnectorResult(responseCode=" + this.f12073a + ", responseHeaders=" + this.f12074b + ", jsonResponse=" + this.f12075c + ')';
    }

    public /* synthetic */ d(int i6, Map map, int i7) {
        this(i6, (i7 & 2) != 0 ? MapsKt.emptyMap() : map, (JSONObject) null);
    }
}
