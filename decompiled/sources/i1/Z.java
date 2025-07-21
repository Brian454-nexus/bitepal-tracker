package i1;

import a1.AbstractC1001d;
import a1.InterfaceC0999b;
import c1.AbstractC1117K;
import java.nio.ByteBuffer;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class Z extends AbstractC1001d {

    /* renamed from: i, reason: collision with root package name */
    public static final int f15907i = Float.floatToIntBits(Float.NaN);

    public static void m(int i6, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i6 * 4.656612875245797E-10d));
        if (floatToIntBits == f15907i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // a1.InterfaceC0999b
    public void c(ByteBuffer byteBuffer) {
        ByteBuffer l6;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i6 = limit - position;
        int i7 = this.f7649b.f7646c;
        if (i7 == 21) {
            l6 = l((i6 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), l6);
                position += 3;
            }
        } else if (i7 == 22) {
            l6 = l(i6);
            while (position < limit) {
                m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), l6);
                position += 4;
            }
        } else if (i7 == 1342177280) {
            l6 = l((i6 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l6);
                position += 3;
            }
        } else {
            if (i7 != 1610612736) {
                throw new IllegalStateException();
            }
            l6 = l(i6);
            while (position < limit) {
                m((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l6);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        l6.flip();
    }

    @Override // a1.AbstractC1001d
    public InterfaceC0999b.a h(InterfaceC0999b.a aVar) {
        int i6 = aVar.f7646c;
        if (AbstractC1117K.A0(i6)) {
            return i6 != 4 ? new InterfaceC0999b.a(aVar.f7644a, aVar.f7645b, 4) : InterfaceC0999b.a.f7643e;
        }
        throw new InterfaceC0999b.C0119b(aVar);
    }
}
