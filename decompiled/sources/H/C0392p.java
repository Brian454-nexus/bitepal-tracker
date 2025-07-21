package H;

import F.AbstractC0329f0;
import F.AbstractC0335i0;
import F.InterfaceC0327e0;
import F.Y;
import I.AbstractC0442n;
import I.C0445o0;
import I.InterfaceC0443n0;
import T.C0766v;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.b;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import y.F1;
import y0.InterfaceC2343a;

/* renamed from: H.p, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0392p {

    /* renamed from: a, reason: collision with root package name */
    public final Set f2012a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public G f2013b = null;

    /* renamed from: c, reason: collision with root package name */
    public androidx.camera.core.f f2014c;

    /* renamed from: d, reason: collision with root package name */
    public c f2015d;

    /* renamed from: e, reason: collision with root package name */
    public b f2016e;

    /* renamed from: H.p$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements N.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ G f2017a;

        public a(G g6) {
            this.f2017a = g6;
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            L.p.a();
            G g6 = this.f2017a;
            C0392p c0392p = C0392p.this;
            if (g6 == c0392p.f2013b) {
                c0392p.f2013b = null;
            }
        }
    }

    /* renamed from: H.p$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public AbstractC0442n f2019a = new a();

        /* renamed from: b, reason: collision with root package name */
        public I.W f2020b;

        /* renamed from: H.p$b$a */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a extends AbstractC0442n {
            public a() {
            }
        }

        public static b j(Size size, int i6, int i7, boolean z6, InterfaceC0327e0 interfaceC0327e0) {
            return new C0378b(size, i6, i7, z6, interfaceC0327e0, new C0766v(), new C0766v());
        }

        public AbstractC0442n a() {
            return this.f2019a;
        }

        public abstract C0766v b();

        public abstract InterfaceC0327e0 c();

        public abstract int d();

        public abstract int e();

        public abstract C0766v f();

        public abstract Size g();

        public I.W h() {
            I.W w6 = this.f2020b;
            Objects.requireNonNull(w6);
            return w6;
        }

        public abstract boolean i();

        public void k(AbstractC0442n abstractC0442n) {
            this.f2019a = abstractC0442n;
        }

        public void l(Surface surface) {
            y0.g.i(this.f2020b == null, "The surface is already set.");
            this.f2020b = new C0445o0(surface, g(), d());
        }
    }

    /* renamed from: H.p$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class c {
        public static c e(int i6, int i7) {
            return new C0379c(new C0766v(), new C0766v(), i6, i7);
        }

        public abstract C0766v a();

        public abstract int b();

        public abstract int c();

        public abstract C0766v d();
    }

    public static /* synthetic */ void a(C0392p c0392p, InterfaceC0443n0 interfaceC0443n0) {
        c0392p.getClass();
        try {
            androidx.camera.core.d acquireLatestImage = interfaceC0443n0.acquireLatestImage();
            if (acquireLatestImage != null) {
                c0392p.f(acquireLatestImage);
            } else {
                c0392p.j(new Y(2, "Failed to acquire latest image", null));
            }
        } catch (IllegalStateException e6) {
            c0392p.j(new Y(2, "Failed to acquire latest image", e6));
        }
    }

    public static /* synthetic */ void b(C0392p c0392p, y yVar, G g6) {
        c0392p.g(g6);
        yVar.g(g6);
    }

    public static InterfaceC0443n0 c(InterfaceC0327e0 interfaceC0327e0, int i6, int i7, int i8) {
        return interfaceC0327e0 != null ? interfaceC0327e0.a(i6, i7, i8, 4, 0L) : AbstractC0329f0.a(i6, i7, i8, 4);
    }

    public int d() {
        L.p.a();
        y0.g.i(this.f2014c != null, "The ImageReader is not initialized.");
        return this.f2014c.h();
    }

    public final void e(androidx.camera.core.d dVar) {
        Object d6 = dVar.O().a().d(this.f2013b.h());
        Objects.requireNonNull(d6);
        Integer num = (Integer) d6;
        int intValue = num.intValue();
        y0.g.i(this.f2012a.contains(num), "Received an unexpected stage id" + intValue);
        this.f2012a.remove(num);
        c cVar = this.f2015d;
        Objects.requireNonNull(cVar);
        cVar.a().accept(dVar);
        if (this.f2012a.isEmpty()) {
            G g6 = this.f2013b;
            this.f2013b = null;
            g6.n();
        }
    }

    public void f(androidx.camera.core.d dVar) {
        L.p.a();
        if (this.f2013b != null) {
            e(dVar);
            return;
        }
        AbstractC0335i0.a("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + dVar);
        dVar.close();
    }

    public void g(G g6) {
        L.p.a();
        y0.g.i(d() > 0, "Too many acquire images. Close image to be able to process next.");
        y0.g.i(this.f2013b == null || this.f2012a.isEmpty(), "The previous request is not complete");
        this.f2013b = g6;
        this.f2012a.addAll(g6.g());
        c cVar = this.f2015d;
        Objects.requireNonNull(cVar);
        cVar.d().accept(g6);
        N.f.b(g6.a(), new a(g6), M.c.b());
    }

    public void h() {
        L.p.a();
        b bVar = this.f2016e;
        Objects.requireNonNull(bVar);
        androidx.camera.core.f fVar = this.f2014c;
        Objects.requireNonNull(fVar);
        i(bVar, fVar);
    }

    public final void i(b bVar, androidx.camera.core.f fVar) {
        bVar.h().d();
        D6.g k6 = bVar.h().k();
        Objects.requireNonNull(fVar);
        k6.c(new F1(fVar), M.c.e());
    }

    public void j(Y y6) {
        L.p.a();
        G g6 = this.f2013b;
        if (g6 != null) {
            g6.k(y6);
        }
    }

    public void k(b.a aVar) {
        L.p.a();
        y0.g.i(this.f2014c != null, "The ImageReader is not initialized.");
        this.f2014c.j(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c l(b bVar) {
        InterfaceC2343a interfaceC2343a;
        y yVar;
        y0.g.i(this.f2016e == null && this.f2014c == null, "CaptureNode does not support recreation yet.");
        this.f2016e = bVar;
        Size g6 = bVar.g();
        int d6 = bVar.d();
        if (bVar.i()) {
            bVar.c();
            final y yVar2 = new y(c(null, g6.getWidth(), g6.getHeight(), d6));
            interfaceC2343a = new InterfaceC2343a() { // from class: H.m
                @Override // y0.InterfaceC2343a
                public final void accept(Object obj) {
                    C0392p.b(C0392p.this, yVar2, (G) obj);
                }
            };
            yVar = yVar2;
        } else {
            bVar.c();
            androidx.camera.core.e eVar = new androidx.camera.core.e(g6.getWidth(), g6.getHeight(), d6, 4);
            bVar.k(eVar.l());
            interfaceC2343a = new InterfaceC2343a() { // from class: H.l
                @Override // y0.InterfaceC2343a
                public final void accept(Object obj) {
                    C0392p.this.g((G) obj);
                }
            };
            yVar = eVar;
        }
        Surface surface = yVar.getSurface();
        Objects.requireNonNull(surface);
        bVar.l(surface);
        this.f2014c = new androidx.camera.core.f(yVar);
        yVar.d(new InterfaceC0443n0.a() { // from class: H.n
            @Override // I.InterfaceC0443n0.a
            public final void a(InterfaceC0443n0 interfaceC0443n0) {
                C0392p.a(C0392p.this, interfaceC0443n0);
            }
        }, M.c.e());
        bVar.f().a(interfaceC2343a);
        bVar.b().a(new InterfaceC2343a() { // from class: H.o
            @Override // y0.InterfaceC2343a
            public final void accept(Object obj) {
                C0392p.this.j((Y) obj);
            }
        });
        c e6 = c.e(bVar.d(), bVar.e());
        this.f2015d = e6;
        return e6;
    }
}
