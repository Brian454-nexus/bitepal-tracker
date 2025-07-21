package L;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f3034e = StandardCharsets.US_ASCII;

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f3035f = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f3036g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f3037h = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    public final int f3038a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3039b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3040c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f3041d;

    public h(int i6, int i7, byte[] bArr) {
        this(i6, i7, -1L, bArr);
    }

    public static h a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new h(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f3034e);
        return new h(1, bytes.length, bytes);
    }

    public static h b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f3036g[12] * dArr.length]);
        wrap.order(byteOrder);
        for (double d6 : dArr) {
            wrap.putDouble(d6);
        }
        return new h(12, dArr.length, wrap.array());
    }

    public static h c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f3036g[9] * iArr.length]);
        wrap.order(byteOrder);
        for (int i6 : iArr) {
            wrap.putInt(i6);
        }
        return new h(9, iArr.length, wrap.array());
    }

    public static h d(l[] lVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f3036g[10] * lVarArr.length]);
        wrap.order(byteOrder);
        for (l lVar : lVarArr) {
            wrap.putInt((int) lVar.b());
            wrap.putInt((int) lVar.a());
        }
        return new h(10, lVarArr.length, wrap.array());
    }

    public static h e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f3034e);
        return new h(2, bytes.length, bytes);
    }

    public static h f(long j6, ByteOrder byteOrder) {
        return g(new long[]{j6}, byteOrder);
    }

    public static h g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f3036g[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j6 : jArr) {
            wrap.putInt((int) j6);
        }
        return new h(4, jArr.length, wrap.array());
    }

    public static h h(l[] lVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f3036g[5] * lVarArr.length]);
        wrap.order(byteOrder);
        for (l lVar : lVarArr) {
            wrap.putInt((int) lVar.b());
            wrap.putInt((int) lVar.a());
        }
        return new h(5, lVarArr.length, wrap.array());
    }

    public static h i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f3036g[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i6 : iArr) {
            wrap.putShort((short) i6);
        }
        return new h(3, iArr.length, wrap.array());
    }

    public int j() {
        return f3036g[this.f3038a] * this.f3039b;
    }

    public String toString() {
        return "(" + f3035f[this.f3038a] + ", data length:" + this.f3041d.length + ")";
    }

    public h(int i6, int i7, long j6, byte[] bArr) {
        this.f3038a = i6;
        this.f3039b = i7;
        this.f3040c = j6;
        this.f3041d = bArr;
    }
}
