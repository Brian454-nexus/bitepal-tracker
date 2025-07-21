package J0;

import I0.c;
import I0.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f2845a;

    public b(Function1 produceNewData) {
        Intrinsics.checkNotNullParameter(produceNewData, "produceNewData");
        this.f2845a = produceNewData;
    }

    @Override // I0.d
    public Object a(c cVar, Continuation continuation) {
        return this.f2845a.invoke(cVar);
    }
}
