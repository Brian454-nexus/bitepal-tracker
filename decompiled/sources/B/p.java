package B;

import I.F0;
import android.os.Build;
import android.util.Size;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class p implements F0 {
    public static boolean f() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean g() {
        return f();
    }

    public Size[] d(int i6) {
        return (i6 == 34 && f()) ? e() : new Size[0];
    }

    public final Size[] e() {
        return new Size[]{new Size(1920, 1080), new Size(1440, 1080), new Size(1280, 720), new Size(960, 720), new Size(864, 480), new Size(720, 480)};
    }
}
