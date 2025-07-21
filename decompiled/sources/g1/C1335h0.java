package g1;

/* renamed from: g1.h0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1335h0 extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final int f14670a;

    public C1335h0(int i6) {
        super(a(i6));
        this.f14670a = i6;
    }

    public static String a(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
