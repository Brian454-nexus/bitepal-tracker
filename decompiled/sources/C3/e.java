package C3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class e {

    /* renamed from: e, reason: collision with root package name */
    public static final a f725e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f726a;

    /* renamed from: b, reason: collision with root package name */
    public final String f727b;

    /* renamed from: c, reason: collision with root package name */
    public final String f728c;

    /* renamed from: d, reason: collision with root package name */
    public final String f729d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            return new e(jsonObject.optString("branch", null), jsonObject.optString("source", null), jsonObject.optString("version", null), jsonObject.optString("versionId", null));
        }

        public a() {
        }
    }

    public e(String str, String str2, String str3, String str4) {
        this.f726a = str;
        this.f727b = str2;
        this.f728c = str3;
        this.f729d = str4;
    }

    public final e a() {
        return new e(this.f726a, this.f727b, this.f728c, this.f729d);
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f726a;
            if (str != null && str.length() != 0) {
                jSONObject.put("branch", this.f726a);
            }
            String str2 = this.f727b;
            if (str2 != null && str2.length() != 0) {
                jSONObject.put("source", this.f727b);
            }
            String str3 = this.f728c;
            if (str3 != null && str3.length() != 0) {
                jSONObject.put("version", this.f728c);
            }
            String str4 = this.f729d;
            if (str4 != null && str4.length() != 0) {
                jSONObject.put("versionId", this.f729d);
            }
            return jSONObject;
        } catch (JSONException unused) {
            A3.a.f196b.a().a("JSON Serialization of tacking plan object failed");
            return jSONObject;
        }
    }
}
