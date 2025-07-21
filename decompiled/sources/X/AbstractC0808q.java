package X;

import X.C0798g;
import X.y0;
import java.util.Objects;
import y0.InterfaceC2343a;

/* renamed from: X.q, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0808q {

    /* renamed from: X.q$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {
        public abstract AbstractC0808q a();

        public a b(InterfaceC2343a interfaceC2343a) {
            y0.a f6 = c().f();
            interfaceC2343a.accept(f6);
            f(f6.a());
            return this;
        }

        public abstract y0 c();

        public abstract a d(AbstractC0792a abstractC0792a);

        public abstract a e(int i6);

        public abstract a f(y0 y0Var);
    }

    public static a a() {
        return new C0798g.b().e(-1).d(AbstractC0792a.a().a()).f(y0.a().a());
    }

    public static String e(int i6) {
        return i6 != 1 ? "audio/mp4a-latm" : "audio/vorbis";
    }

    public static int f(int i6) {
        return Objects.equals(e(i6), "audio/mp4a-latm") ? 2 : -1;
    }

    public static int g(int i6) {
        return i6 != 1 ? 0 : 1;
    }

    public static String h(int i6) {
        return i6 != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
    }

    public abstract AbstractC0792a b();

    public abstract int c();

    public abstract y0 d();

    public abstract a i();
}
