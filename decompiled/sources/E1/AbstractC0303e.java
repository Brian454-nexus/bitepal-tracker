package E1;

import E1.J;
import c1.AbstractC1117K;
import c1.AbstractC1119a;

/* renamed from: E1.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0303e {

    /* renamed from: a, reason: collision with root package name */
    public final a f995a;

    /* renamed from: b, reason: collision with root package name */
    public final f f996b;

    /* renamed from: c, reason: collision with root package name */
    public c f997c;

    /* renamed from: d, reason: collision with root package name */
    public final int f998d;

    /* renamed from: E1.e$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements J {

        /* renamed from: a, reason: collision with root package name */
        public final d f999a;

        /* renamed from: b, reason: collision with root package name */
        public final long f1000b;

        /* renamed from: c, reason: collision with root package name */
        public final long f1001c;

        /* renamed from: d, reason: collision with root package name */
        public final long f1002d;

        /* renamed from: e, reason: collision with root package name */
        public final long f1003e;

        /* renamed from: f, reason: collision with root package name */
        public final long f1004f;

        /* renamed from: g, reason: collision with root package name */
        public final long f1005g;

        public a(d dVar, long j6, long j7, long j8, long j9, long j10, long j11) {
            this.f999a = dVar;
            this.f1000b = j6;
            this.f1001c = j7;
            this.f1002d = j8;
            this.f1003e = j9;
            this.f1004f = j10;
            this.f1005g = j11;
        }

        @Override // E1.J
        public boolean f() {
            return true;
        }

        public long i(long j6) {
            return this.f999a.a(j6);
        }

        @Override // E1.J
        public J.a j(long j6) {
            return new J.a(new K(j6, c.h(this.f999a.a(j6), this.f1001c, this.f1002d, this.f1003e, this.f1004f, this.f1005g)));
        }

        @Override // E1.J
        public long l() {
            return this.f1000b;
        }
    }

    /* renamed from: E1.e$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements d {
        @Override // E1.AbstractC0303e.d
        public long a(long j6) {
            return j6;
        }
    }

    /* renamed from: E1.e$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f1006a;

        /* renamed from: b, reason: collision with root package name */
        public final long f1007b;

        /* renamed from: c, reason: collision with root package name */
        public final long f1008c;

        /* renamed from: d, reason: collision with root package name */
        public long f1009d;

        /* renamed from: e, reason: collision with root package name */
        public long f1010e;

        /* renamed from: f, reason: collision with root package name */
        public long f1011f;

        /* renamed from: g, reason: collision with root package name */
        public long f1012g;

        /* renamed from: h, reason: collision with root package name */
        public long f1013h;

        public c(long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
            this.f1006a = j6;
            this.f1007b = j7;
            this.f1009d = j8;
            this.f1010e = j9;
            this.f1011f = j10;
            this.f1012g = j11;
            this.f1008c = j12;
            this.f1013h = h(j7, j8, j9, j10, j11, j12);
        }

        public static long h(long j6, long j7, long j8, long j9, long j10, long j11) {
            if (j9 + 1 >= j10 || j7 + 1 >= j8) {
                return j9;
            }
            long j12 = ((float) (j6 - j7)) * (((float) (j10 - j9)) / ((float) (j8 - j7)));
            return AbstractC1117K.q(((j12 + j9) - j11) - (j12 / 20), j9, j10 - 1);
        }

        public final long i() {
            return this.f1012g;
        }

        public final long j() {
            return this.f1011f;
        }

        public final long k() {
            return this.f1013h;
        }

        public final long l() {
            return this.f1006a;
        }

        public final long m() {
            return this.f1007b;
        }

        public final void n() {
            this.f1013h = h(this.f1007b, this.f1009d, this.f1010e, this.f1011f, this.f1012g, this.f1008c);
        }

        public final void o(long j6, long j7) {
            this.f1010e = j6;
            this.f1012g = j7;
            n();
        }

        public final void p(long j6, long j7) {
            this.f1009d = j6;
            this.f1011f = j7;
            n();
        }
    }

    /* renamed from: E1.e$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface d {
        long a(long j6);
    }

    /* renamed from: E1.e$e, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0023e {

        /* renamed from: d, reason: collision with root package name */
        public static final C0023e f1014d = new C0023e(-3, -9223372036854775807L, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f1015a;

        /* renamed from: b, reason: collision with root package name */
        public final long f1016b;

        /* renamed from: c, reason: collision with root package name */
        public final long f1017c;

        public C0023e(int i6, long j6, long j7) {
            this.f1015a = i6;
            this.f1016b = j6;
            this.f1017c = j7;
        }

        public static C0023e d(long j6, long j7) {
            return new C0023e(-1, j6, j7);
        }

        public static C0023e e(long j6) {
            return new C0023e(0, -9223372036854775807L, j6);
        }

        public static C0023e f(long j6, long j7) {
            return new C0023e(-2, j6, j7);
        }
    }

    /* renamed from: E1.e$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface f {
        C0023e a(InterfaceC0315q interfaceC0315q, long j6);

        default void b() {
        }
    }

    public AbstractC0303e(d dVar, f fVar, long j6, long j7, long j8, long j9, long j10, long j11, int i6) {
        this.f996b = fVar;
        this.f998d = i6;
        this.f995a = new a(dVar, j6, j7, j8, j9, j10, j11);
    }

    public c a(long j6) {
        return new c(j6, this.f995a.i(j6), this.f995a.f1001c, this.f995a.f1002d, this.f995a.f1003e, this.f995a.f1004f, this.f995a.f1005g);
    }

    public final J b() {
        return this.f995a;
    }

    public int c(InterfaceC0315q interfaceC0315q, I i6) {
        while (true) {
            c cVar = (c) AbstractC1119a.i(this.f997c);
            long j6 = cVar.j();
            long i7 = cVar.i();
            long k6 = cVar.k();
            if (i7 - j6 <= this.f998d) {
                e(false, j6);
                return g(interfaceC0315q, j6, i6);
            }
            if (!i(interfaceC0315q, k6)) {
                return g(interfaceC0315q, k6, i6);
            }
            interfaceC0315q.o();
            C0023e a6 = this.f996b.a(interfaceC0315q, cVar.m());
            int i8 = a6.f1015a;
            if (i8 == -3) {
                e(false, k6);
                return g(interfaceC0315q, k6, i6);
            }
            if (i8 == -2) {
                cVar.p(a6.f1016b, a6.f1017c);
            } else {
                if (i8 != -1) {
                    if (i8 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(interfaceC0315q, a6.f1017c);
                    e(true, a6.f1017c);
                    return g(interfaceC0315q, a6.f1017c, i6);
                }
                cVar.o(a6.f1016b, a6.f1017c);
            }
        }
    }

    public final boolean d() {
        return this.f997c != null;
    }

    public final void e(boolean z6, long j6) {
        this.f997c = null;
        this.f996b.b();
        f(z6, j6);
    }

    public void f(boolean z6, long j6) {
    }

    public final int g(InterfaceC0315q interfaceC0315q, long j6, I i6) {
        if (j6 == interfaceC0315q.getPosition()) {
            return 0;
        }
        i6.f910a = j6;
        return 1;
    }

    public final void h(long j6) {
        c cVar = this.f997c;
        if (cVar == null || cVar.l() != j6) {
            this.f997c = a(j6);
        }
    }

    public final boolean i(InterfaceC0315q interfaceC0315q, long j6) {
        long position = j6 - interfaceC0315q.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        interfaceC0315q.p((int) position);
        return true;
    }
}
