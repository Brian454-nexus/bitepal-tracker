package w1;

import e1.InterfaceC1266x;
import w1.InterfaceC2212D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class n0 extends AbstractC2223h {

    /* renamed from: l, reason: collision with root package name */
    public static final Void f20079l = null;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2212D f20080k;

    public n0(InterfaceC2212D interfaceC2212D) {
        this.f20080k = interfaceC2212D;
    }

    @Override // w1.AbstractC2223h, w1.AbstractC2216a
    public final void C(InterfaceC1266x interfaceC1266x) {
        super.C(interfaceC1266x);
        U();
    }

    @Override // w1.AbstractC2223h
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2212D.b G(Void r12, InterfaceC2212D.b bVar) {
        return M(bVar);
    }

    public InterfaceC2212D.b M(InterfaceC2212D.b bVar) {
        return bVar;
    }

    public long N(long j6, InterfaceC2212D.b bVar) {
        return j6;
    }

    @Override // w1.AbstractC2223h
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final long H(Void r12, long j6, InterfaceC2212D.b bVar) {
        return N(j6, bVar);
    }

    public int P(int i6) {
        return i6;
    }

    @Override // w1.AbstractC2223h
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final int I(Void r12, int i6) {
        return P(i6);
    }

    public abstract void R(Z0.G g6);

    @Override // w1.AbstractC2223h
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void J(Void r12, InterfaceC2212D interfaceC2212D, Z0.G g6) {
        R(g6);
    }

    public final void T() {
        K(f20079l, this.f20080k);
    }

    public void U() {
        T();
    }

    @Override // w1.InterfaceC2212D
    public Z0.u g() {
        return this.f20080k.g();
    }

    @Override // w1.InterfaceC2212D
    public boolean m() {
        return this.f20080k.m();
    }

    @Override // w1.InterfaceC2212D
    public Z0.G o() {
        return this.f20080k.o();
    }

    @Override // w1.InterfaceC2212D
    public void s(Z0.u uVar) {
        this.f20080k.s(uVar);
    }
}
