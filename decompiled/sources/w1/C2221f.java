package w1;

import Z0.G;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.io.IOException;
import java.util.ArrayList;
import w1.InterfaceC2212D;

/* renamed from: w1.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2221f extends n0 {

    /* renamed from: m, reason: collision with root package name */
    public final long f19990m;

    /* renamed from: n, reason: collision with root package name */
    public final long f19991n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f19992o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f19993p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f19994q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f19995r;

    /* renamed from: s, reason: collision with root package name */
    public final G.c f19996s;

    /* renamed from: t, reason: collision with root package name */
    public a f19997t;

    /* renamed from: u, reason: collision with root package name */
    public b f19998u;

    /* renamed from: v, reason: collision with root package name */
    public long f19999v;

    /* renamed from: w, reason: collision with root package name */
    public long f20000w;

    /* renamed from: w1.f$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends AbstractC2237w {

        /* renamed from: f, reason: collision with root package name */
        public final long f20001f;

        /* renamed from: g, reason: collision with root package name */
        public final long f20002g;

        /* renamed from: h, reason: collision with root package name */
        public final long f20003h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f20004i;

        public a(Z0.G g6, long j6, long j7) {
            super(g6);
            boolean z6 = false;
            if (g6.i() != 1) {
                throw new b(0);
            }
            G.c n6 = g6.n(0, new G.c());
            long max = Math.max(0L, j6);
            if (!n6.f6694k && max != 0 && !n6.f6691h) {
                throw new b(1);
            }
            long max2 = j7 == Long.MIN_VALUE ? n6.f6696m : Math.max(0L, j7);
            long j8 = n6.f6696m;
            if (j8 != -9223372036854775807L) {
                max2 = max2 > j8 ? j8 : max2;
                if (max > max2) {
                    throw new b(2);
                }
            }
            this.f20001f = max;
            this.f20002g = max2;
            this.f20003h = max2 == -9223372036854775807L ? -9223372036854775807L : max2 - max;
            if (n6.f6692i && (max2 == -9223372036854775807L || (j8 != -9223372036854775807L && max2 == j8))) {
                z6 = true;
            }
            this.f20004i = z6;
        }

        @Override // w1.AbstractC2237w, Z0.G
        public G.b g(int i6, G.b bVar, boolean z6) {
            this.f20118e.g(0, bVar, z6);
            long n6 = bVar.n() - this.f20001f;
            long j6 = this.f20003h;
            return bVar.s(bVar.f6661a, bVar.f6662b, 0, j6 != -9223372036854775807L ? j6 - n6 : -9223372036854775807L, n6);
        }

        @Override // w1.AbstractC2237w, Z0.G
        public G.c o(int i6, G.c cVar, long j6) {
            this.f20118e.o(0, cVar, 0L);
            long j7 = cVar.f6699p;
            long j8 = this.f20001f;
            cVar.f6699p = j7 + j8;
            cVar.f6696m = this.f20003h;
            cVar.f6692i = this.f20004i;
            long j9 = cVar.f6695l;
            if (j9 != -9223372036854775807L) {
                long max = Math.max(j9, j8);
                cVar.f6695l = max;
                long j10 = this.f20002g;
                if (j10 != -9223372036854775807L) {
                    max = Math.min(max, j10);
                }
                cVar.f6695l = max - this.f20001f;
            }
            long k12 = AbstractC1117K.k1(this.f20001f);
            long j11 = cVar.f6688e;
            if (j11 != -9223372036854775807L) {
                cVar.f6688e = j11 + k12;
            }
            long j12 = cVar.f6689f;
            if (j12 != -9223372036854775807L) {
                cVar.f6689f = j12 + k12;
            }
            return cVar;
        }
    }

    /* renamed from: w1.f$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f20005a;

        public b(int i6) {
            super("Illegal clipping: " + a(i6));
            this.f20005a = i6;
        }

        public static String a(int i6) {
            return i6 != 0 ? i6 != 1 ? i6 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public C2221f(InterfaceC2212D interfaceC2212D, long j6, long j7, boolean z6, boolean z7, boolean z8) {
        super((InterfaceC2212D) AbstractC1119a.e(interfaceC2212D));
        AbstractC1119a.a(j6 >= 0);
        this.f19990m = j6;
        this.f19991n = j7;
        this.f19992o = z6;
        this.f19993p = z7;
        this.f19994q = z8;
        this.f19995r = new ArrayList();
        this.f19996s = new G.c();
    }

    @Override // w1.AbstractC2223h, w1.AbstractC2216a
    public void E() {
        super.E();
        this.f19998u = null;
        this.f19997t = null;
    }

    @Override // w1.n0
    public void R(Z0.G g6) {
        if (this.f19998u != null) {
            return;
        }
        V(g6);
    }

    public final void V(Z0.G g6) {
        long j6;
        g6.n(0, this.f19996s);
        long e6 = this.f19996s.e();
        if (this.f19997t == null || this.f19995r.isEmpty() || this.f19993p) {
            j6 = this.f19990m;
            long j7 = this.f19991n;
            if (this.f19994q) {
                long c6 = this.f19996s.c();
                j6 += c6;
                j7 += c6;
            }
            this.f19999v = e6 + j6;
            this.f20000w = this.f19991n != Long.MIN_VALUE ? e6 + j7 : Long.MIN_VALUE;
            int size = this.f19995r.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((C2220e) this.f19995r.get(i6)).w(this.f19999v, this.f20000w);
            }
            r6 = j7;
        } else {
            j6 = this.f19999v - e6;
            if (this.f19991n != Long.MIN_VALUE) {
                r6 = this.f20000w - e6;
            }
        }
        try {
            a aVar = new a(g6, j6, r6);
            this.f19997t = aVar;
            D(aVar);
        } catch (b e7) {
            this.f19998u = e7;
            for (int i7 = 0; i7 < this.f19995r.size(); i7++) {
                ((C2220e) this.f19995r.get(i7)).u(this.f19998u);
            }
        }
    }

    @Override // w1.InterfaceC2212D
    public InterfaceC2211C d(InterfaceC2212D.b bVar, A1.b bVar2, long j6) {
        C2220e c2220e = new C2220e(this.f20080k.d(bVar, bVar2, j6), this.f19992o, this.f19999v, this.f20000w);
        this.f19995r.add(c2220e);
        return c2220e;
    }

    @Override // w1.AbstractC2223h, w1.InterfaceC2212D
    public void l() {
        b bVar = this.f19998u;
        if (bVar != null) {
            throw bVar;
        }
        super.l();
    }

    @Override // w1.InterfaceC2212D
    public void r(InterfaceC2211C interfaceC2211C) {
        AbstractC1119a.g(this.f19995r.remove(interfaceC2211C));
        this.f20080k.r(((C2220e) interfaceC2211C).f19965a);
        if (!this.f19995r.isEmpty() || this.f19993p) {
            return;
        }
        V(((a) AbstractC1119a.e(this.f19997t)).f20118e);
    }
}
