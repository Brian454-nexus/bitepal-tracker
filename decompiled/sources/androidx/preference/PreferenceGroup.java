package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import j0.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;
import n2.AbstractC1820g;
import p0.AbstractC1895i;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: D, reason: collision with root package name */
    public final k f9536D;

    /* renamed from: E, reason: collision with root package name */
    public final Handler f9537E;

    /* renamed from: F, reason: collision with root package name */
    public final List f9538F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f9539G;

    /* renamed from: H, reason: collision with root package name */
    public int f9540H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f9541I;

    /* renamed from: J, reason: collision with root package name */
    public int f9542J;

    /* renamed from: K, reason: collision with root package name */
    public final Runnable f9543K;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f9536D.clear();
            }
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
        this.f9536D = new k();
        this.f9537E = new Handler(Looper.getMainLooper());
        this.f9539G = true;
        this.f9540H = 0;
        this.f9541I = false;
        this.f9542J = IntCompanionObject.MAX_VALUE;
        this.f9543K = new a();
        this.f9538F = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1820g.f17733v0, i6, i7);
        int i8 = AbstractC1820g.f17737x0;
        this.f9539G = AbstractC1895i.b(obtainStyledAttributes, i8, i8, true);
        int i9 = AbstractC1820g.f17735w0;
        if (obtainStyledAttributes.hasValue(i9)) {
            H(AbstractC1895i.d(obtainStyledAttributes, i9, i9, IntCompanionObject.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    public Preference F(int i6) {
        return (Preference) this.f9538F.get(i6);
    }

    public int G() {
        return this.f9538F.size();
    }

    public void H(int i6) {
        if (i6 != Integer.MAX_VALUE && !o()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f9542J = i6;
    }

    @Override // androidx.preference.Preference
    public void s(boolean z6) {
        super.s(z6);
        int G6 = G();
        for (int i6 = 0; i6 < G6; i6++) {
            F(i6).w(this, z6);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i6) {
        this(context, attributeSet, i6, 0);
    }

    public PreferenceGroup(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
