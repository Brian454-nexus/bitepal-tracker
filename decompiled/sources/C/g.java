package C;

import F.AbstractC0335i0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.nio.BufferUnderflowException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class g {
    public static boolean a(c cVar) {
        return b(false, cVar);
    }

    public static boolean b(boolean z6, c cVar) {
        Boolean bool;
        try {
            bool = (Boolean) cVar.a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e6) {
            if (B.l.a(B.r.class) != null) {
                AbstractC0335i0.a("FlashAvailability", String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                AbstractC0335i0.d("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e6);
            }
            if (z6) {
                throw e6;
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            AbstractC0335i0.l("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
