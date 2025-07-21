package P0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* renamed from: P0.y, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0716y {

    /* renamed from: a, reason: collision with root package name */
    public final A f4290a;

    public C0716y(A a6) {
        this.f4290a = a6;
    }

    public static C0716y b(A a6) {
        return new C0716y((A) y0.g.g(a6, "callbacks == null"));
    }

    public void a(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        I g6 = this.f4290a.g();
        A a6 = this.f4290a;
        g6.l(a6, a6, abstractComponentCallbacksC0708p);
    }

    public void c() {
        this.f4290a.g().x();
    }

    public boolean d(MenuItem menuItem) {
        return this.f4290a.g().A(menuItem);
    }

    public void e() {
        this.f4290a.g().B();
    }

    public void f() {
        this.f4290a.g().D();
    }

    public void g() {
        this.f4290a.g().M();
    }

    public void h() {
        this.f4290a.g().Q();
    }

    public void i() {
        this.f4290a.g().R();
    }

    public void j() {
        this.f4290a.g().T();
    }

    public boolean k() {
        return this.f4290a.g().a0(true);
    }

    public I l() {
        return this.f4290a.g();
    }

    public void m() {
        this.f4290a.g().S0();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f4290a.g().w0().onCreateView(view, str, context, attributeSet);
    }
}
