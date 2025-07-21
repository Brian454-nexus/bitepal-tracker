package g2;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import b1.C1076a;
import b2.C1081e;
import b2.s;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1144z;
import c1.InterfaceC1125g;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import y6.e;
import z6.w;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1365a implements s {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f14841d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f14842e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f14843a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f14844b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final C1144z f14845c = new C1144z();

    private Charset f(C1144z c1144z) {
        Charset O5 = c1144z.O();
        return O5 != null ? O5 : e.c;
    }

    public static float g(int i6) {
        if (i6 == 0) {
            return 0.08f;
        }
        if (i6 == 1) {
            return 0.5f;
        }
        if (i6 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    public static long h(Matcher matcher, int i6) {
        String group = matcher.group(i6 + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 3600000 : 0L) + (Long.parseLong((String) AbstractC1119a.e(matcher.group(i6 + 2))) * 60000) + (Long.parseLong((String) AbstractC1119a.e(matcher.group(i6 + 3))) * 1000);
        String group2 = matcher.group(i6 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    @Override // b2.s
    public void c(byte[] bArr, int i6, int i7, s.b bVar, InterfaceC1125g interfaceC1125g) {
        long j6;
        String s6;
        String str;
        this.f14845c.R(bArr, i6 + i7);
        this.f14845c.T(i6);
        Charset f6 = f(this.f14845c);
        long j7 = -9223372036854775807L;
        ArrayList arrayList = (bVar.f10493a == -9223372036854775807L || !bVar.f10494b) ? null : new ArrayList();
        while (true) {
            String s7 = this.f14845c.s(f6);
            if (s7 == null) {
                break;
            }
            if (s7.length() != 0) {
                try {
                    Integer.parseInt(s7);
                    s6 = this.f14845c.s(f6);
                } catch (NumberFormatException unused) {
                    j6 = j7;
                    AbstractC1133o.h("SubripParser", "Skipping invalid index: " + s7);
                }
                if (s6 == null) {
                    AbstractC1133o.h("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = f14841d.matcher(s6);
                if (matcher.matches()) {
                    long h6 = h(matcher, 1);
                    long h7 = h(matcher, 6);
                    int i8 = 0;
                    this.f14843a.setLength(0);
                    this.f14844b.clear();
                    String s8 = this.f14845c.s(f6);
                    while (!TextUtils.isEmpty(s8)) {
                        if (this.f14843a.length() > 0) {
                            this.f14843a.append("<br>");
                        }
                        this.f14843a.append(i(s8, this.f14844b));
                        s8 = this.f14845c.s(f6);
                    }
                    Spanned fromHtml = Html.fromHtml(this.f14843a.toString());
                    while (true) {
                        if (i8 >= this.f14844b.size()) {
                            str = null;
                            break;
                        }
                        str = (String) this.f14844b.get(i8);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                    j6 = j7;
                    long j8 = bVar.f10493a;
                    if (j8 == j6 || h6 >= j8) {
                        interfaceC1125g.accept(new C1081e(w.y(e(fromHtml, str)), h6, h7 - h6));
                    } else if (arrayList != null) {
                        arrayList.add(new C1081e(w.y(e(fromHtml, str)), h6, h7 - h6));
                    }
                } else {
                    j6 = j7;
                    AbstractC1133o.h("SubripParser", "Skipping invalid timing: " + s6);
                }
                j7 = j6;
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC1125g.accept((C1081e) it.next());
            }
        }
    }

    @Override // b2.s
    public int d() {
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final C1076a e(Spanned spanned, String str) {
        char c6;
        char c7;
        C1076a.b o6 = new C1076a.b().o(spanned);
        if (str == null) {
            return o6.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c6 = 0;
                    break;
                }
                c6 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c6 = 6;
                    break;
                }
                c6 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c6 = 3;
                    break;
                }
                c6 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c6 = 1;
                    break;
                }
                c6 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c6 = 7;
                    break;
                }
                c6 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c6 = 4;
                    break;
                }
                c6 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c6 = 2;
                    break;
                }
                c6 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c6 = '\b';
                    break;
                }
                c6 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c6 = 5;
                    break;
                }
                c6 = 65535;
                break;
            default:
                c6 = 65535;
                break;
        }
        if (c6 == 0 || c6 == 1 || c6 == 2) {
            o6.l(0);
        } else if (c6 == 3 || c6 == 4 || c6 == 5) {
            o6.l(2);
        } else {
            o6.l(1);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c7 = 6;
                    break;
                }
                c7 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c7 = 7;
                    break;
                }
                c7 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c7 = '\b';
                    break;
                }
                c7 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        if (c7 == 0 || c7 == 1 || c7 == 2) {
            o6.i(2);
        } else if (c7 == 3 || c7 == 4 || c7 == 5) {
            o6.i(0);
        } else {
            o6.i(1);
        }
        return o6.k(g(o6.d())).h(g(o6.c()), 0).a();
    }

    public final String i(String str, ArrayList arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = f14842e.matcher(trim);
        int i6 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i6;
            int length = group.length();
            sb.replace(start, start + length, "");
            i6 += length;
        }
        return sb.toString();
    }
}
