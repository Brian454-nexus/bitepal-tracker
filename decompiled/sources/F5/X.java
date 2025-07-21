package F5;

import android.content.Context;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class X implements z5.b {

    /* renamed from: a, reason: collision with root package name */
    public final fa.a f1673a;

    /* renamed from: b, reason: collision with root package name */
    public final fa.a f1674b;

    /* renamed from: c, reason: collision with root package name */
    public final fa.a f1675c;

    public X(fa.a aVar, fa.a aVar2, fa.a aVar3) {
        this.f1673a = aVar;
        this.f1674b = aVar2;
        this.f1675c = aVar3;
    }

    public static X a(fa.a aVar, fa.a aVar2, fa.a aVar3) {
        return new X(aVar, aVar2, aVar3);
    }

    public static W c(Context context, String str, int i6) {
        return new W(context, str, i6);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public W get() {
        return c((Context) this.f1673a.get(), (String) this.f1674b.get(), ((Integer) this.f1675c.get()).intValue());
    }
}
