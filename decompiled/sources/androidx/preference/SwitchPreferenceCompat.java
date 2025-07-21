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
import androidx.appcompat.widget.SwitchCompat;
import n2.AbstractC1816c;
import n2.AbstractC1817d;
import n2.AbstractC1820g;
import p0.AbstractC1895i;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: I, reason: collision with root package name */
    public final a f9564I;

    /* renamed from: J, reason: collision with root package name */
    public CharSequence f9565J;

    /* renamed from: K, reason: collision with root package name */
    public CharSequence f9566K;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
            if (SwitchPreferenceCompat.this.a(Boolean.valueOf(z6))) {
                SwitchPreferenceCompat.this.G(z6);
            } else {
                compoundButton.setChecked(!z6);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
        this.f9564I = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1820g.f17674U0, i6, i7);
        J(AbstractC1895i.f(obtainStyledAttributes, AbstractC1820g.f17693c1, AbstractC1820g.f17676V0));
        I(AbstractC1895i.f(obtainStyledAttributes, AbstractC1820g.f17690b1, AbstractC1820g.f17678W0));
        M(AbstractC1895i.f(obtainStyledAttributes, AbstractC1820g.f17699e1, AbstractC1820g.f17682Y0));
        L(AbstractC1895i.f(obtainStyledAttributes, AbstractC1820g.f17696d1, AbstractC1820g.f17684Z0));
        H(AbstractC1895i.b(obtainStyledAttributes, AbstractC1820g.f17687a1, AbstractC1820g.f17680X0, false));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void N(View view) {
        boolean z6 = view instanceof SwitchCompat;
        if (z6) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f9568D);
        }
        if (z6) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f9565J);
            switchCompat.setTextOff(this.f9566K);
            switchCompat.setOnCheckedChangeListener(this.f9564I);
        }
    }

    private void O(View view) {
        if (((AccessibilityManager) c().getSystemService("accessibility")).isEnabled()) {
            N(view.findViewById(AbstractC1817d.f17630a));
            K(view.findViewById(R.id.summary));
        }
    }

    public void L(CharSequence charSequence) {
        this.f9566K = charSequence;
        r();
    }

    public void M(CharSequence charSequence) {
        this.f9565J = charSequence;
        r();
    }

    @Override // androidx.preference.Preference
    public void y(View view) {
        super.y(view);
        O(view);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i6) {
        this(context, attributeSet, i6, 0);
    }

    public SwitchPreferenceCompat(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1816c.f17628i);
    }
}
