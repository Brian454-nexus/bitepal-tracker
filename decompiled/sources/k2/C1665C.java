package k2;

import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.J;
import android.util.SparseArray;
import c1.AbstractC1119a;
import c1.C1111E;
import c1.C1143y;
import c1.C1144z;
import k2.K;
import kotlin.io.ConstantsKt;

/* renamed from: k2.C, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1665C implements InterfaceC0314p {

    /* renamed from: l, reason: collision with root package name */
    public static final E1.u f16415l = new E1.u() { // from class: k2.B
        @Override // E1.u
        public final InterfaceC0314p[] c() {
            return C1665C.b();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final C1111E f16416a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f16417b;

    /* renamed from: c, reason: collision with root package name */
    public final C1144z f16418c;

    /* renamed from: d, reason: collision with root package name */
    public final C1663A f16419d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16420e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16421f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16422g;

    /* renamed from: h, reason: collision with root package name */
    public long f16423h;

    /* renamed from: i, reason: collision with root package name */
    public z f16424i;

    /* renamed from: j, reason: collision with root package name */
    public E1.r f16425j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16426k;

    /* renamed from: k2.C$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC1679m f16427a;

        /* renamed from: b, reason: collision with root package name */
        public final C1111E f16428b;

        /* renamed from: c, reason: collision with root package name */
        public final C1143y f16429c = new C1143y(new byte[64]);

        /* renamed from: d, reason: collision with root package name */
        public boolean f16430d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f16431e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f16432f;

        /* renamed from: g, reason: collision with root package name */
        public int f16433g;

        /* renamed from: h, reason: collision with root package name */
        public long f16434h;

        public a(InterfaceC1679m interfaceC1679m, C1111E c1111e) {
            this.f16427a = interfaceC1679m;
            this.f16428b = c1111e;
        }

        public void a(C1144z c1144z) {
            c1144z.l(this.f16429c.f10640a, 0, 3);
            this.f16429c.p(0);
            b();
            c1144z.l(this.f16429c.f10640a, 0, this.f16433g);
            this.f16429c.p(0);
            c();
            this.f16427a.d(this.f16434h, 4);
            this.f16427a.a(c1144z);
            this.f16427a.c(false);
        }

        public final void b() {
            this.f16429c.r(8);
            this.f16430d = this.f16429c.g();
            this.f16431e = this.f16429c.g();
            this.f16429c.r(6);
            this.f16433g = this.f16429c.h(8);
        }

        public final void c() {
            this.f16434h = 0L;
            if (this.f16430d) {
                this.f16429c.r(4);
                this.f16429c.r(1);
                this.f16429c.r(1);
                long h6 = (this.f16429c.h(3) << 30) | (this.f16429c.h(15) << 15) | this.f16429c.h(15);
                this.f16429c.r(1);
                if (!this.f16432f && this.f16431e) {
                    this.f16429c.r(4);
                    this.f16429c.r(1);
                    this.f16429c.r(1);
                    this.f16429c.r(1);
                    this.f16428b.b((this.f16429c.h(3) << 30) | (this.f16429c.h(15) << 15) | this.f16429c.h(15));
                    this.f16432f = true;
                }
                this.f16434h = this.f16428b.b(h6);
            }
        }

        public void d() {
            this.f16432f = false;
            this.f16427a.b();
        }
    }

    public C1665C() {
        this(new C1111E(0L));
    }

    public static /* synthetic */ InterfaceC0314p[] b() {
        return new InterfaceC0314p[]{new C1665C()};
    }

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        boolean z6 = this.f16416a.f() == -9223372036854775807L;
        if (!z6) {
            long d6 = this.f16416a.d();
            z6 = (d6 == -9223372036854775807L || d6 == 0 || d6 == j7) ? false : true;
        }
        if (z6) {
            this.f16416a.i(j7);
        }
        z zVar = this.f16424i;
        if (zVar != null) {
            zVar.h(j7);
        }
        for (int i6 = 0; i6 < this.f16417b.size(); i6++) {
            ((a) this.f16417b.valueAt(i6)).d();
        }
    }

    @Override // E1.InterfaceC0314p
    public void c(E1.r rVar) {
        this.f16425j = rVar;
    }

    public final void e(long j6) {
        if (this.f16426k) {
            return;
        }
        this.f16426k = true;
        if (this.f16419d.c() == -9223372036854775807L) {
            this.f16425j.n(new J.b(this.f16419d.c()));
            return;
        }
        z zVar = new z(this.f16419d.d(), this.f16419d.c(), j6);
        this.f16424i = zVar;
        this.f16425j.n(zVar.b());
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, E1.I i6) {
        InterfaceC1679m interfaceC1679m;
        AbstractC1119a.i(this.f16425j);
        long a6 = interfaceC0315q.a();
        if (a6 != -1 && !this.f16419d.e()) {
            return this.f16419d.g(interfaceC0315q, i6);
        }
        e(a6);
        z zVar = this.f16424i;
        if (zVar != null && zVar.d()) {
            return this.f16424i.c(interfaceC0315q, i6);
        }
        interfaceC0315q.o();
        long h6 = a6 != -1 ? a6 - interfaceC0315q.h() : -1L;
        if ((h6 != -1 && h6 < 4) || !interfaceC0315q.g(this.f16418c.e(), 0, 4, true)) {
            return -1;
        }
        this.f16418c.T(0);
        int p6 = this.f16418c.p();
        if (p6 == 441) {
            return -1;
        }
        if (p6 == 442) {
            interfaceC0315q.s(this.f16418c.e(), 0, 10);
            this.f16418c.T(9);
            interfaceC0315q.p((this.f16418c.G() & 7) + 14);
            return 0;
        }
        if (p6 == 443) {
            interfaceC0315q.s(this.f16418c.e(), 0, 2);
            this.f16418c.T(0);
            interfaceC0315q.p(this.f16418c.M() + 6);
            return 0;
        }
        if (((p6 & (-256)) >> 8) != 1) {
            interfaceC0315q.p(1);
            return 0;
        }
        int i7 = p6 & 255;
        a aVar = (a) this.f16417b.get(i7);
        if (!this.f16420e) {
            if (aVar == null) {
                if (i7 == 189) {
                    interfaceC1679m = new C1669c();
                    this.f16421f = true;
                    this.f16423h = interfaceC0315q.getPosition();
                } else if ((p6 & 224) == 192) {
                    interfaceC1679m = new t();
                    this.f16421f = true;
                    this.f16423h = interfaceC0315q.getPosition();
                } else if ((p6 & 240) == 224) {
                    interfaceC1679m = new n();
                    this.f16422g = true;
                    this.f16423h = interfaceC0315q.getPosition();
                } else {
                    interfaceC1679m = null;
                }
                if (interfaceC1679m != null) {
                    interfaceC1679m.e(this.f16425j, new K.d(i7, 256));
                    aVar = new a(interfaceC1679m, this.f16416a);
                    this.f16417b.put(i7, aVar);
                }
            }
            if (interfaceC0315q.getPosition() > ((this.f16421f && this.f16422g) ? this.f16423h + 8192 : 1048576L)) {
                this.f16420e = true;
                this.f16425j.k();
            }
        }
        interfaceC0315q.s(this.f16418c.e(), 0, 2);
        this.f16418c.T(0);
        int M5 = this.f16418c.M() + 6;
        if (aVar == null) {
            interfaceC0315q.p(M5);
        } else {
            this.f16418c.P(M5);
            interfaceC0315q.readFully(this.f16418c.e(), 0, M5);
            this.f16418c.T(6);
            aVar.a(this.f16418c);
            C1144z c1144z = this.f16418c;
            c1144z.S(c1144z.b());
        }
        return 0;
    }

    @Override // E1.InterfaceC0314p
    public boolean i(InterfaceC0315q interfaceC0315q) {
        byte[] bArr = new byte[14];
        interfaceC0315q.s(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        interfaceC0315q.j(bArr[13] & 7);
        interfaceC0315q.s(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // E1.InterfaceC0314p
    public void release() {
    }

    public C1665C(C1111E c1111e) {
        this.f16416a = c1111e;
        this.f16418c = new C1144z(ConstantsKt.DEFAULT_BLOCK_SIZE);
        this.f16417b = new SparseArray();
        this.f16419d = new C1663A();
    }
}
