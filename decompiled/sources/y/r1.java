package y;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import y.InterfaceC2301f1;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final b f21061a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f21062a;

        /* renamed from: b, reason: collision with root package name */
        public final ScheduledExecutorService f21063b;

        /* renamed from: c, reason: collision with root package name */
        public final Handler f21064c;

        /* renamed from: d, reason: collision with root package name */
        public final B0 f21065d;

        /* renamed from: e, reason: collision with root package name */
        public final I.G0 f21066e;

        /* renamed from: f, reason: collision with root package name */
        public final I.G0 f21067f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f21068g;

        public a(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, B0 b02, I.G0 g02, I.G0 g03) {
            this.f21062a = executor;
            this.f21063b = scheduledExecutorService;
            this.f21064c = handler;
            this.f21065d = b02;
            this.f21066e = g02;
            this.f21067f = g03;
            this.f21068g = new C.i(g02, g03).b() || new C.x(g02).g() || new C.h(g03).d();
        }

        public r1 a() {
            return new r1(this.f21068g ? new q1(this.f21066e, this.f21067f, this.f21065d, this.f21062a, this.f21063b, this.f21064c) : new l1(this.f21065d, this.f21062a, this.f21063b, this.f21064c));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        A.o a(int i6, List list, InterfaceC2301f1.a aVar);

        Executor b();

        D6.g j(CameraDevice cameraDevice, A.o oVar, List list);

        D6.g l(List list, long j6);

        boolean stop();
    }

    public r1(b bVar) {
        this.f21061a = bVar;
    }

    public A.o a(int i6, List list, InterfaceC2301f1.a aVar) {
        return this.f21061a.a(i6, list, aVar);
    }

    public Executor b() {
        return this.f21061a.b();
    }

    public D6.g c(CameraDevice cameraDevice, A.o oVar, List list) {
        return this.f21061a.j(cameraDevice, oVar, list);
    }

    public D6.g d(List list, long j6) {
        return this.f21061a.l(list, j6);
    }

    public boolean e() {
        return this.f21061a.stop();
    }
}
