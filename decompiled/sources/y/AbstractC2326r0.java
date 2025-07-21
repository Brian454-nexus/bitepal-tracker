package y;

import F.C0348u;
import z.C2375g;

/* renamed from: y.r0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2326r0 {
    public static C0348u a(C2375g c2375g) {
        int d6 = c2375g.d();
        int i6 = 1;
        if (d6 != 1) {
            i6 = 2;
            if (d6 != 2) {
                i6 = 3;
                if (d6 != 3) {
                    i6 = 4;
                    if (d6 != 4) {
                        i6 = 5;
                        if (d6 != 5) {
                            i6 = d6 != 10001 ? 0 : 6;
                        }
                    }
                }
            }
        }
        return new C0348u(i6, c2375g);
    }
}
