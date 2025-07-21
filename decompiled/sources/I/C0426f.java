package I;

import I.InterfaceC0423d0;
import java.util.List;

/* renamed from: I.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0426f extends InterfaceC0423d0.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f2436a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2437b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2438c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2439d;

    public C0426f(int i6, int i7, List list, List list2) {
        this.f2436a = i6;
        this.f2437b = i7;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f2438c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f2439d = list2;
    }

    @Override // I.InterfaceC0423d0
    public int a() {
        return this.f2436a;
    }

    @Override // I.InterfaceC0423d0
    public int b() {
        return this.f2437b;
    }

    @Override // I.InterfaceC0423d0
    public List c() {
        return this.f2438c;
    }

    @Override // I.InterfaceC0423d0
    public List d() {
        return this.f2439d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC0423d0.b) {
            InterfaceC0423d0.b bVar = (InterfaceC0423d0.b) obj;
            if (this.f2436a == bVar.a() && this.f2437b == bVar.b() && this.f2438c.equals(bVar.c()) && this.f2439d.equals(bVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f2436a ^ 1000003) * 1000003) ^ this.f2437b) * 1000003) ^ this.f2438c.hashCode()) * 1000003) ^ this.f2439d.hashCode();
    }

    public String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.f2436a + ", recommendedFileFormat=" + this.f2437b + ", audioProfiles=" + this.f2438c + ", videoProfiles=" + this.f2439d + "}";
    }
}
