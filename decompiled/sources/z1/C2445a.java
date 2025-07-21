package z1;

import Z0.G;
import Z0.H;
import c1.AbstractC1117K;
import c1.AbstractC1133o;
import c1.InterfaceC1121c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import w1.InterfaceC2212D;
import z1.x;
import z6.F;
import z6.K;
import z6.w;

/* renamed from: z1.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2445a extends AbstractC2447c {

    /* renamed from: h, reason: collision with root package name */
    public final A1.d f21484h;

    /* renamed from: i, reason: collision with root package name */
    public final long f21485i;

    /* renamed from: j, reason: collision with root package name */
    public final long f21486j;

    /* renamed from: k, reason: collision with root package name */
    public final long f21487k;

    /* renamed from: l, reason: collision with root package name */
    public final int f21488l;

    /* renamed from: m, reason: collision with root package name */
    public final int f21489m;

    /* renamed from: n, reason: collision with root package name */
    public final float f21490n;

    /* renamed from: o, reason: collision with root package name */
    public final float f21491o;

    /* renamed from: p, reason: collision with root package name */
    public final z6.w f21492p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC1121c f21493q;

    /* renamed from: r, reason: collision with root package name */
    public float f21494r;

    /* renamed from: s, reason: collision with root package name */
    public int f21495s;

    /* renamed from: t, reason: collision with root package name */
    public int f21496t;

    /* renamed from: u, reason: collision with root package name */
    public long f21497u;

    /* renamed from: v, reason: collision with root package name */
    public x1.m f21498v;

    /* renamed from: w, reason: collision with root package name */
    public long f21499w;

    /* renamed from: z1.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0279a {

        /* renamed from: a, reason: collision with root package name */
        public final long f21500a;

        /* renamed from: b, reason: collision with root package name */
        public final long f21501b;

        public C0279a(long j6, long j7) {
            this.f21500a = j6;
            this.f21501b = j7;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0279a)) {
                return false;
            }
            C0279a c0279a = (C0279a) obj;
            return this.f21500a == c0279a.f21500a && this.f21501b == c0279a.f21501b;
        }

        public int hashCode() {
            return (((int) this.f21500a) * 31) + ((int) this.f21501b);
        }
    }

    /* renamed from: z1.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements x.b {

        /* renamed from: a, reason: collision with root package name */
        public final int f21502a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21503b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21504c;

        /* renamed from: d, reason: collision with root package name */
        public final int f21505d;

        /* renamed from: e, reason: collision with root package name */
        public final int f21506e;

        /* renamed from: f, reason: collision with root package name */
        public final float f21507f;

        /* renamed from: g, reason: collision with root package name */
        public final float f21508g;

        /* renamed from: h, reason: collision with root package name */
        public final InterfaceC1121c f21509h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        @Override // z1.x.b
        public final x[] a(x.a[] aVarArr, A1.d dVar, InterfaceC2212D.b bVar, G g6) {
            A1.d dVar2;
            x b6;
            z6.w A6 = C2445a.A(aVarArr);
            x[] xVarArr = new x[aVarArr.length];
            int i6 = 0;
            while (i6 < aVarArr.length) {
                x.a aVar = aVarArr[i6];
                if (aVar != null) {
                    int[] iArr = aVar.f21648b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            b6 = new y(aVar.f21647a, iArr[0], aVar.f21649c);
                            dVar2 = dVar;
                        } else {
                            dVar2 = dVar;
                            b6 = b(aVar.f21647a, iArr, aVar.f21649c, dVar2, (z6.w) A6.get(i6));
                        }
                        xVarArr[i6] = b6;
                        i6++;
                        dVar = dVar2;
                    }
                }
                dVar2 = dVar;
                i6++;
                dVar = dVar2;
            }
            return xVarArr;
        }

        public C2445a b(H h6, int[] iArr, int i6, A1.d dVar, z6.w wVar) {
            return new C2445a(h6, iArr, i6, dVar, this.f21502a, this.f21503b, this.f21504c, this.f21505d, this.f21506e, this.f21507f, this.f21508g, wVar, this.f21509h);
        }

        public b(int i6, int i7, int i8, float f6) {
            this(i6, i7, i8, 1279, 719, f6, 0.75f, InterfaceC1121c.f10577a);
        }

        public b(int i6, int i7, int i8, int i9, int i10, float f6, float f7, InterfaceC1121c interfaceC1121c) {
            this.f21502a = i6;
            this.f21503b = i7;
            this.f21504c = i8;
            this.f21505d = i9;
            this.f21506e = i10;
            this.f21507f = f6;
            this.f21508g = f7;
            this.f21509h = interfaceC1121c;
        }
    }

    public C2445a(H h6, int[] iArr, int i6, A1.d dVar, long j6, long j7, long j8, int i7, int i8, float f6, float f7, List list, InterfaceC1121c interfaceC1121c) {
        super(h6, iArr, i6);
        long j9;
        if (j8 < j6) {
            AbstractC1133o.h("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j9 = j6;
        } else {
            j9 = j8;
        }
        this.f21484h = dVar;
        this.f21485i = j6 * 1000;
        this.f21486j = j7 * 1000;
        this.f21487k = j9 * 1000;
        this.f21488l = i7;
        this.f21489m = i8;
        this.f21490n = f6;
        this.f21491o = f7;
        this.f21492p = z6.w.s(list);
        this.f21493q = interfaceC1121c;
        this.f21494r = 1.0f;
        this.f21496t = 0;
        this.f21497u = -9223372036854775807L;
        this.f21499w = -2147483647L;
    }

    public static z6.w A(x.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (x.a aVar : aVarArr) {
            if (aVar == null || aVar.f21648b.length <= 1) {
                arrayList.add(null);
            } else {
                w.a o6 = z6.w.o();
                o6.h(new C0279a(0L, 0L));
                arrayList.add(o6);
            }
        }
        long[][] F6 = F(aVarArr);
        int[] iArr = new int[F6.length];
        long[] jArr = new long[F6.length];
        for (int i6 = 0; i6 < F6.length; i6++) {
            long[] jArr2 = F6[i6];
            jArr[i6] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        x(arrayList, jArr);
        z6.w G6 = G(F6);
        for (int i7 = 0; i7 < G6.size(); i7++) {
            int intValue = ((Integer) G6.get(i7)).intValue();
            int i8 = iArr[intValue] + 1;
            iArr[intValue] = i8;
            jArr[intValue] = F6[intValue][i8];
            x(arrayList, jArr);
        }
        for (int i9 = 0; i9 < aVarArr.length; i9++) {
            if (arrayList.get(i9) != null) {
                jArr[i9] = jArr[i9] * 2;
            }
        }
        x(arrayList, jArr);
        w.a o7 = z6.w.o();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            w.a aVar2 = (w.a) arrayList.get(i10);
            o7.h(aVar2 == null ? z6.w.w() : aVar2.k());
        }
        return o7.k();
    }

    public static long[][] F(x.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        for (int i6 = 0; i6 < aVarArr.length; i6++) {
            x.a aVar = aVarArr[i6];
            if (aVar == null) {
                jArr[i6] = new long[0];
            } else {
                jArr[i6] = new long[aVar.f21648b.length];
                int i7 = 0;
                while (true) {
                    int[] iArr = aVar.f21648b;
                    if (i7 >= iArr.length) {
                        break;
                    }
                    long j6 = aVar.f21647a.a(iArr[i7]).f6985i;
                    long[] jArr2 = jArr[i6];
                    if (j6 == -1) {
                        j6 = 0;
                    }
                    jArr2[i7] = j6;
                    i7++;
                }
                Arrays.sort(jArr[i6]);
            }
        }
        return jArr;
    }

    public static z6.w G(long[][] jArr) {
        F e6 = K.c().a().e();
        for (int i6 = 0; i6 < jArr.length; i6++) {
            long[] jArr2 = jArr[i6];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i7 = 0;
                while (true) {
                    long[] jArr3 = jArr[i6];
                    double d6 = 0.0d;
                    if (i7 >= jArr3.length) {
                        break;
                    }
                    long j6 = jArr3[i7];
                    if (j6 != -1) {
                        d6 = Math.log(j6);
                    }
                    dArr[i7] = d6;
                    i7++;
                }
                int i8 = length - 1;
                double d7 = dArr[i8] - dArr[0];
                int i9 = 0;
                while (i9 < i8) {
                    double d8 = dArr[i9];
                    i9++;
                    e6.put(Double.valueOf(d7 == 0.0d ? 1.0d : (((d8 + dArr[i9]) * 0.5d) - dArr[0]) / d7), Integer.valueOf(i6));
                }
            }
        }
        return z6.w.s(e6.values());
    }

    public static void x(List list, long[] jArr) {
        long j6 = 0;
        for (long j7 : jArr) {
            j6 += j7;
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            w.a aVar = (w.a) list.get(i6);
            if (aVar != null) {
                aVar.h(new C0279a(j6, jArr[i6]));
            }
        }
    }

    public final long B(long j6) {
        long H6 = H(j6);
        if (this.f21492p.isEmpty()) {
            return H6;
        }
        int i6 = 1;
        while (i6 < this.f21492p.size() - 1 && ((C0279a) this.f21492p.get(i6)).f21500a < H6) {
            i6++;
        }
        C0279a c0279a = (C0279a) this.f21492p.get(i6 - 1);
        C0279a c0279a2 = (C0279a) this.f21492p.get(i6);
        long j7 = c0279a.f21500a;
        float f6 = ((float) (H6 - j7)) / ((float) (c0279a2.f21500a - j7));
        return c0279a.f21501b + (f6 * ((float) (c0279a2.f21501b - r2)));
    }

    public final long C(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        x1.m mVar = (x1.m) z6.D.d(list);
        long j6 = mVar.f20436g;
        if (j6 != -9223372036854775807L) {
            long j7 = mVar.f20437h;
            if (j7 != -9223372036854775807L) {
                return j7 - j6;
            }
        }
        return -9223372036854775807L;
    }

    public long D() {
        return this.f21487k;
    }

    public final long E(x1.n[] nVarArr, List list) {
        int i6 = this.f21495s;
        if (i6 < nVarArr.length && nVarArr[i6].next()) {
            x1.n nVar = nVarArr[this.f21495s];
            return nVar.b() - nVar.a();
        }
        for (x1.n nVar2 : nVarArr) {
            if (nVar2.next()) {
                return nVar2.b() - nVar2.a();
            }
        }
        return C(list);
    }

    public final long H(long j6) {
        long f6 = this.f21484h.f();
        this.f21499w = f6;
        long j7 = ((float) f6) * this.f21490n;
        if (this.f21484h.b() == -9223372036854775807L || j6 == -9223372036854775807L) {
            return ((float) j7) / this.f21494r;
        }
        float f7 = (float) j6;
        return (((float) j7) * Math.max((f7 / this.f21494r) - ((float) r2), 0.0f)) / f7;
    }

    public final long I(long j6, long j7) {
        if (j6 == -9223372036854775807L) {
            return this.f21485i;
        }
        if (j7 != -9223372036854775807L) {
            j6 -= j7;
        }
        return Math.min(((float) j6) * this.f21491o, this.f21485i);
    }

    public boolean J(long j6, List list) {
        long j7 = this.f21497u;
        if (j7 == -9223372036854775807L || j6 - j7 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((x1.m) z6.D.d(list)).equals(this.f21498v)) ? false : true;
    }

    @Override // z1.x
    public void a(long j6, long j7, long j8, List list, x1.n[] nVarArr) {
        long b6 = this.f21493q.b();
        long E6 = E(nVarArr, list);
        int i6 = this.f21496t;
        if (i6 == 0) {
            this.f21496t = 1;
            this.f21495s = z(b6, E6);
            return;
        }
        int i7 = this.f21495s;
        int c6 = list.isEmpty() ? -1 : c(((x1.m) z6.D.d(list)).f20433d);
        if (c6 != -1) {
            i6 = ((x1.m) z6.D.d(list)).f20434e;
            i7 = c6;
        }
        int z6 = z(b6, E6);
        if (z6 != i7 && !b(i7, b6)) {
            Z0.q h6 = h(i7);
            Z0.q h7 = h(z6);
            long I6 = I(j8, E6);
            int i8 = h7.f6985i;
            int i9 = h6.f6985i;
            if ((i8 > i9 && j7 < I6) || (i8 < i9 && j7 >= this.f21486j)) {
                z6 = i7;
            }
        }
        if (z6 != i7) {
            i6 = 3;
        }
        this.f21496t = i6;
        this.f21495s = z6;
    }

    @Override // z1.x
    public int f() {
        return this.f21495s;
    }

    @Override // z1.AbstractC2447c, z1.x
    public void i() {
        this.f21497u = -9223372036854775807L;
        this.f21498v = null;
    }

    @Override // z1.AbstractC2447c, z1.x
    public void j() {
        this.f21498v = null;
    }

    @Override // z1.AbstractC2447c, z1.x
    public int l(long j6, List list) {
        int i6;
        int i7;
        long b6 = this.f21493q.b();
        if (!J(b6, list)) {
            return list.size();
        }
        this.f21497u = b6;
        this.f21498v = list.isEmpty() ? null : (x1.m) z6.D.d(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long j02 = AbstractC1117K.j0(((x1.m) list.get(size - 1)).f20436g - j6, this.f21494r);
        long D6 = D();
        if (j02 >= D6) {
            Z0.q h6 = h(z(b6, C(list)));
            for (int i8 = 0; i8 < size; i8++) {
                x1.m mVar = (x1.m) list.get(i8);
                Z0.q qVar = mVar.f20433d;
                if (AbstractC1117K.j0(mVar.f20436g - j6, this.f21494r) >= D6 && qVar.f6985i < h6.f6985i && (i6 = qVar.f6997u) != -1 && i6 <= this.f21489m && (i7 = qVar.f6996t) != -1 && i7 <= this.f21488l && i6 < h6.f6997u) {
                    return i8;
                }
            }
        }
        return size;
    }

    @Override // z1.x
    public int o() {
        return this.f21496t;
    }

    @Override // z1.AbstractC2447c, z1.x
    public void q(float f6) {
        this.f21494r = f6;
    }

    @Override // z1.x
    public Object r() {
        return null;
    }

    public boolean y(Z0.q qVar, int i6, long j6) {
        return ((long) i6) <= j6;
    }

    public final int z(long j6, long j7) {
        long B6 = B(j7);
        int i6 = 0;
        for (int i7 = 0; i7 < this.f21511b; i7++) {
            if (j6 == Long.MIN_VALUE || !b(i7, j6)) {
                Z0.q h6 = h(i7);
                if (y(h6, h6.f6985i, B6)) {
                    return i7;
                }
                i6 = i7;
            }
        }
        return i6;
    }
}
