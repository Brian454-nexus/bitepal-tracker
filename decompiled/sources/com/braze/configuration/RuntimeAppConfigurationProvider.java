package com.braze.configuration;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfig;
import com.braze.configuration.RuntimeAppConfigurationProvider;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.support.BrazeLogger;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0010#\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001@B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0014\u001a\u00020\n\"\u0010\b\u0000\u0010\u0011*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00102\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b!\u0010\"J/\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010$2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010H\u0007¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b+\u0010,J5\u0010.\u001a\u00020\n\"\u0010\b\u0000\u0010\u0011*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\n¢\u0006\u0004\b0\u0010\u001bJ\r\u00101\u001a\u00020\n¢\u0006\u0004\b1\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u0017\u00104\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R$\u00109\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/braze/configuration/RuntimeAppConfigurationProvider;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "key", "", com.amazon.a.a.o.b.f11195Y, "", "putInt", "(Ljava/lang/String;Ljava/lang/Integer;)V", "", "putBoolean", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "", "T", "Ljava/util/EnumSet;", "enumSet", "putEnumSet", "(Ljava/util/EnumSet;Ljava/lang/String;)V", "Lcom/braze/configuration/BrazeConfig;", "config", "setConfiguration", "(Lcom/braze/configuration/BrazeConfig;)V", "clearAllConfigurationValues", "()V", "defaultValue", "getStringValue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getIntValue", "(Ljava/lang/String;I)I", "getBooleanValue", "(Ljava/lang/String;Z)Z", "", "", "getStringSetValue", "(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;", "containsKey", "(Ljava/lang/String;)Z", "putEnumAsString", "(Ljava/lang/String;Ljava/lang/Enum;)V", "putString", "(Ljava/lang/String;Ljava/lang/String;)V", "updateValue", "updateEnumSetData", "(Ljava/lang/String;Ljava/util/EnumSet;)V", "startEdit", "applyEdit", "Landroid/content/Context;", "Landroid/content/SharedPreferences;", "storageMap", "Landroid/content/SharedPreferences;", "getStorageMap", "()Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences$Editor;", "editor", "Landroid/content/SharedPreferences$Editor;", "getEditor", "()Landroid/content/SharedPreferences$Editor;", "setEditor", "(Landroid/content/SharedPreferences$Editor;)V", "Companion", "com/braze/configuration/f", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class RuntimeAppConfigurationProvider {
    public static final f Companion = new f();
    private final Context context;
    private SharedPreferences.Editor editor;
    private final SharedPreferences storageMap;

    public RuntimeAppConfigurationProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.override.configuration.cache", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.storageMap = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String clearAllConfigurationValues$lambda$2() {
        return "Clearing Braze Override configuration cache";
    }

    private final void putBoolean(String key, Boolean value) {
        if (value != null) {
            boolean booleanValue = value.booleanValue();
            SharedPreferences.Editor editor = this.editor;
            if (editor != null) {
                editor.putBoolean(key, booleanValue);
            }
        }
    }

    private final <T extends Enum<T>> void putEnumSet(EnumSet<T> enumSet, String key) {
        if (enumSet == null) {
            return;
        }
        Set<String> a6 = com.braze.support.f.a(enumSet);
        SharedPreferences.Editor editor = this.editor;
        if (editor != null) {
            editor.putStringSet(key, a6);
        }
    }

    private final void putInt(String key, Integer value) {
        if (value != null) {
            int intValue = value.intValue();
            SharedPreferences.Editor editor = this.editor;
            if (editor != null) {
                editor.putInt(key, intValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setConfiguration$lambda$0(BrazeConfig brazeConfig) {
        return "Setting Braze Override configuration with config: " + brazeConfig;
    }

    public final void applyEdit() {
        SharedPreferences.Editor editor = this.editor;
        if (editor != null) {
            editor.apply();
        }
    }

    public final void clearAllConfigurationValues() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: S3.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String clearAllConfigurationValues$lambda$2;
                clearAllConfigurationValues$lambda$2 = RuntimeAppConfigurationProvider.clearAllConfigurationValues$lambda$2();
                return clearAllConfigurationValues$lambda$2;
            }
        }, 7, (Object) null);
        this.storageMap.edit().clear().apply();
    }

    public final boolean containsKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.storageMap.contains(key);
    }

    public final boolean getBooleanValue(String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.storageMap.getBoolean(key, defaultValue);
    }

    public final int getIntValue(String key, int defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.storageMap.getInt(key, defaultValue);
    }

    public final Set<String> getStringSetValue(String key, Set<String> defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.storageMap.getStringSet(key, defaultValue);
    }

    public final String getStringValue(String key, String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.storageMap.getString(key, defaultValue);
    }

    public final void putEnumAsString(String key, Enum<?> value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (value != null) {
            putString(key, value.toString());
        }
    }

    public final void putString(String key, String value) {
        SharedPreferences.Editor editor;
        Intrinsics.checkNotNullParameter(key, "key");
        if (value == null || (editor = this.editor) == null) {
            return;
        }
        editor.putString(key, value);
    }

    public final void setConfiguration(final BrazeConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: S3.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String configuration$lambda$0;
                configuration$lambda$0 = RuntimeAppConfigurationProvider.setConfiguration$lambda$0(BrazeConfig.this);
                return configuration$lambda$0;
            }
        }, 6, (Object) null);
        startEdit();
        b bVar = b.f12112b;
        putString("com_braze_api_key", config.apiKey);
        putString("com_braze_server_target", config.serverTarget);
        putEnumAsString("com_braze_sdk_flavor", config.sdkFlavor);
        putBoolean("com_braze_newsfeed_unread_visual_indicator_on", config.isNewsFeedVisualIndicatorOn);
        putString("com_braze_custom_endpoint", config.customEndpoint);
        putString("com_braze_push_small_notification_icon", config.smallNotificationIcon);
        putString("com_braze_push_large_notification_icon", config.largeNotificationIcon);
        putInt("com_braze_session_timeout", config.sessionTimeout);
        putInt("com_braze_default_notification_accent_color", config.defaultNotificationAccentColor);
        putInt("com_braze_trigger_action_minimum_time_interval_seconds", config.triggerActionMinimumTimeIntervalSeconds);
        putBoolean("com_braze_push_adm_messaging_registration_enabled", config.isAdmMessagingRegistrationEnabled);
        putBoolean("com_braze_handle_push_deep_links_automatically", config.willHandlePushDeepLinksAutomatically);
        putBoolean("com_braze_enable_location_collection", config.isLocationCollectionEnabled);
        putInt("com_braze_data_flush_interval_bad_network", config.badNetworkInterval);
        putInt("com_braze_data_flush_interval_good_network", config.goodNetworkInterval);
        putInt("com_braze_data_flush_interval_great_network", config.greatNetworkInterval);
        putString("com_braze_default_notification_channel_name", config.defaultNotificationChannelName);
        putString("com_braze_default_notification_channel_description", config.defaultNotificationChannelDescription);
        putBoolean("com_braze_push_deep_link_back_stack_activity_enabled", config.isPushDeepLinkBackStackActivityEnabled);
        putString("com_braze_push_deep_link_back_stack_activity_class_name", config.pushDeepLinkBackStackActivityClassName);
        putBoolean("com_braze_session_start_based_timeout_enabled", config.isSessionStartBasedTimeoutEnabled);
        putBoolean("com_braze_firebase_cloud_messaging_registration_enabled", config.isFirebaseCloudMessagingRegistrationEnabled);
        putString("com_braze_firebase_cloud_messaging_sender_id", config.firebaseCloudMessagingSenderIdKey);
        putBoolean("com_braze_content_cards_unread_visual_indicator_enabled", config.isContentCardsUnreadVisualIndicatorEnabled);
        putBoolean("com_braze_device_object_whitelisting_enabled", config.isDeviceObjectAllowlistEnabled);
        putBoolean("com_braze_device_in_app_message_accessibility_exclusive_mode_enabled", config.isInAppMessageAccessibilityExclusiveModeEnabled);
        putBoolean("com_braze_push_wake_screen_for_notification_enabled", config.isPushWakeScreenForNotificationEnabled);
        putBoolean("com_braze_push_notification_html_rendering_enabled", config.isPushHtmlRenderingEnabled);
        putBoolean("com_braze_does_push_story_dismiss_on_click", config.doesPushStoryDismissOnClick);
        putBoolean("com_braze_geofences_enabled", config.areGeofencesEnabled);
        putBoolean("com_braze_in_app_message_push_test_eager_display_enabled", config.isInAppMessageTestPushEagerDisplayEnabled);
        putString("com_braze_custom_html_webview_activity_class_name", config.customHtmlWebViewActivityClassName);
        putBoolean("com_braze_automatic_geofence_requests_enabled", config.areAutomaticGeofenceRequestsEnabled);
        putInt("com_braze_in_app_message_webview_client_max_onpagefinished_wait_ms", config.inAppMessageWebViewClientMaxOnPageFinishedWaitMs);
        putBoolean("com_braze_firebase_messaging_service_automatically_register_on_new_token", config.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled);
        putBoolean("com_braze_sdk_authentication_enabled", config.isSdkAuthEnabled);
        putBoolean("com_braze_require_touch_mode_for_html_in_app_messages", config.isTouchModeRequiredForHtmlInAppMessages);
        putBoolean("com_braze_html_in_app_message_apply_insets", config.isHtmlInAppMessageApplyWindowInsetsEnabled);
        putBoolean("com_braze_html_in_app_message_enable_html_link_target", config.isHtmlInAppMessageHtmlLinkTargetEnabled);
        putEnumSet(config.deviceObjectAllowlist, "com_braze_device_object_whitelist");
        putEnumSet(config.customLocationProviderNames, "com_braze_custom_location_providers_list");
        EnumSet<BrazeSdkMetadata> enumSet = config.brazeSdkMetadata;
        if (enumSet != null) {
            updateEnumSetData("com_braze_sdk_metadata", enumSet);
        }
        putBoolean("com_braze_fallback_firebase_cloud_messaging_service_enabled", config.isFallbackFirebaseMessagingServiceEnabled);
        putString("com_braze_fallback_firebase_cloud_messaging_service_classpath", config.fallbackFirebaseMessagingServiceClasspath);
        putBoolean("com_braze_optin_when_push_authorized", config.shouldOptInWhenPushAuthorized);
        putBoolean("com_braze_use_activity_window_flag_secure", config.shouldUseWindowFlagSecureInActivities);
        putBoolean("com_braze_persist_webview_when_backgrounding_app", config.shouldPersistWebViewWhenBackgroundingApp);
        putBoolean("com_braze_in_app_message_add_status_bar_padding", config.shouldAddStatusBarPaddingToInAppMessages);
        applyEdit();
        BrazeInternal.INSTANCE.getConfigurationProvider(this.context).resetCache$android_sdk_base_release();
    }

    public final void startEdit() {
        this.editor = this.storageMap.edit();
    }

    public final <T extends Enum<T>> void updateEnumSetData(String key, EnumSet<T> updateValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(updateValue, "updateValue");
        Set<String> stringSetValue = getStringSetValue(key, new HashSet());
        if (stringSetValue != null) {
            stringSetValue.addAll(com.braze.support.f.a(updateValue));
        }
        this.storageMap.edit().putStringSet(key, stringSetValue).apply();
    }
}
