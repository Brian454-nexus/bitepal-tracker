package com.braze.ui.inappmessage.factories;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.braze.Braze;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageModal;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$layout;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.IInAppMessageViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageModalViewFactory;
import com.braze.ui.inappmessage.views.InAppMessageBaseView;
import com.braze.ui.inappmessage.views.InAppMessageImageView;
import com.braze.ui.inappmessage.views.InAppMessageModalView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0003¨\u0006\u000e"}, d2 = {"Lcom/braze/ui/inappmessage/factories/DefaultInAppMessageModalViewFactory;", "Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "<init>", "()V", "createInAppMessageView", "Lcom/braze/ui/inappmessage/views/InAppMessageModalView;", "activity", "Landroid/app/Activity;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "getAppropriateModalView", "isGraphic", "", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultInAppMessageModalViewFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultInAppMessageModalViewFactory.kt\ncom/braze/ui/inappmessage/factories/DefaultInAppMessageModalViewFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class DefaultInAppMessageModalViewFactory implements IInAppMessageViewFactory {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void createInAppMessageView$lambda$2(DefaultInAppMessageModalViewFactory defaultInAppMessageModalViewFactory, View view) {
        BrazeInAppMessageManager.Companion companion = BrazeInAppMessageManager.INSTANCE;
        if (companion.getInstance().getDoesClickOutsideModalViewDismissInAppMessageViewField()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) defaultInAppMessageModalViewFactory, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: J4.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String createInAppMessageView$lambda$2$lambda$1;
                    createInAppMessageView$lambda$2$lambda$1 = DefaultInAppMessageModalViewFactory.createInAppMessageView$lambda$2$lambda$1();
                    return createInAppMessageView$lambda$2$lambda$1;
                }
            }, 6, (Object) null);
            companion.getInstance().hideCurrentlyDisplayingInAppMessage(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createInAppMessageView$lambda$2$lambda$1() {
        return "Dismissing modal after frame click";
    }

    @SuppressLint({"InflateParams"})
    private final InAppMessageModalView getAppropriateModalView(Activity activity, boolean isGraphic) {
        if (isGraphic) {
            View inflate = activity.getLayoutInflater().inflate(R$layout.com_braze_inappmessage_modal_graphic, (ViewGroup) null);
            Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageModalView");
            return (InAppMessageModalView) inflate;
        }
        View inflate2 = activity.getLayoutInflater().inflate(R$layout.com_braze_inappmessage_modal, (ViewGroup) null);
        Intrinsics.checkNotNull(inflate2, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageModalView");
        return (InAppMessageModalView) inflate2;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewFactory
    @NotNull
    public InAppMessageModalView createInAppMessageView(@NotNull Activity activity, @NotNull IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Context applicationContext = activity.getApplicationContext();
        InAppMessageModal inAppMessageModal = (InAppMessageModal) inAppMessage;
        boolean z6 = inAppMessageModal.getImageStyle() == ImageStyle.GRAPHIC;
        InAppMessageModalView appropriateModalView = getAppropriateModalView(activity, z6);
        Intrinsics.checkNotNull(applicationContext);
        appropriateModalView.applyInAppMessageParameters(applicationContext, inAppMessageModal);
        String appropriateImageUrl = InAppMessageBaseView.INSTANCE.getAppropriateImageUrl(inAppMessageModal);
        if (appropriateImageUrl != null && appropriateImageUrl.length() != 0) {
            IBrazeImageLoader imageLoader = Braze.INSTANCE.getInstance(applicationContext).getImageLoader();
            ImageView messageImageView = appropriateModalView.getMessageImageView();
            if (messageImageView != null) {
                imageLoader.renderUrlIntoInAppMessageView(applicationContext, inAppMessage, appropriateImageUrl, messageImageView, BrazeViewBounds.IN_APP_MESSAGE_MODAL);
            }
        }
        View frameView = appropriateModalView.getFrameView();
        if (frameView != null) {
            frameView.setOnClickListener(new View.OnClickListener() { // from class: J4.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DefaultInAppMessageModalViewFactory.createInAppMessageView$lambda$2(DefaultInAppMessageModalViewFactory.this, view);
                }
            });
        }
        appropriateModalView.setMessageBackgroundColor(inAppMessageModal.getBackgroundColor());
        Integer frameColor = inAppMessageModal.getFrameColor();
        if (frameColor != null) {
            appropriateModalView.setFrameColor(frameColor.intValue());
        }
        appropriateModalView.setMessageButtons(inAppMessageModal.getMessageButtons());
        appropriateModalView.setMessageCloseButtonColor(inAppMessageModal.getCloseButtonColor());
        if (!z6) {
            String message = inAppMessageModal.getMessage();
            if (message != null) {
                appropriateModalView.setMessage(message);
            }
            appropriateModalView.setMessageTextColor(inAppMessageModal.getMessageTextColor());
            String header = inAppMessageModal.getHeader();
            if (header != null) {
                appropriateModalView.setMessageHeaderText(header);
            }
            appropriateModalView.setMessageHeaderTextColor(inAppMessageModal.getHeaderTextColor());
            String icon = inAppMessageModal.getIcon();
            if (icon != null) {
                appropriateModalView.setMessageIcon(icon, inAppMessageModal.getIconColor(), inAppMessageModal.getIconBackgroundColor());
            }
            appropriateModalView.setMessageHeaderTextAlignment(inAppMessageModal.getHeaderTextAlign());
            appropriateModalView.setMessageTextAlign(inAppMessageModal.getMessageTextAlign());
            appropriateModalView.resetMessageMargins(inAppMessageModal.getImageDownloadSuccessful());
            ImageView messageImageView2 = appropriateModalView.getMessageImageView();
            Intrinsics.checkNotNull(messageImageView2, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageImageView");
            ((InAppMessageImageView) messageImageView2).setAspectRatio(2.9f);
        }
        appropriateModalView.setLargerCloseButtonClickArea(appropriateModalView.getMessageCloseButtonView());
        appropriateModalView.setupDirectionalNavigation(inAppMessageModal.getMessageButtons().size());
        return appropriateModalView;
    }
}
