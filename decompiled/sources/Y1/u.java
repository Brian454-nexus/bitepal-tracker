package Y1;

import E1.InterfaceC0315q;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public d f6495a;

    /* renamed from: b, reason: collision with root package name */
    public long f6496b;

    /* renamed from: c, reason: collision with root package name */
    public long f6497c;

    /* renamed from: d, reason: collision with root package name */
    public long f6498d;

    /* renamed from: e, reason: collision with root package name */
    public int f6499e;

    /* renamed from: f, reason: collision with root package name */
    public int f6500f;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6506l;

    /* renamed from: n, reason: collision with root package name */
    public t f6508n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6510p;

    /* renamed from: q, reason: collision with root package name */
    public long f6511q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6512r;

    /* renamed from: g, reason: collision with root package name */
    public long[] f6501g = new long[0];

    /* renamed from: h, reason: collision with root package name */
    public int[] f6502h = new int[0];

    /* renamed from: i, reason: collision with root package name */
    public int[] f6503i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    public long[] f6504j = new long[0];

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f6505k = new boolean[0];

    /* renamed from: m, reason: collision with root package name */
    public boolean[] f6507m = new boolean[0];

    /* renamed from: o, reason: collision with root package name */
    public final C1144z f6509o = new C1144z();

    public void a(InterfaceC0315q interfaceC0315q) {
        interfaceC0315q.readFully(this.f6509o.e(), 0, this.f6509o.g());
        this.f6509o.T(0);
        this.f6510p = false;
    }

    public void b(C1144z c1144z) {
        c1144z.l(this.f6509o.e(), 0, this.f6509o.g());
        this.f6509o.T(0);
        this.f6510p = false;
    }

    public long c(int i6) {
        return this.f6504j[i6];
    }

    public void d(int i6) {
        this.f6509o.P(i6);
        this.f6506l = true;
        this.f6510p = true;
    }

    public void e(int i6, int i7) {
        this.f6499e = i6;
        this.f6500f = i7;
        if (this.f6502h.length < i6) {
            this.f6501g = new long[i6];
            this.f6502h = new int[i6];
        }
        if (this.f6503i.length < i7) {
            int i8 = (i7 * 125) / 100;
            this.f6503i = new int[i8];
            this.f6504j = new long[i8];
            this.f6505k = new boolean[i8];
            this.f6507m = new boolean[i8];
        }
    }

    public void f() {
        this.f6499e = 0;
        this.f6511q = 0L;
        this.f6512r = false;
        this.f6506l = false;
        this.f6510p = false;
        this.f6508n = null;
    }

    public boolean g(int i6) {
        return this.f6506l && this.f6507m[i6];
    }
}
