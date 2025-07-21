package com.braze.ui.inappmessage.utils;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.Button;
import com.braze.models.inappmessage.MessageButton;
import com.braze.ui.R$dimen;
import com.braze.ui.R$drawable;
import com.braze.ui.R$id;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J(\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010H\u0007J0\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006\u001b"}, d2 = {"Lcom/braze/ui/inappmessage/utils/InAppMessageButtonViewUtils;", "", "<init>", "()V", "setButtons", "", "buttonViews", "", "Landroid/view/View;", "messageButtons", "Lcom/braze/models/inappmessage/MessageButton;", "setButton", "button", "Landroid/widget/Button;", "messageButton", "strokeWidth", "", "strokeFocusedWidth", "getDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "drawableId", "getButtonDrawable", "newStrokeWidth", "isFocused", "", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class InAppMessageButtonViewUtils {

    @NotNull
    public static final InAppMessageButtonViewUtils INSTANCE = new InAppMessageButtonViewUtils();

    private InAppMessageButtonViewUtils() {
    }

    @JvmStatic
    @NotNull
    public static final Drawable getButtonDrawable(@NotNull Context context, @NotNull MessageButton messageButton, int newStrokeWidth, int strokeFocusedWidth, boolean isFocused) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(messageButton, "messageButton");
        Drawable drawable = getDrawable(context, R$drawable.com_braze_inappmessage_button_background);
        drawable.mutate();
        Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.RippleDrawable");
        Drawable findDrawableByLayerId = ((RippleDrawable) drawable).findDrawableByLayerId(R$id.com_braze_inappmessage_button_background_ripple_internal_gradient);
        Intrinsics.checkNotNull(findDrawableByLayerId, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) findDrawableByLayerId;
        if (isFocused) {
            newStrokeWidth = strokeFocusedWidth;
        }
        gradientDrawable.setStroke(newStrokeWidth, messageButton.getBorderColor());
        gradientDrawable.setColor(messageButton.getBackgroundColor());
        return drawable;
    }

    @JvmStatic
    @NotNull
    public static final Drawable getDrawable(@NotNull Context context, int drawableId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable drawable = context.getResources().getDrawable(drawableId, null);
        Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
        return drawable;
    }

    @JvmStatic
    public static final void setButton(@NotNull Button button, @NotNull MessageButton messageButton, int strokeWidth, int strokeFocusedWidth) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(messageButton, "messageButton");
        button.setText(messageButton.getText());
        button.setContentDescription(messageButton.getText());
        InAppMessageViewUtils.setTextViewColor(button, messageButton.getTextColor());
        StateListDrawable stateListDrawable = new StateListDrawable();
        button.setStateListAnimator(null);
        Context context = button.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable buttonDrawable = getButtonDrawable(context, messageButton, strokeWidth, strokeFocusedWidth, false);
        Context context2 = button.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        stateListDrawable.addState(new int[]{R.attr.state_focused}, getButtonDrawable(context2, messageButton, strokeWidth, strokeFocusedWidth, true));
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, buttonDrawable);
        button.setBackground(stateListDrawable);
    }

    @JvmStatic
    public static final void setButtons(@NotNull List<? extends View> buttonViews, @NotNull List<? extends MessageButton> messageButtons) {
        Intrinsics.checkNotNullParameter(buttonViews, "buttonViews");
        Intrinsics.checkNotNullParameter(messageButtons, "messageButtons");
        int size = buttonViews.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = buttonViews.get(i6);
            MessageButton messageButton = messageButtons.get(i6);
            int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R$dimen.com_braze_inappmessage_button_border_stroke);
            int dimensionPixelSize2 = view.getContext().getResources().getDimensionPixelSize(R$dimen.com_braze_inappmessage_button_border_stroke_focused);
            if (messageButtons.size() <= i6) {
                view.setVisibility(8);
            } else if (view instanceof Button) {
                setButton((Button) view, messageButton, dimensionPixelSize, dimensionPixelSize2);
            }
        }
    }
}
