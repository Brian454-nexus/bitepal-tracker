package com.braze.ui.inappmessage.factories;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.braze.BrazeInternal;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$layout;
import com.braze.ui.inappmessage.IInAppMessageViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlViewFactory;
import com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.utils.InAppMessageWebViewClient;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.inappmessage.views.InAppMessageHtmlView;
import com.braze.ui.support.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/braze/ui/inappmessage/factories/DefaultInAppMessageHtmlViewFactory;", "Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "inAppMessageWebViewClientListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "<init>", "(Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;)V", "createInAppMessageView", "Lcom/braze/ui/inappmessage/views/InAppMessageHtmlView;", "activity", "Landroid/app/Activity;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class DefaultInAppMessageHtmlViewFactory implements IInAppMessageViewFactory {

    @NotNull
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;

    public DefaultInAppMessageHtmlViewFactory(@NotNull IInAppMessageWebViewClientListener inAppMessageWebViewClientListener) {
        Intrinsics.checkNotNullParameter(inAppMessageWebViewClientListener, "inAppMessageWebViewClientListener");
        this.inAppMessageWebViewClientListener = inAppMessageWebViewClientListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createInAppMessageView$lambda$0() {
        return "The device is not currently in touch mode. This message requires user touch interaction to display properly. Please set setIsTouchModeRequiredForHtmlInAppMessages to false to change this behavior.";
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewFactory
    @SuppressLint({"AddJavascriptInterface"})
    @Nullable
    public InAppMessageHtmlView createInAppMessageView(@NotNull Activity activity, @NotNull IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Context applicationContext = activity.getApplicationContext();
        View inflate = activity.getLayoutInflater().inflate(R$layout.com_braze_inappmessage_html, (ViewGroup) null);
        Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageHtmlView");
        InAppMessageHtmlView inAppMessageHtmlView = (InAppMessageHtmlView) inflate;
        BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
        Intrinsics.checkNotNull(applicationContext);
        if (brazeInternal.getConfigurationProvider(applicationContext).isTouchModeRequiredForHtmlInAppMessages() && ViewUtils.isDeviceNotInTouchMode(inAppMessageHtmlView)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: J4.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String createInAppMessageView$lambda$0;
                    createInAppMessageView$lambda$0 = DefaultInAppMessageHtmlViewFactory.createInAppMessageView$lambda$0();
                    return createInAppMessageView$lambda$0;
                }
            }, 6, (Object) null);
            return null;
        }
        InAppMessageHtml inAppMessageHtml = (InAppMessageHtml) inAppMessage;
        InAppMessageJavascriptInterface inAppMessageJavascriptInterface = new InAppMessageJavascriptInterface(applicationContext, inAppMessageHtml);
        InAppMessageHtmlBaseView.setWebViewContent$default(inAppMessageHtmlView, inAppMessageHtml.getMessage(), null, 2, null);
        Context applicationContext2 = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        inAppMessageHtmlView.setInAppMessageWebViewClient(new InAppMessageWebViewClient(applicationContext2, inAppMessageHtml, this.inAppMessageWebViewClientListener, null, 8, null));
        WebView messageWebView = inAppMessageHtmlView.getMessageWebView();
        if (messageWebView != null) {
            messageWebView.addJavascriptInterface(inAppMessageJavascriptInterface, "brazeInternalBridge");
        }
        inAppMessageHtmlView.setupDirectionalNavigation();
        return inAppMessageHtmlView;
    }
}
