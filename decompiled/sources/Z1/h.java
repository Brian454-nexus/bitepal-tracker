package Z1;

import E1.H;
import E1.S;
import Z0.q;
import Z0.x;
import Z1.i;
import c1.AbstractC1119a;
import c1.C1144z;
import java.util.Arrays;
import java.util.List;
import z6.w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h extends i {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f7331o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f7332p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f7333n;

    public static boolean n(C1144z c1144z, byte[] bArr) {
        if (c1144z.a() < bArr.length) {
            return false;
        }
        int f6 = c1144z.f();
        byte[] bArr2 = new byte[bArr.length];
        c1144z.l(bArr2, 0, bArr.length);
        c1144z.T(f6);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(C1144z c1144z) {
        return n(c1144z, f7331o);
    }

    @Override // Z1.i
    public long f(C1144z c1144z) {
        return c(H.e(c1144z.e()));
    }

    @Override // Z1.i
    public boolean i(C1144z c1144z, long j6, i.b bVar) {
        if (n(c1144z, f7331o)) {
            byte[] copyOf = Arrays.copyOf(c1144z.e(), c1144z.g());
            int c6 = H.c(copyOf);
            List a6 = H.a(copyOf);
            if (bVar.f7347a != null) {
                return true;
            }
            bVar.f7347a = new q.b().o0("audio/opus").N(c6).p0(48000).b0(a6).K();
            return true;
        }
        byte[] bArr = f7332p;
        if (!n(c1144z, bArr)) {
            AbstractC1119a.i(bVar.f7347a);
            return false;
        }
        AbstractC1119a.i(bVar.f7347a);
        if (this.f7333n) {
            return true;
        }
        this.f7333n = true;
        c1144z.U(bArr.length);
        x d6 = S.d(w.t(S.k(c1144z, false, false).f943b));
        if (d6 == null) {
            return true;
        }
        bVar.f7347a = bVar.f7347a.a().h0(d6.c(bVar.f7347a.f6987k)).K();
        return true;
    }

    @Override // Z1.i
    public void l(boolean z6) {
        super.l(z6);
        if (z6) {
            this.f7333n = false;
        }
    }
}
