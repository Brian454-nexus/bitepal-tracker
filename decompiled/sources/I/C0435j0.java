package I;

import F.InterfaceC0327e0;
import F.L;
import I.P;

/* renamed from: I.j0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0435j0 implements Y0, InterfaceC0441m0, O.k {

    /* renamed from: H, reason: collision with root package name */
    public static final P.a f2466H = P.a.a("camerax.core.imageAnalysis.backpressureStrategy", L.b.class);

    /* renamed from: I, reason: collision with root package name */
    public static final P.a f2467I = P.a.a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);

    /* renamed from: J, reason: collision with root package name */
    public static final P.a f2468J = P.a.a("camerax.core.imageAnalysis.imageReaderProxyProvider", InterfaceC0327e0.class);

    /* renamed from: K, reason: collision with root package name */
    public static final P.a f2469K = P.a.a("camerax.core.imageAnalysis.outputImageFormat", L.e.class);

    /* renamed from: L, reason: collision with root package name */
    public static final P.a f2470L = P.a.a("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class);

    /* renamed from: M, reason: collision with root package name */
    public static final P.a f2471M = P.a.a("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class);

    /* renamed from: G, reason: collision with root package name */
    public final D0 f2472G;

    public C0435j0(D0 d02) {
        this.f2472G = d02;
    }

    public int X(int i6) {
        return ((Integer) e(f2466H, Integer.valueOf(i6))).intValue();
    }

    public int Y(int i6) {
        return ((Integer) e(f2467I, Integer.valueOf(i6))).intValue();
    }

    public InterfaceC0327e0 Z() {
        android.support.v4.media.session.b.a(e(f2468J, null));
        return null;
    }

    public Boolean a0(Boolean bool) {
        return (Boolean) e(f2470L, bool);
    }

    public int b0(int i6) {
        return ((Integer) e(f2469K, Integer.valueOf(i6))).intValue();
    }

    public Boolean c0(Boolean bool) {
        return (Boolean) e(f2471M, bool);
    }

    @Override // I.H0
    public P o() {
        return this.f2472G;
    }

    @Override // I.InterfaceC0439l0
    public int q() {
        return 35;
    }
}
