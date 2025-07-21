package C1;

import C1.n;
import Z0.N;
import c1.AbstractC1119a;
import c1.C1110D;
import c1.C1135q;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final a f623a;

    /* renamed from: b, reason: collision with root package name */
    public final n f624b;

    /* renamed from: g, reason: collision with root package name */
    public N f629g;

    /* renamed from: i, reason: collision with root package name */
    public long f631i;

    /* renamed from: c, reason: collision with root package name */
    public final n.a f625c = new n.a();

    /* renamed from: d, reason: collision with root package name */
    public final C1110D f626d = new C1110D();

    /* renamed from: e, reason: collision with root package name */
    public final C1110D f627e = new C1110D();

    /* renamed from: f, reason: collision with root package name */
    public final C1135q f628f = new C1135q();

    /* renamed from: h, reason: collision with root package name */
    public N f630h = N.f6819e;

    /* renamed from: j, reason: collision with root package name */
    public long f632j = -9223372036854775807L;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(N n6);

        void b(long j6, long j7, long j8, boolean z6);

        void c();
    }

    public q(a aVar, n nVar) {
        this.f623a = aVar;
        this.f624b = nVar;
    }

    public static Object c(C1110D c1110d) {
        AbstractC1119a.a(c1110d.k() > 0);
        while (c1110d.k() > 1) {
            c1110d.h();
        }
        return AbstractC1119a.e(c1110d.h());
    }

    public final void a() {
        AbstractC1119a.i(Long.valueOf(this.f628f.d()));
        this.f623a.c();
    }

    public void b() {
        this.f628f.a();
        this.f632j = -9223372036854775807L;
        if (this.f627e.k() > 0) {
            Long l6 = (Long) c(this.f627e);
            l6.longValue();
            this.f627e.a(0L, l6);
        }
        if (this.f629g != null) {
            this.f626d.c();
        } else if (this.f626d.k() > 0) {
            this.f629g = (N) c(this.f626d);
        }
    }

    public boolean d(long j6) {
        long j7 = this.f632j;
        return j7 != -9223372036854775807L && j7 >= j6;
    }

    public boolean e() {
        return this.f624b.d(true);
    }

    public final boolean f(long j6) {
        Long l6 = (Long) this.f627e.i(j6);
        if (l6 == null || l6.longValue() == this.f631i) {
            return false;
        }
        this.f631i = l6.longValue();
        return true;
    }

    public final boolean g(long j6) {
        N n6 = (N) this.f626d.i(j6);
        if (n6 == null || n6.equals(N.f6819e) || n6.equals(this.f630h)) {
            return false;
        }
        this.f630h = n6;
        return true;
    }

    public void h(long j6, long j7) {
        while (!this.f628f.c()) {
            long b6 = this.f628f.b();
            if (f(b6)) {
                this.f624b.j();
            }
            int c6 = this.f624b.c(b6, j6, j7, this.f631i, false, this.f625c);
            if (c6 == 0 || c6 == 1) {
                this.f632j = b6;
                i(c6 == 0);
            } else if (c6 != 2 && c6 != 3 && c6 != 4) {
                if (c6 != 5) {
                    throw new IllegalStateException(String.valueOf(c6));
                }
                return;
            } else {
                this.f632j = b6;
                a();
            }
        }
    }

    public final void i(boolean z6) {
        long longValue = ((Long) AbstractC1119a.i(Long.valueOf(this.f628f.d()))).longValue();
        if (g(longValue)) {
            this.f623a.a(this.f630h);
        }
        this.f623a.b(z6 ? -1L : this.f625c.g(), longValue, this.f631i, this.f624b.i());
    }

    public void j(float f6) {
        AbstractC1119a.a(f6 > 0.0f);
        this.f624b.r(f6);
    }
}
