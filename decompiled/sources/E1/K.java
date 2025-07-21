package E1;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class K {

    /* renamed from: c, reason: collision with root package name */
    public static final K f915c = new K(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f916a;

    /* renamed from: b, reason: collision with root package name */
    public final long f917b;

    public K(long j6, long j7) {
        this.f916a = j6;
        this.f917b = j7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && K.class == obj.getClass()) {
            K k6 = (K) obj;
            if (this.f916a == k6.f916a && this.f917b == k6.f917b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f916a) * 31) + ((int) this.f917b);
    }

    public String toString() {
        return "[timeUs=" + this.f916a + ", position=" + this.f917b + "]";
    }
}
