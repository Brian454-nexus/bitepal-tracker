package c1;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: c1.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1122d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f10578a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f10579b = {"", "A", "B", "C"};

    public static String a(int i6, int i7, int i8) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8));
    }

    public static List b(boolean z6) {
        return Collections.singletonList(z6 ? new byte[]{1} : new byte[]{0});
    }

    public static String c(int i6, boolean z6, int i7, int i8, int[] iArr, int i9) {
        StringBuilder sb = new StringBuilder(AbstractC1117K.H("hvc1.%s%d.%X.%c%d", f10579b[i6], Integer.valueOf(i7), Integer.valueOf(i8), Character.valueOf(z6 ? 'H' : 'L'), Integer.valueOf(i9)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i10 = 0; i10 < length; i10++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i10])));
        }
        return sb.toString();
    }

    public static byte[] d(byte[] bArr, int i6, int i7) {
        byte[] bArr2 = f10578a;
        byte[] bArr3 = new byte[bArr2.length + i7];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i6, bArr3, bArr2.length, i7);
        return bArr3;
    }

    public static int e(byte[] bArr, int i6) {
        int length = bArr.length - f10578a.length;
        while (i6 <= length) {
            if (g(bArr, i6)) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    public static Pair f(byte[] bArr) {
        boolean z6;
        C1144z c1144z = new C1144z(bArr);
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = i7 + 3;
            if (i8 >= bArr.length) {
                z6 = false;
                break;
            }
            if (c1144z.J() == 1 && (bArr[i8] & 240) == 32) {
                z6 = true;
                break;
            }
            c1144z.T(c1144z.f() - 2);
            i7++;
        }
        AbstractC1119a.b(z6, "Invalid input: VOL not found.");
        C1143y c1143y = new C1143y(bArr);
        c1143y.r((i7 + 4) * 8);
        c1143y.r(1);
        c1143y.r(8);
        if (c1143y.g()) {
            c1143y.r(4);
            c1143y.r(3);
        }
        if (c1143y.h(4) == 15) {
            c1143y.r(8);
            c1143y.r(8);
        }
        if (c1143y.g()) {
            c1143y.r(2);
            c1143y.r(1);
            if (c1143y.g()) {
                c1143y.r(79);
            }
        }
        AbstractC1119a.b(c1143y.h(2) == 0, "Only supports rectangular video object layer shape.");
        AbstractC1119a.a(c1143y.g());
        int h6 = c1143y.h(16);
        AbstractC1119a.a(c1143y.g());
        if (c1143y.g()) {
            AbstractC1119a.a(h6 > 0);
            for (int i9 = h6 - 1; i9 > 0; i9 >>= 1) {
                i6++;
            }
            c1143y.r(i6);
        }
        AbstractC1119a.a(c1143y.g());
        int h7 = c1143y.h(13);
        AbstractC1119a.a(c1143y.g());
        int h8 = c1143y.h(13);
        AbstractC1119a.a(c1143y.g());
        c1143y.r(1);
        return Pair.create(Integer.valueOf(h7), Integer.valueOf(h8));
    }

    public static boolean g(byte[] bArr, int i6) {
        if (bArr.length - i6 <= f10578a.length) {
            return false;
        }
        int i7 = 0;
        while (true) {
            byte[] bArr2 = f10578a;
            if (i7 >= bArr2.length) {
                return true;
            }
            if (bArr[i6 + i7] != bArr2[i7]) {
                return false;
            }
            i7++;
        }
    }

    public static Pair h(byte[] bArr) {
        C1144z c1144z = new C1144z(bArr);
        c1144z.T(9);
        int G6 = c1144z.G();
        c1144z.T(20);
        return Pair.create(Integer.valueOf(c1144z.K()), Integer.valueOf(G6));
    }

    public static boolean i(List list) {
        return list.size() == 1 && ((byte[]) list.get(0)).length == 1 && ((byte[]) list.get(0))[0] == 1;
    }

    public static byte[][] j(byte[] bArr) {
        if (!g(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        do {
            arrayList.add(Integer.valueOf(i6));
            i6 = e(bArr, i6 + f10578a.length);
        } while (i6 != -1);
        byte[][] bArr2 = new byte[arrayList.size()];
        int i7 = 0;
        while (i7 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i7)).intValue();
            int intValue2 = (i7 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i7 + 1)).intValue() : bArr.length) - intValue;
            byte[] bArr3 = new byte[intValue2];
            System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
            bArr2[i7] = bArr3;
            i7++;
        }
        return bArr2;
    }
}
