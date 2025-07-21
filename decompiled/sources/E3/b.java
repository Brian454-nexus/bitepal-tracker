package E3;

import G3.l;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements c {

    /* renamed from: b, reason: collision with root package name */
    public final l f1125b;

    public b(l storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f1125b = storage;
    }

    @Override // E3.c
    public Object a(Continuation continuation) {
        List a6 = this.f1125b.a();
        Intrinsics.checkNotNull(a6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<com.amplitude.core.events.BaseEvent>>");
        if (a6.isEmpty() || ((List) a6.get(0)).isEmpty()) {
            return null;
        }
        List list = (List) a6.get(0);
        C3.a aVar = (C3.a) list.get(0);
        e eVar = e.f1153a;
        Map I02 = aVar.I0();
        Intrinsics.checkNotNull(I02);
        C3.c cVar = C3.c.f709b;
        Object obj = I02.get(cVar.b());
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
        Map a7 = eVar.a(TypeIntrinsics.asMutableMap(obj));
        a7.putAll(eVar.b(list.subList(1, list.size())));
        Map I03 = aVar.I0();
        Intrinsics.checkNotNull(I03);
        I03.put(cVar.b(), a7);
        return aVar;
    }

    @Override // E3.c
    public Object b(Continuation continuation) {
        this.f1125b.e();
        return Unit.INSTANCE;
    }
}
