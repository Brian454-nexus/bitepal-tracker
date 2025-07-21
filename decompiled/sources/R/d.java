package R;

import I.G0;
import java.nio.ByteBuffer;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final Q.e f4565a;

    public d(G0 g02) {
        this.f4565a = (Q.e) g02.b(Q.e.class);
    }

    public byte[] a(androidx.camera.core.d dVar) {
        Q.e eVar = this.f4565a;
        if (eVar != null) {
            return eVar.g(dVar);
        }
        ByteBuffer d6 = dVar.j()[0].d();
        byte[] bArr = new byte[d6.capacity()];
        d6.rewind();
        d6.get(bArr);
        return bArr;
    }
}
