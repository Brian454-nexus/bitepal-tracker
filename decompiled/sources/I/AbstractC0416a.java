package I;

import I.O0;
import android.util.Range;
import android.util.Size;
import java.util.List;

/* renamed from: I.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0416a {
    public static AbstractC0416a a(Q0 q02, int i6, Size size, F.C c6, List list, P p6, Range range) {
        return new C0418b(q02, i6, size, c6, list, p6, range);
    }

    public abstract List b();

    public abstract F.C c();

    public abstract int d();

    public abstract P e();

    public abstract Size f();

    public abstract Q0 g();

    public abstract Range h();

    public O0 i(P p6) {
        O0.a d6 = O0.a(f()).b(c()).d(p6);
        if (h() != null) {
            d6.c(h());
        }
        return d6.a();
    }
}
