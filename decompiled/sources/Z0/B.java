package Z0;

import c1.AbstractC1117K;
import c1.AbstractC1119a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class B {

    /* renamed from: d, reason: collision with root package name */
    public static final B f6617d = new B(1.0f);

    /* renamed from: e, reason: collision with root package name */
    public static final String f6618e = AbstractC1117K.x0(0);

    /* renamed from: f, reason: collision with root package name */
    public static final String f6619f = AbstractC1117K.x0(1);

    /* renamed from: a, reason: collision with root package name */
    public final float f6620a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6621b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6622c;

    public B(float f6) {
        this(f6, 1.0f);
    }

    public long a(long j6) {
        return j6 * this.f6622c;
    }

    public B b(float f6) {
        return new B(f6, this.f6621b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && B.class == obj.getClass()) {
            B b6 = (B) obj;
            if (this.f6620a == b6.f6620a && this.f6621b == b6.f6621b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f6620a)) * 31) + Float.floatToRawIntBits(this.f6621b);
    }

    public String toString() {
        return AbstractC1117K.H("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f6620a), Float.valueOf(this.f6621b));
    }

    public B(float f6, float f7) {
        AbstractC1119a.a(f6 > 0.0f);
        AbstractC1119a.a(f7 > 0.0f);
        this.f6620a = f6;
        this.f6621b = f7;
        this.f6622c = Math.round(f6 * 1000.0f);
    }
}
