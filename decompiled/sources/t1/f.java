package t1;

import E1.O;
import E1.r;
import Z0.z;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1144z;
import kotlin.jvm.internal.ByteCompanionObject;
import s1.C2044d;
import s1.C2047g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f implements k {

    /* renamed from: c, reason: collision with root package name */
    public final C2047g f18980c;

    /* renamed from: d, reason: collision with root package name */
    public O f18981d;

    /* renamed from: e, reason: collision with root package name */
    public int f18982e;

    /* renamed from: h, reason: collision with root package name */
    public int f18985h;

    /* renamed from: i, reason: collision with root package name */
    public long f18986i;

    /* renamed from: b, reason: collision with root package name */
    public final C1144z f18979b = new C1144z(d1.d.f13379a);

    /* renamed from: a, reason: collision with root package name */
    public final C1144z f18978a = new C1144z();

    /* renamed from: f, reason: collision with root package name */
    public long f18983f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public int f18984g = -1;

    public f(C2047g c2047g) {
        this.f18980c = c2047g;
    }

    public static int e(int i6) {
        return i6 == 5 ? 1 : 0;
    }

    @Override // t1.k
    public void a(long j6, long j7) {
        this.f18983f = j6;
        this.f18985h = 0;
        this.f18986i = j7;
    }

    @Override // t1.k
    public void b(long j6, int i6) {
    }

    @Override // t1.k
    public void c(C1144z c1144z, long j6, int i6, boolean z6) {
        try {
            int i7 = c1144z.e()[0] & 31;
            AbstractC1119a.i(this.f18981d);
            if (i7 > 0 && i7 < 24) {
                g(c1144z);
            } else if (i7 == 24) {
                h(c1144z);
            } else {
                if (i7 != 28) {
                    throw z.c(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i7)), null);
                }
                f(c1144z, i6);
            }
            if (z6) {
                if (this.f18983f == -9223372036854775807L) {
                    this.f18983f = j6;
                }
                this.f18981d.f(m.a(this.f18986i, j6, this.f18983f, 90000), this.f18982e, this.f18985h, 0, null);
                this.f18985h = 0;
            }
            this.f18984g = i6;
        } catch (IndexOutOfBoundsException e6) {
            throw z.c(null, e6);
        }
    }

    @Override // t1.k
    public void d(r rVar, int i6) {
        O a6 = rVar.a(i6, 2);
        this.f18981d = a6;
        ((O) AbstractC1117K.i(a6)).e(this.f18980c.f18807c);
    }

    public final void f(C1144z c1144z, int i6) {
        byte b6 = c1144z.e()[0];
        byte b7 = c1144z.e()[1];
        int i7 = (b6 & 224) | (b7 & 31);
        boolean z6 = (b7 & ByteCompanionObject.MIN_VALUE) > 0;
        boolean z7 = (b7 & 64) > 0;
        if (z6) {
            this.f18985h += i();
            c1144z.e()[1] = (byte) i7;
            this.f18978a.Q(c1144z.e());
            this.f18978a.T(1);
        } else {
            int b8 = C2044d.b(this.f18984g);
            if (i6 != b8) {
                AbstractC1133o.h("RtpH264Reader", AbstractC1117K.H("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(b8), Integer.valueOf(i6)));
                return;
            } else {
                this.f18978a.Q(c1144z.e());
                this.f18978a.T(2);
            }
        }
        int a6 = this.f18978a.a();
        this.f18981d.a(this.f18978a, a6);
        this.f18985h += a6;
        if (z7) {
            this.f18982e = e(i7 & 31);
        }
    }

    public final void g(C1144z c1144z) {
        int a6 = c1144z.a();
        this.f18985h += i();
        this.f18981d.a(c1144z, a6);
        this.f18985h += a6;
        this.f18982e = e(c1144z.e()[0] & 31);
    }

    public final void h(C1144z c1144z) {
        c1144z.G();
        while (c1144z.a() > 4) {
            int M5 = c1144z.M();
            this.f18985h += i();
            this.f18981d.a(c1144z, M5);
            this.f18985h += M5;
        }
        this.f18982e = 0;
    }

    public final int i() {
        this.f18979b.T(0);
        int a6 = this.f18979b.a();
        ((O) AbstractC1119a.e(this.f18981d)).a(this.f18979b, a6);
        return a6;
    }
}
