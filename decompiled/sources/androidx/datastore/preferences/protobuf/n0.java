package androidx.datastore.preferences.protobuf;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class n0 extends l0 {
    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public m0 g(Object obj) {
        return ((AbstractC1045w) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(m0 m0Var) {
        return m0Var.d();
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(m0 m0Var) {
        return m0Var.e();
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public m0 k(m0 m0Var, m0 m0Var2) {
        return m0.c().equals(m0Var2) ? m0Var : m0.c().equals(m0Var) ? m0.j(m0Var, m0Var2) : m0Var.i(m0Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public m0 n() {
        return m0.k();
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, m0 m0Var) {
        p(obj, m0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, m0 m0Var) {
        ((AbstractC1045w) obj).unknownFields = m0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public m0 r(m0 m0Var) {
        m0Var.h();
        return m0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(m0 m0Var, s0 s0Var) {
        m0Var.p(s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(m0 m0Var, s0 s0Var) {
        m0Var.r(s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void j(Object obj) {
        g(obj).h();
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public boolean q(d0 d0Var) {
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(m0 m0Var, int i6, int i7) {
        m0Var.n(r0.c(i6, 5), Integer.valueOf(i7));
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(m0 m0Var, int i6, long j6) {
        m0Var.n(r0.c(i6, 1), Long.valueOf(j6));
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(m0 m0Var, int i6, m0 m0Var2) {
        m0Var.n(r0.c(i6, 3), m0Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(m0 m0Var, int i6, AbstractC1030g abstractC1030g) {
        m0Var.n(r0.c(i6, 2), abstractC1030g);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(m0 m0Var, int i6, long j6) {
        m0Var.n(r0.c(i6, 0), Long.valueOf(j6));
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public m0 f(Object obj) {
        m0 g6 = g(obj);
        if (g6 != m0.c()) {
            return g6;
        }
        m0 k6 = m0.k();
        p(obj, k6);
        return k6;
    }
}
