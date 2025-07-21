package Z0;

import Z0.G;
import java.util.List;

/* renamed from: Z0.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0834f implements C {

    /* renamed from: a, reason: collision with root package name */
    public final G.c f6878a = new G.c();

    @Override // Z0.C
    public final boolean C() {
        G N5 = N();
        return !N5.q() && N5.n(H(), this.f6878a).f6691h;
    }

    @Override // Z0.C
    public final boolean F() {
        return d() != -1;
    }

    @Override // Z0.C
    public final boolean J() {
        G N5 = N();
        return !N5.q() && N5.n(H(), this.f6878a).f6692i;
    }

    @Override // Z0.C
    public final void Q(u uVar) {
        W(z6.w.y(uVar));
    }

    @Override // Z0.C
    public final boolean R() {
        G N5 = N();
        return !N5.q() && N5.n(H(), this.f6878a).f();
    }

    public final int S() {
        int L5 = L();
        if (L5 == 1) {
            return 0;
        }
        return L5;
    }

    public abstract void T(int i6, long j6, int i7, boolean z6);

    public final void U(long j6, int i6) {
        T(H(), j6, i6, false);
    }

    public final void V(int i6, int i7) {
        T(i6, -9223372036854775807L, i7, false);
    }

    public final void W(List list) {
        u(list, true);
    }

    public final long b() {
        G N5 = N();
        if (N5.q()) {
            return -9223372036854775807L;
        }
        return N5.n(H(), this.f6878a).d();
    }

    @Override // Z0.C
    public final void c() {
        z(false);
    }

    public final int d() {
        G N5 = N();
        if (N5.q()) {
            return -1;
        }
        return N5.e(H(), S(), O());
    }

    public final int f() {
        G N5 = N();
        if (N5.q()) {
            return -1;
        }
        return N5.l(H(), S(), O());
    }

    @Override // Z0.C
    public final void j() {
        z(true);
    }

    @Override // Z0.C
    public final void t() {
        V(H(), 4);
    }

    @Override // Z0.C
    public final boolean v() {
        return f() != -1;
    }

    @Override // Z0.C
    public final void x(long j6) {
        U(j6, 5);
    }
}
