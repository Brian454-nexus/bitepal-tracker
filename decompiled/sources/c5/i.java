package c5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import k.AbstractC1653a;
import n0.AbstractC1809a;
import o.C1833c;
import p0.AbstractC1892f;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f10763a = true;

    public static Drawable a(Context context, int i6, Resources.Theme theme) {
        return c(context, context, i6, theme);
    }

    public static Drawable b(Context context, Context context2, int i6) {
        return c(context, context2, i6, null);
    }

    public static Drawable c(Context context, Context context2, int i6, Resources.Theme theme) {
        try {
            if (f10763a) {
                return e(context2, i6, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e6) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e6;
            }
            return AbstractC1809a.getDrawable(context2, i6);
        } catch (NoClassDefFoundError unused2) {
            f10763a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i6, theme);
    }

    public static Drawable d(Context context, int i6, Resources.Theme theme) {
        return AbstractC1892f.d(context.getResources(), i6, theme);
    }

    public static Drawable e(Context context, int i6, Resources.Theme theme) {
        if (theme != null) {
            C1833c c1833c = new C1833c(context, theme);
            c1833c.a(theme.getResources().getConfiguration());
            context = c1833c;
        }
        return AbstractC1653a.b(context, i6);
    }
}
