package com.braze.models.push;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.t;
import com.amazon.a.a.o.b;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\t\n\u0002\bV\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u000f\b\u0007\u0018\u0000 Ç\u00012\u00020\u0001:\nÈ\u0001É\u0001Ê\u0001Ë\u0001Ç\u0001B7\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018\"\u0004\b\u001a\u0010\u001bR.\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00100\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b0\u00102\"\u0004\b3\u00104R\"\u00105\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00101\u001a\u0004\b5\u00102\"\u0004\b6\u00104R\"\u00107\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b7\u00102\"\u0004\b8\u00104R$\u00109\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u0010\"\u0004\b<\u0010=R$\u0010>\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010:\u001a\u0004\b?\u0010\u0010\"\u0004\b@\u0010=R$\u0010A\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010:\u001a\u0004\bB\u0010\u0010\"\u0004\bC\u0010=R$\u0010D\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010*\u001a\u0004\bE\u0010,\"\u0004\bF\u0010.R$\u0010G\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010*\u001a\u0004\bH\u0010,\"\u0004\bI\u0010.R$\u0010J\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010*\u001a\u0004\bK\u0010,\"\u0004\bL\u0010.R$\u0010N\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010T\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010*\u001a\u0004\bU\u0010,\"\u0004\bV\u0010.R\"\u0010W\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u00101\u001a\u0004\bX\u00102\"\u0004\bY\u00104R\"\u0010Z\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u00101\u001a\u0004\b[\u00102\"\u0004\b\\\u00104R\"\u0010]\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u00101\u001a\u0004\b^\u00102\"\u0004\b_\u00104R\"\u0010`\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u00101\u001a\u0004\ba\u00102\"\u0004\bb\u00104R\"\u0010c\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u00101\u001a\u0004\bc\u00102\"\u0004\bd\u00104R$\u0010e\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010:\u001a\u0004\bf\u0010\u0010\"\u0004\bg\u0010=R$\u0010h\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010:\u001a\u0004\bi\u0010\u0010\"\u0004\bj\u0010=R$\u0010k\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR$\u0010q\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010:\u001a\u0004\br\u0010\u0010\"\u0004\bs\u0010=R$\u0010t\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010:\u001a\u0004\bu\u0010\u0010\"\u0004\bv\u0010=R$\u0010w\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010:\u001a\u0004\bx\u0010\u0010\"\u0004\by\u0010=R$\u0010z\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010:\u001a\u0004\b{\u0010\u0010\"\u0004\b|\u0010=R$\u0010}\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010:\u001a\u0004\b~\u0010\u0010\"\u0004\b\u007f\u0010=R(\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010:\u001a\u0005\b\u0081\u0001\u0010\u0010\"\u0005\b\u0082\u0001\u0010=R(\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010:\u001a\u0005\b\u0084\u0001\u0010\u0010\"\u0005\b\u0085\u0001\u0010=R(\u0010\u0086\u0001\u001a\u0004\u0018\u00010(8G@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010*\u001a\u0005\b\u0087\u0001\u0010,\"\u0005\b\u0088\u0001\u0010.R(\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010:\u001a\u0005\b\u008a\u0001\u0010\u0010\"\u0005\b\u008b\u0001\u0010=R(\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010:\u001a\u0005\b\u008d\u0001\u0010\u0010\"\u0005\b\u008e\u0001\u0010=R-\u0010\u008f\u0001\u001a\u00020/8\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0005\b\u008f\u0001\u00101\u0012\u0005\b\u0091\u0001\u0010\r\u001a\u0005\b\u008f\u0001\u00102\"\u0005\b\u0090\u0001\u00104R/\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0005\b\u0092\u0001\u0010:\u0012\u0005\b\u0095\u0001\u0010\r\u001a\u0005\b\u0093\u0001\u0010\u0010\"\u0005\b\u0094\u0001\u0010=R0\u0010\u0096\u0001\u001a\u00020M8\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u0012\u0005\b\u009c\u0001\u0010\r\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R0\u0010\u009d\u0001\u001a\u00020M8\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\b\u009d\u0001\u0010\u0097\u0001\u0012\u0005\b \u0001\u0010\r\u001a\u0006\b\u009e\u0001\u0010\u0099\u0001\"\u0006\b\u009f\u0001\u0010\u009b\u0001R(\u0010¡\u0001\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¡\u0001\u0010:\u001a\u0005\b¢\u0001\u0010\u0010\"\u0005\b£\u0001\u0010=R!\u0010¦\u0001\u001a\n\u0012\u0005\u0012\u00030¥\u00010¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R)\u0010¨\u0001\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R!\u0010¯\u0001\u001a\n\u0012\u0005\u0012\u00030®\u00010¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010§\u0001R&\u0010°\u0001\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b°\u0001\u00101\u001a\u0005\b°\u0001\u00102\"\u0005\b±\u0001\u00104R\u001f\u0010³\u0001\u001a\n\u0012\u0005\u0012\u00030²\u00010¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010§\u0001R&\u0010¶\u0001\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0005\u0012\u00030µ\u00010´\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¶\u0001\u0010\u001eR(\u0010·\u0001\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b·\u0001\u0010:\u001a\u0005\b¸\u0001\u0010\u0010\"\u0005\b¹\u0001\u0010=R,\u0010»\u0001\u001a\u0004\u0018\u00010\u000e2\t\u0010º\u0001\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b»\u0001\u0010:\u001a\u0005\b¼\u0001\u0010\u0010R\u001c\u0010À\u0001\u001a\n\u0012\u0005\u0012\u00030¥\u00010½\u00018F¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u001c\u0010Â\u0001\u001a\n\u0012\u0005\u0012\u00030®\u00010½\u00018F¢\u0006\b\u001a\u0006\bÁ\u0001\u0010¿\u0001R\u001c\u0010Ä\u0001\u001a\n\u0012\u0005\u0012\u00030²\u00010½\u00018F¢\u0006\b\u001a\u0006\bÃ\u0001\u0010¿\u0001R\"\u0010Æ\u0001\u001a\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0005\u0012\u00030µ\u00010\u001c8F¢\u0006\u0007\u001a\u0005\bÅ\u0001\u0010 ¨\u0006Ì\u0001"}, d2 = {"Lcom/braze/models/push/BrazeNotificationPayload;", "", "Landroid/os/Bundle;", "notificationExtras", "brazeExtras", "Landroid/content/Context;", "context", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "<init>", "(Landroid/os/Bundle;Landroid/os/Bundle;Landroid/content/Context;Lcom/braze/configuration/BrazeConfigurationProvider;)V", "", "parsePayloadFieldsFromBundle", "()V", "", "toString", "()Ljava/lang/String;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProvider", "()Lcom/braze/configuration/BrazeConfigurationProvider;", "setConfigurationProvider", "(Lcom/braze/configuration/BrazeConfigurationProvider;)V", "Landroid/os/Bundle;", "getNotificationExtras", "()Landroid/os/Bundle;", "getBrazeExtras", "setBrazeExtras", "(Landroid/os/Bundle;)V", "", "extras", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "setExtras", "(Ljava/util/Map;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "", "pushDuration", "Ljava/lang/Integer;", "getPushDuration", "()Ljava/lang/Integer;", "setPushDuration", "(Ljava/lang/Integer;)V", "", "isPushStory", "Z", "()Z", "setPushStory", "(Z)V", "isInlineImagePush", "setInlineImagePush", "isConversationalPush", "setConversationalPush", "publicNotificationExtras", "Ljava/lang/String;", "getPublicNotificationExtras", "setPublicNotificationExtras", "(Ljava/lang/String;)V", "notificationChannelId", "getNotificationChannelId", "setNotificationChannelId", "notificationCategory", "getNotificationCategory", "setNotificationCategory", "notificationVisibility", "getNotificationVisibility", "setNotificationVisibility", "notificationBadgeNumber", "getNotificationBadgeNumber", "setNotificationBadgeNumber", "customNotificationId", "getCustomNotificationId", "setCustomNotificationId", "", "notificationReceivedTimestampMillis", "Ljava/lang/Long;", "getNotificationReceivedTimestampMillis", "()Ljava/lang/Long;", "setNotificationReceivedTimestampMillis", "(Ljava/lang/Long;)V", "notificationPriorityInt", "getNotificationPriorityInt", "setNotificationPriorityInt", "shouldFetchTestTriggers", "getShouldFetchTestTriggers", "setShouldFetchTestTriggers", "shouldSyncGeofences", "getShouldSyncGeofences", "setShouldSyncGeofences", "shouldRefreshFeatureFlags", "getShouldRefreshFeatureFlags", "setShouldRefreshFeatureFlags", "shouldRefreshBanners", "getShouldRefreshBanners", "setShouldRefreshBanners", "isUninstallTrackingPush", "setUninstallTrackingPush", "deeplink", "getDeeplink", "setDeeplink", "pushUniqueId", "getPushUniqueId", "setPushUniqueId", "useWebView", "Ljava/lang/Boolean;", "getUseWebView", "()Ljava/lang/Boolean;", "setUseWebView", "(Ljava/lang/Boolean;)V", "contentCardSyncData", "getContentCardSyncData", "setContentCardSyncData", "contentCardSyncUserId", "getContentCardSyncUserId", "setContentCardSyncUserId", "titleText", "getTitleText", "setTitleText", "contentText", "getContentText", "setContentText", "largeIcon", "getLargeIcon", "setLargeIcon", "notificationSound", "getNotificationSound", "setNotificationSound", "summaryText", "getSummaryText", "setSummaryText", "accentColor", "getAccentColor", "setAccentColor", "bigSummaryText", "getBigSummaryText", "setBigSummaryText", "bigTitleText", "getBigTitleText", "setBigTitleText", "isPushDeliveryEnabled", "setPushDeliveryEnabled", "isPushDeliveryEnabled$annotations", "campaignId", "getCampaignId", "setCampaignId", "getCampaignId$annotations", "flushMinMinutes", "J", "getFlushMinMinutes", "()J", "setFlushMinMinutes", "(J)V", "getFlushMinMinutes$annotations", "flushMaxMinutes", "getFlushMaxMinutes", "setFlushMaxMinutes", "getFlushMaxMinutes$annotations", "bigImageUrl", "getBigImageUrl", "setBigImageUrl", "", "Lcom/braze/models/push/BrazeNotificationPayload$ActionButton;", "actionButtonsInternal", "Ljava/util/List;", "pushStoryPageIndex", "I", "getPushStoryPageIndex", "()I", "setPushStoryPageIndex", "(I)V", "Lcom/braze/models/push/BrazeNotificationPayload$PushStoryPage;", "pushStoryPagesInternal", "isNewlyReceivedPushStory", "setNewlyReceivedPushStory", "Lcom/braze/models/push/BrazeNotificationPayload$ConversationMessage;", "conversationMessagesInternal", "", "Lcom/braze/models/push/BrazeNotificationPayload$ConversationPerson;", "conversationPersonMapInternal", "conversationShortcutId", "getConversationShortcutId", "setConversationShortcutId", b.f11195Y, "conversationReplyPersonId", "getConversationReplyPersonId", "", "getActionButtons", "()Ljava/util/List;", "actionButtons", "getPushStoryPages", "pushStoryPages", "getConversationMessages", "conversationMessages", "getConversationPersonMap", "conversationPersonMap", "Companion", "ActionButton", "PushStoryPage", "ConversationMessage", "ConversationPerson", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class BrazeNotificationPayload {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Integer accentColor;
    private List<ActionButton> actionButtonsInternal;
    private String bigImageUrl;
    private String bigSummaryText;
    private String bigTitleText;
    private Bundle brazeExtras;
    private String campaignId;
    private BrazeConfigurationProvider configurationProvider;
    private String contentCardSyncData;
    private String contentCardSyncUserId;
    private String contentText;
    private Context context;
    private final List<ConversationMessage> conversationMessagesInternal;
    private final Map<String, ConversationPerson> conversationPersonMapInternal;
    private String conversationReplyPersonId;
    private String conversationShortcutId;
    private Integer customNotificationId;
    private String deeplink;
    private Map<String, String> extras;
    private long flushMaxMinutes;
    private long flushMinMinutes;
    private boolean isConversationalPush;
    private boolean isInlineImagePush;
    private boolean isNewlyReceivedPushStory;
    private boolean isPushDeliveryEnabled;
    private boolean isPushStory;
    private boolean isUninstallTrackingPush;
    private String largeIcon;
    private Integer notificationBadgeNumber;
    private String notificationCategory;
    private String notificationChannelId;
    private final Bundle notificationExtras;
    private Integer notificationPriorityInt;
    private Long notificationReceivedTimestampMillis;
    private String notificationSound;
    private Integer notificationVisibility;
    private String publicNotificationExtras;
    private Integer pushDuration;
    private int pushStoryPageIndex;
    private List<PushStoryPage> pushStoryPagesInternal;
    private String pushUniqueId;
    private boolean shouldFetchTestTriggers;
    private boolean shouldRefreshBanners;
    private boolean shouldRefreshFeatureFlags;
    private boolean shouldSyncGeofences;
    private String summaryText;
    private String titleText;
    private Boolean useWebView;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0018R$\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0018R$\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u0018R$\u0010\"\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0018¨\u0006%"}, d2 = {"Lcom/braze/models/push/BrazeNotificationPayload$ActionButton;", "", "Landroid/os/Bundle;", "notificationExtras", "", "actionIndex", "<init>", "(Landroid/os/Bundle;I)V", "destination", "", "putIntoBundle", "(Landroid/os/Bundle;)V", "", "toString", "()Ljava/lang/String;", "I", "getActionIndex", "()I", "setActionIndex", "(I)V", "type", "Ljava/lang/String;", "getType", "setType", "(Ljava/lang/String;)V", "actionId", "getActionId", "setActionId", "uri", "getUri", "setUri", "useWebview", "getUseWebview", "setUseWebview", "text", "getText", "setText", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class ActionButton {
        private String actionId;
        private int actionIndex;
        private String text;
        private String type;
        private String uri;
        private String useWebview;

        public ActionButton(Bundle notificationExtras, int i6) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            this.actionIndex = i6;
            Companion companion = BrazeNotificationPayload.INSTANCE;
            this.type = companion.getTemplateFieldAtIndex(i6, notificationExtras, "ab_a*_a");
            this.actionId = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, "ab_a*_id");
            this.uri = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, "ab_a*_uri");
            this.useWebview = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, "ab_a*_use_webview");
            this.text = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, "ab_a*_t");
        }

        public final String getText() {
            return this.text;
        }

        public final String getType() {
            return this.type;
        }

        public final void putIntoBundle(Bundle destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            destination.putInt("braze_action_index", this.actionIndex);
            destination.putString("braze_action_type", this.type);
            destination.putString("braze_action_id", this.actionId);
            destination.putString("braze_action_uri", this.uri);
            destination.putString("braze_action_use_webview", this.useWebview);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.INSTANCE;
            sb.append(companion.stringAndKey("ActionIndex", Integer.valueOf(this.actionIndex)));
            sb.append(companion.stringAndKey("Type", this.type));
            sb.append(companion.stringAndKey("Id", this.actionId));
            sb.append(companion.stringAndKey("Uri", this.uri));
            sb.append(companion.stringAndKey("UseWebview", this.useWebview));
            sb.append(companion.stringAndKey("Text", this.text));
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0013J/\u0010\u0010\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0010\u0010\u0016J/\u0010\u0010\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0010\u0010\u0018J'\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b%\u0010\"J!\u0010&\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b(\u0010\u001eJ!\u0010)\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b)\u0010'¨\u0006*"}, d2 = {"Lcom/braze/models/push/BrazeNotificationPayload$Companion;", "", "<init>", "()V", "", "prefix", b.f11195Y, "stringAndKey", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;", "Landroid/os/Bundle;", "notificationExtras", "getAttachedBrazeExtras", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "", "index", "actionFieldKeyTemplate", "getTemplateFieldAtIndex", "(ILandroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;", "defaultValue", "(ILandroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "actionIndex", "", "(ILandroid/os/Bundle;Ljava/lang/String;Z)Z", "", "(ILandroid/os/Bundle;Ljava/lang/String;J)J", "getPushStoryGravityAtIndex", "(ILandroid/os/Bundle;Ljava/lang/String;)I", "bundle", "key", "parseStringAsInteger", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "parseObjectAsInteger", "(Landroid/os/Bundle;Ljava/lang/String;I)I", "parseStringAsLong", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Long;", "parseStringAsBoolean", "(Landroid/os/Bundle;Ljava/lang/String;)Z", "parseLong", "parseString", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;", "parseStringAsColorInt", "parseNonBlankString", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getTemplateFieldAtIndex$lambda$0() {
            return "Failed to parse action field boolean. Returning default.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getTemplateFieldAtIndex$lambda$1() {
            return "Failed to parse action field long. Returning default.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseLong$lambda$10(String str, Bundle bundle) {
            return "Failed to parse long with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseNonBlankString$lambda$14(String str, Bundle bundle) {
            return "Failed to parse non blank string with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseObjectAsInteger$lambda$5(String str, Bundle bundle) {
            return "Failed to parse string as int with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseString$lambda$11(String str, Bundle bundle) {
            return "Failed to parse string with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseStringAsBoolean$lambda$9(String str, Bundle bundle) {
            return "Failed to parse string as boolean with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseStringAsColorInt$lambda$13(String str, Bundle bundle) {
            return "Failed to parse string as color int with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseStringAsInteger$lambda$3(String str, Bundle bundle) {
            return "Failed to parse string as int with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseStringAsLong$lambda$7(String str, Bundle bundle) {
            return "Failed to parse string as long with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String stringAndKey(String prefix, Object value) {
            if (value == null) {
                return "";
            }
            return "\n" + prefix + " = " + value;
        }

        @JvmStatic
        public final Bundle getAttachedBrazeExtras(Bundle notificationExtras) {
            if (notificationExtras == null) {
                return new Bundle();
            }
            if (notificationExtras.containsKey("braze_story_newly_received") && !notificationExtras.getBoolean("braze_story_newly_received")) {
                Bundle bundle = notificationExtras.getBundle("extra");
                return bundle == null ? new Bundle() : bundle;
            }
            if (Constants.isAmazonDevice()) {
                return new Bundle(notificationExtras);
            }
            Object obj = notificationExtras.get("extra");
            return obj instanceof String ? JsonUtils.parseJsonObjectIntoBundle((String) obj) : obj instanceof Bundle ? (Bundle) obj : new Bundle();
        }

        @JvmStatic
        public final int getPushStoryGravityAtIndex(int actionIndex, Bundle notificationExtras, String actionFieldKeyTemplate) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Intrinsics.checkNotNullParameter(actionFieldKeyTemplate, "actionFieldKeyTemplate");
            String string = notificationExtras.getString(StringsKt.replace$default(actionFieldKeyTemplate, "*", String.valueOf(actionIndex), false, 4, (Object) null));
            if (string == null || StringsKt.isBlank(string)) {
                return 17;
            }
            int hashCode = string.hashCode();
            if (hashCode != -1364013995) {
                return hashCode != 100571 ? (hashCode == 109757538 && string.equals("start")) ? 8388611 : 17 : !string.equals("end") ? 17 : 8388613;
            }
            string.equals("center");
            return 17;
        }

        @JvmStatic
        public final String getTemplateFieldAtIndex(int index, Bundle notificationExtras, String actionFieldKeyTemplate) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Intrinsics.checkNotNullParameter(actionFieldKeyTemplate, "actionFieldKeyTemplate");
            return getTemplateFieldAtIndex(index, notificationExtras, actionFieldKeyTemplate, "");
        }

        @JvmStatic
        public final Long parseLong(final Bundle bundle, final String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                if (bundle.containsKey(key)) {
                    return Long.valueOf(bundle.getLong(key));
                }
                return null;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: g4.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String parseLong$lambda$10;
                        parseLong$lambda$10 = BrazeNotificationPayload.Companion.parseLong$lambda$10(key, bundle);
                        return parseLong$lambda$10;
                    }
                }, 7, (Object) null);
                return null;
            }
        }

        @JvmStatic
        public final String parseNonBlankString(final Bundle bundle, final String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                String parseString = parseString(bundle, key);
                if (parseString == null) {
                    return null;
                }
                if (StringsKt.isBlank(parseString)) {
                    return null;
                }
                return parseString;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: g4.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String parseNonBlankString$lambda$14;
                        parseNonBlankString$lambda$14 = BrazeNotificationPayload.Companion.parseNonBlankString$lambda$14(key, bundle);
                        return parseNonBlankString$lambda$14;
                    }
                }, 7, (Object) null);
                return null;
            }
        }

        @JvmStatic
        public final int parseObjectAsInteger(final Bundle bundle, final String key, int defaultValue) {
            Object obj;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                if (bundle.containsKey(key) && (obj = bundle.get(key)) != null) {
                    return Integer.parseInt(obj.toString());
                }
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: g4.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String parseObjectAsInteger$lambda$5;
                        parseObjectAsInteger$lambda$5 = BrazeNotificationPayload.Companion.parseObjectAsInteger$lambda$5(key, bundle);
                        return parseObjectAsInteger$lambda$5;
                    }
                }, 7, (Object) null);
            }
            return defaultValue;
        }

        @JvmStatic
        public final String parseString(final Bundle bundle, final String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                if (bundle.containsKey(key)) {
                    return bundle.getString(key);
                }
                return null;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: g4.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String parseString$lambda$11;
                        parseString$lambda$11 = BrazeNotificationPayload.Companion.parseString$lambda$11(key, bundle);
                        return parseString$lambda$11;
                    }
                }, 7, (Object) null);
                return null;
            }
        }

        @JvmStatic
        public final boolean parseStringAsBoolean(final Bundle bundle, final String key) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                if (!bundle.containsKey(key) || (string = bundle.getString(key)) == null) {
                    return false;
                }
                return Boolean.parseBoolean(string);
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: g4.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String parseStringAsBoolean$lambda$9;
                        parseStringAsBoolean$lambda$9 = BrazeNotificationPayload.Companion.parseStringAsBoolean$lambda$9(key, bundle);
                        return parseStringAsBoolean$lambda$9;
                    }
                }, 7, (Object) null);
                return false;
            }
        }

        @JvmStatic
        public final Integer parseStringAsColorInt(final Bundle bundle, final String key) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                if (!bundle.containsKey(key) || (string = bundle.getString(key)) == null) {
                    return null;
                }
                return Integer.valueOf((int) Long.parseLong(string));
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: g4.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String parseStringAsColorInt$lambda$13;
                        parseStringAsColorInt$lambda$13 = BrazeNotificationPayload.Companion.parseStringAsColorInt$lambda$13(key, bundle);
                        return parseStringAsColorInt$lambda$13;
                    }
                }, 7, (Object) null);
                return null;
            }
        }

        @JvmStatic
        public final Integer parseStringAsInteger(final Bundle bundle, final String key) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                if (!bundle.containsKey(key) || (string = bundle.getString(key)) == null) {
                    return null;
                }
                return Integer.valueOf(Integer.parseInt(string));
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: g4.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String parseStringAsInteger$lambda$3;
                        parseStringAsInteger$lambda$3 = BrazeNotificationPayload.Companion.parseStringAsInteger$lambda$3(key, bundle);
                        return parseStringAsInteger$lambda$3;
                    }
                }, 7, (Object) null);
                return null;
            }
        }

        @JvmStatic
        public final Long parseStringAsLong(final Bundle bundle, final String key) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                if (!bundle.containsKey(key) || (string = bundle.getString(key)) == null) {
                    return null;
                }
                return Long.valueOf(Long.parseLong(string));
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: g4.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String parseStringAsLong$lambda$7;
                        parseStringAsLong$lambda$7 = BrazeNotificationPayload.Companion.parseStringAsLong$lambda$7(key, bundle);
                        return parseStringAsLong$lambda$7;
                    }
                }, 7, (Object) null);
                return null;
            }
        }

        private Companion() {
        }

        @JvmStatic
        public final String getTemplateFieldAtIndex(int index, Bundle notificationExtras, String actionFieldKeyTemplate, String defaultValue) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Intrinsics.checkNotNullParameter(actionFieldKeyTemplate, "actionFieldKeyTemplate");
            String string = notificationExtras.getString(StringsKt.replace$default(actionFieldKeyTemplate, "*", String.valueOf(index), false, 4, (Object) null));
            return string == null ? defaultValue : string;
        }

        @JvmStatic
        public final boolean getTemplateFieldAtIndex(int actionIndex, Bundle notificationExtras, String actionFieldKeyTemplate, boolean defaultValue) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Intrinsics.checkNotNullParameter(actionFieldKeyTemplate, "actionFieldKeyTemplate");
            String string = notificationExtras.getString(StringsKt.replace$default(actionFieldKeyTemplate, "*", String.valueOf(actionIndex), false, 4, (Object) null));
            if (string != null) {
                try {
                    return Boolean.parseBoolean(string);
                } catch (Exception e6) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: g4.i
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String templateFieldAtIndex$lambda$0;
                            templateFieldAtIndex$lambda$0 = BrazeNotificationPayload.Companion.getTemplateFieldAtIndex$lambda$0();
                            return templateFieldAtIndex$lambda$0;
                        }
                    }, 4, (Object) null);
                }
            }
            return defaultValue;
        }

        @JvmStatic
        public final long getTemplateFieldAtIndex(int actionIndex, Bundle notificationExtras, String actionFieldKeyTemplate, long defaultValue) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Intrinsics.checkNotNullParameter(actionFieldKeyTemplate, "actionFieldKeyTemplate");
            String string = notificationExtras.getString(StringsKt.replace$default(actionFieldKeyTemplate, "*", String.valueOf(actionIndex), false, 4, (Object) null));
            if (string != null) {
                try {
                    return Long.parseLong(string);
                } catch (Exception e6) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: g4.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String templateFieldAtIndex$lambda$1;
                            templateFieldAtIndex$lambda$1 = BrazeNotificationPayload.Companion.getTemplateFieldAtIndex$lambda$1();
                            return templateFieldAtIndex$lambda$1;
                        }
                    }, 4, (Object) null);
                }
            }
            return defaultValue;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0012\u001a\u00020\tH\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/braze/models/push/BrazeNotificationPayload$ConversationMessage;", "", "notificationExtras", "Landroid/os/Bundle;", "index", "", "<init>", "(Landroid/os/Bundle;I)V", "message", "", "getMessage", "()Ljava/lang/String;", "timestamp", "", "getTimestamp", "()J", "personId", "getPersonId", "toString", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class ConversationMessage {
        private final String message;
        private final String personId;
        private final long timestamp;

        public ConversationMessage(Bundle notificationExtras, int i6) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Companion companion = BrazeNotificationPayload.INSTANCE;
            this.message = companion.getTemplateFieldAtIndex(i6, notificationExtras, "ab_c_mt*");
            this.timestamp = companion.getTemplateFieldAtIndex(i6, notificationExtras, "ab_c_mw*", 0L);
            this.personId = companion.getTemplateFieldAtIndex(i6, notificationExtras, "ab_c_mp*");
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getPersonId() {
            return this.personId;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.INSTANCE;
            sb.append(companion.stringAndKey("Message", this.message));
            sb.append(companion.stringAndKey("Timestamp", Long.valueOf(this.timestamp)));
            sb.append(companion.stringAndKey("PersonId", this.personId));
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\nR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\f\u001a\u0004\b\u000f\u0010\nR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/braze/models/push/BrazeNotificationPayload$ConversationPerson;", "", "Landroid/os/Bundle;", "notificationExtras", "", "index", "<init>", "(Landroid/os/Bundle;I)V", "", "toString", "()Ljava/lang/String;", "personId", "Ljava/lang/String;", "getPersonId", com.amazon.a.a.h.a.f10906a, "getName", "uri", "getUri", "", "isImportant", "Z", "()Z", "isBot", "Landroidx/core/app/t;", "getPerson", "()Landroidx/core/app/t;", "person", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class ConversationPerson {
        private final boolean isBot;
        private final boolean isImportant;
        private final String name;
        private final String personId;
        private final String uri;

        public ConversationPerson(Bundle notificationExtras, int i6) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Companion companion = BrazeNotificationPayload.INSTANCE;
            this.personId = companion.getTemplateFieldAtIndex(i6, notificationExtras, "ab_c_pi*");
            this.name = companion.getTemplateFieldAtIndex(i6, notificationExtras, "ab_c_pn*");
            this.uri = companion.getTemplateFieldAtIndex(i6, notificationExtras, "ab_c_pu*", (String) null);
            this.isImportant = companion.getTemplateFieldAtIndex(i6, notificationExtras, "ab_c_pt*", false);
            this.isBot = companion.getTemplateFieldAtIndex(i6, notificationExtras, "ab_c_pb*", false);
        }

        public final t getPerson() {
            t a6 = new t.b().e(this.personId).f(this.name).g(this.uri).b(this.isBot).d(this.isImportant).a();
            Intrinsics.checkNotNullExpressionValue(a6, "build(...)");
            return a6;
        }

        public final String getPersonId() {
            return this.personId;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.INSTANCE;
            sb.append(companion.stringAndKey("PersonId", this.personId));
            sb.append(companion.stringAndKey("Name", this.name));
            sb.append(companion.stringAndKey("Uri", this.uri));
            sb.append(companion.stringAndKey("IsImportant", Boolean.valueOf(this.isImportant)));
            sb.append(companion.stringAndKey("IsBot", Boolean.valueOf(this.isBot)));
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b$\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR$\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR$\u0010 \u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\n\"\u0004\b\"\u0010\u0016R$\u0010#\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0011\u001a\u0004\b$\u0010\n\"\u0004\b%\u0010\u0016R$\u0010&\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0011\u001a\u0004\b'\u0010\n\"\u0004\b(\u0010\u0016R$\u0010)\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0011\u001a\u0004\b*\u0010\n\"\u0004\b+\u0010\u0016¨\u0006,"}, d2 = {"Lcom/braze/models/push/BrazeNotificationPayload$PushStoryPage;", "", "Landroid/os/Bundle;", "notificationExtras", "", "actionIndex", "<init>", "(Landroid/os/Bundle;I)V", "", "toString", "()Ljava/lang/String;", "I", "getActionIndex", "()I", "setActionIndex", "(I)V", "campaignId", "Ljava/lang/String;", "getCampaignId", b.f11189S, "getTitle", "setTitle", "(Ljava/lang/String;)V", "titleGravity", "getTitleGravity", "setTitleGravity", "subtitle", "getSubtitle", "setSubtitle", "subtitleGravity", "getSubtitleGravity", "setSubtitleGravity", "bitmapUrl", "getBitmapUrl", "setBitmapUrl", "storyPageId", "getStoryPageId", "setStoryPageId", "deeplink", "getDeeplink", "setDeeplink", "useWebview", "getUseWebview", "setUseWebview", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class PushStoryPage {
        private int actionIndex;
        private String bitmapUrl;
        private final String campaignId;
        private String deeplink;
        private String storyPageId;
        private String subtitle;
        private int subtitleGravity;
        private String title;
        private int titleGravity;
        private String useWebview;

        public PushStoryPage(Bundle notificationExtras, int i6) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            this.actionIndex = i6;
            Companion companion = BrazeNotificationPayload.INSTANCE;
            this.campaignId = companion.parseString(notificationExtras, "cid");
            this.title = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, "ab_c*_t");
            this.titleGravity = companion.getPushStoryGravityAtIndex(this.actionIndex, notificationExtras, "ab_c*_t_j");
            this.subtitle = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, "ab_c*_st");
            this.subtitleGravity = companion.getPushStoryGravityAtIndex(this.actionIndex, notificationExtras, "ab_c*_st_j");
            this.bitmapUrl = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, "ab_c*_i");
            this.storyPageId = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, "ab_c*_id", "");
            this.deeplink = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, "ab_c*_uri");
            this.useWebview = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, "ab_c*_use_webview");
        }

        public final String getBitmapUrl() {
            return this.bitmapUrl;
        }

        public final String getCampaignId() {
            return this.campaignId;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getStoryPageId() {
            return this.storyPageId;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final int getSubtitleGravity() {
            return this.subtitleGravity;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int getTitleGravity() {
            return this.titleGravity;
        }

        public final String getUseWebview() {
            return this.useWebview;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.INSTANCE;
            sb.append(companion.stringAndKey("ActionIndex", Integer.valueOf(this.actionIndex)));
            sb.append(companion.stringAndKey("CampaignId", this.campaignId));
            sb.append(companion.stringAndKey("Title", this.title));
            sb.append(companion.stringAndKey("TitleGravity", Integer.valueOf(this.titleGravity)));
            sb.append(companion.stringAndKey("Subtitle", this.subtitle));
            sb.append(companion.stringAndKey("SubtitleGravity=", Integer.valueOf(this.subtitleGravity)));
            sb.append(companion.stringAndKey("BitmapUrl", this.bitmapUrl));
            sb.append(companion.stringAndKey("StoryPageId", this.storyPageId));
            sb.append(companion.stringAndKey("Deeplink", this.deeplink));
            sb.append(companion.stringAndKey("UseWebview", this.useWebview));
            return sb.toString();
        }
    }

    public BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context, BrazeConfigurationProvider brazeConfigurationProvider) {
        this.configurationProvider = brazeConfigurationProvider;
        this.notificationExtras = bundle == null ? new Bundle() : bundle;
        this.brazeExtras = bundle2 == null ? new Bundle() : bundle2;
        this.extras = BundleUtils.toStringMap(bundle2);
        this.context = context != null ? context.getApplicationContext() : null;
        this.flushMinMinutes = 5L;
        this.flushMaxMinutes = 120L;
        this.actionButtonsInternal = new ArrayList();
        this.pushStoryPagesInternal = new ArrayList();
        this.conversationMessagesInternal = new ArrayList();
        this.conversationPersonMapInternal = new HashMap();
        parsePayloadFieldsFromBundle();
    }

    private final void parsePayloadFieldsFromBundle() {
        parsePayloadFieldsFromBundle$parseNotificationMetadata(this);
        parsePayloadFieldsFromBundle$parseContentCardData(this);
        parsePayloadFieldsFromBundle$parseVisibleContent(this);
        parsePayloadFieldsFromBundle$parseBigTextStyle(this);
        parsePayloadFieldsFromBundle$parseBigImageStyle(this);
        parsePayloadFieldsFromBundle$parseActionButtons(this);
        parsePayloadFieldsFromBundle$parsePushStoryData(this);
        parsePayloadFieldsFromBundle$parseConversationPushData(this);
        parsePayloadFieldsFromBundle$parsePushDeliveryEventData(this);
    }

    private static final void parsePayloadFieldsFromBundle$parseActionButtons(BrazeNotificationPayload brazeNotificationPayload) {
        brazeNotificationPayload.actionButtonsInternal.clear();
        int i6 = 0;
        while (true) {
            String templateFieldAtIndex = INSTANCE.getTemplateFieldAtIndex(i6, brazeNotificationPayload.notificationExtras, "ab_a*_a");
            if (templateFieldAtIndex == null || StringsKt.isBlank(templateFieldAtIndex)) {
                return;
            }
            brazeNotificationPayload.actionButtonsInternal.add(new ActionButton(brazeNotificationPayload.notificationExtras, i6));
            i6++;
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseBigImageStyle(BrazeNotificationPayload brazeNotificationPayload) {
        String str;
        String parseNonBlankString = INSTANCE.parseNonBlankString(brazeNotificationPayload.notificationExtras, "ab_iu");
        brazeNotificationPayload.bigImageUrl = parseNonBlankString;
        if ((parseNonBlankString != null && !StringsKt.isBlank(parseNonBlankString)) || (str = brazeNotificationPayload.extras.get("appboy_image_url")) == null || StringsKt.isBlank(str)) {
            return;
        }
        brazeNotificationPayload.bigImageUrl = str;
    }

    private static final void parsePayloadFieldsFromBundle$parseBigTextStyle(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = INSTANCE;
        brazeNotificationPayload.bigSummaryText = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_bs");
        brazeNotificationPayload.bigTitleText = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_bt");
    }

    private static final void parsePayloadFieldsFromBundle$parseContentCardData(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = INSTANCE;
        brazeNotificationPayload.contentCardSyncData = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_cd");
        brazeNotificationPayload.contentCardSyncUserId = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_cd_uid");
    }

    private static final void parsePayloadFieldsFromBundle$parseConversationPushData(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = INSTANCE;
        brazeNotificationPayload.conversationShortcutId = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_c_si");
        brazeNotificationPayload.conversationReplyPersonId = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_c_rpi");
        brazeNotificationPayload.conversationMessagesInternal.clear();
        brazeNotificationPayload.conversationPersonMapInternal.clear();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            String templateFieldAtIndex = INSTANCE.getTemplateFieldAtIndex(i7, brazeNotificationPayload.notificationExtras, "ab_c_mt*");
            if (templateFieldAtIndex == null || StringsKt.isBlank(templateFieldAtIndex)) {
                break;
            }
            brazeNotificationPayload.conversationMessagesInternal.add(new ConversationMessage(brazeNotificationPayload.notificationExtras, i7));
            i7++;
        }
        while (true) {
            String templateFieldAtIndex2 = INSTANCE.getTemplateFieldAtIndex(i6, brazeNotificationPayload.notificationExtras, "ab_c_pi*");
            if (templateFieldAtIndex2 == null || StringsKt.isBlank(templateFieldAtIndex2)) {
                return;
            }
            ConversationPerson conversationPerson = new ConversationPerson(brazeNotificationPayload.notificationExtras, i6);
            brazeNotificationPayload.conversationPersonMapInternal.put(conversationPerson.getPersonId(), conversationPerson);
            i6++;
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseNotificationMetadata(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = INSTANCE;
        brazeNotificationPayload.pushDuration = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, "nd");
        brazeNotificationPayload.isPushStory = brazeNotificationPayload.notificationExtras.containsKey("ab_c");
        brazeNotificationPayload.notificationCategory = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_ct");
        brazeNotificationPayload.notificationVisibility = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, "ab_vs");
        brazeNotificationPayload.notificationBadgeNumber = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, "ab_bc");
        brazeNotificationPayload.publicNotificationExtras = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_pn");
        brazeNotificationPayload.customNotificationId = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, "n");
        brazeNotificationPayload.notificationReceivedTimestampMillis = companion.parseLong(brazeNotificationPayload.notificationExtras, "braze_push_received_timestamp");
        brazeNotificationPayload.isInlineImagePush = brazeNotificationPayload.notificationExtras.containsKey("ab_iip");
        brazeNotificationPayload.isConversationalPush = brazeNotificationPayload.notificationExtras.containsKey("ab_cp");
        brazeNotificationPayload.notificationPriorityInt = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, "p");
        brazeNotificationPayload.shouldFetchTestTriggers = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, "ab_push_fetch_test_triggers_key");
        brazeNotificationPayload.shouldSyncGeofences = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, "ab_sync_geos");
        brazeNotificationPayload.shouldRefreshFeatureFlags = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, "br_ffr");
        brazeNotificationPayload.shouldRefreshBanners = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, "br_br");
        brazeNotificationPayload.isUninstallTrackingPush = brazeNotificationPayload.notificationExtras.containsKey("appboy_uninstall_tracking") || brazeNotificationPayload.brazeExtras.containsKey("appboy_uninstall_tracking");
        brazeNotificationPayload.deeplink = companion.parseString(brazeNotificationPayload.notificationExtras, "uri");
        brazeNotificationPayload.campaignId = companion.parseString(brazeNotificationPayload.notificationExtras, "cid");
        brazeNotificationPayload.pushUniqueId = companion.parseString(brazeNotificationPayload.notificationExtras, "br_p_id");
        brazeNotificationPayload.useWebView = Boolean.valueOf(companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, "ab_use_webview"));
    }

    private static final void parsePayloadFieldsFromBundle$parsePushDeliveryEventData(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = INSTANCE;
        Integer parseStringAsInteger = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, "bz_p_e");
        brazeNotificationPayload.isPushDeliveryEnabled = (parseStringAsInteger != null ? parseStringAsInteger.intValue() : 0) == 1;
        Long parseStringAsLong = companion.parseStringAsLong(brazeNotificationPayload.notificationExtras, "bz_p_fn");
        brazeNotificationPayload.flushMinMinutes = parseStringAsLong != null ? parseStringAsLong.longValue() : 5L;
        Long parseStringAsLong2 = companion.parseStringAsLong(brazeNotificationPayload.notificationExtras, "bz_p_fx");
        brazeNotificationPayload.flushMaxMinutes = parseStringAsLong2 != null ? parseStringAsLong2.longValue() : 120L;
    }

    private static final void parsePayloadFieldsFromBundle$parsePushStoryData(BrazeNotificationPayload brazeNotificationPayload) {
        brazeNotificationPayload.pushStoryPageIndex = INSTANCE.parseObjectAsInteger(brazeNotificationPayload.notificationExtras, "braze_story_index", 0);
        int i6 = 0;
        while (true) {
            String templateFieldAtIndex = INSTANCE.getTemplateFieldAtIndex(i6, brazeNotificationPayload.notificationExtras, "ab_c*_i");
            if (templateFieldAtIndex == null || StringsKt.isBlank(templateFieldAtIndex)) {
                break;
            }
            brazeNotificationPayload.pushStoryPagesInternal.add(new PushStoryPage(brazeNotificationPayload.notificationExtras, i6));
            i6++;
        }
        brazeNotificationPayload.isNewlyReceivedPushStory = brazeNotificationPayload.notificationExtras.getBoolean("braze_story_newly_received", false);
    }

    private static final void parsePayloadFieldsFromBundle$parseVisibleContent(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = INSTANCE;
        brazeNotificationPayload.notificationChannelId = companion.parseNonBlankString(brazeNotificationPayload.notificationExtras, "ab_nc");
        brazeNotificationPayload.titleText = companion.parseString(brazeNotificationPayload.notificationExtras, "t");
        brazeNotificationPayload.contentText = companion.parseString(brazeNotificationPayload.notificationExtras, "a");
        brazeNotificationPayload.largeIcon = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_li");
        brazeNotificationPayload.notificationSound = companion.parseString(brazeNotificationPayload.notificationExtras, "sd");
        brazeNotificationPayload.summaryText = companion.parseString(brazeNotificationPayload.notificationExtras, "s");
        brazeNotificationPayload.accentColor = companion.parseStringAsColorInt(brazeNotificationPayload.notificationExtras, "ac");
    }

    public final Integer getAccentColor() {
        return this.accentColor;
    }

    public final List<ActionButton> getActionButtons() {
        return this.actionButtonsInternal;
    }

    public final String getBigImageUrl() {
        return this.bigImageUrl;
    }

    public final String getBigSummaryText() {
        return this.bigSummaryText;
    }

    public final String getBigTitleText() {
        return this.bigTitleText;
    }

    public final Bundle getBrazeExtras() {
        return this.brazeExtras;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final BrazeConfigurationProvider getConfigurationProvider() {
        return this.configurationProvider;
    }

    public final String getContentCardSyncData() {
        return this.contentCardSyncData;
    }

    public final String getContentCardSyncUserId() {
        return this.contentCardSyncUserId;
    }

    public final String getContentText() {
        return this.contentText;
    }

    public final Context getContext() {
        return this.context;
    }

    public final List<ConversationMessage> getConversationMessages() {
        return this.conversationMessagesInternal;
    }

    public final Map<String, ConversationPerson> getConversationPersonMap() {
        return this.conversationPersonMapInternal;
    }

    public final String getConversationReplyPersonId() {
        return this.conversationReplyPersonId;
    }

    public final String getConversationShortcutId() {
        return this.conversationShortcutId;
    }

    public final Integer getCustomNotificationId() {
        return this.customNotificationId;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final long getFlushMaxMinutes() {
        return this.flushMaxMinutes;
    }

    public final long getFlushMinMinutes() {
        return this.flushMinMinutes;
    }

    public final String getLargeIcon() {
        return this.largeIcon;
    }

    public final Integer getNotificationBadgeNumber() {
        return this.notificationBadgeNumber;
    }

    public final String getNotificationCategory() {
        return this.notificationCategory;
    }

    public final String getNotificationChannelId() {
        return this.notificationChannelId;
    }

    public final Bundle getNotificationExtras() {
        return this.notificationExtras;
    }

    public final Integer getNotificationPriorityInt() {
        return this.notificationPriorityInt;
    }

    public final String getNotificationSound() {
        return this.notificationSound;
    }

    public final Integer getNotificationVisibility() {
        return this.notificationVisibility;
    }

    public final String getPublicNotificationExtras() {
        return this.publicNotificationExtras;
    }

    public final Integer getPushDuration() {
        return this.pushDuration;
    }

    public final int getPushStoryPageIndex() {
        return this.pushStoryPageIndex;
    }

    public final List<PushStoryPage> getPushStoryPages() {
        return this.pushStoryPagesInternal;
    }

    public final String getPushUniqueId() {
        return this.pushUniqueId;
    }

    public final boolean getShouldFetchTestTriggers() {
        return this.shouldFetchTestTriggers;
    }

    public final boolean getShouldRefreshBanners() {
        return this.shouldRefreshBanners;
    }

    public final boolean getShouldRefreshFeatureFlags() {
        return this.shouldRefreshFeatureFlags;
    }

    public final boolean getShouldSyncGeofences() {
        return this.shouldSyncGeofences;
    }

    public final String getSummaryText() {
        return this.summaryText;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    /* renamed from: isConversationalPush, reason: from getter */
    public final boolean getIsConversationalPush() {
        return this.isConversationalPush;
    }

    /* renamed from: isInlineImagePush, reason: from getter */
    public final boolean getIsInlineImagePush() {
        return this.isInlineImagePush;
    }

    /* renamed from: isNewlyReceivedPushStory, reason: from getter */
    public final boolean getIsNewlyReceivedPushStory() {
        return this.isNewlyReceivedPushStory;
    }

    /* renamed from: isPushDeliveryEnabled, reason: from getter */
    public final boolean getIsPushDeliveryEnabled() {
        return this.isPushDeliveryEnabled;
    }

    /* renamed from: isPushStory, reason: from getter */
    public final boolean getIsPushStory() {
        return this.isPushStory;
    }

    /* renamed from: isUninstallTrackingPush, reason: from getter */
    public final boolean getIsUninstallTrackingPush() {
        return this.isUninstallTrackingPush;
    }

    public final void setNewlyReceivedPushStory(boolean z6) {
        this.isNewlyReceivedPushStory = z6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Companion companion = INSTANCE;
        sb.append(companion.stringAndKey("PushDuration", this.pushDuration));
        sb.append(companion.stringAndKey("IsPushStory", Boolean.valueOf(this.isPushStory)));
        sb.append(companion.stringAndKey("IsInlineImagePush", Boolean.valueOf(this.isInlineImagePush)));
        sb.append(companion.stringAndKey("IsConversationalPush", Boolean.valueOf(this.isConversationalPush)));
        sb.append(companion.stringAndKey("PublicNotificationExtras", this.publicNotificationExtras));
        sb.append(companion.stringAndKey("NotificationChannelId", this.notificationChannelId));
        sb.append(companion.stringAndKey("NotificationCategory", this.notificationCategory));
        sb.append(companion.stringAndKey("NotificationVisibility", this.notificationVisibility));
        sb.append(companion.stringAndKey("NotificationBadgeNumber", this.notificationBadgeNumber));
        sb.append(companion.stringAndKey("CustomNotificationId", this.customNotificationId));
        sb.append(companion.stringAndKey("NotificationReceivedTimestampMillis", this.notificationReceivedTimestampMillis));
        sb.append(companion.stringAndKey("ContentCardSyncData", this.contentCardSyncData));
        sb.append(companion.stringAndKey("ContentCardSyncUserId", this.contentCardSyncUserId));
        sb.append(companion.stringAndKey("TitleText", this.titleText));
        sb.append(companion.stringAndKey("ContentText", this.contentText));
        sb.append(companion.stringAndKey("LargeIcon", this.largeIcon));
        sb.append(companion.stringAndKey("NotificationSound", this.notificationSound));
        sb.append(companion.stringAndKey("SummaryText", this.summaryText));
        sb.append(companion.stringAndKey("AccentColor", this.accentColor));
        sb.append(companion.stringAndKey("BigSummaryText", this.bigSummaryText));
        sb.append(companion.stringAndKey("BigTitleText", this.bigTitleText));
        sb.append(companion.stringAndKey("BigImageUrl", this.bigImageUrl));
        sb.append(companion.stringAndKey("ActionButtons", getActionButtons()));
        sb.append(companion.stringAndKey("PushStoryPageIndex", Integer.valueOf(this.pushStoryPageIndex)));
        sb.append(companion.stringAndKey("PushStoryPages", this.pushStoryPagesInternal));
        sb.append(companion.stringAndKey("ConversationMessages", this.conversationMessagesInternal));
        sb.append(companion.stringAndKey("ConversationPersonMap", this.conversationPersonMapInternal));
        sb.append(companion.stringAndKey("PushDeliveryEnabled", Boolean.valueOf(this.isPushDeliveryEnabled)));
        sb.append(companion.stringAndKey("PushUniqueId", this.pushUniqueId));
        sb.append(companion.stringAndKey("ConversationShortcutId", this.conversationShortcutId));
        return sb.toString();
    }

    public /* synthetic */ BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context, BrazeConfigurationProvider brazeConfigurationProvider, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(bundle, (i6 & 2) != 0 ? INSTANCE.getAttachedBrazeExtras(bundle) : bundle2, (i6 & 4) != 0 ? null : context, (i6 & 8) != 0 ? null : brazeConfigurationProvider);
    }
}
