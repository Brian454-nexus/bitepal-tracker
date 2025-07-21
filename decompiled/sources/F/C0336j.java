package F;

import F.H0;
import android.view.Surface;

/* renamed from: F.j, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0336j extends H0.g {

    /* renamed from: a, reason: collision with root package name */
    public final int f1436a;

    /* renamed from: b, reason: collision with root package name */
    public final Surface f1437b;

    public C0336j(int i6, Surface surface) {
        this.f1436a = i6;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f1437b = surface;
    }

    @Override // F.H0.g
    public int a() {
        return this.f1436a;
    }

    @Override // F.H0.g
    public Surface b() {
        return this.f1437b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H0.g) {
            H0.g gVar = (H0.g) obj;
            if (this.f1436a == gVar.a() && this.f1437b.equals(gVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f1436a ^ 1000003) * 1000003) ^ this.f1437b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f1436a + ", surface=" + this.f1437b + "}";
    }
}
