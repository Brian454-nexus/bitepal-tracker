package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import i.AbstractC1470c;
import i.AbstractC1473f;
import p.AbstractC1886b;
import q.C1974H;
import z0.AbstractC2393D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i extends AbstractC1886b implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, g, View.OnKeyListener {

    /* renamed from: v, reason: collision with root package name */
    public static final int f8021v = AbstractC1473f.f15441j;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8022b;

    /* renamed from: c, reason: collision with root package name */
    public final d f8023c;

    /* renamed from: d, reason: collision with root package name */
    public final c f8024d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8025e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8026f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8027g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8028h;

    /* renamed from: i, reason: collision with root package name */
    public final C1974H f8029i;

    /* renamed from: l, reason: collision with root package name */
    public PopupWindow.OnDismissListener f8032l;

    /* renamed from: m, reason: collision with root package name */
    public View f8033m;

    /* renamed from: n, reason: collision with root package name */
    public View f8034n;

    /* renamed from: o, reason: collision with root package name */
    public g.a f8035o;

    /* renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f8036p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8037q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8038r;

    /* renamed from: s, reason: collision with root package name */
    public int f8039s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8041u;

    /* renamed from: j, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f8030j = new a();

    /* renamed from: k, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f8031k = new b();

    /* renamed from: t, reason: collision with root package name */
    public int f8040t = 0;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!i.this.f() || i.this.f8029i.n()) {
                return;
            }
            View view = i.this.f8034n;
            if (view == null || !view.isShown()) {
                i.this.dismiss();
            } else {
                i.this.f8029i.a();
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = i.this.f8036p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    i.this.f8036p = view.getViewTreeObserver();
                }
                i iVar = i.this;
                iVar.f8036p.removeGlobalOnLayoutListener(iVar.f8030j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public i(Context context, d dVar, View view, int i6, int i7, boolean z6) {
        this.f8022b = context;
        this.f8023c = dVar;
        this.f8025e = z6;
        this.f8024d = new c(dVar, LayoutInflater.from(context), z6, f8021v);
        this.f8027g = i6;
        this.f8028h = i7;
        Resources resources = context.getResources();
        this.f8026f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC1470c.f15354b));
        this.f8033m = view;
        this.f8029i = new C1974H(context, null, i6, i7);
        dVar.b(this, context);
    }

    @Override // p.c
    public void a() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public void b(d dVar, boolean z6) {
        if (dVar != this.f8023c) {
            return;
        }
        dismiss();
        g.a aVar = this.f8035o;
        if (aVar != null) {
            aVar.b(dVar, z6);
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public void c(boolean z6) {
        this.f8038r = false;
        c cVar = this.f8024d;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean d() {
        return false;
    }

    @Override // p.c
    public void dismiss() {
        if (f()) {
            this.f8029i.dismiss();
        }
    }

    @Override // p.c
    public boolean f() {
        return !this.f8037q && this.f8029i.f();
    }

    @Override // androidx.appcompat.view.menu.g
    public void h(g.a aVar) {
        this.f8035o = aVar;
    }

    @Override // p.c
    public ListView j() {
        return this.f8029i.j();
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean k(j jVar) {
        if (jVar.hasVisibleItems()) {
            f fVar = new f(this.f8022b, jVar, this.f8034n, this.f8025e, this.f8027g, this.f8028h);
            fVar.j(this.f8035o);
            fVar.g(AbstractC1886b.x(jVar));
            fVar.i(this.f8032l);
            this.f8032l = null;
            this.f8023c.d(false);
            int i6 = this.f8029i.i();
            int l6 = this.f8029i.l();
            if ((Gravity.getAbsoluteGravity(this.f8040t, AbstractC2393D.p(this.f8033m)) & 7) == 5) {
                i6 += this.f8033m.getWidth();
            }
            if (fVar.n(i6, l6)) {
                g.a aVar = this.f8035o;
                if (aVar == null) {
                    return true;
                }
                aVar.c(jVar);
                return true;
            }
        }
        return false;
    }

    @Override // p.AbstractC1886b
    public void l(d dVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f8037q = true;
        this.f8023c.close();
        ViewTreeObserver viewTreeObserver = this.f8036p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f8036p = this.f8034n.getViewTreeObserver();
            }
            this.f8036p.removeGlobalOnLayoutListener(this.f8030j);
            this.f8036p = null;
        }
        this.f8034n.removeOnAttachStateChangeListener(this.f8031k);
        PopupWindow.OnDismissListener onDismissListener = this.f8032l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i6, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i6 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p.AbstractC1886b
    public void p(View view) {
        this.f8033m = view;
    }

    @Override // p.AbstractC1886b
    public void r(boolean z6) {
        this.f8024d.d(z6);
    }

    @Override // p.AbstractC1886b
    public void s(int i6) {
        this.f8040t = i6;
    }

    @Override // p.AbstractC1886b
    public void t(int i6) {
        this.f8029i.v(i6);
    }

    @Override // p.AbstractC1886b
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f8032l = onDismissListener;
    }

    @Override // p.AbstractC1886b
    public void v(boolean z6) {
        this.f8041u = z6;
    }

    @Override // p.AbstractC1886b
    public void w(int i6) {
        this.f8029i.C(i6);
    }

    public final boolean z() {
        View view;
        if (f()) {
            return true;
        }
        if (this.f8037q || (view = this.f8033m) == null) {
            return false;
        }
        this.f8034n = view;
        this.f8029i.y(this);
        this.f8029i.z(this);
        this.f8029i.x(true);
        View view2 = this.f8034n;
        boolean z6 = this.f8036p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f8036p = viewTreeObserver;
        if (z6) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f8030j);
        }
        view2.addOnAttachStateChangeListener(this.f8031k);
        this.f8029i.q(view2);
        this.f8029i.t(this.f8040t);
        if (!this.f8038r) {
            this.f8039s = AbstractC1886b.o(this.f8024d, null, this.f8022b, this.f8026f);
            this.f8038r = true;
        }
        this.f8029i.s(this.f8039s);
        this.f8029i.w(2);
        this.f8029i.u(n());
        this.f8029i.a();
        ListView j6 = this.f8029i.j();
        j6.setOnKeyListener(this);
        if (this.f8041u && this.f8023c.u() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f8022b).inflate(AbstractC1473f.f15440i, (ViewGroup) j6, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f8023c.u());
            }
            frameLayout.setEnabled(false);
            j6.addHeaderView(frameLayout, null, false);
        }
        this.f8029i.p(this.f8024d);
        this.f8029i.a();
        return true;
    }
}
