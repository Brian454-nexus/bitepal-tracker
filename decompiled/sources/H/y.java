package H;

import F.u0;
import I.InterfaceC0443n0;
import I.S0;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class y implements InterfaceC0443n0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0443n0 f2032a;

    /* renamed from: b, reason: collision with root package name */
    public G f2033b;

    public y(InterfaceC0443n0 interfaceC0443n0) {
        this.f2032a = interfaceC0443n0;
    }

    public static /* synthetic */ void a(y yVar, InterfaceC0443n0.a aVar, InterfaceC0443n0 interfaceC0443n0) {
        yVar.getClass();
        aVar.a(yVar);
    }

    @Override // I.InterfaceC0443n0
    public androidx.camera.core.d acquireLatestImage() {
        return h(this.f2032a.acquireLatestImage());
    }

    @Override // I.InterfaceC0443n0
    public int b() {
        return this.f2032a.b();
    }

    @Override // I.InterfaceC0443n0
    public void c() {
        this.f2032a.c();
    }

    @Override // I.InterfaceC0443n0
    public void close() {
        this.f2032a.close();
    }

    @Override // I.InterfaceC0443n0
    public void d(final InterfaceC0443n0.a aVar, Executor executor) {
        this.f2032a.d(new InterfaceC0443n0.a() { // from class: H.x
            @Override // I.InterfaceC0443n0.a
            public final void a(InterfaceC0443n0 interfaceC0443n0) {
                y.a(y.this, aVar, interfaceC0443n0);
            }
        }, executor);
    }

    @Override // I.InterfaceC0443n0
    public int e() {
        return this.f2032a.e();
    }

    @Override // I.InterfaceC0443n0
    public androidx.camera.core.d f() {
        return h(this.f2032a.f());
    }

    public void g(G g6) {
        y0.g.i(this.f2033b == null, "Pending request should be null");
        this.f2033b = g6;
    }

    @Override // I.InterfaceC0443n0
    public int getHeight() {
        return this.f2032a.getHeight();
    }

    @Override // I.InterfaceC0443n0
    public Surface getSurface() {
        return this.f2032a.getSurface();
    }

    @Override // I.InterfaceC0443n0
    public int getWidth() {
        return this.f2032a.getWidth();
    }

    public final androidx.camera.core.d h(androidx.camera.core.d dVar) {
        if (dVar == null) {
            return null;
        }
        y0.g.i(this.f2033b != null, "Pending request should not be null");
        S0 a6 = S0.a(new Pair(this.f2033b.h(), this.f2033b.g().get(0)));
        this.f2033b = null;
        return new u0(dVar, new Size(dVar.getWidth(), dVar.getHeight()), new O.b(new V.h(a6, dVar.O().c())));
    }
}
