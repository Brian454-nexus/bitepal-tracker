package q;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import i.AbstractC1468a;
import i.AbstractC1476i;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1977a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C0234a f18512a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f18513b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f18514c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.appcompat.widget.a f18515d;

    /* renamed from: e, reason: collision with root package name */
    public int f18516e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18517f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18518g;

    /* renamed from: q.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0234a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f18519a = false;

        public C0234a() {
        }
    }

    public AbstractC1977a(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f18512a = new C0234a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(AbstractC1468a.f15327a, typedValue, true) || typedValue.resourceId == 0) {
            this.f18513b = context;
        } else {
            this.f18513b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int b(int i6, int i7, boolean z6) {
        return z6 ? i6 - i7 : i6 + i7;
    }

    public int a(View view, int i6, int i7, int i8) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i6, IntCompanionObject.MIN_VALUE), i7);
        return Math.max(0, (i6 - view.getMeasuredWidth()) - i8);
    }

    public int c(View view, int i6, int i7, int i8, boolean z6) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i9 = i7 + ((i8 - measuredHeight) / 2);
        if (z6) {
            view.layout(i6 - measuredWidth, i9, i6, measuredHeight + i9);
        } else {
            view.layout(i6, i9, i6 + measuredWidth, measuredHeight + i9);
        }
        return z6 ? -measuredWidth : measuredWidth;
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f18516e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC1476i.f15561a, AbstractC1468a.f15329c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(AbstractC1476i.f15601i, 0));
        obtainStyledAttributes.recycle();
        androidx.appcompat.widget.a aVar = this.f18515d;
        if (aVar != null) {
            aVar.B(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f18518g = false;
        }
        if (!this.f18518g) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f18518g = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f18518g = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f18517f = false;
        }
        if (!this.f18517f) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f18517f = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f18517f = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i6);

    @Override // android.view.View
    public void setVisibility(int i6) {
        if (i6 != getVisibility()) {
            super.setVisibility(i6);
        }
    }
}
