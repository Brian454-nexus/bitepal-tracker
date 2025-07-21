package z;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;
import z.C2363B;

/* renamed from: z.B, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2363B {

    /* renamed from: a, reason: collision with root package name */
    public final a f21283a;

    /* renamed from: z.B$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(A.o oVar);
    }

    /* renamed from: z.B$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        public final CameraDevice.StateCallback f21284a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f21285b;

        public b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f21285b = executor;
            this.f21284a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(final CameraDevice cameraDevice) {
            this.f21285b.execute(new Runnable() { // from class: z.C
                @Override // java.lang.Runnable
                public final void run() {
                    C2363B.b.this.f21284a.onClosed(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.f21285b.execute(new Runnable() { // from class: z.E
                @Override // java.lang.Runnable
                public final void run() {
                    C2363B.b.this.f21284a.onDisconnected(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(final CameraDevice cameraDevice, final int i6) {
            this.f21285b.execute(new Runnable() { // from class: z.D
                @Override // java.lang.Runnable
                public final void run() {
                    C2363B.b.this.f21284a.onError(cameraDevice, i6);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            this.f21285b.execute(new Runnable() { // from class: z.F
                @Override // java.lang.Runnable
                public final void run() {
                    C2363B.b.this.f21284a.onOpened(cameraDevice);
                }
            });
        }
    }

    public C2363B(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f21283a = new I(cameraDevice);
        } else {
            this.f21283a = H.e(cameraDevice, handler);
        }
    }

    public static C2363B b(CameraDevice cameraDevice, Handler handler) {
        return new C2363B(cameraDevice, handler);
    }

    public void a(A.o oVar) {
        this.f21283a.a(oVar);
    }
}
