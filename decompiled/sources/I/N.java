package I;

import I.P;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class N {

    /* renamed from: i, reason: collision with root package name */
    public static final P.a f2293i = P.a.a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* renamed from: j, reason: collision with root package name */
    public static final P.a f2294j = P.a.a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* renamed from: k, reason: collision with root package name */
    public static final P.a f2295k = P.a.a("camerax.core.captureConfig.resolvedFrameRate", Range.class);

    /* renamed from: a, reason: collision with root package name */
    public final List f2296a;

    /* renamed from: b, reason: collision with root package name */
    public final P f2297b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2298c;

    /* renamed from: d, reason: collision with root package name */
    public final Range f2299d;

    /* renamed from: e, reason: collision with root package name */
    public final List f2300e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2301f;

    /* renamed from: g, reason: collision with root package name */
    public final S0 f2302g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0455u f2303h;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void a(Y0 y02, a aVar);
    }

    public N(List list, P p6, int i6, Range range, List list2, boolean z6, S0 s02, InterfaceC0455u interfaceC0455u) {
        this.f2296a = list;
        this.f2297b = p6;
        this.f2298c = i6;
        this.f2299d = range;
        this.f2300e = Collections.unmodifiableList(list2);
        this.f2301f = z6;
        this.f2302g = s02;
        this.f2303h = interfaceC0455u;
    }

    public static N b() {
        return new a().h();
    }

    public List c() {
        return this.f2300e;
    }

    public InterfaceC0455u d() {
        return this.f2303h;
    }

    public Range e() {
        Range range = (Range) this.f2297b.e(f2295k, O0.f2327a);
        Objects.requireNonNull(range);
        return range;
    }

    public P f() {
        return this.f2297b;
    }

    public List g() {
        return Collections.unmodifiableList(this.f2296a);
    }

    public S0 h() {
        return this.f2302g;
    }

    public int i() {
        return this.f2298c;
    }

    public boolean j() {
        return this.f2301f;
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Set f2304a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC0462x0 f2305b;

        /* renamed from: c, reason: collision with root package name */
        public int f2306c;

        /* renamed from: d, reason: collision with root package name */
        public Range f2307d;

        /* renamed from: e, reason: collision with root package name */
        public List f2308e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f2309f;

        /* renamed from: g, reason: collision with root package name */
        public A0 f2310g;

        /* renamed from: h, reason: collision with root package name */
        public InterfaceC0455u f2311h;

        public a() {
            this.f2304a = new HashSet();
            this.f2305b = C0464y0.a0();
            this.f2306c = -1;
            this.f2307d = O0.f2327a;
            this.f2308e = new ArrayList();
            this.f2309f = false;
            this.f2310g = A0.g();
        }

        public static a j(Y0 y02) {
            b N5 = y02.N(null);
            if (N5 != null) {
                a aVar = new a();
                N5.a(y02, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + y02.C(y02.toString()));
        }

        public static a k(N n6) {
            return new a(n6);
        }

        public void a(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                c((AbstractC0442n) it.next());
            }
        }

        public void b(S0 s02) {
            this.f2310g.f(s02);
        }

        public void c(AbstractC0442n abstractC0442n) {
            if (this.f2308e.contains(abstractC0442n)) {
                return;
            }
            this.f2308e.add(abstractC0442n);
        }

        public void d(P.a aVar, Object obj) {
            this.f2305b.H(aVar, obj);
        }

        public void e(P p6) {
            for (P.a aVar : p6.c()) {
                Object e6 = this.f2305b.e(aVar, null);
                Object b6 = p6.b(aVar);
                if (e6 instanceof AbstractC0460w0) {
                    ((AbstractC0460w0) e6).a(((AbstractC0460w0) b6).c());
                } else {
                    if (b6 instanceof AbstractC0460w0) {
                        b6 = ((AbstractC0460w0) b6).clone();
                    }
                    this.f2305b.x(aVar, p6.f(aVar), b6);
                }
            }
        }

        public void f(W w6) {
            this.f2304a.add(w6);
        }

        public void g(String str, Object obj) {
            this.f2310g.i(str, obj);
        }

        public N h() {
            return new N(new ArrayList(this.f2304a), D0.Z(this.f2305b), this.f2306c, this.f2307d, new ArrayList(this.f2308e), this.f2309f, S0.c(this.f2310g), this.f2311h);
        }

        public void i() {
            this.f2304a.clear();
        }

        public Range l() {
            return (Range) this.f2305b.e(N.f2295k, O0.f2327a);
        }

        public Set m() {
            return this.f2304a;
        }

        public int n() {
            return this.f2306c;
        }

        public boolean o(AbstractC0442n abstractC0442n) {
            return this.f2308e.remove(abstractC0442n);
        }

        public void p(InterfaceC0455u interfaceC0455u) {
            this.f2311h = interfaceC0455u;
        }

        public void q(Range range) {
            d(N.f2295k, range);
        }

        public void r(P p6) {
            this.f2305b = C0464y0.b0(p6);
        }

        public void s(int i6) {
            this.f2306c = i6;
        }

        public void t(boolean z6) {
            this.f2309f = z6;
        }

        public a(N n6) {
            HashSet hashSet = new HashSet();
            this.f2304a = hashSet;
            this.f2305b = C0464y0.a0();
            this.f2306c = -1;
            this.f2307d = O0.f2327a;
            this.f2308e = new ArrayList();
            this.f2309f = false;
            this.f2310g = A0.g();
            hashSet.addAll(n6.f2296a);
            this.f2305b = C0464y0.b0(n6.f2297b);
            this.f2306c = n6.f2298c;
            this.f2307d = n6.f2299d;
            this.f2308e.addAll(n6.c());
            this.f2309f = n6.j();
            this.f2310g = A0.h(n6.h());
        }
    }
}
