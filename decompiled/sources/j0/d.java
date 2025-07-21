package j0;

import java.util.ConcurrentModificationException;
import k0.AbstractC1654a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class d {
    public static final void a(C1639b c1639b, int i6) {
        Intrinsics.checkNotNullParameter(c1639b, "<this>");
        c1639b.m(new int[i6]);
        c1639b.l(new Object[i6]);
    }

    public static final int b(C1639b c1639b, int i6) {
        Intrinsics.checkNotNullParameter(c1639b, "<this>");
        try {
            return AbstractC1654a.a(c1639b.c(), c1639b.i(), i6);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int c(C1639b c1639b, Object obj, int i6) {
        Intrinsics.checkNotNullParameter(c1639b, "<this>");
        int i7 = c1639b.i();
        if (i7 == 0) {
            return -1;
        }
        int b6 = b(c1639b, i6);
        if (b6 < 0 || Intrinsics.areEqual(obj, c1639b.b()[b6])) {
            return b6;
        }
        int i8 = b6 + 1;
        while (i8 < i7 && c1639b.c()[i8] == i6) {
            if (Intrinsics.areEqual(obj, c1639b.b()[i8])) {
                return i8;
            }
            i8++;
        }
        for (int i9 = b6 - 1; i9 >= 0 && c1639b.c()[i9] == i6; i9--) {
            if (Intrinsics.areEqual(obj, c1639b.b()[i9])) {
                return i9;
            }
        }
        return ~i8;
    }

    public static final int d(C1639b c1639b) {
        Intrinsics.checkNotNullParameter(c1639b, "<this>");
        return c(c1639b, null, 0);
    }
}
