package s1;

import Z0.z;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s1.C2041a;
import s1.w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f18867a = Pattern.compile("([a-z])=\\s?(.+)");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f18868b = Pattern.compile("^([a-z])=$");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f18869c = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f18870d = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    public static void a(w.b bVar, C2041a.b bVar2) {
        try {
            bVar.n(bVar2.j());
        } catch (IllegalArgumentException | IllegalStateException e6) {
            throw z.c(null, e6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e9, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static s1.w b(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.x.b(java.lang.String):s1.w");
    }

    public static C2041a.b c(String str) {
        Matcher matcher = f18870d.matcher(str);
        if (!matcher.matches()) {
            throw z.c("Malformed SDP media description line: " + str, null);
        }
        try {
            return new C2041a.b((String) AbstractC1119a.e(matcher.group(1)), Integer.parseInt((String) AbstractC1119a.e(matcher.group(2))), (String) AbstractC1119a.e(matcher.group(3)), Integer.parseInt((String) AbstractC1119a.e(matcher.group(4))));
        } catch (NumberFormatException e6) {
            AbstractC1133o.i("SDPParser", "Malformed SDP media description line: " + str, e6);
            return null;
        }
    }
}
