package g1;

import android.os.SystemClock;
import c1.AbstractC1117K;
import java.util.List;
import w1.InterfaceC2212D;
import z1.C2444D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class G0 {

    /* renamed from: u, reason: collision with root package name */
    public static final InterfaceC2212D.b f14327u = new InterfaceC2212D.b(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final Z0.G f14328a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2212D.b f14329b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14330c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14331d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14332e;

    /* renamed from: f, reason: collision with root package name */
    public final C1342l f14333f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14334g;

    /* renamed from: h, reason: collision with root package name */
    public final w1.l0 f14335h;

    /* renamed from: i, reason: collision with root package name */
    public final C2444D f14336i;

    /* renamed from: j, reason: collision with root package name */
    public final List f14337j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2212D.b f14338k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f14339l;

    /* renamed from: m, reason: collision with root package name */
    public final int f14340m;

    /* renamed from: n, reason: collision with root package name */
    public final int f14341n;

    /* renamed from: o, reason: collision with root package name */
    public final Z0.B f14342o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f14343p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f14344q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f14345r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f14346s;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f14347t;

    public G0(Z0.G g6, InterfaceC2212D.b bVar, long j6, long j7, int i6, C1342l c1342l, boolean z6, w1.l0 l0Var, C2444D c2444d, List list, InterfaceC2212D.b bVar2, boolean z7, int i7, int i8, Z0.B b6, long j8, long j9, long j10, long j11, boolean z8) {
        this.f14328a = g6;
        this.f14329b = bVar;
        this.f14330c = j6;
        this.f14331d = j7;
        this.f14332e = i6;
        this.f14333f = c1342l;
        this.f14334g = z6;
        this.f14335h = l0Var;
        this.f14336i = c2444d;
        this.f14337j = list;
        this.f14338k = bVar2;
        this.f14339l = z7;
        this.f14340m = i7;
        this.f14341n = i8;
        this.f14342o = b6;
        this.f14344q = j8;
        this.f14345r = j9;
        this.f14346s = j10;
        this.f14347t = j11;
        this.f14343p = z8;
    }

    public static G0 k(C2444D c2444d) {
        Z0.G g6 = Z0.G.f6652a;
        InterfaceC2212D.b bVar = f14327u;
        return new G0(g6, bVar, -9223372036854775807L, 0L, 1, null, false, w1.l0.f20068d, c2444d, z6.w.w(), bVar, false, 1, 0, Z0.B.f6617d, 0L, 0L, 0L, 0L, false);
    }

    public static InterfaceC2212D.b l() {
        return f14327u;
    }

    public G0 a() {
        return new G0(this.f14328a, this.f14329b, this.f14330c, this.f14331d, this.f14332e, this.f14333f, this.f14334g, this.f14335h, this.f14336i, this.f14337j, this.f14338k, this.f14339l, this.f14340m, this.f14341n, this.f14342o, this.f14344q, this.f14345r, m(), SystemClock.elapsedRealtime(), this.f14343p);
    }

    public G0 b(boolean z6) {
        return new G0(this.f14328a, this.f14329b, this.f14330c, this.f14331d, this.f14332e, this.f14333f, z6, this.f14335h, this.f14336i, this.f14337j, this.f14338k, this.f14339l, this.f14340m, this.f14341n, this.f14342o, this.f14344q, this.f14345r, this.f14346s, this.f14347t, this.f14343p);
    }

    public G0 c(InterfaceC2212D.b bVar) {
        return new G0(this.f14328a, this.f14329b, this.f14330c, this.f14331d, this.f14332e, this.f14333f, this.f14334g, this.f14335h, this.f14336i, this.f14337j, bVar, this.f14339l, this.f14340m, this.f14341n, this.f14342o, this.f14344q, this.f14345r, this.f14346s, this.f14347t, this.f14343p);
    }

    public G0 d(InterfaceC2212D.b bVar, long j6, long j7, long j8, long j9, w1.l0 l0Var, C2444D c2444d, List list) {
        return new G0(this.f14328a, bVar, j7, j8, this.f14332e, this.f14333f, this.f14334g, l0Var, c2444d, list, this.f14338k, this.f14339l, this.f14340m, this.f14341n, this.f14342o, this.f14344q, j9, j6, SystemClock.elapsedRealtime(), this.f14343p);
    }

    public G0 e(boolean z6, int i6, int i7) {
        return new G0(this.f14328a, this.f14329b, this.f14330c, this.f14331d, this.f14332e, this.f14333f, this.f14334g, this.f14335h, this.f14336i, this.f14337j, this.f14338k, z6, i6, i7, this.f14342o, this.f14344q, this.f14345r, this.f14346s, this.f14347t, this.f14343p);
    }

    public G0 f(C1342l c1342l) {
        return new G0(this.f14328a, this.f14329b, this.f14330c, this.f14331d, this.f14332e, c1342l, this.f14334g, this.f14335h, this.f14336i, this.f14337j, this.f14338k, this.f14339l, this.f14340m, this.f14341n, this.f14342o, this.f14344q, this.f14345r, this.f14346s, this.f14347t, this.f14343p);
    }

    public G0 g(Z0.B b6) {
        return new G0(this.f14328a, this.f14329b, this.f14330c, this.f14331d, this.f14332e, this.f14333f, this.f14334g, this.f14335h, this.f14336i, this.f14337j, this.f14338k, this.f14339l, this.f14340m, this.f14341n, b6, this.f14344q, this.f14345r, this.f14346s, this.f14347t, this.f14343p);
    }

    public G0 h(int i6) {
        return new G0(this.f14328a, this.f14329b, this.f14330c, this.f14331d, i6, this.f14333f, this.f14334g, this.f14335h, this.f14336i, this.f14337j, this.f14338k, this.f14339l, this.f14340m, this.f14341n, this.f14342o, this.f14344q, this.f14345r, this.f14346s, this.f14347t, this.f14343p);
    }

    public G0 i(boolean z6) {
        return new G0(this.f14328a, this.f14329b, this.f14330c, this.f14331d, this.f14332e, this.f14333f, this.f14334g, this.f14335h, this.f14336i, this.f14337j, this.f14338k, this.f14339l, this.f14340m, this.f14341n, this.f14342o, this.f14344q, this.f14345r, this.f14346s, this.f14347t, z6);
    }

    public G0 j(Z0.G g6) {
        return new G0(g6, this.f14329b, this.f14330c, this.f14331d, this.f14332e, this.f14333f, this.f14334g, this.f14335h, this.f14336i, this.f14337j, this.f14338k, this.f14339l, this.f14340m, this.f14341n, this.f14342o, this.f14344q, this.f14345r, this.f14346s, this.f14347t, this.f14343p);
    }

    public long m() {
        long j6;
        long j7;
        if (!n()) {
            return this.f14346s;
        }
        do {
            j6 = this.f14347t;
            j7 = this.f14346s;
        } while (j6 != this.f14347t);
        return AbstractC1117K.J0(AbstractC1117K.k1(j7) + (((float) (SystemClock.elapsedRealtime() - j6)) * this.f14342o.f6620a));
    }

    public boolean n() {
        return this.f14332e == 3 && this.f14339l && this.f14341n == 0;
    }

    public void o(long j6) {
        this.f14346s = j6;
        this.f14347t = SystemClock.elapsedRealtime();
    }
}
