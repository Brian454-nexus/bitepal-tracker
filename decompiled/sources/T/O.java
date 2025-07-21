package T;

import F.AbstractC0335i0;
import F.w0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import l0.AbstractC1728c;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class O implements w0 {

    /* renamed from: b, reason: collision with root package name */
    public final Surface f4775b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4776c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4777d;

    /* renamed from: e, reason: collision with root package name */
    public final Size f4778e;

    /* renamed from: f, reason: collision with root package name */
    public final Size f4779f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f4780g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4781h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4782i;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC2343a f4785l;

    /* renamed from: m, reason: collision with root package name */
    public Executor f4786m;

    /* renamed from: p, reason: collision with root package name */
    public final D6.g f4789p;

    /* renamed from: q, reason: collision with root package name */
    public AbstractC1728c.a f4790q;

    /* renamed from: r, reason: collision with root package name */
    public I.E f4791r;

    /* renamed from: s, reason: collision with root package name */
    public Matrix f4792s;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4774a = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final float[] f4783j = new float[16];

    /* renamed from: k, reason: collision with root package name */
    public final float[] f4784k = new float[16];

    /* renamed from: n, reason: collision with root package name */
    public boolean f4787n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4788o = false;

    public O(Surface surface, int i6, int i7, Size size, Size size2, Rect rect, int i8, boolean z6, I.E e6, Matrix matrix) {
        this.f4775b = surface;
        this.f4776c = i6;
        this.f4777d = i7;
        this.f4778e = size;
        this.f4779f = size2;
        this.f4780g = new Rect(rect);
        this.f4782i = z6;
        this.f4781h = i8;
        this.f4791r = e6;
        this.f4792s = matrix;
        D();
        this.f4789p = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: T.M
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return O.a(O.this, aVar);
            }
        });
    }

    public static /* synthetic */ Object a(O o6, AbstractC1728c.a aVar) {
        o6.f4790q = aVar;
        return "SurfaceOutputImpl close future complete";
    }

    public static /* synthetic */ void c(O o6, AtomicReference atomicReference) {
        o6.getClass();
        ((InterfaceC2343a) atomicReference.get()).accept(w0.a.c(0, o6));
    }

    public final void D() {
        android.opengl.Matrix.setIdentityM(this.f4783j, 0);
        L.n.d(this.f4783j, 0.5f);
        L.n.c(this.f4783j, this.f4781h, 0.5f, 0.5f);
        if (this.f4782i) {
            android.opengl.Matrix.translateM(this.f4783j, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(this.f4783j, 0, -1.0f, 1.0f, 1.0f);
        }
        Matrix c6 = L.q.c(L.q.o(this.f4779f), L.q.o(L.q.l(this.f4779f, this.f4781h)), this.f4781h, this.f4782i);
        RectF rectF = new RectF(this.f4780g);
        c6.mapRect(rectF);
        float width = rectF.left / r0.getWidth();
        float height = ((r0.getHeight() - rectF.height()) - rectF.top) / r0.getHeight();
        float width2 = rectF.width() / r0.getWidth();
        float height2 = rectF.height() / r0.getHeight();
        android.opengl.Matrix.translateM(this.f4783j, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(this.f4783j, 0, width2, height2, 1.0f);
        I();
        float[] fArr = this.f4783j;
        android.opengl.Matrix.multiplyMM(fArr, 0, this.f4784k, 0, fArr, 0);
    }

    public final void I() {
        android.opengl.Matrix.setIdentityM(this.f4784k, 0);
        L.n.d(this.f4784k, 0.5f);
        I.E e6 = this.f4791r;
        if (e6 != null) {
            y0.g.i(e6.m(), "Camera has no transform.");
            L.n.c(this.f4784k, this.f4791r.b().a(), 0.5f, 0.5f);
            if (this.f4791r.d()) {
                android.opengl.Matrix.translateM(this.f4784k, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(this.f4784k, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        float[] fArr = this.f4784k;
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    public D6.g P() {
        return this.f4789p;
    }

    public void R() {
        Executor executor;
        InterfaceC2343a interfaceC2343a;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f4774a) {
            try {
                if (this.f4786m != null && (interfaceC2343a = this.f4785l) != null) {
                    if (!this.f4788o) {
                        atomicReference.set(interfaceC2343a);
                        executor = this.f4786m;
                        this.f4787n = false;
                    }
                    executor = null;
                }
                this.f4787n = true;
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: T.N
                    @Override // java.lang.Runnable
                    public final void run() {
                        O.c(O.this, atomicReference);
                    }
                });
            } catch (RejectedExecutionException e6) {
                AbstractC0335i0.b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e6);
            }
        }
    }

    @Override // F.w0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f4774a) {
            try {
                if (!this.f4788o) {
                    this.f4788o = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4790q.c(null);
    }

    @Override // F.w0
    public Size f() {
        return this.f4778e;
    }

    @Override // F.w0
    public int g() {
        return this.f4777d;
    }

    @Override // F.w0
    public void o(float[] fArr, float[] fArr2) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, this.f4783j, 0);
    }

    @Override // F.w0
    public Surface x(Executor executor, InterfaceC2343a interfaceC2343a) {
        boolean z6;
        synchronized (this.f4774a) {
            this.f4786m = executor;
            this.f4785l = interfaceC2343a;
            z6 = this.f4787n;
        }
        if (z6) {
            R();
        }
        return this.f4775b;
    }
}
