package z0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* renamed from: z0.p, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2430p {

    /* renamed from: z0.p$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static MenuItem a(MenuItem menuItem, char c6, int i6) {
            return menuItem.setAlphabeticShortcut(c6, i6);
        }

        public static MenuItem b(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        public static MenuItem c(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        public static MenuItem d(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        public static MenuItem e(MenuItem menuItem, char c6, int i6) {
            return menuItem.setNumericShortcut(c6, i6);
        }

        public static MenuItem f(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    public static void a(MenuItem menuItem, char c6, int i6) {
        if (menuItem instanceof s0.b) {
            ((s0.b) menuItem).setAlphabeticShortcut(c6, i6);
        } else {
            a.a(menuItem, c6, i6);
        }
    }

    public static void b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof s0.b) {
            ((s0.b) menuItem).setContentDescription(charSequence);
        } else {
            a.b(menuItem, charSequence);
        }
    }

    public static void c(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof s0.b) {
            ((s0.b) menuItem).setIconTintList(colorStateList);
        } else {
            a.c(menuItem, colorStateList);
        }
    }

    public static void d(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof s0.b) {
            ((s0.b) menuItem).setIconTintMode(mode);
        } else {
            a.d(menuItem, mode);
        }
    }

    public static void e(MenuItem menuItem, char c6, int i6) {
        if (menuItem instanceof s0.b) {
            ((s0.b) menuItem).setNumericShortcut(c6, i6);
        } else {
            a.e(menuItem, c6, i6);
        }
    }

    public static void f(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof s0.b) {
            ((s0.b) menuItem).setTooltipText(charSequence);
        } else {
            a.f(menuItem, charSequence);
        }
    }
}
