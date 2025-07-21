package z0;

import android.os.Build;
import android.view.DisplayCutout;

/* renamed from: z0.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2422h {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f21447a;

    /* renamed from: z0.h$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static int a(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public C2422h(DisplayCutout displayCutout) {
        this.f21447a = displayCutout;
    }

    public static C2422h e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C2422h(displayCutout);
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(this.f21447a);
        }
        return 0;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(this.f21447a);
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.f21447a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.f21447a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2422h.class != obj.getClass()) {
            return false;
        }
        return y0.b.a(this.f21447a, ((C2422h) obj).f21447a);
    }

    public int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f21447a;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f21447a + "}";
    }
}
