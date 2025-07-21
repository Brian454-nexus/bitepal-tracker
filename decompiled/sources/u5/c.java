package u5;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f19249a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f19249a = str;
    }

    public static c b(String str) {
        return new c(str);
    }

    public String a() {
        return this.f19249a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f19249a.equals(((c) obj).f19249a);
        }
        return false;
    }

    public int hashCode() {
        return this.f19249a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f19249a + "\"}";
    }
}
