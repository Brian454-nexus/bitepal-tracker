package L;

import F.AbstractC0335i0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class c {
    public static int a(int i6, int i7, boolean z6) {
        int i8 = z6 ? ((i7 - i6) + 360) % 360 : (i7 + i6) % 360;
        if (AbstractC0335i0.f("CameraOrientationUtil")) {
            AbstractC0335i0.a("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i6), Integer.valueOf(i7), Boolean.valueOf(z6), Integer.valueOf(i8)));
        }
        return i8;
    }

    public static int b(int i6) {
        if (i6 == 0) {
            return 0;
        }
        if (i6 == 1) {
            return 90;
        }
        if (i6 == 2) {
            return 180;
        }
        if (i6 == 3) {
            return 270;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i6);
    }
}
