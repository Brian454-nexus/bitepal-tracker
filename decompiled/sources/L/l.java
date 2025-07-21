package L;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f3079a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3080b;

    public l(long j6, long j7) {
        this.f3079a = j6;
        this.f3080b = j7;
    }

    public long a() {
        return this.f3080b;
    }

    public long b() {
        return this.f3079a;
    }

    public String toString() {
        return this.f3079a + "/" + this.f3080b;
    }

    public l(double d6) {
        this((long) (d6 * 10000.0d), 10000L);
    }
}
