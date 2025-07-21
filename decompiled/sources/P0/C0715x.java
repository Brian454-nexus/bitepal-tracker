package P0;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z0.AbstractC2393D;
import z0.C2400K;

/* renamed from: P0.x, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0715x extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final List f4285a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4286b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f4287c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4288d;

    /* renamed from: P0.x$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4289a = new a();

        public final WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View v6, WindowInsets insets) {
            Intrinsics.checkNotNullParameter(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            Intrinsics.checkNotNullParameter(v6, "v");
            Intrinsics.checkNotNullParameter(insets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(v6, insets);
            Intrinsics.checkNotNullExpressionValue(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0715x(Context context, AttributeSet attrs, I fm) {
        super(context, attrs);
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(fm, "fm");
        this.f4285a = new ArrayList();
        this.f4286b = new ArrayList();
        this.f4288d = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = O0.c.f3888e;
        Intrinsics.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(O0.c.f3889f) : classAttribute;
        String string = obtainStyledAttributes.getString(O0.c.f3890g);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0708p h02 = fm.h0(id);
        if (classAttribute != null && h02 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            AbstractComponentCallbacksC0708p a6 = fm.t0().a(context.getClassLoader(), classAttribute);
            Intrinsics.checkNotNullExpressionValue(a6, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a6.mFragmentId = id;
            a6.mContainerId = id;
            a6.mTag = string;
            a6.mFragmentManager = fm;
            a6.mHost = fm.v0();
            a6.onInflate(context, attrs, (Bundle) null);
            fm.n().m(true).d(this, a6, string).i();
        }
        fm.T0(this);
    }

    public final void a(View view) {
        if (this.f4286b.contains(view)) {
            this.f4285a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int i6, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (I.C0(child) != null) {
            super.addView(child, i6, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        C2400K F6;
        Intrinsics.checkNotNullParameter(insets, "insets");
        C2400K n6 = C2400K.n(insets);
        Intrinsics.checkNotNullExpressionValue(n6, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f4287c;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f4289a;
            Intrinsics.checkNotNull(onApplyWindowInsetsListener);
            F6 = C2400K.n(aVar.a(onApplyWindowInsetsListener, this, insets));
        } else {
            F6 = AbstractC2393D.F(this, n6);
        }
        Intrinsics.checkNotNullExpressionValue(F6, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!F6.h()) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                AbstractC2393D.b(getChildAt(i6), F6);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f4288d) {
            Iterator it = this.f4285a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View child, long j6) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.f4288d && !this.f4285a.isEmpty() && this.f4285a.contains(child)) {
            return false;
        }
        return super.drawChild(canvas, child, j6);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f4286b.remove(view);
        if (this.f4285a.remove(view)) {
            this.f4288d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0708p> F getFragment() {
        return (F) I.k0(this).h0(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                Intrinsics.checkNotNullExpressionValue(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i6) {
        View view = getChildAt(i6);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        a(view);
        super.removeViewAt(i6);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i6, int i7) {
        int i8 = i6 + i7;
        for (int i9 = i6; i9 < i8; i9++) {
            View view = getChildAt(i9);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViews(i6, i7);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i6, int i7) {
        int i8 = i6 + i7;
        for (int i9 = i6; i9 < i8; i9++) {
            View view = getChildAt(i9);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i6, i7);
    }

    @JvmName(name = "setDrawDisappearingViewsLast")
    public final void setDrawDisappearingViewsLast(boolean z6) {
        this.f4288d = z6;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@Nullable LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(@NotNull View.OnApplyWindowInsetsListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f4287c = listener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getParent() == this) {
            this.f4286b.add(view);
        }
        super.startViewTransition(view);
    }
}
