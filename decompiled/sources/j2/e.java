package j2;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import b1.C1076a;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1144z;
import j2.e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f16169a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f16170b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f16171c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f16172d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final Comparator f16173c = new Comparator() { // from class: j2.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                compare = Integer.compare(((e.b) obj).f16174a.f16177b, ((e.b) obj2).f16174a.f16177b);
                return compare;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final c f16174a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16175b;

        public b(c cVar, int i6) {
            this.f16174a = cVar;
            this.f16175b = i6;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f16176a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16177b;

        /* renamed from: c, reason: collision with root package name */
        public final String f16178c;

        /* renamed from: d, reason: collision with root package name */
        public final Set f16179d;

        public c(String str, int i6, String str2, Set set) {
            this.f16177b = i6;
            this.f16176a = str;
            this.f16178c = str2;
            this.f16179d = set;
        }

        public static c a(String str, int i6) {
            String str2;
            String trim = str.trim();
            AbstractC1119a.a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] d12 = AbstractC1117K.d1(trim, "\\.");
            String str3 = d12[0];
            HashSet hashSet = new HashSet();
            for (int i7 = 1; i7 < d12.length; i7++) {
                hashSet.add(d12[i7]);
            }
            return new c(str3, i6, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.EMPTY_SET);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final int f16180a;

        /* renamed from: b, reason: collision with root package name */
        public final C1646c f16181b;

        public d(int i6, C1646c c1646c) {
            this.f16180a = i6;
            this.f16181b = c1646c;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f16180a, dVar.f16180a);
        }
    }

    /* renamed from: j2.e$e, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0210e {

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f16184c;

        /* renamed from: a, reason: collision with root package name */
        public long f16182a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f16183b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f16185d = 2;

        /* renamed from: e, reason: collision with root package name */
        public float f16186e = -3.4028235E38f;

        /* renamed from: f, reason: collision with root package name */
        public int f16187f = 1;

        /* renamed from: g, reason: collision with root package name */
        public int f16188g = 0;

        /* renamed from: h, reason: collision with root package name */
        public float f16189h = -3.4028235E38f;

        /* renamed from: i, reason: collision with root package name */
        public int f16190i = IntCompanionObject.MIN_VALUE;

        /* renamed from: j, reason: collision with root package name */
        public float f16191j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        public int f16192k = IntCompanionObject.MIN_VALUE;

        public static float b(float f6, int i6) {
            if (f6 == -3.4028235E38f || i6 != 0 || (f6 >= 0.0f && f6 <= 1.0f)) {
                return f6 != -3.4028235E38f ? f6 : i6 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        public static Layout.Alignment c(int i6) {
            if (i6 != 1) {
                if (i6 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i6 != 3) {
                    if (i6 != 4) {
                        if (i6 != 5) {
                            AbstractC1133o.h("WebvttCueParser", "Unknown textAlignment: " + i6);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        public static float d(int i6, float f6) {
            if (i6 == 0) {
                return 1.0f - f6;
            }
            if (i6 == 1) {
                return f6 <= 0.5f ? f6 * 2.0f : (1.0f - f6) * 2.0f;
            }
            if (i6 == 2) {
                return f6;
            }
            throw new IllegalStateException(String.valueOf(i6));
        }

        public static float e(int i6) {
            if (i6 != 4) {
                return i6 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        public static int f(int i6) {
            if (i6 == 1) {
                return 0;
            }
            if (i6 == 3) {
                return 2;
            }
            if (i6 != 4) {
                return i6 != 5 ? 1 : 2;
            }
            return 0;
        }

        public j2.d a() {
            return new j2.d(g().a(), this.f16182a, this.f16183b);
        }

        public C1076a.b g() {
            float f6 = this.f16189h;
            if (f6 == -3.4028235E38f) {
                f6 = e(this.f16185d);
            }
            int i6 = this.f16190i;
            if (i6 == Integer.MIN_VALUE) {
                i6 = f(this.f16185d);
            }
            C1076a.b r6 = new C1076a.b().p(c(this.f16185d)).h(b(this.f16186e, this.f16187f), this.f16187f).i(this.f16188g).k(f6).l(i6).n(Math.min(this.f16191j, d(i6, f6))).r(this.f16192k);
            CharSequence charSequence = this.f16184c;
            if (charSequence != null) {
                r6.o(charSequence);
            }
            return r6;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f16171c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f16172d = Collections.unmodifiableMap(hashMap2);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Set set, int i6, int i7) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = f16171c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str)).intValue()), i6, i7, 33);
            } else {
                Map map2 = f16172d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str)).intValue()), i6, i7, 33);
                }
            }
        }
    }

    public static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals("gt")) {
                    c6 = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c6 = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c6 = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c6 = 3;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                spannableStringBuilder.append('>');
                return;
            case 1:
                spannableStringBuilder.append('<');
                return;
            case 2:
                spannableStringBuilder.append('&');
                return;
            case 3:
                spannableStringBuilder.append(' ');
                return;
            default:
                AbstractC1133o.h("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List list, List list2) {
        int i6 = i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f16173c);
        int i7 = cVar.f16177b;
        int i8 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if ("rt".equals(((b) arrayList.get(i9)).f16174a.f16176a)) {
                b bVar = (b) arrayList.get(i9);
                int g6 = g(i(list2, str, bVar.f16174a), i6, 1);
                int i10 = bVar.f16174a.f16177b - i8;
                int i11 = bVar.f16175b - i8;
                CharSequence subSequence = spannableStringBuilder.subSequence(i10, i11);
                spannableStringBuilder.delete(i10, i11);
                spannableStringBuilder.setSpan(new b1.e(subSequence.toString(), g6), i7, i10, 33);
                i8 += subSequence.length();
                i7 = i10;
            }
        }
    }

    public static void d(String str, c cVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i6 = cVar.f16177b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f16176a;
        str2.getClass();
        char c6 = 65535;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c6 = 0;
                    break;
                }
                break;
            case 98:
                if (str2.equals("b")) {
                    c6 = 1;
                    break;
                }
                break;
            case 99:
                if (str2.equals("c")) {
                    c6 = 2;
                    break;
                }
                break;
            case 105:
                if (str2.equals("i")) {
                    c6 = 3;
                    break;
                }
                break;
            case 117:
                if (str2.equals("u")) {
                    c6 = 4;
                    break;
                }
                break;
            case 118:
                if (str2.equals("v")) {
                    c6 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c6 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c6 = 7;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i6, length, 33);
                break;
            case 2:
                a(spannableStringBuilder, cVar.f16179d, i6, length);
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i6, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i6, length, 33);
                break;
            case 7:
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List h6 = h(list2, str, cVar);
        for (int i7 = 0; i7 < h6.size(); i7++) {
            e(spannableStringBuilder, ((d) h6.get(i7)).f16181b, i6, length);
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, C1646c c1646c, int i6, int i7) {
        if (c1646c == null) {
            return;
        }
        if (c1646c.i() != -1) {
            b1.f.b(spannableStringBuilder, new StyleSpan(c1646c.i()), i6, i7, 33);
        }
        if (c1646c.l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i6, i7, 33);
        }
        if (c1646c.m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i6, i7, 33);
        }
        if (c1646c.k()) {
            b1.f.b(spannableStringBuilder, new ForegroundColorSpan(c1646c.c()), i6, i7, 33);
        }
        if (c1646c.j()) {
            b1.f.b(spannableStringBuilder, new BackgroundColorSpan(c1646c.a()), i6, i7, 33);
        }
        if (c1646c.d() != null) {
            b1.f.b(spannableStringBuilder, new TypefaceSpan(c1646c.d()), i6, i7, 33);
        }
        int f6 = c1646c.f();
        if (f6 == 1) {
            b1.f.b(spannableStringBuilder, new AbsoluteSizeSpan((int) c1646c.e(), true), i6, i7, 33);
        } else if (f6 == 2) {
            b1.f.b(spannableStringBuilder, new RelativeSizeSpan(c1646c.e()), i6, i7, 33);
        } else if (f6 == 3) {
            b1.f.b(spannableStringBuilder, new RelativeSizeSpan(c1646c.e() / 100.0f), i6, i7, 33);
        }
        if (c1646c.b()) {
            spannableStringBuilder.setSpan(new b1.d(), i6, i7, 33);
        }
    }

    public static int f(String str, int i6) {
        int indexOf = str.indexOf(62, i6);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    public static int g(int i6, int i7, int i8) {
        if (i6 != -1) {
            return i6;
        }
        if (i7 != -1) {
            return i7;
        }
        if (i8 != -1) {
            return i8;
        }
        throw new IllegalArgumentException();
    }

    public static List h(List list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < list.size(); i6++) {
            C1646c c1646c = (C1646c) list.get(i6);
            int h6 = c1646c.h(str, cVar.f16176a, cVar.f16179d, cVar.f16178c);
            if (h6 > 0) {
                arrayList.add(new d(h6, c1646c));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int i(List list, String str, c cVar) {
        List h6 = h(list, str, cVar);
        for (int i6 = 0; i6 < h6.size(); i6++) {
            C1646c c1646c = ((d) h6.get(i6)).f16181b;
            if (c1646c.g() != -1) {
                return c1646c.g();
            }
        }
        return -1;
    }

    public static String j(String str) {
        String trim = str.trim();
        AbstractC1119a.a(!trim.isEmpty());
        return AbstractC1117K.e1(trim, "[ \\.]")[0];
    }

    public static boolean k(String str) {
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case 98:
                if (str.equals("b")) {
                    c6 = 0;
                    break;
                }
                break;
            case 99:
                if (str.equals("c")) {
                    c6 = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals("i")) {
                    c6 = 2;
                    break;
                }
                break;
            case 117:
                if (str.equals("u")) {
                    c6 = 3;
                    break;
                }
                break;
            case 118:
                if (str.equals("v")) {
                    c6 = 4;
                    break;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    c6 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c6 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str.equals("ruby")) {
                    c6 = 7;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    public static C1076a l(CharSequence charSequence) {
        C0210e c0210e = new C0210e();
        c0210e.f16184c = charSequence;
        return c0210e.g().a();
    }

    public static j2.d m(C1144z c1144z, List list) {
        String r6 = c1144z.r();
        if (r6 == null) {
            return null;
        }
        Pattern pattern = f16169a;
        Matcher matcher = pattern.matcher(r6);
        if (matcher.matches()) {
            return n(null, matcher, c1144z, list);
        }
        String r7 = c1144z.r();
        if (r7 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(r7);
        if (matcher2.matches()) {
            return n(r6.trim(), matcher2, c1144z, list);
        }
        return null;
    }

    public static j2.d n(String str, Matcher matcher, C1144z c1144z, List list) {
        C0210e c0210e = new C0210e();
        try {
            c0210e.f16182a = h.d((String) AbstractC1119a.e(matcher.group(1)));
            c0210e.f16183b = h.d((String) AbstractC1119a.e(matcher.group(2)));
            p((String) AbstractC1119a.e(matcher.group(3)), c0210e);
            StringBuilder sb = new StringBuilder();
            String r6 = c1144z.r();
            while (!TextUtils.isEmpty(r6)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(r6.trim());
                r6 = c1144z.r();
            }
            c0210e.f16184c = q(str, sb.toString(), list);
            return c0210e.a();
        } catch (NumberFormatException unused) {
            AbstractC1133o.h("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static C1076a.b o(String str) {
        C0210e c0210e = new C0210e();
        p(str, c0210e);
        return c0210e.g();
    }

    public static void p(String str, C0210e c0210e) {
        Matcher matcher = f16170b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) AbstractC1119a.e(matcher.group(1));
            String str3 = (String) AbstractC1119a.e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    s(str3, c0210e);
                } else if ("align".equals(str2)) {
                    c0210e.f16185d = v(str3);
                } else if ("position".equals(str2)) {
                    u(str3, c0210e);
                } else if ("size".equals(str2)) {
                    c0210e.f16191j = h.c(str3);
                } else if ("vertical".equals(str2)) {
                    c0210e.f16192k = w(str3);
                } else {
                    AbstractC1133o.h("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                AbstractC1133o.h("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static SpannedString q(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        while (i6 < str2.length()) {
            char charAt = str2.charAt(i6);
            if (charAt == '&') {
                i6++;
                int indexOf = str2.indexOf(59, i6);
                int indexOf2 = str2.indexOf(32, i6);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    b(str2.substring(i6, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i6 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i6++;
            } else {
                int i7 = i6 + 1;
                if (i7 < str2.length()) {
                    boolean z6 = str2.charAt(i7) == '/';
                    i7 = f(str2, i7);
                    int i8 = i7 - 2;
                    boolean z7 = str2.charAt(i8) == '/';
                    int i9 = i6 + (z6 ? 2 : 1);
                    if (!z7) {
                        i8 = i7 - 1;
                    }
                    String substring = str2.substring(i9, i8);
                    if (!substring.trim().isEmpty()) {
                        String j6 = j(substring);
                        if (k(j6)) {
                            if (!z6) {
                                if (!z7) {
                                    arrayDeque.push(c.a(substring, spannableStringBuilder.length()));
                                }
                            }
                            while (!arrayDeque.isEmpty()) {
                                c cVar = (c) arrayDeque.pop();
                                d(str, cVar, arrayList, spannableStringBuilder, list);
                                if (arrayDeque.isEmpty()) {
                                    arrayList.clear();
                                } else {
                                    arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                }
                                if (cVar.f16176a.equals(j6)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                i6 = i7;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static int r(String str) {
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c6 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c6 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c6 = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c6 = 3;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                AbstractC1133o.h("WebvttCueParser", "Invalid anchor value: " + str);
                return IntCompanionObject.MIN_VALUE;
        }
    }

    public static void s(String str, C0210e c0210e) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            c0210e.f16188g = r(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            c0210e.f16186e = h.c(str);
            c0210e.f16187f = 0;
        } else {
            c0210e.f16186e = Integer.parseInt(str);
            c0210e.f16187f = 1;
        }
    }

    public static int t(String str) {
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    c6 = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c6 = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c6 = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c6 = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c6 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c6 = 5;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
            case 5:
                return 0;
            case 1:
            case 3:
                return 1;
            case 2:
            case 4:
                return 2;
            default:
                AbstractC1133o.h("WebvttCueParser", "Invalid anchor value: " + str);
                return IntCompanionObject.MIN_VALUE;
        }
    }

    public static void u(String str, C0210e c0210e) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            c0210e.f16190i = t(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        c0210e.f16189h = h.c(str);
    }

    public static int v(String str) {
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c6 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c6 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c6 = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c6 = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c6 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c6 = 5;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 1;
            default:
                AbstractC1133o.h("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    public static int w(String str) {
        str.getClass();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        AbstractC1133o.h("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return IntCompanionObject.MIN_VALUE;
    }
}
