package com.braze.storage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.EnumSet;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f12897a;

    public b0(Context context, String userId, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        SharedPreferences a6 = com.braze.managers.c.a(context, userId, apiKey, new StringBuilder("com.braze.storage.sdk_metadata_cache"), 0);
        Intrinsics.checkNotNullExpressionValue(a6, "getSharedPreferences(...)");
        this.f12897a = a6;
    }

    public final void a(EnumSet sdkMetadata) {
        Intrinsics.checkNotNullParameter(sdkMetadata, "sdkMetadata");
        this.f12897a.edit().putStringSet("tags", com.braze.support.f.a(sdkMetadata)).apply();
    }

    public final EnumSet b(EnumSet newSdkMetadata) {
        Intrinsics.checkNotNullParameter(newSdkMetadata, "newSdkMetadata");
        if (Intrinsics.areEqual(com.braze.support.f.a(newSdkMetadata), this.f12897a.getStringSet("tags", SetsKt.emptySet()))) {
            return null;
        }
        return newSdkMetadata;
    }
}
