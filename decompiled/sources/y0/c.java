package y0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21172a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21173b;

    public c(Object obj, Object obj2) {
        this.f21172a = obj;
        this.f21173b = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return b.a(cVar.f21172a, this.f21172a) && b.a(cVar.f21173b, this.f21173b);
    }

    public int hashCode() {
        Object obj = this.f21172a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f21173b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f21172a + " " + this.f21173b + "}";
    }
}
