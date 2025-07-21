package com.braze.support;

import com.braze.models.BrazeGeofence;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f12997a = new j();

    public static final ArrayList a(JSONArray geofenceJson) {
        Intrinsics.checkNotNullParameter(geofenceJson, "geofenceJson");
        ArrayList arrayList = new ArrayList();
        int length = geofenceJson.length();
        for (int i6 = 0; i6 < length; i6++) {
            final JSONObject optJSONObject = geofenceJson.optJSONObject(i6);
            if (optJSONObject == null) {
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f12997a, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.l1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.support.j.a();
                        }
                    }, 6, (Object) null);
                    Unit unit = Unit.INSTANCE;
                } catch (JSONException e6) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f12997a, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: p4.n1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.support.j.a(optJSONObject);
                        }
                    }, 4, (Object) null);
                    Unit unit2 = Unit.INSTANCE;
                } catch (Exception e7) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f12997a, BrazeLogger.Priority.f12981E, (Throwable) e7, false, new Function0() { // from class: p4.m1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.support.j.b(optJSONObject);
                        }
                    }, 4, (Object) null);
                    Unit unit3 = Unit.INSTANCE;
                }
            } else {
                arrayList.add(new BrazeGeofence(optJSONObject));
            }
        }
        return arrayList;
    }

    public static final String b(JSONObject jSONObject) {
        return "Failed to deserialize geofence Json:" + jSONObject;
    }

    public static final String a() {
        return "Received null or blank geofence Json. Not parsing.";
    }

    public static final String a(JSONObject jSONObject) {
        return "Failed to deserialize geofence Json due to JSONException: " + jSONObject;
    }
}
