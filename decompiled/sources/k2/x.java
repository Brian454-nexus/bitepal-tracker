package k2;

import E1.O;
import Z0.q;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1111E;
import c1.C1144z;
import k2.K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class x implements InterfaceC1666D {

    /* renamed from: a, reason: collision with root package name */
    public Z0.q f16794a;

    /* renamed from: b, reason: collision with root package name */
    public C1111E f16795b;

    /* renamed from: c, reason: collision with root package name */
    public O f16796c;

    public x(String str) {
        this.f16794a = new q.b().o0(str).K();
    }

    @Override // k2.InterfaceC1666D
    public void a(C1144z c1144z) {
        b();
        long e6 = this.f16795b.e();
        long f6 = this.f16795b.f();
        if (e6 == -9223372036854775807L || f6 == -9223372036854775807L) {
            return;
        }
        Z0.q qVar = this.f16794a;
        if (f6 != qVar.f6995s) {
            Z0.q K5 = qVar.a().s0(f6).K();
            this.f16794a = K5;
            this.f16796c.e(K5);
        }
        int a6 = c1144z.a();
        this.f16796c.a(c1144z, a6);
        this.f16796c.f(e6, 1, a6, 0, null);
    }

    public final void b() {
        AbstractC1119a.i(this.f16795b);
        AbstractC1117K.i(this.f16796c);
    }

    @Override // k2.InterfaceC1666D
    public void c(C1111E c1111e, E1.r rVar, K.d dVar) {
        this.f16795b = c1111e;
        dVar.a();
        O a6 = rVar.a(dVar.c(), 5);
        this.f16796c = a6;
        a6.e(this.f16794a);
    }
}
