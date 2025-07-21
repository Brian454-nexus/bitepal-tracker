package T;

import T.y;
import android.opengl.EGLSurface;

/* renamed from: T.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0747b extends y.a {

    /* renamed from: a, reason: collision with root package name */
    public final EGLSurface f4806a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4807b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4808c;

    public C0747b(EGLSurface eGLSurface, int i6, int i7) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f4806a = eGLSurface;
        this.f4807b = i6;
        this.f4808c = i7;
    }

    @Override // T.y.a
    public EGLSurface a() {
        return this.f4806a;
    }

    @Override // T.y.a
    public int b() {
        return this.f4808c;
    }

    @Override // T.y.a
    public int c() {
        return this.f4807b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y.a) {
            y.a aVar = (y.a) obj;
            if (this.f4806a.equals(aVar.a()) && this.f4807b == aVar.c() && this.f4808c == aVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f4806a.hashCode() ^ 1000003) * 1000003) ^ this.f4807b) * 1000003) ^ this.f4808c;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f4806a + ", width=" + this.f4807b + ", height=" + this.f4808c + "}";
    }
}
