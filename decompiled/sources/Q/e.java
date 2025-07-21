package Q;

import I.F0;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements F0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f4411a = new HashSet(Arrays.asList("A24"));

    public static boolean f() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && f4411a.contains(Build.DEVICE.toUpperCase(Locale.US));
    }

    public static boolean h() {
        return f();
    }

    public final boolean d(byte[] bArr) {
        byte b6;
        int i6 = 2;
        while (i6 + 4 <= bArr.length && (b6 = bArr[i6]) == -1) {
            if (b6 == -1 && bArr[i6 + 1] == -38) {
                return true;
            }
            i6 += (((bArr[i6 + 2] & 255) << 8) | (bArr[i6 + 3] & 255)) + 2;
        }
        return false;
    }

    public final int e(byte[] bArr) {
        int i6 = 2;
        while (true) {
            int i7 = i6 + 1;
            if (i7 > bArr.length) {
                return -1;
            }
            if (bArr[i6] == -1 && bArr[i7] == -40) {
                return i6;
            }
            i6 = i7;
        }
    }

    public byte[] g(androidx.camera.core.d dVar) {
        int i6 = 0;
        ByteBuffer d6 = dVar.j()[0].d();
        byte[] bArr = new byte[d6.capacity()];
        d6.rewind();
        d6.get(bArr);
        return (d(bArr) || (i6 = e(bArr)) != -1) ? Arrays.copyOfRange(bArr, i6, d6.limit()) : bArr;
    }
}
