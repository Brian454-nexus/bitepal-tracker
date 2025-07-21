package h2;

import android.text.Layout;

/* renamed from: h2.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1457g {

    /* renamed from: a, reason: collision with root package name */
    public String f15267a;

    /* renamed from: b, reason: collision with root package name */
    public int f15268b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15269c;

    /* renamed from: d, reason: collision with root package name */
    public int f15270d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15271e;

    /* renamed from: k, reason: collision with root package name */
    public float f15277k;

    /* renamed from: l, reason: collision with root package name */
    public String f15278l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f15281o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f15282p;

    /* renamed from: r, reason: collision with root package name */
    public C1452b f15284r;

    /* renamed from: f, reason: collision with root package name */
    public int f15272f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f15273g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f15274h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f15275i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f15276j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f15279m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f15280n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f15283q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f15285s = Float.MAX_VALUE;

    public C1457g A(String str) {
        this.f15278l = str;
        return this;
    }

    public C1457g B(boolean z6) {
        this.f15275i = z6 ? 1 : 0;
        return this;
    }

    public C1457g C(boolean z6) {
        this.f15272f = z6 ? 1 : 0;
        return this;
    }

    public C1457g D(Layout.Alignment alignment) {
        this.f15282p = alignment;
        return this;
    }

    public C1457g E(int i6) {
        this.f15280n = i6;
        return this;
    }

    public C1457g F(int i6) {
        this.f15279m = i6;
        return this;
    }

    public C1457g G(float f6) {
        this.f15285s = f6;
        return this;
    }

    public C1457g H(Layout.Alignment alignment) {
        this.f15281o = alignment;
        return this;
    }

    public C1457g I(boolean z6) {
        this.f15283q = z6 ? 1 : 0;
        return this;
    }

    public C1457g J(C1452b c1452b) {
        this.f15284r = c1452b;
        return this;
    }

    public C1457g K(boolean z6) {
        this.f15273g = z6 ? 1 : 0;
        return this;
    }

    public C1457g a(C1457g c1457g) {
        return r(c1457g, true);
    }

    public int b() {
        if (this.f15271e) {
            return this.f15270d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f15269c) {
            return this.f15268b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f15267a;
    }

    public float e() {
        return this.f15277k;
    }

    public int f() {
        return this.f15276j;
    }

    public String g() {
        return this.f15278l;
    }

    public Layout.Alignment h() {
        return this.f15282p;
    }

    public int i() {
        return this.f15280n;
    }

    public int j() {
        return this.f15279m;
    }

    public float k() {
        return this.f15285s;
    }

    public int l() {
        int i6 = this.f15274h;
        if (i6 == -1 && this.f15275i == -1) {
            return -1;
        }
        return (i6 == 1 ? 1 : 0) | (this.f15275i == 1 ? 2 : 0);
    }

    public Layout.Alignment m() {
        return this.f15281o;
    }

    public boolean n() {
        return this.f15283q == 1;
    }

    public C1452b o() {
        return this.f15284r;
    }

    public boolean p() {
        return this.f15271e;
    }

    public boolean q() {
        return this.f15269c;
    }

    public final C1457g r(C1457g c1457g, boolean z6) {
        int i6;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c1457g != null) {
            if (!this.f15269c && c1457g.f15269c) {
                w(c1457g.f15268b);
            }
            if (this.f15274h == -1) {
                this.f15274h = c1457g.f15274h;
            }
            if (this.f15275i == -1) {
                this.f15275i = c1457g.f15275i;
            }
            if (this.f15267a == null && (str = c1457g.f15267a) != null) {
                this.f15267a = str;
            }
            if (this.f15272f == -1) {
                this.f15272f = c1457g.f15272f;
            }
            if (this.f15273g == -1) {
                this.f15273g = c1457g.f15273g;
            }
            if (this.f15280n == -1) {
                this.f15280n = c1457g.f15280n;
            }
            if (this.f15281o == null && (alignment2 = c1457g.f15281o) != null) {
                this.f15281o = alignment2;
            }
            if (this.f15282p == null && (alignment = c1457g.f15282p) != null) {
                this.f15282p = alignment;
            }
            if (this.f15283q == -1) {
                this.f15283q = c1457g.f15283q;
            }
            if (this.f15276j == -1) {
                this.f15276j = c1457g.f15276j;
                this.f15277k = c1457g.f15277k;
            }
            if (this.f15284r == null) {
                this.f15284r = c1457g.f15284r;
            }
            if (this.f15285s == Float.MAX_VALUE) {
                this.f15285s = c1457g.f15285s;
            }
            if (z6 && !this.f15271e && c1457g.f15271e) {
                u(c1457g.f15270d);
            }
            if (z6 && this.f15279m == -1 && (i6 = c1457g.f15279m) != -1) {
                this.f15279m = i6;
            }
        }
        return this;
    }

    public boolean s() {
        return this.f15272f == 1;
    }

    public boolean t() {
        return this.f15273g == 1;
    }

    public C1457g u(int i6) {
        this.f15270d = i6;
        this.f15271e = true;
        return this;
    }

    public C1457g v(boolean z6) {
        this.f15274h = z6 ? 1 : 0;
        return this;
    }

    public C1457g w(int i6) {
        this.f15268b = i6;
        this.f15269c = true;
        return this;
    }

    public C1457g x(String str) {
        this.f15267a = str;
        return this;
    }

    public C1457g y(float f6) {
        this.f15277k = f6;
        return this;
    }

    public C1457g z(int i6) {
        this.f15276j = i6;
        return this;
    }
}
