package s5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a extends c {
    public a(i iVar, d dVar, long j6, int i6) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(dVar.f18923a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j7 = j6 + (i6 * 8);
        this.f18921a = iVar.a0(allocate, j7);
        this.f18922b = iVar.a0(allocate, j7 + 4);
    }
}
