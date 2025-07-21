package o1;

import Z0.q;
import android.graphics.Bitmap;
import c1.AbstractC1112F;
import c1.AbstractC1119a;
import g1.AbstractC1328e;
import g1.C1337i0;
import g1.K0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import o1.c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class g extends AbstractC1328e {

    /* renamed from: A, reason: collision with root package name */
    public int f17851A;

    /* renamed from: B, reason: collision with root package name */
    public q f17852B;

    /* renamed from: C, reason: collision with root package name */
    public c f17853C;

    /* renamed from: D, reason: collision with root package name */
    public f1.f f17854D;

    /* renamed from: E, reason: collision with root package name */
    public e f17855E;

    /* renamed from: F, reason: collision with root package name */
    public Bitmap f17856F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f17857G;

    /* renamed from: H, reason: collision with root package name */
    public b f17858H;

    /* renamed from: I, reason: collision with root package name */
    public b f17859I;

    /* renamed from: J, reason: collision with root package name */
    public int f17860J;

    /* renamed from: r, reason: collision with root package name */
    public final c.a f17861r;

    /* renamed from: s, reason: collision with root package name */
    public final f1.f f17862s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayDeque f17863t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f17864u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f17865v;

    /* renamed from: w, reason: collision with root package name */
    public a f17866w;

    /* renamed from: x, reason: collision with root package name */
    public long f17867x;

    /* renamed from: y, reason: collision with root package name */
    public long f17868y;

    /* renamed from: z, reason: collision with root package name */
    public int f17869z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f17870c = new a(-9223372036854775807L, -9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f17871a;

        /* renamed from: b, reason: collision with root package name */
        public final long f17872b;

        public a(long j6, long j7) {
            this.f17871a = j6;
            this.f17872b = j7;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f17873a;

        /* renamed from: b, reason: collision with root package name */
        public final long f17874b;

        /* renamed from: c, reason: collision with root package name */
        public Bitmap f17875c;

        public b(int i6, long j6) {
            this.f17873a = i6;
            this.f17874b = j6;
        }

        public long a() {
            return this.f17874b;
        }

        public Bitmap b() {
            return this.f17875c;
        }

        public int c() {
            return this.f17873a;
        }

        public boolean d() {
            return this.f17875c != null;
        }

        public void e(Bitmap bitmap) {
            this.f17875c = bitmap;
        }
    }

    public g(c.a aVar, e eVar) {
        super(4);
        this.f17861r = aVar;
        this.f17855E = w0(eVar);
        this.f17862s = f1.f.r();
        this.f17866w = a.f17870c;
        this.f17863t = new ArrayDeque();
        this.f17868y = -9223372036854775807L;
        this.f17867x = -9223372036854775807L;
        this.f17869z = 0;
        this.f17851A = 1;
    }

    private void B0(long j6) {
        this.f17867x = j6;
        while (!this.f17863t.isEmpty() && j6 >= ((a) this.f17863t.peek()).f17871a) {
            this.f17866w = (a) this.f17863t.removeFirst();
        }
    }

    public static e w0(e eVar) {
        return eVar == null ? e.f17849a : eVar;
    }

    public final void A0(long j6, f1.f fVar) {
        boolean z6 = true;
        if (fVar.i()) {
            this.f17857G = true;
            return;
        }
        b bVar = new b(this.f17860J, fVar.f14007f);
        this.f17859I = bVar;
        this.f17860J++;
        if (!this.f17857G) {
            long a6 = bVar.a();
            boolean z7 = a6 - 30000 <= j6 && j6 <= 30000 + a6;
            b bVar2 = this.f17858H;
            boolean z8 = bVar2 != null && bVar2.a() <= j6 && j6 < a6;
            boolean y02 = y0((b) AbstractC1119a.i(this.f17859I));
            if (!z7 && !z8 && !y02) {
                z6 = false;
            }
            this.f17857G = z6;
            if (z8 && !z7) {
                return;
            }
        }
        this.f17858H = this.f17859I;
        this.f17859I = null;
    }

    public boolean C0(long j6, long j7, Bitmap bitmap, long j8) {
        long j9 = j8 - j6;
        if (!F0() && j9 >= 30000) {
            return false;
        }
        this.f17855E.b(j8 - this.f17866w.f17872b, bitmap);
        return true;
    }

    public final void D0() {
        this.f17854D = null;
        this.f17869z = 0;
        this.f17868y = -9223372036854775807L;
        c cVar = this.f17853C;
        if (cVar != null) {
            cVar.release();
            this.f17853C = null;
        }
    }

    public final void E0(e eVar) {
        this.f17855E = w0(eVar);
    }

    public final boolean F0() {
        boolean z6 = f() == 2;
        int i6 = this.f17851A;
        if (i6 == 0) {
            return z6;
        }
        if (i6 == 1) {
            return true;
        }
        if (i6 == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // g1.AbstractC1328e, g1.H0.b
    public void H(int i6, Object obj) {
        if (i6 != 15) {
            super.H(i6, obj);
        } else {
            E0(obj instanceof e ? (e) obj : null);
        }
    }

    @Override // g1.K0
    public int b(q qVar) {
        return this.f17861r.b(qVar);
    }

    @Override // g1.J0
    public boolean c() {
        int i6 = this.f17851A;
        if (i6 != 3) {
            return i6 == 0 && this.f17857G;
        }
        return true;
    }

    @Override // g1.J0
    public boolean d() {
        return this.f17865v;
    }

    @Override // g1.AbstractC1328e
    public void e0() {
        this.f17852B = null;
        this.f17866w = a.f17870c;
        this.f17863t.clear();
        D0();
        this.f17855E.a();
    }

    @Override // g1.AbstractC1328e
    public void f0(boolean z6, boolean z7) {
        this.f17851A = z7 ? 1 : 0;
    }

    @Override // g1.J0, g1.K0
    public String getName() {
        return "ImageRenderer";
    }

    @Override // g1.AbstractC1328e
    public void h0(long j6, boolean z6) {
        z0(1);
        this.f17865v = false;
        this.f17864u = false;
        this.f17856F = null;
        this.f17858H = null;
        this.f17859I = null;
        this.f17857G = false;
        this.f17854D = null;
        c cVar = this.f17853C;
        if (cVar != null) {
            cVar.flush();
        }
        this.f17863t.clear();
    }

    @Override // g1.J0
    public void i(long j6, long j7) {
        if (this.f17865v) {
            return;
        }
        if (this.f17852B == null) {
            C1337i0 Y5 = Y();
            this.f17862s.f();
            int p02 = p0(Y5, this.f17862s, 2);
            if (p02 != -5) {
                if (p02 == -4) {
                    AbstractC1119a.g(this.f17862s.i());
                    this.f17864u = true;
                    this.f17865v = true;
                    return;
                }
                return;
            }
            this.f17852B = (q) AbstractC1119a.i(Y5.f14685b);
            x0();
        }
        try {
            AbstractC1112F.a("drainAndFeedDecoder");
            do {
            } while (u0(j6, j7));
            do {
            } while (v0(j6));
            AbstractC1112F.b();
        } catch (d e6) {
            throw U(e6, null, 4003);
        }
    }

    @Override // g1.AbstractC1328e
    public void i0() {
        D0();
    }

    @Override // g1.AbstractC1328e
    public void k0() {
        D0();
        z0(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // g1.AbstractC1328e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n0(Z0.q[] r5, long r6, long r8, w1.InterfaceC2212D.b r10) {
        /*
            r4 = this;
            super.n0(r5, r6, r8, r10)
            r5 = r4
            o1.g$a r6 = r5.f17866w
            long r6 = r6.f17872b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L37
            java.util.ArrayDeque r6 = r5.f17863t
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L2a
            long r6 = r5.f17868y
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L37
            long r2 = r5.f17867x
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L2a
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L2a
            goto L37
        L2a:
            java.util.ArrayDeque r6 = r5.f17863t
            o1.g$a r7 = new o1.g$a
            long r0 = r5.f17868y
            r7.<init>(r0, r8)
            r6.add(r7)
            return
        L37:
            o1.g$a r6 = new o1.g$a
            r6.<init>(r0, r8)
            r5.f17866w = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.g.n0(Z0.q[], long, long, w1.D$b):void");
    }

    public final boolean s0(q qVar) {
        int b6 = this.f17861r.b(qVar);
        return b6 == K0.E(4) || b6 == K0.E(3);
    }

    public final Bitmap t0(int i6) {
        AbstractC1119a.i(this.f17856F);
        int width = this.f17856F.getWidth() / ((q) AbstractC1119a.i(this.f17852B)).f6973I;
        int height = this.f17856F.getHeight() / ((q) AbstractC1119a.i(this.f17852B)).f6974J;
        int i7 = this.f17852B.f6973I;
        return Bitmap.createBitmap(this.f17856F, (i6 % i7) * width, (i6 / i7) * height, width, height);
    }

    public final boolean u0(long j6, long j7) {
        if (this.f17856F != null && this.f17858H == null) {
            return false;
        }
        if (this.f17851A == 0 && f() != 2) {
            return false;
        }
        if (this.f17856F == null) {
            AbstractC1119a.i(this.f17853C);
            f a6 = this.f17853C.a();
            if (a6 == null) {
                return false;
            }
            if (((f) AbstractC1119a.i(a6)).i()) {
                if (this.f17869z == 3) {
                    D0();
                    AbstractC1119a.i(this.f17852B);
                    x0();
                } else {
                    ((f) AbstractC1119a.i(a6)).n();
                    if (this.f17863t.isEmpty()) {
                        this.f17865v = true;
                    }
                }
                return false;
            }
            AbstractC1119a.j(a6.f17850e, "Non-EOS buffer came back from the decoder without bitmap.");
            this.f17856F = a6.f17850e;
            ((f) AbstractC1119a.i(a6)).n();
        }
        if (!this.f17857G || this.f17856F == null || this.f17858H == null) {
            return false;
        }
        AbstractC1119a.i(this.f17852B);
        q qVar = this.f17852B;
        int i6 = qVar.f6973I;
        boolean z6 = ((i6 == 1 && qVar.f6974J == 1) || i6 == -1 || qVar.f6974J == -1) ? false : true;
        if (!this.f17858H.d()) {
            b bVar = this.f17858H;
            bVar.e(z6 ? t0(bVar.c()) : (Bitmap) AbstractC1119a.i(this.f17856F));
        }
        if (!C0(j6, j7, (Bitmap) AbstractC1119a.i(this.f17858H.b()), this.f17858H.a())) {
            return false;
        }
        B0(((b) AbstractC1119a.i(this.f17858H)).a());
        this.f17851A = 3;
        if (!z6 || ((b) AbstractC1119a.i(this.f17858H)).c() == (((q) AbstractC1119a.i(this.f17852B)).f6974J * ((q) AbstractC1119a.i(this.f17852B)).f6973I) - 1) {
            this.f17856F = null;
        }
        this.f17858H = this.f17859I;
        this.f17859I = null;
        return true;
    }

    public final boolean v0(long j6) {
        if (this.f17857G && this.f17858H != null) {
            return false;
        }
        C1337i0 Y5 = Y();
        c cVar = this.f17853C;
        if (cVar == null || this.f17869z == 3 || this.f17864u) {
            return false;
        }
        if (this.f17854D == null) {
            f1.f fVar = (f1.f) cVar.d();
            this.f17854D = fVar;
            if (fVar == null) {
                return false;
            }
        }
        if (this.f17869z == 2) {
            AbstractC1119a.i(this.f17854D);
            this.f17854D.m(4);
            ((c) AbstractC1119a.i(this.f17853C)).e(this.f17854D);
            this.f17854D = null;
            this.f17869z = 3;
            return false;
        }
        int p02 = p0(Y5, this.f17854D, 0);
        if (p02 == -5) {
            this.f17852B = (q) AbstractC1119a.i(Y5.f14685b);
            this.f17869z = 2;
            return true;
        }
        if (p02 != -4) {
            if (p02 == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.f17854D.p();
        boolean z6 = ((ByteBuffer) AbstractC1119a.i(this.f17854D.f14005d)).remaining() > 0 || ((f1.f) AbstractC1119a.i(this.f17854D)).i();
        if (z6) {
            ((c) AbstractC1119a.i(this.f17853C)).e((f1.f) AbstractC1119a.i(this.f17854D));
            this.f17860J = 0;
        }
        A0(j6, (f1.f) AbstractC1119a.i(this.f17854D));
        if (((f1.f) AbstractC1119a.i(this.f17854D)).i()) {
            this.f17864u = true;
            this.f17854D = null;
            return false;
        }
        this.f17868y = Math.max(this.f17868y, ((f1.f) AbstractC1119a.i(this.f17854D)).f14007f);
        if (z6) {
            this.f17854D = null;
        } else {
            ((f1.f) AbstractC1119a.i(this.f17854D)).f();
        }
        return !this.f17857G;
    }

    public final void x0() {
        if (!s0(this.f17852B)) {
            throw U(new d("Provided decoder factory can't create decoder for format."), this.f17852B, 4005);
        }
        c cVar = this.f17853C;
        if (cVar != null) {
            cVar.release();
        }
        this.f17853C = this.f17861r.a();
    }

    public final boolean y0(b bVar) {
        return ((q) AbstractC1119a.i(this.f17852B)).f6973I == -1 || this.f17852B.f6974J == -1 || bVar.c() == (((q) AbstractC1119a.i(this.f17852B)).f6974J * this.f17852B.f6973I) - 1;
    }

    public final void z0(int i6) {
        this.f17851A = Math.min(this.f17851A, i6);
    }
}
