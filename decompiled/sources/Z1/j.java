package Z1;

import E1.S;
import Z0.q;
import Z0.z;
import Z1.i;
import c1.AbstractC1119a;
import c1.C1144z;
import java.util.ArrayList;
import java.util.Arrays;
import z6.w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j extends i {

    /* renamed from: n, reason: collision with root package name */
    public a f7349n;

    /* renamed from: o, reason: collision with root package name */
    public int f7350o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7351p;

    /* renamed from: q, reason: collision with root package name */
    public S.c f7352q;

    /* renamed from: r, reason: collision with root package name */
    public S.a f7353r;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final S.c f7354a;

        /* renamed from: b, reason: collision with root package name */
        public final S.a f7355b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f7356c;

        /* renamed from: d, reason: collision with root package name */
        public final S.b[] f7357d;

        /* renamed from: e, reason: collision with root package name */
        public final int f7358e;

        public a(S.c cVar, S.a aVar, byte[] bArr, S.b[] bVarArr, int i6) {
            this.f7354a = cVar;
            this.f7355b = aVar;
            this.f7356c = bArr;
            this.f7357d = bVarArr;
            this.f7358e = i6;
        }
    }

    public static void n(C1144z c1144z, long j6) {
        if (c1144z.b() < c1144z.g() + 4) {
            c1144z.Q(Arrays.copyOf(c1144z.e(), c1144z.g() + 4));
        } else {
            c1144z.S(c1144z.g() + 4);
        }
        byte[] e6 = c1144z.e();
        e6[c1144z.g() - 4] = (byte) (j6 & 255);
        e6[c1144z.g() - 3] = (byte) ((j6 >>> 8) & 255);
        e6[c1144z.g() - 2] = (byte) ((j6 >>> 16) & 255);
        e6[c1144z.g() - 1] = (byte) ((j6 >>> 24) & 255);
    }

    public static int o(byte b6, a aVar) {
        return !aVar.f7357d[p(b6, aVar.f7358e, 1)].f945a ? aVar.f7354a.f955g : aVar.f7354a.f956h;
    }

    public static int p(byte b6, int i6, int i7) {
        return (b6 >> i7) & (255 >>> (8 - i6));
    }

    public static boolean r(C1144z c1144z) {
        try {
            return S.o(1, c1144z, true);
        } catch (z unused) {
            return false;
        }
    }

    @Override // Z1.i
    public void e(long j6) {
        super.e(j6);
        this.f7351p = j6 != 0;
        S.c cVar = this.f7352q;
        this.f7350o = cVar != null ? cVar.f955g : 0;
    }

    @Override // Z1.i
    public long f(C1144z c1144z) {
        if ((c1144z.e()[0] & 1) == 1) {
            return -1L;
        }
        int o6 = o(c1144z.e()[0], (a) AbstractC1119a.i(this.f7349n));
        long j6 = this.f7351p ? (this.f7350o + o6) / 4 : 0;
        n(c1144z, j6);
        this.f7351p = true;
        this.f7350o = o6;
        return j6;
    }

    @Override // Z1.i
    public boolean i(C1144z c1144z, long j6, i.b bVar) {
        if (this.f7349n != null) {
            AbstractC1119a.e(bVar.f7347a);
            return false;
        }
        a q6 = q(c1144z);
        this.f7349n = q6;
        if (q6 == null) {
            return true;
        }
        S.c cVar = q6.f7354a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.f958j);
        arrayList.add(q6.f7356c);
        bVar.f7347a = new q.b().o0("audio/vorbis").M(cVar.f953e).j0(cVar.f952d).N(cVar.f950b).p0(cVar.f951c).b0(arrayList).h0(S.d(w.t(q6.f7355b.f943b))).K();
        return true;
    }

    @Override // Z1.i
    public void l(boolean z6) {
        super.l(z6);
        if (z6) {
            this.f7349n = null;
            this.f7352q = null;
            this.f7353r = null;
        }
        this.f7350o = 0;
        this.f7351p = false;
    }

    public a q(C1144z c1144z) {
        S.c cVar = this.f7352q;
        if (cVar == null) {
            this.f7352q = S.l(c1144z);
            return null;
        }
        S.a aVar = this.f7353r;
        if (aVar == null) {
            this.f7353r = S.j(c1144z);
            return null;
        }
        byte[] bArr = new byte[c1144z.g()];
        System.arraycopy(c1144z.e(), 0, bArr, 0, c1144z.g());
        return new a(cVar, aVar, bArr, S.m(c1144z, cVar.f950b), S.b(r4.length - 1));
    }
}
