package q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import i.AbstractC1468a;
import java.lang.reflect.Field;
import l.AbstractC1725a;
import r0.AbstractC2019a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class z extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f18592a;

    /* renamed from: b, reason: collision with root package name */
    public int f18593b;

    /* renamed from: c, reason: collision with root package name */
    public int f18594c;

    /* renamed from: d, reason: collision with root package name */
    public int f18595d;

    /* renamed from: e, reason: collision with root package name */
    public int f18596e;

    /* renamed from: f, reason: collision with root package name */
    public int f18597f;

    /* renamed from: g, reason: collision with root package name */
    public Field f18598g;

    /* renamed from: h, reason: collision with root package name */
    public a f18599h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18600i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f18601j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18602k;

    /* renamed from: l, reason: collision with root package name */
    public C0.e f18603l;

    /* renamed from: m, reason: collision with root package name */
    public b f18604m;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends AbstractC1725a {

        /* renamed from: b, reason: collision with root package name */
        public boolean f18605b;

        public a(Drawable drawable) {
            super(drawable);
            this.f18605b = true;
        }

        public void c(boolean z6) {
            this.f18605b = z6;
        }

        @Override // l.AbstractC1725a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f18605b) {
                super.draw(canvas);
            }
        }

        @Override // l.AbstractC1725a, android.graphics.drawable.Drawable
        public void setHotspot(float f6, float f7) {
            if (this.f18605b) {
                super.setHotspot(f6, f7);
            }
        }

        @Override // l.AbstractC1725a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i6, int i7, int i8, int i9) {
            if (this.f18605b) {
                super.setHotspotBounds(i6, i7, i8, i9);
            }
        }

        @Override // l.AbstractC1725a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f18605b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // l.AbstractC1725a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z6, boolean z7) {
            if (this.f18605b) {
                return super.setVisible(z6, z7);
            }
            return false;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements Runnable {
        public b() {
        }

        public void a() {
            z zVar = z.this;
            zVar.f18604m = null;
            zVar.removeCallbacks(this);
        }

        public void b() {
            z.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            z zVar = z.this;
            zVar.f18604m = null;
            zVar.drawableStateChanged();
        }
    }

    public z(Context context, boolean z6) {
        super(context, null, AbstractC1468a.f15340n);
        this.f18592a = new Rect();
        this.f18593b = 0;
        this.f18594c = 0;
        this.f18595d = 0;
        this.f18596e = 0;
        this.f18601j = z6;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f18598g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e6) {
            e6.printStackTrace();
        }
    }

    public final void a() {
        this.f18602k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f18597f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
    }

    public final void b(View view, int i6) {
        performItemClick(view, i6, getItemIdAtPosition(i6));
    }

    public final void c(Canvas canvas) {
        Drawable selector;
        if (this.f18592a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f18592a);
        selector.draw(canvas);
    }

    public int d(int i6, int i7, int i8, int i9, int i10) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i11 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        View view = null;
        while (i12 < count) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = adapter.getView(i12, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i15 = layoutParams.height;
            view.measure(i6, i15 > 0 ? View.MeasureSpec.makeMeasureSpec(i15, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i12 > 0) {
                i11 += dividerHeight;
            }
            i11 += view.getMeasuredHeight();
            if (i11 >= i9) {
                return (i10 < 0 || i12 <= i10 || i14 <= 0 || i11 == i9) ? i9 : i14;
            }
            if (i10 >= 0 && i12 >= i10) {
                i14 = i11;
            }
            i12++;
        }
        return i11;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f18604m != null) {
            return;
        }
        super.drawableStateChanged();
        j(true);
        l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            C0.e r9 = r7.f18603l
            if (r9 != 0) goto L5a
            C0.e r9 = new C0.e
            r9.<init>(r7)
            r7.f18603l = r9
        L5a:
            C0.e r9 = r7.f18603l
            r9.m(r1)
            C0.e r9 = r7.f18603l
            r9.onTouch(r7, r8)
            return r3
        L65:
            C0.e r8 = r7.f18603l
            if (r8 == 0) goto L6c
            r8.m(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q.z.e(android.view.MotionEvent, int):boolean");
    }

    public final void f(int i6, View view) {
        Rect rect = this.f18592a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f18593b;
        rect.top -= this.f18594c;
        rect.right += this.f18595d;
        rect.bottom += this.f18596e;
        try {
            boolean z6 = this.f18598g.getBoolean(this);
            if (view.isEnabled() != z6) {
                this.f18598g.set(this, Boolean.valueOf(!z6));
                if (i6 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e6) {
            e6.printStackTrace();
        }
    }

    public final void g(int i6, View view) {
        Drawable selector = getSelector();
        boolean z6 = (selector == null || i6 == -1) ? false : true;
        if (z6) {
            selector.setVisible(false, false);
        }
        f(i6, view);
        if (z6) {
            Rect rect = this.f18592a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            AbstractC2019a.d(selector, exactCenterX, exactCenterY);
        }
    }

    public final void h(int i6, View view, float f6, float f7) {
        g(i6, view);
        Drawable selector = getSelector();
        if (selector == null || i6 == -1) {
            return;
        }
        AbstractC2019a.d(selector, f6, f7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f18601j || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f18601j || super.hasWindowFocus();
    }

    public final void i(View view, int i6, float f6, float f7) {
        View childAt;
        this.f18602k = true;
        drawableHotspotChanged(f6, f7);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i7 = this.f18597f;
        if (i7 != -1 && (childAt = getChildAt(i7 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f18597f = i6;
        view.drawableHotspotChanged(f6 - view.getLeft(), f7 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i6, view, f6, f7);
        j(false);
        refreshDrawableState();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f18601j || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f18601j && this.f18600i) || super.isInTouchMode();
    }

    public final void j(boolean z6) {
        a aVar = this.f18599h;
        if (aVar != null) {
            aVar.c(z6);
        }
    }

    public final boolean k() {
        return this.f18602k;
    }

    public final void l() {
        Drawable selector = getSelector();
        if (selector != null && k() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f18604m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f18604m == null) {
            b bVar = new b();
            this.f18604m = bVar;
            bVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
            }
            l();
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f18597f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f18604m;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z6) {
        this.f18600i = z6;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f18599h = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f18593b = rect.left;
        this.f18594c = rect.top;
        this.f18595d = rect.right;
        this.f18596e = rect.bottom;
    }
}
