package com.braze.ui.inappmessage;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.braze.ui.inappmessage.BrazeInAppMessageManager", f = "BrazeInAppMessageManager.kt", i = {0, 0, 0, 0}, l = {578}, m = "displayInAppMessage$suspendImpl", n = {"$this", "inAppMessage", "activity", "configProvider"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class BrazeInAppMessageManager$displayInAppMessage$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BrazeInAppMessageManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeInAppMessageManager$displayInAppMessage$1(BrazeInAppMessageManager brazeInAppMessageManager, Continuation<? super BrazeInAppMessageManager$displayInAppMessage$1> continuation) {
        super(continuation);
        this.this$0 = brazeInAppMessageManager;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        return BrazeInAppMessageManager.displayInAppMessage$suspendImpl(this.this$0, null, false, this);
    }
}
