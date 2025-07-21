package v;

import android.os.Bundle;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2156a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f19254a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f19255b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f19256c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f19257d;

    /* renamed from: v.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0252a {

        /* renamed from: a, reason: collision with root package name */
        public Integer f19258a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f19259b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f19260c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f19261d;

        public C2156a a() {
            return new C2156a(this.f19258a, this.f19259b, this.f19260c, this.f19261d);
        }
    }

    public C2156a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f19254a = num;
        this.f19255b = num2;
        this.f19256c = num3;
        this.f19257d = num4;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f19254a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f19255b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f19256c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f19257d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
