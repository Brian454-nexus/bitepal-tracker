package I;

import F.AbstractC0335i0;
import I.C0432i;
import I.N;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f2272a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2273b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2274c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2275d;

    /* renamed from: e, reason: collision with root package name */
    public final List f2276e;

    /* renamed from: f, reason: collision with root package name */
    public final N f2277f;

    /* renamed from: g, reason: collision with root package name */
    public InputConfiguration f2278g;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Set f2279a = new LinkedHashSet();

        /* renamed from: b, reason: collision with root package name */
        public final N.a f2280b = new N.a();

        /* renamed from: c, reason: collision with root package name */
        public final List f2281c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public final List f2282d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public final List f2283e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        public final List f2284f = new ArrayList();

        /* renamed from: g, reason: collision with root package name */
        public InputConfiguration f2285g;
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b extends a {
        public static b q(Y0 y02, Size size) {
            d S5 = y02.S(null);
            if (S5 != null) {
                b bVar = new b();
                S5.a(size, y02, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + y02.C(y02.toString()));
        }

        public b a(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                e((CameraDevice.StateCallback) it.next());
            }
            return this;
        }

        public b b(Collection collection) {
            this.f2280b.a(collection);
            return this;
        }

        public b c(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k((CameraCaptureSession.StateCallback) it.next());
            }
            return this;
        }

        public b d(AbstractC0442n abstractC0442n) {
            this.f2280b.c(abstractC0442n);
            if (!this.f2284f.contains(abstractC0442n)) {
                this.f2284f.add(abstractC0442n);
            }
            return this;
        }

        public b e(CameraDevice.StateCallback stateCallback) {
            if (this.f2281c.contains(stateCallback)) {
                return this;
            }
            this.f2281c.add(stateCallback);
            return this;
        }

        public b f(c cVar) {
            this.f2283e.add(cVar);
            return this;
        }

        public b g(P p6) {
            this.f2280b.e(p6);
            return this;
        }

        public b h(W w6) {
            return i(w6, F.C.f1236d);
        }

        public b i(W w6, F.C c6) {
            this.f2279a.add(e.a(w6).b(c6).a());
            return this;
        }

        public b j(AbstractC0442n abstractC0442n) {
            this.f2280b.c(abstractC0442n);
            return this;
        }

        public b k(CameraCaptureSession.StateCallback stateCallback) {
            if (this.f2282d.contains(stateCallback)) {
                return this;
            }
            this.f2282d.add(stateCallback);
            return this;
        }

        public b l(W w6) {
            return m(w6, F.C.f1236d);
        }

        public b m(W w6, F.C c6) {
            this.f2279a.add(e.a(w6).b(c6).a());
            this.f2280b.f(w6);
            return this;
        }

        public b n(String str, Object obj) {
            this.f2280b.g(str, obj);
            return this;
        }

        public L0 o() {
            return new L0(new ArrayList(this.f2279a), new ArrayList(this.f2281c), new ArrayList(this.f2282d), new ArrayList(this.f2284f), new ArrayList(this.f2283e), this.f2280b.h(), this.f2285g);
        }

        public b p() {
            this.f2279a.clear();
            this.f2280b.i();
            return this;
        }

        public List r() {
            return Collections.unmodifiableList(this.f2284f);
        }

        public boolean s(AbstractC0442n abstractC0442n) {
            return this.f2280b.o(abstractC0442n) || this.f2284f.remove(abstractC0442n);
        }

        public b t(Range range) {
            this.f2280b.q(range);
            return this;
        }

        public b u(P p6) {
            this.f2280b.r(p6);
            return this;
        }

        public b v(InputConfiguration inputConfiguration) {
            this.f2285g = inputConfiguration;
            return this;
        }

        public b w(int i6) {
            this.f2280b.s(i6);
            return this;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        void a(L0 l02, f fVar);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface d {
        void a(Size size, Y0 y02, b bVar);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class e {

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static abstract class a {
            public abstract e a();

            public abstract a b(F.C c6);

            public abstract a c(String str);

            public abstract a d(List list);

            public abstract a e(int i6);
        }

        public static a a(W w6) {
            return new C0432i.b().f(w6).d(Collections.EMPTY_LIST).c(null).e(-1).b(F.C.f1236d);
        }

        public abstract F.C b();

        public abstract String c();

        public abstract List d();

        public abstract W e();

        public abstract int f();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum f {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class g extends a {

        /* renamed from: k, reason: collision with root package name */
        public static final List f2289k = Arrays.asList(1, 5, 3);

        /* renamed from: h, reason: collision with root package name */
        public final R.f f2290h = new R.f();

        /* renamed from: i, reason: collision with root package name */
        public boolean f2291i = true;

        /* renamed from: j, reason: collision with root package name */
        public boolean f2292j = false;

        public void a(L0 l02) {
            N h6 = l02.h();
            if (h6.i() != -1) {
                this.f2292j = true;
                this.f2280b.s(e(h6.i(), this.f2280b.n()));
            }
            f(h6.e());
            this.f2280b.b(l02.h().h());
            this.f2281c.addAll(l02.b());
            this.f2282d.addAll(l02.i());
            this.f2280b.a(l02.g());
            this.f2284f.addAll(l02.j());
            this.f2283e.addAll(l02.c());
            if (l02.e() != null) {
                this.f2285g = l02.e();
            }
            this.f2279a.addAll(l02.f());
            this.f2280b.m().addAll(h6.g());
            if (!c().containsAll(this.f2280b.m())) {
                AbstractC0335i0.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f2291i = false;
            }
            this.f2280b.e(h6.f());
        }

        public L0 b() {
            if (!this.f2291i) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f2279a);
            this.f2290h.c(arrayList);
            return new L0(arrayList, new ArrayList(this.f2281c), new ArrayList(this.f2282d), new ArrayList(this.f2284f), new ArrayList(this.f2283e), this.f2280b.h(), this.f2285g);
        }

        public final List c() {
            ArrayList arrayList = new ArrayList();
            for (e eVar : this.f2279a) {
                arrayList.add(eVar.e());
                Iterator it = eVar.d().iterator();
                while (it.hasNext()) {
                    arrayList.add((W) it.next());
                }
            }
            return arrayList;
        }

        public boolean d() {
            return this.f2292j && this.f2291i;
        }

        public final int e(int i6, int i7) {
            List list = f2289k;
            return list.indexOf(Integer.valueOf(i6)) >= list.indexOf(Integer.valueOf(i7)) ? i6 : i7;
        }

        public final void f(Range range) {
            Range range2 = O0.f2327a;
            if (range.equals(range2)) {
                return;
            }
            if (this.f2280b.l().equals(range2)) {
                this.f2280b.q(range);
            } else {
                if (this.f2280b.l().equals(range)) {
                    return;
                }
                this.f2291i = false;
                AbstractC0335i0.a("ValidatingBuilder", "Different ExpectedFrameRateRange values");
            }
        }
    }

    public L0(List list, List list2, List list3, List list4, List list5, N n6, InputConfiguration inputConfiguration) {
        this.f2272a = list;
        this.f2273b = Collections.unmodifiableList(list2);
        this.f2274c = Collections.unmodifiableList(list3);
        this.f2275d = Collections.unmodifiableList(list4);
        this.f2276e = Collections.unmodifiableList(list5);
        this.f2277f = n6;
        this.f2278g = inputConfiguration;
    }

    public static L0 a() {
        return new L0(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new ArrayList(0), new N.a().h(), null);
    }

    public List b() {
        return this.f2273b;
    }

    public List c() {
        return this.f2276e;
    }

    public P d() {
        return this.f2277f.f();
    }

    public InputConfiguration e() {
        return this.f2278g;
    }

    public List f() {
        return this.f2272a;
    }

    public List g() {
        return this.f2277f.c();
    }

    public N h() {
        return this.f2277f;
    }

    public List i() {
        return this.f2274c;
    }

    public List j() {
        return this.f2275d;
    }

    public List k() {
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.f2272a) {
            arrayList.add(eVar.e());
            Iterator it = eVar.d().iterator();
            while (it.hasNext()) {
                arrayList.add((W) it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int l() {
        return this.f2277f.i();
    }
}
