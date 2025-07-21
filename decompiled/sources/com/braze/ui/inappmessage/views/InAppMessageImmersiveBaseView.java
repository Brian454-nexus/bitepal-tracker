package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$dimen;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.utils.InAppMessageButtonViewUtils;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView;
import com.braze.ui.support.ViewUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0016\u0010\u001a\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\u001c2\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0018\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020\u00162\u0006\u0010,\u001a\u00020-H\u0016J\u0012\u0010/\u001a\u00020\u00142\b\u00100\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\t\u001a\u0004\u0018\u00010\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u00061"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;", "Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;", "Lcom/braze/ui/inappmessage/views/IInAppMessageImmersiveView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "frameView", "Landroid/view/View;", "getFrameView", "()Landroid/view/View;", "messageTextView", "Landroid/widget/TextView;", "getMessageTextView", "()Landroid/widget/TextView;", "messageHeaderTextView", "getMessageHeaderTextView", "resetMessageMargins", "", "imageRetrievalSuccessful", "", "setupDirectionalNavigation", "numButtons", "", "setMessageButtons", "messageButtons", "", "Lcom/braze/models/inappmessage/MessageButton;", "setMessageCloseButtonColor", "color", "setMessageHeaderTextColor", "setMessageHeaderText", "text", "", "setMessage", "setMessageHeaderTextAlignment", "textAlign", "Lcom/braze/enums/inappmessage/TextAlign;", "setFrameColor", "getMessageButtonViews", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "setLargerCloseButtonClickArea", "closeButtonView", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInAppMessageImmersiveBaseView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppMessageImmersiveBaseView.kt\ncom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,251:1\n1#2:252\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class InAppMessageImmersiveBaseView extends InAppMessageBaseView implements IInAppMessageImmersiveView {
    public InAppMessageImmersiveBaseView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargerCloseButtonClickArea$lambda$7() {
        return "Cannot increase click area for view if view and/or parent are null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setLargerCloseButtonClickArea$lambda$8(View view, InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView, ViewParent viewParent) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        int dimensionPixelSize = inAppMessageImmersiveBaseView.getContext().getResources().getDimensionPixelSize(R$dimen.com_braze_inappmessage_close_button_click_area_width);
        int dimensionPixelSize2 = inAppMessageImmersiveBaseView.getContext().getResources().getDimensionPixelSize(R$dimen.com_braze_inappmessage_close_button_click_area_height);
        int width = (dimensionPixelSize - rect.width()) / 2;
        int height = (dimensionPixelSize2 - rect.height()) / 2;
        rect.top -= height;
        rect.bottom += height;
        rect.left -= width;
        rect.right += width;
        ((View) viewParent).setTouchDelegate(new TouchDelegate(rect, view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setupDirectionalNavigation$lambda$0() {
        return "closeButtonId is null. Cannot continue setting up navigation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setupDirectionalNavigation$lambda$1(int i6) {
        return "Cannot setup directional navigation. Got unsupported number of buttons: " + i6;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (isInTouchMode() || event.getKeyCode() != 4 || !BrazeInAppMessageManager.INSTANCE.getInstance().getDoesBackButtonDismissInAppMessageViewField()) {
            return super.dispatchKeyEvent(event);
        }
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        return true;
    }

    @Nullable
    public abstract View getFrameView();

    @NotNull
    public abstract List<View> getMessageButtonViews(int numButtons);

    @Nullable
    public abstract /* synthetic */ View getMessageCloseButtonView();

    @Nullable
    public abstract TextView getMessageHeaderTextView();

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    @Nullable
    public abstract TextView getMessageTextView();

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (keyCode != 4 || !BrazeInAppMessageManager.INSTANCE.getInstance().getDoesBackButtonDismissInAppMessageViewField()) {
            return super.onKeyDown(keyCode, event);
        }
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        return true;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean imageRetrievalSuccessful) {
        super.resetMessageMargins(imageRetrievalSuccessful);
        TextView messageTextView = getMessageTextView();
        if (StringsKt.isBlank(String.valueOf(messageTextView != null ? messageTextView.getText() : null))) {
            ViewUtils.removeViewFromParent(getMessageTextView());
        }
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (StringsKt.isBlank(String.valueOf(messageHeaderTextView != null ? messageHeaderTextView.getText() : null))) {
            ViewUtils.removeViewFromParent(getMessageHeaderTextView());
        }
        InAppMessageViewUtils.resetMessageMarginsIfNecessary(getMessageTextView(), getMessageHeaderTextView());
    }

    public void setFrameColor(int color) {
        View frameView = getFrameView();
        if (frameView != null) {
            InAppMessageViewUtils.setFrameColor(frameView, Integer.valueOf(color));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLargerCloseButtonClickArea(@Nullable final View closeButtonView) {
        if (closeButtonView == null || closeButtonView.getParent() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: M4.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String largerCloseButtonClickArea$lambda$7;
                    largerCloseButtonClickArea$lambda$7 = InAppMessageImmersiveBaseView.setLargerCloseButtonClickArea$lambda$7();
                    return largerCloseButtonClickArea$lambda$7;
                }
            }, 6, (Object) null);
            return;
        }
        final ViewParent parent = closeButtonView.getParent();
        if (parent instanceof View) {
            ((View) parent).post(new Runnable() { // from class: M4.A
                @Override // java.lang.Runnable
                public final void run() {
                    InAppMessageImmersiveBaseView.setLargerCloseButtonClickArea$lambda$8(closeButtonView, this, parent);
                }
            });
        }
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void setMessage(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        super.setMessage(text);
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            messageTextView.setContentDescription(text);
        }
    }

    public void setMessageButtons(@NotNull List<? extends MessageButton> messageButtons) {
        Intrinsics.checkNotNullParameter(messageButtons, "messageButtons");
        InAppMessageButtonViewUtils.setButtons(getMessageButtonViews(messageButtons.size()), messageButtons);
    }

    public void setMessageCloseButtonColor(int color) {
        View messageCloseButtonView = getMessageCloseButtonView();
        if (messageCloseButtonView != null) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(messageCloseButtonView, color);
        }
    }

    public void setMessageHeaderText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView != null) {
            messageHeaderTextView.setText(text);
        }
        TextView messageHeaderTextView2 = getMessageHeaderTextView();
        if (messageHeaderTextView2 != null) {
            messageHeaderTextView2.setContentDescription(text);
        }
    }

    public void setMessageHeaderTextAlignment(@NotNull TextAlign textAlign) {
        Intrinsics.checkNotNullParameter(textAlign, "textAlign");
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView != null) {
            InAppMessageViewUtils.setTextAlignment(messageHeaderTextView, textAlign);
        }
    }

    public void setMessageHeaderTextColor(int color) {
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView != null) {
            InAppMessageViewUtils.setTextViewColor(messageHeaderTextView, color);
        }
    }

    public void setupDirectionalNavigation(final int numButtons) {
        List<View> messageButtonViews = getMessageButtonViews(numButtons);
        final View messageCloseButtonView = getMessageCloseButtonView();
        Integer valueOf = messageCloseButtonView != null ? Integer.valueOf(messageCloseButtonView.getId()) : null;
        if (valueOf == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: M4.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String str;
                    str = InAppMessageImmersiveBaseView.setupDirectionalNavigation$lambda$0();
                    return str;
                }
            }, 6, (Object) null);
            return;
        }
        if (numButtons == 0) {
            messageCloseButtonView.setNextFocusUpId(valueOf.intValue());
            messageCloseButtonView.setNextFocusDownId(valueOf.intValue());
            messageCloseButtonView.setNextFocusRightId(valueOf.intValue());
            messageCloseButtonView.setNextFocusLeftId(valueOf.intValue());
        } else if (numButtons == 1) {
            View view = messageButtonViews.get(0);
            int id = view.getId();
            Integer valueOf2 = Integer.valueOf(id);
            view.setNextFocusLeftId(valueOf.intValue());
            view.setNextFocusRightId(valueOf.intValue());
            view.setNextFocusUpId(valueOf.intValue());
            view.setNextFocusDownId(valueOf.intValue());
            messageCloseButtonView.setNextFocusUpId(id);
            messageCloseButtonView.setNextFocusDownId(id);
            messageCloseButtonView.setNextFocusRightId(id);
            messageCloseButtonView.setNextFocusLeftId(id);
            messageCloseButtonView = view;
            valueOf = valueOf2;
        } else if (numButtons != 2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: M4.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String str;
                    str = InAppMessageImmersiveBaseView.setupDirectionalNavigation$lambda$1(numButtons);
                    return str;
                }
            }, 6, (Object) null);
        } else {
            View view2 = messageButtonViews.get(1);
            View view3 = messageButtonViews.get(0);
            int id2 = view2.getId();
            Integer valueOf3 = Integer.valueOf(id2);
            int id3 = view3.getId();
            view2.setNextFocusLeftId(id3);
            view2.setNextFocusRightId(id3);
            view2.setNextFocusUpId(valueOf.intValue());
            view2.setNextFocusDownId(valueOf.intValue());
            view3.setNextFocusLeftId(id2);
            view3.setNextFocusRightId(id2);
            view3.setNextFocusUpId(valueOf.intValue());
            view3.setNextFocusDownId(valueOf.intValue());
            messageCloseButtonView.setNextFocusUpId(id2);
            messageCloseButtonView.setNextFocusDownId(id2);
            messageCloseButtonView.setNextFocusRightId(id2);
            messageCloseButtonView.setNextFocusLeftId(id3);
            messageCloseButtonView = view2;
            valueOf = valueOf3;
        }
        setNextFocusUpId(valueOf.intValue());
        setNextFocusDownId(valueOf.intValue());
        setNextFocusRightId(valueOf.intValue());
        setNextFocusLeftId(valueOf.intValue());
        if (messageCloseButtonView != null) {
            messageCloseButtonView.setFocusedByDefault(true);
        }
        if (messageCloseButtonView != null) {
            messageCloseButtonView.post(new Runnable() { // from class: M4.y
                @Override // java.lang.Runnable
                public final void run() {
                    messageCloseButtonView.requestFocus();
                }
            });
        }
    }
}
