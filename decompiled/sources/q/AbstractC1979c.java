package q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import k.AbstractC1653a;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1979c extends AutoCompleteTextView {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f18522c = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C1980d f18523a;

    /* renamed from: b, reason: collision with root package name */
    public final C1989m f18524b;

    public AbstractC1979c(Context context, AttributeSet attributeSet, int i6) {
        super(O.b(context), attributeSet, i6);
        S r6 = S.r(getContext(), attributeSet, f18522c, i6, 0);
        if (r6.o(0)) {
            setDropDownBackgroundDrawable(r6.f(0));
        }
        r6.s();
        C1980d c1980d = new C1980d(this);
        this.f18523a = c1980d;
        c1980d.e(attributeSet, i6);
        C1989m c1989m = new C1989m(this);
        this.f18524b = c1989m;
        c1989m.m(attributeSet, i6);
        c1989m.b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1980d c1980d = this.f18523a;
        if (c1980d != null) {
            c1980d.b();
        }
        C1989m c1989m = this.f18524b;
        if (c1989m != null) {
            c1989m.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1980d c1980d = this.f18523a;
        if (c1980d != null) {
            return c1980d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1980d c1980d = this.f18523a;
        if (c1980d != null) {
            return c1980d.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC1982f.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1980d c1980d = this.f18523a;
        if (c1980d != null) {
            c1980d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        C1980d c1980d = this.f18523a;
        if (c1980d != null) {
            c1980d.g(i6);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0.h.m(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i6) {
        setDropDownBackgroundDrawable(AbstractC1653a.b(getContext(), i6));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1980d c1980d = this.f18523a;
        if (c1980d != null) {
            c1980d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1980d c1980d = this.f18523a;
        if (c1980d != null) {
            c1980d.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        C1989m c1989m = this.f18524b;
        if (c1989m != null) {
            c1989m.p(context, i6);
        }
    }
}
