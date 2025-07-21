package w1;

import A1.b;
import E1.O;
import Z0.InterfaceC0837i;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1144z;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;
import w1.a0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class Y {

    /* renamed from: a, reason: collision with root package name */
    public final A1.b f19903a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19904b;

    /* renamed from: c, reason: collision with root package name */
    public final C1144z f19905c;

    /* renamed from: d, reason: collision with root package name */
    public a f19906d;

    /* renamed from: e, reason: collision with root package name */
    public a f19907e;

    /* renamed from: f, reason: collision with root package name */
    public a f19908f;

    /* renamed from: g, reason: collision with root package name */
    public long f19909g;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public long f19910a;

        /* renamed from: b, reason: collision with root package name */
        public long f19911b;

        /* renamed from: c, reason: collision with root package name */
        public A1.a f19912c;

        /* renamed from: d, reason: collision with root package name */
        public a f19913d;

        public a(long j6, int i6) {
            d(j6, i6);
        }

        @Override // A1.b.a
        public A1.a a() {
            return (A1.a) AbstractC1119a.e(this.f19912c);
        }

        public a b() {
            this.f19912c = null;
            a aVar = this.f19913d;
            this.f19913d = null;
            return aVar;
        }

        public void c(A1.a aVar, a aVar2) {
            this.f19912c = aVar;
            this.f19913d = aVar2;
        }

        public void d(long j6, int i6) {
            AbstractC1119a.g(this.f19912c == null);
            this.f19910a = j6;
            this.f19911b = j6 + i6;
        }

        public int e(long j6) {
            return ((int) (j6 - this.f19910a)) + this.f19912c.f81b;
        }

        @Override // A1.b.a
        public b.a next() {
            a aVar = this.f19913d;
            if (aVar == null || aVar.f19912c == null) {
                return null;
            }
            return aVar;
        }
    }

    public Y(A1.b bVar) {
        this.f19903a = bVar;
        int e6 = bVar.e();
        this.f19904b = e6;
        this.f19905c = new C1144z(32);
        a aVar = new a(0L, e6);
        this.f19906d = aVar;
        this.f19907e = aVar;
        this.f19908f = aVar;
    }

    public static a d(a aVar, long j6) {
        while (j6 >= aVar.f19911b) {
            aVar = aVar.f19913d;
        }
        return aVar;
    }

    public static a i(a aVar, long j6, ByteBuffer byteBuffer, int i6) {
        a d6 = d(aVar, j6);
        while (i6 > 0) {
            int min = Math.min(i6, (int) (d6.f19911b - j6));
            byteBuffer.put(d6.f19912c.f80a, d6.e(j6), min);
            i6 -= min;
            j6 += min;
            if (j6 == d6.f19911b) {
                d6 = d6.f19913d;
            }
        }
        return d6;
    }

    public static a j(a aVar, long j6, byte[] bArr, int i6) {
        a d6 = d(aVar, j6);
        int i7 = i6;
        while (i7 > 0) {
            int min = Math.min(i7, (int) (d6.f19911b - j6));
            System.arraycopy(d6.f19912c.f80a, d6.e(j6), bArr, i6 - i7, min);
            i7 -= min;
            j6 += min;
            if (j6 == d6.f19911b) {
                d6 = d6.f19913d;
            }
        }
        return d6;
    }

    public static a k(a aVar, f1.f fVar, a0.b bVar, C1144z c1144z) {
        long j6 = bVar.f19955b;
        int i6 = 1;
        c1144z.P(1);
        a j7 = j(aVar, j6, c1144z.e(), 1);
        long j8 = j6 + 1;
        byte b6 = c1144z.e()[0];
        boolean z6 = (b6 & ByteCompanionObject.MIN_VALUE) != 0;
        int i7 = b6 & ByteCompanionObject.MAX_VALUE;
        f1.c cVar = fVar.f14004c;
        byte[] bArr = cVar.f13991a;
        if (bArr == null) {
            cVar.f13991a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a j9 = j(j7, j8, cVar.f13991a, i7);
        long j10 = j8 + i7;
        if (z6) {
            c1144z.P(2);
            j9 = j(j9, j10, c1144z.e(), 2);
            j10 += 2;
            i6 = c1144z.M();
        }
        int i8 = i6;
        int[] iArr = cVar.f13994d;
        if (iArr == null || iArr.length < i8) {
            iArr = new int[i8];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f13995e;
        if (iArr3 == null || iArr3.length < i8) {
            iArr3 = new int[i8];
        }
        int[] iArr4 = iArr3;
        if (z6) {
            int i9 = i8 * 6;
            c1144z.P(i9);
            j9 = j(j9, j10, c1144z.e(), i9);
            j10 += i9;
            c1144z.T(0);
            for (int i10 = 0; i10 < i8; i10++) {
                iArr2[i10] = c1144z.M();
                iArr4[i10] = c1144z.K();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f19954a - ((int) (j10 - bVar.f19955b));
        }
        O.a aVar2 = (O.a) AbstractC1117K.i(bVar.f19956c);
        cVar.c(i8, iArr2, iArr4, aVar2.f928b, cVar.f13991a, aVar2.f927a, aVar2.f929c, aVar2.f930d);
        long j11 = bVar.f19955b;
        int i11 = (int) (j10 - j11);
        bVar.f19955b = j11 + i11;
        bVar.f19954a -= i11;
        return j9;
    }

    public static a l(a aVar, f1.f fVar, a0.b bVar, C1144z c1144z) {
        if (fVar.q()) {
            aVar = k(aVar, fVar, bVar, c1144z);
        }
        if (!fVar.h()) {
            fVar.o(bVar.f19954a);
            return i(aVar, bVar.f19955b, fVar.f14005d, bVar.f19954a);
        }
        c1144z.P(4);
        a j6 = j(aVar, bVar.f19955b, c1144z.e(), 4);
        int K5 = c1144z.K();
        bVar.f19955b += 4;
        bVar.f19954a -= 4;
        fVar.o(K5);
        a i6 = i(j6, bVar.f19955b, fVar.f14005d, K5);
        bVar.f19955b += K5;
        int i7 = bVar.f19954a - K5;
        bVar.f19954a = i7;
        fVar.s(i7);
        return i(i6, bVar.f19955b, fVar.f14008g, bVar.f19954a);
    }

    public final void a(a aVar) {
        if (aVar.f19912c == null) {
            return;
        }
        this.f19903a.a(aVar);
        aVar.b();
    }

    public void b(long j6) {
        a aVar;
        if (j6 == -1) {
            return;
        }
        while (true) {
            aVar = this.f19906d;
            if (j6 < aVar.f19911b) {
                break;
            }
            this.f19903a.d(aVar.f19912c);
            this.f19906d = this.f19906d.b();
        }
        if (this.f19907e.f19910a < aVar.f19910a) {
            this.f19907e = aVar;
        }
    }

    public void c(long j6) {
        AbstractC1119a.a(j6 <= this.f19909g);
        this.f19909g = j6;
        if (j6 != 0) {
            a aVar = this.f19906d;
            if (j6 != aVar.f19910a) {
                while (this.f19909g > aVar.f19911b) {
                    aVar = aVar.f19913d;
                }
                a aVar2 = (a) AbstractC1119a.e(aVar.f19913d);
                a(aVar2);
                a aVar3 = new a(aVar.f19911b, this.f19904b);
                aVar.f19913d = aVar3;
                if (this.f19909g == aVar.f19911b) {
                    aVar = aVar3;
                }
                this.f19908f = aVar;
                if (this.f19907e == aVar2) {
                    this.f19907e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f19906d);
        a aVar4 = new a(this.f19909g, this.f19904b);
        this.f19906d = aVar4;
        this.f19907e = aVar4;
        this.f19908f = aVar4;
    }

    public long e() {
        return this.f19909g;
    }

    public void f(f1.f fVar, a0.b bVar) {
        l(this.f19907e, fVar, bVar, this.f19905c);
    }

    public final void g(int i6) {
        long j6 = this.f19909g + i6;
        this.f19909g = j6;
        a aVar = this.f19908f;
        if (j6 == aVar.f19911b) {
            this.f19908f = aVar.f19913d;
        }
    }

    public final int h(int i6) {
        a aVar = this.f19908f;
        if (aVar.f19912c == null) {
            aVar.c(this.f19903a.b(), new a(this.f19908f.f19911b, this.f19904b));
        }
        return Math.min(i6, (int) (this.f19908f.f19911b - this.f19909g));
    }

    public void m(f1.f fVar, a0.b bVar) {
        this.f19907e = l(this.f19907e, fVar, bVar, this.f19905c);
    }

    public void n() {
        a(this.f19906d);
        this.f19906d.d(0L, this.f19904b);
        a aVar = this.f19906d;
        this.f19907e = aVar;
        this.f19908f = aVar;
        this.f19909g = 0L;
        this.f19903a.c();
    }

    public void o() {
        this.f19907e = this.f19906d;
    }

    public int p(InterfaceC0837i interfaceC0837i, int i6, boolean z6) {
        int h6 = h(i6);
        a aVar = this.f19908f;
        int read = interfaceC0837i.read(aVar.f19912c.f80a, aVar.e(this.f19909g), h6);
        if (read != -1) {
            g(read);
            return read;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }

    public void q(C1144z c1144z, int i6) {
        while (i6 > 0) {
            int h6 = h(i6);
            a aVar = this.f19908f;
            c1144z.l(aVar.f19912c.f80a, aVar.e(this.f19909g), h6);
            i6 -= h6;
            g(h6);
        }
    }
}
