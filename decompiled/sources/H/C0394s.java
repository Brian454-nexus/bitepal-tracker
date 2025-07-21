package H;

import F.AbstractC0342n;
import F.Y;
import H.C0392p;
import I.C0437k0;
import I.L0;
import I.N;
import android.util.Size;
import androidx.camera.core.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: H.s, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0394s {

    /* renamed from: g, reason: collision with root package name */
    public static final R.b f2023g = new R.b();

    /* renamed from: a, reason: collision with root package name */
    public final C0437k0 f2024a;

    /* renamed from: b, reason: collision with root package name */
    public final I.N f2025b;

    /* renamed from: c, reason: collision with root package name */
    public final C0392p f2026c;

    /* renamed from: d, reason: collision with root package name */
    public final N f2027d;

    /* renamed from: e, reason: collision with root package name */
    public final F f2028e;

    /* renamed from: f, reason: collision with root package name */
    public final C0392p.b f2029f;

    public C0394s(C0437k0 c0437k0, Size size, AbstractC0342n abstractC0342n, boolean z6) {
        L.p.a();
        this.f2024a = c0437k0;
        this.f2025b = N.a.j(c0437k0).h();
        C0392p c0392p = new C0392p();
        this.f2026c = c0392p;
        N n6 = new N();
        this.f2027d = n6;
        Executor c02 = c0437k0.c0(M.c.d());
        Objects.requireNonNull(c02);
        F f6 = new F(c02, null);
        this.f2028e = f6;
        int q6 = c0437k0.q();
        int i6 = i();
        c0437k0.b0();
        C0392p.b j6 = C0392p.b.j(size, q6, i6, z6, null);
        this.f2029f = j6;
        f6.l(n6.f(c0392p.l(j6)));
    }

    public void a() {
        L.p.a();
        this.f2026c.h();
        this.f2027d.d();
        this.f2028e.j();
    }

    public final C0387k b(I.M m6, X x6, O o6) {
        ArrayList arrayList = new ArrayList();
        String valueOf = String.valueOf(m6.hashCode());
        List<I.O> a6 = m6.a();
        Objects.requireNonNull(a6);
        for (I.O o7 : a6) {
            N.a aVar = new N.a();
            aVar.s(this.f2025b.i());
            aVar.e(this.f2025b.f());
            aVar.a(x6.n());
            aVar.f(this.f2029f.h());
            if (this.f2029f.d() == 256) {
                if (f2023g.a()) {
                    aVar.d(I.N.f2293i, Integer.valueOf(x6.l()));
                }
                aVar.d(I.N.f2294j, Integer.valueOf(g(x6)));
            }
            aVar.e(o7.a().f());
            aVar.g(valueOf, Integer.valueOf(o7.getId()));
            aVar.c(this.f2029f.a());
            arrayList.add(aVar.h());
        }
        return new C0387k(arrayList, o6);
    }

    public final I.M c() {
        I.M X5 = this.f2024a.X(F.A.b());
        Objects.requireNonNull(X5);
        return X5;
    }

    public final G d(I.M m6, X x6, O o6, D6.g gVar) {
        return new G(m6, x6.k(), x6.g(), x6.l(), x6.i(), x6.m(), o6, gVar);
    }

    public y0.c e(X x6, O o6, D6.g gVar) {
        L.p.a();
        I.M c6 = c();
        return new y0.c(b(c6, x6, o6), d(c6, x6, o6, gVar));
    }

    public L0.b f(Size size) {
        L0.b q6 = L0.b.q(this.f2024a, size);
        q6.h(this.f2029f.h());
        return q6;
    }

    public int g(X x6) {
        return ((x6.j() != null) && L.q.e(x6.g(), this.f2029f.g())) ? x6.f() == 0 ? 100 : 95 : x6.i();
    }

    public int h() {
        L.p.a();
        return this.f2026c.d();
    }

    public final int i() {
        Integer num = (Integer) this.f2024a.e(C0437k0.f2484K, null);
        if (num != null) {
            return num.intValue();
        }
        return 256;
    }

    public void j(Y y6) {
        L.p.a();
        this.f2029f.b().accept(y6);
    }

    public void k(b.a aVar) {
        L.p.a();
        this.f2026c.k(aVar);
    }

    public void l(G g6) {
        L.p.a();
        this.f2029f.f().accept(g6);
    }
}
