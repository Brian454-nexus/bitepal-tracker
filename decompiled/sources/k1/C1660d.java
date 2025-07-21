package k1;

import A1.n;
import Z0.AbstractC0835g;
import Z0.C0841m;
import Z0.q;
import Z0.t;
import Z0.y;
import Z0.z;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import c1.AbstractC1113G;
import c1.AbstractC1117K;
import c1.AbstractC1118L;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k1.k;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import z6.G;
import z6.w;

/* renamed from: k1.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1660d extends DefaultHandler implements n.a {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f16329b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f16330c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f16331d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f16332e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f16333a;

    /* renamed from: k1.d$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final q f16334a;

        /* renamed from: b, reason: collision with root package name */
        public final w f16335b;

        /* renamed from: c, reason: collision with root package name */
        public final k f16336c;

        /* renamed from: d, reason: collision with root package name */
        public final String f16337d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f16338e;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList f16339f;

        /* renamed from: g, reason: collision with root package name */
        public final long f16340g;

        /* renamed from: h, reason: collision with root package name */
        public final List f16341h;

        /* renamed from: i, reason: collision with root package name */
        public final List f16342i;

        public a(q qVar, List list, k kVar, String str, ArrayList arrayList, ArrayList arrayList2, List list2, List list3, long j6) {
            this.f16334a = qVar;
            this.f16335b = w.s(list);
            this.f16336c = kVar;
            this.f16337d = str;
            this.f16338e = arrayList;
            this.f16339f = arrayList2;
            this.f16341h = list2;
            this.f16342i = list3;
            this.f16340g = j6;
        }
    }

    public C1660d() {
        try {
            this.f16333a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e6) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e6);
        }
    }

    public static int D(List list) {
        String str;
        for (int i6 = 0; i6 < list.size(); i6++) {
            C1661e c1661e = (C1661e) list.get(i6);
            if ("urn:scte:dash:cc:cea-608:2015".equals(c1661e.f16343a) && (str = c1661e.f16344b) != null) {
                Matcher matcher = f16330c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                AbstractC1133o.h("MpdParser", "Unable to parse CEA-608 channel number from: " + c1661e.f16344b);
            }
        }
        return -1;
    }

    public static int E(List list) {
        String str;
        for (int i6 = 0; i6 < list.size(); i6++) {
            C1661e c1661e = (C1661e) list.get(i6);
            if ("urn:scte:dash:cc:cea-708:2015".equals(c1661e.f16343a) && (str = c1661e.f16344b) != null) {
                Matcher matcher = f16331d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                AbstractC1133o.h("MpdParser", "Unable to parse CEA-708 service block number from: " + c1661e.f16344b);
            }
        }
        return -1;
    }

    public static long H(XmlPullParser xmlPullParser, String str, long j6) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j6 : AbstractC1117K.Q0(attributeValue);
    }

    public static C1661e I(XmlPullParser xmlPullParser, String str) {
        String r02 = r0(xmlPullParser, "schemeIdUri", "");
        String r03 = r0(xmlPullParser, com.amazon.a.a.o.b.f11195Y, null);
        String r04 = r0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!AbstractC1118L.d(xmlPullParser, str));
        return new C1661e(r02, r03, r04);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int J(XmlPullParser xmlPullParser) {
        char c6;
        String attributeValue = xmlPullParser.getAttributeValue(null, com.amazon.a.a.o.b.f11195Y);
        if (attributeValue == null) {
            return -1;
        }
        String e6 = y6.c.e(attributeValue);
        e6.getClass();
        switch (e6.hashCode()) {
            case 1596796:
                if (e6.equals("4000")) {
                    c6 = 0;
                    break;
                }
                c6 = 65535;
                break;
            case 2937391:
                if (e6.equals("a000")) {
                    c6 = 1;
                    break;
                }
                c6 = 65535;
                break;
            case 3094034:
                if (e6.equals("f800")) {
                    c6 = 2;
                    break;
                }
                c6 = 65535;
                break;
            case 3094035:
                if (e6.equals("f801")) {
                    c6 = 3;
                    break;
                }
                c6 = 65535;
                break;
            case 3133436:
                if (e6.equals("fa01")) {
                    c6 = 4;
                    break;
                }
                c6 = 65535;
                break;
            default:
                c6 = 65535;
                break;
        }
        switch (c6) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 8;
            default:
                return -1;
        }
    }

    public static int K(XmlPullParser xmlPullParser) {
        int U5 = U(xmlPullParser, com.amazon.a.a.o.b.f11195Y, -1);
        if (U5 <= 0 || U5 >= 33) {
            return -1;
        }
        return U5;
    }

    public static int L(XmlPullParser xmlPullParser) {
        int bitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, com.amazon.a.a.o.b.f11195Y);
        if (attributeValue == null || (bitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return bitCount;
    }

    public static long M(XmlPullParser xmlPullParser, String str, long j6) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j6 : AbstractC1117K.R0(attributeValue);
    }

    public static String N(List list) {
        for (int i6 = 0; i6 < list.size(); i6++) {
            C1661e c1661e = (C1661e) list.get(i6);
            String str = c1661e.f16343a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(c1661e.f16344b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(c1661e.f16344b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    public static float R(XmlPullParser xmlPullParser, String str, float f6) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f6 : Float.parseFloat(attributeValue);
    }

    public static float S(XmlPullParser xmlPullParser, float f6) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f16329b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
            }
        }
        return f6;
    }

    public static int U(XmlPullParser xmlPullParser, String str, int i6) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i6 : Integer.parseInt(attributeValue);
    }

    public static long W(List list) {
        for (int i6 = 0; i6 < list.size(); i6++) {
            C1661e c1661e = (C1661e) list.get(i6);
            if (y6.c.a("http://dashif.org/guidelines/last-segment-number", c1661e.f16343a)) {
                return Long.parseLong(c1661e.f16344b);
            }
        }
        return -1L;
    }

    public static long X(XmlPullParser xmlPullParser, String str, long j6) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j6 : Long.parseLong(attributeValue);
    }

    public static int Z(XmlPullParser xmlPullParser) {
        int U5 = U(xmlPullParser, com.amazon.a.a.o.b.f11195Y, -1);
        if (U5 >= 0) {
            int[] iArr = f16332e;
            if (U5 < iArr.length) {
                return iArr[U5];
            }
        }
        return -1;
    }

    public static int p(int i6, int i7) {
        if (i6 == -1) {
            return i7;
        }
        if (i7 == -1) {
            return i6;
        }
        AbstractC1119a.g(i6 == i7);
        return i6;
    }

    public static String q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        AbstractC1119a.g(str.equals(str2));
        return str;
    }

    public static void r(ArrayList arrayList) {
        String str;
        int i6 = 0;
        while (true) {
            if (i6 >= arrayList.size()) {
                str = null;
                break;
            }
            C0841m.b bVar = (C0841m.b) arrayList.get(i6);
            if (AbstractC0835g.f6881c.equals(bVar.f6924b) && (str = bVar.f6925c) != null) {
                arrayList.remove(i6);
                break;
            }
            i6++;
        }
        if (str == null) {
            return;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            C0841m.b bVar2 = (C0841m.b) arrayList.get(i7);
            if (AbstractC0835g.f6880b.equals(bVar2.f6924b) && bVar2.f6925c == null) {
                arrayList.set(i7, new C0841m.b(AbstractC0835g.f6881c, str, bVar2.f6926d, bVar2.f6927e));
            }
        }
    }

    public static String r0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    public static void s(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0841m.b bVar = (C0841m.b) arrayList.get(size);
            if (!bVar.d()) {
                int i6 = 0;
                while (true) {
                    if (i6 >= arrayList.size()) {
                        break;
                    }
                    if (((C0841m.b) arrayList.get(i6)).a(bVar)) {
                        arrayList.remove(size);
                        break;
                    }
                    i6++;
                }
            }
        }
    }

    public static String s0(XmlPullParser xmlPullParser, String str) {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                w(xmlPullParser);
            }
        } while (!AbstractC1118L.d(xmlPullParser, str));
        return str2;
    }

    public static long t(long j6, long j7) {
        if (j7 != -9223372036854775807L) {
            j6 = j7;
        }
        if (j6 == LongCompanionObject.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j6;
    }

    public static String u(String str, String str2) {
        if (y.o(str)) {
            return y.c(str2);
        }
        if (y.s(str)) {
            return y.n(str2);
        }
        if (y.r(str) || y.p(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String g6 = y.g(str2);
        return "text/vtt".equals(g6) ? "application/x-mp4-vtt" : g6;
    }

    public static void w(XmlPullParser xmlPullParser) {
        if (AbstractC1118L.e(xmlPullParser)) {
            int i6 = 1;
            while (i6 != 0) {
                xmlPullParser.next();
                if (AbstractC1118L.e(xmlPullParser)) {
                    i6++;
                } else if (AbstractC1118L.c(xmlPullParser)) {
                    i6--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public int A(XmlPullParser xmlPullParser) {
        char c6;
        String r02 = r0(xmlPullParser, "schemeIdUri", null);
        r02.getClass();
        int i6 = -1;
        switch (r02.hashCode()) {
            case -2128649360:
                if (r02.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c6 = 0;
                    break;
                }
                c6 = 65535;
                break;
            case -1352850286:
                if (r02.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c6 = 1;
                    break;
                }
                c6 = 65535;
                break;
            case -1138141449:
                if (r02.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c6 = 2;
                    break;
                }
                c6 = 65535;
                break;
            case -986633423:
                if (r02.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c6 = 3;
                    break;
                }
                c6 = 65535;
                break;
            case -79006963:
                if (r02.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c6 = 4;
                    break;
                }
                c6 = 65535;
                break;
            case 312179081:
                if (r02.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c6 = 5;
                    break;
                }
                c6 = 65535;
                break;
            case 2036691300:
                if (r02.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c6 = 6;
                    break;
                }
                c6 = 65535;
                break;
            default:
                c6 = 65535;
                break;
        }
        switch (c6) {
            case 0:
            case 4:
                i6 = K(xmlPullParser);
                break;
            case 1:
                i6 = U(xmlPullParser, com.amazon.a.a.o.b.f11195Y, -1);
                break;
            case 2:
            case 6:
                i6 = J(xmlPullParser);
                break;
            case 3:
                i6 = Z(xmlPullParser);
                break;
            case 5:
                i6 = L(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!AbstractC1118L.d(xmlPullParser, "AudioChannelConfiguration"));
        return i6;
    }

    public long B(XmlPullParser xmlPullParser, long j6) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        return attributeValue == null ? j6 : "INF".equals(attributeValue) ? LongCompanionObject.MAX_VALUE : Float.parseFloat(attributeValue) * 1000000.0f;
    }

    public List C(XmlPullParser xmlPullParser, List list, boolean z6) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z6 ? 1 : IntCompanionObject.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String s02 = s0(xmlPullParser, "BaseURL");
        if (AbstractC1113G.c(s02)) {
            if (attributeValue3 == null) {
                attributeValue3 = s02;
            }
            return G.j(new C1658b[]{new C1658b(s02, attributeValue3, parseInt, parseInt2)});
        }
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < list.size(); i6++) {
            C1658b c1658b = (C1658b) list.get(i6);
            String e6 = AbstractC1113G.e(c1658b.f16312a, s02);
            String str = attributeValue3 == null ? e6 : attributeValue3;
            if (z6) {
                parseInt = c1658b.f16314c;
                parseInt2 = c1658b.f16315d;
                str = c1658b.f16313b;
            }
            arrayList.add(new C1658b(e6, str, parseInt, parseInt2));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair F(org.xmlpull.v1.XmlPullParser r12) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C1660d.F(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public int G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public Pair O(XmlPullParser xmlPullParser, String str, String str2, long j6, long j7, ByteArrayOutputStream byteArrayOutputStream) {
        long X5 = X(xmlPullParser, "id", 0L);
        long X6 = X(xmlPullParser, "duration", -9223372036854775807L);
        long X7 = X(xmlPullParser, "presentationTime", 0L);
        long W02 = AbstractC1117K.W0(X6, 1000L, j6);
        long W03 = AbstractC1117K.W0(X7 - j7, 1000000L, j6);
        String r02 = r0(xmlPullParser, "messageData", null);
        byte[] P5 = P(xmlPullParser, byteArrayOutputStream);
        Long valueOf = Long.valueOf(W03);
        if (r02 != null) {
            P5 = AbstractC1117K.s0(r02);
        }
        return Pair.create(valueOf, d(str, str2, X5, W02, P5));
    }

    public byte[] P(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, y6.e.c.name());
        xmlPullParser.nextToken();
        while (!AbstractC1118L.d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i6 = 0; i6 < xmlPullParser.getAttributeCount(); i6++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i6), xmlPullParser.getAttributeName(i6), xmlPullParser.getAttributeValue(i6));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public C1662f Q(XmlPullParser xmlPullParser) {
        long j6;
        String str;
        String str2;
        XmlPullParser xmlPullParser2;
        String r02 = r0(xmlPullParser, "schemeIdUri", "");
        String r03 = r0(xmlPullParser, com.amazon.a.a.o.b.f11195Y, "");
        long X5 = X(xmlPullParser, "timescale", 1L);
        long X6 = X(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(ConstantsKt.MINIMUM_BLOCK_SIZE);
        while (true) {
            xmlPullParser.next();
            if (AbstractC1118L.f(xmlPullParser, "Event")) {
                j6 = X5;
                str = r03;
                str2 = r02;
                xmlPullParser2 = xmlPullParser;
                arrayList.add(O(xmlPullParser2, str2, str, j6, X6, byteArrayOutputStream));
            } else {
                j6 = X5;
                str = r03;
                str2 = r02;
                xmlPullParser2 = xmlPullParser;
                w(xmlPullParser2);
            }
            if (AbstractC1118L.d(xmlPullParser2, "EventStream")) {
                break;
            }
            xmlPullParser = xmlPullParser2;
            r02 = str2;
            r03 = str;
            X5 = j6;
        }
        long[] jArr = new long[arrayList.size()];
        P1.a[] aVarArr = new P1.a[arrayList.size()];
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            Pair pair = (Pair) arrayList.get(i6);
            jArr[i6] = ((Long) pair.first).longValue();
            aVarArr[i6] = (P1.a) pair.second;
        }
        return e(str2, str, j6, jArr, aVarArr);
    }

    public i T(XmlPullParser xmlPullParser) {
        return d0(xmlPullParser, "sourceURL", "range");
    }

    public t V(XmlPullParser xmlPullParser) {
        return new t(xmlPullParser.getAttributeValue(null, "lang"), s0(xmlPullParser, "Label"));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01d9 A[LOOP:0: B:18:0x00a5->B:26:0x01d9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k1.C1659c Y(org.xmlpull.v1.XmlPullParser r39, android.net.Uri r40) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C1660d.Y(org.xmlpull.v1.XmlPullParser, android.net.Uri):k1.c");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public android.util.Pair a0(org.xmlpull.v1.XmlPullParser r33, java.util.List r34, long r35, long r37, long r39, long r41, boolean r43) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C1660d.a0(org.xmlpull.v1.XmlPullParser, java.util.List, long, long, long, long, boolean):android.util.Pair");
    }

    public final long b(List list, long j6, long j7, int i6, long j8) {
        int l6 = i6 >= 0 ? i6 + 1 : (int) AbstractC1117K.l(j8 - j6, j7);
        for (int i7 = 0; i7 < l6; i7++) {
            list.add(m(j6, j7));
            j6 += j7;
        }
        return j6;
    }

    public String[] b0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(com.amazon.a.a.o.b.f.f11248a);
    }

    public C1657a c(long j6, int i6, List list, List list2, List list3, List list4) {
        return new C1657a(j6, i6, list, list2, list3, list4);
    }

    public h c0(XmlPullParser xmlPullParser) {
        String str = null;
        String r02 = r0(xmlPullParser, "moreInformationURL", null);
        String r03 = r0(xmlPullParser, "lang", null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (AbstractC1118L.f(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (AbstractC1118L.f(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (AbstractC1118L.f(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                w(xmlPullParser);
            }
            String str4 = str2;
            String str5 = str;
            String str6 = str3;
            if (AbstractC1118L.d(xmlPullParser, "ProgramInformation")) {
                return new h(str5, str4, str6, r02, r03);
            }
            str = str5;
            str2 = str4;
            str3 = str6;
        }
    }

    public P1.a d(String str, String str2, long j6, long j7, byte[] bArr) {
        return new P1.a(str, str2, j7, j6, bArr);
    }

    public i d0(XmlPullParser xmlPullParser, String str, String str2) {
        long j6;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j7 = -1;
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j6 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j7 = (Long.parseLong(split[1]) - j6) + 1;
            }
        } else {
            j6 = 0;
        }
        return i(attributeValue, j6, j7);
    }

    public C1662f e(String str, String str2, long j6, long[] jArr, P1.a[] aVarArr) {
        return new C1662f(str, str2, j6, jArr, aVarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0214 A[LOOP:0: B:2:0x006c->B:10:0x0214, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01c7 A[EDGE_INSN: B:11:0x01c7->B:12:0x01c7 BREAK  A[LOOP:0: B:2:0x006c->B:10:0x0214], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k1.C1660d.a e0(org.xmlpull.v1.XmlPullParser r33, java.util.List r34, java.lang.String r35, java.lang.String r36, int r37, int r38, float r39, int r40, int r41, java.lang.String r42, java.util.List r43, java.util.List r44, java.util.List r45, java.util.List r46, k1.k r47, long r48, long r50, long r52, long r54, long r56, boolean r58) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C1660d.e0(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, k1.k, long, long, long, long, long, boolean):k1.d$a");
    }

    public q f(String str, String str2, int i6, int i7, float f6, int i8, int i9, int i10, String str3, List list, List list2, String str4, List list3, List list4) {
        String str5 = str4;
        String u6 = u(str2, str5);
        if ("audio/eac3".equals(u6)) {
            u6 = N(list4);
            if ("audio/eac3-joc".equals(u6)) {
                str5 = "ec+3";
            }
        }
        int p02 = p0(list);
        int i02 = i0(list) | f0(list2) | h0(list3) | h0(list4);
        Pair t02 = t0(list3);
        q.b e02 = new q.b().a0(str).Q(str2).o0(u6).O(str5).j0(i10).q0(p02).m0(i02).e0(str3);
        int i11 = -1;
        q.b u02 = e02.t0(t02 != null ? ((Integer) t02.first).intValue() : -1).u0(t02 != null ? ((Integer) t02.second).intValue() : -1);
        if (y.s(u6)) {
            u02.v0(i6).Y(i7).X(f6);
        } else if (y.o(u6)) {
            u02.N(i8).p0(i9);
        } else if (y.r(u6)) {
            if ("application/cea-608".equals(u6)) {
                i11 = D(list2);
            } else if ("application/cea-708".equals(u6)) {
                i11 = E(list2);
            }
            u02.L(i11);
        } else if (y.p(u6)) {
            u02.v0(i6).Y(i7);
        }
        return u02.K();
    }

    public int f0(List list) {
        int u02;
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            C1661e c1661e = (C1661e) list.get(i7);
            if (y6.c.a("urn:mpeg:dash:role:2011", c1661e.f16343a)) {
                u02 = g0(c1661e.f16344b);
            } else if (y6.c.a("urn:tva:metadata:cs:AudioPurposeCS:2007", c1661e.f16343a)) {
                u02 = u0(c1661e.f16344b);
            }
            i6 |= u02;
        }
        return i6;
    }

    public C1659c g(long j6, long j7, long j8, boolean z6, long j9, long j10, long j11, long j12, h hVar, o oVar, l lVar, Uri uri, List list) {
        return new C1659c(j6, j7, j8, z6, j9, j10, j11, j12, hVar, oVar, lVar, uri, list);
    }

    public int g0(String str) {
        if (str == null) {
            return 0;
        }
        char c6 = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c6 = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals(com.amazon.a.a.o.b.f11199c)) {
                    c6 = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c6 = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c6 = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c6 = 4;
                    break;
                }
                break;
            case -1396432756:
                if (str.equals("forced-subtitle")) {
                    c6 = 5;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c6 = 6;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c6 = 7;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c6 = '\b';
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c6 = '\t';
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c6 = '\n';
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c6 = 11;
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c6 = '\f';
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
            case 3:
            case 5:
                return 128;
            case 1:
                return ConstantsKt.MINIMUM_BLOCK_SIZE;
            case 2:
                return 2048;
            case 4:
                return 2;
            case 6:
                return 16;
            case 7:
                return 1;
            case '\b':
                return 256;
            case '\t':
                return 64;
            case '\n':
                return 8;
            case 11:
                return 32;
            case '\f':
                return 4;
            default:
                return 0;
        }
    }

    public g h(String str, long j6, List list, List list2, C1661e c1661e) {
        return new g(str, j6, list, list2, c1661e);
    }

    public int h0(List list) {
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (y6.c.a("http://dashif.org/guidelines/trickmode", ((C1661e) list.get(i7)).f16343a)) {
                i6 = 16384;
            }
        }
        return i6;
    }

    public i i(String str, long j6, long j7) {
        return new i(str, j6, j7);
    }

    public int i0(List list) {
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            C1661e c1661e = (C1661e) list.get(i7);
            if (y6.c.a("urn:mpeg:dash:role:2011", c1661e.f16343a)) {
                i6 |= g0(c1661e.f16344b);
            }
        }
        return i6;
    }

    public j j(a aVar, String str, List list, String str2, ArrayList arrayList, ArrayList arrayList2) {
        q.b a6 = aVar.f16334a.a();
        if (str == null || !list.isEmpty()) {
            a6.d0(list);
        } else {
            a6.c0(str);
        }
        String str3 = aVar.f16337d;
        if (str3 == null) {
            str3 = str2;
        }
        ArrayList arrayList3 = aVar.f16338e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            r(arrayList3);
            s(arrayList3);
            a6.U(new C0841m(str3, arrayList3));
        }
        ArrayList arrayList4 = aVar.f16339f;
        arrayList4.addAll(arrayList2);
        return j.o(aVar.f16340g, a6.K(), aVar.f16335b, aVar.f16336c, arrayList4, aVar.f16341h, aVar.f16342i, null);
    }

    public k.e j0(XmlPullParser xmlPullParser, k.e eVar) {
        long X5 = X(xmlPullParser, "timescale", eVar != null ? eVar.f16380b : 1L);
        long X6 = X(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f16381c : 0L);
        long j6 = eVar != null ? eVar.f16394d : 0L;
        long j7 = eVar != null ? eVar.f16395e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j6 = Long.parseLong(split[0]);
            j7 = (Long.parseLong(split[1]) - j6) + 1;
        }
        long j8 = j7;
        i iVar = eVar != null ? eVar.f16379a : null;
        while (true) {
            xmlPullParser.next();
            if (AbstractC1118L.f(xmlPullParser, "Initialization")) {
                iVar = T(xmlPullParser);
            } else {
                w(xmlPullParser);
            }
            i iVar2 = iVar;
            if (AbstractC1118L.d(xmlPullParser, "SegmentBase")) {
                return n(iVar2, X5, X6, j6, j8);
            }
            iVar = iVar2;
        }
    }

    public k.b k(i iVar, long j6, long j7, long j8, long j9, List list, long j10, List list2, long j11, long j12) {
        return new k.b(iVar, j6, j7, j8, j9, list, j10, list2, AbstractC1117K.J0(j11), AbstractC1117K.J0(j12));
    }

    public k.b k0(XmlPullParser xmlPullParser, k.b bVar, long j6, long j7, long j8, long j9, long j10) {
        long j11;
        long X5 = X(xmlPullParser, "timescale", bVar != null ? bVar.f16380b : 1L);
        long X6 = X(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f16381c : 0L);
        long X7 = X(xmlPullParser, "duration", bVar != null ? bVar.f16383e : -9223372036854775807L);
        long X8 = X(xmlPullParser, "startNumber", bVar != null ? bVar.f16382d : 1L);
        long t6 = t(j8, j9);
        List list = null;
        i iVar = null;
        List list2 = null;
        while (true) {
            xmlPullParser.next();
            if (AbstractC1118L.f(xmlPullParser, "Initialization")) {
                iVar = T(xmlPullParser);
                j11 = X5;
            } else if (AbstractC1118L.f(xmlPullParser, "SegmentTimeline")) {
                j11 = X5;
                list2 = m0(xmlPullParser, j11, j7);
            } else {
                j11 = X5;
                if (AbstractC1118L.f(xmlPullParser, "SegmentURL")) {
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(n0(xmlPullParser));
                } else {
                    w(xmlPullParser);
                }
            }
            if (AbstractC1118L.d(xmlPullParser, "SegmentList")) {
                break;
            }
            X5 = j11;
        }
        if (bVar != null) {
            if (iVar == null) {
                iVar = bVar.f16379a;
            }
            if (list2 == null) {
                list2 = bVar.f16384f;
            }
            if (list == null) {
                list = bVar.f16388j;
            }
        }
        return k(iVar, j11, X6, X8, X7, list2, t6, list, j10, j6);
    }

    public k.c l(i iVar, long j6, long j7, long j8, long j9, long j10, List list, long j11, n nVar, n nVar2, long j12, long j13) {
        return new k.c(iVar, j6, j7, j8, j9, j10, list, j11, nVar, nVar2, AbstractC1117K.J0(j12), AbstractC1117K.J0(j13));
    }

    public k.c l0(XmlPullParser xmlPullParser, k.c cVar, List list, long j6, long j7, long j8, long j9, long j10) {
        long j11;
        C1660d c1660d = this;
        long X5 = X(xmlPullParser, "timescale", cVar != null ? cVar.f16380b : 1L);
        long X6 = X(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f16381c : 0L);
        long X7 = X(xmlPullParser, "duration", cVar != null ? cVar.f16383e : -9223372036854775807L);
        long X8 = X(xmlPullParser, "startNumber", cVar != null ? cVar.f16382d : 1L);
        long W5 = W(list);
        long t6 = t(j8, j9);
        n v02 = c1660d.v0(xmlPullParser, "media", cVar != null ? cVar.f16390k : null);
        n v03 = c1660d.v0(xmlPullParser, "initialization", cVar != null ? cVar.f16389j : null);
        i iVar = null;
        List list2 = null;
        while (true) {
            xmlPullParser.next();
            if (AbstractC1118L.f(xmlPullParser, "Initialization")) {
                iVar = T(xmlPullParser);
                j11 = X5;
            } else if (AbstractC1118L.f(xmlPullParser, "SegmentTimeline")) {
                j11 = X5;
                list2 = c1660d.m0(xmlPullParser, j11, j7);
            } else {
                j11 = X5;
                w(xmlPullParser);
            }
            if (AbstractC1118L.d(xmlPullParser, "SegmentTemplate")) {
                break;
            }
            c1660d = this;
            t6 = t6;
            W5 = W5;
            X8 = X8;
            X6 = X6;
            X5 = j11;
        }
        if (cVar != null) {
            if (iVar == null) {
                iVar = cVar.f16379a;
            }
            if (list2 == null) {
                list2 = cVar.f16384f;
            }
        }
        return l(iVar, j11, X6, X8, W5, X7, list2, t6, v03, v02, j10, j6);
    }

    public k.d m(long j6, long j7) {
        return new k.d(j6, j7);
    }

    public List m0(XmlPullParser xmlPullParser, long j6, long j7) {
        ArrayList arrayList = new ArrayList();
        long j8 = 0;
        long j9 = -9223372036854775807L;
        boolean z6 = false;
        int i6 = 0;
        do {
            xmlPullParser.next();
            if (AbstractC1118L.f(xmlPullParser, "S")) {
                long X5 = X(xmlPullParser, "t", -9223372036854775807L);
                if (z6) {
                    ArrayList arrayList2 = arrayList;
                    j8 = b(arrayList2, j8, j9, i6, X5);
                    arrayList = arrayList2;
                }
                if (X5 != -9223372036854775807L) {
                    j8 = X5;
                }
                j9 = X(xmlPullParser, "d", -9223372036854775807L);
                i6 = U(xmlPullParser, "r", 0);
                z6 = true;
            } else {
                w(xmlPullParser);
            }
        } while (!AbstractC1118L.d(xmlPullParser, "SegmentTimeline"));
        if (z6) {
            b(arrayList, j8, j9, i6, AbstractC1117K.W0(j7, j6, 1000L));
        }
        return arrayList;
    }

    public k.e n(i iVar, long j6, long j7, long j8, long j9) {
        return new k.e(iVar, j6, j7, j8, j9);
    }

    public i n0(XmlPullParser xmlPullParser) {
        return d0(xmlPullParser, "media", "mediaRange");
    }

    public o o(String str, String str2) {
        return new o(str, str2);
    }

    public int o0(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    public int p0(List list) {
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            C1661e c1661e = (C1661e) list.get(i7);
            if (y6.c.a("urn:mpeg:dash:role:2011", c1661e.f16343a)) {
                i6 |= o0(c1661e.f16344b);
            }
        }
        return i6;
    }

    public l q0(XmlPullParser xmlPullParser) {
        long j6 = -9223372036854775807L;
        long j7 = -9223372036854775807L;
        long j8 = -9223372036854775807L;
        float f6 = -3.4028235E38f;
        float f7 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (AbstractC1118L.f(xmlPullParser, "Latency")) {
                j6 = X(xmlPullParser, "target", -9223372036854775807L);
                j7 = X(xmlPullParser, "min", -9223372036854775807L);
                j8 = X(xmlPullParser, "max", -9223372036854775807L);
            } else if (AbstractC1118L.f(xmlPullParser, "PlaybackRate")) {
                f6 = R(xmlPullParser, "min", -3.4028235E38f);
                f7 = R(xmlPullParser, "max", -3.4028235E38f);
            }
            long j9 = j6;
            long j10 = j7;
            long j11 = j8;
            float f8 = f6;
            float f9 = f7;
            if (AbstractC1118L.d(xmlPullParser, "ServiceDescription")) {
                return new l(j9, j10, j11, f8, f9);
            }
            j6 = j9;
            j7 = j10;
            j8 = j11;
            f6 = f8;
            f7 = f9;
        }
    }

    public Pair t0(List list) {
        String str;
        for (int i6 = 0; i6 < list.size(); i6++) {
            C1661e c1661e = (C1661e) list.get(i6);
            if ((y6.c.a("http://dashif.org/thumbnail_tile", c1661e.f16343a) || y6.c.a("http://dashif.org/guidelines/thumbnail_tile", c1661e.f16343a)) && (str = c1661e.f16344b) != null) {
                String[] d12 = AbstractC1117K.d1(str, "x");
                if (d12.length == 2) {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(d12[0])), Integer.valueOf(Integer.parseInt(d12[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public int u0(String str) {
        if (str == null) {
            return 0;
        }
        char c6 = 65535;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    c6 = 0;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c6 = 1;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c6 = 2;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    c6 = 3;
                    break;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    c6 = 4;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return ConstantsKt.MINIMUM_BLOCK_SIZE;
            case 1:
                return 2048;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    public final boolean v(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public n v0(XmlPullParser xmlPullParser, String str, n nVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? n.b(attributeValue) : nVar;
    }

    public o w0(XmlPullParser xmlPullParser) {
        return o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, com.amazon.a.a.o.b.f11195Y));
    }

    @Override // A1.n.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public C1659c a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f16333a.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return Y(newPullParser, uri);
            }
            throw z.c("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e6) {
            throw z.c(null, e6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0396 A[LOOP:0: B:2:0x0093->B:10:0x0396, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0346 A[EDGE_INSN: B:11:0x0346->B:12:0x0346 BREAK  A[LOOP:0: B:2:0x0093->B:10:0x0396], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k1.C1657a y(org.xmlpull.v1.XmlPullParser r44, java.util.List r45, k1.k r46, long r47, long r49, long r51, long r53, long r55, boolean r57) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C1660d.y(org.xmlpull.v1.XmlPullParser, java.util.List, k1.k, long, long, long, long, long, boolean):k1.a");
    }

    public void z(XmlPullParser xmlPullParser) {
        w(xmlPullParser);
    }
}
