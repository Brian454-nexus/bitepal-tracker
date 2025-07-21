package t1;

import E1.O;
import E1.r;
import Z0.q;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1144z;
import s1.C2044d;
import s1.C2047g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class o implements k {

    /* renamed from: a, reason: collision with root package name */
    public final C2047g f19033a;

    /* renamed from: b, reason: collision with root package name */
    public O f19034b;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19042j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19043k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19044l;

    /* renamed from: c, reason: collision with root package name */
    public long f19035c = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    public int f19038f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f19039g = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public long f19036d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f19037e = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f19040h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f19041i = -1;

    public o(C2047g c2047g) {
        this.f19033a = c2047g;
    }

    private void e() {
        O o6 = (O) AbstractC1119a.e(this.f19034b);
        long j6 = this.f19039g;
        boolean z6 = this.f19044l;
        o6.f(j6, z6 ? 1 : 0, this.f19038f, 0, null);
        this.f19038f = -1;
        this.f19039g = -9223372036854775807L;
        this.f19042j = false;
    }

    @Override // t1.k
    public void a(long j6, long j7) {
        this.f19035c = j6;
        this.f19038f = -1;
        this.f19036d = j7;
    }

    @Override // t1.k
    public void b(long j6, int i6) {
        AbstractC1119a.g(this.f19035c == -9223372036854775807L);
        this.f19035c = j6;
    }

    @Override // t1.k
    public void c(C1144z c1144z, long j6, int i6, boolean z6) {
        int i7;
        int i8;
        AbstractC1119a.i(this.f19034b);
        if (f(c1144z, i6)) {
            if (this.f19038f == -1 && this.f19042j) {
                this.f19044l = (c1144z.j() & 4) == 0;
            }
            if (!this.f19043k && (i7 = this.f19040h) != -1 && (i8 = this.f19041i) != -1) {
                q qVar = this.f19033a.f18807c;
                if (i7 != qVar.f6996t || i8 != qVar.f6997u) {
                    this.f19034b.e(qVar.a().v0(this.f19040h).Y(this.f19041i).K());
                }
                this.f19043k = true;
            }
            int a6 = c1144z.a();
            this.f19034b.a(c1144z, a6);
            int i9 = this.f19038f;
            if (i9 == -1) {
                this.f19038f = a6;
            } else {
                this.f19038f = i9 + a6;
            }
            this.f19039g = m.a(this.f19036d, j6, this.f19035c, 90000);
            if (z6) {
                e();
            }
            this.f19037e = i6;
        }
    }

    @Override // t1.k
    public void d(r rVar, int i6) {
        O a6 = rVar.a(i6, 2);
        this.f19034b = a6;
        a6.e(this.f19033a.f18807c);
    }

    public final boolean f(C1144z c1144z, int i6) {
        int G6 = c1144z.G();
        if ((G6 & 8) == 8) {
            if (this.f19042j && this.f19038f > 0) {
                e();
            }
            this.f19042j = true;
        } else {
            if (!this.f19042j) {
                AbstractC1133o.h("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                return false;
            }
            int b6 = C2044d.b(this.f19037e);
            if (i6 < b6) {
                AbstractC1133o.h("RtpVp9Reader", AbstractC1117K.H("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(b6), Integer.valueOf(i6)));
                return false;
            }
        }
        if ((G6 & 128) != 0 && (c1144z.G() & 128) != 0 && c1144z.a() < 1) {
            return false;
        }
        int i7 = G6 & 16;
        AbstractC1119a.b(i7 == 0, "VP9 flexible mode is not supported.");
        if ((G6 & 32) != 0) {
            c1144z.U(1);
            if (c1144z.a() < 1) {
                return false;
            }
            if (i7 == 0) {
                c1144z.U(1);
            }
        }
        if ((G6 & 2) != 0) {
            int G7 = c1144z.G();
            int i8 = (G7 >> 5) & 7;
            if ((G7 & 16) != 0) {
                int i9 = i8 + 1;
                if (c1144z.a() < i9 * 4) {
                    return false;
                }
                for (int i10 = 0; i10 < i9; i10++) {
                    this.f19040h = c1144z.M();
                    this.f19041i = c1144z.M();
                }
            }
            if ((G7 & 8) != 0) {
                int G8 = c1144z.G();
                if (c1144z.a() < G8) {
                    return false;
                }
                for (int i11 = 0; i11 < G8; i11++) {
                    int M5 = (c1144z.M() & 12) >> 2;
                    if (c1144z.a() < M5) {
                        return false;
                    }
                    c1144z.U(M5);
                }
            }
        }
        return true;
    }
}
