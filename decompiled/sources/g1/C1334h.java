package g1;

import Z0.u;
import android.os.SystemClock;
import c1.AbstractC1117K;

/* renamed from: g1.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1334h implements InterfaceC1339j0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f14644a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14645b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14646c;

    /* renamed from: d, reason: collision with root package name */
    public final float f14647d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14648e;

    /* renamed from: f, reason: collision with root package name */
    public final long f14649f;

    /* renamed from: g, reason: collision with root package name */
    public final float f14650g;

    /* renamed from: h, reason: collision with root package name */
    public long f14651h;

    /* renamed from: i, reason: collision with root package name */
    public long f14652i;

    /* renamed from: j, reason: collision with root package name */
    public long f14653j;

    /* renamed from: k, reason: collision with root package name */
    public long f14654k;

    /* renamed from: l, reason: collision with root package name */
    public long f14655l;

    /* renamed from: m, reason: collision with root package name */
    public long f14656m;

    /* renamed from: n, reason: collision with root package name */
    public float f14657n;

    /* renamed from: o, reason: collision with root package name */
    public float f14658o;

    /* renamed from: p, reason: collision with root package name */
    public float f14659p;

    /* renamed from: q, reason: collision with root package name */
    public long f14660q;

    /* renamed from: r, reason: collision with root package name */
    public long f14661r;

    /* renamed from: s, reason: collision with root package name */
    public long f14662s;

    /* renamed from: g1.h$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public float f14663a = 0.97f;

        /* renamed from: b, reason: collision with root package name */
        public float f14664b = 1.03f;

        /* renamed from: c, reason: collision with root package name */
        public long f14665c = 1000;

        /* renamed from: d, reason: collision with root package name */
        public float f14666d = 1.0E-7f;

        /* renamed from: e, reason: collision with root package name */
        public long f14667e = AbstractC1117K.J0(20);

        /* renamed from: f, reason: collision with root package name */
        public long f14668f = AbstractC1117K.J0(500);

        /* renamed from: g, reason: collision with root package name */
        public float f14669g = 0.999f;

        public C1334h a() {
            return new C1334h(this.f14663a, this.f14664b, this.f14665c, this.f14666d, this.f14667e, this.f14668f, this.f14669g);
        }
    }

    public static long h(long j6, long j7, float f6) {
        return (((float) j6) * f6) + ((1.0f - f6) * ((float) j7));
    }

    @Override // g1.InterfaceC1339j0
    public float a(long j6, long j7) {
        if (this.f14651h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j6, j7);
        if (this.f14660q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f14660q < this.f14646c) {
            return this.f14659p;
        }
        this.f14660q = SystemClock.elapsedRealtime();
        f(j6);
        long j8 = j6 - this.f14656m;
        if (Math.abs(j8) < this.f14648e) {
            this.f14659p = 1.0f;
        } else {
            this.f14659p = AbstractC1117K.o((this.f14647d * ((float) j8)) + 1.0f, this.f14658o, this.f14657n);
        }
        return this.f14659p;
    }

    @Override // g1.InterfaceC1339j0
    public long b() {
        return this.f14656m;
    }

    @Override // g1.InterfaceC1339j0
    public void c() {
        long j6 = this.f14656m;
        if (j6 == -9223372036854775807L) {
            return;
        }
        long j7 = j6 + this.f14649f;
        this.f14656m = j7;
        long j8 = this.f14655l;
        if (j8 != -9223372036854775807L && j7 > j8) {
            this.f14656m = j8;
        }
        this.f14660q = -9223372036854775807L;
    }

    @Override // g1.InterfaceC1339j0
    public void d(u.g gVar) {
        this.f14651h = AbstractC1117K.J0(gVar.f7138a);
        this.f14654k = AbstractC1117K.J0(gVar.f7139b);
        this.f14655l = AbstractC1117K.J0(gVar.f7140c);
        float f6 = gVar.f7141d;
        if (f6 == -3.4028235E38f) {
            f6 = this.f14644a;
        }
        this.f14658o = f6;
        float f7 = gVar.f7142e;
        if (f7 == -3.4028235E38f) {
            f7 = this.f14645b;
        }
        this.f14657n = f7;
        if (f6 == 1.0f && f7 == 1.0f) {
            this.f14651h = -9223372036854775807L;
        }
        g();
    }

    @Override // g1.InterfaceC1339j0
    public void e(long j6) {
        this.f14652i = j6;
        g();
    }

    public final void f(long j6) {
        long j7 = this.f14661r + (this.f14662s * 3);
        if (this.f14656m > j7) {
            float J02 = (float) AbstractC1117K.J0(this.f14646c);
            this.f14656m = C6.i.b(new long[]{j7, this.f14653j, this.f14656m - (((this.f14659p - 1.0f) * J02) + ((this.f14657n - 1.0f) * J02))});
            return;
        }
        long q6 = AbstractC1117K.q(j6 - (Math.max(0.0f, this.f14659p - 1.0f) / this.f14647d), this.f14656m, j7);
        this.f14656m = q6;
        long j8 = this.f14655l;
        if (j8 == -9223372036854775807L || q6 <= j8) {
            return;
        }
        this.f14656m = j8;
    }

    public final void g() {
        long j6;
        long j7 = this.f14651h;
        if (j7 != -9223372036854775807L) {
            j6 = this.f14652i;
            if (j6 == -9223372036854775807L) {
                long j8 = this.f14654k;
                if (j8 != -9223372036854775807L && j7 < j8) {
                    j7 = j8;
                }
                j6 = this.f14655l;
                if (j6 == -9223372036854775807L || j7 <= j6) {
                    j6 = j7;
                }
            }
        } else {
            j6 = -9223372036854775807L;
        }
        if (this.f14653j == j6) {
            return;
        }
        this.f14653j = j6;
        this.f14656m = j6;
        this.f14661r = -9223372036854775807L;
        this.f14662s = -9223372036854775807L;
        this.f14660q = -9223372036854775807L;
    }

    public final void i(long j6, long j7) {
        long j8 = j6 - j7;
        long j9 = this.f14661r;
        if (j9 == -9223372036854775807L) {
            this.f14661r = j8;
            this.f14662s = 0L;
        } else {
            long max = Math.max(j8, h(j9, j8, this.f14650g));
            this.f14661r = max;
            this.f14662s = h(this.f14662s, Math.abs(j8 - max), this.f14650g);
        }
    }

    public C1334h(float f6, float f7, long j6, float f8, long j7, long j8, float f9) {
        this.f14644a = f6;
        this.f14645b = f7;
        this.f14646c = j6;
        this.f14647d = f8;
        this.f14648e = j7;
        this.f14649f = j8;
        this.f14650g = f9;
        this.f14651h = -9223372036854775807L;
        this.f14652i = -9223372036854775807L;
        this.f14654k = -9223372036854775807L;
        this.f14655l = -9223372036854775807L;
        this.f14658o = f6;
        this.f14657n = f7;
        this.f14659p = 1.0f;
        this.f14660q = -9223372036854775807L;
        this.f14653j = -9223372036854775807L;
        this.f14656m = -9223372036854775807L;
        this.f14661r = -9223372036854775807L;
        this.f14662s = -9223372036854775807L;
    }
}
