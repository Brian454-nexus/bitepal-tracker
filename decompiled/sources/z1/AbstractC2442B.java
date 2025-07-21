package z1;

import A1.k;
import Z0.H;
import Z0.J;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import w1.l0;
import z1.z;
import z6.w;

/* renamed from: z1.B, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2442B {
    public static J a(z.a aVar, List[] listArr) {
        boolean z6;
        w.a aVar2 = new w.a();
        for (int i6 = 0; i6 < aVar.d(); i6++) {
            l0 f6 = aVar.f(i6);
            List list = listArr[i6];
            for (int i7 = 0; i7 < f6.f20070a; i7++) {
                H b6 = f6.b(i7);
                boolean z7 = aVar.a(i6, i7, false) != 0;
                int i8 = b6.f6702a;
                int[] iArr = new int[i8];
                boolean[] zArr = new boolean[i8];
                for (int i9 = 0; i9 < b6.f6702a; i9++) {
                    iArr[i9] = aVar.g(i6, i7, i9);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            z6 = false;
                            break;
                        }
                        InterfaceC2441A interfaceC2441A = (InterfaceC2441A) list.get(i10);
                        if (interfaceC2441A.e().equals(b6) && interfaceC2441A.u(i9) != -1) {
                            z6 = true;
                            break;
                        }
                        i10++;
                    }
                    zArr[i9] = z6;
                }
                aVar2.h(new J.a(b6, z7, iArr, zArr));
            }
        }
        l0 h6 = aVar.h();
        for (int i11 = 0; i11 < h6.f20070a; i11++) {
            H b7 = h6.b(i11);
            int[] iArr2 = new int[b7.f6702a];
            Arrays.fill(iArr2, 0);
            aVar2.h(new J.a(b7, false, iArr2, new boolean[b7.f6702a]));
        }
        return new J(aVar2.k());
    }

    public static J b(z.a aVar, InterfaceC2441A[] interfaceC2441AArr) {
        List[] listArr = new List[interfaceC2441AArr.length];
        for (int i6 = 0; i6 < interfaceC2441AArr.length; i6++) {
            InterfaceC2441A interfaceC2441A = interfaceC2441AArr[i6];
            listArr[i6] = interfaceC2441A != null ? z6.w.y(interfaceC2441A) : z6.w.w();
        }
        return a(aVar, listArr);
    }

    public static k.a c(x xVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = xVar.length();
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            if (xVar.b(i7, elapsedRealtime)) {
                i6++;
            }
        }
        return new k.a(1, 0, length, i6);
    }
}
