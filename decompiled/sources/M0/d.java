package M0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d implements I0.h {

    /* renamed from: a, reason: collision with root package name */
    public final I0.h f3366a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f3367j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f3368k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Function2 f3369l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f3369l = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, Continuation continuation) {
            return create(fVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f3369l, continuation);
            aVar.f3368k = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f3367j;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                f fVar = (f) this.f3368k;
                Function2 function2 = this.f3369l;
                this.f3367j = 1;
                obj = function2.invoke(fVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            f fVar2 = (f) obj;
            Intrinsics.checkNotNull(fVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((c) fVar2).g();
            return fVar2;
        }
    }

    public d(I0.h delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f3366a = delegate;
    }

    @Override // I0.h
    public Object a(Function2 function2, Continuation continuation) {
        return this.f3366a.a(new a(function2, null), continuation);
    }

    @Override // I0.h
    public ja.e getData() {
        return this.f3366a.getData();
    }
}
