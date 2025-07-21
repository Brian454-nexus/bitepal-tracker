package H;

import F.X;
import F.Y;
import H.C0385i;
import H.C0393q;
import H.C0396u;
import H.F;
import I.G0;
import T.C0766v;
import java.util.Objects;
import java.util.concurrent.Executor;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class F {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f1905a;

    /* renamed from: b, reason: collision with root package name */
    public final T.x f1906b;

    /* renamed from: c, reason: collision with root package name */
    public a f1907c;

    /* renamed from: d, reason: collision with root package name */
    public T.z f1908d;

    /* renamed from: e, reason: collision with root package name */
    public T.z f1909e;

    /* renamed from: f, reason: collision with root package name */
    public T.z f1910f;

    /* renamed from: g, reason: collision with root package name */
    public T.z f1911g;

    /* renamed from: h, reason: collision with root package name */
    public T.z f1912h;

    /* renamed from: i, reason: collision with root package name */
    public T.z f1913i;

    /* renamed from: j, reason: collision with root package name */
    public T.z f1914j;

    /* renamed from: k, reason: collision with root package name */
    public T.z f1915k;

    /* renamed from: l, reason: collision with root package name */
    public final G0 f1916l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f1917m;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {
        public static a d(int i6, int i7) {
            return new C0382f(new C0766v(), i6, i7);
        }

        public abstract C0766v a();

        public abstract int b();

        public abstract int c();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class b {
        public static b c(G g6, androidx.camera.core.d dVar) {
            return new C0383g(g6, dVar);
        }

        public abstract androidx.camera.core.d a();

        public abstract G b();
    }

    public F(Executor executor, T.x xVar) {
        this(executor, xVar, Q.b.b());
    }

    public static /* synthetic */ void a(final F f6, final b bVar) {
        f6.getClass();
        if (bVar.b().i()) {
            return;
        }
        f6.f1905a.execute(new Runnable() { // from class: H.B
            @Override // java.lang.Runnable
            public final void run() {
                F.this.h(bVar);
            }
        });
    }

    public static void k(final G g6, final Y y6) {
        M.c.e().execute(new Runnable() { // from class: H.E
            @Override // java.lang.Runnable
            public final void run() {
                G.this.o(y6);
            }
        });
    }

    public final T.A f(T.A a6, int i6) {
        y0.g.h(a6.e() == 256);
        T.A a7 = (T.A) this.f1912h.apply(a6);
        T.z zVar = this.f1915k;
        if (zVar != null) {
            a7 = (T.A) zVar.apply(a7);
        }
        return (T.A) this.f1910f.apply(C0385i.a.c(a7, i6));
    }

    public androidx.camera.core.d g(b bVar) {
        G b6 = bVar.b();
        T.A a6 = (T.A) this.f1908d.apply(bVar);
        if ((a6.e() == 35 || this.f1915k != null || this.f1917m) && this.f1907c.c() == 256) {
            T.A a7 = (T.A) this.f1909e.apply(C0393q.a.c(a6, b6.c()));
            if (this.f1915k != null) {
                a7 = f(a7, b6.c());
            }
            a6 = (T.A) this.f1914j.apply(a7);
        }
        return (androidx.camera.core.d) this.f1913i.apply(a6);
    }

    public void h(b bVar) {
        final G b6 = bVar.b();
        try {
            if (bVar.b().j()) {
                final androidx.camera.core.d g6 = g(bVar);
                M.c.e().execute(new Runnable() { // from class: H.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        G.this.m(g6);
                    }
                });
            } else {
                final X.h i6 = i(bVar);
                M.c.e().execute(new Runnable() { // from class: H.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        G.this.l(i6);
                    }
                });
            }
        } catch (Y e6) {
            k(b6, e6);
        } catch (OutOfMemoryError e7) {
            k(b6, new Y(0, "Processing failed due to low memory.", e7));
        } catch (RuntimeException e8) {
            k(b6, new Y(0, "Processing failed.", e8));
        }
    }

    public X.h i(b bVar) {
        y0.g.b(this.f1907c.c() == 256, String.format("On-disk capture only support JPEG output format. Output format: %s", Integer.valueOf(this.f1907c.c())));
        G b6 = bVar.b();
        T.A a6 = (T.A) this.f1909e.apply(C0393q.a.c((T.A) this.f1908d.apply(bVar), b6.c()));
        if (a6.i() || this.f1915k != null) {
            a6 = f(a6, b6.c());
        }
        T.z zVar = this.f1911g;
        X.g d6 = b6.d();
        Objects.requireNonNull(d6);
        return (X.h) zVar.apply(C0396u.a.c(a6, d6));
    }

    public void j() {
    }

    public Void l(a aVar) {
        this.f1907c = aVar;
        aVar.a().a(new InterfaceC2343a() { // from class: H.A
            @Override // y0.InterfaceC2343a
            public final void accept(Object obj) {
                F.a(F.this, (F.b) obj);
            }
        });
        this.f1908d = new z();
        this.f1909e = new C0393q(this.f1916l);
        this.f1912h = new C0395t();
        this.f1910f = new C0385i();
        this.f1911g = new C0396u();
        this.f1913i = new C0398w();
        if (aVar.b() != 35 && !this.f1917m) {
            return null;
        }
        this.f1914j = new C0397v();
        return null;
    }

    public F(Executor executor, T.x xVar, G0 g02) {
        if (Q.b.a(Q.g.class) != null) {
            this.f1905a = M.c.g(executor);
        } else {
            this.f1905a = executor;
        }
        this.f1906b = xVar;
        this.f1916l = g02;
        this.f1917m = g02.a(Q.e.class);
    }
}
