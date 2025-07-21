package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import n2.AbstractC1816c;
import n2.AbstractC1820g;
import p0.AbstractC1895i;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: I, reason: collision with root package name */
    public final a f9482I;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
            if (CheckBoxPreference.this.a(Boolean.valueOf(z6))) {
                CheckBoxPreference.this.G(z6);
            } else {
                compoundButton.setChecked(!z6);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i6) {
        this(context, attributeSet, i6, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(View view) {
        boolean z6 = view instanceof CompoundButton;
        if (z6) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f9568D);
        }
        if (z6) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f9482I);
        }
    }

    public final void M(View view) {
        if (((AccessibilityManager) c().getSystemService("accessibility")).isEnabled()) {
            L(view.findViewById(R.id.checkbox));
            K(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void y(View view) {
        super.y(view);
        M(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
        this.f9482I = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1820g.f17688b, i6, i7);
        J(AbstractC1895i.f(obtainStyledAttributes, AbstractC1820g.f17704h, AbstractC1820g.f17691c));
        I(AbstractC1895i.f(obtainStyledAttributes, AbstractC1820g.f17702g, AbstractC1820g.f17694d));
        H(AbstractC1895i.b(obtainStyledAttributes, AbstractC1820g.f17700f, AbstractC1820g.f17697e, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1895i.a(context, AbstractC1816c.f17620a, R.attr.checkBoxPreferenceStyle));
    }
}
