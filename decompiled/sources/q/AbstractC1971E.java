package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import i.AbstractC1476i;
import java.lang.reflect.Method;
import kotlin.jvm.internal.IntCompanionObject;
import z0.AbstractC2393D;

/* renamed from: q.E, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1971E implements p.c {

    /* renamed from: H, reason: collision with root package name */
    public static Method f18400H;

    /* renamed from: I, reason: collision with root package name */
    public static Method f18401I;

    /* renamed from: B, reason: collision with root package name */
    public Runnable f18403B;

    /* renamed from: C, reason: collision with root package name */
    public final Handler f18404C;

    /* renamed from: E, reason: collision with root package name */
    public Rect f18406E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f18407F;

    /* renamed from: G, reason: collision with root package name */
    public PopupWindow f18408G;

    /* renamed from: a, reason: collision with root package name */
    public Context f18409a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f18410b;

    /* renamed from: c, reason: collision with root package name */
    public z f18411c;

    /* renamed from: f, reason: collision with root package name */
    public int f18414f;

    /* renamed from: g, reason: collision with root package name */
    public int f18415g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18417i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18419k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18420l;

    /* renamed from: q, reason: collision with root package name */
    public View f18425q;

    /* renamed from: s, reason: collision with root package name */
    public DataSetObserver f18427s;

    /* renamed from: t, reason: collision with root package name */
    public View f18428t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f18429u;

    /* renamed from: v, reason: collision with root package name */
    public AdapterView.OnItemClickListener f18430v;

    /* renamed from: w, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f18431w;

    /* renamed from: d, reason: collision with root package name */
    public int f18412d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f18413e = -2;

    /* renamed from: h, reason: collision with root package name */
    public int f18416h = 1002;

    /* renamed from: j, reason: collision with root package name */
    public boolean f18418j = true;

    /* renamed from: m, reason: collision with root package name */
    public int f18421m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18422n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f18423o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f18424p = IntCompanionObject.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public int f18426r = 0;

    /* renamed from: x, reason: collision with root package name */
    public final g f18432x = new g();

    /* renamed from: y, reason: collision with root package name */
    public final f f18433y = new f();

    /* renamed from: z, reason: collision with root package name */
    public final e f18434z = new e();

    /* renamed from: A, reason: collision with root package name */
    public final c f18402A = new c();

    /* renamed from: D, reason: collision with root package name */
    public final Rect f18405D = new Rect();

    /* renamed from: q.E$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View h6 = AbstractC1971E.this.h();
            if (h6 == null || h6.getWindowToken() == null) {
                return;
            }
            AbstractC1971E.this.a();
        }
    }

    /* renamed from: q.E$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i6, long j6) {
            z zVar;
            if (i6 == -1 || (zVar = AbstractC1971E.this.f18411c) == null) {
                return;
            }
            zVar.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* renamed from: q.E$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1971E.this.e();
        }
    }

    /* renamed from: q.E$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (AbstractC1971E.this.f()) {
                AbstractC1971E.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC1971E.this.dismiss();
        }
    }

    /* renamed from: q.E$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i6, int i7, int i8) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i6) {
            if (i6 != 1 || AbstractC1971E.this.m() || AbstractC1971E.this.f18408G.getContentView() == null) {
                return;
            }
            AbstractC1971E abstractC1971E = AbstractC1971E.this;
            abstractC1971E.f18404C.removeCallbacks(abstractC1971E.f18432x);
            AbstractC1971E.this.f18432x.run();
        }
    }

    /* renamed from: q.E$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x6 = (int) motionEvent.getX();
            int y6 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = AbstractC1971E.this.f18408G) != null && popupWindow.isShowing() && x6 >= 0 && x6 < AbstractC1971E.this.f18408G.getWidth() && y6 >= 0 && y6 < AbstractC1971E.this.f18408G.getHeight()) {
                AbstractC1971E abstractC1971E = AbstractC1971E.this;
                abstractC1971E.f18404C.postDelayed(abstractC1971E.f18432x, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            AbstractC1971E abstractC1971E2 = AbstractC1971E.this;
            abstractC1971E2.f18404C.removeCallbacks(abstractC1971E2.f18432x);
            return false;
        }
    }

    /* renamed from: q.E$g */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z zVar = AbstractC1971E.this.f18411c;
            if (zVar == null || !AbstractC2393D.z(zVar) || AbstractC1971E.this.f18411c.getCount() <= AbstractC1971E.this.f18411c.getChildCount()) {
                return;
            }
            int childCount = AbstractC1971E.this.f18411c.getChildCount();
            AbstractC1971E abstractC1971E = AbstractC1971E.this;
            if (childCount <= abstractC1971E.f18424p) {
                abstractC1971E.f18408G.setInputMethodMode(2);
                AbstractC1971E.this.a();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f18400H = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f18401I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public AbstractC1971E(Context context, AttributeSet attributeSet, int i6, int i7) {
        this.f18409a = context;
        this.f18404C = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1476i.f15490I0, i6, i7);
        this.f18414f = obtainStyledAttributes.getDimensionPixelOffset(AbstractC1476i.f15494J0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(AbstractC1476i.f15498K0, 0);
        this.f18415g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f18417i = true;
        }
        obtainStyledAttributes.recycle();
        C1986j c1986j = new C1986j(context, attributeSet, i6, i7);
        this.f18408G = c1986j;
        c1986j.setInputMethodMode(1);
    }

    public void A(boolean z6) {
        this.f18420l = true;
        this.f18419k = z6;
    }

    public final void B(boolean z6) {
        if (Build.VERSION.SDK_INT > 28) {
            this.f18408G.setIsClippedToScreen(z6);
            return;
        }
        Method method = f18400H;
        if (method != null) {
            try {
                method.invoke(this.f18408G, Boolean.valueOf(z6));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    public void C(int i6) {
        this.f18415g = i6;
        this.f18417i = true;
    }

    public void D(int i6) {
        this.f18413e = i6;
    }

    @Override // p.c
    public void a() {
        int d6 = d();
        boolean m6 = m();
        C0.g.b(this.f18408G, this.f18416h);
        if (this.f18408G.isShowing()) {
            if (AbstractC2393D.z(h())) {
                int i6 = this.f18413e;
                if (i6 == -1) {
                    i6 = -1;
                } else if (i6 == -2) {
                    i6 = h().getWidth();
                }
                int i7 = this.f18412d;
                if (i7 == -1) {
                    if (!m6) {
                        d6 = -1;
                    }
                    if (m6) {
                        this.f18408G.setWidth(this.f18413e == -1 ? -1 : 0);
                        this.f18408G.setHeight(0);
                    } else {
                        this.f18408G.setWidth(this.f18413e == -1 ? -1 : 0);
                        this.f18408G.setHeight(-1);
                    }
                } else if (i7 != -2) {
                    d6 = i7;
                }
                this.f18408G.setOutsideTouchable((this.f18423o || this.f18422n) ? false : true);
                this.f18408G.update(h(), this.f18414f, this.f18415g, i6 < 0 ? -1 : i6, d6 < 0 ? -1 : d6);
                return;
            }
            return;
        }
        int i8 = this.f18413e;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = h().getWidth();
        }
        int i9 = this.f18412d;
        if (i9 == -1) {
            d6 = -1;
        } else if (i9 != -2) {
            d6 = i9;
        }
        this.f18408G.setWidth(i8);
        this.f18408G.setHeight(d6);
        B(true);
        this.f18408G.setOutsideTouchable((this.f18423o || this.f18422n) ? false : true);
        this.f18408G.setTouchInterceptor(this.f18433y);
        if (this.f18420l) {
            C0.g.a(this.f18408G, this.f18419k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f18401I;
            if (method != null) {
                try {
                    method.invoke(this.f18408G, this.f18406E);
                } catch (Exception e6) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e6);
                }
            }
        } else {
            this.f18408G.setEpicenterBounds(this.f18406E);
        }
        C0.g.c(this.f18408G, h(), this.f18414f, this.f18415g, this.f18421m);
        this.f18411c.setSelection(-1);
        if (!this.f18407F || this.f18411c.isInTouchMode()) {
            e();
        }
        if (this.f18407F) {
            return;
        }
        this.f18404C.post(this.f18402A);
    }

    public final int d() {
        int i6;
        int i7;
        int makeMeasureSpec;
        int i8;
        if (this.f18411c == null) {
            Context context = this.f18409a;
            this.f18403B = new a();
            z g6 = g(context, !this.f18407F);
            this.f18411c = g6;
            Drawable drawable = this.f18429u;
            if (drawable != null) {
                g6.setSelector(drawable);
            }
            this.f18411c.setAdapter(this.f18410b);
            this.f18411c.setOnItemClickListener(this.f18430v);
            this.f18411c.setFocusable(true);
            this.f18411c.setFocusableInTouchMode(true);
            this.f18411c.setOnItemSelectedListener(new b());
            this.f18411c.setOnScrollListener(this.f18434z);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f18431w;
            if (onItemSelectedListener != null) {
                this.f18411c.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f18411c;
            View view2 = this.f18425q;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i9 = this.f18426r;
                if (i9 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i9 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f18426r);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i10 = this.f18413e;
                if (i10 >= 0) {
                    i8 = Integer.MIN_VALUE;
                } else {
                    i10 = 0;
                    i8 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i10, i8), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i6 = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i6 = 0;
            }
            this.f18408G.setContentView(view);
        } else {
            View view3 = this.f18425q;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i6 = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i6 = 0;
            }
        }
        Drawable background = this.f18408G.getBackground();
        if (background != null) {
            background.getPadding(this.f18405D);
            Rect rect = this.f18405D;
            int i11 = rect.top;
            i7 = rect.bottom + i11;
            if (!this.f18417i) {
                this.f18415g = -i11;
            }
        } else {
            this.f18405D.setEmpty();
            i7 = 0;
        }
        int k6 = k(h(), this.f18415g, this.f18408G.getInputMethodMode() == 2);
        if (this.f18422n || this.f18412d == -1) {
            return k6 + i7;
        }
        int i12 = this.f18413e;
        if (i12 == -2) {
            int i13 = this.f18409a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f18405D;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13 - (rect2.left + rect2.right), IntCompanionObject.MIN_VALUE);
        } else if (i12 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        } else {
            int i14 = this.f18409a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f18405D;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - (rect3.left + rect3.right), 1073741824);
        }
        int d6 = this.f18411c.d(makeMeasureSpec, 0, -1, k6 - i6, -1);
        if (d6 > 0) {
            i6 += i7 + this.f18411c.getPaddingTop() + this.f18411c.getPaddingBottom();
        }
        return d6 + i6;
    }

    @Override // p.c
    public void dismiss() {
        this.f18408G.dismiss();
        o();
        this.f18408G.setContentView(null);
        this.f18411c = null;
        this.f18404C.removeCallbacks(this.f18432x);
    }

    public void e() {
        z zVar = this.f18411c;
        if (zVar != null) {
            zVar.setListSelectionHidden(true);
            zVar.requestLayout();
        }
    }

    @Override // p.c
    public boolean f() {
        return this.f18408G.isShowing();
    }

    public abstract z g(Context context, boolean z6);

    public View h() {
        return this.f18428t;
    }

    public int i() {
        return this.f18414f;
    }

    @Override // p.c
    public ListView j() {
        return this.f18411c;
    }

    public final int k(View view, int i6, boolean z6) {
        return this.f18408G.getMaxAvailableHeight(view, i6, z6);
    }

    public int l() {
        if (this.f18417i) {
            return this.f18415g;
        }
        return 0;
    }

    public boolean m() {
        return this.f18408G.getInputMethodMode() == 2;
    }

    public boolean n() {
        return this.f18407F;
    }

    public final void o() {
        View view = this.f18425q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f18425q);
            }
        }
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f18427s;
        if (dataSetObserver == null) {
            this.f18427s = new d();
        } else {
            ListAdapter listAdapter2 = this.f18410b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f18410b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f18427s);
        }
        z zVar = this.f18411c;
        if (zVar != null) {
            zVar.setAdapter(this.f18410b);
        }
    }

    public void q(View view) {
        this.f18428t = view;
    }

    public void r(int i6) {
        this.f18408G.setAnimationStyle(i6);
    }

    public void s(int i6) {
        Drawable background = this.f18408G.getBackground();
        if (background == null) {
            D(i6);
            return;
        }
        background.getPadding(this.f18405D);
        Rect rect = this.f18405D;
        this.f18413e = rect.left + rect.right + i6;
    }

    public void t(int i6) {
        this.f18421m = i6;
    }

    public void u(Rect rect) {
        this.f18406E = rect != null ? new Rect(rect) : null;
    }

    public void v(int i6) {
        this.f18414f = i6;
    }

    public void w(int i6) {
        this.f18408G.setInputMethodMode(i6);
    }

    public void x(boolean z6) {
        this.f18407F = z6;
        this.f18408G.setFocusable(z6);
    }

    public void y(PopupWindow.OnDismissListener onDismissListener) {
        this.f18408G.setOnDismissListener(onDismissListener);
    }

    public void z(AdapterView.OnItemClickListener onItemClickListener) {
        this.f18430v = onItemClickListener;
    }
}
