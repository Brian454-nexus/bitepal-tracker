package i1;

import c1.AbstractC1117K;
import i1.M;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class V implements M.e {

    /* renamed from: b, reason: collision with root package name */
    public final int f15858b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15859c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15860d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15861e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15862f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15863g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15864h;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f15865a = 250000;

        /* renamed from: b, reason: collision with root package name */
        public int f15866b = 750000;

        /* renamed from: c, reason: collision with root package name */
        public int f15867c = 4;

        /* renamed from: d, reason: collision with root package name */
        public int f15868d = 250000;

        /* renamed from: e, reason: collision with root package name */
        public int f15869e = 50000000;

        /* renamed from: f, reason: collision with root package name */
        public int f15870f = 2;

        /* renamed from: g, reason: collision with root package name */
        public int f15871g = 4;

        public V h() {
            return new V(this);
        }
    }

    public V(a aVar) {
        this.f15858b = aVar.f15865a;
        this.f15859c = aVar.f15866b;
        this.f15860d = aVar.f15867c;
        this.f15861e = aVar.f15868d;
        this.f15862f = aVar.f15869e;
        this.f15863g = aVar.f15870f;
        this.f15864h = aVar.f15871g;
    }

    public static int b(int i6, int i7, int i8) {
        return C6.g.d(((i6 * i7) * i8) / 1000000);
    }

    public static int d(int i6) {
        if (i6 == 20) {
            return 63750;
        }
        if (i6 == 30) {
            return 2250000;
        }
        switch (i6) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i6) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    @Override // i1.M.e
    public int a(int i6, int i7, int i8, int i9, int i10, int i11, double d6) {
        return (((Math.max(i6, (int) (c(i6, i7, i8, i9, i10, i11) * d6)) + i9) - 1) / i9) * i9;
    }

    public int c(int i6, int i7, int i8, int i9, int i10, int i11) {
        if (i8 == 0) {
            return g(i6, i10, i9);
        }
        if (i8 == 1) {
            return e(i7);
        }
        if (i8 == 2) {
            return f(i7, i11);
        }
        throw new IllegalArgumentException();
    }

    public int e(int i6) {
        return C6.g.d((this.f15862f * d(i6)) / 1000000);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int f(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.f15861e
            r1 = 5
            r2 = 8
            if (r4 != r1) goto Lb
            int r1 = r3.f15863g
        L9:
            int r0 = r0 * r1
            goto L10
        Lb:
            if (r4 != r2) goto L10
            int r1 = r3.f15864h
            goto L9
        L10:
            r1 = -1
            if (r5 == r1) goto L1a
            java.math.RoundingMode r4 = java.math.RoundingMode.CEILING
            int r4 = B6.d.b(r5, r2, r4)
            goto L1e
        L1a:
            int r4 = d(r4)
        L1e:
            long r0 = (long) r0
            long r4 = (long) r4
            long r0 = r0 * r4
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r4
            int r4 = C6.g.d(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.V.f(int, int):int");
    }

    public int g(int i6, int i7, int i8) {
        return AbstractC1117K.p(i6 * this.f15860d, b(this.f15858b, i7, i8), b(this.f15859c, i7, i8));
    }
}
