package com.braze.ui.support;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"", "fromY", "toY", "", "duration", "", "accelerate", "Landroid/view/animation/Animation;", "createVerticalAnimation", "(FFJZ)Landroid/view/animation/Animation;", "animation", "setAnimationParams", "(Landroid/view/animation/Animation;JZ)Landroid/view/animation/Animation;", "Landroid/view/animation/Interpolator;", "accelerateInterpolator", "Landroid/view/animation/Interpolator;", "decelerateInterpolator", "android-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName(name = "AnimationUtils")
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AnimationUtils {

    @NotNull
    private static final Interpolator accelerateInterpolator = new AccelerateInterpolator();

    @NotNull
    private static final Interpolator decelerateInterpolator = new DecelerateInterpolator();

    @NotNull
    public static final Animation createVerticalAnimation(float f6, float f7, long j6, boolean z6) {
        return setAnimationParams(new TranslateAnimation(2, 0.0f, 2, 0.0f, 1, f6, 1, f7), j6, z6);
    }

    @NotNull
    public static final Animation setAnimationParams(@NotNull Animation animation, long j6, boolean z6) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        animation.setDuration(j6);
        if (z6) {
            animation.setInterpolator(accelerateInterpolator);
            return animation;
        }
        animation.setInterpolator(decelerateInterpolator);
        return animation;
    }
}
