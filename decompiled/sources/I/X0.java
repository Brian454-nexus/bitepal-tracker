package I;

import F.AbstractC0335i0;
import I.L0;
import I.X0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class X0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2381a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f2382b = new LinkedHashMap();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        boolean a(b bVar);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final L0 f2383a;

        /* renamed from: b, reason: collision with root package name */
        public final Y0 f2384b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2385c = false;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2386d = false;

        public b(L0 l02, Y0 y02) {
            this.f2383a = l02;
            this.f2384b = y02;
        }

        public boolean a() {
            return this.f2386d;
        }

        public boolean b() {
            return this.f2385c;
        }

        public L0 c() {
            return this.f2383a;
        }

        public Y0 d() {
            return this.f2384b;
        }

        public void e(boolean z6) {
            this.f2386d = z6;
        }

        public void f(boolean z6) {
            this.f2385c = z6;
        }
    }

    public X0(String str) {
        this.f2381a = str;
    }

    public static /* synthetic */ boolean c(b bVar) {
        return bVar.a() && bVar.b();
    }

    public L0.g d() {
        L0.g gVar = new L0.g();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f2382b.entrySet()) {
            b bVar = (b) entry.getValue();
            if (bVar.a() && bVar.b()) {
                String str = (String) entry.getKey();
                gVar.a(bVar.c());
                arrayList.add(str);
            }
        }
        AbstractC0335i0.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f2381a);
        return gVar;
    }

    public Collection e() {
        return Collections.unmodifiableCollection(j(new a() { // from class: I.W0
            @Override // I.X0.a
            public final boolean a(X0.b bVar) {
                return X0.c(bVar);
            }
        }));
    }

    public L0.g f() {
        L0.g gVar = new L0.g();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f2382b.entrySet()) {
            b bVar = (b) entry.getValue();
            if (bVar.b()) {
                gVar.a(bVar.c());
                arrayList.add((String) entry.getKey());
            }
        }
        AbstractC0335i0.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f2381a);
        return gVar;
    }

    public Collection g() {
        return Collections.unmodifiableCollection(j(new a() { // from class: I.U0
            @Override // I.X0.a
            public final boolean a(X0.b bVar) {
                boolean b6;
                b6 = bVar.b();
                return b6;
            }
        }));
    }

    public Collection h() {
        return Collections.unmodifiableCollection(k(new a() { // from class: I.V0
            @Override // I.X0.a
            public final boolean a(X0.b bVar) {
                boolean b6;
                b6 = bVar.b();
                return b6;
            }
        }));
    }

    public final b i(String str, L0 l02, Y0 y02) {
        b bVar = (b) this.f2382b.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(l02, y02);
        this.f2382b.put(str, bVar2);
        return bVar2;
    }

    public final Collection j(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f2382b.entrySet()) {
            if (aVar == null || aVar.a((b) entry.getValue())) {
                arrayList.add(((b) entry.getValue()).c());
            }
        }
        return arrayList;
    }

    public final Collection k(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f2382b.entrySet()) {
            if (aVar == null || aVar.a((b) entry.getValue())) {
                arrayList.add(((b) entry.getValue()).d());
            }
        }
        return arrayList;
    }

    public boolean l(String str) {
        if (this.f2382b.containsKey(str)) {
            return ((b) this.f2382b.get(str)).b();
        }
        return false;
    }

    public void m(String str) {
        this.f2382b.remove(str);
    }

    public void n(String str, L0 l02, Y0 y02) {
        i(str, l02, y02).e(true);
    }

    public void o(String str, L0 l02, Y0 y02) {
        i(str, l02, y02).f(true);
    }

    public void p(String str) {
        if (this.f2382b.containsKey(str)) {
            b bVar = (b) this.f2382b.get(str);
            bVar.f(false);
            if (bVar.a()) {
                return;
            }
            this.f2382b.remove(str);
        }
    }

    public void q(String str) {
        if (this.f2382b.containsKey(str)) {
            b bVar = (b) this.f2382b.get(str);
            bVar.e(false);
            if (bVar.b()) {
                return;
            }
            this.f2382b.remove(str);
        }
    }

    public void r(String str, L0 l02, Y0 y02) {
        if (this.f2382b.containsKey(str)) {
            b bVar = new b(l02, y02);
            b bVar2 = (b) this.f2382b.get(str);
            bVar.f(bVar2.b());
            bVar.e(bVar2.a());
            this.f2382b.put(str, bVar);
        }
    }
}
