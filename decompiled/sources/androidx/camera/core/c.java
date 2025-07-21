package androidx.camera.core;

import F.O;
import I.InterfaceC0443n0;
import androidx.camera.core.b;
import androidx.camera.core.c;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends O {

    /* renamed from: t, reason: collision with root package name */
    public final Executor f8372t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f8373u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public d f8374v;

    /* renamed from: w, reason: collision with root package name */
    public b f8375w;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements N.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f8376a;

        public a(b bVar) {
            this.f8376a = bVar;
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            this.f8376a.close();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b extends androidx.camera.core.b {

        /* renamed from: d, reason: collision with root package name */
        public final WeakReference f8378d;

        public b(d dVar, c cVar) {
            super(dVar);
            this.f8378d = new WeakReference(cVar);
            a(new b.a() { // from class: F.S
                @Override // androidx.camera.core.b.a
                public final void a(androidx.camera.core.d dVar2) {
                    c.b.D(c.b.this, dVar2);
                }
            });
        }

        public static /* synthetic */ void D(b bVar, d dVar) {
            final c cVar = (c) bVar.f8378d.get();
            if (cVar != null) {
                cVar.f8372t.execute(new Runnable() { // from class: F.Q
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.c.this.x();
                    }
                });
            }
        }
    }

    public c(Executor executor) {
        this.f8372t = executor;
    }

    @Override // F.O
    public d d(InterfaceC0443n0 interfaceC0443n0) {
        return interfaceC0443n0.acquireLatestImage();
    }

    @Override // F.O
    public void g() {
        synchronized (this.f8373u) {
            try {
                d dVar = this.f8374v;
                if (dVar != null) {
                    dVar.close();
                    this.f8374v = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F.O
    public void m(d dVar) {
        synchronized (this.f8373u) {
            try {
                if (!this.f1359s) {
                    dVar.close();
                    return;
                }
                if (this.f8375w == null) {
                    b bVar = new b(dVar, this);
                    this.f8375w = bVar;
                    N.f.b(e(bVar), new a(bVar), M.c.b());
                } else {
                    if (dVar.O().c() <= this.f8375w.O().c()) {
                        dVar.close();
                    } else {
                        d dVar2 = this.f8374v;
                        if (dVar2 != null) {
                            dVar2.close();
                        }
                        this.f8374v = dVar;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this.f8373u) {
            try {
                this.f8375w = null;
                d dVar = this.f8374v;
                if (dVar != null) {
                    this.f8374v = null;
                    m(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
