package X;

import F.AbstractC0335i0;
import F.H0;
import F.I0;
import I.AbstractC0442n;
import I.B0;
import I.C0464y0;
import I.D0;
import I.InterfaceC0439l0;
import I.InterfaceC0441m0;
import I.InterfaceC0455u;
import I.InterfaceC0462x0;
import I.L0;
import I.O0;
import I.T0;
import I.Y0;
import I.Z0;
import T.C0765u;
import T.U;
import X.b0;
import X.k0;
import X.w0;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.SystemClock;
import android.util.Range;
import android.util.Size;
import c0.AbstractC1104f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import l0.AbstractC1728c;
import t.InterfaceC2069a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class k0 extends I0 {

    /* renamed from: A, reason: collision with root package name */
    public static boolean f5904A;

    /* renamed from: B, reason: collision with root package name */
    public static final boolean f5905B;

    /* renamed from: z, reason: collision with root package name */
    public static final e f5906z = new e();

    /* renamed from: m, reason: collision with root package name */
    public I.W f5907m;

    /* renamed from: n, reason: collision with root package name */
    public T.L f5908n;

    /* renamed from: o, reason: collision with root package name */
    public b0 f5909o;

    /* renamed from: p, reason: collision with root package name */
    public L0.b f5910p;

    /* renamed from: q, reason: collision with root package name */
    public D6.g f5911q;

    /* renamed from: r, reason: collision with root package name */
    public H0 f5912r;

    /* renamed from: s, reason: collision with root package name */
    public w0.a f5913s;

    /* renamed from: t, reason: collision with root package name */
    public T.U f5914t;

    /* renamed from: u, reason: collision with root package name */
    public e0.o0 f5915u;

    /* renamed from: v, reason: collision with root package name */
    public Rect f5916v;

    /* renamed from: w, reason: collision with root package name */
    public int f5917w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5918x;

    /* renamed from: y, reason: collision with root package name */
    public final B0.a f5919y;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements B0.a {
        public a() {
        }

        @Override // I.B0.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(b0 b0Var) {
            if (b0Var == null) {
                throw new IllegalArgumentException("StreamInfo can't be null");
            }
            if (k0.this.f5913s == w0.a.INACTIVE) {
                return;
            }
            AbstractC0335i0.a("VideoCapture", "Stream info update: old: " + k0.this.f5909o + " new: " + b0Var);
            k0 k0Var = k0.this;
            b0 b0Var2 = k0Var.f5909o;
            k0Var.f5909o = b0Var;
            O0 o02 = (O0) y0.g.f(k0Var.e());
            if (k0.this.E0(b0Var2.a(), b0Var.a()) || k0.this.Q0(b0Var2, b0Var)) {
                k0 k0Var2 = k0.this;
                k0Var2.G0(k0Var2.i(), (Y.a) k0.this.j(), (O0) y0.g.f(k0.this.e()));
                return;
            }
            if ((b0Var2.a() != -1 && b0Var.a() == -1) || (b0Var2.a() == -1 && b0Var.a() != -1)) {
                k0 k0Var3 = k0.this;
                k0Var3.s0(k0Var3.f5910p, b0Var, o02);
                k0 k0Var4 = k0.this;
                k0Var4.V(k0Var4.f5910p.o());
                k0.this.E();
                return;
            }
            if (b0Var2.c() != b0Var.c()) {
                k0 k0Var5 = k0.this;
                k0Var5.s0(k0Var5.f5910p, b0Var, o02);
                k0 k0Var6 = k0.this;
                k0Var6.V(k0Var6.f5910p.o());
                k0.this.G();
            }
        }

        @Override // I.B0.a
        public void onError(Throwable th) {
            AbstractC0335i0.m("VideoCapture", "Receive onError from StreamState observer", th);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends AbstractC0442n {

        /* renamed from: a, reason: collision with root package name */
        public boolean f5921a = true;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f5922b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC1728c.a f5923c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ L0.b f5924d;

        public b(AtomicBoolean atomicBoolean, AbstractC1728c.a aVar, L0.b bVar) {
            this.f5922b = atomicBoolean;
            this.f5923c = aVar;
            this.f5924d = bVar;
        }

        public static /* synthetic */ void d(b bVar, L0.b bVar2) {
            bVar.getClass();
            bVar2.s(bVar);
        }

        @Override // I.AbstractC0442n
        public void b(InterfaceC0455u interfaceC0455u) {
            Object d6;
            super.b(interfaceC0455u);
            if (this.f5921a) {
                this.f5921a = false;
                AbstractC0335i0.a("VideoCapture", "cameraCaptureResult timestampNs = " + interfaceC0455u.c() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
            }
            if (this.f5922b.get() || (d6 = interfaceC0455u.a().d("androidx.camera.video.VideoCapture.streamUpdate")) == null || ((Integer) d6).intValue() != this.f5923c.hashCode() || !this.f5923c.c(null) || this.f5922b.getAndSet(true)) {
                return;
            }
            ScheduledExecutorService e6 = M.c.e();
            final L0.b bVar = this.f5924d;
            e6.execute(new Runnable() { // from class: X.l0
                @Override // java.lang.Runnable
                public final void run() {
                    k0.b.d(k0.b.this, bVar);
                }
            });
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements N.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D6.g f5926a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f5927b;

        public c(D6.g gVar, boolean z6) {
            this.f5926a = gVar;
            this.f5927b = z6;
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r32) {
            D6.g gVar = this.f5926a;
            k0 k0Var = k0.this;
            if (gVar != k0Var.f5911q || k0Var.f5913s == w0.a.INACTIVE) {
                return;
            }
            k0Var.J0(this.f5927b ? w0.a.ACTIVE_STREAMING : w0.a.ACTIVE_NON_STREAMING);
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            if (th instanceof CancellationException) {
                return;
            }
            AbstractC0335i0.d("VideoCapture", "Surface update completed with unexpected exception", th);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d implements Y0.a, InterfaceC0441m0.a {

        /* renamed from: a, reason: collision with root package name */
        public final C0464y0 f5929a;

        public d(w0 w0Var) {
            this(f(w0Var));
        }

        public static C0464y0 f(w0 w0Var) {
            C0464y0 a02 = C0464y0.a0();
            a02.H(Y.a.f6322H, w0Var);
            return a02;
        }

        public static d g(I.P p6) {
            return new d(C0464y0.b0(p6));
        }

        @Override // F.E
        public InterfaceC0462x0 b() {
            return this.f5929a;
        }

        public k0 e() {
            return new k0(c());
        }

        @Override // I.Y0.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Y.a c() {
            return new Y.a(D0.Z(this.f5929a));
        }

        public d i(Z0.b bVar) {
            b().H(Y0.f2391A, bVar);
            return this;
        }

        public d j(F.C c6) {
            b().H(InterfaceC0439l0.f2495g, c6);
            return this;
        }

        public d k(int i6) {
            b().H(Y0.f2396v, Integer.valueOf(i6));
            return this;
        }

        public d l(Class cls) {
            b().H(O.j.f3872D, cls);
            if (b().e(O.j.f3871C, null) == null) {
                m(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public d m(String str) {
            b().H(O.j.f3871C, str);
            return this;
        }

        @Override // I.InterfaceC0441m0.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public d a(Size size) {
            throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }

        @Override // I.InterfaceC0441m0.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public d d(int i6) {
            b().H(InterfaceC0441m0.f2504i, Integer.valueOf(i6));
            return this;
        }

        public d p(InterfaceC2069a interfaceC2069a) {
            b().H(Y.a.f6323I, interfaceC2069a);
            return this;
        }

        public d(C0464y0 c0464y0) {
            this.f5929a = c0464y0;
            if (c0464y0.h(Y.a.f6322H)) {
                Class cls = (Class) c0464y0.e(O.j.f3872D, null);
                if (cls != null && !cls.equals(k0.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                l(k0.class);
                return;
            }
            throw new IllegalArgumentException("VideoOutput is required");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public static final w0 f5930a;

        /* renamed from: b, reason: collision with root package name */
        public static final Y.a f5931b;

        /* renamed from: c, reason: collision with root package name */
        public static final InterfaceC2069a f5932c;

        /* renamed from: d, reason: collision with root package name */
        public static final Range f5933d;

        /* renamed from: e, reason: collision with root package name */
        public static final F.C f5934e;

        static {
            w0 w0Var = new w0() { // from class: X.m0
                @Override // X.w0
                public final void a(H0 h02) {
                    h02.t();
                }
            };
            f5930a = w0Var;
            InterfaceC2069a b6 = b();
            f5932c = b6;
            f5933d = new Range(30, 30);
            F.C c6 = F.C.f1236d;
            f5934e = c6;
            f5931b = new d(w0Var).k(5).p(b6).j(c6).i(Z0.b.VIDEO_CAPTURE).c();
        }

        public static /* synthetic */ e0.o0 a(e0.m0 m0Var) {
            try {
                return e0.p0.j(m0Var);
            } catch (e0.i0 e6) {
                AbstractC0335i0.m("VideoCapture", "Unable to find VideoEncoderInfo", e6);
                return null;
            }
        }

        public static InterfaceC2069a b() {
            return new InterfaceC2069a() { // from class: X.n0
                @Override // t.InterfaceC2069a
                public final Object apply(Object obj) {
                    return k0.e.a((e0.m0) obj);
                }
            };
        }

        public Y.a c() {
            return f5931b;
        }
    }

    static {
        boolean z6 = AbstractC1104f.a(c0.q.class) != null;
        boolean z7 = AbstractC1104f.a(c0.p.class) != null;
        boolean z8 = AbstractC1104f.a(c0.k.class) != null;
        boolean D02 = D0();
        boolean z9 = AbstractC1104f.a(c0.j.class) != null;
        f5905B = z6 || z7 || z8;
        f5904A = z7 || z8 || D02 || z9;
    }

    public k0(Y.a aVar) {
        super(aVar);
        this.f5909o = b0.f5839a;
        this.f5910p = new L0.b();
        this.f5911q = null;
        this.f5913s = w0.a.INACTIVE;
        this.f5918x = false;
        this.f5919y = new a();
    }

    public static boolean D0() {
        Iterator it = AbstractC1104f.c(c0.u.class).iterator();
        while (it.hasNext()) {
            if (((c0.u) it.next()).c()) {
                return true;
            }
        }
        return false;
    }

    public static e0.o0 H0(InterfaceC2069a interfaceC2069a, Z.g gVar, AbstractC0808q abstractC0808q, Size size, F.C c6, Range range) {
        return (e0.o0) interfaceC2069a.apply(d0.k.c(d0.k.d(abstractC0808q, c6, gVar), T0.UPTIME, abstractC0808q.d(), size, c6, range));
    }

    private void I0() {
        I.E g6 = g();
        T.L l6 = this.f5908n;
        if (g6 == null || l6 == null) {
            return;
        }
        int o02 = o0(q(g6, A(g6)));
        this.f5917w = o02;
        l6.z(o02, d());
    }

    public static boolean N0(Rect rect, Size size) {
        return (size.getWidth() == rect.width() && size.getHeight() == rect.height()) ? false : true;
    }

    public static boolean O0(I.E e6) {
        return e6.m() && f5904A;
    }

    private boolean P0(I.E e6) {
        return e6.m() && A(e6);
    }

    public static k0 S0(w0 w0Var) {
        return new d((w0) y0.g.f(w0Var)).i(Z0.b.VIDEO_CAPTURE).e();
    }

    public static /* synthetic */ int Z(Rect rect, Size size, Size size2) {
        return (Math.abs(size.getWidth() - rect.width()) + Math.abs(size.getHeight() - rect.height())) - (Math.abs(size2.getWidth() - rect.width()) + Math.abs(size2.getHeight() - rect.height()));
    }

    public static /* synthetic */ void a0(k0 k0Var, I.W w6) {
        if (w6 == k0Var.f5907m) {
            k0Var.u0();
        }
    }

    public static /* synthetic */ void c0(AtomicBoolean atomicBoolean, L0.b bVar, AbstractC0442n abstractC0442n) {
        y0.g.i(L.p.c(), "Surface update cancellation should only occur on main thread.");
        atomicBoolean.set(true);
        bVar.s(abstractC0442n);
    }

    public static /* synthetic */ Object d0(k0 k0Var, final L0.b bVar, AbstractC1728c.a aVar) {
        k0Var.getClass();
        bVar.n("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final b bVar2 = new b(atomicBoolean, aVar, bVar);
        aVar.a(new Runnable() { // from class: X.i0
            @Override // java.lang.Runnable
            public final void run() {
                k0.c0(atomicBoolean, bVar, bVar2);
            }
        }, M.c.b());
        bVar.j(bVar2);
        return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
    }

    public static void k0(Set set, int i6, int i7, Size size, e0.o0 o0Var) {
        if (i6 > size.getWidth() || i7 > size.getHeight()) {
            return;
        }
        try {
            set.add(new Size(i6, ((Integer) o0Var.d(i6).clamp(Integer.valueOf(i7))).intValue()));
        } catch (IllegalArgumentException e6) {
            AbstractC0335i0.m("VideoCapture", "No supportedHeights for width: " + i6, e6);
        }
        try {
            set.add(new Size(((Integer) o0Var.c(i7).clamp(Integer.valueOf(i6))).intValue(), i7));
        } catch (IllegalArgumentException e7) {
            AbstractC0335i0.m("VideoCapture", "No supportedWidths for height: " + i7, e7);
        }
    }

    public static Rect l0(final Rect rect, Size size, e0.o0 o0Var) {
        AbstractC0335i0.a("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", L.q.j(rect), Integer.valueOf(o0Var.a()), Integer.valueOf(o0Var.e()), o0Var.f(), o0Var.h()));
        int a6 = o0Var.a();
        int e6 = o0Var.e();
        Range f6 = o0Var.f();
        Range h6 = o0Var.h();
        int q02 = q0(rect.width(), a6, f6);
        int r02 = r0(rect.width(), a6, f6);
        int q03 = q0(rect.height(), e6, h6);
        int r03 = r0(rect.height(), e6, h6);
        HashSet hashSet = new HashSet();
        k0(hashSet, q02, q03, size, o0Var);
        k0(hashSet, q02, r03, size, o0Var);
        k0(hashSet, r02, q03, size, o0Var);
        k0(hashSet, r02, r03, size, o0Var);
        if (hashSet.isEmpty()) {
            AbstractC0335i0.l("VideoCapture", "Can't find valid cropped size");
            return rect;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        AbstractC0335i0.a("VideoCapture", "candidatesList = " + arrayList);
        Collections.sort(arrayList, new Comparator() { // from class: X.j0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return k0.Z(rect, (Size) obj, (Size) obj2);
            }
        });
        AbstractC0335i0.a("VideoCapture", "sorted candidatesList = " + arrayList);
        Size size2 = (Size) arrayList.get(0);
        int width = size2.getWidth();
        int height = size2.getHeight();
        if (width == rect.width() && height == rect.height()) {
            AbstractC0335i0.a("VideoCapture", "No need to adjust cropRect because crop size is valid.");
            return rect;
        }
        y0.g.h(width % 2 == 0 && height % 2 == 0 && width <= size.getWidth() && height <= size.getHeight());
        Rect rect2 = new Rect(rect);
        if (width != rect.width()) {
            int max = Math.max(0, rect.centerX() - (width / 2));
            rect2.left = max;
            int i6 = max + width;
            rect2.right = i6;
            if (i6 > size.getWidth()) {
                int width2 = size.getWidth();
                rect2.right = width2;
                rect2.left = width2 - width;
            }
        }
        if (height != rect.height()) {
            int max2 = Math.max(0, rect.centerY() - (height / 2));
            rect2.top = max2;
            int i7 = max2 + height;
            rect2.bottom = i7;
            if (i7 > size.getHeight()) {
                int height2 = size.getHeight();
                rect2.bottom = height2;
                rect2.top = height2 - height;
            }
        }
        AbstractC0335i0.a("VideoCapture", String.format("Adjust cropRect from %s to %s", L.q.j(rect), L.q.j(rect2)));
        return rect2;
    }

    public static int p0(boolean z6, int i6, int i7, Range range) {
        int i8 = i6 % i7;
        if (i8 != 0) {
            i6 = z6 ? i6 - i8 : i6 + (i7 - i8);
        }
        return ((Integer) range.clamp(Integer.valueOf(i6))).intValue();
    }

    public static int q0(int i6, int i7, Range range) {
        return p0(true, i6, i7, range);
    }

    public static int r0(int i6, int i7, Range range) {
        return p0(false, i6, i7, range);
    }

    private void u0() {
        L.p.a();
        I.W w6 = this.f5907m;
        if (w6 != null) {
            w6.d();
            this.f5907m = null;
        }
        T.U u6 = this.f5914t;
        if (u6 != null) {
            u6.f();
            this.f5914t = null;
        }
        T.L l6 = this.f5908n;
        if (l6 != null) {
            l6.i();
            this.f5908n = null;
        }
        this.f5915u = null;
        this.f5916v = null;
        this.f5912r = null;
        this.f5909o = b0.f5839a;
        this.f5917w = 0;
        this.f5918x = false;
    }

    public static Object x0(B0 b02, Object obj) {
        D6.g d6 = b02.d();
        if (!d6.isDone()) {
            return obj;
        }
        try {
            return d6.get();
        } catch (InterruptedException | ExecutionException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public w0 A0() {
        return ((Y.a) j()).Y();
    }

    public final c0 B0(F.r rVar) {
        return A0().f(rVar);
    }

    public final e0.o0 C0(InterfaceC2069a interfaceC2069a, c0 c0Var, F.C c6, AbstractC0808q abstractC0808q, Size size, Range range) {
        e0.o0 o0Var = this.f5915u;
        if (o0Var != null) {
            return o0Var;
        }
        Z.g a6 = c0Var.a(size, c6);
        e0.o0 H02 = H0(interfaceC2069a, a6, abstractC0808q, size, c6, range);
        if (H02 == null) {
            AbstractC0335i0.l("VideoCapture", "Can't find videoEncoderInfo");
            return null;
        }
        e0.o0 i6 = g0.d.i(H02, a6 != null ? new Size(a6.k().k(), a6.k().h()) : null);
        this.f5915u = i6;
        return i6;
    }

    public boolean E0(int i6, int i7) {
        Set set = b0.f5840b;
        return (set.contains(Integer.valueOf(i6)) || set.contains(Integer.valueOf(i7)) || i6 == i7) ? false : true;
    }

    public final void F0(T.L l6, I.E e6, Y.a aVar, T0 t02) {
        if (e6 == g()) {
            this.f5912r = l6.k(e6);
            aVar.Y().b(this.f5912r, t02);
            I0();
        }
    }

    public void G0(String str, Y.a aVar, O0 o02) {
        u0();
        if (y(str)) {
            L0.b w02 = w0(str, aVar, o02);
            this.f5910p = w02;
            s0(w02, this.f5909o, o02);
            V(this.f5910p.o());
            E();
        }
    }

    @Override // F.I0
    public Y0 J(I.D d6, Y0.a aVar) {
        R0(d6, aVar);
        return aVar.c();
    }

    public void J0(w0.a aVar) {
        if (aVar != this.f5913s) {
            this.f5913s = aVar;
            A0().e(aVar);
        }
    }

    @Override // F.I0
    public void K() {
        super.K();
        y0.g.g(e(), "The suggested stream specification should be already updated and shouldn't be null.");
        y0.g.i(this.f5912r == null, "The surface request should be null when VideoCapture is attached.");
        O0 o02 = (O0) y0.g.f(e());
        this.f5909o = (b0) x0(A0().d(), b0.f5839a);
        L0.b w02 = w0(i(), (Y.a) j(), o02);
        this.f5910p = w02;
        s0(w02, this.f5909o, o02);
        V(this.f5910p.o());
        C();
        A0().d().b(M.c.e(), this.f5919y);
        J0(w0.a.ACTIVE_NON_STREAMING);
    }

    public void K0(int i6) {
        if (S(i6)) {
            I0();
        }
    }

    @Override // F.I0
    public void L() {
        y0.g.i(L.p.c(), "VideoCapture can only be detached on the main thread.");
        J0(w0.a.INACTIVE);
        A0().d().e(this.f5919y);
        D6.g gVar = this.f5911q;
        if (gVar != null && gVar.cancel(false)) {
            AbstractC0335i0.a("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        u0();
    }

    public final void L0(final L0.b bVar, boolean z6) {
        D6.g gVar = this.f5911q;
        if (gVar != null && gVar.cancel(false)) {
            AbstractC0335i0.a("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        D6.g a6 = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: X.d0
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return k0.d0(k0.this, bVar, aVar);
            }
        });
        this.f5911q = a6;
        N.f.b(a6, new c(a6, z6), M.c.e());
    }

    @Override // F.I0
    public O0 M(I.P p6) {
        this.f5910p.g(p6);
        V(this.f5910p.o());
        return e().f().d(p6).a();
    }

    public final boolean M0() {
        return this.f5909o.b() != null;
    }

    @Override // F.I0
    public O0 N(O0 o02) {
        AbstractC0335i0.a("VideoCapture", "onSuggestedStreamSpecUpdated: " + o02);
        List p6 = ((Y.a) j()).p(null);
        if (p6 != null && !p6.contains(o02.e())) {
            AbstractC0335i0.l("VideoCapture", "suggested resolution " + o02.e() + " is not in custom ordered resolutions " + p6);
        }
        return o02;
    }

    public boolean Q0(b0 b0Var, b0 b0Var2) {
        return this.f5918x && b0Var.b() != null && b0Var2.b() == null;
    }

    public final void R0(I.D d6, Y0.a aVar) {
        AbstractC0808q z02 = z0();
        y0.g.b(z02 != null, "Unable to update target resolution by null MediaSpec.");
        F.C y02 = y0();
        c0 B02 = B0(d6);
        List d7 = B02.d(y02);
        if (d7.isEmpty()) {
            AbstractC0335i0.l("VideoCapture", "Can't find any supported quality on the device.");
            return;
        }
        y0 d8 = z02.d();
        C0814x e6 = d8.e();
        List h6 = e6.h(d7);
        AbstractC0335i0.a("VideoCapture", "Found selectedQualities " + h6 + " by " + e6);
        if (h6.isEmpty()) {
            throw new IllegalArgumentException("Unable to find supported quality by QualitySelector");
        }
        int b6 = d8.b();
        C0813w c0813w = new C0813w(d6.m(m()), C0814x.j(B02, y02));
        ArrayList arrayList = new ArrayList();
        Iterator it = h6.iterator();
        while (it.hasNext()) {
            arrayList.addAll(c0813w.g((AbstractC0811u) it.next(), b6));
        }
        AbstractC0335i0.a("VideoCapture", "Set custom ordered resolutions = " + arrayList);
        aVar.b().H(InterfaceC0441m0.f2512q, arrayList);
    }

    @Override // F.I0
    public void T(Rect rect) {
        super.T(rect);
        I0();
    }

    @Override // F.I0
    public Y0 k(boolean z6, Z0 z02) {
        e eVar = f5906z;
        I.P a6 = z02.a(eVar.c().G(), 1);
        if (z6) {
            a6 = I.P.Q(a6, eVar.c());
        }
        if (a6 == null) {
            return null;
        }
        return w(a6).c();
    }

    public final Rect m0(Rect rect, int i6) {
        return M0() ? L.q.m(L.q.d(((H0.h) y0.g.f(this.f5909o.b())).a(), i6)) : rect;
    }

    public final Size n0(Size size, Rect rect, Rect rect2) {
        if (!M0() || rect2.equals(rect)) {
            return size;
        }
        float height = rect2.height() / rect.height();
        return new Size((int) Math.ceil(size.getWidth() * height), (int) Math.ceil(size.getHeight() * height));
    }

    public final int o0(int i6) {
        return M0() ? L.q.r(i6 - this.f5909o.b().c()) : i6;
    }

    public void s0(L0.b bVar, b0 b0Var, O0 o02) {
        boolean z6 = b0Var.a() == -1;
        boolean z7 = b0Var.c() == b0.a.ACTIVE;
        if (z6 && z7) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        bVar.p();
        F.C b6 = o02.b();
        if (!z6) {
            if (z7) {
                bVar.m(this.f5907m, b6);
            } else {
                bVar.i(this.f5907m, b6);
            }
        }
        L0(bVar, z7);
    }

    public final Rect t0(Size size, e0.o0 o0Var) {
        Rect x6 = x() != null ? x() : new Rect(0, 0, size.getWidth(), size.getHeight());
        return (o0Var == null || o0Var.g(x6.width(), x6.height())) ? x6 : l0(x6, size, o0Var);
    }

    public String toString() {
        return "VideoCapture:" + o();
    }

    @Override // F.I0
    public Set u() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    public final T.U v0(I.E e6, Rect rect, Size size, F.C c6) {
        l();
        if (!O0(e6) && !N0(rect, size) && !P0(e6) && !M0()) {
            return null;
        }
        AbstractC0335i0.a("VideoCapture", "Surface processing is enabled.");
        I.E g6 = g();
        Objects.requireNonNull(g6);
        l();
        return new T.U(g6, C0765u.a.a(c6));
    }

    @Override // F.I0
    public Y0.a w(I.P p6) {
        return d.g(p6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final L0.b w0(final String str, Y.a aVar, final O0 o02) {
        final Y.a aVar2;
        final k0 k0Var = this;
        L.p.a();
        final I.E e6 = (I.E) y0.g.f(k0Var.g());
        Size e7 = o02.e();
        Runnable runnable = new Runnable() { // from class: X.e0
            @Override // java.lang.Runnable
            public final void run() {
                k0.this.E();
            }
        };
        Range c6 = o02.c();
        if (Objects.equals(c6, O0.f2327a)) {
            c6 = e.f5933d;
        }
        Range range = c6;
        AbstractC0808q z02 = k0Var.z0();
        Objects.requireNonNull(z02);
        c0 B02 = k0Var.B0(e6.b());
        F.C b6 = o02.b();
        e0.o0 C02 = k0Var.C0(aVar.X(), B02, b6, z02, e7, range);
        k0Var.f5917w = k0Var.o0(k0Var.q(e6, k0Var.A(e6)));
        Rect t02 = k0Var.t0(e7, C02);
        Rect m02 = k0Var.m0(t02, k0Var.f5917w);
        k0Var.f5916v = m02;
        Size n02 = k0Var.n0(e7, t02, m02);
        if (k0Var.M0()) {
            k0Var.f5918x = true;
        }
        T.U v02 = k0Var.v0(e6, k0Var.f5916v, e7, b6);
        k0Var.f5914t = v02;
        final T0 h6 = (v02 == null && e6.m()) ? T0.UPTIME : e6.n().h();
        AbstractC0335i0.a("VideoCapture", "camera timebase = " + e6.n().h() + ", processing timebase = " + h6);
        O0 a6 = o02.f().e(n02).c(range).a();
        y0.g.h(k0Var.f5908n == null);
        T.L l6 = new T.L(2, 34, a6, k0Var.s(), e6.m(), k0Var.f5916v, k0Var.f5917w, k0Var.d(), k0Var.P0(e6));
        k0Var.f5908n = l6;
        l6.f(runnable);
        if (k0Var.f5914t != null) {
            U.d i6 = U.d.i(k0Var.f5908n);
            final T.L l7 = (T.L) k0Var.f5914t.j(U.b.c(k0Var.f5908n, Collections.singletonList(i6))).get(i6);
            Objects.requireNonNull(l7);
            aVar2 = aVar;
            k0Var = this;
            l7.f(new Runnable() { // from class: X.f0
                @Override // java.lang.Runnable
                public final void run() {
                    k0.this.F0(l7, e6, aVar2, h6);
                }
            });
            k0Var.f5912r = l7.k(e6);
            final I.W o6 = k0Var.f5908n.o();
            k0Var.f5907m = o6;
            o6.k().c(new Runnable() { // from class: X.g0
                @Override // java.lang.Runnable
                public final void run() {
                    k0.a0(k0.this, o6);
                }
            }, M.c.e());
        } else {
            aVar2 = aVar;
            H0 k6 = k0Var.f5908n.k(e6);
            k0Var.f5912r = k6;
            k0Var.f5907m = k6.k();
        }
        aVar2.Y().b(k0Var.f5912r, h6);
        k0Var.I0();
        k0Var.f5907m.p(MediaCodec.class);
        L0.b q6 = L0.b.q(aVar2, o02.e());
        q6.t(o02.c());
        q6.f(new L0.c() { // from class: X.h0
            @Override // I.L0.c
            public final void a(L0 l02, L0.f fVar) {
                k0.this.G0(str, aVar2, o02);
            }
        });
        if (f5905B) {
            q6.w(1);
        }
        if (o02.d() != null) {
            q6.g(o02.d());
        }
        return q6;
    }

    public F.C y0() {
        return j().v() ? j().l() : e.f5934e;
    }

    public final AbstractC0808q z0() {
        return (AbstractC0808q) x0(A0().c(), null);
    }
}
