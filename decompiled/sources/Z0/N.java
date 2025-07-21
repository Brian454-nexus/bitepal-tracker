package Z0;

import c1.AbstractC1117K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class N {

    /* renamed from: e, reason: collision with root package name */
    public static final N f6819e = new N(0, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final String f6820f = AbstractC1117K.x0(0);

    /* renamed from: g, reason: collision with root package name */
    public static final String f6821g = AbstractC1117K.x0(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f6822h = AbstractC1117K.x0(2);

    /* renamed from: i, reason: collision with root package name */
    public static final String f6823i = AbstractC1117K.x0(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f6824a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6825b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6826c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6827d;

    public N(int i6, int i7) {
        this(i6, i7, 0, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof N) {
            N n6 = (N) obj;
            if (this.f6824a == n6.f6824a && this.f6825b == n6.f6825b && this.f6826c == n6.f6826c && this.f6827d == n6.f6827d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((217 + this.f6824a) * 31) + this.f6825b) * 31) + this.f6826c) * 31) + Float.floatToRawIntBits(this.f6827d);
    }

    public N(int i6, int i7, int i8, float f6) {
        this.f6824a = i6;
        this.f6825b = i7;
        this.f6826c = i8;
        this.f6827d = f6;
    }
}
