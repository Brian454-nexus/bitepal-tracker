package com.braze.brazeplugin;

import B9.a;
import C9.c;
import G9.i;
import G9.j;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.a.a.o.b;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerProperties;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.brazeplugin.BrazePlugin;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.events.BrazePushEvent;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.SimpleValueCallback;
import com.braze.models.Banner;
import com.braze.models.FeatureFlag;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.MessageButton;
import com.braze.models.outgoing.AttributionData;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import com.braze.ui.activities.ContentCardsActivity;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 F2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001FB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0005J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J6\u0010*\u001a\u00020\b*\u00020#2!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\b0$H\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b4\u00105J#\u00109\u001a\u0002082\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0002\b\u0003\u0018\u000106H\u0002¢\u0006\u0004\b9\u0010:R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lcom/braze/brazeplugin/BrazePlugin;", "LG9/j$c;", "LB9/a;", "LC9/a;", "<init>", "()V", "LB9/a$b;", "flutterPluginBinding", "", "onAttachedToEngine", "(LB9/a$b;)V", "binding", "onDetachedFromEngine", "onDetachedFromActivity", "LC9/c;", "onReattachedToActivityForConfigChanges", "(LC9/c;)V", "onAttachedToActivity", "onDetachedFromActivityForConfigChanges", "LG9/i;", "call", "LG9/j$d;", "result", "onMethodCall", "(LG9/i;LG9/j$d;)V", "Landroid/content/Context;", "context", "LG9/b;", "messenger", "initPlugin", "(Landroid/content/Context;LG9/b;)V", "Lcom/braze/events/BrazeSdkAuthenticationErrorEvent;", "errorEvent", "handleSdkAuthenticationError", "(Lcom/braze/events/BrazeSdkAuthenticationErrorEvent;)V", "Lcom/braze/Braze;", "Lkotlin/Function1;", "Lcom/braze/BrazeUser;", "Lkotlin/ParameterName;", com.amazon.a.a.h.a.f10906a, "user", "block", "runOnUser", "(Lcom/braze/Braze;Lkotlin/jvm/functions/Function1;)V", "", "type", "Lcom/braze/enums/NotificationSubscriptionType;", "getSubscriptionType", "(Ljava/lang/String;)Lcom/braze/enums/NotificationSubscriptionType;", "", b.f11195Y, "Lcom/braze/enums/Month;", "getMonth", "(I)Lcom/braze/enums/Month;", "", "arguments", "Lcom/braze/models/outgoing/BrazeProperties;", "convertToBrazeProperties", "(Ljava/util/Map;)Lcom/braze/models/outgoing/BrazeProperties;", "Landroid/content/Context;", "LG9/j;", AppsFlyerProperties.CHANNEL, "LG9/j;", "Lcom/braze/brazeplugin/FlutterConfiguration;", "flutterConfiguration", "Lcom/braze/brazeplugin/FlutterConfiguration;", "LB9/a$b;", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "Companion", "braze_plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBrazePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazePlugin.kt\ncom/braze/brazeplugin/BrazePlugin\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1012:1\n1557#2:1013\n1628#2,3:1014\n1557#2:1020\n1628#2,3:1021\n1557#2:1024\n1628#2,3:1025\n1#3:1017\n37#4,2:1018\n*S KotlinDebug\n*F\n+ 1 BrazePlugin.kt\ncom/braze/brazeplugin/BrazePlugin\n*L\n182#1:1013\n182#1:1014,3\n368#1:1020\n368#1:1021,3\n710#1:1024\n710#1:1025,3\n352#1:1018,2\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class BrazePlugin implements j.c, B9.a, C9.a {
    private static boolean isBrazePluginIsReady;

    @Nullable
    private Activity activity;
    private j channel;
    private Context context;
    private FlutterConfiguration flutterConfiguration;

    @Nullable
    private a.b flutterPluginBinding;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static List<BrazePlugin> activePlugins = new ArrayList();

    @NotNull
    private static List<BrazePushEvent> pendingPushEvents = new ArrayList();

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001bH\u0007¢\u0006\u0004\b\"\u0010\u001fJ\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b#\u0010\tJ\u001d\u0010&\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001bH\u0007¢\u0006\u0004\b&\u0010\u001fR(\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u001fR(\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+\"\u0004\b/\u0010\u001fR\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/braze/brazeplugin/BrazePlugin$Companion;", "", "<init>", "()V", "", "reprocessPendingPushEvents", "Lcom/braze/events/BrazePushEvent;", "event", "handlePushEvent", "(Lcom/braze/events/BrazePushEvent;)V", "Lkotlin/Function1;", "Lcom/braze/brazeplugin/BrazePlugin;", "block", "executeOnAllPlugins", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/os/Bundle;", "bundle", "", "", "filteringKeys", "Lorg/json/JSONObject;", "convertToMap", "(Landroid/os/Bundle;Ljava/util/Set;)Lorg/json/JSONObject;", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "processInAppMessage", "(Lcom/braze/models/inappmessage/IInAppMessage;)V", "", "Lcom/braze/models/cards/Card;", "contentCardList", "processContentCards", "(Ljava/util/List;)V", "Lcom/braze/models/Banner;", "bannerList", "processBanners", "processPushNotificationEvent", "Lcom/braze/models/FeatureFlag;", "featureFlagList", "processFeatureFlags", "", "activePlugins", "Ljava/util/List;", "getActivePlugins", "()Ljava/util/List;", "setActivePlugins", "pendingPushEvents", "getPendingPushEvents", "setPendingPushEvents", "", "isBrazePluginIsReady", "Z", "braze_plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBrazePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazePlugin.kt\ncom/braze/brazeplugin/BrazePlugin$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1012:1\n1#2:1013\n1557#3:1014\n1628#3,3:1015\n774#3:1018\n865#3,2:1019\n1279#3,2:1021\n1293#3,4:1023\n216#4,2:1027\n*S KotlinDebug\n*F\n+ 1 BrazePlugin.kt\ncom/braze/brazeplugin/BrazePlugin$Companion\n*L\n985#1:1014\n985#1:1015,3\n1005#1:1018\n1005#1:1019,2\n1006#1:1021,2\n1006#1:1023,4\n1007#1:1027,2\n*E\n"})
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BrazePushEventType.values().length];
                try {
                    iArr[BrazePushEventType.NOTIFICATION_RECEIVED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BrazePushEventType.NOTIFICATION_OPENED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final JSONObject convertToMap(Bundle bundle, Set<String> filteringKeys) {
            JSONObject jSONObject = new JSONObject();
            Set<String> keySet = bundle.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "keySet(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : keySet) {
                if (!filteringKeys.contains((String) obj)) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
            for (Object obj2 : arrayList) {
                linkedHashMap.put(obj2, bundle.get((String) obj2));
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            return jSONObject;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ JSONObject convertToMap$default(Companion companion, Bundle bundle, Set set, int i6, Object obj) {
            if ((i6 & 2) != 0) {
                set = SetsKt.emptySet();
            }
            return companion.convertToMap(bundle, set);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void executeOnAllPlugins(final Function1<? super BrazePlugin, Unit> block) {
            for (final BrazePlugin brazePlugin : getActivePlugins()) {
                Activity activity = brazePlugin.activity;
                if (activity != null) {
                    activity.runOnUiThread(new Runnable() { // from class: P3.o0
                        @Override // java.lang.Runnable
                        public final void run() {
                            BrazePlugin.Companion.executeOnAllPlugins$lambda$15(Function1.this, brazePlugin);
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void executeOnAllPlugins$lambda$15(Function1 block, BrazePlugin plugin) {
            Intrinsics.checkNotNullParameter(block, "$block");
            Intrinsics.checkNotNullParameter(plugin, "$plugin");
            block.invoke(plugin);
        }

        private final void handlePushEvent(BrazePushEvent event) {
            String str;
            int i6 = WhenMappings.$EnumSwitchMapping$0[event.getEventType().ordinal()];
            boolean z6 = true;
            if (i6 == 1) {
                str = "push_received";
            } else if (i6 != 2) {
                return;
            } else {
                str = "push_opened";
            }
            BrazeNotificationPayload notificationPayload = event.getNotificationPayload();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("payload_type", str);
            jSONObject.put("url", notificationPayload.getDeeplink());
            jSONObject.put(b.f11189S, notificationPayload.getTitleText());
            jSONObject.put("body", notificationPayload.getContentText());
            jSONObject.put("summary_text", notificationPayload.getSummaryText());
            Integer notificationBadgeNumber = notificationPayload.getNotificationBadgeNumber();
            if (notificationBadgeNumber != null) {
                jSONObject.put("badge_count", notificationBadgeNumber.intValue());
            }
            Long valueOf = Long.valueOf(notificationPayload.getNotificationExtras().getLong("braze_push_received_timestamp"));
            if (valueOf.longValue() == 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                jSONObject.put("timestamp", valueOf.longValue());
            }
            jSONObject.put("use_webview", Intrinsics.areEqual(notificationPayload.getNotificationExtras().getString("ab_use_webview"), b.af));
            jSONObject.put("is_silent", notificationPayload.getTitleText() == null && notificationPayload.getContentText() == null);
            if (!notificationPayload.getIsUninstallTrackingPush() && !notificationPayload.getShouldSyncGeofences() && !notificationPayload.getShouldRefreshFeatureFlags()) {
                z6 = false;
            }
            jSONObject.put("is_braze_internal", z6);
            jSONObject.put("image_url", notificationPayload.getBigImageUrl());
            jSONObject.put("android", convertToMap$default(BrazePlugin.INSTANCE, notificationPayload.getNotificationExtras(), null, 2, null));
            jSONObject.put("braze_properties", convertToMap(notificationPayload.getBrazeExtras(), SetsKt.setOf("appboy_image_url")));
            final HashMap hashMapOf = MapsKt.hashMapOf(new Pair[]{TuplesKt.to("pushEvent", jSONObject.toString())});
            executeOnAllPlugins(new Function1() { // from class: P3.m0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit handlePushEvent$lambda$11;
                    handlePushEvent$lambda$11 = BrazePlugin.Companion.handlePushEvent$lambda$11(hashMapOf, (BrazePlugin) obj);
                    return handlePushEvent$lambda$11;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handlePushEvent$lambda$11(HashMap pushEventMap, BrazePlugin it) {
            Intrinsics.checkNotNullParameter(pushEventMap, "$pushEventMap");
            Intrinsics.checkNotNullParameter(it, "it");
            j jVar = it.channel;
            if (jVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException(AppsFlyerProperties.CHANNEL);
                jVar = null;
            }
            jVar.c("handleBrazePushNotificationEvent", pushEventMap);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String processBanners$lambda$4() {
            return "There are no active Braze Plugins. Not calling 'handleBrazeBanners'.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit processBanners$lambda$5(HashMap bannersMap, BrazePlugin it) {
            Intrinsics.checkNotNullParameter(bannersMap, "$bannersMap");
            Intrinsics.checkNotNullParameter(it, "it");
            j jVar = it.channel;
            if (jVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException(AppsFlyerProperties.CHANNEL);
                jVar = null;
            }
            jVar.c("handleBrazeBanners", bannersMap);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String processContentCards$lambda$2() {
            return "There are no active Braze Plugins. Not calling 'handleBrazeContentCards'.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit processContentCards$lambda$3(HashMap contentCardMap, BrazePlugin it) {
            Intrinsics.checkNotNullParameter(contentCardMap, "$contentCardMap");
            Intrinsics.checkNotNullParameter(it, "it");
            j jVar = it.channel;
            if (jVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException(AppsFlyerProperties.CHANNEL);
                jVar = null;
            }
            jVar.c("handleBrazeContentCards", contentCardMap);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String processFeatureFlags$lambda$12() {
            return "There are no active Braze Plugins. Not calling 'handleBrazeFeatureFlags'.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit processFeatureFlags$lambda$14(HashMap featureFlagMap, BrazePlugin it) {
            Intrinsics.checkNotNullParameter(featureFlagMap, "$featureFlagMap");
            Intrinsics.checkNotNullParameter(it, "it");
            j jVar = it.channel;
            if (jVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException(AppsFlyerProperties.CHANNEL);
                jVar = null;
            }
            jVar.c("handleBrazeFeatureFlags", featureFlagMap);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String processInAppMessage$lambda$0() {
            return "There are no active Braze Plugins. Not calling 'handleBrazeInAppMessage'.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit processInAppMessage$lambda$1(HashMap inAppMessageMap, BrazePlugin it) {
            Intrinsics.checkNotNullParameter(inAppMessageMap, "$inAppMessageMap");
            Intrinsics.checkNotNullParameter(it, "it");
            j jVar = it.channel;
            if (jVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException(AppsFlyerProperties.CHANNEL);
                jVar = null;
            }
            jVar.c("handleBrazeInAppMessage", inAppMessageMap);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String processPushNotificationEvent$lambda$6() {
            return "There are no active Braze Plugins. Not calling 'handleBrazePushNotificationEvent'. Storing the event for later processing.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void reprocessPendingPushEvents() {
            if (getPendingPushEvents().isEmpty() || getActivePlugins().isEmpty() || !BrazePlugin.isBrazePluginIsReady) {
                return;
            }
            Iterator<BrazePushEvent> it = getPendingPushEvents().iterator();
            while (it.hasNext()) {
                handlePushEvent(it.next());
            }
            getPendingPushEvents().clear();
        }

        @NotNull
        public final List<BrazePlugin> getActivePlugins() {
            return BrazePlugin.activePlugins;
        }

        @NotNull
        public final List<BrazePushEvent> getPendingPushEvents() {
            return BrazePlugin.pendingPushEvents;
        }

        @JvmStatic
        public final void processBanners(@NotNull List<Banner> bannerList) {
            Intrinsics.checkNotNullParameter(bannerList, "bannerList");
            if (getActivePlugins().isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.w0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String processBanners$lambda$4;
                        processBanners$lambda$4 = BrazePlugin.Companion.processBanners$lambda$4();
                        return processBanners$lambda$4;
                    }
                }, 6, (Object) null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Banner> it = bannerList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getKey().get("banner").toString());
            }
            final HashMap hashMapOf = MapsKt.hashMapOf(new Pair[]{TuplesKt.to("banners", arrayList)});
            executeOnAllPlugins(new Function1() { // from class: P3.n0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit processBanners$lambda$5;
                    processBanners$lambda$5 = BrazePlugin.Companion.processBanners$lambda$5(hashMapOf, (BrazePlugin) obj);
                    return processBanners$lambda$5;
                }
            });
        }

        @JvmStatic
        public final void processContentCards(@NotNull List<? extends Card> contentCardList) {
            Intrinsics.checkNotNullParameter(contentCardList, "contentCardList");
            if (getActivePlugins().isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.t0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String processContentCards$lambda$2;
                        processContentCards$lambda$2 = BrazePlugin.Companion.processContentCards$lambda$2();
                        return processContentCards$lambda$2;
                    }
                }, 6, (Object) null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<? extends Card> it = contentCardList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getKey().toString());
            }
            final HashMap hashMapOf = MapsKt.hashMapOf(new Pair[]{TuplesKt.to("contentCards", arrayList)});
            executeOnAllPlugins(new Function1() { // from class: P3.u0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit processContentCards$lambda$3;
                    processContentCards$lambda$3 = BrazePlugin.Companion.processContentCards$lambda$3(hashMapOf, (BrazePlugin) obj);
                    return processContentCards$lambda$3;
                }
            });
        }

        @JvmStatic
        public final void processFeatureFlags(@NotNull List<FeatureFlag> featureFlagList) {
            Intrinsics.checkNotNullParameter(featureFlagList, "featureFlagList");
            if (getActivePlugins().isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.r0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String processFeatureFlags$lambda$12;
                        processFeatureFlags$lambda$12 = BrazePlugin.Companion.processFeatureFlags$lambda$12();
                        return processFeatureFlags$lambda$12;
                    }
                }, 6, (Object) null);
                return;
            }
            List<FeatureFlag> list = featureFlagList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((FeatureFlag) it.next()).getKey().toString());
            }
            final HashMap hashMapOf = MapsKt.hashMapOf(new Pair[]{TuplesKt.to("featureFlags", arrayList)});
            executeOnAllPlugins(new Function1() { // from class: P3.s0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit processFeatureFlags$lambda$14;
                    processFeatureFlags$lambda$14 = BrazePlugin.Companion.processFeatureFlags$lambda$14(hashMapOf, (BrazePlugin) obj);
                    return processFeatureFlags$lambda$14;
                }
            });
        }

        @JvmStatic
        public final void processInAppMessage(@NotNull IInAppMessage inAppMessage) {
            Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
            if (getActivePlugins().isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.p0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String processInAppMessage$lambda$0;
                        processInAppMessage$lambda$0 = BrazePlugin.Companion.processInAppMessage$lambda$0();
                        return processInAppMessage$lambda$0;
                    }
                }, 6, (Object) null);
            } else {
                final HashMap hashMapOf = MapsKt.hashMapOf(new Pair[]{TuplesKt.to("inAppMessage", inAppMessage.getKey().toString())});
                executeOnAllPlugins(new Function1() { // from class: P3.q0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit processInAppMessage$lambda$1;
                        processInAppMessage$lambda$1 = BrazePlugin.Companion.processInAppMessage$lambda$1(hashMapOf, (BrazePlugin) obj);
                        return processInAppMessage$lambda$1;
                    }
                });
            }
        }

        @JvmStatic
        public final void processPushNotificationEvent(@NotNull BrazePushEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (!getActivePlugins().isEmpty() && BrazePlugin.isBrazePluginIsReady) {
                handlePushEvent(event);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.v0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String processPushNotificationEvent$lambda$6;
                        processPushNotificationEvent$lambda$6 = BrazePlugin.Companion.processPushNotificationEvent$lambda$6();
                        return processPushNotificationEvent$lambda$6;
                    }
                }, 6, (Object) null);
                getPendingPushEvents().add(event);
            }
        }

        private Companion() {
        }
    }

    private final BrazeProperties convertToBrazeProperties(Map<String, ?> arguments) {
        return arguments == null ? new BrazeProperties() : new BrazeProperties(new JSONObject(arguments));
    }

    private final Month getMonth(int value) {
        Month month = Month.INSTANCE.getMonth(value - 1);
        if (month != null) {
            return month;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String month$lambda$65;
                month$lambda$65 = BrazePlugin.getMonth$lambda$65();
                return month$lambda$65;
            }
        }, 6, (Object) null);
        return Month.JANUARY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getMonth$lambda$65() {
        return "Invalid `null` month. Defaulting to January.";
    }

    private final NotificationSubscriptionType getSubscriptionType(String type) {
        String obj = StringsKt.trim(type).toString();
        int hashCode = obj.hashCode();
        if (hashCode == -938807766) {
            if (obj.equals("SubscriptionType.unsubscribed")) {
                return NotificationSubscriptionType.UNSUBSCRIBED;
            }
            return null;
        }
        if (hashCode == 655408273) {
            if (obj.equals("SubscriptionType.subscribed")) {
                return NotificationSubscriptionType.SUBSCRIBED;
            }
            return null;
        }
        if (hashCode == 1559119849 && obj.equals("SubscriptionType.opted_in")) {
            return NotificationSubscriptionType.OPTED_IN;
        }
        return null;
    }

    private final void handleSdkAuthenticationError(BrazeSdkAuthenticationErrorEvent errorEvent) {
        if (activePlugins.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleSdkAuthenticationError$lambda$63;
                    handleSdkAuthenticationError$lambda$63 = BrazePlugin.handleSdkAuthenticationError$lambda$63();
                    return handleSdkAuthenticationError$lambda$63;
                }
            }, 6, (Object) null);
        } else {
            final HashMap hashMapOf = MapsKt.hashMapOf(new Pair[]{TuplesKt.to("sdkAuthenticationError", new JSONObject(MapsKt.hashMapOf(new Pair[]{TuplesKt.to("code", String.valueOf(errorEvent.getErrorCode())), TuplesKt.to("reason", errorEvent.getErrorReason()), TuplesKt.to("userId", errorEvent.getUserId())}).toString()).toString())});
            INSTANCE.executeOnAllPlugins(new Function1() { // from class: P3.g0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit handleSdkAuthenticationError$lambda$64;
                    handleSdkAuthenticationError$lambda$64 = BrazePlugin.handleSdkAuthenticationError$lambda$64(hashMapOf, (BrazePlugin) obj);
                    return handleSdkAuthenticationError$lambda$64;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleSdkAuthenticationError$lambda$63() {
        return "There are no active Braze Plugins. Not calling 'handleSdkAuthenticationError'.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleSdkAuthenticationError$lambda$64(HashMap sdkAuthenticationErrorMap, BrazePlugin it) {
        Intrinsics.checkNotNullParameter(sdkAuthenticationErrorMap, "$sdkAuthenticationErrorMap");
        Intrinsics.checkNotNullParameter(it, "it");
        j jVar = it.channel;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(AppsFlyerProperties.CHANNEL);
            jVar = null;
        }
        jVar.c("handleSdkAuthenticationError", sdkAuthenticationErrorMap);
        return Unit.INSTANCE;
    }

    private final void initPlugin(Context context, G9.b messenger) {
        this.flutterConfiguration = new FlutterConfiguration(context);
        j jVar = new j(messenger, "braze_plugin");
        jVar.e(this);
        this.context = context;
        this.channel = jVar;
        activePlugins.add(this);
        Braze.INSTANCE.getInstance(context).subscribeToSdkAuthenticationFailures(new IEventSubscriber() { // from class: P3.p
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazePlugin.initPlugin$lambda$0(BrazePlugin.this, (BrazeSdkAuthenticationErrorEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPlugin$lambda$0(BrazePlugin this$0, BrazeSdkAuthenticationErrorEvent message) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(message, "message");
        this$0.handleSdkAuthenticationError(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onAttachedToActivity$lambda$1() {
        return "Running Flutter BrazePlugin automatic initialization";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$10(String str, String str2, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.addAlias(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$11() {
        return "Unexpected null parameter(s) in `addToCustomAttributeArray`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$12(String str, String str2, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.addToCustomAttributeArray(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$13() {
        return "Unexpected null parameter(s) in `removeFromCustomAttributeArray`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$14(String str, String str2, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.removeFromCustomAttributeArray(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$16() {
        return "Unexpected null parameter(s) in `setNestedCustomUserAttribute`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$17(String str, JSONObject jSONObject, boolean z6, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.setCustomUserAttribute(str, jSONObject, z6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$18() {
        return "Unexpected null parameter(s) in `setCustomUserAttributeArrayOfStrings`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$19(String str, String[] strArr, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.setCustomAttributeArray(str, strArr);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$21() {
        return "Unexpected null parameter(s) in `setCustomUserAttributeArrayOfObjects`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$22(String str, JSONArray value, BrazeUser user) {
        Intrinsics.checkNotNullParameter(value, "$value");
        Intrinsics.checkNotNullParameter(user, "user");
        BrazeUser.setCustomAttribute$default(user, str, value, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$23() {
        return "Unexpected null parameter(s) in `setStringCustomUserAttribute`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$24(String str, String str2, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.setCustomUserAttribute(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$25() {
        return "Unexpected null key in `setDoubleCustomUserAttribute`";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$26(String str, double d6, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.setCustomUserAttribute(str, d6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$27() {
        return "Unexpected null key in `setDateCustomUserAttribute`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$28(String str, long j6, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.setCustomUserAttributeToSecondsFromEpoch(str, j6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$29() {
        return "Unexpected null key in `setIntCustomUserAttribute`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$30(String str, int i6, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.setCustomUserAttribute(str, i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$31() {
        return "Unexpected null key in `incrementCustomUserAttribute`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$32(String str, int i6, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.incrementCustomUserAttribute(str, i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$33() {
        return "Unexpected null key in `setBoolCustomUserAttribute`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$34(String str, boolean z6, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.setCustomUserAttribute(str, z6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$35() {
        return "Unexpected null key in `unsetCustomUserAttribute`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$36(String str, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.unsetCustomUserAttribute(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$37() {
        return "Unexpected null type in `setPushNotificationSubscriptionType`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$38(NotificationSubscriptionType notificationSubscriptionType, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.setPushNotificationSubscriptionType(notificationSubscriptionType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$39() {
        return "Unexpected null type in `setEmailNotificationSubscriptionType`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$4(j.d result, BrazeUser it) {
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(it, "it");
        if (StringsKt.isBlank(it.getUserId())) {
            result.a((Object) null);
        } else {
            result.a(it.getUserId());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$40(NotificationSubscriptionType notificationSubscriptionType, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.setEmailNotificationSubscriptionType(notificationSubscriptionType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$41() {
        return "Unexpected null groupId in `addToSubscriptionGroup`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$42(String str, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.addToSubscriptionGroup(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$43() {
        return "Unexpected null groupId in `removeFromSubscriptionGroup`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$44(String str, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.removeFromSubscriptionGroup(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$45() {
        return "Unexpected null key in `setLocationCustomAttribute`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$46(String str, double d6, double d7, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.setLocationCustomAttribute(str, d6, d7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$47(String str, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.setFirstName(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$48(String str, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.setLastName(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$49(int i6, Month month, int i7, BrazeUser user) {
        Intrinsics.checkNotNullParameter(month, "$month");
        Intrinsics.checkNotNullParameter(user, "user");
        user.setDateOfBirth(i6, month, i7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$50(String str, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.setEmail(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$51(Gender genderEnum, BrazeUser user) {
        Intrinsics.checkNotNullParameter(genderEnum, "$genderEnum");
        Intrinsics.checkNotNullParameter(user, "user");
        user.setGender(genderEnum);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$52(String str, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.setLanguage(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$53(String str, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.setCountry(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$54(String str, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.setHomeCity(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$55(String str, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        user.setPhoneNumber(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$56() {
        return "Unexpected null parameter(s) in `setAttributionData`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$57(AttributionData attributionData, BrazeUser user) {
        Intrinsics.checkNotNullParameter(attributionData, "$attributionData");
        Intrinsics.checkNotNullParameter(user, "user");
        user.setAttributionData(attributionData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$58() {
        return "Unexpected null parameter(s) in `setLastKnownLocation`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMethodCall$lambda$59(Double d6, Double d7, Double d8, Double d9, BrazeUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        BrazeUser.setLastKnownLocation$default(user, d6.doubleValue(), d7.doubleValue(), d8, d9, null, 16, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$6() {
        return "Unexpected null placementId in `getBanner`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$60() {
        return "Unexpected null id in `getFeatureFlagByID`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$62() {
        return "Unexpected null id in `logFeatureFlagImpression`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$8() {
        return "Unexpected null ids in `requestBannersRefresh`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$9() {
        return "Unexpected null parameter(s) in `addAlias`.";
    }

    private final void runOnUser(Braze braze, final Function1<? super BrazeUser, Unit> function1) {
        braze.getCurrentUser(new SimpleValueCallback<BrazeUser>() { // from class: com.braze.brazeplugin.BrazePlugin$runOnUser$1
            @Override // com.braze.events.SimpleValueCallback, com.braze.events.IValueCallback
            public void onSuccess(BrazeUser value) {
                Intrinsics.checkNotNullParameter(value, "value");
                super.onSuccess((BrazePlugin$runOnUser$1) value);
                function1.invoke(value);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToActivity(@org.jetbrains.annotations.NotNull C9.c r13) {
        /*
            r12 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            android.app.Activity r0 = r13.f()
            r12.activity = r0
            com.braze.brazeplugin.IntegrationInitializer r0 = com.braze.brazeplugin.IntegrationInitializer.INSTANCE
            boolean r1 = r0.isUninitialized()
            if (r1 == 0) goto L4c
            com.braze.brazeplugin.FlutterConfiguration r1 = r12.flutterConfiguration
            r2 = 0
            java.lang.String r3 = "flutterConfiguration"
            if (r1 != 0) goto L1e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r1 = r2
        L1e:
            boolean r1 = r1.isAutomaticInitializationEnabled()
            if (r1 == 0) goto L4c
            com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r6 = com.braze.support.BrazeLogger.Priority.f12982I
            P3.e r9 = new P3.e
            r9.<init>()
            r10 = 6
            r11 = 0
            r7 = 0
            r8 = 0
            r5 = r12
            com.braze.support.BrazeLogger.brazelog$default(r4, r5, r6, r7, r8, r9, r10, r11)
            android.app.Activity r1 = r5.activity
            if (r1 == 0) goto L4d
            android.app.Application r1 = r1.getApplication()
            if (r1 == 0) goto L4d
            com.braze.brazeplugin.FlutterConfiguration r4 = r5.flutterConfiguration
            if (r4 != 0) goto L47
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            goto L48
        L47:
            r2 = r4
        L48:
            r0.initializePlugin$braze_plugin_release(r1, r2)
            goto L4d
        L4c:
            r5 = r12
        L4d:
            B9.a$b r0 = r5.flutterPluginBinding
            if (r0 == 0) goto L76
            a r1 = new a
            G9.b r2 = r0.b()
            java.lang.String r3 = "getBinaryMessenger(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.<init>(r2)
            io.flutter.plugin.platform.m r0 = r0.c()
            com.braze.brazeplugin.BrazeBannerViewFactory r2 = new com.braze.brazeplugin.BrazeBannerViewFactory
            android.app.Activity r13 = r13.f()
            java.lang.String r3 = "getActivity(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r3)
            r2.<init>(r1, r13)
            java.lang.String r13 = "BrazeBannerView"
            r0.a(r13, r2)
        L76:
            com.braze.brazeplugin.BrazePlugin$Companion r13 = com.braze.brazeplugin.BrazePlugin.INSTANCE
            com.braze.brazeplugin.BrazePlugin.Companion.access$reprocessPendingPushEvents(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.brazeplugin.BrazePlugin.onAttachedToActivity(C9.c):void");
    }

    public void onAttachedToEngine(@NotNull a.b flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        Context a6 = flutterPluginBinding.a();
        Intrinsics.checkNotNullExpressionValue(a6, "getApplicationContext(...)");
        G9.b b6 = flutterPluginBinding.b();
        Intrinsics.checkNotNullExpressionValue(b6, "getBinaryMessenger(...)");
        initPlugin(a6, b6);
        this.flutterPluginBinding = flutterPluginBinding;
    }

    public void onDetachedFromActivity() {
        this.activity = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(@NotNull a.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        activePlugins.remove(this);
        j jVar = this.channel;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(AppsFlyerProperties.CHANNEL);
            jVar = null;
        }
        jVar.e((j.c) null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0033. Please report as an issue. */
    public void onMethodCall(@NotNull i call, @NotNull final j.d result) {
        Boolean bool;
        ArrayList arrayList;
        final Gender gender;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            String str = call.a;
            try {
                if (str != null) {
                    String str2 = "";
                    Context context = null;
                    Context context2 = null;
                    Context context3 = null;
                    Context context4 = null;
                    Context context5 = null;
                    Context context6 = null;
                    Context context7 = null;
                    Context context8 = null;
                    Context context9 = null;
                    Context context10 = null;
                    Context context11 = null;
                    Context context12 = null;
                    Context context13 = null;
                    Context context14 = null;
                    Context context15 = null;
                    Context context16 = null;
                    Context context17 = null;
                    Context context18 = null;
                    Context context19 = null;
                    Context context20 = null;
                    Context context21 = null;
                    Context context22 = null;
                    Context context23 = null;
                    Context context24 = null;
                    Context context25 = null;
                    Context context26 = null;
                    Context context27 = null;
                    Context context28 = null;
                    Context context29 = null;
                    Context context30 = null;
                    Context context31 = null;
                    Context context32 = null;
                    Context context33 = null;
                    Context context34 = null;
                    Context context35 = null;
                    Context context36 = null;
                    Context context37 = null;
                    Context context38 = null;
                    Context context39 = null;
                    Context context40 = null;
                    Context context41 = null;
                    Context context42 = null;
                    Context context43 = null;
                    Context context44 = null;
                    Context context45 = null;
                    Context context46 = null;
                    Context context47 = null;
                    Context context48 = null;
                    Context context49 = null;
                    Context context50 = null;
                    Context context51 = null;
                    Context context52 = null;
                    Context context53 = null;
                    Context context54 = null;
                    Context context55 = null;
                    Context context56 = null;
                    Context context57 = null;
                    try {
                        switch (str.hashCode()) {
                            case -2131879013:
                                if (!str.equals("changeUser")) {
                                    result.c();
                                    Unit unit = Unit.INSTANCE;
                                }
                                String str3 = (String) call.a("userId");
                                String str4 = (String) call.a("sdkAuthSignature");
                                if (str4 == null) {
                                    Braze.Companion companion = Braze.INSTANCE;
                                    Context context58 = this.context;
                                    if (context58 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context57 = context58;
                                    }
                                    companion.getInstance(context57).changeUser(str3);
                                } else {
                                    Braze.Companion companion2 = Braze.INSTANCE;
                                    Context context59 = this.context;
                                    if (context59 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context = context59;
                                    }
                                    companion2.getInstance(context).changeUser(str3, str4);
                                }
                                Unit unit2 = Unit.INSTANCE;
                                return;
                            case -1981695516:
                                if (!str.equals("setGoogleAdvertisingId")) {
                                    result.c();
                                    Unit unit3 = Unit.INSTANCE;
                                }
                                String str5 = (String) call.a("id");
                                if (str5 == null || (bool = (Boolean) call.a("adTrackingEnabled")) == null) {
                                    return;
                                }
                                boolean booleanValue = bool.booleanValue();
                                Braze.Companion companion3 = Braze.INSTANCE;
                                Context context60 = this.context;
                                if (context60 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("context");
                                } else {
                                    context56 = context60;
                                }
                                companion3.getInstance(context56).setGoogleAdvertisingId(str5, booleanValue);
                                Unit unit4 = Unit.INSTANCE;
                                return;
                            case -1618914254:
                                if (!str.equals("disableSDK")) {
                                    result.c();
                                    Unit unit32 = Unit.INSTANCE;
                                }
                                Braze.Companion companion4 = Braze.INSTANCE;
                                Context context61 = this.context;
                                if (context61 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("context");
                                } else {
                                    context55 = context61;
                                }
                                companion4.disableSdk(context55);
                                Unit unit5 = Unit.INSTANCE;
                                return;
                            case -1448662595:
                                if (!str.equals("launchContentCards")) {
                                    result.c();
                                    Unit unit322 = Unit.INSTANCE;
                                }
                                if (this.activity != null) {
                                    Intent intent = new Intent(this.activity, (Class<?>) ContentCardsActivity.class);
                                    intent.setFlags(872415232);
                                    Context context62 = this.context;
                                    if (context62 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context54 = context62;
                                    }
                                    context54.startActivity(intent);
                                }
                                Unit unit6 = Unit.INSTANCE;
                                return;
                            case -1396998068:
                                if (!str.equals("setBrazePluginIsReady")) {
                                    result.c();
                                    Unit unit3222 = Unit.INSTANCE;
                                } else {
                                    isBrazePluginIsReady = true;
                                    INSTANCE.reprocessPendingPushEvents();
                                    Unit unit7 = Unit.INSTANCE;
                                    return;
                                }
                            case -1284111084:
                                if (!str.equals("setBoolCustomUserAttribute")) {
                                    result.c();
                                    Unit unit32222 = Unit.INSTANCE;
                                }
                                final String str6 = (String) call.a("key");
                                Boolean bool2 = (Boolean) call.a(b.f11195Y);
                                final boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                                if (str6 == null) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.o
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            String onMethodCall$lambda$33;
                                            onMethodCall$lambda$33 = BrazePlugin.onMethodCall$lambda$33();
                                            return onMethodCall$lambda$33;
                                        }
                                    }, 6, (Object) null);
                                    return;
                                }
                                Braze.Companion companion5 = Braze.INSTANCE;
                                Context context63 = this.context;
                                if (context63 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("context");
                                } else {
                                    context53 = context63;
                                }
                                runOnUser(companion5.getInstance(context53), new Function1() { // from class: P3.q
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit onMethodCall$lambda$34;
                                        onMethodCall$lambda$34 = BrazePlugin.onMethodCall$lambda$34(str6, booleanValue2, (BrazeUser) obj);
                                        return onMethodCall$lambda$34;
                                    }
                                });
                                Unit unit8 = Unit.INSTANCE;
                                return;
                            case -1263769041:
                                if (!str.equals("addAlias")) {
                                    break;
                                } else {
                                    final String str7 = (String) call.a("aliasName");
                                    final String str8 = (String) call.a("aliasLabel");
                                    if (str7 == null || str8 == null) {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.G
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                String onMethodCall$lambda$9;
                                                onMethodCall$lambda$9 = BrazePlugin.onMethodCall$lambda$9();
                                                return onMethodCall$lambda$9;
                                            }
                                        }, 6, (Object) null);
                                        return;
                                    }
                                    Braze.Companion companion6 = Braze.INSTANCE;
                                    Context context64 = this.context;
                                    if (context64 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context52 = context64;
                                    }
                                    runOnUser(companion6.getInstance(context52), new Function1() { // from class: P3.T
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit onMethodCall$lambda$10;
                                            onMethodCall$lambda$10 = BrazePlugin.onMethodCall$lambda$10(str7, str8, (BrazeUser) obj);
                                            return onMethodCall$lambda$10;
                                        }
                                    });
                                    Unit unit9 = Unit.INSTANCE;
                                    return;
                                }
                            case -1227761272:
                                if (!str.equals("setSdkAuthenticationSignature")) {
                                    break;
                                } else {
                                    String str9 = (String) call.a("sdkAuthSignature");
                                    if (str9 != null) {
                                        Braze.Companion companion7 = Braze.INSTANCE;
                                        Context context65 = this.context;
                                        if (context65 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("context");
                                        } else {
                                            context51 = context65;
                                        }
                                        companion7.getInstance(context51).setSdkAuthenticationSignature(str9);
                                    }
                                    Unit unit10 = Unit.INSTANCE;
                                    return;
                                }
                            case -1146185036:
                                if (!str.equals("removeFromSubscriptionGroup")) {
                                    break;
                                } else {
                                    final String str10 = (String) call.a("groupId");
                                    if (str10 == null) {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.B
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                String onMethodCall$lambda$43;
                                                onMethodCall$lambda$43 = BrazePlugin.onMethodCall$lambda$43();
                                                return onMethodCall$lambda$43;
                                            }
                                        }, 6, (Object) null);
                                        return;
                                    }
                                    Braze.Companion companion8 = Braze.INSTANCE;
                                    Context context66 = this.context;
                                    if (context66 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context50 = context66;
                                    }
                                    runOnUser(companion8.getInstance(context50), new Function1() { // from class: P3.C
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit onMethodCall$lambda$44;
                                            onMethodCall$lambda$44 = BrazePlugin.onMethodCall$lambda$44(str10, (BrazeUser) obj);
                                            return onMethodCall$lambda$44;
                                        }
                                    });
                                    Unit unit11 = Unit.INSTANCE;
                                    return;
                                }
                            case -1107875961:
                                if (!str.equals("getDeviceId")) {
                                    break;
                                } else {
                                    Braze.Companion companion9 = Braze.INSTANCE;
                                    Context context67 = this.context;
                                    if (context67 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context49 = context67;
                                    }
                                    result.a(companion9.getInstance(context49).getDeviceId());
                                    Unit unit12 = Unit.INSTANCE;
                                    return;
                                }
                            case -1058498415:
                                if (!str.equals("wipeData")) {
                                    break;
                                } else {
                                    Braze.Companion companion10 = Braze.INSTANCE;
                                    Context context68 = this.context;
                                    if (context68 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context48 = context68;
                                    }
                                    companion10.wipeData(context48);
                                    Unit unit13 = Unit.INSTANCE;
                                    return;
                                }
                            case -1056030027:
                                if (!str.equals("setSdkAuthenticationDelegate")) {
                                    break;
                                } else {
                                    Unit unit14 = Unit.INSTANCE;
                                    return;
                                }
                            case -1043223038:
                                if (!str.equals("requestContentCardsRefresh")) {
                                    break;
                                } else {
                                    Braze.Companion companion11 = Braze.INSTANCE;
                                    Context context69 = this.context;
                                    if (context69 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context47 = context69;
                                    }
                                    companion11.getInstance(context47).requestContentCardsRefresh();
                                    Unit unit15 = Unit.INSTANCE;
                                    return;
                                }
                            case -991721531:
                                if (!str.equals("logCustomEvent")) {
                                    break;
                                } else {
                                    String str11 = (String) call.a("eventName");
                                    BrazeProperties convertToBrazeProperties = convertToBrazeProperties((Map) call.a("properties"));
                                    Braze.Companion companion12 = Braze.INSTANCE;
                                    Context context70 = this.context;
                                    if (context70 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context46 = context70;
                                    }
                                    companion12.getInstance(context46).logCustomEvent(str11, convertToBrazeProperties);
                                    Unit unit16 = Unit.INSTANCE;
                                    return;
                                }
                            case -869195440:
                                if (!str.equals("setCustomUserAttributeArrayOfStrings")) {
                                    break;
                                } else {
                                    final String str12 = (String) call.a("key");
                                    List list = (List) call.a(b.f11195Y);
                                    final String[] strArr = list != null ? (String[]) list.toArray(new String[0]) : null;
                                    if (str12 != null && strArr != null) {
                                        Braze.Companion companion13 = Braze.INSTANCE;
                                        Context context71 = this.context;
                                        if (context71 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("context");
                                        } else {
                                            context45 = context71;
                                        }
                                        runOnUser(companion13.getInstance(context45), new Function1() { // from class: P3.h0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit onMethodCall$lambda$19;
                                                onMethodCall$lambda$19 = BrazePlugin.onMethodCall$lambda$19(str12, strArr, (BrazeUser) obj);
                                                return onMethodCall$lambda$19;
                                            }
                                        });
                                        Unit unit17 = Unit.INSTANCE;
                                        return;
                                    }
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.X
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            String onMethodCall$lambda$18;
                                            onMethodCall$lambda$18 = BrazePlugin.onMethodCall$lambda$18();
                                            return onMethodCall$lambda$18;
                                        }
                                    }, 6, (Object) null);
                                    return;
                                }
                            case -811628443:
                                if (!str.equals("logPurchase")) {
                                    break;
                                } else {
                                    String str13 = (String) call.a("productId");
                                    String str14 = (String) call.a(AppsFlyerProperties.CURRENCY_CODE);
                                    Double d6 = (Double) call.a(b.f11220x);
                                    double doubleValue = d6 != null ? d6.doubleValue() : 0.0d;
                                    Integer num = (Integer) call.a("quantity");
                                    int intValue = num != null ? num.intValue() : 1;
                                    BrazeProperties convertToBrazeProperties2 = convertToBrazeProperties((Map) call.a("properties"));
                                    Braze.Companion companion14 = Braze.INSTANCE;
                                    Context context72 = this.context;
                                    if (context72 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context44 = context72;
                                    }
                                    companion14.getInstance(context44).logPurchase(str13, str14, new BigDecimal(doubleValue), intValue, convertToBrazeProperties2);
                                    Unit unit18 = Unit.INSTANCE;
                                    return;
                                }
                            case -792744658:
                                if (!str.equals("logContentCardImpression")) {
                                    break;
                                } else {
                                    String str15 = (String) call.a("contentCardString");
                                    if (str15 != null) {
                                        Braze.Companion companion15 = Braze.INSTANCE;
                                        Context context73 = this.context;
                                        if (context73 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("context");
                                        } else {
                                            context43 = context73;
                                        }
                                        Card deserializeContentCard = companion15.getInstance(context43).deserializeContentCard(str15);
                                        if (deserializeContentCard != null) {
                                            deserializeContentCard.logImpression();
                                        }
                                    }
                                    Unit unit19 = Unit.INSTANCE;
                                    return;
                                }
                            case -760422984:
                                if (!str.equals("requestImmediateDataFlush")) {
                                    break;
                                } else {
                                    Braze.Companion companion16 = Braze.INSTANCE;
                                    Context context74 = this.context;
                                    if (context74 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context42 = context74;
                                    }
                                    companion16.getInstance(context42).requestImmediateDataFlush();
                                    Unit unit20 = Unit.INSTANCE;
                                    return;
                                }
                            case -721841540:
                                if (!str.equals("setEmailNotificationSubscriptionType")) {
                                    break;
                                } else {
                                    String str16 = (String) call.a("type");
                                    if (str16 != null) {
                                        str2 = str16;
                                    }
                                    final NotificationSubscriptionType subscriptionType = getSubscriptionType(str2);
                                    if (subscriptionType == null) {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.w
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                String onMethodCall$lambda$39;
                                                onMethodCall$lambda$39 = BrazePlugin.onMethodCall$lambda$39();
                                                return onMethodCall$lambda$39;
                                            }
                                        }, 6, (Object) null);
                                        return;
                                    }
                                    Braze.Companion companion17 = Braze.INSTANCE;
                                    Context context75 = this.context;
                                    if (context75 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context41 = context75;
                                    }
                                    runOnUser(companion17.getInstance(context41), new Function1() { // from class: P3.x
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit onMethodCall$lambda$40;
                                            onMethodCall$lambda$40 = BrazePlugin.onMethodCall$lambda$40(NotificationSubscriptionType.this, (BrazeUser) obj);
                                            return onMethodCall$lambda$40;
                                        }
                                    });
                                    Unit unit21 = Unit.INSTANCE;
                                    return;
                                }
                            case -703008304:
                                if (!str.equals("setDateCustomUserAttribute")) {
                                    break;
                                } else {
                                    final String str17 = (String) call.a("key");
                                    Integer num2 = (Integer) call.a(b.f11195Y);
                                    final long intValue2 = num2 != null ? num2.intValue() : 0;
                                    if (str17 == null) {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.h
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                String onMethodCall$lambda$27;
                                                onMethodCall$lambda$27 = BrazePlugin.onMethodCall$lambda$27();
                                                return onMethodCall$lambda$27;
                                            }
                                        }, 6, (Object) null);
                                        return;
                                    }
                                    Braze.Companion companion18 = Braze.INSTANCE;
                                    Context context76 = this.context;
                                    if (context76 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context40 = context76;
                                    }
                                    runOnUser(companion18.getInstance(context40), new Function1() { // from class: P3.j
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit onMethodCall$lambda$28;
                                            onMethodCall$lambda$28 = BrazePlugin.onMethodCall$lambda$28(str17, intValue2, (BrazeUser) obj);
                                            return onMethodCall$lambda$28;
                                        }
                                    });
                                    Unit unit22 = Unit.INSTANCE;
                                    return;
                                }
                            case -670372238:
                                if (!str.equals("updateTrackingPropertyAllowList")) {
                                    break;
                                }
                                Unit unit23 = Unit.INSTANCE;
                                return;
                            case -647085086:
                                if (!str.equals("setCustomUserAttributeArrayOfObjects")) {
                                    break;
                                } else {
                                    final String str18 = (String) call.a("key");
                                    List list2 = (List) call.a(b.f11195Y);
                                    if (list2 != null) {
                                        List list3 = list2;
                                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                                        Iterator it = list3.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(new JSONObject((Map) it.next()));
                                        }
                                    } else {
                                        arrayList = null;
                                    }
                                    final JSONArray jSONArray = new JSONArray((Collection) arrayList);
                                    if (str18 == null) {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.i0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                String onMethodCall$lambda$21;
                                                onMethodCall$lambda$21 = BrazePlugin.onMethodCall$lambda$21();
                                                return onMethodCall$lambda$21;
                                            }
                                        }, 6, (Object) null);
                                        return;
                                    }
                                    Braze.Companion companion19 = Braze.INSTANCE;
                                    Context context77 = this.context;
                                    if (context77 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context39 = context77;
                                    }
                                    runOnUser(companion19.getInstance(context39), new Function1() { // from class: P3.j0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit onMethodCall$lambda$22;
                                            onMethodCall$lambda$22 = BrazePlugin.onMethodCall$lambda$22(str18, jSONArray, (BrazeUser) obj);
                                            return onMethodCall$lambda$22;
                                        }
                                    });
                                    Unit unit24 = Unit.INSTANCE;
                                    return;
                                }
                            case -638032980:
                                if (!str.equals("refreshFeatureFlags")) {
                                    break;
                                } else {
                                    Braze.Companion companion20 = Braze.INSTANCE;
                                    Context context78 = this.context;
                                    if (context78 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context38 = context78;
                                    }
                                    companion20.getInstance(context38).refreshFeatureFlags();
                                    Unit unit25 = Unit.INSTANCE;
                                    return;
                                }
                            case -631666761:
                                if (!str.equals("enableSDK")) {
                                    break;
                                } else {
                                    Braze.Companion companion21 = Braze.INSTANCE;
                                    Context context79 = this.context;
                                    if (context79 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context37 = context79;
                                    }
                                    companion21.enableSdk(context37);
                                    Unit unit26 = Unit.INSTANCE;
                                    return;
                                }
                            case -614455072:
                                if (!str.equals("setLastKnownLocation")) {
                                    break;
                                } else {
                                    final Double d7 = (Double) call.a("latitude");
                                    final Double d8 = (Double) call.a("longitude");
                                    final Double d9 = (Double) call.a("accuracy");
                                    final Double d10 = (Double) call.a("altitude");
                                    if (d7 != null && d8 != null) {
                                        Braze.Companion companion22 = Braze.INSTANCE;
                                        Context context80 = this.context;
                                        if (context80 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("context");
                                        } else {
                                            context36 = context80;
                                        }
                                        runOnUser(companion22.getInstance(context36), new Function1() { // from class: P3.V
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit onMethodCall$lambda$59;
                                                onMethodCall$lambda$59 = BrazePlugin.onMethodCall$lambda$59(d7, d8, d10, d9, (BrazeUser) obj);
                                                return onMethodCall$lambda$59;
                                            }
                                        });
                                        Unit unit27 = Unit.INSTANCE;
                                        return;
                                    }
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.U
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            String onMethodCall$lambda$58;
                                            onMethodCall$lambda$58 = BrazePlugin.onMethodCall$lambda$58();
                                            return onMethodCall$lambda$58;
                                        }
                                    }, 6, (Object) null);
                                    return;
                                }
                            case -510261241:
                                if (!str.equals("setAttributionData")) {
                                    break;
                                } else {
                                    String str19 = (String) call.a("network");
                                    String str20 = (String) call.a("campaign");
                                    String str21 = (String) call.a("adGroup");
                                    String str22 = (String) call.a("creative");
                                    if (str19 != null && str20 != null && str21 != null && str22 != null) {
                                        final AttributionData attributionData = new AttributionData(str19, str20, str21, str22);
                                        Braze.Companion companion23 = Braze.INSTANCE;
                                        Context context81 = this.context;
                                        if (context81 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("context");
                                        } else {
                                            context35 = context81;
                                        }
                                        runOnUser(companion23.getInstance(context35), new Function1() { // from class: P3.S
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit onMethodCall$lambda$57;
                                                onMethodCall$lambda$57 = BrazePlugin.onMethodCall$lambda$57(AttributionData.this, (BrazeUser) obj);
                                                return onMethodCall$lambda$57;
                                            }
                                        });
                                        Unit unit28 = Unit.INSTANCE;
                                        return;
                                    }
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.Q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            String onMethodCall$lambda$56;
                                            onMethodCall$lambda$56 = BrazePlugin.onMethodCall$lambda$56();
                                            return onMethodCall$lambda$56;
                                        }
                                    }, 6, (Object) null);
                                    return;
                                }
                            case -433325406:
                                if (!str.equals("getCachedContentCards")) {
                                    break;
                                } else {
                                    Braze.Companion companion24 = Braze.INSTANCE;
                                    Context context82 = this.context;
                                    if (context82 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context34 = context82;
                                    }
                                    List<Card> cachedContentCards = companion24.getInstance(context34).getCachedContentCards();
                                    if (cachedContentCards != null) {
                                        List<Card> list4 = cachedContentCards;
                                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                                        Iterator<T> it2 = list4.iterator();
                                        while (it2.hasNext()) {
                                            arrayList2.add(((Card) it2.next()).getKey().toString());
                                        }
                                        result.a(arrayList2);
                                    }
                                    Unit unit29 = Unit.INSTANCE;
                                    return;
                                }
                            case -424143289:
                                if (!str.equals("logFeatureFlagImpression")) {
                                    break;
                                } else {
                                    String str23 = (String) call.a("id");
                                    if (str23 == null) {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.Y
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                String onMethodCall$lambda$62;
                                                onMethodCall$lambda$62 = BrazePlugin.onMethodCall$lambda$62();
                                                return onMethodCall$lambda$62;
                                            }
                                        }, 6, (Object) null);
                                        return;
                                    }
                                    Braze.Companion companion25 = Braze.INSTANCE;
                                    Context context83 = this.context;
                                    if (context83 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context33 = context83;
                                    }
                                    companion25.getInstance(context33).logFeatureFlagImpression(str23);
                                    Unit unit30 = Unit.INSTANCE;
                                    return;
                                }
                            case -363470636:
                                if (!str.equals("setCountry")) {
                                    break;
                                } else {
                                    final String str24 = (String) call.a(AdRevenueScheme.COUNTRY);
                                    Braze.Companion companion26 = Braze.INSTANCE;
                                    Context context84 = this.context;
                                    if (context84 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context32 = context84;
                                    }
                                    runOnUser(companion26.getInstance(context32), new Function1() { // from class: P3.N
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit onMethodCall$lambda$53;
                                            onMethodCall$lambda$53 = BrazePlugin.onMethodCall$lambda$53(str24, (BrazeUser) obj);
                                            return onMethodCall$lambda$53;
                                        }
                                    });
                                    Unit unit31 = Unit.INSTANCE;
                                    return;
                                }
                            case -208022518:
                                if (!str.equals("addToCustomAttributeArray")) {
                                    break;
                                } else {
                                    final String str25 = (String) call.a("key");
                                    final String str26 = (String) call.a(b.f11195Y);
                                    if (str25 != null && str26 != null) {
                                        Braze.Companion companion27 = Braze.INSTANCE;
                                        Context context85 = this.context;
                                        if (context85 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("context");
                                        } else {
                                            context31 = context85;
                                        }
                                        runOnUser(companion27.getInstance(context31), new Function1() { // from class: P3.a0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit onMethodCall$lambda$12;
                                                onMethodCall$lambda$12 = BrazePlugin.onMethodCall$lambda$12(str25, str26, (BrazeUser) obj);
                                                return onMethodCall$lambda$12;
                                            }
                                        });
                                        Unit unit33 = Unit.INSTANCE;
                                        return;
                                    }
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.Z
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            String onMethodCall$lambda$11;
                                            onMethodCall$lambda$11 = BrazePlugin.onMethodCall$lambda$11();
                                            return onMethodCall$lambda$11;
                                        }
                                    }, 6, (Object) null);
                                    return;
                                }
                            case -187323801:
                                if (!str.equals("setNestedCustomUserAttribute")) {
                                    break;
                                } else {
                                    final String str27 = (String) call.a("key");
                                    Map map = (Map) call.a(b.f11195Y);
                                    final JSONObject jSONObject = map != null ? new JSONObject(map) : null;
                                    Boolean bool3 = (Boolean) call.a("merge");
                                    final boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
                                    if (str27 != null && jSONObject != null) {
                                        Braze.Companion companion28 = Braze.INSTANCE;
                                        Context context86 = this.context;
                                        if (context86 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("context");
                                        } else {
                                            context30 = context86;
                                        }
                                        runOnUser(companion28.getInstance(context30), new Function1() { // from class: P3.L
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit onMethodCall$lambda$17;
                                                onMethodCall$lambda$17 = BrazePlugin.onMethodCall$lambda$17(str27, jSONObject, booleanValue3, (BrazeUser) obj);
                                                return onMethodCall$lambda$17;
                                            }
                                        });
                                        Unit unit34 = Unit.INSTANCE;
                                        return;
                                    }
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.d0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            String onMethodCall$lambda$16;
                                            onMethodCall$lambda$16 = BrazePlugin.onMethodCall$lambda$16();
                                            return onMethodCall$lambda$16;
                                        }
                                    }, 6, (Object) null);
                                    return;
                                }
                            case 30334285:
                                if (!str.equals("setDoubleCustomUserAttribute")) {
                                    break;
                                } else {
                                    final String str28 = (String) call.a("key");
                                    Double d11 = (Double) call.a(b.f11195Y);
                                    final double doubleValue2 = d11 != null ? d11.doubleValue() : 0.0d;
                                    if (str28 == null) {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.f
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                String onMethodCall$lambda$25;
                                                onMethodCall$lambda$25 = BrazePlugin.onMethodCall$lambda$25();
                                                return onMethodCall$lambda$25;
                                            }
                                        }, 6, (Object) null);
                                        return;
                                    }
                                    Braze.Companion companion29 = Braze.INSTANCE;
                                    Context context87 = this.context;
                                    if (context87 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context29 = context87;
                                    }
                                    runOnUser(companion29.getInstance(context29), new Function1() { // from class: P3.g
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit onMethodCall$lambda$26;
                                            onMethodCall$lambda$26 = BrazePlugin.onMethodCall$lambda$26(str28, doubleValue2, (BrazeUser) obj);
                                            return onMethodCall$lambda$26;
                                        }
                                    });
                                    Unit unit35 = Unit.INSTANCE;
                                    return;
                                }
                            case 130003172:
                                if (!str.equals("logContentCardDismissed")) {
                                    break;
                                } else {
                                    String str29 = (String) call.a("contentCardString");
                                    if (str29 != null) {
                                        Braze.Companion companion30 = Braze.INSTANCE;
                                        Context context88 = this.context;
                                        if (context88 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("context");
                                        } else {
                                            context28 = context88;
                                        }
                                        Card deserializeContentCard2 = companion30.getInstance(context28).deserializeContentCard(str29);
                                        if (deserializeContentCard2 != null) {
                                            deserializeContentCard2.setDismissed(true);
                                            Unit unit36 = Unit.INSTANCE;
                                        }
                                    }
                                    Unit unit37 = Unit.INSTANCE;
                                    return;
                                }
                            case 195984819:
                                if (!str.equals("setIntCustomUserAttribute")) {
                                    break;
                                } else {
                                    final String str30 = (String) call.a("key");
                                    Integer num3 = (Integer) call.a(b.f11195Y);
                                    final int intValue3 = num3 != null ? num3.intValue() : 0;
                                    if (str30 == null) {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.k
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                String onMethodCall$lambda$29;
                                                onMethodCall$lambda$29 = BrazePlugin.onMethodCall$lambda$29();
                                                return onMethodCall$lambda$29;
                                            }
                                        }, 6, (Object) null);
                                        return;
                                    }
                                    Braze.Companion companion31 = Braze.INSTANCE;
                                    Context context89 = this.context;
                                    if (context89 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context27 = context89;
                                    }
                                    runOnUser(companion31.getInstance(context27), new Function1() { // from class: P3.l
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit onMethodCall$lambda$30;
                                            onMethodCall$lambda$30 = BrazePlugin.onMethodCall$lambda$30(str30, intValue3, (BrazeUser) obj);
                                            return onMethodCall$lambda$30;
                                        }
                                    });
                                    Unit unit38 = Unit.INSTANCE;
                                    return;
                                }
                            case 231885251:
                                if (!str.equals("setGender")) {
                                    break;
                                } else {
                                    String str31 = (String) call.a("gender");
                                    if (str31 != null) {
                                        Locale locale = Locale.getDefault();
                                        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                                        String upperCase = str31.toUpperCase(locale);
                                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                        if (upperCase != null) {
                                            str2 = upperCase;
                                        }
                                    }
                                    if (StringsKt.startsWith$default(str2, "F", false, 2, (Object) null)) {
                                        gender = Gender.FEMALE;
                                    } else if (StringsKt.startsWith$default(str2, "M", false, 2, (Object) null)) {
                                        gender = Gender.MALE;
                                    } else if (StringsKt.startsWith$default(str2, "N", false, 2, (Object) null)) {
                                        gender = Gender.NOT_APPLICABLE;
                                    } else if (StringsKt.startsWith$default(str2, "O", false, 2, (Object) null)) {
                                        gender = Gender.OTHER;
                                    } else {
                                        if (!StringsKt.startsWith$default(str2, "P", false, 2, (Object) null)) {
                                            if (StringsKt.startsWith$default(str2, "U", false, 2, (Object) null)) {
                                                gender = Gender.UNKNOWN;
                                            }
                                            return;
                                        }
                                        gender = Gender.PREFER_NOT_TO_SAY;
                                    }
                                    Braze.Companion companion32 = Braze.INSTANCE;
                                    Context context90 = this.context;
                                    if (context90 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context26 = context90;
                                    }
                                    runOnUser(companion32.getInstance(context26), new Function1() { // from class: P3.K
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit onMethodCall$lambda$51;
                                            onMethodCall$lambda$51 = BrazePlugin.onMethodCall$lambda$51(Gender.this, (BrazeUser) obj);
                                            return onMethodCall$lambda$51;
                                        }
                                    });
                                    Unit unit39 = Unit.INSTANCE;
                                    return;
                                }
                            case 299672098:
                                if (!str.equals("getBanner")) {
                                    break;
                                } else {
                                    String str32 = (String) call.a("placementId");
                                    if (str32 == null) {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.i
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                String onMethodCall$lambda$6;
                                                onMethodCall$lambda$6 = BrazePlugin.onMethodCall$lambda$6();
                                                return onMethodCall$lambda$6;
                                            }
                                        }, 6, (Object) null);
                                        return;
                                    }
                                    Braze.Companion companion33 = Braze.INSTANCE;
                                    Context context91 = this.context;
                                    if (context91 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                        context91 = null;
                                    }
                                    Banner banner = companion33.getInstance(context91).getBanner(str32);
                                    result.a(banner != null ? banner.getKey().get("banner").toString() : null);
                                    Unit unit40 = Unit.INSTANCE;
                                    return;
                                }
                            case 365067907:
                                if (!str.equals("requestBannersRefresh")) {
                                    break;
                                } else {
                                    List<String> list5 = (List) call.a("placementIds");
                                    if (list5 == null) {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.u
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                String onMethodCall$lambda$8;
                                                onMethodCall$lambda$8 = BrazePlugin.onMethodCall$lambda$8();
                                                return onMethodCall$lambda$8;
                                            }
                                        }, 6, (Object) null);
                                        return;
                                    }
                                    Braze.Companion companion34 = Braze.INSTANCE;
                                    Context context92 = this.context;
                                    if (context92 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context25 = context92;
                                    }
                                    companion34.getInstance(context25).requestBannersRefresh(list5);
                                    result.a("`requestBannersRefresh` called.");
                                    Unit unit41 = Unit.INSTANCE;
                                    return;
                                }
                            case 375730650:
                                if (!str.equals("setLanguage")) {
                                    break;
                                } else {
                                    final String str33 = (String) call.a("language");
                                    Braze.Companion companion35 = Braze.INSTANCE;
                                    Context context93 = this.context;
                                    if (context93 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context24 = context93;
                                    }
                                    runOnUser(companion35.getInstance(context24), new Function1() { // from class: P3.M
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit onMethodCall$lambda$52;
                                            onMethodCall$lambda$52 = BrazePlugin.onMethodCall$lambda$52(str33, (BrazeUser) obj);
                                            return onMethodCall$lambda$52;
                                        }
                                    });
                                    Unit unit42 = Unit.INSTANCE;
                                    return;
                                }
                            case 529720515:
                                if (!str.equals("setLastName")) {
                                    break;
                                } else {
                                    final String str34 = (String) call.a("lastName");
                                    Braze.Companion companion36 = Braze.INSTANCE;
                                    Context context94 = this.context;
                                    if (context94 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context23 = context94;
                                    }
                                    runOnUser(companion36.getInstance(context23), new Function1() { // from class: P3.H
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit onMethodCall$lambda$48;
                                            onMethodCall$lambda$48 = BrazePlugin.onMethodCall$lambda$48(str34, (BrazeUser) obj);
                                            return onMethodCall$lambda$48;
                                        }
                                    });
                                    Unit unit43 = Unit.INSTANCE;
                                    return;
                                }
                            case 584576454:
                                if (!str.equals("logInAppMessageButtonClicked")) {
                                    break;
                                } else {
                                    Braze.Companion companion37 = Braze.INSTANCE;
                                    Context context95 = this.context;
                                    if (context95 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context22 = context95;
                                    }
                                    IInAppMessage deserializeInAppMessageString = companion37.getInstance(context22).deserializeInAppMessageString((String) call.a("inAppMessageString"));
                                    if (deserializeInAppMessageString instanceof IInAppMessageImmersive) {
                                        Integer num4 = (Integer) call.a("buttonId");
                                        int intValue4 = num4 != null ? num4.intValue() : 0;
                                        Iterator<MessageButton> it3 = ((IInAppMessageImmersive) deserializeInAppMessageString).getMessageButtons().iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                MessageButton next = it3.next();
                                                if (next.getId() == intValue4) {
                                                    ((IInAppMessageImmersive) deserializeInAppMessageString).logButtonClick(next);
                                                }
                                            }
                                        }
                                    }
                                    Unit unit44 = Unit.INSTANCE;
                                    return;
                                }
                            case 650064796:
                                if (!str.equals("registerPushToken")) {
                                    break;
                                } else {
                                    String str35 = (String) call.a("pushToken");
                                    Braze.Companion companion38 = Braze.INSTANCE;
                                    Context context96 = this.context;
                                    if (context96 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context21 = context96;
                                    }
                                    companion38.getInstance(context21).setRegisteredPushToken(str35);
                                    Unit unit45 = Unit.INSTANCE;
                                    return;
                                }
                            case 689992853:
                                if (!str.equals("setPhoneNumber")) {
                                    break;
                                } else {
                                    final String str36 = (String) call.a("phoneNumber");
                                    Braze.Companion companion39 = Braze.INSTANCE;
                                    Context context97 = this.context;
                                    if (context97 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context20 = context97;
                                    }
                                    runOnUser(companion39.getInstance(context20), new Function1() { // from class: P3.P
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit onMethodCall$lambda$55;
                                            onMethodCall$lambda$55 = BrazePlugin.onMethodCall$lambda$55(str36, (BrazeUser) obj);
                                            return onMethodCall$lambda$55;
                                        }
                                    });
                                    Unit unit46 = Unit.INSTANCE;
                                    return;
                                }
                            case 701965116:
                                if (!str.equals("getAllFeatureFlags")) {
                                    break;
                                } else {
                                    Braze.Companion companion40 = Braze.INSTANCE;
                                    Context context98 = this.context;
                                    if (context98 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context19 = context98;
                                    }
                                    List<FeatureFlag> allFeatureFlags = companion40.getInstance(context19).getAllFeatureFlags();
                                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(allFeatureFlags, 10));
                                    Iterator<T> it4 = allFeatureFlags.iterator();
                                    while (it4.hasNext()) {
                                        arrayList3.add(((FeatureFlag) it4.next()).getKey().toString());
                                    }
                                    result.a(arrayList3);
                                    Unit unit47 = Unit.INSTANCE;
                                    return;
                                }
                            case 716673560:
                                if (!str.equals("logInAppMessageClicked")) {
                                    break;
                                } else {
                                    Braze.Companion companion41 = Braze.INSTANCE;
                                    Context context99 = this.context;
                                    if (context99 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context18 = context99;
                                    }
                                    IInAppMessage deserializeInAppMessageString2 = companion41.getInstance(context18).deserializeInAppMessageString((String) call.a("inAppMessageString"));
                                    if (deserializeInAppMessageString2 != null) {
                                        deserializeInAppMessageString2.logClick();
                                        return;
                                    }
                                    return;
                                }
                            case 859984188:
                                if (!str.equals("getUserId")) {
                                    break;
                                } else {
                                    Braze.Companion companion42 = Braze.INSTANCE;
                                    Context context100 = this.context;
                                    if (context100 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context17 = context100;
                                    }
                                    runOnUser(companion42.getInstance(context17), new Function1() { // from class: P3.A
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit onMethodCall$lambda$4;
                                            onMethodCall$lambda$4 = BrazePlugin.onMethodCall$lambda$4(result, (BrazeUser) obj);
                                            return onMethodCall$lambda$4;
                                        }
                                    });
                                    Unit unit48 = Unit.INSTANCE;
                                    return;
                                }
                            case 943484325:
                                if (!str.equals("setAdTrackingEnabled")) {
                                    break;
                                } else {
                                    Boolean bool4 = (Boolean) call.a("adTrackingEnabled");
                                    if (bool4 != null) {
                                        boolean booleanValue4 = bool4.booleanValue();
                                        String str37 = (String) call.a("id");
                                        if (str37 != null) {
                                            Braze.Companion companion43 = Braze.INSTANCE;
                                            Context context101 = this.context;
                                            if (context101 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("context");
                                            } else {
                                                context16 = context101;
                                            }
                                            companion43.getInstance(context16).setGoogleAdvertisingId(str37, booleanValue4);
                                            Unit unit232 = Unit.INSTANCE;
                                            return;
                                        }
                                    }
                                    return;
                                }
                            case 1032158840:
                                if (!str.equals("logInAppMessageImpression")) {
                                    break;
                                } else {
                                    Braze.Companion companion44 = Braze.INSTANCE;
                                    Context context102 = this.context;
                                    if (context102 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context15 = context102;
                                    }
                                    IInAppMessage deserializeInAppMessageString3 = companion44.getInstance(context15).deserializeInAppMessageString((String) call.a("inAppMessageString"));
                                    if (deserializeInAppMessageString3 != null) {
                                        deserializeInAppMessageString3.logImpression();
                                        return;
                                    }
                                    return;
                                }
                            case 1075477796:
                                if (!str.equals("requestLocationInitialization")) {
                                    break;
                                } else {
                                    Braze.Companion companion45 = Braze.INSTANCE;
                                    Context context103 = this.context;
                                    if (context103 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context14 = context103;
                                    }
                                    companion45.getInstance(context14).requestLocationInitialization();
                                    Unit unit49 = Unit.INSTANCE;
                                    return;
                                }
                            case 1206161350:
                                if (!str.equals("addToSubscriptionGroup")) {
                                    break;
                                } else {
                                    final String str38 = (String) call.a("groupId");
                                    if (str38 == null) {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.y
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                String onMethodCall$lambda$41;
                                                onMethodCall$lambda$41 = BrazePlugin.onMethodCall$lambda$41();
                                                return onMethodCall$lambda$41;
                                            }
                                        }, 6, (Object) null);
                                        return;
                                    }
                                    Braze.Companion companion46 = Braze.INSTANCE;
                                    Context context104 = this.context;
                                    if (context104 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context13 = context104;
                                    }
                                    runOnUser(companion46.getInstance(context13), new Function1() { // from class: P3.z
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit onMethodCall$lambda$42;
                                            onMethodCall$lambda$42 = BrazePlugin.onMethodCall$lambda$42(str38, (BrazeUser) obj);
                                            return onMethodCall$lambda$42;
                                        }
                                    });
                                    Unit unit50 = Unit.INSTANCE;
                                    return;
                                }
                            case 1287516916:
                                if (!str.equals("setLocationCustomAttribute")) {
                                    break;
                                } else {
                                    final String str39 = (String) call.a("key");
                                    Double d12 = (Double) call.a("lat");
                                    final double doubleValue3 = d12 != null ? d12.doubleValue() : 0.0d;
                                    Double d13 = (Double) call.a("long");
                                    final double doubleValue4 = d13 != null ? d13.doubleValue() : 0.0d;
                                    if (str39 == null) {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.D
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                String onMethodCall$lambda$45;
                                                onMethodCall$lambda$45 = BrazePlugin.onMethodCall$lambda$45();
                                                return onMethodCall$lambda$45;
                                            }
                                        }, 6, (Object) null);
                                        return;
                                    }
                                    Braze.Companion companion47 = Braze.INSTANCE;
                                    Context context105 = this.context;
                                    if (context105 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context12 = context105;
                                    }
                                    runOnUser(companion47.getInstance(context12), new Function1() { // from class: P3.E
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit onMethodCall$lambda$46;
                                            onMethodCall$lambda$46 = BrazePlugin.onMethodCall$lambda$46(str39, doubleValue3, doubleValue4, (BrazeUser) obj);
                                            return onMethodCall$lambda$46;
                                        }
                                    });
                                    Unit unit51 = Unit.INSTANCE;
                                    return;
                                }
                            case 1299921207:
                                if (!str.equals("unsetCustomUserAttribute")) {
                                    break;
                                } else {
                                    final String str40 = (String) call.a("key");
                                    if (str40 == null) {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.r
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                String onMethodCall$lambda$35;
                                                onMethodCall$lambda$35 = BrazePlugin.onMethodCall$lambda$35();
                                                return onMethodCall$lambda$35;
                                            }
                                        }, 6, (Object) null);
                                        return;
                                    }
                                    Braze.Companion companion48 = Braze.INSTANCE;
                                    Context context106 = this.context;
                                    if (context106 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context11 = context106;
                                    }
                                    runOnUser(companion48.getInstance(context11), new Function1() { // from class: P3.s
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit onMethodCall$lambda$36;
                                            onMethodCall$lambda$36 = BrazePlugin.onMethodCall$lambda$36(str40, (BrazeUser) obj);
                                            return onMethodCall$lambda$36;
                                        }
                                    });
                                    Unit unit52 = Unit.INSTANCE;
                                    return;
                                }
                            case 1391332442:
                                if (!str.equals("setEmail")) {
                                    break;
                                } else {
                                    final String str41 = (String) call.a("email");
                                    Braze.Companion companion49 = Braze.INSTANCE;
                                    Context context107 = this.context;
                                    if (context107 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context10 = context107;
                                    }
                                    runOnUser(companion49.getInstance(context10), new Function1() { // from class: P3.J
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit onMethodCall$lambda$50;
                                            onMethodCall$lambda$50 = BrazePlugin.onMethodCall$lambda$50(str41, (BrazeUser) obj);
                                            return onMethodCall$lambda$50;
                                        }
                                    });
                                    Unit unit53 = Unit.INSTANCE;
                                    return;
                                }
                            case 1415563057:
                                if (!str.equals("incrementCustomUserAttribute")) {
                                    break;
                                } else {
                                    final String str42 = (String) call.a("key");
                                    Integer num5 = (Integer) call.a(b.f11195Y);
                                    final int intValue5 = num5 != null ? num5.intValue() : 0;
                                    if (str42 == null) {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.m
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                String onMethodCall$lambda$31;
                                                onMethodCall$lambda$31 = BrazePlugin.onMethodCall$lambda$31();
                                                return onMethodCall$lambda$31;
                                            }
                                        }, 6, (Object) null);
                                        return;
                                    }
                                    Braze.Companion companion50 = Braze.INSTANCE;
                                    Context context108 = this.context;
                                    if (context108 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context9 = context108;
                                    }
                                    runOnUser(companion50.getInstance(context9), new Function1() { // from class: P3.n
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit onMethodCall$lambda$32;
                                            onMethodCall$lambda$32 = BrazePlugin.onMethodCall$lambda$32(str42, intValue5, (BrazeUser) obj);
                                            return onMethodCall$lambda$32;
                                        }
                                    });
                                    Unit unit54 = Unit.INSTANCE;
                                    return;
                                }
                            case 1482968510:
                                if (!str.equals("setPushNotificationSubscriptionType")) {
                                    break;
                                } else {
                                    String str43 = (String) call.a("type");
                                    if (str43 != null) {
                                        str2 = str43;
                                    }
                                    final NotificationSubscriptionType subscriptionType2 = getSubscriptionType(str2);
                                    if (subscriptionType2 == null) {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.t
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                String onMethodCall$lambda$37;
                                                onMethodCall$lambda$37 = BrazePlugin.onMethodCall$lambda$37();
                                                return onMethodCall$lambda$37;
                                            }
                                        }, 6, (Object) null);
                                        return;
                                    }
                                    Braze.Companion companion51 = Braze.INSTANCE;
                                    Context context109 = this.context;
                                    if (context109 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context8 = context109;
                                    }
                                    runOnUser(companion51.getInstance(context8), new Function1() { // from class: P3.v
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit onMethodCall$lambda$38;
                                            onMethodCall$lambda$38 = BrazePlugin.onMethodCall$lambda$38(NotificationSubscriptionType.this, (BrazeUser) obj);
                                            return onMethodCall$lambda$38;
                                        }
                                    });
                                    Unit unit55 = Unit.INSTANCE;
                                    return;
                                }
                            case 1496090584:
                                if (!str.equals("setDateOfBirth")) {
                                    break;
                                } else {
                                    Integer num6 = (Integer) call.a("year");
                                    final int intValue6 = num6 != null ? num6.intValue() : 0;
                                    Integer num7 = (Integer) call.a("month");
                                    final Month month = getMonth(num7 != null ? num7.intValue() : 0);
                                    Integer num8 = (Integer) call.a("day");
                                    final int intValue7 = num8 != null ? num8.intValue() : 0;
                                    Braze.Companion companion52 = Braze.INSTANCE;
                                    Context context110 = this.context;
                                    if (context110 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context7 = context110;
                                    }
                                    runOnUser(companion52.getInstance(context7), new Function1() { // from class: P3.I
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit onMethodCall$lambda$49;
                                            onMethodCall$lambda$49 = BrazePlugin.onMethodCall$lambda$49(intValue6, month, intValue7, (BrazeUser) obj);
                                            return onMethodCall$lambda$49;
                                        }
                                    });
                                    Unit unit56 = Unit.INSTANCE;
                                    return;
                                }
                            case 1502615916:
                                if (!str.equals("setHomeCity")) {
                                    break;
                                } else {
                                    final String str44 = (String) call.a("homeCity");
                                    Braze.Companion companion53 = Braze.INSTANCE;
                                    Context context111 = this.context;
                                    if (context111 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context6 = context111;
                                    }
                                    runOnUser(companion53.getInstance(context6), new Function1() { // from class: P3.O
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit onMethodCall$lambda$54;
                                            onMethodCall$lambda$54 = BrazePlugin.onMethodCall$lambda$54(str44, (BrazeUser) obj);
                                            return onMethodCall$lambda$54;
                                        }
                                    });
                                    Unit unit57 = Unit.INSTANCE;
                                    return;
                                }
                            case 1541265698:
                                if (!str.equals("hideCurrentInAppMessage")) {
                                    break;
                                } else {
                                    BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(true);
                                    Unit unit58 = Unit.INSTANCE;
                                    return;
                                }
                            case 1562169122:
                                if (!str.equals("logContentCardClicked")) {
                                    break;
                                } else {
                                    String str45 = (String) call.a("contentCardString");
                                    if (str45 != null) {
                                        Braze.Companion companion54 = Braze.INSTANCE;
                                        Context context112 = this.context;
                                        if (context112 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("context");
                                        } else {
                                            context5 = context112;
                                        }
                                        Card deserializeContentCard3 = companion54.getInstance(context5).deserializeContentCard(str45);
                                        if (deserializeContentCard3 != null) {
                                            deserializeContentCard3.logClick();
                                        }
                                    }
                                    Unit unit59 = Unit.INSTANCE;
                                    return;
                                }
                            case 1655804958:
                                if (!str.equals("getFeatureFlagByID")) {
                                    break;
                                } else {
                                    String str46 = (String) call.a("id");
                                    if (str46 == null) {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.W
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                String onMethodCall$lambda$60;
                                                onMethodCall$lambda$60 = BrazePlugin.onMethodCall$lambda$60();
                                                return onMethodCall$lambda$60;
                                            }
                                        }, 6, (Object) null);
                                        return;
                                    }
                                    Braze.Companion companion55 = Braze.INSTANCE;
                                    Context context113 = this.context;
                                    if (context113 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                        context113 = null;
                                    }
                                    FeatureFlag featureFlag = companion55.getInstance(context113).getFeatureFlag(str46);
                                    if (featureFlag == null) {
                                        result.a((Object) null);
                                    } else {
                                        result.a(featureFlag.getKey().toString());
                                    }
                                    Unit unit60 = Unit.INSTANCE;
                                    return;
                                }
                            case 1672223513:
                                if (!str.equals("setFirstName")) {
                                    break;
                                } else {
                                    final String str47 = (String) call.a("firstName");
                                    Braze.Companion companion56 = Braze.INSTANCE;
                                    Context context114 = this.context;
                                    if (context114 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("context");
                                    } else {
                                        context4 = context114;
                                    }
                                    runOnUser(companion56.getInstance(context4), new Function1() { // from class: P3.F
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit onMethodCall$lambda$47;
                                            onMethodCall$lambda$47 = BrazePlugin.onMethodCall$lambda$47(str47, (BrazeUser) obj);
                                            return onMethodCall$lambda$47;
                                        }
                                    });
                                    Unit unit61 = Unit.INSTANCE;
                                    return;
                                }
                            case 1681133837:
                                if (!str.equals("setStringCustomUserAttribute")) {
                                    break;
                                } else {
                                    final String str48 = (String) call.a("key");
                                    final String str49 = (String) call.a(b.f11195Y);
                                    if (str48 != null && str49 != null) {
                                        Braze.Companion companion57 = Braze.INSTANCE;
                                        Context context115 = this.context;
                                        if (context115 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("context");
                                        } else {
                                            context3 = context115;
                                        }
                                        runOnUser(companion57.getInstance(context3), new Function1() { // from class: P3.l0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit onMethodCall$lambda$24;
                                                onMethodCall$lambda$24 = BrazePlugin.onMethodCall$lambda$24(str48, str49, (BrazeUser) obj);
                                                return onMethodCall$lambda$24;
                                            }
                                        });
                                        Unit unit62 = Unit.INSTANCE;
                                        return;
                                    }
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.k0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            String onMethodCall$lambda$23;
                                            onMethodCall$lambda$23 = BrazePlugin.onMethodCall$lambda$23();
                                            return onMethodCall$lambda$23;
                                        }
                                    }, 6, (Object) null);
                                    return;
                                }
                            case 2022160988:
                                if (!str.equals("removeFromCustomAttributeArray")) {
                                    break;
                                } else {
                                    final String str50 = (String) call.a("key");
                                    final String str51 = (String) call.a(b.f11195Y);
                                    if (str50 != null && str51 != null) {
                                        Braze.Companion companion58 = Braze.INSTANCE;
                                        Context context116 = this.context;
                                        if (context116 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("context");
                                        } else {
                                            context2 = context116;
                                        }
                                        runOnUser(companion58.getInstance(context2), new Function1() { // from class: P3.c0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit onMethodCall$lambda$14;
                                                onMethodCall$lambda$14 = BrazePlugin.onMethodCall$lambda$14(str50, str51, (BrazeUser) obj);
                                                return onMethodCall$lambda$14;
                                            }
                                        });
                                        Unit unit63 = Unit.INSTANCE;
                                        return;
                                    }
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.b0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            String onMethodCall$lambda$13;
                                            onMethodCall$lambda$13 = BrazePlugin.onMethodCall$lambda$13();
                                            return onMethodCall$lambda$13;
                                        }
                                    }, 6, (Object) null);
                                    return;
                                }
                        }
                    } catch (Exception e6) {
                        e = e6;
                        result.b("Exception encountered", call.a, e);
                        return;
                    }
                }
                result.c();
                Unit unit322222 = Unit.INSTANCE;
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Exception e8) {
            e = e8;
        }
    }

    public void onReattachedToActivityForConfigChanges(@NotNull c binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        onAttachedToActivity(binding);
    }
}
