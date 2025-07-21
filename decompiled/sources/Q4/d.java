package Q4;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f4539b;

    /* renamed from: c, reason: collision with root package name */
    public c f4540c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4538a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    public int f4541d = 0;

    public void a() {
        this.f4539b = null;
        this.f4540c = null;
    }

    public final boolean b() {
        return this.f4540c.f4526b != 0;
    }

    public c c() {
        if (this.f4539b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f4540c;
        }
        k();
        if (!b()) {
            h();
            c cVar = this.f4540c;
            if (cVar.f4527c < 0) {
                cVar.f4526b = 1;
            }
        }
        return this.f4540c;
    }

    public final int d() {
        try {
            return this.f4539b.get() & 255;
        } catch (Exception unused) {
            this.f4540c.f4526b = 1;
            return 0;
        }
    }

    public final void e() {
        this.f4540c.f4528d.f4514a = n();
        this.f4540c.f4528d.f4515b = n();
        this.f4540c.f4528d.f4516c = n();
        this.f4540c.f4528d.f4517d = n();
        int d6 = d();
        boolean z6 = (d6 & 128) != 0;
        int pow = (int) Math.pow(2.0d, (d6 & 7) + 1);
        b bVar = this.f4540c.f4528d;
        bVar.f4518e = (d6 & 64) != 0;
        if (z6) {
            bVar.f4524k = g(pow);
        } else {
            bVar.f4524k = null;
        }
        this.f4540c.f4528d.f4523j = this.f4539b.position();
        r();
        if (b()) {
            return;
        }
        c cVar = this.f4540c;
        cVar.f4527c++;
        cVar.f4529e.add(cVar.f4528d);
    }

    public final void f() {
        int d6 = d();
        this.f4541d = d6;
        if (d6 <= 0) {
            return;
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            try {
                i7 = this.f4541d;
                if (i6 >= i7) {
                    return;
                }
                i7 -= i6;
                this.f4539b.get(this.f4538a, i6, i7);
                i6 += i7;
            } catch (Exception e6) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i6 + " count: " + i7 + " blockSize: " + this.f4541d, e6);
                }
                this.f4540c.f4526b = 1;
                return;
            }
        }
    }

    public final int[] g(int i6) {
        byte[] bArr = new byte[i6 * 3];
        int[] iArr = null;
        try {
            this.f4539b.get(bArr);
            iArr = new int[256];
            int i7 = 0;
            int i8 = 0;
            while (i7 < i6) {
                int i9 = bArr[i8] & 255;
                int i10 = i8 + 2;
                int i11 = bArr[i8 + 1] & 255;
                i8 += 3;
                int i12 = i7 + 1;
                iArr[i7] = (i11 << 8) | (i9 << 16) | (-16777216) | (bArr[i10] & 255);
                i7 = i12;
            }
            return iArr;
        } catch (BufferUnderflowException e6) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e6);
            }
            this.f4540c.f4526b = 1;
            return iArr;
        }
    }

    public final void h() {
        i(IntCompanionObject.MAX_VALUE);
    }

    public final void i(int i6) {
        boolean z6 = false;
        while (!z6 && !b() && this.f4540c.f4527c <= i6) {
            int d6 = d();
            if (d6 == 33) {
                int d7 = d();
                if (d7 == 1) {
                    q();
                } else if (d7 == 249) {
                    this.f4540c.f4528d = new b();
                    j();
                } else if (d7 == 254) {
                    q();
                } else if (d7 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb = new StringBuilder();
                    for (int i7 = 0; i7 < 11; i7++) {
                        sb.append((char) this.f4538a[i7]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (d6 == 44) {
                c cVar = this.f4540c;
                if (cVar.f4528d == null) {
                    cVar.f4528d = new b();
                }
                e();
            } else if (d6 != 59) {
                this.f4540c.f4526b = 1;
            } else {
                z6 = true;
            }
        }
    }

    public final void j() {
        d();
        int d6 = d();
        b bVar = this.f4540c.f4528d;
        int i6 = (d6 & 28) >> 2;
        bVar.f4520g = i6;
        if (i6 == 0) {
            bVar.f4520g = 1;
        }
        bVar.f4519f = (d6 & 1) != 0;
        int n6 = n();
        if (n6 < 2) {
            n6 = 10;
        }
        b bVar2 = this.f4540c.f4528d;
        bVar2.f4522i = n6 * 10;
        bVar2.f4521h = d();
        d();
    }

    public final void k() {
        StringBuilder sb = new StringBuilder();
        for (int i6 = 0; i6 < 6; i6++) {
            sb.append((char) d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f4540c.f4526b = 1;
            return;
        }
        l();
        if (!this.f4540c.f4532h || b()) {
            return;
        }
        c cVar = this.f4540c;
        cVar.f4525a = g(cVar.f4533i);
        c cVar2 = this.f4540c;
        cVar2.f4536l = cVar2.f4525a[cVar2.f4534j];
    }

    public final void l() {
        this.f4540c.f4530f = n();
        this.f4540c.f4531g = n();
        int d6 = d();
        c cVar = this.f4540c;
        cVar.f4532h = (d6 & 128) != 0;
        cVar.f4533i = (int) Math.pow(2.0d, (d6 & 7) + 1);
        this.f4540c.f4534j = d();
        this.f4540c.f4535k = d();
    }

    public final void m() {
        do {
            f();
            byte[] bArr = this.f4538a;
            if (bArr[0] == 1) {
                this.f4540c.f4537m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f4541d <= 0) {
                return;
            }
        } while (!b());
    }

    public final int n() {
        return this.f4539b.getShort();
    }

    public final void o() {
        this.f4539b = null;
        Arrays.fill(this.f4538a, (byte) 0);
        this.f4540c = new c();
        this.f4541d = 0;
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f4539b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f4539b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public final void q() {
        int d6;
        do {
            d6 = d();
            this.f4539b.position(Math.min(this.f4539b.position() + d6, this.f4539b.limit()));
        } while (d6 > 0);
    }

    public final void r() {
        d();
        q();
    }
}
