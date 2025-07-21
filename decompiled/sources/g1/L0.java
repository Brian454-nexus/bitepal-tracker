package g1;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class L0 {

    /* renamed from: c, reason: collision with root package name */
    public static final L0 f14377c = new L0(0, false);

    /* renamed from: a, reason: collision with root package name */
    public final int f14378a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14379b;

    public L0(int i6, boolean z6) {
        this.f14378a = i6;
        this.f14379b = z6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && L0.class == obj.getClass()) {
            L0 l02 = (L0) obj;
            if (this.f14378a == l02.f14378a && this.f14379b == l02.f14379b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f14378a << 1) + (this.f14379b ? 1 : 0);
    }
}
