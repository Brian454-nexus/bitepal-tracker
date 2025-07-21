package com.braze.ui.inappmessage;

import android.app.Activity;
import android.view.View;
import com.braze.models.inappmessage.IInAppMessage;
import ga.J;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lga/J;", "Landroid/view/View;", "<anonymous>", "(Lga/J;)Landroid/view/View;"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$inAppMessageView$1", f = "BrazeInAppMessageManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class BrazeInAppMessageManager$displayInAppMessage$inAppMessageView$1 extends SuspendLambda implements Function2<J, Continuation<? super View>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ IInAppMessage $inAppMessage;
    final /* synthetic */ IInAppMessageViewFactory $inAppMessageViewFactory;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeInAppMessageManager$displayInAppMessage$inAppMessageView$1(IInAppMessageViewFactory iInAppMessageViewFactory, Activity activity, IInAppMessage iInAppMessage, Continuation<? super BrazeInAppMessageManager$displayInAppMessage$inAppMessageView$1> continuation) {
        super(2, continuation);
        this.$inAppMessageViewFactory = iInAppMessageViewFactory;
        this.$activity = activity;
        this.$inAppMessage = iInAppMessage;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BrazeInAppMessageManager$displayInAppMessage$inAppMessageView$1(this.$inAppMessageViewFactory, this.$activity, this.$inAppMessage, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(J j6, Continuation<? super View> continuation) {
        return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.$inAppMessageViewFactory.createInAppMessageView(this.$activity, this.$inAppMessage);
    }
}
