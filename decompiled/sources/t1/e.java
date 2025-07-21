package t1;

import E1.O;
import E1.r;
import Z0.q;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1144z;
import kotlin.io.ConstantsKt;
import s1.C2044d;
import s1.C2047g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements k {

    /* renamed from: a, reason: collision with root package name */
    public final C2047g f18966a;

    /* renamed from: b, reason: collision with root package name */
    public O f18967b;

    /* renamed from: d, reason: collision with root package name */
    public int f18969d;

    /* renamed from: f, reason: collision with root package name */
    public int f18971f;

    /* renamed from: g, reason: collision with root package name */
    public int f18972g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18973h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18974i;

    /* renamed from: j, reason: collision with root package name */
    public long f18975j;

    /* renamed from: k, reason: collision with root package name */
    public long f18976k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18977l;

    /* renamed from: c, reason: collision with root package name */
    public long f18968c = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public int f18970e = -1;

    public e(C2047g c2047g) {
        this.f18966a = c2047g;
    }

    private void e() {
        O o6 = (O) AbstractC1119a.e(this.f18967b);
        long j6 = this.f18976k;
        boolean z6 = this.f18973h;
        o6.f(j6, z6 ? 1 : 0, this.f18969d, 0, null);
        this.f18969d = 0;
        this.f18976k = -9223372036854775807L;
        this.f18973h = false;
        this.f18977l = false;
    }

    @Override // t1.k
    public void a(long j6, long j7) {
        this.f18968c = j6;
        this.f18969d = 0;
        this.f18975j = j7;
    }

    @Override // t1.k
    public void b(long j6, int i6) {
        AbstractC1119a.g(this.f18968c == -9223372036854775807L);
        this.f18968c = j6;
    }

    @Override // t1.k
    public void c(C1144z c1144z, long j6, int i6, boolean z6) {
        AbstractC1119a.i(this.f18967b);
        int f6 = c1144z.f();
        int M5 = c1144z.M();
        boolean z7 = (M5 & 1024) > 0;
        if ((M5 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 || (M5 & 504) != 0 || (M5 & 7) != 0) {
            AbstractC1133o.h("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
            return;
        }
        if (z7) {
            if (this.f18977l && this.f18969d > 0) {
                e();
            }
            this.f18977l = true;
            if ((c1144z.j() & 252) < 128) {
                AbstractC1133o.h("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                return;
            } else {
                c1144z.e()[f6] = 0;
                c1144z.e()[f6 + 1] = 0;
                c1144z.T(f6);
            }
        } else {
            if (!this.f18977l) {
                AbstractC1133o.h("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                return;
            }
            int b6 = C2044d.b(this.f18970e);
            if (i6 < b6) {
                AbstractC1133o.h("RtpH263Reader", AbstractC1117K.H("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(b6), Integer.valueOf(i6)));
                return;
            }
        }
        if (this.f18969d == 0) {
            f(c1144z, this.f18974i);
            if (!this.f18974i && this.f18973h) {
                int i7 = this.f18971f;
                q qVar = this.f18966a.f18807c;
                if (i7 != qVar.f6996t || this.f18972g != qVar.f6997u) {
                    this.f18967b.e(qVar.a().v0(this.f18971f).Y(this.f18972g).K());
                }
                this.f18974i = true;
            }
        }
        int a6 = c1144z.a();
        this.f18967b.a(c1144z, a6);
        this.f18969d += a6;
        this.f18976k = m.a(this.f18975j, j6, this.f18968c, 90000);
        if (z6) {
            e();
        }
        this.f18970e = i6;
    }

    @Override // t1.k
    public void d(r rVar, int i6) {
        O a6 = rVar.a(i6, 2);
        this.f18967b = a6;
        a6.e(this.f18966a.f18807c);
    }

    public final void f(C1144z c1144z, boolean z6) {
        int f6 = c1144z.f();
        if (((c1144z.I() >> 10) & 63) != 32) {
            c1144z.T(f6);
            this.f18973h = false;
            return;
        }
        int j6 = c1144z.j();
        int i6 = (j6 >> 1) & 1;
        if (!z6 && i6 == 0) {
            int i7 = (j6 >> 2) & 7;
            if (i7 == 1) {
                this.f18971f = 128;
                this.f18972g = 96;
            } else {
                int i8 = i7 - 2;
                this.f18971f = 176 << i8;
                this.f18972g = 144 << i8;
            }
        }
        c1144z.T(f6);
        this.f18973h = i6 == 0;
    }
}
