package I;

import F.AbstractC0324d;
import I.P;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* renamed from: I.m0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC0441m0 extends H0 {

    /* renamed from: h, reason: collision with root package name */
    public static final P.a f2503h = P.a.a("camerax.core.imageOutput.targetAspectRatio", AbstractC0324d.class);

    /* renamed from: i, reason: collision with root package name */
    public static final P.a f2504i;

    /* renamed from: j, reason: collision with root package name */
    public static final P.a f2505j;

    /* renamed from: k, reason: collision with root package name */
    public static final P.a f2506k;

    /* renamed from: l, reason: collision with root package name */
    public static final P.a f2507l;

    /* renamed from: m, reason: collision with root package name */
    public static final P.a f2508m;

    /* renamed from: n, reason: collision with root package name */
    public static final P.a f2509n;

    /* renamed from: o, reason: collision with root package name */
    public static final P.a f2510o;

    /* renamed from: p, reason: collision with root package name */
    public static final P.a f2511p;

    /* renamed from: q, reason: collision with root package name */
    public static final P.a f2512q;

    /* renamed from: I.m0$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        Object a(Size size);

        Object d(int i6);
    }

    static {
        Class cls = Integer.TYPE;
        f2504i = P.a.a("camerax.core.imageOutput.targetRotation", cls);
        f2505j = P.a.a("camerax.core.imageOutput.appTargetRotation", cls);
        f2506k = P.a.a("camerax.core.imageOutput.mirrorMode", cls);
        f2507l = P.a.a("camerax.core.imageOutput.targetResolution", Size.class);
        f2508m = P.a.a("camerax.core.imageOutput.defaultResolution", Size.class);
        f2509n = P.a.a("camerax.core.imageOutput.maxResolution", Size.class);
        f2510o = P.a.a("camerax.core.imageOutput.supportedResolutions", List.class);
        f2511p = P.a.a("camerax.core.imageOutput.resolutionSelector", U.c.class);
        f2512q = P.a.a("camerax.core.imageOutput.customOrderedResolutions", List.class);
    }

    static void u(InterfaceC0441m0 interfaceC0441m0) {
        boolean L5 = interfaceC0441m0.L();
        boolean z6 = interfaceC0441m0.A(null) != null;
        if (L5 && z6) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (interfaceC0441m0.F(null) != null) {
            if (L5 || z6) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default Size A(Size size) {
        return (Size) e(f2507l, size);
    }

    default int B(int i6) {
        return ((Integer) e(f2505j, Integer.valueOf(i6))).intValue();
    }

    default U.c F(U.c cVar) {
        return (U.c) e(f2511p, cVar);
    }

    default boolean L() {
        return h(f2503h);
    }

    default int O() {
        return ((Integer) b(f2503h)).intValue();
    }

    default int V(int i6) {
        return ((Integer) e(f2504i, Integer.valueOf(i6))).intValue();
    }

    default int W(int i6) {
        return ((Integer) e(f2506k, Integer.valueOf(i6))).intValue();
    }

    default Size i(Size size) {
        return (Size) e(f2509n, size);
    }

    default List m(List list) {
        return (List) e(f2510o, list);
    }

    default U.c n() {
        return (U.c) b(f2511p);
    }

    default List p(List list) {
        List list2 = (List) e(f2512q, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    default Size w(Size size) {
        return (Size) e(f2508m, size);
    }
}
