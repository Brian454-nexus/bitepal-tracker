package y5;

import android.content.Context;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j implements z5.b {

    /* renamed from: a, reason: collision with root package name */
    public final fa.a f21269a;

    /* renamed from: b, reason: collision with root package name */
    public final fa.a f21270b;

    /* renamed from: c, reason: collision with root package name */
    public final fa.a f21271c;

    public j(fa.a aVar, fa.a aVar2, fa.a aVar3) {
        this.f21269a = aVar;
        this.f21270b = aVar2;
        this.f21271c = aVar3;
    }

    public static j a(fa.a aVar, fa.a aVar2, fa.a aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, H5.a aVar, H5.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.f21269a.get(), (H5.a) this.f21270b.get(), (H5.a) this.f21271c.get());
    }
}
