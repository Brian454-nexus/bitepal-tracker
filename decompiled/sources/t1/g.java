package t1;

import E1.O;
import E1.r;
import Z0.z;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1144z;
import kotlin.jvm.internal.ByteCompanionObject;
import s1.C2047g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g implements k {

    /* renamed from: c, reason: collision with root package name */
    public final C2047g f18989c;

    /* renamed from: d, reason: collision with root package name */
    public O f18990d;

    /* renamed from: e, reason: collision with root package name */
    public int f18991e;

    /* renamed from: h, reason: collision with root package name */
    public int f18994h;

    /* renamed from: i, reason: collision with root package name */
    public long f18995i;

    /* renamed from: a, reason: collision with root package name */
    public final C1144z f18987a = new C1144z();

    /* renamed from: b, reason: collision with root package name */
    public final C1144z f18988b = new C1144z(d1.d.f13379a);

    /* renamed from: f, reason: collision with root package name */
    public long f18992f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public int f18993g = -1;

    public g(C2047g c2047g) {
        this.f18989c = c2047g;
    }

    private static int e(int i6) {
        return (i6 == 19 || i6 == 20) ? 1 : 0;
    }

    private void f(C1144z c1144z, int i6) {
        if (c1144z.e().length < 3) {
            throw z.c("Malformed FU header.", null);
        }
        int i7 = c1144z.e()[1] & 7;
        byte b6 = c1144z.e()[2];
        int i8 = b6 & 63;
        boolean z6 = (b6 & ByteCompanionObject.MIN_VALUE) > 0;
        boolean z7 = (b6 & 64) > 0;
        if (z6) {
            this.f18994h += h();
            c1144z.e()[1] = (byte) ((i8 << 1) & 127);
            c1144z.e()[2] = (byte) i7;
            this.f18987a.Q(c1144z.e());
            this.f18987a.T(1);
        } else {
            int i9 = (this.f18993g + 1) % 65535;
            if (i6 != i9) {
                AbstractC1133o.h("RtpH265Reader", AbstractC1117K.H("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(i9), Integer.valueOf(i6)));
                return;
            } else {
                this.f18987a.Q(c1144z.e());
                this.f18987a.T(3);
            }
        }
        int a6 = this.f18987a.a();
        this.f18990d.a(this.f18987a, a6);
        this.f18994h += a6;
        if (z7) {
            this.f18991e = e(i8);
        }
    }

    private void g(C1144z c1144z) {
        int a6 = c1144z.a();
        this.f18994h += h();
        this.f18990d.a(c1144z, a6);
        this.f18994h += a6;
        this.f18991e = e((c1144z.e()[0] >> 1) & 63);
    }

    private int h() {
        this.f18988b.T(0);
        int a6 = this.f18988b.a();
        ((O) AbstractC1119a.e(this.f18990d)).a(this.f18988b, a6);
        return a6;
    }

    @Override // t1.k
    public void a(long j6, long j7) {
        this.f18992f = j6;
        this.f18994h = 0;
        this.f18995i = j7;
    }

    @Override // t1.k
    public void b(long j6, int i6) {
    }

    @Override // t1.k
    public void c(C1144z c1144z, long j6, int i6, boolean z6) {
        if (c1144z.e().length == 0) {
            throw z.c("Empty RTP data packet.", null);
        }
        int i7 = (c1144z.e()[0] >> 1) & 63;
        AbstractC1119a.i(this.f18990d);
        if (i7 >= 0 && i7 < 48) {
            g(c1144z);
        } else {
            if (i7 == 48) {
                throw new UnsupportedOperationException("need to implement processAggregationPacket");
            }
            if (i7 != 49) {
                throw z.c(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i7)), null);
            }
            f(c1144z, i6);
        }
        if (z6) {
            if (this.f18992f == -9223372036854775807L) {
                this.f18992f = j6;
            }
            this.f18990d.f(m.a(this.f18995i, j6, this.f18992f, 90000), this.f18991e, this.f18994h, 0, null);
            this.f18994h = 0;
        }
        this.f18993g = i6;
    }

    @Override // t1.k
    public void d(r rVar, int i6) {
        O a6 = rVar.a(i6, 2);
        this.f18990d = a6;
        a6.e(this.f18989c.f18807c);
    }
}
