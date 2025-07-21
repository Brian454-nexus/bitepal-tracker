package e0;

import I.T0;
import android.media.MediaFormat;
import android.util.Size;
import e0.C1221d;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class m0 implements InterfaceC1231n {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {
        public abstract m0 a();

        public abstract a b(int i6);

        public abstract a c(int i6);

        public abstract a d(n0 n0Var);

        public abstract a e(int i6);

        public abstract a f(int i6);

        public abstract a g(T0 t02);

        public abstract a h(String str);

        public abstract a i(int i6);

        public abstract a j(Size size);
    }

    public static a d() {
        return new C1221d.b().i(-1).f(1).c(2130708361).d(n0.f13771a);
    }

    @Override // e0.InterfaceC1231n
    public MediaFormat a() {
        Size k6 = k();
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(c(), k6.getWidth(), k6.getHeight());
        createVideoFormat.setInteger("color-format", f());
        createVideoFormat.setInteger("bitrate", e());
        createVideoFormat.setInteger("frame-rate", h());
        createVideoFormat.setInteger("i-frame-interval", i());
        if (j() != -1) {
            createVideoFormat.setInteger("profile", j());
        }
        n0 g6 = g();
        if (g6.c() != 0) {
            createVideoFormat.setInteger("color-standard", g6.c());
        }
        if (g6.d() != 0) {
            createVideoFormat.setInteger("color-transfer", g6.d());
        }
        if (g6.b() != 0) {
            createVideoFormat.setInteger("color-range", g6.b());
        }
        return createVideoFormat;
    }

    @Override // e0.InterfaceC1231n
    public abstract T0 b();

    @Override // e0.InterfaceC1231n
    public abstract String c();

    public abstract int e();

    public abstract int f();

    public abstract n0 g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract Size k();
}
