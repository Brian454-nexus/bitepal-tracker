package com.braze.ui.actions.brazeactions;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.amazon.a.a.o.b;
import com.appsflyer.AppsFlyerProperties;
import com.braze.enums.Channel;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.actions.brazeactions.steps.AddToCustomAttributeArrayStep;
import com.braze.ui.actions.brazeactions.steps.AddToSubscriptionGroupStep;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import com.braze.ui.actions.brazeactions.steps.IBrazeActionStep;
import com.braze.ui.actions.brazeactions.steps.LogCustomEventStep;
import com.braze.ui.actions.brazeactions.steps.NoOpStep;
import com.braze.ui.actions.brazeactions.steps.OpenLinkExternallyStep;
import com.braze.ui.actions.brazeactions.steps.OpenLinkInWebViewStep;
import com.braze.ui.actions.brazeactions.steps.RemoveFromCustomAttributeArrayStep;
import com.braze.ui.actions.brazeactions.steps.RemoveFromSubscriptionGroupStep;
import com.braze.ui.actions.brazeactions.steps.RequestPushPermissionStep;
import com.braze.ui.actions.brazeactions.steps.SetCustomUserAttributeStep;
import com.braze.ui.actions.brazeactions.steps.SetEmailSubscriptionStep;
import com.braze.ui.actions.brazeactions.steps.SetPushNotificationSubscriptionStep;
import com.braze.ui.actions.brazeactions.steps.StepData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001#B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b*\u00020\u0004H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/braze/ui/actions/brazeactions/BrazeActionParser;", "", "<init>", "()V", "Landroid/net/Uri;", "", "isBrazeActionUri", "(Landroid/net/Uri;)Z", "Landroid/content/Context;", "context", "uri", "Lcom/braze/enums/Channel;", AppsFlyerProperties.CHANNEL, "", "execute", "(Landroid/content/Context;Landroid/net/Uri;Lcom/braze/enums/Channel;)V", "Lcom/braze/ui/actions/brazeactions/steps/StepData;", "data", "parse$android_sdk_ui_release", "(Landroid/content/Context;Lcom/braze/ui/actions/brazeactions/steps/StepData;)V", "parse", "", "action", "Lorg/json/JSONObject;", "parseEncodedActionToJson$android_sdk_ui_release", "(Ljava/lang/String;)Lorg/json/JSONObject;", "parseEncodedActionToJson", "Lkotlin/Pair;", "getBrazeActionVersionAndJson$android_sdk_ui_release", "(Landroid/net/Uri;)Lkotlin/Pair;", "getBrazeActionVersionAndJson", "Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType;", "getActionType$android_sdk_ui_release", "(Lcom/braze/ui/actions/brazeactions/steps/StepData;)Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType;", "getActionType", "ActionType", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class BrazeActionParser {

    @NotNull
    public static final BrazeActionParser INSTANCE = new BrazeActionParser();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0080\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType;", "", "", "key", "Lcom/braze/ui/actions/brazeactions/steps/IBrazeActionStep;", "impl", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/braze/ui/actions/brazeactions/steps/IBrazeActionStep;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Lcom/braze/ui/actions/brazeactions/steps/IBrazeActionStep;", "getImpl", "()Lcom/braze/ui/actions/brazeactions/steps/IBrazeActionStep;", "Companion", "CONTAINER", "LOG_CUSTOM_EVENT", "SET_CUSTOM_ATTRIBUTE", "REQUEST_PUSH_PERMISSION", "ADD_TO_SUBSCRIPTION_GROUP", "REMOVE_FROM_SUBSCRIPTION_GROUP", "ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", "REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", "SET_EMAIL_SUBSCRIPTION", "SET_PUSH_NOTIFICATION_SUBSCRIPTION", "OPEN_LINK_IN_WEBVIEW", "OPEN_LINK_EXTERNALLY", "INVALID", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBrazeActionParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeActionParser.kt\ncom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,191:1\n8641#2,2:192\n8901#2,4:194\n*S KotlinDebug\n*F\n+ 1 BrazeActionParser.kt\ncom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType\n*L\n50#1:192,2\n50#1:194,4\n*E\n"})
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class ActionType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @NotNull
        private static final Map<String, ActionType> map;

        @NotNull
        private final IBrazeActionStep impl;

        @NotNull
        private final String key;
        public static final ActionType CONTAINER = new ActionType("CONTAINER", 0, "container", ContainerStep.INSTANCE);
        public static final ActionType LOG_CUSTOM_EVENT = new ActionType("LOG_CUSTOM_EVENT", 1, "logCustomEvent", LogCustomEventStep.INSTANCE);
        public static final ActionType SET_CUSTOM_ATTRIBUTE = new ActionType("SET_CUSTOM_ATTRIBUTE", 2, "setCustomUserAttribute", SetCustomUserAttributeStep.INSTANCE);
        public static final ActionType REQUEST_PUSH_PERMISSION = new ActionType("REQUEST_PUSH_PERMISSION", 3, "requestPushPermission", RequestPushPermissionStep.INSTANCE);
        public static final ActionType ADD_TO_SUBSCRIPTION_GROUP = new ActionType("ADD_TO_SUBSCRIPTION_GROUP", 4, "addToSubscriptionGroup", AddToSubscriptionGroupStep.INSTANCE);
        public static final ActionType REMOVE_FROM_SUBSCRIPTION_GROUP = new ActionType("REMOVE_FROM_SUBSCRIPTION_GROUP", 5, "removeFromSubscriptionGroup", RemoveFromSubscriptionGroupStep.INSTANCE);
        public static final ActionType ADD_TO_CUSTOM_ATTRIBUTE_ARRAY = new ActionType("ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", 6, "addToCustomAttributeArray", AddToCustomAttributeArrayStep.INSTANCE);
        public static final ActionType REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY = new ActionType("REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", 7, "removeFromCustomAttributeArray", RemoveFromCustomAttributeArrayStep.INSTANCE);
        public static final ActionType SET_EMAIL_SUBSCRIPTION = new ActionType("SET_EMAIL_SUBSCRIPTION", 8, "setEmailNotificationSubscriptionType", SetEmailSubscriptionStep.INSTANCE);
        public static final ActionType SET_PUSH_NOTIFICATION_SUBSCRIPTION = new ActionType("SET_PUSH_NOTIFICATION_SUBSCRIPTION", 9, "setPushNotificationSubscriptionType", SetPushNotificationSubscriptionStep.INSTANCE);
        public static final ActionType OPEN_LINK_IN_WEBVIEW = new ActionType("OPEN_LINK_IN_WEBVIEW", 10, "openLinkInWebview", OpenLinkInWebViewStep.INSTANCE);
        public static final ActionType OPEN_LINK_EXTERNALLY = new ActionType("OPEN_LINK_EXTERNALLY", 11, "openLink", OpenLinkExternallyStep.INSTANCE);
        public static final ActionType INVALID = new ActionType("INVALID", 12, "", NoOpStep.INSTANCE);

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType$Companion;", "", "<init>", "()V", "map", "", "", "Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType;", "fromValue", b.f11195Y, "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nBrazeActionParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeActionParser.kt\ncom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final ActionType fromValue(@Nullable String value) {
                Map map = ActionType.map;
                if (value == null) {
                    value = "";
                }
                Object obj = map.get(value);
                if (obj == null) {
                    obj = ActionType.INVALID;
                }
                return (ActionType) obj;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ ActionType[] $values() {
            return new ActionType[]{CONTAINER, LOG_CUSTOM_EVENT, SET_CUSTOM_ATTRIBUTE, REQUEST_PUSH_PERMISSION, ADD_TO_SUBSCRIPTION_GROUP, REMOVE_FROM_SUBSCRIPTION_GROUP, ADD_TO_CUSTOM_ATTRIBUTE_ARRAY, REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY, SET_EMAIL_SUBSCRIPTION, SET_PUSH_NOTIFICATION_SUBSCRIPTION, OPEN_LINK_IN_WEBVIEW, OPEN_LINK_EXTERNALLY, INVALID};
        }

        static {
            ActionType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            INSTANCE = new Companion(null);
            ActionType[] values = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
            for (ActionType actionType : values) {
                linkedHashMap.put(actionType.key, actionType);
            }
            map = linkedHashMap;
        }

        private ActionType(String str, int i6, String str2, IBrazeActionStep iBrazeActionStep) {
            this.key = str2;
            this.impl = iBrazeActionStep;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }

        @NotNull
        public final IBrazeActionStep getImpl() {
            return this.impl;
        }
    }

    private BrazeActionParser() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$0(Channel channel, Uri uri) {
        return "Attempting to parse Braze Action with channel " + channel + " and uri:\n'" + uri + '\'';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$1() {
        return "Failed to decode Braze Action into both version and json components. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$2(String str) {
        return "Braze Actions version " + str + " is unsupported. Version must be v1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$3(Uri uri) {
        return "Failed to parse uri as a Braze Action.\n'" + uri + '\'';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$4(Uri uri) {
        return "Done handling Braze uri\n'" + uri + '\'';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getActionType$lambda$9(ActionType actionType, StepData stepData) {
        return "Cannot parse invalid action of type " + actionType + " and data " + stepData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBrazeActionVersionAndJson$lambda$7(Uri uri) {
        return "Failed to parse version and encoded action from uri: " + uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBrazeActionVersionAndJson$lambda$8(String str) {
        return "Failed to decode action into json. Action:\n'" + str + '\'';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parse$lambda$5(ActionType actionType, StepData stepData) {
        return "Performing Braze Action type " + actionType + " with data " + stepData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parse$lambda$6(StepData stepData) {
        return "Failed to run with data " + stepData;
    }

    public final void execute(@NotNull Context context, @NotNull final Uri uri, @NotNull final Channel channel) {
        Pair brazeActionVersionAndJson$android_sdk_ui_release;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(channel, "channel");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: x4.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String execute$lambda$0;
                execute$lambda$0 = BrazeActionParser.execute$lambda$0(Channel.this, uri);
                return execute$lambda$0;
            }
        }, 6, (Object) null);
        try {
            brazeActionVersionAndJson$android_sdk_ui_release = getBrazeActionVersionAndJson$android_sdk_ui_release(uri);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: x4.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String execute$lambda$3;
                    execute$lambda$3 = BrazeActionParser.execute$lambda$3(uri);
                    return execute$lambda$3;
                }
            }, 4, (Object) null);
        }
        if (brazeActionVersionAndJson$android_sdk_ui_release == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: x4.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String execute$lambda$1;
                    execute$lambda$1 = BrazeActionParser.execute$lambda$1();
                    return execute$lambda$1;
                }
            }, 6, (Object) null);
            return;
        }
        final String str = (String) brazeActionVersionAndJson$android_sdk_ui_release.component1();
        JSONObject jSONObject = (JSONObject) brazeActionVersionAndJson$android_sdk_ui_release.component2();
        if (!Intrinsics.areEqual(str, "v1")) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: x4.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String execute$lambda$2;
                    execute$lambda$2 = BrazeActionParser.execute$lambda$2(str);
                    return execute$lambda$2;
                }
            }, 7, (Object) null);
        } else {
            parse$android_sdk_ui_release(context, new StepData(jSONObject, channel));
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: x4.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String execute$lambda$4;
                    execute$lambda$4 = BrazeActionParser.execute$lambda$4(uri);
                    return execute$lambda$4;
                }
            }, 6, (Object) null);
        }
    }

    public final /* synthetic */ ActionType getActionType$android_sdk_ui_release(final StepData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        final ActionType fromValue = ActionType.INSTANCE.fromValue(JsonUtils.getOptionalString(data.getSrcJson(), "type"));
        if (fromValue.getImpl().isValid(data)) {
            return fromValue;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: x4.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String actionType$lambda$9;
                actionType$lambda$9 = BrazeActionParser.getActionType$lambda$9(BrazeActionParser.ActionType.this, data);
                return actionType$lambda$9;
            }
        }, 7, (Object) null);
        return ActionType.INVALID;
    }

    public final /* synthetic */ Pair getBrazeActionVersionAndJson$android_sdk_ui_release(final Uri uri) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String host = uri.getHost();
        final String lastPathSegment = uri.getLastPathSegment();
        if (host == null || lastPathSegment == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) uri, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: x4.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String brazeActionVersionAndJson$lambda$7;
                    brazeActionVersionAndJson$lambda$7 = BrazeActionParser.getBrazeActionVersionAndJson$lambda$7(uri);
                    return brazeActionVersionAndJson$lambda$7;
                }
            }, 7, (Object) null);
            return null;
        }
        try {
            jSONObject = parseEncodedActionToJson$android_sdk_ui_release(lastPathSegment);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) uri, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: x4.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String brazeActionVersionAndJson$lambda$8;
                    brazeActionVersionAndJson$lambda$8 = BrazeActionParser.getBrazeActionVersionAndJson$lambda$8(lastPathSegment);
                    return brazeActionVersionAndJson$lambda$8;
                }
            }, 4, (Object) null);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return new Pair(host, jSONObject);
    }

    public final boolean isBrazeActionUri(@Nullable Uri uri) {
        return Intrinsics.areEqual(uri != null ? uri.getScheme() : null, "brazeActions");
    }

    public final /* synthetic */ void parse$android_sdk_ui_release(Context context, final StepData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            final ActionType actionType$android_sdk_ui_release = getActionType$android_sdk_ui_release(data);
            if (actionType$android_sdk_ui_release == ActionType.INVALID) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: x4.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String parse$lambda$5;
                    parse$lambda$5 = BrazeActionParser.parse$lambda$5(BrazeActionParser.ActionType.this, data);
                    return parse$lambda$5;
                }
            }, 6, (Object) null);
            actionType$android_sdk_ui_release.getImpl().run(context, data);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: x4.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String parse$lambda$6;
                    parse$lambda$6 = BrazeActionParser.parse$lambda$6(StepData.this);
                    return parse$lambda$6;
                }
            }, 4, (Object) null);
        }
    }

    public final /* synthetic */ JSONObject parseEncodedActionToJson$android_sdk_ui_release(String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        byte[] decode = Base64.decode(action, 8);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        int length = decode.length / 2;
        int[] iArr = new int[length];
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, decode.length - 1, 2);
        if (progressionLastElement >= 0) {
            int i6 = 0;
            while (true) {
                iArr[i6 / 2] = (decode[i6] & 255) | ((decode[i6 + 1] & 255) << 8);
                if (i6 == progressionLastElement) {
                    break;
                }
                i6 += 2;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = iArr[i7];
            if (i8 < 0 || i8 > 65535) {
                throw new IllegalArgumentException("Invalid Char code: " + i8);
            }
            sb.append((char) i8);
        }
        return new JSONObject(sb.toString());
    }
}
