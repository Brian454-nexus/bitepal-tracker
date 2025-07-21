package w5;

import w5.r;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h extends r {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f20277a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends r.a {

        /* renamed from: a, reason: collision with root package name */
        public Integer f20278a;

        @Override // w5.r.a
        public r a() {
            return new h(this.f20278a);
        }

        @Override // w5.r.a
        public r.a b(Integer num) {
            this.f20278a = num;
            return this;
        }
    }

    @Override // w5.r
    public Integer b() {
        return this.f20277a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        Integer num = this.f20277a;
        Integer b6 = ((r) obj).b();
        return num == null ? b6 == null : num.equals(b6);
    }

    public int hashCode() {
        Integer num = this.f20277a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f20277a + "}";
    }

    public h(Integer num) {
        this.f20277a = num;
    }
}
