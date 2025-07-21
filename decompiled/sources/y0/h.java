package y0;

import androidx.annotation.NonNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final float f21177a;

    /* renamed from: b, reason: collision with root package name */
    private final float f21178b;

    public h(float f6, float f7) {
        this.f21177a = g.c(f6, "width");
        this.f21178b = g.c(f7, "height");
    }

    public float a() {
        return this.f21178b;
    }

    public float b() {
        return this.f21177a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.f21177a == this.f21177a && hVar.f21178b == this.f21178b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f21177a) ^ Float.floatToIntBits(this.f21178b);
    }

    @NonNull
    public String toString() {
        return this.f21177a + "x" + this.f21178b;
    }
}
