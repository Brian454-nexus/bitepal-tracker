package P0;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import z0.ViewTreeObserverOnPreDrawListenerC2439y;

/* renamed from: P0.v, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0713v {
    public static int a(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, boolean z6, boolean z7) {
        return z7 ? z6 ? abstractComponentCallbacksC0708p.getPopEnterAnim() : abstractComponentCallbacksC0708p.getPopExitAnim() : z6 ? abstractComponentCallbacksC0708p.getEnterAnim() : abstractComponentCallbacksC0708p.getExitAnim();
    }

    public static a b(Context context, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, boolean z6, boolean z7) {
        int nextTransition = abstractComponentCallbacksC0708p.getNextTransition();
        int a6 = a(abstractComponentCallbacksC0708p, z6, z7);
        abstractComponentCallbacksC0708p.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = abstractComponentCallbacksC0708p.mContainer;
        if (viewGroup != null) {
            int i6 = O0.b.f3883c;
            if (viewGroup.getTag(i6) != null) {
                abstractComponentCallbacksC0708p.mContainer.setTag(i6, null);
            }
        }
        ViewGroup viewGroup2 = abstractComponentCallbacksC0708p.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = abstractComponentCallbacksC0708p.onCreateAnimation(nextTransition, z6, a6);
        if (onCreateAnimation != null) {
            return new a(onCreateAnimation);
        }
        Animator onCreateAnimator = abstractComponentCallbacksC0708p.onCreateAnimator(nextTransition, z6, a6);
        if (onCreateAnimator != null) {
            return new a(onCreateAnimator);
        }
        if (a6 == 0 && nextTransition != 0) {
            a6 = d(context, nextTransition, z6);
        }
        if (a6 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(a6));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, a6);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                } catch (Resources.NotFoundException e6) {
                    throw e6;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, a6);
                if (loadAnimator != null) {
                    return new a(loadAnimator);
                }
            } catch (RuntimeException e7) {
                if (equals) {
                    throw e7;
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a6);
                if (loadAnimation2 != null) {
                    return new a(loadAnimation2);
                }
            }
        }
        return null;
    }

    public static int c(Context context, int i6) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i6});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int d(Context context, int i6, boolean z6) {
        if (i6 == 4097) {
            return z6 ? O0.a.f3879e : O0.a.f3880f;
        }
        if (i6 == 8194) {
            return z6 ? O0.a.f3875a : O0.a.f3876b;
        }
        if (i6 == 8197) {
            return z6 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i6 == 4099) {
            return z6 ? O0.a.f3877c : O0.a.f3878d;
        }
        if (i6 != 4100) {
            return -1;
        }
        return z6 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    /* renamed from: P0.v$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f4278a;

        /* renamed from: b, reason: collision with root package name */
        public final AnimatorSet f4279b;

        public a(Animation animation) {
            this.f4278a = animation;
            this.f4279b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public a(Animator animator) {
            this.f4278a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f4279b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: P0.v$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b extends AnimationSet implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final ViewGroup f4280a;

        /* renamed from: b, reason: collision with root package name */
        public final View f4281b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f4282c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f4283d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f4284e;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f4284e = true;
            this.f4280a = viewGroup;
            this.f4281b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j6, Transformation transformation) {
            this.f4284e = true;
            if (this.f4282c) {
                return !this.f4283d;
            }
            if (!super.getTransformation(j6, transformation)) {
                this.f4282c = true;
                ViewTreeObserverOnPreDrawListenerC2439y.a(this.f4280a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4282c || !this.f4284e) {
                this.f4280a.endViewTransition(this.f4281b);
                this.f4283d = true;
            } else {
                this.f4284e = false;
                this.f4280a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j6, Transformation transformation, float f6) {
            this.f4284e = true;
            if (this.f4282c) {
                return !this.f4283d;
            }
            if (!super.getTransformation(j6, transformation, f6)) {
                this.f4282c = true;
                ViewTreeObserverOnPreDrawListenerC2439y.a(this.f4280a, this);
            }
            return true;
        }
    }
}
