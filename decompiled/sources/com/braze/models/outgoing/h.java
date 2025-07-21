package com.braze.models.outgoing;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h implements IPutIntoJson, com.braze.models.k {

    /* renamed from: n, reason: collision with root package name */
    public static final g f12617n = new g();

    /* renamed from: a, reason: collision with root package name */
    public final BrazeConfigurationProvider f12618a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12619b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12620c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12621d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12622e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12623f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12624g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12625h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f12626i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f12627j;

    /* renamed from: k, reason: collision with root package name */
    public final String f12628k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f12629l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12630m;

    public h(BrazeConfigurationProvider configurationProvider, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, String str8, Boolean bool3) {
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        this.f12618a = configurationProvider;
        this.f12619b = str;
        this.f12620c = str2;
        this.f12621d = str3;
        this.f12622e = str4;
        this.f12623f = str5;
        this.f12624g = str6;
        this.f12625h = str7;
        this.f12626i = bool;
        this.f12627j = bool2;
        this.f12628k = str8;
        this.f12629l = bool3;
    }

    public static final String b() {
        return "Caught exception creating device Json.";
    }

    @Override // com.braze.models.k
    public final boolean isEmpty() {
        return getKey().length() == 0;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getKey() {
        JSONObject jSONObject = new JSONObject();
        try {
            g gVar = f12617n;
            gVar.a(this.f12618a, jSONObject, DeviceKey.ANDROID_VERSION, this.f12619b);
            gVar.a(this.f12618a, jSONObject, DeviceKey.CARRIER, this.f12620c);
            gVar.a(this.f12618a, jSONObject, DeviceKey.BRAND, this.f12621d);
            gVar.a(this.f12618a, jSONObject, DeviceKey.MODEL, this.f12622e);
            gVar.a(this.f12618a, jSONObject, DeviceKey.RESOLUTION, this.f12625h);
            gVar.a(this.f12618a, jSONObject, DeviceKey.LOCALE, this.f12623f);
            gVar.a(this.f12618a, jSONObject, DeviceKey.NOTIFICATIONS_ENABLED, this.f12626i);
            gVar.a(this.f12618a, jSONObject, DeviceKey.IS_BACKGROUND_RESTRICTED, this.f12627j);
            String str = this.f12628k;
            if (str != null && !StringsKt.isBlank(str)) {
                gVar.a(this.f12618a, jSONObject, DeviceKey.GOOGLE_ADVERTISING_ID, this.f12628k);
            }
            Boolean bool = this.f12629l;
            if (bool != null) {
                gVar.a(this.f12618a, jSONObject, DeviceKey.AD_TRACKING_ENABLED, bool);
            }
            String str2 = this.f12624g;
            if (str2 != null && !StringsKt.isBlank(str2)) {
                gVar.a(this.f12618a, jSONObject, DeviceKey.TIMEZONE, this.f12624g);
                return jSONObject;
            }
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: e4.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.models.outgoing.h.b();
                }
            }, 4, (Object) null);
        }
        return jSONObject;
    }
}
