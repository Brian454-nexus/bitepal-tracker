package L3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: L3.z, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0558z {

    /* renamed from: a, reason: collision with root package name */
    public final String f3310a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f3311b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3312c;

    /* renamed from: L3.z$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f3313a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3314b;

        /* renamed from: c, reason: collision with root package name */
        public final String f3315c;

        public String a() {
            return this.f3313a;
        }

        public String b() {
            return this.f3315c;
        }

        public String c() {
            return this.f3314b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3313a.equals(aVar.a()) && this.f3314b.equals(aVar.c()) && Objects.equals(this.f3315c, aVar.b());
        }

        public int hashCode() {
            return Objects.hash(this.f3313a, this.f3314b, this.f3315c);
        }

        public String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", this.f3313a, this.f3314b, this.f3315c);
        }

        public a(JSONObject jSONObject) {
            this.f3313a = jSONObject.optString("productId");
            this.f3314b = jSONObject.optString("productType");
            String optString = jSONObject.optString("offerToken");
            this.f3315c = true == optString.isEmpty() ? null : optString;
        }
    }

    public C0558z(String str) {
        this.f3310a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f3311b = jSONObject;
        this.f3312c = d(jSONObject.optJSONArray("products"));
    }

    public static List d(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i6);
                if (optJSONObject != null) {
                    arrayList.add(new a(optJSONObject));
                }
            }
        }
        return arrayList;
    }

    public String a() {
        return this.f3311b.optString("externalTransactionToken");
    }

    public String b() {
        String optString = this.f3311b.optString("originalExternalTransactionId");
        if (optString.isEmpty()) {
            return null;
        }
        return optString;
    }

    public List c() {
        return this.f3312c;
    }
}
