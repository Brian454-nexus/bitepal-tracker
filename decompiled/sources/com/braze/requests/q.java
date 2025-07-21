package com.braze.requests;

import com.braze.storage.e0;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class q extends b {

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f12845j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f12846k;

    /* renamed from: l, reason: collision with root package name */
    public final m f12847l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(e0 serverConfigStorageProvider, String urlBase, String str, ArrayList pushDeliveryEvents) {
        super(new com.braze.requests.util.c(urlBase + "push/delivery_events", false), str, serverConfigStorageProvider);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(pushDeliveryEvents, "pushDeliveryEvents");
        this.f12845j = pushDeliveryEvents;
        this.f12846k = pushDeliveryEvents.isEmpty();
        this.f12847l = m.f12835h;
    }

    public static final String d() {
        return "Experienced JSONException while creating PushDeliverySendRequest. Returning null.";
    }

    @Override // com.braze.requests.n
    public final boolean a() {
        return this.f12846k;
    }

    @Override // com.braze.requests.b, com.braze.requests.n
    public final JSONObject b() {
        JSONObject b6 = super.b();
        if (b6 == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f12845j.iterator();
            while (it.hasNext()) {
                com.braze.models.push.a aVar = (com.braze.models.push.a) it.next();
                aVar.f12611e.setValue(aVar, com.braze.models.outgoing.event.b.f12606h[0], this.f12741b);
                jSONArray.put(aVar.getKey());
            }
            b6.put("events", jSONArray);
            String str = this.f12741b;
            if (str != null && !StringsKt.isBlank(str)) {
                b6.put("user_id", this.f12741b);
            }
            return b6;
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: k4.M
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.q.d();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.n
    public final m c() {
        return this.f12847l;
    }
}
