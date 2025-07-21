package G1;

import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1738a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1739b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1740c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1741d;

    public c(int i6, int i7, int i8, int i9) {
        this.f1738a = i6;
        this.f1739b = i7;
        this.f1740c = i8;
        this.f1741d = i9;
    }

    public static c b(C1144z c1144z) {
        int t6 = c1144z.t();
        c1144z.U(8);
        int t7 = c1144z.t();
        int t8 = c1144z.t();
        c1144z.U(4);
        int t9 = c1144z.t();
        c1144z.U(12);
        return new c(t6, t7, t8, t9);
    }

    public boolean a() {
        return (this.f1739b & 16) == 16;
    }

    @Override // G1.a
    public int getType() {
        return 1751742049;
    }
}
