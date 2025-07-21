package d0;

import I.InterfaceC0423d0;
import d0.n;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i extends n {

    /* renamed from: a, reason: collision with root package name */
    public final String f13348a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13349b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0423d0.c f13350c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends n.a {

        /* renamed from: a, reason: collision with root package name */
        public String f13351a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f13352b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC0423d0.c f13353c;

        @Override // d0.n.a
        public n b() {
            String str = "";
            if (this.f13351a == null) {
                str = " mimeType";
            }
            if (this.f13352b == null) {
                str = str + " profile";
            }
            if (str.isEmpty()) {
                return new i(this.f13351a, this.f13352b.intValue(), this.f13353c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // d0.n.a
        public n.a c(InterfaceC0423d0.c cVar) {
            this.f13353c = cVar;
            return this;
        }

        public n.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f13351a = str;
            return this;
        }

        @Override // d0.j.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public n.a a(int i6) {
            this.f13352b = Integer.valueOf(i6);
            return this;
        }
    }

    @Override // d0.j
    public String a() {
        return this.f13348a;
    }

    @Override // d0.j
    public int b() {
        return this.f13349b;
    }

    @Override // d0.n
    public InterfaceC0423d0.c d() {
        return this.f13350c;
    }

    public boolean equals(Object obj) {
        InterfaceC0423d0.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f13348a.equals(nVar.a()) && this.f13349b == nVar.b() && ((cVar = this.f13350c) != null ? cVar.equals(nVar.d()) : nVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f13348a.hashCode() ^ 1000003) * 1000003) ^ this.f13349b) * 1000003;
        InterfaceC0423d0.c cVar = this.f13350c;
        return hashCode ^ (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        return "VideoMimeInfo{mimeType=" + this.f13348a + ", profile=" + this.f13349b + ", compatibleVideoProfile=" + this.f13350c + "}";
    }

    public i(String str, int i6, InterfaceC0423d0.c cVar) {
        this.f13348a = str;
        this.f13349b = i6;
        this.f13350c = cVar;
    }
}
