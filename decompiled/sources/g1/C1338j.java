package g1;

import c1.AbstractC1119a;
import c1.InterfaceC1121c;

/* renamed from: g1.j, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1338j implements InterfaceC1345m0 {

    /* renamed from: a, reason: collision with root package name */
    public final O0 f14686a;

    /* renamed from: b, reason: collision with root package name */
    public final a f14687b;

    /* renamed from: c, reason: collision with root package name */
    public J0 f14688c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1345m0 f14689d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14690e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14691f;

    /* renamed from: g1.j$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void m(Z0.B b6);
    }

    public C1338j(a aVar, InterfaceC1121c interfaceC1121c) {
        this.f14687b = aVar;
        this.f14686a = new O0(interfaceC1121c);
    }

    @Override // g1.InterfaceC1345m0
    public long A() {
        return this.f14690e ? this.f14686a.A() : ((InterfaceC1345m0) AbstractC1119a.e(this.f14689d)).A();
    }

    @Override // g1.InterfaceC1345m0
    public boolean F() {
        return this.f14690e ? this.f14686a.F() : ((InterfaceC1345m0) AbstractC1119a.e(this.f14689d)).F();
    }

    public void a(J0 j02) {
        if (j02 == this.f14688c) {
            this.f14689d = null;
            this.f14688c = null;
            this.f14690e = true;
        }
    }

    public void b(J0 j02) {
        InterfaceC1345m0 interfaceC1345m0;
        InterfaceC1345m0 R5 = j02.R();
        if (R5 == null || R5 == (interfaceC1345m0 = this.f14689d)) {
            return;
        }
        if (interfaceC1345m0 != null) {
            throw C1342l.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f14689d = R5;
        this.f14688c = j02;
        R5.e(this.f14686a.g());
    }

    public void c(long j6) {
        this.f14686a.a(j6);
    }

    public final boolean d(boolean z6) {
        J0 j02 = this.f14688c;
        if (j02 == null || j02.d()) {
            return true;
        }
        if (z6 && this.f14688c.f() != 2) {
            return true;
        }
        if (this.f14688c.c()) {
            return false;
        }
        return z6 || this.f14688c.p();
    }

    @Override // g1.InterfaceC1345m0
    public void e(Z0.B b6) {
        InterfaceC1345m0 interfaceC1345m0 = this.f14689d;
        if (interfaceC1345m0 != null) {
            interfaceC1345m0.e(b6);
            b6 = this.f14689d.g();
        }
        this.f14686a.e(b6);
    }

    public void f() {
        this.f14691f = true;
        this.f14686a.b();
    }

    @Override // g1.InterfaceC1345m0
    public Z0.B g() {
        InterfaceC1345m0 interfaceC1345m0 = this.f14689d;
        return interfaceC1345m0 != null ? interfaceC1345m0.g() : this.f14686a.g();
    }

    public void h() {
        this.f14691f = false;
        this.f14686a.c();
    }

    public long i(boolean z6) {
        j(z6);
        return A();
    }

    public final void j(boolean z6) {
        if (d(z6)) {
            this.f14690e = true;
            if (this.f14691f) {
                this.f14686a.b();
                return;
            }
            return;
        }
        InterfaceC1345m0 interfaceC1345m0 = (InterfaceC1345m0) AbstractC1119a.e(this.f14689d);
        long A6 = interfaceC1345m0.A();
        if (this.f14690e) {
            if (A6 < this.f14686a.A()) {
                this.f14686a.c();
                return;
            } else {
                this.f14690e = false;
                if (this.f14691f) {
                    this.f14686a.b();
                }
            }
        }
        this.f14686a.a(A6);
        Z0.B g6 = interfaceC1345m0.g();
        if (g6.equals(this.f14686a.g())) {
            return;
        }
        this.f14686a.e(g6);
        this.f14687b.m(g6);
    }
}
