package E1;

import S1.h;
import c1.C1144z;
import java.io.EOFException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final C1144z f891a = new C1144z(10);

    public Z0.x a(InterfaceC0315q interfaceC0315q, h.a aVar) {
        Z0.x xVar = null;
        int i6 = 0;
        while (true) {
            try {
                interfaceC0315q.s(this.f891a.e(), 0, 10);
                this.f891a.T(0);
                if (this.f891a.J() != 4801587) {
                    break;
                }
                this.f891a.U(3);
                int F6 = this.f891a.F();
                int i7 = F6 + 10;
                if (xVar == null) {
                    byte[] bArr = new byte[i7];
                    System.arraycopy(this.f891a.e(), 0, bArr, 0, 10);
                    interfaceC0315q.s(bArr, 10, F6);
                    xVar = new S1.h(aVar).e(bArr, i7);
                } else {
                    interfaceC0315q.j(F6);
                }
                i6 += i7;
            } catch (EOFException unused) {
            }
        }
        interfaceC0315q.o();
        interfaceC0315q.j(i6);
        return xVar;
    }
}
