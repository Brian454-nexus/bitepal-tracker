package com.braze.managers;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class u implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f12528a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f12529b;

    public u(final Context context, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f12528a = LazyKt.lazy(new Function0() { // from class: Z3.B3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.u.a(context);
            }
        });
        SharedPreferences a6 = c.a(context, null, apiKey, new StringBuilder("com.braze.device_id"), 0);
        Intrinsics.checkNotNullExpressionValue(a6, "getSharedPreferences(...)");
        this.f12529b = a6;
    }

    public static final SharedPreferences a(Context context) {
        return context.getSharedPreferences("com.appboy.device", 0);
    }

    public final String a() {
        String string = this.f12529b.getString("device_id", null);
        if (string == null) {
            Object value = this.f12528a.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            string = ((SharedPreferences) value).getString("device_id", null);
            Object value2 = this.f12528a.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((SharedPreferences) value2).edit().clear().apply();
        }
        if ((this.f12529b.contains("persistent_device_id") ? !Intrinsics.areEqual(this.f12529b.getString("persistent_device_id", null), String.valueOf(722989291)) : false) || string == null) {
            string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        }
        this.f12529b.edit().putString("persistent_device_id", String.valueOf(722989291)).putString("device_id", string).apply();
        return string;
    }
}
