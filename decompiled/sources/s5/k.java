package s5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class k extends e {
    public k(i iVar, d dVar, long j6) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(dVar.f18923a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j7 = dVar.f18925c + (j6 * dVar.f18927e);
        this.f18932a = iVar.a0(allocate, j7);
        this.f18933b = iVar.T(allocate, 8 + j7);
        this.f18934c = iVar.T(allocate, 16 + j7);
        this.f18935d = iVar.T(allocate, j7 + 40);
    }
}
