package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.support.BrazeLogger;
import com.braze.ui.actions.brazeactions.steps.SetPushNotificationSubscriptionStep;
import com.braze.ui.actions.brazeactions.steps.StepData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/SetPushNotificationSubscriptionStep;", "Lcom/braze/ui/actions/brazeactions/steps/BaseBrazeActionStep;", "<init>", "()V", "Lcom/braze/ui/actions/brazeactions/steps/StepData;", "data", "", "isValid", "(Lcom/braze/ui/actions/brazeactions/steps/StepData;)Z", "Landroid/content/Context;", "context", "", "run", "(Landroid/content/Context;Lcom/braze/ui/actions/brazeactions/steps/StepData;)V", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class SetPushNotificationSubscriptionStep extends BaseBrazeActionStep {

    @NotNull
    public static final SetPushNotificationSubscriptionStep INSTANCE;

    @NotNull
    private static final String TAG;

    static {
        SetPushNotificationSubscriptionStep setPushNotificationSubscriptionStep = new SetPushNotificationSubscriptionStep();
        INSTANCE = setPushNotificationSubscriptionStep;
        TAG = BrazeLogger.INSTANCE.brazeLogTag(setPushNotificationSubscriptionStep);
    }

    private SetPushNotificationSubscriptionStep() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String run$lambda$1(StepData stepData) {
        return "Could not parse subscription type from data " + stepData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$2(NotificationSubscriptionType notificationSubscriptionType, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setPushNotificationSubscriptionType(notificationSubscriptionType);
        return Unit.INSTANCE;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(@NotNull StepData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return StepData.isArgCountInBounds$default(data, 1, null, 2, null) && data.isArgString(0);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(@NotNull Context context, @NotNull final StepData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        final NotificationSubscriptionType fromValue = NotificationSubscriptionType.INSTANCE.fromValue(String.valueOf(data.getFirstArg()));
        if (fromValue == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: y4.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String run$lambda$1;
                    run$lambda$1 = SetPushNotificationSubscriptionStep.run$lambda$1(StepData.this);
                    return run$lambda$1;
                }
            }, 7, (Object) null);
        } else {
            BaseBrazeActionStep.INSTANCE.runOnUser$android_sdk_ui_release(Braze.INSTANCE.getInstance(context), new Function1() { // from class: y4.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit run$lambda$2;
                    run$lambda$2 = SetPushNotificationSubscriptionStep.run$lambda$2(NotificationSubscriptionType.this, (BrazeUser) obj);
                    return run$lambda$2;
                }
            });
        }
    }
}
