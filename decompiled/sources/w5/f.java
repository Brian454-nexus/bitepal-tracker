package w5;

import w5.p;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f extends p {

    /* renamed from: a, reason: collision with root package name */
    public final s f20269a;

    /* renamed from: b, reason: collision with root package name */
    public final p.b f20270b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends p.a {

        /* renamed from: a, reason: collision with root package name */
        public s f20271a;

        /* renamed from: b, reason: collision with root package name */
        public p.b f20272b;

        @Override // w5.p.a
        public p a() {
            return new f(this.f20271a, this.f20272b);
        }

        @Override // w5.p.a
        public p.a b(s sVar) {
            this.f20271a = sVar;
            return this;
        }

        @Override // w5.p.a
        public p.a c(p.b bVar) {
            this.f20272b = bVar;
            return this;
        }
    }

    @Override // w5.p
    public s b() {
        return this.f20269a;
    }

    @Override // w5.p
    public p.b c() {
        return this.f20270b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            s sVar = this.f20269a;
            if (sVar != null ? sVar.equals(pVar.b()) : pVar.b() == null) {
                p.b bVar = this.f20270b;
                if (bVar != null ? bVar.equals(pVar.c()) : pVar.c() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        s sVar = this.f20269a;
        int hashCode = ((sVar == null ? 0 : sVar.hashCode()) ^ 1000003) * 1000003;
        p.b bVar = this.f20270b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f20269a + ", productIdOrigin=" + this.f20270b + "}";
    }

    public f(s sVar, p.b bVar) {
        this.f20269a = sVar;
        this.f20270b = bVar;
    }
}
