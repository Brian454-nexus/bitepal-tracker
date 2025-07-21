package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1047y {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f8967a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f8968b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f8969c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f8970d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f8971e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC1031h f8972f;

    /* renamed from: androidx.datastore.preferences.protobuf.y$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        boolean a(int i6);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b extends List, RandomAccess {
        void d();

        b e(int i6);

        boolean g();
    }

    static {
        byte[] bArr = new byte[0];
        f8970d = bArr;
        f8971e = ByteBuffer.wrap(bArr);
        f8972f = AbstractC1031h.h(bArr);
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z6) {
        return z6 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static int e(byte[] bArr, int i6, int i7) {
        int h6 = h(i7, bArr, i6, i7);
        if (h6 == 0) {
            return 1;
        }
        return h6;
    }

    public static int f(long j6) {
        return (int) (j6 ^ (j6 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return q0.m(bArr);
    }

    public static int h(int i6, byte[] bArr, int i7, int i8) {
        for (int i9 = i7; i9 < i7 + i8; i9++) {
            i6 = (i6 * 31) + bArr[i9];
        }
        return i6;
    }

    public static String i(byte[] bArr) {
        return new String(bArr, f8968b);
    }
}
