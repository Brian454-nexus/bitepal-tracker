package G1;

import E1.G;
import E1.I;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.J;
import E1.O;
import E1.r;
import Z0.q;
import Z0.y;
import Z0.z;
import b2.s;
import b2.u;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1144z;
import java.util.ArrayList;
import z6.g0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements InterfaceC0314p {

    /* renamed from: a, reason: collision with root package name */
    public final C1144z f1717a;

    /* renamed from: b, reason: collision with root package name */
    public final c f1718b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1719c;

    /* renamed from: d, reason: collision with root package name */
    public final s.a f1720d;

    /* renamed from: e, reason: collision with root package name */
    public int f1721e;

    /* renamed from: f, reason: collision with root package name */
    public r f1722f;

    /* renamed from: g, reason: collision with root package name */
    public G1.c f1723g;

    /* renamed from: h, reason: collision with root package name */
    public long f1724h;

    /* renamed from: i, reason: collision with root package name */
    public e[] f1725i;

    /* renamed from: j, reason: collision with root package name */
    public long f1726j;

    /* renamed from: k, reason: collision with root package name */
    public e f1727k;

    /* renamed from: l, reason: collision with root package name */
    public int f1728l;

    /* renamed from: m, reason: collision with root package name */
    public long f1729m;

    /* renamed from: n, reason: collision with root package name */
    public long f1730n;

    /* renamed from: o, reason: collision with root package name */
    public int f1731o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1732p;

    /* renamed from: G1.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0035b implements J {

        /* renamed from: a, reason: collision with root package name */
        public final long f1733a;

        public C0035b(long j6) {
            this.f1733a = j6;
        }

        @Override // E1.J
        public boolean f() {
            return true;
        }

        @Override // E1.J
        public J.a j(long j6) {
            J.a i6 = b.this.f1725i[0].i(j6);
            for (int i7 = 1; i7 < b.this.f1725i.length; i7++) {
                J.a i8 = b.this.f1725i[i7].i(j6);
                if (i8.f911a.f917b < i6.f911a.f917b) {
                    i6 = i8;
                }
            }
            return i6;
        }

        @Override // E1.J
        public long l() {
            return this.f1733a;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f1735a;

        /* renamed from: b, reason: collision with root package name */
        public int f1736b;

        /* renamed from: c, reason: collision with root package name */
        public int f1737c;

        public c() {
        }

        public void a(C1144z c1144z) {
            this.f1735a = c1144z.t();
            this.f1736b = c1144z.t();
            this.f1737c = 0;
        }

        public void b(C1144z c1144z) {
            a(c1144z);
            if (this.f1735a == 1414744396) {
                this.f1737c = c1144z.t();
                return;
            }
            throw z.a("LIST expected, found: " + this.f1735a, null);
        }
    }

    public b(int i6, s.a aVar) {
        this.f1720d = aVar;
        this.f1719c = (i6 & 1) == 0;
        this.f1717a = new C1144z(12);
        this.f1718b = new c();
        this.f1722f = new G();
        this.f1725i = new e[0];
        this.f1729m = -1L;
        this.f1730n = -1L;
        this.f1728l = -1;
        this.f1724h = -9223372036854775807L;
    }

    public static void e(InterfaceC0315q interfaceC0315q) {
        if ((interfaceC0315q.getPosition() & 1) == 1) {
            interfaceC0315q.p(1);
        }
    }

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        this.f1726j = -1L;
        this.f1727k = null;
        for (e eVar : this.f1725i) {
            eVar.o(j6);
        }
        if (j6 != 0) {
            this.f1721e = 6;
        } else if (this.f1725i.length == 0) {
            this.f1721e = 0;
        } else {
            this.f1721e = 3;
        }
    }

    @Override // E1.InterfaceC0314p
    public void c(r rVar) {
        this.f1721e = 0;
        if (this.f1719c) {
            rVar = new u(rVar, this.f1720d);
        }
        this.f1722f = rVar;
        this.f1726j = -1L;
    }

    public final e f(int i6) {
        for (e eVar : this.f1725i) {
            if (eVar.j(i6)) {
                return eVar;
            }
        }
        return null;
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, I i6) {
        if (o(interfaceC0315q, i6)) {
            return 1;
        }
        switch (this.f1721e) {
            case 0:
                if (!i(interfaceC0315q)) {
                    throw z.a("AVI Header List not found", null);
                }
                interfaceC0315q.p(12);
                this.f1721e = 1;
                return 0;
            case 1:
                interfaceC0315q.readFully(this.f1717a.e(), 0, 12);
                this.f1717a.T(0);
                this.f1718b.b(this.f1717a);
                c cVar = this.f1718b;
                if (cVar.f1737c == 1819436136) {
                    this.f1728l = cVar.f1736b;
                    this.f1721e = 2;
                    return 0;
                }
                throw z.a("hdrl expected, found: " + this.f1718b.f1737c, null);
            case 2:
                int i7 = this.f1728l - 4;
                C1144z c1144z = new C1144z(i7);
                interfaceC0315q.readFully(c1144z.e(), 0, i7);
                j(c1144z);
                this.f1721e = 3;
                return 0;
            case 3:
                if (this.f1729m != -1) {
                    long position = interfaceC0315q.getPosition();
                    long j6 = this.f1729m;
                    if (position != j6) {
                        this.f1726j = j6;
                        return 0;
                    }
                }
                interfaceC0315q.s(this.f1717a.e(), 0, 12);
                interfaceC0315q.o();
                this.f1717a.T(0);
                this.f1718b.a(this.f1717a);
                int t6 = this.f1717a.t();
                int i8 = this.f1718b.f1735a;
                if (i8 == 1179011410) {
                    interfaceC0315q.p(12);
                    return 0;
                }
                if (i8 != 1414744396 || t6 != 1769369453) {
                    this.f1726j = interfaceC0315q.getPosition() + this.f1718b.f1736b + 8;
                    return 0;
                }
                long position2 = interfaceC0315q.getPosition();
                this.f1729m = position2;
                this.f1730n = position2 + this.f1718b.f1736b + 8;
                if (!this.f1732p) {
                    if (((G1.c) AbstractC1119a.e(this.f1723g)).a()) {
                        this.f1721e = 4;
                        this.f1726j = this.f1730n;
                        return 0;
                    }
                    this.f1722f.n(new J.b(this.f1724h));
                    this.f1732p = true;
                }
                this.f1726j = interfaceC0315q.getPosition() + 12;
                this.f1721e = 6;
                return 0;
            case 4:
                interfaceC0315q.readFully(this.f1717a.e(), 0, 8);
                this.f1717a.T(0);
                int t7 = this.f1717a.t();
                int t8 = this.f1717a.t();
                if (t7 == 829973609) {
                    this.f1721e = 5;
                    this.f1731o = t8;
                } else {
                    this.f1726j = interfaceC0315q.getPosition() + t8;
                }
                return 0;
            case 5:
                C1144z c1144z2 = new C1144z(this.f1731o);
                interfaceC0315q.readFully(c1144z2.e(), 0, this.f1731o);
                k(c1144z2);
                this.f1721e = 6;
                this.f1726j = this.f1729m;
                return 0;
            case 6:
                return n(interfaceC0315q);
            default:
                throw new AssertionError();
        }
    }

    @Override // E1.InterfaceC0314p
    public boolean i(InterfaceC0315q interfaceC0315q) {
        interfaceC0315q.s(this.f1717a.e(), 0, 12);
        this.f1717a.T(0);
        if (this.f1717a.t() != 1179011410) {
            return false;
        }
        this.f1717a.U(4);
        return this.f1717a.t() == 541677121;
    }

    public final void j(C1144z c1144z) {
        f c6 = f.c(1819436136, c1144z);
        if (c6.getType() != 1819436136) {
            throw z.a("Unexpected header list type " + c6.getType(), null);
        }
        G1.c cVar = (G1.c) c6.b(G1.c.class);
        if (cVar == null) {
            throw z.a("AviHeader not found", null);
        }
        this.f1723g = cVar;
        this.f1724h = cVar.f1740c * cVar.f1738a;
        ArrayList arrayList = new ArrayList();
        g0 l6 = c6.f1760a.l();
        int i6 = 0;
        while (l6.hasNext()) {
            G1.a aVar = (G1.a) l6.next();
            if (aVar.getType() == 1819440243) {
                int i7 = i6 + 1;
                e m6 = m((f) aVar, i6);
                if (m6 != null) {
                    arrayList.add(m6);
                }
                i6 = i7;
            }
        }
        this.f1725i = (e[]) arrayList.toArray(new e[0]);
        this.f1722f.k();
    }

    public final void k(C1144z c1144z) {
        long l6 = l(c1144z);
        while (c1144z.a() >= 16) {
            int t6 = c1144z.t();
            int t7 = c1144z.t();
            long t8 = c1144z.t() + l6;
            c1144z.t();
            e f6 = f(t6);
            if (f6 != null) {
                if ((t7 & 16) == 16) {
                    f6.b(t8);
                }
                f6.k();
            }
        }
        for (e eVar : this.f1725i) {
            eVar.c();
        }
        this.f1732p = true;
        this.f1722f.n(new C0035b(this.f1724h));
    }

    public final long l(C1144z c1144z) {
        if (c1144z.a() < 16) {
            return 0L;
        }
        int f6 = c1144z.f();
        c1144z.U(8);
        long t6 = c1144z.t();
        long j6 = this.f1729m;
        long j7 = t6 <= j6 ? j6 + 8 : 0L;
        c1144z.T(f6);
        return j7;
    }

    public final e m(f fVar, int i6) {
        d dVar = (d) fVar.b(d.class);
        g gVar = (g) fVar.b(g.class);
        if (dVar == null) {
            AbstractC1133o.h("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (gVar == null) {
            AbstractC1133o.h("AviExtractor", "Missing Stream Format");
            return null;
        }
        long a6 = dVar.a();
        q qVar = gVar.f1762a;
        q.b a7 = qVar.a();
        a7.Z(i6);
        int i7 = dVar.f1747f;
        if (i7 != 0) {
            a7.f0(i7);
        }
        h hVar = (h) fVar.b(h.class);
        if (hVar != null) {
            a7.c0(hVar.f1763a);
        }
        int k6 = y.k(qVar.f6990n);
        if (k6 != 1 && k6 != 2) {
            return null;
        }
        O a8 = this.f1722f.a(i6, k6);
        a8.e(a7.K());
        e eVar = new e(i6, k6, a6, dVar.f1746e, a8);
        this.f1724h = a6;
        return eVar;
    }

    public final int n(InterfaceC0315q interfaceC0315q) {
        if (interfaceC0315q.getPosition() >= this.f1730n) {
            return -1;
        }
        e eVar = this.f1727k;
        if (eVar == null) {
            e(interfaceC0315q);
            interfaceC0315q.s(this.f1717a.e(), 0, 12);
            this.f1717a.T(0);
            int t6 = this.f1717a.t();
            if (t6 == 1414744396) {
                this.f1717a.T(8);
                interfaceC0315q.p(this.f1717a.t() != 1769369453 ? 8 : 12);
                interfaceC0315q.o();
                return 0;
            }
            int t7 = this.f1717a.t();
            if (t6 == 1263424842) {
                this.f1726j = interfaceC0315q.getPosition() + t7 + 8;
                return 0;
            }
            interfaceC0315q.p(8);
            interfaceC0315q.o();
            e f6 = f(t6);
            if (f6 == null) {
                this.f1726j = interfaceC0315q.getPosition() + t7;
                return 0;
            }
            f6.n(t7);
            this.f1727k = f6;
        } else if (eVar.m(interfaceC0315q)) {
            this.f1727k = null;
        }
        return 0;
    }

    public final boolean o(InterfaceC0315q interfaceC0315q, I i6) {
        boolean z6;
        if (this.f1726j != -1) {
            long position = interfaceC0315q.getPosition();
            long j6 = this.f1726j;
            if (j6 < position || j6 > 262144 + position) {
                i6.f910a = j6;
                z6 = true;
                this.f1726j = -1L;
                return z6;
            }
            interfaceC0315q.p((int) (j6 - position));
        }
        z6 = false;
        this.f1726j = -1L;
        return z6;
    }

    @Override // E1.InterfaceC0314p
    public void release() {
    }
}
