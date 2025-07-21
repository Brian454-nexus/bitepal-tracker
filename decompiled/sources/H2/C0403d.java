package H2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import z0.AbstractC2393D;

/* renamed from: H2.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0403d extends N {

    /* renamed from: H2.d$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends AbstractC0412m {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f2102a;

        public a(View view) {
            this.f2102a = view;
        }

        @Override // H2.AbstractC0411l.f
        public void b(AbstractC0411l abstractC0411l) {
            A.g(this.f2102a, 1.0f);
            A.a(this.f2102a);
            abstractC0411l.Q(this);
        }
    }

    /* renamed from: H2.d$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final View f2104a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f2105b = false;

        public b(View view) {
            this.f2104a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            A.g(this.f2104a, 1.0f);
            if (this.f2105b) {
                this.f2104a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (AbstractC2393D.w(this.f2104a) && this.f2104a.getLayerType() == 0) {
                this.f2105b = true;
                this.f2104a.setLayerType(2, null);
            }
        }
    }

    public C0403d(int i6) {
        j0(i6);
    }

    public static float l0(s sVar, float f6) {
        Float f7;
        return (sVar == null || (f7 = (Float) sVar.f2187a.get("android:fade:transitionAlpha")) == null) ? f6 : f7.floatValue();
    }

    @Override // H2.N
    public Animator g0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float l02 = l0(sVar, 0.0f);
        return k0(view, l02 != 1.0f ? l02 : 0.0f, 1.0f);
    }

    @Override // H2.N
    public Animator i0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        A.e(view);
        return k0(view, l0(sVar, 1.0f), 0.0f);
    }

    @Override // H2.N, H2.AbstractC0411l
    public void k(s sVar) {
        super.k(sVar);
        sVar.f2187a.put("android:fade:transitionAlpha", Float.valueOf(A.c(sVar.f2188b)));
    }

    public final Animator k0(View view, float f6, float f7) {
        if (f6 == f7) {
            return null;
        }
        A.g(view, f6);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) A.f2037b, f7);
        ofFloat.addListener(new b(view));
        a(new a(view));
        return ofFloat;
    }
}
