package t1;

import E1.O;
import E1.r;
import android.util.Log;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1144z;
import s1.C2044d;
import s1.C2047g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final C2047g f19018a;

    /* renamed from: b, reason: collision with root package name */
    public O f19019b;

    /* renamed from: c, reason: collision with root package name */
    public long f19020c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public long f19021d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f19022e = -1;

    public l(C2047g c2047g) {
        this.f19018a = c2047g;
    }

    @Override // t1.k
    public void a(long j6, long j7) {
        this.f19020c = j6;
        this.f19021d = j7;
    }

    @Override // t1.k
    public void b(long j6, int i6) {
        this.f19020c = j6;
    }

    @Override // t1.k
    public void c(C1144z c1144z, long j6, int i6, boolean z6) {
        int b6;
        AbstractC1119a.e(this.f19019b);
        int i7 = this.f19022e;
        if (i7 != -1 && i6 != (b6 = C2044d.b(i7))) {
            Log.w("RtpPcmReader", AbstractC1117K.H("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(b6), Integer.valueOf(i6)));
        }
        long a6 = m.a(this.f19021d, j6, this.f19020c, this.f19018a.f18806b);
        int a7 = c1144z.a();
        this.f19019b.a(c1144z, a7);
        this.f19019b.f(a6, 1, a7, 0, null);
        this.f19022e = i6;
    }

    @Override // t1.k
    public void d(r rVar, int i6) {
        O a6 = rVar.a(i6, 1);
        this.f19019b = a6;
        a6.e(this.f19018a.f18807c);
    }
}
