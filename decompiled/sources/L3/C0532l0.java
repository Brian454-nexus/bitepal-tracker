package L3;

import java.util.Objects;
import org.json.JSONObject;

/* renamed from: L3.l0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0532l0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3290a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3291b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3292c;

    public /* synthetic */ C0532l0(JSONObject jSONObject, I0 i02) {
        this.f3290a = jSONObject.optString("productId");
        this.f3291b = jSONObject.optString("productType");
        String optString = jSONObject.optString("offerToken");
        this.f3292c = true == optString.isEmpty() ? null : optString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0532l0)) {
            return false;
        }
        C0532l0 c0532l0 = (C0532l0) obj;
        return this.f3290a.equals(c0532l0.f3290a) && this.f3291b.equals(c0532l0.f3291b) && Objects.equals(this.f3292c, c0532l0.f3292c);
    }

    public final int hashCode() {
        return Objects.hash(this.f3290a, this.f3291b, this.f3292c);
    }

    public final String toString() {
        return String.format("{id: %s, type: %s, offer token: %s}", this.f3290a, this.f3291b, this.f3292c);
    }
}
