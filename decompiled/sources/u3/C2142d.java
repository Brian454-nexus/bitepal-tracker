package u3;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u3.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2142d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2142d f19187a = new C2142d();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f19188b = new LinkedHashMap();

    public final String a(String str) {
        String str2;
        if (str != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            str2 = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
        } else {
            str2 = null;
        }
        if (str2 == null || str2.length() == 0 || Intrinsics.areEqual(str2, "$default_instance")) {
            return "com.amplitude.api";
        }
        return "com.amplitude.api_" + str2;
    }

    public final C2141c b(B3.a amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        B3.b m6 = amplitude.m();
        Intrinsics.checkNotNull(m6, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        o3.c cVar = (o3.c) m6;
        String a6 = a(cVar.l());
        Map map = f19188b;
        C2141c c2141c = (C2141c) map.get(a6);
        if (c2141c != null) {
            return c2141c;
        }
        C2141c c2141c2 = new C2141c(cVar.C(), a6, cVar.m().a(amplitude));
        map.put(a6, c2141c2);
        return c2141c2;
    }
}
