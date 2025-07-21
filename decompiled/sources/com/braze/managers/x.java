package com.braze.managers;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* synthetic */ class x extends FunctionReferenceImpl implements Function1 {
    public x(y yVar) {
        super(1, yVar, y.class, "ingestDustMessages", "ingestDustMessages(Lcom/braze/models/dust/IDustMessage;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.braze.models.dust.e p02 = (com.braze.models.dust.e) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((y) this.receiver).a(p02);
        return Unit.INSTANCE;
    }
}
