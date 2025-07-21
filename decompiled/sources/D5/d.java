package D5;

import E5.x;
import F5.InterfaceC0357d;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d implements z5.b {

    /* renamed from: a, reason: collision with root package name */
    public final fa.a f840a;

    /* renamed from: b, reason: collision with root package name */
    public final fa.a f841b;

    /* renamed from: c, reason: collision with root package name */
    public final fa.a f842c;

    /* renamed from: d, reason: collision with root package name */
    public final fa.a f843d;

    /* renamed from: e, reason: collision with root package name */
    public final fa.a f844e;

    public d(fa.a aVar, fa.a aVar2, fa.a aVar3, fa.a aVar4, fa.a aVar5) {
        this.f840a = aVar;
        this.f841b = aVar2;
        this.f842c = aVar3;
        this.f843d = aVar4;
        this.f844e = aVar5;
    }

    public static d a(fa.a aVar, fa.a aVar2, fa.a aVar3, fa.a aVar4, fa.a aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, y5.e eVar, x xVar, InterfaceC0357d interfaceC0357d, G5.b bVar) {
        return new c(executor, eVar, xVar, interfaceC0357d, bVar);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((Executor) this.f840a.get(), (y5.e) this.f841b.get(), (x) this.f842c.get(), (InterfaceC0357d) this.f843d.get(), (G5.b) this.f844e.get());
    }
}
