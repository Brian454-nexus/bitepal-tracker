package O;

import F.AbstractC0335i0;
import F.H0;
import F.I0;
import F.InterfaceC0340l;
import F.InterfaceC0341m;
import F.X;
import F.q0;
import F.r;
import I.A;
import I.AbstractC0416a;
import I.AbstractC0465z;
import I.B;
import I.D;
import I.E;
import I.InterfaceC0459w;
import I.J0;
import I.K0;
import I.L0;
import I.O0;
import I.P;
import I.Y0;
import I.Z0;
import L.q;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements InterfaceC0340l {

    /* renamed from: a, reason: collision with root package name */
    public final E f3840a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f3841b;

    /* renamed from: c, reason: collision with root package name */
    public final B f3842c;

    /* renamed from: d, reason: collision with root package name */
    public final Z0 f3843d;

    /* renamed from: e, reason: collision with root package name */
    public final b f3844e;

    /* renamed from: h, reason: collision with root package name */
    public final G.a f3847h;

    /* renamed from: n, reason: collision with root package name */
    public I0 f3853n;

    /* renamed from: o, reason: collision with root package name */
    public V.d f3854o;

    /* renamed from: p, reason: collision with root package name */
    public final J0 f3855p;

    /* renamed from: q, reason: collision with root package name */
    public final K0 f3856q;

    /* renamed from: f, reason: collision with root package name */
    public final List f3845f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final List f3846g = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public List f3848i = Collections.EMPTY_LIST;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC0459w f3849j = AbstractC0465z.a();

    /* renamed from: k, reason: collision with root package name */
    public final Object f3850k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public boolean f3851l = true;

    /* renamed from: m, reason: collision with root package name */
    public P f3852m = null;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final List f3857a = new ArrayList();

        public b(LinkedHashSet linkedHashSet) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.f3857a.add(((E) it.next()).n().d());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f3857a.equals(((b) obj).f3857a);
            }
            return false;
        }

        public int hashCode() {
            return this.f3857a.hashCode() * 53;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public Y0 f3858a;

        /* renamed from: b, reason: collision with root package name */
        public Y0 f3859b;

        public c(Y0 y02, Y0 y03) {
            this.f3858a = y02;
            this.f3859b = y03;
        }
    }

    public e(LinkedHashSet linkedHashSet, G.a aVar, B b6, Z0 z02) {
        E e6 = (E) linkedHashSet.iterator().next();
        this.f3840a = e6;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(linkedHashSet);
        this.f3841b = linkedHashSet2;
        this.f3844e = new b(linkedHashSet2);
        this.f3847h = aVar;
        this.f3842c = b6;
        this.f3843d = z02;
        J0 j02 = new J0(e6.e());
        this.f3855p = j02;
        this.f3856q = new K0(e6.n(), j02);
    }

    public static List A(I0 i02) {
        ArrayList arrayList = new ArrayList();
        if (!M(i02)) {
            arrayList.add(i02.j().G());
            return arrayList;
        }
        Iterator it = ((V.d) i02).d0().iterator();
        while (it.hasNext()) {
            arrayList.add(((I0) it.next()).j().G());
        }
        return arrayList;
    }

    public static boolean F(O0 o02, L0 l02) {
        P d6 = o02.d();
        P d7 = l02.d();
        if (d6.c().size() != l02.d().c().size()) {
            return true;
        }
        for (P.a aVar : d6.c()) {
            if (!d7.h(aVar) || !Objects.equals(d7.b(aVar), d6.b(aVar))) {
                return true;
            }
        }
        return false;
    }

    public static boolean K(I0 i02) {
        return i02 instanceof X;
    }

    public static boolean L(I0 i02) {
        return i02 instanceof q0;
    }

    public static boolean M(I0 i02) {
        return i02 instanceof V.d;
    }

    public static boolean N(Collection collection) {
        int[] iArr = {1, 2, 4};
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            I0 i02 = (I0) it.next();
            for (int i6 = 0; i6 < 3; i6++) {
                int i7 = iArr[i6];
                if (i02.z(i7)) {
                    if (hashSet.contains(Integer.valueOf(i7))) {
                        return false;
                    }
                    hashSet.add(Integer.valueOf(i7));
                }
            }
        }
        return true;
    }

    public static List R(List list, Collection collection) {
        ArrayList arrayList = new ArrayList(list);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((I0) it.next()).Q(null);
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                throw null;
            }
        }
        return arrayList;
    }

    public static void T(List list, Collection collection, Collection collection2) {
        List R5 = R(list, collection);
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        List R6 = R(R5, arrayList);
        if (R6.size() > 0) {
            AbstractC0335i0.l("CameraUseCaseAdapter", "Unused effects: " + R6);
        }
    }

    public static /* synthetic */ void c(H0 h02) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(h02.n().getWidth(), h02.n().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        h02.q(surface, M.c.b(), new InterfaceC2343a() { // from class: O.d
            @Override // y0.InterfaceC2343a
            public final void accept(Object obj) {
                e.f(surface, surfaceTexture, (H0.g) obj);
            }
        });
    }

    public static /* synthetic */ void f(Surface surface, SurfaceTexture surfaceTexture, H0.g gVar) {
        surface.release();
        surfaceTexture.release();
    }

    public static Collection q(Collection collection, I0 i02, V.d dVar) {
        ArrayList arrayList = new ArrayList(collection);
        if (i02 != null) {
            arrayList.add(i02);
        }
        if (dVar != null) {
            arrayList.add(dVar);
            arrayList.removeAll(dVar.d0());
        }
        return arrayList;
    }

    public static b x(LinkedHashSet linkedHashSet) {
        return new b(linkedHashSet);
    }

    public final Map B(Collection collection, Z0 z02, Z0 z03) {
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            I0 i02 = (I0) it.next();
            hashMap.put(i02, new c(i02.k(false, z02), i02.k(true, z03)));
        }
        return hashMap;
    }

    public final int C(boolean z6) {
        int i6;
        synchronized (this.f3850k) {
            try {
                Iterator it = this.f3848i.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
                i6 = z6 ? 3 : 0;
            } finally {
            }
        }
        return i6;
    }

    public final Set D(Collection collection, boolean z6) {
        HashSet hashSet = new HashSet();
        int C6 = C(z6);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            I0 i02 = (I0) it.next();
            y0.g.b(!M(i02), "Only support one level of sharing for now.");
            if (i02.z(C6)) {
                hashSet.add(i02);
            }
        }
        return hashSet;
    }

    public List E() {
        ArrayList arrayList;
        synchronized (this.f3850k) {
            arrayList = new ArrayList(this.f3845f);
        }
        return arrayList;
    }

    public final boolean G() {
        boolean z6;
        synchronized (this.f3850k) {
            z6 = this.f3849j == AbstractC0465z.a();
        }
        return z6;
    }

    public final boolean H() {
        boolean z6;
        synchronized (this.f3850k) {
            z6 = true;
            if (this.f3849j.E() != 1) {
                z6 = false;
            }
        }
        return z6;
    }

    public final boolean I(Collection collection) {
        Iterator it = collection.iterator();
        boolean z6 = false;
        boolean z7 = false;
        while (it.hasNext()) {
            I0 i02 = (I0) it.next();
            if (L(i02)) {
                z6 = true;
            } else if (K(i02)) {
                z7 = true;
            }
        }
        return z6 && !z7;
    }

    public final boolean J(Collection collection) {
        Iterator it = collection.iterator();
        boolean z6 = false;
        boolean z7 = false;
        while (it.hasNext()) {
            I0 i02 = (I0) it.next();
            if (L(i02)) {
                z7 = true;
            } else if (K(i02)) {
                z6 = true;
            }
        }
        return z6 && !z7;
    }

    public void O(Collection collection) {
        synchronized (this.f3850k) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f3845f);
            linkedHashSet.removeAll(collection);
            U(linkedHashSet);
        }
    }

    public final void P() {
        synchronized (this.f3850k) {
            try {
                if (this.f3852m != null) {
                    this.f3840a.e().m(this.f3852m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void Q(List list) {
        synchronized (this.f3850k) {
            this.f3848i = list;
        }
    }

    public void S(F.J0 j02) {
        synchronized (this.f3850k) {
        }
    }

    public void U(Collection collection) {
        V(collection, false);
    }

    public void V(Collection collection, boolean z6) {
        e eVar;
        O0 o02;
        P d6;
        synchronized (this.f3850k) {
            try {
                try {
                    I0 r6 = r(collection);
                    V.d v6 = v(collection, z6);
                    Collection<?> q6 = q(collection, r6, v6);
                    ArrayList<I0> arrayList = new ArrayList(q6);
                    arrayList.removeAll(this.f3846g);
                    ArrayList<I0> arrayList2 = new ArrayList(q6);
                    arrayList2.retainAll(this.f3846g);
                    ArrayList arrayList3 = new ArrayList(this.f3846g);
                    arrayList3.removeAll(q6);
                    Map B6 = B(arrayList, this.f3849j.j(), this.f3843d);
                    try {
                        eVar = this;
                    } catch (IllegalArgumentException e6) {
                        e = e6;
                        eVar = this;
                    }
                    try {
                        Map s6 = eVar.s(z(), this.f3840a.n(), arrayList, arrayList2, B6);
                        W(s6, q6);
                        T(eVar.f3848i, q6, collection);
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            ((I0) it.next()).U(eVar.f3840a);
                        }
                        eVar.f3840a.k(arrayList3);
                        if (!arrayList3.isEmpty()) {
                            for (I0 i02 : arrayList2) {
                                if (s6.containsKey(i02) && (d6 = (o02 = (O0) s6.get(i02)).d()) != null && F(o02, i02.t())) {
                                    i02.X(d6);
                                }
                            }
                        }
                        for (I0 i03 : arrayList) {
                            c cVar = (c) B6.get(i03);
                            Objects.requireNonNull(cVar);
                            i03.b(eVar.f3840a, cVar.f3858a, cVar.f3859b);
                            i03.W((O0) y0.g.f((O0) s6.get(i03)));
                        }
                        if (eVar.f3851l) {
                            eVar.f3840a.j(arrayList);
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((I0) it2.next()).F();
                        }
                        eVar.f3845f.clear();
                        eVar.f3845f.addAll(collection);
                        eVar.f3846g.clear();
                        eVar.f3846g.addAll(q6);
                        eVar.f3853n = r6;
                        eVar.f3854o = v6;
                    } catch (IllegalArgumentException e7) {
                        e = e7;
                        if (z6 || !G() || eVar.f3847h.a() == 2) {
                            throw e;
                        }
                        V(collection, true);
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void W(Map map, Collection collection) {
        synchronized (this.f3850k) {
        }
    }

    @Override // F.InterfaceC0340l
    public InterfaceC0341m a() {
        return this.f3855p;
    }

    @Override // F.InterfaceC0340l
    public r b() {
        return this.f3856q;
    }

    public void h(boolean z6) {
        this.f3840a.h(z6);
    }

    public void i(Collection collection) {
        synchronized (this.f3850k) {
            try {
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f3845f);
                linkedHashSet.addAll(collection);
                try {
                    U(linkedHashSet);
                } catch (IllegalArgumentException e6) {
                    throw new a(e6.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l() {
        synchronized (this.f3850k) {
            try {
                if (!this.f3851l) {
                    this.f3840a.j(this.f3846g);
                    P();
                    Iterator it = this.f3846g.iterator();
                    while (it.hasNext()) {
                        ((I0) it.next()).F();
                    }
                    this.f3851l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(InterfaceC0459w interfaceC0459w) {
        synchronized (this.f3850k) {
            if (interfaceC0459w == null) {
                try {
                    interfaceC0459w = AbstractC0465z.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!this.f3845f.isEmpty() && !this.f3849j.R().equals(interfaceC0459w.R())) {
                throw new IllegalStateException("Need to unbind all use cases before binding with extension enabled");
            }
            this.f3849j = interfaceC0459w;
            interfaceC0459w.k(null);
            this.f3855p.n(false, null);
            this.f3840a.o(this.f3849j);
        }
    }

    public final void p() {
        synchronized (this.f3850k) {
            A e6 = this.f3840a.e();
            this.f3852m = e6.i();
            e6.k();
        }
    }

    public I0 r(Collection collection) {
        I0 i02;
        synchronized (this.f3850k) {
            try {
                if (H()) {
                    if (J(collection)) {
                        i02 = L(this.f3853n) ? this.f3853n : u();
                    } else if (I(collection)) {
                        i02 = K(this.f3853n) ? this.f3853n : t();
                    }
                }
                i02 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i02;
    }

    public final Map s(int i6, D d6, Collection collection, Collection collection2, Map map) {
        Rect rect;
        ArrayList arrayList = new ArrayList();
        String d7 = d6.d();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = collection2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            I0 i02 = (I0) it.next();
            AbstractC0416a a6 = AbstractC0416a.a(this.f3842c.b(i6, d7, i02.m(), i02.f()), i02.m(), i02.f(), ((O0) y0.g.f(i02.e())).b(), A(i02), i02.e().d(), i02.j().J(null));
            arrayList.add(a6);
            hashMap2.put(a6, i02);
            hashMap.put(i02, i02.e());
        }
        if (!collection.isEmpty()) {
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            try {
                rect = this.f3840a.e().f();
            } catch (NullPointerException unused) {
                rect = null;
            }
            h hVar = new h(d6, rect != null ? q.i(rect) : null);
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                I0 i03 = (I0) it2.next();
                c cVar = (c) map.get(i03);
                Y0 B6 = i03.B(d6, cVar.f3858a, cVar.f3859b);
                hashMap3.put(B6, i03);
                hashMap4.put(B6, hVar.m(B6));
            }
            Pair a7 = this.f3842c.a(i6, d7, arrayList, hashMap4);
            for (Map.Entry entry : hashMap3.entrySet()) {
                hashMap.put((I0) entry.getValue(), (O0) ((Map) a7.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) a7.second).entrySet()) {
                if (hashMap2.containsKey(entry2.getKey())) {
                    hashMap.put((I0) hashMap2.get(entry2.getKey()), (O0) entry2.getValue());
                }
            }
        }
        return hashMap;
    }

    public final X t() {
        return new X.b().o("ImageCapture-Extra").e();
    }

    public final q0 u() {
        q0 e6 = new q0.a().m("Preview-Extra").e();
        e6.i0(new q0.c() { // from class: O.c
            @Override // F.q0.c
            public final void a(H0 h02) {
                e.c(h02);
            }
        });
        return e6;
    }

    public final V.d v(Collection collection, boolean z6) {
        synchronized (this.f3850k) {
            try {
                Set D6 = D(collection, z6);
                if (D6.size() < 2) {
                    return null;
                }
                V.d dVar = this.f3854o;
                if (dVar != null && dVar.d0().equals(D6)) {
                    V.d dVar2 = this.f3854o;
                    Objects.requireNonNull(dVar2);
                    return dVar2;
                }
                if (!N(D6)) {
                    return null;
                }
                return new V.d(this.f3840a, D6, this.f3843d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void w() {
        synchronized (this.f3850k) {
            try {
                if (this.f3851l) {
                    this.f3840a.k(new ArrayList(this.f3846g));
                    p();
                    this.f3851l = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public b y() {
        return this.f3844e;
    }

    public final int z() {
        synchronized (this.f3850k) {
            try {
                return this.f3847h.a() == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
