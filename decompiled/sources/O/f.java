package O;

import F.K0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class f implements K0 {
    public static K0 e(float f6, float f7, float f8, float f9) {
        return new a(f6, f7, f8, f9);
    }

    public static K0 f(K0 k02) {
        return new a(k02.c(), k02.a(), k02.b(), k02.d());
    }

    @Override // F.K0
    public abstract float a();

    @Override // F.K0
    public abstract float b();

    @Override // F.K0
    public abstract float c();

    @Override // F.K0
    public abstract float d();
}
