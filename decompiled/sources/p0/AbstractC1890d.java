package p0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m0.AbstractC1793g;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: p0.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1890d {

    /* renamed from: p0.d$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static int a(TypedArray typedArray, int i6) {
            return typedArray.getType(i6);
        }
    }

    /* renamed from: p0.d$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
    }

    /* renamed from: p0.d$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final C0232d[] f18085a;

        public c(C0232d[] c0232dArr) {
            this.f18085a = c0232dArr;
        }

        public C0232d[] a() {
            return this.f18085a;
        }
    }

    /* renamed from: p0.d$d, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0232d {

        /* renamed from: a, reason: collision with root package name */
        public final String f18086a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18087b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f18088c;

        /* renamed from: d, reason: collision with root package name */
        public final String f18089d;

        /* renamed from: e, reason: collision with root package name */
        public final int f18090e;

        /* renamed from: f, reason: collision with root package name */
        public final int f18091f;

        public C0232d(String str, int i6, boolean z6, String str2, int i7, int i8) {
            this.f18086a = str;
            this.f18087b = i6;
            this.f18088c = z6;
            this.f18089d = str2;
            this.f18090e = i7;
            this.f18091f = i8;
        }

        public String a() {
            return this.f18086a;
        }

        public int b() {
            return this.f18091f;
        }

        public int c() {
            return this.f18090e;
        }

        public String d() {
            return this.f18089d;
        }

        public int e() {
            return this.f18087b;
        }

        public boolean f() {
            return this.f18088c;
        }
    }

    /* renamed from: p0.d$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e implements b {

        /* renamed from: a, reason: collision with root package name */
        public final w0.e f18092a;

        /* renamed from: b, reason: collision with root package name */
        public final w0.e f18093b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18094c;

        /* renamed from: d, reason: collision with root package name */
        public final int f18095d;

        /* renamed from: e, reason: collision with root package name */
        public final String f18096e;

        public e(w0.e eVar, w0.e eVar2, int i6, int i7, String str) {
            this.f18092a = eVar;
            this.f18093b = eVar2;
            this.f18095d = i6;
            this.f18094c = i7;
            this.f18096e = str;
        }

        public w0.e a() {
            return this.f18093b;
        }

        public int b() {
            return this.f18095d;
        }

        public w0.e c() {
            return this.f18092a;
        }

        public String d() {
            return this.f18096e;
        }

        public int e() {
            return this.f18094c;
        }
    }

    public static int a(TypedArray typedArray, int i6) {
        return a.a(typedArray, i6);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i6) {
        if (i6 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i6);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i7 = 0; i7 < obtainTypedArray.length(); i7++) {
                    int resourceId = obtainTypedArray.getResourceId(i7, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i6)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static b d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    public static b e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC1793g.f17209h);
        String string = obtainAttributes.getString(AbstractC1793g.f17210i);
        String string2 = obtainAttributes.getString(AbstractC1793g.f17215n);
        String string3 = obtainAttributes.getString(AbstractC1793g.f17216o);
        String string4 = obtainAttributes.getString(AbstractC1793g.f17212k);
        int resourceId = obtainAttributes.getResourceId(AbstractC1793g.f17211j, 0);
        int integer = obtainAttributes.getInteger(AbstractC1793g.f17213l, 1);
        int integer2 = obtainAttributes.getInteger(AbstractC1793g.f17214m, 500);
        String string5 = obtainAttributes.getString(AbstractC1793g.f17217p);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            List c6 = c(resources, resourceId);
            return new e(new w0.e(string, string2, string3, c6), string4 != null ? new w0.e(string, string2, string4, c6) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((C0232d[]) arrayList.toArray(new C0232d[0]));
    }

    public static C0232d f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC1793g.f17218q);
        int i6 = AbstractC1793g.f17227z;
        if (!obtainAttributes.hasValue(i6)) {
            i6 = AbstractC1793g.f17220s;
        }
        int i7 = obtainAttributes.getInt(i6, 400);
        int i8 = AbstractC1793g.f17225x;
        if (!obtainAttributes.hasValue(i8)) {
            i8 = AbstractC1793g.f17221t;
        }
        boolean z6 = 1 == obtainAttributes.getInt(i8, 0);
        int i9 = AbstractC1793g.f17199A;
        if (!obtainAttributes.hasValue(i9)) {
            i9 = AbstractC1793g.f17222u;
        }
        int i10 = AbstractC1793g.f17226y;
        if (!obtainAttributes.hasValue(i10)) {
            i10 = AbstractC1793g.f17223v;
        }
        String string = obtainAttributes.getString(i10);
        int i11 = obtainAttributes.getInt(i9, 0);
        int i12 = AbstractC1793g.f17224w;
        if (!obtainAttributes.hasValue(i12)) {
            i12 = AbstractC1793g.f17219r;
        }
        int resourceId = obtainAttributes.getResourceId(i12, 0);
        String string2 = obtainAttributes.getString(i12);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0232d(string2, i7, z6, string, i11, resourceId);
    }

    public static void g(XmlPullParser xmlPullParser) {
        int i6 = 1;
        while (i6 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i6++;
            } else if (next == 3) {
                i6--;
            }
        }
    }

    public static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
