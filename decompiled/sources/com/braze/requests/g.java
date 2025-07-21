package com.braze.requests;

import com.braze.storage.e0;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g extends b {

    /* renamed from: j, reason: collision with root package name */
    public final m f12823j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e0 serverConfigStorageProvider, String urlBase, String str) {
        super(new com.braze.requests.util.c(urlBase + "dust/config", false), str, serverConfigStorageProvider);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        this.f12823j = m.f12842o;
    }

    public static final String l() {
        return "Experienced JSONException while creating DUST config request. Returning null.";
    }

    @Override // com.braze.requests.n
    public final boolean a() {
        return false;
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
                return b6;
            }
            return b6;
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: k4.F
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.g.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.n
    public final m c() {
        return this.f12823j;
    }
}
