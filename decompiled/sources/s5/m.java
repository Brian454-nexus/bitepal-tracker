package s5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class m extends f {
    public m(i iVar, d dVar, int i6) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(dVar.f18923a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f18936a = iVar.a0(allocate, dVar.f18926d + (i6 * dVar.f18929g) + 44);
    }
}
