package O;

import I.H0;
import I.P;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface j extends H0 {

    /* renamed from: C, reason: collision with root package name */
    public static final P.a f3871C = P.a.a("camerax.core.target.name", String.class);

    /* renamed from: D, reason: collision with root package name */
    public static final P.a f3872D = P.a.a("camerax.core.target.class", Class.class);

    default String C(String str) {
        return (String) e(f3871C, str);
    }

    default String K() {
        return (String) b(f3871C);
    }
}
