package com.braze.push;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import ga.L;
import ga.i;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import n0.AbstractC1809a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/braze/push/BrazePushReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class BrazePushReceiver extends BroadcastReceiver {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\"\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J(\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0007J\u001d\u0010#\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001fH\u0001¢\u0006\u0002\b%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/braze/push/BrazePushReceiver$Companion;", "", "<init>", "()V", "MESSAGE_TYPE_KEY", "", "DELETED_MESSAGES_KEY", "NUMBER_OF_MESSAGES_DELETED_KEY", "ADM_RECEIVE_INTENT_ACTION", "ADM_REGISTRATION_INTENT_ACTION", "ADM_ERROR_KEY", "ADM_ERROR_DESCRIPTION_KEY", "ADM_REGISTRATION_ID_KEY", "ADM_UNREGISTERED_KEY", "FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION", "HMS_PUSH_SERVICE_ROUTING_ACTION", "handlePush", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "handleReceivedIntent", "runOnThread", "", "handleAdmRegistrationEventIfEnabled", "appConfigurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "handleAdmRegistrationIntent", "handlePushNotificationPayload", "createPayload", "Lcom/braze/models/push/BrazeNotificationPayload;", "notificationExtras", "Landroid/os/Bundle;", "brazeExtras", "logNotificationMetadata", "payload", "logNotificationMetadata$android_sdk_ui_release", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationEventIfEnabled$lambda$4(Intent intent) {
            return "Received ADM registration. Message: " + intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationEventIfEnabled$lambda$5() {
            return "ADM enabled in braze.xml. Continuing to process ADM registration intent.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationEventIfEnabled$lambda$6() {
            return "ADM not enabled in braze.xml. Ignoring ADM registration intent. Note: you must set com_braze_push_adm_messaging_registration_enabled to true in your braze.xml to enable ADM.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$10() {
            return "The ADM registration intent is missing error information, registration id, and unregistration confirmation. Ignoring.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$7(String str, String str2) {
            return "Error during ADM registration: " + str + " description: " + str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$8(String str) {
            return "Registering for ADM messages with registrationId: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$9(String str) {
            return "The device was un-registered from ADM: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handlePush(Context context, final Intent intent) {
            Context applicationContext = context.getApplicationContext();
            final String action = intent.getAction();
            try {
                handlePush$performWork(action, applicationContext, intent, context);
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: i4.o1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePush$lambda$3;
                        handlePush$lambda$3 = BrazePushReceiver.Companion.handlePush$lambda$3(action, intent);
                        return handlePush$lambda$3;
                    }
                }, 4, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$lambda$3(String str, Intent intent) {
            return "Caught exception while performing the push notification handling work. Action: " + str + " Intent: " + intent;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        
            if (r8.equals("hms_push_service_routing_action") == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x008c, code lost:
        
            r1.handlePushNotificationPayload(r9, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x008f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        
            if (r8.equals("com.amazon.device.messaging.intent.RECEIVE") == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
        
            if (r8.equals("com.braze.action.STORY_TRAVERSE") == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
        
            if (r8.equals("firebase_messaging_service_routing_action") == false) goto L56;
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0028. Please report as an issue. */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static final void handlePush$performWork(java.lang.String r8, android.content.Context r9, final android.content.Intent r10, android.content.Context r11) {
            /*
                com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE
                com.braze.push.BrazePushReceiver$Companion r1 = com.braze.push.BrazePushReceiver.INSTANCE
                com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.f12982I
                i4.z1 r5 = new i4.z1
                r5.<init>()
                r6 = 6
                r7 = 0
                r3 = 0
                r4 = 0
                com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r8 == 0) goto Lb9
                int r2 = r8.length()
                if (r2 != 0) goto L1c
                goto Lb9
            L1c:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
                com.braze.BrazeInternal.applyPendingRuntimeConfiguration(r9)
                if (r8 == 0) goto Laa
                int r2 = r8.hashCode()
                switch(r2) {
                    case -2147185193: goto L9d;
                    case -1799205286: goto L90;
                    case -1584985748: goto L83;
                    case -1249868226: goto L76;
                    case -743092218: goto L64;
                    case -711830027: goto L5b;
                    case -559929808: goto L4e;
                    case 34673601: goto L41;
                    case 1060266838: goto L37;
                    case 1740454061: goto L2d;
                    default: goto L2b;
                }
            L2b:
                goto Laa
            L2d:
                java.lang.String r11 = "hms_push_service_routing_action"
                boolean r8 = r8.equals(r11)
                if (r8 != 0) goto L8c
                goto Laa
            L37:
                java.lang.String r11 = "com.amazon.device.messaging.intent.RECEIVE"
                boolean r8 = r8.equals(r11)
                if (r8 != 0) goto L8c
                goto Laa
            L41:
                java.lang.String r9 = "com.braze.action.BRAZE_STORY_CLICKED"
                boolean r8 = r8.equals(r9)
                if (r8 != 0) goto L4a
                goto Laa
            L4a:
                com.braze.push.BrazeNotificationUtils.handlePushStoryPageClicked(r11, r10)
                return
            L4e:
                java.lang.String r11 = "com.braze.action.BRAZE_PUSH_DELETED"
                boolean r8 = r8.equals(r11)
                if (r8 != 0) goto L57
                goto Laa
            L57:
                com.braze.push.BrazeNotificationUtils.handleNotificationDeleted(r9, r10)
                return
            L5b:
                java.lang.String r11 = "com.braze.action.STORY_TRAVERSE"
                boolean r8 = r8.equals(r11)
                if (r8 != 0) goto L8c
                goto Laa
            L64:
                java.lang.String r11 = "com.amazon.device.messaging.intent.REGISTRATION"
                boolean r8 = r8.equals(r11)
                if (r8 != 0) goto L6d
                goto Laa
            L6d:
                com.braze.configuration.BrazeConfigurationProvider r8 = new com.braze.configuration.BrazeConfigurationProvider
                r8.<init>(r9)
                r1.handleAdmRegistrationEventIfEnabled(r8, r9, r10)
                return
            L76:
                java.lang.String r9 = "com.braze.action.BRAZE_PUSH_CLICKED"
                boolean r8 = r8.equals(r9)
                if (r8 != 0) goto L7f
                goto Laa
            L7f:
                com.braze.push.BrazeNotificationUtils.handleNotificationOpened(r11, r10)
                return
            L83:
                java.lang.String r11 = "firebase_messaging_service_routing_action"
                boolean r8 = r8.equals(r11)
                if (r8 != 0) goto L8c
                goto Laa
            L8c:
                r1.handlePushNotificationPayload(r9, r10)
                return
            L90:
                java.lang.String r9 = "com.braze.action.BRAZE_ACTION_CLICKED"
                boolean r8 = r8.equals(r9)
                if (r8 != 0) goto L99
                goto Laa
            L99:
                com.braze.push.BrazeNotificationActionUtils.handleNotificationActionClicked(r11, r10)
                return
            L9d:
                java.lang.String r11 = "com.braze.action.CANCEL_NOTIFICATION"
                boolean r8 = r8.equals(r11)
                if (r8 != 0) goto La6
                goto Laa
            La6:
                com.braze.push.BrazeNotificationUtils.handleCancelNotificationAction(r9, r10)
                return
            Laa:
                com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.f12984W
                i4.G1 r5 = new i4.G1
                r5.<init>()
                r6 = 6
                r7 = 0
                r3 = 0
                r4 = 0
                com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)
                return
            Lb9:
                com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.f12984W
                i4.F1 r5 = new i4.F1
                r5.<init>()
                r6 = 6
                r7 = 0
                r3 = 0
                r4 = 0
                com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braze.push.BrazePushReceiver.Companion.handlePush$performWork(java.lang.String, android.content.Context, android.content.Intent, android.content.Context):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$performWork$lambda$0(Intent intent) {
            return "Received broadcast message. Message: " + intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$performWork$lambda$1(Intent intent) {
            return "Push action is null. Not handling intent: " + intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$performWork$lambda$2() {
            return "Received a message not sent from Braze. Ignoring the message.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$11() {
            return "Not handling non-Braze push message.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$12(int i6) {
            return "Firebase messaging 'total_deleted' reports " + i6 + " messages.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$13(Bundle bundle) {
            return "Push message payload received: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$14() {
            return "Push message is uninstall tracking push. Doing nothing. Not forwarding this notification to broadcast receivers.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$16$lambda$15(String str) {
            return "Push with identifier '" + str + "' has already been seen. Not displaying or forwarding push.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$17() {
            return "Bypassing push display due to test in-app message presence and eager test in-app message display configuration setting.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$18() {
            return "Received visible push notification";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$19() {
            return "Push stories not supported on Amazon devices.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$20() {
            return "Received the initial Push Story notification.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$21(BrazeNotificationPayload brazeNotificationPayload) {
            return "Creating notification with payload:\n" + brazeNotificationPayload;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$22() {
            return "Notification created by notification factory was null. Not displaying notification.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$23(NotificationManagerCompat notificationManagerCompat) {
            return "Value of notificationManager.areNotificationsEnabled() = " + notificationManagerCompat.areNotificationsEnabled();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$24() {
            return "POST_NOTIFICATIONS permission has not been granted. Not posting notification.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$26() {
            return "Received silent push notification";
        }

        public static /* synthetic */ void handleReceivedIntent$default(Companion companion, Context context, Intent intent, boolean z6, int i6, Object obj) {
            if ((i6 & 4) != 0) {
                z6 = true;
            }
            companion.handleReceivedIntent(context, intent, z6);
        }

        @JvmStatic
        @NotNull
        public final BrazeNotificationPayload createPayload(@NotNull Context context, @NotNull BrazeConfigurationProvider appConfigurationProvider, @NotNull Bundle notificationExtras, @NotNull Bundle brazeExtras) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Intrinsics.checkNotNullParameter(brazeExtras, "brazeExtras");
            return Constants.isAmazonDevice() ? new BrazeNotificationPayload(notificationExtras, BrazeNotificationPayload.INSTANCE.getAttachedBrazeExtras(notificationExtras), context, appConfigurationProvider) : new BrazeNotificationPayload(notificationExtras, brazeExtras, context, appConfigurationProvider);
        }

        @JvmStatic
        public final boolean handleAdmRegistrationEventIfEnabled(@NotNull BrazeConfigurationProvider appConfigurationProvider, @NotNull Context context, @NotNull final Intent intent) {
            Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: i4.x1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleAdmRegistrationEventIfEnabled$lambda$4;
                    handleAdmRegistrationEventIfEnabled$lambda$4 = BrazePushReceiver.Companion.handleAdmRegistrationEventIfEnabled$lambda$4(intent);
                    return handleAdmRegistrationEventIfEnabled$lambda$4;
                }
            }, 6, (Object) null);
            if (!Constants.isAmazonDevice() || !appConfigurationProvider.isAdmMessagingRegistrationEnabled()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: i4.A1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleAdmRegistrationEventIfEnabled$lambda$6;
                        handleAdmRegistrationEventIfEnabled$lambda$6 = BrazePushReceiver.Companion.handleAdmRegistrationEventIfEnabled$lambda$6();
                        return handleAdmRegistrationEventIfEnabled$lambda$6;
                    }
                }, 6, (Object) null);
                return false;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.y1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleAdmRegistrationEventIfEnabled$lambda$5;
                    handleAdmRegistrationEventIfEnabled$lambda$5 = BrazePushReceiver.Companion.handleAdmRegistrationEventIfEnabled$lambda$5();
                    return handleAdmRegistrationEventIfEnabled$lambda$5;
                }
            }, 7, (Object) null);
            handleAdmRegistrationIntent(context, intent);
            return true;
        }

        @JvmStatic
        public final boolean handleAdmRegistrationIntent(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            final String stringExtra = intent.getStringExtra("error");
            final String stringExtra2 = intent.getStringExtra("error_description");
            final String stringExtra3 = intent.getStringExtra("registration_id");
            final String stringExtra4 = intent.getStringExtra("unregistered");
            if (stringExtra != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: i4.B1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleAdmRegistrationIntent$lambda$7;
                        handleAdmRegistrationIntent$lambda$7 = BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$7(stringExtra, stringExtra2);
                        return handleAdmRegistrationIntent$lambda$7;
                    }
                }, 6, (Object) null);
                return true;
            }
            if (stringExtra3 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: i4.C1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleAdmRegistrationIntent$lambda$8;
                        handleAdmRegistrationIntent$lambda$8 = BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$8(stringExtra3);
                        return handleAdmRegistrationIntent$lambda$8;
                    }
                }, 6, (Object) null);
                Braze.INSTANCE.getInstance(context).setRegisteredPushToken(stringExtra3);
                return true;
            }
            if (stringExtra4 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: i4.D1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleAdmRegistrationIntent$lambda$9;
                        handleAdmRegistrationIntent$lambda$9 = BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$9(stringExtra4);
                        return handleAdmRegistrationIntent$lambda$9;
                    }
                }, 6, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: i4.E1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleAdmRegistrationIntent$lambda$10;
                    handleAdmRegistrationIntent$lambda$10 = BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$10();
                    return handleAdmRegistrationIntent$lambda$10;
                }
            }, 6, (Object) null);
            return false;
        }

        @JvmStatic
        public final boolean handlePushNotificationPayload(@NotNull Context context, @NotNull Intent intent) {
            Companion companion;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (!BrazeNotificationUtils.isBrazePushMessage(intent)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.H1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$11;
                        handlePushNotificationPayload$lambda$11 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$11();
                        return handlePushNotificationPayload$lambda$11;
                    }
                }, 7, (Object) null);
                return false;
            }
            if (Intrinsics.areEqual("deleted_messages", intent.getStringExtra("message_type"))) {
                final int intExtra = intent.getIntExtra("total_deleted", -1);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: i4.M1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$12;
                        handlePushNotificationPayload$lambda$12 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$12(intExtra);
                        return handlePushNotificationPayload$lambda$12;
                    }
                }, 6, (Object) null);
                return false;
            }
            final Bundle extras = intent.getExtras();
            if (extras == null) {
                return false;
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f12982I;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: i4.p1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handlePushNotificationPayload$lambda$13;
                    handlePushNotificationPayload$lambda$13 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$13(extras);
                    return handlePushNotificationPayload$lambda$13;
                }
            }, 6, (Object) null);
            Bundle attachedBrazeExtras = BrazeNotificationPayload.INSTANCE.getAttachedBrazeExtras(extras);
            extras.putBundle("extra", attachedBrazeExtras);
            if (!extras.containsKey("braze_push_received_timestamp")) {
                extras.putLong("braze_push_received_timestamp", DateTimeUtils.nowInMilliseconds());
            }
            BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
            BrazeConfigurationProvider configurationProvider = brazeInternal.getConfigurationProvider(context);
            final BrazeNotificationPayload createPayload = createPayload(context, configurationProvider, extras, attachedBrazeExtras);
            if (createPayload.getIsUninstallTrackingPush()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: i4.q1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$14;
                        handlePushNotificationPayload$lambda$14 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$14();
                        return handlePushNotificationPayload$lambda$14;
                    }
                }, 6, (Object) null);
                return false;
            }
            final String pushUniqueId = createPayload.getPushUniqueId();
            if (pushUniqueId != null && !brazeInternal.validateAndStorePushId(context, pushUniqueId)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) BrazePushReceiver.INSTANCE, priority, (Throwable) null, false, new Function0() { // from class: i4.r1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$16$lambda$15;
                        handlePushNotificationPayload$lambda$16$lambda$15 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$16$lambda$15(pushUniqueId);
                        return handlePushNotificationPayload$lambda$16$lambda$15;
                    }
                }, 6, (Object) null);
                return false;
            }
            BrazeNotificationUtils.handleContentCardsSerializedCardIfPresent(createPayload);
            BrazeNotificationUtils.requestGeofenceRefreshIfAppropriate(createPayload);
            BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate(createPayload);
            BrazeNotificationUtils.refreshBannersIfAppropriate(createPayload);
            if (createPayload.getShouldFetchTestTriggers() && configurationProvider.isInAppMessageTestPushEagerDisplayEnabled() && BrazeInAppMessageManager.INSTANCE.getInstance().getMActivity() != null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.s1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$17;
                        handlePushNotificationPayload$lambda$17 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$17();
                        return handlePushNotificationPayload$lambda$17;
                    }
                }, 7, (Object) null);
                BrazeInternal.handleInAppMessageTestPush(context, intent);
                return false;
            }
            if (!BrazeNotificationUtils.isNotificationMessage(intent)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.L1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$26;
                        handlePushNotificationPayload$lambda$26 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$26();
                        return handlePushNotificationPayload$lambda$26;
                    }
                }, 7, (Object) null);
                BrazeNotificationUtils.sendPushMessageReceivedBroadcast(context, extras, createPayload);
                return false;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.t1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handlePushNotificationPayload$lambda$18;
                    handlePushNotificationPayload$lambda$18 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$18();
                    return handlePushNotificationPayload$lambda$18;
                }
            }, 7, (Object) null);
            int notificationId = BrazeNotificationUtils.getNotificationId(createPayload);
            extras.putInt("nid", notificationId);
            if (createPayload.getIsPushStory()) {
                if (Constants.isAmazonDevice()) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.u1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handlePushNotificationPayload$lambda$19;
                            handlePushNotificationPayload$lambda$19 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$19();
                            return handlePushNotificationPayload$lambda$19;
                        }
                    }, 7, (Object) null);
                    return false;
                }
                if (!extras.containsKey("braze_story_newly_received")) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.v1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handlePushNotificationPayload$lambda$20;
                            handlePushNotificationPayload$lambda$20 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$20();
                            return handlePushNotificationPayload$lambda$20;
                        }
                    }, 7, (Object) null);
                    extras.putBoolean("braze_story_newly_received", true);
                }
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: i4.w1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handlePushNotificationPayload$lambda$21;
                    handlePushNotificationPayload$lambda$21 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$21(BrazeNotificationPayload.this);
                    return handlePushNotificationPayload$lambda$21;
                }
            }, 6, (Object) null);
            Notification createNotification = BrazeNotificationUtils.getActiveNotificationFactory().createNotification(createPayload);
            if (createNotification == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.I1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$22;
                        handlePushNotificationPayload$lambda$22 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$22();
                        return handlePushNotificationPayload$lambda$22;
                    }
                }, 7, (Object) null);
                return false;
            }
            final NotificationManagerCompat from = NotificationManagerCompat.from(context);
            Intrinsics.checkNotNullExpressionValue(from, "from(...)");
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.J1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handlePushNotificationPayload$lambda$23;
                    handlePushNotificationPayload$lambda$23 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$23(NotificationManagerCompat.this);
                    return handlePushNotificationPayload$lambda$23;
                }
            }, 7, (Object) null);
            if (AbstractC1809a.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0) {
                from.notify("appboy_notification", notificationId, createNotification);
                companion = this;
            } else {
                companion = this;
                BrazeLogger.brazelog$default(brazeLogger, (Object) companion, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.K1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handlePushNotificationPayload$lambda$24;
                        handlePushNotificationPayload$lambda$24 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$24();
                        return handlePushNotificationPayload$lambda$24;
                    }
                }, 7, (Object) null);
            }
            BrazeNotificationUtils.sendPushMessageReceivedBroadcast(context, extras, createPayload);
            BrazeNotificationUtils.wakeScreenIfAppropriate(context, configurationProvider, extras);
            Integer pushDuration = createPayload.getPushDuration();
            if (pushDuration != null) {
                BrazeNotificationUtils.setNotificationDurationAlarm(context, BrazePushReceiver.class, notificationId, pushDuration.intValue());
            }
            companion.logNotificationMetadata$android_sdk_ui_release(context, createPayload);
            return true;
        }

        @JvmStatic
        @JvmOverloads
        public final void handleReceivedIntent(@NotNull Context context, @NotNull Intent intent, boolean runOnThread) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (runOnThread) {
                i.d(BrazeCoroutineScope.INSTANCE, (CoroutineContext) null, (L) null, new BrazePushReceiver$Companion$handleReceivedIntent$1(context, intent, null), 3, (Object) null);
            } else {
                handlePush(context, intent);
            }
        }

        public final void logNotificationMetadata$android_sdk_ui_release(@NotNull Context context, @NotNull BrazeNotificationPayload payload) {
            String campaignId;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (payload.getIsPushDeliveryEnabled() && (campaignId = payload.getCampaignId()) != null) {
                long coerceAtLeast = RangesKt.coerceAtLeast(payload.getFlushMinMinutes(), 0L);
                long coerceAtLeast2 = RangesKt.coerceAtLeast(payload.getFlushMaxMinutes(), coerceAtLeast);
                TimeUnit timeUnit = TimeUnit.MINUTES;
                long millis = timeUnit.toMillis(coerceAtLeast);
                if (coerceAtLeast2 > coerceAtLeast) {
                    millis = Random.INSTANCE.nextLong(millis, timeUnit.toMillis(coerceAtLeast2));
                }
                BrazeInternal.INSTANCE.logPushDelivery(context, campaignId, millis);
            }
            String campaignId2 = payload.getCampaignId();
            if (campaignId2 != null) {
                BrazeInternal.INSTANCE.logPushCampaign(context, campaignId2);
            }
        }

        private Companion() {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Companion.handleReceivedIntent$default(INSTANCE, context, intent, false, 4, null);
    }
}
