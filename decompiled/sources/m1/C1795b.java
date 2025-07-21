package m1;

import E1.I;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import b2.s;
import c1.AbstractC1119a;
import c1.C1111E;
import k2.C1668b;
import k2.C1671e;
import k2.C1674h;
import k2.J;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1795b implements k {

    /* renamed from: f, reason: collision with root package name */
    public static final I f17232f = new I();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0314p f17233a;

    /* renamed from: b, reason: collision with root package name */
    public final Z0.q f17234b;

    /* renamed from: c, reason: collision with root package name */
    public final C1111E f17235c;

    /* renamed from: d, reason: collision with root package name */
    public final s.a f17236d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17237e;

    public C1795b(InterfaceC0314p interfaceC0314p, Z0.q qVar, C1111E c1111e, s.a aVar, boolean z6) {
        this.f17233a = interfaceC0314p;
        this.f17234b = qVar;
        this.f17235c = c1111e;
        this.f17236d = aVar;
        this.f17237e = z6;
    }

    @Override // m1.k
    public void a() {
        this.f17233a.a(0L, 0L);
    }

    @Override // m1.k
    public boolean b(InterfaceC0315q interfaceC0315q) {
        return this.f17233a.g(interfaceC0315q, f17232f) == 0;
    }

    @Override // m1.k
    public void c(E1.r rVar) {
        this.f17233a.c(rVar);
    }

    @Override // m1.k
    public boolean d() {
        InterfaceC0314p d6 = this.f17233a.d();
        return (d6 instanceof C1674h) || (d6 instanceof C1668b) || (d6 instanceof C1671e) || (d6 instanceof X1.f);
    }

    @Override // m1.k
    public boolean e() {
        InterfaceC0314p d6 = this.f17233a.d();
        return (d6 instanceof J) || (d6 instanceof Y1.h);
    }

    @Override // m1.k
    public k f() {
        InterfaceC0314p fVar;
        AbstractC1119a.g(!e());
        AbstractC1119a.h(this.f17233a.d() == this.f17233a, "Can't recreate wrapped extractors. Outer type: " + this.f17233a.getClass());
        InterfaceC0314p interfaceC0314p = this.f17233a;
        if (interfaceC0314p instanceof w) {
            fVar = new w(this.f17234b.f6980d, this.f17235c, this.f17236d, this.f17237e);
        } else if (interfaceC0314p instanceof C1674h) {
            fVar = new C1674h();
        } else if (interfaceC0314p instanceof C1668b) {
            fVar = new C1668b();
        } else if (interfaceC0314p instanceof C1671e) {
            fVar = new C1671e();
        } else {
            if (!(interfaceC0314p instanceof X1.f)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f17233a.getClass().getSimpleName());
            }
            fVar = new X1.f();
        }
        return new C1795b(fVar, this.f17234b, this.f17235c, this.f17236d, this.f17237e);
    }
}
