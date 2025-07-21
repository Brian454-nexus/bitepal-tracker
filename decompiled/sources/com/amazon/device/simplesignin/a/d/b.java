package com.amazon.device.simplesignin.a.d;

import com.amazon.device.simplesignin.model.Link;
import com.amazon.device.simplesignin.model.Token;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11801a = "b";

    private b() {
    }

    public static List<Link> a(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str2);
            if (jSONArray.length() == 0) {
                a.a(f11801a, "No links available, links object received is empty.");
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                try {
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i6);
                    Link link = new Link();
                    link.setAmazonUserId(str);
                    link.setIdentityProviderName(jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f11737z));
                    link.setLinkId(jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f11736y));
                    link.setPartnerUserId(jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f11700A));
                    link.setLinkedTimestamp(jSONObject.getLong(com.amazon.device.simplesignin.a.a.a.f11701B));
                    Token token = new Token();
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f11702C));
                    token.setToken(jSONObject2.getString("token"));
                    token.setSchema(jSONObject2.getString(com.amazon.device.simplesignin.a.a.a.f11704E));
                    link.setSsiToken(token);
                    arrayList.add(link);
                } catch (JSONException e6) {
                    a.b(f11801a, "Failure generating Link object from response." + e6);
                    return null;
                }
            }
            return arrayList;
        } catch (JSONException e7) {
            a.b(f11801a, "Failure generating Link object from Kiwi response." + e7);
            return null;
        }
    }

    public static String a(String str) {
        try {
            return new JSONObject(str).getString(com.amazon.device.simplesignin.a.a.a.f11736y);
        } catch (JSONException e6) {
            a.b(f11801a, "Failure extracting Link ID object from response." + e6);
            return null;
        }
    }
}
