package X;

/* renamed from: X.l, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0803l extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f5935a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5936b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0793b f5937c;

    public C0803l(long j6, long j7, AbstractC0793b abstractC0793b) {
        this.f5935a = j6;
        this.f5936b = j7;
        if (abstractC0793b == null) {
            throw new NullPointerException("Null audioStats");
        }
        this.f5937c = abstractC0793b;
    }

    @Override // X.a0
    public AbstractC0793b a() {
        return this.f5937c;
    }

    @Override // X.a0
    public long b() {
        return this.f5936b;
    }

    @Override // X.a0
    public long c() {
        return this.f5935a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.f5935a == a0Var.c() && this.f5936b == a0Var.b() && this.f5937c.equals(a0Var.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j6 = this.f5935a;
        int i6 = (((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003;
        long j7 = this.f5936b;
        return ((i6 ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f5937c.hashCode();
    }

    public String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.f5935a + ", numBytesRecorded=" + this.f5936b + ", audioStats=" + this.f5937c + "}";
    }
}
