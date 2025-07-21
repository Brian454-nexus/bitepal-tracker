package com.braze.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.managers.l0;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h0 extends b {

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.managers.g0 f12918b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f12919c;

    /* renamed from: d, reason: collision with root package name */
    public final SharedPreferences f12920d;

    /* renamed from: e, reason: collision with root package name */
    public final SharedPreferences f12921e;

    /* renamed from: f, reason: collision with root package name */
    public String f12922f;

    public h0(Context context, com.braze.managers.g0 pushRegistrationDataProvider, a0 sdkEnablementProvider, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pushRegistrationDataProvider, "pushRegistrationDataProvider");
        Intrinsics.checkNotNullParameter(sdkEnablementProvider, "sdkEnablementProvider");
        this.f12918b = pushRegistrationDataProvider;
        this.f12919c = sdkEnablementProvider;
        this.f12922f = str;
        String cacheFileSuffix = StringUtils.getCacheFileSuffix(context, str, str2);
        this.f12920d = context.getSharedPreferences("com.appboy.storage.user_cache.v3" + cacheFileSuffix, 0);
        this.f12921e = context.getSharedPreferences("com.braze.storage.user_cache.push_token_store" + cacheFileSuffix, 0);
    }

    public static final String a(String str) {
        return com.braze.j.a("Failed to load user object json from prefs with json string: ", str);
    }

    public static final String d() {
        return "Could not create custom attributes json object from preferences";
    }

    public static final String e() {
        return "No push token available to add to attributes object.";
    }

    public static final String f() {
        return "Couldn't add push token to outbound json";
    }

    public static final String i() {
        return "Failed to add merged custom attributes back to user object.";
    }

    public static final String k() {
        return "Push token cache cleared via sendPushTokenOnNextExport.";
    }

    public static final String m() {
        return "SDK is disabled. Not writing to user cache.";
    }

    public final void b(final JSONObject jSONObject) {
        final String str = "ab_install_attribution";
        Intrinsics.checkNotNullParameter("ab_install_attribution", "key");
        JSONObject h6 = h();
        try {
            if (jSONObject == null) {
                h6.put("ab_install_attribution", JSONObject.NULL);
            } else {
                JSONObject optJSONObject = h6.optJSONObject("ab_install_attribution");
                if (optJSONObject != null) {
                    h6.put("ab_install_attribution", JsonUtils.plus(optJSONObject, jSONObject));
                } else {
                    h6.put("ab_install_attribution", jSONObject);
                }
            }
            c(h6);
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.C
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.h0.a(str, jSONObject);
                }
            }, 4, (Object) null);
        }
    }

    public final JSONObject g() {
        JSONObject h6 = h();
        if (h6.has("custom")) {
            try {
                JSONObject jSONObject = h6.getJSONObject("custom");
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                return jSONObject;
            } catch (JSONException e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.G
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.storage.h0.d();
                    }
                }, 4, (Object) null);
            }
        }
        return new JSONObject();
    }

    public final JSONObject h() {
        final String string = this.f12920d.getString("user_cache_attributes_object", null);
        if (string == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.E
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.h0.a(string);
                }
            }, 4, (Object) null);
            return new JSONObject();
        }
    }

    public final synchronized void j() {
        try {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: o4.B
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.storage.h0.k();
                    }
                }, 6, (Object) null);
                this.f12921e.edit().clear().apply();
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // com.braze.storage.b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final com.braze.models.outgoing.l c() {
        StringUtils.ifNonEmpty(this.f12922f, new Function1() { // from class: o4.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.braze.storage.h0.a(com.braze.storage.h0.this, (String) obj);
            }
        });
        JSONObject h6 = h();
        a(h6);
        this.f12920d.edit().clear().apply();
        return new com.braze.models.outgoing.l(h6);
    }

    public static final String d(String str, Object obj) {
        return "Failed to write to user object json from prefs with key: [" + str + "] value: [" + obj + ']';
    }

    @Override // com.braze.storage.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void c(com.braze.models.outgoing.l outboundObject, boolean z6) {
        h0 h0Var;
        Intrinsics.checkNotNullParameter(outboundObject, "outboundObject");
        JSONObject jSONObject = outboundObject.f12641a;
        if (z6) {
            if (jSONObject.has("push_token")) {
                this.f12921e.edit().putString("push_token", jSONObject.optString("push_token")).apply();
                return;
            }
            return;
        }
        JSONObject h6 = h();
        JSONObject plus = JsonUtils.plus(jSONObject, h6);
        plus.remove("push_token");
        JSONObject optJSONObject = h6.optJSONObject("custom");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("custom");
        try {
        } catch (JSONException e6) {
            h0Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) h0Var, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.H
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.h0.i();
                }
            }, 4, (Object) null);
        }
        if (optJSONObject != null && optJSONObject2 != null) {
            plus.put("custom", JsonUtils.plus(optJSONObject2, optJSONObject));
        } else if (optJSONObject != null) {
            plus.put("custom", optJSONObject);
        } else {
            if (optJSONObject2 != null) {
                plus.put("custom", optJSONObject2);
            }
            h0Var = this;
            h0Var.f12920d.edit().putString("user_cache_attributes_object", plus.toString()).apply();
        }
        h0Var = this;
        h0Var.f12920d.edit().putString("user_cache_attributes_object", plus.toString()).apply();
    }

    public final boolean c(JSONObject jSONObject) {
        if (this.f12919c.f12895a.getBoolean("appboy_sdk_disabled", false)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: o4.F
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.h0.m();
                }
            }, 6, (Object) null);
            return false;
        }
        this.f12920d.edit().putString("user_cache_attributes_object", jSONObject.toString()).apply();
        return true;
    }

    public static final String b(String str, Object obj) {
        return "Could not write to custom attributes json object with key: [" + str + "] value: [" + obj + ']';
    }

    public final boolean c(final String str, final Object obj) {
        Object obj2;
        JSONObject h6 = h();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.D
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.storage.h0.d(str, obj);
                    }
                }, 4, (Object) null);
                return false;
            }
        } else {
            obj2 = obj;
        }
        h6.put(str, obj2);
        return c(h6);
    }

    public final void a(JSONObject outboundJson) {
        Intrinsics.checkNotNullParameter(outboundJson, "outboundJson");
        try {
            String b6 = ((l0) this.f12918b).b();
            if (b6 == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.x
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.storage.h0.e();
                    }
                }, 7, (Object) null);
            } else {
                if (Intrinsics.areEqual(b6, this.f12921e.getString("push_token", null))) {
                    return;
                }
                outboundJson.put("push_token", b6);
            }
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.h0.f();
                }
            }, 4, (Object) null);
        }
    }

    public static final Unit a(h0 h0Var, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        h0Var.c("user_id", it);
        return Unit.INSTANCE;
    }

    public static final String a(String str, JSONObject jSONObject) {
        return "Failed to write to user object json from prefs with key: [" + str + "] value: [" + jSONObject + "] ";
    }

    public final boolean a(final String key, final Object obj) {
        Object obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject g6 = g();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.A
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.storage.h0.b(key, obj);
                    }
                }, 4, (Object) null);
                return false;
            }
        } else {
            obj2 = obj;
        }
        g6.put(key, obj2);
        return c("custom", g6);
    }
}
