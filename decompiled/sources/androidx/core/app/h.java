package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class h {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }
    }

    public static v0.j a(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return v0.j.b(d.a(context));
        }
        Object b6 = b(context);
        return b6 != null ? v0.j.j(a.a(b6)) : v0.j.e();
    }

    public static Object b(Context context) {
        return context.getSystemService("locale");
    }
}
