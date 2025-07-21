package u5;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f19248a;

    public b(Integer num) {
        this.f19248a = num;
    }

    @Override // u5.g
    public Integer a() {
        return this.f19248a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        Integer num = this.f19248a;
        Integer a6 = ((g) obj).a();
        return num == null ? a6 == null : num.equals(a6);
    }

    public int hashCode() {
        Integer num = this.f19248a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f19248a + "}";
    }
}
