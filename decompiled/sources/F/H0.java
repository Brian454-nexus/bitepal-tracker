package F;

import F.H0;
import I.O0;
import I.W;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import l0.AbstractC1728c;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class H0 {

    /* renamed from: o, reason: collision with root package name */
    public static final Range f1264o = O0.f2327a;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1265a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Size f1266b;

    /* renamed from: c, reason: collision with root package name */
    public final C f1267c;

    /* renamed from: d, reason: collision with root package name */
    public final Range f1268d;

    /* renamed from: e, reason: collision with root package name */
    public final I.E f1269e;

    /* renamed from: f, reason: collision with root package name */
    public final D6.g f1270f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC1728c.a f1271g;

    /* renamed from: h, reason: collision with root package name */
    public final D6.g f1272h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC1728c.a f1273i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC1728c.a f1274j;

    /* renamed from: k, reason: collision with root package name */
    public final I.W f1275k;

    /* renamed from: l, reason: collision with root package name */
    public h f1276l;

    /* renamed from: m, reason: collision with root package name */
    public i f1277m;

    /* renamed from: n, reason: collision with root package name */
    public Executor f1278n;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements N.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1728c.a f1279a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ D6.g f1280b;

        public a(AbstractC1728c.a aVar, D6.g gVar) {
            this.f1279a = aVar;
            this.f1280b = gVar;
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            y0.g.h(this.f1279a.c(null));
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            if (th instanceof f) {
                y0.g.h(this.f1280b.cancel(false));
            } else {
                y0.g.h(this.f1279a.c(null));
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends I.W {
        public b(Size size, int i6) {
            super(size, i6);
        }

        @Override // I.W
        public D6.g o() {
            return H0.this.f1270f;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements N.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D6.g f1283a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1728c.a f1284b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f1285c;

        public c(D6.g gVar, AbstractC1728c.a aVar, String str) {
            this.f1283a = gVar;
            this.f1284b = aVar;
            this.f1285c = str;
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Surface surface) {
            N.f.j(this.f1283a, this.f1284b);
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            if (!(th instanceof CancellationException)) {
                this.f1284b.c(null);
                return;
            }
            y0.g.h(this.f1284b.f(new f(this.f1285c + " cancelled.", th)));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d implements N.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2343a f1287a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Surface f1288b;

        public d(InterfaceC2343a interfaceC2343a, Surface surface) {
            this.f1287a = interfaceC2343a;
            this.f1288b = surface;
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r32) {
            this.f1287a.accept(g.c(0, this.f1288b));
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            y0.g.i(th instanceof f, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th);
            this.f1287a.accept(g.c(1, this.f1288b));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class e implements N.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f1290a;

        public e(Runnable runnable) {
            this.f1290a = runnable;
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            this.f1290a.run();
        }

        @Override // N.c
        public void onFailure(Throwable th) {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class f extends RuntimeException {
        public f(String str, Throwable th) {
            super(str, th);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class g {
        public static g c(int i6, Surface surface) {
            return new C0336j(i6, surface);
        }

        public abstract int a();

        public abstract Surface b();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class h {
        public static h g(Rect rect, int i6, int i7, boolean z6, Matrix matrix, boolean z7) {
            return new C0338k(rect, i6, i7, z6, matrix, z7);
        }

        public abstract Rect a();

        public abstract boolean b();

        public abstract int c();

        public abstract Matrix d();

        public abstract int e();

        public abstract boolean f();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface i {
        void a(h hVar);
    }

    public H0(Size size, I.E e6, C c6, Range range, Runnable runnable) {
        this.f1266b = size;
        this.f1269e = e6;
        this.f1267c = c6;
        this.f1268d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        D6.g a6 = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: F.A0
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return H0.b(atomicReference, str, aVar);
            }
        });
        AbstractC1728c.a aVar = (AbstractC1728c.a) y0.g.f((AbstractC1728c.a) atomicReference.get());
        this.f1274j = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        D6.g a7 = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: F.B0
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar2) {
                return H0.h(atomicReference2, str, aVar2);
            }
        });
        this.f1272h = a7;
        N.f.b(a7, new a(aVar, a6), M.c.b());
        AbstractC1728c.a aVar2 = (AbstractC1728c.a) y0.g.f((AbstractC1728c.a) atomicReference2.get());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        D6.g a8 = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: F.C0
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar3) {
                return H0.c(atomicReference3, str, aVar3);
            }
        });
        this.f1270f = a8;
        this.f1271g = (AbstractC1728c.a) y0.g.f((AbstractC1728c.a) atomicReference3.get());
        b bVar = new b(size, 34);
        this.f1275k = bVar;
        D6.g k6 = bVar.k();
        N.f.b(a8, new c(k6, aVar2, str), M.c.b());
        k6.c(new Runnable() { // from class: F.D0
            @Override // java.lang.Runnable
            public final void run() {
                H0.this.f1270f.cancel(true);
            }
        }, M.c.b());
        this.f1273i = o(M.c.b(), runnable);
    }

    public static /* synthetic */ Object b(AtomicReference atomicReference, String str, AbstractC1728c.a aVar) {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    public static /* synthetic */ Object c(AtomicReference atomicReference, String str, AbstractC1728c.a aVar) {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    public static /* synthetic */ Object g(H0 h02, AtomicReference atomicReference, AbstractC1728c.a aVar) {
        h02.getClass();
        atomicReference.set(aVar);
        return "SurfaceRequest-surface-recreation(" + h02.hashCode() + ")";
    }

    public static /* synthetic */ Object h(AtomicReference atomicReference, String str, AbstractC1728c.a aVar) {
        atomicReference.set(aVar);
        return str + "-status";
    }

    public I.E j() {
        return this.f1269e;
    }

    public I.W k() {
        return this.f1275k;
    }

    public C l() {
        return this.f1267c;
    }

    public Range m() {
        return this.f1268d;
    }

    public Size n() {
        return this.f1266b;
    }

    public final AbstractC1728c.a o(Executor executor, Runnable runnable) {
        final AtomicReference atomicReference = new AtomicReference(null);
        N.f.b(AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: F.G0
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return H0.g(H0.this, atomicReference, aVar);
            }
        }), new e(runnable), executor);
        return (AbstractC1728c.a) y0.g.f((AbstractC1728c.a) atomicReference.get());
    }

    public boolean p() {
        return this.f1270f.isDone();
    }

    public void q(final Surface surface, Executor executor, final InterfaceC2343a interfaceC2343a) {
        if (this.f1271g.c(surface) || this.f1270f.isCancelled()) {
            N.f.b(this.f1272h, new d(interfaceC2343a, surface), executor);
            return;
        }
        y0.g.h(this.f1270f.isDone());
        try {
            this.f1270f.get();
            executor.execute(new Runnable() { // from class: F.E0
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC2343a.this.accept(H0.g.c(3, surface));
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new Runnable() { // from class: F.F0
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC2343a.this.accept(H0.g.c(4, surface));
                }
            });
        }
    }

    public void r(Executor executor, final i iVar) {
        final h hVar;
        synchronized (this.f1265a) {
            this.f1277m = iVar;
            this.f1278n = executor;
            hVar = this.f1276l;
        }
        if (hVar != null) {
            executor.execute(new Runnable() { // from class: F.z0
                @Override // java.lang.Runnable
                public final void run() {
                    H0.i.this.a(hVar);
                }
            });
        }
    }

    public void s(final h hVar) {
        final i iVar;
        Executor executor;
        synchronized (this.f1265a) {
            this.f1276l = hVar;
            iVar = this.f1277m;
            executor = this.f1278n;
        }
        if (iVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: F.y0
            @Override // java.lang.Runnable
            public final void run() {
                H0.i.this.a(hVar);
            }
        });
    }

    public boolean t() {
        return this.f1271g.f(new W.b("Surface request will not complete."));
    }
}
