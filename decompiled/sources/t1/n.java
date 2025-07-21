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
public final class n implements k {

    /* renamed from: a, reason: collision with root package name */
    public final C2047g f19023a;

    /* renamed from: b, reason: collision with root package name */
    public O f19024b;

    /* renamed from: c, reason: collision with root package name */
    public long f19025c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public int f19026d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f19027e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f19028f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f19029g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19030h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19031i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19032j;

    public n(C2047g c2047g) {
        this.f19023a = c2047g;
    }

    private void e() {
        O o6 = (O) AbstractC1119a.e(this.f19024b);
        long j6 = this.f19028f;
        boolean z6 = this.f19031i;
        o6.f(j6, z6 ? 1 : 0, this.f19027e, 0, null);
        this.f19027e = -1;
        this.f19028f = -9223372036854775807L;
        this.f19030h = false;
    }

    @Override // t1.k
    public void a(long j6, long j7) {
        this.f19025c = j6;
        this.f19027e = -1;
        this.f19029g = j7;
    }

    @Override // t1.k
    public void b(long j6, int i6) {
        AbstractC1119a.g(this.f19025c == -9223372036854775807L);
        this.f19025c = j6;
    }

    @Override // t1.k
    public void c(C1144z c1144z, long j6, int i6, boolean z6) {
        AbstractC1119a.i(this.f19024b);
        if (f(c1144z, i6)) {
            if (this.f19027e == -1 && this.f19030h) {
                this.f19031i = (c1144z.j() & 1) == 0;
            }
            if (!this.f19032j) {
                int f6 = c1144z.f();
                c1144z.T(f6 + 6);
                int y6 = c1144z.y() & 16383;
                int y7 = c1144z.y() & 16383;
                c1144z.T(f6);
                q qVar = this.f19023a.f18807c;
                if (y6 != qVar.f6996t || y7 != qVar.f6997u) {
                    this.f19024b.e(qVar.a().v0(y6).Y(y7).K());
                }
                this.f19032j = true;
            }
            int a6 = c1144z.a();
            this.f19024b.a(c1144z, a6);
            int i7 = this.f19027e;
            if (i7 == -1) {
                this.f19027e = a6;
            } else {
                this.f19027e = i7 + a6;
            }
            this.f19028f = m.a(this.f19029g, j6, this.f19025c, 90000);
            if (z6) {
                e();
            }
            this.f19026d = i6;
        }
    }

    @Override // t1.k
    public void d(r rVar, int i6) {
        O a6 = rVar.a(i6, 2);
        this.f19024b = a6;
        a6.e(this.f19023a.f18807c);
    }

    public final boolean f(C1144z c1144z, int i6) {
        int G6 = c1144z.G();
        if ((G6 & 16) == 16 && (G6 & 7) == 0) {
            if (this.f19030h && this.f19027e > 0) {
                e();
            }
            this.f19030h = true;
        } else {
            if (!this.f19030h) {
                AbstractC1133o.h("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
                return false;
            }
            int b6 = C2044d.b(this.f19026d);
            if (i6 < b6) {
                AbstractC1133o.h("RtpVP8Reader", AbstractC1117K.H("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(b6), Integer.valueOf(i6)));
                return false;
            }
        }
        if ((G6 & 128) != 0) {
            int G7 = c1144z.G();
            if ((G7 & 128) != 0 && (c1144z.G() & 128) != 0) {
                c1144z.U(1);
            }
            if ((G7 & 64) != 0) {
                c1144z.U(1);
            }
            if ((G7 & 32) != 0 || (G7 & 16) != 0) {
                c1144z.U(1);
            }
        }
        return true;
    }
}
