package K1;

import E1.C0302d;
import E1.O;
import K1.e;
import Z0.q;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f extends e {

    /* renamed from: b, reason: collision with root package name */
    public final C1144z f2986b;

    /* renamed from: c, reason: collision with root package name */
    public final C1144z f2987c;

    /* renamed from: d, reason: collision with root package name */
    public int f2988d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2989e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2990f;

    /* renamed from: g, reason: collision with root package name */
    public int f2991g;

    public f(O o6) {
        super(o6);
        this.f2986b = new C1144z(d1.d.f13379a);
        this.f2987c = new C1144z(4);
    }

    @Override // K1.e
    public boolean b(C1144z c1144z) {
        int G6 = c1144z.G();
        int i6 = (G6 >> 4) & 15;
        int i7 = G6 & 15;
        if (i7 == 7) {
            this.f2991g = i6;
            return i6 != 5;
        }
        throw new e.a("Video format not supported: " + i7);
    }

    @Override // K1.e
    public boolean c(C1144z c1144z, long j6) {
        int G6 = c1144z.G();
        long q6 = j6 + (c1144z.q() * 1000);
        if (G6 == 0 && !this.f2989e) {
            C1144z c1144z2 = new C1144z(new byte[c1144z.a()]);
            c1144z.l(c1144z2.e(), 0, c1144z.a());
            C0302d b6 = C0302d.b(c1144z2);
            this.f2988d = b6.f984b;
            this.f2985a.e(new q.b().o0("video/avc").O(b6.f994l).v0(b6.f985c).Y(b6.f986d).k0(b6.f993k).b0(b6.f983a).K());
            this.f2989e = true;
            return false;
        }
        if (G6 != 1 || !this.f2989e) {
            return false;
        }
        int i6 = this.f2991g == 1 ? 1 : 0;
        if (!this.f2990f && i6 == 0) {
            return false;
        }
        byte[] e6 = this.f2987c.e();
        e6[0] = 0;
        e6[1] = 0;
        e6[2] = 0;
        int i7 = 4 - this.f2988d;
        int i8 = 0;
        while (c1144z.a() > 0) {
            c1144z.l(this.f2987c.e(), i7, this.f2988d);
            this.f2987c.T(0);
            int K5 = this.f2987c.K();
            this.f2986b.T(0);
            this.f2985a.a(this.f2986b, 4);
            this.f2985a.a(c1144z, K5);
            i8 = i8 + 4 + K5;
        }
        this.f2985a.f(q6, i6, i8, 0, null);
        this.f2990f = true;
        return true;
    }
}
