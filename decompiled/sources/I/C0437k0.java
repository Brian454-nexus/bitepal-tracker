package I;

import F.InterfaceC0327e0;
import I.P;
import java.util.concurrent.Executor;

/* renamed from: I.k0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0437k0 implements Y0, InterfaceC0441m0, O.g {

    /* renamed from: H, reason: collision with root package name */
    public static final P.a f2481H;

    /* renamed from: I, reason: collision with root package name */
    public static final P.a f2482I;

    /* renamed from: J, reason: collision with root package name */
    public static final P.a f2483J;

    /* renamed from: K, reason: collision with root package name */
    public static final P.a f2484K;

    /* renamed from: L, reason: collision with root package name */
    public static final P.a f2485L;

    /* renamed from: M, reason: collision with root package name */
    public static final P.a f2486M;

    /* renamed from: N, reason: collision with root package name */
    public static final P.a f2487N;

    /* renamed from: O, reason: collision with root package name */
    public static final P.a f2488O;

    /* renamed from: P, reason: collision with root package name */
    public static final P.a f2489P;

    /* renamed from: G, reason: collision with root package name */
    public final D0 f2490G;

    static {
        Class cls = Integer.TYPE;
        f2481H = P.a.a("camerax.core.imageCapture.captureMode", cls);
        f2482I = P.a.a("camerax.core.imageCapture.flashMode", cls);
        f2483J = P.a.a("camerax.core.imageCapture.captureBundle", M.class);
        f2484K = P.a.a("camerax.core.imageCapture.bufferFormat", Integer.class);
        f2485L = P.a.a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        f2486M = P.a.a("camerax.core.imageCapture.imageReaderProxyProvider", InterfaceC0327e0.class);
        f2487N = P.a.a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);
        f2488O = P.a.a("camerax.core.imageCapture.flashType", cls);
        f2489P = P.a.a("camerax.core.imageCapture.jpegCompressionQuality", cls);
    }

    public C0437k0(D0 d02) {
        this.f2490G = d02;
    }

    public M X(M m6) {
        return (M) e(f2483J, m6);
    }

    public int Y() {
        return ((Integer) b(f2481H)).intValue();
    }

    public int Z(int i6) {
        return ((Integer) e(f2482I, Integer.valueOf(i6))).intValue();
    }

    public int a0(int i6) {
        return ((Integer) e(f2488O, Integer.valueOf(i6))).intValue();
    }

    public InterfaceC0327e0 b0() {
        android.support.v4.media.session.b.a(e(f2486M, null));
        return null;
    }

    public Executor c0(Executor executor) {
        return (Executor) e(O.g.f3860B, executor);
    }

    public int d0() {
        return ((Integer) b(f2489P)).intValue();
    }

    public boolean e0() {
        return h(f2481H);
    }

    @Override // I.H0
    public P o() {
        return this.f2490G;
    }

    @Override // I.InterfaceC0439l0
    public int q() {
        return ((Integer) b(InterfaceC0439l0.f2494f)).intValue();
    }
}
