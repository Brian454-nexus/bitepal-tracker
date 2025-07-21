package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import e5.C1273c;
import g5.InterfaceC1388b;
import g5.p;
import g5.q;
import g5.s;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class l implements ComponentCallbacks2, g5.l {

    /* renamed from: m, reason: collision with root package name */
    public static final j5.h f13225m = (j5.h) j5.h.g0(Bitmap.class).L();

    /* renamed from: n, reason: collision with root package name */
    public static final j5.h f13226n = (j5.h) j5.h.g0(C1273c.class).L();

    /* renamed from: o, reason: collision with root package name */
    public static final j5.h f13227o = (j5.h) ((j5.h) j5.h.h0(T4.j.f5020c).T(g.LOW)).a0(true);

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.b f13228a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f13229b;

    /* renamed from: c, reason: collision with root package name */
    public final g5.j f13230c;

    /* renamed from: d, reason: collision with root package name */
    public final q f13231d;

    /* renamed from: e, reason: collision with root package name */
    public final p f13232e;

    /* renamed from: f, reason: collision with root package name */
    public final s f13233f;

    /* renamed from: g, reason: collision with root package name */
    public final Runnable f13234g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1388b f13235h;

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f13236i;

    /* renamed from: j, reason: collision with root package name */
    public j5.h f13237j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13238k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13239l;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = l.this;
            lVar.f13230c.a(lVar);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements InterfaceC1388b.a {

        /* renamed from: a, reason: collision with root package name */
        public final q f13241a;

        public b(q qVar) {
            this.f13241a = qVar;
        }

        @Override // g5.InterfaceC1388b.a
        public void a(boolean z6) {
            if (z6) {
                synchronized (l.this) {
                    this.f13241a.e();
                }
            }
        }
    }

    public l(com.bumptech.glide.b bVar, g5.j jVar, p pVar, Context context) {
        this(bVar, jVar, pVar, new q(), bVar.g(), context);
    }

    public synchronized boolean A(k5.h hVar) {
        j5.d l6 = hVar.l();
        if (l6 == null) {
            return true;
        }
        if (!this.f13231d.a(l6)) {
            return false;
        }
        this.f13233f.o(hVar);
        hVar.i(null);
        return true;
    }

    public final void B(k5.h hVar) {
        boolean A6 = A(hVar);
        j5.d l6 = hVar.l();
        if (A6 || this.f13228a.p(hVar) || l6 == null) {
            return;
        }
        hVar.i(null);
        l6.clear();
    }

    @Override // g5.l
    public synchronized void a() {
        x();
        this.f13233f.a();
    }

    public k b(Class cls) {
        return new k(this.f13228a, this, cls, this.f13229b);
    }

    public k c() {
        return b(Bitmap.class).a(f13225m);
    }

    @Override // g5.l
    public synchronized void f() {
        this.f13233f.f();
        p();
        this.f13231d.b();
        this.f13230c.b(this);
        this.f13230c.b(this.f13235h);
        n5.l.w(this.f13234g);
        this.f13228a.s(this);
    }

    public k g() {
        return b(Drawable.class);
    }

    @Override // g5.l
    public synchronized void j() {
        try {
            this.f13233f.j();
            if (this.f13239l) {
                p();
            } else {
                w();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void o(k5.h hVar) {
        if (hVar == null) {
            return;
        }
        B(hVar);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i6) {
        if (i6 == 60 && this.f13238k) {
            v();
        }
    }

    public final synchronized void p() {
        try {
            Iterator it = this.f13233f.c().iterator();
            while (it.hasNext()) {
                o((k5.h) it.next());
            }
            this.f13233f.b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public List q() {
        return this.f13236i;
    }

    public synchronized j5.h r() {
        return this.f13237j;
    }

    public m s(Class cls) {
        return this.f13228a.i().e(cls);
    }

    public k t(String str) {
        return g().u0(str);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f13231d + ", treeNode=" + this.f13232e + "}";
    }

    public synchronized void u() {
        this.f13231d.c();
    }

    public synchronized void v() {
        u();
        Iterator it = this.f13232e.a().iterator();
        while (it.hasNext()) {
            ((l) it.next()).u();
        }
    }

    public synchronized void w() {
        this.f13231d.d();
    }

    public synchronized void x() {
        this.f13231d.f();
    }

    public synchronized void y(j5.h hVar) {
        this.f13237j = (j5.h) ((j5.h) hVar.clone()).b();
    }

    public synchronized void z(k5.h hVar, j5.d dVar) {
        this.f13233f.g(hVar);
        this.f13231d.g(dVar);
    }

    public l(com.bumptech.glide.b bVar, g5.j jVar, p pVar, q qVar, g5.c cVar, Context context) {
        this.f13233f = new s();
        a aVar = new a();
        this.f13234g = aVar;
        this.f13228a = bVar;
        this.f13230c = jVar;
        this.f13232e = pVar;
        this.f13231d = qVar;
        this.f13229b = context;
        InterfaceC1388b a6 = cVar.a(context.getApplicationContext(), new b(qVar));
        this.f13235h = a6;
        bVar.o(this);
        if (n5.l.r()) {
            n5.l.v(aVar);
        } else {
            jVar.a(this);
        }
        jVar.a(a6);
        this.f13236i = new CopyOnWriteArrayList(bVar.i().c());
        y(bVar.i().d());
    }
}
