package M1;

import E1.I;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.L;
import E1.r;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements InterfaceC0314p {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0314p f3378a;

    public a(int i6) {
        if ((i6 & 1) != 0) {
            this.f3378a = new L(65496, 2, "image/jpeg");
        } else {
            this.f3378a = new b();
        }
    }

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        this.f3378a.a(j6, j7);
    }

    @Override // E1.InterfaceC0314p
    public void c(r rVar) {
        this.f3378a.c(rVar);
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, I i6) {
        return this.f3378a.g(interfaceC0315q, i6);
    }

    @Override // E1.InterfaceC0314p
    public boolean i(InterfaceC0315q interfaceC0315q) {
        return this.f3378a.i(interfaceC0315q);
    }

    @Override // E1.InterfaceC0314p
    public void release() {
        this.f3378a.release();
    }
}
