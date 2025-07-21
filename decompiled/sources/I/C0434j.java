package I;

import I.N0;

/* renamed from: I.j, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0434j extends N0.a {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f2465a;

    public C0434j(Throwable th) {
        if (th == null) {
            throw new NullPointerException("Null error");
        }
        this.f2465a = th;
    }

    @Override // I.N0.a
    public Throwable a() {
        return this.f2465a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof N0.a) {
            return this.f2465a.equals(((N0.a) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f2465a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.f2465a + "}";
    }
}
