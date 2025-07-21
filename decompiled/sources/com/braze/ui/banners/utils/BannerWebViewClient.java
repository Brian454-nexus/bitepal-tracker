package com.braze.ui.banners.utils;

import android.content.Context;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.banners.listeners.IBannerWebViewClientListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/braze/ui/banners/utils/BannerWebViewClient;", "Lcom/braze/ui/BrazeWebViewClient;", "context", "Landroid/content/Context;", "bannerWebViewClientListener", "Lcom/braze/ui/banners/listeners/IBannerWebViewClientListener;", "<init>", "(Landroid/content/Context;Lcom/braze/ui/banners/listeners/IBannerWebViewClientListener;)V", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class BannerWebViewClient extends BrazeWebViewClient {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerWebViewClient(@NotNull Context context, @Nullable IBannerWebViewClientListener iBannerWebViewClientListener) {
        super(context, BrazeWebViewClient.Type.BANNER, null, null, iBannerWebViewClientListener, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
