package s5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class h extends d {

    /* renamed from: j, reason: collision with root package name */
    public final i f18938j;

    public h(boolean z6, i iVar) {
        this.f18923a = z6;
        this.f18938j = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(z6 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f18924b = iVar.R(allocate, 16L);
        this.f18925c = iVar.T(allocate, 32L);
        this.f18926d = iVar.T(allocate, 40L);
        this.f18927e = iVar.R(allocate, 54L);
        this.f18928f = iVar.R(allocate, 56L);
        this.f18929g = iVar.R(allocate, 58L);
        this.f18930h = iVar.R(allocate, 60L);
        this.f18931i = iVar.R(allocate, 62L);
    }

    @Override // s5.d
    public c a(long j6, int i6) {
        return new b(this.f18938j, this, j6, i6);
    }

    @Override // s5.d
    public e b(long j6) {
        return new k(this.f18938j, this, j6);
    }

    @Override // s5.d
    public f c(int i6) {
        return new m(this.f18938j, this, i6);
    }
}
