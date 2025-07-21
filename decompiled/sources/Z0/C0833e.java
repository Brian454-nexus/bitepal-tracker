package Z0;

/* renamed from: Z0.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0833e {

    /* renamed from: a, reason: collision with root package name */
    public final int f6876a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6877b;

    public C0833e(int i6, float f6) {
        this.f6876a = i6;
        this.f6877b = f6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0833e.class == obj.getClass()) {
            C0833e c0833e = (C0833e) obj;
            if (this.f6876a == c0833e.f6876a && Float.compare(c0833e.f6877b, this.f6877b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f6876a) * 31) + Float.floatToIntBits(this.f6877b);
    }
}
