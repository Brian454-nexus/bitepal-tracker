package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* renamed from: D, reason: collision with root package name */
    public boolean f9568D;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f9569E;

    /* renamed from: F, reason: collision with root package name */
    public CharSequence f9570F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f9571G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f9572H;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
    }

    @Override // androidx.preference.Preference
    public boolean D() {
        return (this.f9572H ? this.f9568D : !this.f9568D) || super.D();
    }

    public boolean F() {
        return this.f9568D;
    }

    public void G(boolean z6) {
        boolean z7 = this.f9568D != z6;
        if (z7 || !this.f9571G) {
            this.f9568D = z6;
            this.f9571G = true;
            z(z6);
            if (z7) {
                s(D());
                r();
            }
        }
    }

    public void H(boolean z6) {
        this.f9572H = z6;
    }

    public void I(CharSequence charSequence) {
        this.f9570F = charSequence;
        if (F()) {
            return;
        }
        r();
    }

    public void J(CharSequence charSequence) {
        this.f9569E = charSequence;
        if (F()) {
            r();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            goto L4c
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.f9568D
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r4.f9569E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r4.f9569E
            r5.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r4.f9568D
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.f9570F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.f9570F
            r5.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r2 = r4.l()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3e
            r5.setText(r2)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L4c
            r5.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.K(android.view.View):void");
    }

    @Override // androidx.preference.Preference
    public void t() {
        super.t();
        boolean z6 = !F();
        if (a(Boolean.valueOf(z6))) {
            G(z6);
        }
    }

    @Override // androidx.preference.Preference
    public Object v(TypedArray typedArray, int i6) {
        return Boolean.valueOf(typedArray.getBoolean(i6, false));
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i6) {
        this(context, attributeSet, i6, 0);
    }

    public TwoStatePreference(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
