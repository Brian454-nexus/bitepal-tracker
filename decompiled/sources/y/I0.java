package y;

import F.InterfaceC0341m;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import java.util.concurrent.Executor;
import l0.AbstractC1728c;
import x.C2253a;
import y.C2331u;
import z.C2362A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class I0 {

    /* renamed from: a, reason: collision with root package name */
    public final C2331u f20744a;

    /* renamed from: b, reason: collision with root package name */
    public final J0 f20745b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f20746c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20747d = false;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC1728c.a f20748e;

    /* renamed from: f, reason: collision with root package name */
    public C2331u.c f20749f;

    public I0(C2331u c2331u, C2362A c2362a, Executor executor) {
        this.f20744a = c2331u;
        this.f20745b = new J0(c2362a, 0);
        this.f20746c = executor;
    }

    public static /* synthetic */ void a(I0 i02, final AbstractC1728c.a aVar, final int i6) {
        if (!i02.f20747d) {
            i02.f20745b.e(0);
            aVar.f(new InterfaceC0341m.a("Camera is not active."));
            return;
        }
        i02.d();
        y0.g.i(i02.f20748e == null, "mRunningCompleter should be null when starting set a new exposure compensation value");
        y0.g.i(i02.f20749f == null, "mRunningCaptureResultListener should be null when starting set a new exposure compensation value");
        C2331u.c cVar = new C2331u.c() { // from class: y.H0
            @Override // y.C2331u.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return I0.c(i6, aVar, totalCaptureResult);
            }
        };
        i02.f20749f = cVar;
        i02.f20748e = aVar;
        i02.f20744a.w(cVar);
        i02.f20744a.f0();
    }

    public static /* synthetic */ Object b(final I0 i02, final int i6, final AbstractC1728c.a aVar) {
        i02.f20746c.execute(new Runnable() { // from class: y.G0
            @Override // java.lang.Runnable
            public final void run() {
                I0.a(I0.this, aVar, i6);
            }
        });
        return "setExposureCompensationIndex[" + i6 + "]";
    }

    public static /* synthetic */ boolean c(int i6, AbstractC1728c.a aVar, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        if (num == null || num2 == null) {
            if (num2 == null || num2.intValue() != i6) {
                return false;
            }
            aVar.c(Integer.valueOf(i6));
            return true;
        }
        int intValue = num.intValue();
        if ((intValue != 2 && intValue != 3 && intValue != 4) || num2.intValue() != i6) {
            return false;
        }
        aVar.c(Integer.valueOf(i6));
        return true;
    }

    public static F.D e(C2362A c2362a) {
        return new J0(c2362a, 0);
    }

    public final void d() {
        AbstractC1728c.a aVar = this.f20748e;
        if (aVar != null) {
            aVar.f(new InterfaceC0341m.a("Cancelled by another setExposureCompensationIndex()"));
            this.f20748e = null;
        }
        C2331u.c cVar = this.f20749f;
        if (cVar != null) {
            this.f20744a.W(cVar);
            this.f20749f = null;
        }
    }

    public F.D f() {
        return this.f20745b;
    }

    public void g(boolean z6) {
        if (z6 == this.f20747d) {
            return;
        }
        this.f20747d = z6;
        if (z6) {
            return;
        }
        this.f20745b.e(0);
        d();
    }

    public void h(C2253a.C0269a c0269a) {
        c0269a.d(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f20745b.c()));
    }

    public D6.g i(final int i6) {
        if (!this.f20745b.d()) {
            return N.f.f(new IllegalArgumentException("ExposureCompensation is not supported"));
        }
        Range a6 = this.f20745b.a();
        if (a6.contains((Range) Integer.valueOf(i6))) {
            this.f20745b.e(i6);
            return N.f.i(AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: y.F0
                @Override // l0.AbstractC1728c.InterfaceC0214c
                public final Object a(AbstractC1728c.a aVar) {
                    return I0.b(I0.this, i6, aVar);
                }
            }));
        }
        return N.f.f(new IllegalArgumentException("Requested ExposureCompensation " + i6 + " is not within valid range [" + a6.getUpper() + ".." + a6.getLower() + "]"));
    }
}
