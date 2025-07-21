package z;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class O extends S {
    public O(Context context) {
        super(context, null);
    }

    public static O i(Context context) {
        return new O(context);
    }

    public static boolean k(Throwable th) {
        StackTraceElement[] stackTrace;
        if (!th.getClass().equals(RuntimeException.class) || (stackTrace = th.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    @Override // z.S, z.N.b
    public void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f21309a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // z.S, z.N.b
    public void b(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f21309a.unregisterAvailabilityCallback(availabilityCallback);
    }

    @Override // z.S, z.N.b
    public CameraCharacteristics c(String str) {
        try {
            return super.c(str);
        } catch (RuntimeException e6) {
            if (j(e6)) {
                l(e6);
            }
            throw e6;
        }
    }

    @Override // z.S, z.N.b
    public void f(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f21309a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e6) {
            throw C2375g.e(e6);
        } catch (IllegalArgumentException e7) {
        } catch (SecurityException e8) {
            throw e8;
        } catch (RuntimeException e9) {
            if (j(e9)) {
                l(e9);
            }
            throw e9;
        }
    }

    public final boolean j(Throwable th) {
        return Build.VERSION.SDK_INT == 28 && k(th);
    }

    public final void l(Throwable th) {
        throw new C2375g(10001, th);
    }
}
