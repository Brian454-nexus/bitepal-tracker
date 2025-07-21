package com.braze.support;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.braze.support.BrazeLogger;
import com.braze.support.PermissionUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0003*\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/content/Context;", "", "permission", "", "hasPermission", "(Landroid/content/Context;Ljava/lang/String;)Z", "Landroid/app/Activity;", "", "requestPushPermissionPrompt", "(Landroid/app/Activity;)V", "wouldPushPermissionPromptDisplay", "(Landroid/app/Activity;)Z", "context", "", "getPermissionRequestCount", "(Landroid/content/Context;Ljava/lang/String;)I", "incrementPermissionRequestCount", "(Landroid/content/Context;Ljava/lang/String;)V", "TAG", "Ljava/lang/String;", "android-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class PermissionUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("PermissionUtils");

    public static final int getPermissionRequestCount(Context context, String permission) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return context.getSharedPreferences("com.braze.support.permission_util.requested_perms", 0).getInt(permission, 0);
    }

    public static final boolean hasPermission(Context context, final String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (context != null) {
            try {
                if (context.checkCallingOrSelfPermission(permission) == 0) {
                    return true;
                }
            } catch (Throwable th) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12981E, th, false, new Function0() { // from class: p4.m0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String hasPermission$lambda$0;
                        hasPermission$lambda$0 = PermissionUtils.hasPermission$lambda$0(permission);
                        return hasPermission$lambda$0;
                    }
                }, 8, (Object) null);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String hasPermission$lambda$0(String str) {
        return com.braze.j.a("Failure checking permission ", str);
    }

    public static final void incrementPermissionRequestCount(Context context, String permission) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.support.permission_util.requested_perms", 0);
        final int i6 = sharedPreferences.getInt(permission, 0) + 1;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: p4.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String incrementPermissionRequestCount$lambda$11;
                incrementPermissionRequestCount$lambda$11 = PermissionUtils.incrementPermissionRequestCount$lambda$11(i6);
                return incrementPermissionRequestCount$lambda$11;
            }
        }, 14, (Object) null);
        sharedPreferences.edit().putInt(permission, i6).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String incrementPermissionRequestCount$lambda$11(int i6) {
        return "Incrementing permission request counter to " + i6 + com.amazon.a.a.o.c.a.b.f11260a;
    }

    public static final void requestPushPermissionPrompt(Activity activity) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str = TAG;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f12983V;
        BrazeLogger.brazelog$default(brazeLogger, str, priority, (Throwable) null, false, new Function0() { // from class: p4.n0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestPushPermissionPrompt$lambda$1;
                requestPushPermissionPrompt$lambda$1 = PermissionUtils.requestPushPermissionPrompt$lambda$1();
                return requestPushPermissionPrompt$lambda$1;
            }
        }, 12, (Object) null);
        if (activity == null) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: p4.o0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestPushPermissionPrompt$lambda$2;
                    requestPushPermissionPrompt$lambda$2 = PermissionUtils.requestPushPermissionPrompt$lambda$2();
                    return requestPushPermissionPrompt$lambda$2;
                }
            }, 14, (Object) null);
            return;
        }
        if (!wouldPushPermissionPromptDisplay(activity) || Build.VERSION.SDK_INT < 33) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: p4.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestPushPermissionPrompt$lambda$3;
                    requestPushPermissionPrompt$lambda$3 = PermissionUtils.requestPushPermissionPrompt$lambda$3();
                    return requestPushPermissionPrompt$lambda$3;
                }
            }, 14, (Object) null);
            return;
        }
        incrementPermissionRequestCount(activity, "android.permission.POST_NOTIFICATIONS");
        BrazeLogger.brazelog$default(brazeLogger, str, priority, (Throwable) null, false, new Function0() { // from class: p4.p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestPushPermissionPrompt$lambda$4;
                requestPushPermissionPrompt$lambda$4 = PermissionUtils.requestPushPermissionPrompt$lambda$4();
                return requestPushPermissionPrompt$lambda$4;
            }
        }, 12, (Object) null);
        activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, IntentUtils.getRequestCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$1() {
        return "Attempting to execute requestPushPermissionPrompt()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$2() {
        return "Cannot request push permission with null Activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$3() {
        return "Permission prompt would not display, not attempting to request push permission prompt.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$4() {
        return "Requesting push permission from system.";
    }

    public static final boolean wouldPushPermissionPromptDisplay(Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: p4.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String wouldPushPermissionPromptDisplay$lambda$5;
                    wouldPushPermissionPromptDisplay$lambda$5 = PermissionUtils.wouldPushPermissionPromptDisplay$lambda$5();
                    return wouldPushPermissionPromptDisplay$lambda$5;
                }
            }, 14, (Object) null);
            return false;
        }
        if (Build.VERSION.SDK_INT < 33) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: p4.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String wouldPushPermissionPromptDisplay$lambda$6;
                    wouldPushPermissionPromptDisplay$lambda$6 = PermissionUtils.wouldPushPermissionPromptDisplay$lambda$6();
                    return wouldPushPermissionPromptDisplay$lambda$6;
                }
            }, 12, (Object) null);
            return false;
        }
        final int i6 = activity.getApplicationInfo().targetSdkVersion;
        if (i6 < 33) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: p4.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String wouldPushPermissionPromptDisplay$lambda$7;
                    wouldPushPermissionPromptDisplay$lambda$7 = PermissionUtils.wouldPushPermissionPromptDisplay$lambda$7(i6);
                    return wouldPushPermissionPromptDisplay$lambda$7;
                }
            }, 12, (Object) null);
            return false;
        }
        if (hasPermission(activity, "android.permission.POST_NOTIFICATIONS")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: p4.j0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String wouldPushPermissionPromptDisplay$lambda$8;
                    wouldPushPermissionPromptDisplay$lambda$8 = PermissionUtils.wouldPushPermissionPromptDisplay$lambda$8();
                    return wouldPushPermissionPromptDisplay$lambda$8;
                }
            }, 12, (Object) null);
            return false;
        }
        final int permissionRequestCount = getPermissionRequestCount(activity, "android.permission.POST_NOTIFICATIONS");
        if (permissionRequestCount >= 2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: p4.k0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String wouldPushPermissionPromptDisplay$lambda$9;
                    wouldPushPermissionPromptDisplay$lambda$9 = PermissionUtils.wouldPushPermissionPromptDisplay$lambda$9(permissionRequestCount);
                    return wouldPushPermissionPromptDisplay$lambda$9;
                }
            }, 12, (Object) null);
            return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: p4.l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String wouldPushPermissionPromptDisplay$lambda$10;
                wouldPushPermissionPromptDisplay$lambda$10 = PermissionUtils.wouldPushPermissionPromptDisplay$lambda$10();
                return wouldPushPermissionPromptDisplay$lambda$10;
            }
        }, 12, (Object) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$10() {
        return "Push Prompt can be shown on this device, within a reasonable confidence.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$5() {
        return "Cannot request push permission with null Activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$6() {
        return "Device API version of " + Build.VERSION.SDK_INT + " is too low to display push permission prompt.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$7(int i6) {
        return "App Target API version of " + i6 + " is too low to display push permission prompt.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$8() {
        return "Notification permission already granted, doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$9(int i6) {
        return "Notification permission request count is " + i6 + ". Returning value of 'shouldShowRequestPermissionRationale(NOTIFICATION_PERMISSION)'";
    }
}
