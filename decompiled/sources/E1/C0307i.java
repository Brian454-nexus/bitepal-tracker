package E1;

import Z0.InterfaceC0837i;
import c1.AbstractC1117K;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import kotlin.io.ConstantsKt;

/* renamed from: E1.i, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0307i implements InterfaceC0315q {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0837i f1032b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1033c;

    /* renamed from: d, reason: collision with root package name */
    public long f1034d;

    /* renamed from: f, reason: collision with root package name */
    public int f1036f;

    /* renamed from: g, reason: collision with root package name */
    public int f1037g;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f1035e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1031a = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];

    static {
        Z0.v.a("media3.extractor");
    }

    public C0307i(InterfaceC0837i interfaceC0837i, long j6, long j7) {
        this.f1032b = interfaceC0837i;
        this.f1034d = j6;
        this.f1033c = j7;
    }

    @Override // E1.InterfaceC0315q
    public long a() {
        return this.f1033c;
    }

    @Override // E1.InterfaceC0315q
    public boolean c(byte[] bArr, int i6, int i7, boolean z6) {
        int u6 = u(bArr, i6, i7);
        while (u6 < i7 && u6 != -1) {
            u6 = v(bArr, i6, i7, u6, z6);
        }
        f(u6);
        return u6 != -1;
    }

    public final void f(int i6) {
        if (i6 != -1) {
            this.f1034d += i6;
        }
    }

    @Override // E1.InterfaceC0315q
    public boolean g(byte[] bArr, int i6, int i7, boolean z6) {
        if (!q(i7, z6)) {
            return false;
        }
        System.arraycopy(this.f1035e, this.f1036f - i7, bArr, i6, i7);
        return true;
    }

    @Override // E1.InterfaceC0315q
    public long getPosition() {
        return this.f1034d;
    }

    @Override // E1.InterfaceC0315q
    public long h() {
        return this.f1034d + this.f1036f;
    }

    @Override // E1.InterfaceC0315q
    public void j(int i6) {
        q(i6, false);
    }

    @Override // E1.InterfaceC0315q
    public int k(int i6) {
        int w6 = w(i6);
        if (w6 == 0) {
            byte[] bArr = this.f1031a;
            w6 = v(bArr, 0, Math.min(i6, bArr.length), 0, true);
        }
        f(w6);
        return w6;
    }

    @Override // E1.InterfaceC0315q
    public int m(byte[] bArr, int i6, int i7) {
        C0307i c0307i;
        int min;
        t(i7);
        int i8 = this.f1037g;
        int i9 = this.f1036f;
        int i10 = i8 - i9;
        if (i10 == 0) {
            c0307i = this;
            min = c0307i.v(this.f1035e, i9, i7, 0, true);
            if (min == -1) {
                return -1;
            }
            c0307i.f1037g += min;
        } else {
            c0307i = this;
            min = Math.min(i7, i10);
        }
        System.arraycopy(c0307i.f1035e, c0307i.f1036f, bArr, i6, min);
        c0307i.f1036f += min;
        return min;
    }

    @Override // E1.InterfaceC0315q
    public void o() {
        this.f1036f = 0;
    }

    @Override // E1.InterfaceC0315q
    public void p(int i6) {
        x(i6, false);
    }

    @Override // E1.InterfaceC0315q
    public boolean q(int i6, boolean z6) {
        t(i6);
        int i7 = this.f1037g - this.f1036f;
        while (i7 < i6) {
            int i8 = i6;
            boolean z7 = z6;
            i7 = v(this.f1035e, this.f1036f, i8, i7, z7);
            if (i7 == -1) {
                return false;
            }
            this.f1037g = this.f1036f + i7;
            i6 = i8;
            z6 = z7;
        }
        this.f1036f += i6;
        return true;
    }

    @Override // E1.InterfaceC0315q, Z0.InterfaceC0837i
    public int read(byte[] bArr, int i6, int i7) {
        int u6 = u(bArr, i6, i7);
        if (u6 == 0) {
            u6 = v(bArr, i6, i7, 0, true);
        }
        f(u6);
        return u6;
    }

    @Override // E1.InterfaceC0315q
    public void readFully(byte[] bArr, int i6, int i7) {
        c(bArr, i6, i7, false);
    }

    @Override // E1.InterfaceC0315q
    public void s(byte[] bArr, int i6, int i7) {
        g(bArr, i6, i7, false);
    }

    public final void t(int i6) {
        int i7 = this.f1036f + i6;
        byte[] bArr = this.f1035e;
        if (i7 > bArr.length) {
            this.f1035e = Arrays.copyOf(this.f1035e, AbstractC1117K.p(bArr.length * 2, 65536 + i7, i7 + 524288));
        }
    }

    public final int u(byte[] bArr, int i6, int i7) {
        int i8 = this.f1037g;
        if (i8 == 0) {
            return 0;
        }
        int min = Math.min(i8, i7);
        System.arraycopy(this.f1035e, 0, bArr, i6, min);
        y(min);
        return min;
    }

    public final int v(byte[] bArr, int i6, int i7, int i8, boolean z6) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.f1032b.read(bArr, i6 + i8, i7 - i8);
        if (read != -1) {
            return i8 + read;
        }
        if (i8 == 0 && z6) {
            return -1;
        }
        throw new EOFException();
    }

    public final int w(int i6) {
        int min = Math.min(this.f1037g, i6);
        y(min);
        return min;
    }

    public boolean x(int i6, boolean z6) {
        int w6 = w(i6);
        while (w6 < i6 && w6 != -1) {
            w6 = v(this.f1031a, -w6, Math.min(i6, this.f1031a.length + w6), w6, z6);
        }
        f(w6);
        return w6 != -1;
    }

    public final void y(int i6) {
        int i7 = this.f1037g - i6;
        this.f1037g = i7;
        this.f1036f = 0;
        byte[] bArr = this.f1035e;
        byte[] bArr2 = i7 < bArr.length - 524288 ? new byte[65536 + i7] : bArr;
        System.arraycopy(bArr, i6, bArr2, 0, i7);
        this.f1035e = bArr2;
    }
}
