package E5;

import F5.InterfaceC0356c;
import F5.InterfaceC0357d;
import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class s implements z5.b {

    /* renamed from: a, reason: collision with root package name */
    public final fa.a f1207a;

    /* renamed from: b, reason: collision with root package name */
    public final fa.a f1208b;

    /* renamed from: c, reason: collision with root package name */
    public final fa.a f1209c;

    /* renamed from: d, reason: collision with root package name */
    public final fa.a f1210d;

    /* renamed from: e, reason: collision with root package name */
    public final fa.a f1211e;

    /* renamed from: f, reason: collision with root package name */
    public final fa.a f1212f;

    /* renamed from: g, reason: collision with root package name */
    public final fa.a f1213g;

    /* renamed from: h, reason: collision with root package name */
    public final fa.a f1214h;

    /* renamed from: i, reason: collision with root package name */
    public final fa.a f1215i;

    public s(fa.a aVar, fa.a aVar2, fa.a aVar3, fa.a aVar4, fa.a aVar5, fa.a aVar6, fa.a aVar7, fa.a aVar8, fa.a aVar9) {
        this.f1207a = aVar;
        this.f1208b = aVar2;
        this.f1209c = aVar3;
        this.f1210d = aVar4;
        this.f1211e = aVar5;
        this.f1212f = aVar6;
        this.f1213g = aVar7;
        this.f1214h = aVar8;
        this.f1215i = aVar9;
    }

    public static s a(fa.a aVar, fa.a aVar2, fa.a aVar3, fa.a aVar4, fa.a aVar5, fa.a aVar6, fa.a aVar7, fa.a aVar8, fa.a aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, y5.e eVar, InterfaceC0357d interfaceC0357d, x xVar, Executor executor, G5.b bVar, H5.a aVar, H5.a aVar2, InterfaceC0356c interfaceC0356c) {
        return new r(context, eVar, interfaceC0357d, xVar, executor, bVar, aVar, aVar2, interfaceC0356c);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f1207a.get(), (y5.e) this.f1208b.get(), (InterfaceC0357d) this.f1209c.get(), (x) this.f1210d.get(), (Executor) this.f1211e.get(), (G5.b) this.f1212f.get(), (H5.a) this.f1213g.get(), (H5.a) this.f1214h.get(), (InterfaceC0356c) this.f1215i.get());
    }
}
