package i1;

import a1.AbstractC1001d;
import a1.InterfaceC0999b;
import c1.AbstractC1117K;
import java.nio.ByteBuffer;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a0 extends AbstractC1001d {

    /* renamed from: i, reason: collision with root package name */
    public int f15908i;

    /* renamed from: j, reason: collision with root package name */
    public int f15909j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15910k;

    /* renamed from: l, reason: collision with root package name */
    public int f15911l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f15912m = AbstractC1117K.f10565f;

    /* renamed from: n, reason: collision with root package name */
    public int f15913n;

    /* renamed from: o, reason: collision with root package name */
    public long f15914o;

    @Override // a1.AbstractC1001d, a1.InterfaceC0999b
    public ByteBuffer b() {
        int i6;
        if (super.d() && (i6 = this.f15913n) > 0) {
            l(i6).put(this.f15912m, 0, this.f15913n).flip();
            this.f15913n = 0;
        }
        return super.b();
    }

    @Override // a1.InterfaceC0999b
    public void c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i6 = limit - position;
        if (i6 == 0) {
            return;
        }
        int min = Math.min(i6, this.f15911l);
        this.f15914o += min / this.f7649b.f7647d;
        this.f15911l -= min;
        byteBuffer.position(position + min);
        if (this.f15911l > 0) {
            return;
        }
        int i7 = i6 - min;
        int length = (this.f15913n + i7) - this.f15912m.length;
        ByteBuffer l6 = l(length);
        int p6 = AbstractC1117K.p(length, 0, this.f15913n);
        l6.put(this.f15912m, 0, p6);
        int p7 = AbstractC1117K.p(length - p6, 0, i7);
        byteBuffer.limit(byteBuffer.position() + p7);
        l6.put(byteBuffer);
        byteBuffer.limit(limit);
        int i8 = i7 - p7;
        int i9 = this.f15913n - p6;
        this.f15913n = i9;
        byte[] bArr = this.f15912m;
        System.arraycopy(bArr, p6, bArr, 0, i9);
        byteBuffer.get(this.f15912m, this.f15913n, i8);
        this.f15913n += i8;
        l6.flip();
    }

    @Override // a1.AbstractC1001d, a1.InterfaceC0999b
    public boolean d() {
        return super.d() && this.f15913n == 0;
    }

    @Override // a1.AbstractC1001d
    public InterfaceC0999b.a h(InterfaceC0999b.a aVar) {
        if (aVar.f7646c != 2) {
            throw new InterfaceC0999b.C0119b(aVar);
        }
        this.f15910k = true;
        return (this.f15908i == 0 && this.f15909j == 0) ? InterfaceC0999b.a.f7643e : aVar;
    }

    @Override // a1.AbstractC1001d
    public void i() {
        if (this.f15910k) {
            this.f15910k = false;
            int i6 = this.f15909j;
            int i7 = this.f7649b.f7647d;
            this.f15912m = new byte[i6 * i7];
            this.f15911l = this.f15908i * i7;
        }
        this.f15913n = 0;
    }

    @Override // a1.AbstractC1001d
    public void j() {
        if (this.f15910k) {
            if (this.f15913n > 0) {
                this.f15914o += r0 / this.f7649b.f7647d;
            }
            this.f15913n = 0;
        }
    }

    @Override // a1.AbstractC1001d
    public void k() {
        this.f15912m = AbstractC1117K.f10565f;
    }

    public long m() {
        return this.f15914o;
    }

    public void n() {
        this.f15914o = 0L;
    }

    public void o(int i6, int i7) {
        this.f15908i = i6;
        this.f15909j = i7;
    }
}
