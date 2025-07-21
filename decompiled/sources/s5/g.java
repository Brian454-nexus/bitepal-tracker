package s5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class g extends d {

    /* renamed from: j, reason: collision with root package name */
    public final i f18937j;

    public g(boolean z6, i iVar) {
        this.f18923a = z6;
        this.f18937j = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(z6 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f18924b = iVar.R(allocate, 16L);
        this.f18925c = iVar.a0(allocate, 28L);
        this.f18926d = iVar.a0(allocate, 32L);
        this.f18927e = iVar.R(allocate, 42L);
        this.f18928f = iVar.R(allocate, 44L);
        this.f18929g = iVar.R(allocate, 46L);
        this.f18930h = iVar.R(allocate, 48L);
        this.f18931i = iVar.R(allocate, 50L);
    }

    @Override // s5.d
    public c a(long j6, int i6) {
        return new a(this.f18937j, this, j6, i6);
    }

    @Override // s5.d
    public e b(long j6) {
        return new j(this.f18937j, this, j6);
    }

    @Override // s5.d
    public f c(int i6) {
        return new l(this.f18937j, this, i6);
    }
}
