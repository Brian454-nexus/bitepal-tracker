package L3;

import org.json.JSONObject;

/* renamed from: L3.j, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0527j {

    /* renamed from: a, reason: collision with root package name */
    public final String f3284a;

    public C0527j(String str) {
        this.f3284a = new JSONObject(str).optString("countryCode");
    }

    public String a() {
        return this.f3284a;
    }
}
