package C1;

import android.content.Context;
import android.view.Surface;
import c1.AbstractC1117K;
import c1.InterfaceC1121c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final b f584a;

    /* renamed from: b, reason: collision with root package name */
    public final p f585b;

    /* renamed from: c, reason: collision with root package name */
    public final long f586c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f587d;

    /* renamed from: g, reason: collision with root package name */
    public long f590g;

    /* renamed from: j, reason: collision with root package name */
    public boolean f593j;

    /* renamed from: e, reason: collision with root package name */
    public int f588e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f589f = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f591h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f592i = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public float f594k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC1121c f595l = InterfaceC1121c.f10577a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f596a = -9223372036854775807L;

        /* renamed from: b, reason: collision with root package name */
        public long f597b = -9223372036854775807L;

        public long f() {
            return this.f596a;
        }

        public long g() {
            return this.f597b;
        }

        public final void h() {
            this.f596a = -9223372036854775807L;
            this.f597b = -9223372036854775807L;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        boolean C(long j6, long j7, boolean z6);

        boolean N(long j6, long j7);

        boolean m(long j6, long j7, long j8, boolean z6, boolean z7);
    }

    public n(Context context, b bVar, long j6) {
        this.f584a = bVar;
        this.f586c = j6;
        this.f585b = new p(context);
    }

    public void a() {
        if (this.f588e == 0) {
            this.f588e = 1;
        }
    }

    public final long b(long j6, long j7, long j8) {
        long j9 = (long) ((j8 - j6) / this.f594k);
        return this.f587d ? j9 - (AbstractC1117K.J0(this.f595l.b()) - j7) : j9;
    }

    public int c(long j6, long j7, long j8, long j9, boolean z6, a aVar) {
        aVar.h();
        if (this.f589f == -9223372036854775807L) {
            this.f589f = j7;
        }
        if (this.f591h != j6) {
            this.f585b.h(j6);
            this.f591h = j6;
        }
        aVar.f596a = b(j7, j8, j6);
        if (s(j7, aVar.f596a, j9)) {
            return 0;
        }
        if (!this.f587d || j7 == this.f589f) {
            return 5;
        }
        long c6 = this.f595l.c();
        aVar.f597b = this.f585b.b((aVar.f596a * 1000) + c6);
        aVar.f596a = (aVar.f597b - c6) / 1000;
        boolean z7 = (this.f592i == -9223372036854775807L || this.f593j) ? false : true;
        if (this.f584a.m(aVar.f596a, j7, j8, z6, z7)) {
            return 4;
        }
        return this.f584a.C(aVar.f596a, j8, z6) ? z7 ? 3 : 2 : aVar.f596a > 50000 ? 5 : 1;
    }

    public boolean d(boolean z6) {
        if (z6 && this.f588e == 3) {
            this.f592i = -9223372036854775807L;
            return true;
        }
        if (this.f592i == -9223372036854775807L) {
            return false;
        }
        if (this.f595l.b() < this.f592i) {
            return true;
        }
        this.f592i = -9223372036854775807L;
        return false;
    }

    public void e(boolean z6) {
        this.f593j = z6;
        this.f592i = this.f586c > 0 ? this.f595l.b() + this.f586c : -9223372036854775807L;
    }

    public final void f(int i6) {
        this.f588e = Math.min(this.f588e, i6);
    }

    public void g() {
        f(0);
    }

    public void h(boolean z6) {
        this.f588e = z6 ? 1 : 0;
    }

    public boolean i() {
        boolean z6 = this.f588e != 3;
        this.f588e = 3;
        this.f590g = AbstractC1117K.J0(this.f595l.b());
        return z6;
    }

    public void j() {
        f(2);
    }

    public void k() {
        this.f587d = true;
        this.f590g = AbstractC1117K.J0(this.f595l.b());
        this.f585b.k();
    }

    public void l() {
        this.f587d = false;
        this.f592i = -9223372036854775807L;
        this.f585b.l();
    }

    public void m() {
        this.f585b.j();
        this.f591h = -9223372036854775807L;
        this.f589f = -9223372036854775807L;
        f(1);
        this.f592i = -9223372036854775807L;
    }

    public void n(int i6) {
        this.f585b.o(i6);
    }

    public void o(InterfaceC1121c interfaceC1121c) {
        this.f595l = interfaceC1121c;
    }

    public void p(float f6) {
        this.f585b.g(f6);
    }

    public void q(Surface surface) {
        this.f585b.m(surface);
        f(1);
    }

    public void r(float f6) {
        if (f6 == this.f594k) {
            return;
        }
        this.f594k = f6;
        this.f585b.i(f6);
    }

    public final boolean s(long j6, long j7, long j8) {
        if (this.f592i != -9223372036854775807L && !this.f593j) {
            return false;
        }
        int i6 = this.f588e;
        if (i6 == 0) {
            return this.f587d;
        }
        if (i6 == 1) {
            return true;
        }
        if (i6 == 2) {
            return j6 >= j8;
        }
        if (i6 == 3) {
            return this.f587d && this.f584a.N(j7, AbstractC1117K.J0(this.f595l.b()) - this.f590g);
        }
        throw new IllegalStateException();
    }
}
