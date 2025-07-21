package I;

import F.AbstractC0335i0;
import F.C0346s;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class L {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends Exception {
        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    public static void a(Context context, G g6, C0346s c0346s) {
        Integer d6;
        if (c0346s != null) {
            try {
                d6 = c0346s.d();
                if (d6 == null) {
                    AbstractC0335i0.l("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e6) {
                AbstractC0335i0.d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e6);
                return;
            }
        } else {
            d6 = null;
        }
        AbstractC0335i0.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + d6);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera")) {
                if (c0346s != null) {
                    if (d6.intValue() == 1) {
                    }
                }
                C0346s.f1478c.e(g6.a());
            }
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                if (c0346s == null || d6.intValue() == 0) {
                    C0346s.f1477b.e(g6.a());
                }
            }
        } catch (IllegalArgumentException e7) {
            AbstractC0335i0.c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + g6.a());
            throw new a("Expected camera missing from device.", e7);
        }
    }
}
