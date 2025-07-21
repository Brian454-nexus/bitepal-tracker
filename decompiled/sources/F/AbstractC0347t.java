package F;

/* renamed from: F.t, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0347t {

    /* renamed from: F.t$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {
        public static a a(int i6) {
            return b(i6, null);
        }

        public static a b(int i6, Throwable th) {
            return new C0328f(i6, th);
        }

        public abstract Throwable c();

        public abstract int d();
    }

    /* renamed from: F.t$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public static AbstractC0347t a(b bVar) {
        return b(bVar, null);
    }

    public static AbstractC0347t b(b bVar, a aVar) {
        return new C0326e(bVar, aVar);
    }

    public abstract a c();

    public abstract b d();
}
