package com.braze.ui.actions.brazeactions.steps;

import com.amazon.a.a.o.b;
import com.braze.BrazeUser;
import com.braze.events.IValueCallback;
import com.braze.support.BrazeLogger;
import com.braze.ui.actions.brazeactions.steps.BaseBrazeActionStep$Companion$runOnUser$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"com/braze/ui/actions/brazeactions/steps/BaseBrazeActionStep$Companion$runOnUser$1", "Lcom/braze/events/IValueCallback;", "Lcom/braze/BrazeUser;", "onSuccess", "", b.f11195Y, "onError", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class BaseBrazeActionStep$Companion$runOnUser$1 implements IValueCallback<BrazeUser> {
    final /* synthetic */ Function1<BrazeUser, Unit> $block;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseBrazeActionStep$Companion$runOnUser$1(Function1<? super BrazeUser, Unit> function1) {
        this.$block = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onError$lambda$0() {
        return "Failed to run on Braze user object";
    }

    @Override // com.braze.events.IValueCallback
    public void onError() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: y4.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onError$lambda$0;
                onError$lambda$0 = BaseBrazeActionStep$Companion$runOnUser$1.onError$lambda$0();
                return onError$lambda$0;
            }
        }, 7, (Object) null);
    }

    @Override // com.braze.events.IValueCallback
    public void onSuccess(BrazeUser value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.$block.invoke(value);
    }
}
