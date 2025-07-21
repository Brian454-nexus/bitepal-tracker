package com.braze.requests;

import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.SdkFlavor;
import com.braze.events.internal.c0;
import com.braze.events.internal.d0;
import com.braze.models.outgoing.k;
import com.braze.storage.e0;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f extends b {

    /* renamed from: j, reason: collision with root package name */
    public k f12765j;

    /* renamed from: k, reason: collision with root package name */
    public SdkFlavor f12766k;

    /* renamed from: l, reason: collision with root package name */
    public com.braze.models.outgoing.l f12767l;

    /* renamed from: m, reason: collision with root package name */
    public com.braze.models.b f12768m;

    /* renamed from: n, reason: collision with root package name */
    public EnumSet f12769n;

    /* renamed from: o, reason: collision with root package name */
    public String f12770o;

    /* renamed from: p, reason: collision with root package name */
    public String f12771p;

    /* renamed from: q, reason: collision with root package name */
    public final m f12772q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e0 serverConfigStorageProvider, String urlBase, k outboundRespondWith) {
        super(new com.braze.requests.util.c(urlBase + "data", false), null, serverConfigStorageProvider);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(outboundRespondWith, "outboundRespondWith");
        this.f12765j = outboundRespondWith;
        this.f12772q = m.f12833f;
    }

    public static final String l() {
        return "Experienced JSONException while retrieving parameters. Returning empty object.";
    }

    public static final String m() {
        return "Trigger dispatch completed. Alerting subscribers.";
    }

    @Override // com.braze.requests.n
    public final boolean a() {
        ArrayList<com.braze.models.k> arrayList = new ArrayList();
        arrayList.add(this.f12747h);
        arrayList.add(this.f12767l);
        arrayList.add(this.f12768m);
        arrayList.add(this.f12765j);
        if (!arrayList.isEmpty()) {
            for (com.braze.models.k kVar : arrayList) {
                if (kVar != null && !kVar.isEmpty()) {
                    return false;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f12747h);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.braze.models.k kVar2 = (com.braze.models.k) it.next();
            if (kVar2 != null && !kVar2.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.braze.requests.b, com.braze.requests.n
    public final JSONObject b() {
        String str;
        JSONObject b6 = super.b();
        if (b6 == null) {
            return null;
        }
        try {
            String str2 = this.f12770o;
            if (str2 != null) {
                b6.put("app_version", str2);
            }
            String str3 = this.f12771p;
            if (str3 != null && !StringsKt.isBlank(str3)) {
                b6.put("app_version_code", this.f12771p);
            }
            com.braze.models.outgoing.l lVar = this.f12767l;
            if (lVar != null && !lVar.isEmpty()) {
                JSONArray jsonArrayForJsonPut = lVar.f12642b;
                Intrinsics.checkNotNullExpressionValue(jsonArrayForJsonPut, "jsonArrayForJsonPut");
                b6.put("attributes", jsonArrayForJsonPut);
            }
            com.braze.models.b bVar = this.f12768m;
            if (bVar != null && !bVar.f12573b) {
                b6.put("events", JsonUtils.constructJsonArray(bVar.f12572a));
            }
            SdkFlavor sdkFlavor = this.f12766k;
            if (sdkFlavor != null) {
                b6.put("sdk_flavor", sdkFlavor.getJsonObject());
            }
            EnumSet set = this.f12769n;
            if (set != null) {
                BrazeSdkMetadata.Companion.getClass();
                Intrinsics.checkNotNullParameter(set, "set");
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    str = ((BrazeSdkMetadata) it.next()).jsonKey;
                    arrayList.add(str);
                }
                b6.put("sdk_metadata", new JSONArray((Collection) CollectionsKt.sorted(arrayList)));
            }
            b6.put("respond_with", this.f12765j.getJsonObject());
            return b6;
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: k4.D
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.f.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.n
    public final m c() {
        return this.f12772q;
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final void a(com.braze.events.d internalPublisher) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        if (this.f12765j.b()) {
            internalPublisher.b(new d0(this), d0.class);
        }
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final void a(com.braze.events.e internalPublisher) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        if (this.f12765j.b()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.E
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.f.m();
                }
            }, 7, (Object) null);
            ((com.braze.events.d) internalPublisher).b(new c0(this), c0.class);
        }
    }

    @Override // com.braze.requests.b, com.braze.requests.n
    public final void a(HashMap existingHeaders) {
        boolean z6;
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        if (this.f12765j.isEmpty()) {
            return;
        }
        boolean z7 = true;
        if (this.f12765j.f12638b != null) {
            existingHeaders.put("X-Braze-FeedRequest", com.amazon.a.a.o.b.af);
            z6 = true;
        } else {
            z6 = false;
        }
        if (this.f12765j.b()) {
            existingHeaders.put("X-Braze-TriggersRequest", com.amazon.a.a.o.b.af);
        } else {
            z7 = z6;
        }
        if (z7) {
            existingHeaders.put("X-Braze-DataRequest", com.amazon.a.a.o.b.af);
        }
    }
}
