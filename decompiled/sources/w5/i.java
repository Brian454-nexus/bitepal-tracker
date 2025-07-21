package w5;

import w5.s;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i extends s {

    /* renamed from: a, reason: collision with root package name */
    public final r f20279a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends s.a {

        /* renamed from: a, reason: collision with root package name */
        public r f20280a;

        @Override // w5.s.a
        public s a() {
            return new i(this.f20280a);
        }

        @Override // w5.s.a
        public s.a b(r rVar) {
            this.f20280a = rVar;
            return this;
        }
    }

    @Override // w5.s
    public r b() {
        return this.f20279a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        r rVar = this.f20279a;
        r b6 = ((s) obj).b();
        return rVar == null ? b6 == null : rVar.equals(b6);
    }

    public int hashCode() {
        r rVar = this.f20279a;
        return (rVar == null ? 0 : rVar.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f20279a + "}";
    }

    public i(r rVar) {
        this.f20279a = rVar;
    }
}
