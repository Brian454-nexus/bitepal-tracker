package com.braze.ui;

import android.content.Context;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.braze.enums.Channel;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeWebViewActivity$createWebViewClient$1;
import com.braze.ui.actions.UriAction;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0017J\u001f\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"com/braze/ui/BrazeWebViewActivity$createWebViewClient$1", "Landroid/webkit/WebViewClient;", "shouldOverrideUrlLoading", "", "view", "Landroid/webkit/WebView;", "request", "Landroid/webkit/WebResourceRequest;", "url", "", "handleUrlOverride", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Boolean;", "onRenderProcessGone", "detail", "Landroid/webkit/RenderProcessGoneDetail;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class BrazeWebViewActivity$createWebViewClient$1 extends WebViewClient {
    final /* synthetic */ BrazeWebViewActivity this$0;

    public BrazeWebViewActivity$createWebViewClient$1(BrazeWebViewActivity brazeWebViewActivity) {
        this.this$0 = brazeWebViewActivity;
    }

    private final Boolean handleUrlOverride(Context context, final String url) {
        try {
            if (CollectionsKt.contains(BrazeFileUtils.REMOTE_SCHEMES, Uri.parse(url).getScheme())) {
                return null;
            }
            UriAction createUriActionFromUrlString = BrazeDeeplinkHandler.INSTANCE.getInstance().createUriActionFromUrlString(url, this.this$0.getIntent().getExtras(), false, Channel.UNKNOWN);
            if (createUriActionFromUrlString == null) {
                return Boolean.FALSE;
            }
            createUriActionFromUrlString.execute(context);
            this.this$0.finish();
            return Boolean.TRUE;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: v4.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleUrlOverride$lambda$0;
                    handleUrlOverride$lambda$0 = BrazeWebViewActivity$createWebViewClient$1.handleUrlOverride$lambda$0(url);
                    return handleUrlOverride$lambda$0;
                }
            }, 4, (Object) null);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleUrlOverride$lambda$0(String str) {
        return "Unexpected exception while processing url " + str + ". Passing url back to WebView.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onRenderProcessGone$lambda$1() {
        return "The webview rendering process crashed, returning true";
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: v4.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onRenderProcessGone$lambda$1;
                onRenderProcessGone$lambda$1 = BrazeWebViewActivity$createWebViewClient$1.onRenderProcessGone$lambda$1();
                return onRenderProcessGone$lambda$1;
            }
        }, 6, (Object) null);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        Boolean handleUrlOverride = handleUrlOverride(context, uri);
        return handleUrlOverride != null ? handleUrlOverride.booleanValue() : super.shouldOverrideUrlLoading(view, request);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated(message = "Deprecated in Java")
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Boolean handleUrlOverride = handleUrlOverride(context, url);
        return handleUrlOverride != null ? handleUrlOverride.booleanValue() : super.shouldOverrideUrlLoading(view, url);
    }
}
