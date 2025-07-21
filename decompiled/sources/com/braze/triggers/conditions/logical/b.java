package com.braze.triggers.conditions.logical;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b implements com.braze.triggers.conditions.c {

    /* renamed from: b, reason: collision with root package name */
    public static final String f13042b = BrazeLogger.getBrazeLogTag((Class<?>) b.class);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13043a;

    public b(ArrayList arrayList) {
        this.f13043a = arrayList;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONArray getJsonKey() {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it = this.f13043a.iterator();
            while (it.hasNext()) {
                jSONArray.put(((com.braze.triggers.conditions.c) it.next()).getJsonKey());
            }
        } catch (Exception e6) {
            BrazeLogger.e(f13042b, "Caught exception creating Json.", e6);
        }
        return jSONArray;
    }
}
