package com.braze.push;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import androidx.core.app.m;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.IBrazeNotificationFactory;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.Channel;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.BrazeNotificationUtils;
import com.braze.push.support.HtmlUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.support.JsonUtils;
import com.braze.support.PermissionUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import com.braze.ui.support.UriUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001jB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\nJ1\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\f\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0011*\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J'\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001f\u0010\u001dJ5\u0010%\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b)\u0010(J)\u0010,\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010,\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b,\u0010\u001dJ\u0017\u0010.\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\b2\u0006\u00101\u001a\u0002002\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\b2\u0006\u00101\u001a\u0002002\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b4\u00103J\u001f\u00105\u001a\u00020\b2\u0006\u00101\u001a\u0002002\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b5\u00103J)\u00106\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00101\u001a\u0002002\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b6\u00107J)\u00108\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00101\u001a\u0002002\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b8\u00107J\u001f\u0010:\u001a\u00020\"2\u0006\u00109\u001a\u00020*2\u0006\u00101\u001a\u000200H\u0007¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\b2\u0006\u00101\u001a\u0002002\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b<\u00103J\u001f\u0010=\u001a\u00020\u00112\u0006\u00101\u001a\u0002002\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\b2\u0006\u00101\u001a\u0002002\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b?\u00103J\u001f\u0010@\u001a\u00020\b2\u0006\u00101\u001a\u0002002\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b@\u00103J\u001f\u0010A\u001a\u00020\b2\u0006\u00101\u001a\u0002002\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\bA\u00103J\u001f\u0010B\u001a\u00020\b2\u0006\u00101\u001a\u0002002\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\bB\u00103J\u001f\u0010C\u001a\u00020\b2\u0006\u00101\u001a\u0002002\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\bC\u00103J\u001f\u0010D\u001a\u00020\b2\u0006\u00101\u001a\u0002002\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\bD\u00103J\u001f\u0010E\u001a\u00020\b2\u0006\u00101\u001a\u0002002\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\bE\u00103J\u0017\u0010G\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\"H\u0007¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\bI\u0010\nJ\u001f\u0010J\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020\b2\u0006\u00101\u001a\u0002002\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\bN\u00103J\u001f\u0010O\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\bO\u0010\nJ\u0017\u0010P\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\bP\u0010/J\u001f\u0010Q\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\bQ\u0010\nJ#\u0010U\u001a\u0004\u0018\u00010T2\u0006\u0010S\u001a\u00020R2\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\bU\u0010VJ)\u0010Y\u001a\u00020X2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\bY\u0010ZJ5\u0010]\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020[2\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b]\u0010^J)\u0010]\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010_\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b]\u0010`R\u0014\u0010a\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0011\u0010f\u001a\u00020c8G¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0015\u0010i\u001a\u0006\u0012\u0002\b\u00030 8G¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006k"}, d2 = {"Lcom/braze/push/BrazeNotificationUtils;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "handleNotificationOpened", "(Landroid/content/Context;Landroid/content/Intent;)V", "handleNotificationDeleted", "routeUserWithNotificationOpenedIntent", "Landroid/os/Bundle;", "extras", "", "deepLink", "", "useWebView", "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/String;Z)V", "isBrazePushMessage", "(Landroid/content/Intent;)Z", "isNotificationMessage", "notificationExtras", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "sendPushMessageReceivedBroadcast", "(Landroid/content/Context;Landroid/os/Bundle;Lcom/braze/models/push/BrazeNotificationPayload;)V", "requestGeofenceRefreshIfAppropriate", "(Lcom/braze/models/push/BrazeNotificationPayload;)Z", "refreshFeatureFlagsIfAppropriate", "refreshBannersIfAppropriate", "Ljava/lang/Class;", "thisClass", "", "notificationId", "durationInMillis", "setNotificationDurationAlarm", "(Landroid/content/Context;Ljava/lang/Class;II)V", "getNotificationId", "(Lcom/braze/models/push/BrazeNotificationPayload;)I", "getNotificationPriority", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "wakeScreenIfAppropriate", "(Landroid/content/Context;Lcom/braze/configuration/BrazeConfigurationProvider;Landroid/os/Bundle;)Z", "prefetchBitmapsIfNewlyReceivedStoryPush", "(Lcom/braze/models/push/BrazeNotificationPayload;)V", "Landroidx/core/app/m$e;", "notificationBuilder", "setTitleIfPresent", "(Landroidx/core/app/m$e;Lcom/braze/models/push/BrazeNotificationPayload;)V", "setContentIfPresent", "setTickerIfPresent", "setContentIntentIfPresent", "(Landroid/content/Context;Landroidx/core/app/m$e;Landroid/os/Bundle;)V", "setDeleteIntent", "appConfigurationProvider", "setSmallIcon", "(Lcom/braze/configuration/BrazeConfigurationProvider;Landroidx/core/app/m$e;)I", "setSetShowWhen", "setLargeIconIfPresentAndSupported", "(Landroidx/core/app/m$e;Lcom/braze/models/push/BrazeNotificationPayload;)Z", "setSoundIfPresentAndSupported", "setSummaryTextIfPresentAndSupported", "setPriorityIfPresentAndSupported", "setAccentColorIfPresentAndSupported", "setCategoryIfPresentAndSupported", "setVisibilityIfPresentAndSupported", "setPublicVersionIfPresentAndSupported", "visibility", "isValidNotificationVisibility", "(I)Z", "handleCancelNotificationAction", "cancelNotification", "(Landroid/content/Context;I)V", "getOrCreateNotificationChannelId", "(Lcom/braze/models/push/BrazeNotificationPayload;)Ljava/lang/String;", "setNotificationBadgeNumberIfPresent", "handlePushStoryPageClicked", "handleContentCardsSerializedCardIfPresent", "sendNotificationOpenedBroadcast", "Landroid/app/NotificationManager;", "notificationManager", "Landroid/app/NotificationChannel;", "getValidNotificationChannel", "(Landroid/app/NotificationManager;Landroid/os/Bundle;)Landroid/app/NotificationChannel;", "action", "Landroid/app/PendingIntent;", "getPushActionPendingIntent", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/app/PendingIntent;", "Lcom/braze/push/BrazeNotificationUtils$BrazeNotificationBroadcastType;", "broadcastType", "sendPushActionIntent", "(Landroid/content/Context;Lcom/braze/push/BrazeNotificationUtils$BrazeNotificationBroadcastType;Landroid/os/Bundle;Lcom/braze/models/push/BrazeNotificationPayload;)V", "pushIntent", "(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V", "TAG", "Ljava/lang/String;", "Lcom/braze/IBrazeNotificationFactory;", "getActiveNotificationFactory", "()Lcom/braze/IBrazeNotificationFactory;", "activeNotificationFactory", "getNotificationReceiverClass", "()Ljava/lang/Class;", "notificationReceiverClass", "BrazeNotificationBroadcastType", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBrazeNotificationUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeNotificationUtils.kt\ncom/braze/push/BrazeNotificationUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1122:1\n1#2:1123\n1#2:1134\n1611#3,9:1124\n1863#3:1133\n1864#3:1135\n1620#3:1136\n1863#3,2:1137\n*S KotlinDebug\n*F\n+ 1 BrazeNotificationUtils.kt\ncom/braze/push/BrazeNotificationUtils\n*L\n457#1:1134\n457#1:1124,9\n457#1:1133\n457#1:1135\n457#1:1136\n458#1:1137,2\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class BrazeNotificationUtils {

    @NotNull
    public static final BrazeNotificationUtils INSTANCE = new BrazeNotificationUtils();

    @NotNull
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) BrazeNotificationUtils.class);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/braze/push/BrazeNotificationUtils$BrazeNotificationBroadcastType;", "", "brazePushEventType", "Lcom/braze/enums/BrazePushEventType;", "<init>", "(Ljava/lang/String;ILcom/braze/enums/BrazePushEventType;)V", "getBrazePushEventType", "()Lcom/braze/enums/BrazePushEventType;", "OPENED", "RECEIVED", "DELETED", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class BrazeNotificationBroadcastType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BrazeNotificationBroadcastType[] $VALUES;

        @NotNull
        private final BrazePushEventType brazePushEventType;
        public static final BrazeNotificationBroadcastType OPENED = new BrazeNotificationBroadcastType("OPENED", 0, BrazePushEventType.NOTIFICATION_OPENED);
        public static final BrazeNotificationBroadcastType RECEIVED = new BrazeNotificationBroadcastType("RECEIVED", 1, BrazePushEventType.NOTIFICATION_RECEIVED);
        public static final BrazeNotificationBroadcastType DELETED = new BrazeNotificationBroadcastType("DELETED", 2, BrazePushEventType.NOTIFICATION_DELETED);

        private static final /* synthetic */ BrazeNotificationBroadcastType[] $values() {
            return new BrazeNotificationBroadcastType[]{OPENED, RECEIVED, DELETED};
        }

        static {
            BrazeNotificationBroadcastType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private BrazeNotificationBroadcastType(String str, int i6, BrazePushEventType brazePushEventType) {
            this.brazePushEventType = brazePushEventType;
        }

        public static BrazeNotificationBroadcastType valueOf(String str) {
            return (BrazeNotificationBroadcastType) Enum.valueOf(BrazeNotificationBroadcastType.class, str);
        }

        public static BrazeNotificationBroadcastType[] values() {
            return (BrazeNotificationBroadcastType[]) $VALUES.clone();
        }

        @NotNull
        public final BrazePushEventType getBrazePushEventType() {
            return this.brazePushEventType;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrazeNotificationBroadcastType.values().length];
            try {
                iArr[BrazeNotificationBroadcastType.OPENED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrazeNotificationBroadcastType.RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrazeNotificationBroadcastType.DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BrazeNotificationUtils() {
    }

    @JvmStatic
    public static final void cancelNotification(@NotNull Context context, final int notificationId) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.q0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String cancelNotification$lambda$64;
                    cancelNotification$lambda$64 = BrazeNotificationUtils.cancelNotification$lambda$64(notificationId);
                    return cancelNotification$lambda$64;
                }
            }, 7, (Object) null);
            Intent intent = new Intent("com.braze.action.CANCEL_NOTIFICATION").setClass(context, getNotificationReceiverClass());
            Intrinsics.checkNotNullExpressionValue(intent, "setClass(...)");
            intent.setPackage(context.getPackageName());
            intent.putExtra("nid", notificationId);
            IntentUtils.addComponentAndSendBroadcast(context, intent);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: i4.r0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String cancelNotification$lambda$65;
                    cancelNotification$lambda$65 = BrazeNotificationUtils.cancelNotification$lambda$65();
                    return cancelNotification$lambda$65;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cancelNotification$lambda$64(int i6) {
        return "Cancelling notification action with id: " + i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cancelNotification$lambda$65() {
        return "Exception occurred attempting to cancel notification.";
    }

    @JvmStatic
    @NotNull
    public static final IBrazeNotificationFactory getActiveNotificationFactory() {
        IBrazeNotificationFactory customBrazeNotificationFactory = Braze.INSTANCE.getCustomBrazeNotificationFactory();
        return customBrazeNotificationFactory == null ? BrazeNotificationFactory.INSTANCE.getInstance() : customBrazeNotificationFactory;
    }

    @JvmStatic
    public static final int getNotificationId(@NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        final Integer customNotificationId = payload.getCustomNotificationId();
        if (customNotificationId != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String notificationId$lambda$17;
                    notificationId$lambda$17 = BrazeNotificationUtils.getNotificationId$lambda$17(customNotificationId);
                    return notificationId$lambda$17;
                }
            }, 7, (Object) null);
            return customNotificationId.intValue();
        }
        String titleText = payload.getTitleText();
        String str = "";
        if (titleText != null) {
            str = "" + titleText;
        }
        String contentText = payload.getContentText();
        if (contentText != null) {
            str = str + contentText;
        }
        final int hashCode = str != null ? str.hashCode() : 0;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String notificationId$lambda$20;
                notificationId$lambda$20 = BrazeNotificationUtils.getNotificationId$lambda$20(hashCode);
                return notificationId$lambda$20;
            }
        }, 7, (Object) null);
        return hashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNotificationId$lambda$17(Integer num) {
        return "Using notification id provided in the message's extras bundle: " + num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNotificationId$lambda$20(int i6) {
        return "Message without notification id provided in the extras bundle received. Using a hash of the message: " + i6;
    }

    @JvmStatic
    public static final int getNotificationPriority(@NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        final Integer notificationPriorityInt = payload.getNotificationPriorityInt();
        Integer notificationPriorityInt2 = payload.getNotificationPriorityInt();
        if (notificationPriorityInt2 == null) {
            return 0;
        }
        int intValue = notificationPriorityInt2.intValue();
        if (-2 <= intValue && intValue < 3) {
            return intValue;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: i4.B0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String notificationPriority$lambda$22$lambda$21;
                notificationPriority$lambda$22$lambda$21 = BrazeNotificationUtils.getNotificationPriority$lambda$22$lambda$21(notificationPriorityInt);
                return notificationPriority$lambda$22$lambda$21;
            }
        }, 6, (Object) null);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNotificationPriority$lambda$22$lambda$21(Integer num) {
        return "Received invalid notification priority " + num;
    }

    @JvmStatic
    @NotNull
    public static final Class<?> getNotificationReceiverClass() {
        return Constants.isAmazonDevice() ? BrazeAmazonDeviceMessagingReceiver.class : BrazePushReceiver.class;
    }

    @JvmStatic
    @NotNull
    public static final String getOrCreateNotificationChannelId(@NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        final String notificationChannelId = payload.getNotificationChannelId();
        Context context = payload.getContext();
        BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
        Object systemService = context != null ? context.getSystemService("notification") : null;
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (notificationChannelId != null) {
            if (notificationManager.getNotificationChannel(notificationChannelId) != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.h1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String orCreateNotificationChannelId$lambda$67;
                        orCreateNotificationChannelId$lambda$67 = BrazeNotificationUtils.getOrCreateNotificationChannelId$lambda$67(notificationChannelId);
                        return orCreateNotificationChannelId$lambda$67;
                    }
                }, 7, (Object) null);
                return notificationChannelId;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.i1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String orCreateNotificationChannelId$lambda$68;
                    orCreateNotificationChannelId$lambda$68 = BrazeNotificationUtils.getOrCreateNotificationChannelId$lambda$68(notificationChannelId);
                    return orCreateNotificationChannelId$lambda$68;
                }
            }, 7, (Object) null);
        }
        if (notificationManager.getNotificationChannel("com_appboy_default_notification_channel") == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.j1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String orCreateNotificationChannelId$lambda$69;
                    orCreateNotificationChannelId$lambda$69 = BrazeNotificationUtils.getOrCreateNotificationChannelId$lambda$69();
                    return orCreateNotificationChannelId$lambda$69;
                }
            }, 7, (Object) null);
            NotificationChannel notificationChannel = new NotificationChannel("com_appboy_default_notification_channel", configurationProvider != null ? configurationProvider.getDefaultNotificationChannelName() : null, 3);
            notificationChannel.setDescription(configurationProvider != null ? configurationProvider.getDefaultNotificationChannelDescription() : null);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return "com_appboy_default_notification_channel";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getOrCreateNotificationChannelId$lambda$67(String str) {
        return "Found notification channel in extras with id: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getOrCreateNotificationChannelId$lambda$68(String str) {
        return "Notification channel from extras is invalid. No channel found with id: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getOrCreateNotificationChannelId$lambda$69() {
        return "Braze default notification channel does not exist on device. Creating default channel.";
    }

    private final PendingIntent getPushActionPendingIntent(Context context, String action, Bundle notificationExtras) {
        Intent intent = new Intent(action).setClass(context, NotificationTrampolineActivity.class);
        Intrinsics.checkNotNullExpressionValue(intent, "setClass(...)");
        if (notificationExtras != null) {
            intent.putExtras(notificationExtras);
        }
        PendingIntent activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent, 1073741824 | IntentUtils.getImmutablePendingIntentFlags());
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    @JvmStatic
    @TargetApi(26)
    @Nullable
    public static final NotificationChannel getValidNotificationChannel(@NotNull NotificationManager notificationManager, @Nullable Bundle notificationExtras) {
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        if (notificationExtras == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.u0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String validNotificationChannel$lambda$75;
                    validNotificationChannel$lambda$75 = BrazeNotificationUtils.getValidNotificationChannel$lambda$75();
                    return validNotificationChannel$lambda$75;
                }
            }, 7, (Object) null);
            return null;
        }
        final String string = notificationExtras.getString("ab_nc", null);
        if (string != null && !StringsKt.isBlank(string)) {
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(string);
            if (notificationChannel != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.w0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String validNotificationChannel$lambda$76;
                        validNotificationChannel$lambda$76 = BrazeNotificationUtils.getValidNotificationChannel$lambda$76(string);
                        return validNotificationChannel$lambda$76;
                    }
                }, 7, (Object) null);
                return notificationChannel;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.x0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String validNotificationChannel$lambda$77;
                    validNotificationChannel$lambda$77 = BrazeNotificationUtils.getValidNotificationChannel$lambda$77(string);
                    return validNotificationChannel$lambda$77;
                }
            }, 7, (Object) null);
        }
        NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel("com_appboy_default_notification_channel");
        if (notificationChannel2 != null) {
            return notificationChannel2;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String validNotificationChannel$lambda$78;
                validNotificationChannel$lambda$78 = BrazeNotificationUtils.getValidNotificationChannel$lambda$78();
                return validNotificationChannel$lambda$78;
            }
        }, 7, (Object) null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$75() {
        return "Notification extras bundle was null. Could not find a valid notification channel";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$76(String str) {
        return "Found notification channel in extras with id: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$77(String str) {
        return "Notification channel from extras is invalid, no channel found with id: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$78() {
        return "Braze default notification channel does not exist on device.";
    }

    @JvmStatic
    public static final void handleCancelNotificationAction(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            if (intent.hasExtra("nid")) {
                final int intExtra = intent.getIntExtra("nid", -1);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.k1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleCancelNotificationAction$lambda$62;
                        handleCancelNotificationAction$lambda$62 = BrazeNotificationUtils.handleCancelNotificationAction$lambda$62(intExtra);
                        return handleCancelNotificationAction$lambda$62;
                    }
                }, 7, (Object) null);
                Object systemService = context.getSystemService("notification");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) systemService).cancel("appboy_notification", intExtra);
            }
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: i4.l1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleCancelNotificationAction$lambda$63;
                    handleCancelNotificationAction$lambda$63 = BrazeNotificationUtils.handleCancelNotificationAction$lambda$63();
                    return handleCancelNotificationAction$lambda$63;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCancelNotificationAction$lambda$62(int i6) {
        return "Cancelling notification action with id: " + i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCancelNotificationAction$lambda$63() {
        return "Exception occurred handling cancel notification intent.";
    }

    @JvmStatic
    public static final void handleContentCardsSerializedCardIfPresent(@NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        final String contentCardSyncData = payload.getContentCardSyncData();
        final String contentCardSyncUserId = payload.getContentCardSyncUserId();
        Context context = payload.getContext();
        if (contentCardSyncData == null || context == null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.t0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String handleContentCardsSerializedCardIfPresent$lambda$73;
                handleContentCardsSerializedCardIfPresent$lambda$73 = BrazeNotificationUtils.handleContentCardsSerializedCardIfPresent$lambda$73(contentCardSyncUserId, contentCardSyncData);
                return handleContentCardsSerializedCardIfPresent$lambda$73;
            }
        }, 7, (Object) null);
        BrazeInternal.addSerializedContentCardToStorage(context, contentCardSyncData, contentCardSyncUserId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleContentCardsSerializedCardIfPresent$lambda$73(String str, String str2) {
        return "Push contains associated Content Cards card. User id: " + str + " Card data: " + str2;
    }

    @JvmStatic
    public static final void handleNotificationDeleted(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.v0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleNotificationDeleted$lambda$2;
                    handleNotificationDeleted$lambda$2 = BrazeNotificationUtils.handleNotificationDeleted$lambda$2();
                    return handleNotificationDeleted$lambda$2;
                }
            }, 7, (Object) null);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                sendPushActionIntent$default(brazeNotificationUtils, context, BrazeNotificationBroadcastType.DELETED, extras, null, 8, null);
            } else {
                brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.DELETED, extras, new BrazeNotificationPayload(extras, null, context, null, 10, null));
            }
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: i4.G0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleNotificationDeleted$lambda$3;
                    handleNotificationDeleted$lambda$3 = BrazeNotificationUtils.handleNotificationDeleted$lambda$3();
                    return handleNotificationDeleted$lambda$3;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationDeleted$lambda$2() {
        return "Sending notification deleted broadcast";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationDeleted$lambda$3() {
        return "Exception occurred attempting to handle notification delete intent.";
    }

    @JvmStatic
    public static final void handleNotificationOpened(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            Braze.INSTANCE.getInstance(context).logPushNotificationOpened(intent);
            sendNotificationOpenedBroadcast(context, intent);
            if (BrazeInternal.INSTANCE.getConfigurationProvider(context).getDoesHandlePushDeepLinksAutomatically()) {
                routeUserWithNotificationOpenedIntent(context, intent);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: i4.R0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleNotificationOpened$lambda$0;
                        handleNotificationOpened$lambda$0 = BrazeNotificationUtils.handleNotificationOpened$lambda$0();
                        return handleNotificationOpened$lambda$0;
                    }
                }, 6, (Object) null);
            }
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: i4.c1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleNotificationOpened$lambda$1;
                    handleNotificationOpened$lambda$1 = BrazeNotificationUtils.handleNotificationOpened$lambda$1();
                    return handleNotificationOpened$lambda$1;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationOpened$lambda$0() {
        return "Not handling deep links automatically, skipping deep link handling";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationOpened$lambda$1() {
        return "Exception occurred attempting to handle notification opened intent.";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[Catch: Exception -> 0x0088, TryCatch #0 {Exception -> 0x0088, blocks: (B:3:0x000c, B:6:0x0036, B:7:0x0039, B:10:0x0041, B:13:0x0048, B:15:0x0057, B:18:0x005e, B:19:0x0067, B:21:0x0070, B:24:0x0074, B:26:0x0064), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074 A[Catch: Exception -> 0x0088, TRY_LEAVE, TryCatch #0 {Exception -> 0x0088, blocks: (B:3:0x000c, B:6:0x0036, B:7:0x0039, B:10:0x0041, B:13:0x0048, B:15:0x0057, B:18:0x005e, B:19:0x0067, B:21:0x0070, B:24:0x0074, B:26:0x0064), top: B:2:0x000c }] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void handlePushStoryPageClicked(@org.jetbrains.annotations.NotNull android.content.Context r8, @org.jetbrains.annotations.NotNull android.content.Intent r9) {
        /*
            java.lang.String r0 = "braze_action_uri"
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.lang.String r1 = "intent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            com.braze.Braze$Companion r1 = com.braze.Braze.INSTANCE     // Catch: java.lang.Exception -> L88
            com.braze.Braze r1 = r1.getInstance(r8)     // Catch: java.lang.Exception -> L88
            java.lang.String r2 = "braze_campaign_id"
            java.lang.String r2 = r9.getStringExtra(r2)     // Catch: java.lang.Exception -> L88
            java.lang.String r3 = "braze_story_page_id"
            java.lang.String r3 = r9.getStringExtra(r3)     // Catch: java.lang.Exception -> L88
            r1.logPushStoryPageClicked(r2, r3)     // Catch: java.lang.Exception -> L88
            com.braze.BrazeInternal r1 = com.braze.BrazeInternal.INSTANCE     // Catch: java.lang.Exception -> L88
            com.braze.configuration.BrazeConfigurationProvider r1 = r1.getConfigurationProvider(r8)     // Catch: java.lang.Exception -> L88
            java.lang.String r2 = "nid"
            r3 = 0
            int r2 = r9.getIntExtra(r2, r3)     // Catch: java.lang.Exception -> L88
            boolean r3 = r1.getDoesPushStoryDismissOnClick()     // Catch: java.lang.Exception -> L88
            if (r3 == 0) goto L39
            if (r2 == 0) goto L39
            cancelNotification(r8, r2)     // Catch: java.lang.Exception -> L88
        L39:
            java.lang.String r2 = r9.getStringExtra(r0)     // Catch: java.lang.Exception -> L88
            java.lang.String r3 = "uri"
            if (r2 == 0) goto L64
            boolean r4 = kotlin.text.StringsKt.isBlank(r2)     // Catch: java.lang.Exception -> L88
            if (r4 == 0) goto L48
            goto L64
        L48:
            java.lang.String r0 = r9.getStringExtra(r0)     // Catch: java.lang.Exception -> L88
            r9.putExtra(r3, r0)     // Catch: java.lang.Exception -> L88
            java.lang.String r0 = "braze_action_use_webview"
            java.lang.String r0 = r9.getStringExtra(r0)     // Catch: java.lang.Exception -> L88
            if (r0 == 0) goto L67
            boolean r3 = kotlin.text.StringsKt.isBlank(r0)     // Catch: java.lang.Exception -> L88
            if (r3 == 0) goto L5e
            goto L67
        L5e:
            java.lang.String r3 = "ab_use_webview"
            r9.putExtra(r3, r0)     // Catch: java.lang.Exception -> L88
            goto L67
        L64:
            r9.removeExtra(r3)     // Catch: java.lang.Exception -> L88
        L67:
            sendNotificationOpenedBroadcast(r8, r9)     // Catch: java.lang.Exception -> L88
            boolean r0 = r1.getDoesHandlePushDeepLinksAutomatically()     // Catch: java.lang.Exception -> L88
            if (r0 == 0) goto L74
            routeUserWithNotificationOpenedIntent(r8, r9)     // Catch: java.lang.Exception -> L88
            return
        L74:
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> L88
            com.braze.push.BrazeNotificationUtils r1 = com.braze.push.BrazeNotificationUtils.INSTANCE     // Catch: java.lang.Exception -> L88
            r8 = r2
            com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.f12982I     // Catch: java.lang.Exception -> L88
            i4.a0 r5 = new i4.a0     // Catch: java.lang.Exception -> L88
            r5.<init>()     // Catch: java.lang.Exception -> L88
            r6 = 6
            r7 = 0
            r3 = 0
            r4 = 0
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L88
            return
        L88:
            r0 = move-exception
            r8 = r0
            r3 = r8
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.push.BrazeNotificationUtils r1 = com.braze.push.BrazeNotificationUtils.INSTANCE
            com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.f12981E
            i4.k0 r5 = new i4.k0
            r5.<init>()
            r6 = 4
            r7 = 0
            r4 = 0
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.push.BrazeNotificationUtils.handlePushStoryPageClicked(android.content.Context, android.content.Intent):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handlePushStoryPageClicked$lambda$71(String str) {
        return "Not handling deep links automatically, skipping deep link handling for '" + str + '\'';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handlePushStoryPageClicked$lambda$72() {
        return "Caught exception while handling story click.";
    }

    @JvmStatic
    public static final boolean isBrazePushMessage(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        return StringsKt.equals(com.amazon.a.a.o.b.af, extras.getString("_ab"), true);
    }

    @JvmStatic
    public static final boolean isNotificationMessage(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle extras = intent.getExtras();
        return extras != null && extras.containsKey("t") && extras.containsKey("a");
    }

    @JvmStatic
    public static final boolean isValidNotificationVisibility(int visibility) {
        return visibility == -1 || visibility == 0 || visibility == 1;
    }

    @JvmStatic
    public static final void prefetchBitmapsIfNewlyReceivedStoryPush(@NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        if (context != null && payload.getIsPushStory() && payload.getIsNewlyReceivedPushStory()) {
            List<BrazeNotificationPayload.PushStoryPage> pushStoryPages = payload.getPushStoryPages();
            ArrayList<String> arrayList = new ArrayList();
            Iterator<T> it = pushStoryPages.iterator();
            while (it.hasNext()) {
                String bitmapUrl = ((BrazeNotificationPayload.PushStoryPage) it.next()).getBitmapUrl();
                if (bitmapUrl != null) {
                    arrayList.add(bitmapUrl);
                }
            }
            for (final String str : arrayList) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: i4.N0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String prefetchBitmapsIfNewlyReceivedStoryPush$lambda$30$lambda$29;
                        prefetchBitmapsIfNewlyReceivedStoryPush$lambda$30$lambda$29 = BrazeNotificationUtils.prefetchBitmapsIfNewlyReceivedStoryPush$lambda$30$lambda$29(str);
                        return prefetchBitmapsIfNewlyReceivedStoryPush$lambda$30$lambda$29;
                    }
                }, 6, (Object) null);
                Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, payload.getBrazeExtras(), str, BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY);
            }
            payload.setNewlyReceivedPushStory(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prefetchBitmapsIfNewlyReceivedStoryPush$lambda$30$lambda$29(String str) {
        return "Pre-fetching bitmap at URL: " + str;
    }

    @JvmStatic
    public static final boolean refreshBannersIfAppropriate(@NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        if (!payload.getShouldRefreshBanners() || context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: i4.o0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String refreshBannersIfAppropriate$lambda$15;
                    refreshBannersIfAppropriate$lambda$15 = BrazeNotificationUtils.refreshBannersIfAppropriate$lambda$15();
                    return refreshBannersIfAppropriate$lambda$15;
                }
            }, 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.n0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String refreshBannersIfAppropriate$lambda$14;
                refreshBannersIfAppropriate$lambda$14 = BrazeNotificationUtils.refreshBannersIfAppropriate$lambda$14();
                return refreshBannersIfAppropriate$lambda$14;
            }
        }, 7, (Object) null);
        BrazeInternal.refreshBanners(context);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshBannersIfAppropriate$lambda$14() {
        return "Banners refresh key was true. Refreshing Banners.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshBannersIfAppropriate$lambda$15() {
        return "Banners refresh key not included in push payload or false. Not refreshing banners.";
    }

    @JvmStatic
    public static final boolean refreshFeatureFlagsIfAppropriate(@NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        if (!payload.getShouldRefreshFeatureFlags() || context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: i4.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String refreshFeatureFlagsIfAppropriate$lambda$13;
                    refreshFeatureFlagsIfAppropriate$lambda$13 = BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate$lambda$13();
                    return refreshFeatureFlagsIfAppropriate$lambda$13;
                }
            }, 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String refreshFeatureFlagsIfAppropriate$lambda$12;
                refreshFeatureFlagsIfAppropriate$lambda$12 = BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate$lambda$12();
                return refreshFeatureFlagsIfAppropriate$lambda$12;
            }
        }, 7, (Object) null);
        BrazeInternal.refreshFeatureFlags(context);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlagsIfAppropriate$lambda$12() {
        return "Feature flag refresh key was true. Refreshing feature flags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlagsIfAppropriate$lambda$13() {
        return "Feature flag refresh key not included in push payload or false. Not refreshing feature flags.";
    }

    @JvmStatic
    public static final boolean requestGeofenceRefreshIfAppropriate(@NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        if (!payload.getShouldSyncGeofences() || context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: i4.m0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestGeofenceRefreshIfAppropriate$lambda$11;
                    requestGeofenceRefreshIfAppropriate$lambda$11 = BrazeNotificationUtils.requestGeofenceRefreshIfAppropriate$lambda$11();
                    return requestGeofenceRefreshIfAppropriate$lambda$11;
                }
            }, 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestGeofenceRefreshIfAppropriate$lambda$10;
                requestGeofenceRefreshIfAppropriate$lambda$10 = BrazeNotificationUtils.requestGeofenceRefreshIfAppropriate$lambda$10();
                return requestGeofenceRefreshIfAppropriate$lambda$10;
            }
        }, 7, (Object) null);
        BrazeInternal.requestGeofenceRefresh(context, true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefreshIfAppropriate$lambda$10() {
        return "Geofence sync key was true. Syncing geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefreshIfAppropriate$lambda$11() {
        return "Geofence sync key not included in push payload or false. Not syncing geofences.";
    }

    @JvmStatic
    public static final void routeUserWithNotificationOpenedIntent(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String routeUserWithNotificationOpenedIntent$lambda$4;
                routeUserWithNotificationOpenedIntent$lambda$4 = BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$4();
                return routeUserWithNotificationOpenedIntent$lambda$4;
            }
        }, 7, (Object) null);
        Bundle bundleExtra = intent.getBundleExtra("extra");
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        bundleExtra.putString("cid", intent.getStringExtra("cid"));
        bundleExtra.putString("source", "Appboy");
        brazeNotificationUtils.routeUserWithNotificationOpenedIntent(context, bundleExtra, intent.getStringExtra("uri"), StringsKt.equals(com.amazon.a.a.o.b.af, intent.getStringExtra("ab_use_webview"), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$4() {
        return "routeUserWithNotificationOpenedIntent called with Intent";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$6(String str, boolean z6) {
        return "Found a deep link: " + str + ". Use webview set to: " + z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$8(Intent intent) {
        return "Push notification had no deep link. Opening main activity: " + intent;
    }

    @JvmStatic
    public static final void sendNotificationOpenedBroadcast(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String sendNotificationOpenedBroadcast$lambda$74;
                sendNotificationOpenedBroadcast$lambda$74 = BrazeNotificationUtils.sendNotificationOpenedBroadcast$lambda$74();
                return sendNotificationOpenedBroadcast$lambda$74;
            }
        }, 7, (Object) null);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            sendPushActionIntent$default(brazeNotificationUtils, context, BrazeNotificationBroadcastType.OPENED, extras, null, 8, null);
        } else {
            brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.OPENED, extras, new BrazeNotificationPayload(extras, null, context, null, 10, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendNotificationOpenedBroadcast$lambda$74() {
        return "Sending notification opened broadcast";
    }

    private final void sendPushActionIntent(Context context, final BrazeNotificationBroadcastType broadcastType, Bundle notificationExtras, BrazeNotificationPayload payload) {
        Intent intent;
        int i6 = WhenMappings.$EnumSwitchMapping$0[broadcastType.ordinal()];
        if (i6 == 1) {
            intent = new Intent("com.braze.push.intent.NOTIFICATION_OPENED").setPackage(context.getPackageName());
            Intrinsics.checkNotNull(intent);
        } else if (i6 == 2) {
            intent = new Intent("com.braze.push.intent.NOTIFICATION_RECEIVED").setPackage(context.getPackageName());
            Intrinsics.checkNotNull(intent);
        } else if (i6 == 3) {
            intent = new Intent("com.braze.push.intent.NOTIFICATION_DELETED").setPackage(context.getPackageName());
            Intrinsics.checkNotNull(intent);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: com.braze.push.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String sendPushActionIntent$lambda$79;
                sendPushActionIntent$lambda$79 = BrazeNotificationUtils.sendPushActionIntent$lambda$79(BrazeNotificationUtils.BrazeNotificationBroadcastType.this);
                return sendPushActionIntent$lambda$79;
            }
        }, 6, (Object) null);
        sendPushActionIntent(context, intent, notificationExtras);
        if (payload != null) {
            BrazeInternal.INSTANCE.publishBrazePushAction(context, broadcastType.getBrazePushEventType(), payload);
        }
    }

    public static /* synthetic */ void sendPushActionIntent$default(BrazeNotificationUtils brazeNotificationUtils, Context context, BrazeNotificationBroadcastType brazeNotificationBroadcastType, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload, int i6, Object obj) {
        if ((i6 & 8) != 0) {
            brazeNotificationPayload = null;
        }
        brazeNotificationUtils.sendPushActionIntent(context, brazeNotificationBroadcastType, bundle, brazeNotificationPayload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendPushActionIntent$lambda$79(BrazeNotificationBroadcastType brazeNotificationBroadcastType) {
        return "Sending Braze broadcast receiver intent for " + brazeNotificationBroadcastType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendPushActionIntent$lambda$80(Intent intent) {
        return "Sending push action intent: " + intent;
    }

    @JvmStatic
    public static final void sendPushMessageReceivedBroadcast(@NotNull Context context, @NotNull Bundle notificationExtras, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
        Intrinsics.checkNotNullParameter(payload, "payload");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String sendPushMessageReceivedBroadcast$lambda$9;
                sendPushMessageReceivedBroadcast$lambda$9 = BrazeNotificationUtils.sendPushMessageReceivedBroadcast$lambda$9();
                return sendPushMessageReceivedBroadcast$lambda$9;
            }
        }, 7, (Object) null);
        brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.RECEIVED, notificationExtras, payload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendPushMessageReceivedBroadcast$lambda$9() {
        return "Sending push message received broadcast";
    }

    @JvmStatic
    public static final void setAccentColorIfPresentAndSupported(@NotNull m.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Integer accentColor = payload.getAccentColor();
        if (accentColor != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.W0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String accentColorIfPresentAndSupported$lambda$51;
                    accentColorIfPresentAndSupported$lambda$51 = BrazeNotificationUtils.setAccentColorIfPresentAndSupported$lambda$51();
                    return accentColorIfPresentAndSupported$lambda$51;
                }
            }, 7, (Object) null);
            notificationBuilder.j(accentColor.intValue());
            return;
        }
        BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
        if (configurationProvider != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.X0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String accentColorIfPresentAndSupported$lambda$53$lambda$52;
                    accentColorIfPresentAndSupported$lambda$53$lambda$52 = BrazeNotificationUtils.setAccentColorIfPresentAndSupported$lambda$53$lambda$52();
                    return accentColorIfPresentAndSupported$lambda$53$lambda$52;
                }
            }, 7, (Object) null);
            notificationBuilder.j(configurationProvider.getDefaultNotificationAccentColor());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setAccentColorIfPresentAndSupported$lambda$51() {
        return "Using accent color for notification from extras bundle";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setAccentColorIfPresentAndSupported$lambda$53$lambda$52() {
        return "Using default accent color for notification";
    }

    @JvmStatic
    public static final void setCategoryIfPresentAndSupported(@NotNull m.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        String notificationCategory = payload.getNotificationCategory();
        if (notificationCategory == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.P0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String categoryIfPresentAndSupported$lambda$55;
                    categoryIfPresentAndSupported$lambda$55 = BrazeNotificationUtils.setCategoryIfPresentAndSupported$lambda$55();
                    return categoryIfPresentAndSupported$lambda$55;
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.O0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String categoryIfPresentAndSupported$lambda$54;
                    categoryIfPresentAndSupported$lambda$54 = BrazeNotificationUtils.setCategoryIfPresentAndSupported$lambda$54();
                    return categoryIfPresentAndSupported$lambda$54;
                }
            }, 7, (Object) null);
            Intrinsics.checkNotNull(notificationBuilder.g(notificationCategory));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCategoryIfPresentAndSupported$lambda$54() {
        return "Setting category for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCategoryIfPresentAndSupported$lambda$55() {
        return "Category not present in notification extras. Not setting category for notification.";
    }

    @JvmStatic
    public static final void setContentIfPresent(@NotNull m.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.E0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String contentIfPresent$lambda$32;
                contentIfPresent$lambda$32 = BrazeNotificationUtils.setContentIfPresent$lambda$32();
                return contentIfPresent$lambda$32;
            }
        }, 7, (Object) null);
        String contentText = payload.getContentText();
        if (contentText == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return;
        }
        notificationBuilder.m(HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setContentIfPresent$lambda$32() {
        return "Setting content for notification";
    }

    @JvmStatic
    public static final void setContentIntentIfPresent(@NotNull Context context, @NotNull m.e notificationBuilder, @Nullable Bundle notificationExtras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        try {
            notificationBuilder.l(INSTANCE.getPushActionPendingIntent(context, "com.braze.action.BRAZE_PUSH_CLICKED", notificationExtras));
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: i4.Y0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String contentIntentIfPresent$lambda$34;
                    contentIntentIfPresent$lambda$34 = BrazeNotificationUtils.setContentIntentIfPresent$lambda$34();
                    return contentIntentIfPresent$lambda$34;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setContentIntentIfPresent$lambda$34() {
        return "Error setting content intent.";
    }

    @JvmStatic
    public static final void setDeleteIntent(@NotNull Context context, @NotNull m.e notificationBuilder, @Nullable Bundle notificationExtras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        try {
            Intent intent = new Intent("com.braze.action.BRAZE_PUSH_DELETED").setClass(context, getNotificationReceiverClass());
            Intrinsics.checkNotNullExpressionValue(intent, "setClass(...)");
            if (notificationExtras != null) {
                intent.putExtras(notificationExtras);
            }
            notificationBuilder.r(PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: i4.D0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String deleteIntent$lambda$35;
                    deleteIntent$lambda$35 = BrazeNotificationUtils.setDeleteIntent$lambda$35();
                    return deleteIntent$lambda$35;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDeleteIntent$lambda$35() {
        return "Error setting delete intent.";
    }

    @JvmStatic
    public static final boolean setLargeIconIfPresentAndSupported(@NotNull m.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        BrazeLogger brazeLogger;
        BrazeNotificationUtils brazeNotificationUtils;
        String largeIcon;
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.getIsPushStory()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.a1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String largeIconIfPresentAndSupported$lambda$39;
                    largeIconIfPresentAndSupported$lambda$39 = BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$39();
                    return largeIconIfPresentAndSupported$lambda$39;
                }
            }, 7, (Object) null);
            return false;
        }
        Context context = payload.getContext();
        if (context == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return false;
        }
        try {
            brazeLogger = BrazeLogger.INSTANCE;
            brazeNotificationUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.b1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String largeIconIfPresentAndSupported$lambda$40;
                    largeIconIfPresentAndSupported$lambda$40 = BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$40();
                    return largeIconIfPresentAndSupported$lambda$40;
                }
            }, 7, (Object) null);
            largeIcon = payload.getLargeIcon();
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: i4.f1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String largeIconIfPresentAndSupported$lambda$44;
                    largeIconIfPresentAndSupported$lambda$44 = BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$44();
                    return largeIconIfPresentAndSupported$lambda$44;
                }
            }, 4, (Object) null);
        }
        if (largeIcon != null) {
            notificationBuilder.x(Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, null, largeIcon, BrazeViewBounds.NOTIFICATION_LARGE_ICON));
            return true;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.d1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String largeIconIfPresentAndSupported$lambda$42;
                largeIconIfPresentAndSupported$lambda$42 = BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$42();
                return largeIconIfPresentAndSupported$lambda$42;
            }
        }, 7, (Object) null);
        int largeNotificationIconResourceId = configurationProvider.getLargeNotificationIconResourceId();
        if (largeNotificationIconResourceId != 0) {
            notificationBuilder.x(BitmapFactory.decodeResource(context.getResources(), largeNotificationIconResourceId));
            return true;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.e1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String largeIconIfPresentAndSupported$lambda$43;
                largeIconIfPresentAndSupported$lambda$43 = BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$43();
                return largeIconIfPresentAndSupported$lambda$43;
            }
        }, 7, (Object) null);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.g1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String largeIconIfPresentAndSupported$lambda$45;
                largeIconIfPresentAndSupported$lambda$45 = BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$45();
                return largeIconIfPresentAndSupported$lambda$45;
            }
        }, 7, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$39() {
        return "Large icon not supported in story push.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$40() {
        return "Setting large icon for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$42() {
        return "Large icon bitmap url not present in extras. Attempting to use resource id instead.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$43() {
        return "Large icon resource id not present for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$44() {
        return "Error setting large notification icon";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$45() {
        return "Large icon not set for notification";
    }

    @JvmStatic
    public static final void setNotificationBadgeNumberIfPresent(@NotNull m.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Integer notificationBadgeNumber = payload.getNotificationBadgeNumber();
        if (notificationBadgeNumber != null) {
            notificationBuilder.A(notificationBadgeNumber.intValue());
        }
    }

    @JvmStatic
    public static final void setNotificationDurationAlarm(@NotNull Context context, @Nullable Class<?> thisClass, int notificationId, final int durationInMillis) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, thisClass);
        intent.setAction("com.braze.action.CANCEL_NOTIFICATION");
        intent.putExtra("nid", notificationId);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 134217728 | IntentUtils.getImmutablePendingIntentFlags());
        Object systemService = context.getSystemService("alarm");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        if (durationInMillis >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.j0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String notificationDurationAlarm$lambda$16;
                    notificationDurationAlarm$lambda$16 = BrazeNotificationUtils.setNotificationDurationAlarm$lambda$16(durationInMillis);
                    return notificationDurationAlarm$lambda$16;
                }
            }, 7, (Object) null);
            alarmManager.set(3, SystemClock.elapsedRealtime() + durationInMillis, broadcast);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setNotificationDurationAlarm$lambda$16(int i6) {
        return "Setting Notification duration alarm for " + i6 + " ms";
    }

    @JvmStatic
    public static final void setPriorityIfPresentAndSupported(@NotNull m.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.M0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String priorityIfPresentAndSupported$lambda$50;
                priorityIfPresentAndSupported$lambda$50 = BrazeNotificationUtils.setPriorityIfPresentAndSupported$lambda$50();
                return priorityIfPresentAndSupported$lambda$50;
            }
        }, 7, (Object) null);
        notificationBuilder.D(getNotificationPriority(payload));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPriorityIfPresentAndSupported$lambda$50() {
        return "Setting priority for notification";
    }

    @JvmStatic
    public static final void setPublicVersionIfPresentAndSupported(@NotNull m.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
        if (context == null || payload.getPublicNotificationExtras() == null || configurationProvider == null) {
            return;
        }
        String orCreateNotificationChannelId = getOrCreateNotificationChannelId(payload);
        Bundle parseJsonObjectIntoBundle = JsonUtils.parseJsonObjectIntoBundle(payload.getPublicNotificationExtras());
        if (parseJsonObjectIntoBundle.isEmpty()) {
            return;
        }
        final BrazeNotificationPayload brazeNotificationPayload = new BrazeNotificationPayload(parseJsonObjectIntoBundle, null, context, configurationProvider, 2, null);
        m.e eVar = new m.e(context, orCreateNotificationChannelId);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.L0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String publicVersionIfPresentAndSupported$lambda$58;
                publicVersionIfPresentAndSupported$lambda$58 = BrazeNotificationUtils.setPublicVersionIfPresentAndSupported$lambda$58(BrazeNotificationPayload.this);
                return publicVersionIfPresentAndSupported$lambda$58;
            }
        }, 7, (Object) null);
        setContentIfPresent(eVar, brazeNotificationPayload);
        setTitleIfPresent(eVar, brazeNotificationPayload);
        setSummaryTextIfPresentAndSupported(eVar, brazeNotificationPayload);
        setSmallIcon(configurationProvider, eVar);
        setAccentColorIfPresentAndSupported(eVar, brazeNotificationPayload);
        notificationBuilder.F(eVar.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPublicVersionIfPresentAndSupported$lambda$58(BrazeNotificationPayload brazeNotificationPayload) {
        return "Setting public version of notification with payload: " + brazeNotificationPayload;
    }

    @JvmStatic
    public static final void setSetShowWhen(@NotNull m.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.getIsPushStory()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.I0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String setShowWhen$lambda$38;
                    setShowWhen$lambda$38 = BrazeNotificationUtils.setSetShowWhen$lambda$38();
                    return setShowWhen$lambda$38;
                }
            }, 7, (Object) null);
            notificationBuilder.H(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSetShowWhen$lambda$38() {
        return "Set show when not supported in story push.";
    }

    @JvmStatic
    public static final int setSmallIcon(@NotNull BrazeConfigurationProvider appConfigurationProvider, @NotNull m.e notificationBuilder) {
        Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        int smallNotificationIconResourceId = appConfigurationProvider.getSmallNotificationIconResourceId();
        if (smallNotificationIconResourceId == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.F0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String smallIcon$lambda$36;
                    smallIcon$lambda$36 = BrazeNotificationUtils.setSmallIcon$lambda$36();
                    return smallIcon$lambda$36;
                }
            }, 7, (Object) null);
            smallNotificationIconResourceId = appConfigurationProvider.getApplicationIconResourceId();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.H0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String smallIcon$lambda$37;
                    smallIcon$lambda$37 = BrazeNotificationUtils.setSmallIcon$lambda$37();
                    return smallIcon$lambda$37;
                }
            }, 7, (Object) null);
        }
        notificationBuilder.J(smallNotificationIconResourceId);
        return smallNotificationIconResourceId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSmallIcon$lambda$36() {
        return "Small notification icon resource was not found. Will use the app icon when displaying notifications.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSmallIcon$lambda$37() {
        return "Setting small icon for notification via resource id";
    }

    @JvmStatic
    public static final void setSoundIfPresentAndSupported(@NotNull m.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        String notificationSound = payload.getNotificationSound();
        if (notificationSound == null) {
            return;
        }
        if (Intrinsics.areEqual(notificationSound, "d")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.J0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String soundIfPresentAndSupported$lambda$46;
                    soundIfPresentAndSupported$lambda$46 = BrazeNotificationUtils.setSoundIfPresentAndSupported$lambda$46();
                    return soundIfPresentAndSupported$lambda$46;
                }
            }, 7, (Object) null);
            notificationBuilder.q(1);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.K0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String soundIfPresentAndSupported$lambda$47;
                    soundIfPresentAndSupported$lambda$47 = BrazeNotificationUtils.setSoundIfPresentAndSupported$lambda$47();
                    return soundIfPresentAndSupported$lambda$47;
                }
            }, 7, (Object) null);
            notificationBuilder.K(Uri.parse(notificationSound));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSoundIfPresentAndSupported$lambda$46() {
        return "Setting default sound for notification.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSoundIfPresentAndSupported$lambda$47() {
        return "Setting sound for notification via uri.";
    }

    @JvmStatic
    public static final void setSummaryTextIfPresentAndSupported(@NotNull m.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        String summaryText = payload.getSummaryText();
        if (summaryText == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.V0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String summaryTextIfPresentAndSupported$lambda$49;
                    summaryTextIfPresentAndSupported$lambda$49 = BrazeNotificationUtils.setSummaryTextIfPresentAndSupported$lambda$49();
                    return summaryTextIfPresentAndSupported$lambda$49;
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.U0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String summaryTextIfPresentAndSupported$lambda$48;
                    summaryTextIfPresentAndSupported$lambda$48 = BrazeNotificationUtils.setSummaryTextIfPresentAndSupported$lambda$48();
                    return summaryTextIfPresentAndSupported$lambda$48;
                }
            }, 7, (Object) null);
            Intrinsics.checkNotNull(notificationBuilder.M(summaryText));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSummaryTextIfPresentAndSupported$lambda$48() {
        return "Setting summary text for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSummaryTextIfPresentAndSupported$lambda$49() {
        return "Summary text not present. Not setting summary text for notification.";
    }

    @JvmStatic
    public static final void setTickerIfPresent(@NotNull m.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.T0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String tickerIfPresent$lambda$33;
                tickerIfPresent$lambda$33 = BrazeNotificationUtils.setTickerIfPresent$lambda$33();
                return tickerIfPresent$lambda$33;
            }
        }, 7, (Object) null);
        String titleText = payload.getTitleText();
        if (titleText == null) {
            return;
        }
        notificationBuilder.N(titleText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setTickerIfPresent$lambda$33() {
        return "Setting ticker for notification";
    }

    @JvmStatic
    public static final void setTitleIfPresent(@NotNull m.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.Z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String titleIfPresent$lambda$31;
                titleIfPresent$lambda$31 = BrazeNotificationUtils.setTitleIfPresent$lambda$31();
                return titleIfPresent$lambda$31;
            }
        }, 7, (Object) null);
        String titleText = payload.getTitleText();
        if (titleText == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return;
        }
        notificationBuilder.n(HtmlUtils.getHtmlSpannedTextIfEnabled(titleText, configurationProvider));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setTitleIfPresent$lambda$31() {
        return "Setting title for notification";
    }

    @JvmStatic
    public static final void setVisibilityIfPresentAndSupported(@NotNull m.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        final Integer notificationVisibility = payload.getNotificationVisibility();
        if (notificationVisibility != null) {
            if (!isValidNotificationVisibility(notificationVisibility.intValue())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: i4.S0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String visibilityIfPresentAndSupported$lambda$57;
                        visibilityIfPresentAndSupported$lambda$57 = BrazeNotificationUtils.setVisibilityIfPresentAndSupported$lambda$57(notificationVisibility);
                        return visibilityIfPresentAndSupported$lambda$57;
                    }
                }, 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.Q0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String visibilityIfPresentAndSupported$lambda$56;
                        visibilityIfPresentAndSupported$lambda$56 = BrazeNotificationUtils.setVisibilityIfPresentAndSupported$lambda$56();
                        return visibilityIfPresentAndSupported$lambda$56;
                    }
                }, 7, (Object) null);
                Intrinsics.checkNotNull(notificationBuilder.R(notificationVisibility.intValue()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setVisibilityIfPresentAndSupported$lambda$56() {
        return "Setting visibility for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setVisibilityIfPresentAndSupported$lambda$57(Integer num) {
        return "Received invalid notification visibility " + num;
    }

    @JvmStatic
    public static final boolean wakeScreenIfAppropriate(@NotNull Context context, @NotNull BrazeConfigurationProvider configurationProvider, @Nullable Bundle notificationExtras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        return wakeScreenIfAppropriate(new BrazeNotificationPayload(notificationExtras, null, context, configurationProvider, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$23() {
        return "Not waking this TV UI mode device";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$24() {
        return "Failed to check for TV status during screen wake. Continuing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$25() {
        return "Not waking screen on Android O+ device, could not find notification channel.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$26(NotificationChannel notificationChannel) {
        return "Not acquiring wake-lock for Android O+ notification with importance: " + notificationChannel.getImportance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$27() {
        return "Waking screen for notification";
    }

    @JvmStatic
    @SuppressLint({"WakelockTimeout"})
    public static final boolean wakeScreenIfAppropriate(@NotNull BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        if (context == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return false;
        }
        Bundle notificationExtras = payload.getNotificationExtras();
        if (!PermissionUtils.hasPermission(context, "android.permission.WAKE_LOCK") || !configurationProvider.isPushWakeScreenForNotificationEnabled()) {
            return false;
        }
        try {
            Object systemService = context.getSystemService("uimode");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
            if (((UiModeManager) systemService).getCurrentModeType() == 4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.m1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String wakeScreenIfAppropriate$lambda$23;
                        wakeScreenIfAppropriate$lambda$23 = BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$23();
                        return wakeScreenIfAppropriate$lambda$23;
                    }
                }, 7, (Object) null);
                return false;
            }
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: i4.n1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String wakeScreenIfAppropriate$lambda$24;
                    wakeScreenIfAppropriate$lambda$24 = BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$24();
                    return wakeScreenIfAppropriate$lambda$24;
                }
            }, 4, (Object) null);
        }
        Object systemService2 = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
        final NotificationChannel validNotificationChannel = getValidNotificationChannel((NotificationManager) systemService2, notificationExtras);
        if (validNotificationChannel == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String wakeScreenIfAppropriate$lambda$25;
                    wakeScreenIfAppropriate$lambda$25 = BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$25();
                    return wakeScreenIfAppropriate$lambda$25;
                }
            }, 7, (Object) null);
            return false;
        }
        if (validNotificationChannel.getImportance() == 1) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.c0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String wakeScreenIfAppropriate$lambda$26;
                    wakeScreenIfAppropriate$lambda$26 = BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$26(validNotificationChannel);
                    return wakeScreenIfAppropriate$lambda$26;
                }
            }, 7, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String wakeScreenIfAppropriate$lambda$27;
                wakeScreenIfAppropriate$lambda$27 = BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$27();
                return wakeScreenIfAppropriate$lambda$27;
            }
        }, 7, (Object) null);
        Object systemService3 = context.getSystemService("power");
        Intrinsics.checkNotNull(systemService3, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService3).newWakeLock(268435482, TAG);
        newWakeLock.acquire();
        newWakeLock.release();
        return true;
    }

    private final void routeUserWithNotificationOpenedIntent(Context context, Bundle extras, final String deepLink, final boolean useWebView) {
        if (deepLink != null && !StringsKt.isBlank(deepLink)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.z0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String routeUserWithNotificationOpenedIntent$lambda$6;
                    routeUserWithNotificationOpenedIntent$lambda$6 = BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$6(deepLink, useWebView);
                    return routeUserWithNotificationOpenedIntent$lambda$6;
                }
            }, 7, (Object) null);
            extras.putString("uri", deepLink);
            extras.putBoolean("ab_use_webview", useWebView);
            BrazeDeeplinkHandler.Companion companion = BrazeDeeplinkHandler.INSTANCE;
            UriAction createUriActionFromUrlString = companion.getInstance().createUriActionFromUrlString(deepLink, extras, useWebView, Channel.PUSH);
            if (createUriActionFromUrlString != null) {
                companion.getInstance().gotoUri(context, createUriActionFromUrlString);
                return;
            }
            return;
        }
        final Intent mainActivityIntent = UriUtils.getMainActivityIntent(context, extras);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.A0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String routeUserWithNotificationOpenedIntent$lambda$8;
                routeUserWithNotificationOpenedIntent$lambda$8 = BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$8(mainActivityIntent);
                return routeUserWithNotificationOpenedIntent$lambda$8;
            }
        }, 7, (Object) null);
        context.startActivity(mainActivityIntent);
    }

    private final void sendPushActionIntent(Context context, final Intent pushIntent, Bundle notificationExtras) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: i4.C0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String sendPushActionIntent$lambda$80;
                sendPushActionIntent$lambda$80 = BrazeNotificationUtils.sendPushActionIntent$lambda$80(pushIntent);
                return sendPushActionIntent$lambda$80;
            }
        }, 6, (Object) null);
        if (notificationExtras != null) {
            pushIntent.putExtras(notificationExtras);
        }
        IntentUtils.addComponentAndSendBroadcast(context, pushIntent);
    }
}
