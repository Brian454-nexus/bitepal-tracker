package g1;

import c1.AbstractC1117K;
import c1.AbstractC1119a;
import w1.InterfaceC2212D;

/* renamed from: g1.o0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1349o0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2212D.b f14781a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14782b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14783c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14784d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14785e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14786f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14787g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14788h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f14789i;

    public C1349o0(InterfaceC2212D.b bVar, long j6, long j7, long j8, long j9, boolean z6, boolean z7, boolean z8, boolean z9) {
        boolean z10 = true;
        AbstractC1119a.a(!z9 || z7);
        AbstractC1119a.a(!z8 || z7);
        if (z6 && (z7 || z8 || z9)) {
            z10 = false;
        }
        AbstractC1119a.a(z10);
        this.f14781a = bVar;
        this.f14782b = j6;
        this.f14783c = j7;
        this.f14784d = j8;
        this.f14785e = j9;
        this.f14786f = z6;
        this.f14787g = z7;
        this.f14788h = z8;
        this.f14789i = z9;
    }

    public C1349o0 a(long j6) {
        return j6 == this.f14783c ? this : new C1349o0(this.f14781a, this.f14782b, j6, this.f14784d, this.f14785e, this.f14786f, this.f14787g, this.f14788h, this.f14789i);
    }

    public C1349o0 b(long j6) {
        return j6 == this.f14782b ? this : new C1349o0(this.f14781a, j6, this.f14783c, this.f14784d, this.f14785e, this.f14786f, this.f14787g, this.f14788h, this.f14789i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1349o0.class == obj.getClass()) {
            C1349o0 c1349o0 = (C1349o0) obj;
            if (this.f14782b == c1349o0.f14782b && this.f14783c == c1349o0.f14783c && this.f14784d == c1349o0.f14784d && this.f14785e == c1349o0.f14785e && this.f14786f == c1349o0.f14786f && this.f14787g == c1349o0.f14787g && this.f14788h == c1349o0.f14788h && this.f14789i == c1349o0.f14789i && AbstractC1117K.c(this.f14781a, c1349o0.f14781a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f14781a.hashCode()) * 31) + ((int) this.f14782b)) * 31) + ((int) this.f14783c)) * 31) + ((int) this.f14784d)) * 31) + ((int) this.f14785e)) * 31) + (this.f14786f ? 1 : 0)) * 31) + (this.f14787g ? 1 : 0)) * 31) + (this.f14788h ? 1 : 0)) * 31) + (this.f14789i ? 1 : 0);
    }
}
