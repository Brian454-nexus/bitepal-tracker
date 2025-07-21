package z;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: z.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2375g extends Exception {

    /* renamed from: c, reason: collision with root package name */
    public static final Set f21319c = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* renamed from: d, reason: collision with root package name */
    public static final Set f21320d = Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));

    /* renamed from: a, reason: collision with root package name */
    public final int f21321a;

    /* renamed from: b, reason: collision with root package name */
    public final CameraAccessException f21322b;

    public C2375g(int i6, String str, Throwable th) {
        super(a(i6, str), th);
        this.f21321a = i6;
        this.f21322b = f21319c.contains(Integer.valueOf(i6)) ? new CameraAccessException(i6, str, th) : null;
    }

    public static String a(int i6, String str) {
        return String.format("%s (%d): %s", c(i6), Integer.valueOf(i6), str);
    }

    public static String b(int i6) {
        if (i6 == 1) {
            return "The camera is disabled due to a device policy, and cannot be opened.";
        }
        if (i6 == 2) {
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        if (i6 == 3) {
            return "The camera device is currently in the error state; no further calls to it will succeed.";
        }
        if (i6 == 4) {
            return "The camera device is in use already";
        }
        if (i6 == 5) {
            return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
        }
        if (i6 == 10001) {
            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
        }
        if (i6 != 10002) {
            return null;
        }
        return "Failed to create CameraCharacteristics.";
    }

    public static String c(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? i6 != 5 ? i6 != 1000 ? i6 != 10001 ? i6 != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR" : "CAMERA_UNAVAILABLE_DO_NOT_DISTURB" : "CAMERA_DEPRECATED_HAL" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE" : "CAMERA_ERROR" : "CAMERA_DISCONNECTED" : "CAMERA_DISABLED";
    }

    public static C2375g e(CameraAccessException cameraAccessException) {
        if (cameraAccessException != null) {
            return new C2375g(cameraAccessException);
        }
        throw new NullPointerException("cameraAccessException should not be null");
    }

    public final int d() {
        return this.f21321a;
    }

    public C2375g(int i6, Throwable th) {
        super(b(i6), th);
        this.f21321a = i6;
        this.f21322b = f21319c.contains(Integer.valueOf(i6)) ? new CameraAccessException(i6, null, th) : null;
    }

    public C2375g(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f21321a = cameraAccessException.getReason();
        this.f21322b = cameraAccessException;
    }
}
