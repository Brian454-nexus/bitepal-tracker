package com.braze;

import com.braze.support.BrazeLogger;
import ga.J;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class v extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f13118a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13120c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Braze f13121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f13123f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function0 f13124g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(boolean z6, Braze braze, Object obj, Function2 function2, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f13120c = z6;
        this.f13121d = braze;
        this.f13122e = obj;
        this.f13123f = function2;
        this.f13124g = function0;
    }

    public static final String a(Function0 function0) {
        return "Early returning because the Braze instance isn't fully initialized. Always use Braze.getInstance(context) to get the latest Braze instance. Please report to Braze if the issue continues. > " + ((String) function0.invoke());
    }

    public final Continuation create(Object obj, Continuation continuation) {
        v vVar = new v(this.f13120c, this.f13121d, this.f13122e, this.f13123f, this.f13124g, continuation);
        vVar.f13119b = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return create((J) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f13118a;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        J j6 = (J) this.f13119b;
        if (!this.f13120c || this.f13121d.udm != null) {
            Function2 function2 = this.f13123f;
            this.f13118a = 1;
            Object invoke = function2.invoke(j6, this);
            return invoke == coroutine_suspended ? coroutine_suspended : invoke;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f12984W;
        final Function0 function0 = this.f13124g;
        BrazeLogger.brazelog$default(brazeLogger, (Object) j6, priority, (Throwable) null, false, new Function0() { // from class: N3.n4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.v.a(Function0.this);
            }
        }, 6, (Object) null);
        return this.f13122e;
    }
}
