package I;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface P {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {
        public static a a(String str, Class cls) {
            return b(str, cls, null);
        }

        public static a b(String str, Class cls, Object obj) {
            return new C0422d(str, cls, obj);
        }

        public abstract String c();

        public abstract Object d();

        public abstract Class e();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        boolean a(a aVar);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum c {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    static P Q(P p6, P p7) {
        if (p6 == null && p7 == null) {
            return D0.Y();
        }
        C0464y0 b02 = p7 != null ? C0464y0.b0(p7) : C0464y0.a0();
        if (p6 != null) {
            Iterator it = p6.c().iterator();
            while (it.hasNext()) {
                r(b02, p7, p6, (a) it.next());
            }
        }
        return D0.Z(b02);
    }

    static void r(C0464y0 c0464y0, P p6, P p7, a aVar) {
        if (!Objects.equals(aVar, InterfaceC0441m0.f2511p)) {
            c0464y0.x(aVar, p7.f(aVar), p7.b(aVar));
            return;
        }
        U.c cVar = (U.c) p7.e(aVar, null);
        c0464y0.x(aVar, p7.f(aVar), L.o.a((U.c) p6.e(aVar, null), cVar));
    }

    static boolean t(c cVar, c cVar2) {
        c cVar3 = c.ALWAYS_OVERRIDE;
        if (cVar == cVar3 && cVar2 == cVar3) {
            return true;
        }
        c cVar4 = c.REQUIRED;
        return cVar == cVar4 && cVar2 == cVar4;
    }

    Set a(a aVar);

    Object b(a aVar);

    Set c();

    Object d(a aVar, c cVar);

    Object e(a aVar, Object obj);

    c f(a aVar);

    void g(String str, b bVar);

    boolean h(a aVar);
}
