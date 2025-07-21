package G1;

import c1.C1144z;
import z6.g0;
import z6.w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final w f1760a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1761b;

    public f(int i6, w wVar) {
        this.f1761b = i6;
        this.f1760a = wVar;
    }

    public static a a(int i6, int i7, C1144z c1144z) {
        switch (i6) {
            case 1718776947:
                return g.d(i7, c1144z);
            case 1751742049:
                return c.b(c1144z);
            case 1752331379:
                return d.c(c1144z);
            case 1852994675:
                return h.a(c1144z);
            default:
                return null;
        }
    }

    public static f c(int i6, C1144z c1144z) {
        w.a aVar = new w.a();
        int g6 = c1144z.g();
        int i7 = -2;
        while (c1144z.a() > 8) {
            int t6 = c1144z.t();
            int f6 = c1144z.f() + c1144z.t();
            c1144z.S(f6);
            a c6 = t6 == 1414744396 ? c(c1144z.t(), c1144z) : a(t6, i7, c1144z);
            if (c6 != null) {
                if (c6.getType() == 1752331379) {
                    i7 = ((d) c6).b();
                }
                aVar.h(c6);
            }
            c1144z.T(f6);
            c1144z.S(g6);
        }
        return new f(i6, aVar.k());
    }

    public a b(Class cls) {
        g0 l6 = this.f1760a.l();
        while (l6.hasNext()) {
            a aVar = (a) l6.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // G1.a
    public int getType() {
        return this.f1761b;
    }
}
