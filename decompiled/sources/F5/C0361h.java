package F5;

import android.content.Context;

/* renamed from: F5.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0361h implements z5.b {

    /* renamed from: a, reason: collision with root package name */
    public final fa.a f1691a;

    public C0361h(fa.a aVar) {
        this.f1691a = aVar;
    }

    public static C0361h a(fa.a aVar) {
        return new C0361h(aVar);
    }

    public static String c(Context context) {
        return (String) z5.d.d(AbstractC0359f.b(context));
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f1691a.get());
    }
}
