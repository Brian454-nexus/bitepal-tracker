package androidx.media3.exoplayer.rtsp;

import Z0.z;
import android.net.Uri;
import androidx.media3.exoplayer.rtsp.e;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s1.s;
import s1.t;
import z6.g0;
import z6.w;
import z6.x;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f9404a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f9405b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f9406c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f9407d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f9408e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f9409f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* renamed from: g, reason: collision with root package name */
    public static final String f9410g = new String(new byte[]{10});

    /* renamed from: h, reason: collision with root package name */
    public static final String f9411h = new String(new byte[]{13, 10});

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f9412a;

        /* renamed from: b, reason: collision with root package name */
        public final String f9413b;

        public a(String str, String str2) {
            this.f9412a = str;
            this.f9413b = str2;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f9414a;

        /* renamed from: b, reason: collision with root package name */
        public final long f9415b;

        public b(String str, long j6) {
            this.f9414a = str;
            this.f9415b = j6;
        }
    }

    public static void a(boolean z6, String str) {
        if (!z6) {
            throw z.c(str, null);
        }
    }

    public static byte[] b(List list) {
        return y6.h.g(f9411h).d(list).getBytes(g.f9385g);
    }

    public static String c(int i6) {
        if (i6 == 200) {
            return "OK";
        }
        if (i6 == 461) {
            return "Unsupported Transport";
        }
        if (i6 == 500) {
            return "Internal Server Error";
        }
        if (i6 == 505) {
            return "RTSP Version Not Supported";
        }
        if (i6 == 301) {
            return "Move Permanently";
        }
        if (i6 == 302) {
            return "Move Temporarily";
        }
        if (i6 == 400) {
            return "Bad Request";
        }
        if (i6 == 401) {
            return "Unauthorized";
        }
        if (i6 == 404) {
            return "Not Found";
        }
        if (i6 == 405) {
            return "Method Not Allowed";
        }
        switch (i6) {
            case 454:
                return "Session Not Found";
            case 455:
                return "Method Not Valid In This State";
            case 456:
                return "Header Field Not Valid";
            case 457:
                return "Invalid Range";
            default:
                throw new IllegalArgumentException();
        }
    }

    public static byte[] d(String str) {
        return str.getBytes(g.f9385g);
    }

    public static boolean e(List list) {
        return f9405b.matcher((CharSequence) list.get(0)).matches();
    }

    public static boolean f(String str) {
        return f9404a.matcher(str).matches() || f9405b.matcher(str).matches();
    }

    public static long g(String str) {
        try {
            Matcher matcher = f9406c.matcher(str);
            if (matcher.find()) {
                return Long.parseLong((String) AbstractC1119a.e(matcher.group(1)));
            }
            return -1L;
        } catch (NumberFormatException e6) {
            throw z.c(str, e6);
        }
    }

    public static int h(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e6) {
            throw z.c(str, e6);
        }
    }

    public static int i(String str) {
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -1881579439:
                if (str.equals("RECORD")) {
                    c6 = 0;
                    break;
                }
                break;
            case -880847356:
                if (str.equals("TEARDOWN")) {
                    c6 = 1;
                    break;
                }
                break;
            case -702888512:
                if (str.equals("GET_PARAMETER")) {
                    c6 = 2;
                    break;
                }
                break;
            case -531492226:
                if (str.equals("OPTIONS")) {
                    c6 = 3;
                    break;
                }
                break;
            case -84360524:
                if (str.equals("PLAY_NOTIFY")) {
                    c6 = 4;
                    break;
                }
                break;
            case 2458420:
                if (str.equals("PLAY")) {
                    c6 = 5;
                    break;
                }
                break;
            case 6481884:
                if (str.equals("REDIRECT")) {
                    c6 = 6;
                    break;
                }
                break;
            case 71242700:
                if (str.equals("SET_PARAMETER")) {
                    c6 = 7;
                    break;
                }
                break;
            case 75902422:
                if (str.equals("PAUSE")) {
                    c6 = '\b';
                    break;
                }
                break;
            case 78791261:
                if (str.equals("SETUP")) {
                    c6 = '\t';
                    break;
                }
                break;
            case 133006441:
                if (str.equals("ANNOUNCE")) {
                    c6 = '\n';
                    break;
                }
                break;
            case 1800840907:
                if (str.equals("DESCRIBE")) {
                    c6 = 11;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return 8;
            case 1:
                return 12;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 7;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 11;
            case '\b':
                return 5;
            case '\t':
                return 10;
            case '\n':
                return 1;
            case 11:
                return 2;
            default:
                return 0;
        }
    }

    public static w j(String str) {
        if (str == null) {
            return w.w();
        }
        w.a aVar = new w.a();
        for (String str2 : AbstractC1117K.d1(str, ",\\s?")) {
            int i6 = i(str2);
            if (i6 != 0) {
                aVar.h(Integer.valueOf(i6));
            }
        }
        return aVar.k();
    }

    public static s k(List list) {
        Matcher matcher = f9404a.matcher((CharSequence) list.get(0));
        AbstractC1119a.a(matcher.matches());
        int i6 = i((String) AbstractC1119a.e(matcher.group(1)));
        Uri parse = Uri.parse((String) AbstractC1119a.e(matcher.group(2)));
        int indexOf = list.indexOf("");
        AbstractC1119a.a(indexOf > 0);
        return new s(parse, i6, new e.b().c(list.subList(1, indexOf)).e(), y6.h.g(f9411h).d(list.subList(indexOf + 1, list.size())));
    }

    public static t l(List list) {
        Matcher matcher = f9405b.matcher((CharSequence) list.get(0));
        AbstractC1119a.a(matcher.matches());
        int parseInt = Integer.parseInt((String) AbstractC1119a.e(matcher.group(1)));
        int indexOf = list.indexOf("");
        AbstractC1119a.a(indexOf > 0);
        return new t(parseInt, new e.b().c(list.subList(1, indexOf)).e(), y6.h.g(f9411h).d(list.subList(indexOf + 1, list.size())));
    }

    public static b m(String str) {
        long parseInt;
        Matcher matcher = f9407d.matcher(str);
        if (!matcher.matches()) {
            throw z.c(str, null);
        }
        String str2 = (String) AbstractC1119a.e(matcher.group(1));
        if (matcher.group(2) != null) {
            try {
                parseInt = Integer.parseInt(r0) * 1000;
            } catch (NumberFormatException e6) {
                throw z.c(str, e6);
            }
        } else {
            parseInt = 60000;
        }
        return new b(str2, parseInt);
    }

    public static a n(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        String[] e12 = AbstractC1117K.e1(userInfo, ":");
        return new a(e12[0], e12[1]);
    }

    public static c o(String str) {
        Matcher matcher = f9408e.matcher(str);
        if (matcher.find()) {
            return new c(2, (String) AbstractC1119a.e(matcher.group(1)), (String) AbstractC1119a.e(matcher.group(3)), y6.t.e(matcher.group(4)));
        }
        Matcher matcher2 = f9409f.matcher(str);
        if (matcher2.matches()) {
            return new c(1, (String) AbstractC1119a.e(matcher2.group(1)), "", "");
        }
        throw z.c("Invalid WWW-Authenticate header " + str, null);
    }

    public static Uri p(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String str = (String) AbstractC1119a.e(uri.getAuthority());
        AbstractC1119a.a(str.contains("@"));
        return uri.buildUpon().encodedAuthority(AbstractC1117K.d1(str, "@")[1]).build();
    }

    public static w q(s sVar) {
        AbstractC1119a.a(sVar.f18831c.d("CSeq") != null);
        w.a aVar = new w.a();
        aVar.h(AbstractC1117K.H("%s %s %s", t(sVar.f18830b), sVar.f18829a, "RTSP/1.0"));
        x b6 = sVar.f18831c.b();
        g0 l6 = b6.p().l();
        while (l6.hasNext()) {
            String str = (String) l6.next();
            w t6 = b6.t(str);
            for (int i6 = 0; i6 < t6.size(); i6++) {
                aVar.h(AbstractC1117K.H("%s: %s", str, t6.get(i6)));
            }
        }
        aVar.h("");
        aVar.h(sVar.f18832d);
        return aVar.k();
    }

    public static w r(t tVar) {
        AbstractC1119a.a(tVar.f18834b.d("CSeq") != null);
        w.a aVar = new w.a();
        aVar.h(AbstractC1117K.H("%s %s %s", "RTSP/1.0", Integer.valueOf(tVar.f18833a), c(tVar.f18833a)));
        x b6 = tVar.f18834b.b();
        g0 l6 = b6.p().l();
        while (l6.hasNext()) {
            String str = (String) l6.next();
            w t6 = b6.t(str);
            for (int i6 = 0; i6 < t6.size(); i6++) {
                aVar.h(AbstractC1117K.H("%s: %s", str, t6.get(i6)));
            }
        }
        aVar.h("");
        aVar.h(tVar.f18835c);
        return aVar.k();
    }

    public static String[] s(String str) {
        String str2 = f9411h;
        if (!str.contains(str2)) {
            str2 = f9410g;
        }
        return AbstractC1117K.d1(str, str2);
    }

    public static String t(int i6) {
        switch (i6) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
