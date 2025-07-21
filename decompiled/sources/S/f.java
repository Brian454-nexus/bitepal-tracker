package S;

import F.Z;
import I.AbstractC0457v;
import I.EnumC0446p;
import I.EnumC0451s;
import I.InterfaceC0455u;
import I.r;
import S.c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f extends a {
    public f(int i6, c.a aVar) {
        super(i6, aVar);
    }

    @Override // S.a, S.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(androidx.camera.core.d dVar) {
        if (d(dVar.O())) {
            super.b(dVar);
        } else {
            this.f4631d.a(dVar);
        }
    }

    public final boolean d(Z z6) {
        InterfaceC0455u a6 = AbstractC0457v.a(z6);
        return (a6.h() == r.LOCKED_FOCUSED || a6.h() == r.PASSIVE_FOCUSED) && a6.f() == EnumC0446p.CONVERGED && a6.d() == EnumC0451s.CONVERGED;
    }
}
