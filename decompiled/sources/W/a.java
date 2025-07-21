package W;

import O.e;
import W.c;
import androidx.lifecycle.InterfaceC1061m;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends c.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1061m f5341a;

    /* renamed from: b, reason: collision with root package name */
    public final e.b f5342b;

    public a(InterfaceC1061m interfaceC1061m, e.b bVar) {
        if (interfaceC1061m == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.f5341a = interfaceC1061m;
        if (bVar == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f5342b = bVar;
    }

    @Override // W.c.a
    public e.b b() {
        return this.f5342b;
    }

    @Override // W.c.a
    public InterfaceC1061m c() {
        return this.f5341a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c.a) {
            c.a aVar = (c.a) obj;
            if (this.f5341a.equals(aVar.c()) && this.f5342b.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5341a.hashCode() ^ 1000003) * 1000003) ^ this.f5342b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.f5341a + ", cameraId=" + this.f5342b + "}";
    }
}
