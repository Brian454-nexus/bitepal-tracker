package X;

/* renamed from: X.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0795d extends AbstractC0793b {

    /* renamed from: b, reason: collision with root package name */
    public final int f5856b;

    /* renamed from: c, reason: collision with root package name */
    public final double f5857c;

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f5858d;

    public C0795d(int i6, double d6, Throwable th) {
        this.f5856b = i6;
        this.f5857c = d6;
        this.f5858d = th;
    }

    @Override // X.AbstractC0793b
    public double a() {
        return this.f5857c;
    }

    @Override // X.AbstractC0793b
    public int b() {
        return this.f5856b;
    }

    @Override // X.AbstractC0793b
    public Throwable c() {
        return this.f5858d;
    }

    public boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0793b) {
            AbstractC0793b abstractC0793b = (AbstractC0793b) obj;
            if (this.f5856b == abstractC0793b.b() && Double.doubleToLongBits(this.f5857c) == Double.doubleToLongBits(abstractC0793b.a()) && ((th = this.f5858d) != null ? th.equals(abstractC0793b.c()) : abstractC0793b.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int doubleToLongBits = (((this.f5856b ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f5857c) >>> 32) ^ Double.doubleToLongBits(this.f5857c)))) * 1000003;
        Throwable th = this.f5858d;
        return doubleToLongBits ^ (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        return "AudioStats{audioState=" + this.f5856b + ", audioAmplitudeInternal=" + this.f5857c + ", errorCause=" + this.f5858d + "}";
    }
}
