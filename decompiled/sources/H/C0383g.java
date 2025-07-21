package H;

import H.F;

/* renamed from: H.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0383g extends F.b {

    /* renamed from: a, reason: collision with root package name */
    public final G f1993a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.camera.core.d f1994b;

    public C0383g(G g6, androidx.camera.core.d dVar) {
        if (g6 == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f1993a = g6;
        if (dVar == null) {
            throw new NullPointerException("Null imageProxy");
        }
        this.f1994b = dVar;
    }

    @Override // H.F.b
    public androidx.camera.core.d a() {
        return this.f1994b;
    }

    @Override // H.F.b
    public G b() {
        return this.f1993a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.b) {
            F.b bVar = (F.b) obj;
            if (this.f1993a.equals(bVar.b()) && this.f1994b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f1993a.hashCode() ^ 1000003) * 1000003) ^ this.f1994b.hashCode();
    }

    public String toString() {
        return "InputPacket{processingRequest=" + this.f1993a + ", imageProxy=" + this.f1994b + "}";
    }
}
