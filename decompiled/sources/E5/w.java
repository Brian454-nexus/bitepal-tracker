package E5;

import F5.InterfaceC0357d;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class w implements z5.b {

    /* renamed from: a, reason: collision with root package name */
    public final fa.a f1222a;

    /* renamed from: b, reason: collision with root package name */
    public final fa.a f1223b;

    /* renamed from: c, reason: collision with root package name */
    public final fa.a f1224c;

    /* renamed from: d, reason: collision with root package name */
    public final fa.a f1225d;

    public w(fa.a aVar, fa.a aVar2, fa.a aVar3, fa.a aVar4) {
        this.f1222a = aVar;
        this.f1223b = aVar2;
        this.f1224c = aVar3;
        this.f1225d = aVar4;
    }

    public static w a(fa.a aVar, fa.a aVar2, fa.a aVar3, fa.a aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, InterfaceC0357d interfaceC0357d, x xVar, G5.b bVar) {
        return new v(executor, interfaceC0357d, xVar, bVar);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Executor) this.f1222a.get(), (InterfaceC0357d) this.f1223b.get(), (x) this.f1224c.get(), (G5.b) this.f1225d.get());
    }
}
