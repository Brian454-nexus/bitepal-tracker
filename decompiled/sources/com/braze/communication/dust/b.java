package com.braze.communication.dust;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public h f12085a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12086b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f12087c;

    /* renamed from: d, reason: collision with root package name */
    public int f12088d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f12087c = hVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f12086b = obj;
        this.f12088d |= IntCompanionObject.MIN_VALUE;
        return this.f12087c.a(this);
    }
}
