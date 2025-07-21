package com.braze.models.theme;

import com.braze.support.JsonUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f12713a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f12714b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f12715c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f12716d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f12717e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f12718f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f12719g;

    public a(JSONObject messageThemeJson) {
        Intrinsics.checkNotNullParameter(messageThemeJson, "messageThemeJson");
        Integer colorIntegerOrNull = JsonUtils.getColorIntegerOrNull(messageThemeJson, "bg_color");
        Integer colorIntegerOrNull2 = JsonUtils.getColorIntegerOrNull(messageThemeJson, "text_color");
        Integer colorIntegerOrNull3 = JsonUtils.getColorIntegerOrNull(messageThemeJson, "close_btn_color");
        Integer colorIntegerOrNull4 = JsonUtils.getColorIntegerOrNull(messageThemeJson, "icon_color");
        Integer colorIntegerOrNull5 = JsonUtils.getColorIntegerOrNull(messageThemeJson, "icon_bg_color");
        Integer colorIntegerOrNull6 = JsonUtils.getColorIntegerOrNull(messageThemeJson, "header_text_color");
        Integer colorIntegerOrNull7 = JsonUtils.getColorIntegerOrNull(messageThemeJson, "frame_color");
        this.f12713a = colorIntegerOrNull;
        this.f12714b = colorIntegerOrNull2;
        this.f12715c = colorIntegerOrNull3;
        this.f12716d = colorIntegerOrNull4;
        this.f12717e = colorIntegerOrNull5;
        this.f12718f = colorIntegerOrNull6;
        this.f12719g = colorIntegerOrNull7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f12713a, aVar.f12713a) && Intrinsics.areEqual(this.f12714b, aVar.f12714b) && Intrinsics.areEqual(this.f12715c, aVar.f12715c) && Intrinsics.areEqual(this.f12716d, aVar.f12716d) && Intrinsics.areEqual(this.f12717e, aVar.f12717e) && Intrinsics.areEqual(this.f12718f, aVar.f12718f) && Intrinsics.areEqual(this.f12719g, aVar.f12719g);
    }

    public final int hashCode() {
        Integer num = this.f12713a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f12714b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f12715c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f12716d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f12717e;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f12718f;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f12719g;
        return hashCode6 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        return "InAppMessageTheme(backgroundColor=" + this.f12713a + ", textColor=" + this.f12714b + ", closeButtonColor=" + this.f12715c + ", iconColor=" + this.f12716d + ", iconBackgroundColor=" + this.f12717e + ", headerTextColor=" + this.f12718f + ", frameColor=" + this.f12719g + ')';
    }
}
