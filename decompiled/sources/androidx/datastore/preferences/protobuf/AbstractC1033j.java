package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.io.ConstantsKt;

/* renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1033j extends AbstractC1029f {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f8784c = Logger.getLogger(AbstractC1033j.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f8785d = p0.E();

    /* renamed from: a, reason: collision with root package name */
    public C1034k f8786a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8787b;

    /* renamed from: androidx.datastore.preferences.protobuf.j$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class b extends AbstractC1033j {

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f8788e;

        /* renamed from: f, reason: collision with root package name */
        public final int f8789f;

        /* renamed from: g, reason: collision with root package name */
        public int f8790g;

        /* renamed from: h, reason: collision with root package name */
        public int f8791h;

        public b(int i6) {
            super();
            if (i6 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i6, 20)];
            this.f8788e = bArr;
            this.f8789f = bArr.length;
        }

        public final void R0(byte b6) {
            byte[] bArr = this.f8788e;
            int i6 = this.f8790g;
            this.f8790g = i6 + 1;
            bArr[i6] = b6;
            this.f8791h++;
        }

        public final void S0(int i6) {
            byte[] bArr = this.f8788e;
            int i7 = this.f8790g;
            int i8 = i7 + 1;
            this.f8790g = i8;
            bArr[i7] = (byte) (i6 & 255);
            int i9 = i7 + 2;
            this.f8790g = i9;
            bArr[i8] = (byte) ((i6 >> 8) & 255);
            int i10 = i7 + 3;
            this.f8790g = i10;
            bArr[i9] = (byte) ((i6 >> 16) & 255);
            this.f8790g = i7 + 4;
            bArr[i10] = (byte) ((i6 >> 24) & 255);
            this.f8791h += 4;
        }

        public final void T0(long j6) {
            byte[] bArr = this.f8788e;
            int i6 = this.f8790g;
            int i7 = i6 + 1;
            this.f8790g = i7;
            bArr[i6] = (byte) (j6 & 255);
            int i8 = i6 + 2;
            this.f8790g = i8;
            bArr[i7] = (byte) ((j6 >> 8) & 255);
            int i9 = i6 + 3;
            this.f8790g = i9;
            bArr[i8] = (byte) ((j6 >> 16) & 255);
            int i10 = i6 + 4;
            this.f8790g = i10;
            bArr[i9] = (byte) (255 & (j6 >> 24));
            int i11 = i6 + 5;
            this.f8790g = i11;
            bArr[i10] = (byte) (((int) (j6 >> 32)) & 255);
            int i12 = i6 + 6;
            this.f8790g = i12;
            bArr[i11] = (byte) (((int) (j6 >> 40)) & 255);
            int i13 = i6 + 7;
            this.f8790g = i13;
            bArr[i12] = (byte) (((int) (j6 >> 48)) & 255);
            this.f8790g = i6 + 8;
            bArr[i13] = (byte) (((int) (j6 >> 56)) & 255);
            this.f8791h += 8;
        }

        public final void U0(int i6) {
            if (i6 >= 0) {
                W0(i6);
            } else {
                X0(i6);
            }
        }

        public final void V0(int i6, int i7) {
            W0(r0.c(i6, i7));
        }

        public final void W0(int i6) {
            if (!AbstractC1033j.f8785d) {
                while ((i6 & (-128)) != 0) {
                    byte[] bArr = this.f8788e;
                    int i7 = this.f8790g;
                    this.f8790g = i7 + 1;
                    bArr[i7] = (byte) ((i6 & 127) | 128);
                    this.f8791h++;
                    i6 >>>= 7;
                }
                byte[] bArr2 = this.f8788e;
                int i8 = this.f8790g;
                this.f8790g = i8 + 1;
                bArr2[i8] = (byte) i6;
                this.f8791h++;
                return;
            }
            long j6 = this.f8790g;
            while ((i6 & (-128)) != 0) {
                byte[] bArr3 = this.f8788e;
                int i9 = this.f8790g;
                this.f8790g = i9 + 1;
                p0.K(bArr3, i9, (byte) ((i6 & 127) | 128));
                i6 >>>= 7;
            }
            byte[] bArr4 = this.f8788e;
            int i10 = this.f8790g;
            this.f8790g = i10 + 1;
            p0.K(bArr4, i10, (byte) i6);
            this.f8791h += (int) (this.f8790g - j6);
        }

        public final void X0(long j6) {
            if (!AbstractC1033j.f8785d) {
                while ((j6 & (-128)) != 0) {
                    byte[] bArr = this.f8788e;
                    int i6 = this.f8790g;
                    this.f8790g = i6 + 1;
                    bArr[i6] = (byte) ((((int) j6) & 127) | 128);
                    this.f8791h++;
                    j6 >>>= 7;
                }
                byte[] bArr2 = this.f8788e;
                int i7 = this.f8790g;
                this.f8790g = i7 + 1;
                bArr2[i7] = (byte) j6;
                this.f8791h++;
                return;
            }
            long j7 = this.f8790g;
            while ((j6 & (-128)) != 0) {
                byte[] bArr3 = this.f8788e;
                int i8 = this.f8790g;
                this.f8790g = i8 + 1;
                p0.K(bArr3, i8, (byte) ((((int) j6) & 127) | 128));
                j6 >>>= 7;
            }
            byte[] bArr4 = this.f8788e;
            int i9 = this.f8790g;
            this.f8790g = i9 + 1;
            p0.K(bArr4, i9, (byte) j6);
            this.f8791h += (int) (this.f8790g - j7);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.j$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c extends IOException {
        public c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.j$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends b {

        /* renamed from: i, reason: collision with root package name */
        public final OutputStream f8792i;

        public d(OutputStream outputStream, int i6) {
            super(i6);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f8792i = outputStream;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void A0(int i6, O o6) {
            M0(1, 3);
            N0(2, i6);
            b1(3, o6);
            M0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void B0(int i6, AbstractC1030g abstractC1030g) {
            M0(1, 3);
            N0(2, i6);
            e0(3, abstractC1030g);
            M0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void K0(int i6, String str) {
            M0(i6, 2);
            L0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void L0(String str) {
            int g6;
            try {
                int length = str.length() * 3;
                int Q5 = AbstractC1033j.Q(length);
                int i6 = Q5 + length;
                int i7 = this.f8789f;
                if (i6 > i7) {
                    byte[] bArr = new byte[length];
                    int f6 = q0.f(str, bArr, 0, length);
                    O0(f6);
                    a(bArr, 0, f6);
                    return;
                }
                if (i6 > i7 - this.f8790g) {
                    Y0();
                }
                int Q6 = AbstractC1033j.Q(str.length());
                int i8 = this.f8790g;
                try {
                    if (Q6 == Q5) {
                        int i9 = i8 + Q6;
                        this.f8790g = i9;
                        int f7 = q0.f(str, this.f8788e, i9, this.f8789f - i9);
                        this.f8790g = i8;
                        g6 = (f7 - i8) - Q6;
                        W0(g6);
                        this.f8790g = f7;
                    } else {
                        g6 = q0.g(str);
                        W0(g6);
                        this.f8790g = q0.f(str, this.f8788e, this.f8790g, g6);
                    }
                    this.f8791h += g6;
                } catch (q0.d e6) {
                    this.f8791h -= this.f8790g - i8;
                    this.f8790g = i8;
                    throw e6;
                } catch (ArrayIndexOutOfBoundsException e7) {
                    throw new c(e7);
                }
            } catch (q0.d e8) {
                W(str, e8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void M0(int i6, int i7) {
            O0(r0.c(i6, i7));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void N0(int i6, int i7) {
            Z0(20);
            V0(i6, 0);
            W0(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void O0(int i6) {
            Z0(5);
            W0(i6);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void P0(int i6, long j6) {
            Z0(20);
            V0(i6, 0);
            X0(j6);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void Q0(long j6) {
            Z0(10);
            X0(j6);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void V() {
            if (this.f8790g > 0) {
                Y0();
            }
        }

        public final void Y0() {
            this.f8792i.write(this.f8788e, 0, this.f8790g);
            this.f8790g = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void Z(byte b6) {
            if (this.f8790g == this.f8789f) {
                Y0();
            }
            R0(b6);
        }

        public final void Z0(int i6) {
            if (this.f8789f - this.f8790g < i6) {
                Y0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j, androidx.datastore.preferences.protobuf.AbstractC1029f
        public void a(byte[] bArr, int i6, int i7) {
            a1(bArr, i6, i7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void a0(int i6, boolean z6) {
            Z0(11);
            V0(i6, 0);
            R0(z6 ? (byte) 1 : (byte) 0);
        }

        public void a1(byte[] bArr, int i6, int i7) {
            int i8 = this.f8789f;
            int i9 = this.f8790g;
            if (i8 - i9 >= i7) {
                System.arraycopy(bArr, i6, this.f8788e, i9, i7);
                this.f8790g += i7;
                this.f8791h += i7;
                return;
            }
            int i10 = i8 - i9;
            System.arraycopy(bArr, i6, this.f8788e, i9, i10);
            int i11 = i6 + i10;
            int i12 = i7 - i10;
            this.f8790g = this.f8789f;
            this.f8791h += i10;
            Y0();
            if (i12 <= this.f8789f) {
                System.arraycopy(bArr, i11, this.f8788e, 0, i12);
                this.f8790g = i12;
            } else {
                this.f8792i.write(bArr, i11, i12);
            }
            this.f8791h += i12;
        }

        public void b1(int i6, O o6) {
            M0(i6, 2);
            z0(o6);
        }

        public void c1(O o6, e0 e0Var) {
            O0(((AbstractC1024a) o6).d(e0Var));
            e0Var.i(o6, this.f8786a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void d0(byte[] bArr, int i6, int i7) {
            O0(i7);
            a1(bArr, i6, i7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void e0(int i6, AbstractC1030g abstractC1030g) {
            M0(i6, 2);
            f0(abstractC1030g);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void f0(AbstractC1030g abstractC1030g) {
            O0(abstractC1030g.size());
            abstractC1030g.D(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void k0(int i6, int i7) {
            Z0(14);
            V0(i6, 5);
            S0(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void l0(int i6) {
            Z0(4);
            S0(i6);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void m0(int i6, long j6) {
            Z0(18);
            V0(i6, 1);
            T0(j6);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void n0(long j6) {
            Z0(8);
            T0(j6);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void u0(int i6, int i7) {
            Z0(20);
            V0(i6, 0);
            U0(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void v0(int i6) {
            if (i6 >= 0) {
                O0(i6);
            } else {
                Q0(i6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void y0(int i6, O o6, e0 e0Var) {
            M0(i6, 2);
            c1(o6, e0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1033j
        public void z0(O o6) {
            O0(o6.getSerializedSize());
            o6.a(this);
        }
    }

    public static int A(O o6) {
        return y(o6.getSerializedSize());
    }

    public static int B(O o6, e0 e0Var) {
        return y(((AbstractC1024a) o6).d(e0Var));
    }

    public static int C(int i6) {
        return i6 > 4096 ? ConstantsKt.DEFAULT_BLOCK_SIZE : i6;
    }

    public static int D(int i6, AbstractC1030g abstractC1030g) {
        return (O(1) * 2) + P(2, i6) + f(3, abstractC1030g);
    }

    public static int E(int i6, int i7) {
        return O(i6) + F(i7);
    }

    public static int F(int i6) {
        return 4;
    }

    public static int G(int i6, long j6) {
        return O(i6) + H(j6);
    }

    public static int H(long j6) {
        return 8;
    }

    public static int I(int i6, int i7) {
        return O(i6) + J(i7);
    }

    public static int J(int i6) {
        return Q(T(i6));
    }

    public static int K(int i6, long j6) {
        return O(i6) + L(j6);
    }

    public static int L(long j6) {
        return S(U(j6));
    }

    public static int M(int i6, String str) {
        return O(i6) + N(str);
    }

    public static int N(String str) {
        int length;
        try {
            length = q0.g(str);
        } catch (q0.d unused) {
            length = str.getBytes(AbstractC1047y.f8968b).length;
        }
        return y(length);
    }

    public static int O(int i6) {
        return Q(r0.c(i6, 0));
    }

    public static int P(int i6, int i7) {
        return O(i6) + Q(i7);
    }

    public static int Q(int i6) {
        if ((i6 & (-128)) == 0) {
            return 1;
        }
        if ((i6 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i6) == 0) {
            return 3;
        }
        return (i6 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int R(int i6, long j6) {
        return O(i6) + S(j6);
    }

    public static int S(long j6) {
        int i6;
        if (((-128) & j6) == 0) {
            return 1;
        }
        if (j6 < 0) {
            return 10;
        }
        if (((-34359738368L) & j6) != 0) {
            j6 >>>= 28;
            i6 = 6;
        } else {
            i6 = 2;
        }
        if (((-2097152) & j6) != 0) {
            i6 += 2;
            j6 >>>= 14;
        }
        return (j6 & (-16384)) != 0 ? i6 + 1 : i6;
    }

    public static int T(int i6) {
        return (i6 >> 31) ^ (i6 << 1);
    }

    public static long U(long j6) {
        return (j6 >> 63) ^ (j6 << 1);
    }

    public static AbstractC1033j Y(OutputStream outputStream, int i6) {
        return new d(outputStream, i6);
    }

    public static int c(int i6, boolean z6) {
        return O(i6) + d(z6);
    }

    public static int d(boolean z6) {
        return 1;
    }

    public static int e(byte[] bArr) {
        return y(bArr.length);
    }

    public static int f(int i6, AbstractC1030g abstractC1030g) {
        return O(i6) + g(abstractC1030g);
    }

    public static int g(AbstractC1030g abstractC1030g) {
        return y(abstractC1030g.size());
    }

    public static int h(int i6, double d6) {
        return O(i6) + i(d6);
    }

    public static int i(double d6) {
        return 8;
    }

    public static int j(int i6, int i7) {
        return O(i6) + k(i7);
    }

    public static int k(int i6) {
        return v(i6);
    }

    public static int l(int i6, int i7) {
        return O(i6) + m(i7);
    }

    public static int m(int i6) {
        return 4;
    }

    public static int n(int i6, long j6) {
        return O(i6) + o(j6);
    }

    public static int o(long j6) {
        return 8;
    }

    public static int p(int i6, float f6) {
        return O(i6) + q(f6);
    }

    public static int q(float f6) {
        return 4;
    }

    public static int r(int i6, O o6, e0 e0Var) {
        return (O(i6) * 2) + t(o6, e0Var);
    }

    public static int s(O o6) {
        return o6.getSerializedSize();
    }

    public static int t(O o6, e0 e0Var) {
        return ((AbstractC1024a) o6).d(e0Var);
    }

    public static int u(int i6, int i7) {
        return O(i6) + v(i7);
    }

    public static int v(int i6) {
        if (i6 >= 0) {
            return Q(i6);
        }
        return 10;
    }

    public static int w(int i6, long j6) {
        return O(i6) + x(j6);
    }

    public static int x(long j6) {
        return S(j6);
    }

    public static int y(int i6) {
        return Q(i6) + i6;
    }

    public static int z(int i6, O o6, e0 e0Var) {
        return O(i6) + B(o6, e0Var);
    }

    public abstract void A0(int i6, O o6);

    public abstract void B0(int i6, AbstractC1030g abstractC1030g);

    public final void C0(int i6, int i7) {
        k0(i6, i7);
    }

    public final void D0(int i6) {
        l0(i6);
    }

    public final void E0(int i6, long j6) {
        m0(i6, j6);
    }

    public final void F0(long j6) {
        n0(j6);
    }

    public final void G0(int i6, int i7) {
        N0(i6, T(i7));
    }

    public final void H0(int i6) {
        O0(T(i6));
    }

    public final void I0(int i6, long j6) {
        P0(i6, U(j6));
    }

    public final void J0(long j6) {
        Q0(U(j6));
    }

    public abstract void K0(int i6, String str);

    public abstract void L0(String str);

    public abstract void M0(int i6, int i7);

    public abstract void N0(int i6, int i7);

    public abstract void O0(int i6);

    public abstract void P0(int i6, long j6);

    public abstract void Q0(long j6);

    public abstract void V();

    public final void W(String str, q0.d dVar) {
        f8784c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC1047y.f8968b);
        try {
            O0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e6) {
            throw new c(e6);
        }
    }

    public boolean X() {
        return this.f8787b;
    }

    public abstract void Z(byte b6);

    @Override // androidx.datastore.preferences.protobuf.AbstractC1029f
    public abstract void a(byte[] bArr, int i6, int i7);

    public abstract void a0(int i6, boolean z6);

    public final void b0(boolean z6) {
        Z(z6 ? (byte) 1 : (byte) 0);
    }

    public final void c0(byte[] bArr) {
        d0(bArr, 0, bArr.length);
    }

    public abstract void d0(byte[] bArr, int i6, int i7);

    public abstract void e0(int i6, AbstractC1030g abstractC1030g);

    public abstract void f0(AbstractC1030g abstractC1030g);

    public final void g0(int i6, double d6) {
        m0(i6, Double.doubleToRawLongBits(d6));
    }

    public final void h0(double d6) {
        n0(Double.doubleToRawLongBits(d6));
    }

    public final void i0(int i6, int i7) {
        u0(i6, i7);
    }

    public final void j0(int i6) {
        v0(i6);
    }

    public abstract void k0(int i6, int i7);

    public abstract void l0(int i6);

    public abstract void m0(int i6, long j6);

    public abstract void n0(long j6);

    public final void o0(int i6, float f6) {
        k0(i6, Float.floatToRawIntBits(f6));
    }

    public final void p0(float f6) {
        l0(Float.floatToRawIntBits(f6));
    }

    public final void q0(int i6, O o6) {
        M0(i6, 3);
        s0(o6);
        M0(i6, 4);
    }

    public final void r0(int i6, O o6, e0 e0Var) {
        M0(i6, 3);
        t0(o6, e0Var);
        M0(i6, 4);
    }

    public final void s0(O o6) {
        o6.a(this);
    }

    public final void t0(O o6, e0 e0Var) {
        e0Var.i(o6, this.f8786a);
    }

    public abstract void u0(int i6, int i7);

    public abstract void v0(int i6);

    public final void w0(int i6, long j6) {
        P0(i6, j6);
    }

    public final void x0(long j6) {
        Q0(j6);
    }

    public abstract void y0(int i6, O o6, e0 e0Var);

    public abstract void z0(O o6);

    public AbstractC1033j() {
    }
}
