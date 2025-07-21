package D5;

import E5.x;
import F5.InterfaceC0357d;
import android.content.Context;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i implements z5.b {

    /* renamed from: a, reason: collision with root package name */
    public final fa.a f846a;

    /* renamed from: b, reason: collision with root package name */
    public final fa.a f847b;

    /* renamed from: c, reason: collision with root package name */
    public final fa.a f848c;

    /* renamed from: d, reason: collision with root package name */
    public final fa.a f849d;

    public i(fa.a aVar, fa.a aVar2, fa.a aVar3, fa.a aVar4) {
        this.f846a = aVar;
        this.f847b = aVar2;
        this.f848c = aVar3;
        this.f849d = aVar4;
    }

    public static i a(fa.a aVar, fa.a aVar2, fa.a aVar3, fa.a aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, InterfaceC0357d interfaceC0357d, E5.f fVar, H5.a aVar) {
        return (x) z5.d.d(h.a(context, interfaceC0357d, fVar, aVar));
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((Context) this.f846a.get(), (InterfaceC0357d) this.f847b.get(), (E5.f) this.f848c.get(), (H5.a) this.f849d.get());
    }
}
