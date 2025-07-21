package t1;

import E1.O;
import E1.r;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1144z;
import s1.C2044d;
import s1.C2047g;

/* renamed from: t1.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2074d implements k {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f18957h = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f18958i = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: a, reason: collision with root package name */
    public final C2047g f18959a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18960b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18961c;

    /* renamed from: d, reason: collision with root package name */
    public O f18962d;

    /* renamed from: e, reason: collision with root package name */
    public long f18963e = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public int f18965g = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f18964f = 0;

    public C2074d(C2047g c2047g) {
        this.f18959a = c2047g;
        this.f18960b = "audio/amr-wb".equals(AbstractC1119a.e(c2047g.f18807c.f6990n));
        this.f18961c = c2047g.f18806b;
    }

    public static int e(int i6, boolean z6) {
        boolean z7 = (i6 >= 0 && i6 <= 8) || i6 == 15;
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(z6 ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i6);
        AbstractC1119a.b(z7, sb.toString());
        return z6 ? f18958i[i6] : f18957h[i6];
    }

    @Override // t1.k
    public void a(long j6, long j7) {
        this.f18963e = j6;
        this.f18964f = j7;
    }

    @Override // t1.k
    public void b(long j6, int i6) {
        this.f18963e = j6;
    }

    @Override // t1.k
    public void c(C1144z c1144z, long j6, int i6, boolean z6) {
        int b6;
        AbstractC1119a.i(this.f18962d);
        int i7 = this.f18965g;
        if (i7 != -1 && i6 != (b6 = C2044d.b(i7))) {
            AbstractC1133o.h("RtpAmrReader", AbstractC1117K.H("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(b6), Integer.valueOf(i6)));
        }
        c1144z.U(1);
        int e6 = e((c1144z.j() >> 3) & 15, this.f18960b);
        int a6 = c1144z.a();
        AbstractC1119a.b(a6 == e6, "compound payload not supported currently");
        this.f18962d.a(c1144z, a6);
        this.f18962d.f(m.a(this.f18964f, j6, this.f18963e, this.f18961c), 1, a6, 0, null);
        this.f18965g = i6;
    }

    @Override // t1.k
    public void d(r rVar, int i6) {
        O a6 = rVar.a(i6, 1);
        this.f18962d = a6;
        a6.e(this.f18959a.f18807c);
    }
}
