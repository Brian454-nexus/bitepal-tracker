package i1;

import android.media.AudioTrack;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.InterfaceC1121c;
import java.lang.reflect.Method;

/* renamed from: i1.A, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1483A {

    /* renamed from: A, reason: collision with root package name */
    public long f15698A;

    /* renamed from: B, reason: collision with root package name */
    public long f15699B;

    /* renamed from: C, reason: collision with root package name */
    public long f15700C;

    /* renamed from: D, reason: collision with root package name */
    public long f15701D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f15702E;

    /* renamed from: F, reason: collision with root package name */
    public long f15703F;

    /* renamed from: G, reason: collision with root package name */
    public long f15704G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f15705H;

    /* renamed from: I, reason: collision with root package name */
    public long f15706I;

    /* renamed from: J, reason: collision with root package name */
    public InterfaceC1121c f15707J;

    /* renamed from: a, reason: collision with root package name */
    public final a f15708a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f15709b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f15710c;

    /* renamed from: d, reason: collision with root package name */
    public int f15711d;

    /* renamed from: e, reason: collision with root package name */
    public int f15712e;

    /* renamed from: f, reason: collision with root package name */
    public C1508z f15713f;

    /* renamed from: g, reason: collision with root package name */
    public int f15714g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15715h;

    /* renamed from: i, reason: collision with root package name */
    public long f15716i;

    /* renamed from: j, reason: collision with root package name */
    public float f15717j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15718k;

    /* renamed from: l, reason: collision with root package name */
    public long f15719l;

    /* renamed from: m, reason: collision with root package name */
    public long f15720m;

    /* renamed from: n, reason: collision with root package name */
    public Method f15721n;

    /* renamed from: o, reason: collision with root package name */
    public long f15722o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15723p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f15724q;

    /* renamed from: r, reason: collision with root package name */
    public long f15725r;

    /* renamed from: s, reason: collision with root package name */
    public long f15726s;

    /* renamed from: t, reason: collision with root package name */
    public long f15727t;

    /* renamed from: u, reason: collision with root package name */
    public long f15728u;

    /* renamed from: v, reason: collision with root package name */
    public long f15729v;

    /* renamed from: w, reason: collision with root package name */
    public int f15730w;

    /* renamed from: x, reason: collision with root package name */
    public int f15731x;

    /* renamed from: y, reason: collision with root package name */
    public long f15732y;

    /* renamed from: z, reason: collision with root package name */
    public long f15733z;

    /* renamed from: i1.A$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(long j6);

        void b(int i6, long j6);

        void c(long j6);

        void d(long j6, long j7, long j8, long j9);

        void e(long j6, long j7, long j8, long j9);
    }

    public C1483A(a aVar) {
        this.f15708a = (a) AbstractC1119a.e(aVar);
        try {
            this.f15721n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f15709b = new long[10];
        this.f15707J = InterfaceC1121c.f10577a;
    }

    public static boolean o(int i6) {
        if (AbstractC1117K.f10560a < 23) {
            return i6 == 5 || i6 == 6;
        }
        return false;
    }

    public void a() {
        this.f15705H = true;
        C1508z c1508z = this.f15713f;
        if (c1508z != null) {
            c1508z.b();
        }
    }

    public final boolean b() {
        return this.f15715h && ((AudioTrack) AbstractC1119a.e(this.f15710c)).getPlayState() == 2 && e() == 0;
    }

    public int c(long j6) {
        return this.f15712e - ((int) (j6 - (e() * this.f15711d)));
    }

    public long d(boolean z6) {
        long f6;
        if (((AudioTrack) AbstractC1119a.e(this.f15710c)).getPlayState() == 3) {
            m();
        }
        long c6 = this.f15707J.c() / 1000;
        C1508z c1508z = (C1508z) AbstractC1119a.e(this.f15713f);
        boolean e6 = c1508z.e();
        if (e6) {
            f6 = AbstractC1117K.V0(c1508z.c(), this.f15714g) + AbstractC1117K.e0(c6 - c1508z.d(), this.f15717j);
        } else {
            f6 = this.f15731x == 0 ? f() : AbstractC1117K.e0(this.f15719l + c6, this.f15717j);
            if (!z6) {
                f6 = Math.max(0L, f6 - this.f15722o);
            }
        }
        if (this.f15702E != e6) {
            this.f15704G = this.f15701D;
            this.f15703F = this.f15700C;
        }
        long j6 = c6 - this.f15704G;
        if (j6 < 1000000) {
            long e02 = this.f15703F + AbstractC1117K.e0(j6, this.f15717j);
            long j7 = (j6 * 1000) / 1000000;
            f6 = ((f6 * j7) + ((1000 - j7) * e02)) / 1000;
        }
        if (!this.f15718k) {
            long j8 = this.f15700C;
            if (f6 > j8) {
                this.f15718k = true;
                this.f15708a.a(this.f15707J.a() - AbstractC1117K.k1(AbstractC1117K.j0(AbstractC1117K.k1(f6 - j8), this.f15717j)));
            }
        }
        this.f15701D = c6;
        this.f15700C = f6;
        this.f15702E = e6;
        return f6;
    }

    public final long e() {
        long b6 = this.f15707J.b();
        if (this.f15732y != -9223372036854775807L) {
            if (((AudioTrack) AbstractC1119a.e(this.f15710c)).getPlayState() == 2) {
                return this.f15698A;
            }
            return Math.min(this.f15699B, this.f15698A + AbstractC1117K.F(AbstractC1117K.e0(AbstractC1117K.J0(b6) - this.f15732y, this.f15717j), this.f15714g));
        }
        if (b6 - this.f15726s >= 5) {
            w(b6);
            this.f15726s = b6;
        }
        return this.f15727t + this.f15706I + (this.f15728u << 32);
    }

    public final long f() {
        return AbstractC1117K.V0(e(), this.f15714g);
    }

    public void g(long j6) {
        this.f15698A = e();
        this.f15732y = AbstractC1117K.J0(this.f15707J.b());
        this.f15699B = j6;
    }

    public boolean h(long j6) {
        return j6 > AbstractC1117K.F(d(false), this.f15714g) || b();
    }

    public boolean i() {
        return ((AudioTrack) AbstractC1119a.e(this.f15710c)).getPlayState() == 3;
    }

    public boolean j(long j6) {
        return this.f15733z != -9223372036854775807L && j6 > 0 && this.f15707J.b() - this.f15733z >= 200;
    }

    public boolean k(long j6) {
        int playState = ((AudioTrack) AbstractC1119a.e(this.f15710c)).getPlayState();
        if (this.f15715h) {
            if (playState == 2) {
                this.f15723p = false;
                return false;
            }
            if (playState == 1 && e() == 0) {
                return false;
            }
        }
        boolean z6 = this.f15723p;
        boolean h6 = h(j6);
        this.f15723p = h6;
        if (z6 && !h6 && playState != 1) {
            this.f15708a.b(this.f15712e, AbstractC1117K.k1(this.f15716i));
        }
        return true;
    }

    public final void l(long j6) {
        C1508z c1508z = (C1508z) AbstractC1119a.e(this.f15713f);
        if (c1508z.f(j6)) {
            long d6 = c1508z.d();
            long c6 = c1508z.c();
            long f6 = f();
            if (Math.abs(d6 - j6) > 5000000) {
                this.f15708a.e(c6, d6, j6, f6);
                c1508z.g();
            } else if (Math.abs(AbstractC1117K.V0(c6, this.f15714g) - f6) <= 5000000) {
                c1508z.a();
            } else {
                this.f15708a.d(c6, d6, j6, f6);
                c1508z.g();
            }
        }
    }

    public final void m() {
        long c6 = this.f15707J.c() / 1000;
        if (c6 - this.f15720m >= 30000) {
            long f6 = f();
            if (f6 != 0) {
                this.f15709b[this.f15730w] = AbstractC1117K.j0(f6, this.f15717j) - c6;
                this.f15730w = (this.f15730w + 1) % 10;
                int i6 = this.f15731x;
                if (i6 < 10) {
                    this.f15731x = i6 + 1;
                }
                this.f15720m = c6;
                this.f15719l = 0L;
                int i7 = 0;
                while (true) {
                    int i8 = this.f15731x;
                    if (i7 >= i8) {
                        break;
                    }
                    this.f15719l += this.f15709b[i7] / i8;
                    i7++;
                }
            } else {
                return;
            }
        }
        if (this.f15715h) {
            return;
        }
        l(c6);
        n(c6);
    }

    public final void n(long j6) {
        Method method;
        if (!this.f15724q || (method = this.f15721n) == null || j6 - this.f15725r < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) AbstractC1117K.i((Integer) method.invoke(AbstractC1119a.e(this.f15710c), new Object[0]))).intValue() * 1000) - this.f15716i;
            this.f15722o = intValue;
            long max = Math.max(intValue, 0L);
            this.f15722o = max;
            if (max > 5000000) {
                this.f15708a.c(max);
                this.f15722o = 0L;
            }
        } catch (Exception unused) {
            this.f15721n = null;
        }
        this.f15725r = j6;
    }

    public boolean p() {
        r();
        if (this.f15732y == -9223372036854775807L) {
            ((C1508z) AbstractC1119a.e(this.f15713f)).h();
            return true;
        }
        this.f15698A = e();
        return false;
    }

    public void q() {
        r();
        this.f15710c = null;
        this.f15713f = null;
    }

    public final void r() {
        this.f15719l = 0L;
        this.f15731x = 0;
        this.f15730w = 0;
        this.f15720m = 0L;
        this.f15701D = 0L;
        this.f15704G = 0L;
        this.f15718k = false;
    }

    public void s(AudioTrack audioTrack, boolean z6, int i6, int i7, int i8) {
        this.f15710c = audioTrack;
        this.f15711d = i7;
        this.f15712e = i8;
        this.f15713f = new C1508z(audioTrack);
        this.f15714g = audioTrack.getSampleRate();
        this.f15715h = z6 && o(i6);
        boolean B02 = AbstractC1117K.B0(i6);
        this.f15724q = B02;
        this.f15716i = B02 ? AbstractC1117K.V0(i8 / i7, this.f15714g) : -9223372036854775807L;
        this.f15727t = 0L;
        this.f15728u = 0L;
        this.f15705H = false;
        this.f15706I = 0L;
        this.f15729v = 0L;
        this.f15723p = false;
        this.f15732y = -9223372036854775807L;
        this.f15733z = -9223372036854775807L;
        this.f15725r = 0L;
        this.f15722o = 0L;
        this.f15717j = 1.0f;
    }

    public void t(float f6) {
        this.f15717j = f6;
        C1508z c1508z = this.f15713f;
        if (c1508z != null) {
            c1508z.h();
        }
        r();
    }

    public void u(InterfaceC1121c interfaceC1121c) {
        this.f15707J = interfaceC1121c;
    }

    public void v() {
        if (this.f15732y != -9223372036854775807L) {
            this.f15732y = AbstractC1117K.J0(this.f15707J.b());
        }
        ((C1508z) AbstractC1119a.e(this.f15713f)).h();
    }

    public final void w(long j6) {
        int playState = ((AudioTrack) AbstractC1119a.e(this.f15710c)).getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = r0.getPlaybackHeadPosition() & 4294967295L;
        if (this.f15715h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f15729v = this.f15727t;
            }
            playbackHeadPosition += this.f15729v;
        }
        if (AbstractC1117K.f10560a <= 29) {
            if (playbackHeadPosition == 0 && this.f15727t > 0 && playState == 3) {
                if (this.f15733z == -9223372036854775807L) {
                    this.f15733z = j6;
                    return;
                }
                return;
            }
            this.f15733z = -9223372036854775807L;
        }
        long j7 = this.f15727t;
        if (j7 > playbackHeadPosition) {
            if (this.f15705H) {
                this.f15706I += j7;
                this.f15705H = false;
            } else {
                this.f15728u++;
            }
        }
        this.f15727t = playbackHeadPosition;
    }
}
