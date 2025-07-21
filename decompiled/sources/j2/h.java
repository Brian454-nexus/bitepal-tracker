package j2;

import Z0.z;
import c1.AbstractC1117K;
import c1.C1144z;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f16195a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(C1144z c1144z) {
        String r6;
        while (true) {
            String r7 = c1144z.r();
            if (r7 == null) {
                return null;
            }
            if (f16195a.matcher(r7).matches()) {
                do {
                    r6 = c1144z.r();
                    if (r6 != null) {
                    }
                } while (!r6.isEmpty());
            } else {
                Matcher matcher = e.f16169a.matcher(r7);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(C1144z c1144z) {
        String r6 = c1144z.r();
        return r6 != null && r6.startsWith("WEBVTT");
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] e12 = AbstractC1117K.e1(str, "\\.");
        long j6 = 0;
        for (String str2 : AbstractC1117K.d1(e12[0], ":")) {
            j6 = (j6 * 60) + Long.parseLong(str2);
        }
        long j7 = j6 * 1000;
        if (e12.length == 2) {
            j7 += Long.parseLong(e12[1]);
        }
        return j7 * 1000;
    }

    public static void e(C1144z c1144z) {
        int f6 = c1144z.f();
        if (b(c1144z)) {
            return;
        }
        c1144z.T(f6);
        throw z.a("Expected WEBVTT. Got " + c1144z.r(), null);
    }
}
