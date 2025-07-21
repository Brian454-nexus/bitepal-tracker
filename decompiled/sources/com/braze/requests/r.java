package com.braze.requests;

import com.braze.storage.e0;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class r extends b {

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f12848j;

    /* renamed from: k, reason: collision with root package name */
    public final long f12849k;

    /* renamed from: l, reason: collision with root package name */
    public final List f12850l;

    /* renamed from: m, reason: collision with root package name */
    public final m f12851m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(e0 serverConfigStorageProvider, String urlBase, String str, ArrayList campaignIds, long j6, List dedupeIds) {
        super(new com.braze.requests.util.c(urlBase + "push/redeliver", false), str, serverConfigStorageProvider);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(campaignIds, "campaignIds");
        Intrinsics.checkNotNullParameter(dedupeIds, "dedupeIds");
        this.f12848j = campaignIds;
        this.f12849k = j6;
        this.f12850l = dedupeIds;
        this.f12851m = m.f12838k;
    }

    public static final String l() {
        return "Experienced JSONException while creating PushMaxSendRequest. Returning null.";
    }

    public static final String m() {
        return "PushMaxSendRequest executed successfully.";
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
            String str = this.f12741b;
            if (str != null && !StringsKt.isBlank(str)) {
                b6.put("user_id", this.f12741b);
            }
            b6.put("campaign_ids", new JSONArray((Collection) this.f12848j));
            b6.put("last_sync_at", this.f12849k);
            if (!this.f12850l.isEmpty()) {
                b6.put("dedupe_ids", new JSONArray((Collection) this.f12850l));
            }
            return b6;
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: k4.N
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.r.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.n
    public final m c() {
        return this.f12851m;
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final void a(com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, com.braze.models.response.g apiResponse) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.O
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.r.m();
            }
        }, 7, (Object) null);
        long j6 = apiResponse.f12666n;
        if (j6 != -1) {
            ((com.braze.events.d) internalPublisher).b(new com.braze.events.internal.p(j6), com.braze.events.internal.p.class);
        }
    }
}
