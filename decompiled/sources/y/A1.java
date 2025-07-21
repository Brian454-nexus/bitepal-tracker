package y;

import F.AbstractC0335i0;
import F.InterfaceC0341m;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.lifecycle.AbstractC1065q;
import androidx.lifecycle.C1067t;
import java.util.concurrent.Executor;
import l0.AbstractC1728c;
import x.C2253a;
import y.C2331u;
import z.C2362A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class A1 {

    /* renamed from: a, reason: collision with root package name */
    public final C2331u f20665a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f20666b;

    /* renamed from: c, reason: collision with root package name */
    public final B1 f20667c;

    /* renamed from: d, reason: collision with root package name */
    public final C1067t f20668d;

    /* renamed from: e, reason: collision with root package name */
    public final b f20669e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20670f = false;

    /* renamed from: g, reason: collision with root package name */
    public C2331u.c f20671g = new a();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements C2331u.c {
        public a() {
        }

        @Override // y.C2331u.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            A1.this.f20669e.a(totalCaptureResult);
            return false;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void a(TotalCaptureResult totalCaptureResult);

        void b(C2253a.C0269a c0269a);

        float c();

        float d();

        Rect e();

        void f(float f6, AbstractC1728c.a aVar);

        void g();
    }

    public A1(C2331u c2331u, C2362A c2362a, Executor executor) {
        this.f20665a = c2331u;
        this.f20666b = executor;
        b d6 = d(c2362a);
        this.f20669e = d6;
        B1 b12 = new B1(d6.c(), d6.d());
        this.f20667c = b12;
        b12.f(1.0f);
        this.f20668d = new C1067t(O.f.f(b12));
        c2331u.w(this.f20671g);
    }

    public static /* synthetic */ Object b(final A1 a12, final F.K0 k02, final AbstractC1728c.a aVar) {
        a12.f20666b.execute(new Runnable() { // from class: y.z1
            @Override // java.lang.Runnable
            public final void run() {
                A1.this.l(aVar, k02);
            }
        });
        return "setZoomRatio";
    }

    public static b d(C2362A c2362a) {
        return i(c2362a) ? new C2290c(c2362a) : new C0(c2362a);
    }

    public static F.K0 f(C2362A c2362a) {
        b d6 = d(c2362a);
        B1 b12 = new B1(d6.c(), d6.d());
        b12.f(1.0f);
        return O.f.f(b12);
    }

    public static Range g(C2362A c2362a) {
        CameraCharacteristics.Key key;
        try {
            key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            return (Range) c2362a.a(key);
        } catch (AssertionError e6) {
            AbstractC0335i0.m("ZoomControl", "AssertionError, fail to get camera characteristic.", e6);
            return null;
        }
    }

    public static boolean i(C2362A c2362a) {
        return Build.VERSION.SDK_INT >= 30 && g(c2362a) != null;
    }

    public void c(C2253a.C0269a c0269a) {
        this.f20669e.b(c0269a);
    }

    public Rect e() {
        return this.f20669e.e();
    }

    public AbstractC1065q h() {
        return this.f20668d;
    }

    public void j(boolean z6) {
        F.K0 f6;
        if (this.f20670f == z6) {
            return;
        }
        this.f20670f = z6;
        if (z6) {
            return;
        }
        synchronized (this.f20667c) {
            this.f20667c.f(1.0f);
            f6 = O.f.f(this.f20667c);
        }
        m(f6);
        this.f20669e.g();
        this.f20665a.f0();
    }

    public D6.g k(float f6) {
        final F.K0 f7;
        synchronized (this.f20667c) {
            try {
                this.f20667c.f(f6);
                f7 = O.f.f(this.f20667c);
            } catch (IllegalArgumentException e6) {
                return N.f.f(e6);
            }
        }
        m(f7);
        return AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: y.y1
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return A1.b(A1.this, f7, aVar);
            }
        });
    }

    public final void l(AbstractC1728c.a aVar, F.K0 k02) {
        F.K0 f6;
        if (this.f20670f) {
            this.f20669e.f(k02.c(), aVar);
            this.f20665a.f0();
            return;
        }
        synchronized (this.f20667c) {
            this.f20667c.f(1.0f);
            f6 = O.f.f(this.f20667c);
        }
        m(f6);
        aVar.f(new InterfaceC0341m.a("Camera is not active."));
    }

    public final void m(F.K0 k02) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f20668d.p(k02);
        } else {
            this.f20668d.m(k02);
        }
    }
}
