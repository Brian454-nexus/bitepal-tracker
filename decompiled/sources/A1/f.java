package A1;

import Z0.y;
import c1.AbstractC1119a;
import e1.C1252j;
import java.util.regex.Pattern;
import z1.x;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class f {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final Pattern f90a = Pattern.compile(".*-.*");

        public static String b(x xVar) {
            AbstractC1119a.a(xVar != null);
            int k6 = y.k(xVar.n().f6990n);
            if (k6 == -1) {
                k6 = y.k(xVar.n().f6989m);
            }
            if (k6 == 1) {
                return "a";
            }
            if (k6 == 2) {
                return "v";
            }
            return null;
        }

        public abstract f a();

        public abstract a c(long j6);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);
    }

    public abstract C1252j a(C1252j c1252j);
}
