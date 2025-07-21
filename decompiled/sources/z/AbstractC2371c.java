package z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.annotation.NonNull;

/* renamed from: z.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2371c {
    public static void a(@NonNull CameraCaptureSession.CaptureCallback captureCallback, @NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j6) {
        captureCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j6);
    }
}
