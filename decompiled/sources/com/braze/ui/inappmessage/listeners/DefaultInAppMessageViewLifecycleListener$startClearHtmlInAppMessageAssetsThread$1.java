package com.braze.ui.inappmessage.listeners;

import android.app.Activity;
import com.braze.support.BrazeFileUtils;
import com.braze.support.WebContentUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import ga.J;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lga/J;", "", "<anonymous>", "(Lga/J;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1", f = "DefaultInAppMessageViewLifecycleListener.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1 extends SuspendLambda implements Function2<J, Continuation<? super Unit>, Object> {
    int label;

    public DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1(Continuation<? super DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(J j6, Continuation<? super Unit> continuation) {
        return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Activity mActivity = BrazeInAppMessageManager.INSTANCE.getInstance().getMActivity();
        if (mActivity != null) {
            BrazeFileUtils.deleteFileOrDirectory(WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(mActivity));
        }
        return Unit.INSTANCE;
    }
}
