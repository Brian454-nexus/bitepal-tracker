package com.braze;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazePushEventType;
import com.braze.events.InAppMessageEvent;
import com.braze.models.push.BrazeNotificationPayload;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\fJ)\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\fJ\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010\u001bJ%\u0010$\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J%\u0010)\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b+\u0010\fJ\u001d\u0010,\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u000e¢\u0006\u0004\b,\u0010-J\u001d\u0010/\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u000e¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u0002012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b2\u00103J%\u00108\u001a\u00020\b2\u0006\u00104\u001a\u00020\u000e2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/braze/BrazeInternal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "ignoreRateLimit", "", "requestGeofenceRefresh", "(Landroid/content/Context;Z)V", "refreshFeatureFlags", "(Landroid/content/Context;)V", "refreshBanners", "", "serializedCardJson", "userId", "addSerializedContentCardToStorage", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "handleInAppMessageTestPush", "(Landroid/content/Context;Landroid/content/Intent;)V", "applyPendingRuntimeConfiguration", "Lcom/braze/events/InAppMessageEvent;", "inAppMessageEvent", "retryInAppMessage", "(Landroid/content/Context;Lcom/braze/events/InAppMessageEvent;)V", "Lcom/braze/Braze;", "getInstance", "(Landroid/content/Context;)Lcom/braze/Braze;", "reenqueueInAppMessage", "Lcom/braze/enums/BrazePushEventType;", "pushActionType", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "publishBrazePushAction", "(Landroid/content/Context;Lcom/braze/enums/BrazePushEventType;Lcom/braze/models/push/BrazeNotificationPayload;)V", "campaignId", "", "waitTimeMs", "logPushDelivery", "(Landroid/content/Context;Ljava/lang/String;J)V", "performPushDeliveryFlush", "logPushCampaign", "(Landroid/content/Context;Ljava/lang/String;)V", "pushId", "validateAndStorePushId", "(Landroid/content/Context;Ljava/lang/String;)Z", "Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProvider", "(Landroid/content/Context;)Lcom/braze/configuration/BrazeConfigurationProvider;", "placementId", "Landroid/view/View;", "view", "skipImpressionMonitoring", "addBannerViewMonitor", "(Ljava/lang/String;Landroid/view/View;Z)V", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class BrazeInternal {
    public static final BrazeInternal INSTANCE = new BrazeInternal();

    private BrazeInternal() {
    }

    @JvmStatic
    public static final void addSerializedContentCardToStorage(Context context, String serializedCardJson, String userId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serializedCardJson, "serializedCardJson");
        INSTANCE.getInstance(context).addSerializedCardJsonToStorage$android_sdk_base_release(serializedCardJson, userId);
    }

    @JvmStatic
    public static final void applyPendingRuntimeConfiguration(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        INSTANCE.getInstance(context).applyPendingRuntimeConfiguration$android_sdk_base_release();
    }

    private final Braze getInstance(Context context) {
        return Braze.INSTANCE.getInstance(context);
    }

    @JvmStatic
    public static final void handleInAppMessageTestPush(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        INSTANCE.getInstance(context).handleInAppMessageTestPush$android_sdk_base_release(intent);
    }

    @JvmStatic
    public static final void refreshBanners(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        INSTANCE.getInstance(context).handleInternalBannerRefresh$android_sdk_base_release();
    }

    @JvmStatic
    public static final void refreshFeatureFlags(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        INSTANCE.getInstance(context).refreshFeatureFlags();
    }

    @JvmStatic
    public static final void requestGeofenceRefresh(Context context, boolean ignoreRateLimit) {
        Intrinsics.checkNotNullParameter(context, "context");
        INSTANCE.getInstance(context).requestGeofenceRefresh$android_sdk_base_release(ignoreRateLimit);
    }

    @JvmStatic
    public static final void retryInAppMessage(Context context, InAppMessageEvent inAppMessageEvent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessageEvent, "inAppMessageEvent");
        INSTANCE.getInstance(context).retryInAppMessage$android_sdk_base_release(inAppMessageEvent);
    }

    public final void addBannerViewMonitor(String placementId, View view, boolean skipImpressionMonitoring) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(view, "view");
        com.braze.managers.g gVar = com.braze.managers.h.f12409k;
        com.braze.managers.g.a(placementId, view, skipImpressionMonitoring);
    }

    public final BrazeConfigurationProvider getConfigurationProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getInstance(context).getConfigurationProviderSafe$android_sdk_base_release(context);
    }

    public final /* synthetic */ void logPushCampaign(Context context, String campaignId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        getInstance(context).logPushMaxCampaign$android_sdk_base_release(campaignId);
    }

    public final /* synthetic */ void logPushDelivery(Context context, String campaignId, long waitTimeMs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        getInstance(context).logPushDelivery$android_sdk_base_release(campaignId, waitTimeMs);
    }

    public final /* synthetic */ void performPushDeliveryFlush(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        getInstance(context).performPushDeliveryFlush$android_sdk_base_release();
    }

    public final /* synthetic */ void publishBrazePushAction(Context context, BrazePushEventType pushActionType, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pushActionType, "pushActionType");
        Intrinsics.checkNotNullParameter(payload, "payload");
        getInstance(context).publishBrazePushAction$android_sdk_base_release(pushActionType, payload);
    }

    public final void reenqueueInAppMessage(Context context, InAppMessageEvent inAppMessageEvent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessageEvent, "inAppMessageEvent");
        getInstance(context).reenqueueInAppMessage$android_sdk_base_release(inAppMessageEvent);
    }

    public final /* synthetic */ boolean validateAndStorePushId(Context context, String pushId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        return getInstance(context).validateAndStorePushId$android_sdk_base_release(pushId);
    }
}
