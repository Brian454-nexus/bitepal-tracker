package z;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.annotation.NonNull;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2370b {
    public static void a(@NonNull CameraCaptureSession.StateCallback stateCallback, @NonNull CameraCaptureSession cameraCaptureSession, @NonNull Surface surface) {
        stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
    }
}
