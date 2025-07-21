package E1;

import E1.J;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class M implements J {

    /* renamed from: a, reason: collision with root package name */
    public final long f925a;

    /* renamed from: b, reason: collision with root package name */
    public final long f926b;

    public M(long j6) {
        this(j6, 0L);
    }

    @Override // E1.J
    public boolean f() {
        return true;
    }

    @Override // E1.J
    public J.a j(long j6) {
        return new J.a(new K(j6, this.f926b));
    }

    @Override // E1.J
    public long l() {
        return this.f925a;
    }

    public M(long j6, long j7) {
        this.f925a = j6;
        this.f926b = j7;
    }
}
