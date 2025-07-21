package com.braze.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static final long f12955b = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f12956a;

    public t(Context context, String str, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        SharedPreferences a6 = com.braze.managers.c.a(context, str, apiKey, new StringBuilder("com.appboy.storage.event_data_validator"), 0);
        Intrinsics.checkNotNullExpressionValue(a6, "getSharedPreferences(...)");
        this.f12956a = a6;
        a();
    }

    public static final String b(com.braze.models.i iVar) {
        return "Event already seen in cache. Ignoring duplicate: " + iVar;
    }

    public final boolean a(final com.braze.models.i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        com.braze.models.outgoing.event.b bVar = (com.braze.models.outgoing.event.b) event;
        if (bVar.f12607a != com.braze.enums.e.f12187h) {
            return true;
        }
        a();
        Intrinsics.checkNotNullParameter(event, "event");
        int i6 = com.braze.models.outgoing.event.push.b.f12615j;
        Intrinsics.checkNotNullParameter(event, "event");
        String string = bVar.f12608b.getString("cid");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String eventKey = bVar.f12607a + string;
        if (this.f12956a.contains(eventKey)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.u0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.t.b(com.braze.models.i.this);
                }
            }, 7, (Object) null);
            return false;
        }
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds() + f12955b;
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        this.f12956a.edit().putLong(eventKey, nowInMilliseconds).apply();
        return true;
    }

    public final void a() {
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        for (final Map.Entry<String, ?> entry : this.f12956a.getAll().entrySet()) {
            try {
                Object value = entry.getValue();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                if (nowInMilliseconds >= ((Long) value).longValue()) {
                    String key = entry.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
                    this.f12956a.edit().remove(key).apply();
                }
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.v0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.storage.t.a(entry);
                    }
                }, 4, (Object) null);
                String key2 = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(key2, "<get-key>(...)");
                this.f12956a.edit().remove(key2).apply();
            }
        }
    }

    public static final String a(Map.Entry entry) {
        return "Failed to get expiration time. Deleting entry: " + entry;
    }
}
