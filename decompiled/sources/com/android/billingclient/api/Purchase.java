package com.android.billingclient.api;

import L3.C0509a;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class Purchase {

    /* renamed from: a, reason: collision with root package name */
    public final String f11815a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11816b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f11817c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final JSONObject f11818a;

        public a(JSONObject jSONObject) {
            this.f11818a = jSONObject;
        }

        public List a() {
            JSONArray optJSONArray;
            ArrayList arrayList = new ArrayList();
            if (this.f11818a.has("productIds") && (optJSONArray = this.f11818a.optJSONArray("productIds")) != null) {
                for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                    arrayList.add(optJSONArray.optString(i6));
                }
            }
            return arrayList;
        }

        public String b() {
            return this.f11818a.optString("purchaseToken");
        }
    }

    public Purchase(String str, String str2) {
        this.f11815a = str;
        this.f11816b = str2;
        this.f11817c = new JSONObject(str);
    }

    public C0509a a() {
        JSONObject jSONObject = this.f11817c;
        String optString = jSONObject.optString("obfuscatedAccountId");
        String optString2 = jSONObject.optString("obfuscatedProfileId");
        if (optString == null && optString2 == null) {
            return null;
        }
        return new C0509a(optString, optString2);
    }

    public String b() {
        return this.f11817c.optString("developerPayload");
    }

    public String c() {
        String optString = this.f11817c.optString("orderId");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        return optString;
    }

    public String d() {
        return this.f11815a;
    }

    public String e() {
        return this.f11817c.optString("packageName");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f11815a, purchase.d()) && TextUtils.equals(this.f11816b, purchase.l());
    }

    public a f() {
        JSONObject optJSONObject = this.f11817c.optJSONObject("pendingPurchaseUpdate");
        if (optJSONObject == null) {
            return null;
        }
        return new a(optJSONObject);
    }

    public List g() {
        return o();
    }

    public int h() {
        return this.f11817c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public int hashCode() {
        return this.f11815a.hashCode();
    }

    public long i() {
        return this.f11817c.optLong("purchaseTime");
    }

    public String j() {
        JSONObject jSONObject = this.f11817c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int k() {
        return this.f11817c.optInt("quantity", 1);
    }

    public String l() {
        return this.f11816b;
    }

    public boolean m() {
        return this.f11817c.optBoolean("acknowledged", true);
    }

    public boolean n() {
        return this.f11817c.optBoolean("autoRenewing");
    }

    public final ArrayList o() {
        ArrayList arrayList = new ArrayList();
        if (this.f11817c.has("productIds")) {
            JSONArray optJSONArray = this.f11817c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                    arrayList.add(optJSONArray.optString(i6));
                }
            }
        } else if (this.f11817c.has("productId")) {
            arrayList.add(this.f11817c.optString("productId"));
        }
        return arrayList;
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f11815a));
    }
}
