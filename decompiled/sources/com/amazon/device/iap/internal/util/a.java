package com.amazon.device.iap.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.a.a.o.f;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11688a = a.class.getName() + "_PREFS";

    public static String a(String str) {
        f.a((Object) str, "userId");
        Context b6 = com.amazon.device.iap.internal.d.f().b();
        f.a(b6, "context");
        return b6.getSharedPreferences(f11688a, 0).getString(str, null);
    }

    public static void a(String str, String str2) {
        f.a((Object) str, "userId");
        Context b6 = com.amazon.device.iap.internal.d.f().b();
        f.a(b6, "context");
        SharedPreferences.Editor edit = b6.getSharedPreferences(f11688a, 0).edit();
        edit.putString(str, str2);
        edit.commit();
    }
}
