package com.braze.ui.inappmessage.jsinterface;

import com.braze.support.BrazeLogger;
import com.braze.support.PermissionUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1;
import ga.J;
import ga.U;
import ga.V0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1", f = "InAppMessageJavascriptInterface.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class InAppMessageJavascriptInterface$requestPushPermission$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InAppMessageJavascriptInterface this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lga/J;", "", "<anonymous>", "(Lga/J;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1$1", f = "InAppMessageJavascriptInterface.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1$1, reason: invalid class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<J, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$0() {
            return "Waiting for IAM to be fully closed before requesting push prompt";
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation<? super Unit> continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.label;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.L$0, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.jsinterface.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String invokeSuspend$lambda$0;
                        invokeSuspend$lambda$0 = InAppMessageJavascriptInterface$requestPushPermission$1.AnonymousClass1.invokeSuspend$lambda$0();
                        return invokeSuspend$lambda$0;
                    }
                }, 6, (Object) null);
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            while (BrazeInAppMessageManager.INSTANCE.getInstance().isCurrentlyDisplayingInAppMessage()) {
                this.label = 1;
                if (U.a(25L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageJavascriptInterface$requestPushPermission$1(InAppMessageJavascriptInterface inAppMessageJavascriptInterface, Continuation<? super InAppMessageJavascriptInterface$requestPushPermission$1> continuation) {
        super(1, continuation);
        this.this$0 = inAppMessageJavascriptInterface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$0() {
        return "Requesting push prompt from Braze bridge html interface";
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new InAppMessageJavascriptInterface$requestPushPermission$1(this.this$0, continuation);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.label;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.this$0.getWasCloseMessageCalled()) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                if (V0.c(2500L, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.this$0, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.jsinterface.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String invokeSuspend$lambda$0;
                invokeSuspend$lambda$0 = InAppMessageJavascriptInterface$requestPushPermission$1.invokeSuspend$lambda$0();
                return invokeSuspend$lambda$0;
            }
        }, 6, (Object) null);
        PermissionUtils.requestPushPermissionPrompt(BrazeInAppMessageManager.INSTANCE.getInstance().getMActivity());
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }
}
