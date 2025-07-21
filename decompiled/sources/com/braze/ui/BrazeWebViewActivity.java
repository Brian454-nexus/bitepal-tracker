package com.braze.ui;

import P0.AbstractActivityC0712u;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.braze.BrazeInternal;
import com.braze.ui.support.ViewUtils;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/braze/ui/BrazeWebViewActivity;", "LP0/u;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/webkit/WebChromeClient;", "createWebChromeClient", "()Landroid/webkit/WebChromeClient;", "Landroid/webkit/WebViewClient;", "createWebViewClient", "()Landroid/webkit/WebViewClient;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class BrazeWebViewActivity extends AbstractActivityC0712u {
    @NotNull
    public WebChromeClient createWebChromeClient() {
        return new BrazeWebViewActivity$createWebChromeClient$1();
    }

    @NotNull
    public WebViewClient createWebViewClient() {
        return new BrazeWebViewActivity$createWebViewClient$1(this);
    }

    @Override // P0.AbstractActivityC0712u, e.AbstractActivityC1216j, androidx.core.app.g, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        getWindow().setFlags(16777216, 16777216);
        if (BrazeInternal.INSTANCE.getConfigurationProvider(this).getShouldUseWindowFlagSecureInActivities()) {
            getWindow().setFlags(ConstantsKt.DEFAULT_BUFFER_SIZE, ConstantsKt.DEFAULT_BUFFER_SIZE);
        }
        setContentView(R$layout.com_braze_webview_activity);
        WebView webView = (WebView) findViewById(R$id.com_braze_webview_activity_webview);
        webView.setLayerType(2, null);
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setAllowFileAccess(false);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        if (ViewUtils.isDeviceInNightMode(applicationContext)) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 33) {
                settings.setAlgorithmicDarkeningAllowed(true);
            } else if (i6 >= 29) {
                settings.setForceDark(2);
            }
        }
        webView.setWebChromeClient(createWebChromeClient());
        webView.setWebViewClient(createWebViewClient());
        Bundle extras = getIntent().getExtras();
        if (extras == null || (string = extras.getString("url")) == null) {
            return;
        }
        webView.loadUrl(string);
    }
}
