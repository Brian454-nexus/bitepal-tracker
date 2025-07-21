package com.braze.ui.inappmessage.listeners;

import android.view.View;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeFunctionNotImplemented;
import com.braze.ui.inappmessage.InAppMessageCloser;
import com.braze.ui.inappmessage.InAppMessageOperation;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0017J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0017J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/IInAppMessageManagerListener;", "", "beforeInAppMessageDisplayed", "Lcom/braze/ui/inappmessage/InAppMessageOperation;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "onInAppMessageClicked", "", "inAppMessageCloser", "Lcom/braze/ui/inappmessage/InAppMessageCloser;", "onInAppMessageButtonClicked", "button", "Lcom/braze/models/inappmessage/MessageButton;", "onInAppMessageDismissed", "", "beforeInAppMessageViewOpened", "inAppMessageView", "Landroid/view/View;", "afterInAppMessageViewOpened", "beforeInAppMessageViewClosed", "afterInAppMessageViewClosed", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface IInAppMessageManagerListener {
    default void afterInAppMessageViewClosed(@NotNull IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
    }

    default void afterInAppMessageViewOpened(@NotNull View inAppMessageView, @NotNull IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
    }

    @NotNull
    InAppMessageOperation beforeInAppMessageDisplayed(@NotNull IInAppMessage inAppMessage);

    default void beforeInAppMessageViewClosed(@NotNull View inAppMessageView, @NotNull IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
    }

    default void beforeInAppMessageViewOpened(@NotNull View inAppMessageView, @NotNull IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
    }

    default boolean onInAppMessageButtonClicked(@NotNull IInAppMessage inAppMessage, @NotNull MessageButton button) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(button, "button");
        return false;
    }

    default boolean onInAppMessageClicked(@NotNull IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        return false;
    }

    default void onInAppMessageDismissed(@NotNull IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
    }

    @Deprecated(message = "InAppMessageCloser is deprecated", replaceWith = @ReplaceWith(expression = "onInAppMessageButtonClicked(inAppMessage, button)", imports = {}))
    default boolean onInAppMessageButtonClicked(@NotNull IInAppMessage inAppMessage, @NotNull MessageButton button, @Nullable InAppMessageCloser inAppMessageCloser) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(button, "button");
        throw BrazeFunctionNotImplemented.INSTANCE;
    }

    @Deprecated(message = "InAppMessageCloser is deprecated", replaceWith = @ReplaceWith(expression = "onInAppMessageClicked(inAppMessage)", imports = {}))
    default boolean onInAppMessageClicked(@NotNull IInAppMessage inAppMessage, @Nullable InAppMessageCloser inAppMessageCloser) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        throw BrazeFunctionNotImplemented.INSTANCE;
    }
}
