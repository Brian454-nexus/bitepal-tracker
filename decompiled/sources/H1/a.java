package H1;

import E1.I;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.L;
import E1.r;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements InterfaceC0314p {

    /* renamed from: a, reason: collision with root package name */
    public final C1144z f2034a = new C1144z(4);

    /* renamed from: b, reason: collision with root package name */
    public final L f2035b = new L(-1, -1, "image/avif");

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        this.f2035b.a(j6, j7);
    }

    public final boolean b(InterfaceC0315q interfaceC0315q, int i6) {
        this.f2034a.P(4);
        interfaceC0315q.s(this.f2034a.e(), 0, 4);
        return this.f2034a.I() == ((long) i6);
    }

    @Override // E1.InterfaceC0314p
    public void c(r rVar) {
        this.f2035b.c(rVar);
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, I i6) {
        return this.f2035b.g(interfaceC0315q, i6);
    }

    @Override // E1.InterfaceC0314p
    public boolean i(InterfaceC0315q interfaceC0315q) {
        interfaceC0315q.j(4);
        return b(interfaceC0315q, 1718909296) && b(interfaceC0315q, 1635150182);
    }

    @Override // E1.InterfaceC0314p
    public void release() {
    }
}
