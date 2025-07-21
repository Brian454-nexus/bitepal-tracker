package b2;

import c1.InterfaceC1125g;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class i {
    public static int a(k kVar, long j6) {
        if (j6 == -9223372036854775807L) {
            return 0;
        }
        int a6 = kVar.a(j6);
        if (a6 == -1) {
            a6 = kVar.d();
        }
        return (a6 <= 0 || kVar.b(a6 + (-1)) != j6) ? a6 : a6 - 1;
    }

    public static void b(k kVar, int i6, InterfaceC1125g interfaceC1125g) {
        long b6 = kVar.b(i6);
        List c6 = kVar.c(b6);
        if (c6.isEmpty()) {
            return;
        }
        if (i6 == kVar.d() - 1) {
            throw new IllegalStateException();
        }
        long b7 = kVar.b(i6 + 1) - kVar.b(i6);
        if (b7 > 0) {
            interfaceC1125g.accept(new C1081e(c6, b6, b7));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042 A[LOOP:0: B:11:0x003c->B:13:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(b2.k r11, b2.s.b r12, c1.InterfaceC1125g r13) {
        /*
            long r0 = r12.f10493a
            int r0 = a(r11, r0)
            long r1 = r12.f10493a
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L3a
            int r1 = r11.d()
            if (r0 >= r1) goto L3a
            long r3 = r12.f10493a
            java.util.List r6 = r11.c(r3)
            long r3 = r11.b(r0)
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L3a
            long r7 = r12.f10493a
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 >= 0) goto L3a
            b2.e r5 = new b2.e
            long r9 = r3 - r7
            r5.<init>(r6, r7, r9)
            r13.accept(r5)
            r1 = 1
            goto L3b
        L3a:
            r1 = r2
        L3b:
            r3 = r0
        L3c:
            int r4 = r11.d()
            if (r3 >= r4) goto L48
            b(r11, r3, r13)
            int r3 = r3 + 1
            goto L3c
        L48:
            boolean r3 = r12.f10494b
            if (r3 == 0) goto L74
            if (r1 == 0) goto L50
            int r0 = r0 + (-1)
        L50:
            if (r2 >= r0) goto L58
            b(r11, r2, r13)
            int r2 = r2 + 1
            goto L50
        L58:
            if (r1 == 0) goto L74
            b2.e r3 = new b2.e
            long r1 = r12.f10493a
            java.util.List r4 = r11.c(r1)
            long r5 = r11.b(r0)
            long r1 = r12.f10493a
            long r11 = r11.b(r0)
            long r7 = r1 - r11
            r3.<init>(r4, r5, r7)
            r13.accept(r3)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.i.c(b2.k, b2.s$b, c1.g):void");
    }
}
