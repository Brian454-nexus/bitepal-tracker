package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.preference.Preference;
import n2.AbstractC1816c;
import n2.AbstractC1819f;
import n2.AbstractC1820g;
import p0.AbstractC1895i;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class EditTextPreference extends DialogPreference {

    /* renamed from: J, reason: collision with root package name */
    public String f9495J;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements Preference.b {

        /* renamed from: a, reason: collision with root package name */
        public static a f9496a;

        public static a b() {
            if (f9496a == null) {
                f9496a = new a();
            }
            return f9496a;
        }

        @Override // androidx.preference.Preference.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.F()) ? editTextPreference.c().getString(AbstractC1819f.f17632a) : editTextPreference.F();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1820g.f17732v, i6, i7);
        int i8 = AbstractC1820g.f17734w;
        if (AbstractC1895i.b(obtainStyledAttributes, i8, i8, false)) {
            C(a.b());
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public boolean D() {
        return TextUtils.isEmpty(this.f9495J) || super.D();
    }

    public String F() {
        return this.f9495J;
    }

    @Override // androidx.preference.Preference
    public Object v(TypedArray typedArray, int i6) {
        return typedArray.getString(i6);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i6) {
        this(context, attributeSet, i6, 0);
    }

    public EditTextPreference(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1895i.a(context, AbstractC1816c.f17623d, R.attr.editTextPreferenceStyle));
    }
}
