package b2;

import E1.I;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import b2.s;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class t implements InterfaceC0314p {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0314p f10495a;

    /* renamed from: b, reason: collision with root package name */
    public final s.a f10496b;

    /* renamed from: c, reason: collision with root package name */
    public u f10497c;

    public t(InterfaceC0314p interfaceC0314p, s.a aVar) {
        this.f10495a = interfaceC0314p;
        this.f10496b = aVar;
    }

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        u uVar = this.f10497c;
        if (uVar != null) {
            uVar.b();
        }
        this.f10495a.a(j6, j7);
    }

    @Override // E1.InterfaceC0314p
    public void c(E1.r rVar) {
        u uVar = new u(rVar, this.f10496b);
        this.f10497c = uVar;
        this.f10495a.c(uVar);
    }

    @Override // E1.InterfaceC0314p
    public InterfaceC0314p d() {
        return this.f10495a;
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, I i6) {
        return this.f10495a.g(interfaceC0315q, i6);
    }

    @Override // E1.InterfaceC0314p
    public boolean i(InterfaceC0315q interfaceC0315q) {
        return this.f10495a.i(interfaceC0315q);
    }

    @Override // E1.InterfaceC0314p
    public void release() {
        this.f10495a.release();
    }
}
