package X;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a0 {
    public static a0 d(long j6, long j7, AbstractC0793b abstractC0793b) {
        y0.g.b(j6 >= 0, "duration must be positive value.");
        y0.g.b(j7 >= 0, "bytes must be positive value.");
        return new C0803l(j6, j7, abstractC0793b);
    }

    public abstract AbstractC0793b a();

    public abstract long b();

    public abstract long c();
}
