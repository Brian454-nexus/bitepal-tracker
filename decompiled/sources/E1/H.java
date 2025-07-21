package E1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class H {
    public static List a(byte[] bArr) {
        long k6 = k(f(bArr));
        long k7 = k(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(b(k6));
        arrayList.add(b(k7));
        return arrayList;
    }

    public static byte[] b(long j6) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j6).array();
    }

    public static int c(byte[] bArr) {
        return bArr[9] & 255;
    }

    public static long d(byte b6, byte b7) {
        int i6;
        int i7 = b6 & 255;
        int i8 = b6 & 3;
        if (i8 != 0) {
            i6 = 2;
            if (i8 != 1 && i8 != 2) {
                i6 = b7 & 63;
            }
        } else {
            i6 = 1;
        }
        int i9 = i7 >> 3;
        return i6 * (i9 >= 16 ? 2500 << r6 : i9 >= 12 ? 10000 << (i9 & 1) : (i9 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static long e(byte[] bArr) {
        return d(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static int f(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static boolean g(long j6, long j7) {
        return j6 - j7 <= k(3840L) / 1000;
    }

    public static int h(ByteBuffer byteBuffer) {
        int i6 = i(byteBuffer);
        int i7 = byteBuffer.get(i6 + 26) + 27 + i6;
        return (int) ((d(byteBuffer.get(i7), byteBuffer.limit() - i7 > 1 ? byteBuffer.get(i7 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int i(ByteBuffer byteBuffer) {
        if ((byteBuffer.get(5) & 2) == 0) {
            return 0;
        }
        byte b6 = byteBuffer.get(26);
        int i6 = 28;
        int i7 = 28;
        for (int i8 = 0; i8 < b6; i8++) {
            i7 += byteBuffer.get(i8 + 27);
        }
        byte b7 = byteBuffer.get(i7 + 26);
        for (int i9 = 0; i9 < b7; i9++) {
            i6 += byteBuffer.get(i7 + 27 + i9);
        }
        return i7 + i6;
    }

    public static int j(ByteBuffer byteBuffer) {
        return (int) ((d(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long k(long j6) {
        return (j6 * 1000000000) / 48000;
    }
}
