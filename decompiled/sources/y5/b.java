package y5;

import y5.g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    public final g.a f21255a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21256b;

    public b(g.a aVar, long j6) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f21255a = aVar;
        this.f21256b = j6;
    }

    @Override // y5.g
    public long b() {
        return this.f21256b;
    }

    @Override // y5.g
    public g.a c() {
        return this.f21255a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f21255a.equals(gVar.c()) && this.f21256b == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f21255a.hashCode() ^ 1000003) * 1000003;
        long j6 = this.f21256b;
        return hashCode ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f21255a + ", nextRequestWaitMillis=" + this.f21256b + "}";
    }
}
