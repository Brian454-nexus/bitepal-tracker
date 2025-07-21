package E1;

import Z0.C0841m;
import Z0.q;
import c1.C1143y;
import c1.C1144z;
import java.nio.ByteBuffer;

/* renamed from: E1.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0301c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f977a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: E1.c$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f978a;

        /* renamed from: b, reason: collision with root package name */
        public final int f979b;

        /* renamed from: c, reason: collision with root package name */
        public final int f980c;

        /* renamed from: d, reason: collision with root package name */
        public final int f981d;

        /* renamed from: e, reason: collision with root package name */
        public final int f982e;

        public b(int i6, int i7, int i8, int i9, int i10) {
            this.f978a = i6;
            this.f980c = i7;
            this.f979b = i8;
            this.f981d = i9;
            this.f982e = i10;
        }
    }

    public static void a(int i6, C1144z c1144z) {
        c1144z.P(7);
        byte[] e6 = c1144z.e();
        e6[0] = -84;
        e6[1] = 64;
        e6[2] = -1;
        e6[3] = -1;
        e6[4] = (byte) ((i6 >> 16) & 255);
        e6[5] = (byte) ((i6 >> 8) & 255);
        e6[6] = (byte) (i6 & 255);
    }

    public static Z0.q b(C1144z c1144z, String str, String str2, C0841m c0841m) {
        c1144z.U(1);
        return new q.b().a0(str).o0("audio/ac4").N(2).p0(((c1144z.G() & 32) >> 5) == 1 ? 48000 : 44100).U(c0841m).e0(str2).K();
    }

    public static int c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return d(new C1143y(bArr)).f982e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        if (r11 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        if (r11 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r11 != 8) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static E1.AbstractC0301c.b d(c1.C1143y r11) {
        /*
            r0 = 16
            int r1 = r11.h(r0)
            int r0 = r11.h(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.h(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.h(r0)
            r2 = 3
            if (r1 != r2) goto L2f
            int r4 = f(r11, r0)
            int r1 = r1 + r4
        L2f:
            r5 = r1
            r1 = 10
            int r1 = r11.h(r1)
            boolean r4 = r11.g()
            if (r4 == 0) goto L45
            int r4 = r11.h(r2)
            if (r4 <= 0) goto L45
            r11.r(r0)
        L45:
            boolean r4 = r11.g()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r4 == 0) goto L53
            r4 = r7
            goto L55
        L53:
            r4 = r7
            r7 = r6
        L55:
            int r11 = r11.h(r3)
            if (r7 != r6) goto L65
            r6 = 13
            if (r11 != r6) goto L65
            int[] r0 = E1.AbstractC0301c.f977a
            r11 = r0[r11]
        L63:
            r9 = r11
            goto L95
        L65:
            if (r7 != r4) goto L93
            int[] r4 = E1.AbstractC0301c.f977a
            int r6 = r4.length
            if (r11 >= r6) goto L93
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 8
            r9 = 1
            if (r1 == r9) goto L8c
            r9 = 11
            if (r1 == r0) goto L87
            if (r1 == r2) goto L8c
            if (r1 == r3) goto L7e
            goto L91
        L7e:
            if (r11 == r2) goto L84
            if (r11 == r6) goto L84
            if (r11 != r9) goto L91
        L84:
            int r11 = r4 + 1
            goto L63
        L87:
            if (r11 == r6) goto L84
            if (r11 != r9) goto L91
            goto L84
        L8c:
            if (r11 == r2) goto L84
            if (r11 != r6) goto L91
            goto L84
        L91:
            r9 = r4
            goto L95
        L93:
            r11 = 0
            goto L63
        L95:
            E1.c$b r4 = new E1.c$b
            r6 = 2
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: E1.AbstractC0301c.d(c1.y):E1.c$b");
    }

    public static int e(byte[] bArr, int i6) {
        int i7 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i8 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i8 == 65535) {
            i8 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i7 = 4;
        }
        if (i6 == 44097) {
            i7 += 2;
        }
        return i8 + i7;
    }

    public static int f(C1143y c1143y, int i6) {
        int i7 = 0;
        while (true) {
            int h6 = i7 + c1143y.h(i6);
            if (!c1143y.g()) {
                return h6;
            }
            i7 = (h6 + 1) << i6;
        }
    }
}
