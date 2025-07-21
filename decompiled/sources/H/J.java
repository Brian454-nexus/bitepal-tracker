package H;

import F.X;
import F.Y;
import H.X;
import java.util.Objects;
import l0.AbstractC1728c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class J implements O {

    /* renamed from: a, reason: collision with root package name */
    public final X f1929a;

    /* renamed from: b, reason: collision with root package name */
    public final X.a f1930b;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC1728c.a f1933e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC1728c.a f1934f;

    /* renamed from: h, reason: collision with root package name */
    public D6.g f1936h;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1935g = false;

    /* renamed from: c, reason: collision with root package name */
    public final D6.g f1931c = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: H.H
        @Override // l0.AbstractC1728c.InterfaceC0214c
        public final Object a(AbstractC1728c.a aVar) {
            return J.g(J.this, aVar);
        }
    });

    /* renamed from: d, reason: collision with root package name */
    public final D6.g f1932d = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: H.I
        @Override // l0.AbstractC1728c.InterfaceC0214c
        public final Object a(AbstractC1728c.a aVar) {
            return J.h(J.this, aVar);
        }
    });

    public J(X x6, X.a aVar) {
        this.f1929a = x6;
        this.f1930b = aVar;
    }

    public static /* synthetic */ Object g(J j6, AbstractC1728c.a aVar) {
        j6.f1933e = aVar;
        return "CaptureCompleteFuture";
    }

    public static /* synthetic */ Object h(J j6, AbstractC1728c.a aVar) {
        j6.f1934f = aVar;
        return "RequestCompleteFuture";
    }

    @Override // H.O
    public void a(Y y6) {
        L.p.a();
        if (this.f1935g) {
            return;
        }
        l();
        o();
        p(y6);
    }

    @Override // H.O
    public void b(Y y6) {
        L.p.a();
        if (this.f1935g) {
            return;
        }
        boolean d6 = this.f1929a.d();
        if (!d6) {
            p(y6);
        }
        o();
        this.f1933e.f(y6);
        if (d6) {
            this.f1930b.b(this.f1929a);
        }
    }

    @Override // H.O
    public boolean c() {
        return this.f1935g;
    }

    @Override // H.O
    public void d() {
        L.p.a();
        if (this.f1935g) {
            return;
        }
        this.f1933e.c(null);
    }

    @Override // H.O
    public void e(X.h hVar) {
        L.p.a();
        if (this.f1935g) {
            return;
        }
        l();
        o();
        this.f1929a.q(hVar);
    }

    @Override // H.O
    public void f(androidx.camera.core.d dVar) {
        L.p.a();
        if (this.f1935g) {
            return;
        }
        l();
        o();
        this.f1929a.r(dVar);
    }

    public final void i(Y y6) {
        L.p.a();
        this.f1935g = true;
        D6.g gVar = this.f1936h;
        Objects.requireNonNull(gVar);
        gVar.cancel(true);
        this.f1933e.f(y6);
        this.f1934f.c(null);
    }

    public void j(Y y6) {
        L.p.a();
        if (this.f1932d.isDone()) {
            return;
        }
        i(y6);
        p(y6);
    }

    public void k() {
        L.p.a();
        if (this.f1932d.isDone()) {
            return;
        }
        i(new Y(3, "The request is aborted silently and retried.", null));
        this.f1930b.b(this.f1929a);
    }

    public final void l() {
        y0.g.i(this.f1931c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    public D6.g m() {
        L.p.a();
        return this.f1931c;
    }

    public D6.g n() {
        L.p.a();
        return this.f1932d;
    }

    public final void o() {
        y0.g.i(!this.f1932d.isDone(), "The callback can only complete once.");
        this.f1934f.c(null);
    }

    public final void p(Y y6) {
        L.p.a();
        this.f1929a.p(y6);
    }

    public void q(D6.g gVar) {
        L.p.a();
        y0.g.i(this.f1936h == null, "CaptureRequestFuture can only be set once.");
        this.f1936h = gVar;
    }
}
