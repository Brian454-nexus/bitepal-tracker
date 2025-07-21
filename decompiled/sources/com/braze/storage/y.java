package com.braze.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final long f12974b = TimeUnit.DAYS.toSeconds(45);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f12975a;

    public y(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences a6 = com.braze.managers.c.a(context, str2, str, new StringBuilder("com.braze.storage.push_identifier_storage"), 0);
        Intrinsics.checkNotNullExpressionValue(a6, "getSharedPreferences(...)");
        this.f12975a = a6;
        a();
    }

    public static final String b(String str) {
        return com.braze.a.a("Push dedupe id ", str, " has already been seen. Returning false.");
    }

    public final boolean a(final String pushId) {
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        if (StringsKt.isBlank(pushId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.G0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.y.b();
                }
            }, 7, (Object) null);
            return true;
        }
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        if (this.f12975a.contains(pushId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.H0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.y.b(pushId);
                }
            }, 7, (Object) null);
            return false;
        }
        a();
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        this.f12975a.edit().putLong(pushId, DateTimeUtils.nowInSeconds()).apply();
        return true;
    }

    public static final String b() {
        return "Push dedupe id is blank. Returning true.";
    }

    public final void a() {
        final long nowInSeconds = DateTimeUtils.nowInSeconds() - f12974b;
        SharedPreferences.Editor edit = this.f12975a.edit();
        Map<String, ?> all = this.f12975a.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        for (final Map.Entry<String, ?> entry : all.entrySet()) {
            Long l6 = (Long) entry.getValue();
            if (l6 == null || l6.longValue() < nowInSeconds) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: o4.F0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.storage.y.a(entry, nowInSeconds);
                    }
                }, 6, (Object) null);
                edit.remove(entry.getKey());
            }
        }
        edit.apply();
    }

    public static final String a(Map.Entry entry, long j6) {
        return "Evicting push id key " + entry + " based on cutoff: " + j6;
    }
}
