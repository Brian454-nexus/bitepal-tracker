package g1;

import Z0.G;
import android.util.Pair;
import c1.AbstractC1119a;

/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1320a extends Z0.G {

    /* renamed from: e, reason: collision with root package name */
    public final int f14509e;

    /* renamed from: f, reason: collision with root package name */
    public final w1.d0 f14510f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14511g;

    public AbstractC1320a(boolean z6, w1.d0 d0Var) {
        this.f14511g = z6;
        this.f14510f = d0Var;
        this.f14509e = d0Var.a();
    }

    public static Object v(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object w(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public abstract int A(int i6);

    public final int B(int i6, boolean z6) {
        if (z6) {
            return this.f14510f.e(i6);
        }
        if (i6 < this.f14509e - 1) {
            return i6 + 1;
        }
        return -1;
    }

    public final int C(int i6, boolean z6) {
        if (z6) {
            return this.f14510f.d(i6);
        }
        if (i6 > 0) {
            return i6 - 1;
        }
        return -1;
    }

    public abstract Z0.G D(int i6);

    @Override // Z0.G
    public int a(boolean z6) {
        if (this.f14509e == 0) {
            return -1;
        }
        if (this.f14511g) {
            z6 = false;
        }
        int c6 = z6 ? this.f14510f.c() : 0;
        while (D(c6).q()) {
            c6 = B(c6, z6);
            if (c6 == -1) {
                return -1;
            }
        }
        return A(c6) + D(c6).a(z6);
    }

    @Override // Z0.G
    public final int b(Object obj) {
        int b6;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object w6 = w(obj);
        Object v6 = v(obj);
        int s6 = s(w6);
        if (s6 == -1 || (b6 = D(s6).b(v6)) == -1) {
            return -1;
        }
        return z(s6) + b6;
    }

    @Override // Z0.G
    public int c(boolean z6) {
        int i6 = this.f14509e;
        if (i6 == 0) {
            return -1;
        }
        if (this.f14511g) {
            z6 = false;
        }
        int g6 = z6 ? this.f14510f.g() : i6 - 1;
        while (D(g6).q()) {
            g6 = C(g6, z6);
            if (g6 == -1) {
                return -1;
            }
        }
        return A(g6) + D(g6).c(z6);
    }

    @Override // Z0.G
    public int e(int i6, int i7, boolean z6) {
        if (this.f14511g) {
            if (i7 == 1) {
                i7 = 2;
            }
            z6 = false;
        }
        int u6 = u(i6);
        int A6 = A(u6);
        int e6 = D(u6).e(i6 - A6, i7 != 2 ? i7 : 0, z6);
        if (e6 != -1) {
            return A6 + e6;
        }
        int B6 = B(u6, z6);
        while (B6 != -1 && D(B6).q()) {
            B6 = B(B6, z6);
        }
        if (B6 != -1) {
            return A(B6) + D(B6).a(z6);
        }
        if (i7 == 2) {
            return a(z6);
        }
        return -1;
    }

    @Override // Z0.G
    public final G.b g(int i6, G.b bVar, boolean z6) {
        int t6 = t(i6);
        int A6 = A(t6);
        D(t6).g(i6 - z(t6), bVar, z6);
        bVar.f6663c += A6;
        if (z6) {
            bVar.f6662b = y(x(t6), AbstractC1119a.e(bVar.f6662b));
        }
        return bVar;
    }

    @Override // Z0.G
    public final G.b h(Object obj, G.b bVar) {
        Object w6 = w(obj);
        Object v6 = v(obj);
        int s6 = s(w6);
        int A6 = A(s6);
        D(s6).h(v6, bVar);
        bVar.f6663c += A6;
        bVar.f6662b = obj;
        return bVar;
    }

    @Override // Z0.G
    public int l(int i6, int i7, boolean z6) {
        if (this.f14511g) {
            if (i7 == 1) {
                i7 = 2;
            }
            z6 = false;
        }
        int u6 = u(i6);
        int A6 = A(u6);
        int l6 = D(u6).l(i6 - A6, i7 != 2 ? i7 : 0, z6);
        if (l6 != -1) {
            return A6 + l6;
        }
        int C6 = C(u6, z6);
        while (C6 != -1 && D(C6).q()) {
            C6 = C(C6, z6);
        }
        if (C6 != -1) {
            return A(C6) + D(C6).c(z6);
        }
        if (i7 == 2) {
            return c(z6);
        }
        return -1;
    }

    @Override // Z0.G
    public final Object m(int i6) {
        int t6 = t(i6);
        return y(x(t6), D(t6).m(i6 - z(t6)));
    }

    @Override // Z0.G
    public final G.c o(int i6, G.c cVar, long j6) {
        int u6 = u(i6);
        int A6 = A(u6);
        int z6 = z(u6);
        D(u6).o(i6 - A6, cVar, j6);
        Object x6 = x(u6);
        if (!G.c.f6674q.equals(cVar.f6684a)) {
            x6 = y(x6, cVar.f6684a);
        }
        cVar.f6684a = x6;
        cVar.f6697n += z6;
        cVar.f6698o += z6;
        return cVar;
    }

    public abstract int s(Object obj);

    public abstract int t(int i6);

    public abstract int u(int i6);

    public abstract Object x(int i6);

    public abstract int z(int i6);
}
