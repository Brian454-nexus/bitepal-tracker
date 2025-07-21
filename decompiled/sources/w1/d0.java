package w1;

import java.util.Arrays;
import java.util.Random;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface d0 {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements d0 {

        /* renamed from: a, reason: collision with root package name */
        public final Random f19962a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f19963b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f19964c;

        public a(int i6) {
            this(i6, new Random());
        }

        public static int[] i(int i6, Random random) {
            int[] iArr = new int[i6];
            int i7 = 0;
            while (i7 < i6) {
                int i8 = i7 + 1;
                int nextInt = random.nextInt(i8);
                iArr[i7] = iArr[nextInt];
                iArr[nextInt] = i7;
                i7 = i8;
            }
            return iArr;
        }

        @Override // w1.d0
        public int a() {
            return this.f19963b.length;
        }

        @Override // w1.d0
        public d0 b(int i6, int i7) {
            int i8 = i7 - i6;
            int[] iArr = new int[this.f19963b.length - i8];
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int[] iArr2 = this.f19963b;
                if (i9 >= iArr2.length) {
                    return new a(iArr, new Random(this.f19962a.nextLong()));
                }
                int i11 = iArr2[i9];
                if (i11 < i6 || i11 >= i7) {
                    int i12 = i9 - i10;
                    if (i11 >= i6) {
                        i11 -= i8;
                    }
                    iArr[i12] = i11;
                } else {
                    i10++;
                }
                i9++;
            }
        }

        @Override // w1.d0
        public int c() {
            int[] iArr = this.f19963b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // w1.d0
        public int d(int i6) {
            int i7 = this.f19964c[i6] - 1;
            if (i7 >= 0) {
                return this.f19963b[i7];
            }
            return -1;
        }

        @Override // w1.d0
        public int e(int i6) {
            int i7 = this.f19964c[i6] + 1;
            int[] iArr = this.f19963b;
            if (i7 < iArr.length) {
                return iArr[i7];
            }
            return -1;
        }

        @Override // w1.d0
        public d0 f(int i6, int i7) {
            int[] iArr = new int[i7];
            int[] iArr2 = new int[i7];
            int i8 = 0;
            int i9 = 0;
            while (i9 < i7) {
                iArr[i9] = this.f19962a.nextInt(this.f19963b.length + 1);
                int i10 = i9 + 1;
                int nextInt = this.f19962a.nextInt(i10);
                iArr2[i9] = iArr2[nextInt];
                iArr2[nextInt] = i9 + i6;
                i9 = i10;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f19963b.length + i7];
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int[] iArr4 = this.f19963b;
                if (i8 >= iArr4.length + i7) {
                    return new a(iArr3, new Random(this.f19962a.nextLong()));
                }
                if (i11 >= i7 || i12 != iArr[i11]) {
                    int i13 = i12 + 1;
                    int i14 = iArr4[i12];
                    iArr3[i8] = i14;
                    if (i14 >= i6) {
                        iArr3[i8] = i14 + i7;
                    }
                    i12 = i13;
                } else {
                    iArr3[i8] = iArr2[i11];
                    i11++;
                }
                i8++;
            }
        }

        @Override // w1.d0
        public int g() {
            int[] iArr = this.f19963b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // w1.d0
        public d0 h() {
            return new a(0, new Random(this.f19962a.nextLong()));
        }

        public a(int i6, Random random) {
            this(i(i6, random), random);
        }

        public a(int[] iArr, Random random) {
            this.f19963b = iArr;
            this.f19962a = random;
            this.f19964c = new int[iArr.length];
            for (int i6 = 0; i6 < iArr.length; i6++) {
                this.f19964c[iArr[i6]] = i6;
            }
        }
    }

    int a();

    d0 b(int i6, int i7);

    int c();

    int d(int i6);

    int e(int i6);

    d0 f(int i6, int i7);

    int g();

    d0 h();
}
