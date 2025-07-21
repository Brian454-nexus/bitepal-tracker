package m1;

import c1.AbstractC1119a;
import g1.C1337i0;
import w1.b0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class n implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f17340a;

    /* renamed from: b, reason: collision with root package name */
    public final s f17341b;

    /* renamed from: c, reason: collision with root package name */
    public int f17342c = -1;

    public n(s sVar, int i6) {
        this.f17341b = sVar;
        this.f17340a = i6;
    }

    @Override // w1.b0
    public void a() {
        int i6 = this.f17342c;
        if (i6 == -2) {
            throw new u(this.f17341b.r().b(this.f17340a).a(0).f6990n);
        }
        if (i6 == -1) {
            this.f17341b.V();
        } else if (i6 != -3) {
            this.f17341b.W(i6);
        }
    }

    public void b() {
        AbstractC1119a.a(this.f17342c == -1);
        this.f17342c = this.f17341b.z(this.f17340a);
    }

    @Override // w1.b0
    public boolean c() {
        if (this.f17342c != -3) {
            return d() && this.f17341b.R(this.f17342c);
        }
        return true;
    }

    public final boolean d() {
        int i6 = this.f17342c;
        return (i6 == -1 || i6 == -3 || i6 == -2) ? false : true;
    }

    public void e() {
        if (this.f17342c != -1) {
            this.f17341b.q0(this.f17340a);
            this.f17342c = -1;
        }
    }

    @Override // w1.b0
    public int k(C1337i0 c1337i0, f1.f fVar, int i6) {
        if (this.f17342c == -3) {
            fVar.e(4);
            return -4;
        }
        if (d()) {
            return this.f17341b.f0(this.f17342c, c1337i0, fVar, i6);
        }
        return -3;
    }

    @Override // w1.b0
    public int n(long j6) {
        if (d()) {
            return this.f17341b.p0(this.f17342c, j6);
        }
        return 0;
    }
}
