package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import n2.AbstractC1816c;
import p0.AbstractC1895i;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
    }

    @Override // androidx.preference.Preference
    public boolean D() {
        return !super.p();
    }

    @Override // androidx.preference.Preference
    public boolean p() {
        return false;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i6) {
        this(context, attributeSet, i6, 0);
    }

    public PreferenceCategory(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1895i.a(context, AbstractC1816c.f17624e, R.attr.preferenceCategoryStyle));
    }
}
