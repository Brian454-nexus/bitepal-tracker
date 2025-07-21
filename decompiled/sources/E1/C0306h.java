package E1;

import E1.J;

/* renamed from: E1.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0306h implements J {

    /* renamed from: a, reason: collision with root package name */
    public final long f1024a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1025b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1026c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1027d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1028e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1029f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1030g;

    public C0306h(long j6, long j7, int i6, int i7, boolean z6) {
        this.f1024a = j6;
        this.f1025b = j7;
        this.f1026c = i7 == -1 ? 1 : i7;
        this.f1028e = i6;
        this.f1030g = z6;
        if (j6 == -1) {
            this.f1027d = -1L;
            this.f1029f = -9223372036854775807L;
        } else {
            this.f1027d = j6 - j7;
            this.f1029f = d(j6, j7, i6);
        }
    }

    public static long d(long j6, long j7, int i6) {
        return (Math.max(0L, j6 - j7) * 8000000) / i6;
    }

    public final long a(long j6) {
        int i6 = this.f1026c;
        long j7 = (((j6 * this.f1028e) / 8000000) / i6) * i6;
        long j8 = this.f1027d;
        if (j8 != -1) {
            j7 = Math.min(j7, j8 - i6);
        }
        return this.f1025b + Math.max(j7, 0L);
    }

    public long c(long j6) {
        return d(j6, this.f1025b, this.f1028e);
    }

    @Override // E1.J
    public boolean f() {
        return this.f1027d != -1 || this.f1030g;
    }

    @Override // E1.J
    public J.a j(long j6) {
        if (this.f1027d == -1 && !this.f1030g) {
            return new J.a(new K(0L, this.f1025b));
        }
        long a6 = a(j6);
        long c6 = c(a6);
        K k6 = new K(c6, a6);
        if (this.f1027d != -1 && c6 < j6) {
            int i6 = this.f1026c;
            if (i6 + a6 < this.f1024a) {
                long j7 = a6 + i6;
                return new J.a(k6, new K(c(j7), j7));
            }
        }
        return new J.a(k6);
    }

    @Override // E1.J
    public long l() {
        return this.f1029f;
    }
}
