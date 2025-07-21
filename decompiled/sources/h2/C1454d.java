package h2;

import android.text.Layout;
import b2.i;
import b2.k;
import b2.m;
import b2.s;
import c1.AbstractC1117K;
import c1.AbstractC1118L;
import c1.AbstractC1119a;
import c1.AbstractC1123e;
import c1.AbstractC1133o;
import c1.InterfaceC1125g;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: h2.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1454d implements s {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f15243b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f15244c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f15245d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f15246e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f15247f = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f15248g = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f15249h = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: i, reason: collision with root package name */
    public static final a f15250i = new a(30.0f, 1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f15251a;

    /* renamed from: h2.d$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f15252a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15253b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15254c;

        public a(float f6, int i6, int i7) {
            this.f15252a = f6;
            this.f15253b = i6;
            this.f15254c = i7;
        }
    }

    /* renamed from: h2.d$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f15255a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15256b;

        public b(int i6, int i7) {
            this.f15255a = i6;
            this.f15256b = i7;
        }
    }

    public C1454d() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f15251a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e6) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e6);
        }
    }

    public static C1457g e(C1457g c1457g) {
        return c1457g == null ? new C1457g() : c1457g;
    }

    public static boolean f(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static Layout.Alignment g(String str) {
        String e6 = y6.c.e(str);
        e6.getClass();
        char c6 = 65535;
        switch (e6.hashCode()) {
            case -1364013995:
                if (e6.equals("center")) {
                    c6 = 0;
                    break;
                }
                break;
            case 100571:
                if (e6.equals("end")) {
                    c6 = 1;
                    break;
                }
                break;
            case 3317767:
                if (e6.equals("left")) {
                    c6 = 2;
                    break;
                }
                break;
            case 108511772:
                if (e6.equals("right")) {
                    c6 = 3;
                    break;
                }
                break;
            case 109757538:
                if (e6.equals("start")) {
                    c6 = 4;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public static int h(XmlPullParser xmlPullParser, int i6) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return i6;
        }
        Matcher matcher = f15249h.matcher(attributeValue);
        if (!matcher.matches()) {
            AbstractC1133o.h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i6;
        }
        boolean z6 = true;
        try {
            int parseInt = Integer.parseInt((String) AbstractC1119a.e(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) AbstractC1119a.e(matcher.group(2)));
            if (parseInt == 0 || parseInt2 == 0) {
                z6 = false;
            }
            AbstractC1119a.b(z6, "Invalid cell resolution " + parseInt + " " + parseInt2);
            return parseInt2;
        } catch (NumberFormatException unused) {
            AbstractC1133o.h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i6;
        }
    }

    public static void i(String str, C1457g c1457g) {
        Matcher matcher;
        String[] d12 = AbstractC1117K.d1(str, "\\s+");
        if (d12.length == 1) {
            matcher = f15245d.matcher(str);
        } else {
            if (d12.length != 2) {
                throw new m("Invalid number of entries for fontSize: " + d12.length + ".");
            }
            matcher = f15245d.matcher(d12[1]);
            AbstractC1133o.h("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new m("Invalid expression for fontSize: '" + str + "'.");
        }
        String str2 = (String) AbstractC1119a.e(matcher.group(3));
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
                c1457g.z(3);
                break;
            case 1:
                c1457g.z(2);
                break;
            case 2:
                c1457g.z(1);
                break;
            default:
                throw new m("Invalid unit for fontSize: '" + str2 + "'.");
        }
        c1457g.y(Float.parseFloat((String) AbstractC1119a.e(matcher.group(1))));
    }

    public static a j(XmlPullParser xmlPullParser) {
        float f6;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            AbstractC1119a.b(AbstractC1117K.d1(attributeValue2, " ").length == 2, "frameRateMultiplier doesn't have 2 parts");
            f6 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f6 = 1.0f;
        }
        a aVar = f15250i;
        int i6 = aVar.f15253b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i6 = Integer.parseInt(attributeValue3);
        }
        int i7 = aVar.f15254c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i7 = Integer.parseInt(attributeValue4);
        }
        return new a(parseInt * f6, i6, i7);
    }

    public static Map k(XmlPullParser xmlPullParser, Map map, int i6, b bVar, Map map2, Map map3) {
        do {
            xmlPullParser.next();
            if (AbstractC1118L.f(xmlPullParser, "style")) {
                String a6 = AbstractC1118L.a(xmlPullParser, "style");
                C1457g p6 = p(xmlPullParser, new C1457g());
                if (a6 != null) {
                    for (String str : q(a6)) {
                        p6.a((C1457g) map.get(str));
                    }
                }
                String g6 = p6.g();
                if (g6 != null) {
                    map.put(g6, p6);
                }
            } else if (AbstractC1118L.f(xmlPullParser, "region")) {
                C1455e n6 = n(xmlPullParser, i6, bVar);
                if (n6 != null) {
                    map2.put(n6.f15257a, n6);
                }
            } else if (AbstractC1118L.f(xmlPullParser, "metadata")) {
                l(xmlPullParser, map3);
            }
        } while (!AbstractC1118L.d(xmlPullParser, "head"));
        return map;
    }

    public static void l(XmlPullParser xmlPullParser, Map map) {
        String a6;
        do {
            xmlPullParser.next();
            if (AbstractC1118L.f(xmlPullParser, "image") && (a6 = AbstractC1118L.a(xmlPullParser, "id")) != null) {
                map.put(a6, xmlPullParser.nextText());
            }
        } while (!AbstractC1118L.d(xmlPullParser, "metadata"));
    }

    public static C1453c m(XmlPullParser xmlPullParser, C1453c c1453c, Map map, a aVar) {
        char c6;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        C1457g p6 = p(xmlPullParser, null);
        long j6 = -9223372036854775807L;
        long j7 = -9223372036854775807L;
        long j8 = -9223372036854775807L;
        long j9 = -9223372036854775807L;
        String str = "";
        int i6 = 0;
        String str2 = null;
        while (i6 < attributeCount) {
            String attributeName = xmlPullParser.getAttributeName(i6);
            long j10 = j6;
            String attributeValue = xmlPullParser.getAttributeValue(i6);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c6 = 0;
                        break;
                    }
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c6 = 3;
                        break;
                    }
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c6 = 4;
                        break;
                    }
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c6 = 5;
                        break;
                    }
                    break;
            }
            c6 = 65535;
            switch (c6) {
                case 0:
                    if (!map.containsKey(attributeValue)) {
                        break;
                    } else {
                        str = attributeValue;
                        continue;
                    }
                case 1:
                    j9 = r(attributeValue, aVar);
                    break;
                case 2:
                    j8 = r(attributeValue, aVar);
                    break;
                case 3:
                    j7 = r(attributeValue, aVar);
                    break;
                case 4:
                    String[] q6 = q(attributeValue);
                    if (q6.length > 0) {
                        strArr = q6;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str2 = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
            i6++;
            j6 = j10;
        }
        long j11 = j6;
        if (c1453c != null) {
            long j12 = c1453c.f15233d;
            if (j12 != j11) {
                if (j7 != j11) {
                    j7 += j12;
                }
                if (j8 != j11) {
                    j8 += j12;
                }
            }
        }
        long j13 = j7;
        if (j8 == j11) {
            if (j9 != j11) {
                j8 = j13 + j9;
            } else if (c1453c != null) {
                long j14 = c1453c.f15234e;
                if (j14 != j11) {
                    j8 = j14;
                }
            }
        }
        return C1453c.c(xmlPullParser.getName(), j13, j8, p6, strArr, str, str2, c1453c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a7, code lost:
    
        if (r0.equals("tb") == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static h2.C1455e n(org.xmlpull.v1.XmlPullParser r18, int r19, h2.C1454d.b r20) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C1454d.n(org.xmlpull.v1.XmlPullParser, int, h2.d$b):h2.e");
    }

    public static float o(String str) {
        Matcher matcher = f15246e.matcher(str);
        if (!matcher.matches()) {
            AbstractC1133o.h("TtmlParser", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) AbstractC1119a.e(matcher.group(1)))));
        } catch (NumberFormatException e6) {
            AbstractC1133o.i("TtmlParser", "Failed to parse shear: " + str, e6);
            return Float.MAX_VALUE;
        }
    }

    public static C1457g p(XmlPullParser xmlPullParser, C1457g c1457g) {
        char c6;
        boolean z6;
        boolean z7;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i6 = 0; i6 < attributeCount; i6++) {
            String attributeValue = xmlPullParser.getAttributeValue(i6);
            String attributeName = xmlPullParser.getAttributeName(i6);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c6 = 0;
                        break;
                    }
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c6 = 1;
                        break;
                    }
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c6 = 2;
                        break;
                    }
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c6 = 3;
                        break;
                    }
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c6 = 4;
                        break;
                    }
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c6 = 5;
                        break;
                    }
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c6 = 6;
                        break;
                    }
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c6 = 7;
                        break;
                    }
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c6 = '\b';
                        break;
                    }
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c6 = '\t';
                        break;
                    }
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c6 = '\n';
                        break;
                    }
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c6 = 11;
                        break;
                    }
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c6 = '\f';
                        break;
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c6 = '\r';
                        break;
                    }
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c6 = 14;
                        break;
                    }
                    break;
            }
            c6 = 65535;
            switch (c6) {
                case 0:
                    c1457g = e(c1457g).B("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    c1457g = e(c1457g).x(attributeValue);
                    break;
                case 2:
                    c1457g = e(c1457g).H(g(attributeValue));
                    break;
                case 3:
                    String e6 = y6.c.e(attributeValue);
                    e6.getClass();
                    switch (e6.hashCode()) {
                        case -1461280213:
                            if (e6.equals("nounderline")) {
                                z6 = false;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (e6.equals("underline")) {
                                z6 = true;
                                break;
                            }
                            break;
                        case 913457136:
                            if (e6.equals("nolinethrough")) {
                                z6 = 2;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (e6.equals("linethrough")) {
                                z6 = 3;
                                break;
                            }
                            break;
                    }
                    z6 = -1;
                    switch (z6) {
                        case false:
                            c1457g = e(c1457g).K(false);
                            break;
                        case true:
                            c1457g = e(c1457g).K(true);
                            break;
                        case true:
                            c1457g = e(c1457g).C(false);
                            break;
                        case true:
                            c1457g = e(c1457g).C(true);
                            break;
                    }
                case 4:
                    c1457g = e(c1457g).v("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        c1457g = e(c1457g).A(attributeValue);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    String e7 = y6.c.e(attributeValue);
                    e7.getClass();
                    switch (e7.hashCode()) {
                        case -618561360:
                            if (e7.equals("baseContainer")) {
                                z7 = false;
                                break;
                            }
                            break;
                        case -410956671:
                            if (e7.equals("container")) {
                                z7 = true;
                                break;
                            }
                            break;
                        case -250518009:
                            if (e7.equals("delimiter")) {
                                z7 = 2;
                                break;
                            }
                            break;
                        case -136074796:
                            if (e7.equals("textContainer")) {
                                z7 = 3;
                                break;
                            }
                            break;
                        case 3016401:
                            if (e7.equals("base")) {
                                z7 = 4;
                                break;
                            }
                            break;
                        case 3556653:
                            if (e7.equals("text")) {
                                z7 = 5;
                                break;
                            }
                            break;
                    }
                    z7 = -1;
                    switch (z7) {
                        case false:
                        case true:
                            c1457g = e(c1457g).F(2);
                            break;
                        case true:
                            c1457g = e(c1457g).F(1);
                            break;
                        case true:
                            c1457g = e(c1457g).F(4);
                            break;
                        case true:
                        case true:
                            c1457g = e(c1457g).F(3);
                            break;
                    }
                case 7:
                    c1457g = e(c1457g);
                    try {
                        c1457g.w(AbstractC1123e.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        AbstractC1133o.h("TtmlParser", "Failed parsing color value: " + attributeValue);
                        break;
                    }
                case '\b':
                    c1457g = e(c1457g).G(o(attributeValue));
                    break;
                case '\t':
                    String e8 = y6.c.e(attributeValue);
                    e8.getClass();
                    if (e8.equals("all")) {
                        c1457g = e(c1457g).I(true);
                        break;
                    } else if (e8.equals("none")) {
                        c1457g = e(c1457g).I(false);
                        break;
                    } else {
                        break;
                    }
                case '\n':
                    try {
                        c1457g = e(c1457g);
                        i(attributeValue, c1457g);
                        break;
                    } catch (m unused2) {
                        AbstractC1133o.h("TtmlParser", "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                case 11:
                    c1457g = e(c1457g).J(C1452b.a(attributeValue));
                    break;
                case '\f':
                    String e9 = y6.c.e(attributeValue);
                    e9.getClass();
                    if (e9.equals("before")) {
                        c1457g = e(c1457g).E(1);
                        break;
                    } else if (e9.equals("after")) {
                        c1457g = e(c1457g).E(2);
                        break;
                    } else {
                        break;
                    }
                case '\r':
                    c1457g = e(c1457g);
                    try {
                        c1457g.u(AbstractC1123e.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        AbstractC1133o.h("TtmlParser", "Failed parsing background value: " + attributeValue);
                        break;
                    }
                case 14:
                    c1457g = e(c1457g).D(g(attributeValue));
                    break;
            }
        }
        return c1457g;
    }

    public static String[] q(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : AbstractC1117K.d1(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long r(java.lang.String r13, h2.C1454d.a r14) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C1454d.r(java.lang.String, h2.d$a):long");
    }

    public static b s(XmlPullParser xmlPullParser) {
        String a6 = AbstractC1118L.a(xmlPullParser, "extent");
        if (a6 == null) {
            return null;
        }
        Matcher matcher = f15248g.matcher(a6);
        if (!matcher.matches()) {
            AbstractC1133o.h("TtmlParser", "Ignoring non-pixel tts extent: " + a6);
            return null;
        }
        try {
            return new b(Integer.parseInt((String) AbstractC1119a.e(matcher.group(1))), Integer.parseInt((String) AbstractC1119a.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            AbstractC1133o.h("TtmlParser", "Ignoring malformed tts extent: " + a6);
            return null;
        }
    }

    @Override // b2.s
    public k b(byte[] bArr, int i6, int i7) {
        char c6;
        try {
            XmlPullParser newPullParser = this.f15251a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new C1455e(""));
            C1458h c1458h = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i6, i7), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i8 = 0;
            int i9 = 15;
            a aVar = f15250i;
            b bVar = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C1453c c1453c = (C1453c) arrayDeque.peek();
                if (i8 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVar = j(newPullParser);
                            c6 = 15;
                            i9 = h(newPullParser, 15);
                            bVar = s(newPullParser);
                        } else {
                            c6 = 15;
                        }
                        a aVar2 = aVar;
                        b bVar2 = bVar;
                        int i10 = i9;
                        if (f(name)) {
                            if ("head".equals(name)) {
                                k(newPullParser, hashMap, i10, bVar2, hashMap2, hashMap3);
                            } else {
                                try {
                                    C1453c m6 = m(newPullParser, c1453c, hashMap2, aVar2);
                                    arrayDeque.push(m6);
                                    if (c1453c != null) {
                                        c1453c.a(m6);
                                    }
                                } catch (m e6) {
                                    AbstractC1133o.i("TtmlParser", "Suppressing parser error", e6);
                                }
                            }
                            i9 = i10;
                            bVar = bVar2;
                            aVar = aVar2;
                        } else {
                            AbstractC1133o.f("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                        }
                        i8++;
                        i9 = i10;
                        bVar = bVar2;
                        aVar = aVar2;
                    } else {
                        c6 = 15;
                        if (eventType == 4) {
                            ((C1453c) AbstractC1119a.e(c1453c)).a(C1453c.d(newPullParser.getText()));
                        } else if (eventType == 3) {
                            if (newPullParser.getName().equals("tt")) {
                                c1458h = new C1458h((C1453c) AbstractC1119a.e((C1453c) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                            }
                            arrayDeque.pop();
                        }
                    }
                } else if (eventType == 2) {
                    i8++;
                } else if (eventType == 3) {
                    i8--;
                }
                newPullParser.next();
            }
            return (k) AbstractC1119a.e(c1458h);
        } catch (IOException e7) {
            throw new IllegalStateException("Unexpected error when reading input.", e7);
        } catch (XmlPullParserException e8) {
            throw new IllegalStateException("Unable to decode source", e8);
        }
    }

    @Override // b2.s
    public void c(byte[] bArr, int i6, int i7, s.b bVar, InterfaceC1125g interfaceC1125g) {
        i.c(b(bArr, i6, i7), bVar, interfaceC1125g);
    }

    @Override // b2.s
    public int d() {
        return 1;
    }
}
