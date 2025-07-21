package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import n2.AbstractC1816c;
import p0.AbstractC1895i;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: L, reason: collision with root package name */
    public boolean f9545L;

    public PreferenceScreen(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, AbstractC1895i.a(context, AbstractC1816c.f17625f, R.attr.preferenceScreenStyle));
        this.f9545L = true;
    }

    @Override // androidx.preference.Preference
    public void t() {
        if (f() == null && e() == null && G() != 0) {
            k();
            throw null;
        }
    }
}
