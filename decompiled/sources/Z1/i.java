package Z1;

import E1.I;
import E1.InterfaceC0315q;
import E1.J;
import E1.O;
import E1.r;
import Z0.q;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class i {

    /* renamed from: b, reason: collision with root package name */
    public O f7335b;

    /* renamed from: c, reason: collision with root package name */
    public r f7336c;

    /* renamed from: d, reason: collision with root package name */
    public g f7337d;

    /* renamed from: e, reason: collision with root package name */
    public long f7338e;

    /* renamed from: f, reason: collision with root package name */
    public long f7339f;

    /* renamed from: g, reason: collision with root package name */
    public long f7340g;

    /* renamed from: h, reason: collision with root package name */
    public int f7341h;

    /* renamed from: i, reason: collision with root package name */
    public int f7342i;

    /* renamed from: k, reason: collision with root package name */
    public long f7344k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7345l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7346m;

    /* renamed from: a, reason: collision with root package name */
    public final e f7334a = new e();

    /* renamed from: j, reason: collision with root package name */
    public b f7343j = new b();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public q f7347a;

        /* renamed from: b, reason: collision with root package name */
        public g f7348b;
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements g {
        public c() {
        }

        @Override // Z1.g
        public J a() {
            return new J.b(-9223372036854775807L);
        }

        @Override // Z1.g
        public long b(InterfaceC0315q interfaceC0315q) {
            return -1L;
        }

        @Override // Z1.g
        public void c(long j6) {
        }
    }

    public final void a() {
        AbstractC1119a.i(this.f7335b);
        AbstractC1117K.i(this.f7336c);
    }

    public long b(long j6) {
        return (j6 * 1000000) / this.f7342i;
    }

    public long c(long j6) {
        return (this.f7342i * j6) / 1000000;
    }

    public void d(r rVar, O o6) {
        this.f7336c = rVar;
        this.f7335b = o6;
        l(true);
    }

    public void e(long j6) {
        this.f7340g = j6;
    }

    public abstract long f(C1144z c1144z);

    public final int g(InterfaceC0315q interfaceC0315q, I i6) {
        a();
        int i7 = this.f7341h;
        if (i7 == 0) {
            return j(interfaceC0315q);
        }
        if (i7 == 1) {
            interfaceC0315q.p((int) this.f7339f);
            this.f7341h = 2;
            return 0;
        }
        if (i7 == 2) {
            AbstractC1117K.i(this.f7337d);
            return k(interfaceC0315q, i6);
        }
        if (i7 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    public final boolean h(InterfaceC0315q interfaceC0315q) {
        while (this.f7334a.d(interfaceC0315q)) {
            this.f7344k = interfaceC0315q.getPosition() - this.f7339f;
            if (!i(this.f7334a.c(), this.f7339f, this.f7343j)) {
                return true;
            }
            this.f7339f = interfaceC0315q.getPosition();
        }
        this.f7341h = 3;
        return false;
    }

    public abstract boolean i(C1144z c1144z, long j6, b bVar);

    public final int j(InterfaceC0315q interfaceC0315q) {
        if (!h(interfaceC0315q)) {
            return -1;
        }
        q qVar = this.f7343j.f7347a;
        this.f7342i = qVar.f6967C;
        if (!this.f7346m) {
            this.f7335b.e(qVar);
            this.f7346m = true;
        }
        g gVar = this.f7343j.f7348b;
        if (gVar != null) {
            this.f7337d = gVar;
        } else if (interfaceC0315q.a() == -1) {
            this.f7337d = new c();
        } else {
            f b6 = this.f7334a.b();
            this.f7337d = new Z1.a(this, this.f7339f, interfaceC0315q.a(), b6.f7327h + b6.f7328i, b6.f7322c, (b6.f7321b & 4) != 0);
        }
        this.f7341h = 2;
        this.f7334a.f();
        return 0;
    }

    public final int k(InterfaceC0315q interfaceC0315q, I i6) {
        long b6 = this.f7337d.b(interfaceC0315q);
        if (b6 >= 0) {
            i6.f910a = b6;
            return 1;
        }
        if (b6 < -1) {
            e(-(b6 + 2));
        }
        if (!this.f7345l) {
            this.f7336c.n((J) AbstractC1119a.i(this.f7337d.a()));
            this.f7345l = true;
        }
        if (this.f7344k <= 0 && !this.f7334a.d(interfaceC0315q)) {
            this.f7341h = 3;
            return -1;
        }
        this.f7344k = 0L;
        C1144z c6 = this.f7334a.c();
        long f6 = f(c6);
        if (f6 >= 0) {
            long j6 = this.f7340g;
            if (j6 + f6 >= this.f7338e) {
                long b7 = b(j6);
                this.f7335b.a(c6, c6.g());
                this.f7335b.f(b7, 1, c6.g(), 0, null);
                this.f7338e = -1L;
            }
        }
        this.f7340g += f6;
        return 0;
    }

    public void l(boolean z6) {
        if (z6) {
            this.f7343j = new b();
            this.f7339f = 0L;
            this.f7341h = 0;
        } else {
            this.f7341h = 1;
        }
        this.f7338e = -1L;
        this.f7340g = 0L;
    }

    public final void m(long j6, long j7) {
        this.f7334a.e();
        if (j6 == 0) {
            l(!this.f7345l);
        } else if (this.f7341h != 0) {
            this.f7338e = c(j7);
            ((g) AbstractC1117K.i(this.f7337d)).c(this.f7338e);
            this.f7341h = 2;
        }
    }
}
