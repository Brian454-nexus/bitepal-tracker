package com.braze.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12976a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12977b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12978c;

    /* renamed from: d, reason: collision with root package name */
    public final SharedPreferences f12979d;

    public z(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12976a = context;
        this.f12977b = str;
        this.f12978c = str2;
        this.f12979d = com.braze.managers.c.a(context, str, str2, new StringBuilder("com.braze.storage.sdk_auth_cache"), 0);
    }

    public static final String a(String str) {
        return com.braze.j.a("Setting signature to: ", str);
    }

    public final void b(final String str) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: o4.I0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.z.a(str);
            }
        }, 6, (Object) null);
        this.f12979d.edit().putString("auth_signature", str).apply();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.areEqual(this.f12976a, zVar.f12976a) && Intrinsics.areEqual(this.f12977b, zVar.f12977b) && Intrinsics.areEqual(this.f12978c, zVar.f12978c);
    }

    public final int hashCode() {
        int hashCode = this.f12976a.hashCode() * 31;
        String str = this.f12977b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f12978c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "SdkAuthenticationCache(context=" + this.f12976a + ", userId=" + this.f12977b + ", apiKey=" + this.f12978c + ')';
    }
}
