package y;

import I.C0437k0;
import I.N;
import x.C2253a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class W0 extends P {

    /* renamed from: c, reason: collision with root package name */
    public static final W0 f20929c = new W0(new C.j());

    /* renamed from: b, reason: collision with root package name */
    public final C.j f20930b;

    public W0(C.j jVar) {
        this.f20930b = jVar;
    }

    @Override // y.P, I.N.b
    public void a(I.Y0 y02, N.a aVar) {
        super.a(y02, aVar);
        if (!(y02 instanceof C0437k0)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        C0437k0 c0437k0 = (C0437k0) y02;
        C2253a.C0269a c0269a = new C2253a.C0269a();
        if (c0437k0.e0()) {
            this.f20930b.a(c0437k0.Y(), c0269a);
        }
        aVar.e(c0269a.a());
    }
}
