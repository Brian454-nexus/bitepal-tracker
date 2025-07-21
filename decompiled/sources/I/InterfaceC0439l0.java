package I;

import I.P;

/* renamed from: I.l0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC0439l0 extends H0 {

    /* renamed from: f, reason: collision with root package name */
    public static final P.a f2494f = P.a.a("camerax.core.imageInput.inputFormat", Integer.TYPE);

    /* renamed from: g, reason: collision with root package name */
    public static final P.a f2495g = P.a.a("camerax.core.imageInput.inputDynamicRange", F.C.class);

    default F.C l() {
        return (F.C) y0.g.f((F.C) e(f2495g, F.C.f1235c));
    }

    default int q() {
        return ((Integer) b(f2494f)).intValue();
    }

    default boolean v() {
        return h(f2495g);
    }
}
