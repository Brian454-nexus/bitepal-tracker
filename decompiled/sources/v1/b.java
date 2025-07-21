package v1;

import A1.n;
import E1.AbstractC0299a;
import Y1.o;
import Y1.t;
import Z0.C0841m;
import Z0.q;
import Z0.z;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1122d;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import v1.C2161a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b implements n.a {

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f19323a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f19324a;

        /* renamed from: b, reason: collision with root package name */
        public final String f19325b;

        /* renamed from: c, reason: collision with root package name */
        public final a f19326c;

        /* renamed from: d, reason: collision with root package name */
        public final List f19327d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f19326c = aVar;
            this.f19324a = str;
            this.f19325b = str2;
        }

        public void a(Object obj) {
        }

        public abstract Object b();

        public final Object c(String str) {
            for (int i6 = 0; i6 < this.f19327d.size(); i6++) {
                Pair pair = (Pair) this.f19327d.get(i6);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f19326c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        public boolean d(String str) {
            return false;
        }

        public final a e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new f(aVar, str2);
            }
            return null;
        }

        public final Object f(XmlPullParser xmlPullParser) {
            boolean z6 = false;
            int i6 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f19325b.equals(name)) {
                        n(xmlPullParser);
                        z6 = true;
                    } else if (z6) {
                        if (i6 > 0) {
                            i6++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a e6 = e(this, name, this.f19324a);
                            if (e6 == null) {
                                i6 = 1;
                            } else {
                                a(e6.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z6 && i6 == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z6) {
                    continue;
                } else if (i6 > 0) {
                    i6--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        public final boolean g(XmlPullParser xmlPullParser, String str, boolean z6) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z6;
        }

        public void h(XmlPullParser xmlPullParser) {
        }

        public final int i(XmlPullParser xmlPullParser, String str, int i6) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i6;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e6) {
                throw z.c(null, e6);
            }
        }

        public final long j(XmlPullParser xmlPullParser, String str, long j6) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j6;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e6) {
                throw z.c(null, e6);
            }
        }

        public final int k(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new C0256b(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e6) {
                throw z.c(null, e6);
            }
        }

        public final long l(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new C0256b(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e6) {
                throw z.c(null, e6);
            }
        }

        public final String m(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new C0256b(str);
        }

        public abstract void n(XmlPullParser xmlPullParser);

        public void o(XmlPullParser xmlPullParser) {
        }

        public final void p(String str, Object obj) {
            this.f19327d.add(Pair.create(str, obj));
        }
    }

    /* renamed from: v1.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class C0256b extends z {
        public C0256b(String str) {
            super("Missing required field: " + str, null, true, 4);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c extends a {

        /* renamed from: e, reason: collision with root package name */
        public boolean f19328e;

        /* renamed from: f, reason: collision with root package name */
        public UUID f19329f;

        /* renamed from: g, reason: collision with root package name */
        public byte[] f19330g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        public static t[] q(byte[] bArr) {
            return new t[]{new t(true, null, 8, r(bArr), 0, 0, null)};
        }

        public static byte[] r(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (int i6 = 0; i6 < bArr.length; i6 += 2) {
                sb.append((char) bArr[i6]);
            }
            String sb2 = sb.toString();
            byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
            t(decode, 0, 3);
            t(decode, 1, 2);
            t(decode, 4, 5);
            t(decode, 6, 7);
            return decode;
        }

        public static String s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        public static void t(byte[] bArr, int i6, int i7) {
            byte b6 = bArr[i6];
            bArr[i6] = bArr[i7];
            bArr[i7] = b6;
        }

        @Override // v1.b.a
        public Object b() {
            UUID uuid = this.f19329f;
            return new C2161a.C0255a(uuid, o.a(uuid, this.f19330g), q(this.f19330g));
        }

        @Override // v1.b.a
        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // v1.b.a
        public void h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f19328e = false;
            }
        }

        @Override // v1.b.a
        public void n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f19328e = true;
                this.f19329f = UUID.fromString(s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // v1.b.a
        public void o(XmlPullParser xmlPullParser) {
            if (this.f19328e) {
                this.f19330g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d extends a {

        /* renamed from: e, reason: collision with root package name */
        public q f19331e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        public static List q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] Q5 = AbstractC1117K.Q(str);
                byte[][] j6 = AbstractC1122d.j(Q5);
                if (j6 == null) {
                    arrayList.add(Q5);
                    return arrayList;
                }
                Collections.addAll(arrayList, j6);
            }
            return arrayList;
        }

        public static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // v1.b.a
        public Object b() {
            return this.f19331e;
        }

        @Override // v1.b.a
        public void n(XmlPullParser xmlPullParser) {
            int i6;
            q.b bVar = new q.b();
            String r6 = r(m(xmlPullParser, "FourCC"));
            int intValue = ((Integer) c("Type")).intValue();
            if (intValue == 2) {
                bVar.Q("video/mp4").v0(k(xmlPullParser, "MaxWidth")).Y(k(xmlPullParser, "MaxHeight")).b0(q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")));
            } else if (intValue == 1) {
                if (r6 == null) {
                    r6 = "audio/mp4a-latm";
                }
                int k6 = k(xmlPullParser, "Channels");
                int k7 = k(xmlPullParser, "SamplingRate");
                List q6 = q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (q6.isEmpty() && "audio/mp4a-latm".equals(r6)) {
                    q6 = Collections.singletonList(AbstractC0299a.a(k7, k6));
                }
                bVar.Q("audio/mp4").N(k6).p0(k7).b0(q6);
            } else if (intValue == 3) {
                String str = (String) c("Subtype");
                if (str != null) {
                    if (str.equals("CAPT")) {
                        i6 = 64;
                    } else if (str.equals("DESC")) {
                        i6 = 1024;
                    }
                    bVar.Q("application/mp4").m0(i6);
                }
                i6 = 0;
                bVar.Q("application/mp4").m0(i6);
            } else {
                bVar.Q("application/mp4");
            }
            this.f19331e = bVar.a0(xmlPullParser.getAttributeValue(null, "Index")).c0((String) c("Name")).o0(r6).M(k(xmlPullParser, "Bitrate")).e0((String) c("Language")).K();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class e extends a {

        /* renamed from: e, reason: collision with root package name */
        public final List f19332e;

        /* renamed from: f, reason: collision with root package name */
        public int f19333f;

        /* renamed from: g, reason: collision with root package name */
        public int f19334g;

        /* renamed from: h, reason: collision with root package name */
        public long f19335h;

        /* renamed from: i, reason: collision with root package name */
        public long f19336i;

        /* renamed from: j, reason: collision with root package name */
        public long f19337j;

        /* renamed from: k, reason: collision with root package name */
        public int f19338k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f19339l;

        /* renamed from: m, reason: collision with root package name */
        public C2161a.C0255a f19340m;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f19338k = -1;
            this.f19340m = null;
            this.f19332e = new LinkedList();
        }

        @Override // v1.b.a
        public void a(Object obj) {
            if (obj instanceof C2161a.b) {
                this.f19332e.add((C2161a.b) obj);
            } else if (obj instanceof C2161a.C0255a) {
                AbstractC1119a.g(this.f19340m == null);
                this.f19340m = (C2161a.C0255a) obj;
            }
        }

        @Override // v1.b.a
        public Object b() {
            int size = this.f19332e.size();
            C2161a.b[] bVarArr = new C2161a.b[size];
            this.f19332e.toArray(bVarArr);
            if (this.f19340m != null) {
                C2161a.C0255a c0255a = this.f19340m;
                C0841m c0841m = new C0841m(new C0841m.b(c0255a.f19304a, "video/mp4", c0255a.f19305b));
                for (int i6 = 0; i6 < size; i6++) {
                    C2161a.b bVar = bVarArr[i6];
                    int i7 = bVar.f19307a;
                    if (i7 == 2 || i7 == 1) {
                        q[] qVarArr = bVar.f19316j;
                        for (int i8 = 0; i8 < qVarArr.length; i8++) {
                            qVarArr[i8] = qVarArr[i8].a().U(c0841m).K();
                        }
                    }
                }
            }
            return new C2161a(this.f19333f, this.f19334g, this.f19335h, this.f19336i, this.f19337j, this.f19338k, this.f19339l, this.f19340m, bVarArr);
        }

        @Override // v1.b.a
        public void n(XmlPullParser xmlPullParser) {
            this.f19333f = k(xmlPullParser, "MajorVersion");
            this.f19334g = k(xmlPullParser, "MinorVersion");
            this.f19335h = j(xmlPullParser, "TimeScale", 10000000L);
            this.f19336i = l(xmlPullParser, "Duration");
            this.f19337j = j(xmlPullParser, "DVRWindowLength", 0L);
            this.f19338k = i(xmlPullParser, "LookaheadCount", -1);
            this.f19339l = g(xmlPullParser, "IsLive", false);
            p("TimeScale", Long.valueOf(this.f19335h));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class f extends a {

        /* renamed from: e, reason: collision with root package name */
        public final String f19341e;

        /* renamed from: f, reason: collision with root package name */
        public final List f19342f;

        /* renamed from: g, reason: collision with root package name */
        public int f19343g;

        /* renamed from: h, reason: collision with root package name */
        public String f19344h;

        /* renamed from: i, reason: collision with root package name */
        public long f19345i;

        /* renamed from: j, reason: collision with root package name */
        public String f19346j;

        /* renamed from: k, reason: collision with root package name */
        public String f19347k;

        /* renamed from: l, reason: collision with root package name */
        public int f19348l;

        /* renamed from: m, reason: collision with root package name */
        public int f19349m;

        /* renamed from: n, reason: collision with root package name */
        public int f19350n;

        /* renamed from: o, reason: collision with root package name */
        public int f19351o;

        /* renamed from: p, reason: collision with root package name */
        public String f19352p;

        /* renamed from: q, reason: collision with root package name */
        public ArrayList f19353q;

        /* renamed from: r, reason: collision with root package name */
        public long f19354r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f19341e = str;
            this.f19342f = new LinkedList();
        }

        @Override // v1.b.a
        public void a(Object obj) {
            if (obj instanceof q) {
                this.f19342f.add((q) obj);
            }
        }

        @Override // v1.b.a
        public Object b() {
            q[] qVarArr = new q[this.f19342f.size()];
            this.f19342f.toArray(qVarArr);
            return new C2161a.b(this.f19341e, this.f19347k, this.f19343g, this.f19344h, this.f19345i, this.f19346j, this.f19348l, this.f19349m, this.f19350n, this.f19351o, this.f19352p, qVarArr, this.f19353q, this.f19354r);
        }

        @Override // v1.b.a
        public boolean d(String str) {
            return "c".equals(str);
        }

        @Override // v1.b.a
        public void n(XmlPullParser xmlPullParser) {
            if ("c".equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }

        public final void q(XmlPullParser xmlPullParser) {
            int s6 = s(xmlPullParser);
            this.f19343g = s6;
            p("Type", Integer.valueOf(s6));
            if (this.f19343g == 3) {
                this.f19344h = m(xmlPullParser, "Subtype");
            } else {
                this.f19344h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            p("Subtype", this.f19344h);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Name");
            this.f19346j = attributeValue;
            p("Name", attributeValue);
            this.f19347k = m(xmlPullParser, "Url");
            this.f19348l = i(xmlPullParser, "MaxWidth", -1);
            this.f19349m = i(xmlPullParser, "MaxHeight", -1);
            this.f19350n = i(xmlPullParser, "DisplayWidth", -1);
            this.f19351o = i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.f19352p = attributeValue2;
            p("Language", attributeValue2);
            long i6 = i(xmlPullParser, "TimeScale", -1);
            this.f19345i = i6;
            if (i6 == -1) {
                this.f19345i = ((Long) c("TimeScale")).longValue();
            }
            this.f19353q = new ArrayList();
        }

        public final void r(XmlPullParser xmlPullParser) {
            int size = this.f19353q.size();
            long j6 = j(xmlPullParser, "t", -9223372036854775807L);
            int i6 = 1;
            if (j6 == -9223372036854775807L) {
                if (size == 0) {
                    j6 = 0;
                } else {
                    if (this.f19354r == -1) {
                        throw z.c("Unable to infer start time", null);
                    }
                    j6 = this.f19354r + ((Long) this.f19353q.get(size - 1)).longValue();
                }
            }
            this.f19353q.add(Long.valueOf(j6));
            this.f19354r = j(xmlPullParser, "d", -9223372036854775807L);
            long j7 = j(xmlPullParser, "r", 1L);
            if (j7 > 1 && this.f19354r == -9223372036854775807L) {
                throw z.c("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j8 = i6;
                if (j8 >= j7) {
                    return;
                }
                this.f19353q.add(Long.valueOf((this.f19354r * j8) + j6));
                i6++;
            }
        }

        public final int s(XmlPullParser xmlPullParser) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new C0256b("Type");
            }
            if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            }
            if ("video".equalsIgnoreCase(attributeValue)) {
                return 2;
            }
            if ("text".equalsIgnoreCase(attributeValue)) {
                return 3;
            }
            throw z.c("Invalid key value[" + attributeValue + "]", null);
        }
    }

    public b() {
        try {
            this.f19323a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e6) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e6);
        }
    }

    @Override // A1.n.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2161a a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f19323a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (C2161a) new e(null, uri.toString()).f(newPullParser);
        } catch (XmlPullParserException e6) {
            throw z.c(null, e6);
        }
    }
}
