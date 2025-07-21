package f2;

import C6.g;
import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import com.amazon.a.a.o.b.f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f14043a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14044b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f14045c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f14046d;

    /* renamed from: e, reason: collision with root package name */
    public final float f14047e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14048f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14049g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14050h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f14051i;

    /* renamed from: j, reason: collision with root package name */
    public final int f14052j;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f14053a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14054b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14055c;

        /* renamed from: d, reason: collision with root package name */
        public final int f14056d;

        /* renamed from: e, reason: collision with root package name */
        public final int f14057e;

        /* renamed from: f, reason: collision with root package name */
        public final int f14058f;

        /* renamed from: g, reason: collision with root package name */
        public final int f14059g;

        /* renamed from: h, reason: collision with root package name */
        public final int f14060h;

        /* renamed from: i, reason: collision with root package name */
        public final int f14061i;

        /* renamed from: j, reason: collision with root package name */
        public final int f14062j;

        /* renamed from: k, reason: collision with root package name */
        public final int f14063k;

        public a(int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f14053a = i6;
            this.f14054b = i7;
            this.f14055c = i8;
            this.f14056d = i9;
            this.f14057e = i10;
            this.f14058f = i11;
            this.f14059g = i12;
            this.f14060h = i13;
            this.f14061i = i14;
            this.f14062j = i15;
            this.f14063k = i16;
        }

        public static a a(String str) {
            char c6;
            String[] split = TextUtils.split(str.substring(7), f.f11248a);
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            for (int i16 = 0; i16 < split.length; i16++) {
                String e6 = y6.c.e(split[i16].trim());
                e6.getClass();
                switch (e6.hashCode()) {
                    case -1178781136:
                        if (e6.equals("italic")) {
                            c6 = 0;
                            break;
                        }
                        break;
                    case -1026963764:
                        if (e6.equals("underline")) {
                            c6 = 1;
                            break;
                        }
                        break;
                    case -192095652:
                        if (e6.equals("strikeout")) {
                            c6 = 2;
                            break;
                        }
                        break;
                    case -70925746:
                        if (e6.equals("primarycolour")) {
                            c6 = 3;
                            break;
                        }
                        break;
                    case 3029637:
                        if (e6.equals("bold")) {
                            c6 = 4;
                            break;
                        }
                        break;
                    case 3373707:
                        if (e6.equals(com.amazon.a.a.h.a.f10906a)) {
                            c6 = 5;
                            break;
                        }
                        break;
                    case 366554320:
                        if (e6.equals("fontsize")) {
                            c6 = 6;
                            break;
                        }
                        break;
                    case 767321349:
                        if (e6.equals("borderstyle")) {
                            c6 = 7;
                            break;
                        }
                        break;
                    case 1767875043:
                        if (e6.equals("alignment")) {
                            c6 = '\b';
                            break;
                        }
                        break;
                    case 1988365454:
                        if (e6.equals("outlinecolour")) {
                            c6 = '\t';
                            break;
                        }
                        break;
                    default:
                        c6 = 65535;
                        break;
                }
                c6 = 65535;
                switch (c6) {
                    case 0:
                        i12 = i16;
                        break;
                    case 1:
                        i13 = i16;
                        break;
                    case 2:
                        i14 = i16;
                        break;
                    case 3:
                        i8 = i16;
                        break;
                    case 4:
                        i11 = i16;
                        break;
                    case 5:
                        i6 = i16;
                        break;
                    case 6:
                        i10 = i16;
                        break;
                    case 7:
                        i15 = i16;
                        break;
                    case '\b':
                        i7 = i16;
                        break;
                    case '\t':
                        i9 = i16;
                        break;
                }
            }
            if (i6 != -1) {
                return new a(i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, split.length);
            }
            return null;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final Pattern f14064c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d, reason: collision with root package name */
        public static final Pattern f14065d = Pattern.compile(AbstractC1117K.H("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e, reason: collision with root package name */
        public static final Pattern f14066e = Pattern.compile(AbstractC1117K.H("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f, reason: collision with root package name */
        public static final Pattern f14067f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a, reason: collision with root package name */
        public final int f14068a;

        /* renamed from: b, reason: collision with root package name */
        public final PointF f14069b;

        public b(int i6, PointF pointF) {
            this.f14068a = i6;
            this.f14069b = pointF;
        }

        public static int a(String str) {
            Matcher matcher = f14067f.matcher(str);
            if (matcher.find()) {
                return c.e((String) AbstractC1119a.e(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f14064c.matcher(str);
            PointF pointF = null;
            int i6 = -1;
            while (matcher.find()) {
                String str2 = (String) AbstractC1119a.e(matcher.group(1));
                try {
                    PointF c6 = c(str2);
                    if (c6 != null) {
                        pointF = c6;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int a6 = a(str2);
                    if (a6 != -1) {
                        i6 = a6;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i6, pointF);
        }

        public static PointF c(String str) {
            String group;
            String group2;
            Matcher matcher = f14065d.matcher(str);
            Matcher matcher2 = f14066e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    AbstractC1133o.f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else {
                if (!find2) {
                    return null;
                }
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) AbstractC1119a.e(group)).trim()), Float.parseFloat(((String) AbstractC1119a.e(group2)).trim()));
        }

        public static String d(String str) {
            return f14064c.matcher(str).replaceAll("");
        }
    }

    public c(String str, int i6, Integer num, Integer num2, float f6, boolean z6, boolean z7, boolean z8, boolean z9, int i7) {
        this.f14043a = str;
        this.f14044b = i6;
        this.f14045c = num;
        this.f14046d = num2;
        this.f14047e = f6;
        this.f14048f = z6;
        this.f14049g = z7;
        this.f14050h = z8;
        this.f14051i = z9;
        this.f14052j = i7;
    }

    public static c b(String str, a aVar) {
        boolean z6;
        boolean z7;
        AbstractC1119a.a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), f.f11248a);
        int length = split.length;
        int i6 = aVar.f14063k;
        if (length != i6) {
            AbstractC1133o.h("SsaStyle", AbstractC1117K.H("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i6), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[aVar.f14053a].trim();
            int i7 = aVar.f14054b;
            int e6 = i7 != -1 ? e(split[i7].trim()) : -1;
            int i8 = aVar.f14055c;
            Integer h6 = i8 != -1 ? h(split[i8].trim()) : null;
            int i9 = aVar.f14056d;
            Integer h7 = i9 != -1 ? h(split[i9].trim()) : null;
            int i10 = aVar.f14057e;
            float i11 = i10 != -1 ? i(split[i10].trim()) : -3.4028235E38f;
            int i12 = aVar.f14058f;
            boolean z8 = false;
            boolean z9 = true;
            if (i12 == -1 || !f(split[i12].trim())) {
                z6 = false;
            } else {
                z6 = false;
                z8 = true;
            }
            int i13 = aVar.f14059g;
            if (i13 == -1 || !f(split[i13].trim())) {
                z7 = true;
                z9 = z6;
            } else {
                z7 = true;
            }
            int i14 = aVar.f14060h;
            if (i14 == -1 || !f(split[i14].trim())) {
                z7 = false;
            }
            int i15 = aVar.f14061i;
            boolean z10 = i15 != -1 && f(split[i15].trim());
            int i16 = aVar.f14062j;
            return new c(trim, e6, h6, h7, i11, z8, z9, z7, z10, i16 != -1 ? g(split[i16].trim()) : -1);
        } catch (RuntimeException e7) {
            AbstractC1133o.i("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e7);
            return null;
        }
    }

    public static boolean c(int i6) {
        switch (i6) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public static boolean d(int i6) {
        return i6 == 1 || i6 == 3;
    }

    public static int e(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC1133o.h("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    public static boolean f(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e6) {
            AbstractC1133o.i("SsaStyle", "Failed to parse boolean value: '" + str + "'", e6);
            return false;
        }
    }

    public static int g(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (d(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC1133o.h("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer h(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC1119a.a(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(g.d(((parseLong >> 24) & 255) ^ 255), g.d(parseLong & 255), g.d((parseLong >> 8) & 255), g.d((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e6) {
            AbstractC1133o.i("SsaStyle", "Failed to parse color expression: '" + str + "'", e6);
            return null;
        }
    }

    public static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e6) {
            AbstractC1133o.i("SsaStyle", "Failed to parse font size: '" + str + "'", e6);
            return -3.4028235E38f;
        }
    }
}
