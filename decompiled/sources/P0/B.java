package P0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class B implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final I f3919a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O f3920a;

        public a(O o6) {
            this.f3920a = o6;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AbstractComponentCallbacksC0708p k6 = this.f3920a.k();
            this.f3920a.m();
            a0.u((ViewGroup) k6.mView.getParent(), B.this.f3919a).q();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public B(I i6) {
        this.f3919a = i6;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        O v6;
        if (C0715x.class.getName().equals(str)) {
            return new C0715x(context, attributeSet, this.f3919a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O0.c.f3884a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(O0.c.f3885b);
        }
        int resourceId = obtainStyledAttributes.getResourceId(O0.c.f3886c, -1);
        String string = obtainStyledAttributes.getString(O0.c.f3887d);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !AbstractC0717z.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        AbstractComponentCallbacksC0708p h02 = resourceId != -1 ? this.f3919a.h0(resourceId) : null;
        if (h02 == null && string != null) {
            h02 = this.f3919a.i0(string);
        }
        if (h02 == null && id != -1) {
            h02 = this.f3919a.h0(id);
        }
        if (h02 == null) {
            h02 = this.f3919a.t0().a(context.getClassLoader(), attributeValue);
            h02.mFromLayout = true;
            h02.mFragmentId = resourceId != 0 ? resourceId : id;
            h02.mContainerId = id;
            h02.mTag = string;
            h02.mInLayout = true;
            I i6 = this.f3919a;
            h02.mFragmentManager = i6;
            h02.mHost = i6.v0();
            h02.onInflate(this.f3919a.v0().f(), attributeSet, h02.mSavedFragmentState);
            v6 = this.f3919a.i(h02);
            if (I.I0(2)) {
                Log.v("FragmentManager", "Fragment " + h02 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else if (!h02.mInLayout) {
            h02.mInLayout = true;
            I i7 = this.f3919a;
            h02.mFragmentManager = i7;
            h02.mHost = i7.v0();
            h02.onInflate(this.f3919a.v0().f(), attributeSet, h02.mSavedFragmentState);
            v6 = this.f3919a.v(h02);
            if (I.I0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + h02 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        Q0.c.g(h02, viewGroup);
        h02.mContainer = viewGroup;
        v6.m();
        v6.j();
        View view2 = h02.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (h02.mView.getTag() == null) {
            h02.mView.setTag(string);
        }
        h02.mView.addOnAttachStateChangeListener(new a(v6));
        return h02.mView;
    }
}
