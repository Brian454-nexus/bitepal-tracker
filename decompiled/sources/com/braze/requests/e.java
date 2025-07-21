package com.braze.requests;

import com.braze.storage.e0;
import com.braze.support.BrazeLogger;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e extends b {

    /* renamed from: j, reason: collision with root package name */
    public long f12761j;

    /* renamed from: k, reason: collision with root package name */
    public long f12762k;

    /* renamed from: l, reason: collision with root package name */
    public int f12763l;

    /* renamed from: m, reason: collision with root package name */
    public final m f12764m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(e0 serverConfigStorageProvider, String urlBase, long j6, long j7, String str, int i6) {
        super(new com.braze.requests.util.c(urlBase + "content_cards/sync", false), str, serverConfigStorageProvider);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        this.f12761j = j6;
        this.f12762k = j7;
        this.f12763l = i6;
        this.f12764m = m.f12831d;
    }

    public static final String l() {
        return "Experienced JSONException while creating Content Cards request. Returning null.";
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
            b6.put("last_full_sync_at", this.f12762k);
            b6.put("last_card_updated_at", this.f12761j);
            String str = this.f12741b;
            if (str != null && !StringsKt.isBlank(str)) {
                b6.put("user_id", this.f12741b);
                return b6;
            }
            return b6;
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: k4.C
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.e.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.n
    public final m c() {
        return this.f12764m;
    }

    @Override // com.braze.requests.b, com.braze.requests.n
    public final void a(HashMap existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        existingHeaders.put("X-Braze-DataRequest", com.amazon.a.a.o.b.af);
        existingHeaders.put("X-Braze-ContentCardsRequest", com.amazon.a.a.o.b.af);
        existingHeaders.put("BRAZE-SYNC-RETRY-COUNT", String.valueOf(this.f12763l));
    }
}
