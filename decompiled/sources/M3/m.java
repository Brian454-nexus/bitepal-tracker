package M3;

import B9.a;
import G9.j;
import android.app.Activity;
import android.content.Context;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class m implements B9.a, C9.a {

    /* renamed from: a, reason: collision with root package name */
    public p f3419a;

    /* renamed from: b, reason: collision with root package name */
    public G9.j f3420b;

    /* renamed from: c, reason: collision with root package name */
    public C9.c f3421c;

    /* renamed from: d, reason: collision with root package name */
    public l f3422d;

    public final void a() {
        C9.c cVar = this.f3421c;
        if (cVar != null) {
            cVar.j(this.f3419a);
            this.f3421c.g(this.f3419a);
        }
    }

    public final void b() {
        C9.c cVar = this.f3421c;
        if (cVar != null) {
            cVar.k(this.f3419a);
            this.f3421c.i(this.f3419a);
        }
    }

    public final void c(Context context, G9.b bVar) {
        this.f3420b = new G9.j(bVar, "flutter.baseflow.com/permissions/methods");
        l lVar = new l(context, new a(), this.f3419a, new v());
        this.f3422d = lVar;
        this.f3420b.e(lVar);
    }

    public final void d(Activity activity) {
        p pVar = this.f3419a;
        if (pVar != null) {
            pVar.h(activity);
        }
    }

    public final void e() {
        this.f3420b.e((j.c) null);
        this.f3420b = null;
        this.f3422d = null;
    }

    public final void f() {
        p pVar = this.f3419a;
        if (pVar != null) {
            pVar.h(null);
        }
    }

    public void onAttachedToActivity(C9.c cVar) {
        d(cVar.f());
        this.f3421c = cVar;
        b();
    }

    public void onAttachedToEngine(a.b bVar) {
        this.f3419a = new p(bVar.a());
        c(bVar.a(), bVar.b());
    }

    public void onDetachedFromActivity() {
        f();
        a();
        this.f3421c = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
        e();
    }

    public void onReattachedToActivityForConfigChanges(C9.c cVar) {
        onAttachedToActivity(cVar);
    }
}
