package M0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class i {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f3373j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f3374k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Function2 f3375l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f3375l = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, Continuation continuation) {
            return create(fVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f3375l, continuation);
            aVar.f3374k = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f3373j;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c cVar = (c) this.f3374k;
                ResultKt.throwOnFailure(obj);
                return cVar;
            }
            ResultKt.throwOnFailure(obj);
            c c6 = ((f) this.f3374k).c();
            Function2 function2 = this.f3375l;
            this.f3374k = c6;
            this.f3373j = 1;
            return function2.invoke(c6, this) == coroutine_suspended ? coroutine_suspended : c6;
        }
    }

    public static final Object a(I0.h hVar, Function2 function2, Continuation continuation) {
        return hVar.a(new a(function2, null), continuation);
    }
}
