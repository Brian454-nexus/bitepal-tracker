package i1;

import a1.InterfaceC0999b;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class X {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f15888d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, ByteCompanionObject.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f15889e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    public ByteBuffer f15890a = InterfaceC0999b.f7642a;

    /* renamed from: c, reason: collision with root package name */
    public int f15892c = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f15891b = 2;

    public void a(f1.f fVar, List list) {
        AbstractC1119a.e(fVar.f14005d);
        if (fVar.f14005d.limit() - fVar.f14005d.position() == 0) {
            return;
        }
        this.f15890a = b(fVar.f14005d, (this.f15891b == 2 && (list.size() == 1 || list.size() == 3)) ? (byte[]) list.get(0) : null);
        fVar.f();
        fVar.o(this.f15890a.remaining());
        fVar.f14005d.put(this.f15890a);
        fVar.p();
    }

    public final ByteBuffer b(ByteBuffer byteBuffer, byte[] bArr) {
        int i6;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        int i8 = (i7 + 255) / 255;
        int i9 = i8 + 27 + i7;
        if (this.f15891b == 2) {
            int length = bArr != null ? bArr.length + 28 : f15888d.length;
            i9 += f15889e.length + length;
            i6 = length;
        } else {
            i6 = 0;
        }
        ByteBuffer c6 = c(i9);
        if (this.f15891b == 2) {
            if (bArr != null) {
                e(c6, bArr);
            } else {
                c6.put(f15888d);
            }
            c6.put(f15889e);
        }
        int j6 = this.f15892c + E1.H.j(byteBuffer);
        this.f15892c = j6;
        f(c6, j6, this.f15891b, i8, false);
        for (int i10 = 0; i10 < i8; i10++) {
            if (i7 >= 255) {
                c6.put((byte) -1);
                i7 -= 255;
            } else {
                c6.put((byte) i7);
                i7 = 0;
            }
        }
        while (position < limit) {
            c6.put(byteBuffer.get(position));
            position++;
        }
        byteBuffer.position(byteBuffer.limit());
        c6.flip();
        if (this.f15891b == 2) {
            byte[] array = c6.array();
            int arrayOffset = c6.arrayOffset() + i6;
            byte[] bArr2 = f15889e;
            c6.putInt(i6 + bArr2.length + 22, AbstractC1117K.x(array, arrayOffset + bArr2.length, c6.limit() - c6.position(), 0));
        } else {
            c6.putInt(22, AbstractC1117K.x(c6.array(), c6.arrayOffset(), c6.limit() - c6.position(), 0));
        }
        this.f15891b++;
        return c6;
    }

    public final ByteBuffer c(int i6) {
        if (this.f15890a.capacity() < i6) {
            this.f15890a = ByteBuffer.allocate(i6).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f15890a.clear();
        }
        return this.f15890a;
    }

    public void d() {
        this.f15890a = InterfaceC0999b.f7642a;
        this.f15892c = 0;
        this.f15891b = 2;
    }

    public final void e(ByteBuffer byteBuffer, byte[] bArr) {
        f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(C6.j.a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, AbstractC1117K.x(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    public final void f(ByteBuffer byteBuffer, long j6, int i6, int i7, boolean z6) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z6 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j6);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i6);
        byteBuffer.putInt(0);
        byteBuffer.put(C6.j.a(i7));
    }
}
