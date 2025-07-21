package com.braze.communication.dust;

import ga.J;
import ia.s;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public h f12076a;

    /* renamed from: b, reason: collision with root package name */
    public J f12077b;

    /* renamed from: c, reason: collision with root package name */
    public s f12078c;

    /* renamed from: d, reason: collision with root package name */
    public Function1 f12079d;

    /* renamed from: e, reason: collision with root package name */
    public Ref.ObjectRef f12080e;

    /* renamed from: f, reason: collision with root package name */
    public Ref.ObjectRef f12081f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12082g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f12083h;

    /* renamed from: i, reason: collision with root package name */
    public int f12084i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f12083h = hVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f12082g = obj;
        this.f12084i |= IntCompanionObject.MIN_VALUE;
        return this.f12083h.a(null, null, null, this);
    }
}
