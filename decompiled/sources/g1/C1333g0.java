package g1;

import Z0.G;
import Z0.u;
import Z0.x;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.InterfaceC1121c;
import c1.InterfaceC1129k;
import e1.C1249g;
import g1.C1338j;
import g1.C1347n0;
import g1.F0;
import g1.H0;
import g1.InterfaceC1341k0;
import g1.InterfaceC1344m;
import g1.J0;
import g1.K0;
import h1.InterfaceC1400a;
import h1.v1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.LongCompanionObject;
import l1.InterfaceC1743m;
import w1.C2217b;
import w1.InterfaceC2211C;
import w1.InterfaceC2212D;
import y1.C2352i;
import z1.AbstractC2443C;
import z1.C2444D;
import z6.w;

/* renamed from: g1.g0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1333g0 implements Handler.Callback, InterfaceC2211C.a, AbstractC2443C.a, F0.d, C1338j.a, H0.a {

    /* renamed from: f0, reason: collision with root package name */
    public static final long f14571f0 = AbstractC1117K.k1(10000);

    /* renamed from: A, reason: collision with root package name */
    public e f14572A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f14573B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f14574C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f14575D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f14576E;

    /* renamed from: G, reason: collision with root package name */
    public boolean f14578G;

    /* renamed from: H, reason: collision with root package name */
    public int f14579H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f14580I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f14581J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f14582K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f14583L;

    /* renamed from: M, reason: collision with root package name */
    public int f14584M;

    /* renamed from: V, reason: collision with root package name */
    public h f14585V;

    /* renamed from: W, reason: collision with root package name */
    public long f14586W;

    /* renamed from: X, reason: collision with root package name */
    public long f14587X;

    /* renamed from: Y, reason: collision with root package name */
    public int f14588Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f14589Z;

    /* renamed from: a, reason: collision with root package name */
    public final J0[] f14590a;

    /* renamed from: a0, reason: collision with root package name */
    public C1342l f14591a0;

    /* renamed from: b, reason: collision with root package name */
    public final Set f14592b;

    /* renamed from: b0, reason: collision with root package name */
    public long f14593b0;

    /* renamed from: c, reason: collision with root package name */
    public final K0[] f14594c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2443C f14596d;

    /* renamed from: d0, reason: collision with root package name */
    public InterfaceC1344m.c f14597d0;

    /* renamed from: e, reason: collision with root package name */
    public final C2444D f14598e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1341k0 f14600f;

    /* renamed from: g, reason: collision with root package name */
    public final A1.d f14601g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1129k f14602h;

    /* renamed from: i, reason: collision with root package name */
    public final HandlerThread f14603i;

    /* renamed from: j, reason: collision with root package name */
    public final Looper f14604j;

    /* renamed from: k, reason: collision with root package name */
    public final G.c f14605k;

    /* renamed from: l, reason: collision with root package name */
    public final G.b f14606l;

    /* renamed from: m, reason: collision with root package name */
    public final long f14607m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f14608n;

    /* renamed from: o, reason: collision with root package name */
    public final C1338j f14609o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f14610p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC1121c f14611q;

    /* renamed from: r, reason: collision with root package name */
    public final f f14612r;

    /* renamed from: s, reason: collision with root package name */
    public final C1353q0 f14613s;

    /* renamed from: t, reason: collision with root package name */
    public final F0 f14614t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC1339j0 f14615u;

    /* renamed from: v, reason: collision with root package name */
    public final long f14616v;

    /* renamed from: w, reason: collision with root package name */
    public final v1 f14617w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f14618x;

    /* renamed from: y, reason: collision with root package name */
    public N0 f14619y;

    /* renamed from: z, reason: collision with root package name */
    public G0 f14620z;

    /* renamed from: c0, reason: collision with root package name */
    public long f14595c0 = -9223372036854775807L;

    /* renamed from: F, reason: collision with root package name */
    public long f14577F = -9223372036854775807L;

    /* renamed from: e0, reason: collision with root package name */
    public Z0.G f14599e0 = Z0.G.f6652a;

    /* renamed from: g1.g0$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements J0.a {
        public a() {
        }

        @Override // g1.J0.a
        public void a() {
            C1333g0.this.f14582K = true;
        }

        @Override // g1.J0.a
        public void b() {
            if (C1333g0.this.f14618x || C1333g0.this.f14583L) {
                C1333g0.this.f14602h.f(2);
            }
        }
    }

    /* renamed from: g1.g0$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final List f14622a;

        /* renamed from: b, reason: collision with root package name */
        public final w1.d0 f14623b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14624c;

        /* renamed from: d, reason: collision with root package name */
        public final long f14625d;

        public /* synthetic */ b(List list, w1.d0 d0Var, int i6, long j6, a aVar) {
            this(list, d0Var, i6, j6);
        }

        public b(List list, w1.d0 d0Var, int i6, long j6) {
            this.f14622a = list;
            this.f14623b = d0Var;
            this.f14624c = i6;
            this.f14625d = j6;
        }
    }

    /* renamed from: g1.g0$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {
    }

    /* renamed from: g1.g0$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final H0 f14626a;

        /* renamed from: b, reason: collision with root package name */
        public int f14627b;

        /* renamed from: c, reason: collision with root package name */
        public long f14628c;

        /* renamed from: d, reason: collision with root package name */
        public Object f14629d;

        public d(H0 h02) {
            this.f14626a = h02;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f14629d;
            if ((obj == null) != (dVar.f14629d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i6 = this.f14627b - dVar.f14627b;
            return i6 != 0 ? i6 : AbstractC1117K.n(this.f14628c, dVar.f14628c);
        }

        public void b(int i6, long j6, Object obj) {
            this.f14627b = i6;
            this.f14628c = j6;
            this.f14629d = obj;
        }
    }

    /* renamed from: g1.g0$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public boolean f14630a;

        /* renamed from: b, reason: collision with root package name */
        public G0 f14631b;

        /* renamed from: c, reason: collision with root package name */
        public int f14632c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f14633d;

        /* renamed from: e, reason: collision with root package name */
        public int f14634e;

        public e(G0 g02) {
            this.f14631b = g02;
        }

        public void b(int i6) {
            this.f14630a |= i6 > 0;
            this.f14632c += i6;
        }

        public void c(G0 g02) {
            this.f14630a |= this.f14631b != g02;
            this.f14631b = g02;
        }

        public void d(int i6) {
            if (this.f14633d && this.f14634e != 5) {
                AbstractC1119a.a(i6 == 5);
                return;
            }
            this.f14630a = true;
            this.f14633d = true;
            this.f14634e = i6;
        }
    }

    /* renamed from: g1.g0$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface f {
        void a(e eVar);
    }

    /* renamed from: g1.g0$g */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC2212D.b f14635a;

        /* renamed from: b, reason: collision with root package name */
        public final long f14636b;

        /* renamed from: c, reason: collision with root package name */
        public final long f14637c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f14638d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f14639e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f14640f;

        public g(InterfaceC2212D.b bVar, long j6, long j7, boolean z6, boolean z7, boolean z8) {
            this.f14635a = bVar;
            this.f14636b = j6;
            this.f14637c = j7;
            this.f14638d = z6;
            this.f14639e = z7;
            this.f14640f = z8;
        }
    }

    /* renamed from: g1.g0$h */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final Z0.G f14641a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14642b;

        /* renamed from: c, reason: collision with root package name */
        public final long f14643c;

        public h(Z0.G g6, int i6, long j6) {
            this.f14641a = g6;
            this.f14642b = i6;
            this.f14643c = j6;
        }
    }

    public C1333g0(J0[] j0Arr, AbstractC2443C abstractC2443C, C2444D c2444d, InterfaceC1341k0 interfaceC1341k0, A1.d dVar, int i6, boolean z6, InterfaceC1400a interfaceC1400a, N0 n02, InterfaceC1339j0 interfaceC1339j0, long j6, boolean z7, boolean z8, Looper looper, InterfaceC1121c interfaceC1121c, f fVar, v1 v1Var, Looper looper2, InterfaceC1344m.c cVar) {
        this.f14612r = fVar;
        this.f14590a = j0Arr;
        this.f14596d = abstractC2443C;
        this.f14598e = c2444d;
        this.f14600f = interfaceC1341k0;
        this.f14601g = dVar;
        this.f14579H = i6;
        this.f14580I = z6;
        this.f14619y = n02;
        this.f14615u = interfaceC1339j0;
        this.f14616v = j6;
        this.f14593b0 = j6;
        this.f14574C = z7;
        this.f14618x = z8;
        this.f14611q = interfaceC1121c;
        this.f14617w = v1Var;
        this.f14597d0 = cVar;
        this.f14607m = interfaceC1341k0.c(v1Var);
        this.f14608n = interfaceC1341k0.d(v1Var);
        G0 k6 = G0.k(c2444d);
        this.f14620z = k6;
        this.f14572A = new e(k6);
        this.f14594c = new K0[j0Arr.length];
        K0.a c6 = abstractC2443C.c();
        for (int i7 = 0; i7 < j0Arr.length; i7++) {
            j0Arr[i7].J(i7, v1Var, interfaceC1121c);
            this.f14594c[i7] = j0Arr[i7].z();
            if (c6 != null) {
                this.f14594c[i7].I(c6);
            }
        }
        this.f14609o = new C1338j(this, interfaceC1121c);
        this.f14610p = new ArrayList();
        this.f14592b = z6.a0.h();
        this.f14605k = new G.c();
        this.f14606l = new G.b();
        abstractC2443C.d(this, dVar);
        this.f14589Z = true;
        InterfaceC1129k e6 = interfaceC1121c.e(looper, null);
        this.f14613s = new C1353q0(interfaceC1400a, e6, new C1347n0.a() { // from class: g1.f0
            @Override // g1.C1347n0.a
            public final C1347n0 a(C1349o0 c1349o0, long j7) {
                C1347n0 t6;
                t6 = C1333g0.this.t(c1349o0, j7);
                return t6;
            }
        }, cVar);
        this.f14614t = new F0(this, interfaceC1400a, e6, v1Var);
        if (looper2 != null) {
            this.f14603i = null;
            this.f14604j = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.f14603i = handlerThread;
            handlerThread.start();
            this.f14604j = handlerThread.getLooper();
        }
        this.f14602h = interfaceC1121c.e(this.f14604j, this);
    }

    public static void B0(Z0.G g6, d dVar, G.c cVar, G.b bVar) {
        int i6 = g6.n(g6.h(dVar.f14629d, bVar).f6663c, cVar).f6698o;
        Object obj = g6.g(i6, bVar, true).f6662b;
        long j6 = bVar.f6664d;
        dVar.b(i6, j6 != -9223372036854775807L ? j6 - 1 : LongCompanionObject.MAX_VALUE, obj);
    }

    public static boolean C0(d dVar, Z0.G g6, Z0.G g7, int i6, boolean z6, G.c cVar, G.b bVar) {
        Object obj = dVar.f14629d;
        if (obj == null) {
            Pair F02 = F0(g6, new h(dVar.f14626a.h(), dVar.f14626a.d(), dVar.f14626a.f() == Long.MIN_VALUE ? -9223372036854775807L : AbstractC1117K.J0(dVar.f14626a.f())), false, i6, z6, cVar, bVar);
            if (F02 == null) {
                return false;
            }
            dVar.b(g6.b(F02.first), ((Long) F02.second).longValue(), F02.first);
            if (dVar.f14626a.f() == Long.MIN_VALUE) {
                B0(g6, dVar, cVar, bVar);
            }
            return true;
        }
        int b6 = g6.b(obj);
        if (b6 == -1) {
            return false;
        }
        if (dVar.f14626a.f() == Long.MIN_VALUE) {
            B0(g6, dVar, cVar, bVar);
            return true;
        }
        dVar.f14627b = b6;
        g7.h(dVar.f14629d, bVar);
        if (bVar.f6666f && g7.n(bVar.f6663c, cVar).f6697n == g7.b(dVar.f14629d)) {
            Pair j6 = g6.j(cVar, bVar, g6.h(dVar.f14629d, bVar).f6663c, dVar.f14628c + bVar.n());
            dVar.b(g6.b(j6.first), ((Long) j6.second).longValue(), j6.first);
        }
        return true;
    }

    public static Z0.q[] E(z1.x xVar) {
        int length = xVar != null ? xVar.length() : 0;
        Z0.q[] qVarArr = new Z0.q[length];
        for (int i6 = 0; i6 < length; i6++) {
            qVarArr[i6] = xVar.h(i6);
        }
        return qVarArr;
    }

    public static g E0(Z0.G g6, G0 g02, h hVar, C1353q0 c1353q0, int i6, boolean z6, G.c cVar, G.b bVar) {
        int i7;
        long j6;
        long j7;
        int i8;
        long j8;
        boolean z7;
        boolean z8;
        boolean z9;
        int i9;
        boolean z10;
        Z0.G g7;
        G.b bVar2;
        long j9;
        int i10;
        long longValue;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        if (g6.q()) {
            return new g(G0.l(), 0L, -9223372036854775807L, false, true, false);
        }
        InterfaceC2212D.b bVar3 = g02.f14329b;
        Object obj = bVar3.f19753a;
        boolean Z5 = Z(g02, bVar);
        long j10 = (g02.f14329b.b() || Z5) ? g02.f14330c : g02.f14346s;
        if (hVar != null) {
            i7 = -1;
            j6 = -9223372036854775807L;
            Pair F02 = F0(g6, hVar, true, i6, z6, cVar, bVar);
            if (F02 == null) {
                i11 = g6.a(z6);
                longValue = j10;
                z11 = false;
                z12 = false;
                z13 = true;
            } else {
                if (hVar.f14643c == -9223372036854775807L) {
                    i11 = g6.h(F02.first, bVar).f6663c;
                    longValue = j10;
                    z11 = false;
                } else {
                    obj = F02.first;
                    longValue = ((Long) F02.second).longValue();
                    i11 = -1;
                    z11 = true;
                }
                z12 = g02.f14332e == 4;
                z13 = false;
            }
            i8 = i11;
            j7 = longValue;
            z9 = z11;
            z7 = z12;
            z8 = z13;
        } else {
            i7 = -1;
            j6 = -9223372036854775807L;
            if (g02.f14328a.q()) {
                i8 = g6.a(z6);
            } else if (g6.b(obj) == -1) {
                int G02 = G0(cVar, bVar, i6, z6, obj, g02.f14328a, g6);
                if (G02 == -1) {
                    i9 = g6.a(z6);
                    z10 = true;
                } else {
                    i9 = G02;
                    z10 = false;
                }
                i8 = i9;
                obj = obj;
                j7 = j10;
                z8 = z10;
                z7 = false;
                z9 = false;
            } else if (j10 == -9223372036854775807L) {
                i8 = g6.h(obj, bVar).f6663c;
                obj = obj;
            } else if (Z5) {
                g02.f14328a.h(bVar3.f19753a, bVar);
                if (g02.f14328a.n(bVar.f6663c, cVar).f6697n == g02.f14328a.b(bVar3.f19753a)) {
                    Pair j11 = g6.j(cVar, bVar, g6.h(obj, bVar).f6663c, bVar.n() + j10);
                    obj = j11.first;
                    j8 = ((Long) j11.second).longValue();
                } else {
                    obj = obj;
                    j8 = j10;
                }
                j7 = j8;
                i8 = -1;
                z7 = false;
                z8 = false;
                z9 = true;
            } else {
                obj = obj;
                j7 = j10;
                i8 = -1;
                z7 = false;
                z8 = false;
                z9 = false;
            }
            j7 = j10;
            z7 = false;
            z8 = false;
            z9 = false;
        }
        if (i8 != i7) {
            bVar2 = bVar;
            Pair j12 = g6.j(cVar, bVar2, i8, -9223372036854775807L);
            g7 = g6;
            obj = j12.first;
            j7 = ((Long) j12.second).longValue();
            j9 = j6;
        } else {
            g7 = g6;
            bVar2 = bVar;
            j9 = j7;
        }
        InterfaceC2212D.b K5 = c1353q0.K(g7, obj, j7);
        int i12 = K5.f19757e;
        boolean z14 = bVar3.f19753a.equals(obj) && !bVar3.b() && !K5.b() && (i12 == i7 || ((i10 = bVar3.f19757e) != i7 && i12 >= i10));
        long j13 = j9;
        InterfaceC2212D.b bVar4 = K5;
        boolean V5 = V(Z5, bVar3, j10, bVar4, g7.h(obj, bVar2), j13);
        if (z14 || V5) {
            bVar4 = bVar3;
        }
        if (bVar4.b()) {
            if (bVar4.equals(bVar3)) {
                j7 = g02.f14346s;
            } else {
                g7.h(bVar4.f19753a, bVar2);
                j7 = bVar4.f19755c == bVar2.k(bVar4.f19754b) ? bVar2.g() : 0L;
            }
        }
        return new g(bVar4, j7, j13, z7, z8, z9);
    }

    public static Pair F0(Z0.G g6, h hVar, boolean z6, int i6, boolean z7, G.c cVar, G.b bVar) {
        Pair j6;
        Z0.G g7;
        int G02;
        Z0.G g8 = hVar.f14641a;
        if (g6.q()) {
            return null;
        }
        if (g8.q()) {
            g8 = g6;
        }
        try {
            j6 = g8.j(cVar, bVar, hVar.f14642b, hVar.f14643c);
            g7 = g8;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (g6.equals(g7)) {
            return j6;
        }
        if (g6.b(j6.first) != -1) {
            return (g7.h(j6.first, bVar).f6666f && g7.n(bVar.f6663c, cVar).f6697n == g7.b(j6.first)) ? g6.j(cVar, bVar, g6.h(j6.first, bVar).f6663c, hVar.f14643c) : j6;
        }
        if (z6 && (G02 = G0(cVar, bVar, i6, z7, j6.first, g7, g6)) != -1) {
            return g6.j(cVar, bVar, G02, -9223372036854775807L);
        }
        return null;
    }

    public static int G0(G.c cVar, G.b bVar, int i6, boolean z6, Object obj, Z0.G g6, Z0.G g7) {
        G.b bVar2;
        Object obj2 = g6.n(g6.h(obj, bVar).f6663c, cVar).f6684a;
        int i7 = 0;
        for (int i8 = 0; i8 < g7.p(); i8++) {
            if (g7.n(i8, cVar).f6684a.equals(obj2)) {
                return i8;
            }
        }
        int b6 = g6.b(obj);
        int i9 = g6.i();
        int i10 = b6;
        int i11 = -1;
        while (i7 < i9 && i11 == -1) {
            G.c cVar2 = cVar;
            bVar2 = bVar;
            int i12 = i6;
            boolean z7 = z6;
            Z0.G g8 = g6;
            i10 = g8.d(i10, bVar2, cVar2, i12, z7);
            if (i10 == -1) {
                break;
            }
            i11 = g7.b(g8.m(i10));
            i7++;
            g6 = g8;
            bVar = bVar2;
            cVar = cVar2;
            i6 = i12;
            z6 = z7;
        }
        bVar2 = bVar;
        if (i11 == -1) {
            return -1;
        }
        return g7.f(i11, bVar2).f6663c;
    }

    public static boolean V(boolean z6, InterfaceC2212D.b bVar, long j6, InterfaceC2212D.b bVar2, G.b bVar3, long j7) {
        if (!z6 && j6 == j7 && bVar.f19753a.equals(bVar2.f19753a)) {
            if (bVar.b() && bVar3.r(bVar.f19754b)) {
                return (bVar3.h(bVar.f19754b, bVar.f19755c) == 4 || bVar3.h(bVar.f19754b, bVar.f19755c) == 2) ? false : true;
            }
            if (bVar2.b() && bVar3.r(bVar2.f19754b)) {
                return true;
            }
        }
        return false;
    }

    public static boolean X(J0 j02) {
        return j02.f() != 0;
    }

    public static boolean Z(G0 g02, G.b bVar) {
        InterfaceC2212D.b bVar2 = g02.f14329b;
        Z0.G g6 = g02.f14328a;
        return g6.q() || g6.h(bVar2.f19753a, bVar).f6666f;
    }

    public static /* synthetic */ void g(C1333g0 c1333g0, H0 h02) {
        c1333g0.getClass();
        try {
            c1333g0.u(h02);
        } catch (C1342l e6) {
            AbstractC1133o.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e6);
            throw new RuntimeException(e6);
        }
    }

    public final void A(J0 j02) {
        if (j02.f() == 2) {
            j02.stop();
        }
    }

    public final void A0(long j6) {
        C1347n0 t6 = this.f14613s.t();
        long B6 = t6 == null ? j6 + 1000000000000L : t6.B(j6);
        this.f14586W = B6;
        this.f14609o.c(B6);
        for (J0 j02 : this.f14590a) {
            if (X(j02)) {
                j02.O(this.f14586W);
            }
        }
        l0();
    }

    public final synchronized void A1(y6.u uVar, long j6) {
        long b6 = this.f14611q.b() + j6;
        boolean z6 = false;
        while (!((Boolean) uVar.get()).booleanValue() && j6 > 0) {
            try {
                this.f14611q.f();
                wait(j6);
            } catch (InterruptedException unused) {
                z6 = true;
            }
            j6 = b6 - this.f14611q.b();
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    public void B(long j6) {
        this.f14593b0 = j6;
    }

    public final z6.w C(z1.x[] xVarArr) {
        w.a aVar = new w.a();
        boolean z6 = false;
        for (z1.x xVar : xVarArr) {
            if (xVar != null) {
                Z0.x xVar2 = xVar.h(0).f6987k;
                if (xVar2 == null) {
                    aVar.h(new Z0.x(new x.b[0]));
                } else {
                    aVar.h(xVar2);
                    z6 = true;
                }
            }
        }
        return z6 ? aVar.k() : z6.w.w();
    }

    public final long D() {
        G0 g02 = this.f14620z;
        return F(g02.f14328a, g02.f14329b.f19753a, g02.f14346s);
    }

    public final void D0(Z0.G g6, Z0.G g7) {
        if (g6.q() && g7.q()) {
            return;
        }
        int size = this.f14610p.size() - 1;
        while (size >= 0) {
            Z0.G g8 = g6;
            Z0.G g9 = g7;
            if (!C0((d) this.f14610p.get(size), g8, g9, this.f14579H, this.f14580I, this.f14605k, this.f14606l)) {
                ((d) this.f14610p.get(size)).f14626a.k(false);
                this.f14610p.remove(size);
            }
            size--;
            g6 = g8;
            g7 = g9;
        }
        Collections.sort(this.f14610p);
    }

    public final long F(Z0.G g6, Object obj, long j6) {
        g6.n(g6.h(obj, this.f14606l).f6663c, this.f14605k);
        G.c cVar = this.f14605k;
        if (cVar.f6689f != -9223372036854775807L && cVar.f()) {
            G.c cVar2 = this.f14605k;
            if (cVar2.f6692i) {
                return AbstractC1117K.J0(cVar2.a() - this.f14605k.f6689f) - (j6 + this.f14606l.n());
            }
        }
        return -9223372036854775807L;
    }

    public final long G() {
        C1347n0 u6 = this.f14613s.u();
        if (u6 == null) {
            return 0L;
        }
        long m6 = u6.m();
        if (!u6.f14768d) {
            return m6;
        }
        int i6 = 0;
        while (true) {
            J0[] j0Arr = this.f14590a;
            if (i6 >= j0Arr.length) {
                return m6;
            }
            if (X(j0Arr[i6]) && this.f14590a[i6].k() == u6.f14767c[i6]) {
                long L5 = this.f14590a[i6].L();
                if (L5 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                m6 = Math.max(L5, m6);
            }
            i6++;
        }
    }

    public final Pair H(Z0.G g6) {
        if (g6.q()) {
            return Pair.create(G0.l(), 0L);
        }
        Pair j6 = g6.j(this.f14605k, this.f14606l, g6.a(this.f14580I), -9223372036854775807L);
        InterfaceC2212D.b K5 = this.f14613s.K(g6, j6.first, 0L);
        long longValue = ((Long) j6.second).longValue();
        if (K5.b()) {
            g6.h(K5.f19753a, this.f14606l);
            longValue = K5.f19755c == this.f14606l.k(K5.f19754b) ? this.f14606l.g() : 0L;
        }
        return Pair.create(K5, Long.valueOf(longValue));
    }

    public final void H0(long j6) {
        long j7 = (this.f14620z.f14332e != 3 || (!this.f14618x && l1())) ? f14571f0 : 1000L;
        if (this.f14618x && l1()) {
            for (J0 j02 : this.f14590a) {
                if (X(j02)) {
                    j7 = Math.min(j7, AbstractC1117K.k1(j02.r(this.f14586W, this.f14587X)));
                }
            }
        }
        this.f14602h.g(2, j6 + j7);
    }

    public Looper I() {
        return this.f14604j;
    }

    public void I0(Z0.G g6, int i6, long j6) {
        this.f14602h.i(3, new h(g6, i6, j6)).a();
    }

    public final long J() {
        return K(this.f14620z.f14344q);
    }

    public final void J0(boolean z6) {
        InterfaceC2212D.b bVar = this.f14613s.t().f14770f.f14781a;
        long M02 = M0(bVar, this.f14620z.f14346s, true, false);
        if (M02 != this.f14620z.f14346s) {
            G0 g02 = this.f14620z;
            this.f14620z = S(bVar, M02, g02.f14330c, g02.f14331d, z6, 5);
        }
    }

    public final long K(long j6) {
        C1347n0 m6 = this.f14613s.m();
        if (m6 == null) {
            return 0L;
        }
        return Math.max(0L, j6 - m6.A(this.f14586W));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a1 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:6:0x0097, B:8:0x00a1, B:16:0x00ad, B:18:0x00b3, B:19:0x00b6, B:20:0x00be, B:55:0x00d0, B:59:0x00d8), top: B:5:0x0097 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K0(g1.C1333g0.h r20) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C1333g0.K0(g1.g0$h):void");
    }

    public final void L(InterfaceC2211C interfaceC2211C) {
        if (this.f14613s.B(interfaceC2211C)) {
            this.f14613s.E(this.f14586W);
            a0();
        }
    }

    public final long L0(InterfaceC2212D.b bVar, long j6, boolean z6) {
        return M0(bVar, j6, this.f14613s.t() != this.f14613s.u(), z6);
    }

    public final void M(IOException iOException, int i6) {
        C1342l c6 = C1342l.c(iOException, i6);
        C1347n0 t6 = this.f14613s.t();
        if (t6 != null) {
            c6 = c6.a(t6.f14770f.f14781a);
        }
        AbstractC1133o.d("ExoPlayerImplInternal", "Playback error", c6);
        q1(false, false);
        this.f14620z = this.f14620z.f(c6);
    }

    public final long M0(InterfaceC2212D.b bVar, long j6, boolean z6, boolean z7) {
        r1();
        y1(false, true);
        if (z7 || this.f14620z.f14332e == 3) {
            i1(2);
        }
        C1347n0 t6 = this.f14613s.t();
        C1347n0 c1347n0 = t6;
        while (c1347n0 != null && !bVar.equals(c1347n0.f14770f.f14781a)) {
            c1347n0 = c1347n0.k();
        }
        if (z6 || t6 != c1347n0 || (c1347n0 != null && c1347n0.B(j6) < 0)) {
            for (J0 j02 : this.f14590a) {
                v(j02);
            }
            if (c1347n0 != null) {
                while (this.f14613s.t() != c1347n0) {
                    this.f14613s.b();
                }
                this.f14613s.H(c1347n0);
                c1347n0.z(1000000000000L);
                y();
            }
        }
        if (c1347n0 != null) {
            this.f14613s.H(c1347n0);
            if (!c1347n0.f14768d) {
                c1347n0.f14770f = c1347n0.f14770f.b(j6);
            } else if (c1347n0.f14769e) {
                j6 = c1347n0.f14765a.m(j6);
                c1347n0.f14765a.t(j6 - this.f14607m, this.f14608n);
            }
            A0(j6);
            a0();
        } else {
            this.f14613s.f();
            A0(j6);
        }
        N(false);
        this.f14602h.f(2);
        return j6;
    }

    public final void N(boolean z6) {
        C1347n0 m6 = this.f14613s.m();
        InterfaceC2212D.b bVar = m6 == null ? this.f14620z.f14329b : m6.f14770f.f14781a;
        boolean equals = this.f14620z.f14338k.equals(bVar);
        if (!equals) {
            this.f14620z = this.f14620z.c(bVar);
        }
        G0 g02 = this.f14620z;
        g02.f14344q = m6 == null ? g02.f14346s : m6.j();
        this.f14620z.f14345r = J();
        if ((!equals || z6) && m6 != null && m6.f14768d) {
            t1(m6.f14770f.f14781a, m6.o(), m6.p());
        }
    }

    public final void N0(H0 h02) {
        if (h02.f() == -9223372036854775807L) {
            O0(h02);
            return;
        }
        if (this.f14620z.f14328a.q()) {
            this.f14610p.add(new d(h02));
            return;
        }
        d dVar = new d(h02);
        Z0.G g6 = this.f14620z.f14328a;
        if (!C0(dVar, g6, g6, this.f14579H, this.f14580I, this.f14605k, this.f14606l)) {
            h02.k(false);
        } else {
            this.f14610p.add(dVar);
            Collections.sort(this.f14610p);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(Z0.G r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C1333g0.O(Z0.G, boolean):void");
    }

    public final void O0(H0 h02) {
        if (h02.c() != this.f14604j) {
            this.f14602h.i(15, h02).a();
            return;
        }
        u(h02);
        int i6 = this.f14620z.f14332e;
        if (i6 == 3 || i6 == 2) {
            this.f14602h.f(2);
        }
    }

    public final void P(InterfaceC2211C interfaceC2211C) {
        if (this.f14613s.B(interfaceC2211C)) {
            C1347n0 m6 = this.f14613s.m();
            m6.q(this.f14609o.g().f6620a, this.f14620z.f14328a);
            t1(m6.f14770f.f14781a, m6.o(), m6.p());
            if (m6 == this.f14613s.t()) {
                A0(m6.f14770f.f14782b);
                y();
                G0 g02 = this.f14620z;
                InterfaceC2212D.b bVar = g02.f14329b;
                long j6 = m6.f14770f.f14782b;
                this.f14620z = S(bVar, j6, g02.f14330c, j6, false, 5);
            }
            a0();
        }
    }

    public final void P0(final H0 h02) {
        Looper c6 = h02.c();
        if (c6.getThread().isAlive()) {
            this.f14611q.e(c6, null).c(new Runnable() { // from class: g1.e0
                @Override // java.lang.Runnable
                public final void run() {
                    C1333g0.g(C1333g0.this, h02);
                }
            });
        } else {
            AbstractC1133o.h("TAG", "Trying to send message on a dead thread.");
            h02.k(false);
        }
    }

    public final void Q(Z0.B b6, float f6, boolean z6, boolean z7) {
        if (z6) {
            if (z7) {
                this.f14572A.b(1);
            }
            this.f14620z = this.f14620z.g(b6);
        }
        z1(b6.f6620a);
        for (J0 j02 : this.f14590a) {
            if (j02 != null) {
                j02.B(f6, b6.f6620a);
            }
        }
    }

    public final void Q0(long j6) {
        for (J0 j02 : this.f14590a) {
            if (j02.k() != null) {
                R0(j02, j6);
            }
        }
    }

    public final void R(Z0.B b6, boolean z6) {
        Q(b6, b6.f6620a, true, z6);
    }

    public final void R0(J0 j02, long j6) {
        j02.u();
        if (j02 instanceof C2352i) {
            ((C2352i) j02).H0(j6);
        }
    }

    public final G0 S(InterfaceC2212D.b bVar, long j6, long j7, long j8, boolean z6, int i6) {
        List list;
        w1.l0 l0Var;
        C2444D c2444d;
        this.f14589Z = (!this.f14589Z && j6 == this.f14620z.f14346s && bVar.equals(this.f14620z.f14329b)) ? false : true;
        z0();
        G0 g02 = this.f14620z;
        w1.l0 l0Var2 = g02.f14335h;
        C2444D c2444d2 = g02.f14336i;
        List list2 = g02.f14337j;
        if (this.f14614t.t()) {
            C1347n0 t6 = this.f14613s.t();
            w1.l0 o6 = t6 == null ? w1.l0.f20068d : t6.o();
            C2444D p6 = t6 == null ? this.f14598e : t6.p();
            List C6 = C(p6.f21481c);
            if (t6 != null) {
                C1349o0 c1349o0 = t6.f14770f;
                if (c1349o0.f14783c != j7) {
                    t6.f14770f = c1349o0.a(j7);
                }
            }
            e0();
            l0Var = o6;
            c2444d = p6;
            list = C6;
        } else {
            if (!bVar.equals(this.f14620z.f14329b)) {
                l0Var2 = w1.l0.f20068d;
                c2444d2 = this.f14598e;
                list2 = z6.w.w();
            }
            list = list2;
            l0Var = l0Var2;
            c2444d = c2444d2;
        }
        if (z6) {
            this.f14572A.d(i6);
        }
        return this.f14620z.d(bVar, j6, j7, j8, J(), l0Var, c2444d, list);
    }

    public final void S0(boolean z6, AtomicBoolean atomicBoolean) {
        if (this.f14581J != z6) {
            this.f14581J = z6;
            if (!z6) {
                for (J0 j02 : this.f14590a) {
                    if (!X(j02) && this.f14592b.remove(j02)) {
                        j02.a();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final boolean T(J0 j02, C1347n0 c1347n0) {
        C1347n0 k6 = c1347n0.k();
        if (c1347n0.f14770f.f14786f && k6.f14768d) {
            return (j02 instanceof C2352i) || (j02 instanceof q1.c) || j02.L() >= k6.n();
        }
        return false;
    }

    public final void T0(Z0.B b6) {
        this.f14602h.h(16);
        this.f14609o.e(b6);
    }

    public final boolean U() {
        C1347n0 u6 = this.f14613s.u();
        if (!u6.f14768d) {
            return false;
        }
        int i6 = 0;
        while (true) {
            J0[] j0Arr = this.f14590a;
            if (i6 >= j0Arr.length) {
                return true;
            }
            J0 j02 = j0Arr[i6];
            w1.b0 b0Var = u6.f14767c[i6];
            if (j02.k() != b0Var || (b0Var != null && !j02.p() && !T(j02, u6))) {
                break;
            }
            i6++;
        }
        return false;
    }

    public final void U0(b bVar) {
        this.f14572A.b(1);
        if (bVar.f14624c != -1) {
            this.f14585V = new h(new I0(bVar.f14622a, bVar.f14623b), bVar.f14624c, bVar.f14625d);
        }
        O(this.f14614t.B(bVar.f14622a, bVar.f14623b), false);
    }

    public void V0(List list, int i6, long j6, w1.d0 d0Var) {
        this.f14602h.i(17, new b(list, d0Var, i6, j6, null)).a();
    }

    public final boolean W() {
        C1347n0 m6 = this.f14613s.m();
        return (m6 == null || m6.r() || m6.l() == Long.MIN_VALUE) ? false : true;
    }

    public final void W0(boolean z6) {
        if (z6 == this.f14583L) {
            return;
        }
        this.f14583L = z6;
        if (z6 || !this.f14620z.f14343p) {
            return;
        }
        this.f14602h.f(2);
    }

    public final void X0(boolean z6) {
        this.f14574C = z6;
        z0();
        if (!this.f14575D || this.f14613s.u() == this.f14613s.t()) {
            return;
        }
        J0(true);
        N(false);
    }

    public final boolean Y() {
        C1347n0 t6 = this.f14613s.t();
        long j6 = t6.f14770f.f14785e;
        if (t6.f14768d) {
            return j6 == -9223372036854775807L || this.f14620z.f14346s < j6 || !l1();
        }
        return false;
    }

    public void Y0(boolean z6, int i6, int i7) {
        this.f14602h.a(1, z6 ? 1 : 0, i6 | (i7 << 4)).a();
    }

    public final void Z0(boolean z6, int i6, boolean z7, int i7) {
        this.f14572A.b(z7 ? 1 : 0);
        this.f14620z = this.f14620z.e(z6, i7, i6);
        y1(false, false);
        m0(z6);
        if (!l1()) {
            r1();
            w1();
            return;
        }
        int i8 = this.f14620z.f14332e;
        if (i8 == 3) {
            this.f14609o.f();
            o1();
            this.f14602h.f(2);
        } else if (i8 == 2) {
            this.f14602h.f(2);
        }
    }

    @Override // z1.AbstractC2443C.a
    public void a(J0 j02) {
        this.f14602h.f(26);
    }

    public final void a0() {
        boolean k12 = k1();
        this.f14578G = k12;
        if (k12) {
            this.f14613s.m().e(this.f14586W, this.f14609o.g().f6620a, this.f14577F);
        }
        s1();
    }

    public void a1(Z0.B b6) {
        this.f14602h.i(4, b6).a();
    }

    @Override // z1.AbstractC2443C.a
    public void b() {
        this.f14602h.f(10);
    }

    public final void b0() {
        this.f14572A.c(this.f14620z);
        if (this.f14572A.f14630a) {
            this.f14612r.a(this.f14572A);
            this.f14572A = new e(this.f14620z);
        }
    }

    public final void b1(Z0.B b6) {
        T0(b6);
        R(this.f14609o.g(), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c0(long r9, long r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C1333g0.c0(long, long):void");
    }

    public final void c1(InterfaceC1344m.c cVar) {
        this.f14597d0 = cVar;
        this.f14613s.P(this.f14620z.f14328a, cVar);
    }

    @Override // g1.F0.d
    public void d() {
        this.f14602h.h(2);
        this.f14602h.f(22);
    }

    public final boolean d0() {
        C1349o0 s6;
        this.f14613s.E(this.f14586W);
        boolean z6 = false;
        if (this.f14613s.N() && (s6 = this.f14613s.s(this.f14586W, this.f14620z)) != null) {
            C1347n0 g6 = this.f14613s.g(s6);
            g6.f14765a.s(this, s6.f14782b);
            if (this.f14613s.t() == g6) {
                A0(s6.f14782b);
            }
            N(false);
            z6 = true;
        }
        if (!this.f14578G) {
            a0();
            return z6;
        }
        this.f14578G = W();
        s1();
        return z6;
    }

    public void d1(int i6) {
        this.f14602h.a(11, i6, 0).a();
    }

    @Override // g1.H0.a
    public synchronized void e(H0 h02) {
        if (!this.f14573B && this.f14604j.getThread().isAlive()) {
            this.f14602h.i(14, h02).a();
            return;
        }
        AbstractC1133o.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        h02.k(false);
    }

    public final void e0() {
        boolean z6;
        C1347n0 t6 = this.f14613s.t();
        if (t6 != null) {
            C2444D p6 = t6.p();
            boolean z7 = false;
            int i6 = 0;
            boolean z8 = false;
            while (true) {
                if (i6 >= this.f14590a.length) {
                    z6 = true;
                    break;
                }
                if (p6.c(i6)) {
                    if (this.f14590a[i6].l() != 1) {
                        z6 = false;
                        break;
                    } else if (p6.f21480b[i6].f14378a != 0) {
                        z8 = true;
                    }
                }
                i6++;
            }
            if (z8 && z6) {
                z7 = true;
            }
            W0(z7);
        }
    }

    public final void e1(int i6) {
        this.f14579H = i6;
        if (!this.f14613s.R(this.f14620z.f14328a, i6)) {
            J0(true);
        }
        N(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f0() {
        /*
            r14 = this;
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r14.j1()
            if (r2 == 0) goto L6e
            if (r1 == 0) goto Ld
            r14.b0()
        Ld:
            g1.q0 r1 = r14.f14613s
            g1.n0 r1 = r1.b()
            java.lang.Object r1 = c1.AbstractC1119a.e(r1)
            g1.n0 r1 = (g1.C1347n0) r1
            g1.G0 r2 = r14.f14620z
            w1.D$b r2 = r2.f14329b
            java.lang.Object r2 = r2.f19753a
            g1.o0 r3 = r1.f14770f
            w1.D$b r3 = r3.f14781a
            java.lang.Object r3 = r3.f19753a
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 == 0) goto L45
            g1.G0 r2 = r14.f14620z
            w1.D$b r2 = r2.f14329b
            int r4 = r2.f19754b
            r5 = -1
            if (r4 != r5) goto L45
            g1.o0 r4 = r1.f14770f
            w1.D$b r4 = r4.f14781a
            int r6 = r4.f19754b
            if (r6 != r5) goto L45
            int r2 = r2.f19757e
            int r4 = r4.f19757e
            if (r2 == r4) goto L45
            r2 = r3
            goto L46
        L45:
            r2 = r0
        L46:
            g1.o0 r1 = r1.f14770f
            w1.D$b r5 = r1.f14781a
            long r6 = r1.f14782b
            long r8 = r1.f14783c
            r12 = r2 ^ 1
            r13 = 0
            r10 = r6
            r4 = r14
            g1.G0 r1 = r4.S(r5, r6, r8, r10, r12, r13)
            r4.f14620z = r1
            r14.z0()
            r14.w1()
            g1.G0 r1 = r4.f14620z
            int r1 = r1.f14332e
            r2 = 3
            if (r1 != r2) goto L69
            r14.o1()
        L69:
            r14.r()
            r1 = r3
            goto L2
        L6e:
            r4 = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C1333g0.f0():void");
    }

    public final void f1(N0 n02) {
        this.f14619y = n02;
    }

    public final void g0(boolean z6) {
        if (this.f14597d0.f14763a != -9223372036854775807L) {
            if (z6 || !this.f14620z.f14328a.equals(this.f14599e0)) {
                Z0.G g6 = this.f14620z.f14328a;
                this.f14599e0 = g6;
                this.f14613s.x(g6);
            }
        }
    }

    public final void g1(boolean z6) {
        this.f14580I = z6;
        if (!this.f14613s.S(this.f14620z.f14328a, z6)) {
            J0(true);
        }
        N(false);
    }

    public final void h0() {
        C1347n0 u6 = this.f14613s.u();
        if (u6 == null) {
            return;
        }
        int i6 = 0;
        if (u6.k() != null && !this.f14575D) {
            if (U()) {
                if (u6.k().f14768d || this.f14586W >= u6.k().n()) {
                    C2444D p6 = u6.p();
                    C1347n0 c6 = this.f14613s.c();
                    C2444D p7 = c6.p();
                    Z0.G g6 = this.f14620z.f14328a;
                    x1(g6, c6.f14770f.f14781a, g6, u6.f14770f.f14781a, -9223372036854775807L, false);
                    if (c6.f14768d && c6.f14765a.p() != -9223372036854775807L) {
                        Q0(c6.n());
                        if (c6.s()) {
                            return;
                        }
                        this.f14613s.H(c6);
                        N(false);
                        a0();
                        return;
                    }
                    for (int i7 = 0; i7 < this.f14590a.length; i7++) {
                        boolean c7 = p6.c(i7);
                        boolean c8 = p7.c(i7);
                        if (c7 && !this.f14590a[i7].P()) {
                            boolean z6 = this.f14594c[i7].l() == -2;
                            L0 l02 = p6.f21480b[i7];
                            L0 l03 = p7.f21480b[i7];
                            if (!c8 || !l03.equals(l02) || z6) {
                                R0(this.f14590a[i7], c6.n());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!u6.f14770f.f14789i && !this.f14575D) {
            return;
        }
        while (true) {
            J0[] j0Arr = this.f14590a;
            if (i6 >= j0Arr.length) {
                return;
            }
            J0 j02 = j0Arr[i6];
            w1.b0 b0Var = u6.f14767c[i6];
            if (b0Var != null && j02.k() == b0Var && j02.p()) {
                long j6 = u6.f14770f.f14785e;
                R0(j02, (j6 == -9223372036854775807L || j6 == Long.MIN_VALUE) ? -9223372036854775807L : u6.m() + u6.f14770f.f14785e);
            }
            i6++;
        }
    }

    public final void h1(w1.d0 d0Var) {
        this.f14572A.b(1);
        O(this.f14614t.C(d0Var), false);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i6;
        C1347n0 u6;
        int i7;
        try {
            switch (message.what) {
                case 1:
                    boolean z6 = message.arg1 != 0;
                    int i8 = message.arg2;
                    Z0(z6, i8 >> 4, true, i8 & 15);
                    break;
                case 2:
                    w();
                    break;
                case 3:
                    K0((h) message.obj);
                    break;
                case 4:
                    b1((Z0.B) message.obj);
                    break;
                case 5:
                    f1((N0) message.obj);
                    break;
                case 6:
                    q1(false, true);
                    break;
                case 7:
                    s0();
                    return true;
                case 8:
                    P((InterfaceC2211C) message.obj);
                    break;
                case 9:
                    L((InterfaceC2211C) message.obj);
                    break;
                case 10:
                    w0();
                    break;
                case 11:
                    e1(message.arg1);
                    break;
                case 12:
                    g1(message.arg1 != 0);
                    break;
                case 13:
                    S0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    N0((H0) message.obj);
                    break;
                case 15:
                    P0((H0) message.obj);
                    break;
                case 16:
                    R((Z0.B) message.obj, false);
                    break;
                case 17:
                    U0((b) message.obj);
                    break;
                case 18:
                    q((b) message.obj, message.arg1);
                    break;
                case 19:
                    android.support.v4.media.session.b.a(message.obj);
                    k0(null);
                    break;
                case 20:
                    u0(message.arg1, message.arg2, (w1.d0) message.obj);
                    break;
                case 21:
                    h1((w1.d0) message.obj);
                    break;
                case 22:
                    j0();
                    break;
                case 23:
                    X0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    s();
                    break;
                case 26:
                    x0();
                    break;
                case 27:
                    u1(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    c1((InterfaceC1344m.c) message.obj);
                    break;
                case 29:
                    q0();
                    break;
            }
        } catch (Z0.z e6) {
            int i9 = e6.f7291b;
            if (i9 == 1) {
                i7 = e6.f7290a ? 3001 : 3003;
            } else {
                if (i9 == 4) {
                    i7 = e6.f7290a ? 3002 : 3004;
                }
                M(e6, r4);
            }
            r4 = i7;
            M(e6, r4);
        } catch (C1249g e7) {
            M(e7, e7.f13813a);
        } catch (C1342l e8) {
            e = e8;
            if (e.f14715j == 1 && (u6 = this.f14613s.u()) != null) {
                e = e.a(u6.f14770f.f14781a);
            }
            if (e.f14721p && (this.f14591a0 == null || (i6 = e.f6614a) == 5004 || i6 == 5003)) {
                AbstractC1133o.i("ExoPlayerImplInternal", "Recoverable renderer error", e);
                C1342l c1342l = this.f14591a0;
                if (c1342l != null) {
                    c1342l.addSuppressed(e);
                    e = this.f14591a0;
                } else {
                    this.f14591a0 = e;
                }
                InterfaceC1129k interfaceC1129k = this.f14602h;
                interfaceC1129k.b(interfaceC1129k.i(25, e));
            } else {
                C1342l c1342l2 = this.f14591a0;
                if (c1342l2 != null) {
                    c1342l2.addSuppressed(e);
                    e = this.f14591a0;
                }
                AbstractC1133o.d("ExoPlayerImplInternal", "Playback error", e);
                if (e.f14715j == 1 && this.f14613s.t() != this.f14613s.u()) {
                    while (this.f14613s.t() != this.f14613s.u()) {
                        this.f14613s.b();
                    }
                    C1347n0 c1347n0 = (C1347n0) AbstractC1119a.e(this.f14613s.t());
                    b0();
                    C1349o0 c1349o0 = c1347n0.f14770f;
                    InterfaceC2212D.b bVar = c1349o0.f14781a;
                    long j6 = c1349o0.f14782b;
                    this.f14620z = S(bVar, j6, c1349o0.f14783c, j6, true, 0);
                }
                q1(true, false);
                this.f14620z = this.f14620z.f(e);
            }
        } catch (InterfaceC1743m.a e9) {
            M(e9, e9.f17010a);
        } catch (IOException e10) {
            M(e10, 2000);
        } catch (RuntimeException e11) {
            C1342l d6 = C1342l.d(e11, ((e11 instanceof IllegalStateException) || (e11 instanceof IllegalArgumentException)) ? 1004 : 1000);
            AbstractC1133o.d("ExoPlayerImplInternal", "Playback error", d6);
            q1(true, false);
            this.f14620z = this.f14620z.f(d6);
        } catch (C2217b e12) {
            M(e12, 1002);
        }
        b0();
        return true;
    }

    @Override // w1.InterfaceC2211C.a
    public void i(InterfaceC2211C interfaceC2211C) {
        this.f14602h.i(8, interfaceC2211C).a();
    }

    public final void i0() {
        C1347n0 u6 = this.f14613s.u();
        if (u6 == null || this.f14613s.t() == u6 || u6.f14771g || !v0()) {
            return;
        }
        y();
    }

    public final void i1(int i6) {
        G0 g02 = this.f14620z;
        if (g02.f14332e != i6) {
            if (i6 != 2) {
                this.f14595c0 = -9223372036854775807L;
            }
            this.f14620z = g02.h(i6);
        }
    }

    public final void j0() {
        O(this.f14614t.i(), true);
    }

    public final boolean j1() {
        C1347n0 t6;
        C1347n0 k6;
        return l1() && !this.f14575D && (t6 = this.f14613s.t()) != null && (k6 = t6.k()) != null && this.f14586W >= k6.n() && k6.f14771g;
    }

    public final void k0(c cVar) {
        this.f14572A.b(1);
        throw null;
    }

    public final boolean k1() {
        if (!W()) {
            return false;
        }
        C1347n0 m6 = this.f14613s.m();
        long K5 = K(m6.l());
        InterfaceC1341k0.a aVar = new InterfaceC1341k0.a(this.f14617w, this.f14620z.f14328a, m6.f14770f.f14781a, m6 == this.f14613s.t() ? m6.A(this.f14586W) : m6.A(this.f14586W) - m6.f14770f.f14782b, K5, this.f14609o.g().f6620a, this.f14620z.f14339l, this.f14576E, n1(this.f14620z.f14328a, m6.f14770f.f14781a) ? this.f14615u.b() : -9223372036854775807L);
        boolean a6 = this.f14600f.a(aVar);
        C1347n0 t6 = this.f14613s.t();
        if (a6 || !t6.f14768d || K5 >= 500000) {
            return a6;
        }
        if (this.f14607m <= 0 && !this.f14608n) {
            return a6;
        }
        t6.f14765a.t(this.f14620z.f14346s, false);
        return this.f14600f.a(aVar);
    }

    public final void l0() {
        for (C1347n0 t6 = this.f14613s.t(); t6 != null; t6 = t6.k()) {
            for (z1.x xVar : t6.p().f21481c) {
                if (xVar != null) {
                    xVar.s();
                }
            }
        }
    }

    public final boolean l1() {
        G0 g02 = this.f14620z;
        return g02.f14339l && g02.f14341n == 0;
    }

    @Override // g1.C1338j.a
    public void m(Z0.B b6) {
        this.f14602h.i(16, b6).a();
    }

    public final void m0(boolean z6) {
        for (C1347n0 t6 = this.f14613s.t(); t6 != null; t6 = t6.k()) {
            for (z1.x xVar : t6.p().f21481c) {
                if (xVar != null) {
                    xVar.g(z6);
                }
            }
        }
    }

    public final boolean m1(boolean z6) {
        if (this.f14584M == 0) {
            return Y();
        }
        if (!z6) {
            return false;
        }
        if (!this.f14620z.f14334g) {
            return true;
        }
        C1347n0 t6 = this.f14613s.t();
        long b6 = n1(this.f14620z.f14328a, t6.f14770f.f14781a) ? this.f14615u.b() : -9223372036854775807L;
        C1347n0 m6 = this.f14613s.m();
        return (m6.s() && m6.f14770f.f14789i) || (m6.f14770f.f14781a.b() && !m6.f14768d) || this.f14600f.g(new InterfaceC1341k0.a(this.f14617w, this.f14620z.f14328a, t6.f14770f.f14781a, t6.A(this.f14586W), J(), this.f14609o.g().f6620a, this.f14620z.f14339l, this.f14576E, b6));
    }

    public final void n0() {
        for (C1347n0 t6 = this.f14613s.t(); t6 != null; t6 = t6.k()) {
            for (z1.x xVar : t6.p().f21481c) {
                if (xVar != null) {
                    xVar.t();
                }
            }
        }
    }

    public final boolean n1(Z0.G g6, InterfaceC2212D.b bVar) {
        if (!bVar.b() && !g6.q()) {
            g6.n(g6.h(bVar.f19753a, this.f14606l).f6663c, this.f14605k);
            if (this.f14605k.f()) {
                G.c cVar = this.f14605k;
                if (cVar.f6692i && cVar.f6689f != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // w1.c0.a
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void j(InterfaceC2211C interfaceC2211C) {
        this.f14602h.i(9, interfaceC2211C).a();
    }

    public final void o1() {
        C1347n0 t6 = this.f14613s.t();
        if (t6 == null) {
            return;
        }
        C2444D p6 = t6.p();
        for (int i6 = 0; i6 < this.f14590a.length; i6++) {
            if (p6.c(i6) && this.f14590a[i6].f() == 1) {
                this.f14590a[i6].start();
            }
        }
    }

    public void p0() {
        this.f14602h.d(29).a();
    }

    public void p1() {
        this.f14602h.d(6).a();
    }

    public final void q(b bVar, int i6) {
        this.f14572A.b(1);
        F0 f02 = this.f14614t;
        if (i6 == -1) {
            i6 = f02.r();
        }
        O(f02.f(i6, bVar.f14622a, bVar.f14623b), false);
    }

    public final void q0() {
        this.f14572A.b(1);
        y0(false, false, false, true);
        this.f14600f.e(this.f14617w);
        i1(this.f14620z.f14328a.q() ? 4 : 2);
        this.f14614t.v(this.f14601g.d());
        this.f14602h.f(2);
    }

    public final void q1(boolean z6, boolean z7) {
        y0(z6 || !this.f14581J, false, true, false);
        this.f14572A.b(z7 ? 1 : 0);
        this.f14600f.i(this.f14617w);
        i1(1);
    }

    public final void r() {
        C2444D p6 = this.f14613s.t().p();
        for (int i6 = 0; i6 < this.f14590a.length; i6++) {
            if (p6.c(i6)) {
                this.f14590a[i6].h();
            }
        }
    }

    public synchronized boolean r0() {
        if (!this.f14573B && this.f14604j.getThread().isAlive()) {
            this.f14602h.f(7);
            A1(new y6.u() { // from class: g1.d0
                public final Object get() {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(C1333g0.this.f14573B);
                    return valueOf;
                }
            }, this.f14616v);
            return this.f14573B;
        }
        return true;
    }

    public final void r1() {
        this.f14609o.h();
        for (J0 j02 : this.f14590a) {
            if (X(j02)) {
                A(j02);
            }
        }
    }

    public final void s() {
        x0();
    }

    public final void s0() {
        try {
            y0(true, false, true, false);
            t0();
            this.f14600f.f(this.f14617w);
            i1(1);
            HandlerThread handlerThread = this.f14603i;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.f14573B = true;
                notifyAll();
            }
        } catch (Throwable th) {
            HandlerThread handlerThread2 = this.f14603i;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.f14573B = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final void s1() {
        C1347n0 m6 = this.f14613s.m();
        boolean z6 = this.f14578G || (m6 != null && m6.f14765a.e());
        G0 g02 = this.f14620z;
        if (z6 != g02.f14334g) {
            this.f14620z = g02.b(z6);
        }
    }

    public final C1347n0 t(C1349o0 c1349o0, long j6) {
        return new C1347n0(this.f14594c, j6, this.f14596d, this.f14600f.h(), this.f14614t, c1349o0, this.f14598e);
    }

    public final void t0() {
        for (int i6 = 0; i6 < this.f14590a.length; i6++) {
            this.f14594c[i6].n();
            this.f14590a[i6].release();
        }
    }

    public final void t1(InterfaceC2212D.b bVar, w1.l0 l0Var, C2444D c2444d) {
        this.f14600f.b(this.f14617w, this.f14620z.f14328a, bVar, this.f14590a, l0Var, c2444d.f21481c);
    }

    public final void u(H0 h02) {
        if (h02.j()) {
            return;
        }
        try {
            h02.g().H(h02.i(), h02.e());
        } finally {
            h02.k(true);
        }
    }

    public final void u0(int i6, int i7, w1.d0 d0Var) {
        this.f14572A.b(1);
        O(this.f14614t.z(i6, i7, d0Var), false);
    }

    public final void u1(int i6, int i7, List list) {
        this.f14572A.b(1);
        O(this.f14614t.D(i6, i7, list), false);
    }

    public final void v(J0 j02) {
        if (X(j02)) {
            this.f14609o.a(j02);
            A(j02);
            j02.j();
            this.f14584M--;
        }
    }

    public final boolean v0() {
        C1347n0 u6 = this.f14613s.u();
        C2444D p6 = u6.p();
        int i6 = 0;
        boolean z6 = false;
        while (true) {
            J0[] j0Arr = this.f14590a;
            if (i6 >= j0Arr.length) {
                return !z6;
            }
            J0 j02 = j0Arr[i6];
            if (X(j02)) {
                boolean z7 = j02.k() != u6.f14767c[i6];
                if (!p6.c(i6) || z7) {
                    if (!j02.P()) {
                        j02.t(E(p6.f21481c[i6]), u6.f14767c[i6], u6.n(), u6.m(), u6.f14770f.f14781a);
                        if (this.f14583L) {
                            W0(false);
                        }
                    } else if (j02.d()) {
                        v(j02);
                    } else {
                        z6 = true;
                    }
                }
            }
            i6++;
        }
    }

    public final void v1() {
        if (this.f14620z.f14328a.q() || !this.f14614t.t()) {
            return;
        }
        boolean d02 = d0();
        h0();
        i0();
        f0();
        g0(d02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cf, code lost:
    
        if (r11 <= r17.f14620z.f14346s) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C1333g0.w():void");
    }

    public final void w0() {
        float f6 = this.f14609o.g().f6620a;
        C1347n0 u6 = this.f14613s.u();
        C2444D c2444d = null;
        boolean z6 = true;
        for (C1347n0 t6 = this.f14613s.t(); t6 != null && t6.f14768d; t6 = t6.k()) {
            C2444D x6 = t6.x(f6, this.f14620z.f14328a);
            if (t6 == this.f14613s.t()) {
                c2444d = x6;
            }
            int i6 = 0;
            if (!x6.a(t6.p())) {
                if (z6) {
                    C1347n0 t7 = this.f14613s.t();
                    boolean H6 = this.f14613s.H(t7);
                    boolean[] zArr = new boolean[this.f14590a.length];
                    long b6 = t7.b((C2444D) AbstractC1119a.e(c2444d), this.f14620z.f14346s, H6, zArr);
                    G0 g02 = this.f14620z;
                    boolean z7 = (g02.f14332e == 4 || b6 == g02.f14346s) ? false : true;
                    G0 g03 = this.f14620z;
                    this.f14620z = S(g03.f14329b, b6, g03.f14330c, g03.f14331d, z7, 5);
                    if (z7) {
                        A0(b6);
                    }
                    boolean[] zArr2 = new boolean[this.f14590a.length];
                    while (true) {
                        J0[] j0Arr = this.f14590a;
                        if (i6 >= j0Arr.length) {
                            break;
                        }
                        J0 j02 = j0Arr[i6];
                        boolean X5 = X(j02);
                        zArr2[i6] = X5;
                        w1.b0 b0Var = t7.f14767c[i6];
                        if (X5) {
                            if (b0Var != j02.k()) {
                                v(j02);
                            } else if (zArr[i6]) {
                                j02.O(this.f14586W);
                            }
                        }
                        i6++;
                    }
                    z(zArr2, this.f14586W);
                } else {
                    this.f14613s.H(t6);
                    if (t6.f14768d) {
                        t6.a(x6, Math.max(t6.f14770f.f14782b, t6.A(this.f14586W)), false);
                    }
                }
                N(true);
                if (this.f14620z.f14332e != 4) {
                    a0();
                    w1();
                    this.f14602h.f(2);
                    return;
                }
                return;
            }
            if (t6 == u6) {
                z6 = false;
            }
        }
    }

    public final void w1() {
        C1347n0 t6 = this.f14613s.t();
        if (t6 == null) {
            return;
        }
        long p6 = t6.f14768d ? t6.f14765a.p() : -9223372036854775807L;
        if (p6 != -9223372036854775807L) {
            if (!t6.s()) {
                this.f14613s.H(t6);
                N(false);
                a0();
            }
            A0(p6);
            if (p6 != this.f14620z.f14346s) {
                G0 g02 = this.f14620z;
                long j6 = p6;
                this.f14620z = S(g02.f14329b, j6, g02.f14330c, j6, true, 5);
            }
        } else {
            long i6 = this.f14609o.i(t6 != this.f14613s.u());
            this.f14586W = i6;
            long A6 = t6.A(i6);
            c0(this.f14620z.f14346s, A6);
            if (this.f14609o.F()) {
                boolean z6 = !this.f14572A.f14633d;
                G0 g03 = this.f14620z;
                this.f14620z = S(g03.f14329b, A6, g03.f14330c, A6, z6, 6);
            } else {
                this.f14620z.o(A6);
            }
        }
        this.f14620z.f14344q = this.f14613s.m().j();
        this.f14620z.f14345r = J();
        G0 g04 = this.f14620z;
        if (g04.f14339l && g04.f14332e == 3 && n1(g04.f14328a, g04.f14329b) && this.f14620z.f14342o.f6620a == 1.0f) {
            float a6 = this.f14615u.a(D(), J());
            if (this.f14609o.g().f6620a != a6) {
                T0(this.f14620z.f14342o.b(a6));
                Q(this.f14620z.f14342o, this.f14609o.g().f6620a, false, false);
            }
        }
    }

    public final void x(int i6, boolean z6, long j6) {
        J0 j02 = this.f14590a[i6];
        if (X(j02)) {
            return;
        }
        C1347n0 u6 = this.f14613s.u();
        boolean z7 = u6 == this.f14613s.t();
        C2444D p6 = u6.p();
        L0 l02 = p6.f21480b[i6];
        Z0.q[] E6 = E(p6.f21481c[i6]);
        boolean z8 = l1() && this.f14620z.f14332e == 3;
        boolean z9 = !z6 && z8;
        this.f14584M++;
        this.f14592b.add(j02);
        j02.Q(l02, E6, u6.f14767c[i6], this.f14586W, z9, z7, j6, u6.m(), u6.f14770f.f14781a);
        j02.H(11, new a());
        this.f14609o.b(j02);
        if (z8 && z7) {
            j02.start();
        }
    }

    public final void x0() {
        w0();
        J0(true);
    }

    public final void x1(Z0.G g6, InterfaceC2212D.b bVar, Z0.G g7, InterfaceC2212D.b bVar2, long j6, boolean z6) {
        if (!n1(g6, bVar)) {
            Z0.B b6 = bVar.b() ? Z0.B.f6617d : this.f14620z.f14342o;
            if (this.f14609o.g().equals(b6)) {
                return;
            }
            T0(b6);
            Q(this.f14620z.f14342o, b6.f6620a, false, false);
            return;
        }
        g6.n(g6.h(bVar.f19753a, this.f14606l).f6663c, this.f14605k);
        this.f14615u.d((u.g) AbstractC1117K.i(this.f14605k.f6693j));
        if (j6 != -9223372036854775807L) {
            this.f14615u.e(F(g6, bVar.f19753a, j6));
            return;
        }
        if (!AbstractC1117K.c(!g7.q() ? g7.n(g7.h(bVar2.f19753a, this.f14606l).f6663c, this.f14605k).f6684a : null, this.f14605k.f6684a) || z6) {
            this.f14615u.e(-9223372036854775807L);
        }
    }

    public final void y() {
        z(new boolean[this.f14590a.length], this.f14613s.u().n());
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        if (r5.equals(r33.f14620z.f14329b) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y0(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C1333g0.y0(boolean, boolean, boolean, boolean):void");
    }

    public final void y1(boolean z6, boolean z7) {
        this.f14576E = z6;
        this.f14577F = (!z6 || z7) ? -9223372036854775807L : this.f14611q.b();
    }

    public final void z(boolean[] zArr, long j6) {
        C1347n0 u6 = this.f14613s.u();
        C2444D p6 = u6.p();
        for (int i6 = 0; i6 < this.f14590a.length; i6++) {
            if (!p6.c(i6) && this.f14592b.remove(this.f14590a[i6])) {
                this.f14590a[i6].a();
            }
        }
        for (int i7 = 0; i7 < this.f14590a.length; i7++) {
            if (p6.c(i7)) {
                x(i7, zArr[i7], j6);
            }
        }
        u6.f14771g = true;
    }

    public final void z0() {
        C1347n0 t6 = this.f14613s.t();
        this.f14575D = t6 != null && t6.f14770f.f14788h && this.f14574C;
    }

    public final void z1(float f6) {
        for (C1347n0 t6 = this.f14613s.t(); t6 != null; t6 = t6.k()) {
            for (z1.x xVar : t6.p().f21481c) {
                if (xVar != null) {
                    xVar.q(f6);
                }
            }
        }
    }
}
