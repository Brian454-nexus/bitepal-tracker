package m5;

import R4.f;
import java.security.MessageDigest;
import n5.k;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final Object f17451b;

    public b(Object obj) {
        this.f17451b = k.d(obj);
    }

    @Override // R4.f
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.f17451b.toString().getBytes(f.f4618a));
    }

    @Override // R4.f
    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f17451b.equals(((b) obj).f17451b);
        }
        return false;
    }

    @Override // R4.f
    public int hashCode() {
        return this.f17451b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f17451b + '}';
    }
}
