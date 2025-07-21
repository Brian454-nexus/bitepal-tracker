package x5;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import x5.i;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class u implements t {

    /* renamed from: e, reason: collision with root package name */
    public static volatile v f20652e;

    /* renamed from: a, reason: collision with root package name */
    public final H5.a f20653a;

    /* renamed from: b, reason: collision with root package name */
    public final H5.a f20654b;

    /* renamed from: c, reason: collision with root package name */
    public final D5.e f20655c;

    /* renamed from: d, reason: collision with root package name */
    public final E5.r f20656d;

    public u(H5.a aVar, H5.a aVar2, D5.e eVar, E5.r rVar, E5.v vVar) {
        this.f20653a = aVar;
        this.f20654b = aVar2;
        this.f20655c = eVar;
        this.f20656d = rVar;
        vVar.c();
    }

    public static u c() {
        v vVar = f20652e;
        if (vVar != null) {
            return vVar.c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static Set d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(u5.c.b("proto"));
    }

    public static void f(Context context) {
        if (f20652e == null) {
            synchronized (u.class) {
                try {
                    if (f20652e == null) {
                        f20652e = e.a().a(context).build();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // x5.t
    public void a(o oVar, u5.k kVar) {
        this.f20655c.a(oVar.f().f(oVar.c().d()), b(oVar), kVar);
    }

    public final i b(o oVar) {
        i.a g6 = i.a().i(this.f20653a.a()).o(this.f20654b.a()).n(oVar.g()).h(new h(oVar.b(), oVar.d())).g(oVar.c().a());
        if (oVar.c().e() != null && oVar.c().e().a() != null) {
            g6.l(oVar.c().e().a());
        }
        oVar.c().b();
        return g6.d();
    }

    public E5.r e() {
        return this.f20656d;
    }

    public u5.j g(f fVar) {
        return new q(d(fVar), p.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
