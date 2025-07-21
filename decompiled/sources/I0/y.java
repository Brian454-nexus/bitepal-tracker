package I0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class y {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends SuspendLambda implements Function3 {

        /* renamed from: j, reason: collision with root package name */
        public int f2788j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f2789k;

        public a(Continuation continuation) {
            super(3, continuation);
        }

        public final Object a(r rVar, boolean z6, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f2789k = rVar;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((r) obj, ((Boolean) obj2).booleanValue(), (Continuation) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f2788j;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            r rVar = (r) this.f2789k;
            this.f2788j = 1;
            Object d6 = rVar.d(this);
            return d6 == coroutine_suspended ? coroutine_suspended : d6;
        }
    }

    public static final Object a(x xVar, Continuation continuation) {
        return xVar.e(new a(null), continuation);
    }
}
