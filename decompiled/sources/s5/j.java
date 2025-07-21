package s5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class j extends e {
    public j(i iVar, d dVar, long j6) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(dVar.f18923a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j7 = dVar.f18925c + (j6 * dVar.f18927e);
        this.f18932a = iVar.a0(allocate, j7);
        this.f18933b = iVar.a0(allocate, 4 + j7);
        this.f18934c = iVar.a0(allocate, 8 + j7);
        this.f18935d = iVar.a0(allocate, j7 + 20);
    }
}
