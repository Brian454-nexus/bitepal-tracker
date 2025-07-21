package com.braze.configuration;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DeviceKey;
import com.braze.enums.LocationProviderName;
import com.braze.enums.SdkFlavor;
import com.braze.j;
import com.braze.support.BrazeLogger;
import com.braze.support.PackageUtils;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u0000 z2\u00020\u0001:\u0002\n{B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00148BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b \u0010\u0016R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010&\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b&\u0010\u001bR\u0011\u0010'\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b'\u0010\u001bR\u0011\u0010(\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b(\u0010\u001bR\u0011\u0010,\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010.\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0011\u00102\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00104\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b3\u0010+R\u0017\u00107\u001a\u00020)8F¢\u0006\f\u0012\u0004\b6\u0010\u0013\u001a\u0004\b5\u0010+R\u0013\u00109\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b8\u0010\u0016R\u0011\u0010;\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b:\u0010\u001bR\u0011\u0010<\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b<\u0010\u001bR\u0011\u0010>\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b=\u0010\u0016R\u0011\u0010@\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b?\u0010\u0016R\u0011\u0010B\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\bA\u0010+R\u0017\u0010E\u001a\u00020)8G¢\u0006\f\u0012\u0004\bD\u0010\u0013\u001a\u0004\bC\u0010+R\u0013\u0010I\u001a\u0004\u0018\u00010F8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010J\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bJ\u0010\u001bR\u0013\u0010L\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bK\u0010\u0016R\u0011\u0010M\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bM\u0010\u001bR\u0011\u0010N\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bN\u0010\u001bR\u0011\u0010O\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bO\u0010\u001bR\u0013\u0010Q\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bP\u0010\u0016R\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020R0\f8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0011\u0010V\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bV\u0010\u001bR\u0011\u0010W\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bW\u0010\u001bR\u0011\u0010X\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bX\u0010\u001bR\u0011\u0010Y\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bY\u0010\u001bR\u0011\u0010[\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bZ\u0010\u001bR\u0011\u0010\\\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\\\u0010\u001bR\u0011\u0010]\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b]\u0010\u001bR\u0011\u0010_\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b^\u0010+R\u0013\u0010a\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b`\u0010\u0016R\u0011\u0010c\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\bb\u0010+R\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020d0\f8F¢\u0006\u0006\u001a\u0004\be\u0010TR\u0011\u0010g\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bg\u0010\u001bR\u0011\u0010h\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bh\u0010\u001bR\u0011\u0010i\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bi\u0010\u001bR\u0011\u0010j\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bj\u0010\u001bR\u0011\u0010k\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bk\u0010\u001bR\u0017\u0010n\u001a\b\u0012\u0004\u0012\u00020l0\f8F¢\u0006\u0006\u001a\u0004\bm\u0010TR\u0011\u0010o\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bo\u0010\u001bR\u0013\u0010q\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bp\u0010\u0016R\u0011\u0010s\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\br\u0010\u001bR\u0011\u0010u\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bt\u0010\u001bR\u0011\u0010w\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bv\u0010\u001bR\u0011\u0010y\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bx\u0010\u001b¨\u0006|"}, d2 = {"Lcom/braze/configuration/BrazeConfigurationProvider;", "Lcom/braze/configuration/CachedConfigurationProvider;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "E", "Ljava/lang/Class;", "targetEnumClass", "Lcom/braze/configuration/b;", "configField", "Ljava/util/EnumSet;", "getGenericEnumSetFromStringSet", "(Ljava/lang/Class;Lcom/braze/configuration/b;)Ljava/util/EnumSet;", "Landroid/content/Context;", "getContext$android_sdk_base_release", "()Landroid/content/Context;", "getContext$android_sdk_base_release$annotations", "()V", "", "getServerTarget", "()Ljava/lang/String;", "getServerTarget$annotations", "serverTarget", "", "isEphemeralEventsEnabled", "()Z", "", "getEphemeralEventKeys", "()Ljava/util/Set;", "ephemeralEventKeys", "getBaseUrlForRequests", "baseUrlForRequests", "Lcom/braze/models/outgoing/b;", "getBrazeApiKey", "()Lcom/braze/models/outgoing/b;", "brazeApiKey", "isAdmMessagingRegistrationEnabled", "isLocationCollectionEnabled", "isGeofencesEnabled", "", "getSmallNotificationIconResourceId", "()I", "smallNotificationIconResourceId", "getLargeNotificationIconResourceId", "largeNotificationIconResourceId", "", "getTriggerActionMinimumTimeIntervalInSeconds", "()J", "triggerActionMinimumTimeIntervalInSeconds", "getSessionTimeoutSeconds", "sessionTimeoutSeconds", "getVersionCode", "getVersionCode$annotations", "versionCode", "getCustomEndpoint", "customEndpoint", "getDoesHandlePushDeepLinksAutomatically", "doesHandlePushDeepLinksAutomatically", "isNewsfeedVisualIndicatorOn", "getDefaultNotificationChannelName", "defaultNotificationChannelName", "getDefaultNotificationChannelDescription", "defaultNotificationChannelDescription", "getApplicationIconResourceId", "applicationIconResourceId", "getDefaultNotificationAccentColor", "getDefaultNotificationAccentColor$annotations", "defaultNotificationAccentColor", "Lcom/braze/enums/SdkFlavor;", "getSdkFlavor", "()Lcom/braze/enums/SdkFlavor;", "sdkFlavor", "isPushDeepLinkBackStackActivityEnabled", "getPushDeepLinkBackStackActivityClassName", "pushDeepLinkBackStackActivityClassName", "isSessionStartBasedTimeoutEnabled", "isFirebaseCloudMessagingRegistrationEnabled", "isContentCardsUnreadVisualIndicatorEnabled", "getFirebaseCloudMessagingSenderIdKey", "firebaseCloudMessagingSenderIdKey", "Lcom/braze/enums/DeviceKey;", "getDeviceObjectAllowlist", "()Ljava/util/EnumSet;", "deviceObjectAllowlist", "isDeviceObjectAllowlistEnabled", "isInAppMessageAccessibilityExclusiveModeEnabled", "isPushWakeScreenForNotificationEnabled", "isPushNotificationHtmlRenderingEnabled", "getDoesPushStoryDismissOnClick", "doesPushStoryDismissOnClick", "isInAppMessageTestPushEagerDisplayEnabled", "isAutomaticGeofenceRequestsEnabled", "getLoggerInitialLogLevel", "loggerInitialLogLevel", "getCustomHtmlWebViewActivityClassName", "customHtmlWebViewActivityClassName", "getInAppMessageWebViewClientOnPageFinishedMaxWaitMs", "inAppMessageWebViewClientOnPageFinishedMaxWaitMs", "Lcom/braze/enums/LocationProviderName;", "getCustomLocationProviderNames", "customLocationProviderNames", "isFirebaseMessagingServiceOnNewTokenRegistrationEnabled", "isSdkAuthenticationEnabled", "isTouchModeRequiredForHtmlInAppMessages", "isHtmlInAppMessageApplyWindowInsetsEnabled", "isHtmlInAppMessageHtmlLinkTargetEnabled", "Lcom/braze/enums/BrazeSdkMetadata;", "getSdkMetadata", "sdkMetadata", "isFallbackFirebaseMessagingServiceEnabled", "getFallbackFirebaseMessagingServiceClasspath", "fallbackFirebaseMessagingServiceClasspath", "getShouldOptInWhenPushAuthorized", "shouldOptInWhenPushAuthorized", "getShouldUseWindowFlagSecureInActivities", "shouldUseWindowFlagSecureInActivities", "getShouldPersistWebViewWhenBackgroundingApp", "shouldPersistWebViewWhenBackgroundingApp", "getShouldAddStatusBarPaddingToInAppMessages", "shouldAddStatusBarPaddingToInAppMessages", "Companion", "com/braze/configuration/a", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class BrazeConfigurationProvider extends CachedConfigurationProvider {
    public static final a Companion = new a();
    public static final int DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS = (int) TimeUnit.SECONDS.toMillis(15);
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeConfigurationProvider(Context context) {
        super(context, false, null, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.context = applicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_applicationIconResourceId_$lambda$12(String str) {
        return j.a("Couldn't find application icon for package: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$1() {
        return "Found an override api key. Using it to configure the Braze SDK";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$10() {
        return "****************************************************";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$2() {
        return "****************************************************";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$3() {
        return "**                                                **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$4() {
        return "**                 !! WARNING !!                  **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$5() {
        return "**                                                **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$6() {
        return "**     No API key set in res/values/braze.xml     **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$7() {
        return "** No cached API Key found from Braze.configure   **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$8() {
        return "**          Braze functionality disabled          **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$9() {
        return "**                                                **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_defaultNotificationAccentColor_$lambda$13() {
        return "Using default notification accent color found in resources";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_ephemeralEventKeys_$lambda$0() {
        return "More than 12 ephemeral/graylisted events detected. Only using first 12 events. Please truncate this list!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_sdkFlavor_$lambda$14() {
        return "Exception while parsing stored SDK flavor. Returning null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_versionCode_$lambda$11() {
        return "Unable to read the version code.";
    }

    private final <E extends Enum<E>> EnumSet<E> getGenericEnumSetFromStringSet(Class<E> targetEnumClass, b configField) {
        String str = configField.f12115a;
        if (getConfigurationCache().containsKey(str)) {
            Object obj = getConfigurationCache().get(str);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.EnumSet<E of com.braze.configuration.BrazeConfigurationProvider.getGenericEnumSetFromStringSet>");
            return (EnumSet) obj;
        }
        Set<String> stringSetValue = getStringSetValue(configField.f12115a, new HashSet());
        if (stringSetValue == null) {
            stringSetValue = new HashSet<>();
        }
        EnumSet<E> a6 = com.braze.support.f.a(targetEnumClass, stringSetValue);
        getConfigurationCache().put(str, a6);
        return a6;
    }

    private final String getServerTarget() {
        b bVar = b.f12112b;
        String stringValue = getStringValue("com_braze_server_target", "PROD");
        return stringValue == null ? "PROD" : stringValue;
    }

    public final int getApplicationIconResourceId() {
        ApplicationInfo applicationInfo;
        PackageManager.ApplicationInfoFlags of;
        if (getConfigurationCache().containsKey("application_icon")) {
            Object obj = getConfigurationCache().get("application_icon");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) obj).intValue();
        }
        final String packageName = this.context.getPackageName();
        int i6 = 0;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = this.context.getPackageManager();
                of = PackageManager.ApplicationInfoFlags.of(0L);
                applicationInfo = packageManager.getApplicationInfo(packageName, of);
            } else {
                applicationInfo = this.context.getPackageManager().getApplicationInfo(packageName, 0);
            }
            Intrinsics.checkNotNull(applicationInfo);
            i6 = applicationInfo.icon;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: S3.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _get_applicationIconResourceId_$lambda$12;
                    _get_applicationIconResourceId_$lambda$12 = BrazeConfigurationProvider._get_applicationIconResourceId_$lambda$12(packageName);
                    return _get_applicationIconResourceId_$lambda$12;
                }
            }, 4, (Object) null);
        }
        getConfigurationCache().put("application_icon", Integer.valueOf(i6));
        return i6;
    }

    public final String getBaseUrlForRequests() {
        String serverTarget = getServerTarget();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase = serverTarget.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return Intrinsics.areEqual("STAGING", upperCase) ? "https://sondheim.braze.com/api/v3/" : "https://sdk.iad-01.braze.com/api/v3/";
    }

    public final com.braze.models.outgoing.b getBrazeApiKey() {
        BrazeConfigurationProvider brazeConfigurationProvider;
        b bVar = b.f12112b;
        String str = (String) getConfigurationCache().get("com_braze_api_key");
        if (str == null) {
            str = getRuntimeAppConfigurationProvider().getStringValue("com_braze_api_key", null);
            if (str != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: S3.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String _get_brazeApiKey_$lambda$1;
                        _get_brazeApiKey_$lambda$1 = BrazeConfigurationProvider._get_brazeApiKey_$lambda$1();
                        return _get_brazeApiKey_$lambda$1;
                    }
                }, 6, (Object) null);
                brazeConfigurationProvider = this;
            } else {
                brazeConfigurationProvider = this;
                str = brazeConfigurationProvider.getStringValue("com_braze_api_key", null);
            }
            if (str != null) {
                brazeConfigurationProvider.getConfigurationCache().put("com_braze_api_key", str);
            }
        } else {
            brazeConfigurationProvider = this;
        }
        if (str != null) {
            return new com.braze.models.outgoing.b(str);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f12984W;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeConfigurationProvider, priority, (Throwable) null, false, new Function0() { // from class: S3.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _get_brazeApiKey_$lambda$2;
                _get_brazeApiKey_$lambda$2 = BrazeConfigurationProvider._get_brazeApiKey_$lambda$2();
                return _get_brazeApiKey_$lambda$2;
            }
        }, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: S3.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _get_brazeApiKey_$lambda$3;
                _get_brazeApiKey_$lambda$3 = BrazeConfigurationProvider._get_brazeApiKey_$lambda$3();
                return _get_brazeApiKey_$lambda$3;
            }
        }, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: S3.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _get_brazeApiKey_$lambda$4;
                _get_brazeApiKey_$lambda$4 = BrazeConfigurationProvider._get_brazeApiKey_$lambda$4();
                return _get_brazeApiKey_$lambda$4;
            }
        }, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: S3.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _get_brazeApiKey_$lambda$5;
                _get_brazeApiKey_$lambda$5 = BrazeConfigurationProvider._get_brazeApiKey_$lambda$5();
                return _get_brazeApiKey_$lambda$5;
            }
        }, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: S3.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _get_brazeApiKey_$lambda$6;
                _get_brazeApiKey_$lambda$6 = BrazeConfigurationProvider._get_brazeApiKey_$lambda$6();
                return _get_brazeApiKey_$lambda$6;
            }
        }, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: S3.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _get_brazeApiKey_$lambda$7;
                _get_brazeApiKey_$lambda$7 = BrazeConfigurationProvider._get_brazeApiKey_$lambda$7();
                return _get_brazeApiKey_$lambda$7;
            }
        }, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: S3.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _get_brazeApiKey_$lambda$8;
                _get_brazeApiKey_$lambda$8 = BrazeConfigurationProvider._get_brazeApiKey_$lambda$8();
                return _get_brazeApiKey_$lambda$8;
            }
        }, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: S3.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _get_brazeApiKey_$lambda$9;
                _get_brazeApiKey_$lambda$9 = BrazeConfigurationProvider._get_brazeApiKey_$lambda$9();
                return _get_brazeApiKey_$lambda$9;
            }
        }, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: S3.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _get_brazeApiKey_$lambda$10;
                _get_brazeApiKey_$lambda$10 = BrazeConfigurationProvider._get_brazeApiKey_$lambda$10();
                return _get_brazeApiKey_$lambda$10;
            }
        }, 6, (Object) null);
        throw new RuntimeException("Unable to read the Braze API key from the res/values/braze.xml file or from runtime configuration via BrazeConfig. See log for more details.");
    }

    public final String getCustomEndpoint() {
        b bVar = b.f12112b;
        return getStringValue("com_braze_custom_endpoint", null);
    }

    public final String getCustomHtmlWebViewActivityClassName() {
        b bVar = b.f12112b;
        return getStringValue("com_braze_custom_html_webview_activity_class_name", "");
    }

    public final EnumSet<LocationProviderName> getCustomLocationProviderNames() {
        return getGenericEnumSetFromStringSet(LocationProviderName.class, b.f12113c);
    }

    public final int getDefaultNotificationAccentColor() {
        b bVar = b.f12112b;
        Integer colorValue = getColorValue("com_braze_default_notification_accent_color");
        if (colorValue == null) {
            return 0;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: S3.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _get_defaultNotificationAccentColor_$lambda$13;
                _get_defaultNotificationAccentColor_$lambda$13 = BrazeConfigurationProvider._get_defaultNotificationAccentColor_$lambda$13();
                return _get_defaultNotificationAccentColor_$lambda$13;
            }
        }, 7, (Object) null);
        return colorValue.intValue();
    }

    public final String getDefaultNotificationChannelDescription() {
        b bVar = b.f12112b;
        String stringValue = getStringValue("com_braze_default_notification_channel_description", "");
        return stringValue == null ? "" : stringValue;
    }

    public final String getDefaultNotificationChannelName() {
        b bVar = b.f12112b;
        String stringValue = getStringValue("com_braze_default_notification_channel_name", "General");
        return stringValue == null ? "General" : stringValue;
    }

    public final EnumSet<DeviceKey> getDeviceObjectAllowlist() {
        return getGenericEnumSetFromStringSet(DeviceKey.class, b.f12112b);
    }

    public final boolean getDoesHandlePushDeepLinksAutomatically() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_handle_push_deep_links_automatically", false);
    }

    public final boolean getDoesPushStoryDismissOnClick() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_does_push_story_dismiss_on_click", true);
    }

    public final Set<String> getEphemeralEventKeys() {
        b bVar = b.f12112b;
        Set<String> stringSetValue = getStringSetValue("com_braze_ephemeral_events_keys", SetsKt.emptySet());
        if (stringSetValue == null) {
            stringSetValue = SetsKt.emptySet();
        }
        if (stringSetValue.size() > 12) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: S3.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _get_ephemeralEventKeys_$lambda$0;
                    _get_ephemeralEventKeys_$lambda$0 = BrazeConfigurationProvider._get_ephemeralEventKeys_$lambda$0();
                    return _get_ephemeralEventKeys_$lambda$0;
                }
            }, 6, (Object) null);
        }
        return CollectionsKt.toSet(CollectionsKt.take(stringSetValue, 12));
    }

    public final String getFallbackFirebaseMessagingServiceClasspath() {
        b bVar = b.f12112b;
        return getStringValue("com_braze_fallback_firebase_cloud_messaging_service_classpath", null);
    }

    public final String getFirebaseCloudMessagingSenderIdKey() {
        b bVar = b.f12112b;
        return getStringValue("com_braze_firebase_cloud_messaging_sender_id", null);
    }

    public final int getInAppMessageWebViewClientOnPageFinishedMaxWaitMs() {
        b bVar = b.f12112b;
        return getIntValue("com_braze_in_app_message_webview_client_max_onpagefinished_wait_ms", DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS);
    }

    public final int getLargeNotificationIconResourceId() {
        b bVar = b.f12112b;
        return getDrawableValue("com_braze_push_large_notification_icon", 0);
    }

    public final int getLoggerInitialLogLevel() {
        b bVar = b.f12112b;
        return getIntValue("com_braze_logger_initial_log_level", 4);
    }

    public final String getPushDeepLinkBackStackActivityClassName() {
        b bVar = b.f12112b;
        return getStringValue("com_braze_push_deep_link_back_stack_activity_class_name", "");
    }

    public final SdkFlavor getSdkFlavor() {
        b bVar = b.f12112b;
        String stringValue = getStringValue("com_braze_sdk_flavor", null);
        if (stringValue != null && !StringsKt.isBlank(stringValue)) {
            try {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String upperCase = stringValue.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                return SdkFlavor.valueOf(upperCase);
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: S3.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String _get_sdkFlavor_$lambda$14;
                        _get_sdkFlavor_$lambda$14 = BrazeConfigurationProvider._get_sdkFlavor_$lambda$14();
                        return _get_sdkFlavor_$lambda$14;
                    }
                }, 4, (Object) null);
            }
        }
        return null;
    }

    public final EnumSet<BrazeSdkMetadata> getSdkMetadata() {
        String upperCase;
        int i6;
        b bVar = b.f12112b;
        d dVar = d.f12121g;
        Object resourceConfigurationValue = getResourceConfigurationValue(dVar, "com_braze_internal_sdk_metadata", new HashSet());
        Intrinsics.checkNotNull(resourceConfigurationValue, "null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
        Set<String> asMutableSet = TypeIntrinsics.asMutableSet(resourceConfigurationValue);
        Object resourceConfigurationValue2 = getResourceConfigurationValue(dVar, "com_braze_sdk_metadata", new HashSet());
        Intrinsics.checkNotNull(resourceConfigurationValue2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        Object runtimeConfigurationValue = getRuntimeConfigurationValue(dVar, "com_braze_sdk_metadata", new HashSet());
        Intrinsics.checkNotNull(runtimeConfigurationValue, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        asMutableSet.addAll((Set) resourceConfigurationValue2);
        asMutableSet.addAll((Set) runtimeConfigurationValue);
        EnumSet<BrazeSdkMetadata> noneOf = EnumSet.noneOf(BrazeSdkMetadata.class);
        for (String str : asMutableSet) {
            try {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                upperCase = str.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) com.braze.support.f.f12993a, BrazeLogger.Priority.f12981E, (Throwable) e6, false, (Function0) new com.braze.support.e(str), 4, (Object) null);
            }
            for (BrazeSdkMetadata brazeSdkMetadata : BrazeSdkMetadata.values()) {
                if (Intrinsics.areEqual(brazeSdkMetadata.name(), upperCase)) {
                    noneOf.add(brazeSdkMetadata);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(noneOf);
        return noneOf;
    }

    public final int getSessionTimeoutSeconds() {
        b bVar = b.f12112b;
        return getIntValue("com_braze_session_timeout", 10);
    }

    public final boolean getShouldAddStatusBarPaddingToInAppMessages() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_in_app_message_add_status_bar_padding", false);
    }

    public final boolean getShouldOptInWhenPushAuthorized() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_optin_when_push_authorized", true);
    }

    public final boolean getShouldPersistWebViewWhenBackgroundingApp() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_persist_webview_when_backgrounding_app", true);
    }

    public final boolean getShouldUseWindowFlagSecureInActivities() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_use_activity_window_flag_secure", false);
    }

    public final int getSmallNotificationIconResourceId() {
        b bVar = b.f12112b;
        return getDrawableValue("com_braze_push_small_notification_icon", 0);
    }

    public final long getTriggerActionMinimumTimeIntervalInSeconds() {
        b bVar = b.f12112b;
        return getIntValue("com_braze_trigger_action_minimum_time_interval_seconds", 30);
    }

    public final int getVersionCode() {
        int i6;
        if (getConfigurationCache().containsKey("version_code")) {
            Object obj = getConfigurationCache().get("version_code");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) obj).intValue();
        }
        try {
            i6 = this.context.getPackageManager().getPackageInfo(PackageUtils.getResourcePackageName(this.context), 0).versionCode;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: S3.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _get_versionCode_$lambda$11;
                    _get_versionCode_$lambda$11 = BrazeConfigurationProvider._get_versionCode_$lambda$11();
                    return _get_versionCode_$lambda$11;
                }
            }, 4, (Object) null);
            i6 = -1;
        }
        getConfigurationCache().put("version_code", Integer.valueOf(i6));
        return i6;
    }

    public final boolean isAdmMessagingRegistrationEnabled() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_push_adm_messaging_registration_enabled", false);
    }

    public final boolean isAutomaticGeofenceRequestsEnabled() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_automatic_geofence_requests_enabled", true);
    }

    public final boolean isContentCardsUnreadVisualIndicatorEnabled() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_content_cards_unread_visual_indicator_enabled", true);
    }

    public final boolean isDeviceObjectAllowlistEnabled() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_device_object_whitelisting_enabled", false);
    }

    public final boolean isEphemeralEventsEnabled() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_ephemeral_events_enabled", false);
    }

    public final boolean isFallbackFirebaseMessagingServiceEnabled() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_fallback_firebase_cloud_messaging_service_enabled", false);
    }

    public final boolean isFirebaseCloudMessagingRegistrationEnabled() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_firebase_cloud_messaging_registration_enabled", false);
    }

    public final boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_firebase_messaging_service_automatically_register_on_new_token", isFirebaseCloudMessagingRegistrationEnabled());
    }

    public final boolean isGeofencesEnabled() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_geofences_enabled", isLocationCollectionEnabled());
    }

    public final boolean isHtmlInAppMessageApplyWindowInsetsEnabled() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_html_in_app_message_apply_insets", false);
    }

    public final boolean isHtmlInAppMessageHtmlLinkTargetEnabled() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_html_in_app_message_enable_html_link_target", true);
    }

    public final boolean isInAppMessageAccessibilityExclusiveModeEnabled() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_device_in_app_message_accessibility_exclusive_mode_enabled", false);
    }

    public final boolean isInAppMessageTestPushEagerDisplayEnabled() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_in_app_message_push_test_eager_display_enabled", true);
    }

    public final boolean isLocationCollectionEnabled() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_enable_location_collection", false);
    }

    public final boolean isNewsfeedVisualIndicatorOn() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_newsfeed_unread_visual_indicator_on", true);
    }

    public final boolean isPushDeepLinkBackStackActivityEnabled() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_push_deep_link_back_stack_activity_enabled", true);
    }

    public final boolean isPushNotificationHtmlRenderingEnabled() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_push_notification_html_rendering_enabled", false);
    }

    public final boolean isPushWakeScreenForNotificationEnabled() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_push_wake_screen_for_notification_enabled", true);
    }

    public final boolean isSdkAuthenticationEnabled() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_sdk_authentication_enabled", false);
    }

    public final boolean isSessionStartBasedTimeoutEnabled() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_session_start_based_timeout_enabled", false);
    }

    public final boolean isTouchModeRequiredForHtmlInAppMessages() {
        b bVar = b.f12112b;
        return getBooleanValue("com_braze_require_touch_mode_for_html_in_app_messages", true);
    }
}
