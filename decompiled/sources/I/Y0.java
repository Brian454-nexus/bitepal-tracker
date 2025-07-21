package I;

import F.C0346s;
import I.L0;
import I.N;
import I.P;
import I.Z0;
import android.util.Range;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface Y0 extends O.j, O.l, InterfaceC0439l0 {

    /* renamed from: A, reason: collision with root package name */
    public static final P.a f2391A;

    /* renamed from: r, reason: collision with root package name */
    public static final P.a f2392r = P.a.a("camerax.core.useCase.defaultSessionConfig", L0.class);

    /* renamed from: s, reason: collision with root package name */
    public static final P.a f2393s = P.a.a("camerax.core.useCase.defaultCaptureConfig", N.class);

    /* renamed from: t, reason: collision with root package name */
    public static final P.a f2394t = P.a.a("camerax.core.useCase.sessionConfigUnpacker", L0.d.class);

    /* renamed from: u, reason: collision with root package name */
    public static final P.a f2395u = P.a.a("camerax.core.useCase.captureConfigUnpacker", N.b.class);

    /* renamed from: v, reason: collision with root package name */
    public static final P.a f2396v = P.a.a("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE);

    /* renamed from: w, reason: collision with root package name */
    public static final P.a f2397w = P.a.a("camerax.core.useCase.cameraSelector", C0346s.class);

    /* renamed from: x, reason: collision with root package name */
    public static final P.a f2398x = P.a.a("camerax.core.useCase.targetFrameRate", Range.class);

    /* renamed from: y, reason: collision with root package name */
    public static final P.a f2399y;

    /* renamed from: z, reason: collision with root package name */
    public static final P.a f2400z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a extends F.E {
        Y0 c();
    }

    static {
        Class cls = Boolean.TYPE;
        f2399y = P.a.a("camerax.core.useCase.zslDisabled", cls);
        f2400z = P.a.a("camerax.core.useCase.highResolutionDisabled", cls);
        f2391A = P.a.a("camerax.core.useCase.captureType", Z0.b.class);
    }

    default Z0.b G() {
        return (Z0.b) b(f2391A);
    }

    default L0 I(L0 l02) {
        return (L0) e(f2392r, l02);
    }

    default Range J(Range range) {
        return (Range) e(f2398x, range);
    }

    default int M(int i6) {
        return ((Integer) e(f2396v, Integer.valueOf(i6))).intValue();
    }

    default N.b N(N.b bVar) {
        return (N.b) e(f2395u, bVar);
    }

    default C0346s P(C0346s c0346s) {
        return (C0346s) e(f2397w, c0346s);
    }

    default L0.d S(L0.d dVar) {
        return (L0.d) e(f2394t, dVar);
    }

    default N T(N n6) {
        return (N) e(f2393s, n6);
    }

    default boolean s(boolean z6) {
        return ((Boolean) e(f2400z, Boolean.valueOf(z6))).booleanValue();
    }

    default boolean y(boolean z6) {
        return ((Boolean) e(f2399y, Boolean.valueOf(z6))).booleanValue();
    }

    default int z() {
        return ((Integer) b(f2396v)).intValue();
    }
}
