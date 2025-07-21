package t1;

import E1.O;
import E1.r;
import Z0.z;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1143y;
import c1.C1144z;
import s1.C2044d;
import s1.C2047g;
import z6.y;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public final C2047g f18996a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18997b;

    /* renamed from: c, reason: collision with root package name */
    public O f18998c;

    /* renamed from: d, reason: collision with root package name */
    public long f18999d;

    /* renamed from: e, reason: collision with root package name */
    public int f19000e;

    /* renamed from: f, reason: collision with root package name */
    public int f19001f;

    /* renamed from: g, reason: collision with root package name */
    public long f19002g;

    /* renamed from: h, reason: collision with root package name */
    public long f19003h;

    public h(C2047g c2047g) {
        this.f18996a = c2047g;
        try {
            this.f18997b = e(c2047g.f18808d);
            this.f18999d = -9223372036854775807L;
            this.f19000e = -1;
            this.f19001f = 0;
            this.f19002g = 0L;
            this.f19003h = -9223372036854775807L;
        } catch (z e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public static int e(y yVar) {
        String str = (String) yVar.get("config");
        int i6 = 0;
        i6 = 0;
        if (str != null && str.length() % 2 == 0) {
            C1143y c1143y = new C1143y(AbstractC1117K.Q(str));
            int h6 = c1143y.h(1);
            if (h6 != 0) {
                throw z.b("unsupported audio mux version: " + h6, null);
            }
            AbstractC1119a.b(c1143y.h(1) == 1, "Only supports allStreamsSameTimeFraming.");
            int h7 = c1143y.h(6);
            AbstractC1119a.b(c1143y.h(4) == 0, "Only suppors one program.");
            AbstractC1119a.b(c1143y.h(3) == 0, "Only suppors one layer.");
            i6 = h7;
        }
        return i6 + 1;
    }

    private void f() {
        ((O) AbstractC1119a.e(this.f18998c)).f(this.f19003h, 1, this.f19001f, 0, null);
        this.f19001f = 0;
        this.f19003h = -9223372036854775807L;
    }

    @Override // t1.k
    public void a(long j6, long j7) {
        this.f18999d = j6;
        this.f19001f = 0;
        this.f19002g = j7;
    }

    @Override // t1.k
    public void b(long j6, int i6) {
        AbstractC1119a.g(this.f18999d == -9223372036854775807L);
        this.f18999d = j6;
    }

    @Override // t1.k
    public void c(C1144z c1144z, long j6, int i6, boolean z6) {
        AbstractC1119a.i(this.f18998c);
        int b6 = C2044d.b(this.f19000e);
        if (this.f19001f > 0 && b6 < i6) {
            f();
        }
        for (int i7 = 0; i7 < this.f18997b; i7++) {
            int i8 = 0;
            while (c1144z.f() < c1144z.g()) {
                int G6 = c1144z.G();
                i8 += G6;
                if (G6 != 255) {
                    break;
                }
            }
            this.f18998c.a(c1144z, i8);
            this.f19001f += i8;
        }
        this.f19003h = m.a(this.f19002g, j6, this.f18999d, this.f18996a.f18806b);
        if (z6) {
            f();
        }
        this.f19000e = i6;
    }

    @Override // t1.k
    public void d(r rVar, int i6) {
        O a6 = rVar.a(i6, 2);
        this.f18998c = a6;
        ((O) AbstractC1117K.i(a6)).e(this.f18996a.f18807c);
    }
}
