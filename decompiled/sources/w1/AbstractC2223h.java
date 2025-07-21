package w1;

import android.os.Handler;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import e1.InterfaceC1266x;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import l1.t;
import w1.InterfaceC2212D;
import w1.K;

/* renamed from: w1.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2223h extends AbstractC2216a {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f20043h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public Handler f20044i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC1266x f20045j;

    /* renamed from: w1.h$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class a implements K, l1.t {

        /* renamed from: a, reason: collision with root package name */
        public final Object f20046a;

        /* renamed from: b, reason: collision with root package name */
        public K.a f20047b;

        /* renamed from: c, reason: collision with root package name */
        public t.a f20048c;

        public a(Object obj) {
            this.f20047b = AbstractC2223h.this.x(null);
            this.f20048c = AbstractC2223h.this.v(null);
            this.f20046a = obj;
        }

        @Override // l1.t
        public void F(int i6, InterfaceC2212D.b bVar, int i7) {
            if (a(i6, bVar)) {
                this.f20048c.k(i7);
            }
        }

        @Override // l1.t
        public void H(int i6, InterfaceC2212D.b bVar, Exception exc) {
            if (a(i6, bVar)) {
                this.f20048c.l(exc);
            }
        }

        @Override // w1.K
        public void N(int i6, InterfaceC2212D.b bVar, C2239y c2239y, C2210B c2210b, IOException iOException, boolean z6) {
            if (a(i6, bVar)) {
                this.f20047b.r(c2239y, c(c2210b, bVar), iOException, z6);
            }
        }

        @Override // l1.t
        public void P(int i6, InterfaceC2212D.b bVar) {
            if (a(i6, bVar)) {
                this.f20048c.h();
            }
        }

        @Override // w1.K
        public void R(int i6, InterfaceC2212D.b bVar, C2239y c2239y, C2210B c2210b) {
            if (a(i6, bVar)) {
                this.f20047b.u(c2239y, c(c2210b, bVar));
            }
        }

        @Override // w1.K
        public void U(int i6, InterfaceC2212D.b bVar, C2210B c2210b) {
            if (a(i6, bVar)) {
                this.f20047b.x(c(c2210b, bVar));
            }
        }

        @Override // w1.K
        public void V(int i6, InterfaceC2212D.b bVar, C2210B c2210b) {
            if (a(i6, bVar)) {
                this.f20047b.i(c(c2210b, bVar));
            }
        }

        @Override // w1.K
        public void W(int i6, InterfaceC2212D.b bVar, C2239y c2239y, C2210B c2210b) {
            if (a(i6, bVar)) {
                this.f20047b.o(c2239y, c(c2210b, bVar));
            }
        }

        @Override // l1.t
        public void Z(int i6, InterfaceC2212D.b bVar) {
            if (a(i6, bVar)) {
                this.f20048c.j();
            }
        }

        public final boolean a(int i6, InterfaceC2212D.b bVar) {
            InterfaceC2212D.b bVar2;
            if (bVar != null) {
                bVar2 = AbstractC2223h.this.G(this.f20046a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int I6 = AbstractC2223h.this.I(this.f20046a, i6);
            K.a aVar = this.f20047b;
            if (aVar.f19783a != I6 || !AbstractC1117K.c(aVar.f19784b, bVar2)) {
                this.f20047b = AbstractC2223h.this.w(I6, bVar2);
            }
            t.a aVar2 = this.f20048c;
            if (aVar2.f17025a == I6 && AbstractC1117K.c(aVar2.f17026b, bVar2)) {
                return true;
            }
            this.f20048c = AbstractC2223h.this.t(I6, bVar2);
            return true;
        }

        public final C2210B c(C2210B c2210b, InterfaceC2212D.b bVar) {
            long H6 = AbstractC2223h.this.H(this.f20046a, c2210b.f19750f, bVar);
            long H7 = AbstractC2223h.this.H(this.f20046a, c2210b.f19751g, bVar);
            return (H6 == c2210b.f19750f && H7 == c2210b.f19751g) ? c2210b : new C2210B(c2210b.f19745a, c2210b.f19746b, c2210b.f19747c, c2210b.f19748d, c2210b.f19749e, H6, H7);
        }

        @Override // w1.K
        public void e0(int i6, InterfaceC2212D.b bVar, C2239y c2239y, C2210B c2210b) {
            if (a(i6, bVar)) {
                this.f20047b.l(c2239y, c(c2210b, bVar));
            }
        }

        @Override // l1.t
        public void g0(int i6, InterfaceC2212D.b bVar) {
            if (a(i6, bVar)) {
                this.f20048c.m();
            }
        }

        @Override // l1.t
        public void o0(int i6, InterfaceC2212D.b bVar) {
            if (a(i6, bVar)) {
                this.f20048c.i();
            }
        }
    }

    /* renamed from: w1.h$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC2212D f20050a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC2212D.c f20051b;

        /* renamed from: c, reason: collision with root package name */
        public final a f20052c;

        public b(InterfaceC2212D interfaceC2212D, InterfaceC2212D.c cVar, a aVar) {
            this.f20050a = interfaceC2212D;
            this.f20051b = cVar;
            this.f20052c = aVar;
        }
    }

    @Override // w1.AbstractC2216a
    public void C(InterfaceC1266x interfaceC1266x) {
        this.f20045j = interfaceC1266x;
        this.f20044i = AbstractC1117K.A();
    }

    @Override // w1.AbstractC2216a
    public void E() {
        for (b bVar : this.f20043h.values()) {
            bVar.f20050a.i(bVar.f20051b);
            bVar.f20050a.f(bVar.f20052c);
            bVar.f20050a.n(bVar.f20052c);
        }
        this.f20043h.clear();
    }

    public abstract InterfaceC2212D.b G(Object obj, InterfaceC2212D.b bVar);

    public long H(Object obj, long j6, InterfaceC2212D.b bVar) {
        return j6;
    }

    public int I(Object obj, int i6) {
        return i6;
    }

    public abstract void J(Object obj, InterfaceC2212D interfaceC2212D, Z0.G g6);

    public final void K(final Object obj, InterfaceC2212D interfaceC2212D) {
        AbstractC1119a.a(!this.f20043h.containsKey(obj));
        InterfaceC2212D.c cVar = new InterfaceC2212D.c() { // from class: w1.g
            @Override // w1.InterfaceC2212D.c
            public final void a(InterfaceC2212D interfaceC2212D2, Z0.G g6) {
                AbstractC2223h.this.J(obj, interfaceC2212D2, g6);
            }
        };
        a aVar = new a(obj);
        this.f20043h.put(obj, new b(interfaceC2212D, cVar, aVar));
        interfaceC2212D.c((Handler) AbstractC1119a.e(this.f20044i), aVar);
        interfaceC2212D.p((Handler) AbstractC1119a.e(this.f20044i), aVar);
        interfaceC2212D.a(cVar, this.f20045j, A());
        if (B()) {
            return;
        }
        interfaceC2212D.b(cVar);
    }

    @Override // w1.InterfaceC2212D
    public void l() {
        Iterator it = this.f20043h.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).f20050a.l();
        }
    }

    @Override // w1.AbstractC2216a
    public void y() {
        for (b bVar : this.f20043h.values()) {
            bVar.f20050a.b(bVar.f20051b);
        }
    }

    @Override // w1.AbstractC2216a
    public void z() {
        for (b bVar : this.f20043h.values()) {
            bVar.f20050a.h(bVar.f20051b);
        }
    }
}
