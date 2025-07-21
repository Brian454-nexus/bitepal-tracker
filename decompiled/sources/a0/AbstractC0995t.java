package a0;

import java.util.concurrent.TimeUnit;

/* renamed from: a0.t, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0995t {
    public static int a(int i6) {
        return i6 == 1 ? 16 : 12;
    }

    public static int b(int i6) {
        return i6 == 1 ? 16 : 12;
    }

    public static long c(long j6, int i6) {
        long j7 = i6;
        y0.g.b(j7 > 0, "sampleRate must be greater than 0.");
        return (TimeUnit.SECONDS.toNanos(1L) * j6) / j7;
    }

    public static long d(long j6, int i6) {
        long j7 = i6;
        y0.g.b(j7 > 0, "bytesPerFrame must be greater than 0.");
        return j6 * j7;
    }

    public static int e(int i6, int i7) {
        y0.g.b(i7 > 0, "Invalid channel count: " + i7);
        if (i6 == 2) {
            return i7 * 2;
        }
        if (i6 == 3) {
            return i7;
        }
        if (i6 != 4) {
            if (i6 == 21) {
                return i7 * 3;
            }
            if (i6 != 22) {
                throw new IllegalArgumentException("Invalid audio encoding: " + i6);
            }
        }
        return i7 * 4;
    }

    public static long f(long j6, int i6) {
        long j7 = i6;
        y0.g.b(j7 > 0, "bytesPerFrame must be greater than 0.");
        return j6 / j7;
    }
}
