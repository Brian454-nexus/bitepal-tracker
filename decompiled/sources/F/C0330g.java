package F;

import I.S0;
import android.graphics.Matrix;

/* renamed from: F.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0330g extends AbstractC0331g0 {

    /* renamed from: a, reason: collision with root package name */
    public final S0 f1423a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1424b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1425c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f1426d;

    public C0330g(S0 s02, long j6, int i6, Matrix matrix) {
        if (s02 == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f1423a = s02;
        this.f1424b = j6;
        this.f1425c = i6;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f1426d = matrix;
    }

    @Override // F.AbstractC0331g0, F.Z
    public S0 a() {
        return this.f1423a;
    }

    @Override // F.AbstractC0331g0, F.Z
    public long c() {
        return this.f1424b;
    }

    @Override // F.AbstractC0331g0
    public int e() {
        return this.f1425c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0331g0) {
            AbstractC0331g0 abstractC0331g0 = (AbstractC0331g0) obj;
            if (this.f1423a.equals(abstractC0331g0.a()) && this.f1424b == abstractC0331g0.c() && this.f1425c == abstractC0331g0.e() && this.f1426d.equals(abstractC0331g0.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // F.AbstractC0331g0
    public Matrix f() {
        return this.f1426d;
    }

    public int hashCode() {
        int hashCode = (this.f1423a.hashCode() ^ 1000003) * 1000003;
        long j6 = this.f1424b;
        return ((((hashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.f1425c) * 1000003) ^ this.f1426d.hashCode();
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f1423a + ", timestamp=" + this.f1424b + ", rotationDegrees=" + this.f1425c + ", sensorToBufferTransformMatrix=" + this.f1426d + "}";
    }
}
