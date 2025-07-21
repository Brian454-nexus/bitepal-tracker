package com.braze.models.theme;

import com.braze.support.JsonUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f12720a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f12721b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f12722c;

    public b(JSONObject buttonThemeJson) {
        Intrinsics.checkNotNullParameter(buttonThemeJson, "buttonThemeJson");
        Integer colorIntegerOrNull = JsonUtils.getColorIntegerOrNull(buttonThemeJson, "bg_color");
        Integer colorIntegerOrNull2 = JsonUtils.getColorIntegerOrNull(buttonThemeJson, "text_color");
        Integer colorIntegerOrNull3 = JsonUtils.getColorIntegerOrNull(buttonThemeJson, "border_color");
        this.f12720a = colorIntegerOrNull;
        this.f12721b = colorIntegerOrNull2;
        this.f12722c = colorIntegerOrNull3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f12720a, bVar.f12720a) && Intrinsics.areEqual(this.f12721b, bVar.f12721b) && Intrinsics.areEqual(this.f12722c, bVar.f12722c);
    }

    public final int hashCode() {
        Integer num = this.f12720a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f12721b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f12722c;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "MessageButtonTheme(backgroundColor=" + this.f12720a + ", textColor=" + this.f12721b + ", borderColor=" + this.f12722c + ')';
    }
}
