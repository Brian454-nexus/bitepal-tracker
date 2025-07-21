package y;

import F.InterfaceC0341m;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import l0.AbstractC1728c;
import x.C2253a;
import y.A1;
import z.C2362A;

/* renamed from: y.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2290c implements A1.b {

    /* renamed from: a, reason: collision with root package name */
    public final C2362A f20948a;

    /* renamed from: b, reason: collision with root package name */
    public final Range f20949b;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC1728c.a f20951d;

    /* renamed from: c, reason: collision with root package name */
    public float f20950c = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f20952e = 1.0f;

    public C2290c(C2362A c2362a) {
        CameraCharacteristics.Key key;
        this.f20948a = c2362a;
        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
        this.f20949b = (Range) c2362a.a(key);
    }

    @Override // y.A1.b
    public void a(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Key key;
        Float f6;
        if (this.f20951d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                f6 = null;
            } else {
                key = CaptureRequest.CONTROL_ZOOM_RATIO;
                f6 = (Float) request.get(key);
            }
            if (f6 == null) {
                return;
            }
            if (this.f20952e == f6.floatValue()) {
                this.f20951d.c(null);
                this.f20951d = null;
            }
        }
    }

    @Override // y.A1.b
    public void b(C2253a.C0269a c0269a) {
        CaptureRequest.Key key;
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        c0269a.d(key, Float.valueOf(this.f20950c));
    }

    @Override // y.A1.b
    public float c() {
        return ((Float) this.f20949b.getUpper()).floatValue();
    }

    @Override // y.A1.b
    public float d() {
        return ((Float) this.f20949b.getLower()).floatValue();
    }

    @Override // y.A1.b
    public Rect e() {
        return (Rect) y0.g.f((Rect) this.f20948a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // y.A1.b
    public void f(float f6, AbstractC1728c.a aVar) {
        this.f20950c = f6;
        AbstractC1728c.a aVar2 = this.f20951d;
        if (aVar2 != null) {
            aVar2.f(new InterfaceC0341m.a("There is a new zoomRatio being set"));
        }
        this.f20952e = this.f20950c;
        this.f20951d = aVar;
    }

    @Override // y.A1.b
    public void g() {
        this.f20950c = 1.0f;
        AbstractC1728c.a aVar = this.f20951d;
        if (aVar != null) {
            aVar.f(new InterfaceC0341m.a("Camera is not active."));
            this.f20951d = null;
        }
    }
}
