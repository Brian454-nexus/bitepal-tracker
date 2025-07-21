package com.braze.requests;

import com.braze.events.internal.g0;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.models.outgoing.k;
import com.braze.storage.e0;
import com.braze.support.BrazeLogger;
import java.util.concurrent.TimeUnit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class x extends b {

    /* renamed from: j, reason: collision with root package name */
    public final com.braze.triggers.actions.f f12884j;

    /* renamed from: k, reason: collision with root package name */
    public final com.braze.triggers.events.b f12885k;

    /* renamed from: l, reason: collision with root package name */
    public final m f12886l;

    /* renamed from: m, reason: collision with root package name */
    public final String f12887m;

    /* renamed from: n, reason: collision with root package name */
    public final long f12888n;

    /* renamed from: o, reason: collision with root package name */
    public final long f12889o;

    /* renamed from: p, reason: collision with root package name */
    public final com.braze.triggers.actions.f f12890p;

    /* renamed from: q, reason: collision with root package name */
    public final k f12891q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(e0 serverConfigStorageProvider, String urlBase, com.braze.triggers.actions.f templatedTriggeredAction, com.braze.triggers.events.b triggerEvent, String str) {
        super(new com.braze.requests.util.c(urlBase + "template", false), str, serverConfigStorageProvider);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(templatedTriggeredAction, "templatedTriggeredAction");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        this.f12884j = templatedTriggeredAction;
        this.f12885k = triggerEvent;
        this.f12886l = m.f12834g;
        this.f12887m = templatedTriggeredAction.f13017h;
        int i6 = templatedTriggeredAction.f13021b.f13049e;
        this.f12888n = i6 == -1 ? TimeUnit.SECONDS.toMillis(r3.f13048d + 30) : i6;
        this.f12889o = templatedTriggeredAction.f13019j;
        this.f12890p = templatedTriggeredAction;
        this.f12891q = new k(str, null, null, null);
    }

    public static final String l() {
        return "Experienced JSONException while retrieving parameters. Returning null.";
    }

    @Override // com.braze.requests.n
    public final boolean a() {
        return false;
    }

    @Override // com.braze.requests.b, com.braze.requests.n
    public final JSONObject b() {
        JSONObject b6 = super.b();
        if (b6 == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trigger_id", this.f12887m);
            jSONObject.put("trigger_event_type", this.f12885k.a());
            com.braze.models.i iVar = ((com.braze.triggers.events.i) this.f12885k).f13071c;
            jSONObject.put("data", iVar != null ? ((com.braze.models.outgoing.event.b) iVar).getKey() : null);
            b6.put("template", jSONObject);
            String str = this.f12891q.f12637a;
            if (str != null && str.length() != 0) {
                b6.put("respond_with", this.f12891q.getKey());
            }
            return b6;
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: k4.U
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.x.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.n
    public final m c() {
        return this.f12886l;
    }

    @Override // com.braze.requests.b
    public final String toString() {
        return "TemplateRequest(templatedTriggeredAction=" + this.f12884j + ", triggerEvent=" + this.f12885k + ", triggerAnalyticsId='" + this.f12887m + "', templatePayloadExpirationTimestamp=" + this.f12889o + ", getTemplatedDataExpiration=" + (((com.braze.triggers.events.i) this.f12885k).f13070b + this.f12888n) + "triggeredAction=" + this.f12890p + ')';
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final void a(com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, com.braze.models.response.g apiResponse) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        InAppMessageBase inAppMessageBase = apiResponse.f12659g;
        if (inAppMessageBase != null) {
            inAppMessageBase.setLocalPrefetchedAssetPaths(MapsKt.toMap(this.f12884j.f13025f));
        }
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final void a(com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, com.braze.models.response.d responseError) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        super.a(internalPublisher, externalPublisher, responseError);
        if (responseError instanceof com.braze.models.response.b) {
            ((com.braze.events.d) internalPublisher).b(new g0(this.f12885k, this.f12884j), g0.class);
        }
    }
}
