package W;

import F.C0346s;
import F.C0352y;
import F.C0353z;
import F.I0;
import F.InterfaceC0340l;
import F.InterfaceC0345q;
import F.J0;
import I.AbstractC0427f0;
import I.E;
import I.InterfaceC0459w;
import L.p;
import android.content.Context;
import androidx.lifecycle.InterfaceC1061m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import l0.AbstractC1728c;
import t.InterfaceC2069a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {

    /* renamed from: h, reason: collision with root package name */
    public static final g f5360h = new g();

    /* renamed from: c, reason: collision with root package name */
    public D6.g f5363c;

    /* renamed from: f, reason: collision with root package name */
    public C0352y f5366f;

    /* renamed from: g, reason: collision with root package name */
    public Context f5367g;

    /* renamed from: a, reason: collision with root package name */
    public final Object f5361a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public C0353z.b f5362b = null;

    /* renamed from: d, reason: collision with root package name */
    public D6.g f5364d = N.f.h(null);

    /* renamed from: e, reason: collision with root package name */
    public final c f5365e = new c();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements N.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1728c.a f5368a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C0352y f5369b;

        public a(AbstractC1728c.a aVar, C0352y c0352y) {
            this.f5368a = aVar;
            this.f5369b = c0352y;
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            this.f5368a.c(this.f5369b);
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            this.f5368a.f(th);
        }
    }

    public static /* synthetic */ Object a(g gVar, final C0352y c0352y, AbstractC1728c.a aVar) {
        synchronized (gVar.f5361a) {
            N.f.b(N.d.a(gVar.f5364d).f(new N.a() { // from class: W.f
                @Override // N.a
                public final D6.g apply(Object obj) {
                    D6.g i6;
                    i6 = C0352y.this.i();
                    return i6;
                }
            }, M.c.b()), new a(aVar, c0352y), M.c.b());
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    public static /* synthetic */ g c(Context context, C0352y c0352y) {
        g gVar = f5360h;
        gVar.l(c0352y);
        gVar.m(L.f.a(context));
        return gVar;
    }

    public static D6.g h(final Context context) {
        y0.g.f(context);
        return N.f.n(f5360h.i(context), new InterfaceC2069a() { // from class: W.d
            @Override // t.InterfaceC2069a
            public final Object apply(Object obj) {
                return g.c(context, (C0352y) obj);
            }
        }, M.c.b());
    }

    public InterfaceC0340l d(InterfaceC1061m interfaceC1061m, C0346s c0346s, J0 j02, List list, I0... i0Arr) {
        InterfaceC0459w interfaceC0459w;
        InterfaceC0459w a6;
        p.a();
        C0346s.a c6 = C0346s.a.c(c0346s);
        int length = i0Arr.length;
        int i6 = 0;
        while (true) {
            interfaceC0459w = null;
            if (i6 >= length) {
                break;
            }
            C0346s P5 = i0Arr[i6].j().P(null);
            if (P5 != null) {
                Iterator it = P5.c().iterator();
                while (it.hasNext()) {
                    c6.a((InterfaceC0345q) it.next());
                }
            }
            i6++;
        }
        LinkedHashSet a7 = c6.b().a(this.f5366f.f().a());
        if (a7.isEmpty()) {
            throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
        }
        b c7 = this.f5365e.c(interfaceC1061m, O.e.x(a7));
        Collection<b> e6 = this.f5365e.e();
        for (I0 i02 : i0Arr) {
            for (b bVar : e6) {
                if (bVar.q(i02) && bVar != c7) {
                    throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", i02));
                }
            }
        }
        if (c7 == null) {
            c7 = this.f5365e.b(interfaceC1061m, new O.e(a7, this.f5366f.e().d(), this.f5366f.d(), this.f5366f.h()));
        }
        b bVar2 = c7;
        Iterator it2 = c0346s.c().iterator();
        while (it2.hasNext()) {
            InterfaceC0345q interfaceC0345q = (InterfaceC0345q) it2.next();
            if (interfaceC0345q.a() != InterfaceC0345q.f1463a && (a6 = AbstractC0427f0.a(interfaceC0345q.a()).a(bVar2.b(), this.f5367g)) != null) {
                if (interfaceC0459w != null) {
                    throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                }
                interfaceC0459w = a6;
            }
        }
        bVar2.o(interfaceC0459w);
        if (i0Arr.length == 0) {
            return bVar2;
        }
        this.f5365e.a(bVar2, j02, list, Arrays.asList(i0Arr), this.f5366f.e().d());
        return bVar2;
    }

    public InterfaceC0340l e(InterfaceC1061m interfaceC1061m, C0346s c0346s, I0... i0Arr) {
        if (g() == 2) {
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
        }
        k(1);
        return d(interfaceC1061m, c0346s, null, Collections.EMPTY_LIST, i0Arr);
    }

    public List f() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f5366f.f().a().iterator();
        while (it.hasNext()) {
            arrayList.add(((E) it.next()).b());
        }
        return arrayList;
    }

    public final int g() {
        C0352y c0352y = this.f5366f;
        if (c0352y == null) {
            return 0;
        }
        return c0352y.e().d().a();
    }

    public final D6.g i(Context context) {
        synchronized (this.f5361a) {
            try {
                D6.g gVar = this.f5363c;
                if (gVar != null) {
                    return gVar;
                }
                final C0352y c0352y = new C0352y(context, this.f5362b);
                D6.g a6 = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: W.e
                    @Override // l0.AbstractC1728c.InterfaceC0214c
                    public final Object a(AbstractC1728c.a aVar) {
                        return g.a(g.this, c0352y, aVar);
                    }
                });
                this.f5363c = a6;
                return a6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean j(I0 i02) {
        Iterator it = this.f5365e.e().iterator();
        while (it.hasNext()) {
            if (((b) it.next()).q(i02)) {
                return true;
            }
        }
        return false;
    }

    public final void k(int i6) {
        C0352y c0352y = this.f5366f;
        if (c0352y == null) {
            return;
        }
        c0352y.e().d().d(i6);
    }

    public final void l(C0352y c0352y) {
        this.f5366f = c0352y;
    }

    public final void m(Context context) {
        this.f5367g = context;
    }

    public void n(I0... i0Arr) {
        p.a();
        if (g() == 2) {
            throw new UnsupportedOperationException("unbind usecase is not supported in concurrent camera mode, call unbindAll() first");
        }
        this.f5365e.k(Arrays.asList(i0Arr));
    }

    public void o() {
        p.a();
        k(0);
        this.f5365e.l();
    }
}
