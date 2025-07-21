package com.braze.ui.inappmessage.views;

import K2.b;
import K2.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.inappmessage.utils.InAppMessageWebViewClient;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.support.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z0.C2400K;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0019H&¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\t¢\u0006\u0004\b(\u0010\u000bR\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u0016\u0010-\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\"\u0010/\u001a\u00020\u001d8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b/\u0010.\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00107\u001a\u0004\u0018\u0001048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0016\u0010:\u001a\u0004\u0018\u00010)8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;", "Landroid/widget/RelativeLayout;", "Lcom/braze/ui/inappmessage/views/IInAppMessageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "finishWebViewDisplay", "()V", "", "htmlBody", "assetDirectoryUrl", "setWebViewContent", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/braze/ui/inappmessage/utils/InAppMessageWebViewClient;", "inAppMessageWebViewClient", "setInAppMessageWebViewClient", "(Lcom/braze/ui/inappmessage/utils/InAppMessageWebViewClient;)V", "Lcom/braze/ui/inappmessage/listeners/IWebViewClientStateListener;", "listener", "setHtmlPageFinishedListener", "(Lcom/braze/ui/inappmessage/listeners/IWebViewClientStateListener;)V", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "getWebViewViewId", "()I", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "Lz0/K;", "insets", "applyWindowInsets", "(Lz0/K;)V", "setupDirectionalNavigation", "Landroid/webkit/WebView;", "configuredMessageWebView", "Landroid/webkit/WebView;", "Lcom/braze/ui/inappmessage/utils/InAppMessageWebViewClient;", "isFinished", "Z", "hasAppliedWindowInsets", "getHasAppliedWindowInsets", "()Z", "setHasAppliedWindowInsets", "(Z)V", "Landroid/view/View;", "getMessageClickableView", "()Landroid/view/View;", "messageClickableView", "getMessageWebView", "()Landroid/webkit/WebView;", "messageWebView", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class InAppMessageHtmlBaseView extends RelativeLayout implements IInAppMessageView {

    @Nullable
    private WebView configuredMessageWebView;
    private boolean hasAppliedWindowInsets;

    @Nullable
    private InAppMessageWebViewClient inAppMessageWebViewClient;
    private boolean isFinished;

    public InAppMessageHtmlBaseView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_messageWebView_$lambda$0() {
        return "Cannot return the WebView for an already finished message";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_messageWebView_$lambda$1() {
        return "Cannot find WebView. getWebViewViewId() returned 0.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_messageWebView_$lambda$2(int i6) {
        return "findViewById for " + i6 + " returned null. Returning null for WebView.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_messageWebView_$lambda$3() {
        return "Failed to set dark mode WebView settings";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_messageWebView_$lambda$4() {
        return "HtmlInAppMessageHtmlLinkTarget enabled";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_messageWebView_$lambda$5() {
        return "HtmlInAppMessageHtmlLinkTarget not enabled";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String finishWebViewDisplay$lambda$6() {
        return "Finishing WebView display";
    }

    public static /* synthetic */ void setWebViewContent$default(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, String str, String str2, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setWebViewContent");
        }
        if ((i6 & 2) != 0) {
            str2 = null;
        }
        inAppMessageHtmlBaseView.setWebViewContent(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setWebViewContent$lambda$8() {
        return "Cannot load WebView. htmlBody was null.";
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(@NotNull C2400K insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        setHasAppliedWindowInsets(true);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (new BrazeConfigurationProvider(context).isHtmlInAppMessageApplyWindowInsetsEnabled() && getLayoutParams() != null && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(insets) + marginLayoutParams.leftMargin, ViewUtils.getMaxSafeTopInset(insets) + marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(insets) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(insets) + marginLayoutParams.bottomMargin);
        }
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

    public void finishWebViewDisplay() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M4.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String finishWebViewDisplay$lambda$6;
                finishWebViewDisplay$lambda$6 = InAppMessageHtmlBaseView.finishWebViewDisplay$lambda$6();
                return finishWebViewDisplay$lambda$6;
            }
        }, 7, (Object) null);
        this.isFinished = true;
        WebView webView = this.configuredMessageWebView;
        if (webView != null) {
            webView.loadUrl("about:blank");
            webView.onPause();
            webView.removeAllViews();
            this.configuredMessageWebView = null;
        }
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public boolean getHasAppliedWindowInsets() {
        return this.hasAppliedWindowInsets;
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    @Nullable
    public View getMessageClickableView() {
        return this;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    @Nullable
    public WebView getMessageWebView() {
        if (this.isFinished) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: M4.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _get_messageWebView_$lambda$0;
                    _get_messageWebView_$lambda$0 = InAppMessageHtmlBaseView._get_messageWebView_$lambda$0();
                    return _get_messageWebView_$lambda$0;
                }
            }, 6, (Object) null);
            return null;
        }
        final int webViewViewId = getWebViewViewId();
        if (webViewViewId == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M4.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _get_messageWebView_$lambda$1;
                    _get_messageWebView_$lambda$1 = InAppMessageHtmlBaseView._get_messageWebView_$lambda$1();
                    return _get_messageWebView_$lambda$1;
                }
            }, 7, (Object) null);
            return null;
        }
        WebView webView = this.configuredMessageWebView;
        if (webView != null) {
            return webView;
        }
        WebView webView2 = (WebView) findViewById(webViewViewId);
        if (webView2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M4.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _get_messageWebView_$lambda$2;
                    _get_messageWebView_$lambda$2 = InAppMessageHtmlBaseView._get_messageWebView_$lambda$2(webViewViewId);
                    return _get_messageWebView_$lambda$2;
                }
            }, 7, (Object) null);
            return null;
        }
        WebSettings settings = webView2.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        webView2.setLayerType(2, null);
        webView2.setBackgroundColor(0);
        try {
            if (d.a("FORCE_DARK")) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (ViewUtils.isDeviceInNightMode(context)) {
                    b.b(settings, 2);
                }
            }
            if (d.a("FORCE_DARK_STRATEGY")) {
                b.c(settings, 1);
            }
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, th, false, new Function0() { // from class: M4.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _get_messageWebView_$lambda$3;
                    _get_messageWebView_$lambda$3 = InAppMessageHtmlBaseView._get_messageWebView_$lambda$3();
                    return _get_messageWebView_$lambda$3;
                }
            }, 4, (Object) null);
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        boolean isHtmlInAppMessageHtmlLinkTargetEnabled = new BrazeConfigurationProvider(context2).isHtmlInAppMessageHtmlLinkTargetEnabled();
        if (isHtmlInAppMessageHtmlLinkTargetEnabled) {
            webView2.getSettings().setSupportMultipleWindows(true);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: M4.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _get_messageWebView_$lambda$4;
                    _get_messageWebView_$lambda$4 = InAppMessageHtmlBaseView._get_messageWebView_$lambda$4();
                    return _get_messageWebView_$lambda$4;
                }
            }, 6, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: M4.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _get_messageWebView_$lambda$5;
                    _get_messageWebView_$lambda$5 = InAppMessageHtmlBaseView._get_messageWebView_$lambda$5();
                    return _get_messageWebView_$lambda$5;
                }
            }, 6, (Object) null);
        }
        webView2.setWebChromeClient(new InAppMessageHtmlBaseView$messageWebView$7(this, isHtmlInAppMessageHtmlLinkTargetEnabled));
        this.configuredMessageWebView = webView2;
        return webView2;
    }

    public abstract int getWebViewViewId();

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (keyCode == 4 && BrazeInAppMessageManager.INSTANCE.getInstance().getDoesBackButtonDismissInAppMessageViewField()) {
            InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
            return true;
        }
        WebView webView = this.configuredMessageWebView;
        if (webView != null) {
            ViewUtils.setFocusableInTouchModeAndRequestFocus(webView);
        }
        return super.onKeyDown(keyCode, event);
    }

    public void setHasAppliedWindowInsets(boolean z6) {
        this.hasAppliedWindowInsets = z6;
    }

    public void setHtmlPageFinishedListener(@Nullable IWebViewClientStateListener listener) {
        InAppMessageWebViewClient inAppMessageWebViewClient = this.inAppMessageWebViewClient;
        if (inAppMessageWebViewClient != null) {
            inAppMessageWebViewClient.setWebViewClientStateListener(listener);
        }
    }

    public void setInAppMessageWebViewClient(@NotNull InAppMessageWebViewClient inAppMessageWebViewClient) {
        Intrinsics.checkNotNullParameter(inAppMessageWebViewClient, "inAppMessageWebViewClient");
        WebView messageWebView = getMessageWebView();
        if (messageWebView != null) {
            messageWebView.setWebViewClient(inAppMessageWebViewClient);
        }
        this.inAppMessageWebViewClient = inAppMessageWebViewClient;
    }

    @JvmOverloads
    public final void setWebViewContent(@Nullable String str) {
        setWebViewContent$default(this, str, null, 2, null);
    }

    public final void setupDirectionalNavigation() {
        final WebView messageWebView = getMessageWebView();
        if (messageWebView == null) {
            return;
        }
        messageWebView.setNextFocusDownId(messageWebView.getId());
        messageWebView.setNextFocusLeftId(messageWebView.getId());
        messageWebView.setNextFocusRightId(messageWebView.getId());
        messageWebView.setNextFocusUpId(messageWebView.getId());
        messageWebView.requestFocus();
        messageWebView.setFocusedByDefault(true);
        messageWebView.post(new Runnable() { // from class: M4.m
            @Override // java.lang.Runnable
            public final void run() {
                messageWebView.requestFocus();
            }
        });
    }

    @JvmOverloads
    public void setWebViewContent(@Nullable String htmlBody, @Nullable String assetDirectoryUrl) {
        if (htmlBody != null) {
            WebView messageWebView = getMessageWebView();
            if (messageWebView != null) {
                messageWebView.loadDataWithBaseURL("https://iamcache.braze/", htmlBody, "text/html", "utf-8", null);
                return;
            }
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M4.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String webViewContent$lambda$8;
                webViewContent$lambda$8 = InAppMessageHtmlBaseView.setWebViewContent$lambda$8();
                return webViewContent$lambda$8;
            }
        }, 7, (Object) null);
    }
}
