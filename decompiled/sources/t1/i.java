package t1;

import E1.O;
import E1.r;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1144z;
import s1.C2044d;
import s1.C2047g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public final C2047g f19004a;

    /* renamed from: b, reason: collision with root package name */
    public O f19005b;

    /* renamed from: c, reason: collision with root package name */
    public int f19006c;

    /* renamed from: d, reason: collision with root package name */
    public long f19007d = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public int f19008e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f19009f;

    /* renamed from: g, reason: collision with root package name */
    public int f19010g;

    public i(C2047g c2047g) {
        this.f19004a = c2047g;
    }

    public static int e(C1144z c1144z) {
        int a6 = C6.b.a(c1144z.e(), new byte[]{0, 0, 1, -74});
        if (a6 != -1) {
            c1144z.T(a6 + 4);
            if ((c1144z.j() >> 6) == 0) {
                return 1;
            }
        }
        return 0;
    }

    @Override // t1.k
    public void a(long j6, long j7) {
        this.f19007d = j6;
        this.f19009f = j7;
        this.f19010g = 0;
    }

    @Override // t1.k
    public void b(long j6, int i6) {
    }

    @Override // t1.k
    public void c(C1144z c1144z, long j6, int i6, boolean z6) {
        int b6;
        AbstractC1119a.i(this.f19005b);
        int i7 = this.f19008e;
        if (i7 != -1 && i6 != (b6 = C2044d.b(i7))) {
            AbstractC1133o.h("RtpMpeg4Reader", AbstractC1117K.H("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(b6), Integer.valueOf(i6)));
        }
        int a6 = c1144z.a();
        this.f19005b.a(c1144z, a6);
        if (this.f19010g == 0) {
            this.f19006c = e(c1144z);
        }
        this.f19010g += a6;
        if (z6) {
            if (this.f19007d == -9223372036854775807L) {
                this.f19007d = j6;
            }
            this.f19005b.f(m.a(this.f19009f, j6, this.f19007d, 90000), this.f19006c, this.f19010g, 0, null);
            this.f19010g = 0;
        }
        this.f19008e = i6;
    }

    @Override // t1.k
    public void d(r rVar, int i6) {
        O a6 = rVar.a(i6, 2);
        this.f19005b = a6;
        ((O) AbstractC1117K.i(a6)).e(this.f19004a.f18807c);
    }
}
