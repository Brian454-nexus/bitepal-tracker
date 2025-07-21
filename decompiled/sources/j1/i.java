package j1;

import E1.C0305g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    public final C0305g f16134a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16135b;

    public i(C0305g c0305g, long j6) {
        this.f16134a = c0305g;
        this.f16135b = j6;
    }

    @Override // j1.g
    public long a(long j6, long j7) {
        return this.f16134a.f1021d[(int) j6];
    }

    @Override // j1.g
    public long b(long j6) {
        return this.f16134a.f1022e[(int) j6] - this.f16135b;
    }

    @Override // j1.g
    public long c(long j6, long j7) {
        return 0L;
    }

    @Override // j1.g
    public long d(long j6, long j7) {
        return -9223372036854775807L;
    }

    @Override // j1.g
    public k1.i e(long j6) {
        return new k1.i(null, this.f16134a.f1020c[(int) j6], r1.f1019b[r7]);
    }

    @Override // j1.g
    public long f(long j6, long j7) {
        return this.f16134a.a(j6 + this.f16135b);
    }

    @Override // j1.g
    public boolean g() {
        return true;
    }

    @Override // j1.g
    public long h() {
        return 0L;
    }

    @Override // j1.g
    public long i(long j6) {
        return this.f16134a.f1018a;
    }

    @Override // j1.g
    public long j(long j6, long j7) {
        return this.f16134a.f1018a;
    }
}
