package l1;

import c1.AbstractC1117K;
import c1.AbstractC1133o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1731a {
    public static byte[] a(byte[] bArr) {
        return AbstractC1117K.f10560a >= 27 ? bArr : AbstractC1117K.s0(c(AbstractC1117K.I(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (AbstractC1117K.f10560a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(AbstractC1117K.I(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                if (i6 != 0) {
                    sb.append(com.amazon.a.a.o.b.f.f11248a);
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i6);
                sb.append("{\"k\":\"");
                sb.append(d(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(d(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return AbstractC1117K.s0(sb.toString());
        } catch (JSONException e6) {
            AbstractC1133o.d("ClearKeyUtil", "Failed to adjust response data: " + AbstractC1117K.I(bArr), e6);
            return bArr;
        }
    }

    public static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    public static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
