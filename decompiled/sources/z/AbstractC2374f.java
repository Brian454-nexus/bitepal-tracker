package z;

import android.hardware.camera2.CameraManager;
import androidx.annotation.NonNull;

/* renamed from: z.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2374f {
    public static void a(@NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        availabilityCallback.onCameraAccessPrioritiesChanged();
    }
}
