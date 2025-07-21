package k0;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1654a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f16302a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f16303b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f16304c = new Object[0];

    public static final int a(int[] array, int i6, int i7) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i8 = i6 - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            int i11 = array[i10];
            if (i11 < i7) {
                i9 = i10 + 1;
            } else {
                if (i11 <= i7) {
                    return i10;
                }
                i8 = i10 - 1;
            }
        }
        return ~i9;
    }

    public static final int b(long[] array, int i6, long j6) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i7 = i6 - 1;
        int i8 = 0;
        while (i8 <= i7) {
            int i9 = (i8 + i7) >>> 1;
            long j7 = array[i9];
            if (j7 < j6) {
                i8 = i9 + 1;
            } else {
                if (j7 <= j6) {
                    return i9;
                }
                i7 = i9 - 1;
            }
        }
        return ~i8;
    }

    public static final boolean c(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    public static final int d(int i6) {
        for (int i7 = 4; i7 < 32; i7++) {
            int i8 = (1 << i7) - 12;
            if (i6 <= i8) {
                return i8;
            }
        }
        return i6;
    }

    public static final int e(int i6) {
        return d(i6 * 4) / 4;
    }

    public static final int f(int i6) {
        return d(i6 * 8) / 8;
    }
}
