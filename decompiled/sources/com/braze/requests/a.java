package com.braze.requests;

import com.braze.storage.e0;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends b {

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f12739j;

    /* renamed from: k, reason: collision with root package name */
    public final m f12740k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ArrayList ids, e0 serverConfigStorageProvider, String urlBase, String str) {
        super(new com.braze.requests.util.c(urlBase + "banners/sync", false), str, serverConfigStorageProvider);
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        this.f12739j = ids;
        this.f12740k = m.f12839l;
    }

    public static final String g() {
        return "BannersSyncRequest failed.";
    }

    public static final String l() {
        return "Experienced JSONException while creating Banners Sync request. Returning null.";
    }

    public static final String m() {
        return "BannersSyncRequest executed successfully.";
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
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f12739j.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", pair.getFirst());
                jSONArray.put(jSONObject);
            }
            String str = this.f12741b;
            if (str != null && !StringsKt.isBlank(str)) {
                b6.put("user_id", this.f12741b);
            }
            b6.put("placements", jSONArray);
            return b6;
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: k4.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.a.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.n
    public final m c() {
        return this.f12740k;
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final void a(com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, com.braze.models.response.g apiResponse) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.a.m();
            }
        }, 7, (Object) null);
        ((com.braze.events.d) internalPublisher).b(new com.braze.events.internal.c(this), com.braze.events.internal.c.class);
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final void a(com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, com.braze.models.response.d responseError) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        super.a(internalPublisher, externalPublisher, responseError);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: k4.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.a.g();
            }
        }, 6, (Object) null);
        ((com.braze.events.d) internalPublisher).b(new com.braze.events.internal.b(), com.braze.events.internal.b.class);
    }

    @Override // com.braze.requests.b, com.braze.requests.n
    public final void a(HashMap existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        existingHeaders.put("X-Braze-DataRequest", com.amazon.a.a.o.b.af);
        existingHeaders.put("X-Braze-BannersRequest", com.amazon.a.a.o.b.af);
    }
}
