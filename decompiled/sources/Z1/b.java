package Z1;

import E1.InterfaceC0315q;
import E1.J;
import E1.v;
import E1.w;
import E1.x;
import E1.y;
import Z1.i;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1144z;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b extends i {

    /* renamed from: n, reason: collision with root package name */
    public y f7305n;

    /* renamed from: o, reason: collision with root package name */
    public a f7306o;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        public y f7307a;

        /* renamed from: b, reason: collision with root package name */
        public y.a f7308b;

        /* renamed from: c, reason: collision with root package name */
        public long f7309c = -1;

        /* renamed from: d, reason: collision with root package name */
        public long f7310d = -1;

        public a(y yVar, y.a aVar) {
            this.f7307a = yVar;
            this.f7308b = aVar;
        }

        @Override // Z1.g
        public J a() {
            AbstractC1119a.g(this.f7309c != -1);
            return new x(this.f7307a, this.f7309c);
        }

        @Override // Z1.g
        public long b(InterfaceC0315q interfaceC0315q) {
            long j6 = this.f7310d;
            if (j6 < 0) {
                return -1L;
            }
            long j7 = -(j6 + 2);
            this.f7310d = -1L;
            return j7;
        }

        @Override // Z1.g
        public void c(long j6) {
            long[] jArr = this.f7308b.f1097a;
            this.f7310d = jArr[AbstractC1117K.h(jArr, j6, true, true)];
        }

        public void d(long j6) {
            this.f7309c = j6;
        }
    }

    public static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(C1144z c1144z) {
        return c1144z.a() >= 5 && c1144z.G() == 127 && c1144z.I() == 1179402563;
    }

    @Override // Z1.i
    public long f(C1144z c1144z) {
        if (o(c1144z.e())) {
            return n(c1144z);
        }
        return -1L;
    }

    @Override // Z1.i
    public boolean i(C1144z c1144z, long j6, i.b bVar) {
        byte[] e6 = c1144z.e();
        y yVar = this.f7305n;
        if (yVar == null) {
            y yVar2 = new y(e6, 17);
            this.f7305n = yVar2;
            bVar.f7347a = yVar2.g(Arrays.copyOfRange(e6, 9, c1144z.g()), null);
            return true;
        }
        if ((e6[0] & ByteCompanionObject.MAX_VALUE) == 3) {
            y.a g6 = w.g(c1144z);
            y b6 = yVar.b(g6);
            this.f7305n = b6;
            this.f7306o = new a(b6, g6);
            return true;
        }
        if (!o(e6)) {
            return true;
        }
        a aVar = this.f7306o;
        if (aVar != null) {
            aVar.d(j6);
            bVar.f7348b = this.f7306o;
        }
        AbstractC1119a.e(bVar.f7347a);
        return false;
    }

    @Override // Z1.i
    public void l(boolean z6) {
        super.l(z6);
        if (z6) {
            this.f7305n = null;
            this.f7306o = null;
        }
    }

    public final int n(C1144z c1144z) {
        int i6 = (c1144z.e()[2] & 255) >> 4;
        if (i6 == 6 || i6 == 7) {
            c1144z.U(4);
            c1144z.N();
        }
        int j6 = v.j(c1144z, i6);
        c1144z.T(0);
        return j6;
    }
}
