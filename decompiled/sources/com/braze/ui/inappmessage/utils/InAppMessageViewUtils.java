package com.braze.ui.inappmessage.utils;

import L4.u;
import L4.v;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J2\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u001f\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0010H\u0007J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0007J\u001a\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u0010H\u0007J\u001a\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u0017\u001a\u00020\u0010H\u0007J\u001c\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u00132\b\u0010!\u001a\u0004\u0018\u00010\u0013H\u0007J\b\u0010\"\u001a\u00020\u0005H\u0007J\u0018\u0010#\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0007J\u001a\u0010&\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u0017\u001a\u00020\u0010H\u0002¨\u0006'"}, d2 = {"Lcom/braze/ui/inappmessage/utils/InAppMessageViewUtils;", "", "<init>", "()V", "setImage", "", "bitmap", "Landroid/graphics/Bitmap;", "imageView", "Landroid/widget/ImageView;", "setIcon", "context", "Landroid/content/Context;", "icon", "", "iconColor", "", "iconBackgroundColor", "textView", "Landroid/widget/TextView;", "setFrameColor", "view", "Landroid/view/View;", "color", "(Landroid/view/View;Ljava/lang/Integer;)V", "setTextViewColor", "setViewBackgroundColor", "setViewBackgroundColorFilter", "setDrawableColor", "drawable", "Landroid/graphics/drawable/Drawable;", "resetMessageMarginsIfNecessary", "messageView", "headerView", "closeInAppMessageOnKeycodeBack", "setTextAlignment", "textAlign", "Lcom/braze/enums/inappmessage/TextAlign;", "setDrawableColorFilter", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInAppMessageViewUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppMessageViewUtils.kt\ncom/braze/ui/inappmessage/utils/InAppMessageViewUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class InAppMessageViewUtils {

    @NotNull
    public static final InAppMessageViewUtils INSTANCE = new InAppMessageViewUtils();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextAlign.values().length];
            try {
                iArr[TextAlign.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextAlign.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextAlign.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private InAppMessageViewUtils() {
    }

    @JvmStatic
    public static final void closeInAppMessageOnKeycodeBack() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: L4.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String closeInAppMessageOnKeycodeBack$lambda$3;
                closeInAppMessageOnKeycodeBack$lambda$3 = InAppMessageViewUtils.closeInAppMessageOnKeycodeBack$lambda$3();
                return closeInAppMessageOnKeycodeBack$lambda$3;
            }
        }, 7, (Object) null);
        BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeInAppMessageOnKeycodeBack$lambda$3() {
        return "Back button intercepted by in-app message view, closing in-app message.";
    }

    @JvmStatic
    public static final void resetMessageMarginsIfNecessary(@Nullable TextView messageView, @Nullable TextView headerView) {
        if (headerView != null || messageView == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(messageView.getLayoutParams().width, messageView.getLayoutParams().height);
        layoutParams.setMargins(0, 0, 0, 0);
        messageView.setLayoutParams(layoutParams);
    }

    @JvmStatic
    public static final void setDrawableColor(@NotNull Drawable drawable, int color) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() <= 0 || !(layerDrawable.getDrawable(0) instanceof GradientDrawable)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: L4.y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String drawableColor$lambda$2;
                        drawableColor$lambda$2 = InAppMessageViewUtils.setDrawableColor$lambda$2();
                        return drawableColor$lambda$2;
                    }
                }, 7, (Object) null);
            } else {
                Drawable drawable2 = layerDrawable.getDrawable(0);
                Intrinsics.checkNotNullExpressionValue(drawable2, "getDrawable(...)");
                setDrawableColor(drawable2, color);
            }
        }
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(color);
        } else {
            INSTANCE.setDrawableColorFilter(drawable, color);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDrawableColor$lambda$2() {
        return "LayerDrawable for button background did not have the expected number of layers or the 0th layer was not a GradientDrawable.";
    }

    private final void setDrawableColorFilter(Drawable drawable, int color) {
        BlendMode blendMode;
        if (Build.VERSION.SDK_INT < 29) {
            drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
            return;
        }
        v.a();
        blendMode = BlendMode.SRC_ATOP;
        drawable.setColorFilter(u.a(color, blendMode));
    }

    @JvmStatic
    public static final void setFrameColor(@NotNull View view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (color != null) {
            view.setBackgroundColor(color.intValue());
        }
    }

    @JvmStatic
    public static final void setIcon(@NotNull Context context, @Nullable String icon, int iconColor, int iconBackgroundColor, @NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textView, "textView");
        if (icon != null) {
            try {
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf"));
                textView.setText(icon);
                setTextViewColor(textView, iconColor);
                if (textView.getBackground() == null) {
                    setViewBackgroundColor(textView, iconBackgroundColor);
                    return;
                }
                Drawable background = textView.getBackground();
                Intrinsics.checkNotNullExpressionValue(background, "getBackground(...)");
                setDrawableColor(background, iconBackgroundColor);
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: L4.x
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String icon$lambda$0;
                        icon$lambda$0 = InAppMessageViewUtils.setIcon$lambda$0();
                        return icon$lambda$0;
                    }
                }, 4, (Object) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setIcon$lambda$0() {
        return "Caught exception setting icon typeface. Not rendering icon.";
    }

    @JvmStatic
    public static final void setImage(@Nullable Bitmap bitmap, @NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    @JvmStatic
    public static final void setTextAlignment(@NotNull TextView textView, @NotNull TextAlign textAlign) {
        int i6;
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(textAlign, "textAlign");
        int i7 = WhenMappings.$EnumSwitchMapping$0[textAlign.ordinal()];
        if (i7 == 1) {
            i6 = 8388611;
        } else if (i7 == 2) {
            i6 = 8388613;
        } else {
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i6 = 17;
        }
        textView.setGravity(i6);
    }

    @JvmStatic
    public static final void setTextViewColor(@NotNull TextView textView, int color) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        textView.setTextColor(color);
    }

    @JvmStatic
    public static final void setViewBackgroundColor(@NotNull View view, int color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackgroundColor(color);
    }

    @JvmStatic
    public static final void setViewBackgroundColorFilter(@NotNull View view, int color) {
        Intrinsics.checkNotNullParameter(view, "view");
        InAppMessageViewUtils inAppMessageViewUtils = INSTANCE;
        Drawable background = view.getBackground();
        Intrinsics.checkNotNullExpressionValue(background, "getBackground(...)");
        inAppMessageViewUtils.setDrawableColorFilter(background, color);
        view.getBackground().setAlpha(Color.alpha(color));
    }
}
