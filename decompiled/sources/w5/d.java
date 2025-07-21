package w5;

import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d extends n {

    /* renamed from: a, reason: collision with root package name */
    public final List f20264a;

    public d(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f20264a = list;
    }

    @Override // w5.n
    public List c() {
        return this.f20264a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f20264a.equals(((n) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f20264a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f20264a + "}";
    }
}
