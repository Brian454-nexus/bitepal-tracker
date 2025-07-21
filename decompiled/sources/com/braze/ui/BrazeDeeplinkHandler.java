package com.braze.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.AppsFlyerProperties;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.enums.Channel;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.NewsfeedAction;
import com.braze.ui.actions.UriAction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J,\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J*\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016¨\u0006\u001e"}, d2 = {"Lcom/braze/ui/BrazeDeeplinkHandler;", "Lcom/braze/IBrazeDeeplinkHandler;", "<init>", "()V", "gotoNewsFeed", "", "context", "Landroid/content/Context;", "newsfeedAction", "Lcom/braze/ui/actions/NewsfeedAction;", "gotoUri", "uriAction", "Lcom/braze/ui/actions/UriAction;", "getIntentFlags", "", "intentFlagPurpose", "Lcom/braze/IBrazeDeeplinkHandler$IntentFlagPurpose;", "createUriActionFromUrlString", "url", "", "extras", "Landroid/os/Bundle;", "openInWebView", "", AppsFlyerProperties.CHANNEL, "Lcom/braze/enums/Channel;", "createUriActionFromUri", "uri", "Landroid/net/Uri;", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class BrazeDeeplinkHandler implements IBrazeDeeplinkHandler {

    @Nullable
    private static volatile IBrazeDeeplinkHandler customHandler;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final IBrazeDeeplinkHandler defaultHandler = new BrazeDeeplinkHandler();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/braze/ui/BrazeDeeplinkHandler$Companion;", "", "<init>", "()V", "Lcom/braze/IBrazeDeeplinkHandler;", "getInstance", "()Lcom/braze/IBrazeDeeplinkHandler;", "defaultHandler", "Lcom/braze/IBrazeDeeplinkHandler;", "customHandler", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final IBrazeDeeplinkHandler getInstance() {
            IBrazeDeeplinkHandler iBrazeDeeplinkHandler = BrazeDeeplinkHandler.customHandler;
            return iBrazeDeeplinkHandler == null ? BrazeDeeplinkHandler.defaultHandler : iBrazeDeeplinkHandler;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IBrazeDeeplinkHandler.IntentFlagPurpose.values().length];
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_ACTION_WITH_DEEPLINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_PUSH_STORY_PAGE_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_ACTION_VIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_UTILS_GET_MAIN_ACTIVITY_INTENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_GET_ROOT_INTENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createUriActionFromUrlString$lambda$0() {
        return "createUriActionFromUrlString url was null. Returning null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createUriActionFromUrlString$lambda$1() {
        return "createUriActionFromUrlString failed. Returning null.";
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    @NotNull
    public UriAction createUriActionFromUri(@NotNull Uri uri, @Nullable Bundle extras, boolean openInWebView, @NotNull Channel channel) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(channel, "channel");
        return new UriAction(uri, extras, openInWebView, channel);
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    @Nullable
    public UriAction createUriActionFromUrlString(@NotNull String url, @Nullable Bundle extras, boolean openInWebView, @NotNull Channel channel) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(channel, "channel");
        try {
            if (StringsKt.isBlank(url)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) null, false, new Function0() { // from class: v4.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String createUriActionFromUrlString$lambda$0;
                        createUriActionFromUrlString$lambda$0 = BrazeDeeplinkHandler.createUriActionFromUrlString$lambda$0();
                        return createUriActionFromUrlString$lambda$0;
                    }
                }, 6, (Object) null);
                return null;
            }
            Uri parse = Uri.parse(url);
            Intrinsics.checkNotNull(parse);
            return createUriActionFromUri(parse, extras, openInWebView, channel);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: v4.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String createUriActionFromUrlString$lambda$1;
                    createUriActionFromUrlString$lambda$1 = BrazeDeeplinkHandler.createUriActionFromUrlString$lambda$1();
                    return createUriActionFromUrlString$lambda$1;
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public int getIntentFlags(@NotNull IBrazeDeeplinkHandler.IntentFlagPurpose intentFlagPurpose) {
        Intrinsics.checkNotNullParameter(intentFlagPurpose, "intentFlagPurpose");
        switch (WhenMappings.$EnumSwitchMapping$0[intentFlagPurpose.ordinal()]) {
            case 1:
            case 2:
                return 1073741824;
            case 3:
            case 4:
            case 5:
                return 872415232;
            case 6:
            case 7:
                return 268435456;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public void gotoNewsFeed(@NotNull Context context, @NotNull NewsfeedAction newsfeedAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(newsfeedAction, "newsfeedAction");
        newsfeedAction.execute(context);
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public void gotoUri(@NotNull Context context, @NotNull UriAction uriAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uriAction, "uriAction");
        uriAction.execute(context);
    }
}
