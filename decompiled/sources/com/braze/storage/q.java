package com.braze.storage;

import com.braze.enums.DeviceKey;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class q {
    public static final String b() {
        return "shouldReportPushPermissionsAsGranted: Returning true given that push is permissible now and notifications enabled transitioned to true.";
    }

    public static final String c() {
        return "shouldReportPushPermissionsAsGranted: Returning true since notifications enabled is true and device has upgraded to Tiramisu or beyond.";
    }

    public static final String d() {
        return "Returning false for shouldReportPushPermissionsAsGranted.";
    }

    public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject2.opt(next);
            Object opt2 = jSONObject.opt(next);
            if (opt != null) {
                try {
                    if (opt instanceof JSONObject) {
                        if (opt2 != null && JsonUtils.areJsonObjectsEqual((JSONObject) opt, (JSONObject) opt2)) {
                        }
                        jSONObject3.put(next, opt);
                    } else if (!Intrinsics.areEqual(opt, opt2)) {
                        jSONObject3.put(next, opt);
                    }
                } catch (JSONException e6) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.g0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.storage.q.a();
                        }
                    }, 4, (Object) null);
                    return null;
                }
            }
        }
        return jSONObject3;
    }

    public static final String a() {
        return "Caught json exception while creating the diff. Returning null";
    }

    public final boolean a(JSONObject cachedDeviceJson, JSONObject liveDeviceJson, int i6, int i7) {
        Intrinsics.checkNotNullParameter(cachedDeviceJson, "cachedDeviceJson");
        Intrinsics.checkNotNullParameter(liveDeviceJson, "liveDeviceJson");
        boolean z6 = i7 >= 33;
        boolean z7 = i6 < 33 && z6;
        DeviceKey deviceKey = DeviceKey.NOTIFICATIONS_ENABLED;
        boolean optBoolean = liveDeviceJson.optBoolean(deviceKey.getKey(), false);
        boolean z8 = optBoolean && !cachedDeviceJson.optBoolean(deviceKey.getKey(), false);
        if (z6 && z8) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.q.b();
                }
            }, 7, (Object) null);
            return true;
        }
        if (optBoolean && z7) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.q.c();
                }
            }, 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: o4.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.q.d();
            }
        }, 6, (Object) null);
        return false;
    }
}
