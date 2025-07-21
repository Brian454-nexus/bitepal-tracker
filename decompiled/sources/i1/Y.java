package i1;

import a1.AbstractC1001d;
import a1.InterfaceC0999b;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class Y extends AbstractC1001d {

    /* renamed from: i, reason: collision with root package name */
    public final float f15893i;

    /* renamed from: j, reason: collision with root package name */
    public final short f15894j;

    /* renamed from: k, reason: collision with root package name */
    public final int f15895k;

    /* renamed from: l, reason: collision with root package name */
    public final long f15896l;

    /* renamed from: m, reason: collision with root package name */
    public final long f15897m;

    /* renamed from: n, reason: collision with root package name */
    public int f15898n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f15899o;

    /* renamed from: p, reason: collision with root package name */
    public int f15900p;

    /* renamed from: q, reason: collision with root package name */
    public long f15901q;

    /* renamed from: r, reason: collision with root package name */
    public int f15902r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f15903s;

    /* renamed from: t, reason: collision with root package name */
    public int f15904t;

    /* renamed from: u, reason: collision with root package name */
    public int f15905u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f15906v;

    public Y() {
        this(100000L, 0.2f, 2000000L, 10, (short) 1024);
    }

    public static void C(byte[] bArr, int i6, int i7) {
        if (i7 >= 32767) {
            bArr[i6] = -1;
            bArr[i6 + 1] = ByteCompanionObject.MAX_VALUE;
        } else if (i7 <= -32768) {
            bArr[i6] = 0;
            bArr[i6 + 1] = ByteCompanionObject.MIN_VALUE;
        } else {
            bArr[i6] = (byte) (i7 & 255);
            bArr[i6 + 1] = (byte) (i7 >> 8);
        }
    }

    public static int F(byte b6, byte b7) {
        return (b6 << 8) | (b7 & 255);
    }

    public final void A(int i6, int i7) {
        if (i6 == 0) {
            return;
        }
        AbstractC1119a.a(this.f15905u >= i6);
        if (i7 == 2) {
            int i8 = this.f15904t;
            int i9 = this.f15905u;
            int i10 = i8 + i9;
            byte[] bArr = this.f15903s;
            if (i10 <= bArr.length) {
                System.arraycopy(bArr, (i8 + i9) - i6, this.f15906v, 0, i6);
            } else {
                int length = i9 - (bArr.length - i8);
                if (length >= i6) {
                    System.arraycopy(bArr, length - i6, this.f15906v, 0, i6);
                } else {
                    int i11 = i6 - length;
                    System.arraycopy(bArr, bArr.length - i11, this.f15906v, 0, i11);
                    System.arraycopy(this.f15903s, 0, this.f15906v, i11, length);
                }
            }
        } else {
            int i12 = this.f15904t;
            int i13 = i12 + i6;
            byte[] bArr2 = this.f15903s;
            if (i13 <= bArr2.length) {
                System.arraycopy(bArr2, i12, this.f15906v, 0, i6);
            } else {
                int length2 = bArr2.length - i12;
                System.arraycopy(bArr2, i12, this.f15906v, 0, length2);
                System.arraycopy(this.f15903s, 0, this.f15906v, length2, i6 - length2);
            }
        }
        AbstractC1119a.b(i6 % this.f15898n == 0, "sizeToOutput is not aligned to frame size: " + i6);
        AbstractC1119a.g(this.f15904t < this.f15903s.length);
        y(this.f15906v, i6, i7);
    }

    public final void B(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f15903s.length));
        int s6 = s(byteBuffer);
        if (s6 == byteBuffer.position()) {
            this.f15900p = 1;
        } else {
            byteBuffer.limit(Math.min(s6, byteBuffer.capacity()));
            x(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    public void D(boolean z6) {
        this.f15899o = z6;
    }

    public final void E(ByteBuffer byteBuffer) {
        int i6;
        int i7;
        AbstractC1119a.g(this.f15904t < this.f15903s.length);
        int limit = byteBuffer.limit();
        int t6 = t(byteBuffer);
        int position = t6 - byteBuffer.position();
        int i8 = this.f15904t;
        int i9 = this.f15905u;
        int i10 = i8 + i9;
        byte[] bArr = this.f15903s;
        if (i10 < bArr.length) {
            i6 = bArr.length - (i9 + i8);
            i7 = i8 + i9;
        } else {
            int length = i9 - (bArr.length - i8);
            i6 = i8 - length;
            i7 = length;
        }
        boolean z6 = t6 < limit;
        int min = Math.min(position, i6);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f15903s, i7, min);
        int i11 = this.f15905u + min;
        this.f15905u = i11;
        AbstractC1119a.g(i11 <= this.f15903s.length);
        boolean z7 = z6 && position < i6;
        z(z7);
        if (z7) {
            this.f15900p = 0;
            this.f15902r = 0;
        }
        byteBuffer.limit(limit);
    }

    @Override // a1.InterfaceC0999b
    public void c(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !g()) {
            int i6 = this.f15900p;
            if (i6 == 0) {
                B(byteBuffer);
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException();
                }
                E(byteBuffer);
            }
        }
    }

    @Override // a1.AbstractC1001d
    public InterfaceC0999b.a h(InterfaceC0999b.a aVar) {
        if (aVar.f7646c == 2) {
            return aVar.f7644a == -1 ? InterfaceC0999b.a.f7643e : aVar;
        }
        throw new InterfaceC0999b.C0119b(aVar);
    }

    @Override // a1.AbstractC1001d
    public void i() {
        if (isActive()) {
            this.f15898n = this.f7649b.f7645b * 2;
            int n6 = n(r(this.f15896l) / 2) * 2;
            if (this.f15903s.length != n6) {
                this.f15903s = new byte[n6];
                this.f15906v = new byte[n6];
            }
        }
        this.f15900p = 0;
        this.f15901q = 0L;
        this.f15902r = 0;
        this.f15904t = 0;
        this.f15905u = 0;
    }

    @Override // a1.AbstractC1001d, a1.InterfaceC0999b
    public boolean isActive() {
        return super.isActive() && this.f15899o;
    }

    @Override // a1.AbstractC1001d
    public void j() {
        if (this.f15905u > 0) {
            z(true);
            this.f15902r = 0;
        }
    }

    @Override // a1.AbstractC1001d
    public void k() {
        this.f15899o = false;
        byte[] bArr = AbstractC1117K.f10565f;
        this.f15903s = bArr;
        this.f15906v = bArr;
    }

    public final int m(float f6) {
        return n((int) f6);
    }

    public final int n(int i6) {
        int i7 = this.f15898n;
        return (i6 / i7) * i7;
    }

    public final int o(int i6, int i7) {
        int i8 = this.f15895k;
        return i8 + ((((100 - i8) * (i6 * 1000)) / i7) / 1000);
    }

    public final int p(int i6, int i7) {
        return (((this.f15895k - 100) * ((i6 * 1000) / i7)) / 1000) + 100;
    }

    public final int q(int i6) {
        int r6 = ((r(this.f15897m) - this.f15902r) * this.f15898n) - (this.f15903s.length / 2);
        AbstractC1119a.g(r6 >= 0);
        return m(Math.min((i6 * this.f15893i) + 0.5f, r6));
    }

    public final int r(long j6) {
        return (int) ((j6 * this.f7649b.f7644a) / 1000000);
    }

    public final int s(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
            if (v(byteBuffer.get(limit), byteBuffer.get(limit - 1))) {
                int i6 = this.f15898n;
                return ((limit / i6) * i6) + i6;
            }
        }
        return byteBuffer.position();
    }

    public final int t(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (v(byteBuffer.get(position), byteBuffer.get(position - 1))) {
                int i6 = this.f15898n;
                return i6 * (position / i6);
            }
        }
        return byteBuffer.limit();
    }

    public long u() {
        return this.f15901q;
    }

    public final boolean v(byte b6, byte b7) {
        return Math.abs(F(b6, b7)) > this.f15894j;
    }

    public final void w(byte[] bArr, int i6, int i7) {
        if (i7 == 3) {
            return;
        }
        for (int i8 = 0; i8 < i6; i8 += 2) {
            C(bArr, i8, (F(bArr[i8 + 1], bArr[i8]) * (i7 == 0 ? p(i8, i6 - 1) : i7 == 2 ? o(i8, i6 - 1) : this.f15895k)) / 100);
        }
    }

    public final void x(ByteBuffer byteBuffer) {
        l(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    public final void y(byte[] bArr, int i6, int i7) {
        AbstractC1119a.b(i6 % this.f15898n == 0, "byteOutput size is not aligned to frame size " + i6);
        w(bArr, i6, i7);
        l(i6).put(bArr, 0, i6).flip();
    }

    public final void z(boolean z6) {
        int length;
        int q6;
        int i6 = this.f15905u;
        byte[] bArr = this.f15903s;
        if (i6 == bArr.length || z6) {
            if (this.f15902r == 0) {
                if (z6) {
                    A(i6, 3);
                    length = i6;
                } else {
                    AbstractC1119a.g(i6 >= bArr.length / 2);
                    length = this.f15903s.length / 2;
                    A(length, 0);
                }
                q6 = length;
            } else if (z6) {
                int length2 = i6 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int q7 = q(length2) + (this.f15903s.length / 2);
                A(q7, 2);
                q6 = q7;
                length = length3;
            } else {
                length = i6 - (bArr.length / 2);
                q6 = q(length);
                A(q6, 1);
            }
            AbstractC1119a.h(length % this.f15898n == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            AbstractC1119a.g(i6 >= q6);
            this.f15905u -= length;
            int i7 = this.f15904t + length;
            this.f15904t = i7;
            this.f15904t = i7 % this.f15903s.length;
            this.f15902r = this.f15902r + (q6 / this.f15898n);
            this.f15901q += (length - q6) / r2;
        }
    }

    public Y(long j6, float f6, long j7, int i6, short s6) {
        boolean z6 = false;
        this.f15902r = 0;
        this.f15904t = 0;
        this.f15905u = 0;
        if (f6 >= 0.0f && f6 <= 1.0f) {
            z6 = true;
        }
        AbstractC1119a.a(z6);
        this.f15896l = j6;
        this.f15893i = f6;
        this.f15897m = j7;
        this.f15895k = i6;
        this.f15894j = s6;
        byte[] bArr = AbstractC1117K.f10565f;
        this.f15903s = bArr;
        this.f15906v = bArr;
    }
}
