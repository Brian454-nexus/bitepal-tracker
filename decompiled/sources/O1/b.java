package O1;

import N1.c;
import Z0.x;
import c1.C1143y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import y6.e;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b extends c {
    public static x c(C1143y c1143y) {
        c1143y.r(12);
        int d6 = (c1143y.d() + c1143y.h(12)) - 4;
        c1143y.r(44);
        c1143y.s(c1143y.h(12));
        c1143y.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (c1143y.d() >= d6) {
                break;
            }
            c1143y.r(48);
            int h6 = c1143y.h(8);
            c1143y.r(4);
            int d7 = c1143y.d() + c1143y.h(12);
            String str2 = null;
            while (c1143y.d() < d7) {
                int h7 = c1143y.h(8);
                int h8 = c1143y.h(8);
                int d8 = c1143y.d() + h8;
                if (h7 == 2) {
                    int h9 = c1143y.h(16);
                    c1143y.r(8);
                    if (h9 != 3) {
                    }
                    while (c1143y.d() < d8) {
                        str = c1143y.l(c1143y.h(8), e.a);
                        int h10 = c1143y.h(8);
                        for (int i6 = 0; i6 < h10; i6++) {
                            c1143y.s(c1143y.h(8));
                        }
                    }
                } else if (h7 == 21) {
                    str2 = c1143y.l(h8, e.a);
                }
                c1143y.p(d8 * 8);
            }
            c1143y.p(d7 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new a(h6, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new x(arrayList);
    }

    @Override // N1.c
    public x b(N1.b bVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new C1143y(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
