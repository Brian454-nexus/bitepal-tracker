package y;

import F.InterfaceC0341m;
import I.A;
import I.AbstractC0442n;
import I.C0444o;
import I.InterfaceC0455u;
import I.N;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import l0.AbstractC1728c;
import x.C2253a;
import y.C2331u;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class U0 {

    /* renamed from: v, reason: collision with root package name */
    public static final MeteringRectangle[] f20900v = new MeteringRectangle[0];

    /* renamed from: a, reason: collision with root package name */
    public final C2331u f20901a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f20902b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f20903c;

    /* renamed from: f, reason: collision with root package name */
    public final C.l f20906f;

    /* renamed from: i, reason: collision with root package name */
    public ScheduledFuture f20909i;

    /* renamed from: j, reason: collision with root package name */
    public ScheduledFuture f20910j;

    /* renamed from: q, reason: collision with root package name */
    public MeteringRectangle[] f20917q;

    /* renamed from: r, reason: collision with root package name */
    public MeteringRectangle[] f20918r;

    /* renamed from: s, reason: collision with root package name */
    public MeteringRectangle[] f20919s;

    /* renamed from: t, reason: collision with root package name */
    public AbstractC1728c.a f20920t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC1728c.a f20921u;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f20904d = false;

    /* renamed from: e, reason: collision with root package name */
    public volatile Rational f20905e = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20907g = false;

    /* renamed from: h, reason: collision with root package name */
    public Integer f20908h = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f20911k = 0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20912l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20913m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f20914n = 1;

    /* renamed from: o, reason: collision with root package name */
    public C2331u.c f20915o = null;

    /* renamed from: p, reason: collision with root package name */
    public C2331u.c f20916p = null;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends AbstractC0442n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1728c.a f20922a;

        public a(AbstractC1728c.a aVar) {
            this.f20922a = aVar;
        }

        @Override // I.AbstractC0442n
        public void a() {
            AbstractC1728c.a aVar = this.f20922a;
            if (aVar != null) {
                aVar.f(new InterfaceC0341m.a("Camera is closed"));
            }
        }

        @Override // I.AbstractC0442n
        public void b(InterfaceC0455u interfaceC0455u) {
            AbstractC1728c.a aVar = this.f20922a;
            if (aVar != null) {
                aVar.c(interfaceC0455u);
            }
        }

        @Override // I.AbstractC0442n
        public void c(C0444o c0444o) {
            AbstractC1728c.a aVar = this.f20922a;
            if (aVar != null) {
                aVar.f(new A.b(c0444o));
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends AbstractC0442n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1728c.a f20924a;

        public b(AbstractC1728c.a aVar) {
            this.f20924a = aVar;
        }

        @Override // I.AbstractC0442n
        public void a() {
            AbstractC1728c.a aVar = this.f20924a;
            if (aVar != null) {
                aVar.f(new InterfaceC0341m.a("Camera is closed"));
            }
        }

        @Override // I.AbstractC0442n
        public void b(InterfaceC0455u interfaceC0455u) {
            AbstractC1728c.a aVar = this.f20924a;
            if (aVar != null) {
                aVar.c(null);
            }
        }

        @Override // I.AbstractC0442n
        public void c(C0444o c0444o) {
            AbstractC1728c.a aVar = this.f20924a;
            if (aVar != null) {
                aVar.f(new A.b(c0444o));
            }
        }
    }

    public U0(C2331u c2331u, ScheduledExecutorService scheduledExecutorService, Executor executor, I.G0 g02) {
        MeteringRectangle[] meteringRectangleArr = f20900v;
        this.f20917q = meteringRectangleArr;
        this.f20918r = meteringRectangleArr;
        this.f20919s = meteringRectangleArr;
        this.f20920t = null;
        this.f20921u = null;
        this.f20901a = c2331u;
        this.f20902b = executor;
        this.f20903c = scheduledExecutorService;
        this.f20906f = new C.l(g02);
    }

    public static boolean C(F.l0 l0Var) {
        return l0Var.c() >= 0.0f && l0Var.c() <= 1.0f && l0Var.d() >= 0.0f && l0Var.d() <= 1.0f;
    }

    public static int D(int i6, int i7, int i8) {
        return Math.min(Math.max(i6, i8), i7);
    }

    public static /* synthetic */ boolean a(U0 u02, boolean z6, long j6, TotalCaptureResult totalCaptureResult) {
        u02.getClass();
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (u02.H()) {
            if (!z6 || num == null) {
                u02.f20913m = true;
                u02.f20912l = true;
            } else if (u02.f20908h.intValue() == 3) {
                if (num.intValue() == 4) {
                    u02.f20913m = true;
                    u02.f20912l = true;
                } else if (num.intValue() == 5) {
                    u02.f20913m = false;
                    u02.f20912l = true;
                }
            }
        }
        if (u02.f20912l && C2331u.U(totalCaptureResult, j6)) {
            u02.q(u02.f20913m);
            return true;
        }
        if (!u02.f20908h.equals(num) && num != null) {
            u02.f20908h = num;
        }
        return false;
    }

    public static /* synthetic */ Object b(final U0 u02, final F.F f6, final long j6, final AbstractC1728c.a aVar) {
        u02.f20902b.execute(new Runnable() { // from class: y.N0
            @Override // java.lang.Runnable
            public final void run() {
                U0.this.K(aVar, f6, j6);
            }
        });
        return "startFocusAndMetering";
    }

    public static /* synthetic */ boolean c(U0 u02, int i6, long j6, TotalCaptureResult totalCaptureResult) {
        u02.getClass();
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i6 || !C2331u.U(totalCaptureResult, j6)) {
            return false;
        }
        u02.r();
        return true;
    }

    public static /* synthetic */ void e(U0 u02, long j6) {
        if (j6 == u02.f20911k) {
            u02.o();
        }
    }

    public static /* synthetic */ void g(U0 u02, long j6) {
        if (j6 == u02.f20911k) {
            u02.f20913m = false;
            u02.q(false);
        }
    }

    public static /* synthetic */ Object h(final U0 u02, final AbstractC1728c.a aVar) {
        u02.f20902b.execute(new Runnable() { // from class: y.O0
            @Override // java.lang.Runnable
            public final void run() {
                U0.this.n(aVar);
            }
        });
        return "cancelFocusAndMetering";
    }

    public static PointF y(F.l0 l0Var, Rational rational, Rational rational2, int i6, C.l lVar) {
        if (l0Var.b() != null) {
            rational2 = l0Var.b();
        }
        PointF a6 = lVar.a(l0Var, i6);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float doubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                a6.y = (((float) ((doubleValue - 1.0d) / 2.0d)) + a6.y) * (1.0f / doubleValue);
                return a6;
            }
            float doubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
            a6.x = (((float) ((doubleValue2 - 1.0d) / 2.0d)) + a6.x) * (1.0f / doubleValue2);
        }
        return a6;
    }

    public static MeteringRectangle z(F.l0 l0Var, PointF pointF, Rect rect) {
        int width = (int) (rect.left + (pointF.x * rect.width()));
        int height = (int) (rect.top + (pointF.y * rect.height()));
        int a6 = ((int) (l0Var.a() * rect.width())) / 2;
        int a7 = ((int) (l0Var.a() * rect.height())) / 2;
        Rect rect2 = new Rect(width - a6, height - a7, width + a6, height + a7);
        rect2.left = D(rect2.left, rect.right, rect.left);
        rect2.right = D(rect2.right, rect.right, rect.left);
        rect2.top = D(rect2.top, rect.bottom, rect.top);
        rect2.bottom = D(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, 1000);
    }

    public final List A(List list, int i6, Rational rational, Rect rect, int i7) {
        if (list.isEmpty() || i6 == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            F.l0 l0Var = (F.l0) it.next();
            if (arrayList.size() == i6) {
                break;
            }
            if (C(l0Var)) {
                MeteringRectangle z6 = z(l0Var, y(l0Var, rational2, rational, i7, this.f20906f), rect);
                if (z6.getWidth() != 0 && z6.getHeight() != 0) {
                    arrayList.add(z6);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final boolean B() {
        return this.f20901a.L(1) == 1;
    }

    public void E(boolean z6) {
        if (z6 == this.f20904d) {
            return;
        }
        this.f20904d = z6;
        if (this.f20904d) {
            return;
        }
        o();
    }

    public void F(Rational rational) {
        this.f20905e = rational;
    }

    public void G(int i6) {
        this.f20914n = i6;
    }

    public final boolean H() {
        return this.f20917q.length > 0;
    }

    public D6.g I(F.F f6) {
        return J(f6, 5000L);
    }

    public D6.g J(final F.F f6, final long j6) {
        return AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: y.K0
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return U0.b(U0.this, f6, j6, aVar);
            }
        });
    }

    public void K(AbstractC1728c.a aVar, F.F f6, long j6) {
        if (!this.f20904d) {
            aVar.f(new InterfaceC0341m.a("Camera is not active."));
            return;
        }
        Rect B6 = this.f20901a.B();
        Rational x6 = x();
        List A6 = A(f6.c(), this.f20901a.G(), x6, B6, 1);
        List A7 = A(f6.b(), this.f20901a.F(), x6, B6, 2);
        List A8 = A(f6.d(), this.f20901a.H(), x6, B6, 4);
        if (A6.isEmpty() && A7.isEmpty() && A8.isEmpty()) {
            aVar.f(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
            return;
        }
        u("Cancelled by another startFocusAndMetering()");
        v("Cancelled by another startFocusAndMetering()");
        s();
        this.f20920t = aVar;
        MeteringRectangle[] meteringRectangleArr = f20900v;
        t((MeteringRectangle[]) A6.toArray(meteringRectangleArr), (MeteringRectangle[]) A7.toArray(meteringRectangleArr), (MeteringRectangle[]) A8.toArray(meteringRectangleArr), f6, j6);
    }

    public void L(AbstractC1728c.a aVar) {
        if (!this.f20904d) {
            if (aVar != null) {
                aVar.f(new InterfaceC0341m.a("Camera is not active."));
                return;
            }
            return;
        }
        N.a aVar2 = new N.a();
        aVar2.s(this.f20914n);
        aVar2.t(true);
        C2253a.C0269a c0269a = new C2253a.C0269a();
        c0269a.d(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        aVar2.e(c0269a.a());
        aVar2.c(new b(aVar));
        this.f20901a.c0(Collections.singletonList(aVar2.h()));
    }

    public void M(AbstractC1728c.a aVar, boolean z6) {
        if (!this.f20904d) {
            if (aVar != null) {
                aVar.f(new InterfaceC0341m.a("Camera is not active."));
                return;
            }
            return;
        }
        N.a aVar2 = new N.a();
        aVar2.s(this.f20914n);
        aVar2.t(true);
        C2253a.C0269a c0269a = new C2253a.C0269a();
        c0269a.d(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z6) {
            c0269a.d(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f20901a.K(1)));
        }
        aVar2.e(c0269a.a());
        aVar2.c(new a(aVar));
        this.f20901a.c0(Collections.singletonList(aVar2.h()));
    }

    public void k(C2253a.C0269a c0269a) {
        c0269a.d(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(this.f20901a.L(this.f20907g ? 1 : w())));
        MeteringRectangle[] meteringRectangleArr = this.f20917q;
        if (meteringRectangleArr.length != 0) {
            c0269a.d(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f20918r;
        if (meteringRectangleArr2.length != 0) {
            c0269a.d(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f20919s;
        if (meteringRectangleArr3.length != 0) {
            c0269a.d(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
    }

    public void l(boolean z6, boolean z7) {
        if (this.f20904d) {
            N.a aVar = new N.a();
            aVar.t(true);
            aVar.s(this.f20914n);
            C2253a.C0269a c0269a = new C2253a.C0269a();
            if (z6) {
                c0269a.d(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z7) {
                c0269a.d(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.e(c0269a.a());
            this.f20901a.c0(Collections.singletonList(aVar.h()));
        }
    }

    public D6.g m() {
        return AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: y.M0
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return U0.h(U0.this, aVar);
            }
        });
    }

    public void n(AbstractC1728c.a aVar) {
        v("Cancelled by another cancelFocusAndMetering()");
        u("Cancelled by cancelFocusAndMetering()");
        this.f20921u = aVar;
        s();
        p();
        if (H()) {
            l(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f20900v;
        this.f20917q = meteringRectangleArr;
        this.f20918r = meteringRectangleArr;
        this.f20919s = meteringRectangleArr;
        this.f20907g = false;
        final long f02 = this.f20901a.f0();
        if (this.f20921u != null) {
            final int L5 = this.f20901a.L(w());
            C2331u.c cVar = new C2331u.c() { // from class: y.L0
                @Override // y.C2331u.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return U0.c(U0.this, L5, f02, totalCaptureResult);
                }
            };
            this.f20916p = cVar;
            this.f20901a.w(cVar);
        }
    }

    public void o() {
        n(null);
    }

    public final void p() {
        ScheduledFuture scheduledFuture = this.f20910j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f20910j = null;
        }
    }

    public void q(boolean z6) {
        p();
        AbstractC1728c.a aVar = this.f20920t;
        if (aVar != null) {
            aVar.c(F.G.a(z6));
            this.f20920t = null;
        }
    }

    public final void r() {
        AbstractC1728c.a aVar = this.f20921u;
        if (aVar != null) {
            aVar.c(null);
            this.f20921u = null;
        }
    }

    public final void s() {
        ScheduledFuture scheduledFuture = this.f20909i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f20909i = null;
        }
    }

    public final void t(MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, F.F f6, long j6) {
        final long f02;
        this.f20901a.W(this.f20915o);
        s();
        p();
        this.f20917q = meteringRectangleArr;
        this.f20918r = meteringRectangleArr2;
        this.f20919s = meteringRectangleArr3;
        if (H()) {
            this.f20907g = true;
            this.f20912l = false;
            this.f20913m = false;
            f02 = this.f20901a.f0();
            M(null, true);
        } else {
            this.f20907g = false;
            this.f20912l = true;
            this.f20913m = false;
            f02 = this.f20901a.f0();
        }
        this.f20908h = 0;
        final boolean B6 = B();
        C2331u.c cVar = new C2331u.c() { // from class: y.P0
            @Override // y.C2331u.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return U0.a(U0.this, B6, f02, totalCaptureResult);
            }
        };
        this.f20915o = cVar;
        this.f20901a.w(cVar);
        final long j7 = this.f20911k + 1;
        this.f20911k = j7;
        Runnable runnable = new Runnable() { // from class: y.Q0
            @Override // java.lang.Runnable
            public final void run() {
                r0.f20902b.execute(new Runnable() { // from class: y.T0
                    @Override // java.lang.Runnable
                    public final void run() {
                        U0.g(U0.this, r2);
                    }
                });
            }
        };
        ScheduledExecutorService scheduledExecutorService = this.f20903c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f20910j = scheduledExecutorService.schedule(runnable, j6, timeUnit);
        if (f6.e()) {
            this.f20909i = this.f20903c.schedule(new Runnable() { // from class: y.R0
                @Override // java.lang.Runnable
                public final void run() {
                    r0.f20902b.execute(new Runnable() { // from class: y.S0
                        @Override // java.lang.Runnable
                        public final void run() {
                            U0.e(U0.this, r2);
                        }
                    });
                }
            }, f6.a(), timeUnit);
        }
    }

    public final void u(String str) {
        this.f20901a.W(this.f20915o);
        AbstractC1728c.a aVar = this.f20920t;
        if (aVar != null) {
            aVar.f(new InterfaceC0341m.a(str));
            this.f20920t = null;
        }
    }

    public final void v(String str) {
        this.f20901a.W(this.f20916p);
        AbstractC1728c.a aVar = this.f20921u;
        if (aVar != null) {
            aVar.f(new InterfaceC0341m.a(str));
            this.f20921u = null;
        }
    }

    public int w() {
        return this.f20914n != 3 ? 4 : 3;
    }

    public final Rational x() {
        if (this.f20905e != null) {
            return this.f20905e;
        }
        Rect B6 = this.f20901a.B();
        return new Rational(B6.width(), B6.height());
    }
}
