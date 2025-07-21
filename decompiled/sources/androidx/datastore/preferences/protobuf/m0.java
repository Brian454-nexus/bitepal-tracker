package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.s0;
import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class m0 {

    /* renamed from: f, reason: collision with root package name */
    public static final m0 f8797f = new m0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f8798a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f8799b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f8800c;

    /* renamed from: d, reason: collision with root package name */
    public int f8801d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8802e;

    public m0() {
        this(0, new int[8], new Object[8], true);
    }

    public static m0 c() {
        return f8797f;
    }

    public static int f(int[] iArr, int i6) {
        int i7 = 17;
        for (int i8 = 0; i8 < i6; i8++) {
            i7 = (i7 * 31) + iArr[i8];
        }
        return i7;
    }

    public static int g(Object[] objArr, int i6) {
        int i7 = 17;
        for (int i8 = 0; i8 < i6; i8++) {
            i7 = (i7 * 31) + objArr[i8].hashCode();
        }
        return i7;
    }

    public static m0 j(m0 m0Var, m0 m0Var2) {
        int i6 = m0Var.f8798a + m0Var2.f8798a;
        int[] copyOf = Arrays.copyOf(m0Var.f8799b, i6);
        System.arraycopy(m0Var2.f8799b, 0, copyOf, m0Var.f8798a, m0Var2.f8798a);
        Object[] copyOf2 = Arrays.copyOf(m0Var.f8800c, i6);
        System.arraycopy(m0Var2.f8800c, 0, copyOf2, m0Var.f8798a, m0Var2.f8798a);
        return new m0(i6, copyOf, copyOf2, true);
    }

    public static m0 k() {
        return new m0();
    }

    public static boolean l(Object[] objArr, Object[] objArr2, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            if (!objArr[i7].equals(objArr2[i7])) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(int[] iArr, int[] iArr2, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            if (iArr[i7] != iArr2[i7]) {
                return false;
            }
        }
        return true;
    }

    public static void q(int i6, Object obj, s0 s0Var) {
        int a6 = r0.a(i6);
        int b6 = r0.b(i6);
        if (b6 == 0) {
            s0Var.n(a6, ((Long) obj).longValue());
            return;
        }
        if (b6 == 1) {
            s0Var.h(a6, ((Long) obj).longValue());
            return;
        }
        if (b6 == 2) {
            s0Var.L(a6, (AbstractC1030g) obj);
            return;
        }
        if (b6 != 3) {
            if (b6 != 5) {
                throw new RuntimeException(C1048z.e());
            }
            s0Var.d(a6, ((Integer) obj).intValue());
        } else if (s0Var.i() == s0.a.ASCENDING) {
            s0Var.q(a6);
            ((m0) obj).r(s0Var);
            s0Var.B(a6);
        } else {
            s0Var.B(a6);
            ((m0) obj).r(s0Var);
            s0Var.q(a6);
        }
    }

    public void a() {
        if (!this.f8802e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i6) {
        int[] iArr = this.f8799b;
        if (i6 > iArr.length) {
            int i7 = this.f8798a;
            int i8 = i7 + (i7 / 2);
            if (i8 >= i6) {
                i6 = i8;
            }
            if (i6 < 8) {
                i6 = 8;
            }
            this.f8799b = Arrays.copyOf(iArr, i6);
            this.f8800c = Arrays.copyOf(this.f8800c, i6);
        }
    }

    public int d() {
        int R5;
        int i6 = this.f8801d;
        if (i6 != -1) {
            return i6;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.f8798a; i8++) {
            int i9 = this.f8799b[i8];
            int a6 = r0.a(i9);
            int b6 = r0.b(i9);
            if (b6 == 0) {
                R5 = AbstractC1033j.R(a6, ((Long) this.f8800c[i8]).longValue());
            } else if (b6 == 1) {
                R5 = AbstractC1033j.n(a6, ((Long) this.f8800c[i8]).longValue());
            } else if (b6 == 2) {
                R5 = AbstractC1033j.f(a6, (AbstractC1030g) this.f8800c[i8]);
            } else if (b6 == 3) {
                R5 = (AbstractC1033j.O(a6) * 2) + ((m0) this.f8800c[i8]).d();
            } else {
                if (b6 != 5) {
                    throw new IllegalStateException(C1048z.e());
                }
                R5 = AbstractC1033j.l(a6, ((Integer) this.f8800c[i8]).intValue());
            }
            i7 += R5;
        }
        this.f8801d = i7;
        return i7;
    }

    public int e() {
        int i6 = this.f8801d;
        if (i6 != -1) {
            return i6;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.f8798a; i8++) {
            i7 += AbstractC1033j.D(r0.a(this.f8799b[i8]), (AbstractC1030g) this.f8800c[i8]);
        }
        this.f8801d = i7;
        return i7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        int i6 = this.f8798a;
        return i6 == m0Var.f8798a && o(this.f8799b, m0Var.f8799b, i6) && l(this.f8800c, m0Var.f8800c, this.f8798a);
    }

    public void h() {
        this.f8802e = false;
    }

    public int hashCode() {
        int i6 = this.f8798a;
        return ((((527 + i6) * 31) + f(this.f8799b, i6)) * 31) + g(this.f8800c, this.f8798a);
    }

    public m0 i(m0 m0Var) {
        if (m0Var.equals(c())) {
            return this;
        }
        a();
        int i6 = this.f8798a + m0Var.f8798a;
        b(i6);
        System.arraycopy(m0Var.f8799b, 0, this.f8799b, this.f8798a, m0Var.f8798a);
        System.arraycopy(m0Var.f8800c, 0, this.f8800c, this.f8798a, m0Var.f8798a);
        this.f8798a = i6;
        return this;
    }

    public final void m(StringBuilder sb, int i6) {
        for (int i7 = 0; i7 < this.f8798a; i7++) {
            Q.d(sb, i6, String.valueOf(r0.a(this.f8799b[i7])), this.f8800c[i7]);
        }
    }

    public void n(int i6, Object obj) {
        a();
        b(this.f8798a + 1);
        int[] iArr = this.f8799b;
        int i7 = this.f8798a;
        iArr[i7] = i6;
        this.f8800c[i7] = obj;
        this.f8798a = i7 + 1;
    }

    public void p(s0 s0Var) {
        if (s0Var.i() == s0.a.DESCENDING) {
            for (int i6 = this.f8798a - 1; i6 >= 0; i6--) {
                s0Var.c(r0.a(this.f8799b[i6]), this.f8800c[i6]);
            }
            return;
        }
        for (int i7 = 0; i7 < this.f8798a; i7++) {
            s0Var.c(r0.a(this.f8799b[i7]), this.f8800c[i7]);
        }
    }

    public void r(s0 s0Var) {
        if (this.f8798a == 0) {
            return;
        }
        if (s0Var.i() == s0.a.ASCENDING) {
            for (int i6 = 0; i6 < this.f8798a; i6++) {
                q(this.f8799b[i6], this.f8800c[i6], s0Var);
            }
            return;
        }
        for (int i7 = this.f8798a - 1; i7 >= 0; i7--) {
            q(this.f8799b[i7], this.f8800c[i7], s0Var);
        }
    }

    public m0(int i6, int[] iArr, Object[] objArr, boolean z6) {
        this.f8801d = -1;
        this.f8798a = i6;
        this.f8799b = iArr;
        this.f8800c = objArr;
        this.f8802e = z6;
    }
}
