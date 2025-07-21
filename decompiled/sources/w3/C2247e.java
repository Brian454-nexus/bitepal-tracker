package w3;

import J3.l;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: w3.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2247e {

    /* renamed from: a, reason: collision with root package name */
    public static final C2247e f20161a = new C2247e();

    /* renamed from: b, reason: collision with root package name */
    public static final B3.g f20162b = new C2243a();

    /* renamed from: c, reason: collision with root package name */
    public static final l f20163c = new J3.b();

    /* renamed from: d, reason: collision with root package name */
    public static final B3.g f20164d = new C2244b();

    public final File a(o3.c configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new File(configuration.L(), "events");
    }

    public final B3.g b() {
        return f20162b;
    }

    public final File c(o3.c configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new File(configuration.L(), "identify-intercept");
    }

    public final B3.g d() {
        return f20164d;
    }

    public final File e(o3.c configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return configuration.L();
    }

    public final String f() {
        return "identity";
    }

    public final l g() {
        return f20163c;
    }
}
