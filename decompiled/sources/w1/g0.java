package w1;

import Z0.q;
import Z0.u;
import android.net.Uri;
import c1.AbstractC1119a;
import e1.C1252j;
import e1.InterfaceC1248f;
import e1.InterfaceC1266x;
import w1.InterfaceC2212D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g0 extends AbstractC2216a {

    /* renamed from: h, reason: collision with root package name */
    public final C1252j f20029h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC1248f.a f20030i;

    /* renamed from: j, reason: collision with root package name */
    public final Z0.q f20031j;

    /* renamed from: k, reason: collision with root package name */
    public final long f20032k;

    /* renamed from: l, reason: collision with root package name */
    public final A1.k f20033l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f20034m;

    /* renamed from: n, reason: collision with root package name */
    public final Z0.G f20035n;

    /* renamed from: o, reason: collision with root package name */
    public final Z0.u f20036o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC1266x f20037p;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC1248f.a f20038a;

        /* renamed from: b, reason: collision with root package name */
        public A1.k f20039b = new A1.j();

        /* renamed from: c, reason: collision with root package name */
        public boolean f20040c = true;

        /* renamed from: d, reason: collision with root package name */
        public Object f20041d;

        /* renamed from: e, reason: collision with root package name */
        public String f20042e;

        public b(InterfaceC1248f.a aVar) {
            this.f20038a = (InterfaceC1248f.a) AbstractC1119a.e(aVar);
        }

        public g0 a(u.k kVar, long j6) {
            return new g0(this.f20042e, kVar, this.f20038a, j6, this.f20039b, this.f20040c, this.f20041d);
        }

        public b b(A1.k kVar) {
            if (kVar == null) {
                kVar = new A1.j();
            }
            this.f20039b = kVar;
            return this;
        }
    }

    @Override // w1.AbstractC2216a
    public void C(InterfaceC1266x interfaceC1266x) {
        this.f20037p = interfaceC1266x;
        D(this.f20035n);
    }

    @Override // w1.AbstractC2216a
    public void E() {
    }

    @Override // w1.InterfaceC2212D
    public InterfaceC2211C d(InterfaceC2212D.b bVar, A1.b bVar2, long j6) {
        return new f0(this.f20029h, this.f20030i, this.f20037p, this.f20031j, this.f20032k, this.f20033l, x(bVar), this.f20034m);
    }

    @Override // w1.InterfaceC2212D
    public Z0.u g() {
        return this.f20036o;
    }

    @Override // w1.InterfaceC2212D
    public void l() {
    }

    @Override // w1.InterfaceC2212D
    public void r(InterfaceC2211C interfaceC2211C) {
        ((f0) interfaceC2211C).n();
    }

    public g0(String str, u.k kVar, InterfaceC1248f.a aVar, long j6, A1.k kVar2, boolean z6, Object obj) {
        this.f20030i = aVar;
        this.f20032k = j6;
        this.f20033l = kVar2;
        this.f20034m = z6;
        Z0.u a6 = new u.c().g(Uri.EMPTY).c(kVar.f7175a.toString()).e(z6.w.y(kVar)).f(obj).a();
        this.f20036o = a6;
        q.b c02 = new q.b().o0((String) y6.i.a(kVar.f7176b, "text/x-unknown")).e0(kVar.f7177c).q0(kVar.f7178d).m0(kVar.f7179e).c0(kVar.f7180f);
        String str2 = kVar.f7181g;
        this.f20031j = c02.a0(str2 != null ? str2 : str).K();
        this.f20029h = new C1252j.b().i(kVar.f7175a).b(1).a();
        this.f20035n = new e0(j6, true, false, false, null, a6);
    }
}
