package androidx.camera.core;

import F.AbstractC0335i0;
import F.C0322c;
import F.Z;
import F.u0;
import I.AbstractC0442n;
import I.InterfaceC0443n0;
import I.InterfaceC0455u;
import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import y0.g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class e implements InterfaceC0443n0, b.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8379a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0442n f8380b;

    /* renamed from: c, reason: collision with root package name */
    public int f8381c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0443n0.a f8382d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8383e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0443n0 f8384f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC0443n0.a f8385g;

    /* renamed from: h, reason: collision with root package name */
    public Executor f8386h;

    /* renamed from: i, reason: collision with root package name */
    public final LongSparseArray f8387i;

    /* renamed from: j, reason: collision with root package name */
    public final LongSparseArray f8388j;

    /* renamed from: k, reason: collision with root package name */
    public int f8389k;

    /* renamed from: l, reason: collision with root package name */
    public final List f8390l;

    /* renamed from: m, reason: collision with root package name */
    public final List f8391m;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends AbstractC0442n {
        public a() {
        }

        @Override // I.AbstractC0442n
        public void b(InterfaceC0455u interfaceC0455u) {
            super.b(interfaceC0455u);
            e.this.p(interfaceC0455u);
        }
    }

    public e(int i6, int i7, int i8, int i9) {
        this(i(i6, i7, i8, i9));
    }

    public static /* synthetic */ void g(e eVar, InterfaceC0443n0.a aVar) {
        eVar.getClass();
        aVar.a(eVar);
    }

    public static /* synthetic */ void h(e eVar, InterfaceC0443n0 interfaceC0443n0) {
        synchronized (eVar.f8379a) {
            eVar.f8381c++;
        }
        eVar.m(interfaceC0443n0);
    }

    public static InterfaceC0443n0 i(int i6, int i7, int i8, int i9) {
        return new C0322c(ImageReader.newInstance(i6, i7, i8, i9));
    }

    @Override // androidx.camera.core.b.a
    public void a(d dVar) {
        synchronized (this.f8379a) {
            j(dVar);
        }
    }

    @Override // I.InterfaceC0443n0
    public d acquireLatestImage() {
        synchronized (this.f8379a) {
            try {
                if (this.f8390l.isEmpty()) {
                    return null;
                }
                if (this.f8389k >= this.f8390l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i6 = 0; i6 < this.f8390l.size() - 1; i6++) {
                    if (!this.f8391m.contains(this.f8390l.get(i6))) {
                        arrayList.add((d) this.f8390l.get(i6));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).close();
                }
                int size = this.f8390l.size();
                List list = this.f8390l;
                this.f8389k = size;
                d dVar = (d) list.get(size - 1);
                this.f8391m.add(dVar);
                return dVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // I.InterfaceC0443n0
    public int b() {
        int b6;
        synchronized (this.f8379a) {
            b6 = this.f8384f.b();
        }
        return b6;
    }

    @Override // I.InterfaceC0443n0
    public void c() {
        synchronized (this.f8379a) {
            this.f8384f.c();
            this.f8385g = null;
            this.f8386h = null;
            this.f8381c = 0;
        }
    }

    @Override // I.InterfaceC0443n0
    public void close() {
        synchronized (this.f8379a) {
            try {
                if (this.f8383e) {
                    return;
                }
                Iterator it = new ArrayList(this.f8390l).iterator();
                while (it.hasNext()) {
                    ((d) it.next()).close();
                }
                this.f8390l.clear();
                this.f8384f.close();
                this.f8383e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // I.InterfaceC0443n0
    public void d(InterfaceC0443n0.a aVar, Executor executor) {
        synchronized (this.f8379a) {
            this.f8385g = (InterfaceC0443n0.a) g.f(aVar);
            this.f8386h = (Executor) g.f(executor);
            this.f8384f.d(this.f8382d, executor);
        }
    }

    @Override // I.InterfaceC0443n0
    public int e() {
        int e6;
        synchronized (this.f8379a) {
            e6 = this.f8384f.e();
        }
        return e6;
    }

    @Override // I.InterfaceC0443n0
    public d f() {
        synchronized (this.f8379a) {
            try {
                if (this.f8390l.isEmpty()) {
                    return null;
                }
                if (this.f8389k >= this.f8390l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                List list = this.f8390l;
                int i6 = this.f8389k;
                this.f8389k = i6 + 1;
                d dVar = (d) list.get(i6);
                this.f8391m.add(dVar);
                return dVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // I.InterfaceC0443n0
    public int getHeight() {
        int height;
        synchronized (this.f8379a) {
            height = this.f8384f.getHeight();
        }
        return height;
    }

    @Override // I.InterfaceC0443n0
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f8379a) {
            surface = this.f8384f.getSurface();
        }
        return surface;
    }

    @Override // I.InterfaceC0443n0
    public int getWidth() {
        int width;
        synchronized (this.f8379a) {
            width = this.f8384f.getWidth();
        }
        return width;
    }

    public final void j(d dVar) {
        synchronized (this.f8379a) {
            try {
                int indexOf = this.f8390l.indexOf(dVar);
                if (indexOf >= 0) {
                    this.f8390l.remove(indexOf);
                    int i6 = this.f8389k;
                    if (indexOf <= i6) {
                        this.f8389k = i6 - 1;
                    }
                }
                this.f8391m.remove(dVar);
                if (this.f8381c > 0) {
                    m(this.f8384f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(u0 u0Var) {
        final InterfaceC0443n0.a aVar;
        Executor executor;
        synchronized (this.f8379a) {
            try {
                if (this.f8390l.size() < e()) {
                    u0Var.a(this);
                    this.f8390l.add(u0Var);
                    aVar = this.f8385g;
                    executor = this.f8386h;
                } else {
                    AbstractC0335i0.a("TAG", "Maximum image number reached.");
                    u0Var.close();
                    aVar = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: F.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.e.g(androidx.camera.core.e.this, aVar);
                    }
                });
            } else {
                aVar.a(this);
            }
        }
    }

    public AbstractC0442n l() {
        return this.f8380b;
    }

    public void m(InterfaceC0443n0 interfaceC0443n0) {
        d dVar;
        synchronized (this.f8379a) {
            try {
                if (this.f8383e) {
                    return;
                }
                int size = this.f8388j.size() + this.f8390l.size();
                if (size >= interfaceC0443n0.e()) {
                    AbstractC0335i0.a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        dVar = interfaceC0443n0.f();
                        if (dVar != null) {
                            this.f8381c--;
                            size++;
                            this.f8388j.put(dVar.O().c(), dVar);
                            n();
                        }
                    } catch (IllegalStateException e6) {
                        AbstractC0335i0.b("MetadataImageReader", "Failed to acquire next image.", e6);
                        dVar = null;
                    }
                    if (dVar == null || this.f8381c <= 0) {
                        break;
                    }
                } while (size < interfaceC0443n0.e());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        synchronized (this.f8379a) {
            try {
                for (int size = this.f8387i.size() - 1; size >= 0; size--) {
                    Z z6 = (Z) this.f8387i.valueAt(size);
                    long c6 = z6.c();
                    d dVar = (d) this.f8388j.get(c6);
                    if (dVar != null) {
                        this.f8388j.remove(c6);
                        this.f8387i.removeAt(size);
                        k(new u0(dVar, z6));
                    }
                }
                o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        synchronized (this.f8379a) {
            try {
                if (this.f8388j.size() != 0 && this.f8387i.size() != 0) {
                    long keyAt = this.f8388j.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.f8387i.keyAt(0);
                    g.a(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.f8388j.size() - 1; size >= 0; size--) {
                            if (this.f8388j.keyAt(size) < keyAt2) {
                                ((d) this.f8388j.valueAt(size)).close();
                                this.f8388j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f8387i.size() - 1; size2 >= 0; size2--) {
                            if (this.f8387i.keyAt(size2) < keyAt) {
                                this.f8387i.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void p(InterfaceC0455u interfaceC0455u) {
        synchronized (this.f8379a) {
            try {
                if (this.f8383e) {
                    return;
                }
                this.f8387i.put(interfaceC0455u.c(), new O.b(interfaceC0455u));
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public e(InterfaceC0443n0 interfaceC0443n0) {
        this.f8379a = new Object();
        this.f8380b = new a();
        this.f8381c = 0;
        this.f8382d = new InterfaceC0443n0.a() { // from class: F.j0
            @Override // I.InterfaceC0443n0.a
            public final void a(InterfaceC0443n0 interfaceC0443n02) {
                androidx.camera.core.e.h(androidx.camera.core.e.this, interfaceC0443n02);
            }
        };
        this.f8383e = false;
        this.f8387i = new LongSparseArray();
        this.f8388j = new LongSparseArray();
        this.f8391m = new ArrayList();
        this.f8384f = interfaceC0443n0;
        this.f8389k = 0;
        this.f8390l = new ArrayList(e());
    }
}
