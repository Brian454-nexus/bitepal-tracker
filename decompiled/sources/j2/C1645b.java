package j2;

import android.text.TextUtils;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1123e;
import c1.AbstractC1133o;
import c1.C1144z;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: j2.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1645b {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f16145c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f16146d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final C1144z f16147a = new C1144z();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f16148b = new StringBuilder();

    public static boolean b(C1144z c1144z) {
        int f6 = c1144z.f();
        int g6 = c1144z.g();
        byte[] e6 = c1144z.e();
        if (f6 + 2 > g6) {
            return false;
        }
        int i6 = f6 + 1;
        if (e6[f6] != 47) {
            return false;
        }
        int i7 = f6 + 2;
        if (e6[i6] != 42) {
            return false;
        }
        while (true) {
            int i8 = i7 + 1;
            if (i8 >= g6) {
                c1144z.U(g6 - c1144z.f());
                return true;
            }
            if (((char) e6[i7]) == '*' && ((char) e6[i8]) == '/') {
                i7 += 2;
                g6 = i7;
            } else {
                i7 = i8;
            }
        }
    }

    public static boolean c(C1144z c1144z) {
        char k6 = k(c1144z, c1144z.f());
        if (k6 != '\t' && k6 != '\n' && k6 != '\f' && k6 != '\r' && k6 != ' ') {
            return false;
        }
        c1144z.U(1);
        return true;
    }

    public static void e(String str, C1646c c1646c) {
        Matcher matcher = f16146d.matcher(y6.c.e(str));
        if (!matcher.matches()) {
            AbstractC1133o.h("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) AbstractC1119a.e(matcher.group(2));
        str2.getClass();
        char c6 = 65535;
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals("%")) {
                    c6 = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals("em")) {
                    c6 = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c6 = 2;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                c1646c.t(3);
                break;
            case 1:
                c1646c.t(2);
                break;
            case 2:
                c1646c.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        c1646c.s(Float.parseFloat((String) AbstractC1119a.e(matcher.group(1))));
    }

    public static String f(C1144z c1144z, StringBuilder sb) {
        boolean z6 = false;
        sb.setLength(0);
        int f6 = c1144z.f();
        int g6 = c1144z.g();
        while (f6 < g6 && !z6) {
            char c6 = (char) c1144z.e()[f6];
            if ((c6 < 'A' || c6 > 'Z') && ((c6 < 'a' || c6 > 'z') && !((c6 >= '0' && c6 <= '9') || c6 == '#' || c6 == '-' || c6 == '.' || c6 == '_'))) {
                z6 = true;
            } else {
                f6++;
                sb.append(c6);
            }
        }
        c1144z.U(f6 - c1144z.f());
        return sb.toString();
    }

    public static String g(C1144z c1144z, StringBuilder sb) {
        n(c1144z);
        if (c1144z.a() == 0) {
            return null;
        }
        String f6 = f(c1144z, sb);
        if (!"".equals(f6)) {
            return f6;
        }
        return "" + ((char) c1144z.G());
    }

    public static String h(C1144z c1144z, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z6 = false;
        while (!z6) {
            int f6 = c1144z.f();
            String g6 = g(c1144z, sb);
            if (g6 == null) {
                return null;
            }
            if ("}".equals(g6) || ";".equals(g6)) {
                c1144z.T(f6);
                z6 = true;
            } else {
                sb2.append(g6);
            }
        }
        return sb2.toString();
    }

    public static String i(C1144z c1144z, StringBuilder sb) {
        n(c1144z);
        if (c1144z.a() < 5 || !"::cue".equals(c1144z.D(5))) {
            return null;
        }
        int f6 = c1144z.f();
        String g6 = g(c1144z, sb);
        if (g6 == null) {
            return null;
        }
        if ("{".equals(g6)) {
            c1144z.T(f6);
            return "";
        }
        String l6 = "(".equals(g6) ? l(c1144z) : null;
        if (")".equals(g(c1144z, sb))) {
            return l6;
        }
        return null;
    }

    public static void j(C1144z c1144z, C1646c c1646c, StringBuilder sb) {
        n(c1144z);
        String f6 = f(c1144z, sb);
        if (!"".equals(f6) && ":".equals(g(c1144z, sb))) {
            n(c1144z);
            String h6 = h(c1144z, sb);
            if (h6 == null || "".equals(h6)) {
                return;
            }
            int f7 = c1144z.f();
            String g6 = g(c1144z, sb);
            if (!";".equals(g6)) {
                if (!"}".equals(g6)) {
                    return;
                } else {
                    c1144z.T(f7);
                }
            }
            if ("color".equals(f6)) {
                c1646c.q(AbstractC1123e.b(h6));
                return;
            }
            if ("background-color".equals(f6)) {
                c1646c.n(AbstractC1123e.b(h6));
                return;
            }
            boolean z6 = true;
            if ("ruby-position".equals(f6)) {
                if ("over".equals(h6)) {
                    c1646c.v(1);
                    return;
                } else {
                    if ("under".equals(h6)) {
                        c1646c.v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(f6)) {
                if (!"all".equals(h6) && !h6.startsWith("digits")) {
                    z6 = false;
                }
                c1646c.p(z6);
                return;
            }
            if ("text-decoration".equals(f6)) {
                if ("underline".equals(h6)) {
                    c1646c.A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(f6)) {
                c1646c.r(h6);
                return;
            }
            if ("font-weight".equals(f6)) {
                if ("bold".equals(h6)) {
                    c1646c.o(true);
                }
            } else if ("font-style".equals(f6)) {
                if ("italic".equals(h6)) {
                    c1646c.u(true);
                }
            } else if ("font-size".equals(f6)) {
                e(h6, c1646c);
            }
        }
    }

    public static char k(C1144z c1144z, int i6) {
        return (char) c1144z.e()[i6];
    }

    public static String l(C1144z c1144z) {
        int f6 = c1144z.f();
        int g6 = c1144z.g();
        boolean z6 = false;
        while (f6 < g6 && !z6) {
            int i6 = f6 + 1;
            z6 = ((char) c1144z.e()[f6]) == ')';
            f6 = i6;
        }
        return c1144z.D((f6 - 1) - c1144z.f()).trim();
    }

    public static void m(C1144z c1144z) {
        do {
        } while (!TextUtils.isEmpty(c1144z.r()));
    }

    public static void n(C1144z c1144z) {
        while (true) {
            for (boolean z6 = true; c1144z.a() > 0 && z6; z6 = false) {
                if (!c(c1144z) && !b(c1144z)) {
                }
            }
            return;
        }
    }

    public final void a(C1646c c1646c, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = f16145c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                c1646c.z((String) AbstractC1119a.e(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] d12 = AbstractC1117K.d1(str, "\\.");
        String str2 = d12[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            c1646c.y(str2.substring(0, indexOf2));
            c1646c.x(str2.substring(indexOf2 + 1));
        } else {
            c1646c.y(str2);
        }
        if (d12.length > 1) {
            c1646c.w((String[]) AbstractC1117K.P0(d12, 1, d12.length));
        }
    }

    public List d(C1144z c1144z) {
        this.f16148b.setLength(0);
        int f6 = c1144z.f();
        m(c1144z);
        this.f16147a.R(c1144z.e(), c1144z.f());
        this.f16147a.T(f6);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String i6 = i(this.f16147a, this.f16148b);
            if (i6 == null || !"{".equals(g(this.f16147a, this.f16148b))) {
                break;
            }
            C1646c c1646c = new C1646c();
            a(c1646c, i6);
            String str = null;
            boolean z6 = false;
            while (!z6) {
                int f7 = this.f16147a.f();
                String g6 = g(this.f16147a, this.f16148b);
                boolean z7 = g6 == null || "}".equals(g6);
                if (!z7) {
                    this.f16147a.T(f7);
                    j(this.f16147a, c1646c, this.f16148b);
                }
                str = g6;
                z6 = z7;
            }
            if ("}".equals(str)) {
                arrayList.add(c1646c);
            }
        }
        return arrayList;
    }
}
