package y;

import F.AbstractC0335i0;
import I.AbstractC0442n;
import I.AbstractC0457v;
import I.C0444o;
import I.EnumC0446p;
import I.EnumC0448q;
import I.EnumC0451s;
import I.InterfaceC0455u;
import I.N;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import l0.AbstractC1728c;
import t.InterfaceC2069a;
import x.C2253a;
import y.C2331u;
import y.U;
import z.C2362A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class U {

    /* renamed from: h, reason: collision with root package name */
    public static final Set f20860h = Collections.unmodifiableSet(EnumSet.of(I.r.PASSIVE_FOCUSED, I.r.PASSIVE_NOT_FOCUSED, I.r.LOCKED_FOCUSED, I.r.LOCKED_NOT_FOCUSED));

    /* renamed from: i, reason: collision with root package name */
    public static final Set f20861i = Collections.unmodifiableSet(EnumSet.of(EnumC0451s.CONVERGED, EnumC0451s.UNKNOWN));

    /* renamed from: j, reason: collision with root package name */
    public static final Set f20862j;

    /* renamed from: k, reason: collision with root package name */
    public static final Set f20863k;

    /* renamed from: a, reason: collision with root package name */
    public final C2331u f20864a;

    /* renamed from: b, reason: collision with root package name */
    public final C.u f20865b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20866c;

    /* renamed from: d, reason: collision with root package name */
    public final I.G0 f20867d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f20868e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20869f;

    /* renamed from: g, reason: collision with root package name */
    public int f20870g = 1;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final C2331u f20871a;

        /* renamed from: b, reason: collision with root package name */
        public final C.n f20872b;

        /* renamed from: c, reason: collision with root package name */
        public final int f20873c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f20874d = false;

        public a(C2331u c2331u, int i6, C.n nVar) {
            this.f20871a = c2331u;
            this.f20873c = i6;
            this.f20872b = nVar;
        }

        public static /* synthetic */ Object e(a aVar, AbstractC1728c.a aVar2) {
            aVar.f20871a.E().L(aVar2);
            aVar.f20872b.b();
            return "AePreCapture";
        }

        @Override // y.U.d
        public D6.g a(TotalCaptureResult totalCaptureResult) {
            if (!U.b(this.f20873c, totalCaptureResult)) {
                return N.f.h(Boolean.FALSE);
            }
            AbstractC0335i0.a("Camera2CapturePipeline", "Trigger AE");
            this.f20874d = true;
            return N.d.a(AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: y.S
                @Override // l0.AbstractC1728c.InterfaceC0214c
                public final Object a(AbstractC1728c.a aVar) {
                    return U.a.e(U.a.this, aVar);
                }
            })).e(new InterfaceC2069a() { // from class: y.T
                @Override // t.InterfaceC2069a
                public final Object apply(Object obj) {
                    Boolean bool;
                    bool = Boolean.TRUE;
                    return bool;
                }
            }, M.c.b());
        }

        @Override // y.U.d
        public boolean b() {
            return this.f20873c == 0;
        }

        @Override // y.U.d
        public void c() {
            if (this.f20874d) {
                AbstractC0335i0.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f20871a.E().l(false, true);
                this.f20872b.a();
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public final C2331u f20875a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f20876b = false;

        public b(C2331u c2331u) {
            this.f20875a = c2331u;
        }

        @Override // y.U.d
        public D6.g a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            int intValue;
            D6.g h6 = N.f.h(Boolean.TRUE);
            if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((intValue = num.intValue()) == 1 || intValue == 2)) {
                AbstractC0335i0.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    AbstractC0335i0.a("Camera2CapturePipeline", "Trigger AF");
                    this.f20876b = true;
                    this.f20875a.E().M(null, false);
                }
            }
            return h6;
        }

        @Override // y.U.d
        public boolean b() {
            return true;
        }

        @Override // y.U.d
        public void c() {
            if (this.f20876b) {
                AbstractC0335i0.a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f20875a.E().l(true, false);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {

        /* renamed from: i, reason: collision with root package name */
        public static final long f20877i;

        /* renamed from: j, reason: collision with root package name */
        public static final long f20878j;

        /* renamed from: a, reason: collision with root package name */
        public final int f20879a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f20880b;

        /* renamed from: c, reason: collision with root package name */
        public final C2331u f20881c;

        /* renamed from: d, reason: collision with root package name */
        public final C.n f20882d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f20883e;

        /* renamed from: f, reason: collision with root package name */
        public long f20884f = f20877i;

        /* renamed from: g, reason: collision with root package name */
        public final List f20885g = new ArrayList();

        /* renamed from: h, reason: collision with root package name */
        public final d f20886h = new a();

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements d {
            public a() {
            }

            @Override // y.U.d
            public D6.g a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator it = c.this.f20885g.iterator();
                while (it.hasNext()) {
                    arrayList.add(((d) it.next()).a(totalCaptureResult));
                }
                return N.f.n(N.f.c(arrayList), new InterfaceC2069a() { // from class: y.b0
                    @Override // t.InterfaceC2069a
                    public final Object apply(Object obj) {
                        Boolean valueOf;
                        valueOf = Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
                        return valueOf;
                    }
                }, M.c.b());
            }

            @Override // y.U.d
            public boolean b() {
                Iterator it = c.this.f20885g.iterator();
                while (it.hasNext()) {
                    if (((d) it.next()).b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // y.U.d
            public void c() {
                Iterator it = c.this.f20885g.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).c();
                }
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class b extends AbstractC0442n {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AbstractC1728c.a f20888a;

            public b(AbstractC1728c.a aVar) {
                this.f20888a = aVar;
            }

            @Override // I.AbstractC0442n
            public void a() {
                this.f20888a.f(new F.Y(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override // I.AbstractC0442n
            public void b(InterfaceC0455u interfaceC0455u) {
                this.f20888a.c(null);
            }

            @Override // I.AbstractC0442n
            public void c(C0444o c0444o) {
                this.f20888a.f(new F.Y(2, "Capture request failed with reason " + c0444o.a(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f20877i = timeUnit.toNanos(1L);
            f20878j = timeUnit.toNanos(5L);
        }

        public c(int i6, Executor executor, C2331u c2331u, boolean z6, C.n nVar) {
            this.f20879a = i6;
            this.f20880b = executor;
            this.f20881c = c2331u;
            this.f20883e = z6;
            this.f20882d = nVar;
        }

        public static /* synthetic */ D6.g a(c cVar, int i6, TotalCaptureResult totalCaptureResult) {
            cVar.getClass();
            if (U.b(i6, totalCaptureResult)) {
                cVar.j(f20878j);
            }
            return cVar.f20886h.a(totalCaptureResult);
        }

        public static /* synthetic */ D6.g b(c cVar, Boolean bool) {
            cVar.getClass();
            return Boolean.TRUE.equals(bool) ? U.f(cVar.f20884f, cVar.f20881c, new e.a() { // from class: y.Z
                @Override // y.U.e.a
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    boolean a6;
                    a6 = U.a(totalCaptureResult, false);
                    return a6;
                }
            }) : N.f.h(null);
        }

        public static /* synthetic */ Object d(c cVar, N.a aVar, AbstractC1728c.a aVar2) {
            cVar.getClass();
            aVar.c(new b(aVar2));
            return "submitStillCapture";
        }

        public void f(d dVar) {
            this.f20885g.add(dVar);
        }

        public final void g(N.a aVar) {
            C2253a.C0269a c0269a = new C2253a.C0269a();
            c0269a.d(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.e(c0269a.a());
        }

        public final void h(N.a aVar, I.N n6) {
            int i6 = (this.f20879a != 3 || this.f20883e) ? (n6.i() == -1 || n6.i() == 5) ? 2 : -1 : 4;
            if (i6 != -1) {
                aVar.s(i6);
            }
        }

        public D6.g i(final List list, final int i6) {
            D6.g h6 = N.f.h(null);
            if (!this.f20885g.isEmpty()) {
                h6 = N.d.a(this.f20886h.b() ? U.f(0L, this.f20881c, null) : N.f.h(null)).f(new N.a() { // from class: y.V
                    @Override // N.a
                    public final D6.g apply(Object obj) {
                        return U.c.a(U.c.this, i6, (TotalCaptureResult) obj);
                    }
                }, this.f20880b).f(new N.a() { // from class: y.W
                    @Override // N.a
                    public final D6.g apply(Object obj) {
                        return U.c.b(U.c.this, (Boolean) obj);
                    }
                }, this.f20880b);
            }
            N.d f6 = N.d.a(h6).f(new N.a() { // from class: y.X
                @Override // N.a
                public final D6.g apply(Object obj) {
                    D6.g k6;
                    k6 = U.c.this.k(list, i6);
                    return k6;
                }
            }, this.f20880b);
            final d dVar = this.f20886h;
            Objects.requireNonNull(dVar);
            f6.c(new Runnable() { // from class: y.Y
                @Override // java.lang.Runnable
                public final void run() {
                    U.d.this.c();
                }
            }, this.f20880b);
            return f6;
        }

        public final void j(long j6) {
            this.f20884f = j6;
        }

        public D6.g k(List list, int i6) {
            androidx.camera.core.d f6;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                I.N n6 = (I.N) it.next();
                final N.a k6 = N.a.k(n6);
                InterfaceC0455u a6 = (n6.i() != 5 || this.f20881c.Q().c() || this.f20881c.Q().b() || (f6 = this.f20881c.Q().f()) == null || !this.f20881c.Q().g(f6)) ? null : AbstractC0457v.a(f6.O());
                if (a6 != null) {
                    k6.p(a6);
                } else {
                    h(k6, n6);
                }
                if (this.f20882d.c(i6)) {
                    g(k6);
                }
                arrayList.add(AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: y.a0
                    @Override // l0.AbstractC1728c.InterfaceC0214c
                    public final Object a(AbstractC1728c.a aVar) {
                        return U.c.d(U.c.this, k6, aVar);
                    }
                }));
                arrayList2.add(k6.h());
            }
            this.f20881c.c0(arrayList2);
            return N.f.c(arrayList);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface d {
        D6.g a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class e implements C2331u.c {

        /* renamed from: a, reason: collision with root package name */
        public AbstractC1728c.a f20890a;

        /* renamed from: c, reason: collision with root package name */
        public final long f20892c;

        /* renamed from: d, reason: collision with root package name */
        public final a f20893d;

        /* renamed from: b, reason: collision with root package name */
        public final D6.g f20891b = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: y.c0
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return U.e.b(U.e.this, aVar);
            }
        });

        /* renamed from: e, reason: collision with root package name */
        public volatile Long f20894e = null;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public interface a {
            boolean a(TotalCaptureResult totalCaptureResult);
        }

        public e(long j6, a aVar) {
            this.f20892c = j6;
            this.f20893d = aVar;
        }

        public static /* synthetic */ Object b(e eVar, AbstractC1728c.a aVar) {
            eVar.f20890a = aVar;
            return "waitFor3AResult";
        }

        @Override // y.C2331u.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            Long l6 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l6 != null && this.f20894e == null) {
                this.f20894e = l6;
            }
            Long l7 = this.f20894e;
            if (0 == this.f20892c || l7 == null || l6 == null || l6.longValue() - l7.longValue() <= this.f20892c) {
                a aVar = this.f20893d;
                if (aVar != null && !aVar.a(totalCaptureResult)) {
                    return false;
                }
                this.f20890a.c(totalCaptureResult);
                return true;
            }
            this.f20890a.c(null);
            AbstractC0335i0.a("Camera2CapturePipeline", "Wait for capture result timeout, current:" + l6 + " first: " + l7);
            return true;
        }

        public D6.g c() {
            return this.f20891b;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class f implements d {

        /* renamed from: e, reason: collision with root package name */
        public static final long f20895e = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: a, reason: collision with root package name */
        public final C2331u f20896a;

        /* renamed from: b, reason: collision with root package name */
        public final int f20897b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f20898c = false;

        /* renamed from: d, reason: collision with root package name */
        public final Executor f20899d;

        public f(C2331u c2331u, int i6, Executor executor) {
            this.f20896a = c2331u;
            this.f20897b = i6;
            this.f20899d = executor;
        }

        public static /* synthetic */ Object e(f fVar, AbstractC1728c.a aVar) {
            fVar.f20896a.N().e(aVar, true);
            return "TorchOn";
        }

        @Override // y.U.d
        public D6.g a(TotalCaptureResult totalCaptureResult) {
            if (U.b(this.f20897b, totalCaptureResult)) {
                if (!this.f20896a.V()) {
                    AbstractC0335i0.a("Camera2CapturePipeline", "Turn on torch");
                    this.f20898c = true;
                    return N.d.a(AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: y.d0
                        @Override // l0.AbstractC1728c.InterfaceC0214c
                        public final Object a(AbstractC1728c.a aVar) {
                            return U.f.e(U.f.this, aVar);
                        }
                    })).f(new N.a() { // from class: y.e0
                        @Override // N.a
                        public final D6.g apply(Object obj) {
                            D6.g f6;
                            f6 = U.f(U.f.f20895e, U.f.this.f20896a, new U.e.a() { // from class: y.g0
                                @Override // y.U.e.a
                                public final boolean a(TotalCaptureResult totalCaptureResult2) {
                                    boolean a6;
                                    a6 = U.a(totalCaptureResult2, true);
                                    return a6;
                                }
                            });
                            return f6;
                        }
                    }, this.f20899d).e(new InterfaceC2069a() { // from class: y.f0
                        @Override // t.InterfaceC2069a
                        public final Object apply(Object obj) {
                            Boolean bool;
                            bool = Boolean.FALSE;
                            return bool;
                        }
                    }, M.c.b());
                }
                AbstractC0335i0.a("Camera2CapturePipeline", "Torch already on, not turn on");
            }
            return N.f.h(Boolean.FALSE);
        }

        @Override // y.U.d
        public boolean b() {
            return this.f20897b == 0;
        }

        @Override // y.U.d
        public void c() {
            if (this.f20898c) {
                this.f20896a.N().e(null, false);
                AbstractC0335i0.a("Camera2CapturePipeline", "Turn off torch");
            }
        }
    }

    static {
        EnumC0446p enumC0446p = EnumC0446p.CONVERGED;
        EnumC0446p enumC0446p2 = EnumC0446p.FLASH_REQUIRED;
        EnumC0446p enumC0446p3 = EnumC0446p.UNKNOWN;
        Set unmodifiableSet = Collections.unmodifiableSet(EnumSet.of(enumC0446p, enumC0446p2, enumC0446p3));
        f20862j = unmodifiableSet;
        EnumSet copyOf = EnumSet.copyOf((Collection) unmodifiableSet);
        copyOf.remove(enumC0446p2);
        copyOf.remove(enumC0446p3);
        f20863k = Collections.unmodifiableSet(copyOf);
    }

    public U(C2331u c2331u, C2362A c2362a, I.G0 g02, Executor executor) {
        this.f20864a = c2331u;
        Integer num = (Integer) c2362a.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f20869f = num != null && num.intValue() == 2;
        this.f20868e = executor;
        this.f20867d = g02;
        this.f20865b = new C.u(g02);
        this.f20866c = C.g.a(new Q(c2362a));
    }

    public static boolean a(TotalCaptureResult totalCaptureResult, boolean z6) {
        if (totalCaptureResult == null) {
            return false;
        }
        C2302g c2302g = new C2302g(totalCaptureResult);
        boolean z7 = c2302g.i() == EnumC0448q.OFF || c2302g.i() == EnumC0448q.UNKNOWN || f20860h.contains(c2302g.h());
        boolean z8 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 0;
        boolean z9 = !z6 ? !(z8 || f20862j.contains(c2302g.f())) : !(z8 || f20863k.contains(c2302g.f()));
        boolean z10 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_MODE)).intValue() == 0 || f20861i.contains(c2302g.d());
        AbstractC0335i0.a("Camera2CapturePipeline", "checkCaptureResult, AE=" + c2302g.f() + " AF =" + c2302g.h() + " AWB=" + c2302g.d());
        return z7 && z9 && z10;
    }

    public static boolean b(int i6, TotalCaptureResult totalCaptureResult) {
        if (i6 == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            return num != null && num.intValue() == 4;
        }
        if (i6 == 1) {
            return true;
        }
        if (i6 == 2) {
            return false;
        }
        throw new AssertionError(i6);
    }

    public static D6.g f(long j6, C2331u c2331u, e.a aVar) {
        e eVar = new e(j6, aVar);
        c2331u.w(eVar);
        return eVar.c();
    }

    public final boolean c(int i6) {
        return this.f20865b.a() || this.f20870g == 3 || i6 == 1;
    }

    public void d(int i6) {
        this.f20870g = i6;
    }

    public D6.g e(List list, int i6, int i7, int i8) {
        C.n nVar = new C.n(this.f20867d);
        c cVar = new c(this.f20870g, this.f20868e, this.f20864a, this.f20869f, nVar);
        if (i6 == 0) {
            cVar.f(new b(this.f20864a));
        }
        if (this.f20866c) {
            if (c(i8)) {
                cVar.f(new f(this.f20864a, i7, this.f20868e));
            } else {
                cVar.f(new a(this.f20864a, i7, nVar));
            }
        }
        return N.f.i(cVar.i(list, i7));
    }
}
