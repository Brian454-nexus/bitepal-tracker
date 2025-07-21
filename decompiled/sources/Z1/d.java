package Z1;

import E1.I;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.O;
import E1.r;
import E1.u;
import Z0.z;
import c1.AbstractC1119a;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d implements InterfaceC0314p {

    /* renamed from: d, reason: collision with root package name */
    public static final u f7311d = new u() { // from class: Z1.c
        @Override // E1.u
        public final InterfaceC0314p[] c() {
            return d.b();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public r f7312a;

    /* renamed from: b, reason: collision with root package name */
    public i f7313b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7314c;

    public static /* synthetic */ InterfaceC0314p[] b() {
        return new InterfaceC0314p[]{new d()};
    }

    public static C1144z e(C1144z c1144z) {
        c1144z.T(0);
        return c1144z;
    }

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        i iVar = this.f7313b;
        if (iVar != null) {
            iVar.m(j6, j7);
        }
    }

    @Override // E1.InterfaceC0314p
    public void c(r rVar) {
        this.f7312a = rVar;
    }

    public final boolean f(InterfaceC0315q interfaceC0315q) {
        f fVar = new f();
        if (fVar.a(interfaceC0315q, true) && (fVar.f7321b & 2) == 2) {
            int min = Math.min(fVar.f7328i, 8);
            C1144z c1144z = new C1144z(min);
            interfaceC0315q.s(c1144z.e(), 0, min);
            if (b.p(e(c1144z))) {
                this.f7313b = new b();
            } else if (j.r(e(c1144z))) {
                this.f7313b = new j();
            } else if (h.o(e(c1144z))) {
                this.f7313b = new h();
            }
            return true;
        }
        return false;
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, I i6) {
        AbstractC1119a.i(this.f7312a);
        if (this.f7313b == null) {
            if (!f(interfaceC0315q)) {
                throw z.a("Failed to determine bitstream type", null);
            }
            interfaceC0315q.o();
        }
        if (!this.f7314c) {
            O a6 = this.f7312a.a(0, 1);
            this.f7312a.k();
            this.f7313b.d(this.f7312a, a6);
            this.f7314c = true;
        }
        return this.f7313b.g(interfaceC0315q, i6);
    }

    @Override // E1.InterfaceC0314p
    public boolean i(InterfaceC0315q interfaceC0315q) {
        try {
            return f(interfaceC0315q);
        } catch (z unused) {
            return false;
        }
    }

    @Override // E1.InterfaceC0314p
    public void release() {
    }
}
