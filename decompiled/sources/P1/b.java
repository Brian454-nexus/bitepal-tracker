package P1;

import Z0.x;
import c1.AbstractC1119a;
import c1.C1144z;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b extends N1.c {
    @Override // N1.c
    public x b(N1.b bVar, ByteBuffer byteBuffer) {
        return new x(c(new C1144z(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(C1144z c1144z) {
        return new a((String) AbstractC1119a.e(c1144z.A()), (String) AbstractC1119a.e(c1144z.A()), c1144z.z(), c1144z.z(), Arrays.copyOfRange(c1144z.e(), c1144z.f(), c1144z.g()));
    }
}
