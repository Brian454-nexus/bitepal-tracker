package y;

import I.C0464y0;
import I.L0;
import android.util.Size;
import x.C2253a;
import x.C2255c;

/* renamed from: y.k0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2313k0 implements L0.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2313k0 f21014a = new C2313k0();

    @Override // I.L0.d
    public void a(Size size, I.Y0 y02, L0.b bVar) {
        I.L0 I6 = y02.I(null);
        I.P Y5 = I.D0.Y();
        int l6 = I.L0.a().l();
        if (I6 != null) {
            l6 = I6.l();
            bVar.a(I6.b());
            bVar.c(I6.i());
            bVar.b(I6.g());
            Y5 = I6.d();
        }
        bVar.u(Y5);
        if (y02 instanceof I.E0) {
            C.o.b(size, bVar);
        }
        C2253a c2253a = new C2253a(y02);
        bVar.w(c2253a.b0(l6));
        bVar.e(c2253a.c0(AbstractC2321o0.b()));
        bVar.k(c2253a.f0(AbstractC2319n0.b()));
        bVar.d(C2330t0.d(c2253a.e0(O.c())));
        C0464y0 a02 = C0464y0.a0();
        a02.H(C2253a.f20387M, c2253a.Y(C2255c.e()));
        a02.H(C2253a.f20389O, c2253a.d0(null));
        a02.H(C2253a.f20383I, Long.valueOf(c2253a.g0(-1L)));
        bVar.g(a02);
        bVar.g(c2253a.Z());
    }
}
