package I;

import I.Q0;

/* renamed from: I.l, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0438l extends Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Q0.b f2491a;

    /* renamed from: b, reason: collision with root package name */
    public final Q0.a f2492b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2493c;

    public C0438l(Q0.b bVar, Q0.a aVar, long j6) {
        if (bVar == null) {
            throw new NullPointerException("Null configType");
        }
        this.f2491a = bVar;
        if (aVar == null) {
            throw new NullPointerException("Null configSize");
        }
        this.f2492b = aVar;
        this.f2493c = j6;
    }

    @Override // I.Q0
    public Q0.a c() {
        return this.f2492b;
    }

    @Override // I.Q0
    public Q0.b d() {
        return this.f2491a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Q0) {
            Q0 q02 = (Q0) obj;
            if (this.f2491a.equals(q02.d()) && this.f2492b.equals(q02.c()) && this.f2493c == q02.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // I.Q0
    public long f() {
        return this.f2493c;
    }

    public int hashCode() {
        int hashCode = (((this.f2491a.hashCode() ^ 1000003) * 1000003) ^ this.f2492b.hashCode()) * 1000003;
        long j6 = this.f2493c;
        return hashCode ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f2491a + ", configSize=" + this.f2492b + ", streamUseCase=" + this.f2493c + "}";
    }
}
