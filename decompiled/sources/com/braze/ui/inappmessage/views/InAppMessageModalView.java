package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.InAppMessageModal;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$dimen;
import com.braze.ui.R$id;
import com.braze.ui.inappmessage.config.BrazeInAppMessageParams;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.inappmessage.views.InAppMessageModalView;
import com.braze.ui.support.ViewUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020-2\u0006\u00101\u001a\u000202H\u0016J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u0015042\u0006\u00105\u001a\u000202H\u0016J0\u00106\u001a\u00020-2\u0006\u00107\u001a\u00020/2\u0006\u00108\u001a\u0002022\u0006\u00109\u001a\u0002022\u0006\u0010:\u001a\u0002022\u0006\u0010;\u001a\u000202H\u0014J\u0018\u0010<\u001a\u00020-2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010=\u001a\u00020-2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020>2\u0006\u0010\b\u001a\u00020?H\u0014J\u001a\u0010@\u001a\u00020-2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u0016\u0010 \u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0017R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001bR\u0016\u0010$\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010(\u001a\u0004\u0018\u00010)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006A"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageModalView;", "Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "inAppMessageImageView", "Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "getInAppMessageImageView", "()Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "setInAppMessageImageView", "(Lcom/braze/ui/inappmessage/views/InAppMessageImageView;)V", "inAppMessage", "Lcom/braze/models/inappmessage/InAppMessageModal;", "getInAppMessage", "()Lcom/braze/models/inappmessage/InAppMessageModal;", "setInAppMessage", "(Lcom/braze/models/inappmessage/InAppMessageModal;)V", "frameView", "Landroid/view/View;", "getFrameView", "()Landroid/view/View;", "messageTextView", "Landroid/widget/TextView;", "getMessageTextView", "()Landroid/widget/TextView;", "messageHeaderTextView", "getMessageHeaderTextView", "messageClickableView", "getMessageClickableView", "messageCloseButtonView", "getMessageCloseButtonView", "messageIconView", "getMessageIconView", "messageBackgroundObject", "Landroid/graphics/drawable/Drawable;", "getMessageBackgroundObject", "()Landroid/graphics/drawable/Drawable;", "messageImageView", "Landroid/widget/ImageView;", "getMessageImageView", "()Landroid/widget/ImageView;", "resetMessageMargins", "", "imageRetrievalSuccessful", "", "setMessageBackgroundColor", "color", "", "getMessageButtonViews", "", "numButtons", "onLayout", "changed", "left", "top", "right", "bottom", "applyInAppMessageParameters", "setInAppMessageImageViewAttributes", "Lcom/braze/models/inappmessage/IInAppMessageImmersive;", "Lcom/braze/ui/inappmessage/views/IInAppMessageImageView;", "resizeGraphicFrameIfAppropriate", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInAppMessageModalView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppMessageModalView.kt\ncom/braze/ui/inappmessage/views/InAppMessageModalView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n1#2:174\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class InAppMessageModalView extends InAppMessageImmersiveBaseView {

    @Nullable
    private InAppMessageModal inAppMessage;

    @Nullable
    private InAppMessageImageView inAppMessageImageView;

    public InAppMessageModalView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetMessageMargins$lambda$1(InAppMessageModalView inAppMessageModalView, View view) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) inAppMessageModalView, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M4.D
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String resetMessageMargins$lambda$1$lambda$0;
                resetMessageMargins$lambda$1$lambda$0 = InAppMessageModalView.resetMessageMargins$lambda$1$lambda$0();
                return resetMessageMargins$lambda$1$lambda$0;
            }
        }, 7, (Object) null);
        View messageClickableView = inAppMessageModalView.getMessageClickableView();
        if (messageClickableView != null) {
            messageClickableView.performClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetMessageMargins$lambda$1$lambda$0() {
        return "Passing scrollView click event to message clickable view.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resizeGraphicFrameIfAppropriate$lambda$3(InAppMessageModalView inAppMessageModalView, int i6, int i7, int i8, double d6) {
        double min = Math.min(inAppMessageModalView.getMeasuredWidth() - i6, i7);
        double min2 = Math.min(inAppMessageModalView.getMeasuredHeight() - i6, i8);
        double d7 = min / min2;
        View findViewById = inAppMessageModalView.findViewById(R$id.com_braze_inappmessage_modal_graphic_bound);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (d6 >= d7) {
                layoutParams2.width = (int) min;
                layoutParams2.height = (int) (min / d6);
            } else {
                layoutParams2.width = (int) (d6 * min2);
                layoutParams2.height = (int) min2;
            }
            findViewById.setLayoutParams(layoutParams2);
        }
    }

    public void applyInAppMessageParameters(@NotNull Context context, @NotNull InAppMessageModal inAppMessage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        this.inAppMessage = inAppMessage;
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R$id.com_braze_inappmessage_modal_imageview);
        this.inAppMessageImageView = inAppMessageImageView;
        if (inAppMessageImageView != null) {
            setInAppMessageImageViewAttributes(context, inAppMessage, inAppMessageImageView);
        }
        resizeGraphicFrameIfAppropriate(context, inAppMessage);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    @Nullable
    public View getFrameView() {
        return findViewById(R$id.com_braze_inappmessage_modal_frame);
    }

    @Nullable
    public final InAppMessageModal getInAppMessage() {
        return this.inAppMessage;
    }

    @Nullable
    public final InAppMessageImageView getInAppMessageImageView() {
        return this.inAppMessageImageView;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    @NotNull
    public List<View> getMessageButtonViews(int numButtons) {
        ArrayList arrayList = new ArrayList();
        if (numButtons == 1) {
            View findViewById = findViewById(R$id.com_braze_inappmessage_modal_button_layout_single);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            View findViewById2 = findViewById(R$id.com_braze_inappmessage_modal_button_single_one);
            if (findViewById2 != null) {
                arrayList.add(findViewById2);
            }
        } else if (numButtons == 2) {
            View findViewById3 = findViewById(R$id.com_braze_inappmessage_modal_button_layout_dual);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
            View findViewById4 = findViewById(R$id.com_braze_inappmessage_modal_button_dual_one);
            View findViewById5 = findViewById(R$id.com_braze_inappmessage_modal_button_dual_two);
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
        return findViewById(R$id.com_braze_inappmessage_modal);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    @Nullable
    public View getMessageCloseButtonView() {
        return findViewById(R$id.com_braze_inappmessage_modal_close_button);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    @Nullable
    public TextView getMessageHeaderTextView() {
        return (TextView) findViewById(R$id.com_braze_inappmessage_modal_header_text);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    @Nullable
    public TextView getMessageIconView() {
        return (TextView) findViewById(R$id.com_braze_inappmessage_modal_icon);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    @Nullable
    public ImageView getMessageImageView() {
        return this.inAppMessageImageView;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    @Nullable
    public TextView getMessageTextView() {
        return (TextView) findViewById(R$id.com_braze_inappmessage_modal_message);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        resizeGraphicFrameIfAppropriate(context, this.inAppMessage);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean imageRetrievalSuccessful) {
        super.resetMessageMargins(imageRetrievalSuccessful);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R$id.com_braze_inappmessage_modal_image_layout);
        if ((imageRetrievalSuccessful || getMessageIconView() != null) && relativeLayout != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            relativeLayout.setLayoutParams(layoutParams);
        }
        View findViewById = findViewById(R$id.com_braze_inappmessage_modal_text_layout);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: M4.C
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InAppMessageModalView.resetMessageMargins$lambda$1(InAppMessageModalView.this, view);
                }
            });
        }
    }

    public void resizeGraphicFrameIfAppropriate(@NotNull Context context, @Nullable InAppMessageModal inAppMessage) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(context, "context");
        if (inAppMessage == null || (bitmap = inAppMessage.getBitmap()) == null || inAppMessage.getImageStyle() != ImageStyle.GRAPHIC) {
            return;
        }
        final double width = bitmap.getWidth() / bitmap.getHeight();
        Resources resources = context.getResources();
        final int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.com_braze_inappmessage_modal_margin);
        final int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.com_braze_inappmessage_modal_max_width);
        final int dimensionPixelSize3 = resources.getDimensionPixelSize(R$dimen.com_braze_inappmessage_modal_max_height);
        post(new Runnable() { // from class: M4.B
            @Override // java.lang.Runnable
            public final void run() {
                InAppMessageModalView.resizeGraphicFrameIfAppropriate$lambda$3(InAppMessageModalView.this, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, width);
            }
        });
    }

    public final void setInAppMessage(@Nullable InAppMessageModal inAppMessageModal) {
        this.inAppMessage = inAppMessageModal;
    }

    public final void setInAppMessageImageView(@Nullable InAppMessageImageView inAppMessageImageView) {
        this.inAppMessageImageView = inAppMessageImageView;
    }

    public void setInAppMessageImageViewAttributes(@NotNull Context context, @NotNull IInAppMessageImmersive inAppMessage, @NotNull IInAppMessageImageView inAppMessageImageView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(inAppMessageImageView, "inAppMessageImageView");
        float convertDpToPixels = (float) ViewUtils.convertDpToPixels(context, BrazeInAppMessageParams.getModalizedImageRadiusDp());
        if (inAppMessage.getImageStyle() == ImageStyle.GRAPHIC) {
            inAppMessageImageView.setCornersRadiusPx(convertDpToPixels);
        } else {
            inAppMessageImageView.setCornersRadiiPx(convertDpToPixels, convertDpToPixels, 0.0f, 0.0f);
        }
        inAppMessageImageView.setInAppMessageImageCropType(inAppMessage.getCropType());
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void setMessageBackgroundColor(int color) {
        View findViewById = findViewById(R$id.com_braze_inappmessage_modal);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        InAppMessageViewUtils.setViewBackgroundColorFilter(findViewById, color);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    @Nullable
    public Drawable getMessageBackgroundObject() {
        View messageClickableView = getMessageClickableView();
        if (messageClickableView != null) {
            return messageClickableView.getBackground();
        }
        return null;
    }
}
