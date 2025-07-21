package q;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import k.AbstractC1653a;
import q0.AbstractC2003f;
import x0.j;

/* renamed from: q.n, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1990n extends TextView implements C0.b {

    /* renamed from: a, reason: collision with root package name */
    public final C1980d f18571a;

    /* renamed from: b, reason: collision with root package name */
    public final C1989m f18572b;

    /* renamed from: c, reason: collision with root package name */
    public final C1987k f18573c;

    /* renamed from: d, reason: collision with root package name */
    public Future f18574d;

    public C1990n(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1980d c1980d = this.f18571a;
        if (c1980d != null) {
            c1980d.b();
        }
        C1989m c1989m = this.f18572b;
        if (c1989m != null) {
            c1989m.b();
        }
    }

    public final void e() {
        Future future = this.f18574d;
        if (future != null) {
            try {
                this.f18574d = null;
                android.support.v4.media.session.b.a(future.get());
                C0.h.k(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (C0.b.f452N) {
            return super.getAutoSizeMaxTextSize();
        }
        C1989m c1989m = this.f18572b;
        if (c1989m != null) {
            return c1989m.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (C0.b.f452N) {
            return super.getAutoSizeMinTextSize();
        }
        C1989m c1989m = this.f18572b;
        if (c1989m != null) {
            return c1989m.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (C0.b.f452N) {
            return super.getAutoSizeStepGranularity();
        }
        C1989m c1989m = this.f18572b;
        if (c1989m != null) {
            return c1989m.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (C0.b.f452N) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1989m c1989m = this.f18572b;
        return c1989m != null ? c1989m.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C0.b.f452N) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1989m c1989m = this.f18572b;
        if (c1989m != null) {
            return c1989m.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return C0.h.a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return C0.h.b(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1980d c1980d = this.f18571a;
        if (c1980d != null) {
            return c1980d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1980d c1980d = this.f18571a;
        if (c1980d != null) {
            return c1980d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f18572b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f18572b.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        e();
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        C1987k c1987k;
        return (Build.VERSION.SDK_INT >= 28 || (c1987k = this.f18573c) == null) ? super.getTextClassifier() : c1987k.a();
    }

    @NonNull
    public j.a getTextMetricsParamsCompat() {
        return C0.h.e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC1982f.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        super.onLayout(z6, i6, i7, i8, i9);
        C1989m c1989m = this.f18572b;
        if (c1989m != null) {
            c1989m.n(z6, i6, i7, i8, i9);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i6, int i7) {
        e();
        super.onMeasure(i6, i7);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        super.onTextChanged(charSequence, i6, i7, i8);
        C1989m c1989m = this.f18572b;
        if (c1989m == null || C0.b.f452N || !c1989m.l()) {
            return;
        }
        this.f18572b.c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i6, int i7, int i8, int i9) {
        if (C0.b.f452N) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i6, i7, i8, i9);
            return;
        }
        C1989m c1989m = this.f18572b;
        if (c1989m != null) {
            c1989m.s(i6, i7, i8, i9);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i6) {
        if (C0.b.f452N) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i6);
            return;
        }
        C1989m c1989m = this.f18572b;
        if (c1989m != null) {
            c1989m.t(iArr, i6);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i6) {
        if (C0.b.f452N) {
            super.setAutoSizeTextTypeWithDefaults(i6);
            return;
        }
        C1989m c1989m = this.f18572b;
        if (c1989m != null) {
            c1989m.u(i6);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1980d c1980d = this.f18571a;
        if (c1980d != null) {
            c1980d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        C1980d c1980d = this.f18571a;
        if (c1980d != null) {
            c1980d.g(i6);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1989m c1989m = this.f18572b;
        if (c1989m != null) {
            c1989m.o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1989m c1989m = this.f18572b;
        if (c1989m != null) {
            c1989m.o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1989m c1989m = this.f18572b;
        if (c1989m != null) {
            c1989m.o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1989m c1989m = this.f18572b;
        if (c1989m != null) {
            c1989m.o();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0.h.m(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i6) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i6);
        } else {
            C0.h.h(this, i6);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i6) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i6);
        } else {
            C0.h.i(this, i6);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i6) {
        C0.h.j(this, i6);
    }

    public void setPrecomputedText(@NonNull x0.j jVar) {
        C0.h.k(this, jVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1980d c1980d = this.f18571a;
        if (c1980d != null) {
            c1980d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1980d c1980d = this.f18571a;
        if (c1980d != null) {
            c1980d.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f18572b.v(colorStateList);
        this.f18572b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f18572b.w(mode);
        this.f18572b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        C1989m c1989m = this.f18572b;
        if (c1989m != null) {
            c1989m.p(context, i6);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1987k c1987k;
        if (Build.VERSION.SDK_INT >= 28 || (c1987k = this.f18573c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1987k.b(textClassifier);
        }
    }

    public void setTextFuture(Future<x0.j> future) {
        this.f18574d = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull j.a aVar) {
        C0.h.l(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i6, float f6) {
        if (C0.b.f452N) {
            super.setTextSize(i6, f6);
            return;
        }
        C1989m c1989m = this.f18572b;
        if (c1989m != null) {
            c1989m.z(i6, f6);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i6) {
        Typeface a6 = (typeface == null || i6 <= 0) ? null : AbstractC2003f.a(getContext(), typeface, i6);
        if (a6 != null) {
            typeface = a6;
        }
        super.setTypeface(typeface, i6);
    }

    public C1990n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public C1990n(Context context, AttributeSet attributeSet, int i6) {
        super(O.b(context), attributeSet, i6);
        C1980d c1980d = new C1980d(this);
        this.f18571a = c1980d;
        c1980d.e(attributeSet, i6);
        C1989m c1989m = new C1989m(this);
        this.f18572b = c1989m;
        c1989m.m(attributeSet, i6);
        c1989m.b();
        this.f18573c = new C1987k(this);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i6, int i7, int i8, int i9) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i6 != 0 ? AbstractC1653a.b(context, i6) : null, i7 != 0 ? AbstractC1653a.b(context, i7) : null, i8 != 0 ? AbstractC1653a.b(context, i8) : null, i9 != 0 ? AbstractC1653a.b(context, i9) : null);
        C1989m c1989m = this.f18572b;
        if (c1989m != null) {
            c1989m.o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i6, int i7, int i8, int i9) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i6 != 0 ? AbstractC1653a.b(context, i6) : null, i7 != 0 ? AbstractC1653a.b(context, i7) : null, i8 != 0 ? AbstractC1653a.b(context, i8) : null, i9 != 0 ? AbstractC1653a.b(context, i9) : null);
        C1989m c1989m = this.f18572b;
        if (c1989m != null) {
            c1989m.o();
        }
    }
}
