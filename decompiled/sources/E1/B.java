package E1;

import Z0.x;
import c1.AbstractC1117K;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class B {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f876c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f877a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f878b = -1;

    public boolean a() {
        return (this.f877a == -1 || this.f878b == -1) ? false : true;
    }

    public final boolean b(String str) {
        Matcher matcher = f876c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) AbstractC1117K.i(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) AbstractC1117K.i(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f877a = parseInt;
            this.f878b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean c(Z0.x xVar) {
        for (int i6 = 0; i6 < xVar.f(); i6++) {
            x.b e6 = xVar.e(i6);
            if (e6 instanceof S1.e) {
                S1.e eVar = (S1.e) e6;
                if ("iTunSMPB".equals(eVar.f4663c) && b(eVar.f4664d)) {
                    return true;
                }
            } else if (e6 instanceof S1.k) {
                S1.k kVar = (S1.k) e6;
                if ("com.apple.iTunes".equals(kVar.f4676b) && "iTunSMPB".equals(kVar.f4677c) && b(kVar.f4678d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
