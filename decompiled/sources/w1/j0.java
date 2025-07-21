package w1;

import Z0.G;
import Z0.u;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j0 extends AbstractC2237w {

    /* renamed from: f, reason: collision with root package name */
    public final Z0.u f20065f;

    public j0(Z0.G g6, Z0.u uVar) {
        super(g6);
        this.f20065f = uVar;
    }

    @Override // w1.AbstractC2237w, Z0.G
    public G.c o(int i6, G.c cVar, long j6) {
        super.o(i6, cVar, j6);
        Z0.u uVar = this.f20065f;
        cVar.f6686c = uVar;
        u.h hVar = uVar.f7064b;
        cVar.f6685b = hVar != null ? hVar.f7163h : null;
        return cVar;
    }
}
