package z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
import androidx.annotation.NonNull;

/* renamed from: z.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2372d {
    @NonNull
    public static <T> OutputConfiguration a(@NonNull Size size, @NonNull Class<T> cls) {
        return new OutputConfiguration(size, cls);
    }

    public static void b(@NonNull CameraCaptureSession.StateCallback stateCallback, @NonNull CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}
