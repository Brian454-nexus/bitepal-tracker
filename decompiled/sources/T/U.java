package T;

import F.AbstractC0335i0;
import F.H0;
import F.w0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class U {

    /* renamed from: a, reason: collision with root package name */
    public final P f4798a;

    /* renamed from: b, reason: collision with root package name */
    public final I.E f4799b;

    /* renamed from: c, reason: collision with root package name */
    public c f4800c;

    /* renamed from: d, reason: collision with root package name */
    public b f4801d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements N.c {
        public a() {
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(w0 w0Var) {
            y0.g.f(w0Var);
            U.this.f4798a.a(w0Var);
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            AbstractC0335i0.m("SurfaceProcessorNode", "Downstream node failed to provide Surface.", th);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class b {
        public static b c(L l6, List list) {
            return new C0749d(l6, list);
        }

        public abstract List a();

        public abstract L b();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c extends HashMap {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class d {
        public static d h(int i6, int i7, Rect rect, Size size, int i8, boolean z6) {
            return new C0750e(UUID.randomUUID(), i6, i7, rect, size, i8, z6);
        }

        public static d i(L l6) {
            return h(l6.u(), l6.p(), l6.n(), L.q.d(l6.n(), l6.r()), l6.r(), l6.q());
        }

        public abstract Rect a();

        public abstract int b();

        public abstract boolean c();

        public abstract int d();

        public abstract Size e();

        public abstract int f();

        public abstract UUID g();
    }

    public U(I.E e6, P p6) {
        this.f4799b = e6;
        this.f4798a = p6;
    }

    public static /* synthetic */ void b(Map map, H0.h hVar) {
        for (Map.Entry entry : map.entrySet()) {
            int c6 = hVar.c() - ((d) entry.getKey()).d();
            if (((d) entry.getKey()).c()) {
                c6 = -c6;
            }
            ((L) entry.getValue()).z(L.q.r(c6), -1);
        }
    }

    public static /* synthetic */ void c(U u6) {
        c cVar = u6.f4800c;
        if (cVar != null) {
            Iterator it = cVar.values().iterator();
            while (it.hasNext()) {
                ((L) it.next()).i();
            }
        }
    }

    public final void d(L l6, Map.Entry entry) {
        N.f.b(((L) entry.getValue()).j(l6.t().e(), ((d) entry.getKey()).b(), ((d) entry.getKey()).a(), ((d) entry.getKey()).d(), ((d) entry.getKey()).c(), l6.v() ? this.f4799b : null), new a(), M.c.e());
    }

    public P e() {
        return this.f4798a;
    }

    public void f() {
        this.f4798a.release();
        M.c.e().execute(new Runnable() { // from class: T.S
            @Override // java.lang.Runnable
            public final void run() {
                U.c(U.this);
            }
        });
    }

    public final void g(final L l6, Map map) {
        for (final Map.Entry entry : map.entrySet()) {
            d(l6, entry);
            ((L) entry.getValue()).f(new Runnable() { // from class: T.Q
                @Override // java.lang.Runnable
                public final void run() {
                    U.this.d(l6, entry);
                }
            });
        }
    }

    public final void h(L l6, Map map) {
        H0 k6 = l6.k(this.f4799b);
        i(k6, map);
        this.f4798a.c(k6);
    }

    public void i(H0 h02, final Map map) {
        h02.r(M.c.e(), new H0.i() { // from class: T.T
            @Override // F.H0.i
            public final void a(H0.h hVar) {
                U.b(map, hVar);
            }
        });
    }

    public c j(b bVar) {
        L.p.a();
        this.f4801d = bVar;
        this.f4800c = new c();
        L b6 = bVar.b();
        for (d dVar : bVar.a()) {
            this.f4800c.put(dVar, k(b6, dVar));
        }
        h(b6, this.f4800c);
        g(b6, this.f4800c);
        return this.f4800c;
    }

    public final L k(L l6, d dVar) {
        Rect a6 = dVar.a();
        int d6 = dVar.d();
        boolean c6 = dVar.c();
        Matrix matrix = new Matrix(l6.s());
        matrix.postConcat(L.q.c(new RectF(a6), L.q.o(dVar.e()), d6, c6));
        y0.g.a(L.q.g(L.q.d(a6, d6), dVar.e()));
        return new L(dVar.f(), dVar.b(), l6.t().f().e(dVar.e()).a(), matrix, false, L.q.m(dVar.e()), l6.r() - d6, -1, l6.q() != c6);
    }
}
