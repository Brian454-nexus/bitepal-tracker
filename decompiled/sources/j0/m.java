package j0;

import k0.AbstractC1654a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f16127a = new Object();

    public static final Object c(l lVar, int i6) {
        Object obj;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        int a6 = AbstractC1654a.a(lVar.f16124b, lVar.f16126d, i6);
        if (a6 < 0 || (obj = lVar.f16125c[a6]) == f16127a) {
            return null;
        }
        return obj;
    }

    public static final void d(l lVar) {
        int i6 = lVar.f16126d;
        int[] iArr = lVar.f16124b;
        Object[] objArr = lVar.f16125c;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            Object obj = objArr[i8];
            if (obj != f16127a) {
                if (i8 != i7) {
                    iArr[i7] = iArr[i8];
                    objArr[i7] = obj;
                    objArr[i8] = null;
                }
                i7++;
            }
        }
        lVar.f16123a = false;
        lVar.f16126d = i7;
    }
}
