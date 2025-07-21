package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.g;
import i.AbstractC1470c;
import p.AbstractC1886b;
import z0.AbstractC2393D;
import z0.AbstractC2424j;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8008a;

    /* renamed from: b, reason: collision with root package name */
    public final d f8009b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8010c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8011d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8012e;

    /* renamed from: f, reason: collision with root package name */
    public View f8013f;

    /* renamed from: g, reason: collision with root package name */
    public int f8014g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8015h;

    /* renamed from: i, reason: collision with root package name */
    public g.a f8016i;

    /* renamed from: j, reason: collision with root package name */
    public AbstractC1886b f8017j;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f8018k;

    /* renamed from: l, reason: collision with root package name */
    public final PopupWindow.OnDismissListener f8019l;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            f.this.e();
        }
    }

    public f(Context context, d dVar, View view, boolean z6, int i6) {
        this(context, dVar, view, z6, i6, 0);
    }

    public final AbstractC1886b a() {
        Display defaultDisplay = ((WindowManager) this.f8008a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        AbstractC1886b bVar = Math.min(point.x, point.y) >= this.f8008a.getResources().getDimensionPixelSize(AbstractC1470c.f15353a) ? new b(this.f8008a, this.f8013f, this.f8011d, this.f8012e, this.f8010c) : new i(this.f8008a, this.f8009b, this.f8013f, this.f8011d, this.f8012e, this.f8010c);
        bVar.l(this.f8009b);
        bVar.u(this.f8019l);
        bVar.p(this.f8013f);
        bVar.h(this.f8016i);
        bVar.r(this.f8015h);
        bVar.s(this.f8014g);
        return bVar;
    }

    public void b() {
        if (d()) {
            this.f8017j.dismiss();
        }
    }

    public AbstractC1886b c() {
        if (this.f8017j == null) {
            this.f8017j = a();
        }
        return this.f8017j;
    }

    public boolean d() {
        AbstractC1886b abstractC1886b = this.f8017j;
        return abstractC1886b != null && abstractC1886b.f();
    }

    public void e() {
        this.f8017j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f8018k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f8013f = view;
    }

    public void g(boolean z6) {
        this.f8015h = z6;
        AbstractC1886b abstractC1886b = this.f8017j;
        if (abstractC1886b != null) {
            abstractC1886b.r(z6);
        }
    }

    public void h(int i6) {
        this.f8014g = i6;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f8018k = onDismissListener;
    }

    public void j(g.a aVar) {
        this.f8016i = aVar;
        AbstractC1886b abstractC1886b = this.f8017j;
        if (abstractC1886b != null) {
            abstractC1886b.h(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void l(int i6, int i7, boolean z6, boolean z7) {
        AbstractC1886b c6 = c();
        c6.v(z7);
        if (z6) {
            if ((AbstractC2424j.a(this.f8014g, AbstractC2393D.p(this.f8013f)) & 7) == 5) {
                i6 -= this.f8013f.getWidth();
            }
            c6.t(i6);
            c6.w(i7);
            int i8 = (int) ((this.f8008a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c6.q(new Rect(i6 - i8, i7 - i8, i6 + i8, i7 + i8));
        }
        c6.a();
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f8013f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i6, int i7) {
        if (d()) {
            return true;
        }
        if (this.f8013f == null) {
            return false;
        }
        l(i6, i7, true, true);
        return true;
    }

    public f(Context context, d dVar, View view, boolean z6, int i6, int i7) {
        this.f8014g = 8388611;
        this.f8019l = new a();
        this.f8008a = context;
        this.f8009b = dVar;
        this.f8013f = view;
        this.f8010c = z6;
        this.f8011d = i6;
        this.f8012e = i7;
    }
}
