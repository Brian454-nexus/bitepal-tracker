package a0;

import a0.InterfaceC0991p;

/* renamed from: a0.v, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0997v extends InterfaceC0991p.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f7627a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7628b;

    public C0997v(int i6, long j6) {
        this.f7627a = i6;
        this.f7628b = j6;
    }

    @Override // a0.InterfaceC0991p.c
    public int a() {
        return this.f7627a;
    }

    @Override // a0.InterfaceC0991p.c
    public long b() {
        return this.f7628b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC0991p.c) {
            InterfaceC0991p.c cVar = (InterfaceC0991p.c) obj;
            if (this.f7627a == cVar.a() && this.f7628b == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i6 = (this.f7627a ^ 1000003) * 1000003;
        long j6 = this.f7628b;
        return i6 ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public String toString() {
        return "PacketInfo{sizeInBytes=" + this.f7627a + ", timestampNs=" + this.f7628b + "}";
    }
}
