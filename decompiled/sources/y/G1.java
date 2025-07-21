package y;

import F.AbstractC0335i0;
import I.AbstractC0442n;
import I.C0445o0;
import I.InterfaceC0443n0;
import I.L0;
import S.c;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import z.C2362A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class G1 implements C1 {

    /* renamed from: a, reason: collision with root package name */
    public final C2362A f20727a;

    /* renamed from: b, reason: collision with root package name */
    public final S.f f20728b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20729c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20730d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20731e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20732f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.camera.core.f f20733g;

    /* renamed from: h, reason: collision with root package name */
    public AbstractC0442n f20734h;

    /* renamed from: i, reason: collision with root package name */
    public I.W f20735i;

    /* renamed from: j, reason: collision with root package name */
    public ImageWriter f20736j;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends CameraCaptureSession.StateCallback {
        public a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                G1.this.f20736j = P.a.c(inputSurface, 1);
            }
        }
    }

    public G1(C2362A c2362a) {
        this.f20731e = false;
        this.f20732f = false;
        this.f20727a = c2362a;
        this.f20731e = H1.a(c2362a, 4);
        this.f20732f = B.l.a(B.K.class) != null;
        this.f20728b = new S.f(3, new c.a() { // from class: y.D1
            @Override // S.c.a
            public final void a(Object obj) {
                ((androidx.camera.core.d) obj).close();
            }
        });
    }

    public static /* synthetic */ void h(G1 g12, InterfaceC0443n0 interfaceC0443n0) {
        g12.getClass();
        try {
            androidx.camera.core.d acquireLatestImage = interfaceC0443n0.acquireLatestImage();
            if (acquireLatestImage != null) {
                g12.f20728b.b(acquireLatestImage);
            }
        } catch (IllegalStateException e6) {
            AbstractC0335i0.c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e6.getMessage());
        }
    }

    @Override // y.C1
    public void a(L0.b bVar) {
        j();
        if (this.f20729c || this.f20732f) {
            return;
        }
        Map k6 = k(this.f20727a);
        if (this.f20731e && !k6.isEmpty() && k6.containsKey(34) && l(this.f20727a, 34)) {
            Size size = (Size) k6.get(34);
            androidx.camera.core.e eVar = new androidx.camera.core.e(size.getWidth(), size.getHeight(), 34, 9);
            this.f20734h = eVar.l();
            this.f20733g = new androidx.camera.core.f(eVar);
            eVar.d(new InterfaceC0443n0.a() { // from class: y.E1
                @Override // I.InterfaceC0443n0.a
                public final void a(InterfaceC0443n0 interfaceC0443n0) {
                    G1.h(G1.this, interfaceC0443n0);
                }
            }, M.c.d());
            C0445o0 c0445o0 = new C0445o0(this.f20733g.getSurface(), new Size(this.f20733g.getWidth(), this.f20733g.getHeight()), 34);
            this.f20735i = c0445o0;
            androidx.camera.core.f fVar = this.f20733g;
            D6.g k7 = c0445o0.k();
            Objects.requireNonNull(fVar);
            k7.c(new F1(fVar), M.c.e());
            bVar.l(this.f20735i);
            bVar.d(this.f20734h);
            bVar.k(new a());
            bVar.v(new InputConfiguration(this.f20733g.getWidth(), this.f20733g.getHeight(), this.f20733g.b()));
        }
    }

    @Override // y.C1
    public boolean b() {
        return this.f20729c;
    }

    @Override // y.C1
    public boolean c() {
        return this.f20730d;
    }

    @Override // y.C1
    public void d(boolean z6) {
        this.f20730d = z6;
    }

    @Override // y.C1
    public void e(boolean z6) {
        this.f20729c = z6;
    }

    @Override // y.C1
    public androidx.camera.core.d f() {
        try {
            return (androidx.camera.core.d) this.f20728b.a();
        } catch (NoSuchElementException unused) {
            AbstractC0335i0.c("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override // y.C1
    public boolean g(androidx.camera.core.d dVar) {
        Image X5 = dVar.X();
        ImageWriter imageWriter = this.f20736j;
        if (imageWriter != null && X5 != null) {
            try {
                P.a.d(imageWriter, X5);
                return true;
            } catch (IllegalStateException e6) {
                AbstractC0335i0.c("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e6.getMessage());
            }
        }
        return false;
    }

    public final void j() {
        S.f fVar = this.f20728b;
        while (!fVar.isEmpty()) {
            ((androidx.camera.core.d) fVar.a()).close();
        }
        I.W w6 = this.f20735i;
        if (w6 != null) {
            androidx.camera.core.f fVar2 = this.f20733g;
            if (fVar2 != null) {
                w6.k().c(new F1(fVar2), M.c.e());
                this.f20733g = null;
            }
            w6.d();
            this.f20735i = null;
        }
        ImageWriter imageWriter = this.f20736j;
        if (imageWriter != null) {
            imageWriter.close();
            this.f20736j = null;
        }
    }

    public final Map k(C2362A c2362a) {
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) c2362a.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e6) {
            AbstractC0335i0.c("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e6.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        for (int i6 : streamConfigurationMap.getInputFormats()) {
            Size[] inputSizes = streamConfigurationMap.getInputSizes(i6);
            if (inputSizes != null) {
                Arrays.sort(inputSizes, new L.e(true));
                hashMap.put(Integer.valueOf(i6), inputSizes[0]);
            }
        }
        return hashMap;
    }

    public final boolean l(C2362A c2362a, int i6) {
        int[] validOutputFormatsForInput;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c2362a.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(i6)) == null) {
            return false;
        }
        for (int i7 : validOutputFormatsForInput) {
            if (i7 == 256) {
                return true;
            }
        }
        return false;
    }
}
