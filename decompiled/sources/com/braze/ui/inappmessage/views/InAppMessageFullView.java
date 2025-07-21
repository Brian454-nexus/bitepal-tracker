package com.braze.ui.inappmessage.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$id;
import com.braze.ui.inappmessage.config.BrazeInAppMessageParams;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.inappmessage.views.InAppMessageFullView;
import com.braze.ui.support.ViewUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z0.C2400K;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J'\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130\"2\u0006\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010*R\u0018\u0010\r\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010,R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010-R\u0016\u00101\u001a\u0004\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u00103\u001a\u0004\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00100R\u0016\u00106\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u00108\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00105R\u0016\u0010:\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u00105R\u0016\u0010>\u001a\u0004\u0018\u00010;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0016\u0010@\u001a\u0004\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u00100R\u0016\u0010B\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u00105R\u0014\u0010E\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010D¨\u0006H"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageFullView;", "Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/app/Activity;", "activity", "Lcom/braze/models/inappmessage/IInAppMessageImmersive;", "inAppMessage", "Lcom/braze/ui/inappmessage/views/IInAppMessageImageView;", "inAppMessageImageView", "", "setInAppMessageImageViewAttributes", "(Landroid/app/Activity;Lcom/braze/models/inappmessage/IInAppMessageImmersive;Lcom/braze/ui/inappmessage/views/IInAppMessageImageView;)V", "Lz0/K;", "windowInsets", "Landroid/view/View;", "closeButtonView", "applyDisplayCutoutMarginsToCloseButton", "(Lz0/K;Landroid/view/View;)V", "contentAreaView", "applyDisplayCutoutMarginsToContentArea", "", "isGraphic", "createAppropriateViews", "(Landroid/app/Activity;Lcom/braze/models/inappmessage/IInAppMessageImmersive;Z)V", "", "color", "setMessageBackgroundColor", "(I)V", "numButtons", "", "getMessageButtonViews", "(I)Ljava/util/List;", "imageRetrievalSuccessful", "resetMessageMargins", "(Z)V", "insets", "applyWindowInsets", "(Lz0/K;)V", "Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "Z", "Landroid/widget/TextView;", "getMessageTextView", "()Landroid/widget/TextView;", "messageTextView", "getMessageHeaderTextView", "messageHeaderTextView", "getFrameView", "()Landroid/view/View;", "frameView", "getMessageCloseButtonView", "messageCloseButtonView", "getMessageClickableView", "messageClickableView", "Landroid/widget/ImageView;", "getMessageImageView", "()Landroid/widget/ImageView;", "messageImageView", "getMessageIconView", "messageIconView", "getMessageBackgroundObject", "messageBackgroundObject", "getLongEdge", "()I", "longEdge", "getShortEdge", "shortEdge", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInAppMessageFullView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppMessageFullView.kt\ncom/braze/ui/inappmessage/views/InAppMessageFullView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1#2:253\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class InAppMessageFullView extends InAppMessageImmersiveBaseView {

    @Nullable
    private InAppMessageImageView inAppMessageImageView;
    private boolean isGraphic;

    public InAppMessageFullView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final void applyDisplayCutoutMarginsToCloseButton(C2400K windowInsets, View closeButtonView) {
        if (closeButtonView.getLayoutParams() == null || !(closeButtonView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M4.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String applyDisplayCutoutMarginsToCloseButton$lambda$6;
                    applyDisplayCutoutMarginsToCloseButton$lambda$6 = InAppMessageFullView.applyDisplayCutoutMarginsToCloseButton$lambda$6();
                    return applyDisplayCutoutMarginsToCloseButton$lambda$6;
                }
            }, 7, (Object) null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = closeButtonView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(windowInsets) + marginLayoutParams.leftMargin, ViewUtils.getMaxSafeTopInset(windowInsets) + marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(windowInsets) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(windowInsets) + marginLayoutParams.bottomMargin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyDisplayCutoutMarginsToCloseButton$lambda$6() {
        return "Close button layout params are null or not of the expected class. Not applying window insets.";
    }

    private final void applyDisplayCutoutMarginsToContentArea(C2400K windowInsets, View contentAreaView) {
        if (!(contentAreaView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M4.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String applyDisplayCutoutMarginsToContentArea$lambda$7;
                    applyDisplayCutoutMarginsToContentArea$lambda$7 = InAppMessageFullView.applyDisplayCutoutMarginsToContentArea$lambda$7();
                    return applyDisplayCutoutMarginsToContentArea$lambda$7;
                }
            }, 7, (Object) null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = contentAreaView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(windowInsets) + marginLayoutParams.leftMargin, marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(windowInsets) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(windowInsets) + marginLayoutParams.bottomMargin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyDisplayCutoutMarginsToContentArea$lambda$7() {
        return "Content area layout params are null or not of the expected class. Not applying window insets.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetMessageMargins$lambda$3$lambda$2(InAppMessageFullView inAppMessageFullView, View view, View view2) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) inAppMessageFullView, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M4.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String resetMessageMargins$lambda$3$lambda$2$lambda$1;
                resetMessageMargins$lambda$3$lambda$2$lambda$1 = InAppMessageFullView.resetMessageMargins$lambda$3$lambda$2$lambda$1();
                return resetMessageMargins$lambda$3$lambda$2$lambda$1;
            }
        }, 7, (Object) null);
        view.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetMessageMargins$lambda$3$lambda$2$lambda$1() {
        return "Passing scrollView click event to message clickable view.";
    }

    private final void setInAppMessageImageViewAttributes(Activity activity, IInAppMessageImmersive inAppMessage, IInAppMessageImageView inAppMessageImageView) {
        inAppMessageImageView.setInAppMessageImageCropType(inAppMessage.getCropType());
        if (!ViewUtils.isRunningOnTablet(activity)) {
            inAppMessageImageView.setCornersRadiusPx(0.0f);
            return;
        }
        float convertDpToPixels = (float) ViewUtils.convertDpToPixels(activity, BrazeInAppMessageParams.getModalizedImageRadiusDp());
        if (inAppMessage.getImageStyle() == ImageStyle.GRAPHIC) {
            inAppMessageImageView.setCornersRadiusPx(convertDpToPixels);
        } else {
            inAppMessageImageView.setCornersRadiiPx(convertDpToPixels, convertDpToPixels, 0.0f, 0.0f);
        }
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView, com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(@NotNull C2400K insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        super.applyWindowInsets(insets);
        View messageCloseButtonView = getMessageCloseButtonView();
        if (messageCloseButtonView != null) {
            applyDisplayCutoutMarginsToCloseButton(insets, messageCloseButtonView);
        }
        if (!this.isGraphic) {
            View findViewById = findViewById(R$id.com_braze_inappmessage_full_text_and_button_content_parent);
            if (findViewById != null) {
                applyDisplayCutoutMarginsToContentArea(insets, findViewById);
                return;
            }
            return;
        }
        View findViewById2 = findViewById(R$id.com_braze_inappmessage_full_button_layout_single);
        if (findViewById2 != null && findViewById2.getVisibility() == 0) {
            applyDisplayCutoutMarginsToContentArea(insets, findViewById2);
            return;
        }
        View findViewById3 = findViewById(R$id.com_braze_inappmessage_full_button_layout_dual);
        if (findViewById3 == null || findViewById3.getVisibility() != 0) {
            return;
        }
        applyDisplayCutoutMarginsToContentArea(insets, findViewById3);
    }

    public void createAppropriateViews(@NotNull Activity activity, @NotNull IInAppMessageImmersive inAppMessage, boolean isGraphic) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R$id.com_braze_inappmessage_full_imageview);
        this.inAppMessageImageView = inAppMessageImageView;
        if (inAppMessageImageView != null) {
            setInAppMessageImageViewAttributes(activity, inAppMessage, inAppMessageImageView);
        }
        this.isGraphic = isGraphic;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    @Nullable
    public View getFrameView() {
        return findViewById(R$id.com_braze_inappmessage_full_frame);
    }

    public int getLongEdge() {
        return findViewById(R$id.com_braze_inappmessage_full).getLayoutParams().height;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    @NotNull
    public List<View> getMessageButtonViews(int numButtons) {
        ArrayList arrayList = new ArrayList();
        if (numButtons == 1) {
            View findViewById = findViewById(R$id.com_braze_inappmessage_full_button_layout_single);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            View findViewById2 = findViewById(R$id.com_braze_inappmessage_full_button_single_one);
            if (findViewById2 != null) {
                arrayList.add(findViewById2);
            }
        } else if (numButtons == 2) {
            View findViewById3 = findViewById(R$id.com_braze_inappmessage_full_button_layout_dual);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
            View findViewById4 = findViewById(R$id.com_braze_inappmessage_full_button_dual_one);
            View findViewById5 = findViewById(R$id.com_braze_inappmessage_full_button_dual_two);
            if (findViewById4 != null) {
                arrayList.add(findViewById4);
            }
            if (findViewById5 != null) {
                arrayList.add(findViewById5);
                return arrayList;
            }
        }
        return arrayList;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView, com.braze.ui.inappmessage.views.IInAppMessageView
    @Nullable
    public View getMessageClickableView() {
        return findViewById(R$id.com_braze_inappmessage_full);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    @Nullable
    public View getMessageCloseButtonView() {
        return findViewById(R$id.com_braze_inappmessage_full_close_button);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    @Nullable
    public TextView getMessageHeaderTextView() {
        return (TextView) findViewById(R$id.com_braze_inappmessage_full_header_text);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    @Nullable
    public TextView getMessageIconView() {
        return null;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    @Nullable
    public ImageView getMessageImageView() {
        return this.inAppMessageImageView;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    @Nullable
    public TextView getMessageTextView() {
        return (TextView) findViewById(R$id.com_braze_inappmessage_full_message);
    }

    public int getShortEdge() {
        return findViewById(R$id.com_braze_inappmessage_full).getLayoutParams().width;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean imageRetrievalSuccessful) {
        super.resetMessageMargins(imageRetrievalSuccessful);
        final View messageClickableView = getMessageClickableView();
        if (messageClickableView != null) {
            findViewById(R$id.com_braze_inappmessage_full_text_layout).setOnClickListener(new View.OnClickListener() { // from class: M4.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InAppMessageFullView.resetMessageMargins$lambda$3$lambda$2(InAppMessageFullView.this, messageClickableView, view);
                }
            });
        }
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void setMessageBackgroundColor(int color) {
        View messageBackgroundObject = getMessageBackgroundObject();
        if ((messageBackgroundObject != null ? messageBackgroundObject.getBackground() : null) instanceof GradientDrawable) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(messageBackgroundObject, color);
            return;
        }
        if (this.isGraphic) {
            super.setMessageBackgroundColor(color);
            return;
        }
        View findViewById = findViewById(R$id.com_braze_inappmessage_full_all_content_parent);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        InAppMessageViewUtils.setViewBackgroundColor(findViewById, color);
        View findViewById2 = findViewById(R$id.com_braze_inappmessage_full_text_and_button_content_parent);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        InAppMessageViewUtils.setViewBackgroundColor(findViewById2, color);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    @Nullable
    public View getMessageBackgroundObject() {
        return findViewById(R$id.com_braze_inappmessage_full);
    }
}
