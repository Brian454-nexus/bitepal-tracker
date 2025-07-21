package com.braze.images;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f12321a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f12322b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ImageView imageView, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.f12321a = imageView;
        this.f12322b = bitmap;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f12321a, this.f12322b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new e(this.f12321a, this.f12322b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f12321a.setImageBitmap(this.f12322b);
        return Unit.INSTANCE;
    }
}
