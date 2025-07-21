package x5;

import x5.o;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends o {

    /* renamed from: a, reason: collision with root package name */
    public final p f20607a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20608b;

    /* renamed from: c, reason: collision with root package name */
    public final u5.d f20609c;

    /* renamed from: d, reason: collision with root package name */
    public final u5.h f20610d;

    /* renamed from: e, reason: collision with root package name */
    public final u5.c f20611e;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        public p f20612a;

        /* renamed from: b, reason: collision with root package name */
        public String f20613b;

        /* renamed from: c, reason: collision with root package name */
        public u5.d f20614c;

        /* renamed from: d, reason: collision with root package name */
        public u5.h f20615d;

        /* renamed from: e, reason: collision with root package name */
        public u5.c f20616e;

        @Override // x5.o.a
        public o a() {
            String str = "";
            if (this.f20612a == null) {
                str = " transportContext";
            }
            if (this.f20613b == null) {
                str = str + " transportName";
            }
            if (this.f20614c == null) {
                str = str + " event";
            }
            if (this.f20615d == null) {
                str = str + " transformer";
            }
            if (this.f20616e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f20612a, this.f20613b, this.f20614c, this.f20615d, this.f20616e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // x5.o.a
        public o.a b(u5.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f20616e = cVar;
            return this;
        }

        @Override // x5.o.a
        public o.a c(u5.d dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f20614c = dVar;
            return this;
        }

        @Override // x5.o.a
        public o.a d(u5.h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f20615d = hVar;
            return this;
        }

        @Override // x5.o.a
        public o.a e(p pVar) {
            if (pVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f20612a = pVar;
            return this;
        }

        @Override // x5.o.a
        public o.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f20613b = str;
            return this;
        }
    }

    @Override // x5.o
    public u5.c b() {
        return this.f20611e;
    }

    @Override // x5.o
    public u5.d c() {
        return this.f20609c;
    }

    @Override // x5.o
    public u5.h e() {
        return this.f20610d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f20607a.equals(oVar.f()) && this.f20608b.equals(oVar.g()) && this.f20609c.equals(oVar.c()) && this.f20610d.equals(oVar.e()) && this.f20611e.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // x5.o
    public p f() {
        return this.f20607a;
    }

    @Override // x5.o
    public String g() {
        return this.f20608b;
    }

    public int hashCode() {
        return ((((((((this.f20607a.hashCode() ^ 1000003) * 1000003) ^ this.f20608b.hashCode()) * 1000003) ^ this.f20609c.hashCode()) * 1000003) ^ this.f20610d.hashCode()) * 1000003) ^ this.f20611e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f20607a + ", transportName=" + this.f20608b + ", event=" + this.f20609c + ", transformer=" + this.f20610d + ", encoding=" + this.f20611e + "}";
    }

    public c(p pVar, String str, u5.d dVar, u5.h hVar, u5.c cVar) {
        this.f20607a = pVar;
        this.f20608b = str;
        this.f20609c = dVar;
        this.f20610d = hVar;
        this.f20611e = cVar;
    }
}
