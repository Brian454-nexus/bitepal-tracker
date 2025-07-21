package T;

import F.AbstractC0335i0;
import F.H0;
import F.w0;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Triple;
import l0.AbstractC1728c;
import t.InterfaceC2069a;
import y0.InterfaceC2343a;

/* renamed from: T.u, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0765u implements P, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final y f4854a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f4855b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f4856c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f4857d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f4858e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f4859f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f4860g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f4861h;

    /* renamed from: i, reason: collision with root package name */
    public int f4862i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4863j;

    /* renamed from: k, reason: collision with root package name */
    public final List f4864k;

    /* renamed from: T.u$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static InterfaceC2069a f4865a = new InterfaceC2069a() { // from class: T.t
            @Override // t.InterfaceC2069a
            public final Object apply(Object obj) {
                return new C0765u((F.C) obj);
            }
        };

        public static P a(F.C c6) {
            return (P) f4865a.apply(c6);
        }
    }

    /* renamed from: T.u$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class b {
        public static C0746a d(int i6, int i7, AbstractC1728c.a aVar) {
            return new C0746a(i6, i7, aVar);
        }

        public abstract AbstractC1728c.a a();

        public abstract int b();

        public abstract int c();
    }

    public C0765u(F.C c6) {
        this(c6, B.f4734a);
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ Object e(final C0765u c0765u, int i6, int i7, final AbstractC1728c.a aVar) {
        c0765u.getClass();
        final C0746a d6 = b.d(i6, i7, aVar);
        c0765u.r(new Runnable() { // from class: T.i
            @Override // java.lang.Runnable
            public final void run() {
                C0765u.this.f4864k.add(d6);
            }
        }, new Runnable() { // from class: T.j
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1728c.a.this.f(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
            }
        });
        return "DefaultSurfaceProcessor#snapshot";
    }

    public static /* synthetic */ void f(C0765u c0765u, w0 w0Var, w0.a aVar) {
        c0765u.getClass();
        w0Var.close();
        Surface surface = (Surface) c0765u.f4861h.remove(w0Var);
        if (surface != null) {
            c0765u.f4854a.J(surface);
        }
    }

    public static /* synthetic */ void g(final C0765u c0765u, H0 h02) {
        c0765u.f4862i++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(c0765u.f4854a.v());
        surfaceTexture.setDefaultBufferSize(h02.n().getWidth(), h02.n().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        h02.q(surface, c0765u.f4856c, new InterfaceC2343a() { // from class: T.g
            @Override // y0.InterfaceC2343a
            public final void accept(Object obj) {
                C0765u.m(C0765u.this, surfaceTexture, surface, (H0.g) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(c0765u, c0765u.f4857d);
    }

    public static /* synthetic */ Object j(final C0765u c0765u, final F.C c6, final B b6, final AbstractC1728c.a aVar) {
        c0765u.getClass();
        c0765u.q(new Runnable() { // from class: T.s
            @Override // java.lang.Runnable
            public final void run() {
                C0765u.l(C0765u.this, c6, b6, aVar);
            }
        });
        return "Init GlRenderer";
    }

    public static /* synthetic */ void k(C0765u c0765u) {
        c0765u.f4863j = true;
        c0765u.p();
    }

    public static /* synthetic */ void l(C0765u c0765u, F.C c6, B b6, AbstractC1728c.a aVar) {
        c0765u.getClass();
        try {
            c0765u.f4854a.w(c6, b6);
            aVar.c(null);
        } catch (RuntimeException e6) {
            aVar.f(e6);
        }
    }

    public static /* synthetic */ void m(C0765u c0765u, SurfaceTexture surfaceTexture, Surface surface, H0.g gVar) {
        c0765u.getClass();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        c0765u.f4862i--;
        c0765u.p();
    }

    public static /* synthetic */ void n(final C0765u c0765u, final w0 w0Var) {
        Surface x6 = w0Var.x(c0765u.f4856c, new InterfaceC2343a() { // from class: T.p
            @Override // y0.InterfaceC2343a
            public final void accept(Object obj) {
                C0765u.f(C0765u.this, w0Var, (w0.a) obj);
            }
        });
        c0765u.f4854a.C(x6);
        c0765u.f4861h.put(w0Var, x6);
    }

    public static /* synthetic */ void o(C0765u c0765u, Runnable runnable, Runnable runnable2) {
        if (c0765u.f4863j) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    @Override // F.x0
    public void a(final w0 w0Var) {
        if (this.f4858e.get()) {
            w0Var.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: T.f
            @Override // java.lang.Runnable
            public final void run() {
                C0765u.n(C0765u.this, w0Var);
            }
        };
        Objects.requireNonNull(w0Var);
        r(runnable, new Runnable() { // from class: T.k
            @Override // java.lang.Runnable
            public final void run() {
                w0.this.close();
            }
        });
    }

    @Override // T.P
    public D6.g b(final int i6, final int i7) {
        return N.f.i(AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: T.h
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return C0765u.e(C0765u.this, i6, i7, aVar);
            }
        }));
    }

    @Override // F.x0
    public void c(final H0 h02) {
        if (this.f4858e.get()) {
            h02.t();
            return;
        }
        Runnable runnable = new Runnable() { // from class: T.l
            @Override // java.lang.Runnable
            public final void run() {
                C0765u.g(C0765u.this, h02);
            }
        };
        Objects.requireNonNull(h02);
        r(runnable, new Runnable() { // from class: T.m
            @Override // java.lang.Runnable
            public final void run() {
                H0.this.t();
            }
        });
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.f4858e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.f4859f);
        Triple triple = null;
        for (Map.Entry entry : this.f4861h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            w0 w0Var = (w0) entry.getKey();
            w0Var.o(this.f4860g, this.f4859f);
            if (w0Var.g() == 34) {
                try {
                    this.f4854a.G(surfaceTexture.getTimestamp(), this.f4860g, surface);
                } catch (RuntimeException e6) {
                    AbstractC0335i0.d("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e6);
                }
            } else {
                y0.g.i(w0Var.g() == 256, "Unsupported format: " + w0Var.g());
                y0.g.i(triple == null, "Only one JPEG output is supported.");
                triple = new Triple(surface, w0Var.f(), (float[]) this.f4860g.clone());
            }
        }
        try {
            v(triple);
        } catch (RuntimeException e7) {
            s(e7);
        }
    }

    public final void p() {
        if (this.f4863j && this.f4862i == 0) {
            Iterator it = this.f4861h.keySet().iterator();
            while (it.hasNext()) {
                ((w0) it.next()).close();
            }
            Iterator it2 = this.f4864k.iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).a().f(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.f4861h.clear();
            this.f4854a.D();
            this.f4855b.quit();
        }
    }

    public final void q(Runnable runnable) {
        r(runnable, new Runnable() { // from class: T.q
            @Override // java.lang.Runnable
            public final void run() {
                C0765u.d();
            }
        });
    }

    public final void r(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f4856c.execute(new Runnable() { // from class: T.r
                @Override // java.lang.Runnable
                public final void run() {
                    C0765u.o(C0765u.this, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e6) {
            AbstractC0335i0.m("DefaultSurfaceProcessor", "Unable to executor runnable", e6);
            runnable2.run();
        }
    }

    @Override // T.P
    public void release() {
        if (this.f4858e.getAndSet(true)) {
            return;
        }
        q(new Runnable() { // from class: T.n
            @Override // java.lang.Runnable
            public final void run() {
                C0765u.k(C0765u.this);
            }
        });
    }

    public final void s(Throwable th) {
        Iterator it = this.f4864k.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a().f(th);
        }
        this.f4864k.clear();
    }

    public final Bitmap t(Size size, float[] fArr, int i6) {
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        L.n.d(fArr2, 0.5f);
        L.n.c(fArr2, i6, 0.5f, 0.5f);
        Matrix.multiplyMM(fArr2, 0, fArr2, 0, fArr, 0);
        return this.f4854a.H(L.q.l(size, i6), fArr2);
    }

    public final void u(final F.C c6, final B b6) {
        try {
            AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: T.o
                @Override // l0.AbstractC1728c.InterfaceC0214c
                public final Object a(AbstractC1728c.a aVar) {
                    return C0765u.j(C0765u.this, c6, b6, aVar);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e6) {
            e = e6;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof RuntimeException)) {
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((RuntimeException) e);
        }
    }

    public final void v(Triple triple) {
        if (this.f4864k.isEmpty()) {
            return;
        }
        if (triple == null) {
            s(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = this.f4864k.iterator();
                int i6 = -1;
                int i7 = -1;
                Bitmap bitmap = null;
                byte[] bArr = null;
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (i6 != bVar.c() || bitmap == null) {
                        i6 = bVar.c();
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        bitmap = t((Size) triple.getSecond(), (float[]) triple.getThird(), i6);
                        i7 = -1;
                    }
                    if (i7 != bVar.b()) {
                        byteArrayOutputStream.reset();
                        i7 = bVar.b();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i7, byteArrayOutputStream);
                        bArr = byteArrayOutputStream.toByteArray();
                    }
                    Surface surface = (Surface) triple.getFirst();
                    Objects.requireNonNull(bArr);
                    ImageProcessingUtil.n(surface, bArr);
                    bVar.a().c(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e6) {
            s(e6);
        }
    }

    public C0765u(F.C c6, B b6) {
        this.f4858e = new AtomicBoolean(false);
        this.f4859f = new float[16];
        this.f4860g = new float[16];
        this.f4861h = new LinkedHashMap();
        this.f4862i = 0;
        this.f4863j = false;
        this.f4864k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f4855b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f4857d = handler;
        this.f4856c = M.c.f(handler);
        this.f4854a = new y();
        try {
            u(c6, b6);
        } catch (RuntimeException e6) {
            release();
            throw e6;
        }
    }
}
