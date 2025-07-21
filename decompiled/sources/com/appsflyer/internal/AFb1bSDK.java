package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFb1bSDK {
    public static void getCurrencyIso4217Code(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("appsflyerKey")) {
                    String string = jSONObject.getString("appsflyerKey");
                    StringBuilder sb = new StringBuilder();
                    for (int i6 = 0; i6 < string.length(); i6++) {
                        if (i6 != 0 && i6 != string.length() - 1) {
                            sb.append("*");
                        }
                        sb.append(string.charAt(i6));
                    }
                    jSONObject.put("appsflyerKey", sb.toString());
                }
                if (jSONObject.has("tcstring")) {
                    jSONObject.put("tcstring", "tcstring");
                }
                if (jSONObject.has("referrer")) {
                    jSONObject.put("referrer", "referrer");
                }
                if (jSONObject.has("pia_token")) {
                    jSONObject.put("pia_token", "pia_token");
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1vSDK aFh1vSDK = AFh1vSDK.OTHER;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(jSONObject);
                aFLogger.i(aFh1vSDK, sb2.toString());
            } catch (JSONException e6) {
                AFLogger.INSTANCE.e(AFh1vSDK.OTHER, "Not able to log the payload", e6);
            }
        }
    }
}
