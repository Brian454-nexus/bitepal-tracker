package y5;

import android.content.Context;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l implements z5.b {

    /* renamed from: a, reason: collision with root package name */
    public final fa.a f21277a;

    /* renamed from: b, reason: collision with root package name */
    public final fa.a f21278b;

    public l(fa.a aVar, fa.a aVar2) {
        this.f21277a = aVar;
        this.f21278b = aVar2;
    }

    public static l a(fa.a aVar, fa.a aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((Context) this.f21277a.get(), this.f21278b.get());
    }
}
