package com.braze;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.BrazeActivityLifecycleCallbackListener;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.push.NotificationTrampolineActivity;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import java.lang.ref.WeakReference;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u0000 &2\u00020\u0001:\u0001&BM\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ!\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001dR*\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b$\u0010%\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/braze/BrazeActivityLifecycleCallbackListener;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "", "sessionHandlingEnabled", "registerInAppMessageManager", "", "Ljava/lang/Class;", "inAppMessagingRegistrationBlocklist", "sessionHandlingBlocklist", "<init>", "(ZZLjava/util/Set;Ljava/util/Set;)V", "Landroid/app/Activity;", "activity", "", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityStopped", "onActivityResumed", "onActivityPaused", "Landroid/os/Bundle;", "bundle", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivitySaveInstanceState", "onActivityDestroyed", "forSessionHandling", "shouldHandleLifecycleMethodsInActivity", "(Landroid/app/Activity;Z)Z", "Z", "Ljava/util/Set;", "shouldPersistWebView", "Ljava/lang/Boolean;", "getShouldPersistWebView", "()Ljava/lang/Boolean;", "setShouldPersistWebView", "(Ljava/lang/Boolean;)V", "getShouldPersistWebView$annotations", "()V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class BrazeActivityLifecycleCallbackListener implements Application.ActivityLifecycleCallbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static WeakReference<Activity> currentActivityRef;

    @NotNull
    private Set<? extends Class<?>> inAppMessagingRegistrationBlocklist;
    private final boolean registerInAppMessageManager;

    @NotNull
    private Set<? extends Class<?>> sessionHandlingBlocklist;
    private final boolean sessionHandlingEnabled;

    @Nullable
    private Boolean shouldPersistWebView;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/braze/BrazeActivityLifecycleCallbackListener$Companion;", "", "<init>", "()V", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "currentActivityRef", "Ljava/lang/ref/WeakReference;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_activity_$lambda$0() {
            return "BrazeActivityLifecycleCallbackListener.currentActivity is null. Ensure that BrazeActivityLifecycleCallbackListener is registered in your Application class.";
        }

        @Nullable
        public final Activity getActivity() {
            WeakReference weakReference = BrazeActivityLifecycleCallbackListener.currentActivityRef;
            Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
            if (activity == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: N3.f3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String _get_activity_$lambda$0;
                        _get_activity_$lambda$0 = BrazeActivityLifecycleCallbackListener.Companion._get_activity_$lambda$0();
                        return _get_activity_$lambda$0;
                    }
                }, 6, (Object) null);
            }
            return activity;
        }

        private Companion() {
        }
    }

    @JvmOverloads
    public BrazeActivityLifecycleCallbackListener(boolean z6, boolean z7, @Nullable Set<? extends Class<?>> set, @Nullable Set<? extends Class<?>> set2) {
        this.sessionHandlingEnabled = z6;
        this.registerInAppMessageManager = z7;
        this.inAppMessagingRegistrationBlocklist = set == null ? SetsKt.emptySet() : set;
        this.sessionHandlingBlocklist = set2 == null ? SetsKt.emptySet() : set2;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f12983V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: N3.c3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _init_$lambda$0;
                _init_$lambda$0 = BrazeActivityLifecycleCallbackListener._init_$lambda$0(BrazeActivityLifecycleCallbackListener.this);
                return _init_$lambda$0;
            }
        }, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: N3.d3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _init_$lambda$1;
                _init_$lambda$1 = BrazeActivityLifecycleCallbackListener._init_$lambda$1(BrazeActivityLifecycleCallbackListener.this);
                return _init_$lambda$1;
            }
        }, 6, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener) {
        return "BrazeActivityLifecycleCallbackListener using in-app messaging blocklist: " + brazeActivityLifecycleCallbackListener.inAppMessagingRegistrationBlocklist;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$1(BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener) {
        return "BrazeActivityLifecycleCallbackListener using session handling blocklist: " + brazeActivityLifecycleCallbackListener.sessionHandlingBlocklist;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityCreated$lambda$10(Activity activity) {
        return "Automatically calling lifecycle method: ensureSubscribedToInAppMessageEvents for class: " + activity.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityPaused$lambda$8(Activity activity) {
        return "Automatically calling lifecycle method: unregisterInAppMessageManager for class: " + activity.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityPaused$lambda$9() {
        return "Skipping unregisterInAppMessageManager in onActivityPaused because shouldPersistWebView is true";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityResumed$lambda$6() {
        return "Activity is different from previous activity. Unregistering in-app message manager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityResumed$lambda$7(Activity activity) {
        return "Automatically calling lifecycle method: registerInAppMessageManager for class: " + activity.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityStarted$lambda$4(Activity activity) {
        return "Automatically calling lifecycle method: openSession for class: " + activity.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityStopped$lambda$5(Activity activity) {
        return "Automatically calling lifecycle method: closeSession for class: " + activity.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String shouldHandleLifecycleMethodsInActivity$lambda$11() {
        return "Skipping automatic registration for notification trampoline activity class.";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull final Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: N3.Z2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onActivityCreated$lambda$10;
                onActivityCreated$lambda$10 = BrazeActivityLifecycleCallbackListener.onActivityCreated$lambda$10(activity);
                return onActivityCreated$lambda$10;
            }
        }, 6, (Object) null);
        BrazeInAppMessageManager companion = BrazeInAppMessageManager.INSTANCE.getInstance();
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        companion.ensureSubscribedToInAppMessageEvents(applicationContext);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.registerInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false)) {
            if (this.shouldPersistWebView == null) {
                Context applicationContext = activity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                this.shouldPersistWebView = Boolean.valueOf(new BrazeConfigurationProvider(applicationContext).getShouldPersistWebViewWhenBackgroundingApp());
            }
            if (Intrinsics.areEqual(this.shouldPersistWebView, Boolean.TRUE)) {
                BrazeInAppMessageManager.INSTANCE.getInstance().pauseWebviewIfNecessary$android_sdk_ui_release();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: N3.X2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String onActivityPaused$lambda$9;
                        onActivityPaused$lambda$9 = BrazeActivityLifecycleCallbackListener.onActivityPaused$lambda$9();
                        return onActivityPaused$lambda$9;
                    }
                }, 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: N3.W2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String onActivityPaused$lambda$8;
                        onActivityPaused$lambda$8 = BrazeActivityLifecycleCallbackListener.onActivityPaused$lambda$8(activity);
                        return onActivityPaused$lambda$8;
                    }
                }, 6, (Object) null);
                BrazeInAppMessageManager.INSTANCE.getInstance().unregisterInAppMessageManager(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.registerInAppMessageManager) {
            if (shouldHandleLifecycleMethodsInActivity(activity, false)) {
                WeakReference<Activity> weakReference = currentActivityRef;
                Activity activity2 = weakReference != null ? weakReference.get() : null;
                Boolean bool = this.shouldPersistWebView;
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.areEqual(bool, bool2) && activity2 != null && !Intrinsics.areEqual(activity2, activity)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: N3.a3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String onActivityResumed$lambda$6;
                            onActivityResumed$lambda$6 = BrazeActivityLifecycleCallbackListener.onActivityResumed$lambda$6();
                            return onActivityResumed$lambda$6;
                        }
                    }, 6, (Object) null);
                    BrazeInAppMessageManager.INSTANCE.getInstance().unregisterInAppMessageManager(activity);
                }
                if (Intrinsics.areEqual(this.shouldPersistWebView, bool2) && activity2 != null && Intrinsics.areEqual(activity2, activity)) {
                    BrazeInAppMessageManager.INSTANCE.getInstance().resumeWebviewIfNecessary$android_sdk_ui_release();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: N3.b3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String onActivityResumed$lambda$7;
                            onActivityResumed$lambda$7 = BrazeActivityLifecycleCallbackListener.onActivityResumed$lambda$7(activity);
                            return onActivityResumed$lambda$7;
                        }
                    }, 6, (Object) null);
                    BrazeInAppMessageManager.INSTANCE.getInstance().registerInAppMessageManager(activity);
                }
            } else {
                BrazeInAppMessageManager.INSTANCE.getInstance().unregisterInAppMessageManager(activity);
            }
        }
        currentActivityRef = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.sessionHandlingEnabled && shouldHandleLifecycleMethodsInActivity(activity, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: N3.Y2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onActivityStarted$lambda$4;
                    onActivityStarted$lambda$4 = BrazeActivityLifecycleCallbackListener.onActivityStarted$lambda$4(activity);
                    return onActivityStarted$lambda$4;
                }
            }, 6, (Object) null);
            Braze.Companion companion = Braze.INSTANCE;
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.getInstance(applicationContext).openSession(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.sessionHandlingEnabled && shouldHandleLifecycleMethodsInActivity(activity, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: N3.V2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onActivityStopped$lambda$5;
                    onActivityStopped$lambda$5 = BrazeActivityLifecycleCallbackListener.onActivityStopped$lambda$5(activity);
                    return onActivityStopped$lambda$5;
                }
            }, 6, (Object) null);
            Braze.Companion companion = Braze.INSTANCE;
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.getInstance(applicationContext).closeSession(activity);
        }
    }

    public final boolean shouldHandleLifecycleMethodsInActivity(@NotNull Activity activity, boolean forSessionHandling) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Class<?> cls = activity.getClass();
        if (!Intrinsics.areEqual(cls, NotificationTrampolineActivity.class)) {
            return forSessionHandling ? !this.sessionHandlingBlocklist.contains(cls) : !this.inAppMessagingRegistrationBlocklist.contains(cls);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: N3.e3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String shouldHandleLifecycleMethodsInActivity$lambda$11;
                shouldHandleLifecycleMethodsInActivity$lambda$11 = BrazeActivityLifecycleCallbackListener.shouldHandleLifecycleMethodsInActivity$lambda$11();
                return shouldHandleLifecycleMethodsInActivity$lambda$11;
            }
        }, 6, (Object) null);
        return false;
    }

    public /* synthetic */ BrazeActivityLifecycleCallbackListener(boolean z6, boolean z7, Set set, Set set2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? true : z6, (i6 & 2) != 0 ? true : z7, (i6 & 4) != 0 ? SetsKt.emptySet() : set, (i6 & 8) != 0 ? SetsKt.emptySet() : set2);
    }
}
