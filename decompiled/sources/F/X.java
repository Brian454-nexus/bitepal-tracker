package F;

import H.C0394s;
import I.C0437k0;
import I.C0464y0;
import I.InterfaceC0439l0;
import I.InterfaceC0441m0;
import I.InterfaceC0443n0;
import I.InterfaceC0462x0;
import I.L0;
import I.O0;
import I.P;
import I.Y0;
import I.Z0;
import U.c;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.io.File;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import t.InterfaceC2069a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class X extends I0 {

    /* renamed from: w, reason: collision with root package name */
    public static final c f1372w = new c();

    /* renamed from: x, reason: collision with root package name */
    public static final R.b f1373x = new R.b();

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC0443n0.a f1374m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1375n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicReference f1376o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1377p;

    /* renamed from: q, reason: collision with root package name */
    public int f1378q;

    /* renamed from: r, reason: collision with root package name */
    public Rational f1379r;

    /* renamed from: s, reason: collision with root package name */
    public L0.b f1380s;

    /* renamed from: t, reason: collision with root package name */
    public C0394s f1381t;

    /* renamed from: u, reason: collision with root package name */
    public H.T f1382u;

    /* renamed from: v, reason: collision with root package name */
    public final H.r f1383v;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements H.r {
        public a() {
        }

        @Override // H.r
        public D6.g a(List list) {
            return X.this.t0(list);
        }

        @Override // H.r
        public void b() {
            X.this.o0();
        }

        @Override // H.r
        public void c() {
            X.this.x0();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements Y0.a, InterfaceC0441m0.a {

        /* renamed from: a, reason: collision with root package name */
        public final C0464y0 f1385a;

        public b() {
            this(C0464y0.a0());
        }

        public static b f(I.P p6) {
            return new b(C0464y0.b0(p6));
        }

        @Override // F.E
        public InterfaceC0462x0 b() {
            return this.f1385a;
        }

        public X e() {
            Integer num;
            Integer num2 = (Integer) b().e(C0437k0.f2484K, null);
            if (num2 != null) {
                b().H(InterfaceC0439l0.f2494f, num2);
            } else {
                b().H(InterfaceC0439l0.f2494f, 256);
            }
            C0437k0 c6 = c();
            InterfaceC0441m0.u(c6);
            X x6 = new X(c6);
            Size size = (Size) b().e(InterfaceC0441m0.f2507l, null);
            if (size != null) {
                x6.q0(new Rational(size.getWidth(), size.getHeight()));
            }
            y0.g.g((Executor) b().e(O.g.f3860B, M.c.d()), "The IO executor can't be null");
            InterfaceC0462x0 b6 = b();
            P.a aVar = C0437k0.f2482I;
            if (!b6.h(aVar) || ((num = (Integer) b().b(aVar)) != null && (num.intValue() == 0 || num.intValue() == 1 || num.intValue() == 2))) {
                return x6;
            }
            throw new IllegalArgumentException("The flash mode is not allowed to set: " + num);
        }

        @Override // I.Y0.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C0437k0 c() {
            return new C0437k0(I.D0.Z(this.f1385a));
        }

        public b h(Z0.b bVar) {
            b().H(Y0.f2391A, bVar);
            return this;
        }

        public b i(C c6) {
            if (!Objects.equals(C.f1236d, c6)) {
                throw new UnsupportedOperationException("ImageCapture currently only supports SDR");
            }
            b().H(InterfaceC0439l0.f2495g, c6);
            return this;
        }

        public b j(int i6) {
            b().H(C0437k0.f2482I, Integer.valueOf(i6));
            return this;
        }

        public b k(U.c cVar) {
            b().H(InterfaceC0441m0.f2511p, cVar);
            return this;
        }

        public b l(int i6) {
            b().H(Y0.f2396v, Integer.valueOf(i6));
            return this;
        }

        public b m(int i6) {
            if (i6 == -1) {
                i6 = 0;
            }
            b().H(InterfaceC0441m0.f2503h, Integer.valueOf(i6));
            return this;
        }

        public b n(Class cls) {
            b().H(O.j.f3872D, cls);
            if (b().e(O.j.f3871C, null) == null) {
                o(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public b o(String str) {
            b().H(O.j.f3871C, str);
            return this;
        }

        @Override // I.InterfaceC0441m0.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b a(Size size) {
            b().H(InterfaceC0441m0.f2507l, size);
            return this;
        }

        @Override // I.InterfaceC0441m0.a
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b d(int i6) {
            b().H(InterfaceC0441m0.f2504i, Integer.valueOf(i6));
            return this;
        }

        public b(C0464y0 c0464y0) {
            this.f1385a = c0464y0;
            Class cls = (Class) c0464y0.e(O.j.f3872D, null);
            if (cls != null && !cls.equals(X.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            n(X.class);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final U.c f1386a;

        /* renamed from: b, reason: collision with root package name */
        public static final C0437k0 f1387b;

        /* renamed from: c, reason: collision with root package name */
        public static final C f1388c;

        static {
            U.c a6 = new c.a().d(U.a.f5148c).f(U.d.f5160c).a();
            f1386a = a6;
            C c6 = C.f1236d;
            f1388c = c6;
            f1387b = new b().l(4).m(0).k(a6).h(Z0.b.IMAGE_CAPTURE).i(c6).c();
        }

        public C0437k0 a() {
            return f1387b;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1389a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1390b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1391c;

        /* renamed from: d, reason: collision with root package name */
        public Location f1392d;

        public Location a() {
            return this.f1392d;
        }

        public boolean b() {
            return this.f1389a;
        }

        public boolean c() {
            return this.f1391c;
        }

        public String toString() {
            return "Metadata{mIsReversedHorizontal=" + this.f1389a + ", mIsReversedVertical=" + this.f1391c + ", mLocation=" + this.f1392d + "}";
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class e {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface f {
        void a(Y y6);

        void b(h hVar);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final File f1393a;

        /* renamed from: b, reason: collision with root package name */
        public final ContentResolver f1394b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f1395c;

        /* renamed from: d, reason: collision with root package name */
        public final ContentValues f1396d;

        /* renamed from: e, reason: collision with root package name */
        public final OutputStream f1397e;

        /* renamed from: f, reason: collision with root package name */
        public final d f1398f;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public File f1399a;

            /* renamed from: b, reason: collision with root package name */
            public ContentResolver f1400b;

            /* renamed from: c, reason: collision with root package name */
            public Uri f1401c;

            /* renamed from: d, reason: collision with root package name */
            public ContentValues f1402d;

            /* renamed from: e, reason: collision with root package name */
            public OutputStream f1403e;

            /* renamed from: f, reason: collision with root package name */
            public d f1404f;

            public a(File file) {
                this.f1399a = file;
            }

            public g a() {
                return new g(this.f1399a, this.f1400b, this.f1401c, this.f1402d, this.f1403e, this.f1404f);
            }
        }

        public g(File file, ContentResolver contentResolver, Uri uri, ContentValues contentValues, OutputStream outputStream, d dVar) {
            this.f1393a = file;
            this.f1394b = contentResolver;
            this.f1395c = uri;
            this.f1396d = contentValues;
            this.f1397e = outputStream;
            this.f1398f = dVar == null ? new d() : dVar;
        }

        public ContentResolver a() {
            return this.f1394b;
        }

        public ContentValues b() {
            return this.f1396d;
        }

        public File c() {
            return this.f1393a;
        }

        public d d() {
            return this.f1398f;
        }

        public OutputStream e() {
            return this.f1397e;
        }

        public Uri f() {
            return this.f1395c;
        }

        public String toString() {
            return "OutputFileOptions{mFile=" + this.f1393a + ", mContentResolver=" + this.f1394b + ", mSaveCollection=" + this.f1395c + ", mContentValues=" + this.f1396d + ", mOutputStream=" + this.f1397e + ", mMetadata=" + this.f1398f + "}";
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f1405a;

        public h(Uri uri) {
            this.f1405a = uri;
        }
    }

    public X(C0437k0 c0437k0) {
        super(c0437k0);
        this.f1374m = new InterfaceC0443n0.a() { // from class: F.U
            @Override // I.InterfaceC0443n0.a
            public final void a(InterfaceC0443n0 interfaceC0443n0) {
                X.Z(interfaceC0443n0);
            }
        };
        this.f1376o = new AtomicReference(null);
        this.f1378q = -1;
        this.f1379r = null;
        this.f1383v = new a();
        C0437k0 c0437k02 = (C0437k0) j();
        if (c0437k02.h(C0437k0.f2481H)) {
            this.f1375n = c0437k02.Y();
        } else {
            this.f1375n = 1;
        }
        this.f1377p = c0437k02.a0(0);
    }

    public static /* synthetic */ Void Y(List list) {
        return null;
    }

    public static /* synthetic */ void Z(InterfaceC0443n0 interfaceC0443n0) {
        try {
            androidx.camera.core.d acquireLatestImage = interfaceC0443n0.acquireLatestImage();
            try {
                Log.d("ImageCapture", "Discarding ImageProxy which was inadvertently acquired: " + acquireLatestImage);
                if (acquireLatestImage != null) {
                    acquireLatestImage.close();
                }
            } finally {
            }
        } catch (IllegalStateException e6) {
            Log.e("ImageCapture", "Failed to acquire latest image.", e6);
        }
    }

    public static /* synthetic */ void a0(X x6, String str, C0437k0 c0437k0, O0 o02, L0 l02, L0.f fVar) {
        if (!x6.y(str)) {
            x6.d0();
            return;
        }
        x6.f1382u.i();
        x6.e0(true);
        L0.b f02 = x6.f0(str, c0437k0, o02);
        x6.f1380s = f02;
        x6.V(f02.o());
        x6.E();
        x6.f1382u.j();
    }

    private void d0() {
        e0(false);
    }

    public static boolean m0(List list, int i6) {
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i6))) {
                return true;
            }
        }
        return false;
    }

    @Override // F.I0
    public void H() {
        y0.g.g(g(), "Attached camera cannot be null");
    }

    @Override // F.I0
    public void I() {
        w0();
    }

    @Override // F.I0
    public Y0 J(I.D d6, Y0.a aVar) {
        if (d6.l().a(Q.i.class)) {
            Boolean bool = Boolean.FALSE;
            InterfaceC0462x0 b6 = aVar.b();
            P.a aVar2 = C0437k0.f2487N;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(b6.e(aVar2, bool2))) {
                AbstractC0335i0.l("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                AbstractC0335i0.e("ImageCapture", "Requesting software JPEG due to device quirk.");
                aVar.b().H(aVar2, bool2);
            }
        }
        boolean g02 = g0(aVar.b());
        Integer num = (Integer) aVar.b().e(C0437k0.f2484K, null);
        if (num != null) {
            y0.g.b(!n0() || num.intValue() == 256, "Cannot set non-JPEG buffer format with Extensions enabled.");
            aVar.b().H(InterfaceC0439l0.f2494f, Integer.valueOf(g02 ? 35 : num.intValue()));
        } else if (g02) {
            aVar.b().H(InterfaceC0439l0.f2494f, 35);
        } else {
            List list = (List) aVar.b().e(InterfaceC0441m0.f2510o, null);
            if (list == null) {
                aVar.b().H(InterfaceC0439l0.f2494f, 256);
            } else if (m0(list, 256)) {
                aVar.b().H(InterfaceC0439l0.f2494f, 256);
            } else if (m0(list, 35)) {
                aVar.b().H(InterfaceC0439l0.f2494f, 35);
            }
        }
        return aVar.c();
    }

    @Override // F.I0
    public void L() {
        c0();
    }

    @Override // F.I0
    public O0 M(I.P p6) {
        this.f1380s.g(p6);
        V(this.f1380s.o());
        return e().f().d(p6).a();
    }

    @Override // F.I0
    public O0 N(O0 o02) {
        L0.b f02 = f0(i(), (C0437k0) j(), o02);
        this.f1380s = f02;
        V(f02.o());
        C();
        return o02;
    }

    @Override // F.I0
    public void O() {
        c0();
        d0();
    }

    public final void c0() {
        H.T t6 = this.f1382u;
        if (t6 != null) {
            t6.e();
        }
    }

    public final void e0(boolean z6) {
        H.T t6;
        Log.d("ImageCapture", "clearPipeline");
        L.p.a();
        C0394s c0394s = this.f1381t;
        if (c0394s != null) {
            c0394s.a();
            this.f1381t = null;
        }
        if (z6 || (t6 = this.f1382u) == null) {
            return;
        }
        t6.e();
        this.f1382u = null;
    }

    public final L0.b f0(final String str, final C0437k0 c0437k0, final O0 o02) {
        L.p.a();
        Log.d("ImageCapture", String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, o02));
        Size e6 = o02.e();
        I.E g6 = g();
        Objects.requireNonNull(g6);
        boolean z6 = !g6.m() || n0();
        if (this.f1381t != null) {
            y0.g.h(z6);
            this.f1381t.a();
        }
        l();
        this.f1381t = new C0394s(c0437k0, e6, null, z6);
        if (this.f1382u == null) {
            this.f1382u = new H.T(this.f1383v);
        }
        this.f1382u.k(this.f1381t);
        L0.b f6 = this.f1381t.f(o02.e());
        if (h0() == 2) {
            h().a(f6);
        }
        if (o02.d() != null) {
            f6.g(o02.d());
        }
        f6.f(new L0.c() { // from class: F.V
            @Override // I.L0.c
            public final void a(L0 l02, L0.f fVar) {
                X.a0(X.this, str, c0437k0, o02, l02, fVar);
            }
        });
        return f6;
    }

    public boolean g0(InterfaceC0462x0 interfaceC0462x0) {
        boolean z6;
        Boolean bool = Boolean.TRUE;
        P.a aVar = C0437k0.f2487N;
        Boolean bool2 = Boolean.FALSE;
        boolean z7 = false;
        if (bool.equals(interfaceC0462x0.e(aVar, bool2))) {
            if (n0()) {
                AbstractC0335i0.l("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z6 = false;
            } else {
                z6 = true;
            }
            Integer num = (Integer) interfaceC0462x0.e(C0437k0.f2484K, null);
            if (num == null || num.intValue() == 256) {
                z7 = z6;
            } else {
                AbstractC0335i0.l("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z7) {
                AbstractC0335i0.l("ImageCapture", "Unable to support software JPEG. Disabling.");
                interfaceC0462x0.H(aVar, bool2);
            }
        }
        return z7;
    }

    public int h0() {
        return this.f1375n;
    }

    public int i0() {
        int i6;
        synchronized (this.f1376o) {
            i6 = this.f1378q;
            if (i6 == -1) {
                i6 = ((C0437k0) j()).Z(2);
            }
        }
        return i6;
    }

    public final int j0() {
        C0437k0 c0437k0 = (C0437k0) j();
        if (c0437k0.h(C0437k0.f2489P)) {
            return c0437k0.d0();
        }
        int i6 = this.f1375n;
        if (i6 == 0) {
            return 100;
        }
        if (i6 == 1 || i6 == 2) {
            return 95;
        }
        throw new IllegalStateException("CaptureMode " + this.f1375n + " is invalid");
    }

    @Override // F.I0
    public Y0 k(boolean z6, Z0 z02) {
        c cVar = f1372w;
        I.P a6 = z02.a(cVar.a().G(), h0());
        if (z6) {
            a6 = I.P.Q(a6, cVar.a());
        }
        if (a6 == null) {
            return null;
        }
        return w(a6).c();
    }

    public final Rect k0() {
        Rect x6 = x();
        Size f6 = f();
        Objects.requireNonNull(f6);
        if (x6 != null) {
            return x6;
        }
        if (!S.b.e(this.f1379r)) {
            return new Rect(0, 0, f6.getWidth(), f6.getHeight());
        }
        I.E g6 = g();
        Objects.requireNonNull(g6);
        int p6 = p(g6);
        Rational rational = new Rational(this.f1379r.getDenominator(), this.f1379r.getNumerator());
        if (!L.q.f(p6)) {
            rational = this.f1379r;
        }
        Rect a6 = S.b.a(f6, rational);
        Objects.requireNonNull(a6);
        return a6;
    }

    public int l0() {
        return v();
    }

    public final boolean n0() {
        if (g() == null) {
            return false;
        }
        g().g().k(null);
        return false;
    }

    public void o0() {
        synchronized (this.f1376o) {
            try {
                if (this.f1376o.get() != null) {
                    return;
                }
                this.f1376o.set(Integer.valueOf(i0()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p0(Executor executor, e eVar, f fVar) {
        Y y6 = new Y(4, "Not bound to a valid Camera [" + this + "]", null);
        if (fVar == null) {
            throw new IllegalArgumentException("Must have either in-memory or on-disk callback.");
        }
        fVar.a(y6);
    }

    public void q0(Rational rational) {
        this.f1379r = rational;
    }

    public void r0(int i6) {
        if (i6 != 0 && i6 != 1 && i6 != 2) {
            throw new IllegalArgumentException("Invalid flash mode: " + i6);
        }
        synchronized (this.f1376o) {
            this.f1378q = i6;
            w0();
        }
    }

    public void s0(int i6) {
        int l02 = l0();
        if (!S(i6) || this.f1379r == null) {
            return;
        }
        this.f1379r = S.b.c(Math.abs(L.c.b(i6) - L.c.b(l02)), this.f1379r);
    }

    public D6.g t0(List list) {
        L.p.a();
        return N.f.n(h().c(list, this.f1375n, this.f1377p), new InterfaceC2069a() { // from class: F.W
            @Override // t.InterfaceC2069a
            public final Object apply(Object obj) {
                return X.Y((List) obj);
            }
        }, M.c.b());
    }

    public String toString() {
        return "ImageCapture:" + o();
    }

    @Override // F.I0
    public Set u() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    public void u0(final g gVar, final Executor executor, final f fVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            M.c.e().execute(new Runnable() { // from class: F.T
                @Override // java.lang.Runnable
                public final void run() {
                    X.this.u0(gVar, executor, fVar);
                }
            });
        } else {
            v0(executor, null, fVar, gVar);
        }
    }

    public final void v0(Executor executor, e eVar, f fVar, g gVar) {
        L.p.a();
        Log.d("ImageCapture", "takePictureInternal");
        I.E g6 = g();
        if (g6 == null) {
            p0(executor, eVar, fVar);
            return;
        }
        H.T t6 = this.f1382u;
        Objects.requireNonNull(t6);
        t6.h(H.X.o(executor, eVar, fVar, gVar, k0(), s(), p(g6), j0(), h0(), this.f1380s.r()));
    }

    @Override // F.I0
    public Y0.a w(I.P p6) {
        return b.f(p6);
    }

    public final void w0() {
        synchronized (this.f1376o) {
            try {
                if (this.f1376o.get() != null) {
                    return;
                }
                h().g(i0());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x0() {
        synchronized (this.f1376o) {
            try {
                Integer num = (Integer) this.f1376o.getAndSet(null);
                if (num == null) {
                    return;
                }
                if (num.intValue() != i0()) {
                    w0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
