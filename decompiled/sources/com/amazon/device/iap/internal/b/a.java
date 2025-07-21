package com.amazon.device.iap.internal.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.a.a.o.f;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f11596a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final String f11597b = a.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    private static final String f11598c = a.class.getName() + "_PREFS_";

    public static a a() {
        return f11596a;
    }

    public void a(String str, String str2, String str3) {
        com.amazon.device.iap.internal.util.b.a(f11597b, "enter saveEntitlementRecord for v1 Entitlement [" + str2 + "/" + str3 + "], user [" + str + "]");
        try {
            f.a(str, "userId");
            f.a(str2, com.amazon.a.a.o.b.f11175E);
            f.a(str3, com.amazon.a.a.o.b.f11181K);
            Context b6 = com.amazon.device.iap.internal.d.f().b();
            f.a(b6, "context");
            SharedPreferences.Editor edit = b6.getSharedPreferences(f11598c + str, 0).edit();
            edit.putString(str3, str2);
            edit.commit();
        } catch (Throwable th) {
            com.amazon.device.iap.internal.util.b.a(f11597b, "error in saving v1 Entitlement:" + str2 + "/" + str3 + ":" + th.getMessage());
        }
        com.amazon.device.iap.internal.util.b.a(f11597b, "leaving saveEntitlementRecord for v1 Entitlement [" + str2 + "/" + str3 + "], user [" + str + "]");
    }

    public String a(String str, String str2) {
        com.amazon.device.iap.internal.util.b.a(f11597b, "enter getReceiptIdFromSku for sku [" + str2 + "], user [" + str + "]");
        String str3 = null;
        try {
            f.a(str, "userId");
            f.a(str2, com.amazon.a.a.o.b.f11181K);
            Context b6 = com.amazon.device.iap.internal.d.f().b();
            f.a(b6, "context");
            str3 = b6.getSharedPreferences(f11598c + str, 0).getString(str2, null);
        } catch (Throwable th) {
            com.amazon.device.iap.internal.util.b.a(f11597b, "error in saving v1 Entitlement:" + str2 + ":" + th.getMessage());
        }
        com.amazon.device.iap.internal.util.b.a(f11597b, "leaving saveEntitlementRecord for sku [" + str2 + "], user [" + str + "]");
        return str3;
    }
}
