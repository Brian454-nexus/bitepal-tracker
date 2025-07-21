package F;

import F.L;
import I.InterfaceC0443n0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import l0.AbstractC1728c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class O implements InterfaceC0443n0.a {

    /* renamed from: a, reason: collision with root package name */
    public L.a f1341a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f1342b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f1343c;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f1345e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f1346f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f1347g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.camera.core.f f1348h;

    /* renamed from: i, reason: collision with root package name */
    public ImageWriter f1349i;

    /* renamed from: n, reason: collision with root package name */
    public ByteBuffer f1354n;

    /* renamed from: o, reason: collision with root package name */
    public ByteBuffer f1355o;

    /* renamed from: p, reason: collision with root package name */
    public ByteBuffer f1356p;

    /* renamed from: q, reason: collision with root package name */
    public ByteBuffer f1357q;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f1344d = 1;

    /* renamed from: j, reason: collision with root package name */
    public Rect f1350j = new Rect();

    /* renamed from: k, reason: collision with root package name */
    public Rect f1351k = new Rect();

    /* renamed from: l, reason: collision with root package name */
    public Matrix f1352l = new Matrix();

    /* renamed from: m, reason: collision with root package name */
    public Matrix f1353m = new Matrix();

    /* renamed from: r, reason: collision with root package name */
    public final Object f1358r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public boolean f1359s = true;

    public static /* synthetic */ void b(O o6, androidx.camera.core.d dVar, Matrix matrix, androidx.camera.core.d dVar2, Rect rect, L.a aVar, AbstractC1728c.a aVar2) {
        if (!o6.f1359s) {
            aVar2.f(new v0.m("ImageAnalysis is detached"));
            return;
        }
        u0 u0Var = new u0(dVar2, AbstractC0331g0.d(dVar.O().a(), dVar.O().c(), o6.f1345e ? 0 : o6.f1342b, matrix));
        if (!rect.isEmpty()) {
            u0Var.N(rect);
        }
        aVar.b(u0Var);
        aVar2.c(null);
    }

    public static /* synthetic */ Object c(final O o6, Executor executor, final androidx.camera.core.d dVar, final Matrix matrix, final androidx.camera.core.d dVar2, final Rect rect, final L.a aVar, final AbstractC1728c.a aVar2) {
        o6.getClass();
        executor.execute(new Runnable() { // from class: F.M
            @Override // java.lang.Runnable
            public final void run() {
                O.b(O.this, dVar, matrix, dVar2, rect, aVar, aVar2);
            }
        });
        return "analyzeImage";
    }

    public static androidx.camera.core.f i(int i6, int i7, int i8, int i9, int i10) {
        boolean z6 = i8 == 90 || i8 == 270;
        int i11 = z6 ? i7 : i6;
        if (!z6) {
            i6 = i7;
        }
        return new androidx.camera.core.f(AbstractC0329f0.a(i11, i6, i9, i10));
    }

    public static Matrix k(int i6, int i7, int i8, int i9, int i10) {
        Matrix matrix = new Matrix();
        if (i10 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i6, i7), L.q.f3083a, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i10);
            matrix.postConcat(L.q.a(new RectF(0.0f, 0.0f, i8, i9)));
        }
        return matrix;
    }

    public static Rect l(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    @Override // I.InterfaceC0443n0.a
    public void a(InterfaceC0443n0 interfaceC0443n0) {
        try {
            androidx.camera.core.d d6 = d(interfaceC0443n0);
            if (d6 != null) {
                m(d6);
            }
        } catch (IllegalStateException e6) {
            AbstractC0335i0.d("ImageAnalysisAnalyzer", "Failed to acquire image.", e6);
        }
    }

    public abstract androidx.camera.core.d d(InterfaceC0443n0 interfaceC0443n0);

    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public D6.g e(final androidx.camera.core.d r17) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F.O.e(androidx.camera.core.d):D6.g");
    }

    public void f() {
        this.f1359s = true;
    }

    public abstract void g();

    public final void h(androidx.camera.core.d dVar) {
        if (this.f1344d != 1) {
            if (this.f1344d == 2 && this.f1354n == null) {
                this.f1354n = ByteBuffer.allocateDirect(dVar.getWidth() * dVar.getHeight() * 4);
                return;
            }
            return;
        }
        if (this.f1355o == null) {
            this.f1355o = ByteBuffer.allocateDirect(dVar.getWidth() * dVar.getHeight());
        }
        this.f1355o.position(0);
        if (this.f1356p == null) {
            this.f1356p = ByteBuffer.allocateDirect((dVar.getWidth() * dVar.getHeight()) / 4);
        }
        this.f1356p.position(0);
        if (this.f1357q == null) {
            this.f1357q = ByteBuffer.allocateDirect((dVar.getWidth() * dVar.getHeight()) / 4);
        }
        this.f1357q.position(0);
    }

    public void j() {
        this.f1359s = false;
        g();
    }

    public abstract void m(androidx.camera.core.d dVar);

    public final void n(int i6, int i7, int i8, int i9) {
        Matrix k6 = k(i6, i7, i8, i9, this.f1342b);
        this.f1351k = l(this.f1350j, k6);
        this.f1353m.setConcat(this.f1352l, k6);
    }

    public final void o(androidx.camera.core.d dVar, int i6) {
        androidx.camera.core.f fVar = this.f1348h;
        if (fVar == null) {
            return;
        }
        fVar.i();
        this.f1348h = i(dVar.getWidth(), dVar.getHeight(), i6, this.f1348h.b(), this.f1348h.e());
        if (this.f1344d == 1) {
            ImageWriter imageWriter = this.f1349i;
            if (imageWriter != null) {
                P.a.a(imageWriter);
            }
            this.f1349i = P.a.c(this.f1348h.getSurface(), this.f1348h.e());
        }
    }

    public void p(Executor executor, L.a aVar) {
        if (aVar == null) {
            g();
        }
        synchronized (this.f1358r) {
            this.f1341a = aVar;
            this.f1347g = executor;
        }
    }

    public void q(boolean z6) {
        this.f1346f = z6;
    }

    public void r(int i6) {
        this.f1344d = i6;
    }

    public void s(boolean z6) {
        this.f1345e = z6;
    }

    public void t(androidx.camera.core.f fVar) {
        synchronized (this.f1358r) {
            this.f1348h = fVar;
        }
    }

    public void u(int i6) {
        this.f1342b = i6;
    }

    public void v(Matrix matrix) {
        synchronized (this.f1358r) {
            this.f1352l = matrix;
            this.f1353m = new Matrix(this.f1352l);
        }
    }

    public void w(Rect rect) {
        synchronized (this.f1358r) {
            this.f1350j = rect;
            this.f1351k = new Rect(this.f1350j);
        }
    }
}
