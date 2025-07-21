package com.braze.ui.inappmessage.factories;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.braze.Braze;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.enums.inappmessage.Orientation;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.ui.R$id;
import com.braze.ui.R$layout;
import com.braze.ui.inappmessage.IInAppMessageViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageFullViewFactory;
import com.braze.ui.inappmessage.views.InAppMessageBaseView;
import com.braze.ui.inappmessage.views.InAppMessageFullView;
import com.braze.ui.inappmessage.views.InAppMessageImageView;
import com.braze.ui.support.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000bH\u0007¨\u0006\u0010"}, d2 = {"Lcom/braze/ui/inappmessage/factories/DefaultInAppMessageFullViewFactory;", "Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "<init>", "()V", "createInAppMessageView", "Lcom/braze/ui/inappmessage/views/InAppMessageFullView;", "activity", "Landroid/app/Activity;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "resetLayoutParamsIfAppropriate", "", "view", "getAppropriateFullView", "isGraphic", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultInAppMessageFullViewFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultInAppMessageFullViewFactory.kt\ncom/braze/ui/inappmessage/factories/DefaultInAppMessageFullViewFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class DefaultInAppMessageFullViewFactory implements IInAppMessageViewFactory {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void createInAppMessageView$lambda$4(View view, InAppMessageFullView inAppMessageFullView, InAppMessageFull inAppMessageFull, Context context, View view2) {
        int height = view.getHeight() / 2;
        ViewGroup.LayoutParams layoutParams = inAppMessageFullView.findViewById(R$id.com_braze_inappmessage_full_text_and_button_content_parent).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i6 = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
        if (!inAppMessageFull.getMessageButtons().isEmpty()) {
            Intrinsics.checkNotNull(context);
            i6 += (int) ViewUtils.convertDpToPixels(context, 64.0d);
        }
        ViewUtils.setHeightOnViewLayoutParams(view2, Math.min(view2.getHeight(), height - i6));
        view2.requestLayout();
        ImageView messageImageView = inAppMessageFullView.getMessageImageView();
        if (messageImageView != null) {
            messageImageView.requestLayout();
        }
    }

    private final boolean resetLayoutParamsIfAppropriate(Activity activity, IInAppMessage inAppMessage, InAppMessageFullView view) {
        if (!ViewUtils.isRunningOnTablet(activity) || inAppMessage.getOrientation() == Orientation.ANY) {
            return false;
        }
        int longEdge = view.getLongEdge();
        int shortEdge = view.getShortEdge();
        if (longEdge <= 0 || shortEdge <= 0) {
            return false;
        }
        RelativeLayout.LayoutParams layoutParams = inAppMessage.getOrientation() == Orientation.LANDSCAPE ? new RelativeLayout.LayoutParams(longEdge, shortEdge) : new RelativeLayout.LayoutParams(shortEdge, longEdge);
        layoutParams.addRule(13, -1);
        View messageBackgroundObject = view.getMessageBackgroundObject();
        if (messageBackgroundObject == null) {
            return true;
        }
        messageBackgroundObject.setLayoutParams(layoutParams);
        return true;
    }

    @SuppressLint({"InflateParams"})
    @NotNull
    public final InAppMessageFullView getAppropriateFullView(@NotNull Activity activity, boolean isGraphic) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (isGraphic) {
            View inflate = activity.getLayoutInflater().inflate(R$layout.com_braze_inappmessage_full_graphic, (ViewGroup) null);
            Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageFullView");
            return (InAppMessageFullView) inflate;
        }
        View inflate2 = activity.getLayoutInflater().inflate(R$layout.com_braze_inappmessage_full, (ViewGroup) null);
        Intrinsics.checkNotNull(inflate2, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageFullView");
        return (InAppMessageFullView) inflate2;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewFactory
    @NotNull
    public InAppMessageFullView createInAppMessageView(@NotNull Activity activity, @NotNull IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        final Context applicationContext = activity.getApplicationContext();
        final InAppMessageFull inAppMessageFull = (InAppMessageFull) inAppMessage;
        boolean z6 = inAppMessageFull.getImageStyle() == ImageStyle.GRAPHIC;
        final InAppMessageFullView appropriateFullView = getAppropriateFullView(activity, z6);
        appropriateFullView.createAppropriateViews(activity, inAppMessageFull, z6);
        String appropriateImageUrl = InAppMessageBaseView.INSTANCE.getAppropriateImageUrl(inAppMessageFull);
        if (appropriateImageUrl != null && appropriateImageUrl.length() != 0) {
            Braze.Companion companion = Braze.INSTANCE;
            Intrinsics.checkNotNull(applicationContext);
            IBrazeImageLoader imageLoader = companion.getInstance(applicationContext).getImageLoader();
            ImageView messageImageView = appropriateFullView.getMessageImageView();
            if (messageImageView != null) {
                imageLoader.renderUrlIntoInAppMessageView(applicationContext, inAppMessage, appropriateImageUrl, messageImageView, BrazeViewBounds.NO_BOUNDS);
            }
        }
        View frameView = appropriateFullView.getFrameView();
        if (frameView != null) {
            frameView.setOnClickListener(null);
        }
        appropriateFullView.setMessageBackgroundColor(inAppMessageFull.getBackgroundColor());
        Integer frameColor = inAppMessageFull.getFrameColor();
        if (frameColor != null) {
            appropriateFullView.setFrameColor(frameColor.intValue());
        }
        appropriateFullView.setMessageButtons(inAppMessageFull.getMessageButtons());
        appropriateFullView.setMessageCloseButtonColor(inAppMessageFull.getCloseButtonColor());
        if (!z6) {
            String message = inAppMessageFull.getMessage();
            if (message != null) {
                appropriateFullView.setMessage(message);
            }
            appropriateFullView.setMessageTextColor(inAppMessageFull.getMessageTextColor());
            String header = inAppMessageFull.getHeader();
            if (header != null) {
                appropriateFullView.setMessageHeaderText(header);
            }
            appropriateFullView.setMessageHeaderTextColor(inAppMessageFull.getHeaderTextColor());
            appropriateFullView.setMessageHeaderTextAlignment(inAppMessageFull.getHeaderTextAlign());
            appropriateFullView.setMessageTextAlign(inAppMessageFull.getMessageTextAlign());
            appropriateFullView.resetMessageMargins(inAppMessageFull.getImageDownloadSuccessful());
            ImageView messageImageView2 = appropriateFullView.getMessageImageView();
            Intrinsics.checkNotNull(messageImageView2, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageImageView");
            ((InAppMessageImageView) messageImageView2).setToHalfParentHeight(true);
        }
        appropriateFullView.setLargerCloseButtonClickArea(appropriateFullView.getMessageCloseButtonView());
        resetLayoutParamsIfAppropriate(activity, inAppMessageFull, appropriateFullView);
        appropriateFullView.setupDirectionalNavigation(inAppMessageFull.getMessageButtons().size());
        final View findViewById = appropriateFullView.findViewById(R$id.com_braze_inappmessage_full_scrollview);
        if (findViewById == null) {
            return appropriateFullView;
        }
        final View findViewById2 = appropriateFullView.findViewById(R$id.com_braze_inappmessage_full_all_content_parent);
        findViewById.post(new Runnable() { // from class: J4.a
            @Override // java.lang.Runnable
            public final void run() {
                DefaultInAppMessageFullViewFactory.createInAppMessageView$lambda$4(findViewById2, appropriateFullView, inAppMessageFull, applicationContext, findViewById);
            }
        });
        return appropriateFullView;
    }
}
