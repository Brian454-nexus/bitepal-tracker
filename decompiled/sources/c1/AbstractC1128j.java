package c1;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;

/* renamed from: c1.j, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1128j {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f10597a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f10598b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f10599c = {12445, 13120, 12344, 12344};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f10600d = {12445, 13632, 12344, 12344};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f10601e = {12344};

    /* renamed from: c1.j$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static void a() {
        StringBuilder sb = new StringBuilder();
        boolean z6 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z6) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z6 = true;
        }
        if (z6) {
            throw new a(sb.toString());
        }
    }

    public static void b(boolean z6, String str) {
        if (!z6) {
            throw new a(str);
        }
    }

    public static boolean c(String str) {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }

    public static boolean d(Context context) {
        int i6 = AbstractC1117K.f10560a;
        if (i6 < 24) {
            return false;
        }
        if (i6 < 26 && ("samsung".equals(AbstractC1117K.f10562c) || "XT1650".equals(AbstractC1117K.f10563d))) {
            return false;
        }
        if (i6 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return c("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean e() {
        return c("EGL_KHR_surfaceless_context");
    }
}
