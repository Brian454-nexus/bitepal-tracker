package X;

import F.H0;
import I.B0;
import I.T0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface w0 {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum a {
        ACTIVE_STREAMING,
        ACTIVE_NON_STREAMING,
        INACTIVE
    }

    void a(H0 h02);

    default void b(H0 h02, T0 t02) {
        a(h02);
    }

    default B0 c() {
        return I.S.f(null);
    }

    default B0 d() {
        return b0.f5841c;
    }

    default void e(a aVar) {
    }

    default c0 f(F.r rVar) {
        return c0.f5855a;
    }
}
