package y;

import F.InterfaceC0341m;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import l0.AbstractC1728c;
import x.C2253a;
import y.A1;
import z.C2362A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0 implements A1.b {

    /* renamed from: a, reason: collision with root package name */
    public final C2362A f20690a;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC1728c.a f20692c;

    /* renamed from: b, reason: collision with root package name */
    public Rect f20691b = null;

    /* renamed from: d, reason: collision with root package name */
    public Rect f20693d = null;

    public C0(C2362A c2362a) {
        this.f20690a = c2362a;
    }

    public static Rect h(Rect rect, float f6) {
        float width = rect.width() / f6;
        float height = rect.height() / f6;
        float width2 = (rect.width() - width) / 2.0f;
        float height2 = (rect.height() - height) / 2.0f;
        return new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
    }

    @Override // y.A1.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f20692c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f20693d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f20692c.c(null);
            this.f20692c = null;
            this.f20693d = null;
        }
    }

    @Override // y.A1.b
    public void b(C2253a.C0269a c0269a) {
        Rect rect = this.f20691b;
        if (rect != null) {
            c0269a.d(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override // y.A1.b
    public float c() {
        Float f6 = (Float) this.f20690a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f6 == null) {
            return 1.0f;
        }
        return f6.floatValue() < d() ? d() : f6.floatValue();
    }

    @Override // y.A1.b
    public float d() {
        return 1.0f;
    }

    @Override // y.A1.b
    public Rect e() {
        Rect rect = this.f20691b;
        return rect != null ? rect : i();
    }

    @Override // y.A1.b
    public void f(float f6, AbstractC1728c.a aVar) {
        this.f20691b = h(i(), f6);
        AbstractC1728c.a aVar2 = this.f20692c;
        if (aVar2 != null) {
            aVar2.f(new InterfaceC0341m.a("There is a new zoomRatio being set"));
        }
        this.f20693d = this.f20691b;
        this.f20692c = aVar;
    }

    @Override // y.A1.b
    public void g() {
        this.f20693d = null;
        this.f20691b = null;
        AbstractC1728c.a aVar = this.f20692c;
        if (aVar != null) {
            aVar.f(new InterfaceC0341m.a("Camera is not active."));
            this.f20692c = null;
        }
    }

    public final Rect i() {
        return (Rect) y0.g.f((Rect) this.f20690a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }
}
