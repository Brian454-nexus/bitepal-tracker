package C3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f722c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f723a;

    /* renamed from: b, reason: collision with root package name */
    public final String f724b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            return new d(jsonObject.optString("source_name", null), jsonObject.optString("source_version", null));
        }

        public a() {
        }
    }

    public d(String str, String str2) {
        this.f723a = str;
        this.f724b = str2;
    }

    public final d a() {
        return new d(this.f723a, this.f724b);
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f723a;
            if (str != null && str.length() != 0) {
                jSONObject.put("source_name", this.f723a);
            }
            String str2 = this.f724b;
            if (str2 != null && str2.length() != 0) {
                jSONObject.put("source_version", this.f724b);
            }
            return jSONObject;
        } catch (JSONException unused) {
            A3.a.f196b.a().a("JSON Serialization of ingestion metadata object failed");
            return jSONObject;
        }
    }
}
