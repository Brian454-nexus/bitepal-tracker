package H;

import F.X;
import F.Y;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public int f1973a = new R.a().a();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void b(X x6);
    }

    public static /* synthetic */ void a(X x6, Y y6) {
        x6.h();
        if (x6.j() == null) {
            throw new IllegalStateException("One and only one callback is allowed.");
        }
        X.f j6 = x6.j();
        Objects.requireNonNull(j6);
        j6.a(y6);
    }

    public static /* synthetic */ void b(X x6, X.h hVar) {
        X.f j6 = x6.j();
        Objects.requireNonNull(j6);
        Objects.requireNonNull(hVar);
        j6.b(hVar);
    }

    public static /* synthetic */ void c(X x6, androidx.camera.core.d dVar) {
        x6.h();
        throw null;
    }

    public static X o(Executor executor, X.e eVar, X.f fVar, X.g gVar, Rect rect, Matrix matrix, int i6, int i7, int i8, List list) {
        y0.g.b((fVar == null) == (gVar == null), "onDiskCallback and outputFileOptions should be both null or both non-null.");
        y0.g.b(!(fVar == null), "One and only one on-disk or in-memory callback should be present.");
        return new C0384h(executor, eVar, fVar, gVar, rect, matrix, i6, i7, i8, list);
    }

    public boolean d() {
        L.p.a();
        int i6 = this.f1973a;
        if (i6 <= 0) {
            return false;
        }
        this.f1973a = i6 - 1;
        return true;
    }

    public abstract Executor e();

    public abstract int f();

    public abstract Rect g();

    public abstract X.e h();

    public abstract int i();

    public abstract X.f j();

    public abstract X.g k();

    public abstract int l();

    public abstract Matrix m();

    public abstract List n();

    public void p(final Y y6) {
        e().execute(new Runnable() { // from class: H.U
            @Override // java.lang.Runnable
            public final void run() {
                X.a(X.this, y6);
            }
        });
    }

    public void q(final X.h hVar) {
        e().execute(new Runnable() { // from class: H.W
            @Override // java.lang.Runnable
            public final void run() {
                X.b(X.this, hVar);
            }
        });
    }

    public void r(final androidx.camera.core.d dVar) {
        e().execute(new Runnable() { // from class: H.V
            @Override // java.lang.Runnable
            public final void run() {
                X.c(X.this, dVar);
            }
        });
    }
}
