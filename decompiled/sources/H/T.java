package H;

import F.AbstractC0335i0;
import F.Y;
import H.X;
import android.util.Log;
import androidx.camera.core.b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class T implements b.a, X.a {

    /* renamed from: b, reason: collision with root package name */
    public final r f1960b;

    /* renamed from: c, reason: collision with root package name */
    public C0394s f1961c;

    /* renamed from: d, reason: collision with root package name */
    public J f1962d;

    /* renamed from: e, reason: collision with root package name */
    public final List f1963e;

    /* renamed from: a, reason: collision with root package name */
    public final Deque f1959a = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    public boolean f1964f = false;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements N.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C0387k f1965a;

        public a(C0387k c0387k) {
            this.f1965a = c0387k;
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            T.this.f1960b.c();
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            if (this.f1965a.b()) {
                return;
            }
            if (th instanceof Y) {
                T.this.f1961c.j((Y) th);
            } else {
                T.this.f1961c.j(new Y(2, "Failed to submit capture request", th));
            }
            T.this.f1960b.c();
        }
    }

    public T(r rVar) {
        L.p.a();
        this.f1960b = rVar;
        this.f1963e = new ArrayList();
    }

    public static /* synthetic */ void c(T t6) {
        t6.f1962d = null;
        t6.g();
    }

    @Override // androidx.camera.core.b.a
    public void a(androidx.camera.core.d dVar) {
        M.c.e().execute(new Runnable() { // from class: H.S
            @Override // java.lang.Runnable
            public final void run() {
                T.this.g();
            }
        });
    }

    @Override // H.X.a
    public void b(X x6) {
        L.p.a();
        AbstractC0335i0.a("TakePictureManager", "Add a new request for retrying.");
        this.f1959a.addFirst(x6);
        g();
    }

    public void e() {
        L.p.a();
        Y y6 = new Y(3, "Camera is closed.", null);
        Iterator it = this.f1959a.iterator();
        while (it.hasNext()) {
            ((X) it.next()).p(y6);
        }
        this.f1959a.clear();
        Iterator it2 = new ArrayList(this.f1963e).iterator();
        while (it2.hasNext()) {
            ((J) it2.next()).j(y6);
        }
    }

    public boolean f() {
        return this.f1962d != null;
    }

    public void g() {
        L.p.a();
        Log.d("TakePictureManager", "Issue the next TakePictureRequest.");
        if (f()) {
            Log.d("TakePictureManager", "There is already a request in-flight.");
            return;
        }
        if (this.f1964f) {
            Log.d("TakePictureManager", "The class is paused.");
            return;
        }
        if (this.f1961c.h() == 0) {
            Log.d("TakePictureManager", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        X x6 = (X) this.f1959a.poll();
        if (x6 == null) {
            Log.d("TakePictureManager", "No new request.");
            return;
        }
        J j6 = new J(x6, this);
        m(j6);
        y0.c e6 = this.f1961c.e(x6, j6, j6.m());
        C0387k c0387k = (C0387k) e6.f21172a;
        Objects.requireNonNull(c0387k);
        G g6 = (G) e6.f21173b;
        Objects.requireNonNull(g6);
        this.f1961c.l(g6);
        j6.q(l(c0387k));
    }

    public void h(X x6) {
        L.p.a();
        this.f1959a.offer(x6);
        g();
    }

    public void i() {
        L.p.a();
        this.f1964f = true;
        J j6 = this.f1962d;
        if (j6 != null) {
            j6.k();
        }
    }

    public void j() {
        L.p.a();
        this.f1964f = false;
        g();
    }

    public void k(C0394s c0394s) {
        L.p.a();
        this.f1961c = c0394s;
        c0394s.k(this);
    }

    public final D6.g l(C0387k c0387k) {
        L.p.a();
        this.f1960b.b();
        D6.g a6 = this.f1960b.a(c0387k.a());
        N.f.b(a6, new a(c0387k), M.c.e());
        return a6;
    }

    public final void m(final J j6) {
        y0.g.h(!f());
        this.f1962d = j6;
        j6.m().c(new Runnable() { // from class: H.P
            @Override // java.lang.Runnable
            public final void run() {
                T.c(T.this);
            }
        }, M.c.b());
        this.f1963e.add(j6);
        j6.n().c(new Runnable() { // from class: H.Q
            @Override // java.lang.Runnable
            public final void run() {
                T.this.f1963e.remove(j6);
            }
        }, M.c.b());
    }
}
