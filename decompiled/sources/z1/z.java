package z1;

import Z0.G;
import Z0.H;
import android.util.Pair;
import c1.AbstractC1117K;
import g1.K0;
import g1.L0;
import java.util.Arrays;
import w1.InterfaceC2212D;
import w1.l0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class z extends AbstractC2443C {

    /* renamed from: c, reason: collision with root package name */
    public a f21652c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f21653a;

        /* renamed from: b, reason: collision with root package name */
        public final String[] f21654b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f21655c;

        /* renamed from: d, reason: collision with root package name */
        public final l0[] f21656d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f21657e;

        /* renamed from: f, reason: collision with root package name */
        public final int[][][] f21658f;

        /* renamed from: g, reason: collision with root package name */
        public final l0 f21659g;

        public a(String[] strArr, int[] iArr, l0[] l0VarArr, int[] iArr2, int[][][] iArr3, l0 l0Var) {
            this.f21654b = strArr;
            this.f21655c = iArr;
            this.f21656d = l0VarArr;
            this.f21658f = iArr3;
            this.f21657e = iArr2;
            this.f21659g = l0Var;
            this.f21653a = iArr.length;
        }

        public int a(int i6, int i7, boolean z6) {
            int i8 = this.f21656d[i6].b(i7).f6702a;
            int[] iArr = new int[i8];
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                int g6 = g(i6, i7, i10);
                if (g6 == 4 || (z6 && g6 == 3)) {
                    iArr[i9] = i10;
                    i9++;
                }
            }
            return b(i6, i7, Arrays.copyOf(iArr, i9));
        }

        public int b(int i6, int i7, int[] iArr) {
            int i8 = 0;
            int i9 = 16;
            String str = null;
            boolean z6 = false;
            int i10 = 0;
            while (i8 < iArr.length) {
                String str2 = this.f21656d[i6].b(i7).a(iArr[i8]).f6990n;
                int i11 = i10 + 1;
                if (i10 == 0) {
                    str = str2;
                } else {
                    z6 |= !AbstractC1117K.c(str, str2);
                }
                i9 = Math.min(i9, K0.D(this.f21658f[i6][i7][i8]));
                i8++;
                i10 = i11;
            }
            return z6 ? Math.min(i9, this.f21657e[i6]) : i9;
        }

        public int c(int i6, int i7, int i8) {
            return this.f21658f[i6][i7][i8];
        }

        public int d() {
            return this.f21653a;
        }

        public int e(int i6) {
            return this.f21655c[i6];
        }

        public l0 f(int i6) {
            return this.f21656d[i6];
        }

        public int g(int i6, int i7, int i8) {
            return K0.T(c(i6, i7, i8));
        }

        public l0 h() {
            return this.f21659g;
        }
    }

    public static int l(K0[] k0Arr, H h6, int[] iArr, boolean z6) {
        int length = k0Arr.length;
        int i6 = 0;
        boolean z7 = true;
        for (int i7 = 0; i7 < k0Arr.length; i7++) {
            K0 k02 = k0Arr[i7];
            int i8 = 0;
            for (int i9 = 0; i9 < h6.f6702a; i9++) {
                i8 = Math.max(i8, K0.T(k02.b(h6.a(i9))));
            }
            boolean z8 = iArr[i7] == 0;
            if (i8 > i6 || (i8 == i6 && z6 && !z7 && z8)) {
                length = i7;
                z7 = z8;
                i6 = i8;
            }
        }
        return length;
    }

    public static int[] m(K0 k02, H h6) {
        int[] iArr = new int[h6.f6702a];
        for (int i6 = 0; i6 < h6.f6702a; i6++) {
            iArr[i6] = k02.b(h6.a(i6));
        }
        return iArr;
    }

    public static int[] n(K0[] k0Arr) {
        int length = k0Arr.length;
        int[] iArr = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            iArr[i6] = k0Arr[i6].G();
        }
        return iArr;
    }

    @Override // z1.AbstractC2443C
    public final void h(Object obj) {
        this.f21652c = (a) obj;
    }

    @Override // z1.AbstractC2443C
    public final C2444D j(K0[] k0Arr, l0 l0Var, InterfaceC2212D.b bVar, G g6) {
        int[] iArr = new int[k0Arr.length + 1];
        int length = k0Arr.length + 1;
        H[][] hArr = new H[length];
        int[][][] iArr2 = new int[k0Arr.length + 1][];
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = l0Var.f20070a;
            hArr[i6] = new H[i7];
            iArr2[i6] = new int[i7];
        }
        int[] n6 = n(k0Arr);
        for (int i8 = 0; i8 < l0Var.f20070a; i8++) {
            H b6 = l0Var.b(i8);
            int l6 = l(k0Arr, b6, iArr, b6.f6704c == 5);
            int[] m6 = l6 == k0Arr.length ? new int[b6.f6702a] : m(k0Arr[l6], b6);
            int i9 = iArr[l6];
            hArr[l6][i9] = b6;
            iArr2[l6][i9] = m6;
            iArr[l6] = i9 + 1;
        }
        l0[] l0VarArr = new l0[k0Arr.length];
        String[] strArr = new String[k0Arr.length];
        int[] iArr3 = new int[k0Arr.length];
        for (int i10 = 0; i10 < k0Arr.length; i10++) {
            int i11 = iArr[i10];
            l0VarArr[i10] = new l0((H[]) AbstractC1117K.O0(hArr[i10], i11));
            iArr2[i10] = (int[][]) AbstractC1117K.O0(iArr2[i10], i11);
            strArr[i10] = k0Arr[i10].getName();
            iArr3[i10] = k0Arr[i10].l();
        }
        a aVar = new a(strArr, iArr3, l0VarArr, n6, iArr2, new l0((H[]) AbstractC1117K.O0(hArr[k0Arr.length], iArr[k0Arr.length])));
        Pair o6 = o(aVar, iArr2, n6, bVar, g6);
        return new C2444D((L0[]) o6.first, (x[]) o6.second, AbstractC2442B.b(aVar, (InterfaceC2441A[]) o6.second), aVar);
    }

    public abstract Pair o(a aVar, int[][][] iArr, int[] iArr2, InterfaceC2212D.b bVar, G g6);
}
