package com.braze.triggers.actions;

import android.content.Context;
import com.braze.enums.inappmessage.MessageType;
import com.braze.managers.m;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends h {

    /* renamed from: g, reason: collision with root package name */
    public final InAppMessageBase f13011g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONObject f13012h;

    /* renamed from: i, reason: collision with root package name */
    public final m f13013i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(final JSONObject json, m brazeManager) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: r4.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.triggers.actions.c.a(json);
            }
        }, 6, (Object) null);
        JSONObject jSONObject = json.getJSONObject("data");
        this.f13013i = brazeManager;
        this.f13012h = jSONObject;
        Intrinsics.checkNotNull(jSONObject);
        InAppMessageBase a6 = n.a(jSONObject, brazeManager);
        this.f13011g = a6;
        if (a6 != null) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: r4.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.triggers.actions.c.c();
            }
        }, 6, (Object) null);
        throw new IllegalArgumentException("Failed to parse in-app message triggered action with JSON: " + JsonUtils.getPrettyPrintedString(json));
    }

    public static final String b() {
        return "In-app message has no remote assets for prefetch. Returning empty list.";
    }

    public static final String c() {
        return "Failed to parse in-app message triggered action.";
    }

    public static final String d(com.braze.triggers.events.b bVar) {
        return "Cannot perform triggered action for " + bVar + " due to deserialized in-app message being null";
    }

    @Override // com.braze.triggers.actions.a
    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        InAppMessageBase inAppMessageBase = this.f13011g;
        List<String> remoteAssetPathsForPrefetch = inAppMessageBase != null ? inAppMessageBase.getRemoteAssetPathsForPrefetch() : null;
        if (remoteAssetPathsForPrefetch != null && !remoteAssetPathsForPrefetch.isEmpty()) {
            InAppMessageBase inAppMessageBase2 = this.f13011g;
            MessageType messageType = inAppMessageBase2 != null ? inAppMessageBase2.getMessageType() : null;
            int i6 = messageType == null ? -1 : b.f13010a[messageType.ordinal()];
            if (i6 == 1) {
                arrayList.add(new com.braze.triggers.utils.a(com.braze.triggers.enums.b.f13058a, remoteAssetPathsForPrefetch.get(0)));
                return arrayList;
            }
            if (i6 == 2 || i6 == 3 || i6 == 4) {
                arrayList.add(new com.braze.triggers.utils.a(com.braze.triggers.enums.b.f13059b, remoteAssetPathsForPrefetch.get(0)));
                return arrayList;
            }
            if (i6 != 5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: r4.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.actions.c.a(com.braze.triggers.actions.c.this);
                    }
                }, 6, (Object) null);
                return arrayList;
            }
            Iterator<String> it = remoteAssetPathsForPrefetch.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.braze.triggers.utils.a(com.braze.triggers.enums.b.f13060c, it.next()));
            }
            return arrayList;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: r4.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.triggers.actions.c.b();
            }
        }, 7, (Object) null);
        return arrayList;
    }

    @Override // com.braze.triggers.actions.g, com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getKey() {
        try {
            JSONObject key = super.getKey();
            if (key != null) {
                InAppMessageBase inAppMessageBase = this.f13011g;
                key.put("data", inAppMessageBase != null ? inAppMessageBase.getKey() : null);
                key.put("type", "inapp");
                return key;
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public static final String b(c cVar) {
        return "Attempting to publish in-app message after delay of " + cVar.f13021b.f13048d + " seconds.";
    }

    public static final String c(com.braze.triggers.events.b bVar) {
        return "Cannot perform triggered action for " + bVar + " due to in-app message json being null";
    }

    public static final String d() {
        return "Caught exception while performing triggered action.";
    }

    public static final String a(c cVar) {
        StringBuilder sb = new StringBuilder("Failed to return remote paths to assets for type: ");
        InAppMessageBase inAppMessageBase = cVar.f13011g;
        sb.append(inAppMessageBase != null ? inAppMessageBase.getMessageType() : null);
        return sb.toString();
    }

    public static final String a(JSONObject jSONObject) {
        return "Attempting to parse in-app message triggered action with JSON: " + JsonUtils.getPrettyPrintedString(jSONObject);
    }

    @Override // com.braze.triggers.actions.a
    public final void a(Context context, com.braze.events.e internalEventPublisher, final com.braze.triggers.events.b triggerEvent, long j6) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: r4.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.actions.c.b(com.braze.triggers.actions.c.this);
                }
            }, 7, (Object) null);
            JSONObject jSONObject = this.f13012h;
            if (jSONObject == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: r4.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.actions.c.c(com.braze.triggers.events.b.this);
                    }
                }, 6, (Object) null);
                return;
            }
            InAppMessageBase a6 = n.a(jSONObject, this.f13013i);
            String a7 = triggerEvent.a();
            int i6 = com.braze.triggers.events.h.f13067g;
            if (Intrinsics.areEqual(a7, "test")) {
                if (a6 != null) {
                    a6.setTestSend(true);
                }
                this.f13012h.put("is_test_send", true);
            }
            if (a6 == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: r4.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.actions.c.d(com.braze.triggers.events.b.this);
                    }
                }, 6, (Object) null);
                return;
            }
            a6.setLocalPrefetchedAssetPaths(MapsKt.toMap(this.f13025f));
            a6.setExpirationTimestamp(j6);
            ((com.braze.events.d) internalEventPublisher).b(new com.braze.events.internal.m(triggerEvent, this, a6, this.f13013i.f12452b), com.braze.events.internal.m.class);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: r4.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.actions.c.d();
                }
            }, 4, (Object) null);
        }
    }
}
