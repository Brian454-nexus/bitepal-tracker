package I;

import I.InterfaceC0423d0;

/* renamed from: I.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0424e extends InterfaceC0423d0.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2428a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2429b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2430c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2431d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2432e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2433f;

    public C0424e(int i6, String str, int i7, int i8, int i9, int i10) {
        this.f2428a = i6;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f2429b = str;
        this.f2430c = i7;
        this.f2431d = i8;
        this.f2432e = i9;
        this.f2433f = i10;
    }

    @Override // I.InterfaceC0423d0.a
    public int b() {
        return this.f2430c;
    }

    @Override // I.InterfaceC0423d0.a
    public int c() {
        return this.f2432e;
    }

    @Override // I.InterfaceC0423d0.a
    public int d() {
        return this.f2428a;
    }

    @Override // I.InterfaceC0423d0.a
    public String e() {
        return this.f2429b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC0423d0.a) {
            InterfaceC0423d0.a aVar = (InterfaceC0423d0.a) obj;
            if (this.f2428a == aVar.d() && this.f2429b.equals(aVar.e()) && this.f2430c == aVar.b() && this.f2431d == aVar.g() && this.f2432e == aVar.c() && this.f2433f == aVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // I.InterfaceC0423d0.a
    public int f() {
        return this.f2433f;
    }

    @Override // I.InterfaceC0423d0.a
    public int g() {
        return this.f2431d;
    }

    public int hashCode() {
        return ((((((((((this.f2428a ^ 1000003) * 1000003) ^ this.f2429b.hashCode()) * 1000003) ^ this.f2430c) * 1000003) ^ this.f2431d) * 1000003) ^ this.f2432e) * 1000003) ^ this.f2433f;
    }

    public String toString() {
        return "AudioProfileProxy{codec=" + this.f2428a + ", mediaType=" + this.f2429b + ", bitrate=" + this.f2430c + ", sampleRate=" + this.f2431d + ", channels=" + this.f2432e + ", profile=" + this.f2433f + "}";
    }
}
