package m2;

import E1.I;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.L;
import E1.r;
import c1.C1144z;

/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1800a implements InterfaceC0314p {

    /* renamed from: a, reason: collision with root package name */
    public final C1144z f17429a = new C1144z(4);

    /* renamed from: b, reason: collision with root package name */
    public final L f17430b = new L(-1, -1, "image/webp");

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        this.f17430b.a(j6, j7);
    }

    @Override // E1.InterfaceC0314p
    public void c(r rVar) {
        this.f17430b.c(rVar);
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, I i6) {
        return this.f17430b.g(interfaceC0315q, i6);
    }

    @Override // E1.InterfaceC0314p
    public boolean i(InterfaceC0315q interfaceC0315q) {
        this.f17429a.P(4);
        interfaceC0315q.s(this.f17429a.e(), 0, 4);
        if (this.f17429a.I() != 1380533830) {
            return false;
        }
        interfaceC0315q.j(4);
        this.f17429a.P(4);
        interfaceC0315q.s(this.f17429a.e(), 0, 4);
        return this.f17429a.I() == 1464156752;
    }

    @Override // E1.InterfaceC0314p
    public void release() {
    }
}
