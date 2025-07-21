package G3;

import B3.f;
import ga.G;
import ga.J;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l implements B3.f {

    /* renamed from: a, reason: collision with root package name */
    public final List f1892a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Object f1893b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f1894c = new ConcurrentHashMap();

    @Override // B3.f
    public List a() {
        List list;
        synchronized (this.f1893b) {
            list = CollectionsKt.toList(this.f1892a);
            this.f1892a.clear();
            Unit unit = Unit.INSTANCE;
        }
        return CollectionsKt.listOf(list);
    }

    @Override // B3.f
    public Object b(Object obj, Continuation continuation) {
        o oVar = o.f1895a;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.amplitude.core.events.BaseEvent>");
        return oVar.c((List) obj);
    }

    @Override // B3.f
    public Object c(Continuation continuation) {
        return Unit.INSTANCE;
    }

    @Override // B3.f
    public Object d(C3.a aVar, Continuation continuation) {
        synchronized (this.f1893b) {
            this.f1892a.add(aVar);
        }
        return Unit.INSTANCE;
    }

    public final void e() {
        synchronized (this.f1893b) {
            this.f1892a.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // B3.f
    public String f(f.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (String) this.f1894c.get(key.b());
    }

    @Override // B3.f
    public Object j(f.a aVar, String str, Continuation continuation) {
        this.f1894c.put(aVar.b(), str);
        return Unit.INSTANCE;
    }

    @Override // B3.f
    public H3.i k(D3.b eventPipeline, B3.b configuration, J scope, G storageDispatcher) {
        Intrinsics.checkNotNullParameter(eventPipeline, "eventPipeline");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(storageDispatcher, "storageDispatcher");
        return new k(eventPipeline, configuration, scope, storageDispatcher);
    }
}
