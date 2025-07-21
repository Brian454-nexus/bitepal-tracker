package E;

import F.InterfaceC0341m;
import I.A;
import I.P;
import android.hardware.camera2.TotalCaptureResult;
import java.util.concurrent.Executor;
import l0.AbstractC1728c;
import x.C2253a;
import y.C2331u;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public final C2331u f861c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f862d;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC1728c.a f865g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f859a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f860b = false;

    /* renamed from: e, reason: collision with root package name */
    public final Object f863e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public C2253a.C0269a f864f = new C2253a.C0269a();

    /* renamed from: h, reason: collision with root package name */
    public final C2331u.c f866h = new C2331u.c() { // from class: E.c
        @Override // y.C2331u.c
        public final boolean a(TotalCaptureResult totalCaptureResult) {
            return g.e(g.this, totalCaptureResult);
        }
    };

    public g(C2331u c2331u, Executor executor) {
        this.f861c = c2331u;
        this.f862d = executor;
    }

    public static /* synthetic */ Object c(final g gVar, final AbstractC1728c.a aVar) {
        gVar.f862d.execute(new Runnable() { // from class: E.e
            @Override // java.lang.Runnable
            public final void run() {
                g.this.p(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ boolean e(E.g r2, android.hardware.camera2.TotalCaptureResult r3) {
        /*
            l0.c$a r0 = r2.f865g
            r1 = 0
            if (r0 == 0) goto L32
            android.hardware.camera2.CaptureRequest r3 = r3.getRequest()
            java.lang.Object r3 = r3.getTag()
            boolean r0 = r3 instanceof I.S0
            if (r0 == 0) goto L32
            I.S0 r3 = (I.S0) r3
            java.lang.String r0 = "Camera2CameraControl"
            java.lang.Object r3 = r3.d(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L32
            l0.c$a r0 = r2.f865g
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L32
            l0.c$a r3 = r2.f865g
            r2.f865g = r1
            goto L33
        L32:
            r3 = r1
        L33:
            if (r3 == 0) goto L38
            r3.c(r1)
        L38:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: E.g.e(E.g, android.hardware.camera2.TotalCaptureResult):boolean");
    }

    public static /* synthetic */ Object f(final g gVar, final AbstractC1728c.a aVar) {
        gVar.f862d.execute(new Runnable() { // from class: E.f
            @Override // java.lang.Runnable
            public final void run() {
                g.this.p(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    public static g k(InterfaceC0341m interfaceC0341m) {
        A b6 = ((A) interfaceC0341m).b();
        y0.g.b(b6 instanceof C2331u, "CameraControl doesn't contain Camera2 implementation.");
        return ((C2331u) b6).A();
    }

    public D6.g g(j jVar) {
        h(jVar);
        return N.f.i(AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: E.a
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return g.c(g.this, aVar);
            }
        }));
    }

    public final void h(j jVar) {
        synchronized (this.f863e) {
            try {
                for (P.a aVar : jVar.c()) {
                    this.f864f.b().H(aVar, jVar.b(aVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public D6.g i() {
        j();
        return N.f.i(AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: E.d
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return g.f(g.this, aVar);
            }
        }));
    }

    public final void j() {
        synchronized (this.f863e) {
            this.f864f = new C2253a.C0269a();
        }
    }

    public C2253a l() {
        C2253a a6;
        synchronized (this.f863e) {
            try {
                if (this.f865g != null) {
                    this.f864f.b().H(C2253a.f20388N, Integer.valueOf(this.f865g.hashCode()));
                }
                a6 = this.f864f.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return a6;
    }

    public C2331u.c m() {
        return this.f866h;
    }

    public void n(final boolean z6) {
        this.f862d.execute(new Runnable() { // from class: E.b
            @Override // java.lang.Runnable
            public final void run() {
                g.this.o(z6);
            }
        });
    }

    public final void o(boolean z6) {
        if (this.f859a == z6) {
            return;
        }
        this.f859a = z6;
        if (z6) {
            if (this.f860b) {
                q();
            }
        } else {
            AbstractC1728c.a aVar = this.f865g;
            if (aVar != null) {
                aVar.f(new InterfaceC0341m.a("The camera control has became inactive."));
                this.f865g = null;
            }
        }
    }

    public final void p(AbstractC1728c.a aVar) {
        this.f860b = true;
        AbstractC1728c.a aVar2 = this.f865g;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.f865g = aVar;
        if (this.f859a) {
            q();
        }
        if (aVar2 != null) {
            aVar2.f(new InterfaceC0341m.a("Camera2CameraControl was updated with new options."));
        }
    }

    public final void q() {
        this.f861c.d0();
        this.f860b = false;
    }
}
