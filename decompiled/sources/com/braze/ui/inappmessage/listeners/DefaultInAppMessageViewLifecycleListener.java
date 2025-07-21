package com.braze.ui.inappmessage.listeners;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.Channel;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeFunctionNotImplemented;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.NewsfeedAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.InAppMessageCloser;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener;
import ga.L;
import ga.i;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u0014\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u001a\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u001b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J2\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\tH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006$"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/DefaultInAppMessageViewLifecycleListener;", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "<init>", "()V", "inAppMessageManager", "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "getInAppMessageManager", "()Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "beforeOpened", "", "inAppMessageView", "Landroid/view/View;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "afterOpened", "beforeClosed", "afterClosed", "onClicked", "inAppMessageCloser", "Lcom/braze/ui/inappmessage/InAppMessageCloser;", "onButtonClicked", "messageButton", "Lcom/braze/models/inappmessage/MessageButton;", "inAppMessageImmersive", "Lcom/braze/models/inappmessage/IInAppMessageImmersive;", "onDismissed", "performInAppMessageButtonClicked", "performInAppMessageClicked", "performClickAction", "clickAction", "Lcom/braze/enums/inappmessage/ClickAction;", "clickUri", "Landroid/net/Uri;", "openUriInWebview", "", "startClearHtmlInAppMessageAssetsThread", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class DefaultInAppMessageViewLifecycleListener implements IInAppMessageViewLifecycleListener {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClickAction.values().length];
            try {
                iArr[ClickAction.NEWS_FEED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClickAction.URI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClickAction.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String afterClosed$lambda$3() {
        return "IInAppMessageViewLifecycleListener.afterClosed called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String afterOpened$lambda$1() {
        return "IInAppMessageViewLifecycleListener.afterOpened called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String beforeClosed$lambda$2() {
        return "IInAppMessageViewLifecycleListener.beforeClosed called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String beforeOpened$lambda$0() {
        return "IInAppMessageViewLifecycleListener.beforeOpened called.";
    }

    private final BrazeInAppMessageManager getInAppMessageManager() {
        return BrazeInAppMessageManager.INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onButtonClicked$lambda$7() {
        return "IInAppMessageViewLifecycleListener.onButtonClicked called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onClicked$lambda$4() {
        return "IInAppMessageViewLifecycleListener.onClicked called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onClicked$lambda$5() {
        return "Deprecated onInAppMessageClicked(inAppMessage, inAppMessageCloser) called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onClicked$lambda$6() {
        return "Using non-deprecated onInAppMessageClicked(inAppMessage)";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onDismissed$lambda$8() {
        return "IInAppMessageViewLifecycleListener.onDismissed called.";
    }

    private final void performClickAction(ClickAction clickAction, IInAppMessage inAppMessage, InAppMessageCloser inAppMessageCloser, Uri clickUri, boolean openUriInWebview) {
        Activity mActivity = getInAppMessageManager().getMActivity();
        if (mActivity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: K4.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String performClickAction$lambda$9;
                    performClickAction$lambda$9 = DefaultInAppMessageViewLifecycleListener.performClickAction$lambda$9();
                    return performClickAction$lambda$9;
                }
            }, 6, (Object) null);
            return;
        }
        int i6 = WhenMappings.$EnumSwitchMapping$0[clickAction.ordinal()];
        if (i6 == 1) {
            inAppMessageCloser.close(false);
            BrazeDeeplinkHandler.INSTANCE.getInstance().gotoNewsFeed(mActivity, new NewsfeedAction(BundleUtils.toBundle(inAppMessage.getExtras()), Channel.INAPP_MESSAGE));
            return;
        }
        if (i6 != 2) {
            if (i6 != 3) {
                inAppMessageCloser.close(false);
                return;
            } else {
                inAppMessageCloser.close(inAppMessage.getAnimateOut());
                return;
            }
        }
        inAppMessageCloser.close(false);
        if (clickUri == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: K4.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String performClickAction$lambda$10;
                    performClickAction$lambda$10 = DefaultInAppMessageViewLifecycleListener.performClickAction$lambda$10();
                    return performClickAction$lambda$10;
                }
            }, 7, (Object) null);
            return;
        }
        BrazeDeeplinkHandler.Companion companion = BrazeDeeplinkHandler.INSTANCE;
        UriAction createUriActionFromUri = companion.getInstance().createUriActionFromUri(clickUri, BundleUtils.toBundle(inAppMessage.getExtras()), openUriInWebview, Channel.INAPP_MESSAGE);
        Context mApplicationContext = getInAppMessageManager().getMApplicationContext();
        if (mApplicationContext == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: K4.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String performClickAction$lambda$11;
                    performClickAction$lambda$11 = DefaultInAppMessageViewLifecycleListener.performClickAction$lambda$11();
                    return performClickAction$lambda$11;
                }
            }, 7, (Object) null);
        } else {
            companion.getInstance().gotoUri(mApplicationContext, createUriActionFromUri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performClickAction$lambda$10() {
        return "clickUri is null, not performing click action";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performClickAction$lambda$11() {
        return "appContext is null, not performing click action";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performClickAction$lambda$9() {
        return "Can't perform click action because the cached activity is null.";
    }

    private final void performInAppMessageButtonClicked(MessageButton messageButton, IInAppMessage inAppMessage, InAppMessageCloser inAppMessageCloser) {
        performClickAction(messageButton.getClickAction(), inAppMessage, inAppMessageCloser, messageButton.getUri(), messageButton.getOpenUriInWebview());
    }

    private final void performInAppMessageClicked(IInAppMessage inAppMessage, InAppMessageCloser inAppMessageCloser) {
        performClickAction(inAppMessage.getInternalClickAction(), inAppMessage, inAppMessageCloser, inAppMessage.getInternalUri(), inAppMessage.getOpenUriInWebView());
    }

    private final void startClearHtmlInAppMessageAssetsThread() {
        i.d(BrazeCoroutineScope.INSTANCE, (CoroutineContext) null, (L) null, new DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1(null), 3, (Object) null);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void afterClosed(@NotNull IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: K4.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String afterClosed$lambda$3;
                afterClosed$lambda$3 = DefaultInAppMessageViewLifecycleListener.afterClosed$lambda$3();
                return afterClosed$lambda$3;
            }
        }, 7, (Object) null);
        getInAppMessageManager().resetAfterInAppMessageClose();
        if (inAppMessage instanceof IInAppMessageHtml) {
            startClearHtmlInAppMessageAssetsThread();
        }
        inAppMessage.onAfterClosed();
        getInAppMessageManager().getInAppMessageManagerListener().afterInAppMessageViewClosed(inAppMessage);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void afterOpened(@NotNull View inAppMessageView, @NotNull IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: K4.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String afterOpened$lambda$1;
                afterOpened$lambda$1 = DefaultInAppMessageViewLifecycleListener.afterOpened$lambda$1();
                return afterOpened$lambda$1;
            }
        }, 7, (Object) null);
        getInAppMessageManager().getInAppMessageManagerListener().afterInAppMessageViewOpened(inAppMessageView, inAppMessage);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void beforeClosed(@NotNull View inAppMessageView, @NotNull IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        getInAppMessageManager().getInAppMessageManagerListener().beforeInAppMessageViewClosed(inAppMessageView, inAppMessage);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: K4.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String beforeClosed$lambda$2;
                beforeClosed$lambda$2 = DefaultInAppMessageViewLifecycleListener.beforeClosed$lambda$2();
                return beforeClosed$lambda$2;
            }
        }, 7, (Object) null);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void beforeOpened(@NotNull View inAppMessageView, @NotNull IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        getInAppMessageManager().getInAppMessageManagerListener().beforeInAppMessageViewOpened(inAppMessageView, inAppMessage);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: K4.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String beforeOpened$lambda$0;
                beforeOpened$lambda$0 = DefaultInAppMessageViewLifecycleListener.beforeOpened$lambda$0();
                return beforeOpened$lambda$0;
            }
        }, 7, (Object) null);
        inAppMessage.logImpression();
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void onButtonClicked(@NotNull InAppMessageCloser inAppMessageCloser, @NotNull MessageButton messageButton, @NotNull IInAppMessageImmersive inAppMessageImmersive) {
        boolean onInAppMessageButtonClicked;
        Intrinsics.checkNotNullParameter(inAppMessageCloser, "inAppMessageCloser");
        Intrinsics.checkNotNullParameter(messageButton, "messageButton");
        Intrinsics.checkNotNullParameter(inAppMessageImmersive, "inAppMessageImmersive");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: K4.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onButtonClicked$lambda$7;
                onButtonClicked$lambda$7 = DefaultInAppMessageViewLifecycleListener.onButtonClicked$lambda$7();
                return onButtonClicked$lambda$7;
            }
        }, 7, (Object) null);
        inAppMessageImmersive.logButtonClick(messageButton);
        try {
            onInAppMessageButtonClicked = getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageButtonClicked(inAppMessageImmersive, messageButton, inAppMessageCloser);
        } catch (BrazeFunctionNotImplemented unused) {
            onInAppMessageButtonClicked = getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageButtonClicked(inAppMessageImmersive, messageButton);
        }
        if (onInAppMessageButtonClicked) {
            return;
        }
        performInAppMessageButtonClicked(messageButton, inAppMessageImmersive, inAppMessageCloser);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void onClicked(@NotNull InAppMessageCloser inAppMessageCloser, @NotNull View inAppMessageView, @NotNull IInAppMessage inAppMessage) {
        boolean onInAppMessageClicked;
        Intrinsics.checkNotNullParameter(inAppMessageCloser, "inAppMessageCloser");
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: K4.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onClicked$lambda$4;
                onClicked$lambda$4 = DefaultInAppMessageViewLifecycleListener.onClicked$lambda$4();
                return onClicked$lambda$4;
            }
        }, 7, (Object) null);
        inAppMessage.logClick();
        try {
            onInAppMessageClicked = getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageClicked(inAppMessage, inAppMessageCloser);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: K4.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onClicked$lambda$5;
                    onClicked$lambda$5 = DefaultInAppMessageViewLifecycleListener.onClicked$lambda$5();
                    return onClicked$lambda$5;
                }
            }, 7, (Object) null);
        } catch (BrazeFunctionNotImplemented unused) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: K4.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onClicked$lambda$6;
                    onClicked$lambda$6 = DefaultInAppMessageViewLifecycleListener.onClicked$lambda$6();
                    return onClicked$lambda$6;
                }
            }, 7, (Object) null);
            onInAppMessageClicked = getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageClicked(inAppMessage);
        }
        if (onInAppMessageClicked) {
            return;
        }
        performInAppMessageClicked(inAppMessage, inAppMessageCloser);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void onDismissed(@NotNull View inAppMessageView, @NotNull IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: K4.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onDismissed$lambda$8;
                onDismissed$lambda$8 = DefaultInAppMessageViewLifecycleListener.onDismissed$lambda$8();
                return onDismissed$lambda$8;
            }
        }, 7, (Object) null);
        getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageDismissed(inAppMessage);
    }
}
