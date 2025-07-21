package I;

/* renamed from: I.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0430h extends AbstractC0433i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2453a;

    public C0430h(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null value");
        }
        this.f2453a = obj;
    }

    @Override // I.AbstractC0433i0
    public Object b() {
        return this.f2453a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0433i0) {
            return this.f2453a.equals(((AbstractC0433i0) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f2453a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f2453a + "}";
    }
}
