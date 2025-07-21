package I;

import I.P;

/* renamed from: I.w, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC0459w extends H0 {

    /* renamed from: a, reason: collision with root package name */
    public static final P.a f2566a = P.a.a("camerax.core.camera.useCaseConfigFactory", Z0.class);

    /* renamed from: b, reason: collision with root package name */
    public static final P.a f2567b = P.a.a("camerax.core.camera.compatibilityId", AbstractC0433i0.class);

    /* renamed from: c, reason: collision with root package name */
    public static final P.a f2568c = P.a.a("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);

    /* renamed from: d, reason: collision with root package name */
    public static final P.a f2569d = P.a.a("camerax.core.camera.SessionProcessor", M0.class);

    /* renamed from: e, reason: collision with root package name */
    public static final P.a f2570e = P.a.a("camerax.core.camera.isZslDisabled", Boolean.class);

    default int E() {
        return ((Integer) e(f2568c, 0)).intValue();
    }

    AbstractC0433i0 R();

    default Z0 j() {
        return (Z0) e(f2566a, Z0.f2402a);
    }

    default M0 k(M0 m02) {
        android.support.v4.media.session.b.a(e(f2569d, m02));
        return null;
    }
}
