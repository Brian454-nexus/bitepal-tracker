package Z0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class K extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final long f6818a;

    public K(Throwable th, long j6) {
        super(th);
        this.f6818a = j6;
    }

    public static K a(Exception exc) {
        return b(exc, -9223372036854775807L);
    }

    public static K b(Exception exc, long j6) {
        return exc instanceof K ? (K) exc : new K(exc, j6);
    }
}
