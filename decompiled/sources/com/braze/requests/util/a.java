package com.braze.requests.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f12864a;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("persistent.com.braze.requests.metadata.last_req_at", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.f12864a = sharedPreferences;
    }

    public final long a(c target) {
        Intrinsics.checkNotNullParameter(target, "target");
        String str = "uri-" + target.f12872a.hashCode();
        long j6 = this.f12864a.getLong(str, 0L);
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        this.f12864a.edit().putLong(str, nowInMilliseconds).apply();
        return Math.min(nowInMilliseconds - j6, 7200000L);
    }

    public final long b(c target) {
        Intrinsics.checkNotNullParameter(target, "target");
        String str = "uri-at-" + target.f12872a.hashCode();
        long j6 = this.f12864a.getLong(str, 1L);
        this.f12864a.edit().putLong(str, 1 + j6).apply();
        return j6;
    }

    public final void c(c target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f12864a.edit().putLong("uri-at-" + target.f12872a.hashCode(), 1L).apply();
    }
}
