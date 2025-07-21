package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class T implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final O f8697a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f8698b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8699c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1039p f8700d;

    public T(l0 l0Var, AbstractC1039p abstractC1039p, O o6) {
        this.f8698b = l0Var;
        this.f8699c = abstractC1039p.e(o6);
        this.f8700d = abstractC1039p;
        this.f8697a = o6;
    }

    private int j(l0 l0Var, Object obj) {
        return l0Var.i(l0Var.g(obj));
    }

    private void k(l0 l0Var, AbstractC1039p abstractC1039p, Object obj, d0 d0Var, C1038o c1038o) {
        l0 l0Var2;
        Object f6 = l0Var.f(obj);
        C1041s d6 = abstractC1039p.d(obj);
        while (d0Var.w() != Integer.MAX_VALUE) {
            try {
                l0Var2 = l0Var;
                AbstractC1039p abstractC1039p2 = abstractC1039p;
                d0 d0Var2 = d0Var;
                C1038o c1038o2 = c1038o;
                try {
                    if (!m(d0Var2, c1038o2, abstractC1039p2, d6, l0Var2, f6)) {
                        l0Var2.o(obj, f6);
                        return;
                    }
                    d0Var = d0Var2;
                    c1038o = c1038o2;
                    abstractC1039p = abstractC1039p2;
                    l0Var = l0Var2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    l0Var2.o(obj, f6);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                l0Var2 = l0Var;
            }
        }
        l0Var.o(obj, f6);
    }

    public static T l(l0 l0Var, AbstractC1039p abstractC1039p, O o6) {
        return new T(l0Var, abstractC1039p, o6);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void a(Object obj, Object obj2) {
        g0.F(this.f8698b, obj, obj2);
        if (this.f8699c) {
            g0.D(this.f8700d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void b(Object obj) {
        this.f8698b.j(obj);
        this.f8700d.f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final boolean c(Object obj) {
        return this.f8700d.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean d(Object obj, Object obj2) {
        if (!this.f8698b.g(obj).equals(this.f8698b.g(obj2))) {
            return false;
        }
        if (this.f8699c) {
            return this.f8700d.c(obj).equals(this.f8700d.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int e(Object obj) {
        int j6 = j(this.f8698b, obj);
        return this.f8699c ? j6 + this.f8700d.c(obj).f() : j6;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public Object f() {
        O o6 = this.f8697a;
        return o6 instanceof AbstractC1045w ? ((AbstractC1045w) o6).F() : o6.newBuilderForType().c();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int g(Object obj) {
        int hashCode = this.f8698b.g(obj).hashCode();
        return this.f8699c ? (hashCode * 53) + this.f8700d.c(obj).hashCode() : hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void h(Object obj, d0 d0Var, C1038o c1038o) {
        k(this.f8698b, this.f8700d, obj, d0Var, c1038o);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void i(Object obj, s0 s0Var) {
        Iterator n6 = this.f8700d.c(obj).n();
        if (n6.hasNext()) {
            android.support.v4.media.session.b.a(((Map.Entry) n6.next()).getKey());
            throw null;
        }
        n(this.f8698b, obj, s0Var);
    }

    public final boolean m(d0 d0Var, C1038o c1038o, AbstractC1039p abstractC1039p, C1041s c1041s, l0 l0Var, Object obj) {
        int a6 = d0Var.a();
        if (a6 != r0.f8843a) {
            if (r0.b(a6) != 2) {
                return d0Var.C();
            }
            Object b6 = abstractC1039p.b(c1038o, this.f8697a, r0.a(a6));
            if (b6 == null) {
                return l0Var.m(obj, d0Var);
            }
            abstractC1039p.h(d0Var, b6, c1038o, c1041s);
            return true;
        }
        Object obj2 = null;
        int i6 = 0;
        AbstractC1030g abstractC1030g = null;
        while (d0Var.w() != Integer.MAX_VALUE) {
            int a7 = d0Var.a();
            if (a7 == r0.f8845c) {
                i6 = d0Var.l();
                obj2 = abstractC1039p.b(c1038o, this.f8697a, i6);
            } else if (a7 == r0.f8846d) {
                if (obj2 != null) {
                    abstractC1039p.h(d0Var, obj2, c1038o, c1041s);
                } else {
                    abstractC1030g = d0Var.z();
                }
            } else if (!d0Var.C()) {
                break;
            }
        }
        if (d0Var.a() != r0.f8844b) {
            throw C1048z.b();
        }
        if (abstractC1030g != null) {
            if (obj2 != null) {
                abstractC1039p.i(abstractC1030g, obj2, c1038o, c1041s);
            } else {
                l0Var.d(obj, i6, abstractC1030g);
            }
        }
        return true;
    }

    public final void n(l0 l0Var, Object obj, s0 s0Var) {
        l0Var.s(l0Var.g(obj), s0Var);
    }
}
