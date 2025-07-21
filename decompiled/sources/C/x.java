package C;

import B.C0292i;
import C.x;
import I.G0;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l0.AbstractC1728c;
import y.InterfaceC2301f1;
import y.O;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f415a;

    /* renamed from: c, reason: collision with root package name */
    public final D6.g f417c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC1728c.a f418d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f419e;

    /* renamed from: b, reason: collision with root package name */
    public final Object f416b = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f420f = new a();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends CameraCaptureSession.CaptureCallback {
        public a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i6) {
            AbstractC1728c.a aVar = x.this.f418d;
            if (aVar != null) {
                aVar.d();
                x.this.f418d = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j6, long j7) {
            AbstractC1728c.a aVar = x.this.f418d;
            if (aVar != null) {
                aVar.c(null);
                x.this.f418d = null;
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        D6.g a(CameraDevice cameraDevice, A.o oVar, List list);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        int a(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);
    }

    public x(G0 g02) {
        this.f415a = g02.a(C0292i.class);
        if (g()) {
            this.f417c = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: C.v
                @Override // l0.AbstractC1728c.InterfaceC0214c
                public final Object a(AbstractC1728c.a aVar) {
                    return x.b(x.this, aVar);
                }
            });
        } else {
            this.f417c = N.f.h(null);
        }
    }

    public static /* synthetic */ Object b(x xVar, AbstractC1728c.a aVar) {
        xVar.f418d = aVar;
        return "WaitForRepeatingRequestStart[" + xVar + "]";
    }

    public D6.g c() {
        return N.f.i(this.f417c);
    }

    public void d() {
        synchronized (this.f416b) {
            try {
                if (g() && !this.f419e) {
                    this.f417c.cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public D6.g e(final CameraDevice cameraDevice, final A.o oVar, final List list, List list2, final b bVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC2301f1) it.next()).m());
        }
        return N.d.a(N.f.m(arrayList)).f(new N.a() { // from class: C.w
            @Override // N.a
            public final D6.g apply(Object obj) {
                D6.g a6;
                a6 = x.b.this.a(cameraDevice, oVar, list);
                return a6;
            }
        }, M.c.b());
    }

    public int f(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, c cVar) {
        int a6;
        synchronized (this.f416b) {
            try {
                if (g()) {
                    captureCallback = O.b(this.f420f, captureCallback);
                    this.f419e = true;
                }
                a6 = cVar.a(captureRequest, captureCallback);
            } catch (Throwable th) {
                throw th;
            }
        }
        return a6;
    }

    public boolean g() {
        return this.f415a;
    }
}
