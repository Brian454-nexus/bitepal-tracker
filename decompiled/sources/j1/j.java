package j1;

import Z0.q;
import c1.AbstractC1117K;
import g1.C1337i0;
import k1.C1662f;
import w1.b0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final q f16136a;

    /* renamed from: c, reason: collision with root package name */
    public long[] f16138c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16139d;

    /* renamed from: e, reason: collision with root package name */
    public C1662f f16140e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16141f;

    /* renamed from: g, reason: collision with root package name */
    public int f16142g;

    /* renamed from: b, reason: collision with root package name */
    public final P1.c f16137b = new P1.c();

    /* renamed from: h, reason: collision with root package name */
    public long f16143h = -9223372036854775807L;

    public j(C1662f c1662f, q qVar, boolean z6) {
        this.f16136a = qVar;
        this.f16140e = c1662f;
        this.f16138c = c1662f.f16347b;
        e(c1662f, z6);
    }

    @Override // w1.b0
    public void a() {
    }

    public String b() {
        return this.f16140e.a();
    }

    @Override // w1.b0
    public boolean c() {
        return true;
    }

    public void d(long j6) {
        int d6 = AbstractC1117K.d(this.f16138c, j6, true, false);
        this.f16142g = d6;
        if (!this.f16139d || d6 != this.f16138c.length) {
            j6 = -9223372036854775807L;
        }
        this.f16143h = j6;
    }

    public void e(C1662f c1662f, boolean z6) {
        int i6 = this.f16142g;
        long j6 = i6 == 0 ? -9223372036854775807L : this.f16138c[i6 - 1];
        this.f16139d = z6;
        this.f16140e = c1662f;
        long[] jArr = c1662f.f16347b;
        this.f16138c = jArr;
        long j7 = this.f16143h;
        if (j7 != -9223372036854775807L) {
            d(j7);
        } else if (j6 != -9223372036854775807L) {
            this.f16142g = AbstractC1117K.d(jArr, j6, false, false);
        }
    }

    @Override // w1.b0
    public int k(C1337i0 c1337i0, f1.f fVar, int i6) {
        int i7 = this.f16142g;
        boolean z6 = i7 == this.f16138c.length;
        if (z6 && !this.f16139d) {
            fVar.m(4);
            return -4;
        }
        if ((i6 & 2) != 0 || !this.f16141f) {
            c1337i0.f14685b = this.f16136a;
            this.f16141f = true;
            return -5;
        }
        if (z6) {
            return -3;
        }
        if ((i6 & 1) == 0) {
            this.f16142g = i7 + 1;
        }
        if ((i6 & 4) == 0) {
            byte[] a6 = this.f16137b.a(this.f16140e.f16346a[i7]);
            fVar.o(a6.length);
            fVar.f14005d.put(a6);
        }
        fVar.f14007f = this.f16138c[i7];
        fVar.m(1);
        return -4;
    }

    @Override // w1.b0
    public int n(long j6) {
        int max = Math.max(this.f16142g, AbstractC1117K.d(this.f16138c, j6, true, false));
        int i6 = max - this.f16142g;
        this.f16142g = max;
        return i6;
    }
}
