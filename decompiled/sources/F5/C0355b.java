package F5;

/* renamed from: F5.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0355b extends AbstractC0364k {

    /* renamed from: a, reason: collision with root package name */
    public final long f1686a;

    /* renamed from: b, reason: collision with root package name */
    public final x5.p f1687b;

    /* renamed from: c, reason: collision with root package name */
    public final x5.i f1688c;

    public C0355b(long j6, x5.p pVar, x5.i iVar) {
        this.f1686a = j6;
        if (pVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f1687b = pVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f1688c = iVar;
    }

    @Override // F5.AbstractC0364k
    public x5.i b() {
        return this.f1688c;
    }

    @Override // F5.AbstractC0364k
    public long c() {
        return this.f1686a;
    }

    @Override // F5.AbstractC0364k
    public x5.p d() {
        return this.f1687b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0364k) {
            AbstractC0364k abstractC0364k = (AbstractC0364k) obj;
            if (this.f1686a == abstractC0364k.c() && this.f1687b.equals(abstractC0364k.d()) && this.f1688c.equals(abstractC0364k.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j6 = this.f1686a;
        return ((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ this.f1687b.hashCode()) * 1000003) ^ this.f1688c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f1686a + ", transportContext=" + this.f1687b + ", event=" + this.f1688c + "}";
    }
}
