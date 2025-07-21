package com.braze.brazeplugin;

import android.app.Application;
import android.content.Context;
import com.braze.Braze;
import com.braze.BrazeActivityLifecycleCallbackListener;
import com.braze.brazeplugin.IntegrationInitializer;
import com.braze.events.BannersUpdatedEvent;
import com.braze.events.BrazePushEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.InAppMessageOperation;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageManagerListener;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001#B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001cR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001c¨\u0006$"}, d2 = {"Lcom/braze/brazeplugin/IntegrationInitializer;", "", "<init>", "()V", "Landroid/content/Context;", "ctx", "", "subscribeToContentCardsUpdatedEvent", "(Landroid/content/Context;)V", "subscribeToBannersUpdatedEvent", "subscribeToPushNotificationEvents", "subscribeToFeatureFlagsUpdatedEvent", "Landroid/app/Application;", "application", "Lcom/braze/brazeplugin/FlutterConfiguration;", "config", "initializePlugin$braze_plugin_release", "(Landroid/app/Application;Lcom/braze/brazeplugin/FlutterConfiguration;)V", "initializePlugin", "", "isUninitialized", "Z", "()Z", "setUninitialized", "(Z)V", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/ContentCardsUpdatedEvent;", "contentCardsUpdatedSubscriber", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/BannersUpdatedEvent;", "bannersUpdatedSubscriber", "Lcom/braze/events/FeatureFlagsUpdatedEvent;", "featureFlagsUpdatedSubscriber", "Lcom/braze/events/BrazePushEvent;", "pushNotificationsUpdatedSubscriber", "BrazeInAppMessageManagerListener", "braze_plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class IntegrationInitializer {

    @Nullable
    private static IEventSubscriber<BannersUpdatedEvent> bannersUpdatedSubscriber;

    @Nullable
    private static IEventSubscriber<ContentCardsUpdatedEvent> contentCardsUpdatedSubscriber;

    @Nullable
    private static IEventSubscriber<FeatureFlagsUpdatedEvent> featureFlagsUpdatedSubscriber;

    @Nullable
    private static IEventSubscriber<BrazePushEvent> pushNotificationsUpdatedSubscriber;

    @NotNull
    public static final IntegrationInitializer INSTANCE = new IntegrationInitializer();
    private static boolean isUninitialized = true;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/braze/brazeplugin/IntegrationInitializer$BrazeInAppMessageManagerListener;", "Lcom/braze/ui/inappmessage/listeners/DefaultInAppMessageManagerListener;", "Lcom/braze/ui/inappmessage/InAppMessageOperation;", "defaultInAppMessageOperation", "<init>", "(Lcom/braze/ui/inappmessage/InAppMessageOperation;)V", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "beforeInAppMessageDisplayed", "(Lcom/braze/models/inappmessage/IInAppMessage;)Lcom/braze/ui/inappmessage/InAppMessageOperation;", "Lcom/braze/ui/inappmessage/InAppMessageOperation;", "getDefaultInAppMessageOperation", "()Lcom/braze/ui/inappmessage/InAppMessageOperation;", "braze_plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class BrazeInAppMessageManagerListener extends DefaultInAppMessageManagerListener {

        @NotNull
        private final InAppMessageOperation defaultInAppMessageOperation;

        public BrazeInAppMessageManagerListener(@NotNull InAppMessageOperation defaultInAppMessageOperation) {
            Intrinsics.checkNotNullParameter(defaultInAppMessageOperation, "defaultInAppMessageOperation");
            this.defaultInAppMessageOperation = defaultInAppMessageOperation;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String beforeInAppMessageDisplayed$lambda$0(BrazeInAppMessageManagerListener this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            return "Returning " + this$0.defaultInAppMessageOperation + " in Flutter automatic integration IInAppMessageManagerListener#beforeInAppMessageDisplayed()";
        }

        @Override // com.braze.ui.inappmessage.listeners.DefaultInAppMessageManagerListener, com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener
        @NotNull
        public InAppMessageOperation beforeInAppMessageDisplayed(@NotNull IInAppMessage inAppMessage) {
            Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
            super.beforeInAppMessageDisplayed(inAppMessage);
            BrazePlugin.INSTANCE.processInAppMessage(inAppMessage);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.brazeplugin.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String beforeInAppMessageDisplayed$lambda$0;
                    beforeInAppMessageDisplayed$lambda$0 = IntegrationInitializer.BrazeInAppMessageManagerListener.beforeInAppMessageDisplayed$lambda$0(IntegrationInitializer.BrazeInAppMessageManagerListener.this);
                    return beforeInAppMessageDisplayed$lambda$0;
                }
            }, 7, (Object) null);
            return this.defaultInAppMessageOperation;
        }
    }

    private IntegrationInitializer() {
    }

    private final void subscribeToBannersUpdatedEvent(Context ctx) {
        Braze.Companion companion = Braze.INSTANCE;
        companion.getInstance(ctx).removeSingleSubscription(bannersUpdatedSubscriber, BannersUpdatedEvent.class);
        IEventSubscriber<BannersUpdatedEvent> iEventSubscriber = new IEventSubscriber() { // from class: P3.A0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                IntegrationInitializer.subscribeToBannersUpdatedEvent$lambda$2((BannersUpdatedEvent) obj);
            }
        };
        bannersUpdatedSubscriber = iEventSubscriber;
        companion.getInstance(ctx).subscribeToBannersUpdates(iEventSubscriber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToBannersUpdatedEvent$lambda$2(BannersUpdatedEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazePlugin.INSTANCE.processBanners(it.getBanners());
    }

    private final void subscribeToContentCardsUpdatedEvent(Context ctx) {
        Braze.Companion companion = Braze.INSTANCE;
        companion.getInstance(ctx).removeSingleSubscription(contentCardsUpdatedSubscriber, ContentCardsUpdatedEvent.class);
        IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber = new IEventSubscriber() { // from class: P3.y0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                IntegrationInitializer.subscribeToContentCardsUpdatedEvent$lambda$0((ContentCardsUpdatedEvent) obj);
            }
        };
        contentCardsUpdatedSubscriber = iEventSubscriber;
        companion.getInstance(ctx).subscribeToContentCardsUpdates(iEventSubscriber);
        companion.getInstance(ctx).requestContentCardsRefreshFromCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToContentCardsUpdatedEvent$lambda$0(ContentCardsUpdatedEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazePlugin.INSTANCE.processContentCards(it.getAllCards());
    }

    private final void subscribeToFeatureFlagsUpdatedEvent(Context ctx) {
        Braze.Companion companion = Braze.INSTANCE;
        companion.getInstance(ctx).removeSingleSubscription(featureFlagsUpdatedSubscriber, FeatureFlagsUpdatedEvent.class);
        IEventSubscriber<FeatureFlagsUpdatedEvent> iEventSubscriber = new IEventSubscriber() { // from class: P3.z0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                IntegrationInitializer.subscribeToFeatureFlagsUpdatedEvent$lambda$6((FeatureFlagsUpdatedEvent) obj);
            }
        };
        featureFlagsUpdatedSubscriber = iEventSubscriber;
        companion.getInstance(ctx).subscribeToFeatureFlagsUpdates(iEventSubscriber);
        companion.getInstance(ctx).refreshFeatureFlags();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToFeatureFlagsUpdatedEvent$lambda$6(FeatureFlagsUpdatedEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazePlugin.INSTANCE.processFeatureFlags(it.getFeatureFlags());
    }

    private final void subscribeToPushNotificationEvents(Context ctx) {
        Braze.Companion companion = Braze.INSTANCE;
        companion.getInstance(ctx).removeSingleSubscription(pushNotificationsUpdatedSubscriber, BrazePushEvent.class);
        IEventSubscriber<BrazePushEvent> iEventSubscriber = new IEventSubscriber() { // from class: P3.x0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                IntegrationInitializer.subscribeToPushNotificationEvents$lambda$4((BrazePushEvent) obj);
            }
        };
        pushNotificationsUpdatedSubscriber = iEventSubscriber;
        companion.getInstance(ctx).subscribeToPushNotificationEvents(iEventSubscriber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToPushNotificationEvents$lambda$4(BrazePushEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazePlugin.INSTANCE.processPushNotificationEvent(it);
    }

    public final void initializePlugin$braze_plugin_release(@NotNull Application application, @NotNull FlutterConfiguration config) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(config, "config");
        application.registerActivityLifecycleCallbacks(new BrazeActivityLifecycleCallbackListener(false, false, null, null, 15, null));
        Context applicationContext = application.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext);
        subscribeToContentCardsUpdatedEvent(applicationContext);
        subscribeToBannersUpdatedEvent(applicationContext);
        subscribeToFeatureFlagsUpdatedEvent(applicationContext);
        subscribeToPushNotificationEvents(applicationContext);
        BrazeInAppMessageManager.INSTANCE.getInstance().setCustomInAppMessageManagerListener(new BrazeInAppMessageManagerListener(config.automaticIntegrationInAppMessageOperation()));
        isUninitialized = false;
    }

    public final boolean isUninitialized() {
        return isUninitialized;
    }
}
