package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.preference.Preference;
import n2.AbstractC1816c;
import n2.AbstractC1819f;
import n2.AbstractC1820g;
import p0.AbstractC1895i;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: J, reason: collision with root package name */
    public CharSequence[] f9497J;

    /* renamed from: K, reason: collision with root package name */
    public CharSequence[] f9498K;

    /* renamed from: L, reason: collision with root package name */
    public String f9499L;

    /* renamed from: M, reason: collision with root package name */
    public String f9500M;

    /* renamed from: V, reason: collision with root package name */
    public boolean f9501V;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements Preference.b {

        /* renamed from: a, reason: collision with root package name */
        public static a f9502a;

        public static a b() {
            if (f9502a == null) {
                f9502a = new a();
            }
            return f9502a;
        }

        @Override // androidx.preference.Preference.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.H()) ? listPreference.c().getString(AbstractC1819f.f17632a) : listPreference.H();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1820g.f17736x, i6, i7);
        this.f9497J = AbstractC1895i.h(obtainStyledAttributes, AbstractC1820g.f17633A, AbstractC1820g.f17738y);
        this.f9498K = AbstractC1895i.h(obtainStyledAttributes, AbstractC1820g.f17635B, AbstractC1820g.f17740z);
        int i8 = AbstractC1820g.f17637C;
        if (AbstractC1895i.b(obtainStyledAttributes, i8, i8, false)) {
            C(a.b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1820g.f17649I, i6, i7);
        this.f9500M = AbstractC1895i.f(obtainStyledAttributes2, AbstractC1820g.f17723q0, AbstractC1820g.f17665Q);
        obtainStyledAttributes2.recycle();
    }

    public int F(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f9498K) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f9498K[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] G() {
        return this.f9497J;
    }

    public CharSequence H() {
        CharSequence[] charSequenceArr;
        int K5 = K();
        if (K5 < 0 || (charSequenceArr = this.f9497J) == null) {
            return null;
        }
        return charSequenceArr[K5];
    }

    public CharSequence[] I() {
        return this.f9498K;
    }

    public String J() {
        return this.f9499L;
    }

    public final int K() {
        return F(this.f9499L);
    }

    public void L(String str) {
        boolean equals = TextUtils.equals(this.f9499L, str);
        if (equals && this.f9501V) {
            return;
        }
        this.f9499L = str;
        this.f9501V = true;
        B(str);
        if (equals) {
            return;
        }
        r();
    }

    @Override // androidx.preference.Preference
    public CharSequence l() {
        if (m() != null) {
            return m().a(this);
        }
        CharSequence H6 = H();
        CharSequence l6 = super.l();
        String str = this.f9500M;
        if (str != null) {
            if (H6 == null) {
                H6 = "";
            }
            String format = String.format(str, H6);
            if (!TextUtils.equals(format, l6)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return l6;
    }

    @Override // androidx.preference.Preference
    public Object v(TypedArray typedArray, int i6) {
        return typedArray.getString(i6);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i6) {
        this(context, attributeSet, i6, 0);
    }

    public ListPreference(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1895i.a(context, AbstractC1816c.f17621b, R.attr.dialogPreferenceStyle));
    }
}
