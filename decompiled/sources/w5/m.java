package w5;

import w5.w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class m extends w {

    /* renamed from: a, reason: collision with root package name */
    public final w.c f20314a;

    /* renamed from: b, reason: collision with root package name */
    public final w.b f20315b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends w.a {

        /* renamed from: a, reason: collision with root package name */
        public w.c f20316a;

        /* renamed from: b, reason: collision with root package name */
        public w.b f20317b;

        @Override // w5.w.a
        public w a() {
            return new m(this.f20316a, this.f20317b);
        }

        @Override // w5.w.a
        public w.a b(w.b bVar) {
            this.f20317b = bVar;
            return this;
        }

        @Override // w5.w.a
        public w.a c(w.c cVar) {
            this.f20316a = cVar;
            return this;
        }
    }

    @Override // w5.w
    public w.b b() {
        return this.f20315b;
    }

    @Override // w5.w
    public w.c c() {
        return this.f20314a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            w.c cVar = this.f20314a;
            if (cVar != null ? cVar.equals(wVar.c()) : wVar.c() == null) {
                w.b bVar = this.f20315b;
                if (bVar != null ? bVar.equals(wVar.b()) : wVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        w.c cVar = this.f20314a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        w.b bVar = this.f20315b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f20314a + ", mobileSubtype=" + this.f20315b + "}";
    }

    public m(w.c cVar, w.b bVar) {
        this.f20314a = cVar;
        this.f20315b = bVar;
    }
}
