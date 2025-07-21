package h2;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import java.util.ArrayDeque;
import java.util.Map;

/* renamed from: h2.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1456f {
    public static void a(Spannable spannable, int i6, int i7, C1457g c1457g, C1453c c1453c, Map map, int i8) {
        C1453c e6;
        C1457g f6;
        int i9;
        if (c1457g.l() != -1) {
            spannable.setSpan(new StyleSpan(c1457g.l()), i6, i7, 33);
        }
        if (c1457g.s()) {
            spannable.setSpan(new StrikethroughSpan(), i6, i7, 33);
        }
        if (c1457g.t()) {
            spannable.setSpan(new UnderlineSpan(), i6, i7, 33);
        }
        if (c1457g.q()) {
            b1.f.b(spannable, new ForegroundColorSpan(c1457g.c()), i6, i7, 33);
        }
        if (c1457g.p()) {
            b1.f.b(spannable, new BackgroundColorSpan(c1457g.b()), i6, i7, 33);
        }
        if (c1457g.d() != null) {
            b1.f.b(spannable, new TypefaceSpan(c1457g.d()), i6, i7, 33);
        }
        if (c1457g.o() != null) {
            C1452b c1452b = (C1452b) AbstractC1119a.e(c1457g.o());
            int i10 = c1452b.f15227a;
            if (i10 == -1) {
                i10 = (i8 == 2 || i8 == 1) ? 3 : 1;
                i9 = 1;
            } else {
                i9 = c1452b.f15228b;
            }
            int i11 = c1452b.f15229c;
            if (i11 == -2) {
                i11 = 1;
            }
            b1.f.b(spannable, new b1.g(i10, i9, i11), i6, i7, 33);
        }
        int j6 = c1457g.j();
        if (j6 == 2) {
            C1453c d6 = d(c1453c, map);
            if (d6 != null && (e6 = e(d6, map)) != null) {
                if (e6.g() != 1 || e6.f(0).f15231b == null) {
                    AbstractC1133o.f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) AbstractC1117K.i(e6.f(0).f15231b);
                    C1457g f7 = f(e6.f15235f, e6.l(), map);
                    int i12 = f7 != null ? f7.i() : -1;
                    if (i12 == -1 && (f6 = f(d6.f15235f, d6.l(), map)) != null) {
                        i12 = f6.i();
                    }
                    spannable.setSpan(new b1.e(str, i12), i6, i7, 33);
                }
            }
        } else if (j6 == 3 || j6 == 4) {
            spannable.setSpan(new C1451a(), i6, i7, 33);
        }
        if (c1457g.n()) {
            b1.f.b(spannable, new b1.d(), i6, i7, 33);
        }
        int f8 = c1457g.f();
        if (f8 == 1) {
            b1.f.b(spannable, new AbsoluteSizeSpan((int) c1457g.e(), true), i6, i7, 33);
        } else if (f8 == 2) {
            b1.f.b(spannable, new RelativeSizeSpan(c1457g.e()), i6, i7, 33);
        } else {
            if (f8 != 3) {
                return;
            }
            b1.f.a(spannable, c1457g.e() / 100.0f, i6, i7, 33);
        }
    }

    public static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    public static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    public static C1453c d(C1453c c1453c, Map map) {
        while (c1453c != null) {
            C1457g f6 = f(c1453c.f15235f, c1453c.l(), map);
            if (f6 != null && f6.j() == 1) {
                return c1453c;
            }
            c1453c = c1453c.f15239j;
        }
        return null;
    }

    public static C1453c e(C1453c c1453c, Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c1453c);
        while (!arrayDeque.isEmpty()) {
            C1453c c1453c2 = (C1453c) arrayDeque.pop();
            C1457g f6 = f(c1453c2.f15235f, c1453c2.l(), map);
            if (f6 != null && f6.j() == 3) {
                return c1453c2;
            }
            for (int g6 = c1453c2.g() - 1; g6 >= 0; g6--) {
                arrayDeque.push(c1453c2.f(g6));
            }
        }
        return null;
    }

    public static C1457g f(C1457g c1457g, String[] strArr, Map map) {
        int i6 = 0;
        if (c1457g == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C1457g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C1457g c1457g2 = new C1457g();
                int length = strArr.length;
                while (i6 < length) {
                    c1457g2.a((C1457g) map.get(strArr[i6]));
                    i6++;
                }
                return c1457g2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return c1457g.a((C1457g) map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i6 < length2) {
                    c1457g.a((C1457g) map.get(strArr[i6]));
                    i6++;
                }
            }
        }
        return c1457g;
    }
}
