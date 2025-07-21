package F;

import F.H0;
import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: F.k, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0338k extends H0.h {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f1439a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1440b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1441c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1442d;

    /* renamed from: e, reason: collision with root package name */
    public final Matrix f1443e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1444f;

    public C0338k(Rect rect, int i6, int i7, boolean z6, Matrix matrix, boolean z7) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f1439a = rect;
        this.f1440b = i6;
        this.f1441c = i7;
        this.f1442d = z6;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f1443e = matrix;
        this.f1444f = z7;
    }

    @Override // F.H0.h
    public Rect a() {
        return this.f1439a;
    }

    @Override // F.H0.h
    public boolean b() {
        return this.f1444f;
    }

    @Override // F.H0.h
    public int c() {
        return this.f1440b;
    }

    @Override // F.H0.h
    public Matrix d() {
        return this.f1443e;
    }

    @Override // F.H0.h
    public int e() {
        return this.f1441c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H0.h) {
            H0.h hVar = (H0.h) obj;
            if (this.f1439a.equals(hVar.a()) && this.f1440b == hVar.c() && this.f1441c == hVar.e() && this.f1442d == hVar.f() && this.f1443e.equals(hVar.d()) && this.f1444f == hVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // F.H0.h
    public boolean f() {
        return this.f1442d;
    }

    public int hashCode() {
        return ((((((((((this.f1439a.hashCode() ^ 1000003) * 1000003) ^ this.f1440b) * 1000003) ^ this.f1441c) * 1000003) ^ (this.f1442d ? 1231 : 1237)) * 1000003) ^ this.f1443e.hashCode()) * 1000003) ^ (this.f1444f ? 1231 : 1237);
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f1439a + ", getRotationDegrees=" + this.f1440b + ", getTargetRotation=" + this.f1441c + ", hasCameraTransform=" + this.f1442d + ", getSensorToBufferTransform=" + this.f1443e + ", getMirroring=" + this.f1444f + "}";
    }
}
