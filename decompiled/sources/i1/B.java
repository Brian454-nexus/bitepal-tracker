package i1;

import a1.AbstractC1001d;
import a1.InterfaceC0999b;
import c1.AbstractC1119a;
import java.nio.ByteBuffer;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class B extends AbstractC1001d {

    /* renamed from: i, reason: collision with root package name */
    public int[] f15734i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f15735j;

    @Override // a1.InterfaceC0999b
    public void c(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) AbstractC1119a.e(this.f15735j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l6 = l(((limit - position) / this.f7649b.f7647d) * this.f7650c.f7647d);
        while (position < limit) {
            for (int i6 : iArr) {
                l6.putShort(byteBuffer.getShort((i6 * 2) + position));
            }
            position += this.f7649b.f7647d;
        }
        byteBuffer.position(limit);
        l6.flip();
    }

    @Override // a1.AbstractC1001d
    public InterfaceC0999b.a h(InterfaceC0999b.a aVar) {
        int[] iArr = this.f15734i;
        if (iArr == null) {
            return InterfaceC0999b.a.f7643e;
        }
        if (aVar.f7646c != 2) {
            throw new InterfaceC0999b.C0119b(aVar);
        }
        boolean z6 = aVar.f7645b != iArr.length;
        int i6 = 0;
        while (i6 < iArr.length) {
            int i7 = iArr[i6];
            if (i7 >= aVar.f7645b) {
                throw new InterfaceC0999b.C0119b(aVar);
            }
            z6 |= i7 != i6;
            i6++;
        }
        return z6 ? new InterfaceC0999b.a(aVar.f7644a, iArr.length, 2) : InterfaceC0999b.a.f7643e;
    }

    @Override // a1.AbstractC1001d
    public void i() {
        this.f15735j = this.f15734i;
    }

    @Override // a1.AbstractC1001d
    public void k() {
        this.f15735j = null;
        this.f15734i = null;
    }

    public void m(int[] iArr) {
        this.f15734i = iArr;
    }
}
