package com.braze.requests;

import com.braze.models.IBrazeLocation;
import com.braze.storage.e0;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j extends b {

    /* renamed from: j, reason: collision with root package name */
    public final com.braze.models.i f12827j;

    /* renamed from: k, reason: collision with root package name */
    public final m f12828k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e0 serverConfigStorageProvider, String urlBase, IBrazeLocation location) {
        super(new com.braze.requests.util.c(urlBase + "geofence/request", false), null, serverConfigStorageProvider);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f12827j = com.braze.models.outgoing.event.b.f12605g.a(location);
        this.f12828k = m.f12836i;
    }

    public static final String d() {
        return "Experienced JSONException while creating geofence refresh request. Returning null.";
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
        try {
            com.braze.models.i iVar = this.f12827j;
            if (iVar == null) {
                return b6;
            }
            b6.put("location_event", ((com.braze.models.outgoing.event.b) iVar).getKey());
            return b6;
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: k4.K
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.j.d();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.n
    public final m c() {
        return this.f12828k;
    }
}
