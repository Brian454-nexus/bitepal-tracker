package s5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b extends c {
    public b(i iVar, d dVar, long j6, int i6) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(dVar.f18923a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j7 = j6 + (i6 * 16);
        this.f18921a = iVar.T(allocate, j7);
        this.f18922b = iVar.T(allocate, j7 + 8);
    }
}
