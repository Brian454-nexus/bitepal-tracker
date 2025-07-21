package I;

import F.I0;
import F.InterfaceC0340l;
import F.InterfaceC0341m;
import java.util.Collection;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface E extends InterfaceC0340l, I0.d {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum a {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);


        /* renamed from: a, reason: collision with root package name */
        public final boolean f2246a;

        a(boolean z6) {
            this.f2246a = z6;
        }

        public boolean b() {
            return this.f2246a;
        }
    }

    @Override // F.InterfaceC0340l
    default InterfaceC0341m a() {
        return e();
    }

    @Override // F.InterfaceC0340l
    default F.r b() {
        return n();
    }

    default boolean d() {
        return b().g() == 0;
    }

    A e();

    default InterfaceC0459w g() {
        return AbstractC0465z.a();
    }

    default void h(boolean z6) {
    }

    void j(Collection collection);

    void k(Collection collection);

    default boolean m() {
        return true;
    }

    D n();

    default void o(InterfaceC0459w interfaceC0459w) {
    }
}
