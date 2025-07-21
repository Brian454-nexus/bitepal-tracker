package com.braze.ui.banners.listeners;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.amazon.a.a.o.c.a.b;
import com.braze.Braze;
import com.braze.enums.Channel;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.actions.UriAction;
import com.braze.ui.banners.listeners.DefaultBannerWebViewClientListener;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\u0010"}, d2 = {"Lcom/braze/ui/banners/listeners/DefaultBannerWebViewClientListener;", "Lcom/braze/ui/banners/listeners/IBannerWebViewClientListener;", "<init>", "()V", "onCloseAction", "", "context", "Landroid/content/Context;", "url", "", "queryBundle", "Landroid/os/Bundle;", "onNewsfeedAction", "onCustomEventAction", "onOtherUrlAction", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class DefaultBannerWebViewClientListener implements IBannerWebViewClientListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/braze/ui/banners/listeners/DefaultBannerWebViewClientListener$Companion;", "", "<init>", "()V", "parseUseWebViewFromQueryBundle", "", "queryBundle", "Landroid/os/Bundle;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean parseUseWebViewFromQueryBundle(@NotNull Bundle queryBundle) {
            boolean z6;
            boolean z7;
            boolean z8;
            Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
            if (queryBundle.containsKey("abDeepLink")) {
                z6 = Boolean.parseBoolean(queryBundle.getString("abDeepLink"));
                z7 = true;
            } else {
                z6 = false;
                z7 = false;
            }
            if (queryBundle.containsKey("abExternalOpen")) {
                z8 = Boolean.parseBoolean(queryBundle.getString("abExternalOpen"));
                z7 = true;
            } else {
                z8 = false;
            }
            if (z7) {
                return (z6 || z8) ? false : true;
            }
            return true;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCloseAction$lambda$0() {
        return "Close action not available on Banners.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCustomEventAction$lambda$2() {
        return "DefaultBannerWebViewClientListener.onCustomEventAction called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onNewsfeedAction$lambda$1() {
        return "Newsfeed action not available on Banners.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$3() {
        return "DefaultBannerWebViewClientListener.onOtherUrlAction called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$4(String str) {
        return "UriAction is null. Not passing any URI to BrazeDeeplinkHandler. Url: " + str + b.f11260a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$5(Uri uri, String str) {
        return "Not passing local uri to BrazeDeeplinkHandler. Got local uri: " + uri + " for url: " + str + b.f11260a;
    }

    @Override // com.braze.ui.banners.listeners.IBannerWebViewClientListener
    public void onCloseAction(@NotNull Context context, @NotNull String url, @NotNull Bundle queryBundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: B4.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onCloseAction$lambda$0;
                onCloseAction$lambda$0 = DefaultBannerWebViewClientListener.onCloseAction$lambda$0();
                return onCloseAction$lambda$0;
            }
        }, 6, (Object) null);
    }

    @Override // com.braze.ui.banners.listeners.IBannerWebViewClientListener
    public void onCustomEventAction(@NotNull Context context, @NotNull String url, @NotNull Bundle queryBundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: B4.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onCustomEventAction$lambda$2;
                onCustomEventAction$lambda$2 = DefaultBannerWebViewClientListener.onCustomEventAction$lambda$2();
                return onCustomEventAction$lambda$2;
            }
        }, 7, (Object) null);
        BrazeWebViewClient.Companion companion = BrazeWebViewClient.INSTANCE;
        String parseCustomEventNameFromQueryBundle = companion.parseCustomEventNameFromQueryBundle(queryBundle);
        if (parseCustomEventNameFromQueryBundle == null || StringsKt.isBlank(parseCustomEventNameFromQueryBundle)) {
            return;
        }
        Braze.INSTANCE.getInstance(context).logCustomEvent(parseCustomEventNameFromQueryBundle, companion.parsePropertiesFromQueryBundle(queryBundle));
    }

    @Override // com.braze.ui.banners.listeners.IBannerWebViewClientListener
    public void onNewsfeedAction(@NotNull Context context, @NotNull String url, @NotNull Bundle queryBundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: B4.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onNewsfeedAction$lambda$1;
                onNewsfeedAction$lambda$1 = DefaultBannerWebViewClientListener.onNewsfeedAction$lambda$1();
                return onNewsfeedAction$lambda$1;
            }
        }, 6, (Object) null);
    }

    @Override // com.braze.ui.banners.listeners.IBannerWebViewClientListener
    public void onOtherUrlAction(@NotNull Context context, @NotNull final String url, @NotNull Bundle queryBundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: B4.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onOtherUrlAction$lambda$3;
                onOtherUrlAction$lambda$3 = DefaultBannerWebViewClientListener.onOtherUrlAction$lambda$3();
                return onOtherUrlAction$lambda$3;
            }
        }, 7, (Object) null);
        boolean parseUseWebViewFromQueryBundle = INSTANCE.parseUseWebViewFromQueryBundle(queryBundle);
        BrazeDeeplinkHandler.Companion companion = BrazeDeeplinkHandler.INSTANCE;
        UriAction createUriActionFromUrlString = companion.getInstance().createUriActionFromUrlString(url, queryBundle, parseUseWebViewFromQueryBundle, Channel.BANNER);
        if (createUriActionFromUrlString == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: B4.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onOtherUrlAction$lambda$4;
                    onOtherUrlAction$lambda$4 = DefaultBannerWebViewClientListener.onOtherUrlAction$lambda$4(url);
                    return onOtherUrlAction$lambda$4;
                }
            }, 6, (Object) null);
            return;
        }
        final Uri uri = createUriActionFromUrlString.getUri();
        if (BrazeFileUtils.isLocalUri(uri)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: B4.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onOtherUrlAction$lambda$5;
                    onOtherUrlAction$lambda$5 = DefaultBannerWebViewClientListener.onOtherUrlAction$lambda$5(uri, url);
                    return onOtherUrlAction$lambda$5;
                }
            }, 6, (Object) null);
        } else {
            companion.getInstance().gotoUri(context, createUriActionFromUrlString);
        }
    }
}
