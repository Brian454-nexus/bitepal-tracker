package c1;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: c1.E, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1111E {

    /* renamed from: a, reason: collision with root package name */
    public long f10555a;

    /* renamed from: b, reason: collision with root package name */
    public long f10556b;

    /* renamed from: c, reason: collision with root package name */
    public long f10557c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f10558d = new ThreadLocal();

    public C1111E(long j6) {
        i(j6);
    }

    public static long h(long j6) {
        return (j6 * 1000000) / 90000;
    }

    public static long k(long j6) {
        return (j6 * 90000) / 1000000;
    }

    public static long l(long j6) {
        return k(j6) % 8589934592L;
    }

    public synchronized long a(long j6) {
        if (j6 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!g()) {
                long j7 = this.f10555a;
                if (j7 == 9223372036854775806L) {
                    j7 = ((Long) AbstractC1119a.e((Long) this.f10558d.get())).longValue();
                }
                this.f10556b = j7 - j6;
                notifyAll();
            }
            this.f10557c = j6;
            return j6 + this.f10556b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long b(long j6) {
        if (j6 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j7 = this.f10557c;
            if (j7 != -9223372036854775807L) {
                long k6 = k(j7);
                long j8 = (4294967296L + k6) / 8589934592L;
                long j9 = ((j8 - 1) * 8589934592L) + j6;
                j6 += j8 * 8589934592L;
                if (Math.abs(j9 - k6) < Math.abs(j6 - k6)) {
                    j6 = j9;
                }
            }
            return a(h(j6));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long c(long j6) {
        if (j6 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j7 = this.f10557c;
            if (j7 != -9223372036854775807L) {
                long k6 = k(j7);
                long j8 = k6 / 8589934592L;
                long j9 = (j8 * 8589934592L) + j6;
                j6 += (j8 + 1) * 8589934592L;
                if (j9 >= k6) {
                    j6 = j9;
                }
            }
            return a(h(j6));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long d() {
        long j6;
        j6 = this.f10555a;
        if (j6 == LongCompanionObject.MAX_VALUE || j6 == 9223372036854775806L) {
            j6 = -9223372036854775807L;
        }
        return j6;
    }

    public synchronized long e() {
        long j6;
        try {
            j6 = this.f10557c;
        } catch (Throwable th) {
            throw th;
        }
        return j6 != -9223372036854775807L ? j6 + this.f10556b : d();
    }

    public synchronized long f() {
        return this.f10556b;
    }

    public synchronized boolean g() {
        return this.f10556b != -9223372036854775807L;
    }

    public synchronized void i(long j6) {
        this.f10555a = j6;
        this.f10556b = j6 == LongCompanionObject.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f10557c = -9223372036854775807L;
    }

    public synchronized void j(boolean z6, long j6, long j7) {
        try {
            AbstractC1119a.g(this.f10555a == 9223372036854775806L);
            if (g()) {
                return;
            }
            if (z6) {
                this.f10558d.set(Long.valueOf(j6));
            } else {
                long j8 = 0;
                long j9 = j7;
                while (!g()) {
                    if (j7 == 0) {
                        wait();
                    } else {
                        AbstractC1119a.g(j9 > 0);
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        wait(j9);
                        j8 += SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (j8 >= j7 && !g()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j7 + " milliseconds");
                        }
                        j9 = j7 - j8;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
