package G1;

import c1.AbstractC1117K;
import c1.AbstractC1133o;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1742a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1743b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1744c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1745d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1746e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1747f;

    public d(int i6, int i7, int i8, int i9, int i10, int i11) {
        this.f1742a = i6;
        this.f1743b = i7;
        this.f1744c = i8;
        this.f1745d = i9;
        this.f1746e = i10;
        this.f1747f = i11;
    }

    public static d c(C1144z c1144z) {
        int t6 = c1144z.t();
        c1144z.U(12);
        int t7 = c1144z.t();
        int t8 = c1144z.t();
        int t9 = c1144z.t();
        c1144z.U(4);
        int t10 = c1144z.t();
        int t11 = c1144z.t();
        c1144z.U(8);
        return new d(t6, t7, t8, t9, t10, t11);
    }

    public long a() {
        return AbstractC1117K.W0(this.f1746e, this.f1744c * 1000000, this.f1745d);
    }

    public int b() {
        int i6 = this.f1742a;
        if (i6 == 1935960438) {
            return 2;
        }
        if (i6 == 1935963489) {
            return 1;
        }
        if (i6 == 1937012852) {
            return 3;
        }
        AbstractC1133o.h("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f1742a));
        return -1;
    }

    @Override // G1.a
    public int getType() {
        return 1752331379;
    }
}
