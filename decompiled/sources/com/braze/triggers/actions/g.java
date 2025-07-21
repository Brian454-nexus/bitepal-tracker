package com.braze.triggers.actions;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class g implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f13020a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.triggers.config.c f13021b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13022c;

    /* renamed from: d, reason: collision with root package name */
    public com.braze.triggers.utils.b f13023d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f13024e;

    public g(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ArrayList arrayList = new ArrayList();
        this.f13024e = arrayList;
        this.f13020a = json.getString("id");
        this.f13021b = new com.braze.triggers.config.c(json);
        JSONArray jSONArray = json.getJSONArray("trigger_condition");
        if (jSONArray.length() > 0) {
            com.braze.triggers.utils.c cVar = com.braze.triggers.utils.c.f13111a;
            Intrinsics.checkNotNull(jSONArray);
            arrayList.addAll(com.braze.triggers.utils.c.a(jSONArray));
        }
        this.f13022c = json.optBoolean("prefetch", true);
    }

    public static final String a(g gVar, com.braze.triggers.events.b bVar) {
        return "Triggered action " + gVar.f13020a + " not eligible to be triggered by " + bVar.a() + " event. Current device time outside triggered action time window.";
    }

    public final boolean b(final com.braze.triggers.events.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if ((this.f13021b.f13045a != -1 && DateTimeUtils.nowInSeconds() <= this.f13021b.f13045a) || (this.f13021b.f13046b != -1 && DateTimeUtils.nowInSeconds() >= this.f13021b.f13046b)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: r4.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.actions.g.a(com.braze.triggers.actions.g.this, event);
                }
            }, 7, (Object) null);
            return false;
        }
        Iterator it = this.f13024e.iterator();
        int i6 = 0;
        while (true) {
            if (!it.hasNext()) {
                i6 = -1;
                break;
            }
            if (((com.braze.triggers.conditions.d) it.next()).a(event)) {
                break;
            }
            i6++;
        }
        return i6 != -1;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public JSONObject getJsonKey() {
        try {
            JSONObject jsonKey = this.f13021b.getJsonKey();
            if (jsonKey == null) {
                return null;
            }
            jsonKey.put("id", this.f13020a);
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f13024e.iterator();
            while (it.hasNext()) {
                jSONArray.put(((com.braze.triggers.conditions.d) it.next()).getJsonKey());
            }
            jsonKey.put("trigger_condition", jSONArray);
            jsonKey.put("prefetch", this.f13022c);
            return jsonKey;
        } catch (JSONException unused) {
            return null;
        }
    }
}
