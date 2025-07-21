package F1;

import E1.C0306h;
import E1.I;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.J;
import E1.O;
import E1.r;
import E1.u;
import Z0.q;
import Z0.z;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.io.EOFException;
import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements InterfaceC0314p {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f1559r;

    /* renamed from: u, reason: collision with root package name */
    public static final int f1562u;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1563a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1564b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1565c;

    /* renamed from: d, reason: collision with root package name */
    public long f1566d;

    /* renamed from: e, reason: collision with root package name */
    public int f1567e;

    /* renamed from: f, reason: collision with root package name */
    public int f1568f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1569g;

    /* renamed from: h, reason: collision with root package name */
    public long f1570h;

    /* renamed from: i, reason: collision with root package name */
    public int f1571i;

    /* renamed from: j, reason: collision with root package name */
    public int f1572j;

    /* renamed from: k, reason: collision with root package name */
    public long f1573k;

    /* renamed from: l, reason: collision with root package name */
    public r f1574l;

    /* renamed from: m, reason: collision with root package name */
    public O f1575m;

    /* renamed from: n, reason: collision with root package name */
    public J f1576n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1577o;

    /* renamed from: p, reason: collision with root package name */
    public static final u f1557p = new u() { // from class: F1.a
        @Override // E1.u
        public final InterfaceC0314p[] c() {
            return b.b();
        }
    };

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f1558q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f1560s = AbstractC1117K.s0("#!AMR\n");

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f1561t = AbstractC1117K.s0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f1559r = iArr;
        f1562u = iArr[8];
    }

    public b() {
        this(0);
    }

    public static /* synthetic */ InterfaceC0314p[] b() {
        return new InterfaceC0314p[]{new b()};
    }

    public static int f(int i6, long j6) {
        return (int) ((i6 * 8000000) / j6);
    }

    public static boolean q(InterfaceC0315q interfaceC0315q, byte[] bArr) {
        interfaceC0315q.o();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC0315q.s(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        this.f1566d = 0L;
        this.f1567e = 0;
        this.f1568f = 0;
        if (j6 != 0) {
            J j8 = this.f1576n;
            if (j8 instanceof C0306h) {
                this.f1573k = ((C0306h) j8).c(j6);
                return;
            }
        }
        this.f1573k = 0L;
    }

    @Override // E1.InterfaceC0314p
    public void c(r rVar) {
        this.f1574l = rVar;
        this.f1575m = rVar.a(0, 1);
        rVar.k();
    }

    public final void e() {
        AbstractC1119a.i(this.f1575m);
        AbstractC1117K.i(this.f1574l);
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, I i6) {
        e();
        if (interfaceC0315q.getPosition() == 0 && !s(interfaceC0315q)) {
            throw z.a("Could not find AMR header.", null);
        }
        o();
        int t6 = t(interfaceC0315q);
        p(interfaceC0315q.a(), t6);
        return t6;
    }

    @Override // E1.InterfaceC0314p
    public boolean i(InterfaceC0315q interfaceC0315q) {
        return s(interfaceC0315q);
    }

    public final J j(long j6, boolean z6) {
        return new C0306h(j6, this.f1570h, f(this.f1571i, 20000L), this.f1571i, z6);
    }

    public final int k(int i6) {
        if (m(i6)) {
            return this.f1565c ? f1559r[i6] : f1558q[i6];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.f1565c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i6);
        throw z.a(sb.toString(), null);
    }

    public final boolean l(int i6) {
        if (this.f1565c) {
            return false;
        }
        return i6 < 12 || i6 > 14;
    }

    public final boolean m(int i6) {
        if (i6 < 0 || i6 > 15) {
            return false;
        }
        return n(i6) || l(i6);
    }

    public final boolean n(int i6) {
        if (this.f1565c) {
            return i6 < 10 || i6 > 13;
        }
        return false;
    }

    public final void o() {
        if (this.f1577o) {
            return;
        }
        this.f1577o = true;
        boolean z6 = this.f1565c;
        this.f1575m.e(new q.b().o0(z6 ? "audio/amr-wb" : "audio/3gpp").f0(f1562u).N(1).p0(z6 ? 16000 : 8000).K());
    }

    public final void p(long j6, int i6) {
        int i7;
        if (this.f1569g) {
            return;
        }
        int i8 = this.f1564b;
        if ((i8 & 1) == 0 || j6 == -1 || !((i7 = this.f1571i) == -1 || i7 == this.f1567e)) {
            J.b bVar = new J.b(-9223372036854775807L);
            this.f1576n = bVar;
            this.f1574l.n(bVar);
            this.f1569g = true;
            return;
        }
        if (this.f1572j >= 20 || i6 == -1) {
            J j7 = j(j6, (i8 & 2) != 0);
            this.f1576n = j7;
            this.f1574l.n(j7);
            this.f1569g = true;
        }
    }

    public final int r(InterfaceC0315q interfaceC0315q) {
        interfaceC0315q.o();
        interfaceC0315q.s(this.f1563a, 0, 1);
        byte b6 = this.f1563a[0];
        if ((b6 & 131) <= 0) {
            return k((b6 >> 3) & 15);
        }
        throw z.a("Invalid padding bits for frame header " + ((int) b6), null);
    }

    @Override // E1.InterfaceC0314p
    public void release() {
    }

    public final boolean s(InterfaceC0315q interfaceC0315q) {
        byte[] bArr = f1560s;
        if (q(interfaceC0315q, bArr)) {
            this.f1565c = false;
            interfaceC0315q.p(bArr.length);
            return true;
        }
        byte[] bArr2 = f1561t;
        if (!q(interfaceC0315q, bArr2)) {
            return false;
        }
        this.f1565c = true;
        interfaceC0315q.p(bArr2.length);
        return true;
    }

    public final int t(InterfaceC0315q interfaceC0315q) {
        if (this.f1568f == 0) {
            try {
                int r6 = r(interfaceC0315q);
                this.f1567e = r6;
                this.f1568f = r6;
                if (this.f1571i == -1) {
                    this.f1570h = interfaceC0315q.getPosition();
                    this.f1571i = this.f1567e;
                }
                if (this.f1571i == this.f1567e) {
                    this.f1572j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int c6 = this.f1575m.c(interfaceC0315q, this.f1568f, true);
        if (c6 == -1) {
            return -1;
        }
        int i6 = this.f1568f - c6;
        this.f1568f = i6;
        if (i6 > 0) {
            return 0;
        }
        this.f1575m.f(this.f1573k + this.f1566d, 1, this.f1567e, 0, null);
        this.f1566d += 20000;
        return 0;
    }

    public b(int i6) {
        this.f1564b = (i6 & 2) != 0 ? i6 | 1 : i6;
        this.f1563a = new byte[1];
        this.f1571i = -1;
    }
}
