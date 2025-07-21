package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import i.AbstractC1468a;
import i.AbstractC1473f;
import java.util.ArrayList;
import o.C1831a;
import q.AbstractViewOnTouchListenerC1968B;
import q.C1985i;
import q.T;
import r0.AbstractC2019a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a extends androidx.appcompat.view.menu.a {

    /* renamed from: A, reason: collision with root package name */
    public b f8294A;

    /* renamed from: B, reason: collision with root package name */
    public final f f8295B;

    /* renamed from: C, reason: collision with root package name */
    public int f8296C;

    /* renamed from: j, reason: collision with root package name */
    public d f8297j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f8298k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8299l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8300m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8301n;

    /* renamed from: o, reason: collision with root package name */
    public int f8302o;

    /* renamed from: p, reason: collision with root package name */
    public int f8303p;

    /* renamed from: q, reason: collision with root package name */
    public int f8304q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8305r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8306s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8307t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8308u;

    /* renamed from: v, reason: collision with root package name */
    public int f8309v;

    /* renamed from: w, reason: collision with root package name */
    public final SparseBooleanArray f8310w;

    /* renamed from: x, reason: collision with root package name */
    public e f8311x;

    /* renamed from: y, reason: collision with root package name */
    public C0121a f8312y;

    /* renamed from: z, reason: collision with root package name */
    public c f8313z;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0121a extends androidx.appcompat.view.menu.f {
        public C0121a(Context context, j jVar, View view) {
            super(context, jVar, view, false, AbstractC1468a.f15332f);
            if (!((androidx.appcompat.view.menu.e) jVar.getItem()).k()) {
                View view2 = a.this.f8297j;
                f(view2 == null ? (View) a.this.f7907i : view2);
            }
            j(a.this.f8295B);
        }

        @Override // androidx.appcompat.view.menu.f
        public void e() {
            a aVar = a.this;
            aVar.f8312y = null;
            aVar.f8296C = 0;
            super.e();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public p.c a() {
            C0121a c0121a = a.this.f8312y;
            if (c0121a != null) {
                return c0121a.c();
            }
            return null;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public e f8316a;

        public c(e eVar) {
            this.f8316a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f7901c != null) {
                a.this.f7901c.c();
            }
            View view = (View) a.this.f7907i;
            if (view != null && view.getWindowToken() != null && this.f8316a.m()) {
                a.this.f8311x = this.f8316a;
            }
            a.this.f8313z = null;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d extends C1985i implements ActionMenuView.a {

        /* renamed from: c, reason: collision with root package name */
        public final float[] f8318c;

        /* renamed from: androidx.appcompat.widget.a$d$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class C0122a extends AbstractViewOnTouchListenerC1968B {

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ a f8320j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0122a(View view, a aVar) {
                super(view);
                this.f8320j = aVar;
            }

            @Override // q.AbstractViewOnTouchListenerC1968B
            public p.c b() {
                e eVar = a.this.f8311x;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // q.AbstractViewOnTouchListenerC1968B
            public boolean c() {
                a.this.G();
                return true;
            }

            @Override // q.AbstractViewOnTouchListenerC1968B
            public boolean d() {
                a aVar = a.this;
                if (aVar.f8313z != null) {
                    return false;
                }
                aVar.y();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, AbstractC1468a.f15331e);
            this.f8318c = new float[2];
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            T.a(this, getContentDescription());
            setOnTouchListener(new C0122a(this, a.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.G();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i6, int i7, int i8, int i9) {
            boolean frame = super.setFrame(i6, i7, i8, i9);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                AbstractC2019a.e(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class e extends androidx.appcompat.view.menu.f {
        public e(Context context, androidx.appcompat.view.menu.d dVar, View view, boolean z6) {
            super(context, dVar, view, z6, AbstractC1468a.f15332f);
            h(8388613);
            j(a.this.f8295B);
        }

        @Override // androidx.appcompat.view.menu.f
        public void e() {
            if (a.this.f7901c != null) {
                a.this.f7901c.close();
            }
            a.this.f8311x = null;
            super.e();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class f implements g.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.d dVar, boolean z6) {
            if (dVar instanceof j) {
                dVar.z().d(false);
            }
            g.a m6 = a.this.m();
            if (m6 != null) {
                m6.b(dVar, z6);
            }
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean c(androidx.appcompat.view.menu.d dVar) {
            if (dVar == null) {
                return false;
            }
            a.this.f8296C = ((j) dVar).getItem().getItemId();
            g.a m6 = a.this.m();
            if (m6 != null) {
                return m6.c(dVar);
            }
            return false;
        }
    }

    public a(Context context) {
        super(context, AbstractC1473f.f15434c, AbstractC1473f.f15433b);
        this.f8310w = new SparseBooleanArray();
        this.f8295B = new f();
    }

    public boolean A() {
        e eVar = this.f8311x;
        return eVar != null && eVar.d();
    }

    public void B(Configuration configuration) {
        if (!this.f8305r) {
            this.f8304q = C1831a.a(this.f7900b).c();
        }
        androidx.appcompat.view.menu.d dVar = this.f7901c;
        if (dVar != null) {
            dVar.G(true);
        }
    }

    public void C(boolean z6) {
        this.f8308u = z6;
    }

    public void D(ActionMenuView actionMenuView) {
        this.f7907i = actionMenuView;
        actionMenuView.E(this.f7901c);
    }

    public void E(Drawable drawable) {
        d dVar = this.f8297j;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f8299l = true;
            this.f8298k = drawable;
        }
    }

    public void F(boolean z6) {
        this.f8300m = z6;
        this.f8301n = true;
    }

    public boolean G() {
        androidx.appcompat.view.menu.d dVar;
        if (!this.f8300m || A() || (dVar = this.f7901c) == null || this.f7907i == null || this.f8313z != null || dVar.v().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f7900b, this.f7901c, this.f8297j, true));
        this.f8313z = cVar;
        ((View) this.f7907i).post(cVar);
        super.k(null);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.g
    public void b(androidx.appcompat.view.menu.d dVar, boolean z6) {
        v();
        super.b(dVar, z6);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.g
    public void c(boolean z6) {
        super.c(z6);
        ((View) this.f7907i).requestLayout();
        androidx.appcompat.view.menu.d dVar = this.f7901c;
        boolean z7 = false;
        if (dVar != null) {
            ArrayList r6 = dVar.r();
            int size = r6.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((androidx.appcompat.view.menu.e) r6.get(i6)).g();
            }
        }
        androidx.appcompat.view.menu.d dVar2 = this.f7901c;
        ArrayList v6 = dVar2 != null ? dVar2.v() : null;
        if (this.f8300m && v6 != null) {
            int size2 = v6.size();
            if (size2 == 1) {
                z7 = !((androidx.appcompat.view.menu.e) v6.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z7 = true;
            }
        }
        if (z7) {
            if (this.f8297j == null) {
                this.f8297j = new d(this.f7899a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f8297j.getParent();
            if (viewGroup != this.f7907i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f8297j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f7907i;
                actionMenuView.addView(this.f8297j, actionMenuView.C());
            }
        } else {
            d dVar3 = this.f8297j;
            if (dVar3 != null) {
                Object parent = dVar3.getParent();
                Object obj = this.f7907i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f8297j);
                }
            }
        }
        ((ActionMenuView) this.f7907i).setOverflowReserved(this.f8300m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.g
    public boolean d() {
        ArrayList arrayList;
        int i6;
        int i7;
        int i8;
        boolean z6;
        int i9;
        a aVar = this;
        androidx.appcompat.view.menu.d dVar = aVar.f7901c;
        View view = null;
        ?? r32 = 0;
        if (dVar != null) {
            arrayList = dVar.A();
            i6 = arrayList.size();
        } else {
            arrayList = null;
            i6 = 0;
        }
        int i10 = aVar.f8304q;
        int i11 = aVar.f8303p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.f7907i;
        boolean z7 = false;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i6; i14++) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) arrayList.get(i14);
            if (eVar.n()) {
                i12++;
            } else if (eVar.m()) {
                i13++;
            } else {
                z7 = true;
            }
            if (aVar.f8308u && eVar.isActionViewExpanded()) {
                i10 = 0;
            }
        }
        if (aVar.f8300m && (z7 || i13 + i12 > i10)) {
            i10--;
        }
        int i15 = i10 - i12;
        SparseBooleanArray sparseBooleanArray = aVar.f8310w;
        sparseBooleanArray.clear();
        if (aVar.f8306s) {
            int i16 = aVar.f8309v;
            i8 = i11 / i16;
            i7 = i16 + ((i11 % i16) / i8);
        } else {
            i7 = 0;
            i8 = 0;
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < i6) {
            androidx.appcompat.view.menu.e eVar2 = (androidx.appcompat.view.menu.e) arrayList.get(i17);
            if (eVar2.n()) {
                View n6 = aVar.n(eVar2, view, viewGroup);
                if (aVar.f8306s) {
                    i8 -= ActionMenuView.G(n6, i7, i8, makeMeasureSpec, r32);
                } else {
                    n6.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n6.getMeasuredWidth();
                i11 -= measuredWidth;
                if (i18 == 0) {
                    i18 = measuredWidth;
                }
                int groupId = eVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                eVar2.t(true);
                z6 = r32;
                i9 = i6;
            } else if (eVar2.m()) {
                int groupId2 = eVar2.getGroupId();
                boolean z8 = sparseBooleanArray.get(groupId2);
                boolean z9 = (i15 > 0 || z8) && i11 > 0 && (!aVar.f8306s || i8 > 0);
                boolean z10 = z9;
                i9 = i6;
                if (z9) {
                    View n7 = aVar.n(eVar2, null, viewGroup);
                    if (aVar.f8306s) {
                        int G6 = ActionMenuView.G(n7, i7, i8, makeMeasureSpec, 0);
                        i8 -= G6;
                        if (G6 == 0) {
                            z10 = false;
                        }
                    } else {
                        n7.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z11 = z10;
                    int measuredWidth2 = n7.getMeasuredWidth();
                    i11 -= measuredWidth2;
                    if (i18 == 0) {
                        i18 = measuredWidth2;
                    }
                    z9 = z11 & (!aVar.f8306s ? i11 + i18 <= 0 : i11 < 0);
                }
                if (z9 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z8) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i19 = 0; i19 < i17; i19++) {
                        androidx.appcompat.view.menu.e eVar3 = (androidx.appcompat.view.menu.e) arrayList.get(i19);
                        if (eVar3.getGroupId() == groupId2) {
                            if (eVar3.k()) {
                                i15++;
                            }
                            eVar3.t(false);
                        }
                    }
                }
                if (z9) {
                    i15--;
                }
                eVar2.t(z9);
                z6 = false;
            } else {
                z6 = r32;
                i9 = i6;
                eVar2.t(z6);
            }
            i17++;
            r32 = z6;
            i6 = i9;
            view = null;
            aVar = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public void f(androidx.appcompat.view.menu.e eVar, h.a aVar) {
        aVar.d(eVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f7907i);
        if (this.f8294A == null) {
            this.f8294A = new b();
        }
        actionMenuItemView.setPopupCallback(this.f8294A);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.g
    public void i(Context context, androidx.appcompat.view.menu.d dVar) {
        super.i(context, dVar);
        Resources resources = context.getResources();
        C1831a a6 = C1831a.a(context);
        if (!this.f8301n) {
            this.f8300m = a6.d();
        }
        if (!this.f8307t) {
            this.f8302o = a6.b();
        }
        if (!this.f8305r) {
            this.f8304q = a6.c();
        }
        int i6 = this.f8302o;
        if (this.f8300m) {
            if (this.f8297j == null) {
                d dVar2 = new d(this.f7899a);
                this.f8297j = dVar2;
                if (this.f8299l) {
                    dVar2.setImageDrawable(this.f8298k);
                    this.f8298k = null;
                    this.f8299l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f8297j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i6 -= this.f8297j.getMeasuredWidth();
        } else {
            this.f8297j = null;
        }
        this.f8303p = i6;
        this.f8309v = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.g
    public boolean k(j jVar) {
        boolean z6 = false;
        if (!jVar.hasVisibleItems()) {
            return false;
        }
        j jVar2 = jVar;
        while (jVar2.W() != this.f7901c) {
            jVar2 = (j) jVar2.W();
        }
        View w6 = w(jVar2.getItem());
        if (w6 == null) {
            return false;
        }
        this.f8296C = jVar.getItem().getItemId();
        int size = jVar.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                break;
            }
            MenuItem item = jVar.getItem(i6);
            if (item.isVisible() && item.getIcon() != null) {
                z6 = true;
                break;
            }
            i6++;
        }
        C0121a c0121a = new C0121a(this.f7900b, jVar, w6);
        this.f8312y = c0121a;
        c0121a.g(z6);
        this.f8312y.k();
        super.k(jVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i6) {
        if (viewGroup.getChildAt(i6) == this.f8297j) {
            return false;
        }
        return super.l(viewGroup, i6);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(androidx.appcompat.view.menu.e eVar, View view, ViewGroup viewGroup) {
        View actionView = eVar.getActionView();
        if (actionView == null || eVar.i()) {
            actionView = super.n(eVar, view, viewGroup);
        }
        actionView.setVisibility(eVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean o(int i6, androidx.appcompat.view.menu.e eVar) {
        return eVar.k();
    }

    public boolean v() {
        return y() | z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View w(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f7907i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = viewGroup.getChildAt(i6);
            if ((childAt instanceof h.a) && ((h.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable x() {
        d dVar = this.f8297j;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f8299l) {
            return this.f8298k;
        }
        return null;
    }

    public boolean y() {
        Object obj;
        c cVar = this.f8313z;
        if (cVar != null && (obj = this.f7907i) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f8313z = null;
            return true;
        }
        e eVar = this.f8311x;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean z() {
        C0121a c0121a = this.f8312y;
        if (c0121a == null) {
            return false;
        }
        c0121a.b();
        return true;
    }
}
