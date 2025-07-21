package E1;

import c1.C1144z;

/* renamed from: E1.n, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0312n {

    /* renamed from: a, reason: collision with root package name */
    public final int f1061a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1062b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1063c;

    public C0312n(int i6, int i7, String str) {
        this.f1061a = i6;
        this.f1062b = i7;
        this.f1063c = str;
    }

    public static C0312n a(C1144z c1144z) {
        String str;
        c1144z.U(2);
        int G6 = c1144z.G();
        int i6 = G6 >> 1;
        int G7 = ((c1144z.G() >> 3) & 31) | ((G6 & 1) << 5);
        if (i6 == 4 || i6 == 5 || i6 == 7) {
            str = "dvhe";
        } else if (i6 == 8) {
            str = "hev1";
        } else {
            if (i6 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i6);
        sb.append(G7 >= 10 ? "." : ".0");
        sb.append(G7);
        return new C0312n(i6, G7, sb.toString());
    }
}
