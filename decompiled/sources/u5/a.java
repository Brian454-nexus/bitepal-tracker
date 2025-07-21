package u5;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f19244a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19245b;

    /* renamed from: c, reason: collision with root package name */
    public final f f19246c;

    /* renamed from: d, reason: collision with root package name */
    public final g f19247d;

    public a(Integer num, Object obj, f fVar, g gVar, e eVar) {
        this.f19244a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f19245b = obj;
        if (fVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f19246c = fVar;
        this.f19247d = gVar;
    }

    @Override // u5.d
    public Integer a() {
        return this.f19244a;
    }

    @Override // u5.d
    public e b() {
        return null;
    }

    @Override // u5.d
    public Object c() {
        return this.f19245b;
    }

    @Override // u5.d
    public f d() {
        return this.f19246c;
    }

    @Override // u5.d
    public g e() {
        return this.f19247d;
    }

    public boolean equals(Object obj) {
        g gVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            Integer num = this.f19244a;
            if (num != null ? num.equals(dVar.a()) : dVar.a() == null) {
                if (this.f19245b.equals(dVar.c()) && this.f19246c.equals(dVar.d()) && ((gVar = this.f19247d) != null ? gVar.equals(dVar.e()) : dVar.e() == null)) {
                    dVar.b();
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f19244a;
        int hashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f19245b.hashCode()) * 1000003) ^ this.f19246c.hashCode()) * 1000003;
        g gVar = this.f19247d;
        return (hashCode ^ (gVar != null ? gVar.hashCode() : 0)) * 1000003;
    }

    public String toString() {
        return "Event{code=" + this.f19244a + ", payload=" + this.f19245b + ", priority=" + this.f19246c + ", productData=" + this.f19247d + ", eventContext=" + ((Object) null) + "}";
    }
}
