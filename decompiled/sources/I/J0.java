package I;

import F.F;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class J0 extends AbstractC0429g0 {

    /* renamed from: c, reason: collision with root package name */
    public final A f2266c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f2267d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Set f2268e;

    public J0(A a6) {
        super(a6);
        this.f2267d = false;
        this.f2266c = a6;
    }

    @Override // I.AbstractC0429g0, I.A
    public A b() {
        return this.f2266c;
    }

    @Override // I.AbstractC0429g0, F.InterfaceC0341m
    public D6.g d() {
        return this.f2266c.d();
    }

    @Override // I.AbstractC0429g0, F.InterfaceC0341m
    public D6.g e(float f6) {
        return !p(0) ? N.f.f(new IllegalStateException("Zoom is not supported")) : this.f2266c.e(f6);
    }

    @Override // I.AbstractC0429g0, F.InterfaceC0341m
    public D6.g h(boolean z6) {
        return !p(6) ? N.f.f(new IllegalStateException("Torch is not supported")) : this.f2266c.h(z6);
    }

    @Override // I.AbstractC0429g0, F.InterfaceC0341m
    public D6.g j(int i6) {
        return !p(7) ? N.f.f(new IllegalStateException("ExposureCompensation is not supported")) : this.f2266c.j(i6);
    }

    @Override // I.AbstractC0429g0, F.InterfaceC0341m
    public D6.g l(F.F f6) {
        F.F o6 = o(f6);
        return o6 == null ? N.f.f(new IllegalStateException("FocusMetering is not supported")) : this.f2266c.l(o6);
    }

    public void n(boolean z6, Set set) {
        this.f2267d = z6;
        this.f2268e = set;
    }

    public F.F o(F.F f6) {
        boolean z6;
        F.a aVar = new F.a(f6);
        boolean z7 = true;
        if (f6.c().isEmpty() || p(1, 2)) {
            z6 = false;
        } else {
            aVar.e(1);
            z6 = true;
        }
        if (!f6.b().isEmpty() && !p(3)) {
            aVar.e(2);
            z6 = true;
        }
        if (f6.d().isEmpty() || p(4)) {
            z7 = z6;
        } else {
            aVar.e(4);
        }
        if (!z7) {
            return f6;
        }
        F.F c6 = aVar.c();
        if (c6.c().isEmpty() && c6.b().isEmpty() && c6.d().isEmpty()) {
            return null;
        }
        return aVar.c();
    }

    public boolean p(int... iArr) {
        if (!this.f2267d || this.f2268e == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i6 : iArr) {
            arrayList.add(Integer.valueOf(i6));
        }
        return this.f2268e.containsAll(arrayList);
    }
}
