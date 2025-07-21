package com.braze.configuration;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.j;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f12124a;

    public e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.offline.storagemap", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.f12124a = sharedPreferences;
    }

    public static final String a(String str) {
        return j.a("Stored user ID is longer than 997 bytes. Truncating. Original user ID: ", str);
    }

    public static final String c(String str) {
        return j.a("Offline user storage provider was given user ID longer than 997. Rejecting. User ID: ", str);
    }

    public final void b(final String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        if (userId.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: S3.A
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.configuration.e.b();
                }
            }, 6, (Object) null);
        } else {
            if (StringUtils.getByteSize(userId) > 997) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: S3.B
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.configuration.e.c(userId);
                    }
                }, 6, (Object) null);
                return;
            }
            SharedPreferences.Editor edit = this.f12124a.edit();
            edit.putString("last_user", userId);
            edit.apply();
        }
    }

    public final String a() {
        String string = this.f12124a.getString("last_user", "");
        final String str = string != null ? string : "";
        if (StringUtils.getByteSize(str) <= 997) {
            return str;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: S3.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.configuration.e.a(str);
            }
        }, 6, (Object) null);
        String truncateToByteLength = StringUtils.truncateToByteLength(str, 997);
        b(truncateToByteLength);
        return truncateToByteLength;
    }

    public static final String b() {
        return "userId is empty in updateLastUserId. Rejecting.";
    }
}
