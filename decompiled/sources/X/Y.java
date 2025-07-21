package X;

import F.AbstractC0335i0;
import I.I0;
import I.InterfaceC0421c0;
import I.InterfaceC0423d0;
import X.AbstractC0811u;
import android.util.Size;
import c0.AbstractC1104f;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import t.InterfaceC2069a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class Y implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0421c0 f5822b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f5823c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Map f5824d = new HashMap();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Map f5825a = new LinkedHashMap();

        /* renamed from: b, reason: collision with root package name */
        public final TreeMap f5826b = new TreeMap(new L.e());

        /* renamed from: c, reason: collision with root package name */
        public final Z.g f5827c;

        /* renamed from: d, reason: collision with root package name */
        public final Z.g f5828d;

        public a(InterfaceC0421c0 interfaceC0421c0) {
            for (AbstractC0811u abstractC0811u : AbstractC0811u.b()) {
                InterfaceC0423d0 d6 = d(abstractC0811u, interfaceC0421c0);
                if (d6 != null) {
                    AbstractC0335i0.a("RecorderVideoCapabilities", "profiles = " + d6);
                    Z.g g6 = g(d6);
                    if (g6 == null) {
                        AbstractC0335i0.l("RecorderVideoCapabilities", "EncoderProfiles of quality " + abstractC0811u + " has no video validated profiles.");
                    } else {
                        InterfaceC0423d0.c k6 = g6.k();
                        this.f5826b.put(new Size(k6.k(), k6.h()), abstractC0811u);
                        this.f5825a.put(abstractC0811u, g6);
                    }
                }
            }
            if (this.f5825a.isEmpty()) {
                AbstractC0335i0.c("RecorderVideoCapabilities", "No supported EncoderProfiles");
                this.f5828d = null;
                this.f5827c = null;
            } else {
                ArrayDeque arrayDeque = new ArrayDeque(this.f5825a.values());
                this.f5827c = (Z.g) arrayDeque.peekFirst();
                this.f5828d = (Z.g) arrayDeque.peekLast();
            }
        }

        public static void a(AbstractC0811u abstractC0811u) {
            y0.g.b(AbstractC0811u.a(abstractC0811u), "Unknown quality: " + abstractC0811u);
        }

        public Z.g b(Size size) {
            AbstractC0811u c6 = c(size);
            AbstractC0335i0.a("RecorderVideoCapabilities", "Using supported quality of " + c6 + " for size " + size);
            if (c6 == AbstractC0811u.f5980g) {
                return null;
            }
            Z.g e6 = e(c6);
            if (e6 != null) {
                return e6;
            }
            throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
        }

        public AbstractC0811u c(Size size) {
            Map.Entry ceilingEntry = this.f5826b.ceilingEntry(size);
            if (ceilingEntry != null) {
                return (AbstractC0811u) ceilingEntry.getValue();
            }
            Map.Entry floorEntry = this.f5826b.floorEntry(size);
            return floorEntry != null ? (AbstractC0811u) floorEntry.getValue() : AbstractC0811u.f5980g;
        }

        public final InterfaceC0423d0 d(AbstractC0811u abstractC0811u, InterfaceC0421c0 interfaceC0421c0) {
            y0.g.i(abstractC0811u instanceof AbstractC0811u.b, "Currently only support ConstantQuality");
            return interfaceC0421c0.b(((AbstractC0811u.b) abstractC0811u).d());
        }

        public Z.g e(AbstractC0811u abstractC0811u) {
            a(abstractC0811u);
            return abstractC0811u == AbstractC0811u.f5979f ? this.f5827c : abstractC0811u == AbstractC0811u.f5978e ? this.f5828d : (Z.g) this.f5825a.get(abstractC0811u);
        }

        public List f() {
            return new ArrayList(this.f5825a.keySet());
        }

        public final Z.g g(InterfaceC0423d0 interfaceC0423d0) {
            if (interfaceC0423d0.d().isEmpty()) {
                return null;
            }
            return Z.g.i(interfaceC0423d0);
        }
    }

    public Y(I.D d6, InterfaceC2069a interfaceC2069a) {
        InterfaceC0421c0 k6 = d6.k();
        this.f5822b = new g0.c(new I0(m(d6) ? new Z.c(k6, interfaceC2069a) : k6, d6.l()), d6, AbstractC1104f.b());
        for (F.C c6 : d6.c()) {
            a aVar = new a(new Z.f(this.f5822b, c6));
            if (!aVar.f().isEmpty()) {
                this.f5823c.put(c6, aVar);
            }
        }
    }

    public static boolean e(F.C c6, F.C c7) {
        y0.g.i(l(c7), "Fully specified range is not actually fully specified.");
        return c6.a() == 0 || c6.a() == c7.a();
    }

    public static boolean f(F.C c6, F.C c7) {
        y0.g.i(l(c7), "Fully specified range is not actually fully specified.");
        int b6 = c6.b();
        if (b6 == 0) {
            return true;
        }
        int b7 = c7.b();
        return (b6 == 2 && b7 != 1) || b6 == b7;
    }

    public static boolean g(F.C c6, Set set) {
        if (l(c6)) {
            return set.contains(c6);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            F.C c7 = (F.C) it.next();
            if (e(c6, c7) && f(c6, c7)) {
                return true;
            }
        }
        return false;
    }

    public static Y h(F.r rVar) {
        return new Y((I.D) rVar, Z.c.f6597d);
    }

    public static boolean l(F.C c6) {
        return (c6.b() == 0 || c6.b() == 2 || c6.a() == 0) ? false : true;
    }

    public static boolean m(I.D d6) {
        for (F.C c6 : d6.c()) {
            Integer valueOf = Integer.valueOf(c6.b());
            int a6 = c6.a();
            if (valueOf.equals(3) && a6 == 10) {
                return true;
            }
        }
        return false;
    }

    @Override // X.c0
    public Z.g a(Size size, F.C c6) {
        a j6 = j(c6);
        if (j6 == null) {
            return null;
        }
        return j6.b(size);
    }

    @Override // X.c0
    public AbstractC0811u b(Size size, F.C c6) {
        a j6 = j(c6);
        return j6 == null ? AbstractC0811u.f5980g : j6.c(size);
    }

    @Override // X.c0
    public Z.g c(AbstractC0811u abstractC0811u, F.C c6) {
        a j6 = j(c6);
        if (j6 == null) {
            return null;
        }
        return j6.e(abstractC0811u);
    }

    @Override // X.c0
    public List d(F.C c6) {
        a j6 = j(c6);
        return j6 == null ? new ArrayList() : j6.f();
    }

    public final a i(F.C c6) {
        if (g(c6, k())) {
            return new a(new Z.f(this.f5822b, c6));
        }
        return null;
    }

    public final a j(F.C c6) {
        if (l(c6)) {
            return (a) this.f5823c.get(c6);
        }
        if (this.f5824d.containsKey(c6)) {
            return (a) this.f5824d.get(c6);
        }
        a i6 = i(c6);
        this.f5824d.put(c6, i6);
        return i6;
    }

    public Set k() {
        return this.f5823c.keySet();
    }
}
