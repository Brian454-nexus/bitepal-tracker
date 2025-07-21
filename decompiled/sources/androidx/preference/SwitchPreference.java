package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.annotation.NonNull;
import n2.AbstractC1816c;
import n2.AbstractC1820g;
import p0.AbstractC1895i;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: I, reason: collision with root package name */
    public final a f9560I;

    /* renamed from: J, reason: collision with root package name */
    public CharSequence f9561J;

    /* renamed from: K, reason: collision with root package name */
    public CharSequence f9562K;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
            if (SwitchPreference.this.a(Boolean.valueOf(z6))) {
                SwitchPreference.this.G(z6);
            } else {
                compoundButton.setChecked(!z6);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
        this.f9560I = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1820g.f17652J0, i6, i7);
        J(AbstractC1895i.f(obtainStyledAttributes, AbstractC1820g.f17668R0, AbstractC1820g.f17654K0));
        I(AbstractC1895i.f(obtainStyledAttributes, AbstractC1820g.f17666Q0, AbstractC1820g.f17656L0));
        M(AbstractC1895i.f(obtainStyledAttributes, AbstractC1820g.f17672T0, AbstractC1820g.f17660N0));
        L(AbstractC1895i.f(obtainStyledAttributes, AbstractC1820g.f17670S0, AbstractC1820g.f17662O0));
        H(AbstractC1895i.b(obtainStyledAttributes, AbstractC1820g.f17664P0, AbstractC1820g.f17658M0, false));
        obtainStyledAttributes.recycle();
    }

    private void O(View view) {
        if (((AccessibilityManager) c().getSystemService("accessibility")).isEnabled()) {
            N(view.findViewById(R.id.switch_widget));
            K(view.findViewById(R.id.summary));
        }
    }

    public void L(CharSequence charSequence) {
        this.f9562K = charSequence;
        r();
    }

    public void M(CharSequence charSequence) {
        this.f9561J = charSequence;
        r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(View view) {
        boolean z6 = view instanceof Switch;
        if (z6) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f9568D);
        }
        if (z6) {
            Switch r42 = (Switch) view;
            r42.setTextOn(this.f9561J);
            r42.setTextOff(this.f9562K);
            r42.setOnCheckedChangeListener(this.f9560I);
        }
    }

    @Override // androidx.preference.Preference
    public void y(View view) {
        super.y(view);
        O(view);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i6) {
        this(context, attributeSet, i6, 0);
    }

    public SwitchPreference(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1895i.a(context, AbstractC1816c.f17629j, R.attr.switchPreferenceStyle));
    }
}
