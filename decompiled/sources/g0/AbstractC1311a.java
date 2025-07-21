package g0;

import android.util.Pair;
import c0.AbstractC1104f;
import c0.o;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1311a {
    public static Pair a(double d6, double d7) {
        if (AbstractC1104f.a(o.class) != null) {
            d6 = b(d6);
            d7 = b(d7);
        }
        return Pair.create(Double.valueOf(d6), Double.valueOf(d7));
    }

    public static double b(double d6) {
        return d6 >= 0.0d ? d6 : ((d6 * 10000.0d) - 1.0d) / 10000.0d;
    }
}
