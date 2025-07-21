package com.braze.ui.inappmessage.factories;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.braze.Braze;
import com.braze.enums.BrazeViewBounds;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$layout;
import com.braze.ui.inappmessage.IInAppMessageViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageSlideupViewFactory;
import com.braze.ui.inappmessage.views.InAppMessageBaseView;
import com.braze.ui.inappmessage.views.InAppMessageSlideupView;
import com.braze.ui.support.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/braze/ui/inappmessage/factories/DefaultInAppMessageSlideupViewFactory;", "Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "<init>", "()V", "createInAppMessageView", "Lcom/braze/ui/inappmessage/views/InAppMessageSlideupView;", "activity", "Landroid/app/Activity;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultInAppMessageSlideupViewFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultInAppMessageSlideupViewFactory.kt\ncom/braze/ui/inappmessage/factories/DefaultInAppMessageSlideupViewFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class DefaultInAppMessageSlideupViewFactory implements IInAppMessageViewFactory {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String createInAppMessageView$lambda$0() {
        return "The device is not currently in touch mode. This message requires user touch interaction to display properly.";
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewFactory
    @Nullable
    public InAppMessageSlideupView createInAppMessageView(@NotNull Activity activity, @NotNull IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        View inflate = activity.getLayoutInflater().inflate(R$layout.com_braze_inappmessage_slideup, (ViewGroup) null);
        Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageSlideupView");
        InAppMessageSlideupView inAppMessageSlideupView = (InAppMessageSlideupView) inflate;
        if (ViewUtils.isDeviceNotInTouchMode(inAppMessageSlideupView)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: J4.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String createInAppMessageView$lambda$0;
                    createInAppMessageView$lambda$0 = DefaultInAppMessageSlideupViewFactory.createInAppMessageView$lambda$0();
                    return createInAppMessageView$lambda$0;
                }
            }, 6, (Object) null);
            return null;
        }
        InAppMessageSlideup inAppMessageSlideup = (InAppMessageSlideup) inAppMessage;
        Context applicationContext = activity.getApplicationContext();
        inAppMessageSlideupView.applyInAppMessageParameters(inAppMessage);
        String appropriateImageUrl = InAppMessageBaseView.INSTANCE.getAppropriateImageUrl(inAppMessageSlideup);
        if (appropriateImageUrl != null && appropriateImageUrl.length() != 0) {
            Braze.Companion companion = Braze.INSTANCE;
            Intrinsics.checkNotNull(applicationContext);
            IBrazeImageLoader imageLoader = companion.getInstance(applicationContext).getImageLoader();
            ImageView messageImageView = inAppMessageSlideupView.getMessageImageView();
            if (messageImageView != null) {
                imageLoader.renderUrlIntoInAppMessageView(applicationContext, inAppMessage, appropriateImageUrl, messageImageView, BrazeViewBounds.IN_APP_MESSAGE_SLIDEUP);
            }
        }
        inAppMessageSlideupView.setMessageBackgroundColor(inAppMessageSlideup.getBackgroundColor());
        String message = inAppMessageSlideup.getMessage();
        if (message != null) {
            inAppMessageSlideupView.setMessage(message);
        }
        inAppMessageSlideupView.setMessageTextColor(inAppMessageSlideup.getMessageTextColor());
        inAppMessageSlideupView.setMessageTextAlign(inAppMessageSlideup.getMessageTextAlign());
        String icon = inAppMessageSlideup.getIcon();
        if (icon != null) {
            inAppMessageSlideupView.setMessageIcon(icon, inAppMessageSlideup.getIconColor(), inAppMessageSlideup.getIconBackgroundColor());
        }
        inAppMessageSlideupView.setMessageChevron(inAppMessageSlideup.getChevronColor(), inAppMessageSlideup.getInternalClickAction());
        inAppMessageSlideupView.resetMessageMargins(inAppMessageSlideup.getImageDownloadSuccessful());
        return inAppMessageSlideupView;
    }
}
