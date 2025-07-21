package r0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2019a {

    /* renamed from: r0.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class C0241a {
        public static void a(Drawable drawable, float f6, float f7) {
            drawable.setHotspot(f6, f7);
        }

        public static void b(Drawable drawable, int i6, int i7, int i8, int i9) {
            drawable.setHotspotBounds(i6, i7, i8, i9);
        }

        public static void c(Drawable drawable, int i6) {
            drawable.setTint(i6);
        }

        public static void d(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        public static void e(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    public static boolean a(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static void b(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void c(Drawable drawable, boolean z6) {
        drawable.setAutoMirrored(z6);
    }

    public static void d(Drawable drawable, float f6, float f7) {
        C0241a.a(drawable, f6, f7);
    }

    public static void e(Drawable drawable, int i6, int i7, int i8, int i9) {
        C0241a.b(drawable, i6, i7, i8, i9);
    }

    public static void f(Drawable drawable, int i6) {
        C0241a.c(drawable, i6);
    }

    public static void g(Drawable drawable, ColorStateList colorStateList) {
        C0241a.d(drawable, colorStateList);
    }

    public static void h(Drawable drawable, PorterDuff.Mode mode) {
        C0241a.e(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable i(Drawable drawable) {
        return drawable instanceof InterfaceC2020b ? ((InterfaceC2020b) drawable).a() : drawable;
    }

    public static Drawable j(Drawable drawable) {
        return drawable;
    }
}
