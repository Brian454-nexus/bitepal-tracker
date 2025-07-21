package w5;

import w5.o;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e extends o {

    /* renamed from: a, reason: collision with root package name */
    public final o.b f20265a;

    /* renamed from: b, reason: collision with root package name */
    public final w5.a f20266b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        public o.b f20267a;

        /* renamed from: b, reason: collision with root package name */
        public w5.a f20268b;

        @Override // w5.o.a
        public o a() {
            return new e(this.f20267a, this.f20268b);
        }

        @Override // w5.o.a
        public o.a b(w5.a aVar) {
            this.f20268b = aVar;
            return this;
        }

        @Override // w5.o.a
        public o.a c(o.b bVar) {
            this.f20267a = bVar;
            return this;
        }
    }

    @Override // w5.o
    public w5.a b() {
        return this.f20266b;
    }

    @Override // w5.o
    public o.b c() {
        return this.f20265a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            o.b bVar = this.f20265a;
            if (bVar != null ? bVar.equals(oVar.c()) : oVar.c() == null) {
                w5.a aVar = this.f20266b;
                if (aVar != null ? aVar.equals(oVar.b()) : oVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        o.b bVar = this.f20265a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        w5.a aVar = this.f20266b;
        return hashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f20265a + ", androidClientInfo=" + this.f20266b + "}";
    }

    public e(o.b bVar, w5.a aVar) {
        this.f20265a = bVar;
        this.f20266b = aVar;
    }
}
