package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1031h {

    /* renamed from: f, reason: collision with root package name */
    public static volatile int f8735f = 100;

    /* renamed from: a, reason: collision with root package name */
    public int f8736a;

    /* renamed from: b, reason: collision with root package name */
    public int f8737b;

    /* renamed from: c, reason: collision with root package name */
    public int f8738c;

    /* renamed from: d, reason: collision with root package name */
    public C1032i f8739d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8740e;

    /* renamed from: androidx.datastore.preferences.protobuf.h$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends AbstractC1031h {

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f8741g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f8742h;

        /* renamed from: i, reason: collision with root package name */
        public int f8743i;

        /* renamed from: j, reason: collision with root package name */
        public int f8744j;

        /* renamed from: k, reason: collision with root package name */
        public int f8745k;

        /* renamed from: l, reason: collision with root package name */
        public int f8746l;

        /* renamed from: m, reason: collision with root package name */
        public int f8747m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f8748n;

        /* renamed from: o, reason: collision with root package name */
        public int f8749o;

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public String A() {
            int J6 = J();
            if (J6 > 0) {
                int i6 = this.f8743i;
                int i7 = this.f8745k;
                if (J6 <= i6 - i7) {
                    String e6 = q0.e(this.f8741g, i7, J6);
                    this.f8745k += J6;
                    return e6;
                }
            }
            if (J6 == 0) {
                return "";
            }
            if (J6 <= 0) {
                throw C1048z.g();
            }
            throw C1048z.m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public int B() {
            if (e()) {
                this.f8747m = 0;
                return 0;
            }
            int J6 = J();
            this.f8747m = J6;
            if (r0.a(J6) != 0) {
                return this.f8747m;
            }
            throw C1048z.c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public int C() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public long D() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public boolean E(int i6) {
            int b6 = r0.b(i6);
            if (b6 == 0) {
                P();
                return true;
            }
            if (b6 == 1) {
                O(8);
                return true;
            }
            if (b6 == 2) {
                O(J());
                return true;
            }
            if (b6 == 3) {
                N();
                a(r0.c(r0.a(i6), 4));
                return true;
            }
            if (b6 == 4) {
                return false;
            }
            if (b6 != 5) {
                throw C1048z.e();
            }
            O(4);
            return true;
        }

        public byte F() {
            int i6 = this.f8745k;
            if (i6 == this.f8743i) {
                throw C1048z.m();
            }
            byte[] bArr = this.f8741g;
            this.f8745k = i6 + 1;
            return bArr[i6];
        }

        public byte[] G(int i6) {
            if (i6 > 0) {
                int i7 = this.f8743i;
                int i8 = this.f8745k;
                if (i6 <= i7 - i8) {
                    int i9 = i6 + i8;
                    this.f8745k = i9;
                    return Arrays.copyOfRange(this.f8741g, i8, i9);
                }
            }
            if (i6 > 0) {
                throw C1048z.m();
            }
            if (i6 == 0) {
                return AbstractC1047y.f8970d;
            }
            throw C1048z.g();
        }

        public int H() {
            int i6 = this.f8745k;
            if (this.f8743i - i6 < 4) {
                throw C1048z.m();
            }
            byte[] bArr = this.f8741g;
            this.f8745k = i6 + 4;
            return ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
        }

        public long I() {
            int i6 = this.f8745k;
            if (this.f8743i - i6 < 8) {
                throw C1048z.m();
            }
            byte[] bArr = this.f8741g;
            this.f8745k = i6 + 8;
            return ((bArr[i6 + 7] & 255) << 56) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i6 + 6] & 255) << 48);
        }

        public int J() {
            int i6;
            int i7 = this.f8745k;
            int i8 = this.f8743i;
            if (i8 != i7) {
                byte[] bArr = this.f8741g;
                int i9 = i7 + 1;
                byte b6 = bArr[i7];
                if (b6 >= 0) {
                    this.f8745k = i9;
                    return b6;
                }
                if (i8 - i9 >= 9) {
                    int i10 = i7 + 2;
                    int i11 = (bArr[i9] << 7) ^ b6;
                    if (i11 < 0) {
                        i6 = i11 ^ (-128);
                    } else {
                        int i12 = i7 + 3;
                        int i13 = (bArr[i10] << 14) ^ i11;
                        if (i13 >= 0) {
                            i6 = i13 ^ 16256;
                        } else {
                            int i14 = i7 + 4;
                            int i15 = i13 ^ (bArr[i12] << 21);
                            if (i15 < 0) {
                                i6 = (-2080896) ^ i15;
                            } else {
                                i12 = i7 + 5;
                                byte b7 = bArr[i14];
                                int i16 = (i15 ^ (b7 << 28)) ^ 266354560;
                                if (b7 < 0) {
                                    i14 = i7 + 6;
                                    if (bArr[i12] < 0) {
                                        i12 = i7 + 7;
                                        if (bArr[i14] < 0) {
                                            i14 = i7 + 8;
                                            if (bArr[i12] < 0) {
                                                i12 = i7 + 9;
                                                if (bArr[i14] < 0) {
                                                    int i17 = i7 + 10;
                                                    if (bArr[i12] >= 0) {
                                                        i10 = i17;
                                                        i6 = i16;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i6 = i16;
                                }
                                i6 = i16;
                            }
                            i10 = i14;
                        }
                        i10 = i12;
                    }
                    this.f8745k = i10;
                    return i6;
                }
            }
            return (int) L();
        }

        public long K() {
            long j6;
            long j7;
            long j8;
            int i6 = this.f8745k;
            int i7 = this.f8743i;
            if (i7 != i6) {
                byte[] bArr = this.f8741g;
                int i8 = i6 + 1;
                byte b6 = bArr[i6];
                if (b6 >= 0) {
                    this.f8745k = i8;
                    return b6;
                }
                if (i7 - i8 >= 9) {
                    int i9 = i6 + 2;
                    int i10 = (bArr[i8] << 7) ^ b6;
                    if (i10 < 0) {
                        j6 = i10 ^ (-128);
                    } else {
                        int i11 = i6 + 3;
                        int i12 = (bArr[i9] << 14) ^ i10;
                        if (i12 >= 0) {
                            j6 = i12 ^ 16256;
                            i9 = i11;
                        } else {
                            int i13 = i6 + 4;
                            int i14 = i12 ^ (bArr[i11] << 21);
                            if (i14 < 0) {
                                long j9 = (-2080896) ^ i14;
                                i9 = i13;
                                j6 = j9;
                            } else {
                                long j10 = i14;
                                i9 = i6 + 5;
                                long j11 = j10 ^ (bArr[i13] << 28);
                                if (j11 >= 0) {
                                    j8 = 266354560;
                                } else {
                                    int i15 = i6 + 6;
                                    long j12 = j11 ^ (bArr[i9] << 35);
                                    if (j12 < 0) {
                                        j7 = -34093383808L;
                                    } else {
                                        i9 = i6 + 7;
                                        j11 = j12 ^ (bArr[i15] << 42);
                                        if (j11 >= 0) {
                                            j8 = 4363953127296L;
                                        } else {
                                            i15 = i6 + 8;
                                            j12 = j11 ^ (bArr[i9] << 49);
                                            if (j12 < 0) {
                                                j7 = -558586000294016L;
                                            } else {
                                                i9 = i6 + 9;
                                                long j13 = (j12 ^ (bArr[i15] << 56)) ^ 71499008037633920L;
                                                if (j13 < 0) {
                                                    int i16 = i6 + 10;
                                                    if (bArr[i9] >= 0) {
                                                        i9 = i16;
                                                    }
                                                }
                                                j6 = j13;
                                            }
                                        }
                                    }
                                    j6 = j12 ^ j7;
                                    i9 = i15;
                                }
                                j6 = j11 ^ j8;
                            }
                        }
                    }
                    this.f8745k = i9;
                    return j6;
                }
            }
            return L();
        }

        public long L() {
            long j6 = 0;
            for (int i6 = 0; i6 < 64; i6 += 7) {
                j6 |= (r3 & ByteCompanionObject.MAX_VALUE) << i6;
                if ((F() & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j6;
                }
            }
            throw C1048z.f();
        }

        public final void M() {
            int i6 = this.f8743i + this.f8744j;
            this.f8743i = i6;
            int i7 = i6 - this.f8746l;
            int i8 = this.f8749o;
            if (i7 <= i8) {
                this.f8744j = 0;
                return;
            }
            int i9 = i7 - i8;
            this.f8744j = i9;
            this.f8743i = i6 - i9;
        }

        public void N() {
            int B6;
            do {
                B6 = B();
                if (B6 == 0) {
                    return;
                }
            } while (E(B6));
        }

        public void O(int i6) {
            if (i6 >= 0) {
                int i7 = this.f8743i;
                int i8 = this.f8745k;
                if (i6 <= i7 - i8) {
                    this.f8745k = i8 + i6;
                    return;
                }
            }
            if (i6 >= 0) {
                throw C1048z.m();
            }
            throw C1048z.g();
        }

        public final void P() {
            if (this.f8743i - this.f8745k >= 10) {
                Q();
            } else {
                R();
            }
        }

        public final void Q() {
            for (int i6 = 0; i6 < 10; i6++) {
                byte[] bArr = this.f8741g;
                int i7 = this.f8745k;
                this.f8745k = i7 + 1;
                if (bArr[i7] >= 0) {
                    return;
                }
            }
            throw C1048z.f();
        }

        public final void R() {
            for (int i6 = 0; i6 < 10; i6++) {
                if (F() >= 0) {
                    return;
                }
            }
            throw C1048z.f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public void a(int i6) {
            if (this.f8747m != i6) {
                throw C1048z.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public int d() {
            return this.f8745k - this.f8746l;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public boolean e() {
            return this.f8745k == this.f8743i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public void k(int i6) {
            this.f8749o = i6;
            M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public int l(int i6) {
            if (i6 < 0) {
                throw C1048z.g();
            }
            int d6 = i6 + d();
            if (d6 < 0) {
                throw C1048z.h();
            }
            int i7 = this.f8749o;
            if (d6 > i7) {
                throw C1048z.m();
            }
            this.f8749o = d6;
            M();
            return i7;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public boolean m() {
            return K() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public AbstractC1030g n() {
            int J6 = J();
            if (J6 > 0) {
                int i6 = this.f8743i;
                int i7 = this.f8745k;
                if (J6 <= i6 - i7) {
                    AbstractC1030g C6 = (this.f8742h && this.f8748n) ? AbstractC1030g.C(this.f8741g, i7, J6) : AbstractC1030g.k(this.f8741g, i7, J6);
                    this.f8745k += J6;
                    return C6;
                }
            }
            return J6 == 0 ? AbstractC1030g.f8721b : AbstractC1030g.B(G(J6));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public double o() {
            return Double.longBitsToDouble(I());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public int p() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public int q() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public long r() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public float s() {
            return Float.intBitsToFloat(H());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public int t() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public long u() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public int v() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public long w() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public int x() {
            return AbstractC1031h.b(J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public long y() {
            return AbstractC1031h.c(K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public String z() {
            int J6 = J();
            if (J6 > 0) {
                int i6 = this.f8743i;
                int i7 = this.f8745k;
                if (J6 <= i6 - i7) {
                    String str = new String(this.f8741g, i7, J6, AbstractC1047y.f8968b);
                    this.f8745k += J6;
                    return str;
                }
            }
            if (J6 == 0) {
                return "";
            }
            if (J6 < 0) {
                throw C1048z.g();
            }
            throw C1048z.m();
        }

        public b(byte[] bArr, int i6, int i7, boolean z6) {
            super();
            this.f8749o = IntCompanionObject.MAX_VALUE;
            this.f8741g = bArr;
            this.f8743i = i7 + i6;
            this.f8745k = i6;
            this.f8746l = i6;
            this.f8742h = z6;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends AbstractC1031h {

        /* renamed from: g, reason: collision with root package name */
        public final InputStream f8750g;

        /* renamed from: h, reason: collision with root package name */
        public final byte[] f8751h;

        /* renamed from: i, reason: collision with root package name */
        public int f8752i;

        /* renamed from: j, reason: collision with root package name */
        public int f8753j;

        /* renamed from: k, reason: collision with root package name */
        public int f8754k;

        /* renamed from: l, reason: collision with root package name */
        public int f8755l;

        /* renamed from: m, reason: collision with root package name */
        public int f8756m;

        /* renamed from: n, reason: collision with root package name */
        public int f8757n;

        public static int F(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (C1048z e6) {
                e6.j();
                throw e6;
            }
        }

        public static int G(InputStream inputStream, byte[] bArr, int i6, int i7) {
            try {
                return inputStream.read(bArr, i6, i7);
            } catch (C1048z e6) {
                e6.j();
                throw e6;
            }
        }

        private void R() {
            int i6 = this.f8752i + this.f8753j;
            this.f8752i = i6;
            int i7 = this.f8756m + i6;
            int i8 = this.f8757n;
            if (i7 <= i8) {
                this.f8753j = 0;
                return;
            }
            int i9 = i7 - i8;
            this.f8753j = i9;
            this.f8752i = i6 - i9;
        }

        public static long T(InputStream inputStream, long j6) {
            try {
                return inputStream.skip(j6);
            } catch (C1048z e6) {
                e6.j();
                throw e6;
            }
        }

        private void X() {
            if (this.f8752i - this.f8754k >= 10) {
                Y();
            } else {
                Z();
            }
        }

        private void Y() {
            for (int i6 = 0; i6 < 10; i6++) {
                byte[] bArr = this.f8751h;
                int i7 = this.f8754k;
                this.f8754k = i7 + 1;
                if (bArr[i7] >= 0) {
                    return;
                }
            }
            throw C1048z.f();
        }

        private void Z() {
            for (int i6 = 0; i6 < 10; i6++) {
                if (I() >= 0) {
                    return;
                }
            }
            throw C1048z.f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public String A() {
            byte[] J6;
            int O5 = O();
            int i6 = this.f8754k;
            int i7 = this.f8752i;
            if (O5 <= i7 - i6 && O5 > 0) {
                J6 = this.f8751h;
                this.f8754k = i6 + O5;
            } else {
                if (O5 == 0) {
                    return "";
                }
                i6 = 0;
                if (O5 <= i7) {
                    S(O5);
                    J6 = this.f8751h;
                    this.f8754k = O5;
                } else {
                    J6 = J(O5, false);
                }
            }
            return q0.e(J6, i6, O5);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public int B() {
            if (e()) {
                this.f8755l = 0;
                return 0;
            }
            int O5 = O();
            this.f8755l = O5;
            if (r0.a(O5) != 0) {
                return this.f8755l;
            }
            throw C1048z.c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public int C() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public long D() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public boolean E(int i6) {
            int b6 = r0.b(i6);
            if (b6 == 0) {
                X();
                return true;
            }
            if (b6 == 1) {
                V(8);
                return true;
            }
            if (b6 == 2) {
                V(O());
                return true;
            }
            if (b6 == 3) {
                U();
                a(r0.c(r0.a(i6), 4));
                return true;
            }
            if (b6 == 4) {
                return false;
            }
            if (b6 != 5) {
                throw C1048z.e();
            }
            V(4);
            return true;
        }

        public final AbstractC1030g H(int i6) {
            byte[] K5 = K(i6);
            if (K5 != null) {
                return AbstractC1030g.i(K5);
            }
            int i7 = this.f8754k;
            int i8 = this.f8752i;
            int i9 = i8 - i7;
            this.f8756m += i8;
            this.f8754k = 0;
            this.f8752i = 0;
            List<byte[]> L5 = L(i6 - i9);
            byte[] bArr = new byte[i6];
            System.arraycopy(this.f8751h, i7, bArr, 0, i9);
            for (byte[] bArr2 : L5) {
                System.arraycopy(bArr2, 0, bArr, i9, bArr2.length);
                i9 += bArr2.length;
            }
            return AbstractC1030g.B(bArr);
        }

        public byte I() {
            if (this.f8754k == this.f8752i) {
                S(1);
            }
            byte[] bArr = this.f8751h;
            int i6 = this.f8754k;
            this.f8754k = i6 + 1;
            return bArr[i6];
        }

        public final byte[] J(int i6, boolean z6) {
            byte[] K5 = K(i6);
            if (K5 != null) {
                return z6 ? (byte[]) K5.clone() : K5;
            }
            int i7 = this.f8754k;
            int i8 = this.f8752i;
            int i9 = i8 - i7;
            this.f8756m += i8;
            this.f8754k = 0;
            this.f8752i = 0;
            List<byte[]> L5 = L(i6 - i9);
            byte[] bArr = new byte[i6];
            System.arraycopy(this.f8751h, i7, bArr, 0, i9);
            for (byte[] bArr2 : L5) {
                System.arraycopy(bArr2, 0, bArr, i9, bArr2.length);
                i9 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] K(int i6) {
            if (i6 == 0) {
                return AbstractC1047y.f8970d;
            }
            if (i6 < 0) {
                throw C1048z.g();
            }
            int i7 = this.f8756m;
            int i8 = this.f8754k;
            int i9 = i7 + i8 + i6;
            if (i9 - this.f8738c > 0) {
                throw C1048z.l();
            }
            int i10 = this.f8757n;
            if (i9 > i10) {
                V((i10 - i7) - i8);
                throw C1048z.m();
            }
            int i11 = this.f8752i - i8;
            int i12 = i6 - i11;
            if (i12 >= 4096 && i12 > F(this.f8750g)) {
                return null;
            }
            byte[] bArr = new byte[i6];
            System.arraycopy(this.f8751h, this.f8754k, bArr, 0, i11);
            this.f8756m += this.f8752i;
            this.f8754k = 0;
            this.f8752i = 0;
            while (i11 < i6) {
                int G6 = G(this.f8750g, bArr, i11, i6 - i11);
                if (G6 == -1) {
                    throw C1048z.m();
                }
                this.f8756m += G6;
                i11 += G6;
            }
            return bArr;
        }

        public final List L(int i6) {
            ArrayList arrayList = new ArrayList();
            while (i6 > 0) {
                int min = Math.min(i6, ConstantsKt.DEFAULT_BLOCK_SIZE);
                byte[] bArr = new byte[min];
                int i7 = 0;
                while (i7 < min) {
                    int read = this.f8750g.read(bArr, i7, min - i7);
                    if (read == -1) {
                        throw C1048z.m();
                    }
                    this.f8756m += read;
                    i7 += read;
                }
                i6 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int M() {
            int i6 = this.f8754k;
            if (this.f8752i - i6 < 4) {
                S(4);
                i6 = this.f8754k;
            }
            byte[] bArr = this.f8751h;
            this.f8754k = i6 + 4;
            return ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
        }

        public long N() {
            int i6 = this.f8754k;
            if (this.f8752i - i6 < 8) {
                S(8);
                i6 = this.f8754k;
            }
            byte[] bArr = this.f8751h;
            this.f8754k = i6 + 8;
            return ((bArr[i6 + 7] & 255) << 56) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i6 + 6] & 255) << 48);
        }

        public int O() {
            int i6;
            int i7 = this.f8754k;
            int i8 = this.f8752i;
            if (i8 != i7) {
                byte[] bArr = this.f8751h;
                int i9 = i7 + 1;
                byte b6 = bArr[i7];
                if (b6 >= 0) {
                    this.f8754k = i9;
                    return b6;
                }
                if (i8 - i9 >= 9) {
                    int i10 = i7 + 2;
                    int i11 = (bArr[i9] << 7) ^ b6;
                    if (i11 < 0) {
                        i6 = i11 ^ (-128);
                    } else {
                        int i12 = i7 + 3;
                        int i13 = (bArr[i10] << 14) ^ i11;
                        if (i13 >= 0) {
                            i6 = i13 ^ 16256;
                        } else {
                            int i14 = i7 + 4;
                            int i15 = i13 ^ (bArr[i12] << 21);
                            if (i15 < 0) {
                                i6 = (-2080896) ^ i15;
                            } else {
                                i12 = i7 + 5;
                                byte b7 = bArr[i14];
                                int i16 = (i15 ^ (b7 << 28)) ^ 266354560;
                                if (b7 < 0) {
                                    i14 = i7 + 6;
                                    if (bArr[i12] < 0) {
                                        i12 = i7 + 7;
                                        if (bArr[i14] < 0) {
                                            i14 = i7 + 8;
                                            if (bArr[i12] < 0) {
                                                i12 = i7 + 9;
                                                if (bArr[i14] < 0) {
                                                    int i17 = i7 + 10;
                                                    if (bArr[i12] >= 0) {
                                                        i10 = i17;
                                                        i6 = i16;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i6 = i16;
                                }
                                i6 = i16;
                            }
                            i10 = i14;
                        }
                        i10 = i12;
                    }
                    this.f8754k = i10;
                    return i6;
                }
            }
            return (int) Q();
        }

        public long P() {
            long j6;
            long j7;
            long j8;
            int i6 = this.f8754k;
            int i7 = this.f8752i;
            if (i7 != i6) {
                byte[] bArr = this.f8751h;
                int i8 = i6 + 1;
                byte b6 = bArr[i6];
                if (b6 >= 0) {
                    this.f8754k = i8;
                    return b6;
                }
                if (i7 - i8 >= 9) {
                    int i9 = i6 + 2;
                    int i10 = (bArr[i8] << 7) ^ b6;
                    if (i10 < 0) {
                        j6 = i10 ^ (-128);
                    } else {
                        int i11 = i6 + 3;
                        int i12 = (bArr[i9] << 14) ^ i10;
                        if (i12 >= 0) {
                            j6 = i12 ^ 16256;
                            i9 = i11;
                        } else {
                            int i13 = i6 + 4;
                            int i14 = i12 ^ (bArr[i11] << 21);
                            if (i14 < 0) {
                                long j9 = (-2080896) ^ i14;
                                i9 = i13;
                                j6 = j9;
                            } else {
                                long j10 = i14;
                                i9 = i6 + 5;
                                long j11 = j10 ^ (bArr[i13] << 28);
                                if (j11 >= 0) {
                                    j8 = 266354560;
                                } else {
                                    int i15 = i6 + 6;
                                    long j12 = j11 ^ (bArr[i9] << 35);
                                    if (j12 < 0) {
                                        j7 = -34093383808L;
                                    } else {
                                        i9 = i6 + 7;
                                        j11 = j12 ^ (bArr[i15] << 42);
                                        if (j11 >= 0) {
                                            j8 = 4363953127296L;
                                        } else {
                                            i15 = i6 + 8;
                                            j12 = j11 ^ (bArr[i9] << 49);
                                            if (j12 < 0) {
                                                j7 = -558586000294016L;
                                            } else {
                                                i9 = i6 + 9;
                                                long j13 = (j12 ^ (bArr[i15] << 56)) ^ 71499008037633920L;
                                                if (j13 < 0) {
                                                    int i16 = i6 + 10;
                                                    if (bArr[i9] >= 0) {
                                                        i9 = i16;
                                                    }
                                                }
                                                j6 = j13;
                                            }
                                        }
                                    }
                                    j6 = j12 ^ j7;
                                    i9 = i15;
                                }
                                j6 = j11 ^ j8;
                            }
                        }
                    }
                    this.f8754k = i9;
                    return j6;
                }
            }
            return Q();
        }

        public long Q() {
            long j6 = 0;
            for (int i6 = 0; i6 < 64; i6 += 7) {
                j6 |= (r3 & ByteCompanionObject.MAX_VALUE) << i6;
                if ((I() & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j6;
                }
            }
            throw C1048z.f();
        }

        public final void S(int i6) {
            if (a0(i6)) {
                return;
            }
            if (i6 <= (this.f8738c - this.f8756m) - this.f8754k) {
                throw C1048z.m();
            }
            throw C1048z.l();
        }

        public void U() {
            int B6;
            do {
                B6 = B();
                if (B6 == 0) {
                    return;
                }
            } while (E(B6));
        }

        public void V(int i6) {
            int i7 = this.f8752i;
            int i8 = this.f8754k;
            if (i6 > i7 - i8 || i6 < 0) {
                W(i6);
            } else {
                this.f8754k = i8 + i6;
            }
        }

        public final void W(int i6) {
            if (i6 < 0) {
                throw C1048z.g();
            }
            int i7 = this.f8756m;
            int i8 = this.f8754k;
            int i9 = i7 + i8 + i6;
            int i10 = this.f8757n;
            if (i9 > i10) {
                V((i10 - i7) - i8);
                throw C1048z.m();
            }
            this.f8756m = i7 + i8;
            int i11 = this.f8752i - i8;
            this.f8752i = 0;
            this.f8754k = 0;
            while (i11 < i6) {
                try {
                    long j6 = i6 - i11;
                    long T5 = T(this.f8750g, j6);
                    if (T5 < 0 || T5 > j6) {
                        throw new IllegalStateException(this.f8750g.getClass() + "#skip returned invalid result: " + T5 + "\nThe InputStream implementation is buggy.");
                    }
                    if (T5 == 0) {
                        break;
                    } else {
                        i11 += (int) T5;
                    }
                } finally {
                    this.f8756m += i11;
                    R();
                }
            }
            if (i11 >= i6) {
                return;
            }
            int i12 = this.f8752i;
            int i13 = i12 - this.f8754k;
            this.f8754k = i12;
            S(1);
            while (true) {
                int i14 = i6 - i13;
                int i15 = this.f8752i;
                if (i14 <= i15) {
                    this.f8754k = i14;
                    return;
                } else {
                    i13 += i15;
                    this.f8754k = i15;
                    S(1);
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public void a(int i6) {
            if (this.f8755l != i6) {
                throw C1048z.b();
            }
        }

        public final boolean a0(int i6) {
            int i7 = this.f8754k;
            int i8 = i7 + i6;
            int i9 = this.f8752i;
            if (i8 <= i9) {
                throw new IllegalStateException("refillBuffer() called when " + i6 + " bytes were already available in buffer");
            }
            int i10 = this.f8738c;
            int i11 = this.f8756m;
            if (i6 > (i10 - i11) - i7 || i11 + i7 + i6 > this.f8757n) {
                return false;
            }
            if (i7 > 0) {
                if (i9 > i7) {
                    byte[] bArr = this.f8751h;
                    System.arraycopy(bArr, i7, bArr, 0, i9 - i7);
                }
                this.f8756m += i7;
                this.f8752i -= i7;
                this.f8754k = 0;
            }
            InputStream inputStream = this.f8750g;
            byte[] bArr2 = this.f8751h;
            int i12 = this.f8752i;
            int G6 = G(inputStream, bArr2, i12, Math.min(bArr2.length - i12, (this.f8738c - this.f8756m) - i12));
            if (G6 == 0 || G6 < -1 || G6 > this.f8751h.length) {
                throw new IllegalStateException(this.f8750g.getClass() + "#read(byte[]) returned invalid result: " + G6 + "\nThe InputStream implementation is buggy.");
            }
            if (G6 <= 0) {
                return false;
            }
            this.f8752i += G6;
            R();
            if (this.f8752i >= i6) {
                return true;
            }
            return a0(i6);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public int d() {
            return this.f8756m + this.f8754k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public boolean e() {
            return this.f8754k == this.f8752i && !a0(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public void k(int i6) {
            this.f8757n = i6;
            R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public int l(int i6) {
            if (i6 < 0) {
                throw C1048z.g();
            }
            int i7 = i6 + this.f8756m + this.f8754k;
            int i8 = this.f8757n;
            if (i7 > i8) {
                throw C1048z.m();
            }
            this.f8757n = i7;
            R();
            return i8;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public boolean m() {
            return P() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public AbstractC1030g n() {
            int O5 = O();
            int i6 = this.f8752i;
            int i7 = this.f8754k;
            if (O5 > i6 - i7 || O5 <= 0) {
                return O5 == 0 ? AbstractC1030g.f8721b : H(O5);
            }
            AbstractC1030g k6 = AbstractC1030g.k(this.f8751h, i7, O5);
            this.f8754k += O5;
            return k6;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public double o() {
            return Double.longBitsToDouble(N());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public int p() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public int q() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public long r() {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public float s() {
            return Float.intBitsToFloat(M());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public int t() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public long u() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public int v() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public long w() {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public int x() {
            return AbstractC1031h.b(O());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public long y() {
            return AbstractC1031h.c(P());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1031h
        public String z() {
            int O5 = O();
            if (O5 > 0) {
                int i6 = this.f8752i;
                int i7 = this.f8754k;
                if (O5 <= i6 - i7) {
                    String str = new String(this.f8751h, i7, O5, AbstractC1047y.f8968b);
                    this.f8754k += O5;
                    return str;
                }
            }
            if (O5 == 0) {
                return "";
            }
            if (O5 > this.f8752i) {
                return new String(J(O5, false), AbstractC1047y.f8968b);
            }
            S(O5);
            String str2 = new String(this.f8751h, this.f8754k, O5, AbstractC1047y.f8968b);
            this.f8754k += O5;
            return str2;
        }

        public c(InputStream inputStream, int i6) {
            super();
            this.f8757n = IntCompanionObject.MAX_VALUE;
            AbstractC1047y.b(inputStream, "input");
            this.f8750g = inputStream;
            this.f8751h = new byte[i6];
            this.f8752i = 0;
            this.f8754k = 0;
            this.f8756m = 0;
        }
    }

    public static int b(int i6) {
        return (-(i6 & 1)) ^ (i6 >>> 1);
    }

    public static long c(long j6) {
        return (-(j6 & 1)) ^ (j6 >>> 1);
    }

    public static AbstractC1031h f(InputStream inputStream) {
        return g(inputStream, ConstantsKt.DEFAULT_BLOCK_SIZE);
    }

    public static AbstractC1031h g(InputStream inputStream, int i6) {
        if (i6 > 0) {
            return inputStream == null ? h(AbstractC1047y.f8970d) : new c(inputStream, i6);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC1031h h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static AbstractC1031h i(byte[] bArr, int i6, int i7) {
        return j(bArr, i6, i7, false);
    }

    public static AbstractC1031h j(byte[] bArr, int i6, int i7, boolean z6) {
        b bVar = new b(bArr, i6, i7, z6);
        try {
            bVar.l(i7);
            return bVar;
        } catch (C1048z e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int i6);

    public abstract void a(int i6);

    public abstract int d();

    public abstract boolean e();

    public abstract void k(int i6);

    public abstract int l(int i6);

    public abstract boolean m();

    public abstract AbstractC1030g n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();

    public AbstractC1031h() {
        this.f8737b = f8735f;
        this.f8738c = IntCompanionObject.MAX_VALUE;
        this.f8740e = false;
    }
}
