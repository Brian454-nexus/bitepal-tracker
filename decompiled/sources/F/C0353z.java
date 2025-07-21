package F;

import I.B;
import I.C;
import I.C0464y0;
import I.InterfaceC0462x0;
import I.P;
import I.Z0;
import android.os.Handler;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: F.z, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0353z implements O.j {

    /* renamed from: H, reason: collision with root package name */
    public static final P.a f1532H = P.a.a("camerax.core.appConfig.cameraFactoryProvider", C.a.class);

    /* renamed from: I, reason: collision with root package name */
    public static final P.a f1533I = P.a.a("camerax.core.appConfig.deviceSurfaceManagerProvider", B.a.class);

    /* renamed from: J, reason: collision with root package name */
    public static final P.a f1534J = P.a.a("camerax.core.appConfig.useCaseConfigFactoryProvider", Z0.c.class);

    /* renamed from: K, reason: collision with root package name */
    public static final P.a f1535K = P.a.a("camerax.core.appConfig.cameraExecutor", Executor.class);

    /* renamed from: L, reason: collision with root package name */
    public static final P.a f1536L = P.a.a("camerax.core.appConfig.schedulerHandler", Handler.class);

    /* renamed from: M, reason: collision with root package name */
    public static final P.a f1537M = P.a.a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);

    /* renamed from: N, reason: collision with root package name */
    public static final P.a f1538N = P.a.a("camerax.core.appConfig.availableCamerasLimiter", C0346s.class);

    /* renamed from: G, reason: collision with root package name */
    public final I.D0 f1539G;

    /* renamed from: F.z$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final C0464y0 f1540a;

        public a() {
            this(C0464y0.a0());
        }

        public C0353z a() {
            return new C0353z(I.D0.Z(this.f1540a));
        }

        public final InterfaceC0462x0 b() {
            return this.f1540a;
        }

        public a c(C.a aVar) {
            b().H(C0353z.f1532H, aVar);
            return this;
        }

        public a d(B.a aVar) {
            b().H(C0353z.f1533I, aVar);
            return this;
        }

        public a e(Class cls) {
            b().H(O.j.f3872D, cls);
            if (b().e(O.j.f3871C, null) == null) {
                f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a f(String str) {
            b().H(O.j.f3871C, str);
            return this;
        }

        public a g(Z0.c cVar) {
            b().H(C0353z.f1534J, cVar);
            return this;
        }

        public a(C0464y0 c0464y0) {
            this.f1540a = c0464y0;
            Class cls = (Class) c0464y0.e(O.j.f3872D, null);
            if (cls != null && !cls.equals(C0352y.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            e(C0352y.class);
        }
    }

    /* renamed from: F.z$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        C0353z getCameraXConfig();
    }

    public C0353z(I.D0 d02) {
        this.f1539G = d02;
    }

    public C0346s X(C0346s c0346s) {
        return (C0346s) this.f1539G.e(f1538N, c0346s);
    }

    public Executor Y(Executor executor) {
        return (Executor) this.f1539G.e(f1535K, executor);
    }

    public C.a Z(C.a aVar) {
        return (C.a) this.f1539G.e(f1532H, aVar);
    }

    public B.a a0(B.a aVar) {
        return (B.a) this.f1539G.e(f1533I, aVar);
    }

    public Handler b0(Handler handler) {
        return (Handler) this.f1539G.e(f1536L, handler);
    }

    public Z0.c c0(Z0.c cVar) {
        return (Z0.c) this.f1539G.e(f1534J, cVar);
    }

    @Override // I.H0
    public I.P o() {
        return this.f1539G;
    }
}
