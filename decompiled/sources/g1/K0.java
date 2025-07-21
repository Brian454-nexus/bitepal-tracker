package g1;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface K0 {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(J0 j02);
    }

    static int D(int i6) {
        return i6 & 24;
    }

    static int E(int i6) {
        return x(i6, 0, 0, 0);
    }

    static int M(int i6) {
        return i6 & 3584;
    }

    static int T(int i6) {
        return i6 & 7;
    }

    static int o(int i6, int i7, int i8, int i9, int i10, int i11) {
        return i6 | i7 | i8 | i9 | i10 | i11;
    }

    static int q(int i6) {
        return i6 & 384;
    }

    static boolean s(int i6, boolean z6) {
        int T5 = T(i6);
        if (T5 != 4) {
            return z6 && T5 == 3;
        }
        return true;
    }

    static int v(int i6, int i7, int i8, int i9, int i10) {
        return o(i6, i7, i8, i9, i10, 0);
    }

    static int w(int i6) {
        return i6 & 64;
    }

    static int x(int i6, int i7, int i8, int i9) {
        return o(i6, i7, i8, 0, 128, i9);
    }

    static int y(int i6) {
        return i6 & 32;
    }

    int G();

    void I(a aVar);

    int b(Z0.q qVar);

    String getName();

    int l();

    void n();
}
