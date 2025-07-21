package t1;

import E1.H;
import E1.O;
import E1.r;
import Z0.q;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1144z;
import java.util.List;
import s1.C2044d;
import s1.C2047g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final C2047g f19011a;

    /* renamed from: b, reason: collision with root package name */
    public O f19012b;

    /* renamed from: d, reason: collision with root package name */
    public long f19014d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19016f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19017g;

    /* renamed from: c, reason: collision with root package name */
    public long f19013c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f19015e = -1;

    public j(C2047g c2047g) {
        this.f19011a = c2047g;
    }

    public static void e(C1144z c1144z) {
        int f6 = c1144z.f();
        AbstractC1119a.b(c1144z.g() > 18, "ID Header has insufficient data");
        AbstractC1119a.b(c1144z.D(8).equals("OpusHead"), "ID Header missing");
        AbstractC1119a.b(c1144z.G() == 1, "version number must always be 1");
        c1144z.T(f6);
    }

    @Override // t1.k
    public void a(long j6, long j7) {
        this.f19013c = j6;
        this.f19014d = j7;
    }

    @Override // t1.k
    public void b(long j6, int i6) {
        this.f19013c = j6;
    }

    @Override // t1.k
    public void c(C1144z c1144z, long j6, int i6, boolean z6) {
        AbstractC1119a.i(this.f19012b);
        if (!this.f19016f) {
            e(c1144z);
            List a6 = H.a(c1144z.e());
            q.b a7 = this.f19011a.f18807c.a();
            a7.b0(a6);
            this.f19012b.e(a7.K());
            this.f19016f = true;
        } else if (this.f19017g) {
            int b6 = C2044d.b(this.f19015e);
            if (i6 != b6) {
                AbstractC1133o.h("RtpOpusReader", AbstractC1117K.H("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(b6), Integer.valueOf(i6)));
            }
            int a8 = c1144z.a();
            this.f19012b.a(c1144z, a8);
            this.f19012b.f(m.a(this.f19014d, j6, this.f19013c, 48000), 1, a8, 0, null);
        } else {
            AbstractC1119a.b(c1144z.g() >= 8, "Comment Header has insufficient data");
            AbstractC1119a.b(c1144z.D(8).equals("OpusTags"), "Comment Header should follow ID Header");
            this.f19017g = true;
        }
        this.f19015e = i6;
    }

    @Override // t1.k
    public void d(r rVar, int i6) {
        O a6 = rVar.a(i6, 1);
        this.f19012b = a6;
        a6.e(this.f19011a.f18807c);
    }
}
