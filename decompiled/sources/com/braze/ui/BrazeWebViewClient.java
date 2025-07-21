package com.braze.ui;

import K2.c;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.amazon.a.a.h.a;
import com.braze.BrazeInternal;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.banners.listeners.IBannerWebViewClientListener;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
import com.braze.ui.support.UriUtils;
import ga.u0;
import java.io.File;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 M2\u00020\u0001:\u0002NMBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J%\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b$\u0010%J%\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b$\u0010&J\u001f\u0010'\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010)\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\fH\u0017¢\u0006\u0004\b)\u0010+J\u0017\u0010.\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u00109R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010:R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010;R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006O"}, d2 = {"Lcom/braze/ui/BrazeWebViewClient;", "Landroid/webkit/WebViewClient;", "Landroid/content/Context;", "context", "Lcom/braze/ui/BrazeWebViewClient$Type;", "type", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "inAppMessageWebViewClientListener", "Lcom/braze/ui/banners/listeners/IBannerWebViewClientListener;", "bannerWebViewClientListener", "", "assetDirectoryUrl", "<init>", "(Landroid/content/Context;Lcom/braze/ui/BrazeWebViewClient$Type;Lcom/braze/models/inappmessage/IInAppMessage;Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;Lcom/braze/ui/banners/listeners/IBannerWebViewClientListener;Ljava/lang/String;)V", "Landroid/webkit/WebView;", "view", "", "appendBridgeJavascript", "(Landroid/webkit/WebView;)V", "markPageFinished", "()V", "url", "", "handleUrlOverride", "(Ljava/lang/String;)Z", "Landroid/net/Uri;", "uri", "Landroid/os/Bundle;", "queryBundle", "handleQueryAction", "(Ljava/lang/String;Landroid/net/Uri;Landroid/os/Bundle;)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Lcom/braze/ui/inappmessage/listeners/IWebViewClientStateListener;", "listener", "setWebViewClientStateListener", "(Lcom/braze/ui/inappmessage/listeners/IWebViewClientStateListener;)V", "Landroid/webkit/RenderProcessGoneDetail;", "detail", "onRenderProcessGone", "(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/braze/ui/BrazeWebViewClient$Type;", "getType", "()Lcom/braze/ui/BrazeWebViewClient$Type;", "Lcom/braze/models/inappmessage/IInAppMessage;", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "Lcom/braze/ui/banners/listeners/IBannerWebViewClientListener;", "webViewClientStateListener", "Lcom/braze/ui/inappmessage/listeners/IWebViewClientStateListener;", "hasPageFinishedLoading", "Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasCalledPageFinishedOnListener", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lga/u0;", "markPageFinishedJob", "Lga/u0;", "", "maxOnPageFinishedWaitTimeMs", "I", "LK2/c;", "assetLoader", "LK2/c;", "Companion", "Type", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class BrazeWebViewClient extends WebViewClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final c assetLoader;

    @Nullable
    private final IBannerWebViewClientListener bannerWebViewClientListener;

    @NotNull
    private final Context context;

    @NotNull
    private final AtomicBoolean hasCalledPageFinishedOnListener;
    private boolean hasPageFinishedLoading;

    @Nullable
    private final IInAppMessage inAppMessage;

    @Nullable
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;

    @Nullable
    private u0 markPageFinishedJob;
    private final int maxOnPageFinishedWaitTimeMs;

    @NotNull
    private final Type type;

    @Nullable
    private IWebViewClientStateListener webViewClientStateListener;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0010H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0010H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/braze/ui/BrazeWebViewClient$Companion;", "", "<init>", "()V", "BRIDGE_JS_FILE", "", "JAVASCRIPT_PREFIX", "BRAZE_SCHEME", "AUTHORITY_NAME_CLOSE", "AUTHORITY_NAME_NEWSFEED", "AUTHORITY_NAME_CUSTOM_EVENT", "BRAZE_CUSTOM_EVENT_NAME_KEY", "QUERY_NAME_BUTTON_ID", "QUERY_NAME_EXTERNAL_OPEN", "QUERY_NAME_DEEPLINK", "getBundleFromUrl", "Landroid/os/Bundle;", "url", "parseCustomEventNameFromQueryBundle", "queryBundle", "parsePropertiesFromQueryBundle", "Lcom/braze/models/outgoing/BrazeProperties;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBrazeWebViewClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeWebViewClient.kt\ncom/braze/ui/BrazeWebViewClient$Companion\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,330:1\n216#2,2:331\n*S KotlinDebug\n*F\n+ 1 BrazeWebViewClient.kt\ncom/braze/ui/BrazeWebViewClient$Companion\n*L\n304#1:331,2\n*E\n"})
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Bundle getBundleFromUrl(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            Bundle bundle = new Bundle();
            if (!StringsKt.isBlank(url)) {
                Uri parse = Uri.parse(url);
                Intrinsics.checkNotNull(parse);
                for (Map.Entry<String, String> entry : UriUtils.getQueryParameters(parse).entrySet()) {
                    bundle.putString(entry.getKey(), entry.getValue());
                }
            }
            return bundle;
        }

        @JvmStatic
        @Nullable
        public final String parseCustomEventNameFromQueryBundle(@NotNull Bundle queryBundle) {
            Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
            return queryBundle.getString(a.f10906a);
        }

        @JvmStatic
        @NotNull
        public final BrazeProperties parsePropertiesFromQueryBundle(@NotNull Bundle queryBundle) {
            String string;
            Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
            BrazeProperties brazeProperties = new BrazeProperties();
            for (String str : queryBundle.keySet()) {
                if (!Intrinsics.areEqual(str, a.f10906a) && (string = queryBundle.getString(str, null)) != null && !StringsKt.isBlank(string)) {
                    Intrinsics.checkNotNull(str);
                    brazeProperties.addProperty(str, string);
                }
            }
            return brazeProperties;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/braze/ui/BrazeWebViewClient$Type;", "", "<init>", "(Ljava/lang/String;I)V", "BANNER", "IN_APP_MESSAGE", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type BANNER = new Type("BANNER", 0);
        public static final Type IN_APP_MESSAGE = new Type("IN_APP_MESSAGE", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{BANNER, IN_APP_MESSAGE};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Type(String str, int i6) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.IN_APP_MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BrazeWebViewClient(@NotNull Context context, @NotNull Type type, @Nullable IInAppMessage iInAppMessage, @Nullable IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener, @Nullable IBannerWebViewClientListener iBannerWebViewClientListener, @Nullable String str) {
        c b6;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(type, "type");
        this.context = context;
        this.type = type;
        this.inAppMessage = iInAppMessage;
        this.inAppMessageWebViewClientListener = iInAppMessageWebViewClientListener;
        this.bannerWebViewClientListener = iBannerWebViewClientListener;
        this.hasCalledPageFinishedOnListener = new AtomicBoolean(false);
        this.maxOnPageFinishedWaitTimeMs = BrazeInternal.INSTANCE.getConfigurationProvider(context).getInAppMessageWebViewClientOnPageFinishedMaxWaitMs();
        if (str != null) {
            b6 = new c.a().c("iamcache.braze").a("/", new c.b(context, new File(str))).b();
        } else {
            b6 = new c.a().c("iamcache.braze").a("/ab_triggers/", new c.b(context, new File(context.getCacheDir(), "ab_triggers"))).b();
        }
        Intrinsics.checkNotNull(b6);
        this.assetLoader = b6;
    }

    private final void appendBridgeJavascript(WebView view) {
        try {
            AssetManager assets = this.context.getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
            view.loadUrl("javascript:" + BrazeFileUtils.getAssetFileStringContents(assets, "braze-html-bridge.js"));
        } catch (Exception e6) {
            if (this.type == Type.IN_APP_MESSAGE) {
                BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(false);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: v4.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String appendBridgeJavascript$lambda$3;
                    appendBridgeJavascript$lambda$3 = BrazeWebViewClient.appendBridgeJavascript$lambda$3(BrazeWebViewClient.this);
                    return appendBridgeJavascript$lambda$3;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String appendBridgeJavascript$lambda$3(BrazeWebViewClient brazeWebViewClient) {
        return "Failed to get HTML " + brazeWebViewClient.type.name() + " javascript additions";
    }

    private final void handleQueryAction(String url, final Uri uri, Bundle queryBundle) {
        IBannerWebViewClientListener iBannerWebViewClientListener;
        IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener;
        IBannerWebViewClientListener iBannerWebViewClientListener2;
        IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener2;
        IBannerWebViewClientListener iBannerWebViewClientListener3;
        IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener3;
        String authority = uri.getAuthority();
        if (authority == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: v4.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleQueryAction$lambda$10;
                    handleQueryAction$lambda$10 = BrazeWebViewClient.handleQueryAction$lambda$10(uri);
                    return handleQueryAction$lambda$10;
                }
            }, 7, (Object) null);
            return;
        }
        int hashCode = authority.hashCode();
        if (hashCode == -1801488983) {
            if (authority.equals("customEvent")) {
                Type type = this.type;
                if (type != Type.IN_APP_MESSAGE) {
                    if (type != Type.BANNER || (iBannerWebViewClientListener = this.bannerWebViewClientListener) == null) {
                        return;
                    }
                    iBannerWebViewClientListener.onCustomEventAction(this.context, url, queryBundle);
                    return;
                }
                IInAppMessage iInAppMessage = this.inAppMessage;
                if (iInAppMessage == null || (iInAppMessageWebViewClientListener = this.inAppMessageWebViewClientListener) == null) {
                    return;
                }
                iInAppMessageWebViewClientListener.onCustomEventAction(iInAppMessage, url, queryBundle);
                return;
            }
            return;
        }
        if (hashCode == 3138974) {
            if (authority.equals("feed")) {
                Type type2 = this.type;
                if (type2 != Type.IN_APP_MESSAGE) {
                    if (type2 != Type.BANNER || (iBannerWebViewClientListener2 = this.bannerWebViewClientListener) == null) {
                        return;
                    }
                    iBannerWebViewClientListener2.onNewsfeedAction(this.context, url, queryBundle);
                    return;
                }
                IInAppMessage iInAppMessage2 = this.inAppMessage;
                if (iInAppMessage2 == null || (iInAppMessageWebViewClientListener2 = this.inAppMessageWebViewClientListener) == null) {
                    return;
                }
                iInAppMessageWebViewClientListener2.onNewsfeedAction(iInAppMessage2, url, queryBundle);
                return;
            }
            return;
        }
        if (hashCode == 94756344 && authority.equals("close")) {
            Type type3 = this.type;
            if (type3 != Type.IN_APP_MESSAGE) {
                if (type3 != Type.BANNER || (iBannerWebViewClientListener3 = this.bannerWebViewClientListener) == null) {
                    return;
                }
                iBannerWebViewClientListener3.onCloseAction(this.context, url, queryBundle);
                return;
            }
            IInAppMessage iInAppMessage3 = this.inAppMessage;
            if (iInAppMessage3 == null || (iInAppMessageWebViewClientListener3 = this.inAppMessageWebViewClientListener) == null) {
                return;
            }
            iInAppMessageWebViewClientListener3.onCloseAction(iInAppMessage3, url, queryBundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleQueryAction$lambda$10(Uri uri) {
        return "Uri authority was null. Uri: " + uri;
    }

    private final boolean handleUrlOverride(String url) {
        IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener;
        Type type = this.type;
        final String str = (type == Type.IN_APP_MESSAGE && this.inAppMessageWebViewClientListener == null) ? "BrazeWebViewClient was given null IInAppMessageWebViewClientListener listener. Returning true." : (type == Type.BANNER && this.bannerWebViewClientListener == null) ? "BrazeWebViewClient was given null IBannerWebViewClientListener listener. Returning true." : StringsKt.isBlank(url) ? "BrazeWebViewClient.shouldOverrideUrlLoading was given blank url. Returning true." : null;
        if (str != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: v4.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleUrlOverride$lambda$7$lambda$6;
                    handleUrlOverride$lambda$7$lambda$6 = BrazeWebViewClient.handleUrlOverride$lambda$7$lambda$6(str);
                    return handleUrlOverride$lambda$7$lambda$6;
                }
            }, 6, (Object) null);
            return true;
        }
        final Uri parse = Uri.parse(url);
        Bundle bundleFromUrl = INSTANCE.getBundleFromUrl(url);
        if (parse.getScheme() != null && Intrinsics.areEqual(parse.getScheme(), "appboy")) {
            Intrinsics.checkNotNull(parse);
            handleQueryAction(url, parse, bundleFromUrl);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: v4.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String handleUrlOverride$lambda$8;
                handleUrlOverride$lambda$8 = BrazeWebViewClient.handleUrlOverride$lambda$8(parse);
                return handleUrlOverride$lambda$8;
            }
        }, 7, (Object) null);
        int i6 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i6 == 1) {
            IInAppMessage iInAppMessage = this.inAppMessage;
            if (iInAppMessage != null && (iInAppMessageWebViewClientListener = this.inAppMessageWebViewClientListener) != null) {
                iInAppMessageWebViewClientListener.onOtherUrlAction(iInAppMessage, url, bundleFromUrl);
            }
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            IBannerWebViewClientListener iBannerWebViewClientListener = this.bannerWebViewClientListener;
            if (iBannerWebViewClientListener != null) {
                iBannerWebViewClientListener.onOtherUrlAction(this.context, url, bundleFromUrl);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleUrlOverride$lambda$7$lambda$6(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleUrlOverride$lambda$8(Uri uri) {
        return "Uri scheme was null or not an appboy url. Uri: " + uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markPageFinished() {
        IWebViewClientStateListener iWebViewClientStateListener = this.webViewClientStateListener;
        if (iWebViewClientStateListener == null || !this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: v4.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String markPageFinished$lambda$5$lambda$4;
                markPageFinished$lambda$5$lambda$4 = BrazeWebViewClient.markPageFinished$lambda$5$lambda$4();
                return markPageFinished$lambda$5$lambda$4;
            }
        }, 6, (Object) null);
        iWebViewClientStateListener.onPageFinished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String markPageFinished$lambda$5$lambda$4() {
        return "Page may not have finished loading, but max wait time has expired. Calling onPageFinished on listener.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onPageFinished$lambda$2$lambda$1() {
        return "Page has finished loading. Calling onPageFinished on listener";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onRenderProcessGone$lambda$14() {
        return "The webview rendering process crashed, returning true";
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@NotNull WebView view, @NotNull String url) {
        BrazeWebViewClient brazeWebViewClient;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        super.onPageFinished(view, url);
        appendBridgeJavascript(view);
        IWebViewClientStateListener iWebViewClientStateListener = this.webViewClientStateListener;
        if (iWebViewClientStateListener == null || !this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            brazeWebViewClient = this;
        } else {
            brazeWebViewClient = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeWebViewClient, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: v4.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onPageFinished$lambda$2$lambda$1;
                    onPageFinished$lambda$2$lambda$1 = BrazeWebViewClient.onPageFinished$lambda$2$lambda$1();
                    return onPageFinished$lambda$2$lambda$1;
                }
            }, 6, (Object) null);
            iWebViewClientStateListener.onPageFinished();
        }
        brazeWebViewClient.hasPageFinishedLoading = true;
        u0 u0Var = brazeWebViewClient.markPageFinishedJob;
        if (u0Var != null) {
            u0.a.b(u0Var, (CancellationException) null, 1, (Object) null);
        }
        brazeWebViewClient.markPageFinishedJob = null;
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(@NotNull WebView view, @NotNull RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: v4.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onRenderProcessGone$lambda$14;
                onRenderProcessGone$lambda$14 = BrazeWebViewClient.onRenderProcessGone$lambda$14();
                return onRenderProcessGone$lambda$14;
            }
        }, 6, (Object) null);
        return true;
    }

    public final void setWebViewClientStateListener(@Nullable IWebViewClientStateListener listener) {
        if (listener != null && this.hasPageFinishedLoading && this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            listener.onPageFinished();
        } else {
            this.markPageFinishedJob = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Integer.valueOf(this.maxOnPageFinishedWaitTimeMs), null, new BrazeWebViewClient$setWebViewClientStateListener$1(this, null), 2, null);
        }
        this.webViewClientStateListener = listener;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@Nullable WebView view, @Nullable WebResourceRequest request) {
        if (request != null) {
            return this.assetLoader.a(request.getUrl());
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return handleUrlOverride(uri);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated(message = "Use shouldInterceptRequest(WebView, WebResourceRequest)")
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@Nullable WebView view, @Nullable String url) {
        return this.assetLoader.a(Uri.parse(url));
    }

    @Override // android.webkit.WebViewClient
    @Deprecated(message = "Deprecated in Java")
    public boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        return handleUrlOverride(url);
    }
}
