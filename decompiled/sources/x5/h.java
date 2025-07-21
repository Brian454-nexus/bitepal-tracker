package x5;

import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final u5.c f20638a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f20639b;

    public h(u5.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f20638a = cVar;
        this.f20639b = bArr;
    }

    public byte[] a() {
        return this.f20639b;
    }

    public u5.c b() {
        return this.f20638a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f20638a.equals(hVar.f20638a)) {
            return Arrays.equals(this.f20639b, hVar.f20639b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f20638a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f20639b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f20638a + ", bytes=[...]}";
    }
}
