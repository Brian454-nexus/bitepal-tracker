package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import i.AbstractC1470c;
import i.AbstractC1473f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p.AbstractC1886b;
import q.C1974H;
import q.InterfaceC1972F;
import z0.AbstractC2393D;
import z0.AbstractC2424j;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b extends AbstractC1886b implements g, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: B, reason: collision with root package name */
    public static final int f7908B = AbstractC1473f.f15436e;

    /* renamed from: A, reason: collision with root package name */
    public boolean f7909A;

    /* renamed from: b, reason: collision with root package name */
    public final Context f7910b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7911c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7912d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7913e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7914f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f7915g;

    /* renamed from: o, reason: collision with root package name */
    public View f7923o;

    /* renamed from: p, reason: collision with root package name */
    public View f7924p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7926r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7927s;

    /* renamed from: t, reason: collision with root package name */
    public int f7928t;

    /* renamed from: u, reason: collision with root package name */
    public int f7929u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7931w;

    /* renamed from: x, reason: collision with root package name */
    public g.a f7932x;

    /* renamed from: y, reason: collision with root package name */
    public ViewTreeObserver f7933y;

    /* renamed from: z, reason: collision with root package name */
    public PopupWindow.OnDismissListener f7934z;

    /* renamed from: h, reason: collision with root package name */
    public final List f7916h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final List f7917i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f7918j = new a();

    /* renamed from: k, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f7919k = new ViewOnAttachStateChangeListenerC0120b();

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC1972F f7920l = new c();

    /* renamed from: m, reason: collision with root package name */
    public int f7921m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f7922n = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7930v = false;

    /* renamed from: q, reason: collision with root package name */
    public int f7925q = D();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.f() || b.this.f7917i.size() <= 0 || ((d) b.this.f7917i.get(0)).f7942a.n()) {
                return;
            }
            View view = b.this.f7924p;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.f7917i.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f7942a.a();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class ViewOnAttachStateChangeListenerC0120b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0120b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f7933y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f7933y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f7933y.removeGlobalOnLayoutListener(bVar.f7918j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements InterfaceC1972F {

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f7938a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MenuItem f7939b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ androidx.appcompat.view.menu.d f7940c;

            public a(d dVar, MenuItem menuItem, androidx.appcompat.view.menu.d dVar2) {
                this.f7938a = dVar;
                this.f7939b = menuItem;
                this.f7940c = dVar2;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f7938a;
                if (dVar != null) {
                    b.this.f7909A = true;
                    dVar.f7943b.d(false);
                    b.this.f7909A = false;
                }
                if (this.f7939b.isEnabled() && this.f7939b.hasSubMenu()) {
                    this.f7940c.H(this.f7939b, 4);
                }
            }
        }

        public c() {
        }

        @Override // q.InterfaceC1972F
        public void b(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
            b.this.f7915g.removeCallbacksAndMessages(null);
            int size = b.this.f7917i.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    i6 = -1;
                    break;
                } else if (dVar == ((d) b.this.f7917i.get(i6)).f7943b) {
                    break;
                } else {
                    i6++;
                }
            }
            if (i6 == -1) {
                return;
            }
            int i7 = i6 + 1;
            b.this.f7915g.postAtTime(new a(i7 < b.this.f7917i.size() ? (d) b.this.f7917i.get(i7) : null, menuItem, dVar), dVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // q.InterfaceC1972F
        public void c(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
            b.this.f7915g.removeCallbacksAndMessages(dVar);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final C1974H f7942a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.appcompat.view.menu.d f7943b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7944c;

        public d(C1974H c1974h, androidx.appcompat.view.menu.d dVar, int i6) {
            this.f7942a = c1974h;
            this.f7943b = dVar;
            this.f7944c = i6;
        }

        public ListView a() {
            return this.f7942a.j();
        }
    }

    public b(Context context, View view, int i6, int i7, boolean z6) {
        this.f7910b = context;
        this.f7923o = view;
        this.f7912d = i6;
        this.f7913e = i7;
        this.f7914f = z6;
        Resources resources = context.getResources();
        this.f7911c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC1470c.f15354b));
        this.f7915g = new Handler();
    }

    public final int A(androidx.appcompat.view.menu.d dVar) {
        int size = this.f7917i.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (dVar == ((d) this.f7917i.get(i6)).f7943b) {
                return i6;
            }
        }
        return -1;
    }

    public final MenuItem B(androidx.appcompat.view.menu.d dVar, androidx.appcompat.view.menu.d dVar2) {
        int size = dVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem item = dVar.getItem(i6);
            if (item.hasSubMenu() && dVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View C(d dVar, androidx.appcompat.view.menu.d dVar2) {
        androidx.appcompat.view.menu.c cVar;
        int i6;
        int firstVisiblePosition;
        MenuItem B6 = B(dVar.f7943b, dVar2);
        if (B6 == null) {
            return null;
        }
        ListView a6 = dVar.a();
        ListAdapter adapter = a6.getAdapter();
        int i7 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i6 = headerViewListAdapter.getHeadersCount();
            cVar = (androidx.appcompat.view.menu.c) headerViewListAdapter.getWrappedAdapter();
        } else {
            cVar = (androidx.appcompat.view.menu.c) adapter;
            i6 = 0;
        }
        int count = cVar.getCount();
        while (true) {
            if (i7 >= count) {
                i7 = -1;
                break;
            }
            if (B6 == cVar.getItem(i7)) {
                break;
            }
            i7++;
        }
        if (i7 != -1 && (firstVisiblePosition = (i7 + i6) - a6.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a6.getChildCount()) {
            return a6.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int D() {
        return AbstractC2393D.p(this.f7923o) == 1 ? 0 : 1;
    }

    public final int E(int i6) {
        List list = this.f7917i;
        ListView a6 = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        a6.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f7924p.getWindowVisibleDisplayFrame(rect);
        return this.f7925q == 1 ? (iArr[0] + a6.getWidth()) + i6 > rect.right ? 0 : 1 : iArr[0] - i6 < 0 ? 1 : 0;
    }

    public final void F(androidx.appcompat.view.menu.d dVar) {
        d dVar2;
        View view;
        LayoutInflater from = LayoutInflater.from(this.f7910b);
        androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(dVar, from, this.f7914f, f7908B);
        if (!f() && this.f7930v) {
            cVar.d(true);
        } else if (f()) {
            cVar.d(AbstractC1886b.x(dVar));
        }
        int o6 = AbstractC1886b.o(cVar, null, this.f7910b, this.f7911c);
        C1974H z6 = z();
        z6.p(cVar);
        z6.s(o6);
        z6.t(this.f7922n);
        if (this.f7917i.size() > 0) {
            List list = this.f7917i;
            dVar2 = (d) list.get(list.size() - 1);
            view = C(dVar2, dVar);
        } else {
            dVar2 = null;
            view = null;
        }
        if (view != null) {
            z6.H(false);
            z6.E(null);
            int E6 = E(o6);
            boolean z7 = E6 == 1;
            this.f7925q = E6;
            z6.q(view);
            if ((this.f7922n & 5) != 5) {
                o6 = z7 ? view.getWidth() : 0 - o6;
            } else if (!z7) {
                o6 = 0 - view.getWidth();
            }
            z6.v(o6);
            z6.A(true);
            z6.C(0);
        } else {
            if (this.f7926r) {
                z6.v(this.f7928t);
            }
            if (this.f7927s) {
                z6.C(this.f7929u);
            }
            z6.u(n());
        }
        this.f7917i.add(new d(z6, dVar, this.f7925q));
        z6.a();
        ListView j6 = z6.j();
        j6.setOnKeyListener(this);
        if (dVar2 == null && this.f7931w && dVar.u() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(AbstractC1473f.f15440i, (ViewGroup) j6, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(dVar.u());
            j6.addHeaderView(frameLayout, null, false);
            z6.a();
        }
    }

    @Override // p.c
    public void a() {
        if (f()) {
            return;
        }
        Iterator it = this.f7916h.iterator();
        while (it.hasNext()) {
            F((androidx.appcompat.view.menu.d) it.next());
        }
        this.f7916h.clear();
        View view = this.f7923o;
        this.f7924p = view;
        if (view != null) {
            boolean z6 = this.f7933y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f7933y = viewTreeObserver;
            if (z6) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f7918j);
            }
            this.f7924p.addOnAttachStateChangeListener(this.f7919k);
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public void b(androidx.appcompat.view.menu.d dVar, boolean z6) {
        int A6 = A(dVar);
        if (A6 < 0) {
            return;
        }
        int i6 = A6 + 1;
        if (i6 < this.f7917i.size()) {
            ((d) this.f7917i.get(i6)).f7943b.d(false);
        }
        d dVar2 = (d) this.f7917i.remove(A6);
        dVar2.f7943b.K(this);
        if (this.f7909A) {
            dVar2.f7942a.F(null);
            dVar2.f7942a.r(0);
        }
        dVar2.f7942a.dismiss();
        int size = this.f7917i.size();
        if (size > 0) {
            this.f7925q = ((d) this.f7917i.get(size - 1)).f7944c;
        } else {
            this.f7925q = D();
        }
        if (size != 0) {
            if (z6) {
                ((d) this.f7917i.get(0)).f7943b.d(false);
                return;
            }
            return;
        }
        dismiss();
        g.a aVar = this.f7932x;
        if (aVar != null) {
            aVar.b(dVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f7933y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f7933y.removeGlobalOnLayoutListener(this.f7918j);
            }
            this.f7933y = null;
        }
        this.f7924p.removeOnAttachStateChangeListener(this.f7919k);
        this.f7934z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.g
    public void c(boolean z6) {
        Iterator it = this.f7917i.iterator();
        while (it.hasNext()) {
            AbstractC1886b.y(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean d() {
        return false;
    }

    @Override // p.c
    public void dismiss() {
        int size = this.f7917i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f7917i.toArray(new d[size]);
            for (int i6 = size - 1; i6 >= 0; i6--) {
                d dVar = dVarArr[i6];
                if (dVar.f7942a.f()) {
                    dVar.f7942a.dismiss();
                }
            }
        }
    }

    @Override // p.c
    public boolean f() {
        return this.f7917i.size() > 0 && ((d) this.f7917i.get(0)).f7942a.f();
    }

    @Override // androidx.appcompat.view.menu.g
    public void h(g.a aVar) {
        this.f7932x = aVar;
    }

    @Override // p.c
    public ListView j() {
        if (this.f7917i.isEmpty()) {
            return null;
        }
        return ((d) this.f7917i.get(r0.size() - 1)).a();
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean k(j jVar) {
        for (d dVar : this.f7917i) {
            if (jVar == dVar.f7943b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!jVar.hasVisibleItems()) {
            return false;
        }
        l(jVar);
        g.a aVar = this.f7932x;
        if (aVar != null) {
            aVar.c(jVar);
        }
        return true;
    }

    @Override // p.AbstractC1886b
    public void l(androidx.appcompat.view.menu.d dVar) {
        dVar.b(this, this.f7910b);
        if (f()) {
            F(dVar);
        } else {
            this.f7916h.add(dVar);
        }
    }

    @Override // p.AbstractC1886b
    public boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f7917i.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f7917i.get(i6);
            if (!dVar.f7942a.f()) {
                break;
            } else {
                i6++;
            }
        }
        if (dVar != null) {
            dVar.f7943b.d(false);
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
        if (this.f7923o != view) {
            this.f7923o = view;
            this.f7922n = AbstractC2424j.a(this.f7921m, AbstractC2393D.p(view));
        }
    }

    @Override // p.AbstractC1886b
    public void r(boolean z6) {
        this.f7930v = z6;
    }

    @Override // p.AbstractC1886b
    public void s(int i6) {
        if (this.f7921m != i6) {
            this.f7921m = i6;
            this.f7922n = AbstractC2424j.a(i6, AbstractC2393D.p(this.f7923o));
        }
    }

    @Override // p.AbstractC1886b
    public void t(int i6) {
        this.f7926r = true;
        this.f7928t = i6;
    }

    @Override // p.AbstractC1886b
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f7934z = onDismissListener;
    }

    @Override // p.AbstractC1886b
    public void v(boolean z6) {
        this.f7931w = z6;
    }

    @Override // p.AbstractC1886b
    public void w(int i6) {
        this.f7927s = true;
        this.f7929u = i6;
    }

    public final C1974H z() {
        C1974H c1974h = new C1974H(this.f7910b, null, this.f7912d, this.f7913e);
        c1974h.G(this.f7920l);
        c1974h.z(this);
        c1974h.y(this);
        c1974h.q(this.f7923o);
        c1974h.t(this.f7922n);
        c1974h.x(true);
        c1974h.w(2);
        return c1974h;
    }
}
