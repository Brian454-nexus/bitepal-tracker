package y;

import I.N;
import x.C2253a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class P implements N.b {

    /* renamed from: a, reason: collision with root package name */
    public static final P f20846a = new P();

    @Override // I.N.b
    public void a(I.Y0 y02, N.a aVar) {
        I.N T5 = y02.T(null);
        I.P Y5 = I.D0.Y();
        int i6 = I.N.b().i();
        if (T5 != null) {
            i6 = T5.i();
            aVar.a(T5.c());
            Y5 = T5.f();
        }
        aVar.r(Y5);
        C2253a c2253a = new C2253a(y02);
        aVar.s(c2253a.b0(i6));
        aVar.c(C2330t0.d(c2253a.e0(O.c())));
        aVar.e(c2253a.Z());
    }
}
