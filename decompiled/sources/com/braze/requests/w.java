package com.braze.requests;

import com.braze.managers.o0;
import com.braze.storage.e0;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class w extends b {

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f12882j;

    /* renamed from: k, reason: collision with root package name */
    public final m f12883k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(e0 serverConfigStorageProvider, String urlBase, String str, ArrayList logs) {
        super(new com.braze.requests.util.c(urlBase + "debugger/log", true), str, serverConfigStorageProvider);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(logs, "logs");
        this.f12882j = logs;
        this.f12883k = m.f12841n;
    }

    public static final String d() {
        return "Experienced JSONException while creating SDK Debugger Log request. Returning null.";
    }

    @Override // com.braze.requests.n
    public final boolean a() {
        return this.f12882j.isEmpty();
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
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f12882j.iterator();
            while (it.hasNext()) {
                com.braze.models.m mVar = (com.braze.models.m) it.next();
                mVar.getClass();
                jSONArray.put(new JSONObject().put("log", mVar.f12596a).put(com.amazon.a.a.h.a.f10907b, mVar.f12597b));
            }
            b6.put("data", new JSONArray().put(new JSONObject().put("type", "sdk_event_log").put("data", jSONArray)));
            return b6;
        } catch (JSONException e6) {
            BrazeLogger.INSTANCE.brazelog((Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, true, new Function0() { // from class: k4.S
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.w.d();
                }
            });
            return null;
        }
    }

    @Override // com.braze.requests.n
    public final m c() {
        return this.f12883k;
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final void a(com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, final com.braze.models.response.d responseError) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        super.a(internalPublisher, externalPublisher, responseError);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, new Function0() { // from class: k4.T
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.w.a(com.braze.models.response.d.this);
            }
        }, 3, (Object) null);
        ((com.braze.events.d) internalPublisher).b(new com.braze.events.internal.t(new o0()), com.braze.events.internal.t.class);
    }

    public static final String a(com.braze.models.response.d dVar) {
        return "SDK Debugger Log Request failed " + dVar.a() + ". Disabling SDK Debugger.";
    }

    @Override // com.braze.requests.b, com.braze.requests.n
    public final void a(HashMap existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        existingHeaders.put("X-Braze-Rec-Auth-Code", this.f12742c.y());
    }
}
