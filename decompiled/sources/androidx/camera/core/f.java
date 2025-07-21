package androidx.camera.core;

import F.v0;
import I.InterfaceC0443n0;
import android.view.Surface;
import androidx.camera.core.b;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class f implements InterfaceC0443n0 {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0443n0 f8396d;

    /* renamed from: e, reason: collision with root package name */
    public final Surface f8397e;

    /* renamed from: f, reason: collision with root package name */
    public b.a f8398f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f8393a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public int f8394b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8395c = false;

    /* renamed from: g, reason: collision with root package name */
    public final b.a f8399g = new b.a() { // from class: F.t0
        @Override // androidx.camera.core.b.a
        public final void a(androidx.camera.core.d dVar) {
            androidx.camera.core.f.g(androidx.camera.core.f.this, dVar);
        }
    };

    public f(InterfaceC0443n0 interfaceC0443n0) {
        this.f8396d = interfaceC0443n0;
        this.f8397e = interfaceC0443n0.getSurface();
    }

    public static /* synthetic */ void a(f fVar, InterfaceC0443n0.a aVar, InterfaceC0443n0 interfaceC0443n0) {
        fVar.getClass();
        aVar.a(fVar);
    }

    public static /* synthetic */ void g(f fVar, d dVar) {
        b.a aVar;
        synchronized (fVar.f8393a) {
            try {
                int i6 = fVar.f8394b - 1;
                fVar.f8394b = i6;
                if (fVar.f8395c && i6 == 0) {
                    fVar.close();
                }
                aVar = fVar.f8398f;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.a(dVar);
        }
    }

    @Override // I.InterfaceC0443n0
    public d acquireLatestImage() {
        d k6;
        synchronized (this.f8393a) {
            k6 = k(this.f8396d.acquireLatestImage());
        }
        return k6;
    }

    @Override // I.InterfaceC0443n0
    public int b() {
        int b6;
        synchronized (this.f8393a) {
            b6 = this.f8396d.b();
        }
        return b6;
    }

    @Override // I.InterfaceC0443n0
    public void c() {
        synchronized (this.f8393a) {
            this.f8396d.c();
        }
    }

    @Override // I.InterfaceC0443n0
    public void close() {
        synchronized (this.f8393a) {
            try {
                Surface surface = this.f8397e;
                if (surface != null) {
                    surface.release();
                }
                this.f8396d.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // I.InterfaceC0443n0
    public void d(final InterfaceC0443n0.a aVar, Executor executor) {
        synchronized (this.f8393a) {
            this.f8396d.d(new InterfaceC0443n0.a() { // from class: F.s0
                @Override // I.InterfaceC0443n0.a
                public final void a(InterfaceC0443n0 interfaceC0443n0) {
                    androidx.camera.core.f.a(androidx.camera.core.f.this, aVar, interfaceC0443n0);
                }
            }, executor);
        }
    }

    @Override // I.InterfaceC0443n0
    public int e() {
        int e6;
        synchronized (this.f8393a) {
            e6 = this.f8396d.e();
        }
        return e6;
    }

    @Override // I.InterfaceC0443n0
    public d f() {
        d k6;
        synchronized (this.f8393a) {
            k6 = k(this.f8396d.f());
        }
        return k6;
    }

    @Override // I.InterfaceC0443n0
    public int getHeight() {
        int height;
        synchronized (this.f8393a) {
            height = this.f8396d.getHeight();
        }
        return height;
    }

    @Override // I.InterfaceC0443n0
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f8393a) {
            surface = this.f8396d.getSurface();
        }
        return surface;
    }

    @Override // I.InterfaceC0443n0
    public int getWidth() {
        int width;
        synchronized (this.f8393a) {
            width = this.f8396d.getWidth();
        }
        return width;
    }

    public int h() {
        int e6;
        synchronized (this.f8393a) {
            e6 = this.f8396d.e() - this.f8394b;
        }
        return e6;
    }

    public void i() {
        synchronized (this.f8393a) {
            try {
                this.f8395c = true;
                this.f8396d.c();
                if (this.f8394b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(b.a aVar) {
        synchronized (this.f8393a) {
            this.f8398f = aVar;
        }
    }

    public final d k(d dVar) {
        if (dVar == null) {
            return null;
        }
        this.f8394b++;
        v0 v0Var = new v0(dVar);
        v0Var.a(this.f8399g);
        return v0Var;
    }
}
