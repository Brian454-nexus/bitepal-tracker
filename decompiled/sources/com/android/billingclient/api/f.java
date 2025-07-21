package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzco;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f11892a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f11893b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11894c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11895d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11896e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11897f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11898g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11899h;

    /* renamed from: i, reason: collision with root package name */
    public final String f11900i;

    /* renamed from: j, reason: collision with root package name */
    public final List f11901j;

    /* renamed from: k, reason: collision with root package name */
    public final List f11902k;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f11903a;

        /* renamed from: b, reason: collision with root package name */
        public final int f11904b;

        public a(JSONObject jSONObject) {
            this.f11903a = jSONObject.getInt("commitmentPaymentsCount");
            this.f11904b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }

        public int a() {
            return this.f11903a;
        }

        public int b() {
            return this.f11904b;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f11905a;

        /* renamed from: b, reason: collision with root package name */
        public final long f11906b;

        /* renamed from: c, reason: collision with root package name */
        public final String f11907c;

        /* renamed from: d, reason: collision with root package name */
        public final String f11908d;

        /* renamed from: e, reason: collision with root package name */
        public final String f11909e;

        /* renamed from: f, reason: collision with root package name */
        public final n f11910f;

        public b(JSONObject jSONObject) {
            this.f11905a = jSONObject.optString("formattedPrice");
            this.f11906b = jSONObject.optLong("priceAmountMicros");
            this.f11907c = jSONObject.optString("priceCurrencyCode");
            String optString = jSONObject.optString("offerIdToken");
            this.f11908d = true == optString.isEmpty() ? null : optString;
            jSONObject.optString("offerId").getClass();
            jSONObject.optString("purchaseOptionId").getClass();
            jSONObject.optInt("offerType");
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                    arrayList.add(optJSONArray.getString(i6));
                }
            }
            zzco.zzk(arrayList);
            if (jSONObject.has("fullPriceMicros")) {
                jSONObject.optLong("fullPriceMicros");
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            if (optJSONObject != null) {
                optJSONObject.getInt("percentageDiscount");
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            if (optJSONObject2 != null) {
                optJSONObject2.getLong("startTimeMillis");
                optJSONObject2.getLong("endTimeMillis");
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            if (optJSONObject3 != null) {
                optJSONObject3.getInt("maximumQuantity");
                optJSONObject3.getInt("remainingQuantity");
            }
            this.f11909e = jSONObject.optString("serializedDocid");
            JSONObject optJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            if (optJSONObject4 != null) {
                optJSONObject4.getLong("preorderReleaseTimeMillis");
                optJSONObject4.getLong("preorderPresaleEndTimeMillis");
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            if (optJSONObject5 != null) {
                optJSONObject5.getString("rentalPeriod");
                optJSONObject5.optString("rentalExpirationPeriod").getClass();
            }
            JSONObject optJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.f11910f = optJSONObject6 != null ? new n(optJSONObject6) : null;
        }

        public String a() {
            return this.f11905a;
        }

        public long b() {
            return this.f11906b;
        }

        public String c() {
            return this.f11907c;
        }

        public final n d() {
            return this.f11910f;
        }

        public final String e() {
            return this.f11908d;
        }

        public final String f() {
            return this.f11909e;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f11911a;

        /* renamed from: b, reason: collision with root package name */
        public final long f11912b;

        /* renamed from: c, reason: collision with root package name */
        public final String f11913c;

        /* renamed from: d, reason: collision with root package name */
        public final String f11914d;

        /* renamed from: e, reason: collision with root package name */
        public final int f11915e;

        /* renamed from: f, reason: collision with root package name */
        public final int f11916f;

        public c(JSONObject jSONObject) {
            this.f11914d = jSONObject.optString("billingPeriod");
            this.f11913c = jSONObject.optString("priceCurrencyCode");
            this.f11911a = jSONObject.optString("formattedPrice");
            this.f11912b = jSONObject.optLong("priceAmountMicros");
            this.f11916f = jSONObject.optInt("recurrenceMode");
            this.f11915e = jSONObject.optInt("billingCycleCount");
        }

        public int a() {
            return this.f11915e;
        }

        public String b() {
            return this.f11914d;
        }

        public String c() {
            return this.f11911a;
        }

        public long d() {
            return this.f11912b;
        }

        public String e() {
            return this.f11913c;
        }

        public int f() {
            return this.f11916f;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final List f11917a;

        public d(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i6);
                    if (optJSONObject != null) {
                        arrayList.add(new c(optJSONObject));
                    }
                }
            }
            this.f11917a = arrayList;
        }

        public List a() {
            return this.f11917a;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final String f11918a;

        /* renamed from: b, reason: collision with root package name */
        public final String f11919b;

        /* renamed from: c, reason: collision with root package name */
        public final String f11920c;

        /* renamed from: d, reason: collision with root package name */
        public final d f11921d;

        /* renamed from: e, reason: collision with root package name */
        public final List f11922e;

        /* renamed from: f, reason: collision with root package name */
        public final a f11923f;

        public e(JSONObject jSONObject) {
            this.f11918a = jSONObject.optString("basePlanId");
            String optString = jSONObject.optString("offerId");
            this.f11919b = true == optString.isEmpty() ? null : optString;
            this.f11920c = jSONObject.getString("offerIdToken");
            this.f11921d = new d(jSONObject.getJSONArray("pricingPhases"));
            JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f11923f = optJSONObject != null ? new a(optJSONObject) : null;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (optJSONObject2 != null) {
                optJSONObject2.getString("productId");
                optJSONObject2.optString(com.amazon.a.a.o.b.f11189S);
                optJSONObject2.optString(com.amazon.a.a.h.a.f10906a);
                optJSONObject2.optString(com.amazon.a.a.o.b.f11199c);
                optJSONObject2.optString("basePlanId");
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("pricingPhase");
                if (optJSONObject3 != null) {
                    new c(optJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            if (optJSONArray != null) {
                for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                    arrayList.add(optJSONArray.getString(i6));
                }
            }
            this.f11922e = arrayList;
        }

        public String a() {
            return this.f11918a;
        }

        public a b() {
            return this.f11923f;
        }

        public String c() {
            return this.f11919b;
        }

        public List d() {
            return this.f11922e;
        }

        public String e() {
            return this.f11920c;
        }

        public d f() {
            return this.f11921d;
        }
    }

    public f(String str) {
        this.f11892a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f11893b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f11894c = optString;
        String optString2 = jSONObject.optString("type");
        this.f11895d = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(optString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f11896e = jSONObject.optString(com.amazon.a.a.o.b.f11189S);
        this.f11897f = jSONObject.optString(com.amazon.a.a.h.a.f10906a);
        this.f11898g = jSONObject.optString(com.amazon.a.a.o.b.f11199c);
        jSONObject.optString("packageDisplayName");
        jSONObject.optString(com.amazon.a.a.o.b.f11206j);
        this.f11899h = jSONObject.optString("skuDetailsToken");
        this.f11900i = jSONObject.optString("serializedDocid");
        JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                arrayList.add(new e(optJSONArray.getJSONObject(i6)));
            }
            this.f11901j = arrayList;
        } else {
            this.f11901j = (optString2.equals("subs") || optString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject optJSONObject = this.f11893b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray optJSONArray2 = this.f11893b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray2 != null) {
            for (int i7 = 0; i7 < optJSONArray2.length(); i7++) {
                arrayList2.add(new b(optJSONArray2.getJSONObject(i7)));
            }
            this.f11902k = arrayList2;
            return;
        }
        if (optJSONObject == null) {
            this.f11902k = null;
        } else {
            arrayList2.add(new b(optJSONObject));
            this.f11902k = arrayList2;
        }
    }

    public String a() {
        return this.f11898g;
    }

    public String b() {
        return this.f11897f;
    }

    public b c() {
        List list = this.f11902k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) this.f11902k.get(0);
    }

    public String d() {
        return this.f11894c;
    }

    public String e() {
        return this.f11895d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return TextUtils.equals(this.f11892a, ((f) obj).f11892a);
        }
        return false;
    }

    public List f() {
        return this.f11901j;
    }

    public String g() {
        return this.f11896e;
    }

    public final String h() {
        return this.f11893b.optString("packageName");
    }

    public int hashCode() {
        return this.f11892a.hashCode();
    }

    public final String i() {
        return this.f11899h;
    }

    public String j() {
        return this.f11900i;
    }

    public final List k() {
        return this.f11902k;
    }

    public String toString() {
        List list = this.f11901j;
        return "ProductDetails{jsonString='" + this.f11892a + "', parsedJson=" + this.f11893b.toString() + ", productId='" + this.f11894c + "', productType='" + this.f11895d + "', title='" + this.f11896e + "', productDetailsToken='" + this.f11899h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }
}
