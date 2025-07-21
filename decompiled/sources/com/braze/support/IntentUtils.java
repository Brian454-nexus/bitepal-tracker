package com.braze.support;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import java.util.List;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0006R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/braze/support/IntentUtils;", "", "<init>", "()V", "", "getRequestCode", "()I", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "addComponentAndSendBroadcast", "(Landroid/content/Context;Landroid/content/Intent;)V", "getImmutablePendingIntentFlags", "Ljava/util/Random;", "random$delegate", "Lkotlin/Lazy;", "getRandom", "()Ljava/util/Random;", "random", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class IntentUtils {
    public static final IntentUtils INSTANCE = new IntentUtils();

    /* renamed from: random$delegate, reason: from kotlin metadata */
    private static final Lazy random = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: p4.X
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Random random_delegate$lambda$0;
            random_delegate$lambda$0 = IntentUtils.random_delegate$lambda$0();
            return random_delegate$lambda$0;
        }
    });

    private IntentUtils() {
    }

    @JvmStatic
    public static final void addComponentAndSendBroadcast(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers;
        PackageManager.ResolveInfoFlags of;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager packageManager = context.getPackageManager();
            of = PackageManager.ResolveInfoFlags.of(0L);
            queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, of);
        } else {
            queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        }
        Intrinsics.checkNotNull(queryBroadcastReceivers);
        for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
            final Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            final ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setComponent(componentName);
            context.sendBroadcast(intent2);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: p4.W
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addComponentAndSendBroadcast$lambda$2$lambda$1;
                    addComponentAndSendBroadcast$lambda$2$lambda$1 = IntentUtils.addComponentAndSendBroadcast$lambda$2$lambda$1(componentName, intent2);
                    return addComponentAndSendBroadcast$lambda$2$lambda$1;
                }
            }, 6, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addComponentAndSendBroadcast$lambda$2$lambda$1(ComponentName componentName, Intent intent) {
        return "Sent intent with component " + componentName + " and explicit intent " + intent;
    }

    @JvmStatic
    public static final int getImmutablePendingIntentFlags() {
        return 67108864;
    }

    private final Random getRandom() {
        return (Random) random.getValue();
    }

    @JvmStatic
    public static final int getRequestCode() {
        return INSTANCE.getRandom().nextInt(1073741823) + 100000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Random random_delegate$lambda$0() {
        return new Random();
    }
}
