package com.braze.ui.inappmessage.listeners;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.enums.Channel;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.actions.NewsfeedAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/DefaultInAppMessageWebViewClientListener;", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "<init>", "()V", "inAppMessageManager", "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "getInAppMessageManager", "()Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "onCloseAction", "", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "url", "", "queryBundle", "Landroid/os/Bundle;", "onNewsfeedAction", "onCustomEventAction", "onOtherUrlAction", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class DefaultInAppMessageWebViewClientListener implements IInAppMessageWebViewClientListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\f"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/DefaultInAppMessageWebViewClientListener$Companion;", "", "<init>", "()V", "parseUseWebViewFromQueryBundle", "", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "queryBundle", "Landroid/os/Bundle;", "logHtmlInAppMessageClick", "", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void logHtmlInAppMessageClick(@NotNull IInAppMessage inAppMessage, @NotNull Bundle queryBundle) {
            Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
            Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
            if (!queryBundle.containsKey("abButtonId")) {
                if (inAppMessage.getMessageType() == MessageType.HTML_FULL) {
                    inAppMessage.logClick();
                }
            } else {
                IInAppMessageHtml iInAppMessageHtml = (IInAppMessageHtml) inAppMessage;
                String string = queryBundle.getString("abButtonId");
                if (string != null) {
                    iInAppMessageHtml.logButtonClick(string);
                }
            }
        }

        @JvmStatic
        public final boolean parseUseWebViewFromQueryBundle(@NotNull IInAppMessage inAppMessage, @NotNull Bundle queryBundle) {
            boolean z6;
            boolean z7;
            boolean z8;
            Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
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
            return z7 ? (z6 || z8) ? false : true : inAppMessage.getOpenUriInWebView();
        }

        private Companion() {
        }
    }

    private final BrazeInAppMessageManager getInAppMessageManager() {
        return BrazeInAppMessageManager.INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCloseAction$lambda$0() {
        return "IInAppMessageWebViewClientListener.onCloseAction called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCloseAction$lambda$1() {
        return "IInAppMessageWebViewClientListener.onCloseAction finished.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCustomEventAction$lambda$5() {
        return "IInAppMessageWebViewClientListener.onCustomEventAction called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCustomEventAction$lambda$6() {
        return "Can't perform custom event action because the activity is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onNewsfeedAction$lambda$2() {
        return "IInAppMessageWebViewClientListener.onNewsfeedAction called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onNewsfeedAction$lambda$3() {
        return "Can't perform news feed action because the cached activity is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$10(String str) {
        return "HTML message action listener handled url in onOtherUrlAction. Doing nothing further. Url: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$11(String str) {
        return "UriAction is null. Not passing any URI to BrazeDeeplinkHandler. Url: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$12(Uri uri, String str) {
        return "Not passing local uri to BrazeDeeplinkHandler. Got local uri: " + uri + " for url: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$8() {
        return "IInAppMessageWebViewClientListener.onOtherUrlAction called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$9(String str) {
        return "Can't perform other url action because the cached activity is null. Url: " + str;
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onCloseAction(@NotNull IInAppMessage inAppMessage, @NotNull String url, @NotNull Bundle queryBundle) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: K4.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onCloseAction$lambda$0;
                onCloseAction$lambda$0 = DefaultInAppMessageWebViewClientListener.onCloseAction$lambda$0();
                return onCloseAction$lambda$0;
            }
        }, 7, (Object) null);
        INSTANCE.logHtmlInAppMessageClick(inAppMessage, queryBundle);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(true);
        getInAppMessageManager().getHtmlInAppMessageActionListener().onCloseClicked(inAppMessage, url, queryBundle);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: K4.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onCloseAction$lambda$1;
                onCloseAction$lambda$1 = DefaultInAppMessageWebViewClientListener.onCloseAction$lambda$1();
                return onCloseAction$lambda$1;
            }
        }, 7, (Object) null);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onCustomEventAction(@NotNull IInAppMessage inAppMessage, @NotNull String url, @NotNull Bundle queryBundle) {
        BrazeWebViewClient.Companion companion;
        String parseCustomEventNameFromQueryBundle;
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: K4.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onCustomEventAction$lambda$5;
                onCustomEventAction$lambda$5 = DefaultInAppMessageWebViewClientListener.onCustomEventAction$lambda$5();
                return onCustomEventAction$lambda$5;
            }
        }, 7, (Object) null);
        if (getInAppMessageManager().getMActivity() == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: K4.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onCustomEventAction$lambda$6;
                    onCustomEventAction$lambda$6 = DefaultInAppMessageWebViewClientListener.onCustomEventAction$lambda$6();
                    return onCustomEventAction$lambda$6;
                }
            }, 6, (Object) null);
            return;
        }
        if (getInAppMessageManager().getHtmlInAppMessageActionListener().onCustomEventFired(inAppMessage, url, queryBundle) || (parseCustomEventNameFromQueryBundle = (companion = BrazeWebViewClient.INSTANCE).parseCustomEventNameFromQueryBundle(queryBundle)) == null || StringsKt.isBlank(parseCustomEventNameFromQueryBundle)) {
            return;
        }
        BrazeProperties parsePropertiesFromQueryBundle = companion.parsePropertiesFromQueryBundle(queryBundle);
        Activity mActivity = getInAppMessageManager().getMActivity();
        if (mActivity != null) {
            Braze.INSTANCE.getInstance(mActivity).logCustomEvent(parseCustomEventNameFromQueryBundle, parsePropertiesFromQueryBundle);
        }
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onNewsfeedAction(@NotNull IInAppMessage inAppMessage, @NotNull String url, @NotNull Bundle queryBundle) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: K4.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onNewsfeedAction$lambda$2;
                onNewsfeedAction$lambda$2 = DefaultInAppMessageWebViewClientListener.onNewsfeedAction$lambda$2();
                return onNewsfeedAction$lambda$2;
            }
        }, 7, (Object) null);
        if (getInAppMessageManager().getMActivity() == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: K4.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onNewsfeedAction$lambda$3;
                    onNewsfeedAction$lambda$3 = DefaultInAppMessageWebViewClientListener.onNewsfeedAction$lambda$3();
                    return onNewsfeedAction$lambda$3;
                }
            }, 6, (Object) null);
            return;
        }
        INSTANCE.logHtmlInAppMessageClick(inAppMessage, queryBundle);
        if (getInAppMessageManager().getHtmlInAppMessageActionListener().onNewsfeedClicked(inAppMessage, url, queryBundle)) {
            return;
        }
        inAppMessage.setAnimateOut(false);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
        NewsfeedAction newsfeedAction = new NewsfeedAction(BundleUtils.toBundle(inAppMessage.getExtras()), Channel.INAPP_MESSAGE);
        Activity mActivity = getInAppMessageManager().getMActivity();
        if (mActivity != null) {
            BrazeDeeplinkHandler.INSTANCE.getInstance().gotoNewsFeed(mActivity, newsfeedAction);
        }
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onOtherUrlAction(@NotNull IInAppMessage inAppMessage, @NotNull final String url, @NotNull Bundle queryBundle) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: K4.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onOtherUrlAction$lambda$8;
                onOtherUrlAction$lambda$8 = DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$8();
                return onOtherUrlAction$lambda$8;
            }
        }, 7, (Object) null);
        if (getInAppMessageManager().getMActivity() == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: K4.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onOtherUrlAction$lambda$9;
                    onOtherUrlAction$lambda$9 = DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$9(url);
                    return onOtherUrlAction$lambda$9;
                }
            }, 6, (Object) null);
            return;
        }
        Companion companion = INSTANCE;
        companion.logHtmlInAppMessageClick(inAppMessage, queryBundle);
        if (getInAppMessageManager().getHtmlInAppMessageActionListener().onOtherUrlAction(inAppMessage, url, queryBundle)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: K4.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onOtherUrlAction$lambda$10;
                    onOtherUrlAction$lambda$10 = DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$10(url);
                    return onOtherUrlAction$lambda$10;
                }
            }, 6, (Object) null);
            return;
        }
        boolean parseUseWebViewFromQueryBundle = companion.parseUseWebViewFromQueryBundle(inAppMessage, queryBundle);
        Bundle bundle = BundleUtils.toBundle(inAppMessage.getExtras());
        bundle.putAll(queryBundle);
        BrazeDeeplinkHandler.Companion companion2 = BrazeDeeplinkHandler.INSTANCE;
        UriAction createUriActionFromUrlString = companion2.getInstance().createUriActionFromUrlString(url, bundle, parseUseWebViewFromQueryBundle, Channel.INAPP_MESSAGE);
        if (createUriActionFromUrlString == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: K4.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onOtherUrlAction$lambda$11;
                    onOtherUrlAction$lambda$11 = DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$11(url);
                    return onOtherUrlAction$lambda$11;
                }
            }, 6, (Object) null);
            return;
        }
        final Uri uri = createUriActionFromUrlString.getUri();
        if (BrazeFileUtils.isLocalUri(uri)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: K4.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onOtherUrlAction$lambda$12;
                    onOtherUrlAction$lambda$12 = DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$12(uri, url);
                    return onOtherUrlAction$lambda$12;
                }
            }, 6, (Object) null);
            return;
        }
        inAppMessage.setAnimateOut(false);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
        Activity mActivity = getInAppMessageManager().getMActivity();
        if (mActivity != null) {
            companion2.getInstance().gotoUri(mActivity, createUriActionFromUrlString);
        }
    }
}
