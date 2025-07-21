package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import i.AbstractC1468a;
import i.AbstractC1476i;
import j.AbstractC1637a;
import java.util.ArrayList;
import java.util.List;
import k.AbstractC1653a;
import kotlin.jvm.internal.IntCompanionObject;
import o.C1834d;
import o.InterfaceC1832b;
import q.C1983g;
import q.C1985i;
import q.C1990n;
import q.InterfaceC1994s;
import q.K;
import q.S;
import q.V;
import z0.AbstractC2393D;
import z0.AbstractC2424j;
import z0.AbstractC2427m;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f8241A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f8242B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f8243C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f8244D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f8245E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f8246F;

    /* renamed from: G, reason: collision with root package name */
    public final ActionMenuView.e f8247G;

    /* renamed from: H, reason: collision with root package name */
    public androidx.appcompat.widget.d f8248H;

    /* renamed from: I, reason: collision with root package name */
    public androidx.appcompat.widget.a f8249I;

    /* renamed from: J, reason: collision with root package name */
    public d f8250J;

    /* renamed from: K, reason: collision with root package name */
    public g.a f8251K;

    /* renamed from: L, reason: collision with root package name */
    public d.a f8252L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f8253M;

    /* renamed from: V, reason: collision with root package name */
    public final Runnable f8254V;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f8255a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f8256b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f8257c;

    /* renamed from: d, reason: collision with root package name */
    public ImageButton f8258d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f8259e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f8260f;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f8261g;

    /* renamed from: h, reason: collision with root package name */
    public ImageButton f8262h;

    /* renamed from: i, reason: collision with root package name */
    public View f8263i;

    /* renamed from: j, reason: collision with root package name */
    public Context f8264j;

    /* renamed from: k, reason: collision with root package name */
    public int f8265k;

    /* renamed from: l, reason: collision with root package name */
    public int f8266l;

    /* renamed from: m, reason: collision with root package name */
    public int f8267m;

    /* renamed from: n, reason: collision with root package name */
    public int f8268n;

    /* renamed from: o, reason: collision with root package name */
    public int f8269o;

    /* renamed from: p, reason: collision with root package name */
    public int f8270p;

    /* renamed from: q, reason: collision with root package name */
    public int f8271q;

    /* renamed from: r, reason: collision with root package name */
    public int f8272r;

    /* renamed from: s, reason: collision with root package name */
    public int f8273s;

    /* renamed from: t, reason: collision with root package name */
    public K f8274t;

    /* renamed from: u, reason: collision with root package name */
    public int f8275u;

    /* renamed from: v, reason: collision with root package name */
    public int f8276v;

    /* renamed from: w, reason: collision with root package name */
    public int f8277w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f8278x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f8279y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f8280z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements ActionMenuView.e {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            Toolbar.this.getClass();
            return false;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.H();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.d();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d implements androidx.appcompat.view.menu.g {

        /* renamed from: a, reason: collision with root package name */
        public androidx.appcompat.view.menu.d f8284a;

        /* renamed from: b, reason: collision with root package name */
        public androidx.appcompat.view.menu.e f8285b;

        public d() {
        }

        @Override // androidx.appcompat.view.menu.g
        public void b(androidx.appcompat.view.menu.d dVar, boolean z6) {
        }

        @Override // androidx.appcompat.view.menu.g
        public void c(boolean z6) {
            if (this.f8285b != null) {
                androidx.appcompat.view.menu.d dVar = this.f8284a;
                if (dVar != null) {
                    int size = dVar.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        if (this.f8284a.getItem(i6) == this.f8285b) {
                            return;
                        }
                    }
                }
                e(this.f8284a, this.f8285b);
            }
        }

        @Override // androidx.appcompat.view.menu.g
        public boolean d() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g
        public boolean e(androidx.appcompat.view.menu.d dVar, androidx.appcompat.view.menu.e eVar) {
            KeyEvent.Callback callback = Toolbar.this.f8263i;
            if (callback instanceof InterfaceC1832b) {
                ((InterfaceC1832b) callback).c();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f8263i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f8262h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f8263i = null;
            toolbar3.a();
            this.f8285b = null;
            Toolbar.this.requestLayout();
            eVar.q(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.g
        public boolean g(androidx.appcompat.view.menu.d dVar, androidx.appcompat.view.menu.e eVar) {
            Toolbar.this.e();
            ViewParent parent = Toolbar.this.f8262h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f8262h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f8262h);
            }
            Toolbar.this.f8263i = eVar.getActionView();
            this.f8285b = eVar;
            ViewParent parent2 = Toolbar.this.f8263i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f8263i);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f16090a = (toolbar4.f8268n & 112) | 8388611;
                generateDefaultLayoutParams.f8287b = 2;
                toolbar4.f8263i.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f8263i);
            }
            Toolbar.this.B();
            Toolbar.this.requestLayout();
            eVar.q(true);
            KeyEvent.Callback callback = Toolbar.this.f8263i;
            if (callback instanceof InterfaceC1832b) {
                ((InterfaceC1832b) callback).b();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.g
        public void i(Context context, androidx.appcompat.view.menu.d dVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.d dVar2 = this.f8284a;
            if (dVar2 != null && (eVar = this.f8285b) != null) {
                dVar2.e(eVar);
            }
            this.f8284a = dVar;
        }

        @Override // androidx.appcompat.view.menu.g
        public boolean k(j jVar) {
            return false;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface f {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1468a.f15346t);
    }

    private MenuInflater getMenuInflater() {
        return new C1834d(getContext());
    }

    public final void A() {
        removeCallbacks(this.f8254V);
        post(this.f8254V);
    }

    public void B() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f8287b != 2 && childAt != this.f8255a) {
                removeViewAt(childCount);
                this.f8245E.add(childAt);
            }
        }
    }

    public void C(int i6, int i7) {
        f();
        this.f8274t.g(i6, i7);
    }

    public void D(Context context, int i6) {
        this.f8267m = i6;
        TextView textView = this.f8257c;
        if (textView != null) {
            textView.setTextAppearance(context, i6);
        }
    }

    public void E(Context context, int i6) {
        this.f8266l = i6;
        TextView textView = this.f8256b;
        if (textView != null) {
            textView.setTextAppearance(context, i6);
        }
    }

    public final boolean F() {
        if (!this.f8253M) {
            return false;
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (G(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean G(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean H() {
        ActionMenuView actionMenuView = this.f8255a;
        return actionMenuView != null && actionMenuView.K();
    }

    public void a() {
        for (int size = this.f8245E.size() - 1; size >= 0; size--) {
            addView((View) this.f8245E.get(size));
        }
        this.f8245E.clear();
    }

    public final void b(List list, int i6) {
        boolean z6 = AbstractC2393D.p(this) == 1;
        int childCount = getChildCount();
        int a6 = AbstractC2424j.a(i6, AbstractC2393D.p(this));
        list.clear();
        if (!z6) {
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f8287b == 0 && G(childAt) && n(eVar.f16090a) == a6) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i8 = childCount - 1; i8 >= 0; i8--) {
            View childAt2 = getChildAt(i8);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f8287b == 0 && G(childAt2) && n(eVar2.f16090a) == a6) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z6) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        generateDefaultLayoutParams.f8287b = 1;
        if (!z6 || this.f8263i == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.f8245E.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public void d() {
        d dVar = this.f8250J;
        androidx.appcompat.view.menu.e eVar = dVar == null ? null : dVar.f8285b;
        if (eVar != null) {
            eVar.collapseActionView();
        }
    }

    public void e() {
        if (this.f8262h == null) {
            C1983g c1983g = new C1983g(getContext(), null, AbstractC1468a.f15345s);
            this.f8262h = c1983g;
            c1983g.setImageDrawable(this.f8260f);
            this.f8262h.setContentDescription(this.f8261g);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f16090a = (this.f8268n & 112) | 8388611;
            generateDefaultLayoutParams.f8287b = 2;
            this.f8262h.setLayoutParams(generateDefaultLayoutParams);
            this.f8262h.setOnClickListener(new c());
        }
    }

    public final void f() {
        if (this.f8274t == null) {
            this.f8274t = new K();
        }
    }

    public final void g() {
        if (this.f8259e == null) {
            this.f8259e = new C1985i(getContext());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f8262h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f8262h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        K k6 = this.f8274t;
        if (k6 != null) {
            return k6.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i6 = this.f8276v;
        return i6 != Integer.MIN_VALUE ? i6 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        K k6 = this.f8274t;
        if (k6 != null) {
            return k6.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        K k6 = this.f8274t;
        if (k6 != null) {
            return k6.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        K k6 = this.f8274t;
        if (k6 != null) {
            return k6.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i6 = this.f8275u;
        return i6 != Integer.MIN_VALUE ? i6 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.d I6;
        ActionMenuView actionMenuView = this.f8255a;
        return (actionMenuView == null || (I6 = actionMenuView.I()) == null || !I6.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f8276v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return AbstractC2393D.p(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return AbstractC2393D.p(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f8275u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f8259e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f8259e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        h();
        return this.f8255a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f8258d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f8258d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.a getOuterActionMenuPresenter() {
        return this.f8249I;
    }

    public Drawable getOverflowIcon() {
        h();
        return this.f8255a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f8264j;
    }

    public int getPopupTheme() {
        return this.f8265k;
    }

    public CharSequence getSubtitle() {
        return this.f8279y;
    }

    public final TextView getSubtitleTextView() {
        return this.f8257c;
    }

    public CharSequence getTitle() {
        return this.f8278x;
    }

    public int getTitleMarginBottom() {
        return this.f8273s;
    }

    public int getTitleMarginEnd() {
        return this.f8271q;
    }

    public int getTitleMarginStart() {
        return this.f8270p;
    }

    public int getTitleMarginTop() {
        return this.f8272r;
    }

    public final TextView getTitleTextView() {
        return this.f8256b;
    }

    public InterfaceC1994s getWrapper() {
        if (this.f8248H == null) {
            this.f8248H = new androidx.appcompat.widget.d(this, true);
        }
        return this.f8248H;
    }

    public final void h() {
        i();
        if (this.f8255a.I() == null) {
            androidx.appcompat.view.menu.d dVar = (androidx.appcompat.view.menu.d) this.f8255a.getMenu();
            if (this.f8250J == null) {
                this.f8250J = new d();
            }
            this.f8255a.setExpandedActionViewsExclusive(true);
            dVar.b(this.f8250J, this.f8264j);
        }
    }

    public final void i() {
        if (this.f8255a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f8255a = actionMenuView;
            actionMenuView.setPopupTheme(this.f8265k);
            this.f8255a.setOnMenuItemClickListener(this.f8247G);
            this.f8255a.J(this.f8251K, this.f8252L);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f16090a = (this.f8268n & 112) | 8388613;
            this.f8255a.setLayoutParams(generateDefaultLayoutParams);
            c(this.f8255a, false);
        }
    }

    public final void j() {
        if (this.f8258d == null) {
            this.f8258d = new C1983g(getContext(), null, AbstractC1468a.f15345s);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f16090a = (this.f8268n & 112) | 8388611;
            this.f8258d.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof AbstractC1637a ? new e((AbstractC1637a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public final int n(int i6) {
        int p6 = AbstractC2393D.p(this);
        int a6 = AbstractC2424j.a(i6, p6) & 7;
        return (a6 == 1 || a6 == 3 || a6 == 5) ? a6 : p6 == 1 ? 5 : 3;
    }

    public final int o(View view, int i6) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = i6 > 0 ? (measuredHeight - i6) / 2 : 0;
        int p6 = p(eVar.f16090a);
        if (p6 == 48) {
            return getPaddingTop() - i7;
        }
        if (p6 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i7;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i8 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i9 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (i8 < i9) {
            i8 = i9;
        } else {
            int i10 = (((height - paddingBottom) - measuredHeight) - i8) - paddingTop;
            int i11 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i10 < i11) {
                i8 = Math.max(0, i8 - (i11 - i10));
            }
        }
        return paddingTop + i8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f8254V);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f8243C = false;
        }
        if (!this.f8243C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f8243C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f8243C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0298 A[LOOP:0: B:40:0x0296->B:41:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b6 A[LOOP:1: B:44:0x02b4->B:45:0x02b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02ed A[LOOP:2: B:53:0x02eb->B:54:0x02ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        int[] iArr2 = this.f8246F;
        boolean b6 = V.b(this);
        int i15 = !b6 ? 1 : 0;
        if (G(this.f8258d)) {
            z(this.f8258d, i6, 0, i7, 0, this.f8269o);
            i8 = this.f8258d.getMeasuredWidth() + q(this.f8258d);
            i9 = Math.max(0, this.f8258d.getMeasuredHeight() + r(this.f8258d));
            i10 = View.combineMeasuredStates(0, this.f8258d.getMeasuredState());
        } else {
            i8 = 0;
            i9 = 0;
            i10 = 0;
        }
        if (G(this.f8262h)) {
            z(this.f8262h, i6, 0, i7, 0, this.f8269o);
            i8 = this.f8262h.getMeasuredWidth() + q(this.f8262h);
            i9 = Math.max(i9, this.f8262h.getMeasuredHeight() + r(this.f8262h));
            i10 = View.combineMeasuredStates(i10, this.f8262h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i8);
        iArr2[b6 ? 1 : 0] = Math.max(0, currentContentInsetStart - i8);
        if (G(this.f8255a)) {
            z(this.f8255a, i6, max, i7, 0, this.f8269o);
            i11 = this.f8255a.getMeasuredWidth() + q(this.f8255a);
            i9 = Math.max(i9, this.f8255a.getMeasuredHeight() + r(this.f8255a));
            i10 = View.combineMeasuredStates(i10, this.f8255a.getMeasuredState());
        } else {
            i11 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i11);
        iArr2[i15] = Math.max(0, currentContentInsetEnd - i11);
        if (G(this.f8263i)) {
            iArr = iArr2;
            max2 += y(this.f8263i, i6, max2, i7, 0, iArr);
            i9 = Math.max(i9, this.f8263i.getMeasuredHeight() + r(this.f8263i));
            i10 = View.combineMeasuredStates(i10, this.f8263i.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (G(this.f8259e)) {
            max2 += y(this.f8259e, i6, max2, i7, 0, iArr);
            i9 = Math.max(i9, this.f8259e.getMeasuredHeight() + r(this.f8259e));
            i10 = View.combineMeasuredStates(i10, this.f8259e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (((e) childAt.getLayoutParams()).f8287b == 0 && G(childAt)) {
                max2 += y(childAt, i6, max2, i7, 0, iArr);
                int max3 = Math.max(i9, childAt.getMeasuredHeight() + r(childAt));
                i10 = View.combineMeasuredStates(i10, childAt.getMeasuredState());
                i9 = max3;
            } else {
                max2 = max2;
            }
        }
        int i17 = max2;
        int i18 = this.f8272r + this.f8273s;
        int i19 = this.f8270p + this.f8271q;
        if (G(this.f8256b)) {
            y(this.f8256b, i6, i17 + i19, i7, i18, iArr);
            int measuredWidth = this.f8256b.getMeasuredWidth() + q(this.f8256b);
            int measuredHeight = this.f8256b.getMeasuredHeight() + r(this.f8256b);
            i12 = measuredWidth;
            i13 = View.combineMeasuredStates(i10, this.f8256b.getMeasuredState());
            i14 = measuredHeight;
        } else {
            i12 = 0;
            i13 = i10;
            i14 = 0;
        }
        if (G(this.f8257c)) {
            i12 = Math.max(i12, y(this.f8257c, i6, i17 + i19, i7, i18 + i14, iArr));
            i14 += this.f8257c.getMeasuredHeight() + r(this.f8257c);
            i13 = View.combineMeasuredStates(i13, this.f8257c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i17 + i12 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i6, (-16777216) & i13), F() ? 0 : View.resolveSizeAndState(Math.max(Math.max(i9, i14) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i7, i13 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f8255a;
        androidx.appcompat.view.menu.d I6 = actionMenuView != null ? actionMenuView.I() : null;
        int i6 = gVar.f8288c;
        if (i6 != 0 && this.f8250J != null && I6 != null && (findItem = I6.findItem(i6)) != null) {
            findItem.expandActionView();
        }
        if (gVar.f8289d) {
            A();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i6) {
        super.onRtlPropertiesChanged(i6);
        f();
        this.f8274t.f(i6 == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.e eVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.f8250J;
        if (dVar != null && (eVar = dVar.f8285b) != null) {
            gVar.f8288c = eVar.getItemId();
        }
        gVar.f8289d = v();
        return gVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f8242B = false;
        }
        if (!this.f8242B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f8242B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f8242B = false;
        }
        return true;
    }

    public final int p(int i6) {
        int i7 = i6 & 112;
        return (i7 == 16 || i7 == 48 || i7 == 80) ? i7 : this.f8277w & 112;
    }

    public final int q(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return AbstractC2427m.b(marginLayoutParams) + AbstractC2427m.a(marginLayoutParams);
    }

    public final int r(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int s(List list, int[] iArr) {
        int i6 = iArr[0];
        int i7 = iArr[1];
        int size = list.size();
        int i8 = 0;
        int i9 = 0;
        while (i8 < size) {
            View view = (View) list.get(i8);
            e eVar = (e) view.getLayoutParams();
            int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i6;
            int i11 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i7;
            int max = Math.max(0, i10);
            int max2 = Math.max(0, i11);
            int max3 = Math.max(0, -i10);
            int max4 = Math.max(0, -i11);
            i9 += max + view.getMeasuredWidth() + max2;
            i8++;
            i7 = max4;
            i6 = max3;
        }
        return i9;
    }

    public void setCollapseContentDescription(int i6) {
        setCollapseContentDescription(i6 != 0 ? getContext().getText(i6) : null);
    }

    public void setCollapseIcon(int i6) {
        setCollapseIcon(AbstractC1653a.b(getContext(), i6));
    }

    public void setCollapsible(boolean z6) {
        this.f8253M = z6;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i6) {
        if (i6 < 0) {
            i6 = IntCompanionObject.MIN_VALUE;
        }
        if (i6 != this.f8276v) {
            this.f8276v = i6;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i6) {
        if (i6 < 0) {
            i6 = IntCompanionObject.MIN_VALUE;
        }
        if (i6 != this.f8275u) {
            this.f8275u = i6;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i6) {
        setLogo(AbstractC1653a.b(getContext(), i6));
    }

    public void setLogoDescription(int i6) {
        setLogoDescription(getContext().getText(i6));
    }

    public void setNavigationContentDescription(int i6) {
        setNavigationContentDescription(i6 != 0 ? getContext().getText(i6) : null);
    }

    public void setNavigationIcon(int i6) {
        setNavigationIcon(AbstractC1653a.b(getContext(), i6));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        j();
        this.f8258d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
        h();
        this.f8255a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i6) {
        if (this.f8265k != i6) {
            this.f8265k = i6;
            if (i6 == 0) {
                this.f8264j = getContext();
            } else {
                this.f8264j = new ContextThemeWrapper(getContext(), i6);
            }
        }
    }

    public void setSubtitle(int i6) {
        setSubtitle(getContext().getText(i6));
    }

    public void setSubtitleTextColor(int i6) {
        setSubtitleTextColor(ColorStateList.valueOf(i6));
    }

    public void setTitle(int i6) {
        setTitle(getContext().getText(i6));
    }

    public void setTitleMarginBottom(int i6) {
        this.f8273s = i6;
        requestLayout();
    }

    public void setTitleMarginEnd(int i6) {
        this.f8271q = i6;
        requestLayout();
    }

    public void setTitleMarginStart(int i6) {
        this.f8270p = i6;
        requestLayout();
    }

    public void setTitleMarginTop(int i6) {
        this.f8272r = i6;
        requestLayout();
    }

    public void setTitleTextColor(int i6) {
        setTitleTextColor(ColorStateList.valueOf(i6));
    }

    public void t(int i6) {
        getMenuInflater().inflate(i6, getMenu());
    }

    public final boolean u(View view) {
        return view.getParent() == this || this.f8245E.contains(view);
    }

    public boolean v() {
        ActionMenuView actionMenuView = this.f8255a;
        return actionMenuView != null && actionMenuView.F();
    }

    public final int w(View view, int i6, int[] iArr, int i7) {
        e eVar = (e) view.getLayoutParams();
        int i8 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i6 + Math.max(0, i8);
        iArr[0] = Math.max(0, -i8);
        int o6 = o(view, i7);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, o6, max + measuredWidth, view.getMeasuredHeight() + o6);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    public final int x(View view, int i6, int[] iArr, int i7) {
        e eVar = (e) view.getLayoutParams();
        int i8 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i6 - Math.max(0, i8);
        iArr[1] = Math.max(0, -i8);
        int o6 = o(view, i7);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, o6, max, view.getMeasuredHeight() + o6);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    public final int y(View view, int i6, int i7, int i8, int i9, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i10 = marginLayoutParams.leftMargin - iArr[0];
        int i11 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i10) + Math.max(0, i11);
        iArr[0] = Math.max(0, -i10);
        iArr[1] = Math.max(0, -i11);
        view.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingLeft() + getPaddingRight() + max + i7, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i8, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i9, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void z(View view, int i6, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i7, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i8, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i9, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i10 >= 0) {
            if (mode != 0) {
                i10 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i10);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class e extends AbstractC1637a {

        /* renamed from: b, reason: collision with root package name */
        public int f8287b;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8287b = 0;
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(int i6, int i7) {
            super(i6, i7);
            this.f8287b = 0;
            this.f16090a = 8388627;
        }

        public e(e eVar) {
            super((AbstractC1637a) eVar);
            this.f8287b = 0;
            this.f8287b = eVar.f8287b;
        }

        public e(AbstractC1637a abstractC1637a) {
            super(abstractC1637a);
            this.f8287b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f8287b = 0;
            a(marginLayoutParams);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8287b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f8277w = 8388627;
        this.f8244D = new ArrayList();
        this.f8245E = new ArrayList();
        this.f8246F = new int[2];
        this.f8247G = new a();
        this.f8254V = new b();
        S r6 = S.r(getContext(), attributeSet, AbstractC1476i.f15666x2, i6, 0);
        this.f8266l = r6.l(AbstractC1476i.f15560Z2, 0);
        this.f8267m = r6.l(AbstractC1476i.f15524Q2, 0);
        this.f8277w = r6.j(AbstractC1476i.f15670y2, this.f8277w);
        this.f8268n = r6.j(AbstractC1476i.f15674z2, 48);
        int d6 = r6.d(AbstractC1476i.f15536T2, 0);
        int i7 = AbstractC1476i.f15556Y2;
        d6 = r6.o(i7) ? r6.d(i7, d6) : d6;
        this.f8273s = d6;
        this.f8272r = d6;
        this.f8271q = d6;
        this.f8270p = d6;
        int d7 = r6.d(AbstractC1476i.f15548W2, -1);
        if (d7 >= 0) {
            this.f8270p = d7;
        }
        int d8 = r6.d(AbstractC1476i.f15544V2, -1);
        if (d8 >= 0) {
            this.f8271q = d8;
        }
        int d9 = r6.d(AbstractC1476i.f15552X2, -1);
        if (d9 >= 0) {
            this.f8272r = d9;
        }
        int d10 = r6.d(AbstractC1476i.f15540U2, -1);
        if (d10 >= 0) {
            this.f8273s = d10;
        }
        this.f8269o = r6.e(AbstractC1476i.f15500K2, -1);
        int d11 = r6.d(AbstractC1476i.f15484G2, IntCompanionObject.MIN_VALUE);
        int d12 = r6.d(AbstractC1476i.f15468C2, IntCompanionObject.MIN_VALUE);
        int e6 = r6.e(AbstractC1476i.f15476E2, 0);
        int e7 = r6.e(AbstractC1476i.f15480F2, 0);
        f();
        this.f8274t.e(e6, e7);
        if (d11 != Integer.MIN_VALUE || d12 != Integer.MIN_VALUE) {
            this.f8274t.g(d11, d12);
        }
        this.f8275u = r6.d(AbstractC1476i.f15488H2, IntCompanionObject.MIN_VALUE);
        this.f8276v = r6.d(AbstractC1476i.f15472D2, IntCompanionObject.MIN_VALUE);
        this.f8260f = r6.f(AbstractC1476i.f15464B2);
        this.f8261g = r6.n(AbstractC1476i.f15460A2);
        CharSequence n6 = r6.n(AbstractC1476i.f15532S2);
        if (!TextUtils.isEmpty(n6)) {
            setTitle(n6);
        }
        CharSequence n7 = r6.n(AbstractC1476i.f15520P2);
        if (!TextUtils.isEmpty(n7)) {
            setSubtitle(n7);
        }
        this.f8264j = getContext();
        setPopupTheme(r6.l(AbstractC1476i.f15516O2, 0));
        Drawable f6 = r6.f(AbstractC1476i.f15512N2);
        if (f6 != null) {
            setNavigationIcon(f6);
        }
        CharSequence n8 = r6.n(AbstractC1476i.f15508M2);
        if (!TextUtils.isEmpty(n8)) {
            setNavigationContentDescription(n8);
        }
        Drawable f7 = r6.f(AbstractC1476i.f15492I2);
        if (f7 != null) {
            setLogo(f7);
        }
        CharSequence n9 = r6.n(AbstractC1476i.f15496J2);
        if (!TextUtils.isEmpty(n9)) {
            setLogoDescription(n9);
        }
        int i8 = AbstractC1476i.f15565a3;
        if (r6.o(i8)) {
            setTitleTextColor(r6.c(i8));
        }
        int i9 = AbstractC1476i.f15528R2;
        if (r6.o(i9)) {
            setSubtitleTextColor(r6.c(i9));
        }
        int i10 = AbstractC1476i.f15504L2;
        if (r6.o(i10)) {
            t(r6.l(i10, 0));
        }
        r6.s();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            e();
        }
        ImageButton imageButton = this.f8262h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            e();
            this.f8262h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f8262h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f8260f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!u(this.f8259e)) {
                c(this.f8259e, true);
            }
        } else {
            ImageView imageView = this.f8259e;
            if (imageView != null && u(imageView)) {
                removeView(this.f8259e);
                this.f8245E.remove(this.f8259e);
            }
        }
        ImageView imageView2 = this.f8259e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageView imageView = this.f8259e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            j();
        }
        ImageButton imageButton = this.f8258d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            j();
            if (!u(this.f8258d)) {
                c(this.f8258d, true);
            }
        } else {
            ImageButton imageButton = this.f8258d;
            if (imageButton != null && u(imageButton)) {
                removeView(this.f8258d);
                this.f8245E.remove(this.f8258d);
            }
        }
        ImageButton imageButton2 = this.f8258d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f8257c == null) {
                Context context = getContext();
                C1990n c1990n = new C1990n(context);
                this.f8257c = c1990n;
                c1990n.setSingleLine();
                this.f8257c.setEllipsize(TextUtils.TruncateAt.END);
                int i6 = this.f8267m;
                if (i6 != 0) {
                    this.f8257c.setTextAppearance(context, i6);
                }
                ColorStateList colorStateList = this.f8241A;
                if (colorStateList != null) {
                    this.f8257c.setTextColor(colorStateList);
                }
            }
            if (!u(this.f8257c)) {
                c(this.f8257c, true);
            }
        } else {
            TextView textView = this.f8257c;
            if (textView != null && u(textView)) {
                removeView(this.f8257c);
                this.f8245E.remove(this.f8257c);
            }
        }
        TextView textView2 = this.f8257c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f8279y = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f8241A = colorStateList;
        TextView textView = this.f8257c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f8256b == null) {
                Context context = getContext();
                C1990n c1990n = new C1990n(context);
                this.f8256b = c1990n;
                c1990n.setSingleLine();
                this.f8256b.setEllipsize(TextUtils.TruncateAt.END);
                int i6 = this.f8266l;
                if (i6 != 0) {
                    this.f8256b.setTextAppearance(context, i6);
                }
                ColorStateList colorStateList = this.f8280z;
                if (colorStateList != null) {
                    this.f8256b.setTextColor(colorStateList);
                }
            }
            if (!u(this.f8256b)) {
                c(this.f8256b, true);
            }
        } else {
            TextView textView = this.f8256b;
            if (textView != null && u(textView)) {
                removeView(this.f8256b);
                this.f8245E.remove(this.f8256b);
            }
        }
        TextView textView2 = this.f8256b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f8278x = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f8280z = colorStateList;
        TextView textView = this.f8256b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class g extends G0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public int f8288c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f8289d;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i6) {
                return new g[i6];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8288c = parcel.readInt();
            this.f8289d = parcel.readInt() != 0;
        }

        @Override // G0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f8288c);
            parcel.writeInt(this.f8289d ? 1 : 0);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
