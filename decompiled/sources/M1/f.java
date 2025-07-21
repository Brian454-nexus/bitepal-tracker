package M1;

import M1.c;
import Z0.z;
import c1.AbstractC1118L;
import c1.AbstractC1133o;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import z6.w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f3400a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f3401b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f3402c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static c a(String str) {
        try {
            return b(str);
        } catch (z | NumberFormatException | XmlPullParserException unused) {
            AbstractC1133o.h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    public static c b(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!AbstractC1118L.f(newPullParser, "x:xmpmeta")) {
            throw z.a("Couldn't find xmp metadata", null);
        }
        w w6 = w.w();
        long j6 = -9223372036854775807L;
        do {
            newPullParser.next();
            if (AbstractC1118L.f(newPullParser, "rdf:Description")) {
                if (!d(newPullParser)) {
                    return null;
                }
                j6 = e(newPullParser);
                w6 = c(newPullParser);
            } else if (AbstractC1118L.f(newPullParser, "Container:Directory")) {
                w6 = f(newPullParser, "Container", "Item");
            } else if (AbstractC1118L.f(newPullParser, "GContainer:Directory")) {
                w6 = f(newPullParser, "GContainer", "GContainerItem");
            }
        } while (!AbstractC1118L.d(newPullParser, "x:xmpmeta"));
        if (w6.isEmpty()) {
            return null;
        }
        return new c(j6, w6);
    }

    public static w c(XmlPullParser xmlPullParser) {
        for (String str : f3402c) {
            String a6 = AbstractC1118L.a(xmlPullParser, str);
            if (a6 != null) {
                return w.z(new c.a("image/jpeg", "Primary", 0L, 0L), new c.a("video/mp4", "MotionPhoto", Long.parseLong(a6), 0L));
            }
        }
        return w.w();
    }

    public static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f3400a) {
            String a6 = AbstractC1118L.a(xmlPullParser, str);
            if (a6 != null) {
                return Integer.parseInt(a6) == 1;
            }
        }
        return false;
    }

    public static long e(XmlPullParser xmlPullParser) {
        for (String str : f3401b) {
            String a6 = AbstractC1118L.a(xmlPullParser, str);
            if (a6 != null) {
                long parseLong = Long.parseLong(a6);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    public static w f(XmlPullParser xmlPullParser, String str, String str2) {
        w.a o6 = w.o();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (AbstractC1118L.f(xmlPullParser, str3)) {
                String a6 = AbstractC1118L.a(xmlPullParser, str2 + ":Mime");
                String a7 = AbstractC1118L.a(xmlPullParser, str2 + ":Semantic");
                String a8 = AbstractC1118L.a(xmlPullParser, str2 + ":Length");
                String a9 = AbstractC1118L.a(xmlPullParser, str2 + ":Padding");
                if (a6 == null || a7 == null) {
                    return w.w();
                }
                o6.h(new c.a(a6, a7, a8 != null ? Long.parseLong(a8) : 0L, a9 != null ? Long.parseLong(a9) : 0L));
            }
        } while (!AbstractC1118L.d(xmlPullParser, str4));
        return o6.k();
    }
}
