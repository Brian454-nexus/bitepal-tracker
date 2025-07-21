package y;

import F.AbstractC0335i0;
import F.InterfaceC0341m;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.lifecycle.AbstractC1065q;
import androidx.lifecycle.C1067t;
import java.util.Objects;
import java.util.concurrent.Executor;
import l0.AbstractC1728c;
import y.C2331u;
import z.C2362A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final C2331u f21126a;

    /* renamed from: b, reason: collision with root package name */
    public final C1067t f21127b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21128c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f21129d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21130e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC1728c.a f21131f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21132g;

    public x1(C2331u c2331u, C2362A c2362a, Executor executor) {
        this.f21126a = c2331u;
        this.f21129d = executor;
        Objects.requireNonNull(c2362a);
        this.f21128c = C.g.a(new Q(c2362a));
        this.f21127b = new C1067t(0);
        c2331u.w(new C2331u.c() { // from class: y.v1
            @Override // y.C2331u.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return x1.b(x1.this, totalCaptureResult);
            }
        });
    }

    public static /* synthetic */ Object a(final x1 x1Var, final boolean z6, final AbstractC1728c.a aVar) {
        x1Var.f21129d.execute(new Runnable() { // from class: y.w1
            @Override // java.lang.Runnable
            public final void run() {
                x1.this.e(aVar, z6);
            }
        });
        return "enableTorch: " + z6;
    }

    public static /* synthetic */ boolean b(x1 x1Var, TotalCaptureResult totalCaptureResult) {
        if (x1Var.f21131f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == x1Var.f21132g) {
                x1Var.f21131f.c(null);
                x1Var.f21131f = null;
            }
        }
        return false;
    }

    public D6.g d(final boolean z6) {
        if (this.f21128c) {
            h(this.f21127b, Integer.valueOf(z6 ? 1 : 0));
            return AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: y.u1
                @Override // l0.AbstractC1728c.InterfaceC0214c
                public final Object a(AbstractC1728c.a aVar) {
                    return x1.a(x1.this, z6, aVar);
                }
            });
        }
        AbstractC0335i0.a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
        return N.f.f(new IllegalStateException("No flash unit"));
    }

    public void e(AbstractC1728c.a aVar, boolean z6) {
        if (!this.f21128c) {
            if (aVar != null) {
                aVar.f(new IllegalStateException("No flash unit"));
            }
        } else {
            if (!this.f21130e) {
                h(this.f21127b, 0);
                if (aVar != null) {
                    aVar.f(new InterfaceC0341m.a("Camera is not active."));
                    return;
                }
                return;
            }
            this.f21132g = z6;
            this.f21126a.z(z6);
            h(this.f21127b, Integer.valueOf(z6 ? 1 : 0));
            AbstractC1728c.a aVar2 = this.f21131f;
            if (aVar2 != null) {
                aVar2.f(new InterfaceC0341m.a("There is a new enableTorch being set"));
            }
            this.f21131f = aVar;
        }
    }

    public AbstractC1065q f() {
        return this.f21127b;
    }

    public void g(boolean z6) {
        if (this.f21130e == z6) {
            return;
        }
        this.f21130e = z6;
        if (z6) {
            return;
        }
        if (this.f21132g) {
            this.f21132g = false;
            this.f21126a.z(false);
            h(this.f21127b, 0);
        }
        AbstractC1728c.a aVar = this.f21131f;
        if (aVar != null) {
            aVar.f(new InterfaceC0341m.a("Camera is not active."));
            this.f21131f = null;
        }
    }

    public final void h(C1067t c1067t, Object obj) {
        if (L.p.c()) {
            c1067t.p(obj);
        } else {
            c1067t.m(obj);
        }
    }
}
