package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import n2.AbstractC1816c;
import n2.AbstractC1820g;
import p0.AbstractC1895i;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class DialogPreference extends Preference {

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f9484D;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f9485E;

    /* renamed from: F, reason: collision with root package name */
    public Drawable f9486F;

    /* renamed from: G, reason: collision with root package name */
    public CharSequence f9487G;

    /* renamed from: H, reason: collision with root package name */
    public CharSequence f9488H;

    /* renamed from: I, reason: collision with root package name */
    public int f9489I;

    public DialogPreference(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1820g.f17706i, i6, i7);
        String f6 = AbstractC1895i.f(obtainStyledAttributes, AbstractC1820g.f17726s, AbstractC1820g.f17708j);
        this.f9484D = f6;
        if (f6 == null) {
            this.f9484D = n();
        }
        this.f9485E = AbstractC1895i.f(obtainStyledAttributes, AbstractC1820g.f17724r, AbstractC1820g.f17710k);
        this.f9486F = AbstractC1895i.c(obtainStyledAttributes, AbstractC1820g.f17720p, AbstractC1820g.f17712l);
        this.f9487G = AbstractC1895i.f(obtainStyledAttributes, AbstractC1820g.f17730u, AbstractC1820g.f17714m);
        this.f9488H = AbstractC1895i.f(obtainStyledAttributes, AbstractC1820g.f17728t, AbstractC1820g.f17716n);
        this.f9489I = AbstractC1895i.e(obtainStyledAttributes, AbstractC1820g.f17722q, AbstractC1820g.f17718o, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void t() {
        k();
        throw null;
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i6) {
        this(context, attributeSet, i6, 0);
    }

    public DialogPreference(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1895i.a(context, AbstractC1816c.f17621b, R.attr.dialogPreferenceStyle));
    }
}
