package I;

import I.InterfaceC0423d0;

/* renamed from: I.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0428g extends InterfaceC0423d0.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f2442a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2443b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2444c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2445d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2446e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2447f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2448g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2449h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2450i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2451j;

    public C0428g(int i6, String str, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        this.f2442a = i6;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f2443b = str;
        this.f2444c = i7;
        this.f2445d = i8;
        this.f2446e = i9;
        this.f2447f = i10;
        this.f2448g = i11;
        this.f2449h = i12;
        this.f2450i = i13;
        this.f2451j = i14;
    }

    @Override // I.InterfaceC0423d0.c
    public int b() {
        return this.f2449h;
    }

    @Override // I.InterfaceC0423d0.c
    public int c() {
        return this.f2444c;
    }

    @Override // I.InterfaceC0423d0.c
    public int d() {
        return this.f2450i;
    }

    @Override // I.InterfaceC0423d0.c
    public int e() {
        return this.f2442a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC0423d0.c) {
            InterfaceC0423d0.c cVar = (InterfaceC0423d0.c) obj;
            if (this.f2442a == cVar.e() && this.f2443b.equals(cVar.i()) && this.f2444c == cVar.c() && this.f2445d == cVar.f() && this.f2446e == cVar.k() && this.f2447f == cVar.h() && this.f2448g == cVar.j() && this.f2449h == cVar.b() && this.f2450i == cVar.d() && this.f2451j == cVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // I.InterfaceC0423d0.c
    public int f() {
        return this.f2445d;
    }

    @Override // I.InterfaceC0423d0.c
    public int g() {
        return this.f2451j;
    }

    @Override // I.InterfaceC0423d0.c
    public int h() {
        return this.f2447f;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f2442a ^ 1000003) * 1000003) ^ this.f2443b.hashCode()) * 1000003) ^ this.f2444c) * 1000003) ^ this.f2445d) * 1000003) ^ this.f2446e) * 1000003) ^ this.f2447f) * 1000003) ^ this.f2448g) * 1000003) ^ this.f2449h) * 1000003) ^ this.f2450i) * 1000003) ^ this.f2451j;
    }

    @Override // I.InterfaceC0423d0.c
    public String i() {
        return this.f2443b;
    }

    @Override // I.InterfaceC0423d0.c
    public int j() {
        return this.f2448g;
    }

    @Override // I.InterfaceC0423d0.c
    public int k() {
        return this.f2446e;
    }

    public String toString() {
        return "VideoProfileProxy{codec=" + this.f2442a + ", mediaType=" + this.f2443b + ", bitrate=" + this.f2444c + ", frameRate=" + this.f2445d + ", width=" + this.f2446e + ", height=" + this.f2447f + ", profile=" + this.f2448g + ", bitDepth=" + this.f2449h + ", chromaSubsampling=" + this.f2450i + ", hdrFormat=" + this.f2451j + "}";
    }
}
