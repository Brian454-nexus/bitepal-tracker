package L;

import U.c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class o {
    public static U.c a(U.c cVar, U.c cVar2) {
        if (cVar2 == null) {
            return cVar;
        }
        if (cVar == null) {
            return cVar2;
        }
        c.a b6 = c.a.b(cVar);
        if (cVar2.b() != null) {
            b6.d(cVar2.b());
        }
        if (cVar2.d() != null) {
            b6.f(cVar2.d());
        }
        if (cVar2.c() != null) {
            b6.e(cVar2.c());
        }
        if (cVar2.a() != 0) {
            b6.c(cVar2.a());
        }
        return b6.a();
    }
}
