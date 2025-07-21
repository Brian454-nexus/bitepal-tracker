package w1;

import A1.k;
import A1.l;
import E1.C0311m;
import E1.J;
import Z0.InterfaceC0837i;
import Z0.q;
import android.net.Uri;
import android.os.Handler;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1124f;
import c1.C1144z;
import e1.AbstractC1251i;
import e1.C1252j;
import e1.C1265w;
import e1.InterfaceC1248f;
import g1.C1337i0;
import g1.C1343l0;
import g1.N0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;
import l1.t;
import w1.C2238x;
import w1.InterfaceC2211C;
import w1.K;
import w1.a0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class V implements InterfaceC2211C, E1.r, l.b, l.f, a0.d {

    /* renamed from: W, reason: collision with root package name */
    public static final Map f19820W = M();

    /* renamed from: X, reason: collision with root package name */
    public static final Z0.q f19821X = new q.b().a0("icy").o0("application/x-icy").K();

    /* renamed from: A, reason: collision with root package name */
    public E1.J f19822A;

    /* renamed from: B, reason: collision with root package name */
    public long f19823B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f19824C;

    /* renamed from: E, reason: collision with root package name */
    public boolean f19826E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f19827F;

    /* renamed from: G, reason: collision with root package name */
    public int f19828G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f19829H;

    /* renamed from: I, reason: collision with root package name */
    public long f19830I;

    /* renamed from: K, reason: collision with root package name */
    public boolean f19832K;

    /* renamed from: L, reason: collision with root package name */
    public int f19833L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f19834M;

    /* renamed from: V, reason: collision with root package name */
    public boolean f19835V;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f19836a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1248f f19837b;

    /* renamed from: c, reason: collision with root package name */
    public final l1.u f19838c;

    /* renamed from: d, reason: collision with root package name */
    public final A1.k f19839d;

    /* renamed from: e, reason: collision with root package name */
    public final K.a f19840e;

    /* renamed from: f, reason: collision with root package name */
    public final t.a f19841f;

    /* renamed from: g, reason: collision with root package name */
    public final c f19842g;

    /* renamed from: h, reason: collision with root package name */
    public final A1.b f19843h;

    /* renamed from: i, reason: collision with root package name */
    public final String f19844i;

    /* renamed from: j, reason: collision with root package name */
    public final long f19845j;

    /* renamed from: k, reason: collision with root package name */
    public final long f19846k;

    /* renamed from: m, reason: collision with root package name */
    public final P f19848m;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC2211C.a f19853r;

    /* renamed from: s, reason: collision with root package name */
    public R1.b f19854s;

    /* renamed from: v, reason: collision with root package name */
    public boolean f19857v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f19858w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f19859x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f19860y;

    /* renamed from: z, reason: collision with root package name */
    public f f19861z;

    /* renamed from: l, reason: collision with root package name */
    public final A1.l f19847l = new A1.l("ProgressiveMediaPeriod");

    /* renamed from: n, reason: collision with root package name */
    public final C1124f f19849n = new C1124f();

    /* renamed from: o, reason: collision with root package name */
    public final Runnable f19850o = new Runnable() { // from class: w1.S
        @Override // java.lang.Runnable
        public final void run() {
            V.this.S();
        }
    };

    /* renamed from: p, reason: collision with root package name */
    public final Runnable f19851p = new Runnable() { // from class: w1.T
        @Override // java.lang.Runnable
        public final void run() {
            V.x(V.this);
        }
    };

    /* renamed from: q, reason: collision with root package name */
    public final Handler f19852q = AbstractC1117K.A();

    /* renamed from: u, reason: collision with root package name */
    public e[] f19856u = new e[0];

    /* renamed from: t, reason: collision with root package name */
    public a0[] f19855t = new a0[0];

    /* renamed from: J, reason: collision with root package name */
    public long f19831J = -9223372036854775807L;

    /* renamed from: D, reason: collision with root package name */
    public int f19825D = 1;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends E1.A {
        public a(E1.J j6) {
            super(j6);
        }

        @Override // E1.A, E1.J
        public long l() {
            return V.this.f19823B;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class b implements l.e, C2238x.a {

        /* renamed from: b, reason: collision with root package name */
        public final Uri f19864b;

        /* renamed from: c, reason: collision with root package name */
        public final C1265w f19865c;

        /* renamed from: d, reason: collision with root package name */
        public final P f19866d;

        /* renamed from: e, reason: collision with root package name */
        public final E1.r f19867e;

        /* renamed from: f, reason: collision with root package name */
        public final C1124f f19868f;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f19870h;

        /* renamed from: j, reason: collision with root package name */
        public long f19872j;

        /* renamed from: l, reason: collision with root package name */
        public E1.O f19874l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f19875m;

        /* renamed from: g, reason: collision with root package name */
        public final E1.I f19869g = new E1.I();

        /* renamed from: i, reason: collision with root package name */
        public boolean f19871i = true;

        /* renamed from: a, reason: collision with root package name */
        public final long f19863a = C2239y.a();

        /* renamed from: k, reason: collision with root package name */
        public C1252j f19873k = i(0);

        public b(Uri uri, InterfaceC1248f interfaceC1248f, P p6, E1.r rVar, C1124f c1124f) {
            this.f19864b = uri;
            this.f19865c = new C1265w(interfaceC1248f);
            this.f19866d = p6;
            this.f19867e = rVar;
            this.f19868f = c1124f;
        }

        @Override // A1.l.e
        public void a() {
            int i6 = 0;
            while (i6 == 0 && !this.f19870h) {
                try {
                    long j6 = this.f19869g.f910a;
                    C1252j i7 = i(j6);
                    this.f19873k = i7;
                    long r6 = this.f19865c.r(i7);
                    if (this.f19870h) {
                        if (i6 != 1 && this.f19866d.c() != -1) {
                            this.f19869g.f910a = this.f19866d.c();
                        }
                        AbstractC1251i.a(this.f19865c);
                        return;
                    }
                    if (r6 != -1) {
                        r6 += j6;
                        V.this.X();
                    }
                    long j7 = r6;
                    V.this.f19854s = R1.b.a(this.f19865c.n());
                    InterfaceC0837i interfaceC0837i = this.f19865c;
                    if (V.this.f19854s != null && V.this.f19854s.f4579f != -1) {
                        interfaceC0837i = new C2238x(this.f19865c, V.this.f19854s.f4579f, this);
                        E1.O P5 = V.this.P();
                        this.f19874l = P5;
                        P5.e(V.f19821X);
                    }
                    this.f19866d.b(interfaceC0837i, this.f19864b, this.f19865c.n(), j6, j7, this.f19867e);
                    if (V.this.f19854s != null) {
                        this.f19866d.d();
                    }
                    if (this.f19871i) {
                        this.f19866d.a(j6, this.f19872j);
                        this.f19871i = false;
                    }
                    while (i6 == 0 && !this.f19870h) {
                        try {
                            this.f19868f.a();
                            i6 = this.f19866d.e(this.f19869g);
                            long c6 = this.f19866d.c();
                            if (c6 > V.this.f19845j + j6) {
                                this.f19868f.c();
                                V.this.f19852q.post(V.this.f19851p);
                                j6 = c6;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (i6 == 1) {
                        i6 = 0;
                    } else if (this.f19866d.c() != -1) {
                        this.f19869g.f910a = this.f19866d.c();
                    }
                    AbstractC1251i.a(this.f19865c);
                } catch (Throwable th) {
                    if (i6 != 1 && this.f19866d.c() != -1) {
                        this.f19869g.f910a = this.f19866d.c();
                    }
                    AbstractC1251i.a(this.f19865c);
                    throw th;
                }
            }
        }

        @Override // w1.C2238x.a
        public void b(C1144z c1144z) {
            long max = !this.f19875m ? this.f19872j : Math.max(V.this.O(true), this.f19872j);
            int a6 = c1144z.a();
            E1.O o6 = (E1.O) AbstractC1119a.e(this.f19874l);
            o6.a(c1144z, a6);
            o6.f(max, 1, a6, 0, null);
            this.f19875m = true;
        }

        @Override // A1.l.e
        public void c() {
            this.f19870h = true;
        }

        public final C1252j i(long j6) {
            return new C1252j.b().i(this.f19864b).h(j6).f(V.this.f19844i).b(6).e(V.f19820W).a();
        }

        public final void j(long j6, long j7) {
            this.f19869g.f910a = j6;
            this.f19872j = j7;
            this.f19871i = true;
            this.f19875m = false;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        void e(long j6, boolean z6, boolean z7);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class d implements b0 {

        /* renamed from: a, reason: collision with root package name */
        public final int f19877a;

        public d(int i6) {
            this.f19877a = i6;
        }

        @Override // w1.b0
        public void a() {
            V.this.W(this.f19877a);
        }

        @Override // w1.b0
        public boolean c() {
            return V.this.R(this.f19877a);
        }

        @Override // w1.b0
        public int k(C1337i0 c1337i0, f1.f fVar, int i6) {
            return V.this.c0(this.f19877a, c1337i0, fVar, i6);
        }

        @Override // w1.b0
        public int n(long j6) {
            return V.this.g0(this.f19877a, j6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f19879a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f19880b;

        public e(int i6, boolean z6) {
            this.f19879a = i6;
            this.f19880b = z6;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f19879a == eVar.f19879a && this.f19880b == eVar.f19880b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f19879a * 31) + (this.f19880b ? 1 : 0);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final l0 f19881a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f19882b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean[] f19883c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean[] f19884d;

        public f(l0 l0Var, boolean[] zArr) {
            this.f19881a = l0Var;
            this.f19882b = zArr;
            int i6 = l0Var.f20070a;
            this.f19883c = new boolean[i6];
            this.f19884d = new boolean[i6];
        }
    }

    public V(Uri uri, InterfaceC1248f interfaceC1248f, P p6, l1.u uVar, t.a aVar, A1.k kVar, K.a aVar2, c cVar, A1.b bVar, String str, int i6, long j6) {
        this.f19836a = uri;
        this.f19837b = interfaceC1248f;
        this.f19838c = uVar;
        this.f19841f = aVar;
        this.f19839d = kVar;
        this.f19840e = aVar2;
        this.f19842g = cVar;
        this.f19843h = bVar;
        this.f19844i = str;
        this.f19845j = i6;
        this.f19848m = p6;
        this.f19846k = j6;
    }

    public static Map M() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    private boolean Q() {
        return this.f19831J != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        if (this.f19835V || this.f19858w || !this.f19857v || this.f19822A == null) {
            return;
        }
        for (a0 a0Var : this.f19855t) {
            if (a0Var.G() == null) {
                return;
            }
        }
        this.f19849n.c();
        int length = this.f19855t.length;
        Z0.H[] hArr = new Z0.H[length];
        boolean[] zArr = new boolean[length];
        for (int i6 = 0; i6 < length; i6++) {
            Z0.q qVar = (Z0.q) AbstractC1119a.e(this.f19855t[i6].G());
            String str = qVar.f6990n;
            boolean o6 = Z0.y.o(str);
            boolean z6 = o6 || Z0.y.s(str);
            zArr[i6] = z6;
            this.f19859x = z6 | this.f19859x;
            this.f19860y = this.f19846k != -9223372036854775807L && length == 1 && Z0.y.p(str);
            R1.b bVar = this.f19854s;
            if (bVar != null) {
                if (o6 || this.f19856u[i6].f19880b) {
                    Z0.x xVar = qVar.f6987k;
                    qVar = qVar.a().h0(xVar == null ? new Z0.x(bVar) : xVar.a(bVar)).K();
                }
                if (o6 && qVar.f6983g == -1 && qVar.f6984h == -1 && bVar.f4574a != -1) {
                    qVar = qVar.a().M(bVar.f4574a).K();
                }
            }
            hArr[i6] = new Z0.H(Integer.toString(i6), qVar.b(this.f19838c.c(qVar)));
        }
        this.f19861z = new f(new l0(hArr), zArr);
        if (this.f19860y && this.f19823B == -9223372036854775807L) {
            this.f19823B = this.f19846k;
            this.f19822A = new a(this.f19822A);
        }
        this.f19842g.e(this.f19823B, this.f19822A.f(), this.f19824C);
        this.f19858w = true;
        ((InterfaceC2211C.a) AbstractC1119a.e(this.f19853r)).i(this);
    }

    public static /* synthetic */ void x(V v6) {
        if (v6.f19835V) {
            return;
        }
        ((InterfaceC2211C.a) AbstractC1119a.e(v6.f19853r)).j(v6);
    }

    public final void K() {
        AbstractC1119a.g(this.f19858w);
        AbstractC1119a.e(this.f19861z);
        AbstractC1119a.e(this.f19822A);
    }

    public final boolean L(b bVar, int i6) {
        E1.J j6;
        if (this.f19829H || !((j6 = this.f19822A) == null || j6.l() == -9223372036854775807L)) {
            this.f19833L = i6;
            return true;
        }
        if (this.f19858w && !i0()) {
            this.f19832K = true;
            return false;
        }
        this.f19827F = this.f19858w;
        this.f19830I = 0L;
        this.f19833L = 0;
        for (a0 a0Var : this.f19855t) {
            a0Var.V();
        }
        bVar.j(0L, 0L);
        return true;
    }

    public final int N() {
        int i6 = 0;
        for (a0 a0Var : this.f19855t) {
            i6 += a0Var.H();
        }
        return i6;
    }

    public final long O(boolean z6) {
        long j6 = Long.MIN_VALUE;
        for (int i6 = 0; i6 < this.f19855t.length; i6++) {
            if (z6 || ((f) AbstractC1119a.e(this.f19861z)).f19883c[i6]) {
                j6 = Math.max(j6, this.f19855t[i6].A());
            }
        }
        return j6;
    }

    public E1.O P() {
        return b0(new e(0, true));
    }

    public boolean R(int i6) {
        return !i0() && this.f19855t[i6].L(this.f19834M);
    }

    public final void T(int i6) {
        K();
        f fVar = this.f19861z;
        boolean[] zArr = fVar.f19884d;
        if (zArr[i6]) {
            return;
        }
        Z0.q a6 = fVar.f19881a.b(i6).a(0);
        this.f19840e.h(Z0.y.k(a6.f6990n), a6, 0, null, this.f19830I);
        zArr[i6] = true;
    }

    public final void U(int i6) {
        K();
        boolean[] zArr = this.f19861z.f19882b;
        if (this.f19832K && zArr[i6]) {
            if (this.f19855t[i6].L(false)) {
                return;
            }
            this.f19831J = 0L;
            this.f19832K = false;
            this.f19827F = true;
            this.f19830I = 0L;
            this.f19833L = 0;
            for (a0 a0Var : this.f19855t) {
                a0Var.V();
            }
            ((InterfaceC2211C.a) AbstractC1119a.e(this.f19853r)).j(this);
        }
    }

    public void V() {
        this.f19847l.k(this.f19839d.d(this.f19825D));
    }

    public void W(int i6) {
        this.f19855t[i6].N();
        V();
    }

    public final void X() {
        this.f19852q.post(new Runnable() { // from class: w1.Q
            @Override // java.lang.Runnable
            public final void run() {
                V.this.f19829H = true;
            }
        });
    }

    @Override // A1.l.b
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void u(b bVar, long j6, long j7, boolean z6) {
        C1265w c1265w = bVar.f19865c;
        C2239y c2239y = new C2239y(bVar.f19863a, bVar.f19873k, c1265w.t(), c1265w.u(), j6, j7, c1265w.f());
        this.f19839d.b(bVar.f19863a);
        this.f19840e.k(c2239y, 1, -1, null, 0, null, bVar.f19872j, this.f19823B);
        if (z6) {
            return;
        }
        for (a0 a0Var : this.f19855t) {
            a0Var.V();
        }
        if (this.f19828G > 0) {
            ((InterfaceC2211C.a) AbstractC1119a.e(this.f19853r)).j(this);
        }
    }

    @Override // A1.l.b
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void j(b bVar, long j6, long j7) {
        E1.J j8;
        if (this.f19823B == -9223372036854775807L && (j8 = this.f19822A) != null) {
            boolean f6 = j8.f();
            long O5 = O(true);
            long j9 = O5 == Long.MIN_VALUE ? 0L : O5 + 10000;
            this.f19823B = j9;
            this.f19842g.e(j9, f6, this.f19824C);
        }
        C1265w c1265w = bVar.f19865c;
        C2239y c2239y = new C2239y(bVar.f19863a, bVar.f19873k, c1265w.t(), c1265w.u(), j6, j7, c1265w.f());
        this.f19839d.b(bVar.f19863a);
        this.f19840e.n(c2239y, 1, -1, null, 0, null, bVar.f19872j, this.f19823B);
        this.f19834M = true;
        ((InterfaceC2211C.a) AbstractC1119a.e(this.f19853r)).j(this);
    }

    @Override // E1.r
    public E1.O a(int i6, int i7) {
        return b0(new e(i6, false));
    }

    @Override // A1.l.b
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public l.c q(b bVar, long j6, long j7, IOException iOException, int i6) {
        b bVar2;
        l.c h6;
        C1265w c1265w = bVar.f19865c;
        C2239y c2239y = new C2239y(bVar.f19863a, bVar.f19873k, c1265w.t(), c1265w.u(), j6, j7, c1265w.f());
        long a6 = this.f19839d.a(new k.c(c2239y, new C2210B(1, -1, null, 0, null, AbstractC1117K.k1(bVar.f19872j), AbstractC1117K.k1(this.f19823B)), iOException, i6));
        if (a6 == -9223372036854775807L) {
            h6 = A1.l.f140g;
            bVar2 = bVar;
        } else {
            int N5 = N();
            bVar2 = bVar;
            h6 = L(bVar2, N5) ? A1.l.h(N5 > this.f19833L, a6) : A1.l.f139f;
        }
        boolean c6 = h6.c();
        this.f19840e.p(c2239y, 1, -1, null, 0, null, bVar2.f19872j, this.f19823B, iOException, !c6);
        if (!c6) {
            this.f19839d.b(bVar2.f19863a);
        }
        return h6;
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public boolean b(C1343l0 c1343l0) {
        if (this.f19834M || this.f19847l.i() || this.f19832K) {
            return false;
        }
        if (this.f19858w && this.f19828G == 0) {
            return false;
        }
        boolean e6 = this.f19849n.e();
        if (this.f19847l.j()) {
            return e6;
        }
        h0();
        return true;
    }

    public final E1.O b0(e eVar) {
        int length = this.f19855t.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (eVar.equals(this.f19856u[i6])) {
                return this.f19855t[i6];
            }
        }
        if (this.f19857v) {
            AbstractC1133o.h("ProgressiveMediaPeriod", "Extractor added new track (id=" + eVar.f19879a + ") after finishing tracks.");
            return new C0311m();
        }
        a0 k6 = a0.k(this.f19843h, this.f19838c, this.f19841f);
        k6.d0(this);
        int i7 = length + 1;
        e[] eVarArr = (e[]) Arrays.copyOf(this.f19856u, i7);
        eVarArr[length] = eVar;
        this.f19856u = (e[]) AbstractC1117K.j(eVarArr);
        a0[] a0VarArr = (a0[]) Arrays.copyOf(this.f19855t, i7);
        a0VarArr[length] = k6;
        this.f19855t = (a0[]) AbstractC1117K.j(a0VarArr);
        return k6;
    }

    @Override // w1.a0.d
    public void c(Z0.q qVar) {
        this.f19852q.post(this.f19850o);
    }

    public int c0(int i6, C1337i0 c1337i0, f1.f fVar, int i7) {
        if (i0()) {
            return -3;
        }
        T(i6);
        int S5 = this.f19855t[i6].S(c1337i0, fVar, i7, this.f19834M);
        if (S5 == -3) {
            U(i6);
        }
        return S5;
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public long d() {
        return f();
    }

    public void d0() {
        if (this.f19858w) {
            for (a0 a0Var : this.f19855t) {
                a0Var.R();
            }
        }
        this.f19847l.m(this);
        this.f19852q.removeCallbacksAndMessages(null);
        this.f19853r = null;
        this.f19835V = true;
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public boolean e() {
        return this.f19847l.j() && this.f19849n.d();
    }

    public final boolean e0(boolean[] zArr, long j6) {
        int length = this.f19855t.length;
        for (int i6 = 0; i6 < length; i6++) {
            a0 a0Var = this.f19855t[i6];
            if (!(this.f19860y ? a0Var.Y(a0Var.y()) : a0Var.Z(j6, false)) && (zArr[i6] || !this.f19859x)) {
                return false;
            }
        }
        return true;
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public long f() {
        long j6;
        K();
        if (this.f19834M || this.f19828G == 0) {
            return Long.MIN_VALUE;
        }
        if (Q()) {
            return this.f19831J;
        }
        if (this.f19859x) {
            int length = this.f19855t.length;
            j6 = Long.MAX_VALUE;
            for (int i6 = 0; i6 < length; i6++) {
                f fVar = this.f19861z;
                if (fVar.f19882b[i6] && fVar.f19883c[i6] && !this.f19855t[i6].K()) {
                    j6 = Math.min(j6, this.f19855t[i6].A());
                }
            }
        } else {
            j6 = Long.MAX_VALUE;
        }
        if (j6 == LongCompanionObject.MAX_VALUE) {
            j6 = O(false);
        }
        return j6 == Long.MIN_VALUE ? this.f19830I : j6;
    }

    public final void f0(E1.J j6) {
        this.f19822A = this.f19854s == null ? j6 : new J.b(-9223372036854775807L);
        this.f19823B = j6.l();
        boolean z6 = !this.f19829H && j6.l() == -9223372036854775807L;
        this.f19824C = z6;
        this.f19825D = z6 ? 7 : 1;
        if (this.f19858w) {
            this.f19842g.e(this.f19823B, j6.f(), this.f19824C);
        } else {
            S();
        }
    }

    @Override // w1.InterfaceC2211C
    public long g(long j6, N0 n02) {
        K();
        if (!this.f19822A.f()) {
            return 0L;
        }
        J.a j7 = this.f19822A.j(j6);
        return n02.a(j6, j7.f911a.f916a, j7.f912b.f916a);
    }

    public int g0(int i6, long j6) {
        if (i0()) {
            return 0;
        }
        T(i6);
        a0 a0Var = this.f19855t[i6];
        int F6 = a0Var.F(j6, this.f19834M);
        a0Var.e0(F6);
        if (F6 == 0) {
            U(i6);
        }
        return F6;
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public void h(long j6) {
    }

    public final void h0() {
        b bVar = new b(this.f19836a, this.f19837b, this.f19848m, this, this.f19849n);
        if (this.f19858w) {
            AbstractC1119a.g(Q());
            long j6 = this.f19823B;
            if (j6 != -9223372036854775807L && this.f19831J > j6) {
                this.f19834M = true;
                this.f19831J = -9223372036854775807L;
                return;
            }
            bVar.j(((E1.J) AbstractC1119a.e(this.f19822A)).j(this.f19831J).f911a.f917b, this.f19831J);
            for (a0 a0Var : this.f19855t) {
                a0Var.b0(this.f19831J);
            }
            this.f19831J = -9223372036854775807L;
        }
        this.f19833L = N();
        this.f19840e.t(new C2239y(bVar.f19863a, bVar.f19873k, this.f19847l.n(bVar, this, this.f19839d.d(this.f19825D))), 1, -1, null, 0, null, bVar.f19872j, this.f19823B);
    }

    @Override // A1.l.f
    public void i() {
        for (a0 a0Var : this.f19855t) {
            a0Var.T();
        }
        this.f19848m.release();
    }

    public final boolean i0() {
        return this.f19827F || Q();
    }

    @Override // E1.r
    public void k() {
        this.f19857v = true;
        this.f19852q.post(this.f19850o);
    }

    @Override // w1.InterfaceC2211C
    public void l() {
        V();
        if (this.f19834M && !this.f19858w) {
            throw Z0.z.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // w1.InterfaceC2211C
    public long m(long j6) {
        K();
        boolean[] zArr = this.f19861z.f19882b;
        if (!this.f19822A.f()) {
            j6 = 0;
        }
        int i6 = 0;
        this.f19827F = false;
        this.f19830I = j6;
        if (Q()) {
            this.f19831J = j6;
            return j6;
        }
        if (this.f19825D == 7 || ((!this.f19834M && !this.f19847l.j()) || !e0(zArr, j6))) {
            this.f19832K = false;
            this.f19831J = j6;
            this.f19834M = false;
            if (this.f19847l.j()) {
                a0[] a0VarArr = this.f19855t;
                int length = a0VarArr.length;
                while (i6 < length) {
                    a0VarArr[i6].r();
                    i6++;
                }
                this.f19847l.f();
                return j6;
            }
            this.f19847l.g();
            a0[] a0VarArr2 = this.f19855t;
            int length2 = a0VarArr2.length;
            while (i6 < length2) {
                a0VarArr2[i6].V();
                i6++;
            }
        }
        return j6;
    }

    @Override // E1.r
    public void n(final E1.J j6) {
        this.f19852q.post(new Runnable() { // from class: w1.U
            @Override // java.lang.Runnable
            public final void run() {
                V.this.f0(j6);
            }
        });
    }

    @Override // w1.InterfaceC2211C
    public long o(z1.x[] xVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j6) {
        z1.x xVar;
        K();
        f fVar = this.f19861z;
        l0 l0Var = fVar.f19881a;
        boolean[] zArr3 = fVar.f19883c;
        int i6 = this.f19828G;
        int i7 = 0;
        for (int i8 = 0; i8 < xVarArr.length; i8++) {
            b0 b0Var = b0VarArr[i8];
            if (b0Var != null && (xVarArr[i8] == null || !zArr[i8])) {
                int i9 = ((d) b0Var).f19877a;
                AbstractC1119a.g(zArr3[i9]);
                this.f19828G--;
                zArr3[i9] = false;
                b0VarArr[i8] = null;
            }
        }
        boolean z6 = !this.f19826E ? j6 == 0 || this.f19860y : i6 != 0;
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            if (b0VarArr[i10] == null && (xVar = xVarArr[i10]) != null) {
                AbstractC1119a.g(xVar.length() == 1);
                AbstractC1119a.g(xVar.k(0) == 0);
                int d6 = l0Var.d(xVar.e());
                AbstractC1119a.g(!zArr3[d6]);
                this.f19828G++;
                zArr3[d6] = true;
                b0VarArr[i10] = new d(d6);
                zArr2[i10] = true;
                if (!z6) {
                    a0 a0Var = this.f19855t[d6];
                    z6 = (a0Var.D() == 0 || a0Var.Z(j6, true)) ? false : true;
                }
            }
        }
        if (this.f19828G == 0) {
            this.f19832K = false;
            this.f19827F = false;
            if (this.f19847l.j()) {
                a0[] a0VarArr = this.f19855t;
                int length = a0VarArr.length;
                while (i7 < length) {
                    a0VarArr[i7].r();
                    i7++;
                }
                this.f19847l.f();
            } else {
                this.f19834M = false;
                a0[] a0VarArr2 = this.f19855t;
                int length2 = a0VarArr2.length;
                while (i7 < length2) {
                    a0VarArr2[i7].V();
                    i7++;
                }
            }
        } else if (z6) {
            j6 = m(j6);
            while (i7 < b0VarArr.length) {
                if (b0VarArr[i7] != null) {
                    zArr2[i7] = true;
                }
                i7++;
            }
        }
        this.f19826E = true;
        return j6;
    }

    @Override // w1.InterfaceC2211C
    public long p() {
        if (!this.f19827F) {
            return -9223372036854775807L;
        }
        if (!this.f19834M && N() <= this.f19833L) {
            return -9223372036854775807L;
        }
        this.f19827F = false;
        return this.f19830I;
    }

    @Override // w1.InterfaceC2211C
    public l0 r() {
        K();
        return this.f19861z.f19881a;
    }

    @Override // w1.InterfaceC2211C
    public void s(InterfaceC2211C.a aVar, long j6) {
        this.f19853r = aVar;
        this.f19849n.e();
        h0();
    }

    @Override // w1.InterfaceC2211C
    public void t(long j6, boolean z6) {
        if (this.f19860y) {
            return;
        }
        K();
        if (Q()) {
            return;
        }
        boolean[] zArr = this.f19861z.f19883c;
        int length = this.f19855t.length;
        for (int i6 = 0; i6 < length; i6++) {
            this.f19855t[i6].q(j6, z6, zArr[i6]);
        }
    }
}
