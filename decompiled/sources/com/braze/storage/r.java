package com.braze.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class r extends b {

    /* renamed from: f, reason: collision with root package name */
    public static final q f12948f = new q();

    /* renamed from: b, reason: collision with root package name */
    public final BrazeConfigurationProvider f12949b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f12950c;

    /* renamed from: d, reason: collision with root package name */
    public final SharedPreferences f12951d;

    /* renamed from: e, reason: collision with root package name */
    public com.braze.models.outgoing.h f12952e;

    public r(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12949b = new BrazeConfigurationProvider(context);
        SharedPreferences a6 = com.braze.managers.c.a(context, str, str2, new StringBuilder("com.appboy.storage.device_cache.v3"), 0);
        Intrinsics.checkNotNullExpressionValue(a6, "getSharedPreferences(...)");
        this.f12950c = a6;
        SharedPreferences a7 = com.braze.managers.c.a(context, str, str2, new StringBuilder("com.braze.storage.device_cache.metadata"), 0);
        Intrinsics.checkNotNullExpressionValue(a7, "getSharedPreferences(...)");
        this.f12951d = a7;
    }

    public static final String a(boolean z6, boolean z7) {
        return "Exporting the full device due to either: shouldShouldFullDeviceOnNextExport: " + z6 + ", shouldReportPushPermissionsAsGranted: " + z7;
    }

    public static final String d() {
        return "Caught exception confirming and unlocking device cache.";
    }

    public static final String f() {
        return "Sending full device on next export but keeping cache intact.";
    }

    public static final String h() {
        return "Caught exception confirming and unlocking JSON objects.";
    }

    public static final String i() {
        return "Failed to generate diff between the cached and live device. Returning the live device.";
    }

    public static final String j() {
        return "Remote Notification Enabled changed to true. Updating user subscription.";
    }

    public final void e() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: o4.k0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.r.f();
            }
        }, 6, (Object) null);
        this.f12951d.edit().putBoolean("sfone", true).apply();
    }

    @Override // com.braze.storage.b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final com.braze.models.outgoing.h c() {
        JSONObject jsonObject;
        String str = "{}";
        JSONObject jSONObject = new JSONObject();
        com.braze.models.outgoing.h hVar = this.f12952e;
        JSONObject key = hVar != null ? hVar.getKey() : new JSONObject();
        try {
            String string = this.f12950c.getString("cached_device", "{}");
            if (string != null) {
                str = string;
            }
            jSONObject = new JSONObject(str);
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.m0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.r.h();
                }
            }, 4, (Object) null);
        }
        q qVar = f12948f;
        SharedPreferences sharedPreferences = this.f12951d;
        int i6 = Build.VERSION.SDK_INT;
        final boolean a6 = qVar.a(jSONObject, key, sharedPreferences.getInt("ldov", i6), i6);
        final boolean z6 = this.f12951d.getBoolean("sfone", false);
        if (z6 || a6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.n0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.r.a(z6, a6);
                }
            }, 7, (Object) null);
            jsonObject = qVar.a(new JSONObject(), key);
        } else {
            jsonObject = qVar.a(jSONObject, key);
        }
        if (jsonObject == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.o0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.r.i();
                }
            }, 7, (Object) null);
            return this.f12952e;
        }
        BrazeConfigurationProvider configurationProvider = this.f12949b;
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str9 = null;
        Boolean bool3 = null;
        for (DeviceKey deviceKey : DeviceKey.values()) {
            String key2 = deviceKey.getKey();
            switch (com.braze.models.outgoing.f.f12616a[deviceKey.ordinal()]) {
                case 1:
                    str7 = JsonUtils.getOptionalString(jsonObject, key2);
                    break;
                case 2:
                    str3 = JsonUtils.getOptionalString(jsonObject, key2);
                    break;
                case 3:
                    str2 = JsonUtils.getOptionalString(jsonObject, key2);
                    break;
                case 4:
                    str8 = JsonUtils.getOptionalString(jsonObject, key2);
                    break;
                case 5:
                    str6 = JsonUtils.getOptionalString(jsonObject, key2);
                    break;
                case 6:
                    String optionalString = JsonUtils.getOptionalString(jsonObject, key2);
                    if (optionalString != null && !StringsKt.isBlank(optionalString)) {
                        str4 = optionalString;
                        break;
                    }
                    break;
                case 7:
                    str5 = JsonUtils.getOptionalString(jsonObject, key2);
                    break;
                case 8:
                    if (jsonObject.has(key2)) {
                        bool = Boolean.valueOf(jsonObject.optBoolean(key2, true));
                    }
                    Unit unit = Unit.INSTANCE;
                    break;
                case 9:
                    if (jsonObject.has(key2)) {
                        bool2 = Boolean.valueOf(jsonObject.optBoolean(key2, false));
                    }
                    Unit unit2 = Unit.INSTANCE;
                    break;
                case 10:
                    str9 = JsonUtils.getOptionalString(jsonObject, key2);
                    break;
                case 11:
                    if (jsonObject.has(key2)) {
                        bool3 = Boolean.valueOf(jsonObject.optBoolean(key2));
                    }
                    Unit unit3 = Unit.INSTANCE;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        com.braze.models.outgoing.h hVar2 = new com.braze.models.outgoing.h(configurationProvider, str2, str3, str4, str5, str6, str7, str8, bool, bool2, str9, bool3);
        if (a6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: o4.p0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.r.j();
                }
            }, 6, (Object) null);
            hVar2.f12630m = true;
        }
        return hVar2;
    }

    @Override // com.braze.storage.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void c(com.braze.models.outgoing.h outboundObject, boolean z6) {
        String str = "{}";
        Intrinsics.checkNotNullParameter(outboundObject, "outboundObject");
        if (z6) {
            try {
                String string = this.f12950c.getString("cached_device", "{}");
                if (string != null) {
                    str = string;
                }
                this.f12950c.edit().putString("cached_device", JsonUtils.mergeJsonObjects(new JSONObject(str), outboundObject.getKey()).toString()).apply();
                this.f12951d.edit().putBoolean("sfone", false).putInt("ldov", Build.VERSION.SDK_INT).apply();
            } catch (JSONException e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.l0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.storage.r.d();
                    }
                }, 4, (Object) null);
            }
        }
    }
}
