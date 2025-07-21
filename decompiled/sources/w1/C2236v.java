package w1;

import Z0.u;
import c1.AbstractC1119a;
import e1.InterfaceC1266x;
import w1.InterfaceC2212D;

/* renamed from: w1.v, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2236v extends AbstractC2216a {

    /* renamed from: h, reason: collision with root package name */
    public final long f20115h;

    /* renamed from: i, reason: collision with root package name */
    public Z0.u f20116i;

    /* renamed from: w1.v$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements InterfaceC2212D.a {

        /* renamed from: c, reason: collision with root package name */
        public final long f20117c;

        public b(long j6, InterfaceC2234t interfaceC2234t) {
            this.f20117c = j6;
        }

        @Override // w1.InterfaceC2212D.a
        public InterfaceC2212D.a c(A1.k kVar) {
            return this;
        }

        @Override // w1.InterfaceC2212D.a
        public InterfaceC2212D.a e(l1.w wVar) {
            return this;
        }

        @Override // w1.InterfaceC2212D.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C2236v d(Z0.u uVar) {
            return new C2236v(uVar, this.f20117c, null);
        }
    }

    @Override // w1.AbstractC2216a
    public void C(InterfaceC1266x interfaceC1266x) {
        D(new e0(this.f20115h, true, false, false, null, g()));
    }

    @Override // w1.AbstractC2216a
    public void E() {
    }

    @Override // w1.InterfaceC2212D
    public InterfaceC2211C d(InterfaceC2212D.b bVar, A1.b bVar2, long j6) {
        Z0.u g6 = g();
        AbstractC1119a.e(g6.f7064b);
        AbstractC1119a.f(g6.f7064b.f7157b, "Externally loaded mediaItems require a MIME type.");
        u.h hVar = g6.f7064b;
        return new C2235u(hVar.f7156a, hVar.f7157b, null);
    }

    @Override // w1.InterfaceC2212D
    public synchronized Z0.u g() {
        return this.f20116i;
    }

    @Override // w1.InterfaceC2212D
    public void l() {
    }

    @Override // w1.InterfaceC2212D
    public void r(InterfaceC2211C interfaceC2211C) {
        ((C2235u) interfaceC2211C).k();
    }

    @Override // w1.InterfaceC2212D
    public synchronized void s(Z0.u uVar) {
        this.f20116i = uVar;
    }

    public C2236v(Z0.u uVar, long j6, InterfaceC2234t interfaceC2234t) {
        this.f20116i = uVar;
        this.f20115h = j6;
    }
}
