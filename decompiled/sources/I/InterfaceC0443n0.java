package I;

import android.view.Surface;
import java.util.concurrent.Executor;

/* renamed from: I.n0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC0443n0 {

    /* renamed from: I.n0$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(InterfaceC0443n0 interfaceC0443n0);
    }

    androidx.camera.core.d acquireLatestImage();

    int b();

    void c();

    void close();

    void d(a aVar, Executor executor);

    int e();

    androidx.camera.core.d f();

    int getHeight();

    Surface getSurface();

    int getWidth();
}
