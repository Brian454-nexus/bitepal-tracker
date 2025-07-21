package w1;

import c1.AbstractC1117K;
import c1.AbstractC1119a;
import g1.C1343l0;
import g1.N0;
import java.io.IOException;
import w1.InterfaceC2211C;
import w1.InterfaceC2212D;

/* renamed from: w1.z, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2240z implements InterfaceC2211C, InterfaceC2211C.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2212D.b f20132a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20133b;

    /* renamed from: c, reason: collision with root package name */
    public final A1.b f20134c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC2212D f20135d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC2211C f20136e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2211C.a f20137f;

    /* renamed from: g, reason: collision with root package name */
    public a f20138g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20139h;

    /* renamed from: i, reason: collision with root package name */
    public long f20140i = -9223372036854775807L;

    /* renamed from: w1.z$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(InterfaceC2212D.b bVar);

        void b(InterfaceC2212D.b bVar, IOException iOException);
    }

    public C2240z(InterfaceC2212D.b bVar, A1.b bVar2, long j6) {
        this.f20132a = bVar;
        this.f20134c = bVar2;
        this.f20133b = j6;
    }

    public void a(InterfaceC2212D.b bVar) {
        long u6 = u(this.f20133b);
        InterfaceC2211C d6 = ((InterfaceC2212D) AbstractC1119a.e(this.f20135d)).d(bVar, this.f20134c, u6);
        this.f20136e = d6;
        if (this.f20137f != null) {
            d6.s(this, u6);
        }
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public boolean b(C1343l0 c1343l0) {
        InterfaceC2211C interfaceC2211C = this.f20136e;
        return interfaceC2211C != null && interfaceC2211C.b(c1343l0);
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public long d() {
        return ((InterfaceC2211C) AbstractC1117K.i(this.f20136e)).d();
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public boolean e() {
        InterfaceC2211C interfaceC2211C = this.f20136e;
        return interfaceC2211C != null && interfaceC2211C.e();
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public long f() {
        return ((InterfaceC2211C) AbstractC1117K.i(this.f20136e)).f();
    }

    @Override // w1.InterfaceC2211C
    public long g(long j6, N0 n02) {
        return ((InterfaceC2211C) AbstractC1117K.i(this.f20136e)).g(j6, n02);
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public void h(long j6) {
        ((InterfaceC2211C) AbstractC1117K.i(this.f20136e)).h(j6);
    }

    @Override // w1.InterfaceC2211C.a
    public void i(InterfaceC2211C interfaceC2211C) {
        ((InterfaceC2211C.a) AbstractC1117K.i(this.f20137f)).i(this);
        a aVar = this.f20138g;
        if (aVar != null) {
            aVar.a(this.f20132a);
        }
    }

    @Override // w1.InterfaceC2211C
    public void l() {
        try {
            InterfaceC2211C interfaceC2211C = this.f20136e;
            if (interfaceC2211C != null) {
                interfaceC2211C.l();
                return;
            }
            InterfaceC2212D interfaceC2212D = this.f20135d;
            if (interfaceC2212D != null) {
                interfaceC2212D.l();
            }
        } catch (IOException e6) {
            a aVar = this.f20138g;
            if (aVar == null) {
                throw e6;
            }
            if (this.f20139h) {
                return;
            }
            this.f20139h = true;
            aVar.b(this.f20132a, e6);
        }
    }

    @Override // w1.InterfaceC2211C
    public long m(long j6) {
        return ((InterfaceC2211C) AbstractC1117K.i(this.f20136e)).m(j6);
    }

    public long n() {
        return this.f20140i;
    }

    @Override // w1.InterfaceC2211C
    public long o(z1.x[] xVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j6) {
        long j7 = this.f20140i;
        long j8 = (j7 == -9223372036854775807L || j6 != this.f20133b) ? j6 : j7;
        this.f20140i = -9223372036854775807L;
        return ((InterfaceC2211C) AbstractC1117K.i(this.f20136e)).o(xVarArr, zArr, b0VarArr, zArr2, j8);
    }

    @Override // w1.InterfaceC2211C
    public long p() {
        return ((InterfaceC2211C) AbstractC1117K.i(this.f20136e)).p();
    }

    public long q() {
        return this.f20133b;
    }

    @Override // w1.InterfaceC2211C
    public l0 r() {
        return ((InterfaceC2211C) AbstractC1117K.i(this.f20136e)).r();
    }

    @Override // w1.InterfaceC2211C
    public void s(InterfaceC2211C.a aVar, long j6) {
        this.f20137f = aVar;
        InterfaceC2211C interfaceC2211C = this.f20136e;
        if (interfaceC2211C != null) {
            interfaceC2211C.s(this, u(this.f20133b));
        }
    }

    @Override // w1.InterfaceC2211C
    public void t(long j6, boolean z6) {
        ((InterfaceC2211C) AbstractC1117K.i(this.f20136e)).t(j6, z6);
    }

    public final long u(long j6) {
        long j7 = this.f20140i;
        return j7 != -9223372036854775807L ? j7 : j6;
    }

    @Override // w1.c0.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void j(InterfaceC2211C interfaceC2211C) {
        ((InterfaceC2211C.a) AbstractC1117K.i(this.f20137f)).j(this);
    }

    public void w(long j6) {
        this.f20140i = j6;
    }

    public void x() {
        if (this.f20136e != null) {
            ((InterfaceC2212D) AbstractC1119a.e(this.f20135d)).r(this.f20136e);
        }
    }

    public void y(InterfaceC2212D interfaceC2212D) {
        AbstractC1119a.g(this.f20135d == null);
        this.f20135d = interfaceC2212D;
    }
}
