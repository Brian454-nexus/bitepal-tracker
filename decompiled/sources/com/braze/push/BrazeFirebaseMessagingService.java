package com.braze.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.push.BrazeFirebaseMessagingService;
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeLogger;
import com.braze.support.ReflectionUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.V;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/braze/push/BrazeFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "", "newToken", "", "onNewToken", "(Ljava/lang/String;)V", "Lcom/google/firebase/messaging/V;", "remoteMessage", "onMessageReceived", "(Lcom/google/firebase/messaging/V;)V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class BrazeFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/braze/push/BrazeFirebaseMessagingService$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/google/firebase/messaging/V;", "remoteMessage", "", "handleBrazeRemoteMessage", "(Landroid/content/Context;Lcom/google/firebase/messaging/V;)Z", "isBrazePushNotification", "(Lcom/google/firebase/messaging/V;)Z", "", "classpath", "", "invokeFallbackFirebaseService$android_sdk_ui_release", "(Ljava/lang/String;Lcom/google/firebase/messaging/V;Landroid/content/Context;)V", "invokeFallbackFirebaseService", "FCM_SERVICE_OMR_METHOD", "Ljava/lang/String;", "CONTEXT_ATTACH_METHOD", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$0(V v6) {
            return "Remote message did not originate from Braze. Not consuming remote message: " + v6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$1(String str) {
            return "Fallback FCM service enabled. Attempting to use fallback class at " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$2() {
            return "Fallback FCM service enabled but classpath is null. Not routing to any fallback service.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$3() {
            return "FallbackFirebaseMessagingService is not enabled";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$4(Map map) {
            return "Got remote message from FCM: " + map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$5(String str, String str2) {
            return "Adding bundle item from FCM remote data with key: " + str + " and value: " + str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$10(String str) {
            return "Fallback firebase messaging service method " + str + ".onMessageReceived could not be retrieved. Not routing fallback RemoteMessage.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$11(String str) {
            return "Attempting to invoke firebase messaging fallback service " + str + ".onMessageReceived";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$6(String str) {
            return "Fallback firebase messaging service " + str + " could not be constructed. Not routing fallback RemoteMessage.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$7(String str) {
            return "Attempting to call " + str + " attachBaseContext";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$8(String str) {
            return "Failure invoking " + str + ".attachBaseContext. Not doing anything.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$9() {
            return "Could not find attachBaseContext. Not doing anything.";
        }

        @JvmStatic
        public final boolean handleBrazeRemoteMessage(@NotNull Context context, @NotNull final V remoteMessage) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
            if (!isBrazePushNotification(remoteMessage)) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.f12982I;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: i4.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleBrazeRemoteMessage$lambda$0;
                        handleBrazeRemoteMessage$lambda$0 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$0(remoteMessage);
                        return handleBrazeRemoteMessage$lambda$0;
                    }
                }, 6, (Object) null);
                BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
                if (!configurationProvider.isFallbackFirebaseMessagingServiceEnabled()) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.i
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handleBrazeRemoteMessage$lambda$3;
                            handleBrazeRemoteMessage$lambda$3 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$3();
                            return handleBrazeRemoteMessage$lambda$3;
                        }
                    }, 7, (Object) null);
                    return false;
                }
                final String fallbackFirebaseMessagingServiceClasspath = configurationProvider.getFallbackFirebaseMessagingServiceClasspath();
                if (fallbackFirebaseMessagingServiceClasspath == null) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handleBrazeRemoteMessage$lambda$2;
                            handleBrazeRemoteMessage$lambda$2 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$2();
                            return handleBrazeRemoteMessage$lambda$2;
                        }
                    }, 7, (Object) null);
                    return false;
                }
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: i4.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleBrazeRemoteMessage$lambda$1;
                        handleBrazeRemoteMessage$lambda$1 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$1(fallbackFirebaseMessagingServiceClasspath);
                        return handleBrazeRemoteMessage$lambda$1;
                    }
                }, 6, (Object) null);
                invokeFallbackFirebaseService$android_sdk_ui_release(fallbackFirebaseMessagingServiceClasspath, remoteMessage, context);
                return false;
            }
            final Map D6 = remoteMessage.D();
            Intrinsics.checkNotNullExpressionValue(D6, "getData(...)");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: i4.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleBrazeRemoteMessage$lambda$4;
                    handleBrazeRemoteMessage$lambda$4 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$4(D6);
                    return handleBrazeRemoteMessage$lambda$4;
                }
            }, 6, (Object) null);
            Intent intent = new Intent("firebase_messaging_service_routing_action");
            Bundle bundle = new Bundle();
            for (Map.Entry entry : D6.entrySet()) {
                final String str = (String) entry.getKey();
                final String str2 = (String) entry.getValue();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: i4.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleBrazeRemoteMessage$lambda$5;
                        handleBrazeRemoteMessage$lambda$5 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$5(str, str2);
                        return handleBrazeRemoteMessage$lambda$5;
                    }
                }, 6, (Object) null);
                bundle.putString(str, str2);
            }
            intent.putExtras(bundle);
            BrazePushReceiver.Companion.handleReceivedIntent$default(BrazePushReceiver.INSTANCE, context, intent, false, 4, null);
            return true;
        }

        public final void invokeFallbackFirebaseService$android_sdk_ui_release(@NotNull final String classpath, @NotNull V remoteMessage, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(classpath, "classpath");
            Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
            Intrinsics.checkNotNullParameter(context, "context");
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            Object constructObjectQuietly$default = ReflectionUtils.constructObjectQuietly$default(reflectionUtils, classpath, null, null, 6, null);
            if (constructObjectQuietly$default == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String invokeFallbackFirebaseService$lambda$6;
                        invokeFallbackFirebaseService$lambda$6 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$6(classpath);
                        return invokeFallbackFirebaseService$lambda$6;
                    }
                }, 7, (Object) null);
                return;
            }
            Method declaredMethodQuietly = reflectionUtils.getDeclaredMethodQuietly(classpath, "attachBaseContext", Context.class);
            if (declaredMethodQuietly == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String invokeFallbackFirebaseService$lambda$9;
                        invokeFallbackFirebaseService$lambda$9 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$9();
                        return invokeFallbackFirebaseService$lambda$9;
                    }
                }, 7, (Object) null);
                return;
            }
            declaredMethodQuietly.setAccessible(true);
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String invokeFallbackFirebaseService$lambda$7;
                    invokeFallbackFirebaseService$lambda$7 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$7(classpath);
                    return invokeFallbackFirebaseService$lambda$7;
                }
            }, 7, (Object) null);
            if (!((Boolean) ReflectionUtils.invokeMethodQuietly(constructObjectQuietly$default, declaredMethodQuietly, context).getFirst()).booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String invokeFallbackFirebaseService$lambda$8;
                        invokeFallbackFirebaseService$lambda$8 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$8(classpath);
                        return invokeFallbackFirebaseService$lambda$8;
                    }
                }, 7, (Object) null);
                return;
            }
            Method methodQuietly = ReflectionUtils.getMethodQuietly(classpath, "onMessageReceived", (Class<?>[]) new Class[]{V.class});
            if (methodQuietly == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String invokeFallbackFirebaseService$lambda$10;
                        invokeFallbackFirebaseService$lambda$10 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$10(classpath);
                        return invokeFallbackFirebaseService$lambda$10;
                    }
                }, 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: i4.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String invokeFallbackFirebaseService$lambda$11;
                        invokeFallbackFirebaseService$lambda$11 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$11(classpath);
                        return invokeFallbackFirebaseService$lambda$11;
                    }
                }, 7, (Object) null);
                ((Boolean) ReflectionUtils.invokeMethodQuietly(constructObjectQuietly$default, methodQuietly, remoteMessage).getFirst()).booleanValue();
            }
        }

        @JvmStatic
        public final boolean isBrazePushNotification(@NotNull V remoteMessage) {
            Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
            Map D6 = remoteMessage.D();
            Intrinsics.checkNotNullExpressionValue(D6, "getData(...)");
            return Intrinsics.areEqual(com.amazon.a.a.o.b.af, D6.get("_ab"));
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onNewToken$lambda$0(String str) {
        return "No configured API key, not registering token in onNewToken. Token: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onNewToken$lambda$1(String str) {
        return "Automatic FirebaseMessagingService.OnNewToken() registration disabled, not registering token: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onNewToken$lambda$2(String str) {
        return "Registering Firebase push token in onNewToken. Token: " + str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMessageReceived(@NotNull V remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        super.onMessageReceived(remoteMessage);
        INSTANCE.handleBrazeRemoteMessage(this, remoteMessage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewToken(@NotNull final String newToken) {
        Intrinsics.checkNotNullParameter(newToken, "newToken");
        super.onNewToken(newToken);
        BrazeInternal.applyPendingRuntimeConfiguration(this);
        BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(this);
        Braze.Companion companion = Braze.INSTANCE;
        String configuredApiKey = companion.getConfiguredApiKey(configurationProvider);
        if (configuredApiKey == null || configuredApiKey.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: i4.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onNewToken$lambda$0;
                    onNewToken$lambda$0 = BrazeFirebaseMessagingService.onNewToken$lambda$0(newToken);
                    return onNewToken$lambda$0;
                }
            }, 6, (Object) null);
        } else if (!configurationProvider.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: i4.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onNewToken$lambda$1;
                    onNewToken$lambda$1 = BrazeFirebaseMessagingService.onNewToken$lambda$1(newToken);
                    return onNewToken$lambda$1;
                }
            }, 6, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: i4.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onNewToken$lambda$2;
                    onNewToken$lambda$2 = BrazeFirebaseMessagingService.onNewToken$lambda$2(newToken);
                    return onNewToken$lambda$2;
                }
            }, 6, (Object) null);
            companion.getInstance(this).setRegisteredPushToken(newToken);
        }
    }
}
