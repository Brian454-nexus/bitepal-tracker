package R4;

import j0.C1638a;
import java.security.MessageDigest;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    public final C1638a f4624b = new n5.b();

    public static void f(g gVar, Object obj, MessageDigest messageDigest) {
        gVar.g(obj, messageDigest);
    }

    @Override // R4.f
    public void a(MessageDigest messageDigest) {
        for (int i6 = 0; i6 < this.f4624b.size(); i6++) {
            f((g) this.f4624b.f(i6), this.f4624b.j(i6), messageDigest);
        }
    }

    public Object c(g gVar) {
        return this.f4624b.containsKey(gVar) ? this.f4624b.get(gVar) : gVar.c();
    }

    public void d(h hVar) {
        this.f4624b.g(hVar.f4624b);
    }

    public h e(g gVar, Object obj) {
        this.f4624b.put(gVar, obj);
        return this;
    }

    @Override // R4.f
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f4624b.equals(((h) obj).f4624b);
        }
        return false;
    }

    @Override // R4.f
    public int hashCode() {
        return this.f4624b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f4624b + '}';
    }
}
