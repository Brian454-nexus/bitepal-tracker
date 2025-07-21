package com.braze.ui.inappmessage.utils;

import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import ga.J;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lga/J;", "", "<anonymous>", "(Lga/J;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1", f = "BackgroundInAppMessagePreparer.kt", i = {0}, l = {42}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1 extends SuspendLambda implements Function2<J, Continuation<? super Unit>, Object> {
    final /* synthetic */ IInAppMessage $inAppMessageToPrepare;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1(IInAppMessage iInAppMessage, Continuation<? super BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1> continuation) {
        super(2, continuation);
        this.$inAppMessageToPrepare = iInAppMessage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$0() {
        return "Cannot display the in-app message because the in-app message was null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$1() {
        return "Caught error while preparing in app message in background";
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1 backgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1 = new BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1(this.$inAppMessageToPrepare, continuation);
        backgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1.L$0 = obj;
        return backgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(J j6, Continuation<? super Unit> continuation) {
        return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Exception exc;
        J j6;
        IInAppMessage prepareInAppMessage;
        Object displayPreparedInAppMessage;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.label;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            J j7 = (J) this.L$0;
            try {
                BackgroundInAppMessagePreparer backgroundInAppMessagePreparer = BackgroundInAppMessagePreparer.INSTANCE;
                prepareInAppMessage = backgroundInAppMessagePreparer.prepareInAppMessage(this.$inAppMessageToPrepare);
                if (prepareInAppMessage == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j7, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.utils.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String invokeSuspend$lambda$0;
                            invokeSuspend$lambda$0 = BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1.invokeSuspend$lambda$0();
                            return invokeSuspend$lambda$0;
                        }
                    }, 6, (Object) null);
                } else {
                    this.L$0 = j7;
                    this.label = 1;
                    displayPreparedInAppMessage = backgroundInAppMessagePreparer.displayPreparedInAppMessage(prepareInAppMessage, this);
                    if (displayPreparedInAppMessage == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } catch (Exception e6) {
                exc = e6;
                j6 = j7;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j6, BrazeLogger.Priority.f12981E, (Throwable) exc, false, new Function0() { // from class: com.braze.ui.inappmessage.utils.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String invokeSuspend$lambda$1;
                        invokeSuspend$lambda$1 = BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1.invokeSuspend$lambda$1();
                        return invokeSuspend$lambda$1;
                    }
                }, 4, (Object) null);
                return Unit.INSTANCE;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J j8 = (J) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e7) {
                exc = e7;
                j6 = j8;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j6, BrazeLogger.Priority.f12981E, (Throwable) exc, false, new Function0() { // from class: com.braze.ui.inappmessage.utils.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String invokeSuspend$lambda$1;
                        invokeSuspend$lambda$1 = BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1.invokeSuspend$lambda$1();
                        return invokeSuspend$lambda$1;
                    }
                }, 4, (Object) null);
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
