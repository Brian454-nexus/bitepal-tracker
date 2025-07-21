package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.ui.actions.brazeactions.steps.RemoveFromCustomAttributeArrayStep;
import com.braze.ui.actions.brazeactions.steps.StepData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/RemoveFromCustomAttributeArrayStep;", "Lcom/braze/ui/actions/brazeactions/steps/BaseBrazeActionStep;", "<init>", "()V", "isValid", "", "data", "Lcom/braze/ui/actions/brazeactions/steps/StepData;", "run", "", "context", "Landroid/content/Context;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class RemoveFromCustomAttributeArrayStep extends BaseBrazeActionStep {

    @NotNull
    public static final RemoveFromCustomAttributeArrayStep INSTANCE = new RemoveFromCustomAttributeArrayStep();

    private RemoveFromCustomAttributeArrayStep() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$1(StepData stepData, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.removeFromCustomAttributeArray(String.valueOf(stepData.getFirstArg()), String.valueOf(stepData.getSecondArg()));
        return Unit.INSTANCE;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(@NotNull StepData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return StepData.isArgCountInBounds$default(data, 2, null, 2, null) && data.isArgString(0) && data.isArgString(1);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(@NotNull Context context, @NotNull final StepData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        BaseBrazeActionStep.INSTANCE.runOnUser$android_sdk_ui_release(Braze.INSTANCE.getInstance(context), new Function1() { // from class: y4.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit run$lambda$1;
                run$lambda$1 = RemoveFromCustomAttributeArrayStep.run$lambda$1(StepData.this, (BrazeUser) obj);
                return run$lambda$1;
            }
        });
    }
}
