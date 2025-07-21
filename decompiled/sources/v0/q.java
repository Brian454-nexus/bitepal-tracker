package v0;

import android.content.Context;
import android.os.UserManager;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class q {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static boolean a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean a(Context context) {
        return a.a(context);
    }
}
