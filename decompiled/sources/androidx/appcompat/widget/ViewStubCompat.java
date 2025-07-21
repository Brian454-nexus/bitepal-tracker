package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import i.AbstractC1476i;
import java.lang.ref.WeakReference;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f8290a;

    /* renamed from: b, reason: collision with root package name */
    public int f8291b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f8292c;

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflater f8293d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f8290a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f8293d;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f8290a, viewGroup, false);
        int i6 = this.f8291b;
        if (i6 != -1) {
            inflate.setId(i6);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f8292c = new WeakReference(inflate);
        return inflate;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f8291b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f8293d;
    }

    public int getLayoutResource() {
        return this.f8290a;
    }

    @Override // android.view.View
    public void onMeasure(int i6, int i7) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i6) {
        this.f8291b = i6;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f8293d = layoutInflater;
    }

    public void setLayoutResource(int i6) {
        this.f8290a = i6;
    }

    public void setOnInflateListener(a aVar) {
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        WeakReference weakReference = this.f8292c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i6);
            return;
        }
        super.setVisibility(i6);
        if (i6 == 0 || i6 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f8290a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1476i.f15595g3, i6, 0);
        this.f8291b = obtainStyledAttributes.getResourceId(AbstractC1476i.f15610j3, -1);
        this.f8290a = obtainStyledAttributes.getResourceId(AbstractC1476i.f15605i3, 0);
        setId(obtainStyledAttributes.getResourceId(AbstractC1476i.f15600h3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
