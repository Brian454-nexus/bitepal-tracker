package h2;

import android.text.TextUtils;
import java.util.regex.Pattern;
import z6.A;

/* renamed from: h2.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1452b {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f15222d = Pattern.compile("\\s+");

    /* renamed from: e, reason: collision with root package name */
    public static final A f15223e = A.z("auto", "none");

    /* renamed from: f, reason: collision with root package name */
    public static final A f15224f = A.A("dot", "sesame", "circle");

    /* renamed from: g, reason: collision with root package name */
    public static final A f15225g = A.z("filled", "open");

    /* renamed from: h, reason: collision with root package name */
    public static final A f15226h = A.A("after", "before", "outside");

    /* renamed from: a, reason: collision with root package name */
    public final int f15227a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15228b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15229c;

    public C1452b(int i6, int i7, int i8) {
        this.f15227a = i6;
        this.f15228b = i7;
        this.f15229c = i8;
    }

    public static C1452b a(String str) {
        if (str == null) {
            return null;
        }
        String e6 = y6.c.e(str.trim());
        if (e6.isEmpty()) {
            return null;
        }
        return b(A.t(TextUtils.split(e6, f15222d)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
    
        if (r9.equals("dot") != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static h2.C1452b b(z6.A r9) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C1452b.b(z6.A):h2.b");
    }
}
