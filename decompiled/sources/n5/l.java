package n5;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import j5.AbstractC1652a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f17795a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f17796b = new char[64];

    /* renamed from: c, reason: collision with root package name */
    public static volatile Handler f17797c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17798a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f17798a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17798a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17798a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17798a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17798a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void a() {
        if (!r()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void b() {
        if (!s()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean c(AbstractC1652a abstractC1652a, AbstractC1652a abstractC1652a2) {
        return abstractC1652a == null ? abstractC1652a2 == null : abstractC1652a.B(abstractC1652a2);
    }

    public static boolean d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean e(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static String f(byte[] bArr, char[] cArr) {
        for (int i6 = 0; i6 < bArr.length; i6++) {
            byte b6 = bArr[i6];
            int i7 = i6 * 2;
            char[] cArr2 = f17795a;
            cArr[i7] = cArr2[(b6 & 255) >>> 4];
            cArr[i7 + 1] = cArr2[b6 & 15];
        }
        return new String(cArr);
    }

    public static Queue g(int i6) {
        return new ArrayDeque(i6);
    }

    public static int h(int i6, int i7, Bitmap.Config config) {
        return i6 * i7 * j(config);
    }

    public static int i(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int j(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i6 = a.f17798a[config.ordinal()];
        int i7 = 1;
        if (i6 != 1) {
            i7 = 2;
            if (i6 != 2 && i6 != 3) {
                return i6 != 4 ? 4 : 8;
            }
        }
        return i7;
    }

    public static List k(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Handler l() {
        if (f17797c == null) {
            synchronized (l.class) {
                try {
                    if (f17797c == null) {
                        f17797c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f17797c;
    }

    public static int m(float f6) {
        return n(f6, 17);
    }

    public static int n(float f6, int i6) {
        return o(Float.floatToIntBits(f6), i6);
    }

    public static int o(int i6, int i7) {
        return (i7 * 31) + i6;
    }

    public static int p(Object obj, int i6) {
        return o(obj == null ? 0 : obj.hashCode(), i6);
    }

    public static int q(boolean z6, int i6) {
        return o(z6 ? 1 : 0, i6);
    }

    public static boolean r() {
        return !s();
    }

    public static boolean s() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean t(int i6) {
        return i6 > 0 || i6 == Integer.MIN_VALUE;
    }

    public static boolean u(int i6, int i7) {
        return t(i6) && t(i7);
    }

    public static void v(Runnable runnable) {
        l().post(runnable);
    }

    public static void w(Runnable runnable) {
        l().removeCallbacks(runnable);
    }

    public static String x(byte[] bArr) {
        String f6;
        char[] cArr = f17796b;
        synchronized (cArr) {
            f6 = f(bArr, cArr);
        }
        return f6;
    }
}
