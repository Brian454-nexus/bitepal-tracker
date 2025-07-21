package S4;

import android.net.Uri;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b {
    public static boolean a(Uri uri) {
        return c(uri) && uri.getPathSegments().contains("picker");
    }

    public static boolean b(Uri uri) {
        return c(uri) && !f(uri);
    }

    public static boolean c(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean d(Uri uri) {
        return c(uri) && f(uri);
    }

    public static boolean e(int i6, int i7) {
        return i6 != Integer.MIN_VALUE && i7 != Integer.MIN_VALUE && i6 <= 512 && i7 <= 384;
    }

    public static boolean f(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
