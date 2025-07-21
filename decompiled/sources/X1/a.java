package X1;

import E1.C0306h;
import E1.F;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends C0306h implements g {

    /* renamed from: h, reason: collision with root package name */
    public final int f6042h;

    /* renamed from: i, reason: collision with root package name */
    public final long f6043i;

    public a(long j6, long j7, F.a aVar, boolean z6) {
        this(j6, j7, aVar.f908f, aVar.f905c, z6);
    }

    @Override // X1.g
    public long b(long j6) {
        return c(j6);
    }

    @Override // X1.g
    public long e() {
        return this.f6043i;
    }

    @Override // X1.g
    public int k() {
        return this.f6042h;
    }

    public a(long j6, long j7, int i6, int i7, boolean z6) {
        super(j6, j7, i6, i7, z6);
        long j8 = j6;
        this.f6042h = i6;
        this.f6043i = j8 == -1 ? -1L : j8;
    }
}
