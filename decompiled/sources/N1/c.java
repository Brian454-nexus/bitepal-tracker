package N1;

import Z0.x;
import c1.AbstractC1119a;
import java.nio.ByteBuffer;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class c implements a {
    @Override // N1.a
    public final x a(b bVar) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC1119a.e(bVar.f14005d);
        AbstractC1119a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(bVar, byteBuffer);
    }

    public abstract x b(b bVar, ByteBuffer byteBuffer);
}
