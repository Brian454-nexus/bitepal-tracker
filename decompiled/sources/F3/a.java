package F3;

import ga.J;
import ga.L;
import ga.i;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends D3.a {

    /* renamed from: e, reason: collision with root package name */
    public D3.b f1618e;

    /* renamed from: f, reason: collision with root package name */
    public E3.d f1619f;

    /* renamed from: F3.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0031a extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f1620j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C3.a f1622l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0031a(C3.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f1622l = aVar;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new C0031a(this.f1622l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f1620j;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                E3.d dVar = a.this.f1619f;
                if (dVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("identifyInterceptor");
                    dVar = null;
                }
                C3.a aVar = this.f1622l;
                this.f1620j = 1;
                obj = dVar.f(aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C3.a aVar2 = (C3.a) obj;
            if (aVar2 != null) {
                a.this.k(aVar2);
            }
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f1623j;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f1623j;
            D3.b bVar = null;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                E3.d dVar = a.this.f1619f;
                if (dVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("identifyInterceptor");
                    dVar = null;
                }
                this.f1623j = 1;
                if (dVar.o(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            D3.b bVar2 = a.this.f1618e;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pipeline");
            } else {
                bVar = bVar2;
            }
            bVar.o();
            return Unit.INSTANCE;
        }
    }

    @Override // D3.a, D3.f
    public void a(B3.a amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        super.a(amplitude);
        D3.b bVar = new D3.b(amplitude, null, null, null, null, null, null, null, null, 510, null);
        this.f1618e = bVar;
        bVar.v();
        this.f1619f = new E3.d(amplitude.q(), amplitude, amplitude.s(), amplitude.m(), this);
        e(new c());
    }

    @Override // D3.c
    public C3.a b(C3.a payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        j(payload);
        return payload;
    }

    @Override // D3.c
    public void flush() {
        i.d(f().l(), f().v(), (L) null, new b(null), 2, (Object) null);
    }

    public final void j(C3.a aVar) {
        if (aVar != null) {
            if (aVar.J0()) {
                i.d(f().l(), f().v(), (L) null, new C0031a(aVar, null), 2, (Object) null);
                return;
            }
            f().s().e("Event is invalid for missing information like userId and deviceId. Dropping event: " + aVar.F0());
        }
    }

    public final void k(C3.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        D3.b bVar = this.f1618e;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pipeline");
            bVar = null;
        }
        bVar.s(event);
    }
}
