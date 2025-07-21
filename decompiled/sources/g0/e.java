package g0;

import F.AbstractC0335i0;
import I.T0;
import e0.l0;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f14277a;

    /* renamed from: b, reason: collision with root package name */
    public long f14278b = -1;

    /* renamed from: c, reason: collision with root package name */
    public T0 f14279c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14280a;

        static {
            int[] iArr = new int[T0.values().length];
            f14280a = iArr;
            try {
                iArr[T0.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14280a[T0.UPTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public e(l0 l0Var, T0 t02) {
        this.f14277a = l0Var;
        this.f14279c = t02;
    }

    public final long a() {
        long j6 = LongCompanionObject.MAX_VALUE;
        long j7 = 0;
        for (int i6 = 0; i6 < 3; i6++) {
            long a6 = this.f14277a.a();
            long b6 = this.f14277a.b();
            long a7 = this.f14277a.a();
            long j8 = a7 - a6;
            if (i6 == 0 || j8 < j6) {
                j7 = b6 - ((a6 + a7) >> 1);
                j6 = j8;
            }
        }
        return Math.max(0L, j7);
    }

    public long b(long j6) {
        if (this.f14279c == null) {
            if (c(j6)) {
                this.f14279c = T0.REALTIME;
            } else {
                this.f14279c = T0.UPTIME;
            }
            AbstractC0335i0.a("VideoTimebaseConverter", "Detect input timebase = " + this.f14279c);
        }
        int i6 = a.f14280a[this.f14279c.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                return j6;
            }
            throw new AssertionError("Unknown timebase: " + this.f14279c);
        }
        if (this.f14278b == -1) {
            this.f14278b = a();
            AbstractC0335i0.a("VideoTimebaseConverter", "mUptimeToRealtimeOffsetUs = " + this.f14278b);
        }
        return j6 - this.f14278b;
    }

    public final boolean c(long j6) {
        return Math.abs(j6 - this.f14277a.b()) < Math.abs(j6 - this.f14277a.a());
    }
}
