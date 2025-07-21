package e0;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class k0 implements l0 {
    @Override // e0.l0
    public long a() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }

    @Override // e0.l0
    public long b() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }
}
