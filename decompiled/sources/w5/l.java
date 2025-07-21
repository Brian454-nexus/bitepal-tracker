package w5;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l extends v {

    /* renamed from: a, reason: collision with root package name */
    public final long f20313a;

    public l(long j6) {
        this.f20313a = j6;
    }

    @Override // w5.v
    public long c() {
        return this.f20313a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof v) && this.f20313a == ((v) obj).c();
    }

    public int hashCode() {
        long j6 = this.f20313a;
        return ((int) (j6 ^ (j6 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f20313a + "}";
    }
}
