package L3;

import org.json.JSONObject;

/* renamed from: L3.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0519f {

    /* renamed from: a, reason: collision with root package name */
    public final String f3276a;

    public C0519f(String str) {
        this.f3276a = new JSONObject(str).optString("externalTransactionToken");
    }

    public String a() {
        return this.f3276a;
    }
}
