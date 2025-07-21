package L1;

import E1.I;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.L;
import E1.r;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements InterfaceC0314p {

    /* renamed from: a, reason: collision with root package name */
    public final C1144z f3107a = new C1144z(4);

    /* renamed from: b, reason: collision with root package name */
    public final L f3108b = new L(-1, -1, "image/heif");

    private boolean b(InterfaceC0315q interfaceC0315q, int i6) {
        this.f3107a.P(4);
        interfaceC0315q.s(this.f3107a.e(), 0, 4);
        return this.f3107a.I() == ((long) i6);
    }

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        this.f3108b.a(j6, j7);
    }

    @Override // E1.InterfaceC0314p
    public void c(r rVar) {
        this.f3108b.c(rVar);
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, I i6) {
        return this.f3108b.g(interfaceC0315q, i6);
    }

    @Override // E1.InterfaceC0314p
    public boolean i(InterfaceC0315q interfaceC0315q) {
        interfaceC0315q.j(4);
        return b(interfaceC0315q, 1718909296) && b(interfaceC0315q, 1751476579);
    }

    @Override // E1.InterfaceC0314p
    public void release() {
    }
}
