package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;
import n2.AbstractC1816c;
import n2.AbstractC1820g;
import p0.AbstractC1895i;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: J, reason: collision with root package name */
    public CharSequence[] f9503J;

    /* renamed from: K, reason: collision with root package name */
    public CharSequence[] f9504K;

    /* renamed from: L, reason: collision with root package name */
    public Set f9505L;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
        this.f9505L = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1820g.f17639D, i6, i7);
        this.f9503J = AbstractC1895i.h(obtainStyledAttributes, AbstractC1820g.f17645G, AbstractC1820g.f17641E);
        this.f9504K = AbstractC1895i.h(obtainStyledAttributes, AbstractC1820g.f17647H, AbstractC1820g.f17643F);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public Object v(TypedArray typedArray, int i6) {
        CharSequence[] textArray = typedArray.getTextArray(i6);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i6) {
        this(context, attributeSet, i6, 0);
    }

    public MultiSelectListPreference(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1895i.a(context, AbstractC1816c.f17621b, R.attr.dialogPreferenceStyle));
    }
}
