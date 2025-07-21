package com.amazon.device.iap.internal.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.amazon.a.a.o.f;
import com.amazon.device.iap.model.Receipt;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11608a = "d";

    /* renamed from: d, reason: collision with root package name */
    private static final String f11611d = "LAST_CLEANING_TIME";

    /* renamed from: b, reason: collision with root package name */
    private static final String f11609b = d.class.getName() + "_PREFS";

    /* renamed from: c, reason: collision with root package name */
    private static final String f11610c = d.class.getName() + "_CLEANER_PREFS";

    /* renamed from: e, reason: collision with root package name */
    private static int f11612e = 604800000;

    /* renamed from: f, reason: collision with root package name */
    private static final d f11613f = new d();

    private void e() {
        com.amazon.device.iap.internal.util.b.a(f11608a, "enter old receipts cleanup! ");
        final Context b6 = com.amazon.device.iap.internal.d.f().b();
        f.a(b6, "context");
        a(System.currentTimeMillis());
        new Handler().post(new Runnable() { // from class: com.amazon.device.iap.internal.b.d.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.amazon.device.iap.internal.util.b.a(d.f11608a, "perform house keeping! ");
                    SharedPreferences sharedPreferences = b6.getSharedPreferences(d.f11609b, 0);
                    for (String str : sharedPreferences.getAll().keySet()) {
                        try {
                            if (System.currentTimeMillis() - c.a(sharedPreferences.getString(str, null)).d() > d.f11612e) {
                                com.amazon.device.iap.internal.util.b.a(d.f11608a, "house keeping - try remove Receipt:" + str + " since it's too old");
                                d.this.a(str);
                            }
                        } catch (b unused) {
                            com.amazon.device.iap.internal.util.b.a(d.f11608a, "house keeping - try remove Receipt:" + str + " since it's invalid ");
                            d.this.a(str);
                        }
                    }
                } catch (Throwable th) {
                    com.amazon.device.iap.internal.util.b.a(d.f11608a, "Error in running cleaning job:" + th);
                }
            }
        });
    }

    private long f() {
        Context b6 = com.amazon.device.iap.internal.d.f().b();
        f.a(b6, "context");
        long currentTimeMillis = System.currentTimeMillis();
        long j6 = b6.getSharedPreferences(f11610c, 0).getLong(f11611d, 0L);
        if (j6 != 0) {
            return j6;
        }
        a(currentTimeMillis);
        return currentTimeMillis;
    }

    public void a(String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        com.amazon.device.iap.internal.util.b.a(f11608a, "enter saveReceipt for receipt [" + str4 + "]");
        try {
            f.a(str2, "userId");
            f.a(str3, com.amazon.a.a.o.b.f11175E);
            f.a(str4, "receiptString");
            Context b6 = com.amazon.device.iap.internal.d.f().b();
            f.a(b6, "context");
            str5 = str;
            str6 = str4;
            try {
                c cVar = new c(str2, str6, str5, System.currentTimeMillis());
                SharedPreferences.Editor edit = b6.getSharedPreferences(f11609b, 0).edit();
                edit.putString(str3, cVar.e());
                edit.commit();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                com.amazon.device.iap.internal.util.b.a(f11608a, "error in saving pending receipt:" + str5 + "/" + str6 + ":" + th2.getMessage());
                com.amazon.device.iap.internal.util.b.a(f11608a, "leaving saveReceipt for receipt id [" + str3 + "]");
            }
        } catch (Throwable th3) {
            th = th3;
            str5 = str;
            str6 = str4;
        }
        com.amazon.device.iap.internal.util.b.a(f11608a, "leaving saveReceipt for receipt id [" + str3 + "]");
    }

    public Set<Receipt> b(String str) {
        Context b6 = com.amazon.device.iap.internal.d.f().b();
        f.a(b6, "context");
        String str2 = f11608a;
        com.amazon.device.iap.internal.util.b.a(str2, "enter getLocalReceipts for user[" + str + "]");
        HashSet hashSet = new HashSet();
        if (!f.a(str)) {
            Map<String, ?> all = b6.getSharedPreferences(f11609b, 0).getAll();
            for (String str3 : all.keySet()) {
                String str4 = (String) all.get(str3);
                try {
                    c a6 = c.a(str4);
                    hashSet.add(com.amazon.device.iap.internal.util.c.a(new JSONObject(a6.c()), str, a6.b()));
                } catch (com.amazon.device.iap.internal.a.f unused) {
                    a(str3);
                    com.amazon.device.iap.internal.util.b.b(f11608a, "failed to verify signature:[" + str4 + "]");
                } catch (JSONException unused2) {
                    a(str3);
                    com.amazon.device.iap.internal.util.b.b(f11608a, "failed to convert string to JSON object:[" + str4 + "]");
                } catch (Throwable unused3) {
                    com.amazon.device.iap.internal.util.b.b(f11608a, "failed to load the receipt from SharedPreference:[" + str4 + "]");
                }
            }
            com.amazon.device.iap.internal.util.b.a(f11608a, "leaving getLocalReceipts for user[" + str + "], " + hashSet.size() + " local receipts found.");
            if (System.currentTimeMillis() - f() > f11612e) {
                e();
            }
            return hashSet;
        }
        com.amazon.device.iap.internal.util.b.b(str2, "empty UserId: " + str);
        throw new RuntimeException("Invalid UserId:" + str);
    }

    public String c(String str) {
        Context b6 = com.amazon.device.iap.internal.d.f().b();
        f.a(b6, "context");
        if (!f.a(str)) {
            String string = b6.getSharedPreferences(f11609b, 0).getString(str, null);
            if (string != null) {
                try {
                    return c.a(string).b();
                } catch (b unused) {
                }
            }
            return null;
        }
        com.amazon.device.iap.internal.util.b.b(f11608a, "empty receiptId: " + str);
        throw new RuntimeException("Invalid ReceiptId:" + str);
    }

    public void a(String str) {
        String str2 = f11608a;
        com.amazon.device.iap.internal.util.b.a(str2, "enter removeReceipt for receipt[" + str + "]");
        Context b6 = com.amazon.device.iap.internal.d.f().b();
        f.a(b6, "context");
        SharedPreferences.Editor edit = b6.getSharedPreferences(f11609b, 0).edit();
        edit.remove(str);
        edit.commit();
        com.amazon.device.iap.internal.util.b.a(str2, "leave removeReceipt for receipt[" + str + "]");
    }

    private void a(long j6) {
        Context b6 = com.amazon.device.iap.internal.d.f().b();
        f.a(b6, "context");
        SharedPreferences.Editor edit = b6.getSharedPreferences(f11610c, 0).edit();
        edit.putLong(f11611d, j6);
        edit.commit();
    }

    public static d a() {
        return f11613f;
    }
}
