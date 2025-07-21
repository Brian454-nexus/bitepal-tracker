package L;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import androidx.annotation.NonNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class f {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        @NonNull
        public static Context a(@NonNull Context context, String str) {
            return context.createAttributionContext(str);
        }

        public static String b(@NonNull Context context) {
            return context.getAttributionTag();
        }
    }

    public static Context a(Context context) {
        String b6;
        Context applicationContext = context.getApplicationContext();
        return (Build.VERSION.SDK_INT < 30 || (b6 = a.b(context)) == null) ? applicationContext : a.a(applicationContext, b6);
    }

    public static Application b(Context context) {
        for (Context a6 = a(context); a6 instanceof ContextWrapper; a6 = c((ContextWrapper) a6)) {
            if (a6 instanceof Application) {
                return (Application) a6;
            }
        }
        return null;
    }

    public static Context c(ContextWrapper contextWrapper) {
        String b6;
        Context baseContext = contextWrapper.getBaseContext();
        return (Build.VERSION.SDK_INT < 30 || (b6 = a.b(contextWrapper)) == null) ? baseContext : a.a(baseContext, b6);
    }
}
