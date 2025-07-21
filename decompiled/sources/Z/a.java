package Z;

import I.InterfaceC0423d0;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    public final int f6591a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6592b;

    /* renamed from: c, reason: collision with root package name */
    public final List f6593c;

    /* renamed from: d, reason: collision with root package name */
    public final List f6594d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0423d0.a f6595e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0423d0.c f6596f;

    public a(int i6, int i7, List list, List list2, InterfaceC0423d0.a aVar, InterfaceC0423d0.c cVar) {
        this.f6591a = i6;
        this.f6592b = i7;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f6593c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f6594d = list2;
        this.f6595e = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.f6596f = cVar;
    }

    @Override // I.InterfaceC0423d0
    public int a() {
        return this.f6591a;
    }

    @Override // I.InterfaceC0423d0
    public int b() {
        return this.f6592b;
    }

    @Override // I.InterfaceC0423d0
    public List c() {
        return this.f6593c;
    }

    @Override // I.InterfaceC0423d0
    public List d() {
        return this.f6594d;
    }

    public boolean equals(Object obj) {
        InterfaceC0423d0.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f6591a == gVar.a() && this.f6592b == gVar.b() && this.f6593c.equals(gVar.c()) && this.f6594d.equals(gVar.d()) && ((aVar = this.f6595e) != null ? aVar.equals(gVar.j()) : gVar.j() == null) && this.f6596f.equals(gVar.k())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((((this.f6591a ^ 1000003) * 1000003) ^ this.f6592b) * 1000003) ^ this.f6593c.hashCode()) * 1000003) ^ this.f6594d.hashCode()) * 1000003;
        InterfaceC0423d0.a aVar = this.f6595e;
        return ((hashCode ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003) ^ this.f6596f.hashCode();
    }

    @Override // Z.g
    public InterfaceC0423d0.a j() {
        return this.f6595e;
    }

    @Override // Z.g
    public InterfaceC0423d0.c k() {
        return this.f6596f;
    }

    public String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f6591a + ", recommendedFileFormat=" + this.f6592b + ", audioProfiles=" + this.f6593c + ", videoProfiles=" + this.f6594d + ", defaultAudioProfile=" + this.f6595e + ", defaultVideoProfile=" + this.f6596f + "}";
    }
}
