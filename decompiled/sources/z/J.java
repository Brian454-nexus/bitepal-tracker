package z;

import F.AbstractC0335i0;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z.C2363B;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class J implements C2363B.a {

    /* renamed from: a, reason: collision with root package name */
    public final CameraDevice f21295a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21296b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f21297a;

        public a(Handler handler) {
            this.f21297a = handler;
        }
    }

    public J(CameraDevice cameraDevice, Object obj) {
        this.f21295a = (CameraDevice) y0.g.f(cameraDevice);
        this.f21296b = obj;
    }

    public static void b(CameraDevice cameraDevice, List list) {
        String id = cameraDevice.getId();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String c6 = ((A.i) it.next()).c();
            if (c6 != null && !c6.isEmpty()) {
                AbstractC0335i0.l("CameraDeviceCompat", "Camera " + id + ": Camera doesn't support physicalCameraId " + c6 + ". Ignoring.");
            }
        }
    }

    public static void c(CameraDevice cameraDevice, A.o oVar) {
        y0.g.f(cameraDevice);
        y0.g.f(oVar);
        y0.g.f(oVar.e());
        List c6 = oVar.c();
        if (c6 == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (oVar.a() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        b(cameraDevice, c6);
    }

    public static List d(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((A.i) it.next()).d());
        }
        return arrayList;
    }
}
