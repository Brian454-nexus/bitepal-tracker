package y;

import E.j;
import F.AbstractC0335i0;
import I.InterfaceC0455u;
import I.P;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x.C2253a;

/* renamed from: y.h0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2306h0 {

    /* renamed from: y.h0$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static CaptureRequest.Builder a(@NonNull CameraDevice cameraDevice, @NonNull TotalCaptureResult totalCaptureResult) {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    public static void a(I.N n6, CaptureRequest.Builder builder) {
        E.j d6 = j.a.f(n6.f()).d();
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
        if (d6.h(C2253a.X(key)) || n6.e().equals(I.O0.f2327a)) {
            return;
        }
        builder.set(key, n6.e());
    }

    public static void b(CaptureRequest.Builder builder, I.P p6) {
        E.j d6 = j.a.f(p6).d();
        for (P.a aVar : d6.c()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.d();
            try {
                builder.set(key, d6.b(aVar));
            } catch (IllegalArgumentException unused) {
                AbstractC0335i0.c("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static CaptureRequest c(I.N n6, CameraDevice cameraDevice, Map map) {
        CaptureRequest.Builder createCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List e6 = e(n6.g(), map);
        if (e6.isEmpty()) {
            return null;
        }
        InterfaceC0455u d6 = n6.d();
        if (n6.i() == 5 && d6 != null && (d6.g() instanceof TotalCaptureResult)) {
            AbstractC0335i0.a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            createCaptureRequest = a.a(cameraDevice, (TotalCaptureResult) d6.g());
        } else {
            AbstractC0335i0.a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            createCaptureRequest = cameraDevice.createCaptureRequest(n6.i());
        }
        b(createCaptureRequest, n6.f());
        a(n6, createCaptureRequest);
        I.P f6 = n6.f();
        P.a aVar = I.N.f2293i;
        if (f6.h(aVar)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) n6.f().b(aVar));
        }
        I.P f7 = n6.f();
        P.a aVar2 = I.N.f2294j;
        if (f7.h(aVar2)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) n6.f().b(aVar2)).byteValue()));
        }
        Iterator it = e6.iterator();
        while (it.hasNext()) {
            createCaptureRequest.addTarget((Surface) it.next());
        }
        createCaptureRequest.setTag(n6.h());
        return createCaptureRequest.build();
    }

    public static CaptureRequest d(I.N n6, CameraDevice cameraDevice) {
        if (cameraDevice == null) {
            return null;
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(n6.i());
        b(createCaptureRequest, n6.f());
        return createCaptureRequest.build();
    }

    public static List e(List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) map.get((I.W) it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        return arrayList;
    }
}
