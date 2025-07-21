package v0;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2159a {

    /* renamed from: a, reason: collision with root package name */
    public static final C2159a f19274a = new C2159a();

    /* renamed from: b, reason: collision with root package name */
    public static final int f19275b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f19276c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f19277d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f19278e;

    /* renamed from: v0.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0254a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0254a f19279a = new C0254a();

        public final int a(int i6) {
            return SdkExtensions.getExtensionVersion(i6);
        }
    }

    static {
        int i6 = Build.VERSION.SDK_INT;
        f19275b = i6 >= 30 ? C0254a.f19279a.a(30) : 0;
        f19276c = i6 >= 30 ? C0254a.f19279a.a(31) : 0;
        f19277d = i6 >= 30 ? C0254a.f19279a.a(33) : 0;
        f19278e = i6 >= 30 ? C0254a.f19279a.a(1000000) : 0;
    }

    public static final boolean a(String codename, String buildCodename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
        if (Intrinsics.areEqual("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 35) {
            return true;
        }
        if (i6 < 34) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return a("VanillaIceCream", CODENAME);
    }
}
