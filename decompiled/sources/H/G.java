package H;

import F.X;
import F.Y;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class G {

    /* renamed from: a, reason: collision with root package name */
    public final X.g f1918a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f1919b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1920c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1921d;

    /* renamed from: e, reason: collision with root package name */
    public final Matrix f1922e;

    /* renamed from: f, reason: collision with root package name */
    public final O f1923f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1924g;

    /* renamed from: h, reason: collision with root package name */
    public final List f1925h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final D6.g f1926i;

    public G(I.M m6, X.g gVar, Rect rect, int i6, int i7, Matrix matrix, O o6, D6.g gVar2) {
        this.f1918a = gVar;
        this.f1921d = i7;
        this.f1920c = i6;
        this.f1919b = rect;
        this.f1922e = matrix;
        this.f1923f = o6;
        this.f1924g = String.valueOf(m6.hashCode());
        List a6 = m6.a();
        Objects.requireNonNull(a6);
        Iterator it = a6.iterator();
        while (it.hasNext()) {
            this.f1925h.add(Integer.valueOf(((I.O) it.next()).getId()));
        }
        this.f1926i = gVar2;
    }

    public D6.g a() {
        return this.f1926i;
    }

    public Rect b() {
        return this.f1919b;
    }

    public int c() {
        return this.f1921d;
    }

    public X.g d() {
        return this.f1918a;
    }

    public int e() {
        return this.f1920c;
    }

    public Matrix f() {
        return this.f1922e;
    }

    public List g() {
        return this.f1925h;
    }

    public String h() {
        return this.f1924g;
    }

    public boolean i() {
        return this.f1923f.c();
    }

    public boolean j() {
        return d() == null;
    }

    public void k(Y y6) {
        this.f1923f.b(y6);
    }

    public void l(X.h hVar) {
        this.f1923f.e(hVar);
    }

    public void m(androidx.camera.core.d dVar) {
        this.f1923f.f(dVar);
    }

    public void n() {
        this.f1923f.d();
    }

    public void o(Y y6) {
        this.f1923f.a(y6);
    }
}
