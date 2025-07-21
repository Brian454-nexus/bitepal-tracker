package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class PurchaseHistoryRecord {

    /* renamed from: a, reason: collision with root package name */
    public final String f11819a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11820b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f11821c;

    public PurchaseHistoryRecord(String str, String str2) {
        this.f11819a = str;
        this.f11820b = str2;
        this.f11821c = new JSONObject(str);
    }

    public String a() {
        return this.f11821c.optString("developerPayload");
    }

    public String b() {
        return this.f11819a;
    }

    public List c() {
        return i();
    }

    public long d() {
        return this.f11821c.optLong("purchaseTime");
    }

    public String e() {
        JSONObject jSONObject = this.f11821c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f11819a, purchaseHistoryRecord.b()) && TextUtils.equals(this.f11820b, purchaseHistoryRecord.g());
    }

    public int f() {
        return this.f11821c.optInt("quantity", 1);
    }

    public String g() {
        return this.f11820b;
    }

    public ArrayList h() {
        return i();
    }

    public int hashCode() {
        return this.f11819a.hashCode();
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        if (this.f11821c.has("productIds")) {
            JSONArray optJSONArray = this.f11821c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                    arrayList.add(optJSONArray.optString(i6));
                }
            }
        } else if (this.f11821c.has("productId")) {
            arrayList.add(this.f11821c.optString("productId"));
        }
        return arrayList;
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f11819a));
    }
}
