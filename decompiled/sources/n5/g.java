package n5;

import android.os.SystemClock;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final double f17784a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j6) {
        return (b() - j6) * f17784a;
    }

    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
