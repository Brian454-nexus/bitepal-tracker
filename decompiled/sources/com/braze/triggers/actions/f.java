package com.braze.triggers.actions;

import android.content.Context;
import com.braze.managers.m;
import com.braze.requests.x;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f extends h {

    /* renamed from: g, reason: collision with root package name */
    public final m f13016g;

    /* renamed from: h, reason: collision with root package name */
    public final String f13017h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f13018i;

    /* renamed from: j, reason: collision with root package name */
    public long f13019j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(final JSONObject json, m brazeManager) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.f13018i = new ArrayList();
        this.f13019j = -1L;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: r4.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.triggers.actions.f.a(json);
            }
        }, 7, (Object) null);
        this.f13016g = brazeManager;
        JSONObject jSONObject = json.getJSONObject("data");
        this.f13017h = jSONObject.getString("trigger_id");
        JSONArray optJSONArray = jSONObject.optJSONArray("prefetch_image_urls");
        if (optJSONArray != null) {
            a(optJSONArray, com.braze.triggers.enums.b.f13059b);
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("prefetch_zip_urls");
        if (optJSONArray2 != null) {
            a(optJSONArray2, com.braze.triggers.enums.b.f13058a);
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("prefetch_file_urls");
        if (optJSONArray3 != null) {
            a(optJSONArray3, com.braze.triggers.enums.b.f13060c);
        }
    }

    public static final String b() {
        return "Could not convert TemplatedTriggeredAction to JSON";
    }

    @Override // com.braze.triggers.actions.a
    public final ArrayList a() {
        return new ArrayList(this.f13018i);
    }

    @Override // com.braze.triggers.actions.g, com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getKey() {
        try {
            JSONObject key = super.getKey();
            if (key == null) {
                return null;
            }
            key.put("type", "templated_iam");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trigger_id", this.f13017h);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            Iterator it = this.f13018i.iterator();
            while (it.hasNext()) {
                com.braze.triggers.utils.a aVar = (com.braze.triggers.utils.a) it.next();
                int ordinal = aVar.f13107a.ordinal();
                if (ordinal == 0) {
                    jSONArray2.put(aVar.f13108b);
                } else if (ordinal == 1) {
                    jSONArray.put(aVar.f13108b);
                } else {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jSONArray3.put(aVar.f13108b);
                }
            }
            jSONObject.put("prefetch_image_urls", jSONArray);
            jSONObject.put("prefetch_zip_urls", jSONArray2);
            jSONObject.put("prefetch_file_urls", jSONArray3);
            key.put("data", jSONObject);
            return key;
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: r4.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.actions.f.b();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public static final String a(JSONObject jSONObject) {
        return "Parsing templated triggered action with JSON: " + JsonUtils.getPrettyPrintedString(jSONObject);
    }

    @Override // com.braze.triggers.actions.a
    public final void a(Context context, com.braze.events.e internalEventPublisher, com.braze.triggers.events.b triggerEvent, long j6) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        this.f13019j = j6;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: r4.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.triggers.actions.f.a(com.braze.triggers.actions.f.this);
            }
        }, 7, (Object) null);
        m mVar = this.f13016g;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(this, "templatedTriggeredAction");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        mVar.a(new x(mVar.f12456f, mVar.f12455e.getBaseUrlForRequests(), this, triggerEvent, mVar.f12452b));
    }

    public static final String a(f fVar) {
        return "Posting templating request after delay of " + fVar.f13021b.f13048d + " seconds.";
    }

    public final void a(JSONArray jSONArray, com.braze.triggers.enums.b bVar) {
        Iterator it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, jSONArray.length())), new d(jSONArray)), new e(jSONArray)).iterator();
        while (it.hasNext()) {
            this.f13018i.add(new com.braze.triggers.utils.a(bVar, (String) it.next()));
        }
    }
}
