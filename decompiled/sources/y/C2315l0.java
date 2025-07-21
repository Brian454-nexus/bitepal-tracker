package y;

import I.C0464y0;
import I.InterfaceC0441m0;
import I.L0;
import I.N;
import I.Z0;
import android.content.Context;

/* renamed from: y.l0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2315l0 implements I.Z0 {

    /* renamed from: b, reason: collision with root package name */
    public final D0 f21017b;

    public C2315l0(Context context) {
        this.f21017b = D0.c(context);
    }

    @Override // I.Z0
    public I.P a(Z0.b bVar, int i6) {
        C0464y0 a02 = C0464y0.a0();
        L0.b bVar2 = new L0.b();
        bVar2.w(t1.b(bVar, i6));
        a02.H(I.Y0.f2392r, bVar2.o());
        a02.H(I.Y0.f2394t, C2313k0.f21014a);
        N.a aVar = new N.a();
        aVar.s(t1.a(bVar, i6));
        a02.H(I.Y0.f2393s, aVar.h());
        a02.H(I.Y0.f2395u, bVar == Z0.b.IMAGE_CAPTURE ? W0.f20929c : P.f20846a);
        if (bVar == Z0.b.PREVIEW) {
            a02.H(InterfaceC0441m0.f2509n, this.f21017b.f());
        }
        a02.H(InterfaceC0441m0.f2504i, Integer.valueOf(this.f21017b.d(true).getRotation()));
        if (bVar == Z0.b.VIDEO_CAPTURE || bVar == Z0.b.STREAM_SHARING) {
            a02.H(I.Y0.f2399y, Boolean.TRUE);
        }
        return I.D0.Z(a02);
    }
}
