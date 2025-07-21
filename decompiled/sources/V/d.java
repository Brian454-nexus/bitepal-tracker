package V;

import F.I0;
import I.C0464y0;
import I.D;
import I.D0;
import I.E;
import I.InterfaceC0439l0;
import I.InterfaceC0441m0;
import I.InterfaceC0462x0;
import I.L0;
import I.O0;
import I.P;
import I.Y0;
import I.Z0;
import L.p;
import T.C0765u;
import T.L;
import T.U;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Log;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d extends I0 {

    /* renamed from: m, reason: collision with root package name */
    public final f f5267m;

    /* renamed from: n, reason: collision with root package name */
    public final g f5268n;

    /* renamed from: o, reason: collision with root package name */
    public U f5269o;

    /* renamed from: p, reason: collision with root package name */
    public U f5270p;

    /* renamed from: q, reason: collision with root package name */
    public L f5271q;

    /* renamed from: r, reason: collision with root package name */
    public L f5272r;

    /* renamed from: s, reason: collision with root package name */
    public L0.b f5273s;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        D6.g a(int i6, int i7);
    }

    public d(E e6, Set set, Z0 z02) {
        super(f0(set));
        this.f5267m = f0(set);
        this.f5268n = new g(e6, set, z02, new a() { // from class: V.c
            @Override // V.d.a
            public final D6.g a(int i6, int i7) {
                return d.Z(d.this, i6, i7);
            }
        });
    }

    public static /* synthetic */ void Y(d dVar, String str, Y0 y02, O0 o02, L0 l02, L0.f fVar) {
        dVar.b0();
        if (dVar.y(str)) {
            dVar.V(dVar.c0(str, y02, o02));
            dVar.E();
            dVar.f5268n.F();
        }
    }

    public static /* synthetic */ D6.g Z(d dVar, int i6, int i7) {
        U u6 = dVar.f5270p;
        return u6 != null ? u6.e().b(i6, i7) : N.f.f(new Exception("Failed to take picture: pipeline is not ready."));
    }

    private void b0() {
        L l6 = this.f5271q;
        if (l6 != null) {
            l6.i();
            this.f5271q = null;
        }
        L l7 = this.f5272r;
        if (l7 != null) {
            l7.i();
            this.f5272r = null;
        }
        U u6 = this.f5270p;
        if (u6 != null) {
            u6.f();
            this.f5270p = null;
        }
        U u7 = this.f5269o;
        if (u7 != null) {
            u7.f();
            this.f5269o = null;
        }
    }

    private Rect e0(Size size) {
        return x() != null ? x() : new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    public static f f0(Set set) {
        InterfaceC0462x0 b6 = new e().b();
        b6.H(InterfaceC0439l0.f2494f, 34);
        b6.H(Y0.f2391A, Z0.b.STREAM_SHARING);
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            I0 i02 = (I0) it.next();
            if (i02.j().h(Y0.f2391A)) {
                arrayList.add(i02.j().G());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        b6.H(f.f5275H, arrayList);
        b6.H(InterfaceC0441m0.f2506k, 2);
        return new f(D0.Z(b6));
    }

    @Override // F.I0
    public void H() {
        super.H();
        this.f5268n.p();
    }

    @Override // F.I0
    public Y0 J(D d6, Y0.a aVar) {
        this.f5268n.C(aVar.b());
        return aVar.c();
    }

    @Override // F.I0
    public void K() {
        super.K();
        this.f5268n.D();
    }

    @Override // F.I0
    public void L() {
        super.L();
        this.f5268n.E();
    }

    @Override // F.I0
    public O0 M(P p6) {
        this.f5273s.g(p6);
        V(this.f5273s.o());
        return e().f().d(p6).a();
    }

    @Override // F.I0
    public O0 N(O0 o02) {
        V(c0(i(), j(), o02));
        C();
        return o02;
    }

    @Override // F.I0
    public void O() {
        super.O();
        b0();
        this.f5268n.I();
    }

    public final void a0(L0.b bVar, final String str, final Y0 y02, final O0 o02) {
        bVar.f(new L0.c() { // from class: V.b
            @Override // I.L0.c
            public final void a(L0 l02, L0.f fVar) {
                d.Y(d.this, str, y02, o02, l02, fVar);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final L0 c0(String str, Y0 y02, O0 o02) {
        p.a();
        E e6 = (E) y0.g.f(g());
        Matrix s6 = s();
        boolean m6 = e6.m();
        Rect e02 = e0(o02.e());
        Objects.requireNonNull(e02);
        L l6 = new L(3, 34, o02, s6, m6, e02, p(e6), -1, A(e6));
        this.f5271q = l6;
        this.f5272r = g0(l6, e6);
        this.f5270p = new U(e6, C0765u.a.a(o02.b()));
        Map x6 = this.f5268n.x(this.f5272r);
        U.c j6 = this.f5270p.j(U.b.c(this.f5272r, new ArrayList(x6.values())));
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : x6.entrySet()) {
            hashMap.put((I0) entry.getKey(), (L) j6.get(entry.getValue()));
        }
        this.f5268n.H(hashMap);
        L0.b q6 = L0.b.q(y02, o02.e());
        q6.l(this.f5271q.o());
        q6.j(this.f5268n.z());
        if (o02.d() != null) {
            q6.g(o02.d());
        }
        a0(q6, str, y02, o02);
        this.f5273s = q6;
        return q6.o();
    }

    public Set d0() {
        return this.f5268n.w();
    }

    public final L g0(L l6, E e6) {
        l();
        return l6;
    }

    @Override // F.I0
    public Y0 k(boolean z6, Z0 z02) {
        P a6 = z02.a(this.f5267m.G(), 1);
        if (z6) {
            a6 = P.Q(a6, this.f5267m.o());
        }
        if (a6 == null) {
            return null;
        }
        return w(a6).c();
    }

    @Override // F.I0
    public Set u() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // F.I0
    public Y0.a w(P p6) {
        return new e(C0464y0.b0(p6));
    }
}
