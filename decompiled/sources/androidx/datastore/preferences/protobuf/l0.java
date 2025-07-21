package androidx.datastore.preferences.protobuf;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class l0 {
    public abstract void a(Object obj, int i6, int i7);

    public abstract void b(Object obj, int i6, long j6);

    public abstract void c(Object obj, int i6, Object obj2);

    public abstract void d(Object obj, int i6, AbstractC1030g abstractC1030g);

    public abstract void e(Object obj, int i6, long j6);

    public abstract Object f(Object obj);

    public abstract Object g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract Object k(Object obj, Object obj2);

    public final void l(Object obj, d0 d0Var) {
        while (d0Var.w() != Integer.MAX_VALUE && m(obj, d0Var)) {
        }
    }

    public final boolean m(Object obj, d0 d0Var) {
        int a6 = d0Var.a();
        int a7 = r0.a(a6);
        int b6 = r0.b(a6);
        if (b6 == 0) {
            e(obj, a7, d0Var.G());
            return true;
        }
        if (b6 == 1) {
            b(obj, a7, d0Var.d());
            return true;
        }
        if (b6 == 2) {
            d(obj, a7, d0Var.z());
            return true;
        }
        if (b6 != 3) {
            if (b6 == 4) {
                return false;
            }
            if (b6 != 5) {
                throw C1048z.e();
            }
            a(obj, a7, d0Var.h());
            return true;
        }
        Object n6 = n();
        int c6 = r0.c(a7, 4);
        l(n6, d0Var);
        if (c6 != d0Var.a()) {
            throw C1048z.b();
        }
        c(obj, a7, r(n6));
        return true;
    }

    public abstract Object n();

    public abstract void o(Object obj, Object obj2);

    public abstract void p(Object obj, Object obj2);

    public abstract boolean q(d0 d0Var);

    public abstract Object r(Object obj);

    public abstract void s(Object obj, s0 s0Var);

    public abstract void t(Object obj, s0 s0Var);
}
